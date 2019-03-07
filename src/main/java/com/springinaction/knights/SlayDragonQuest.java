/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.springinaction.knights;

import java.io.PrintStream;

/**
 * SlayDragonQuest
 *
 * @author huaishi
 * @since 2019-03-07
 */

public class SlayDragonQuest implements Quest {

    protected PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("对抗恶龙");
    }
}