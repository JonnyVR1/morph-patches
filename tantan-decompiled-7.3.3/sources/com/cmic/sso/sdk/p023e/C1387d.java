package com.cmic.sso.sdk.p023e;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.d */
/* JADX INFO: loaded from: classes.dex */
public class C1387d {
    /* JADX INFO: renamed from: a */
    public static String m7290a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return C1400q.m7357a(messageDigest.digest());
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m7289a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return m7290a(str.getBytes("utf-8"));
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }
}
