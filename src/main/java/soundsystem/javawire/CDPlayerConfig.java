/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package soundsystem.javawire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import soundsystem.*;
import soundsystem.SgtPeppers;

/**
 * CDPlayerConfig
 *
 * @author huaishi
 * @since 2019-03-12
 */

@Configuration

public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    public CompactDisc randomBeatlesCD(){
        int choice = (int) Math.floor(Math.random() * 4);
        if(choice == 0){
            return new SgtPeppers();
        }else if(choice ==1 ){
            return new WhiteAlbum();
        }
        else if(choice == 2){
            return new HardDaysNight();
        }
        else{
            return new Revolver();
        }

    }

    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }

    @Bean
    public CDPlayer anotherCDPlayer(){
        return new CDPlayer(sgtPeppers());
    }
}