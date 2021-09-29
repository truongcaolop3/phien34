/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phien34;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Phien34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        x = sc.nextInt();

        int sothu1 = x % 10;
        int soconlai = x / 10;
        int sothu2 = soconlai % 10;
        soconlai = soconlai / 10;
        int sothu3 = soconlai % 10;
        soconlai = soconlai / 10;
        int sothu4 = soconlai % 10;
        int sum = sothu3 + sothu2 + sothu1 + sothu4;
        System.out.println("The sum of all digits in " + x + " is " + sum);
    }
    
}