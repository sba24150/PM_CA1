/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author paolo
 */
public class JavaApplication24 {

    /** https://github.com/sba24150/PM_CA1
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    /*Paolo Mazzocco Student No. sba 24150 */
    
    int count = 0;
    String name = "";
    double purchase = 0;
    int code = 0;
    int year = 0;
    double total = 0;
    
        /* This is the path where the file is stored, it is in the same folder of the program*/
        String filePath = "customers.txt";
    
        try {
            BufferedWriter writer = new BufferedWriter (new FileWriter("output.txt"));
            BufferedReader br = new BufferedReader (new FileReader (filePath));
            String line;
            
            /* Created loop to read all the values of the document*/
            while ((line = br.readLine()) !=null ){
                int r = count % 4 ;
                /* Used the operator Module to have a looping counter from 0 to 3 */
                /* value 0 is names, value 1 is purchase*/
                /* value 2 is class that I renamed as code avoiding confusion*/
                /* and value 3 is years*/
                if (r == 0)
                    name = line;
                
                else if (r == 1)
                    purchase = Double.parseDouble(line);
                    /* parse.Double allow me to get a double value from a string*/
                
                else if (r == 2)
                    code = Integer.parseInt(line);
                    /* parse.Int allow me to get a integer value from a string*/
                else if (r == 3){
                    year = Integer.parseInt(line);
                    /* parse.Int allow me to get a integer value from a string*/
                    
                /*below this point I will set the logic behind the calculation */
                /*of the final value */
                
                /*every possible combination for class 1 */
                if ((year == 2024) && (code == 1))
                    total = purchase - (purchase * 30 / 100);
                
                else if ((year < 2024) && (year > 2019) && (code == 1))
                    total = purchase - (purchase * 20 / 100);
                
                else if ((year < 2019) && (code == 1))
                    total = purchase -(purchase *10 /100);
                
                /*every possible combination for class 2 */
                else if ((year == 2024) && (code == 2))
                    total = purchase - (purchase * 15 / 100);
                
                else if ((year < 2024) && (year > 2019) && (code == 2))
                    total = purchase - (purchase * 13 / 100);
                
                else if ((year < 2019) && (code == 2))
                    total = purchase -(purchase * 5 /100);
                
                /*every possible combination for class 3 */
                else if ((year == 2024) && (code == 3))
                    total = purchase - (purchase * 3 / 100);
                else if ((year < 2024) && (code == 3))
                    total = purchase ;
                /* I callled the final value "total" so it is less confusing*/
                
                /*next line is if the class is not 1 or 2 or 3 */
                else {                    
                    total = purchase;
                    System.out.println("Class value not conform for one of the customers");
                    
                /* the below instruction will write the name followed by the total*/
                /* I called the final value Total so it is less confusing*/
                }
                writer.write(name + "\n");
                writer.write(total + "\n");
                }
                count ++ ;
                
                
                    
        
        
            }
            writer.close();
            
        }        
        catch (IOException e ){
        e. printStackTrace();
        
    
            }
    
   
    }
}