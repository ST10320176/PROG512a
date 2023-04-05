/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lect10bills;
import javax.swing.*;

/**
 *
 * @author colin
 */
public class Lect10Bills {

    public static void main(String[] args) {
        String strName = JOptionPane.showInputDialog(null, "Enter the customer's name");
        double dblMinutesTalked = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the minutes talked))"));
         double dblCostPerMinute = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the cost per minute))"));
         
         //sends variables to constructor in the bills class
         bill b = new bill(strName, dblMinutesTalked, dblCostPerMinute);
         
         JOptionPane.showMessageDialog(null, "Customer Name: " + 
                 b.getName().toUpperCase() + "\n" +
         "Total Due: R" + b.getTotalBills());
        
        System.out.println("Hello World!");
    }
}
