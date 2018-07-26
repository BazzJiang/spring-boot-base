package com.jiangkedev.redis;

import java.util.Date;

/**
 * author:bazz jiang
 * date:Create in 2018-06-19
 * email:bazzjiang@gmail.com
 */
public class SuperTest extends Date {
    private static final long serialVersionUID = 1L;
    private void test(){
        System.out.println(super.getClass().getName());
    }

    public static void main(String[]args){
        new SuperTest().test();
    }
}