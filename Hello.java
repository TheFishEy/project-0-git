//package project-0-git;

public class Hello {
    public static void main(String[]args)
    {
        System.out.println("Program to compute sum")

        int n =  10;
        int sum = computeSum(n);
        System.out.println("sum = " + sum);

        //int result = add(n, sum);
        //System.out.println("result = " + result);

    }

    static int computeSum(int n) 
    {
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = add(sum, i);
        }
        return sum;
    }
    
    static int add(int a, int b) {
        int result = a + b;
        return result;
    }
}
