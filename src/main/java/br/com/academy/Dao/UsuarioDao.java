package br.com.academy.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.academy.model.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {
	
	@Query("select u from Usuario u where u.email = :email")
	public Usuario findByEmail(String email);
	
	@Query("select l from Usuario l where l.user = :user and l.senha = :senha")
	public Usuario buscarLogin(String user, String senha);
	
}
