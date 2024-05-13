public class Operadores {

    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        String concatenação = "?";

        concatenação = 1+1+1+"1";
        // Vai somar os numeros e concatenar com o a string texto "1" 

        System.out.println(concatenação);

        concatenação = 1+"1"+1+1;
        //Nesse caso ele concatenacom o primeiro e ja entende que o resto é string ficando "1111"
        //Deixando de somar.

        System.out.println(concatenação);


        //Abaixo operador de negação transformando o numero negativo


        int numero = 5;

        System.out.println(- numero);


        //Pode ser feito de outra maneira


        int numero2 = 10;

        numero2 = - numero2;

        System.out.println(numero2);

        //Podendo mudar 

        numero2 = numero2 * -1;

        System.out.println(numero2);



        //Agora usando o operador de soma

        numero2++;

        System.out.println(numero2);

        //Outra forma

        System.out.println(++ numero2);



        //Inverte a varieal.

        boolean variavel = true;

        System.out.println(!variavel);


        // Usando if / else, de outras formas
        int a, b;

        a = 5;
        b = 15;

        String resultado = "";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);





        String resultado2 = a != b ? "verdadeiro" : "falso";

        System.out.println(resultado2);

        
        //boolean


        int numero1 = 5;
        int numero3 = 20;

        boolean simNao = numero1 == numero3;

        System.out.println("Numeros iguais ? " + simNao);






        
    }
    
}
