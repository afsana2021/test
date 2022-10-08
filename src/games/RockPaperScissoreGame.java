package games;
import java.util.Scanner;

public class RockPaperScissoreGame {
    Player player;
    Fist alFist;
    private String yourChoiceStr= "";
    private String resultalstr = "";
    //private int score;
    private String resultOfGame="";
    private int tries;

    RockPaperScissoreGame(
            String playersName,int playersScore)
    {
        player= new Player(playersName, playersScore);
        alFist = new Fist();
    }
   public void playGame(){
        System.out.println(player.toString());
        System.out.println("Rock(0),paper(1),scissors(2). Your choice: ");
        Scanner scanner= new Scanner(System.in);
        int AlChoice = alFist.play();
        switch(AlChoice){
            case Fist.Rock:
                resultalstr= "Rock";
            case Fist.paper:
                resultalstr="paper";
            case Fist.scissors:
                resultalstr="scissors";
                break;
    }
    switch (scanner.next().toLowerCase()){
        case"0":
        case"rock":
        case"r":
            yourChoiceStr="Rock";
            if (AlChoice==Fist.scissors){
                resultOfGame="Congrats. You win.Rock beats Scissors";
                player.plusScore();
            }
            else if (AlChoice==Fist.Rock){
                resultOfGame="upps,you both chose the same";
            }
            else{
                resultOfGame="You lose.Scissors beats paper";
                player.minusScore();
            }
            resultInfo();
            break;
        case"1":
        case"paper":
        case"p":
            yourChoiceStr="paper";
            if (AlChoice==Fist.Rock){
                resultOfGame="Congrats.You win. Paper beats Rock";
                player.plusScore();
            }
            else if(AlChoice==Fist.paper){
                resultOfGame="Upps,you both choose the same";
            }else {resultOfGame="You lose.Scissors beats paper";
                player.minusScore();}
            resultInfo();
            break;
        case"2":
        case"scissors":
        case"s":
            yourChoiceStr="scissors";
            if(AlChoice==Fist.paper){
                resultOfGame="Congrates.You Win.Scissors beats paper";
                player.plusScore();
            }
            else if(AlChoice==Fist.scissors){
                resultOfGame="Upps,you both choose the same";
            }
            else{
                resultOfGame="You lose.Rock beats scissors";
                player.minusScore();
            }
            resultInfo();
            break;
        default:
            System.out.println("Upps,you choose something wrong");
}}
public void resultInfo(){
        System.out.println("Your selection is: "+yourChoiceStr);
        System.out.println("Al's selection is: "+resultalstr);
        System.out.println(resultOfGame);
        System.out.println("Your score is: "+player.getScore());
        ++tries;
        System.out.println("Your try is: "+tries);
    }
    public boolean wantMore(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you want to play again? y/n");
        String choice=scanner.next();
        if (choice.equals("y")){
            return true;}
        else{
            System.out.println("ok.Bye.Have a nice day!");
            return false;}
    }
}
