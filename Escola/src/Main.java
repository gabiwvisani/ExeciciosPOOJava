import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Teste Atendente:");
        Atendente claudia = new Atendente("45349476896", "Claudia",200.0,  10.0, 951233331);
        System.out.println("Nome: " + claudia.getNome());
        System.out.println("CPF formatado: " + claudia.getCpf());
        System.out.println("Salário: " + claudia.getSalario());
        System.out.println("Número da linha de telefone que atende: 011 "+ claudia.getNumeroLinhaOperada());

        System.out.println("\nTeste Professores:");
        Professor igor = new Professor("400.039.826-19","Igor",12.5,100.0,"POO","Segunda-Feira");
        System.out.println("Nome: " + igor.getNome());
        System.out.println("CPF formatado: " + igor.getCpf());
        System.out.println("Salário: " + igor.getSalario());
        System.out.println("Matéria: "+ igor.getMateria());
        System.out.println("Dia da semana da aula: "+igor.getDiaDaSemana());

        Professor marcelo = new Professor("660.069.826-19","Marcelo",22.5,120.0,"Lógica de Programação","Terça-Feira");
        System.out.println("\nNome: " + marcelo.getNome());
        System.out.println("CPF formatado: " + marcelo.getCpf());
        System.out.println("Salário: " + marcelo.getSalario());
        System.out.println("Matéria: "+ marcelo.getMateria());
        System.out.println("Dia da semana da aula: "+marcelo.getDiaDaSemana());

        System.out.println("\nTeste Aluno não bolsista:");

        Professor[] professoresDeGabriela = new Professor[7];
        professoresDeGabriela[0]=igor;
        professoresDeGabriela[1]=marcelo;

        Aluno gabriela =new Aluno("35369476896","Gabriela",123464,"Ensino médio", professoresDeGabriela);
        System.out.println("Nome: " + gabriela.getNome());
        System.out.println("CPF formatado: " + gabriela.getCpf());
        System.out.println("Série escolar: " + gabriela.getSerieEscolar());
        System.out.println("Mensalidade: " + gabriela.getMensalidade());
        System.out.println("Os proferrsores de "+ gabriela.getNome()+" são:");
        for(int i=0;i<gabriela.getProfessoresDoAluno().length;i++){
            if(gabriela.getProfessoresDoAluno()[i]!=null){
            System.out.println(gabriela.getProfessoresDoAluno()[i]);
            }
        }
        System.out.println("\nTeste Aluno bolsista:");

        Professor[] professoresDeMaria = new Professor[7];
        professoresDeMaria[0]=igor;

        Bolsista maria =new Bolsista("555.69476896","Maria",123465,"Ensino médio", professoresDeMaria);
        System.out.println("Nome: " + maria.getNome());
        System.out.println("CPF formatado: " + maria.getCpf());
        System.out.println("Série escolar: " + maria.getSerieEscolar());
        System.out.println("Mensalidade: " + maria.getMensalidade());
        System.out.println("Os proferrsores de "+ maria.getNome()+" são:");
        for(int i=0;i<maria.getProfessoresDoAluno().length;i++){
            if(maria.getProfessoresDoAluno()[i]!=null){
                System.out.println(maria.getProfessoresDoAluno()[i]);
            }
        }
    }
}
