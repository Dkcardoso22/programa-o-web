package controllers;

import java.util.List;

import models.Postagem;
import play.mvc.Controller;

public class Postagens extends Controller {

	public static void listar() {
		List <Postagem> lista = Postagem.findAll();
	   render(lista);
	}
	
	public static void salvar(Postagem p) {
		p.save();
		listar();
	}
    
	public static void form() {
		render();
	}
	
	public static void remover(long id) {
		Postagem postagem = Postagem.findById(id);
		postagem.delete();
		listar();
		
	}
	
	
	
	
	
}
