public class Aluno extends Pessoa {
    private Integer numeroMatricula;
    protected Double mensalidade;
    private String serieEscolar;
    private Professor[] professoresDoAluno;

    public Aluno(String cpf, String nome,Integer numeroMatricula, String serieEscolar, Professor[] professoresDoAluno) {
        setNome(nome);
        this.numeroMatricula = numeroMatricula;
        this.serieEscolar = serieEscolar.toLowerCase();
        this.professoresDoAluno = professoresDoAluno;
        setMensalidadeDeAcordoComSerie();
        formataCpf(cpf);
    }
    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Double getMensalidade() {
        return mensalidade;
    }
/*
    public void setMensalidade(Double mensalidade) {
        this.mensalidade = mensalidade;
    }*/

    public String getSerieEscolar() {
        return serieEscolar;
    }

    public void setSerieEscolar(String serieEscolar) {
        this.serieEscolar = serieEscolar.toLowerCase();
        setMensalidadeDeAcordoComSerie();
    }

    public Professor[] getProfessoresDoAluno() {
        return professoresDoAluno;
    }

    public void setProfessoresDoAluno(Professor[] professoresDoAluno) {
        this.professoresDoAluno = professoresDoAluno;
    }

    public void setMensalidadeDeAcordoComSerie() {
        if ("ensino médio".equals(this.serieEscolar)) {
            this.mensalidade=1000.0;
        } else if ("ensino fundamental".equals(this.serieEscolar)) {
            this.mensalidade=800.0;
        } else {
            this.mensalidade =0.0;
        }
    }

}
