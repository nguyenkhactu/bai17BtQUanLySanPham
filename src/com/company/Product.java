package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product implements Serializable {
    private int code;
    private String name;
    private String manufacturer; // hãng sản xuất
    private double price;
    private String descriptions;// mô tả sản phẩm

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Product() {
    }

    public Product(int code, String name, String manufacturer, double price, String descriptions) {
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.descriptions = descriptions;
    }

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product :"
                + "code :" + code + '\''
                + "name :" + name + '\''
                + "price :" + price+ '\''
                + "manufacturer :" + manufacturer + '\''
                + "descriptions" + descriptions;
    }


}
