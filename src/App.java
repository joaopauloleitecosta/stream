import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Explicando o método stream() que faz parte da API de Streams, introduzida no Java 8.");

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,13,16,20,24,100);

        List<Integer> filtrados = numeros.stream()                      //Cria um stream a partir da lista
                                        .filter(n -> n % 2 == 0)        //filtra somente os pares
                                        .collect(Collectors.toList());  //Converte em uma lista de inteiros

        System.out.println(filtrados);
    }
}
