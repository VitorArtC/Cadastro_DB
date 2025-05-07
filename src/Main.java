import DAO.pessoaDAO;
import DTO.pessoaDTO;

import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Nome");
        String cpf = JOptionPane.showInputDialog("CPF");
        String senha = JOptionPane.showInputDialog("Senha");

        pessoaDTO objpessoaDto = new pessoaDTO();
        objpessoaDto.setNome_pessoa(nome);
        objpessoaDto.setCpf_pessoa(cpf);
        objpessoaDto.setSenha_pessoa(senha);

        pessoaDAO objpessoaDao = new pessoaDAO();
        objpessoaDao.cadastrarPessoa(objpessoaDto);



    }
}