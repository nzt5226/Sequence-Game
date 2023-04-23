package Hackathon;

import java.util.Scanner;

public class SequenceGame {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        SequenceGeneratorHard sequenceGeneratorHard = new SequenceGeneratorHard();
        
        System.out.println("Can you determine the next number in the sequence?");
        sequenceGeneratorHard.sequence();

        int userGuess = input.nextInt();

        sequenceGeneratorHard.verify(userGuess);

    }
}