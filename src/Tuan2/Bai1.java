/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan2;
import javax.swing.JFrame;


/**
 *
 * @author THANG
 */
public class Bai1 extends JFrame {
     public Bai1(){
        super("Demo Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        Bai1 ui=new Bai1();
        ui.setSize(400,300);
        ui.setVisible(true);
        ui.setLocationRelativeTo(null);
    }
}
