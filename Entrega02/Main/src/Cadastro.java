public class Cadastro {
    
    private String nome;
    private String matricula;
    private String setor;
    private String cargo;
    private String supervisor; 

    void historico_retirada (){

    }

    public void setNome(String nome) {
        this.nome = nome;
      }
    
      public String getNome() {
        return nome;
      }
    
      public void setMatricula (String matricula2){
        this.matricula = matricula2;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setSetor (String setor){
        this.setor = setor;
    }
    public String getSetor() {
        return setor;
    }

    public void setCargo (String cargo){
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }

    public void setSupervisor (String supervisor){
        this.supervisor = supervisor;
    }
    public String getSupervisor() {
        return supervisor;
    }
}
