/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab2Bai1 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập hệ số a: ");
		a=sc.nextDouble();
		System.out.println("Nhập hệ số b: ");
		b=sc.nextDouble();
		
		if(a==0) {
			if(b==0) {
				System.out.println("Phương trình vô số nghiệm.");
			}
			else {
				System.out.println("Phương trình vô nghiệm.");
			}
		}
		else {
			x=(-b)/a;
			System.out.println("Phương trình có nghiệm là: " +x );
		}

	}
}
