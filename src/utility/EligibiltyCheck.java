package utility;

import model.User;

//Create a class called EligibilityCheck which extends the abstract class BasicEligibility and implements EligibilityInterface
//Implement the method basicEligibilityCheck (User user)
//The basicEligibilityCheck method should in turn invoke checkUser(User user)
//Return true if the candidate is eligible for space journey, return false otherwise.


public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface{

	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		//checkUser(User user) method is used to check whether the user is eligible for space journey or not.
		//A person is eligible if his (18 <= age <= 35, (155 <=height<=170 ) , (55<= weight <= 90) and Country == ProGrad.
		//Return true if the person is eligible and return false otherwise.
		int age1=user.getAge();
		int height1=user.getHeight();
		int weight1=user.getWeight();
		String country=user.getCountry();
		if((age1>=18 &&age1<=35) && (height1 >=155 && height1 <=170) && (weight1>=55 && weight1 <= 90) && (country == "ProGrad")){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		// TODO Auto-generated method stub
		//checkQuiz(String points) method is used to check whether the candidate has cleared the assessment or not.
		//A candidate clears the test only if he scores more than 80.
		//Return true if he scores more than 80 else false.
		//Convert the String to an Integer.
		int score=Integer.parseInt(points);
		if(score>80){
			
			return true;
		}
		return false;
	}

	@Override
	
	public boolean basicEligibilityCheck(User user) {
		// TODO Auto-generated method stub
		if(checkUser(user)){
			return true;
		}
		return false;
	}
	
}






