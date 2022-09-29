package br.edu.ifgoiano;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifgoiano.entidade.Livro;
import br.edu.ifgoiano.repositorio.LivroRepositorio;

@SpringBootApplication
public class BibliotecaApplication implements CommandLineRunner{

	@Autowired
	private LivroRepositorio livroRepositorio;
	
	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//
		Livro livro1= new Livro();
		livro1.setNome("java para leigos");
		livro1.setAutor("Denecley");
		livro1.setIsbn("123456");
		
		Livro livro2= new Livro();
		livro2.setNome("Diario de um Banana");
		livro2.setAutor("Jeff Kinney");
		livro2.setIsbn("654321");
		
		livroRepositorio.save(livro1);
		livroRepositorio.save(livro2);
	}

}