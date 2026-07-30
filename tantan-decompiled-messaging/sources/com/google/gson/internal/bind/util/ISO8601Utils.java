package com.google.gson.internal.bind.util;

import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes7.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static String format(Date date, boolean z, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        if (z) {
            sb.append('.');
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / HuiYanResultSender.TIMEOUT_MS;
            int iAbs = Math.abs(i / 60);
            int iAbs2 = Math.abs(i % 60);
            sb.append(offset >= 0 ? '+' : '-');
            padInt(sb, iAbs, 2);
            sb.append(':');
            padInt(sb, iAbs2, 2);
        } else {
            sb.append(Matrix.MATRIX_TYPE_ZERO);
        }
        return sb.toString();
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i, int i2) {
        String string = Integer.toString(i);
        for (int length = i2 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e7 A[Catch: IllegalArgumentException -> 0x0052, NumberFormatException -> 0x0055, IndexOutOfBoundsException -> 0x0058, TryCatch #2 {IndexOutOfBoundsException -> 0x0058, NumberFormatException -> 0x0055, IllegalArgumentException -> 0x0052, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003e, B:13:0x0044, B:23:0x0061, B:25:0x0071, B:26:0x0073, B:28:0x007f, B:29:0x0082, B:31:0x0088, B:35:0x0092, B:40:0x00a2, B:42:0x00aa, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:84:0x017e, B:64:0x00fe, B:65:0x0114, B:66:0x0115, B:70:0x0125, B:72:0x0132, B:75:0x013b, B:77:0x014d, B:80:0x015c, B:81:0x0179, B:83:0x017c, B:69:0x0121, B:86:0x01b0, B:87:0x01b7, B:47:0x00c4, B:48:0x00c7), top: B:98:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ed A[Catch: IllegalArgumentException -> 0x0052, NumberFormatException -> 0x0055, IndexOutOfBoundsException -> 0x0058, TryCatch #2 {IndexOutOfBoundsException -> 0x0058, NumberFormatException -> 0x0055, IllegalArgumentException -> 0x0052, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003e, B:13:0x0044, B:23:0x0061, B:25:0x0071, B:26:0x0073, B:28:0x007f, B:29:0x0082, B:31:0x0088, B:35:0x0092, B:40:0x00a2, B:42:0x00aa, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:84:0x017e, B:64:0x00fe, B:65:0x0114, B:66:0x0115, B:70:0x0125, B:72:0x0132, B:75:0x013b, B:77:0x014d, B:80:0x015c, B:81:0x0179, B:83:0x017c, B:69:0x0121, B:86:0x01b0, B:87:0x01b7, B:47:0x00c4, B:48:0x00c7), top: B:98:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x0120  */
    /* JADX WARN: Code duplicated, block: B:69:0x0121 A[Catch: IllegalArgumentException -> 0x0052, NumberFormatException -> 0x0055, IndexOutOfBoundsException -> 0x0058, TryCatch #2 {IndexOutOfBoundsException -> 0x0058, NumberFormatException -> 0x0055, IllegalArgumentException -> 0x0052, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003e, B:13:0x0044, B:23:0x0061, B:25:0x0071, B:26:0x0073, B:28:0x007f, B:29:0x0082, B:31:0x0088, B:35:0x0092, B:40:0x00a2, B:42:0x00aa, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:84:0x017e, B:64:0x00fe, B:65:0x0114, B:66:0x0115, B:70:0x0125, B:72:0x0132, B:75:0x013b, B:77:0x014d, B:80:0x015c, B:81:0x0179, B:83:0x017c, B:69:0x0121, B:86:0x01b0, B:87:0x01b7, B:47:0x00c4, B:48:0x00c7), top: B:98:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:83:0x017c A[Catch: IllegalArgumentException -> 0x0052, NumberFormatException -> 0x0055, IndexOutOfBoundsException -> 0x0058, TryCatch #2 {IndexOutOfBoundsException -> 0x0058, NumberFormatException -> 0x0055, IllegalArgumentException -> 0x0052, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003e, B:13:0x0044, B:23:0x0061, B:25:0x0071, B:26:0x0073, B:28:0x007f, B:29:0x0082, B:31:0x0088, B:35:0x0092, B:40:0x00a2, B:42:0x00aa, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:84:0x017e, B:64:0x00fe, B:65:0x0114, B:66:0x0115, B:70:0x0125, B:72:0x0132, B:75:0x013b, B:77:0x014d, B:80:0x015c, B:81:0x0179, B:83:0x017c, B:69:0x0121, B:86:0x01b0, B:87:0x01b7, B:47:0x00c4, B:48:0x00c7), top: B:98:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b0 A[Catch: IllegalArgumentException -> 0x0052, NumberFormatException -> 0x0055, IndexOutOfBoundsException -> 0x0058, TryCatch #2 {IndexOutOfBoundsException -> 0x0058, NumberFormatException -> 0x0055, IllegalArgumentException -> 0x0052, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003e, B:13:0x0044, B:23:0x0061, B:25:0x0071, B:26:0x0073, B:28:0x007f, B:29:0x0082, B:31:0x0088, B:35:0x0092, B:40:0x00a2, B:42:0x00aa, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:84:0x017e, B:64:0x00fe, B:65:0x0114, B:66:0x0115, B:70:0x0125, B:72:0x0132, B:75:0x013b, B:77:0x014d, B:80:0x015c, B:81:0x0179, B:83:0x017c, B:69:0x0121, B:86:0x01b0, B:87:0x01b7, B:47:0x00c4, B:48:0x00c7), top: B:98:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:95:0x01db  */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x01bc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x01db, please report this as an issue */
    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        String message;
        int i;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        String strSubstring;
        int length;
        TimeZone timeZone;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i5 = index + 4;
            int i6 = parseInt(str, index, i5);
            if (checkOffset(str, i5, '-')) {
                i5 = index + 5;
            }
            int i7 = i5 + 2;
            int i8 = parseInt(str, i5, i7);
            if (checkOffset(str, i7, '-')) {
                i7 = i5 + 3;
            }
            int i9 = i7 + 2;
            int i10 = parseInt(str, i7, i9);
            boolean zCheckOffset = checkOffset(str, i9, 'T');
            if (!zCheckOffset && str.length() <= i9) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(i6, i8 - 1, i10);
                parsePosition.setIndex(i9);
                return gregorianCalendar.getTime();
            }
            if (zCheckOffset) {
                int i11 = i7 + 5;
                int i12 = parseInt(str, i7 + 3, i11);
                if (checkOffset(str, i11, ':')) {
                    i11 = i7 + 6;
                }
                int i13 = i11 + 2;
                int i14 = parseInt(str, i11, i13);
                if (checkOffset(str, i13, ':')) {
                    i13 = i11 + 3;
                }
                if (str.length() <= i13 || (cCharAt2 = str.charAt(i13)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i9 = i13;
                    i = i12;
                    i2 = i14;
                } else {
                    int i15 = i13 + 2;
                    i4 = parseInt(str, i13, i15);
                    if (i4 > 59 && i4 < 63) {
                        i4 = 59;
                    }
                    if (checkOffset(str, i15, '.')) {
                        int i16 = i13 + 3;
                        int iIndexOfNonDigit = indexOfNonDigit(str, i13 + 4);
                        int iMin = Math.min(iIndexOfNonDigit, i13 + 6);
                        int i17 = parseInt(str, i16, iMin);
                        int i18 = iMin - i16;
                        if (i18 == 1) {
                            i17 *= 100;
                        } else if (i18 == 2) {
                            i17 *= 10;
                        }
                        i = i12;
                        i9 = iIndexOfNonDigit;
                        i2 = i14;
                        i3 = i17;
                    } else {
                        i = i12;
                        i9 = i15;
                        i2 = i14;
                        i3 = 0;
                    }
                }
                if (str.length() > i9) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i9);
                if (cCharAt == 'Z') {
                    timeZone = TIMEZONE_UTC;
                    length = i9 + 1;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i9);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring.concat("00");
                    }
                    length = i9 + strSubstring.length();
                    if (!"+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                        timeZone = TIMEZONE_UTC;
                    } else {
                        String strConcat = "GMT".concat(strSubstring);
                        TimeZone timeZone2 = TimeZone.getTimeZone(strConcat);
                        String id = timeZone2.getID();
                        if (!id.equals(strConcat) && !id.replace(":", "").equals(strConcat)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + strConcat + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, i6);
                gregorianCalendar2.set(2, i8 - 1);
                gregorianCalendar2.set(5, i10);
                gregorianCalendar2.set(11, i);
                gregorianCalendar2.set(12, i2);
                gregorianCalendar2.set(13, i4);
                gregorianCalendar2.set(14, i3);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            if (str.length() > i9) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i9);
            if (cCharAt == 'Z') {
                timeZone = TIMEZONE_UTC;
                length = i9 + 1;
            } else {
                if (cCharAt != '+') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i9);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring.concat("00");
                }
                length = i9 + strSubstring.length();
                if ("+0000".equals(strSubstring)) {
                    timeZone = TIMEZONE_UTC;
                } else {
                    timeZone = TIMEZONE_UTC;
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, i6);
            gregorianCalendar3.set(2, i8 - 1);
            gregorianCalendar3.set(5, i10);
            gregorianCalendar3.set(11, i);
            gregorianCalendar3.set(12, i2);
            gregorianCalendar3.set(13, i4);
            gregorianCalendar3.set(14, i3);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IndexOutOfBoundsException e) {
            e = e;
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (NumberFormatException e2) {
            e = e2;
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (IllegalArgumentException e3) {
            e = e3;
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException3 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }

    private static int parseInt(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
            }
            i3 = (i3 * 10) - iDigit2;
            i4 = i5;
        }
        return -i3;
    }

    public static String format(Date date, boolean z) {
        return format(date, z, TIMEZONE_UTC);
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }
}
