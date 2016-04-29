import java.util.Scanner;

public class Questions {
	private String question;
	public Scanner userInput = new Scanner(System.in);
	public void Retail(String i)
	{
		question = i;
	}
	public Object getQuestion() {
		return question;
	}
}
