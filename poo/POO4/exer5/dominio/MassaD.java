package exer5.dominio;

/**
 * MassaD
 */
public class MassaD {
    private float MsIncial;
    private float MsFinal;
    private int tempo;
    

    public void calculoMF(){
        float CM = this.getMsIncial();
        tempo = 0;
        while (true) {
            if(CM > 0.5){
                CM = (CM/2);
                this.setTempo(tempo+50);
            } else {
                this.setMsFinal(CM);
                return ;  
            }    
        }
    }




    public MassaD(float massa) {
        this.MsIncial = massa;
    }

    public float getMsIncial() {
        return MsIncial;
    }
    public void setMsIncial(float msIncial) {
        this.MsIncial = msIncial;
    }

    public float getMsFinal() {
        return MsFinal;
    }
    public void setMsFinal(float msFinal) {
        this.MsFinal = msFinal;
    }

    public int getTempo() {
        return tempo;
    }
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    
}
