package org.apache.commons.sudcompress.compressors.gzip;

import java.util.LinkedHashMap;
import java.util.Locale;
import p149l.kig0;

/* JADX INFO: loaded from: classes2.dex */
public class GzipUtils {
    private static final kig0 fileNameUtil;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(".tgz", ".tar");
        linkedHashMap.put(".taz", ".tar");
        linkedHashMap.put(".svgz", ".svg");
        linkedHashMap.put(".cpgz", ".cpio");
        linkedHashMap.put(".wmz", ".wmf");
        linkedHashMap.put(".emz", ".emf");
        linkedHashMap.put(".gz", "");
        linkedHashMap.put(".z", "");
        linkedHashMap.put("-gz", "");
        linkedHashMap.put("-z", "");
        linkedHashMap.put("_z", "");
        fileNameUtil = new kig0(linkedHashMap);
    }

    private GzipUtils() {
    }

    public static String getCompressedFilename(String str) {
        kig0 kig0Var = fileNameUtil;
        kig0Var.getClass();
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        int length = lowerCase.length();
        for (int i = kig0Var.f123335f; i <= kig0Var.f123334e && i < length; i++) {
            int i2 = length - i;
            String str2 = (String) kig0Var.f123330a.get(lowerCase.substring(i2));
            if (str2 != null) {
                return str.substring(0, i2).concat(str2);
            }
        }
        return str + kig0Var.f123336g;
    }

    public static String getUncompressedFilename(String str) {
        kig0 kig0Var = fileNameUtil;
        kig0Var.getClass();
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        int length = lowerCase.length();
        for (int i = kig0Var.f123333d; i <= kig0Var.f123332c && i < length; i++) {
            int i2 = length - i;
            String str2 = (String) kig0Var.f123331b.get(lowerCase.substring(i2));
            if (str2 != null) {
                return str.substring(0, i2).concat(str2);
            }
        }
        return str;
    }

    public static boolean isCompressedFilename(String str) {
        kig0 kig0Var = fileNameUtil;
        kig0Var.getClass();
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        int length = lowerCase.length();
        for (int i = kig0Var.f123333d; i <= kig0Var.f123332c && i < length; i++) {
            if (kig0Var.f123331b.containsKey(lowerCase.substring(length - i))) {
                return true;
            }
        }
        return false;
    }
}
