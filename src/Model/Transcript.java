package Model;

import java.util.List; 

public class Transcript {
private List<String> previousQuestion; 
private String courtQuestion; 
private String witnessAnswer; 
private int questionID; 

public Transcript(){};

public Transcript(List<String> previous, String current, String answer, int qID){
	this.previousQuestion = previous; 
	this.courtQuestion = current; 
	this.witnessAnswer = answer; 
	this.questionID = qID; 	
	
}

public List<String> getPreviousQuestion() {
	return previousQuestion;
}
public void setPreviousQuestion(List<String> previousQuestion) {
	this.previousQuestion = previousQuestion;
}
public String getCourtQuestion() {
	return courtQuestion;
}
public void setCourtQuestion(String courtQuestion) {
	this.courtQuestion = courtQuestion;
}
public String getWitnessAnswer() {
	return witnessAnswer;
}
public void setWitnessAnswer(String witnessAnswer) {
	this.witnessAnswer = witnessAnswer;
}
public int getQuestionID() {
	return questionID;
}
public void setQuestionID(int questionID) {
	this.questionID = questionID;
}



}