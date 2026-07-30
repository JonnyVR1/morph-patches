package org.seamless.util.time;

import java.io.Serializable;
import java.util.Date;
import org.fourthline.cling.model.Constants;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class DateRange implements Serializable {
    protected Date end;
    protected Date start;

    public enum Preset {
        ALL(new DateRange(null)),
        YEAR_TO_DATE(new DateRange(new Date(DateRange.getCurrentYear(), 0, 1))),
        MONTH_TO_DATE(new DateRange(new Date(DateRange.getCurrentYear(), DateRange.getCurrentMonth(), 1))),
        LAST_MONTH(DateRange.getMonthOf(new Date(DateRange.getCurrentYear(), DateRange.getCurrentMonth() - 1, 1))),
        LAST_YEAR(new DateRange(new Date(DateRange.getCurrentYear() - 1, 0, 1), new Date(DateRange.getCurrentYear() - 1, 11, 31)));

        DateRange dateRange;

        Preset(DateRange dateRange) {
            this.dateRange = dateRange;
        }

        public DateRange getDateRange() {
            return this.dateRange;
        }
    }

    public DateRange(String str, String str2) throws NumberFormatException {
        if (str != null) {
            this.start = new Date(Long.valueOf(str).longValue());
        }
        if (str2 != null) {
            this.end = new Date(Long.valueOf(str2).longValue());
        }
    }

    public static int getCurrentDayOfMonth() {
        return new Date().getDate();
    }

    public static int getCurrentMonth() {
        return new Date().getMonth();
    }

    public static int getCurrentYear() {
        return new Date().getYear();
    }

    public static int getDaysInMonth(Date date) {
        int month = date.getMonth();
        int year = date.getYear() + Constants.UPNP_MULTICAST_PORT;
        return new int[]{31, year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}[month];
    }

    public static DateRange getMonthOf(Date date) {
        return new DateRange(new Date(date.getYear(), date.getMonth(), 1), new Date(date.getYear(), date.getMonth(), getDaysInMonth(date)));
    }

    public static DateRange valueOf(String str) {
        if (!str.contains("dr=")) {
            return null;
        }
        String strSubstring = str.substring(str.indexOf("dr=") + 3);
        String[] strArrSplit = strSubstring.substring(0, strSubstring.indexOf(com.meituan.robust.Constants.PACKNAME_END)).split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
        if (strArrSplit.length != 2) {
            return null;
        }
        try {
            return new DateRange(!strArrSplit[0].equals("0") ? new Date(Long.valueOf(strArrSplit[0]).longValue()) : null, !strArrSplit[1].equals("0") ? new Date(Long.valueOf(strArrSplit[1]).longValue()) : null);
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DateRange dateRange = (DateRange) obj;
        Date date = this.end;
        Date date2 = dateRange.end;
        if (date == null ? date2 != null : !date.equals(date2)) {
            return false;
        }
        Date date3 = this.start;
        Date date4 = dateRange.start;
        return date3 == null ? date4 == null : date3.equals(date4);
    }

    public Date getEnd() {
        return this.end;
    }

    public Date getOneDayBeforeStart() {
        if (getStart() != null) {
            return new Date(getStart().getTime() - 86400000);
        }
        qkq0.m175383a("Can't get day before start date because start date is null");
        return null;
    }

    public Date getStart() {
        return this.start;
    }

    public boolean hasStartOrEnd() {
        return (getStart() == null && getEnd() == null) ? false : true;
    }

    public int hashCode() {
        Date date = this.start;
        int iHashCode = (date != null ? date.hashCode() : 0) * 31;
        Date date2 = this.end;
        return iHashCode + (date2 != null ? date2.hashCode() : 0);
    }

    public boolean isInRange(Date date) {
        if (getStart() == null || getStart().getTime() >= date.getTime()) {
            return false;
        }
        return getEnd() == null || getEnd().getTime() > date.getTime();
    }

    public boolean isStartAfter(Date date) {
        return getStart() != null && getStart().getTime() > date.getTime();
    }

    public boolean isValid() {
        if (getStart() != null) {
            return getEnd() == null || getStart().getTime() <= getEnd().getTime();
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("dr=");
        sb.append(getStart() != null ? Long.valueOf(getStart().getTime()) : "0");
        sb.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
        sb.append(getEnd() != null ? Long.valueOf(getEnd().getTime()) : "0");
        sb.append(com.meituan.robust.Constants.PACKNAME_END);
        return sb.toString();
    }

    public DateRange(Date date) {
        this.start = date;
    }

    public DateRange(Date date, Date date2) {
        this.start = date;
        this.end = date2;
    }

    public DateRange() {
    }
}
