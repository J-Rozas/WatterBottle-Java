public class WaterBottle {
    private int volume;

    public WaterBottle() {
        volume = 100;
    }

    public int getVolume() {
        return volume;
    }

    public void drink() {
        volume -= 10;
    }
}
