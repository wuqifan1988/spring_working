/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.springinaction.knights;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * KnightMain
 *
 * @author huaishi
 * @since 2019-03-07
 */

public class KnightMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
        Knight knight = context.getBean(Knight.class);

        knight.embarkOnQuest();
        context.close();
    }

}