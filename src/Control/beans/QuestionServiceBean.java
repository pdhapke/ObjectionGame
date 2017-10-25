package Control.beans;

import java.util.List;

import Control.QuestionService;
import Model.Question;
import Model.Objection;
import Model.Transcript;
import Model.Witness;

public class QuestionServiceBean implements QuestionService{
	private int score; 
	
	public QuestionServiceBean(){};
	public QuestionServiceBean(String type, int numberOfQuestions){
		this.score = 0; 
		
	}
	
	
	
	public void updateScore(boolean correct) {
		if (correct){
			this.score++;
		}
	}
	public void getList(String type, int size) {
		// TODO Auto-generated method stub
	
	}
	public int score() {
		return this.score;
	}

	public List<Integer> completedQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

	public Question getNext() {
		// TODO Auto-generated method stub
		return null;
	}

	public Question getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	public Question userObjectsTo(String objectionType, String objectionTime) {
		// TODO Auto-generated method stub
		return null;
	}

}
