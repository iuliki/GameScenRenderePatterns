package org.exemple.casa;

public class Casa {
    private String material;
    private int[] position;
    private int[] size;
    private String style;
    private int floors;

    public Casa(String material, int[] position, int[] size) {
        this.material = material;
        this.position = position;
        this.size = size;
    }
    public Casa(String material, String style, int floors, int[] position, int[] size) {
        this.material = material;
        this.style = style;
        this.floors = floors;

    }
    public String getDescription() {
        System.out.println("Material: " + material);
        return "Description";
    }

    public String getMaterial() {
        return material;
    }

    public int[] getSize() {
        return size;
    }
    public int[] getPosition() {
        return size;
    }
}
