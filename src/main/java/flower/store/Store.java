package flower.store;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

public class Store {
    private final List<FlowerBucket> buckets = new ArrayList<>();

    public void add(FlowerBucket bucket) {
        this.buckets.add(bucket);
    }

    public boolean search(FlowerBucket bucket) {
        return this.buckets.contains(bucket);
    }
}
