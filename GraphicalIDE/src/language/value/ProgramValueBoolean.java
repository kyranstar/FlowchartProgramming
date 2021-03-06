package language.value;

import language.type.Type;

/**
 * The Class ProgramValueNum.
 */
public class ProgramValueBoolean extends ProgramValue<Boolean> {

	public static final ProgramValueBoolean TRUE = new ProgramValueBoolean(true);
	public static final ProgramValueBoolean FALSE = new ProgramValueBoolean(
			false);

	/**
	 * Instantiates a new program value number.
	 *
	 * @param value
	 *            the value
	 */
	public ProgramValueBoolean(final Boolean value) {
		super(value);
	}

	@Override
	public Type getType() {
		return Type.BOOLEAN;
	}
}
