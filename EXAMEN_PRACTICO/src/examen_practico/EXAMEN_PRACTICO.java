/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_practico;

import java.util.Scanner;

/**
 *
 * @author jealt
 */
public class EXAMEN_PRACTICO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int piedra;
        int papel;
        int tijeras;
         piedra = 1;
         papel = 2;
         tijeras = 3;
        
         
        Scanner captura = new Scanner(System.in);
        
        int datos[] = new int[3];
        
           
           double tpp;
           tpp = Math.random() * 100;
           System.out.println("Elige si quieres jugar con piedra(1), papel(2), tijeras(3)");
           captura.nextLine();
        
        if (tpp < 3)
            System.out.println("Gana piedra");
        else
            if (tpp > 1)
                System.out.println("Gana papel");
        else
            if (tpp > 2)
                System.out.println("Gana tijeras");
        else
            if (tpp == 1)
                    System.out.println("Empate");
        else
            if (tpp == 2)
                System.out.println("Empate");
        else
            if (tpp == 3)
                System.out.println("Empate");
        
               
    }
    
}
