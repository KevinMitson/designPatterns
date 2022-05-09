package state.state_exercise;

import java.util.Scanner;

public class Main {
    private static MembersAccount account;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        status();


    }

    public static void status(){
        Instructions();
        System.out.println();
        String balance;
        System.out.print("Choose an Option: ");
        balance = scanner.nextLine();

        switch (balance){
            case "0":
                System.out.println("You just created an account");
                break;
            case "1":
                account = new MembersAccount(new Active());
                account.myState();
                break;
            case "2":
                account= new MembersAccount(new Due());
                account.myState();
                break;
            case "3":
                account = new MembersAccount(new Unpaid());
                account.myState();
                break;
            case "4":
                account = new MembersAccount(new Cancelled());
                account.myState();
                break;
            default:
                System.out.println("Invalid Options");
        }

    }
    public static void Instructions(){
        System.out.println("0): For an account");
        System.out.println("1): checking active account");
        System.out.println("2): checking if your account is due");
        System.out.println("3): if paid account");
        System.out.println("4): cancellation status");
    }
}
