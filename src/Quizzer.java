import java.util.ArrayList;
import java.util.Scanner;
public class Quizzer {
	public Scanner userInput = new Scanner(System.in);
	static 	ArrayList <Questions> qlist = new ArrayList<Questions>(10);
	public static void main(String[] args)
	{
		
	}
	public void addFormat()
	{
		for(int i = 0; i < qlist.size(); i ++)
		{
			public void setQuestion(String qline)
			{
				int randomNum1 = (int) (Math.random()*15);
				int randomNum2 = (int) (Math.random()*20);
				int correctAnswer = randomNum2%randomNum1;
				System.out.println("When you're given"+randomNum2+"%"+randomNum1+". What is the remainder");
				int inputedAnswer = userInput.nextInt();
				if(inputedAnswer==correctAnswer)
				{
					System.out.println("That's right!");
				}
				else
				{
					System.out.println("That's wrong! The correct answer was "+correctAnswer);
				}
			}
		}
	}
