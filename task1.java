// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class task1{
    static int Sum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    static int Factor(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        
        Scanner iScanner=new Scanner(System.in);
        System.out.printf("Введите целое число n: ");
        boolean flag= iScanner.hasNextInt();
        if (flag==false) System.out.println("Неправильно ввели число!");
        int n=iScanner.nextInt();
        System.out.println(n);
        iScanner.close();

        
        System.out.println("n ое треугольное число равно:"+Sum(n));
        System.out.println("n факториал равен:"+ Factor(n));
    
    }
}

