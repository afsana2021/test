package games;

public class Player {
    private int score;
    private final String name;
    //constructor
    public Player(String name, int score){
        this.name= name;//this-means that we can field from This class
        this.score=score;
    }
    public int getScore(){
        return score;
    }
    public void plusScore(){
        score++;
    }
    public void minusScore(){
        score--;
    }
    /*
    public String getName(){
        return name;
    }
    public void regeQiut(){
        System.exit(0);
    }*/
    @Override
    public String toString(){
        return "Name:"+ this.name+ ", Score:" + this.score;
    }
}
