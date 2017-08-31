import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class BattleBoard {

	/*
	 * {{1,2}, {3,4}}
	 * 
	 * [1][0] = 3
	 * 
	 * [0][1] = 2
	 */

	private final Tile[][] board;

	private BattleBoard(Tile[][] board) {
		this.board = board;
	}

	public Tile getTileAt(Coordinates coordinates) {
		return this.board[coordinates.getX()][coordinates.getY()];
	}

	// TODO error checking wrong place?
	public void moveUnit(Coordinates from, Coordinates to) throws GameplayException {
		Tile fromTile = getTileAt(from);
		if (fromTile.getCurrentUnit().movement < from.getDistanceTo(to)) {
			throw new GameplayException("movement too far");
		}
		Tile toTile = getTileAt(to);
		if (toTile.getCurrentUnit() != null) {
			throw new GameplayException("unit on to tile");
		}
		Unit unit = fromTile.getCurrentUnit();
		fromTile.setCurrentUnit(null);
		toTile.setCurrentUnit(unit);
	}

	public class Builder {

		private final int length;
		private final int width;
		private final Tile[][] builderBoard;

		public Builder(int length, int width) {
			this.length = length;
			this.width = width;
			this.builderBoard = new Tile[length][width];
		}

		public Builder setDefaultTile(Tile tile) {
			for (int i = 0; i < this.length; i++) {
				for (int j = 0; j < this.width; j++) {
					if (this.builderBoard[i][j] == null) {
						this.builderBoard[i][j] = new Tile(tile);
					}
				}
			}
			return this;
		}

		public Builder setTileAt(Coordinates coordinates, Tile tile) {
			this.builderBoard[coordinates.getX()][coordinates.getY()] = new Tile(tile);
			return this;
		}
		
		public Builder setTileAtRange(CoordinatesRange range, Tile tile) {
			range.forEach(coordinates -> setTileAt(coordinates, tile));
			return this;
		}

		public Builder setUnitAt(Coordinates coordinates, Unit unit) {
			this.builderBoard[coordinates.getX()][coordinates.getY()].setCurrentUnit(unit);
			return this;
		}
		
		public Builder setUnitAtRange(CoordinatesRange range, Unit unit) {
			range.forEach(coordinates -> setUnitAt(coordinates, unit));
			return this;
		}

		public BattleBoard build() {
			return new BattleBoard(this.builderBoard);
		}

	}

	public class Tile {

		private Unit currentUnit;

		public Tile() {
			this.currentUnit = null;
		}

		public Tile(Tile oldTile) {
			this.currentUnit = oldTile.currentUnit;
		}

		public Unit getCurrentUnit() {
			return this.currentUnit;
		}

		public void setCurrentUnit(Unit currentUnit) {
			this.currentUnit = currentUnit;
		}

		public boolean isPassableBy(Unit unit) {
			return true;
		}

		public boolean isUsableBy(Unit unit) {
			return true;
		}

	}

	public static class Coordinates {

		private final int x;
		private final int y;

		public Coordinates(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return this.x;
		}

		public int getY() {
			return this.y;
		}

		public int getDistanceTo(Coordinates coordinates) {
			return Math.abs(this.x - coordinates.getX()) + Math.abs(this.y - coordinates.getY());
		}

	}
	
	public static class CoordinatesRange extends HashSet<Coordinates> {
		
		private static final long serialVersionUID = -2816203631636826889L;

		public CoordinatesRange(Coordinates... coordinates) {
			this(Arrays.asList(coordinates));
		}
		
		public CoordinatesRange(Collection<Coordinates> coordinates) {
			super(coordinates);
		}
		
		public static CoordinatesRange getRectangleRange(Coordinates point1, Coordinates point2) {
			Set<Coordinates> range = new HashSet<>();
			int xMin;
			int xMax;
			int yMin;
			int yMax;
			if (point1.getX() > point2.getX()) {
				xMin = point2.getX();
				xMax = point1.getX();
			} else {
				xMin = point1.getX();
				xMax = point2.getX();
			}
			if (point1.getY() > point2.getY()) {
				yMin = point2.getY();
				yMax = point1.getY();
			} else {
				yMin = point1.getY();
				yMax = point2.getY();
			}
			for (int i = xMin; i <= xMax; i++) {
				for (int j = yMin; j <= yMax; j++) {
					range.add(new Coordinates(i, j));
				}
			}
			return new CoordinatesRange(range);
		}

		@Override
		public boolean add(Coordinates e) {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean addAll(Collection<? extends Coordinates> c) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void clear() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean remove(Object o) {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean removeAll(Collection<?> c) {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean retainAll(Collection<?> c) {
			throw new UnsupportedOperationException();
		}
		
	}

}
