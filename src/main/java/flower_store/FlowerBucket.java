package flower_store;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter
public class FlowerBucket {
    ArrayList<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();
    public void add(FlowerPack flowerPack){
        flowerPacks.add(flowerPack);
    }
    public double getPrice(){
        double price = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }

    @Override
    public String toString() {
        StringBuilder bucketStr = new StringBuilder();
        for (FlowerPack flowerPack: flowerPacks) {
            bucketStr.append(flowerPack.toString());
            bucketStr.append("\n");
        }
        bucketStr.append("Price:");
        bucketStr.append(this.getPrice());
        return bucketStr.toString();
    }
}