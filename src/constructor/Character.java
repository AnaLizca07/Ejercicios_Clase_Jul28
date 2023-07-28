package constructor;

public class Character {
    private String characterName;
    private int life;
    private int daño;
    private int costoElixir;

    public Character(String characterName, int life, int daño, int costoElixir) {
        this.characterName = characterName;
        this.life = life;
        this.daño = daño;
        this.costoElixir = costoElixir;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getCostoElixir() {
        return costoElixir;
    }

    public void setCostoElixir(int costoElixir) {
        this.costoElixir = costoElixir;
    }

    public void move(){

    }
}
