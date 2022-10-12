package be.intecbrussel;

import java.util.Arrays;
// extra oefen1
public class Extraoef1 {
    public static void main(String args[]) {
        int[] myArr = new int[5];
        myArr[0] = 2;
        myArr[1] = 5;
        myArr[2] = 46;
        myArr[3] = 12;
        myArr[4] = 34;
        //System.out.println("myArr={"+myArr[0]+"  "+myArr[1]+"  "+myArr[2]+"  "+myArr[3]+"  "+myArr[4]+"}");
        // Arrays class in java
        System.out.println("myArr="+Arrays.toString(myArr));
        // extra oefen2
        String[] list = {"Java", "Joey", "Intec", "Brussel", "Halil"};
        int[] numbers = {1, 3, 4, 6, 17, 38, 59, 100};
        System.out.println("Numbers="+Arrays.toString(numbers));
        System.out.println("list="+Arrays.toString(list));


    }
}
