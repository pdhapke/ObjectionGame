package Model;

public class Witness {
private String firstname; 
private String lastname; 
private String affidavit; 
private String side; 

public Witness(){};

public Witness(String fname, String lname, String aff, String side){
	this.firstname = fname; 
	this.lastname = lname; 
	this.affidavit = aff; 
	this.side = side; 
		
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
