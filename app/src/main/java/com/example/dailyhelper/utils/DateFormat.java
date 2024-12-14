package com.example.dailyhelper.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat {
    public DateFormat() {
    }

    public static String make_yyyy() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy", Locale.KOREA);
        return sdf.format(System.currentTimeMillis());
    }

    public static String make_yyyy(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy", Locale.KOREA);
        return sdf.format(date);
    }

    public static String make_MM() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM", Locale.KOREA);
        return sdf.format(System.currentTimeMillis());
    }

    public static String make_MM(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM", Locale.KOREA);
        return sdf.format(date);
    }

    public static String make_dd() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd", Locale.KOREA);
        return sdf.format(System.currentTimeMillis());
    }

    public static String make_dd(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd", Locale.KOREA);
        return sdf.format(date);
    }
}
