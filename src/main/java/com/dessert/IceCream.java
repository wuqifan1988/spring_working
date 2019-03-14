/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.dessert;

import com.annotation.Cold;
import com.annotation.Creamy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * IceCream
 *
 * @author huaishi
 * @since 2019-03-13
 */

@Component
@Cold
@Creamy
public class IceCream implements Dessert{

}