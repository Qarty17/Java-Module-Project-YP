public class Races {
    String name;
    int speed;
    Races(String name, int speed){
        this.name=name;
        this.speed=speed;
    }
    static boolean speedLimit(int speed){
        return speed <= 250 && speed > 0;
    }
}
