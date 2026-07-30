package com.cmic.sso.sdk.p022e;

import android.text.TextUtils;
import com.cmic.sso.sdk.C1316a;
import com.cmic.sso.sdk.p014a.C1317a;
import com.meituan.robust.Constants;
import java.security.SecureRandom;
import java.util.UUID;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.q */
/* JADX INFO: loaded from: classes.dex */
public class C1377q {

    /* JADX INFO: renamed from: a */
    private static final char[] f5724a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static String m7303a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f5724a;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: b */
    public static void m7308b(C1316a c1316a, String str) {
        if (TextUtils.isEmpty(c1316a.m6969b("interfaceCode", ""))) {
            c1316a.m6961a("interfaceCode", str);
            return;
        }
        c1316a.m6961a("interfaceCode", c1316a.m6968b("interfaceCode") + Constants.PACKNAME_END + str);
    }

    /* JADX INFO: renamed from: c */
    public static void m7310c(C1316a c1316a, String str) {
        if (TextUtils.isEmpty(c1316a.m6969b("interfaceElasped", ""))) {
            c1316a.m6961a("interfaceElasped", str);
            return;
        }
        c1316a.m6961a("interfaceElasped", c1316a.m6968b("interfaceElasped") + Constants.PACKNAME_END + str);
    }

    /* JADX INFO: renamed from: d */
    private static String m7311d() {
        return UUID.randomUUID().toString();
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m7306a() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public static String m7307b() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /* JADX INFO: renamed from: c */
    public static String m7309c() {
        return m7311d().replace("-", "");
    }

    /* JADX INFO: renamed from: a */
    public static void m7304a(C1316a c1316a, String str) {
        if (TextUtils.isEmpty(c1316a.m6969b("interfaceType", ""))) {
            c1316a.m6961a("interfaceType", str);
            return;
        }
        c1316a.m6961a("interfaceType", c1316a.m6968b("interfaceType") + Constants.PACKNAME_END + str);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7305a(C1317a c1317a) {
        return C1371k.m7272a("logCloseTime", 0L) + ((long) (c1317a.m6995l() * 3600000)) >= System.currentTimeMillis();
    }
}
