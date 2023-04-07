package exer4.dominio;
import java.lang.Math;

public class paralelpipedoD {
    private float ladoA;
    private float ladoB;
    private float ladoC;

    public float CalcuD(){
        float l = (float)Math.sqrt(this.getLadoA() * this.getLadoA() + this.getLadoB() * this.getLadoB());

        float D =  (float)Math.sqrt(l*l + this.getLadoC() * this.getLadoC());
        
        return D;
    }

    public paralelpipedoD(float ladoA, float ladoB, float ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public float getLadoA() {
        return ladoA;
    }
    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
    }
    public float getLadoB() {
        return ladoB;
    }
    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
    }
    public float getLadoC() {
        return ladoC;
    }
    public void setLadoC(float ladoC) {
        this.ladoC = ladoC;
    }
}
