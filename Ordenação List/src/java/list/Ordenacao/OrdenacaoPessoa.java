package java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoalList;
    
    public OrdenacaoPessoa() {
        this.pessoalList = new ArrayList<>();

    }
    public void adiconarPessoa(String nome, int idade, double altura){
        pessoalList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoalList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoalList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adiconarPessoa("nome 1", 20, 1.56);
        ordenacaoPessoa.adiconarPessoa("nome 3", 20, 2.01);
        ordenacaoPessoa.adiconarPessoa("nome 5", 20, 1.78);
        ordenacaoPessoa.adiconarPessoa("nome 2", 20, 1.66);
        ordenacaoPessoa.adiconarPessoa("nome 4", 20, 1.56);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        //System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}


