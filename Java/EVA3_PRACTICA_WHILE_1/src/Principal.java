
import java.util.Scanner;

/*
 * Juego del 21
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
        
        
        int iUsuario;
        int iComputadora;
        int iSuma;
        int iSumaComputadora;
        int iFin;
        
        iSuma = 0;
        iSumaComputadora = 0;
        iFin = 0;
        
        
        iUsuario = (int)(Math.random() * 14) + 1;
        iComputadora = (int)(Math.random() * 14) + 1;
        iSuma = iSuma + iUsuario;
        iSumaComputadora = iSumaComputadora + iComputadora;
        System.out.println("Tu carta es: " + iSuma);
        
        
        while(iUsuario <= 21 && iComputadora <= 21){
            System.out.println("Deseas otra carta? ");
            boolean bPregunta = input.nextBoolean();
            
            if(bPregunta == true){
            int iNuevaCarta = (int)(Math.random() * 14) + 1;
                System.out.println("Tu nueva carta es: " + iNuevaCarta);
            iSuma = iSuma + iNuevaCarta;
            System.out.println("La suma de tus cartas es:" + iSuma);
                
            }
            
                
               if(bPregunta == true){
                int iNuevaCartaCompu = (int)(Math.random() * 14) + 1;
            iSumaComputadora = iSumaComputadora + iNuevaCartaCompu;
                   
                }
            if(iSuma >= 21){
                System.out.println("Eres el Ganador");
                break;
            }else{
                if(iSumaComputadora >= 21){
                    System.out.println("La computadora gana!");
                    break;
            
                    
            }
        
                    
                }
        
        }
        
    }
    
}
