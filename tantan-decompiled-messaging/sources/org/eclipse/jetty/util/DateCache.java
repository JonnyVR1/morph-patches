package org.eclipse.jetty.util;

import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class DateCache {
    public static String DEFAULT_FORMAT = "EEE MMM dd HH:mm:ss zzz yyyy";
    private static long __hitWindow = 3600;
    private DateFormatSymbols _dfs;
    private String _formatString;
    private long _lastMinutes;
    private int _lastMs;
    private String _lastResult;
    private long _lastSeconds;
    private Locale _locale;
    private SimpleDateFormat _minFormat;
    private String _minFormatString;
    private String _secFormatString;
    private String _secFormatString0;
    private String _secFormatString1;
    private SimpleDateFormat _tzFormat;
    private String _tzFormatString;

    public DateCache(String str) {
        this._lastMinutes = -1L;
        this._lastSeconds = -1L;
        this._lastMs = -1;
        this._lastResult = null;
        this._locale = null;
        this._dfs = null;
        this._formatString = str;
        setTimeZone(TimeZone.getDefault());
    }

    private void setMinFormatString() {
        if (this._tzFormatString.indexOf("ss.SSS") >= 0) {
            qkq0.m175383a("ms not supported");
            return;
        }
        int iIndexOf = this._tzFormatString.indexOf("ss");
        this._minFormatString = this._tzFormatString.substring(0, iIndexOf) + "'ss'" + this._tzFormatString.substring(iIndexOf + 2);
    }

    private synchronized void setTzFormatString(TimeZone timeZone) {
        try {
            int iIndexOf = this._formatString.indexOf("ZZZ");
            String str = this._formatString;
            if (iIndexOf >= 0) {
                String strSubstring = str.substring(0, iIndexOf);
                String strSubstring2 = this._formatString.substring(iIndexOf + 3);
                int rawOffset = timeZone.getRawOffset();
                StringBuilder sb = new StringBuilder(this._formatString.length() + 10);
                sb.append(strSubstring);
                sb.append("'");
                if (rawOffset >= 0) {
                    sb.append('+');
                } else {
                    rawOffset = -rawOffset;
                    sb.append('-');
                }
                int i = rawOffset / HuiYanResultSender.TIMEOUT_MS;
                int i2 = i / 60;
                int i3 = i % 60;
                if (i2 < 10) {
                    sb.append('0');
                }
                sb.append(i2);
                if (i3 < 10) {
                    sb.append('0');
                }
                sb.append(i3);
                sb.append('\'');
                sb.append(strSubstring2);
                this._tzFormatString = sb.toString();
            } else {
                this._tzFormatString = str;
            }
            setMinFormatString();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized String format(long j) {
        try {
            long j2 = j / 1000;
            long j3 = this._lastSeconds;
            if (j2 >= j3 && (j3 <= 0 || j2 <= __hitWindow + j3)) {
                if (j3 == j2) {
                    return this._lastResult;
                }
                Date date = new Date(j);
                long j4 = j2 / 60;
                if (this._lastMinutes != j4) {
                    this._lastMinutes = j4;
                    String str = this._minFormat.format(date);
                    this._secFormatString = str;
                    int iIndexOf = str.indexOf("ss");
                    this._secFormatString0 = this._secFormatString.substring(0, iIndexOf);
                    this._secFormatString1 = this._secFormatString.substring(iIndexOf + 2);
                }
                this._lastSeconds = j2;
                StringBuilder sb = new StringBuilder(this._secFormatString.length());
                sb.append(this._secFormatString0);
                int i = (int) (j2 % 60);
                if (i < 10) {
                    sb.append('0');
                }
                sb.append(i);
                sb.append(this._secFormatString1);
                String string = sb.toString();
                this._lastResult = string;
                return string;
            }
            return this._tzFormat.format(new Date(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public SimpleDateFormat getFormat() {
        return this._minFormat;
    }

    public String getFormatString() {
        return this._formatString;
    }

    public TimeZone getTimeZone() {
        return this._tzFormat.getTimeZone();
    }

    public int lastMs() {
        return this._lastMs;
    }

    public String now() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this._lastMs = (int) (jCurrentTimeMillis % 1000);
        return format(jCurrentTimeMillis);
    }

    public synchronized void setTimeZone(TimeZone timeZone) {
        try {
            setTzFormatString(timeZone);
            if (this._locale != null) {
                this._tzFormat = new SimpleDateFormat(this._tzFormatString, this._locale);
                this._minFormat = new SimpleDateFormat(this._minFormatString, this._locale);
            } else if (this._dfs != null) {
                this._tzFormat = new SimpleDateFormat(this._tzFormatString, this._dfs);
                this._minFormat = new SimpleDateFormat(this._minFormatString, this._dfs);
            } else {
                this._tzFormat = new SimpleDateFormat(this._tzFormatString);
                this._minFormat = new SimpleDateFormat(this._minFormatString);
            }
            this._tzFormat.setTimeZone(timeZone);
            this._minFormat.setTimeZone(timeZone);
            this._lastSeconds = -1L;
            this._lastMinutes = -1L;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setTimeZoneID(String str) {
        setTimeZone(TimeZone.getTimeZone(str));
    }

    public DateCache() {
        this(DEFAULT_FORMAT);
        getFormat().setTimeZone(TimeZone.getDefault());
    }

    public DateCache(String str, Locale locale) {
        this._lastMinutes = -1L;
        this._lastSeconds = -1L;
        this._lastMs = -1;
        this._lastResult = null;
        this._dfs = null;
        this._formatString = str;
        this._locale = locale;
        setTimeZone(TimeZone.getDefault());
    }

    public DateCache(String str, DateFormatSymbols dateFormatSymbols) {
        this._lastMinutes = -1L;
        this._lastSeconds = -1L;
        this._lastMs = -1;
        this._lastResult = null;
        this._locale = null;
        this._formatString = str;
        this._dfs = dateFormatSymbols;
        setTimeZone(TimeZone.getDefault());
    }

    public synchronized String format(Date date) {
        return format(date.getTime());
    }

    public void format(long j, StringBuilder sb) {
        sb.append(format(j));
    }
}
