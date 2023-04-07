package exer4.contrele;
import java.util.Scanner;
import exer4.dominio.paralelpipedoD;

public class paralelepipedoC {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("me informe o valor de A:");
        float ladoA = leia.nextFloat();

        System.out.println("me informe o valor de B:");
        float ladoB = leia.nextFloat();

        System.out.println("me informe o valor de C:");
        float ladoC = leia.nextFloat();

        leia.close();

        paralelpipedoD resp = new paralelpipedoD(ladoA, ladoB, ladoC);

        System.out.println("a diagonal do paralelepípedo é: " + resp.CalcuD());
        
        
    
    }
}
