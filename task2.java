// Вывести все простые числа от 1 до 1000 
public class task2 {
    static int FindCountSimple(int number){
        int count=0;
        for (int num=3;num<number;num+=2){
            int i=3;
            boolean flag=true;
            
            while (i<num){
                if (num%i!=0){
                    i+=2;
                }
                else {
                    flag=false;
                    break;}
            }
            if (flag==true) {
                count++;
            }
        }
        return count+1;
    }

    static int[] FindPrimeNumbers(int lengthArr,int number){
            
        int[] primeNumbers=new int[lengthArr];
        primeNumbers[0]=2;
        int count=0;
        for (int num=3;num<number;num+=2){
            int i=3;
            boolean flag=true;
            
            while (i<num){
                if (num%i!=0){
                    i+=2;
                }
                else {
                    flag=false;
                    break;
                }
            }
            if (flag==true) {
                count++;
                primeNumbers[count]=num;
            }

        }
        return primeNumbers;

    }
    public static void main(String[] args){
        int number=1000;
        int length=FindCountSimple(number);    
        int [] primeNum=FindPrimeNumbers(length, number);

        for (int i : primeNum) {
             System.out.printf("%d ",i);
        }
        
    }
}
