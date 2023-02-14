// Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь). 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите выражение в формате: q + w = e, q, w, e >= 0, где одна цифра из двухзначного числа заменена знаком вопроса.");
        String expression = sc.nextLine(); 
        sc.close();   
        System.out.println(expression);
        String[] numbers = expression.split("[+=]+");
        
        int sum=Integer.parseInt (numbers[2]);
        char[] number1 = numbers[0].toCharArray();
        char[] number2 = numbers[1].toCharArray();
                
        int secondDigitSum=sum%10;
        int secondDigitNumber2=0;
        int secondDigitNumber1=0;
        if (Character.isDigit(number1[1])){
            secondDigitNumber1=Character.digit(number1[1], 10);
            if (secondDigitSum>secondDigitNumber1){
                secondDigitNumber2=secondDigitSum-secondDigitNumber1;
            } else{
                secondDigitNumber2=secondDigitSum+10-secondDigitNumber1;
            }            
            int firstDigitNumber2=Character.digit(number2[0], 10);
            int number22=firstDigitNumber2*10+secondDigitNumber2;
            int number11=sum-number22;
            if (number11%10==secondDigitNumber1){
                System.out.println(number11+"+"+number22+"="+sum);
            } else{
                System.out.println("Восстановление невозможно.");
            }            
        }
        if (Character.isDigit(number2[1])){
            secondDigitNumber2=Character.digit(number2[1], 10);            
            if (secondDigitSum>secondDigitNumber2){
                secondDigitNumber1=secondDigitSum-secondDigitNumber2;
            } else{
                secondDigitNumber1=secondDigitSum+10-secondDigitNumber2;
            }
            // System.out.println(secondDigitNumber1);
            int firstDigitNumber1=Character.digit(number1[0], 10);
            int number11=firstDigitNumber1*10+secondDigitNumber1;
            int number22=sum-number11;
            if (number22%10==secondDigitNumber2){
                System.out.println(number11+"+"+number22+"="+sum);
            } else{
                System.out.println("Восстановление невозможно.");
            }            
        }
    }
}    
