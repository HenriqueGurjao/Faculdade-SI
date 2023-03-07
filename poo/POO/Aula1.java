package POO;

import java.util.Scanner;

public class Aula1 {
/*exer 1 
 * construir um programa em Java que leia
um número inteiro e calcule e escreva o seu dobro.

*/


   public static void main(String[] args) {

       Scanner leia = new Scanner(System.in);

       System.out.print("Digite um numero: ");

       int num1 = leia.nextInt();

        System.out.print("o dobro desse numero é");
        System.out.print(num1*2);

        leia.close();
    }
    
/*exer 2
 * construir um programa em Java que leia
2 números inteiros e calcule, armazene e imprima a
média aritmética e a metade da diferença entre eles.
 */

/* 
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        

        System.out.print("Digite um numero: ");
        int num1 = leia.nextInt();

        System.out.print("Digite um numero 2: ");
        int num2 = leia.nextInt();

        int resul = ((num1+num2)/2);

        System.out.println("o resultado do numero 1 é");
        System.out.println((resul - num1));

        System.out.println("o resultado do numero 2 é");
        System.out.println((resul - num2));

    }
*/
/*exer 3 
 construir um programa em Java que leia
as 3 notas de um aluno e calcule, armazene e imprima
a média final.
*/

/* 
public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
    

    System.out.println("Digite um numero 1: ");
    int num1 = leia.nextInt();

    System.out.println("Digite um numero 2: ");
    int num2 = leia.nextInt();

    System.out.println("Digite um numero 3:")
    int num3 = leia.nextInt();

    int resul = ((num1+num2+num3)/3);

    System.out.println("a media é");
    System.out.println((resul));


}
*/
/* exer 4 
 *construir um programa em Java que leia
o salário bruto de um funcionário e calcule, armazene
e imprima o salário bruto, um desconto de 8% e o
salário líquido.
*/

/* 
public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
    

    System.out.println("Digite o seu salario: ");
    float num3 = leia.nextFloat();
    
    float desc = (float)(num3 * 0.8)/100;

    float resul = (num3-desc);

    System.out.println("o salario bruto é:");
    System.out.println((num3));

    System.out.println("o salario liquido é:");
    System.out.println(resul);


}

}
*/
/*exer 5 
 construir um programa em Java que leia
os valores de A, B e C e calcule, armazene e imprima
o valor do delta. D = B2
- 4*A*C.

*/
/*
public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
    

    System.out.println("Digite o valor de A: ");
    float num1 = leia.nextFloat();
    System.out.println("Digite o valor de B: ");
    float num2 = leia.nextFloat();
    System.out.println("Digite o valor de c: ");
    float num3 = leia.nextFloat();
    
    float bask = ((num2*num2)-(4*num1*num3));

    System.out.println("o valor de bascara é: ");
    System.out.println(bask);




}
*/
/*exer 6 
 construir um programa em Java que leia
uma distância em quilômetros e calcule, armazene e
imprima essa distância em metros.
*/
/* 
public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
    

    System.out.println("Digite o tanto quilômetros: ");
    float num1 = leia.nextFloat();
   
    
    float metros = (num1*1000);

    System.out.println("conversão km pra m: ");
    System.out.println(metros);

}
*/

/*exer 7 
 * construir um programa em Java que leia
a quilometragem inicial e final de um veículo em uma
viagem e ao final informe a quilometragem percorrida.
*/
/*
public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
    

    System.out.println("Digite a quilômetragem iniciada: ");
    float num1 = leia.nextFloat();
   
    System.out.println("Digite a quilômetragem finalizada: ");
    float num2 = leia.nextFloat();
    
    float dist = (num1-num2);

    System.out.println("Quilômetragem percorrida foi de: ");
    System.out.println(dist);

    float metros = (dist*1000);

    System.out.println("conversão km pra m: ");
    System.out.println(metros);

}
*/

/*exer 8
 * construir um programa em Java que leia
a quantidade de alunos do sexo masculino, do sexo
feminino e a quantidade de alunos aprovados de uma
turma e calcule, armazene e imprima o total de alunos
e a porcentagem de alunos do sexo masculino, do sexo
feminino e a porcentagem de alunos aprovados.
*/

/* 
public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
    

    System.out.println("Digite a quantidade de alunos do sexo masculino: ");
    int qtdM = leia.nextInt();
    
    System.out.println("Digite a quantidade de alunos do sexo feminino: ");
    int qtdF = leia.nextInt();
    
    System.out.println("Digite a quantidade de alunos aprovados: ");
    int qtdA = leia.nextInt();
    
    int totalA = qtdM + qtdF;
    float percM = (float) (qtdM / totalA) * 100;
    float percF = (float) (qtdF / totalA) * 100;
    float percA = (float) (qtdA / totalA) * 100;
    
    System.out.println("Total de alunos: " + totalA);
    System.out.println("Porcentagem de alunos do sexo masculino: " + percM + "%");
    System.out.println("Porcentagem de alunos do sexo feminino: " + percF + "%");
    System.out.println("Porcentagem de alunos aprovados: " + percA + "%");
 
}
*/

/*exer 9 
 * construir um programa em Java que leia
a quantidade de mini-games, calculadoras e canetas
vendidas por um camelô ao fim de um dia e calcule,
armazene e imprima o faturamento de cada produto e
o faturamento total. Mini-games: R$ 6.95,
calculadoras: R$ 3.50 e canetas: R$ 1.20.
*/
/* 
public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
    
    System.out.print("Digite a quantidade de mini-games vendidos: ");
      int qtdMiniGames = leia.nextInt();
      
      System.out.print("Digite a quantidade de calculadoras vendidas: ");
      int qtdCalculadoras = leia.nextInt();
      
      System.out.print("Digite a quantidade de canetas vendidas: ");
      int qtdCanetas = leia.nextInt();
      
      float precoMiniGames = 6.95f;
      float precoCalculadoras = 3.50f;
      float precoCanetas = 1.20f;
      
      float faturamentoMiniGames = qtdMiniGames * precoMiniGames;
      float faturamentoCalculadoras = qtdCalculadoras * precoCalculadoras;
      float faturamentoCanetas = qtdCanetas * precoCanetas;
      float faturamentoTotal = faturamentoMiniGames + faturamentoCalculadoras + faturamentoCanetas;
      
      System.out.println("Faturamento de mini-games: R$ " + faturamentoMiniGames);
      System.out.println("Faturamento de calculadoras: R$ " + faturamentoCalculadoras);
      System.out.println("Faturamento de canetas: R$ " + faturamentoCanetas);
      System.out.println("Faturamento total: R$ " + faturamentoTotal);
   }

   */


/*exer 10 
 * construir um programa em Java que
leia a quantidade de vitórias, derrotas e empates de um
time ao final de um campeonato e que calcule,
armazene e imprima a quantidade total de jogos, a
quantidade de pontos disputados, de pontos ganhos e
pontos perdidos. Vitória: 3 pontos, empate: 1 ponto e
derrota: 0 ponto.
*/
/* 
public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    
    System.out.print("Digite a quantidade de vitórias: ");
    int vitorias = leia.nextInt();
    
    System.out.print("Digite a quantidade de derrotas: ");
    int derrotas = leia.nextInt();
    
    System.out.print("Digite a quantidade de empates: ");
    int empates = leia.nextInt();
    
    int totalJogos = vitorias + derrotas + empates;
    int pontosDisputados = totalJogos * 3;
    int pontosGanhos = vitorias * 3 + empates;
    int pontosPerdidos = pontosDisputados - pontosGanhos;
    
    System.out.println("Quantidade total de jogos: " + totalJogos);
    System.out.println("Quantidade de pontos disputados: " + pontosDisputados);
    System.out.println("Quantidade de pontos ganhos: " + pontosGanhos);
    System.out.println("Quantidade de pontos perdidos: " + pontosPerdidos);
 }
*/
  
}
