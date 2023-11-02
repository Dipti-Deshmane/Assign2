package Assign2;

public class AddChar {
    public static void main (String[] args) {
        char[] ch = {'a','b','c'};
        System.out.println("Original sentence is: "+ch);
        //StringBuilder strB = new StringBuilder();
        //strB.append();
        for(int i=0; i<ch.length-1;i++) {
            ch.length-1 = ch++;
        }

    }
}
