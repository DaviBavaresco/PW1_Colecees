package pessoas;

import contatos.Contato;

public class Pessoa implements Comparable<Pessoa>{
    private Contato contato;
    private String nome;
    private String cpf;

    public Pessoa(Contato contato, String nome, String cpf) {
        this.contato = contato;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "[ Nome= " + nome +
                " CPF= " + cpf +
                "  " +contato+
                " ] ";
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.nome.compareTo(outraPessoa.getNome());
    }
}
