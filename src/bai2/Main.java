package bai2;

public class Main {
    public static void main(String[] args) {
        double circleArea1 = StaticMetod.calCircleArea(3.5);
        System.out.println("Diện tích hình tròn (bán kính 3.5): " + circleArea1);

        double circleArea2 = StaticMetod.calCircleArea(6);
        System.out.println("Diện tích hình tròn (bán kính 6): " + circleArea2);

        double triangleArea1 = StaticMetod.calTriangleArea(3, 4, 5);
        System.out.println("Diện tích hình tam giác (3, 4, 5): " + triangleArea1);

        double triangleArea2 = StaticMetod.calTriangleArea(4.5, 7, 6);
        System.out.println("Diện tích hình tam giác (4.5, 7, 6): " + triangleArea2);

        double rectangleArea1 = StaticMetod.calRectangleArea(2.5, 6);
        System.out.println("Diện tích hình chữ nhật (2.5, 6): " + rectangleArea1);

        double rectangleArea2 = StaticMetod.calRectangleArea(4, 7);
        System.out.println("Diện tích hình chữ nhật (4, 7): " + rectangleArea2);
    }
}
