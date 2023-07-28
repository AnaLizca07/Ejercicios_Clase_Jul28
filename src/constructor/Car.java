package constructor;

public class Car {
    private String plate;
    private int model;

    public Car(String plate, int model) {
        this.plate = plate;
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
//El metodo constructor sirve para inicializar la clase por primera vez
//Se llama automaticamente, no retorna y tiene el mismo nombre de la clase
//el constructor puede inicializar varios objetos a la vez, a diferencia del set
