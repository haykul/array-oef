package be.intecbrussel;

public class FirstArray {
    public static void main(String[] args) {
        int[] myArr = new int[5];
        myArr[0] = 10;
        myArr[1] = 20;
        myArr[4] = 12;
        System.out.println(myArr[1]);
        System.out.println(myArr[3]);
        System.out.println(myArr.length);

        short[] myArr1 = new short[3];
        myArr1[1] = 3000;
        System.out.println(myArr1[1]);
        byte[] myArr2 = new byte[3];
        myArr2[0] = -105;
        System.out.println(myArr2[0]);
        float[] myFlo = new float[2];
        myFlo[1] = 66.6f;
        System.out.println(myFlo[1]);
        double[] myArr4 = new double[3];
        myArr4[2] = 22.22;
        System.out.println(myArr4[2]);
        boolean[] myBoo = new boolean[5];
        myBoo[0] = true;
        System.out.println(myBoo[0]);
        String[] names = {"john", "joey"};
        System.out.println(names[1]);
        double[] numbers = {10.0, 25.9, 30.8, 50.7};
        System.out.println(numbers[2]);
        String[] myArr5 = new String[5];
        myArr5[0] = "Halil";
        myArr5[1] = "Avi";
        System.out.println(myArr5[0]);
        System.out.println(myArr5[1]);
        System.out.println(myArr5.length);

        String[] names1 = {"john", "joey", "halil", "avi"};
        for (int index1 = 0; index1 < names1.length; index1++) {
            System.out.println(names1[index1]);
        }
        for (int index = 0; index < myFlo.length; index++) {
            System.out.println(myFlo[index]);

        }
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
            System.out.println("*****");
        }
        //for each
        for (double elements : numbers) {
            System.out.println(elements);
        }

        //write a program to add up these numbers
        int[] numb = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //-> totaal 55
        int sum = 0;
        for (int index = 1; index < numb.length + 1; index++) {
            sum += index;
        }
        System.out.println("Totaal :" + sum);//-> totaal 55
        //write a program to add up these numbers
        double[] deciNumb = {10.5, 20.8, 33.45};

        double sum1 = 0.0;
        for (int index = 0; index < deciNumb.length; index++) {
            sum1 += deciNumb[index];
             }
        System.out.println("deciNumb :" + sum1);
    }
}