package Loops.Exercises9;
import java.util.Scanner;
public class LoopExercises9 {
    public static void main(String[] args) {       
            String userName, passWord;
            try (Scanner input = new Scanner(System.in)) {
                int right = 3;
                int totalPrice = 1500;
                int select;
                while (right > 0) {
                    System.out.print("Username :");
                    userName = input.nextLine();
                    System.out.print("Password : ");
                    passWord = input.nextLine();
   
                    if (userName.equals("patika") && passWord.equals("dev123")) {
                        System.out.println("Welcome the Bank of Kodluyoruz");
                        do {
                            System.out.println("1-Deposit Money\n" +
                                    "2-Withdraw Money\n" +
                                    "3-Check Total Balance\n" +
                                    "4-Exit");
                            System.out.print("Please select transaction : ");
                            select = input.nextInt();
                            switch (select) {
                                case 1:
                                System.out.print("Amount of Money: ");
                                int price = input.nextInt();
                                totalPrice += price;
                                    break;
                                    case 2:
                                    System.out.print("Amount of Money : ");
                                    int price2 = input.nextInt();
                                    if (price2 > totalPrice) {
                                        System.out.println("İnsufficient balance");
                                    } else {
                                        totalPrice -= price2;
                                    }
                            case 3:
                            System.out.println("Your balance : " + totalPrice);
                                default:
                                
                                    break;
                            }
                        } while (select != 4);
                        System.out.println("See you again");
                        break;
                    } else {
                        right--;
                        System.out.println("Wrong username or password. Try again.");
                        if (right == 0) {
                            System.out.println("Your account has been blocked, please contact the bank.");
                        } else {
                            System.out.println("Your remaining right : " + right);
                        }
                    }
                }
            }
        }
    }