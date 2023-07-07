import java.util.Scanner;

public class helloworld{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius ");
        float c= sc.nextFloat();
        float f = c*(9.0f/5.0f)+32;
        System.out.println("The temperature in F is "+f+ " degrees ");



    }


}
