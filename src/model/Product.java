package model;

public class Product {
    private String name;
    private int id;
    private double weight;
    private int count;
    private double cost;

    public Product() {

    }

    public Product(String name, int id, double weight, int count, double cost) {
        this.name = name;
        this.id = id;
        this.weight = weight;
        this.count = count;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", weight=" + weight +
                ", count=" + count +
                ", cost=" + cost +
                '}';
    }
}
