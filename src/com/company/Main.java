package com.company;

import javax.sound.sampled.Line;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        ProductManagement productManagement = new ProductManagement();
        int choice = -1;

        do {
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.hiển thị  danh sách sản phẩm");
            System.out.println("3.thông tin san phẩm");
            System.out.println("0.thoát ứng dụng");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("thêm sản phẩm");
                    try {
                        productManagement.createProduct();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 2: {
                    System.out.println("danh sach san pham");
                    try {
                        productManagement.showeListproduct();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
//                    System.out.println("danh sách sản phẩm");
//                    try {
//                        productManagement.showAll();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                    break;
                }
                case 3: {
                    System.out.println("nhập tên sản phẩm");
                    try {
                        productManagement.showeProduct();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
        while (choice != 0);
    }
}

