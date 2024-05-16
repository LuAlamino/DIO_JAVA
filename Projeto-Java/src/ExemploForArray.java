import java.util.concurrent.ThreadLocalRandom;
public class ExemploForArray {

    public static void main(String[] args) {
       String alunos [] = { "Lucas", "Douglas", "Monique", "Leticia" };

       for ( int x=0; x<alunos.length; x++) {

            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
       }


       for(String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);

       }

       for(int numero = 1; numero <=5; numero ++) {
        if (numero == 2)
            continue;
        if (numero == 4)
            break;

            System.out.println(numero);
        // So ira mostrar 1 e 3 por conta que o 4 da o break e nao mostra e como coloquei o numero
        // == 2 ele continua porem sem condições de imprimilo
       }

      
       

    }

    
        
    }

    

