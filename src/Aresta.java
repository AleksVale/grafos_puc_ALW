public class Aresta {

    private double peso;
    private int destino;
    private boolean visitada;

    /**
     * Construtor para arestas com peso. A aresta é criada como não visitada.
     * 
     * @param peso2 Peso da aresta
     * @param destino  Vértice de destino
     */
    public Aresta(double peso2, int destino) {
        init(peso2, destino);
    }

    /**
     * Construtor para arestas sem peso. A aresta é criada como não visitada.
     * 
     * @param destino Vértice de destino
     */
    public Aresta(int destino) {
        init(-1, destino);
    }

    private void init(double peso2, int destino) {
        this.peso = peso2;
        this.destino = destino;
        this.visitada = false;
    }

    /**
     * Método de acesso para o peso da aresta
     * 
     * @return Peso da aresta (int)
     */
    public double peso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Método de acesso para o destino da aresta
     * 
     * @return Id do vértice de destino
     */
    public int destino() {
        return this.destino;
    }

    /**
     * Marca a aresta como visitada
     */
    public void visitar() {
        this.visitada = true;
    }

    /**
     * Marca a aresta como não visitada
     */
    public void limparVisita() {
        this.visitada = false;
    }

    /**
     * Indica se a aresta foi visitada (TRUE) ou não (FALSE)
     * 
     * @return TRUE/FALSE conforme a aresta foi visitada ou não.
     */
    public boolean visitada() {
        return this.visitada;
    }
}