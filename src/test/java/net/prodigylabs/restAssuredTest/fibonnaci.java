package net.prodigylabs.restAssuredTest;

public class fibonnaci {

   public static void main(String args[])
   {
       int n= 7;
       System.out.println("Enter fibonacci upto: "+ n);
       int return_value= fibonacci(n);
       System.out.println("Last digit is - " + return_value);
   }

    public static int fibonacci(int n)
    {


        if (n == 0) {

            return 0;

        } else if (n == 1) {

            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


}
