/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Printstrea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
       /*PrintStream output=new PrintStream(new File("hello.txt"));
        output.println("hello world");
        output.println();
        */
        Scanner salida=new Scanner(new File("salida"));
        proceso(salida);
    }
    
    public static void proceso(Scanner input){
        double sum=0;
    while(input.hasNext()){
    String name=input.next();
    while(input.hasNextDouble()){
    sum+=input.nextDouble();
    
    
    }
        System.out.println("horas trabajadas por "+name+" son : "+sum);
    sum=0;
    }
    
    }
}
