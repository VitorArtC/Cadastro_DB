package DAO;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoDAO {

    public Connection conectaBD(){
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/cadastro?user=root&password=";
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "conexaoDAO" + erro.getMessage());
        }
        return conn;
    }
}
