import java.util.Arrays;
import java.util.List;

public class ExemploStreams {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Usando forEach com uma lambda para imprimir cada nome
        System.out.println("Imprimindo todos os nomes:");
        nomes.forEach(nome -> System.out.println(nome));

        // Filtrando e imprimindo nomes que começam com 'A'
        System.out.println("\nNomes que começam com 'A':");
        nomes.stream()
                .filter(nome -> nome.startsWith("A"))
                .forEach(nome -> System.out.println(nome));

        // Transformando (mapeando) e imprimindo o comprimento de cada nome
        System.out.println("\nComprimento de cada nome:");
        nomes.stream()
                .map(nome -> nome.length())
                .forEach(System.out::println);
    }
}