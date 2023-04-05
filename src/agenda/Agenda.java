package agenda;

import pessoas.Pessoa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Agenda implements OperacoesAgenda<Pessoa> {
    private List<Pessoa> pessoas = new ArrayList<>();

    public Agenda() {
    this.pessoas=new ArrayList<>();
    }

    @Override
    public boolean cadastrar(Pessoa pessoa) {
        return pessoas.add(pessoa);
    }

    @Override
    public List<Pessoa> listarTodos() {
        List<Pessoa> listarTodos = new ArrayList<>();
        for (Pessoa objeto : pessoas) {
            if (objeto instanceof Pessoa) {
                listarTodos.add(objeto);
            }
            
        }
        return listarTodos;
    }

    @Override
    public int totalizar() {
        return pessoas.size();
    }

    @Override
    public boolean pesquisar(Pessoa pessoa) {
        for (Pessoa pe : pessoas) {
            if (pe.getNome().equals(pessoa.getNome())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remover(Pessoa pessoa) {
        return pessoas.remove(pessoa);
    }

    @Override
    public String toString() {
        return " :" + pessoas;
    }

    public void ordenaPorNome(){
        Collections.sort(pessoas);
    }

}
