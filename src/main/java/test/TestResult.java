package test;
import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {

        String word = "SOS";
        Exercise exercise = new Exercise();
        System.out.println(exercise.Calculate(word));
        
    }
}
