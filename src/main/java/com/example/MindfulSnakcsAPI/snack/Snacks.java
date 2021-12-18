package com.example.MindfulSnakcsAPI.snack;

public class Snacks {
    private Long id;
    private String name;
    private Double price;
    private String flavor;
    private String manufacturers;

    public Snacks() {
    }

    public Snacks(Long id, String name, Double price, String flavor, String manufacturers) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.flavor = flavor;
        this.manufacturers = manufacturers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(String manufacturers) {
        this.manufacturers = manufacturers;
    }

    @Override
    public String toString() {
        return "Snacks [flavor=" + flavor + ", id=" + id + ", manufacturers=" + manufacturers + ", name=" + name
                + ", price=" + price + "]";
    }
}

