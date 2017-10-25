package Control;

import java.util.List;

import Model.Question;
import Model.Objection;
import Model.Transcript;
import Model.Witness;

public interface QuestionService {
	public void updateScore(boolean correct);
	public void getList(String type, int size);
	public int score();
	public List<Integer> completedQuestions(); 
	public Question getNext(); 
	public Question getLast(); 
	public boolean hasNext(); 
	public Question userObjectsTo(String objectionType, String objectionTime);
}
