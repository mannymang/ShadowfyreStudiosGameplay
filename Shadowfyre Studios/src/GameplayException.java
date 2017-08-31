

public class GameplayException extends Exception {

	private static final long serialVersionUID = 4524694699362195240L;

	public GameplayException() {
		super();
	}

	public GameplayException(String message) {
		super(message);
	}

	public GameplayException(Throwable cause) {
		super(cause);
	}

	public GameplayException(String message, Throwable cause) {
		super(message, cause);
	}

	public GameplayException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
