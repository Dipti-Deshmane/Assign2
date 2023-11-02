package Assign2;

import java.util.Scanner;

public class ReverseOperation {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //String sentence = "I am dipti";
        String sentence = sc.nextLine();
        System.out.println("Original sentence is: "+sentence);
        StringBuilder strB = new StringBuilder();
        strB.append(sentence);
        strB.reverse();
        System.out.println(strB);

    }
}
