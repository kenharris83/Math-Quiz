import java.util.Scanner;

public class mathQuiz {

    public static void main(String[] args) {
        

        Scanner userInput = new Scanner(System.in);
        
        int correctAnswers = 0;
        
        for (int i = 1; i <= 10; i++) {
        int num1 = (int)(Math.random() * 100) + 10;
        int num2 = (int)(Math.random() * 100) + 10;
        System.out.println("Question " + i + " What is " + num1 + " + " + num2 + " = ");
        int answer = userInput.nextInt();

        if (answer == num1 + num2) {
            System.out.println("Correct!");
            correctAnswers++;
        } else{
            System.out.println("Incorrect. The answer is " + (num1 + num2));
        }
        }
        double percentCorrect = (correctAnswers/10.0) * 100;

        System.out.println("You got " +correctAnswers + " out of 10");
        System.out.println("You got " +percentCorrect + "% ");

        switch ((int)percentCorrect) {
            case 100:
                System.out.println("A+");
                break;
            case 90:
                System.out.println("A");
                break;
            case 80:
                System.out.println("B");
                break;
            case 70:
                System.out.println("C");
                break;
            case 60:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
            break;
        }



        userInput.close();
    }
}