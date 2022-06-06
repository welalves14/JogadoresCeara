package br.com.jogadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jogadores.model.Jogadores;
import br.com.jogadores.repository.JogadoresRepository;

@Service
public class JogadoresService {
	
	@Autowired
	private JogadoresRepository jogadoresRepo;
	
	public void cadastrarJogadores(Jogadores jogadores) {
		jogadoresRepo.save(jogadores);
	}
	
	public List<Jogadores> listarJogadores(){
		return jogadoresRepo.findAll();
	}
	
	public void excluirJogadorPorId(Long id) {
		jogadoresRepo.deleteById(id);
	}
}
