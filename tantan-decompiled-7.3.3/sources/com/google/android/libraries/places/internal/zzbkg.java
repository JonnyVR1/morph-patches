package com.google.android.libraries.places.internal;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p153l.gzi0;
import p153l.iig0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbkg {
    private static final long zza = 1000000000;

    public static Boolean zza(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static Double zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            gzi0.m133102a("value '%s' for key '%s' in '%s' is not a number", new Object[]{obj, str, map});
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            gzi0.m133102a("value '%s' for key '%s' is not a double", new Object[]{obj, str});
            return null;
        }
    }

    public static Integer zzc(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            Double d = (Double) obj;
            int iIntValue = d.intValue();
            if (iIntValue == d.doubleValue()) {
                return Integer.valueOf(iIntValue);
            }
            throw new ClassCastException("Number expected to be integer: ".concat(String.valueOf(d)));
        }
        if (!(obj instanceof String)) {
            gzi0.m133102a("value '%s' for key '%s' is not an integer", new Object[]{obj, str});
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) obj));
        } catch (NumberFormatException unused) {
            gzi0.m133102a("value '%s' for key '%s' is not an integer", new Object[]{obj, str});
            return null;
        }
    }

    public static Long zzd(Map map, String str) {
        boolean z;
        int iCharAt;
        String strZze = zze(map, str);
        if (strZze == null) {
            return null;
        }
        try {
            if (strZze.isEmpty() || strZze.charAt(strZze.length() - 1) != 's') {
                throw new ParseException("Invalid duration string: ".concat(strZze), 0);
            }
            if (strZze.charAt(0) == '-') {
                strZze = strZze.substring(1);
                z = true;
            } else {
                z = false;
            }
            String strSubstring = strZze.substring(0, strZze.length() - 1);
            String strSubstring2 = "";
            int iIndexOf = strSubstring.indexOf(46);
            if (iIndexOf != -1) {
                strSubstring2 = strSubstring.substring(iIndexOf + 1);
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            long j = Long.parseLong(strSubstring);
            if (strSubstring2.isEmpty()) {
                iCharAt = 0;
            } else {
                iCharAt = 0;
                for (int i = 0; i < 9; i++) {
                    iCharAt *= 10;
                    if (i < strSubstring2.length()) {
                        if (strSubstring2.charAt(i) < '0' || strSubstring2.charAt(i) > '9') {
                            throw new ParseException("Invalid nanoseconds.", 0);
                        }
                        iCharAt += strSubstring2.charAt(i) - '0';
                    }
                }
            }
            if (j < 0) {
                throw new ParseException("Invalid duration string: ".concat(strZze), 0);
            }
            if (z) {
                j = -j;
                iCharAt = -iCharAt;
            }
            long j2 = iCharAt;
            try {
                long j3 = zza;
                if (j2 <= (-j3) || j2 >= j3) {
                    long j4 = j2 / j3;
                    int i2 = zzajm.zza;
                    long j5 = j + j4;
                    if (!((j ^ j4) < 0) && !(((j ^ j5) > 0 ? 1 : ((j ^ j5) == 0 ? 0 : -1)) >= 0)) {
                        throw new ArithmeticException("overflow: checkedAdd(" + j + ", " + j4 + ")");
                    }
                    iCharAt = (int) (j2 % j3);
                    j = j5;
                }
                if (j > 0 && iCharAt < 0) {
                    j--;
                    iCharAt = (int) (((long) iCharAt) + j3);
                }
                if (j < 0 && iCharAt > 0) {
                    j++;
                    iCharAt = (int) (((long) iCharAt) - j3);
                }
                if (j >= -315576000000L && j <= 315576000000L) {
                    long j6 = iCharAt;
                    if (j6 >= -999999999 && j6 < j3 && ((j >= 0 && iCharAt >= 0) || (j <= 0 && iCharAt <= 0))) {
                        long nanos = TimeUnit.SECONDS.toNanos(j);
                        long j7 = nanos + j6;
                        if (!(((nanos ^ j7) >= 0) | ((nanos ^ j6) < 0))) {
                            j7 = (1 ^ (j7 >>> 63)) + Long.MAX_VALUE;
                        }
                        return Long.valueOf(j7);
                    }
                }
                throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j), Integer.valueOf(iCharAt)));
            } catch (IllegalArgumentException unused) {
                throw new ParseException("Duration value is out of range.", 0);
            }
        } catch (ParseException e) {
            iig0.m140070a(e);
            return null;
        }
    }

    public static String zze(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static List zzf(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
            }
        }
        return list;
    }

    public static List zzg(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List zzh(Map map, String str) {
        List listZzg = zzg(map, str);
        if (listZzg == null) {
            return null;
        }
        zzf(listZzg);
        return listZzg;
    }

    public static List zzi(Map map, String str) {
        List listZzg = zzg(map, str);
        if (listZzg == null) {
            return null;
        }
        for (int i = 0; i < listZzg.size(); i++) {
            if (!(listZzg.get(i) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listZzg.get(i), Integer.valueOf(i), listZzg));
            }
        }
        return listZzg;
    }

    public static Map zzj(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }
}
