package Control.beans;
import java.util.List;

import com.google.gson.Gson;
import Model.Question;
import Control.DataBaseServices;

public class DataBaseServicesBean implements DataBaseServices{

	public boolean addQuestions(List<Question> list){
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addQuestion(Question q) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Question> getQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

	public Question getQuestion() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateQuestion(Question q) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateQuestion(String json) {
		// TODO Auto-generated method stub
		Gson g = new Gson();
		Question question = g.fromJson(json, Question.class);
		return updateQuestion(question);
	}

	public boolean deleteQuestion(Question q) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteQuestion(int questionID) {
		// TODO Auto-generated method stub
		return false;
	}

}
