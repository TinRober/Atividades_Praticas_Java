import javax.swing.JOptionPane;

class Pilha {
    int tamanho;
    int topo;
    int vetor[];

    Pilha(int tam) {
        topo = -1;
        tamanho = tam;
        vetor = new int[tamanho];
    }

    public boolean PilhaVazia() {
        return (topo == -1);
    }

    public boolean PilhaCheia() {
        return (topo == tamanho - 1);
    }

    public void empilhar(int valor) {
        if (!PilhaCheia())
            vetor[++topo] = valor;
        else
            System.out.println("Pilha cheia!");
    }

    public int Desempilhar() {
        if (!PilhaVazia())
            return (vetor[topo--]);
        else {
            System.out.println("Pilha vazia!");
            return (-1);
        }
    }

    public int ElementoTopo() {
        if (!PilhaVazia())
            return (vetor[topo]);
        else {
            System.out.println("Pilha vazia!");
            return (-1);
        }
    }

    public void MostrarPilha() {
        if (!PilhaVazia()) {
            System.out.println("Elementos da pilha:");
            for (int i = topo; i >= 0; i--)
                System.out.println(vetor[i]);
        } else
            System.out.println("Pilha vazia!");
    }
}

public class ExemploPilha {
    public static void main(String args[]) {
        Pilha p = new Pilha(5);
        int i;
        int entrada;

        for (i = 1; i <= 5; i++) {
            entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
            p.empilhar(entrada);
        }
        
        //Mostrar os elementos da pilha
        p.MostrarPilha();
        System.out.println("Pilha cheia: " + p.PilhaCheia());
        
        //Desempilhar os elementos
        int removido = p.Desempilhar();
        System.out.println("Elemento removido: " + removido);

        //Mostrar o elemento do topo
        int topo = p.ElementoTopo();
        System.out.println("Elemento do topo: " + topo);

        //Mostrar os elementos restantes na pilha
        p.MostrarPilha();

        System.exit(0);

    }
}
