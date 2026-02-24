import java.util.ArrayList;

public class planes {
    private String matricula;
    private int autonomy;
    private int posX;
    private int posY;
    private int capacity;
    private ArrayList<pilot> pilots = new ArrayList<pilot>();

    public planes(String matricula, int autonomy, int posX, int posY, int capacity, pilot pilot, pilot copilot) {
        this.matricula = matricula;
        this.autonomy = autonomy;
        this.posX = posX;
        this.posY = posY;
        this.capacity = capacity;
        this.pilots.add(pilot);
        this.pilots.add(copilot);
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public int getAutonomy() {
        return autonomy;
    }
    public void setAutonomy(int autonomy) {
        this.autonomy = autonomy;
    }
    public int getPosX() {
        return posX;
    }
    public void setPosX(int posX) {
        this.posX = posX;
    }
    public int getPosY() {
        return posY;
    }
    public void setPosY(int posY) {
        this.posY = posY;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public pilot getPilot() {
        return pilots.get(0);
    }
    public void addPilot(pilot pilot) {
        this.pilots.add(pilot);
    }
    public pilot getCopilot() {
        return pilots.get(1);
    }
        
}