package org.fourthline.cling.model.types;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DateTimeDatatype extends AbstractDatatype<Calendar> {
    protected String[] readFormats;
    protected String writeFormat;

    public DateTimeDatatype(String[] strArr, String str) {
        this.readFormats = strArr;
        this.writeFormat = str;
    }

    public Date getDateValue(String str, String[] strArr) {
        String strNormalizeTimeZone = normalizeTimeZone(str);
        Date date = null;
        for (String str2 : strArr) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
            simpleDateFormat.setTimeZone(getTimeZone());
            try {
                date = simpleDateFormat.parse(strNormalizeTimeZone);
            } catch (ParseException unused) {
            }
        }
        return date;
    }

    @Override // org.fourthline.cling.model.types.AbstractDatatype, org.fourthline.cling.model.types.Datatype
    public String getString(Calendar calendar) throws InvalidValueException {
        if (calendar == null) {
            return "";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.writeFormat);
        simpleDateFormat.setTimeZone(getTimeZone());
        return simpleDateFormat.format(calendar.getTime());
    }

    public TimeZone getTimeZone() {
        return TimeZone.getDefault();
    }

    public String normalizeTimeZone(String str) {
        if (str.endsWith("Z")) {
            return str.substring(0, str.length() - 1).concat("+0000");
        }
        return (str.length() > 7 && str.charAt(str.length() + (-3)) == ':' && (str.charAt(str.length() + (-6)) == '-' || str.charAt(str.length() + (-6)) == '+')) ? str.substring(0, str.length() - 3).concat(str.substring(str.length() - 2)) : str;
    }

    @Override // org.fourthline.cling.model.types.AbstractDatatype, org.fourthline.cling.model.types.Datatype
    public Calendar valueOf(String str) throws InvalidValueException {
        if (str.equals("")) {
            return null;
        }
        Date dateValue = getDateValue(str, this.readFormats);
        if (dateValue == null) {
            throw new InvalidValueException("Can't parse date/time from: ".concat(str));
        }
        Calendar calendar = Calendar.getInstance(getTimeZone());
        calendar.setTime(dateValue);
        return calendar;
    }
}
