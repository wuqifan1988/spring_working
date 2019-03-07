/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.springinaction.knights;

/**
 * DamselRescuingKnight
 *
 * @author huaishi
 * @since 2019-03-07
 */

public class DamselRescuingKnight implements Knight {

    private RescueDansekQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDansekQuest();
    }

    @Override
    public void embarkOnQuest(){
        quest.embark();
    }
}