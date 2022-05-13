package org.rick;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {

    }


    public static void judgeTriangle(int[] arr) {

        int a = arr[0], b = arr[1], c = arr[2];
        if (a<0||a>200||b<0||b>200||c<0||c>200) System.out.println("数据输入有错，不满足0<a、b、c<=200");
        else if (a+b<=c||b+c<=a||a+c<=b) System.out.println("不构成三角形");
        else if (a==b && b==c) System.out.println("等边三角形");
        else if (a==b||b==c||c==a) System.out.println("等腰三角形");
        else System.out.println("普通三角形");

    }


}
