package edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model;

import java.time.LocalDate;

public class Product {
    private String productId;
    private String name;
    private LocalDate dateSupplied;
    private int quantityInStock;
    private double unitPrice;

    public Product(){

    }
    public Product(String productId, String name, LocalDate dateSupplied, int quantityInStock, double unitPrice){
        this.productId = productId;
        this.name = name;
        this.dateSupplied = dateSupplied;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }
    public Product (String productId, String name, float unitPrice) {
        this.productId = productId;
        this.name = name;
        this.unitPrice = unitPrice;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getDateSupplied() {
        return dateSupplied;
    }
    public void setDateSupplied(LocalDate dateSupplied) {
        this.dateSupplied = dateSupplied;
    }
    public int getQuantityInStock() {
        return quantityInStock;
    }
    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    //JSON representation
    public String toJson(){

        return String.format(
                "  {\"productId\": \"%s\", \"name\": \"%s\", \"dateSupplied\": \"%s\", \"quantityInStock\": %d, \"unitPrice\": %.2f}",
                productId, name, dateSupplied, quantityInStock, unitPrice);
    }

    // XML representation
    public String toXml() {
        return String.format(
                "<product productId=\"%s\" name=\"%s\" dateSupplied=\"%s\" quantityInStock=\"%d\" unitPrice=\"%.2f\" />",
                productId, name, dateSupplied, quantityInStock, unitPrice);
    }

    // CSV representation
    public String toCsv() {
        return String.format("%s,%s,%s,%d,%.2f",
                productId, name, dateSupplied, quantityInStock, unitPrice);
    }
}
