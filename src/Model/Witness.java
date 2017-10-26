package Model;

public class Witness {
private String firstname; 
private String lastname; 
private String affidavit; 
private String side; 
private int fk_caseID;
private int witnessID; 




public Witness(){};

public Witness(String fname, String lname, String aff, String side,  int witID, int caseID){
	this.firstname = fname; 
	this.lastname = lname; 
	this.affidavit = aff; 
	this.side = side; 
	this.fk_caseID = caseID; 
	this.witnessID = witID; 
}
public int getFk_caseID() {
	return fk_caseID;
}
public int getWitnessID() {
	return witnessID;
}

public void setWitnessID(int witnessID) {
	this.witnessID = witnessID;
}
public void setFk_caseID(int fk_caseID) {
	this.fk_caseID = fk_caseID;
}
public String getFirstname() {
	return firstname;
}


public void setFirstname(String firstname) {
	this.firstname = firstname;
}



public String getLastname() {
	return lastname;
}



public void setLastname(String lastname) {
	this.lastname = lastname;
}



public String getAffidavit() {
	return affidavit;
}



public void setAffidavit(String affidavit) {
	this.affidavit = affidavit;
}



public String getSide() {
	return side;
}



public void setSide(String side) {
	this.side = side;
}


public String name(){
	return this.firstname + " " + this.lastname;
}


}
