package com.bj.test;

import com.bj.proxy.SomeServiceProxy;
import com.bj.service.ISomeService;
import com.bj.service.SomeServiceImpl;

/**
 * Created by apple on 11/07/2017.
 */
public class MyTest {

    public static void main(String[] args){
        ISomeService service = new SomeServiceProxy();
        String result = service.doFirsht();
        System.out.println("result = " + result);
        service.doSecond();
    }
}
