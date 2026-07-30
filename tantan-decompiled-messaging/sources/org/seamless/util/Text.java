package org.seamless.util;

import android.support.v4.media.session.PlaybackStateCompat;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import p149l.aag0;

/* JADX INFO: loaded from: classes3.dex */
public class Text {
    public static final String ISO8601_PATTERN = "yyyy-MM-dd'T'HH:mm:ssz";

    public static String displayFilesize(long j) {
        if (j >= 1073741824) {
            return new BigDecimal(((j / 1024) / 1024) / 1024) + " GiB";
        }
        if (j >= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return new BigDecimal((j / 1024) / 1024) + " MiB";
        }
        if (j >= 1024) {
            return new BigDecimal(j / 1024) + " KiB";
        }
        return new BigDecimal(j) + " bytes";
    }

    public static Calendar fromISO8601String(TimeZone timeZone, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ISO8601_PATTERN);
        simpleDateFormat.setTimeZone(timeZone);
        try {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(simpleDateFormat.parse(str));
            return gregorianCalendar;
        } catch (Exception e) {
            aag0.m95543a(e);
            return null;
        }
    }

    public static String ltrim(String str) {
        return str.replaceAll("(?s)^\\s+", "");
    }

    public static String rtrim(String str) {
        return str.replaceAll("(?s)\\s+$", "");
    }

    public static String toISO8601String(TimeZone timeZone, Calendar calendar) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ISO8601_PATTERN);
        simpleDateFormat.setTimeZone(timeZone);
        try {
            return simpleDateFormat.format(calendar.getTime());
        } catch (Exception e) {
            aag0.m95543a(e);
            return null;
        }
    }

    public static String toISO8601String(TimeZone timeZone, long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j);
        return toISO8601String(timeZone, gregorianCalendar);
    }

    public static String toISO8601String(TimeZone timeZone, Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return toISO8601String(timeZone, gregorianCalendar);
    }
}
