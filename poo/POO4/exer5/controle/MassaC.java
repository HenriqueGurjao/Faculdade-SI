package exer5.controle;
import exer5.dominio.MassaD;
import java.util.Scanner;

/**
 * MassaC
 */
public class MassaC {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("me informe a massa:");
        float massa = leia.nextFloat();

        leia.close();

        MassaD info = new MassaD((float)massa);

        System.out.println("Massa inicio: " + info.getMsIncial());
        System.out.println("Massa final: " + info.getMsFinal());
        System.out.println("infoo calculado: "+ info.getTempo());
    }
}