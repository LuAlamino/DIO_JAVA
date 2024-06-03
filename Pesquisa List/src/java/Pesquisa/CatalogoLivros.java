package java.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //Atributo

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }   
public void adicionarLivro(String titulo, String autor, int anoPublicacao){
    livroList.add(new Livro(titulo, titulo, anoPublicacao));
}
    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
            

        }
        return livrosPorAutor;
    }
public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
    List<Livro> livroPorIntervarloAnos = new ArrayList<>();
    if(!livroList.isEmpty()) {
        for(Livro l : livroList) {
            if(l.getAnoPublicacao() == anoInicial && l.getAnoPublicacao() <= anoFinal){
            livroPorIntervarloAnos.add(l);
            }
        }
    }
    return livroPorIntervarloAnos;
}
public Livro pesquisarPorTitulo(String titulo) {
    Livro livroPorTitulo = null;
    if(!livroList.isEmpty()) {
        for(Livro l : livroList) {
            if(l.getTitulo().equalsIgnoreCase(titulo)) {
                livroPorTitulo = l;
                break;
            }
        }
    }
    return livroPorTitulo;
}

public static void main(String[] args) {
    CatalogoLivros catalogoLivros = new CatalogoLivros();
    catalogoLivros.adicionarLivro("Livro 1",  "Autor 1",  2020);
    catalogoLivros.adicionarLivro("Livro 2",  "Autor 2",  2021);
    catalogoLivros.adicionarLivro("Livro 3",  "Autor 2" , 2022);
    catalogoLivros.adicionarLivro( "Livro 1", "Autor 4",  2023);
    catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 1994);
    
    System.out.println(catalogoLivros.pesquisaPorAutor("Autor 5"));
}
}
