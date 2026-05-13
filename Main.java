public class Main {
    public static void main(String[] args) {
        // Merlin
        Mago personagem1 = new Mago("Merlin", "Mago", 4, 80, 60.0);
        
        // Arthur
        Guerreiro personagem2 = new Guerreiro("Arthur", "Guerreiro", 5, 150, 50.0);
        
        // Status
        personagem1.mostrarStatus();
        personagem2.mostrarStatus();

        // Habilidades
        System.out.println("--- Habilidades ---");
        personagem1.usarHabilidade();
        personagem2.usarHabilidade();
    }
}