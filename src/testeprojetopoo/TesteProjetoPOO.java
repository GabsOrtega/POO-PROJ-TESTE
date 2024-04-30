package testeprojetopoo;

import java.util.List;
import javax.swing.JOptionPane;

public class TesteProjetoPOO {

    public static void main(String[] args) {
        while (true){
            
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar aluno"
                    + "\n2 - Pesquisar aluno"
                    + "\n3 - Listar todos os alunos"
                    + "\n4 - Dados do projeto"
                    + "\n5 - Sair"));
            
            ArrayAluno lista = new ArrayAluno();
            
            switch (opcao){
                case 1:
                   String rgm = JOptionPane.showInputDialog("Digite o RGM do aluno: ");
                   String nome = JOptionPane.showInputDialog("Digite o Nome do aluno: ");
                   float nota_parcial = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota parcial do aluno: "));
                   float nota_reg = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota regimental do aluno: "));
                   
                   Aluno aluno = new Aluno(rgm, nome, nota_parcial, nota_reg);
                   
                   lista.inserir(aluno);
                   break;
                   
                case 2:
                    String rgmPesquisa = JOptionPane.showInputDialog("Digite o RGM do aluno que deseja pesquisar: ");
                    
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Alunos: \n" + lista.selecionaTodos());
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opção digitada não existe!");
            }
        }
    }
    
}
