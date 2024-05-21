package lanchonete;

import lanchonete.AreaCliente.Cliente;
import lanchonete.Atendimento.Atendente;
import lanchonete.Atendimento.Cozinha.Almoxarife;
import lanchonete.Atendimento.Cozinha.Cozinheiro;

public class estabelecimento {
    
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que não precisam estarem disponiveis para toda a aplicação
        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.preparVitamina();
        cozinheiro.selecionarIngredientesLanche();

        //ações que o estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        //ações que não precisam estarem disponiveis para toda a aplicação
        almoxarife.controlarEntrada();
        
        //ações que somente o seu pacote cozinha  precisa conhecer (default)
        

        Atendente atendente = new Atendente();
        
        atendente.receberPagamento();
        atendente.servindoMesa();
        //ação que somente o seu pacote cozinha precisa conhecer (default)
        

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        //cliente.pegarPedidoBalcao();
        //cliente.consultarSaldoAplicativo();

        cozinheiro.pedirParaTrocarGas(atendente);
        cozinheiro.pedirParaTrocarGas(almoxarife);
    }
}
