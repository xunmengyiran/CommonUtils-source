package com.xunmengyiran.utils;

import com.xunmengyiran.Constants;

import java.util.Date;

public class DateUtils {

    /**
     * 日期转换为时分秒，格式:yyyy-MM-dd HH:mm:ss
     *
     * @param date
     * @return
     */
    public static String date2String1(Date date) {
        String dateStr = Constants.Date_Format.sdf1.format(date);
        System.out.println("成功。。。。。。。");
        return dateStr;
    }
    public static String date2String2(Date date) {
        String dateStr = Constants.Date_Format.sdf2.format(date);
        return dateStr;
    }

}
