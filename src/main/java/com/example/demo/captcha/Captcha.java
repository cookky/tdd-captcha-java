package com.example.demo.captcha;

public class Captcha {
    int left;
    int right;
    int operator;

    public Captcha(int pattern, int left, int operator, int right) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public int getLeft() {

        return left;
    }

    public String getRight() {
        String numberword[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        return numberword[right];

    }

    public String getOperator() {
        String operator[] = {"","+","-","*"};

        return operator[this.operator];
    }
}
