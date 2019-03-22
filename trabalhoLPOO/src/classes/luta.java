package classes;

import javax.swing.JOptionPane;

public class luta extends cadastro implements interfaceLuta{
    
    @Override
    public void lutar() {
        if (this.getFaixaGraduacao().equals(this.getFaixaGraduacao()) && this.getGenero().equals(this.getGenero())) {
            JOptionPane.showMessageDialog(null, "A luta ira acontecer");
            
            
        }
    }
}
