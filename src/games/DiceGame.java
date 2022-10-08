

package games;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        Dice dice= new Dice(6);
        Player afsana = new Player("Afsana", 0);
        //====

        for (int i= 0; i<3; i++){  //1. anropa roll() och spara i en variabel
            int result = dice.roll();

            //2. Spelaren skall gissa!
            System.out.print("Guess what the dice rolled:");
            int guess= scanner.nextInt();
            //3. Skriv ut resultat
            System.out.println( "you guessed"+ guess+".");
            //4. Skriv ut om spelaren gissade rätt eller fel
            System.out.println();
            //boolean correct= result= = guess;
            if( result== guess){
                System.out.println("The dice rolled"+ result+ ".\n"+"You win");
                
            }
            else{
                System.out.println("you lose");
            }
    }
}}
