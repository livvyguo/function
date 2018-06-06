package org.livvy.function;

/**
 * @author guozheng
 * @date 2018/06/06
 */
public class Apple {

    private Integer quality;

    private Integer weight;

    private Color color;

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
            "quality=" + quality +
            ", weight=" + weight +
            ", color=" + color +
            '}';
    }



    public static enum Color {
        RED,GREEN,YELLOW
    }
}
