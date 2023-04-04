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
