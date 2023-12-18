public class Atendente extends Funcionario{
    private Integer numeroLinhaOperada;

    public Atendente(String cpf, String nome,Double horasTrabalhadasPorMes, Double valorHora, Integer numeroLinhaOperada) {
        setNome(nome);
        setHorasTrabalhadasPorMes( horasTrabalhadasPorMes);
        setValorHora(valorHora);
        this.numeroLinhaOperada = numeroLinhaOperada;
        calculaSalario();
        formataCpf(cpf);
    }

    public Integer getNumeroLinhaOperada() {
        return numeroLinhaOperada;
    }

    public void setNumeroLinhaOperada(Integer numeroLinhaOperada) {
        this.numeroLinhaOperada = numeroLinhaOperada;
    }


    public void calculaSalario(){
        super.salario= getValorHora()*getHorasTrabalhadasPorMes()*13;
    }

}
