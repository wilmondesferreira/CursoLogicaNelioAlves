public class FuncoesString1 {
    public static void main(String[] args) {

        /*
        Algumas funções importantes em Java
         */
        String original = "abcde FGHIJ ABC abc DEFG ";
        System.out.println("Original: -" + original + "-");


        //      toLowerCase(): Converte todos os caracteres de uma string para letras minúsculas.
        String s01 = original.toLowerCase();
        System.out.println("toLowerCase: -" + s01 + "-");

        //      toUpperCase(): Converte todos os caracteres de uma string para letras maiúsculas.
        String s02 = original.toUpperCase();
        System.out.println("toUpperCase: -" + s02 + "-");

        //      trim(): Remove os espaços em branco no início e no fim da string.
        String s03 = original.trim();
        System.out.println("trim: -" + s03 + "-");

        //      substring(inicio): Retorna a substring a partir de uma posição inicial.
        String s04 = original.substring(2);
        System.out.println("substring(2): -" + s04 + "-");

        //      substring(inicio, fim): Retorna a substring entre as posições inicio e fim.
        String s05 = original.substring(2, 9);
        System.out.println("substring(2, 9): -" + s05 + "-");

        //      replace(char antigo, char novo): Substitui todas as ocorrências de um carácter por outro.
        String s06 = original.replace('a', 'x');
        System.out.println("replace('a', 'x'): -" + s06 + "-");

        //      replace(String antiga, String nova): Substitui todas as ocorrências de uma substring por outra.
        String s07 = original.replace("abc", "xy");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");

        //      indexOf(String): Retorna o índice da primeira ocorrência de uma substring ou carácter na string.
        int i = original.indexOf("bc");
        System.out.println("Index of 'bc': " + i);

        //      lastIndexOf(String): Retorna o índice da última ocorrência de uma substring ou carácter na string.
        int j = original.lastIndexOf("bc");
        System.out.println("Last index of 'bc': " + j);

    }
}
