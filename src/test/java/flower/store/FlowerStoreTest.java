package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Random;

import java.util.Random;

public class FlowerStoreTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    @Test
    public void testStore() {
        int price1 = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity1 = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        FlowerBucket flowerBucket1 = new FlowerBucket();
        Flower flower = new Rose();
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower, quantity1);
        flowerBucket1.add(flowerPack);
        Store store = new Store();
        store.add(flowerBucket1);
        Assertions.assertTrue(store.search(flowerBucket1));
    }
}
