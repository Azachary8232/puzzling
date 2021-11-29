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
}