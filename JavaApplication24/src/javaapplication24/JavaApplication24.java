/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author paolo
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    System.out.println("Paolo Mazzocco Student No. sba 24150");
    
    int count = 0;
    String name = "";
    double purchase = 0;
    int code = 0;
    int year = 0;
    
    
    
        /* This is the path where the file is stored, it is in the same folder of the program*/
        String filePath = "customers.txt";
    
        try {
            BufferedReader br = new BufferedReader (new FileReader (filePath));
            String line;
            
            /* Created loop to read all the values of the document*/
            while ((line = br.readLine()) !=null ){
                int r = count % 4 ;
                
                if (r == 0)
                    name = line;
                
                else if (r == 1)
                    purchase = Double.parseDouble(line);
                
                else if (r == 2)
                    code = Integer.parseInt(line);
                
                else if (r == 3)
                    year = Integer.parseInt(line);
                
                
            
                
                
                
                
                
                
                
                
                count ++ ;
                System.out.println(line);
                
            }
        
        
        }
    
    
    catch (IOException e ){
        e. printStackTrace();
        
    
        }
    
    }

}