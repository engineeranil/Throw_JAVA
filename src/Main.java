import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws Exception {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the age:");
        int sayi= scan.nextInt();
        try{
            checkAge(sayi);
        }catch (AgeCheckException e){
            System.out.println(e.toString());
        }

        System.out.println("Girilen Sayi: "+sayi);
        System.out.println("Program Sonlandi");

    }
    public static void checkAge(int age)throws AgeCheckException{
        if(age<18){
            throw new AgeCheckException("AgeCheckException Hatasi!!");

        }
        System.out.println("Yasiniz Uygundur");

    }
}
