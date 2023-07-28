package constructor;

public class MainGame {
    public static void main(String[] args) {
        Character valkiria = new Character("Varkiria",1200,150,4);
        Character miniPeka = new Character("Mini Peka", 1000,999,4);
        Deck deck1 = new Deck(8,4,"Epic",13);
        Arena arena = new Arena();
        Arena arena2 = new Arena(23);
        Arena arena3 = new Arena(23,3500);
        Arena arena4 = new Arena(40,2300,90);
    }
}
