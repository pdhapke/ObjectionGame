package Model;

public class ObjectionType {
	private String objectionType; 
	private String objectionInformation;  //this is just a default objection rules explanation for reference with federal rule #

	public ObjectionType(){}; 
	public ObjectionType(String type, String info){
	this.objectionInformation = info; 
	this.objectionType = type; 
	}
	
	public String getObjectionType() {
		return objectionType;
	}
	public void setObjectionType(String objectionType) {
		this.objectionType = objectionType;
	}
	public String getObjectionInformation() {
		return objectionInformation;
	}
	public void setObjectionInformation(String objectionInformation) {
		this.objectionInformation = objectionInformation;
	}
	
}
