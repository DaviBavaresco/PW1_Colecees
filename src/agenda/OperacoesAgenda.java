package agenda;

import java.util.Collection;
import java.util.List;

public interface OperacoesAgenda<Object> {

     boolean cadastrar(Object obj);

     List<Object> listarTodos();


    int totalizar();



    boolean pesquisar(Object obj);



     boolean remover(Object obj);






}
