package flowerstore;

import java.util.ArrayList;

public class Store {
    private ArrayList<FlowerBucket> inventory = new ArrayList<FlowerBucket>();

    public void add(FlowerBucket flowerBucket) {
        inventory.add(flowerBucket);
    }

    public ArrayList<FlowerBucket> search(FlowerBucket flowerBucket) {
        ArrayList<FlowerBucket> matchingBuckets = new ArrayList<FlowerBucket>();
        for (FlowerBucket availableBucket: inventory) {
            if (availableBucket.equals(flowerBucket)) {
                matchingBuckets.add(availableBucket);
            }
        }
        return matchingBuckets;
    }

    public static void main(String[] args) {
        Store flowerStore = new Store();

        // Buckets:
        // 1 - Rose x5 and Tulip x2
        Flower roseFlower = new Flower();
        final int rosePrise = 20;
        roseFlower.setPrice(rosePrise);
        roseFlower.setFlowertype(FlowerType.ROSE);
        final int roseSepalLength = 2;
        roseFlower.setSepalLength(roseSepalLength);
        final int roseAmount = 5;
        FlowerPack rosePack = new FlowerPack(roseFlower, roseAmount);

        Flower tulipFlower = new Flower();
        final int tulipPrise = 15;
        tulipFlower.setPrice(tulipPrise);
        tulipFlower.setFlowertype(FlowerType.TULIP);
        final int tulipSepalLength = 3;
        tulipFlower.setSepalLength(tulipSepalLength);
        final int tulipAmount = 2;
        FlowerPack tulipPack = new FlowerPack(tulipFlower, tulipAmount);

        FlowerBucket flowerBucketOne = new FlowerBucket();
        flowerBucketOne.add(rosePack);
        flowerBucketOne.add(tulipPack);

        flowerStore.add(flowerBucketOne);

        ArrayList<FlowerBucket> searchRes = flowerStore.search(flowerBucketOne);

        // search result
        int counter = 1;
        for (FlowerBucket bucket: searchRes) {
            System.out.println("Bucket "+counter);
            System.out.println(bucket);
            System.out.println("\n");
        }
    }
}