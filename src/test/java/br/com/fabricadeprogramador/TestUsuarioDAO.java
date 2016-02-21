package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;


public class TestUsuarioDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       	testExcluir();
        
 	}
	
public static void testExcluir(){
		
		Usuario usu = new Usuario();
		usu.setId(1);
      
        UsuarioDAO usuDAO = new UsuarioDAO();
        usuDAO.Excluir(usu);
        
        System.out.println("Excluido com sucesso!");

}
	
	public static void testAlterar(){
		
		Usuario usu = new Usuario();
		usu.setId(5);
        usu.setNome("Ester");
        usu.setLogin("Tete");
        usu.setSenha("02092015");
        
        UsuarioDAO usuDAO = new UsuarioDAO();
        usuDAO.alterar(usu);
        
        System.out.println("Alterado com sucesso!");

}
	
	public static void testCadastrar(){
		
				Usuario usu = new Usuario();
		        usu.setNome("Davi");
		        usu.setLogin("Davizinho");
		        usu.setSenha("120308");
		        
		        UsuarioDAO usuDAO = new UsuarioDAO();
		        usuDAO.cadastrar(usu);
		        
		        System.out.println("Usuário Cadastrado!");
		
	}

}
