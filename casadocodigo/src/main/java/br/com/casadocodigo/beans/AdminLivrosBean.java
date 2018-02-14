package br.com.casadocodigo.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.casadocodigo.models.Livro;
/*
 * 
	  	Marco, não estará impedido de nada. Qual o motivo? Pegando carona na resposta do Romário, 
	  	o @Named permite expor qualquer objeto através de expression language (EL) na view, inclusive um EJB. 
	  	O antigo @ManagedBean não permitia nenhum bean de outro container (JSF é um container, EJB é outro container) 
	  	ser exposto na view. Isso era chato, porque se você quisesse export um EJB por sei lá qual motivo, 
	  	você teria que fazer um lookup em um bean com @ManagedBean para então expor o EJB via Expression language. 
	  	Veja que foi necessário uma "passarela" para que o EJB chegasse até a view.
	
		E o que é um container? É isso mesmo que o nome diz. Quem dá new em um bean anotado com @ManagedBean? 
		O JSF! Quem dá new em um bean anotado com @Named? CDI! Como eles dão new para nós, o bean vive em um container. 
		É ai que coisas maravilhosas acontecem.
	
		Um bean que vive no container CDI ganha poderes que um bean dentro de um container JSF não possui 
		como interceptadores, observadores, producers, etc. É por isso que o @ManagedBean estará deprecated, 
		porque ele dá muito pouco poder aos beans criados pelo container JSF. Todo o restante do JSF que vc conhece 
		continua o mesmo, só muda em qual container o bean ficará.

 * 
 * 
 * */

@Named
@RequestScoped
public class AdminLivrosBean {
	
	private Livro livro = new Livro();
	
	public void salvar(){
		System.out.println("salvando livro");
	}
	
	/* ======== GETTERS AND SETTERS ======== */
	public Livro getLivro() {
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
