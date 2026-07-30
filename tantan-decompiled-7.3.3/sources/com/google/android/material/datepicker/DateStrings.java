package com.google.android.material.datepicker;

import androidx.annotation.Nullable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import p153l.pf60;

/* JADX INFO: loaded from: classes7.dex */
class DateStrings {
    private DateStrings() {
    }

    public static pf60<String, String> getDateRangeString(@Nullable Long l2, @Nullable Long l3, @Nullable SimpleDateFormat simpleDateFormat) {
        if (l2 == null && l3 == null) {
            return pf60.m172085a(null, null);
        }
        if (l2 == null) {
            return pf60.m172085a(null, getDateString(l3.longValue(), simpleDateFormat));
        }
        if (l3 == null) {
            return pf60.m172085a(getDateString(l2.longValue(), simpleDateFormat), null);
        }
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(l2.longValue());
        Calendar utcCalendar2 = UtcDates.getUtcCalendar();
        utcCalendar2.setTimeInMillis(l3.longValue());
        if (simpleDateFormat != null) {
            return pf60.m172085a(simpleDateFormat.format(new Date(l2.longValue())), simpleDateFormat.format(new Date(l3.longValue())));
        }
        if (utcCalendar.get(1) == utcCalendar2.get(1)) {
            return utcCalendar.get(1) == todayCalendar.get(1) ? pf60.m172085a(getMonthDay(l2.longValue(), Locale.getDefault()), getMonthDay(l3.longValue(), Locale.getDefault())) : pf60.m172085a(getMonthDay(l2.longValue(), Locale.getDefault()), getYearMonthDay(l3.longValue(), Locale.getDefault()));
        }
        return pf60.m172085a(getYearMonthDay(l2.longValue(), Locale.getDefault()), getYearMonthDay(l3.longValue(), Locale.getDefault()));
    }

    public static String getDateString(long j, @Nullable SimpleDateFormat simpleDateFormat) {
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j);
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j));
        }
        return todayCalendar.get(1) == utcCalendar.get(1) ? getMonthDay(j) : getYearMonthDay(j);
    }

    public static String getMonthDay(long j, Locale locale) {
        return UtcDates.getAbbrMonthDayFormat(locale).format(new Date(j));
    }

    public static String getMonthDayOfWeekDay(long j, Locale locale) {
        return UtcDates.getAbbrMonthWeekdayDayFormat(locale).format(new Date(j));
    }

    public static String getYearMonthDay(long j, Locale locale) {
        return UtcDates.getYearAbbrMonthDayFormat(locale).format(new Date(j));
    }

    public static String getYearMonthDayOfWeekDay(long j, Locale locale) {
        return UtcDates.getYearAbbrMonthWeekdayDayFormat(locale).format(new Date(j));
    }

    public static String getMonthDay(long j) {
        return getMonthDay(j, Locale.getDefault());
    }

    public static String getMonthDayOfWeekDay(long j) {
        return getMonthDayOfWeekDay(j, Locale.getDefault());
    }

    public static String getYearMonthDay(long j) {
        return getYearMonthDay(j, Locale.getDefault());
    }

    public static String getYearMonthDayOfWeekDay(long j) {
        return getYearMonthDayOfWeekDay(j, Locale.getDefault());
    }

    public static String getDateString(long j) {
        return getDateString(j, null);
    }

    public static pf60<String, String> getDateRangeString(@Nullable Long l2, @Nullable Long l3) {
        return getDateRangeString(l2, l3, null);
    }
}
