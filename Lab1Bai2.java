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
public class Lab1Bai2 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		float dai=0,rong=0,chuVi=0,dienTich=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chiều dài: ");
		dai=sc.nextFloat();
		System.out.println("Nhập chiều rộng: ");
		rong=sc.nextFloat();
		chuVi=(dai+rong)*2;
		dienTich=dai*rong;
		System.out.println("Chu Vi là: "+chuVi);
		System.out.println("Diện tích là: "+dienTich);
		System.out.println("Cạnh nhỏ nhất là: "+Math.min(dai, rong));
		
		
	}
}
