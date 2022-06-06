package br.com.jogadores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jogadores.model.Jogadores;


@Repository
public interface JogadoresRepository extends JpaRepository<Jogadores, Long>{
	
}
