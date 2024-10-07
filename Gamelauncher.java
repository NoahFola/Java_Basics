class GuessGame{
    public void startGame(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        int guess = (int) (Math.random()*10);
        System.out.println("Guessnumber: " + guess);
        System.out.println("p1's guess: " + p1.guess());
        System.out.println("p2's guess: " + p2.guess());
        System.out.println("p3's guess: " + p3.guess());


    }
}


public class Gamelauncher{
    public static void main (String[] args){
        GuessGame game = new GuessGame();
        game.startGame();
    }
}

class Player{
    int number;
    public int guess(){
        number = (int) (Math.random()*10);
        return number;
    }
}

