/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package soundsystem.javawire;

import org.springframework.stereotype.Component;
import soundsystem.autowire.CompactDisc;

/**
 * SgtPeppers
 *
 * @author huaishi
 * @since 2019-03-08
 */

@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}