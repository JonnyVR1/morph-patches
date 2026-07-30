package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.material.C2466R;
import com.immomo.momomediaext.sei.BaseSei;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes7.dex */
class UtcDates {
    static final String UTC = "UTC";

    private UtcDates() {
    }

    public static long canonicalYearMonthDay(long j) {
        Calendar utcCalendar = getUtcCalendar();
        utcCalendar.setTimeInMillis(j);
        return getDayCopy(utcCalendar).getTimeInMillis();
    }

    private static int findCharactersInDateFormatPattern(@NonNull String str, @NonNull String str2, int i, int i2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 < 0 || i2 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i2) != '\'');
            }
            i2 += i;
        }
        return i2;
    }

    @TargetApi(24)
    public static DateFormat getAbbrMonthDayFormat(Locale locale) {
        return getAndroidFormat("MMMd", locale);
    }

    @TargetApi(24)
    public static DateFormat getAbbrMonthWeekdayDayFormat(Locale locale) {
        return getAndroidFormat("MMMEd", locale);
    }

    @TargetApi(24)
    private static DateFormat getAndroidFormat(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(getUtcAndroidTimeZone());
        return instanceForSkeleton;
    }

    public static Calendar getDayCopy(Calendar calendar) {
        Calendar utcCalendarOf = getUtcCalendarOf(calendar);
        Calendar utcCalendar = getUtcCalendar();
        utcCalendar.set(utcCalendarOf.get(1), utcCalendarOf.get(2), utcCalendarOf.get(5));
        return utcCalendar;
    }

    private static java.text.DateFormat getFormat(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(getTimeZone());
        return dateInstance;
    }

    public static java.text.DateFormat getFullFormat() {
        return getFullFormat(Locale.getDefault());
    }

    public static java.text.DateFormat getMediumFormat() {
        return getMediumFormat(Locale.getDefault());
    }

    public static java.text.DateFormat getMediumNoYear(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) getMediumFormat(locale);
        simpleDateFormat.applyPattern(removeYearFromDateFormatPattern(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    private static SimpleDateFormat getSimpleFormat(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(getTimeZone());
        return simpleDateFormat;
    }

    public static SimpleDateFormat getTextInputFormat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toLocalizedPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(getTimeZone());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static String getTextInputHint(Resources resources, SimpleDateFormat simpleDateFormat) {
        String localizedPattern = simpleDateFormat.toLocalizedPattern();
        return localizedPattern.replaceAll(Constants.INAPP_DATA_TAG, resources.getString(C2466R.string.mtrl_picker_text_input_day_abbr)).replaceAll("M", resources.getString(C2466R.string.mtrl_picker_text_input_month_abbr)).replaceAll(BaseSei.f13931Y, resources.getString(C2466R.string.mtrl_picker_text_input_year_abbr));
    }

    private static TimeZone getTimeZone() {
        return TimeZone.getTimeZone(UTC);
    }

    public static Calendar getTodayCalendar() {
        return getDayCopy(Calendar.getInstance());
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone getUtcAndroidTimeZone() {
        return android.icu.util.TimeZone.getTimeZone(UTC);
    }

    public static Calendar getUtcCalendar() {
        return getUtcCalendarOf(null);
    }

    public static Calendar getUtcCalendarOf(@Nullable Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(getTimeZone());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    @TargetApi(24)
    public static DateFormat getYearAbbrMonthDayFormat(Locale locale) {
        return getAndroidFormat("yMMMd", locale);
    }

    @TargetApi(24)
    public static DateFormat getYearAbbrMonthWeekdayDayFormat(Locale locale) {
        return getAndroidFormat("yMMMEd", locale);
    }

    public static SimpleDateFormat getYearMonthFormat() {
        return getYearMonthFormat(Locale.getDefault());
    }

    @NonNull
    private static String removeYearFromDateFormatPattern(@NonNull String str) {
        int iFindCharactersInDateFormatPattern = findCharactersInDateFormatPattern(str, "yY", 1, 0);
        if (iFindCharactersInDateFormatPattern >= str.length()) {
            return str;
        }
        int iFindCharactersInDateFormatPattern2 = findCharactersInDateFormatPattern(str, "EMd", 1, iFindCharactersInDateFormatPattern);
        return str.replace(str.substring(findCharactersInDateFormatPattern(str, iFindCharactersInDateFormatPattern2 < str.length() ? "EMd," : "EMd", -1, iFindCharactersInDateFormatPattern) + 1, iFindCharactersInDateFormatPattern2), MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).trim();
    }

    public static java.text.DateFormat getFullFormat(Locale locale) {
        return getFormat(0, locale);
    }

    public static java.text.DateFormat getMediumFormat(Locale locale) {
        return getFormat(2, locale);
    }

    private static SimpleDateFormat getYearMonthFormat(Locale locale) {
        return getSimpleFormat("MMMM, yyyy", locale);
    }

    public static SimpleDateFormat getSimpleFormat(String str) {
        return getSimpleFormat(str, Locale.getDefault());
    }

    public static java.text.DateFormat getMediumNoYear() {
        return getMediumNoYear(Locale.getDefault());
    }
}
