package Model;

import java.util.List;

public class Question {
	private int caseID; 
	private String context;
	private Witness witness; 
	private Transcript transcript; 
	private List<Objection> correctObjections; 
		
	public int getCaseID() {
		return caseID;
	}
	public void setCaseID(int caseID) {
		this.caseID = caseID;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public Witness getWitness() {
		return witness;
	}
	public void setWitness(Witness witness) {
		this.witness = witness;
	}
	public Transcript getTranscript() {
		return transcript;
	}
	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
			}
	public List<Objection> getCorrectObjections() {
		return correctObjections;
	}
	public void setCorrectObjections(List<Objection> correctObjections) {
		this.correctObjections = correctObjections;
	}
	public int getQuestionID(){
		return this.transcript.getQuestionID();
	}

}
