package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("Value for first int?");
        int n2 = ap.nextInt("Value for second int?");
        double average = ((double) n1 + (double) n2) / 2;
        System.out.println("The average is " + average);
    }

}