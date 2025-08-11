class Fila {
    private int[] elementos;
    private int tamanho;
    private int inicio;
    private int fim;

    public Fila(int capacidade) {
        this.elementos = new int[capacidade];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = 0;
    }

    public boolean FilaVazia() {
        return tamanho == 0;
    }

    public boolean FilaCheia() {
        return tamanho == elementos.length;
    }

    public void Enfileirar(int valor) {
        if (FilaCheia()) {
            throw new RuntimeException("Fila cheia");
        }
        elementos[fim] = valor;
        fim = (fim + 1) % elementos.length;
        tamanho++;
    }

    public int Desenfileirar() {
        if (FilaVazia()) {
            throw new RuntimeException("Fila vazia");
        }
        int valor = elementos[inicio];
        inicio = (inicio + 1) % elementos.length;
        tamanho--;
        return valor;
    }

    public void ElementoInicio() {
        if (FilaVazia()) {
            throw new RuntimeException("Fila vazia");
        }
        System.out.println("Elemento no início da fila: " + elementos[inicio]);
    }

    public void MostrarFila() {
        if (FilaVazia()) {
            System.out.println("Fila vazia");
            return;
        }
        System.out.print("Elementos na fila: ");
        for (int i = 0; i < tamanho; i++) {
            int index = (inicio + i) % elementos.length;
            System.out.print(elementos[index] + " ");
        }
        System.out.println();
    }

}
