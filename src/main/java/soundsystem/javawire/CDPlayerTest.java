/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package soundsystem.javawire;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.CompactDisc;

/**
 * CDPlayerTest
 *
 * @author huaishi
 * @since 2019-03-09
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

//    @Autowired
//    private MediaPlayer mediaPlayer;

    @Autowired
    private CompactDisc cdPlayer;

    @Test
    public void cdShouldNotBeNull(){
        Assert.assertNotNull(cdPlayer);
    }

}