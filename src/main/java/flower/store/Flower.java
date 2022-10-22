package flower.store;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;


@Setter
public class Flower {
    @Getter
    @Setter
    private double sepalLength;
    @Setter
    private FlowerColor color;
    @Getter
    @Setter
    private double price;
    @Getter
    @Setter
    private FlowerType flowerType;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //    @Getter
//    private T1 sepalLength;
//    private T2 color;
//    @Getter
//    private T3 price;
//    @Getter
//    private T4 flowerType;
    public String getColor() {
        return color.toString();
    }
}
