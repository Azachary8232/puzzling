import java.util.ArrayList;
import java.util.Random;




public class TestPuzzleJava{
    
    public static void main(String[] args) {
            PuzzleJava generator = new PuzzleJava();
            ArrayList<Integer> randomRolls = generator.getTenRolls();
            System.out.println(randomRolls);

            char randomChar = generator.alphabet();
            System.out.println(randomChar);

            String password = generator.pass();
            System.out.println(password);
        
            ArrayList<String> passwords = generator.randPasswords(8);
            System.out.println(passwords);
    }



}