package models.dao;

import Connections.ConnectionFactory;
import classes.cadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class cadastroDAO {
    public void create(cadastro lutadores) {
        Connection connect = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = connect.prepareStatement("INSERT INTO lutadores (nome, telefone, email, categoria, cidade, academia, idade, genero)" 
            + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
            
            stmt.setString(1, lutadores.getNome());
            stmt.setString(2, lutadores.getTelefone());
            stmt.setString(3, lutadores.getEmail());
            stmt.setString(4, lutadores.getFaixaGraduacao());
            stmt.setString(5, lutadores.getCidade());
            stmt.setString(6, lutadores.getAcademia());
            stmt.setInt(7, lutadores.getIdade());
            stmt.setString(8, lutadores.getGenero());
            
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrat");
        } finally {
            ConnectionFactory.closeConnection(connect, stmt);
        }
    }
}
