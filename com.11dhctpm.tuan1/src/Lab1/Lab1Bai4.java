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
public class Lab1Bai4 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c,delta;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập hệ số a: ");
		a=sc.nextDouble();
		System.out.println("Nhập hệ số b: ");
		b=sc.nextDouble();
		System.out.println("Nhập hệ số c: ");
		c=sc.nextDouble();
		delta = Math.pow(b,2)-4*a*c;
		System.out.println("Delta là: "+delta);
		System.out.println("Căn delta là: "+Math.sqrt(delta));
	}
}
