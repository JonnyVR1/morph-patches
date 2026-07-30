package org.fourthline.cling.model;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import p149l.aag0;
import p149l.ig3;
import p149l.upk0;

/* JADX INFO: loaded from: classes3.dex */
public class ModelUtil {
    public static final boolean ANDROID_EMULATOR;
    public static final boolean ANDROID_RUNTIME;

    static {
        boolean z = true;
        boolean z2 = false;
        ANDROID_RUNTIME = Thread.currentThread().getContextClassLoader().loadClass("android.os.Build").getField("ID").get(null) != null;
        try {
            String str = (String) Thread.currentThread().getContextClassLoader().loadClass("android.os.Build").getField("PRODUCT").get(null);
            if (!"google_sdk".equals(str) && !"sdk".equals(str)) {
                z = false;
            }
            z2 = z;
        } catch (Exception unused) {
        }
        ANDROID_EMULATOR = z2;
    }

    public static String commaToNewline(String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA)) {
            sb.append(str2);
            sb.append(",\n");
        }
        if (sb.length() > 2) {
            sb.deleteCharAt(sb.length() - 2);
        }
        return sb.toString();
    }

    public static String[] fromCommaSeparatedList(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (z) {
            str = str.replaceAll("\\\\,", "XXX1122334455XXX");
        }
        String[] strArrSplit = str.split(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
        for (int i = 0; i < strArrSplit.length; i++) {
            String strReplaceAll = strArrSplit[i].replaceAll("XXX1122334455XXX", com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
            strArrSplit[i] = strReplaceAll;
            strArrSplit[i] = strReplaceAll.replaceAll("\\\\\\\\", "\\\\");
        }
        return strArrSplit;
    }

    public static long fromTimeString(String str) {
        if (str.lastIndexOf(".") != -1) {
            str = str.substring(0, str.lastIndexOf("."));
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length == 3) {
            return (Long.parseLong(strArrSplit[0]) * 3600) + (Long.parseLong(strArrSplit[1]) * 60) + Long.parseLong(strArrSplit[2]);
        }
        ig3.m135964a("Can't parse time string: ".concat(str));
        return 0L;
    }

    public static byte[] getFirstNetworkInterfaceHardwareAddress() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (!networkInterface.isLoopback() && networkInterface.isUp() && networkInterface.getHardwareAddress() != null) {
                    return networkInterface.getHardwareAddress();
                }
            }
            upk0.m194883a("Could not discover first network interface hardware address");
            return null;
        } catch (Exception unused) {
            upk0.m194883a("Could not discover first network interface hardware address");
            return null;
        }
    }

    public static InetAddress getInetAddressByName(String str) {
        try {
            return InetAddress.getByName(str);
        } catch (Exception e) {
            aag0.m95543a(e);
            return null;
        }
    }

    public static String getLocalHostName(boolean z) {
        try {
            String hostName = InetAddress.getLocalHost().getHostName();
            if (!z && hostName.indexOf(".") != -1) {
                return hostName.substring(0, hostName.indexOf("."));
            }
            return hostName;
        } catch (Exception unused) {
            return "UNKNOWN HOST";
        }
    }

    public static boolean isStringConvertibleType(Set<Class> set, Class cls) {
        if (cls.isEnum()) {
            return true;
        }
        Iterator<Class> it = set.iterator();
        while (it.hasNext()) {
            if (it.next().isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidUDAName(String str) {
        if (ANDROID_RUNTIME) {
            return (str == null || str.length() == 0) ? false : true;
        }
        return (str == null || str.length() == 0 || str.toLowerCase(Locale.ROOT).startsWith("xml") || !str.matches(Constants.REGEX_UDA_NAME)) ? false : true;
    }

    public static String toCommaSeparatedList(Object[] objArr, boolean z, boolean z2) {
        if (objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            String strReplaceAll = obj.toString().replaceAll("\\\\", "\\\\\\\\");
            if (z) {
                strReplaceAll = strReplaceAll.replaceAll(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA, "\\\\,");
            }
            if (z2) {
                strReplaceAll = strReplaceAll.replaceAll("\"", "\\\"");
            }
            sb.append(strReplaceAll);
            sb.append(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA);
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String toTimeString(long j) {
        long j2 = j / 3600;
        long j3 = j % 3600;
        long j4 = j3 / 60;
        long j5 = j3 % 60;
        StringBuilder sb = new StringBuilder();
        sb.append(j2 < 10 ? "0" : "");
        sb.append(j2);
        sb.append(":");
        sb.append(j4 < 10 ? "0" : "");
        sb.append(j4);
        sb.append(":");
        sb.append(j5 < 10 ? "0" : "");
        sb.append(j5);
        return sb.toString();
    }

    public static String[] fromCommaSeparatedList(String str) {
        return fromCommaSeparatedList(str, true);
    }

    public static String toCommaSeparatedList(Object[] objArr) {
        return toCommaSeparatedList(objArr, true, false);
    }
}
