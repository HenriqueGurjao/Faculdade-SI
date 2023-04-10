package exer6.controler;
import java.util.Scanner;

import exer6.dominio.produto2Dominio;

import java.lang.Math;

public class produto2controler  {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Me informe o px1: ");
        float px1 = leia.nextInt();

        System.out.println("me informe o px2 : ");
        float px2  = leia.nextInt();

        System.out.println("me informe o py3: ");
        float py3 = leia.nextInt();

        System.out.println("me informe o px4: ");
        float py4 = leia.nextInt();

        leia.close();

        produto2Dominio p = new produto2Dominio(px1 ,px2, py3,py4);
        System.out.println(p.calculaDistancia());
    }
    
}
