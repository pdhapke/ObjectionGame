package Control.beans;

import java.util.List;
import java.util.ArrayList; 
import Control.QuestionService;
import Model.Question;
import Model.Objection;
import Model.Transcript;
import Model.Witness;
import Model.beans.QuestionList;

public class QuestionServiceBean implements QuestionService{
	private int score; 
	private QuestionList list; 
	private List<Integer> completedQuestions; 
	private int nextQuestion; 
	private String objectionPracticeType; 
	
	
	public QuestionServiceBean(){
		this.score = 0; 
		this.completedQuestions = new ArrayList<Integer>(); 
		this.nextQuestion = 0; 
		};
	public QuestionServiceBean(String type, int numberOfQuestions){
		this.completedQuestions = new ArrayList<Integer>(); 
		this.score = 0; 
		this.nextQuestion = 0; 
		this.objectionPracticeType = type; 
		//create a list with type and number of questions requested
	}
	//testing constructor
	public QuestionServiceBean(QuestionList testList){
		this.completedQuestions = new ArrayList<Integer>(); 
		this.list = testList; 
		this.score = 0; 	
		this.nextQuestion = 0; 
	}
	public String getObjectionPracticeType() {
		return objectionPracticeType;
	}
	public void setObjectionPracticeType(String objectionPracticeType) {
		this.objectionPracticeType = objectionPracticeType;
	}	
	public void updateScore(boolean correct) {
		if (correct){
			this.score++;
		}
	}
	public void getNewList(String type, int size) {
		// TODO Auto-generated method stub
	
	}
	public int score() {
		return this.score;
	}

	public List<Integer> completedQuestions() {
		return this.completedQuestions;
	}

	public Question getNext() {
		return list.get(this.nextQuestion);
	}

	public Question getCurrent() {
		int index; 
		if (this.nextQuestion == 0){
			index = 0; 
		} else {
			index = this.nextQuestion - 1; 
		}
		return list.get(index);
	}

	public boolean hasNext() {
		boolean response; 
		if((this.nextQuestion >= list.size())){
			response = false; 
		} else {
			response = true; 
		}
		return response;
	}
	

	public boolean userObjectsTo(String objectionType, String objectionTime) {
		boolean correct = false; 
		Question currentQuestion = this.getCurrent(); 
		
		for(Objection obj : currentQuestion.getCorrectObjections()){
			if(obj.getObjectionType() == objectionType){
				correct = true; 
			}
		}
		completedQuestions.add(this.getCurrent().getQuestionID()); 			
		this.nextQuestion++; 
		updateScore(correct); 
		return correct;
	}
	@Override
	public Objection getCorrectObjection() {
		int FIRST_POSSIBLE = 0;
		return this.getCurrent().getCorrectObjections().get(FIRST_POSSIBLE);
	}
	@Override
	public Objection getCorrectObjection(String type) {
		int i = 0;
		while(this.getCurrent().getCorrectObjections().get(i).getObjectionType() != type){
			i++;
		}
		return this.getCurrent().getCorrectObjections().get(i);
	}

}
