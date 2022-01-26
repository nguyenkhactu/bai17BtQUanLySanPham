package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
//    public static void fileProducts(String path, List<Product> products) throws IOException {
//        FileOutputStream fos = new FileOutputStream(path);
//        ObjectOutputStream oss = new ObjectOutputStream(fos);
//        oss.writeObject(products);
//        oss.close();
//        fos.close();
//    }

    //    public static Product importProducts() throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập mã sản phẩm");
//        int code = scanner.nextInt();
//        System.out.println("nhập tên san phẩm");
//        String name = scanner.next();
//        System.out.println("nhập hãng sản xuất");
//        String manufacturer = scanner.next();
//        System.out.println("nhập giá sản phẩm");
//        double price = scanner.nextDouble();
//        System.out.println(" nhập mô tả sản phẩm");
//        String descriptions = scanner.next();
//        List<Product> products = new ArrayList<>();
//        products.add(new Product(code, name, manufacturer, price, descriptions));
//        fileProducts("file products.txt", products);
//        return null;
//    }
    private List<Product> productList = new ArrayList<>();

    public void addnewproduct() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập mã sản phẩm");
        int code = scanner.nextInt();
        System.out.println("nhập tên san phẩm");
        String name = scanner.next();
        System.out.println("nhập hãng sản xuất");
        String manufacturer = scanner.next();
        System.out.println("nhập giá sản phẩm");
        double price = scanner.nextDouble();
        System.out.println(" nhập mô tả sản phẩm");
        String descriptions = scanner.next();
        List<Product> products = new ArrayList<>();
        products.add(new Product(code, name, manufacturer, price, descriptions));
//        fileProducts("file products.txt", products);
        OutputStream fos = new FileOutputStream("file products.txt");
        ObjectOutputStream oss = new ObjectOutputStream(fos);
        oss.writeObject(products);
        oss.close();
        fos.close();
    }

    public void showAll() throws IOException {
        List<Product> newProduct = new ArrayList<>();
        InputStream is = new FileInputStream("file products.txt");
        ObjectInputStream ois = new ObjectInputStream(is);
        try {
            newProduct = (List<Product>) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (Product product : newProduct) {
            System.out.println(product);
        }

    }
}
