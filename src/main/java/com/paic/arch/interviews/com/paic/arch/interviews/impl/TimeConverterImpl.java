package com.paic.arch.interviews.com.paic.arch.interviews.impl;

import com.paic.arch.interviews.TimeConverter;
import com.paic.arch.interviews.util.TimeConverHandleUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * create by jack 2018/4/8
 * 时间转换实现类
 */
public class TimeConverterImpl implements TimeConverter {
    private static final Logger LOGGER = LoggerFactory.getLogger(TimeConverterImpl.class);

    @Override
    public String convertTime(String aTime) {
        //1，得到分割的小时，分钟，秒
        Map<String, String> bTime = TimeConverHandleUtil.splitTimeStr(aTime);
        //小时
        int hour = TimeConverHandleUtil.timeStrToInt(bTime.get("hour"));
        //分钟
        int minute = TimeConverHandleUtil.timeStrToInt(bTime.get("minute"));
        //秒
        int second = TimeConverHandleUtil.timeStrToInt(bTime.get("second"));
        LOGGER.debug("小时为：{},分钟为：{},秒为：{}", hour, minute, second);
        //获取转换后的字符串
        String rs = getConvertTimeStr(hour, minute, second);
        LOGGER.debug("我的转换结果为：\n" + rs);
        return rs;
    }

    /**
     * 获取转换后的字符串
     *
     * @param hour
     * @param minute
     * @param second
     * @return
     */
    public String getConvertTimeStr(int hour, int minute, int second) {
        String rs = "";
        rs += TimeConverHandleUtil.outputYellowLight(second);
        rs += TimeConverHandleUtil.outputHourStr(hour);
        rs += TimeConverHandleUtil.outputMinuteStr(minute);
        return rs;
    }

}
