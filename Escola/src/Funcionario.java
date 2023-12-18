public abstract class Funcionario extends Pessoa {
    protected Double salario=0.0;
    private Double horasTrabalhadasPorMes;
    private Double valorHora;
/*
    public Funcionario(String cpf, String nome,  Double horasTrabalhadasPorMes, Double valorHora) {
        super(cpf, nome);
        this.horasTrabalhadasPorMes = horasTrabalhadasPorMes;
        this.valorHora = valorHora;
        calculaSalario();
        formataCpf(cpf);
    }*/

    public Double getSalario() {
        return salario;
    }

    public abstract void calculaSalario() ;

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getHorasTrabalhadasPorMes() {
        return horasTrabalhadasPorMes;
    }

    public void setHorasTrabalhadasPorMes(Double horasTrabalhadasPorMes) {
        this.horasTrabalhadasPorMes = horasTrabalhadasPorMes;
    }


}
