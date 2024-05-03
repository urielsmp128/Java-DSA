package academy.learningdsa.sortingalgos;

public class Recursion {

    public static void main(String[] args) {

        System.out.println(Recursion.recursiveFactorial(6));
        System.out.println(Recursion.iterariveFactorial(6));

    }

    public static int iterariveFactorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }

        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }

        return factorial;
    }

    public static int recursiveFactorial(int num){
        if (num == 0  || num == 1){
            return 1;
        }else {
            return num * recursiveFactorial(num - 1);
        }
    }
}
