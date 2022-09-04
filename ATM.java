import java.util.*;

public class ATM {
    public static void main(String[] args) {
        int n, amt, withdraw, cb = 0,pin;


        while (true) {
            System.out.println("\n\t ***Welcome to Edubridge Bank*** ");
            System.out.println("\n\t 1. Deposite Money ");
            System.out.println("\n\t 2. Withdraw Money  ");
            System.out.println("\n\t 3. Check Balance  ");
            System.out.println("\n\t 4. Exit ");
            System.out.println("\n\t Enter Your Choice");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            switch (n) {
                case 1:

                    System.out.println("Enter your PIN");
                    pin=sc.nextInt();
                    if(pin==1234)
                    {
                    System.out.println("\n\t Enter total amm to insert=");
                    amt = sc.nextInt();
                    cb = cb + amt;
                    System.out.println("\n\t Amt Deposited Succesfully.. Your current balance is " + cb);
                    }
                    else{
                    System.out.println("Incorrect PIN");
                    }
                    break;
                case 2:
                System.out.println("Enter your PIN");
                pin=sc.nextInt();
                if(pin==1234)
                {
                  if(cb==0)
                 {
                    System.out.println("0 balance, please deposite money in your account");
                 }
                    else
                 {
                    System.out.println("\n\t Emter amm to withdraw= ");
                    withdraw = sc.nextInt();
                    if ((cb - withdraw) < 500)
                        System.out.println("\n\t Minimum balanace require(500) ");
                    else
                        cb = cb - withdraw;
                        System.out.println("\n\tPlease collect your money("+withdraw+")");

                }
            }
                else{
                System.out.println("Incorrect PIN");
                }
                    break;
                
                case 3:
                System.out.println("Enter you PIN");
                pin=sc.nextInt();
                if(pin==1234)
                {
                    System.out.println("Your current balance is = " + cb);
                }
                    else {System.out.println("Incorrect PIN");}
                    break;

                case 4:
                    System.out.println("\n\t Thank you for visiting our ATM");
                    System.out.println("\n");
                    System.exit(0);

                default:
                    System.out.println("\n\t Invalid Option ");

            }
        }

    }
}
