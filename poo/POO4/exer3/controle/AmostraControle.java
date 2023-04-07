package exer3.controle;
import exer3.dominio.AmostraDominio;
import java.util.Scanner;

public class AmostraControle {
   public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Me informe o Codigo da amostra: ");
        int CodA = leia.nextInt();

        System.out.println("me informe conteúdo de carbono : ");
        int contC  = leia.nextInt();

        System.out.println("me informe a dureza Rokwell: ");
        int dRll = leia.nextInt();

        System.out.println("me informe a resistência de à tração: ");
        int rT = leia.nextInt();

        leia.close();
        
        AmostraDominio resp = new AmostraDominio(CodA, contC, dRll, rT);
        int r = resp.informaGrau();

        System.out.println("A pontuação dessa amostra é: " + r);

   }
}
