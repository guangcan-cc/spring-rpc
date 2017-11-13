package cc.blog.rmi.impl;

import cc.blog.rmi.CalcService;

public class CalcServiceImpl implements CalcService{
    @Override
    public int add(int a, int b) {

        int result = a+b;

        System.out.println(a + " + " + b + " = " + result);

        return result;
    }
}
