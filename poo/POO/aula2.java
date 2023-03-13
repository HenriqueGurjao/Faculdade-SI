package POO;

import java.util.Scanner;

public class aula2 {
    /*
     * exer 1
     * 1. construir um programa em Java que leia 2 números inteiros e imprima o
     * maior número
     * lido.
     */
    /*
     * public static void main(String[] args) {
     * Scanner leia = new Scanner(System.in);
     * 
     * System.out.println("me informe um numero:");
     * int num1 = leia.nextInt();
     * 
     * System.out.println("me informe um numero:");
     * int num2 = leia.nextInt();
     * 
     * leia.close();
     * 
     * if (num1 > num2) {
     * System.out.println(num1 + " o primero número é o maior é " + num2 +
     * "é o menor");
     * } else {
     * System.out.println(num2 + " o segundo número é o maior é " + num1 +
     * "é o menor");
     * }
     * }
     */

    /*
     * exer 2
     * construir um programa em Java que leia um número inteiro e imprima “PAR”, se
     * o
     * número for par e imprima “ÍMPAR”, se o número for ímpar.
     */
    /*
     * public static void main(String[] args) {
     * Scanner leia = new Scanner(System.in);
     * 
     * System.out.println("me informe um numero:");
     * int num1 = leia.nextInt();
     * 
     * leia.close();
     * 
     * if (num1 % 2 == 0) {
     * System.out.println("O número é par.");
     * } else {
     * System.out.println("O número é ímpar.");
     * }
     * }
     */
    /*
     * exer 3
     * construir um programa em Java que leia um número inteiro e imprima
     * “Positivo”,
     * se o número lido for maior que 0, imprima “Negativo”, se o número lido for
     * menor que 0 e imprima “Nulo”, se o número lido for igual a 0.
     */
    /*
     * public static void main(String[] args) {
     * Scanner leia = new Scanner(System.in);
     * 
     * System.out.println("me informe um numero:");
     * int num1 = leia.nextInt();
     * 
     * leia.close();
     * 
     * switch (Integer.signum(num1)) {
     * case 1:
     * System.out.println(num1 + " é Positivo");
     * break;
     * case -1:
     * System.out.println(num1 +"é Negativo");
     * break;
     * default:
     * System.out.println(num1 + "é Nulo");
     * break;
     * }
     * }
     */
    /*
     * exer 4
     * construir um programa em Java que leia as 2 notas de um aluno e que calcule,
     * armazene
     * e imprima a média. Se a média for maior ou igual a 7, imprimir “Aprovado”,
     * caso contrário,
     * 
     * 
     * realizar a leitura de uma terceira nota, que terá peso 2 e
     * calcular, armazenar e
     * imprimir uma nova média. Se a nova média for maior ou igual a 6, imprimir
     * “Aprovado”,
     * caso contrário, imprimir “Reprovado”.
     */

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("me informe a nota AV1: ");
        float nota1 = leia.nextFloat();
        System.out.println("me informe a nota AV2: ");
        float nota2 = leia.nextFloat();

        float media = (float) ((nota1 + nota2) / 2);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado, sua media foi " + media);
            System.out.println("me informe a nota AV3: ");
            float nota3 = leia.nextFloat();

            Float novaMedia = ((nota3 * 2) / 2);

            if (novaMedia >= 6) {
                System.out.println("Aprovado com " + novaMedia);
            } else {
                System.out.println("Reprovado com " + novaMedia);
            }
        }
        leia.close();
    }
}
