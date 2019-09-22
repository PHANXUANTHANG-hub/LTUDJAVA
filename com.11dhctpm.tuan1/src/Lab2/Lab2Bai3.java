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
public class Lab2Bai3 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tien,soDien;
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập số điện: ");
		soDien= sc.nextDouble();
		if(soDien<50) {
			tien=soDien*1000;

		}
		else {
			tien = 50*1000 + (soDien - 50)*1200;
		}
		System.out.println("Tiền điện là: "+tien);
	}
}
