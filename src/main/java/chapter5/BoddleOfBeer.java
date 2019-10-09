package chapter5;

public class BoddleOfBeer {


    public void bottleOfBeer( int numOfBoddles){
        if (numOfBoddles > 0){
            System.out.println(numOfBoddles + " bottles of beer on the wall");
            System.out.println(numOfBoddles + " bottles of beer,");
            System.out.println("ya' take one down, ya' pass it around,");

            bottleOfBeer(numOfBoddles - 1);
            System.out.println(numOfBoddles + "bottles of beer on the wall.");

        }else{System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya' can't take one down, ya' can't pass it around,");
            System.out.println("'cause there are no more bottles of beer on the wall!");
        }

    }
}
