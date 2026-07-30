package com.google.gson.internal;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p153l.za50;

/* JADX INFO: loaded from: classes7.dex */
public class PreJava9DateFormatProvider {
    private static String getDateFormatPattern(int i) {
        if (i == 0) {
            return "EEEE, MMMM d, y";
        }
        if (i == 1) {
            return "MMMM d, y";
        }
        if (i == 2) {
            return "MMM d, y";
        }
        if (i == 3) {
            return "M/d/yy";
        }
        za50.m219101a("Unknown DateFormat style: ", i);
        return null;
    }

    private static String getDatePartOfDateTimePattern(int i) {
        if (i == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i == 1) {
            return "MMMM d, yyyy";
        }
        if (i == 2) {
            return "MMM d, yyyy";
        }
        if (i == 3) {
            return "M/d/yy";
        }
        za50.m219101a("Unknown DateFormat style: ", i);
        return null;
    }

    private static String getTimePartOfDateTimePattern(int i) {
        if (i == 0 || i == 1) {
            return "h:mm:ss a z";
        }
        if (i == 2) {
            return "h:mm:ss a";
        }
        if (i == 3) {
            return "h:mm a";
        }
        za50.m219101a("Unknown DateFormat style: ", i);
        return null;
    }

    public static DateFormat getUSDateFormat(int i) {
        return new SimpleDateFormat(getDateFormatPattern(i), Locale.US);
    }

    public static DateFormat getUSDateTimeFormat(int i, int i2) {
        return new SimpleDateFormat(getDatePartOfDateTimePattern(i) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + getTimePartOfDateTimePattern(i2), Locale.US);
    }
}
