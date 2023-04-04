package controler;
import java.util.Scanner;
import dominio.produto;

public class controlerProd {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
 
        
 
        System.out.print("Digite o codigo: ");
 
        int codigo = leia.nextInt();
 
        System.out.print("Digite a descrição: ");
 
        String descricao = leia.next();
 
        System.out.print("Digite a quantidade: ");
 
        int quantidade = leia.nextInt();        
 
        System.out.print("Digite o valor unitário ");
 
        double valorUnitario = leia.nextDouble();
 
        
 
        produto produto = new produto(codigo,descricao,quantidade,valorUnitario);
 
 
 
        System.out.println(" ");
 
        System.out.println("Codigo: " + produto.getCodigo());

        public static void main(String[] args) {

            Scanner leia = new Scanner(System.in);

            System.out.print("Digite o codigo: ");
     
            int codigo = leia.nextInt();
     
            System.out.print("Digite a descrição: ");
     
            String descricao = leia.next();
     
            System.out.print("Digite a quantidade: ");
     
            int quantidade = leia.nextInt();        
     
            System.out.print("Digite o valor unitário ");
     
            double valorUnitario = leia.nextDouble();
     
            
     
            Produto produto = new Produto(codigo,descricao,quantidade,valorUnitario);
     
     
     
            System.out.println(" ");
     
            System.out.println("Codigo: " + produto.getCodigo());
     
     System.out.println("Descrição: " + produto.getDescricao());
     
     System.out.println("Quantidade: " + produto.getQuantidade());
     
     System.out.println("Valor Unitário " + produto.getValorUnitario());
     
        
     
     System.out.println(" ");
     
     System.out.print("Compra:");
     
     int compra = leia.nextInt();
     
     
     
     System.out.println("Valor a pagar:" + compra * produto.getValorUnitario());
     
     produto.setQuantidade(produto.getQuantidade()-compra);
     
     
     
        }
     
 System.out.println("Descrição: " + produto.getDescricao());
 
 System.out.println("Quantidade: " + produto.getQuantidade());
 
 System.out.println("Valor Unitário " + produto.getValorUnitario());
 
    
 
 System.out.println(" ");
 
 System.out.print("Compra:");
 
 int compra = leia.nextInt();
 
 
 
 System.out.println("Valor a pagar:" + compra * produto.getValorUnitario());
 
 produto.setQuantidade(produto.getQuantidade()-compra);
 
 
 
    }
 
    
}
