package org.exemple.casa;

public class CasaBuilder {
    private String material;
    private String style;
    private int floors;
    private int[] position;
    private int[] size;

    public CasaBuilder setMaterial(String material) {
        this.material = material;
        return this;
    }

    public CasaBuilder setStyle(String style) {
        this.style = style;
        return this;
    }

    public CasaBuilder setFloors(int floors) {
        this.floors = floors;
        return this;
    }

    public CasaBuilder setPosition(int[] position) {
        this.position = position;
        return this;
    }

    public CasaBuilder setSize(int[] size) {
        this.size = size;
        return this;
    }

    public Casa build() {
        return new Casa(material, style, floors, position, size);
    }
}
