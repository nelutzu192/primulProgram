package com.skillbrain;

public class LoopsExamples {

    public static void main (String[]args){

        /*exemple ciclul FOR

        When you know exactly how many times you want to loop through a block of code, use the for loop
        instead of a while loop;

         */

        //scriem fiecare numar de la 1 la 5
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //haideti sa scriem in consola numerele pare de la 1 la 10
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }




        //haideti sa printam in consola "DA" de 5 ori, folosind un ciclu for


        //for-each example
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }


        /*
        exemple ciclul WHILE
        Loops can execute a block of code as long as a specified condition is reached.
        Loops are handy because they save time, reduce errors, and they make code more readable.
         */

        //The while loop loops through a block of code as long as a specified condition is true:
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }



        /*
        exemple do-while loop
         */

        //The example below uses a do/while loop. The loop will always be executed at least once,
        // even if the condition is false, because the code block is executed before the condition is tested:

        i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);


    }

}
