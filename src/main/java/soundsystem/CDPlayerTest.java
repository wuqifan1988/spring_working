/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package soundsystem;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * CDPlayerTest
 *
 * @author huaishi
 * @since 2019-03-08
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private SgtPeppers sgtPeppers;

    @Autowired
    private MediaPlayer player;

    @Test
    public void cdShouldNotBeNull(){
        Assert.assertNotNull(cd);
        Assert.assertNotNull(sgtPeppers);
    }

    @Test
    public void play(){
        player.play();

    }
}