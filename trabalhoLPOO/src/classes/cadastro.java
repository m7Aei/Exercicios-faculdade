package classes;

import javax.swing.JOptionPane;

public class cadastro implements interfaceCadastro {
    private String genero;
    private String nome;
    private String telefone;
    private String email;
    private String faixaGraduacao;
    private String cidade;
    private String academia;
    private int idade;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaixaGraduacao() {
        return faixaGraduacao;
    }

    public void setFaixaGraduacao(String faixaGraduacao) {
        this.faixaGraduacao = faixaGraduacao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public void validarCampos() {
        if (this.getNome().equals("") || this.getAcademia().equals("") || this.getCidade().equals("") || this.getFaixaGraduacao().equals("")
        || this.getGenero().equals("") || this.getIdade() == 0 || this.getTelefone().equals("")) {
            JOptionPane.showMessageDialog(null, "Existe campos obrigatorios vazios, favor preenher!");
        } else if (this.getIdade() < 18) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar, você é menor de idade!");
        } else {
            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!");
        }
    }
}
