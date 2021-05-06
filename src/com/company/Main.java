package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name[] = {"Thanh", "Phương Anh", "Phong ngu", "Tú", "Chương"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên:");
        String input_name = sc.nextLine();
        boolean isExit = false;
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(input_name)) {
                System.out.println("Tên vừa nhập có trong mảng : " + input_name + " ở vị trí :" + (i + 1));
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println(input_name + " không có trong mảng");
        }
    }
}
