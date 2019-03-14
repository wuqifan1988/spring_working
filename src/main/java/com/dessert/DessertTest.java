/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.dessert;

import com.annotation.Cold;
import com.annotation.Creamy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * DessertTest
 *
 * @author huaishi
 * @since 2019-03-13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class DessertTest {

    private Dessert dessert;

    @Autowired
    @Cold
    @Creamy
    public void setDessert(Dessert dessert){
        this.dessert = dessert;
    }

    @Test
    public void test(){
        Assert.assertNotNull(dessert);
        System.out.println(dessert.getClass());
    }

}