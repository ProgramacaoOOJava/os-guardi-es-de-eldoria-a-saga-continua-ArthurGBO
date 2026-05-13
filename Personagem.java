public class Personagem {
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    // Construtor
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public double getPoderBase() {
        return poderBase;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public void setPoderBase(double poderBase) {
        this.poderBase = poderBase;
    }

        
    // Função para visualizar status do personagem
    public void mostrarStatus() {
        System.out.println("--- Status " + this.nome + " ---");
        System.out.println(this.toString());
        System.out.println();
    }

    // Função para usar habilidades
    public void usarHabilidade() {
        System.out.println(nome + " usou uma habilidade básica!");
    }

    // toString para visualizar status do personagem
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Classe: " + classe + "\n" +
               "Nível: " + nivel + "\n" +
               "Pontos de Vida: " + pontosDeVida + "\n" +
               "Poder Base: " + poderBase;
    }
}