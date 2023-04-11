
package classes;

public class Main {

    public static void main(String[] args) {
        CadastroAluno cadastro = new CadastroAluno();

    
    Aluno a1 = new Aluno(111, "Pedro", 9.5, "SPI");
    Aluno a2 = new Aluno(222, "Jesus", 7.7, "Filosofia");
    Aluno a3 = new Aluno(333, "Lucas", 7.0, "Ed.Física");
    Aluno a4 = new Aluno(444, "Igor", 6.3, "Medicina");
    Aluno a5 = new Aluno(555, "Cláudia", 9.0, "Psicologia");
    
    cadastro.AdicionarAluno(a1);
    cadastro.AdicionarAluno(a2);
    cadastro.AdicionarAluno(a3);
    cadastro.AdicionarAluno(a4);
    cadastro.AdicionarAluno(a5);
    
    cadastro.ordemMatricula();
    cadastro.imprimirLista();
    }
    
}
