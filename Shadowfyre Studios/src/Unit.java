import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Unit {

	protected int xp;
	protected int level;
	protected int powerLevel;

	protected int hp;
	protected int strength;
	protected int movement;
	protected int avoid;
	protected int block;
	protected int luck;

	protected int totalStrength; // TODO
	protected int totalBlock;
	protected int totalLuck;

	protected Weapon weapon;
	protected Armour armour;

	protected Ability[] abilities;
	protected Set<Class<? extends Weapon>> legalWeaponTypes;

	protected Unit(int xp, int level, int hp, int strength, int movement,
			int avoid, int block, int luck, Weapon weapon,
			Armour armour, Ability[] abilities,
			Set<Class<? extends Weapon>> legalWeaponTypes) {
		// TODO calc powerlevel
		// TODO check compatibility
		this.xp = xp;
		this.level = level;
		this.hp = hp;
		this.strength = strength;
		this.movement = movement;
		this.avoid = avoid;
		this.block = block;
		this.luck = luck;
		this.weapon = weapon;
		this.armour = armour;
		this.abilities = abilities;
		this.legalWeaponTypes = legalWeaponTypes;
	}

	public Set<Class<? extends Weapon>> getLegalWeaponTypes() {
		return legalWeaponTypes;
	}

}

final class Troubadour extends Unit {

	private static final Set<Class<? extends Weapon>> LEGAL_WEAPON_TYPES = Collections
			.unmodifiableSet(new HashSet<Class<? extends Weapon>>(
					Arrays.asList(SupportWeapon.class)));

	protected Troubadour(int xp, int level, int hp, int strength, int movement,
			int avoid, int block, int luck,
			Weapon weapon, Armour armour, Ability[] abilities) {
		super(xp, level, hp, strength, movement, avoid, block, luck, weapon,
				armour, abilities, LEGAL_WEAPON_TYPES);
	}

}

final class Brute extends Unit {

	private static final Set<Class<? extends Weapon>> LEGAL_WEAPON_TYPES = Collections
			.unmodifiableSet(new HashSet<Class<? extends Weapon>>(
					Arrays.asList(Axe.class)));

	protected Brute(int xp, int level, int hp, int strength, int movement,
			int avoid, int block, int luck,
			Weapon weapon, Armour armour, Ability[] abilities) {
		super(xp, level, hp, strength, movement, avoid, block, luck, weapon,
				armour, abilities, LEGAL_WEAPON_TYPES);
	}

}

final class Bowman extends Unit {

	private static final Set<Class<? extends Weapon>> LEGAL_WEAPON_TYPES = Collections
			.unmodifiableSet(new HashSet<Class<? extends Weapon>>(
					Arrays.asList(Bow.class)));

	protected Bowman(int xp, int level, int hp, int strength, int movement,
			int avoid, int block, int luck,
			Weapon weapon, Armour armour, Ability[] abilities) {
		super(xp, level, hp, strength, movement, avoid, block, luck, weapon,
				armour, abilities, LEGAL_WEAPON_TYPES);
	}

}

final class Crossbowman extends Unit {

	private static final Set<Class<? extends Weapon>> LEGAL_WEAPON_TYPES = Collections
			.unmodifiableSet(new HashSet<Class<? extends Weapon>>(
					Arrays.asList(Crossbow.class)));

	protected Crossbowman(int xp, int level, int hp, int strength, int movement,
			int avoid, int block, int luck,
			Weapon weapon, Armour armour, Ability[] abilities) {
		super(xp, level, hp, strength, movement, avoid, block, luck, weapon,
				armour, abilities, LEGAL_WEAPON_TYPES);
	}

}

final class ManAtArms extends Unit {

	private static final Set<Class<? extends Weapon>> LEGAL_WEAPON_TYPES = Collections
			.unmodifiableSet(new HashSet<Class<? extends Weapon>>(
					Arrays.asList(Sword.class)));

