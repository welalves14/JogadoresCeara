package br.com.jogadores.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jogadores {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
	
	
		
		private String nome;
		private String extimes;
		private double altura;
		private double salario;
		
		
		public long getId() {
			return id;
			}
			public void setId(long id) {
				this.id = id;
			}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getExtimes() {
			return extimes;
		}
		public void setExtimes(String extimes) {
			this.extimes = extimes;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(long altura) {
			this.altura = altura;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(long salario) {
			this.salario = salario;
		}
		

}
