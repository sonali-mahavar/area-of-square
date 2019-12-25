
package java1;

import java.util.Scanner;
public class Java1 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the size of square");
        double side=sc.nextDouble();
        double area=side*side;
        System.out.print("Area of square is:"+area);
    }
    
}
