import agenda.Agenda;
import contatos.Telefone;
import pessoas.Pessoa;

import javax.swing.*;

public class MenuAgenda {
    public static void main(String[] args) {
    Agenda ag= new Agenda();

    while(true){
        switch (montaMenu()){
            case 1:
        Telefone t1 = new Telefone(Integer.parseInt(JOptionPane.showInputDialog("Qual o DDD: ")),Long.parseLong(JOptionPane.showInputDialog("Qual o numero: ")));
        Pessoa p1 = new Pessoa(t1,JOptionPane.showInputDialog("Qual o nome: "),JOptionPane.showInputDialog("Qual o CPF: "));
        ag.cadastrar(p1);
        break;

            case 2:

                if(ag.totalizar()!=0){
                    ag.ordenaPorNome();
                JOptionPane.showMessageDialog(null,ag.listarTodos());
                    break;
                }

                    JOptionPane.showMessageDialog(null,"Agenda vazia");
                break;


            case 3:
                if(ag.totalizar()!=0){
                JOptionPane.showMessageDialog(null,ag.totalizar());
                break;
                }
                else JOptionPane.showMessageDialog(null,"Nenhum contato");
                break;


            case 4:

                Pessoa p = new Pessoa(JOptionPane.showInputDialog("Qual o nome: "));
                if(ag.pesquisar(p)!=false){
                    JOptionPane.showMessageDialog(null,"Pessoa ja cadastrada: ");
                    break;
                }
                else
                    JOptionPane.showMessageDialog(null,"Pessoa não cadastrada");
                break;


            case 5: System.exit(0);
            break;

        }


    }

    }
public static int montaMenu(){
    String menu= "1-Cadastrar Pessoa\n"+
            "2-Listar todos da agenda\n"+
            "3-Total de pessoas da agenda\n"+
            "4-Pesquisar pessoa na agenda\n"+
            "5-Sair\n";
    return Integer.parseInt(JOptionPane.showInputDialog(menu));
}
}
