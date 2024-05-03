package academy.learningdsa.introarrays;

public class IntroArrays {
    public static void main(String[] args) {

        //Declaring an Integer array
        int[] intArray = new int[7];
        int[] intArray2 = new int[]{10, 20,30,40, 50, 60, 70};

        //Adding integer values to the array
        intArray[0] = 20;
        intArray[1] = 38;
        intArray[2] = 55;
        intArray[3] = 99;
        intArray[4] = 13;
        intArray[5] = 28;
        intArray[6] = -100;

        for (int j : intArray) {
            System.out.println(j);
        }
        for (int j : intArray2) {
            System.out.println(j);
        }
    }
}
