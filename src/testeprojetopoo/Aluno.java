package testeprojetopoo;

public class Aluno {
    private String rgm;
    private String nome;
    private float nota_parcial;
    private float nota_reg;
    
    public Aluno(){}

    public Aluno(String r, String n, float np, float nr) {
        this.rgm = r;
        this.nome = n;
        this.nota_parcial = np;
        this.nota_reg = nr;
    }
    
    public void setRgm(String r){
        this.rgm = r;
    }
    
    public String getRgm(){
        return this.rgm;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNotaParcial(float np){
        this.nota_parcial = np;
    }
    
    public float getNotaParcial(){
        return this.nota_parcial;
    }
    
    public void setNotaReg(float nr){
        this.nota_reg = nr;
    }
    
    public float getNotaReg(){
        return this.nota_reg;
    }
    
    public void print(){}
    
}
