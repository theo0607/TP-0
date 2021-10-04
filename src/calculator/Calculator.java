// BLANCUZZI Théo Exercice 1 29/08/2021
package calculator;

import java.util.Scanner;

/**
 *
 * @author theob
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator:\n" +
"        1) add\n" +
"        2) substract\n" +
"        3) multiply\n" +
"        4) divide\n" +
"        5) modulo");
        Scanner sc = new Scanner(System.in);
        int operateur = sc.nextInt();
        System.out.println(" Entrer le premier nombre :");
        
        if(1<= operateur && operateur<=5){
            System.out.println("vous pouvez continuer");}
        
        else {  
            System.out.println("erreur");
        System.exit(0);}
        
        int operand1 = sc.nextInt();
        System.out.println();
        System.out.println("le nombre entré est "+operand1);
        int result = 0;
        System.out.println(" Entrer le second nombre :");
        int operand2 = sc.nextInt();
        System.out.println();
        System.out.println("le nombre entré est "+operand2);
        
    if (operateur==1) {
            result = operand1+operand2;
    }
    
    if (operateur==2) {
            result = operand1-operand2;
    }
    
    if (operateur==3) {
            result = operand1*operand2;
    }
    
    if (operateur==4) {
            result = operand1/operand2;
    }
    
    if (operateur==5) {
            result = operand1%operand2;
    }
    
    if (operateur>5) {
            System.out.println("erreur");                 
            }
    
    if (operateur<1) {
            System.out.println("erreur");                 
            }
    
    System.out.println();
    System.out.println("le nombre entré est "+result);
  
    }
         
}
