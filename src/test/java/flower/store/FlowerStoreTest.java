package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FlowerStoreTest {
    private static final int QUANTITY = 780;

    @Test
    public void testStore() {
        FlowerBucket flowerBucket = new FlowerBucket();
        Flower flower = new Rose();
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower, QUANTITY);
        flowerBucket.add(flowerPack);
        Store store = new Store();
        store.add(flowerBucket);
        Assertions.assertTrue(store.search(flowerBucket));
    }
}