	protected ManAtArms(int xp, int level, int hp, int strength, int movement,
			int avoid, int block, int luck,
			Weapon weapon, Armour armour, Ability[] abilities) {
		super(xp, level, hp, strength, movement, avoid, block, luck, weapon,
				armour, abilities, LEGAL_WEAPON_TYPES);
	}

}

final class Maid extends Unit {

	private static final Set<Class<? extends Weapon>> LEGAL_WEAPON_TYPES = Collections
			.unmodifiableSet(new HashSet<Class<? extends Weapon>>(
					Arrays.asList(SupportWeapon.class, Dagger.class)));

	protected Maid(int xp, int level, int hp, int strength, int movement,
			int avoid, int block, int luck,
			Weapon weapon, Armour armour, Ability[] abilities) {
		super(xp, level, hp, strength, movement, avoid, block, luck, weapon,
				armour, abilities, LEGAL_WEAPON_TYPES);
	}

}

final class Noble extends Unit {

	private static final Set<Class<? extends Weapon>> LEGAL_WEAPON_TYPES = Collections
			.unmodifiableSet(new HashSet<Class<? extends Weapon>>(
					Arrays.asList(Sword.class, Bow.class, Lance.class)));

	protected Noble(int xp, int level, int hp, int strength, int movement,
			int avoid, int block, int luck,
			Weapon weapon, Armour armour, Ability[] abilities) {
		super(xp, level, hp, strength, movement, avoid, block, luck, weapon,
				armour, abilities, LEGAL_WEAPON_TYPES);
	}

}

final class Archer extends Unit {

	private static final Set<Class<? extends Weapon>> LEGAL_WEAPON_TYPES = Collections
			.unmodifiableSet(new HashSet<Class<? extends Weapon>>(
					Arrays.asList(Bow.class, Crossbow.class)));

	protected Archer(int xp, int level, int hp, int strength, int movement,
			int avoid, int block, int luck,
			Weapon weapon, Armour armour, Ability[] abilities) {
		super(xp, level, hp, strength, movement, avoid, block, luck, weapon,
				armour, abilities, LEGAL_WEAPON_TYPES);
	}

}

final class Knight extends Unit {

	private static final Set<Class<? extends Weapon>> LEGAL_WEAPON_TYPES = Collections
			.unmodifiableSet(new HashSet<Class<? extends Weapon>>(
					Arrays.asList(Sword.class, Lance.class)));

	protected Knight(int xp, int level, int hp, int strength, int movement,
			int avoid, int block, int luck,
			Weapon weapon, Armour armour, Ability[] abilities) {
		super(xp, level, hp, strength, movement, avoid, block, luck, weapon,
				armour, abilities, LEGAL_WEAPON_TYPES);
	}

}

final class Strategist extends Unit {

	private static final Set<Class<? extends Weapon>> LEGAL_WEAPON_TYPES = Collections
			.unmodifiableSet(new HashSet<Class<? extends Weapon>>(
					Arrays.asList(Sword.class, Bow.class,
							SupportWeapon.class)));

	protected Strategist(int xp, int level, int hp, int strength, int movement,
			int avoid, int block, int luck,
			Weapon weapon, Armour armour, Ability[] abilities) {
		super(xp, level, hp, strength, movement, avoid, block, luck, weapon,
				armour, abilities, LEGAL_WEAPON_TYPES);
	}

}

final class General extends Unit {

	private static final Set<Class<? extends Weapon>> LEGAL_WEAPON_TYPES = Collections
			.unmodifiableSet(new HashSet<Class<? extends Weapon>>(
					Arrays.asList(Sword.class, Bow.class, Lance.class,
							SupportWeapon.class)));

	protected General(int xp, int level, int hp, int strength, int movement,
			int avoid, int block, int luck,
			Weapon weapon, Armour armour, Ability[] abilities) {
		super(xp, level, hp, strength, movement, avoid, block, luck, weapon,
				armour, abilities, LEGAL_WEAPON_TYPES);
	}

}

