package br.com.jogadores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;


import br.com.jogadores.model.Jogadores;
import br.com.jogadores.service.JogadoresService;

@Controller
public class JogadoresController {
	@Autowired
	private JogadoresService jogadoresService;
	
	@GetMapping("/jogadores/formulario")
	public String cadastrar(){
		return "formulario";
	}
	@GetMapping("/jogadores/salvar")
	public String salvar(Jogadores jogadores) {
		jogadoresService.cadastrarJogadores(jogadores);
		return "sucesso";
	}
	
	@GetMapping("/jogadores/listar")
	public ModelAndView listarJogadores() {
		List <Jogadores> jogadores = jogadoresService.listarJogadores();
		ModelAndView mv = new ModelAndView("listagem-jogadores");
		
		mv.addObject("listaJogadores", jogadores);
	
		return mv;
	}
	
	@GetMapping("/jogadores/excluir/{id}")
	public ModelAndView excluirJogadorPorId(@PathVariable Long id) {
		jogadoresService.excluirJogadorPorId(id);
		ModelAndView mv = new ModelAndView("redirect:/jogadores/listar");
		return mv;
	}
	
	
}
