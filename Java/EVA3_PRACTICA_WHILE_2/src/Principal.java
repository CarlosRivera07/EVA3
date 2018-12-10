
import java.util.Scanner;

/*
 * PRÁCTICA WHILE #2
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
        
        int iUsuario = 12345;
        int iContraseña = 12345;
        int iEntradaUsuario;
        int iEntradaContraseña;
        
        
        int iwhile = 0;
        boolean bBandera = false;
        
        while(iwhile < 3){
            System.out.println("Usuario: ");
            iEntradaUsuario = input.nextInt();
            if(iEntradaUsuario == iUsuario){
                System.out.println("Contraseña:");
                iEntradaContraseña = input.nextInt();
                if(iEntradaContraseña == iContraseña){
                    System.out.println("¡Bienvenido de nuevo!");
                    bBandera = true;
                    if(bBandera){
                        break;
                    }

                }
                
            }
                
            
            iwhile = iwhile + 1;
        }
        
        if(bBandera){
            
        }else{
                    System.out.println("¡Acceso Denegado!");

        }
    }
    
}
