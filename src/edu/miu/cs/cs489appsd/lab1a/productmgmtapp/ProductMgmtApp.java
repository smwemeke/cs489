package edu.miu.cs.cs489appsd.lab1a.productmgmtapp;

import edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model.Product;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ProductMgmtApp {
    public static void main(String[] args) {
        Product[] products = new Product[]{
                new Product("3128874119", "Banana", LocalDate.of(2023, 1, 24), 124, 0.55),
                new Product("2927458265", "Apple", LocalDate.of(2022, 12, 9), 18, 1.09),
                new Product("9189927460", "Carrot", LocalDate.of(2023, 3, 31), 89, 2.99)
        };

        printProducts(products);
    }

    public static void printProducts(Product[] products) {
        Product[] sortProducts = Arrays.stream(products)
                .sorted((p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()))
                .toArray(Product[]::new);

    printCentered("Printed in JSON Format:");
    String jsonOutput = Arrays.stream(sortProducts).map(Product::toJson) .collect(Collectors.joining(",\n", "[\n", "\n]"));

        System.out.println(jsonOutput);

        System.out.println("==============================");
    printCentered("Printed in XML Format:");
    System.out.println("<?xml version=\"1.0\"?>");
    String xmlOutput = Arrays.stream(sortProducts)
                             .map(Product::toXml)
                            .collect(Collectors.joining("\n", "<Products>\n", "\n</Products>"));

        System.out.println(xmlOutput);

        System.out.println("==============================");

    printCentered("Printed in Comma-Separated Value(CSV) Format:");
    String csvHeader = "ProductId,Name,DateSupplied,QuantityInStock,UnitPrice";
    String csvOutput = Arrays.stream(sortProducts).map(Product::toCsv).collect(Collectors.joining("\n"));

        System.out.println(csvOutput);
    }

    public static void printCentered(String text){
        int consoleWidth = 80;
        int padding = (consoleWidth - text.length()) /2;

        System.out.println(" ".repeat(Math.max(0, padding)) + text);
    }
}
