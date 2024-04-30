package testeprojetopoo;

import java.util.ArrayList;
import java.util.List;

public class ArrayAluno implements Interface {
    private List<Aluno> aluno;

    @Override
    public boolean inserir(Aluno p) {
        return aluno.add(p);
    }

    @Override
    public Aluno seleciona(String rgm) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Aluno> selecionaTodos() {
        return aluno;
    }

}
