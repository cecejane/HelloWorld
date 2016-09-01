

import java.lang.Math; // header stuff MUST go above the first class

// our main class becomes a file but the main method is still found
public class HelloWorld
{

    public static void main(String []args){

        int a=1;
        int b=2;
        int c=0;
        int sum=0;

        while (a<4000000)
        {
            c=a+b;

            if (a%2==0)
            {
                sum=sum+a;
            }

            a=b;
            b=c;

        }

        System.out.println(sum);
        System.out.println("done!");



    }
}