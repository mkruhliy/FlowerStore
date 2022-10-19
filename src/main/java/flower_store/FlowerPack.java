package flower_store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int amount;

    public double getPrice(){
        return flower.getPrice()*amount;
    }

    @Override
    public String toString() {
        return flower.toString()+", amount="+amount;
    }
}