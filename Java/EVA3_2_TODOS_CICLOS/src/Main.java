/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CARLOS ROGELIO RIVERA LUJAN 18550725
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("FOR");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " - ");
        }
        System.out.println(" ");
        System.out.println("FOR");
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + " - ");
        }
        int iNum = 1;
        System.out.println(" ");
        System.out.println("WHILE");
        while(iNum >= 1 && iNum <= 100){
            System.out.print(iNum + " - ");
            iNum++;
        }
        System.out.println(" ");
        System.out.println("WHILE");
        while(iNum <= 100 && iNum >= 1){
            System.out.print(iNum + " - ");
            iNum--;
        }
        int iNum2 = 1;
        System.out.println(" ");
        System.out.println("DO WHILE");
        iNum2 = 0;
        do{
             iNum2++;      
            System.out.print(iNum2 + " - ");

        }while(iNum2 < 100);{
        
    }
        System.out.println("DO WHILE");
        iNum2 = 0;
        do{
             iNum2--;      
            System.out.print(iNum2 + " - ");

        }while(iNum2 > 1);{
    }
    
}
}