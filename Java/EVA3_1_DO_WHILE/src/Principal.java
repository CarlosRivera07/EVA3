
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
        //NÚMEROS ENTRE 1 Y 12 Y MOSTRAR EL MES
        //WHILE
        Scanner input = new Scanner(System.in);
        //System.out.println("Introduce el número de mes ");
        //int iMes = 0;
        //while(true){//CONDICION --> REPETIR MIENTRAS NO SEA 1 - 12
        //System.out.println("Introduce el número de mes ");
        //int iMes = input.nextInt();
        //if((iMes >= 1) && (iMes <= 12))
            //break;
        //}
        int iMes;
        do{//hacer
            System.out.println("Introduce el número de mes ");
            iMes = input.nextInt();
        }while(iMes < 1 || iMes > 12); //mientras la condicion se cumpla
        
        switch(iMes){
            case 1:
                System.out.println("Enero");
                break;
                
                case 2:
                System.out.println("Febrero");
                break;
                
                case 3:
                System.out.println("Marzo");
                break;
                
                case 4:
                System.out.println("Abril");
                break;
                
                case 5:
                System.out.println("Mayo");
                break;
                
                case 6:
                System.out.println("Junio");
                break;
                
                case 7:
                System.out.println("Julio");
                break;
                
                case 8:
                System.out.println("Agosto");
                break;
                
                case 9:
                System.out.println("Septiembre");
                break;
                
                case 10:
                System.out.println("Octubre");
                break;
                
                case 11:
                System.out.println("Noviembre");
                break;
                
                case 12:
                System.out.println("Diciembre");
                break;
        }            
    }
    
}
