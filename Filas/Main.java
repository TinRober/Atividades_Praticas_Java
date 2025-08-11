public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5); // capacidade de 5 elementos

        // Inserindo elementos
        fila.Enfileirar(10);
        fila.Enfileirar(20);
        fila.Enfileirar(30);
        fila.MostrarFila(); // Elementos na fila: 10 20 30

        // Mostrando o primeiro elemento
        fila.ElementoInicio(); // Elemento no início da fila: 10

        // Removendo elemento
        System.out.println("Removido: " + fila.Desenfileirar()); // Removido: 10
        fila.MostrarFila(); // Elementos na fila: 20 30

        // Mais inserções
        fila.Enfileirar(40);
        fila.Enfileirar(50);
        fila.Enfileirar(60); // até a capacidade máxima
        fila.MostrarFila();

        // Tentando inserir com a fila cheia
        try {
            fila.Enfileirar(70);
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Removendo todos os elementos
        while (!fila.FilaVazia()) {
            System.out.println("Removido: " + fila.Desenfileirar());
        }
        fila.MostrarFila();
    }
}
