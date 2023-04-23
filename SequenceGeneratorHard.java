package Hackathon;

import java.util.Random;


public class SequenceGeneratorHard {

    Random rand = new Random();

    int sequenceOperator = rand.nextInt(9);

    int randomNumStart = rand.nextInt(9) + 2;
    int randomNumIterate1 = rand.nextInt(4) + 2;
    int randomNumIterate2 = rand.nextInt(4) + 2;

    int correct = 0;

    public void sequence() {

        if(sequenceOperator == 0) {

            //Add and Add
            sequenceAddAdd(randomNumStart, randomNumIterate1, randomNumIterate2);
            //System.out.println("Add Add");

        }
        else if(sequenceOperator == 1) {

            //Add and Subtract
            sequenceAddSubtract(randomNumStart, randomNumIterate1, randomNumIterate2);
            //System.out.println("Add Subtract");

        }
        else if(sequenceOperator == 2) {

            //Add and Multiply
            sequenceAddMultiply(randomNumStart, randomNumIterate1, randomNumIterate2);
            //System.out.println("Add Multiply");
        
        }
        else if(sequenceOperator == 3) {

            //Subtract and Add
            sequenceSubtractAdd(randomNumStart, randomNumIterate1, randomNumIterate2);
            //System.out.println("Subtract Add");

        }
        else if(sequenceOperator == 4) {

            //Subtract and Subtract
            sequenceSubtractSubtract(randomNumStart, randomNumIterate1, randomNumIterate2);
            //System.out.println("Subtract Subtract");

        }
        else if(sequenceOperator == 5) {

            //Subtract and Multiply
            sequenceSubtractMultiply(randomNumStart, randomNumIterate1, randomNumIterate2);
            //System.out.println("Subtract Multiply");

        }
        else if(sequenceOperator == 6) {

            //Multiply and Add
            sequenceMultiplyAdd(randomNumStart, randomNumIterate1, randomNumIterate2);
            //System.out.println("Multiply Add");

        }
        else if(sequenceOperator == 7) {

            //Multiply and Subtract
            sequenceMultiplySubtract(randomNumStart, randomNumIterate1, randomNumIterate2);
            //System.out.println("Multiply Subtract");

        }
        else if(sequenceOperator == 8) {

            //Multiply and Multiply
            sequenceMultiplyMultiply(randomNumStart, randomNumIterate1, randomNumIterate2);
            //System.out.println("Multiply Multiply");
            
        }

    }

