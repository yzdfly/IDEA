package com.bj.service;

/**
 * Created by apple on 11/07/2017.
 */
public class SomeServiceImpl implements ISomeService {

    @Override
    public String doFirsht() {
        System.out.println("执行doFirst()方法");
        return "dofirst";
    }

    @Override
    public void doSecond() {
        System.out.println("执行doSecond()方法");
    }
}
