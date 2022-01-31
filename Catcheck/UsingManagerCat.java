package Catcheck;

import java.util.Scanner;


public class UsingManagerCat {
    static ManagerCat managerCat = new ManagerCat();
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choose;
        
        do {
            showMenu();
            choose = scan.nextInt();
            
            switch(choose) {
            
                case 1:
                    managerCat.list();
                    break;
                case 2:
                    managerCat.show();
                    break;
              
                case 3:
                    managerCat.searchByName();
                    break;
              
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Input failed!");
                    break;
            }
        } while(choose != 4);
    }
    
    static void showMenu() {
     
        System.out.println("\n1. Enter the information of cats");
        System.out.println("2. Show the information of cats");
        System.out.println("3. Search for the name of the cat");
        System.out.println("4. Exit");       
        System.out.print("Choice: ");
    }
}
