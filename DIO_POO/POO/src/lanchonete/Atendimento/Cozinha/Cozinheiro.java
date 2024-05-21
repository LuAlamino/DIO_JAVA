package lanchonete.Atendimento.Cozinha;

import lanchonete.Atendimento.Atendente;

public class Cozinheiro {
    public static void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALCÃO");

        
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }

    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    public void prepararLanche() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");

    }
    public void preparVitamina() {
        System.out.println("PREPARANDO SUCO");


    }
    public void prepararCombo() {
        System.out.println("PREPARANDO COMBO");
        prepararLanche();
        preparVitamina();   
    }

    public void selecionarIngredientesLanche() {
        System.out.println("SELECIONADO O PÃO,SALADA,OVO E CARNE");

    }
    public void selecionarIngredientesVitamina() {
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
    }
    public void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
    }
    public void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA");
    }
    public void fritarIngredientesLanche() {
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGUER");
    }
    
    
    //public void pedirParaTrocarGas(Atendente meuAmigo) {
    //    meuAmigo.trocarGas();
    //}
    public void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }
    public void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