    public void verify(int userGuess) {

        if(sequenceOperator == 0) {

            if(userGuess == (randomNumStart + 5*(randomNumIterate1 + randomNumIterate2))) {
                System.out.println("");
                System.out.println("Correct!");

                correct = 1;
            }
            else {
                System.out.println("");
                System.out.println("Sorry, you're incorrect. Would you like to play again?");

                correct = 0;
            }
        }
        else if(sequenceOperator == 1) {

            if(userGuess == (randomNumStart + 5*(randomNumIterate1 - randomNumIterate2))) {
                System.out.println("");
                System.out.println("Correct!");

                correct = 1;
            }
            else {
                System.out.println("");
                System.out.println("Sorry, you're incorrect. Would you like to play again?");

                correct = 0;
            }
        }
        else if(sequenceOperator == 2) {

            int[] sequence = new int[6];

            sequence[0] = randomNumStart;
            sequence[1] = (randomNumStart + randomNumIterate1)*randomNumIterate2;
            sequence[2] = (sequence[1] + randomNumIterate1)*randomNumIterate2;
            sequence[3] = (sequence[2] + randomNumIterate1)*randomNumIterate2;
            sequence[4] = (sequence[3] + randomNumIterate1)*randomNumIterate2;
            sequence[5] = (sequence[4] + randomNumIterate1)*randomNumIterate2;

            if(userGuess == sequence[5]) {
                System.out.println("");
                System.out.println("Correct!");

                correct = 1;
            }
            else {
                System.out.println("");
                System.out.println("Sorry, you're incorrect. Would you like to play again?");

                correct = 0;
            }
        }
        else if(sequenceOperator == 3) {

            if(userGuess == (randomNumStart + 5*(-randomNumIterate1 + randomNumIterate2))) {
                System.out.println("");
                System.out.println("Correct!");

                correct = 1;
            }
            else {
                System.out.println("");
                System.out.println("Sorry, you're incorrect. Would you like to play again?");

                correct = 0;
            }
        }
        else if(sequenceOperator == 4) {

            if(userGuess == (randomNumStart + 5*(-randomNumIterate1 - randomNumIterate2))) {
                System.out.println("");
                System.out.println("Correct!");

                correct = 1;
            }
            else {
                System.out.println("");
                System.out.println("Sorry, you're incorrect. Would you like to play again?");

                correct = 0;
            }
        }
        else if(sequenceOperator == 5) {

            int[] sequence = new int[6];

            sequence[0] = randomNumStart;
            sequence[1] = (randomNumStart - randomNumIterate1)*randomNumIterate2;
            sequence[2] = (sequence[1] - randomNumIterate1)*randomNumIterate2;
            sequence[3] = (sequence[2] - randomNumIterate1)*randomNumIterate2;
            sequence[4] = (sequence[3] - randomNumIterate1)*randomNumIterate2;
            sequence[5] = (sequence[4] - randomNumIterate1)*randomNumIterate2;

            if(userGuess == sequence[5]) {
                System.out.println("");
                System.out.println("Correct!");

                correct = 1;
            }
            else {
                System.out.println("");
                System.out.println("Sorry, you're incorrect. Would you like to play again?");

                correct = 0;
            } 
        }
        else if(sequenceOperator == 6) {

            int[] sequence = new int[6];

            sequence[0] = randomNumStart;
            sequence[1] = (randomNumStart*randomNumIterate1) + randomNumIterate2;
            sequence[2] = (sequence[1]*randomNumIterate1) + randomNumIterate2;
            sequence[3] = (sequence[2]*randomNumIterate1) + randomNumIterate2;
            sequence[4] = (sequence[3]*randomNumIterate1) + randomNumIterate2;
            sequence[5] = (sequence[4]*randomNumIterate1) + randomNumIterate2;

            if(userGuess == sequence[5]) {
                System.out.println("");
                System.out.println("Correct!");

                correct = 1;
            }
            else {
                System.out.println("");
                System.out.println("Sorry, you're incorrect. Would you like to play again?");

                correct = 0;
            }
        }
        else if(sequenceOperator == 7) {

            int[] sequence = new int[6];

            sequence[0] = randomNumStart;
            sequence[1] = (randomNumStart*randomNumIterate1) - randomNumIterate2;
            sequence[2] = (sequence[1]*randomNumIterate1) - randomNumIterate2;
            sequence[3] = (sequence[2]*randomNumIterate1) - randomNumIterate2;
            sequence[4] = (sequence[3]*randomNumIterate1) - randomNumIterate2;
            sequence[5] = (sequence[4]*randomNumIterate1) - randomNumIterate2;

            if(userGuess == sequence[5]) {
                System.out.println("");
                System.out.println("Correct!");

                correct = 1;
            }
            else {
                System.out.println("");
                System.out.println("Sorry, you're incorrect. Would you like to play again?");

                correct = 0;
            }
        }
        else if(sequenceOperator == 8) {

            int[] sequence = new int[6];

            sequence[0] = randomNumStart;
            sequence[1] = (randomNumStart*randomNumIterate1)*randomNumIterate2;
            sequence[2] = (sequence[1]*randomNumIterate1)*randomNumIterate2;
            sequence[3] = (sequence[2]*randomNumIterate1)*randomNumIterate2;
            sequence[4] = (sequence[3]*randomNumIterate1)*randomNumIterate2;
            sequence[5] = (sequence[4]*randomNumIterate1)*randomNumIterate2;

            if(userGuess == sequence[5]) {
                System.out.println("");
                System.out.println("Correct!");

                correct = 1;
            }
            else {
                System.out.println("");
                System.out.println("Sorry, you're incorrect. Try another puzzle!");

                correct = 0;
            }
        }

    }
    
