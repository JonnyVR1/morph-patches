package org.apache.commons.sudcompress.compressors.gzip;

import java.util.LinkedHashMap;
import java.util.Locale;
import p153l.sqg0;

/* JADX INFO: loaded from: classes2.dex */
public class GzipUtils {
    private static final sqg0 fileNameUtil;

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
        fileNameUtil = new sqg0(linkedHashMap);
    }

    private GzipUtils() {
    }

    public static String getCompressedFilename(String str) {
        sqg0 sqg0Var = fileNameUtil;
        sqg0Var.getClass();
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        int length = lowerCase.length();
        for (int i = sqg0Var.f170172f; i <= sqg0Var.f170171e && i < length; i++) {
            int i2 = length - i;
            String str2 = (String) sqg0Var.f170167a.get(lowerCase.substring(i2));
            if (str2 != null) {
                return str.substring(0, i2).concat(str2);
            }
        }
        return str + sqg0Var.f170173g;
    }

    public static String getUncompressedFilename(String str) {
        sqg0 sqg0Var = fileNameUtil;
        sqg0Var.getClass();
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        int length = lowerCase.length();
        for (int i = sqg0Var.f170170d; i <= sqg0Var.f170169c && i < length; i++) {
            int i2 = length - i;
            String str2 = (String) sqg0Var.f170168b.get(lowerCase.substring(i2));
            if (str2 != null) {
                return str.substring(0, i2).concat(str2);
            }
        }
        return str;
    }

    public static boolean isCompressedFilename(String str) {
        sqg0 sqg0Var = fileNameUtil;
        sqg0Var.getClass();
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        int length = lowerCase.length();
        for (int i = sqg0Var.f170170d; i <= sqg0Var.f170169c && i < length; i++) {
            if (sqg0Var.f170168b.containsKey(lowerCase.substring(length - i))) {
                return true;
            }
        }
        return false;
    }
}
