public class Professor extends Funcionario{

    public Professor(String cpf, String nome,Double horasTrabalhadasPorMes, Double valorHora, String materia, String diaDaSemana) {
        setNome(nome);
        setHorasTrabalhadasPorMes( horasTrabalhadasPorMes);
        setValorHora(valorHora);
        this.materia = materia;
        this.diaDaSemana = diaDaSemana;
        formataCpf(cpf);
        calculaSalario();
    }

    private String materia;
    private String diaDaSemana;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }
    public void calculaSalario(){
        super.salario= getValorHora()*getHorasTrabalhadasPorMes()*13;
    }

    public String toString() {
        return "Professor: " + getNome() + ", Matéria: " + getMateria() + ", Dia da semana: " + getDiaDaSemana();
    }

}
