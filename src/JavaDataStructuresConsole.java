public class JavaDataStructuresConsole {

    private static int sum(int num){
        if( num == 0){
            return 0;
        } else {
            // System.out.println(num);
            return num + sum(num - 1);
        }
    }

    private static int factorial(int num){
        if( num == 0){
            return 1;
        } else {
            // System.out.println(num);
            return num * factorial(num - 1);
        }
    }

    private static int fibonacci(int num){
        if( num < 0){
            return -1;
        } else if (num == 1 || num == 2) {
            return num - 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println(sum(5));
        System.out.println(factorial(5));
        System.out.println(fibonacci(6));
    }

}
