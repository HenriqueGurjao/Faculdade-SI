package exer2.dominio;

public class FormaDominio {
    private float ladoX;
    private float ladoY;
    private float ladoZ;

    
    public FormaDominio(float ladoX, float ladoY, float ladoZ) {
        this.ladoX = ladoX;
        this.ladoY = ladoY;
        this.ladoZ = ladoZ;
    }

    public float VarificarForma(){
        if(this.getLadoX() < this.getLadoY() + this.getLadoZ() || this.getLadoY() < this.getLadoX() + this.getLadoZ() || this.getLadoZ() < this.getLadoY() + this.getLadoX()){
            System.out.println("Sim ele tem um formato de triangulo");
            if(this.getLadoX() == this.getLadoY() && this.getLadoX() == this.ladoZ){
                System.out.println("Triangulo Equilatero");
            } else if (this.getLadoX() == this.getLadoY() && this.getLadoX() != this.getLadoZ() || this.getLadoZ() == this.getLadoX() && this.getLadoX() != this.getLadoY() || this.getLadoZ() == this.getLadoY() && this.getLadoY() != this.getLadoX()) {
                System.out.println("Triangulo Isosceles");
            } else if( this.getLadoX() != this.getLadoY() && this.getLadoX() != this.getLadoZ() && this.getLadoY() != this.getLadoZ()){
                System.out.println("Triangulo escaleno");
            }
        } else {
            System.out.println("Isso não é um triangulo");

        }
        return 0;
    }
    
    public float getLadoX() {
        return ladoX;
    }
    public void setLadoX(float ladoX) {
        this.ladoX = ladoX;
    }
    public float getLadoY() {
        return ladoY;
    }
    public void setLadoY(float ladoY) {
        this.ladoY = ladoY;
    }
    public float getLadoZ() {
        return ladoZ;
    }
    public void setLadoZ(float ladoZ) {
        this.ladoZ = ladoZ;
    }

    
    
}
