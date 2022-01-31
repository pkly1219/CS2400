package Catcheck;


import java.util.ArrayList;
import java.util.Scanner;


public class ManagerCat {
    ArrayList<CatDetail> catDetails = new ArrayList<>();
    
    Scanner input = new Scanner(System.in);

    
    
    public void list() {
        System.out.println("Enter the number of cats: ");
        int n = Integer.parseInt(input.nextLine());
        
        for (int i = 0; i < n; i++) {
            CatDetail catDetail = new CatDetail();
            catDetail.list();
            
            catDetails.add(catDetail);
        }
    }
    
    public void show() {
        for (CatDetail catDetail : catDetails) {
            catDetail.show();
        }
    }
    
    
    public void searchByName() {
        System.out.println("Enter the name to search : ");
        String name = input.nextLine();
        
        for (CatDetail catDetail : catDetails) {
            if(catDetail.getName().equalsIgnoreCase(name)) {
                catDetail.show();
            }
        }
    }
    
    
}

