package vehicles;

public class Motor implements IMotorised{

    private int hp;
    private int fuel;

    public Motor(int fuel, int hp){
        this.fuel = fuel;
        this.hp = hp;
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void startEngine(){
        System.out.println("engine started");
    }

    public void stopEngine(){
        System.out.println("Engine stopped");
    }

    @Override
    public int getFuel() {
        return this.fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
