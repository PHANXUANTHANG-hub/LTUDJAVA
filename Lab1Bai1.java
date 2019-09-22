/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab1Bai1 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.print("Họ và tên: ");
		String hoTen = sc.nextLine(); 
		System.out.print("Điểm TB: ");
		double diemTB = sc.nextDouble();
		System.out.printf("%s %f điểm", hoTen, diemTB);
	}
}



