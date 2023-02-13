// Реализовать простой калькулятор (+ - / *)
import java.util.Scanner;

public class task3 {
    static float Calc(float number1,float number2,String sign){
        float result=0;
        switch (sign){
            case "+":
                result=number1+number2;
                break;
            case "-":
                result=number1-number2;
                break;
            case "*":
                result=number1*number2;
                break; 
            case "/":
                result=number1/number2;
                break;
            default:
            System.out.println("Неправильно ввели знак действия!"); 
        }
        return result;
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            

            System.out.printf("Введите первое  число x: ");
            boolean flag= sc.hasNextFloat();
            if (flag==false) System.out.println("Неправильно ввели число!");
            float x=sc.nextFloat();
            sc.nextLine();
            
            System.out.print("Введите действие,которое вы хотите сделать(+,-,*,/): ");
            String znak = sc.nextLine();
           
            System.out.printf("Введите второе  число y: ");
            flag= sc.hasNextFloat();
            if (flag==false) System.out.println("Неправильно ввели число!");
            float y=sc.nextFloat();
                               
            sc.close();

            float resCulc=Calc(x, y, znak);
            String result=String.format("%.2f",resCulc);
           
            System.out.println(x+znak+y+"="+result);
           
    }
}


