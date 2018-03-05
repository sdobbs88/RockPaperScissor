import java.util.Scanner;
public class RockPaperScissor {
    public static void main(String[] args) {
        //Receive input
        System.out.println("0 is Scissor");
        System.out.println("1 is Rock");
        System.out.println("2 is Paper");
        System.out.print("Please input a value for rock, paper or scissor:");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        
        //Generate random number for computer input
        int compInput = (int) (Math.random() * 3);
        
        //Assign words to the input for human
        String humanPlay = "";
        String compPlay = "";
        
        switch (userInput) {
            case 0:
                humanPlay = "Scissor";
                break;
            case 1:
                humanPlay = "Rock";
                break;
            case 2:
                humanPlay = "Paper";
                break;
            default:
                break;
        }
        
        //Assign words to the input for computer
        switch (compInput) {
            case 0:
                compPlay = "Scissor";
                break;
            case 1:
                compPlay = "Rock";
                break;
            case 2:
                compPlay = "Paper";
                break;
            default:
                break;
        }
        
        if (compInput == userInput){
            System.out.println("The computer is "+compPlay+". "+""
            + "You are "+humanPlay+" too. It is a draw.");}
        else if (compInput == 0){
            if (userInput == 1)
                System.out.println("The computer is "+compPlay+". "+""
                + "You are "+humanPlay+". You win!.");
            else if (userInput == 2)
                System.out.println("The computer is "+compPlay+". "+""
                + "You are "+humanPlay+" . You lose.");}
        else if (compInput == 1){
            if (userInput == 0 )
                System.out.println("The computer is "+compPlay+". "+""
                + "You are "+humanPlay+" . You lose.");
            else if (userInput == 2)
                System.out.println("The computer is "+compPlay+". "+""
                + "You are "+humanPlay+" . You win!");}
        else if (compInput == 2){
            if (userInput == 0)
                System.out.println("The computer is "+compPlay+". "+""
                + "You are "+humanPlay+" . You win!");
            else if (userInput == 1)
                System.out.println("The computer is "+compPlay+". "+""
                + "You are "+humanPlay+" . You lose.");}
        else 
           System.out.println("Invalid input.");
    }
}
