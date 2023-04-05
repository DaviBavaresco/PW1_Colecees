import agenda.Agenda;
import contatos.Telefone;
import pessoas.Pessoa;

public class Main {
    public static void main(String[] args) {
       Telefone t1= new Telefone(55,99999);

       Pessoa p1 = new Pessoa(t1,"Davi","1234");
       Agenda a = new Agenda();
       a.cadastrar(p1);


        System.out.println(a.pesquisar(p1));
        a.remover(p1);
        System.out.println(a.listarTodos());
    }
}