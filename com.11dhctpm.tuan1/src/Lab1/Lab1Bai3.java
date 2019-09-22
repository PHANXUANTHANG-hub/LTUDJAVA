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
public class Lab1Bai3 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		float canh=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chiều dài cạnh của khối lập phương: ");
		canh=sc.nextFloat();
		System.out.println("Thể tích của khối lập phương : "+Math.pow(canh,3));	
	}
}
