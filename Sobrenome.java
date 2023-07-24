
import java.util.Scanner;

public class Sobrenome {
    public static void main(String[] args) {
        /*
         * A região sul do Brasil é caracterizada pela ascendência multicultural de seus
         * habitantes, sendo principalmente europeus e sobretudo italianos, alemães e
         * poloneses. Uma consequência interessante disso é a variação na dificuldade na
         * pronúncia dos sobrenomes da população, o que as vezes dificulta a vida dos
         * professores na realização da chamada de sua turma, gerando até situações
         * constrangedoras. Dada a possibilidade de constrangimento em suas aulas, a
         * professora Jiraiya decidiu pesquisar os sobrenomes em sua lista de chamadas.
         * Na concepção de Jiraiya, um sobrenome é difícil se tiver três ou mais
         * consoantes consecutivas.
         * 
         * Entrada
         * A entrada contém vários casos de teste. A primeira linha possui um inteiro N
         * que indica o número de casos de teste. Cada caso de teste consiste em um
         * sobrenome. A string contém letras do alfabeto sem acentos, a primeira letra
         * está sempre em maiúscula e o sobrenome pode ter no máximo 42 caracteres.
         * 
         * Saída
         * Para cada caso de entrada, imprima o sobrenome e se é fácil ou não, conforme
         * mostra o exemplo abaixo.
         * 
         * Exemplo de Entrada Exemplo de Saída
         * 6
         * Ferrari
         * Bianchi
         * Hoffmann
         * Hofmann
         * Lewandowski
         * Nowak
         * 
         * Ferrari eh facil
         * Bianchi nao eh facil
         * Hoffmann nao eh facil
         * Hofmann eh facil
         * Lewandowski nao eh facil
         * Nowak eh facil
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] sobrenomes = new String[n];
        for (int i = 0; i < n; i++) {
            sobrenomes[i] = sc.next();
        }
        
        for (int i = 0; i < n; i++) {
            int cont = 0;
            for (int j = 0; j < sobrenomes[i].length(); j++) {
                if (sobrenomes[i].charAt(j) != 'A' && sobrenomes[i].charAt(j) != 'E' && sobrenomes[i].charAt(j) != 'I' && sobrenomes[i].charAt(j) != 'O' && sobrenomes[i].charAt(j) != 'U') {
                    cont++;
                } else {
                    cont = 0;
                }
                if (cont >= 3) {
                    break;
                }
            }
            if (cont >= 3) {
                System.out.println(sobrenomes[i] + " nao eh facil");
            } else {
                System.out.println(sobrenomes[i] + " eh facil");
            }
        }
    }
}
