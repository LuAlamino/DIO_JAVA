public class MinhaClasse {
    
    public static void main(String[] args) {

        double altura = 1.72;

        final String BR = "brasil";
        // Quando tem o "final", a variável não pode ser alterada

        String primeiroNome = "Lucas";
        String segundoNome = "Alamino";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
