package air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Plane extends Vehicle implements IJetEngine {

    private IJetEngine jetEngine;

    private String pilot;
    private int numberOfSeats;

    public Plane(float weight, int maxSpeed, IProduct baseProduct, IJetEngine jetEngine, String pilot, int numberOfSeats){
        super(weight, maxSpeed, baseProduct);
        this.pilot = pilot;
        this.numberOfSeats = numberOfSeats;
        this.jetEngine = jetEngine;
    }

    @Override
    public void startEngine() {
        this.jetEngine.startEngine();
    }

    @Override
    public void stopEngine() {
        this.jetEngine.stopEngine();
    }

    @Override
    public int getHp() {
        return this.jetEngine.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.jetEngine.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.jetEngine.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.jetEngine.setFuel(fuel);
    }

    public IJetEngine getJetEngine() {
        return this.jetEngine;
    }

    public void setJetEngine(IJetEngine jetEngine) {
        this.jetEngine = jetEngine;
    }

    public String getPilot() {
        return this.pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
