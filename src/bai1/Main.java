package bai1;

public class Main {
        public static void main(String[] args) {
            Myclass myObject = new Myclass();
            System.out.println("Giá trị myString ban đầu: " + myObject.getMyString());

            myObject.setMyString("Hello, world!");
            System.out.println("Giá trị myString sau khi thay đổi: " + myObject.getMyString());
        }
    }

