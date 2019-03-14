/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.myapp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

/**
 * PersistenceTest
 *
 * @author huaishi
 * @since 2019-03-12
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:db.xml")
@ActiveProfiles("dev")
public class PersistenceTest {
    @Autowired
    DataSource dataSource;

    @Test
    public void test(){
        Assert.assertNotNull(dataSource);
    }
}