package com.paic.arch.interviews.util;

import java.util.HashMap;
import java.util.Map;

/**
 * create by jack 2018/4/8
 * 时间转换工具类
 */
public class TimeConverHandleUtil {
    /**
     * 把时间字符串用“:”进行拆分，返回封装的map对象
     *
     * @param time
     * @return
     */
    public static Map<String, String> splitTimeStr(String time) {
        String[] strs = time.split(":");
        Map<String, String> result = new HashMap<>();
        result.put("hour", strs[0]);
        result.put("minute", strs[1]);
        result.put("second", strs[2]);
        return result;
    }

    /**
     * 字符串转换为int
     *
     * @param str
     * @return
     */
    public static int timeStrToInt(String str) {
        int i = 0;
        if ("0".equals(str.charAt(0))) {
            i = Integer.parseInt(String.valueOf(str.charAt(1)));
            return i;
        }
        i = Integer.parseInt(str);
        return i;
    }

    /**
     * 第一行字符串的拼凑
     *
     * @param second
     * @return
     */
    public static String outputYellowLight(int second) {
        if (second % 2 == 0) {
            return "Y\r\n";
        }
        return "O\r\n";
    }

    /**
     * 第二,三行表示小时的字符串拼凑
     *
     * @param hour
     * @return
     */
    public static String outputHourStr(int hour) {
        //第二行应该显示R的个数
        int hour1 = hour / 5;
        int hour2 = hour % 5;
        StringBuilder sb = new StringBuilder();
        //第二行字符串拼接
        for (int i = 1; i <= 4; i++) {
            if (i <= hour1) {
                sb.append("R");
                continue;
            }
            sb.append("O");
        }
        sb.append("\r\n");
        //第三行字符串拼接
        for (int i = 1; i <= 4; i++) {
            if (i <= hour2) {
                sb.append("R");
                continue;
            }
            sb.append("O");
        }
        sb.append("\r\n");
        return sb.toString();
    }

    /**
     * 第四行，第五行字符串拼接
     *
     * @param minute
     * @return
     */
    public static String outputMinuteStr(int minute) {
        int minute1 = minute / 5;
        int minute2 = minute % 5;
        StringBuilder sb = new StringBuilder();
        //第四行字符串拼接
        for (int i = 1; i <= 11; i++) {
            if (i <= minute1) {
                if (i % 3 == 0) {
                    sb.append("R");
                } else {
                    sb.append("Y");
                }
                continue;
            }
            sb.append("O");
        }
        sb.append("\r\n");

        //第五行字符串拼接
        for (int i = 1; i <= 4; i++) {
            if (i <= minute2) {
                sb.append("Y");
                continue;
            }
            sb.append("O");
        }
        return sb.toString();
    }


}
