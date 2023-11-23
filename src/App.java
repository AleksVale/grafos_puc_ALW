import exceptions.NotFoundException;
import java.io.IOException;
import java.util.Random;

public class App {
    public static void main(String[] args) throws IOException {

        try {

            System.out.println("Lista de adjacencia:");

            var grafo2 = new GrafoListaAdjacencia(true);
            grafo2.inserirVertice(1);
            grafo2.inserirVertice(2);
            grafo2.inserirVertice(3);
            grafo2.inserirVertice(4);
            grafo2.rotularVertice(1, "A");
            grafo2.rotularVertice(2, "B");
            grafo2.rotularVertice(3, "C");
            grafo2.rotularVertice(4, "D");

            grafo2.inserirAresta(1,2,1);
            grafo2.inserirAresta(1,3,2);
            grafo2.inserirAresta(2,4,3);
            grafo2.inserirAresta(3,4,4);
            grafo2.imprimeGrafo();

            grafo2.importarGrafo("src/grafo.gefl");

            System.out.println("Matriz de adjacencia");
            var grafoM = new GrafoMatrizAdjacencia(5, true);

            grafoM.inserirAresta(0, 2);
            grafoM.inserirAresta(0, 3);
            grafoM.inserirAresta(1,0);
            grafoM.inserirAresta(1, 3);
            grafoM.inserirAresta(2, 3);
            grafoM.inserirAresta(3, 4);

            grafoM.ponderarVertice(1, 5);
            grafoM.ponderarVertice(2, 6);
            grafoM.ponderarVertice(2, 7);

            grafoM.rotularVertice(0, "vertice 1");
            grafoM.rotularVertice(1, "vertice 2");
            grafoM.rotularVertice(2, "vertice 3");

            grafoM.rotularAresta(1,0, "aresta 1 - 0");
            grafoM.rotularAresta(0,3, "aresta 0 - 3");


            grafoM.imprimeGrafo();

            grafoM.exportarGrafo("src/grafoexportado.net");
        } catch (NotFoundException err) {
            System.out.println(err.getMessage());
        }
    }
}
