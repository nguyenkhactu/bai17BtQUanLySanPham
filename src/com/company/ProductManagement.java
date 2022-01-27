package com.company;

import java.io.*;
import java.util.*;

public class ProductManagement {

//    List<Product> productList = new ArrayList<>();
//    List<Product> products = new ArrayList<>();
//    static Scanner scanner = new Scanner(System.in);
//    public void addnewproduct() throws IOException {
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
//        products.size();
//        products.add(new Product(code, name, manufacturer, price, descriptions));
//        productList.add(new Product(name, code));
//        OutputStream fos = new FileOutputStream("file products.txt");
//        ObjectOutputStream oss = new ObjectOutputStream(fos);
//        OutputStream fnos = new FileOutputStream("file name and code products.txt");
//        ObjectOutputStream noss = new ObjectOutputStream(fnos);
//        oss.writeObject(products);
//        noss.writeObject(productList);
//        oss.close();
//        fos.close();
//    }

    //    public void showAll() throws IOException {
//        List<Product> newProduct = new ArrayList<>();
//        InputStream is = new FileInputStream("file name and code products.txt");
//        ObjectInputStream ois = new ObjectInputStream(is);
//        try {
//            newProduct = (List<Product>) ois.readObject();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        int sezi = newProduct.size();
//        if (sezi == 0) {
//            System.out.println("ko co san pham nao");
//        } else
//
//            for (Product product : newProduct) {
//                System.out.println("tên sản phẩm :" + product.getName() + "- Mã sản phẩm :" + product.getCode());
//            }
//
//    }
    static Scanner scanner = new Scanner(System.in);
    HashMap<String, Object> products = new HashMap<>();

    public void createProduct() throws IOException {
//        HashMap<Integer, Product> products = new HashMap<>();
//        String code = String.valueOf(products.size()+1);
//        System.out.println("nhập mã sản phẩm");
//        int code = scanner.nextInt();
        System.out.println("nhập tên san phẩm");
        String name = scanner.next();
        System.out.println("nhập hãng sản xuất");
        String manufacturer = scanner.next();
        System.out.println("nhập giá sản phẩm");
        double price = scanner.nextDouble();
        System.out.println(" nhập mô tả sản phẩm");
        String descriptions = scanner.next();
        Product product = new Product(name, manufacturer, price, descriptions);
        products.put(name, product);
        OutputStream fos = new FileOutputStream("file products.txt");
        ObjectOutputStream oss = new ObjectOutputStream(fos);
        oss.writeObject(products);
        oss.close();
        fos.close();
    }

    public void showeListproduct() throws IOException, ClassNotFoundException {
        HashMap<String, Product> newProduct = new HashMap<>();
        InputStream is = new FileInputStream("file products.txt");
        ObjectInputStream ois = new ObjectInputStream(is);
        newProduct = (HashMap<String, Product>) ois.readObject();
        Set<String> keys = newProduct.keySet();
        for (String key : keys) {
            System.out.println("tên sản phẩm :" + key);

        }
    }

    public void showeProduct() throws IOException, ClassNotFoundException {
        HashMap<String, Product> newProduct = new HashMap<>();
        String nameproduct = scanner.next();
        InputStream is = new FileInputStream("file products.txt");
        ObjectInputStream ois = new ObjectInputStream(is);
        newProduct = (HashMap<String, Product>) ois.readObject();
        Set<String> keys = newProduct.keySet();
        System.out.println("thông tin sản phẩm :" + newProduct.get(nameproduct));
    }
}

