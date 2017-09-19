package common.entity;

public class Message<T> {
	private Byte code;
	private T data;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	/**
	 * @return the code
	 */
	public Byte getCode() {
		return code;
	}
	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(Byte code) {
		this.code = code;
	}
}
