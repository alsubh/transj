package umjdt.concepts;

import java.io.Serializable;

public class LockType implements Serializable {

// specify type of access and locking of resources
	private static final long serialVersionUID = 1L;
	private String type;

	public LockType()
	{}
	
	public LockType(String _type)
	{
		this.type = _type;
	}
	public String getType() {
		return type;
	}

	public void setType(String _type) {
		this.type = _type;
	}
}