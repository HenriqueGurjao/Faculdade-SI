package exer2.controle;
import java.util.Scanner;
import exer2.dominio.FormaDominio;
public class FormaControle {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("me informe o valor de X:");
        float ladoX = leia.nextFloat();

        System.out.println("me informe o valor de Y:");
        float ladoY = leia.nextFloat();

        System.out.println("me informe o valor de Z:");
        float ladoZ = leia.nextFloat();

        leia.close();

        FormaDominio resp = new FormaDominio(ladoX, ladoY, ladoZ);
        
        System.out.println(resp.VarificarForma());
        
    }


}
  