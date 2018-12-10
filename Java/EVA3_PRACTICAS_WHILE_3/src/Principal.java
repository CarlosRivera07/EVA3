
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CARLOS ROGELIO RIVERA LUJAN 18550725
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("ingresa un número entero: ");
        int iNum;
        iNum = input.nextInt();
        
        int iwhile = 1;
        
        while(iwhile < iNum){
            if(iNum % iwhile == 0){
                System.out.println("Es Par");
            }else{
                System.out.println("Es primo");
                
            }
            break;
        }
        
        
    }
    
}
