import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {

    Random randmachine = new Random();

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> numbers = new ArrayList<Integer>(); 
        for (int i = 0; i < 10; i++){
            numbers.add(randmachine.nextInt(20)+1);   
        }
        return numbers;
    }

    public char alphabet() {
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
            int randomNum = randmachine.nextInt(26);
            return alphabet[randomNum];
    }

    public String pass(){
        String password = new String();
        for(int i = 0; i < 8; i++ ){
            char randomChar = alphabet();
            password += randomChar;
        }
        return password;
    }

    public ArrayList<String> randPasswords(int amount){
        ArrayList<String> randomPasswords = new ArrayList<String>();
        for(int i = 0; i < amount; i++){
            randomPasswords.add(pass());
        }
        return randomPasswords;
    }





    // public ArrayList<Character> getAlpha() {
    //     ArrayList<Character> letters = new ArrayList<Character>(); 
    //     for (int i = 0; i < 10; i++){
    //         letters.add((char)(randmachine.nextInt(26)+'a'));   
    //     }
    //     return letters;
    // }

}