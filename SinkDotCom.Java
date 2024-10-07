import java.util.ArrayList;


public class SinkDotCom{
    String result;
    private ArrayList<Integer> LocOfCells; 
    public void setLocationCells(ArrayList<Integer> locs) {
        LocOfCells = locs;
    }


    public String checkYourself(String guess){
        result = "miss";
        int index = LocOfCells.indexOf(Integer.parseInt(guess));
        if(index>= 0){
            LocOfCells.remove(index);
            result = "hit";
        }
        

        if(LocOfCells.isEmpty()){
            result = "kill";
        }
        System.out.println(result);    
        return result;
    }
    public static void main(String[] args){
        int numOfGuesses = 0;
        int random = (int)(Math.random() *5);
        ArrayList<Integer> locations = new ArrayList<>(); 
        locations.add(random);
        locations.add(random + 1);
        locations.add(random + 2);
        System.out.println(locations);
        SinkDotCom dot = new SinkDotCom();
        dot.setLocationCells(locations);
        Gamehelper helper = new Gamehelper();
        boolean isAlive = true;
        while (isAlive = true){   
            String prompt = "Enter your guess";
            String Uguess = helper.getUserlnput(prompt);
            String result = dot.checkYourself(Uguess);
            numOfGuesses++;
            if(result == "kill"){
                isAlive = false;
                System.out.println("You took "+numOfGuesses+" number of guesses");
                break;
            }

        }
    }
    
}
