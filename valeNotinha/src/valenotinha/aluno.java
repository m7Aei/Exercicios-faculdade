package valenotinha;

import javax.swing.JOptionPane;

public class aluno {
    private double n1;
    private double n2;
    private double exame;
    private double mediaFinal;
    private String nome;

    // metodos get e set 
    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
 
    public double getExame() {
        return exame;
    }

    public void setExame(double exame) {
        this.exame = exame;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // metodo que calcula a media 
    public double calculaMedia() {
        double MF;
        MF = (this.getN1() + this.getN2()) / 2;
            
        this.setMediaFinal(MF);
        
        if(this.getMediaFinal() < 7.0) {
            this.setExame(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do exame:")));
            
            double mediaExame;
            
            mediaExame = (this.getExame() + this.getMediaFinal()) / 2;
            
            this.setMediaFinal(mediaExame);
        }
      
        return this.getMediaFinal();
    }    
}