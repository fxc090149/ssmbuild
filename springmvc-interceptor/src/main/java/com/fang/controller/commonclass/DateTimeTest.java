package com.fang.controller.commonclass;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

public class DateTimeTest {
    @Test
    public void test1() throws ParseException {
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());
        Date date1 = new Date();
        java.sql.Date date2 = new java.sql.Date(date1.getTime());

        String str = "2020-09-08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(str);
        System.out.println(parse);
        java.sql.Date date3 = new java.sql.Date(parse.getTime());
        System.out.println(date3);


    }

    /**
     * SimpleDateFormat的使用
     */
    @Test
    public void test2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = new Date();
        System.out.println(date);

        String format = sdf.format(date);
        System.out.println(format);

        String str = "2019-09-09 下午16:08";
        Date parse = sdf.parse(str);
        System.out.println(parse);

//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
        SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY-LL-DD HH:mm:SS");
        String format1 = sdf1.format(date);
        System.out.println(format1);

    }

    /**
     * Localdate、LocalTime、LocalDateTime使用
     */
    @Test
    public void test3(){
        LocalDate now = LocalDate.now();
        LocalTime now1 = LocalTime.now();
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now + "\n" + now1 + "\n" + now2);

        LocalDateTime of = LocalDateTime.of(2020, 10, 10, 23, 23, 23, 999);
        System.out.println(of);

        System.out.println(now2.getDayOfMonth());
        System.out.println(now2.getDayOfWeek());
        System.out.println(now2.getMonth());
        System.out.println(now2.getMonthValue());
        System.out.println(now2.getChronology());
        //withXXX设置时间  原来时间不变
        System.out.println(now.withDayOfYear(300));

        System.out.println(now2.plusDays(7));
    }
    /**
     * Calendar日历类的使用
     */
    @Test
    public void testCalendar(){
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();
        System.out.println(time);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        calendar.set(Calendar.DAY_OF_MONTH,22);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        calendar.add(Calendar.DAY_OF_MONTH,12);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println(calendar.getTime());
    }

    /**
     * Instant的使用
     */
    @Test
    public void testInstant(){
        Instant now = Instant.now();
        System.out.println(now);
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
        System.out.println(offsetDateTime.toEpochSecond());

        Instant instant = Instant.ofEpochSecond(1617261036L);
        System.out.println(instant);
    }

    /**
     * DateTimeFormatter定位使用
     */
    @Test
    public void testDateTimeFormatter(){
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime now = LocalDateTime.now();
        String format = formatter.format(now);
        System.out.println(now);
        System.out.println(format);
        TemporalAccessor parse = formatter.parse(format);
        System.out.println(parse);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        String format1 = formatter1.format(now);
        System.out.println(format1);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        LocalDate now1 = LocalDate.now();
        String format2 = formatter2.format(now1);
        System.out.println(format2);

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyyMMdd hh:mm:ss");
        String format3 = formatter3.format(now);
        System.out.println(format3);

    }
}
