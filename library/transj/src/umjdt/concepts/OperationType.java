package umjdt.concepts;

import java.io.Serializable;

public class OperationType implements Serializable {

	private static final long serialVersionUID = 1L;
	private String type;

	public OperationType()
	{}
	
	public OperationType(String _type)
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

