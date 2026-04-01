package Box;

public class conditional {
    static void main(String[] args) {

        // Check the number Positive or not :
        /*int i=-9;
        if(i>0){
            System.out.println("Number is Positive ");
        }
        else{
            System.out.println("Number is Negative ");
        }
    }*/
        // Odd Even :
        /*int a = 10;
        if (a % 2 == 0) {
            System.out.println("Number is Even ");

        } else {
            System.out.println("Number is Negative ");
        }*/
        // Greater Number from 3 :
        int num1 = 2, num2 = 13, num3 = 13;
        if (num1 > num2 && num1 > num3) {
            System.out.println("1 st is great");

        } else if (num2 > num1 && num2 > num3) {
            System.out.println("2nd number is great ");
        } else if (num3 > num1 && num3 > num2){
            System.out.println("3rd is great");
    }
    else if (num1==num2 || num1==num3 || num3 == num2)
    {System.out.println("Two number are equal");}




    }}


