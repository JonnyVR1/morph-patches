package com.google.android.libraries.places.internal;

import p153l.mnd0;
import p153l.wg3;

/* JADX INFO: loaded from: classes7.dex */
public final class zzrr {
    public static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        mnd0.m159157a(str.concat(" must not be null"));
        return null;
    }

    public static String zzb(String str) {
        if (str.isEmpty()) {
            wg3.m206174a("identifier must not be empty");
            return null;
        }
        if (!zzc(str.charAt(0))) {
            wg3.m206174a("identifier must start with an ASCII letter: ".concat(str));
            return null;
        }
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!zzc(cCharAt) && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '_')) {
                wg3.m206174a("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                return null;
            }
        }
        return str;
    }

    private static boolean zzc(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }
}
