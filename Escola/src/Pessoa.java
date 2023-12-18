public abstract class Pessoa {
    private String cpf;


    private String nome;

    /*
    public Pessoa(String cpf, String nome) {
        setEFormataCpf(cpf);
        this.nome = nome;
    }*/

    public String getCpf() {
        return cpf;
    }

    public final void formataCpf(String cpf) {
        String cpfNumerico = cpf.replaceAll("[^0-9]", "");
        if (cpfNumerico.length() != 11) {
            throw new IllegalArgumentException("O CPF deve conter 11 dígitos numéricos.");
        }
        cpf = String.format("%s.%s.%s-%s",
                cpfNumerico.substring(0, 3),
                cpfNumerico.substring(3, 6),
                cpfNumerico.substring(6, 9),
                cpfNumerico.substring(9));;
        setCpf(cpf);
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
