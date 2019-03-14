package valenotinha;
import javax.swing.JOptionPane;

public class ValeNotinha {
    public static void main(String[] args) {
        int numeroAlunos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantia de alunos"));
        int contadorAprovados = 0, contadorReprovados = 0;
        
        aluno[] alunos = new aluno[numeroAlunos];
        
        for (int contador = 0; contador < alunos.length; contador++) {
            alunos[contador] = new aluno();
            
            alunos[contador].setNome(JOptionPane.showInputDialog("Informe seu nome: "));
            alunos[contador].setN1(Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota:")));
            alunos[contador].setN2(Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota:")));
            
            // calcula a media do aluno
            alunos[contador].calculaMedia();
            
            JOptionPane.showMessageDialog(null, "Nome do aluno: " + alunos[contador].getNome() + "\n Media: " + 
            alunos[contador].getMediaFinal());
            
            if (alunos[contador].getMediaFinal() >= 5.0) {
                contadorAprovados += 1;
            } else {
                contadorReprovados += 1;
            }
            
            JOptionPane.showMessageDialog(null, "Quantidade de alunos aprovados: " + contadorAprovados
            + "\n Quantidade de alunos reprovados: " + contadorReprovados);
        }
        
        // caso queira mostrar a quantidade de alunos que foram aprovados e reprovados depois de cadastrar todos os alunos
        /*
           JOptionPane.showMessageDialog(null, "Quantidade de alunos aprovados: " + contadorAprovados
            + "\n Quantidade de alunos reprovados: " + contadorReprovados); 
        */
    }
}
