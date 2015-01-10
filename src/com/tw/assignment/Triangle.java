package com.tw.assignment;

/**
 * Created by achalaggarwal on 1/9/15.
 */
public class Triangle {

    private int height;

    public Triangle(int height) {

        this.height = height;
    }

    public String generateRightAngleTriangle() {
        String str = "";

        for (int row = 0; row < height; row++) {
            for (int col = 0; col <= row; col++) {
                str += "*";
            }

            str += "\n";
        }

        return str;
    }

    public String generateIsoscelesTriangle() {
        String str = "";

        for (int row = 0; row < height; row++) {
            for (int space = row+1; space < height; space++) {
                str += " ";
            }
            for (int col = 0; col < 2*row + 1; col++) {
                str += "*";
            }

            str += "\n";
        }

        return str;
    }

    public String generateDiamondTriangle() {
        String str = "";

        for (int row = 0; row < height; row++) {
            for (int space = row+1; space < height; space++) {
                str += " ";
            }
            for (int col = 0; col < 2*row + 1; col++) {
                str += "*";
            }

            str += "\n";
        }

        for (int row = 0; row < height-1; row++) {
            for (int space = 0; space <= row; space++) {
                str += " ";
            }
            for (int col = 2*(height-row-2); col >= 0; col--) {
                str += "*";
            }

            str += "\n";
        }

        return str;
    }

    private String generateDiamondTriangleWithName(String name) {
        String str = "";

        for (int row = 0; row < height-1; row++) {
            for (int space = row+1; space < height; space++) {
                str += " ";
            }
            for (int col = 0; col < 2*row + 1; col++) {
                str += "*";
            }

            str += "\n";
        }

        for (int space = (2*height-1-name.length())/2; space>0 ; space--) {
            str += " ";
        }

        str += name + "\n";

        for (int row = 0; row < height-1; row++) {
            for (int space = 0; space <= row; space++) {
                str += " ";
            }
            for (int col = 2*(height-row-2); col >= 0; col--) {
                str += "*";
            }

            str += "\n";
        }

        return str;
    }

    public static void main(String argv[]) {
        Triangle triangle = new Triangle(5);
        System.out.println(triangle.generateRightAngleTriangle());
        System.out.println(triangle.generateIsoscelesTriangle());
        System.out.println(triangle.generateDiamondTriangle());
        System.out.println(triangle.generateDiamondTriangleWithName("Achal"));
    }
}
