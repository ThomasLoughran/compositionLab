package air;

public class JetEngine implements IJetEngine{

    private int fuel;
    private int hp;

    public JetEngine(int fuel, int hp){
        this.fuel = fuel;
        this.hp = hp;
    }

    @Override
    public int getFuel() {
        return this.fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel = fuel;
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
        System.out.println("jet engine started");
    }

    public void stopEngine(){
        System.out.println("jet engine stopped");
    }

}
