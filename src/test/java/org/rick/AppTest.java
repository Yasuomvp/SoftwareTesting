package org.rick;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.engine.JupiterTestEngine;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class AppTest {

    public int[] handleUserInput(String userInput){
        ByteArrayInputStream in = new ByteArrayInputStream(userInput.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        return new int[] {a,b,c};
    }

    @Test
    @DisplayName(value = "测试用例: 3 4 5")
    public void test1(){
        App.judgeTriangle(handleUserInput("3 4 5"));
    }

    @Test
    @DisplayName(value = "测试用例: 1.5 4 5")
    public void test2(){
        App.judgeTriangle(handleUserInput("1.5 4 5"));
    }

    @Test
    @DisplayName(value = "测试用例: 3.5 2.5 5")
    public void test3(){
        App.judgeTriangle(handleUserInput("3.5 2.5 5"));
    }

    @Test
    @DisplayName(value = "测试用例: 2.5 4.5 5.5")
    public void test4(){
        App.judgeTriangle(handleUserInput("2.5 4.5 5.5"));
    }

    @Test
    @DisplayName(value = "测试用例: 3")
    public void test5(){
        App.judgeTriangle(handleUserInput("3"));
    }

    @Test
    @DisplayName(value = "测试用例: 4 5")
    public void test6(){
        App.judgeTriangle(handleUserInput("4 5"));
    }

    @Test
    @DisplayName(value = "测试用例: 2 3 4 5")
    public void test7(){
        App.judgeTriangle(handleUserInput("2 3 4 5"));
    }

    @Test
    @DisplayName(value = "测试用例: 3 0 8")
    public void test8(){
        App.judgeTriangle(handleUserInput("3 0 8"));
    }

    @Test
    @DisplayName(value = "测试用例: 0 6 0")
    public void test9(){
        App.judgeTriangle(handleUserInput("0 6 0"));
    }

    @Test
    @DisplayName(value = "测试用例: 0 0 0")
    public void test10(){
        App.judgeTriangle(handleUserInput("0 0 0"));
    }

    @Test
    @DisplayName(value = "测试用例: -3 4 6")
    public void test11(){
        App.judgeTriangle(handleUserInput("-3 4 6"));
    }

    @Test
    @DisplayName(value = "测试用例: 2 -7 -5")
    public void test12(){
        App.judgeTriangle(handleUserInput("2 -7 -5"));
    }

    @Test
    @DisplayName(value = "测试用例: -3 -4 -5")
    public void test13(){
        App.judgeTriangle(handleUserInput("-3 -4 -5"));
    }

    @Test
    @DisplayName(value = "测试用例: 201 4 5")
    public void test14(){
        App.judgeTriangle(handleUserInput("201 4 5"));
    }

    @Test
    @DisplayName(value = "测试用例: 3 201 202")
    public void test15(){
        App.judgeTriangle(handleUserInput("3 201 202"));
    }

    @Test
    @DisplayName(value = "测试用例: 201 204 205")
    public void test16(){
        App.judgeTriangle(handleUserInput("201 204 205"));
    }
}
