public class Operacaosplit {
    public static void main(String[] args) {

        // O método split() divide uma String em várias substrings com base em um delimitador especificado.
        // Ele retorna um array de Strings.
        // Abaixo está um exemplo em que uma String contendo palavras separadas por vírgulas e espaços
        // será dividida em partes.

        // String original com palavras separadas por ", "
        String texto = "palavra1, palavra2, palavra3";

        // Aplicamos o método split() usando ", " como delimitador
        // Isso vai dividir a string em três partes: "palavra1", "palavra2" e "palavra3"
        String[] partes = texto.split(", ");

        // Agora vamos iterar sobre o array de Strings resultante e imprimir cada parte
        for (String parte : partes) {
            System.out.println(parte);
        }

        // Saída esperada:
        // palavra1
        // palavra2
        // palavra3

        // Observações:
        // 1. O delimitador usado no método split() é uma expressão regular (regex).
        //    No caso acima, usamos ", " para dividir a String em cada vírgula seguida de um espaço.
        // 2. Se o delimitador não for encontrado, o array retornado terá apenas a String original.
        // 3. O método split() pode receber um segundo argumento opcional, que limita o número de divisões.
        //    Por exemplo, texto.split(", ", 2) dividiria a string apenas uma vez e retornaria um array
        //    com duas partes: ["palavra1", "palavra2, palavra3"]
    }
}
