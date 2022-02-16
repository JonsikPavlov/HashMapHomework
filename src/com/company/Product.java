package com.company;

public class Product {
    private String toyName;
    private int underKidsAge;
    private double toyCost;
    private boolean newToy = true;
    private int validUntilYear;

    public Product(String toyName, int underKidsAge, double toyCost, boolean newToy, int validUntilYear) {
        this.toyName = toyName;
        this.underKidsAge = underKidsAge;
        this.toyCost = toyCost;
        this.newToy = newToy;
        this.validUntilYear = validUntilYear;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getUnderKidsAge() {
        return underKidsAge;
    }

    public void setUnderKidsAge(int underKidsAge) {
        this.underKidsAge = underKidsAge;
    }

    public double getToyCost() {
        return toyCost;
    }

    public void setToyCost(double toyCost) {
        this.toyCost = toyCost;
    }

    public boolean isNewToy() {
        return newToy;
    }

    public void setNewToy(boolean newToy) {
        this.newToy = newToy;
    }

    public int getValidUntilYear() {
        return validUntilYear;
    }

    public void setValidUntilYear(int validUntilYear) {
        this.validUntilYear = validUntilYear;
    }

    @Override
    public String toString() {
        return "Product{" +
                "toyName='" + toyName + '\'' +
                ", underKidsAge=" + underKidsAge +
                ", toyCost=" + toyCost +
                ", newToy=" + newToy +
                ", validUntilYear=" + validUntilYear +
                "}" + '\n';
    }

    public static void utilProduct (int validUntilYear){
        if (validUntilYear < 2022){
            System.out.println("Product can't be sold, it should be utilized.");
        }
    }

    public void toyWarranty(){
        if (this.newToy){
            System.out.println("One year warranty required.");
        }
        if (!this.newToy){
            System.out.println("No warranty in case the toy has been used already by another person.");
        }
    }

}
