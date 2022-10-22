package flower.store;
import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private final List<FlowerPack> bucket = new ArrayList<>();
    public void add(FlowerPack pack) {
        this.bucket.add(pack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : bucket) {
            price += flowerPack.getPrice();
        }
        return price;
    }
}
