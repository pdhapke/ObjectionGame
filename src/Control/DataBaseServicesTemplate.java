package Control;
import Model.Question;
import Model.Objection;
import Model.Transcript;
import Model.Witness;
import com.google.gson.Gson;
import java.util.List; 
import Model.databaseInformation;

public interface DataBaseServicesTemplate {
	//Create
	public boolean addQuestions(List<Question> list);
	public boolean addQuestion(Question q);
	
	//Read
	public List<Question> getQuestions(); 
	public Question getQuestion(); 
	
	//Update
	public boolean updateQuestion(Question q); 
	public boolean updateQuestion(String json); 
	
	//Delete
	public boolean deleteQuestion(Question q); 
	public boolean deleteQuestion(int questionID); 
	
	}
