
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        //PRÁCTICA 1
        System.out.println("*****PRÁCTICA 1*****");
        System.out.println("Ingresa el número del mes: ");
        int iNumMes = input.nextInt();
        input.nextLine();
        String sMes = Mes(iNumMes);
        System.out.println("El nombre del mes " + iNumMes + " es " + sMes);
        System.out.println(" ");
        
        //PRÁCTICA 2
        System.out.println("*****PRÁCTICA 2*****");
        System.out.println("Ingresa tu calificación en letra: ");
        String Letra = input.nextLine();
        int iNum = Califa(Letra);
        System.out.println("Tu calificación es: " + iNum);
        System.out.println(" ");
        
        //PRÁCTICA 3
        System.out.println("*****PRÁCTICA 3*****");
        System.out.println("Ingresa tu calificación en número: ");
        int iNumCalifa = input.nextInt();
        String sNumCalifa = NumCalifa(iNumCalifa);
        System.out.println("Tu calificación es: " + sNumCalifa);
        System.out.println(" ");
        
        //PRÁCTICA 4
        System.out.println("*****PRÁCTICA 4*****");
        int iEdad = Practica4("Cuál es tu edad?", 1);
        System.out.println("Tu edad es: " + iEdad);
        
        String sNombre = Practica4(1, "Cuál es tu nombre? ");
        System.out.println("Tu nombre es: " + sNombre);
        
        double dCalifa = Practica4("Cuál es tu promedio? (promedio en base 10)", 1.2);
        System.out.println("Tu promedio es: " + dCalifa);
        
        boolean bDesicion = Practica4("Actual mente sigues etudiando? (Respunde usando true o false)", true);
        System.out.println("Tu respuesta fue: " + bDesicion);
        System.out.println(" ");
        
        //PRÁCTICA 5
        System.out.println("*****PRÁCTICA 5*****");
        boolean Verdad = Practica5("Ingresa un número aleatorio para determinar si es primo o no: ");
        System.out.println("El número que ingresaste es primo? " + Verdad);
                            
        //PRÁCTICA 6
        System.out.println("*****PRÁCTICA 5*****");
        System.out.println("Ingresa un año para ver si es bisiesto o no: ");
        int iAño = input.nextInt();
        Boolean bSiNo = Practica6(iAño);
        System.out.println("El año " + iAño + " es bisiesto? " + bSiNo);
        

    }
    
    //PRÁCTICA 1
    public static String Mes(int iMes){
        
        String sNombre = "";
        switch(iMes){
            case 1:
                sNombre = "Enero";
                break;
            case 2:
                sNombre = "Febrero";
                break;
            case 3:
                sNombre = "Marzo";
                break;    
            case 4:
                sNombre = "Abril";
                break;
            case 5:
                sNombre = "Mayo";
                break;
            case 6:
                sNombre = "Junio";
                break;
            case 7:
                sNombre = "Julio";
                break;
            case 8:
                sNombre = "Agosto";
                break;
            case 9:
                sNombre = "Septiembre";
                break;
            case 10:
                sNombre = "Octubre";
                break;
            case 11:
                sNombre = "Noviembre";
                break;
            case 12:
                sNombre = "Diciembre";
                break;
            default:
                sNombre = "Número fuera de rango!";
        }
        return sNombre;
    }
    
    //PRÁCTICA 2
    
    public static int Califa(String sLetra){
        
        int iNum = 0;
        switch(sLetra){
            case "A":
                iNum = 100;
                break;
            case "B":
                iNum = 90;
                break;
            case "C":
                iNum = 80;
                break;
            case "D":
                iNum = 70;
                break;
            case "F":
                iNum = 0;
                break;
            default:
                System.out.println("Número fuera de rango!");
        }
        return iNum;
    }
    
    //PRÁCTICA 3
    public static String NumCalifa(int iCalifa){
        
        String sCalifa = "";
        
        switch(iCalifa){
            case 100:
                sCalifa = "A";
                break;
            case 90:
                sCalifa = "B";
                break;
            case 80:
                sCalifa = "C";
                break;
            case 70:
                sCalifa = "D";
                break;
            case 60:
                sCalifa = "F";
                break;
            case 50:
                sCalifa = "F";
                break;
            case 40:
                sCalifa = "F";
                break;
            case 30:
                sCalifa = "F";
                break;
            case 20:
                sCalifa = "F";
                break;
            case 10:
                sCalifa = "F";
                break;
            case 0:
                sCalifa = "F";
                break;
            default:
                System.out.println("Número fuera de rango!");
        }
        return sCalifa;
    }
    //PRÁCTICA 4
    public static int Practica4 (String sMensaje, int Edad){
        Scanner input = new Scanner(System.in);
        System.out.println(sMensaje);
        int iResu = input.nextInt();
        input.nextLine();
        return iResu;
    }
        
    public static String Practica4 (int iNum, String sMensaje){
        Scanner input = new Scanner(System.in);
        System.out.println(sMensaje);
        String sResu = input.nextLine();
        return sResu;
    
    }
    
    public static double Practica4 (String sMensaje, double dNumero){
        Scanner input = new Scanner(System.in);
        System.out.println(sMensaje);
        double dCalifa = input.nextDouble();
        return dCalifa;

    }
    
    public static boolean Practica4 (String sMensaje, boolean bVerdad){
        Scanner input = new Scanner(System.in);
        System.out.println(sMensaje);
        boolean bResu = input.nextBoolean();
        return bResu;
    }
    
    //PRÁCTICA 5
    public static boolean Practica5 (String Mensaje){
        Scanner input = new Scanner(System.in);
        System.out.println(Mensaje);
        int iNum = input.nextInt();
        int iMod = iNum % 2;
        boolean bVerdad = true;
        if(iMod == 0){
             bVerdad = false;
        }else{
            bVerdad = true;
        }
        return bVerdad;
    }
    
    //PRÁCTICA 6
    public static boolean Practica6(int iAño){
    
        
        int iMod = iAño % 4;
        int iMod2 = iAño % 100;
        int iMod3 = iAño % 400;
        boolean bSi = true;
        
        if(iMod == 0 && (!(iMod2 == 0)) || iMod3 == 0){
            bSi = true;
        }else{
            bSi = false;
        }
        return bSi;
}
}
