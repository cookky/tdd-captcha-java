package com.example.demo.captcha;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CaptchaTests {
    @Test
    public void OperandPattern_1_ShouldBe_Minus() {
        Captcha captcha = new Captcha(1, 1, 3, 1);
        String operator = captcha.getOperator();
        assertEquals("*", operator);
    }
    @Test
    public void OperandPattern_1_ShouldBe_Delete() {
        Captcha captcha = new Captcha(1, 1, 2, 1);
        String operator = captcha.getOperator();
        assertEquals("-", operator);
    }
    @Test
    public void OperandPattern_1_ShouldBe_Plus() {
        Captcha captcha = new Captcha(1, 1, 1, 1);
        String operator = captcha.getOperator();
        assertEquals("+", operator);
    }
    @Test
    public void rightOperandPattern_1_ShouldBe_Seven(){
        Captcha captcha = new Captcha(1,1,1,7);
        String right = captcha.getRight();
        assertEquals("Seven", right);
    }
    @Test
    public void rightOperandPattern_1_ShouldBe_Nine(){
        Captcha captcha = new Captcha(1,1,1,9);
        String right = captcha.getRight();
        assertEquals("Nine", right);
    }
    @Test
    public void rightOperandPattern_1_ShouldBe_One(){
        Captcha captcha = new Captcha(1,1,1,1);
        String right = captcha.getRight();
        assertEquals("One", right);
    }
    @Test
    public void leftOperandPattren_1_ShouldBe_7(){
        Captcha captcha = new Captcha(1,7,1,1);
        int left = captcha.getLeft();
        assertEquals(7,left);
    }
    @Test
    public void leftOperandPattren_1_ShouldBe_5(){
        Captcha captcha = new Captcha(1,5,1,1);
        int left = captcha.getLeft();
        assertEquals(5,left);
    }
    @Test
    public void leftOperrandPattern_1_ShouldBe_9(){
        Captcha captcha = new Captcha(1,9,1,1);
        int left = captcha.getLeft();
        assertEquals(9,left);
    }
    @Test
    public  void leftOperrandPattern_1_ShouldBe_1(){
        Captcha captcha = new Captcha(1,1,1,1);
        int left = captcha.getLeft();
        assertEquals(1,left);
    }
}
