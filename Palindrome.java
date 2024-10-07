import java.io.*;

public class Palindrome{
    public void getUserInput(String prompt){
        String p = new String(prompt + ": ");
        System.out.println(p);
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input = reader.readLine();
            checkForPalindrity(input);
        }
        catch(IOException e){
            System.out.print(e.toString());
        }
    }

    public void checkForPalindrity(String p){
        p  = p.replace(" ", "");
        p = p.replace(",", "");
        p = p.replaceAll("[^a-zA-Z]", "");
        p = p.toLowerCase();
        StringBuilder reverse = new StringBuilder(p).reverse();
        if (p.equals(reverse.toString())) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }

    public void go(){
        getUserInput("Enter a word/sentence");
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.go();
    }

}