package quiz;
import java.util.*;
public class quiz {
	public static void main(String args[]) {
		System.out.println("QUIZ GAME")	;	
		Scanner sc=new Scanner(System.in);
		int n=3;
		int score=0;
		for(int i=1;i<=n;i++) {
			if(i==1) {
				System.out.println("What is the Capital of India?");
                System.out.println("Options:");
                System.out.println("a) Goa");
                System.out.println("b) Gujarat");
                System.out.println("c) Delhi");
                String answer1="Delhi";
                System.out.print("Type your answer here: ");
                String ans1 = sc.nextLine();
                if(ans1.equals(answer1)) {
                	System.out.println("Correct answer");
                	score++;
                }
                else {
                	System.out.println("Wrong answer");
                	System.out.println("Correct answer is"+ " "+answer1);
                }
			}
			else if(i==2) {
				System.out.println("which is the pink city of India?");
                System.out.println("Options:");
                System.out.println("a) Goa");
                System.out.println("b) Gujarat");
                System.out.println("c) Jaipur");
                String answer2="Jaipur";
                System.out.print("Type your answer here: ");
                String ans2 = sc.nextLine();
                if(ans2.equals(answer2)) {
                	System.out.println("Correct answer");
                	score++;
                }
                else {
                	System.out.println("Wrong answer");
                	System.out.println("Correct answer is"+ " "+answer2);
                }
			}
			else if(i==3) {
				System.out.println("How many states are there in India?");
                System.out.println("Options:");
                System.out.println("a) 32");
                System.out.println("b) 28");
                System.out.println("c) 36");
                String answer3="28";
                System.out.print("Type your answer here: ");
                String ans3= sc.nextLine();
                if(ans3.equals(answer3)) {
                	System.out.println("Correct answer");
                	score++;
                }
                else {
                	System.out.println("Wrong answer");
                	System.out.println("Correct answer is"+ " "+answer3);
                }
			}			
			
		}
		System.out.println("Exiting the game. Thank you for playing!");
        System.out.println("Your final score is: " + score);
		sc.close();
	}

}
