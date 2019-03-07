/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.springinaction.knights;

import java.io.PrintStream;

/**
 * Minstrel
 *
 * @author huaishi
 * @since 2019-03-07
 */

public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest(){
        stream.println("Fa la la, thie knight is so brave!");
    }

    public void singAfterQuest(){
        stream.println("Tee hee hee, the brave knight did embark on quest!");
    }
}