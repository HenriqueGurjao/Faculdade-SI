package exer3.dominio;

public class AmostraDominio {
    private int codigoAmostra;
    private int conteudoCarbono;
    private int durezaRokwell;
    private int resistenciaTracao;


    public int informaGrau(){
        int tst1=0, tst2 =0 , tst3 =0;

        if(this.getConteudoCarbono() <= 7){
            tst1++;
        } 
        
        if(this.getDurezaRokwell() > 50){
            tst2++;
        }
        if(this.getResistenciaTracao() > 80000){
            tst3++;
        }
        
        if(tst1 == 1 && tst2 == 1 && tst3 == 1){
            return 10; 
        } 
        if(tst1 == 1 && tst2 == 1 && tst3 == 0){
            return 9;
        }
        if(tst1 == 1 && tst2 == 0 && tst3 == 0){
            return 8;
        } 
        if(tst1 == 1 && tst2 == 0 && tst3 == 1 || tst1 == 0 && tst2 == 1 && tst3 == 1 || tst1 == 0 && tst2 == 1 && tst3 == 0 || tst1 == 0 && tst2 == 0 && tst3 == 1 || tst1 == 0 && tst2 == 0 && tst3 == 0){
            return 7;
        }
        System.out.println("ERRO!! na analise");
        return 0;
    
    }
    
    public AmostraDominio(int cA, int cC, int dRll, int rT) {
        this.codigoAmostra = cA;
        this.conteudoCarbono = cC;
        this.durezaRokwell = dRll;
        this.resistenciaTracao = rT;
    }

    public int getCodigoAmostra() {
        return codigoAmostra;
    }
    public void setCodigoAmostra(int codigoAmostra) {
        this.codigoAmostra = codigoAmostra;
    }
    public int getConteudoCarbono() {
        return conteudoCarbono;
    }
    public void setConteudoCarbono(int conteudoCarbono) {
        this.conteudoCarbono = conteudoCarbono;
    }
    public int getDurezaRokwell() {
        return durezaRokwell;
    }
    public void setDurezaRokwell(int durezaRokwell) {
        this.durezaRokwell = durezaRokwell;
    }
    public int getResistenciaTracao() {
        return resistenciaTracao;
    }
    public void setResistenciaTracao(int resistenciaTracao) {
        this.resistenciaTracao = resistenciaTracao;
    }
}