final class Ranger extends Unit {

	private static final Set<Class<? extends Weapon>> LEGAL_WEAPON_TYPES = Collections
			.unmodifiableSet(new HashSet<Class<? extends Weapon>>(
					Arrays.asList(Sword.class, Bow.class,
							Dagger.class, Crossbow.class)));

	protected Ranger(int xp, int level, int hp, int strength, int movement,
			int avoid, int block, int luck,
			Weapon weapon, Armour armour, Ability[] abilities) {
		super(xp, level, hp, strength, movement, avoid, block, luck, weapon,
				armour, abilities, LEGAL_WEAPON_TYPES);
	}

}

final class GreatLord extends Unit {

	private static final Set<Class<? extends Weapon>> LEGAL_WEAPON_TYPES = Collections
			.unmodifiableSet(new HashSet<Class<? extends Weapon>>(
					Arrays.asList(Sword.class, Bow.class, Lance.class,
							Axe.class)));

	protected GreatLord(int xp, int level, int hp, int strength, int movement,
			int avoid, int block, int luck,
			Weapon weapon, Armour armour, Ability[] abilities) {
		super(xp, level, hp, strength, movement, avoid, block, luck, weapon,
				armour, abilities, LEGAL_WEAPON_TYPES);
	}

}

final class MasterAtArms extends Unit {

	private static final Set<Class<? extends Weapon>> LEGAL_WEAPON_TYPES = Collections
			.unmodifiableSet(new HashSet<Class<? extends Weapon>>(
					Arrays.asList(Sword.class, Lance.class, Axe.class)));

	protected MasterAtArms(int xp, int level, int hp, int strength,
			int movement,
			int avoid, int block, int luck,
			Weapon weapon, Armour armour, Ability[] abilities) {
		super(xp, level, hp, strength, movement, avoid, block, luck, weapon,
				armour, abilities, LEGAL_WEAPON_TYPES);
	}

}

final class JamianKing extends Unit {

	private static final Set<Class<? extends Weapon>> LEGAL_WEAPON_TYPES = Collections
			.unmodifiableSet(new HashSet<Class<? extends Weapon>>(
					Arrays.asList(Sword.class, Lance.class, Axe.class,
							Dagger.class, Crossbow.class, Bow.class,
							SupportWeapon.class)));

	protected JamianKing(int xp, int level, int hp, int strength, int movement,
			int avoid, int block, int luck,
			Weapon weapon, Armour armour, Ability[] abilities) {
		super(xp, level, hp, strength, movement, avoid, block, luck, weapon,
				armour, abilities, LEGAL_WEAPON_TYPES);
	}

}

final class Armour {

	private int block;
	private int speedBuff;

	public Armour(int block, int speedBuff) {
		this.block = block;
		this.speedBuff = speedBuff;
	}

	protected int getBlock() {
		return block;
	}

	protected int getSpeedBuff() {
		return speedBuff;
	}

}

class Weapon {

	protected int luck;
	protected int strength;
	protected int durability;
	protected Range range;
	protected List<Enchantment> enchantments;
	protected Vulnerabilities vulnerabilities;

	protected Weapon(int luck, int strength, int currentDurability, Range range,
			Enchantment[] enchantments,
			Vulnerabilities vulnerabilities) {
		this.luck = luck;
		this.strength = strength;
		this.durability = currentDurability;
		this.range = range;
		this.enchantments = Arrays.asList(enchantments);
		this.enchantments.forEach(enchantment -> enchantment.applyTo(this));
		this.vulnerabilities = vulnerabilities;
	}

	public int getLuck() {
		return luck;
	}

	public int getStrength() {
		return strength;
	}

	public Range getRange() {
		return range;
	}

	public Vulnerabilities getVulnerabilities() {
		return vulnerabilities;
	}

}

final class Range {

	// min exclusive, max inclusive
	private final int min;
	private final int max;

	public Range(int min, int max) {
		this.min = min;
		this.max = max == -1 ? Integer.MAX_VALUE : max;
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

}

final class Vulnerabilities {