    static int sequenceAddAdd(int first, int add1, int add2) {

        int sum = add1 + add2;

        for(int i = 0; i < 5; i++) {
            System.out.print(first + i*sum + "   ");
        }

        return first + 5*sum;
    }

    static int sequenceAddSubtract(int first, int add, int sub) {

        int sum = add - sub;

        for(int i = 0; i < 5; i++) {
            System.out.print(first + i*sum + "   ");
        }

        return first + 5*sum;
    }
    
    static int sequenceAddMultiply(int first, int add, int multiply) {
        
        int[] sequence = new int[6];

        sequence[0] = first;
        sequence[1] = (first + add)*multiply;
        sequence[2] = (sequence[1] + add)*multiply;
        sequence[3] = (sequence[2] + add)*multiply;
        sequence[4] = (sequence[3] + add)*multiply;

        for(int i = 0; i < 5; i++) {
            System.out.print(sequence[i] + "   ");
        }

        return sequence[5];
    }

    static int sequenceSubtractAdd(int first, int sub, int add) {

        int sum = (-sub) + add;

        for(int i = 0; i < 5; i++) {
            System.out.print(first + i*sum + "   ");
        }

        return first + 5*sum;
    }

    static int sequenceSubtractSubtract(int first, int sub1, int sub2) {

        int sum = (-sub1) - sub2;

        for(int i = 0; i < 5; i++) {
            System.out.print(first + i*sum + "   ");
        }

        return first + 5*sum;
    }
    
    static int sequenceSubtractMultiply(int first, int sub, int multiply) {
        
        int[] sequence = new int[6];

        sequence[0] = first;
        sequence[1] = (first - sub)*multiply;
        sequence[2] = (sequence[1] - sub)*multiply;
        sequence[3] = (sequence[2] - sub)*multiply;
        sequence[4] = (sequence[3] - sub)*multiply;

        for(int i = 0; i < 5; i++) {
            System.out.print(sequence[i] + "   ");
        }

        return sequence[5];
    }

    static int sequenceMultiplyAdd(int first, int multiply, int add) {

        int[] sequence = new int[6];

        sequence[0] = first;
        sequence[1] = (first*multiply) + add;
        sequence[2] = (sequence[1]*multiply) + add;
        sequence[3] = (sequence[2]*multiply) + add;
        sequence[4] = (sequence[3]*multiply) + add;

        for(int i = 0; i < 5; i++) {
            System.out.print(sequence[i] + "   ");
        }

        return sequence[5];
    }

    static int sequenceMultiplySubtract(int first, int multiply, int sub) {

        int[] sequence = new int[6];

        sequence[0] = first;
        sequence[1] = (first*multiply) - sub;
        sequence[2] = (sequence[1]*multiply) - sub;
        sequence[3] = (sequence[2]*multiply) - sub;
        sequence[4] = (sequence[3]*multiply) - sub;

        for(int i = 0; i < 5; i++) {
            System.out.print(sequence[i] + "   ");
        }

        return sequence[5];
    }
    
    static int sequenceMultiplyMultiply(int first, int multiply1, int multiply2) {
        
        int[] sequence = new int[6];

        sequence[0] = first;
        sequence[1] = (first*multiply1)*multiply2;
        sequence[2] = (sequence[1]*multiply1)*multiply2;
        sequence[3] = (sequence[2]*multiply1)*multiply2;
        sequence[4] = (sequence[3]*multiply1)*multiply2;

        for(int i = 0; i < 5; i++) {
            System.out.print(sequence[i] + "   ");
        }

        return sequence[5];
    }


}