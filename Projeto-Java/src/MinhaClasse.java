public class MinhaClasse {
    
    public static void main(String[] args) {

        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, fui executado pelo terminal");
        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(idade);
        System.out.println(altura);

        

        final String BR = "brasil";
        // Quando tem o "final", a variável não pode ser alterada
        System.out.println(BR);
        String primeiroNome = "Lucas";
        String segundoNome = "Alamino";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

        

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "resultado do método " + primeiroNome.concat(" ").concat(segundoNome);

       


    }



    





}
