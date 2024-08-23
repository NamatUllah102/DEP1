/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculatefactorial;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class CalculateFactorial {
    CalculateFactorial()
    {
        JFrame jf=new JFrame("CalculateFactorial");
        jf.setSize(400, 400);
        jf.setLayout(null);
        
        JLabel jl=new JLabel("Write a number for finding Factorial ");
        jl.setBounds(10, 15, 500, 40);
        jf.add(jl);
        
        JTextField tf=new JTextField();
        tf.setBounds(10, 60, 100, 40);
        jf.add(tf);
        
        JButton jb=new JButton("Find");
        jb.setBounds(250, 300, 80, 40);
        jf.add(jb);
        
        
          jb.addActionListener(e -> {
               String no=tf.getText();
                 String regex = "^[+-]?\\d*(\\.\\d+)?$";
                  double number = Double.parseDouble(no);          
                 if (no.matches(regex) && number >= 0 && tf!= null)
                 {
                     
                      for(double i=(number-1);i>=1;i--)
               {
                   number=number*i;
//                   
               }
                    JLabel show=new JLabel("Factorial of '"+no+"' = "+Double.toString(number));
                    show.setBounds(10, 130, 300, 40);
                    jf.add(show);
                    
                    
                 }
                 else
                 {
                      JLabel error=new JLabel("Error! Please write appropriate number after clearing the screen.");
                    error.setBounds(10, 200, 500, 40);
                    jf.add(error);
                         
                 }             
          });
       
         
        JButton clear=new JButton("Clear");
        clear.setBounds(40, 300, 80, 40);
        jf.add(clear);
          clear.addActionListener(e -> {
               jf.setVisible(false);
                 new CalculateFactorial();
             
            });
        
         jf.setVisible(true);
       
    }

    public static void main(String[] args) {
    new   CalculateFactorial();
    }
}
