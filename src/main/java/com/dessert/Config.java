/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.dessert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Config
 *
 * @author huaishi
 * @since 2019-03-13
 */

@Configuration
@ComponentScan
public class Config {
    @Bean
//    @Primary
    public Dessert iceCream(){
        return new IceCream();
    }
}