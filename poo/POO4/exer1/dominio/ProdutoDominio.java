/*Faça um programa que leia 
    o código, 
    a quantidade, 
    o preço unitário, 
    forma de pagamento (1 - Dinheiro, 2 - Cheque, 3 - Cartão débito, 4 - Cartão crédito) 
de um produto. Pagamentos em dinheiro recebem um desconto de 10%, em cartão 5% e em cheque 2%. O programa deve
informar o valor do desconto e o valor final a pagar. */

package dominio;

public class ProdutoDominio {
    private int codigo;
    private int quantidade;
    private Double valor;
    private int Fpagamento;
    private Double Stotal;

    public ProdutoDominio(int codigo, int quantidade, Double valor,int Fpagamento){
       
        this.codigo = codigo;   

        this.quantidade = quantidade;

        this.valor = valor;

        this.Fpagamento = Fpagamento;

        this.Stotal = valor * quantidade ;

    }

    public Double getDescont(){ 
        if(Fpagamento > 4){
            System.out.print("forma de pagamento errado");
            return -1.0;
        }
        if(Fpagamento == 1){
            return this.Stotal*0.1;

        } else if(Fpagamento == 2){
            return this.Stotal*0.05;

        } else {
            return this.Stotal*0.02;

        }
    }   
    public int getCodigo() {

        return codigo;
 
    }

    public Double getPagamento(){
        return this.Stotal - this.getDescont();
    }

}
