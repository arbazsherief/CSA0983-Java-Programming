class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public boolean isRight() {
        // Check if the square of the longest side is equal to the sum of the squares of the other two sides
        if (side1 > side2 && side1 > side3) {
            return Math.pow(side1, 2) == Math.pow(side2, 2) + Math.pow(side3, 2);
        } else if (side2 > side1 && side2 > side3) {
            return Math.pow(side2, 2) == Math.pow(side1, 2) + Math.pow(side3, 2);
        } else {
            return Math.pow(side3, 2) == Math.pow(side1, 2) + Math.pow(side2, 2);
        }
    }

    public boolean isScalene() {
        return side1 != side2 && side1 != side3 && side2 != side3;
    }

    public boolean isIsosceles() {
        return side1 == side2 || side1 == side3 || side2 == side3;
    }

    public boolean isEquilateral() {
        return side1 == side2 && side1 == side3;
    }

}

public class TriangleMain {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Is the triangle right? " + triangle.isRight());
        System.out.println("Is the triangle scalene? " + triangle.isScalene());
        System.out.println("Is the triangle isosceles? " + triangle.isIsosceles());
        System.out.println("Is the triangle equilateral? " + triangle.isEquilateral());
    }
}