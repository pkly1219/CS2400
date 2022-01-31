
package Catcheck;

import java.util.ArrayList;
import java.util.Scanner;


public class CatDetail implements ICat {

    String name;
    String color;
    String place;
    int colorIndex;

    

    public CatDetail() {
        
        }

    

    public CatDetail(String name, String color, String place) {
        this.name = name;
        this.color = color;
        this.place = place;
    }

    @Override
    public void list() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the cat : ");
            name = input.nextLine();

        System.out.println("Enter the color of the cat : ");         
            color = input.nextLine();      
          
        System.out.println("Enter the place : ");
            place = input.nextLine();
    }

    @Override
    public void show() {
        System.out.println("");
        System.out.printf("Name : %s, color : %s, place : %s", name, color, place);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getColorIndex() {
        return colorIndex;
    }

    public void setColorIndex(int colorIndex) {
        this.colorIndex = colorIndex;
    }
}
