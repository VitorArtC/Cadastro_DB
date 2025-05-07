package DAO;

import DTO.pessoaDTO;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class pessoaDAO {

    Connection conexao;
    PreparedStatement pstm;

    public void cadastrarPessoa(pessoaDTO objpessoaDTO){
        String sql = "insert into user(nome, cpf, senha) values(?,?,?)";

        conexao = new conexaoDAO().conectaBD();

        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, objpessoaDTO.getNome_pessoa());
            pstm.setString(2, objpessoaDTO.getCpf_pessoa());
            pstm.setString(3, objpessoaDTO.getSenha_pessoa());

            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "pessoaDAO" + erro);
        }
    }
}
