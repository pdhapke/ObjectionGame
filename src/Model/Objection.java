package Model;

public class Objection {
private String objectionType; 
private String objectionInformation;  //this is just a default objection rules explanation for reference with federal rule #
private String explanation; //more detailed reason for why it is correct
private String timing; //when the objection should be made (is)(calls for)(witness has begun)



public Objection(){}; 

public Objection(String type, String oInfo, String exp, String time){
	this.objectionType = type; 
	this.objectionInformation= oInfo; 
	this.explanation = exp; 
	this.timing = time; 
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
public String getExplanation() {
	return explanation;
}
public void setExplanation(String explanation) {
	this.explanation = explanation;
}
public String getTiming() {
	return timing;
}
public void setTiming(String timing) {
	this.timing = timing;
}

}
