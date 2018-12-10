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
        System.out.println(new Main());
        int x;
        Main miObjeto = new Main();
        System.out.println(miObjeto);
        UnaClase ucObjeto2 = new UnaClase();
        System.out.println(ucObjeto2);
        //
        int iValor = 5;
        incremento(iValor);
        System.out.println("El valor es: " + iValor);
        //
        Valor vObjetoValor = new Valor();
        vObjetoValor.iValor = 5;
        incremento(vObjetoValor);
        System.out.println("El valor 2 es: " + vObjetoValor.iValor);
    }
    public static void incremento(int iVal){
        iVal++;
    }
    public static void incremento(Valor vValor){
        vValor.iValor++;
    }
}
class UnaClase{}

class Valor{
    int iValor;
}