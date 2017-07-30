package com.bj.proxy;

import com.bj.service.ISomeService;
import com.bj.service.SomeServiceImpl;

/**
 * Created by apple on 11/07/2017.
 */
public class SomeServiceProxy implements ISomeService {

    private ISomeService target;
    public SomeServiceProxy(){
        target = new SomeServiceImpl();
    }

    @Override
    public String doFirsht() {
        //创建目标对象
        String result = target.doFirsht();
        //增强功能
        return result.toUpperCase();
    }

    @Override
    public void doSecond() {
        target.doSecond();
    }
}
