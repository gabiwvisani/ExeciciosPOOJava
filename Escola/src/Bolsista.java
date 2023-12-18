public final class Bolsista extends Aluno {

    public Bolsista(String cpf, String nome,Integer numeroMatricula, String serieEscolar, Professor[] professoresDoAluno) {
        super(cpf, nome, numeroMatricula, serieEscolar,professoresDoAluno);
        setMensalidadeDeAcordoComSerie();
        //setEFormataCpf(cpf);
    }
    @Override
    public void setMensalidadeDeAcordoComSerie() {
        super.mensalidade=0.0;
    }

}