	private final Class<? extends Weapon> strength1;
	private final Class<? extends Weapon> strength2;
	private final Class<? extends Weapon> weakness1;
	private final Class<? extends Weapon> weakness2;

	public Vulnerabilities(Class<? extends Weapon> strength1,
			Class<? extends Weapon> strength2,
			Class<? extends Weapon> weakness1,
			Class<? extends Weapon> weakness2) {
		this.strength1 = strength1;
		this.strength2 = strength2;
		this.weakness1 = weakness1;
		this.weakness2 = weakness2;
	}

	public Class<? extends Weapon> getStrength1() {
		return strength1;
	}

	public Class<? extends Weapon> getStrength2() {
		return strength2;
	}

	public Class<? extends Weapon> getWeakness1() {
		return weakness1;
	}

	public Class<? extends Weapon> getWeakness2() {
		return weakness2;
	}

}

abstract class MeleeWeapon extends Weapon {

	public static final Range RANGE = new Range(0, 1);

	protected MeleeWeapon(int luck, int strength, int currentDurability,
			Enchantment[] enchantments,
			Vulnerabilities vulnerabilities) {
		super(luck, strength, currentDurability, RANGE, enchantments,
				vulnerabilities);
	}

}

abstract class RangedWeapon extends Weapon {

	public static final Range RANGE = new Range(1, -1);

	protected RangedWeapon(int luck, int strength, int currentDurability,
			Enchantment[] enchantments,
			Vulnerabilities vulnerabilities) {
		super(luck, strength, currentDurability, RANGE, enchantments,
				vulnerabilities);
	}

}

final class Sword extends MeleeWeapon {

	protected Sword(int luck, int strength, int currentDurability,
			Enchantment[] enchantments) {
		super(luck, strength, currentDurability, enchantments,
				new Vulnerabilities(Axe.class, Crossbow.class, Lance.class,
						Bow.class));
	}

}

final class Lance extends MeleeWeapon {

	protected Lance(int luck, int strength, int currentDurability,
			Enchantment[] enchantments) {
		super(luck, strength, currentDurability, enchantments,
				new Vulnerabilities(Sword.class, Dagger.class, Axe.class,
						Crossbow.class));
	}

}

final class Axe extends MeleeWeapon {

	protected Axe(int luck, int strength, int currentDurability,
			Enchantment[] enchantments) {
		super(luck, strength, currentDurability, enchantments,
				new Vulnerabilities(Lance.class,
						Bow.class, Sword.class, Dagger.class));
	}

}

final class Dagger extends Weapon {

	protected Dagger(int luck, int strength, int currentDurability, Range range,
			Enchantment[] enchantments) {
		super(luck, strength, currentDurability, range, enchantments,
				new Vulnerabilities(Axe.class, Crossbow.class, Lance.class,
						Bow.class));
	}

}

final class Bow extends RangedWeapon {

	protected Bow(int luck, int strength, int currentDurability,
			Enchantment[] enchantments) {
		super(luck, strength, currentDurability, enchantments,
				new Vulnerabilities(Sword.class, Dagger.class, Axe.class,
						Crossbow.class));
	}

}

final class Crossbow extends RangedWeapon {

	protected Crossbow(int luck, int strength, int currentDurability,
			Enchantment[] enchantments) {
		super(luck, strength, currentDurability, enchantments,
				new Vulnerabilities(Lance.class,
						Bow.class, Sword.class, Dagger.class));
	}

}

class SupportWeapon extends Weapon {

	protected SupportWeapon(int luck, int strength, int currentDurability,
			Range range, Enchantment[] enchantments,
			Vulnerabilities vulnerabilities) {
		super(luck, strength, currentDurability, range, enchantments,
				vulnerabilities);
		// TODO Auto-generated constructor stub
	}
	// TODO
}

final class Ability {

}

interface Enchantment {

	public void applyTo(Weapon weapon);

}
