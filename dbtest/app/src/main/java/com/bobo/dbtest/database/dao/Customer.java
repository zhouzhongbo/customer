package com.bobo.dbtest.database.dao;

import java.util.List;

/**
 * Created by zzb on 2017/11/29.
 */

/**
 * 客户与收件人的区别，客户可以有多个地址，收件人只有一个地址
 */
public class Customer {

    String name;

    String phone;

    List<Address> address;
}
