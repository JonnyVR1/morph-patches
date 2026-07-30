package com.cmic.sso.sdk.p023e;

import android.text.TextUtils;
import com.cmic.sso.sdk.C1339a;
import com.cmic.sso.sdk.p015a.C1340a;
import com.meituan.robust.Constants;
import java.security.SecureRandom;
import java.util.UUID;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.q */
/* JADX INFO: loaded from: classes.dex */
public class C1400q {

    /* JADX INFO: renamed from: a */
    private static final char[] f5761a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static String m7357a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f5761a;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: b */
    public static void m7362b(C1339a c1339a, String str) {
        if (TextUtils.isEmpty(c1339a.m7023b("interfaceCode", ""))) {
            c1339a.m7015a("interfaceCode", str);
            return;
        }
        c1339a.m7015a("interfaceCode", c1339a.m7022b("interfaceCode") + Constants.PACKNAME_END + str);
    }

    /* JADX INFO: renamed from: c */
    public static void m7364c(C1339a c1339a, String str) {
        if (TextUtils.isEmpty(c1339a.m7023b("interfaceElasped", ""))) {
            c1339a.m7015a("interfaceElasped", str);
            return;
        }
        c1339a.m7015a("interfaceElasped", c1339a.m7022b("interfaceElasped") + Constants.PACKNAME_END + str);
    }

    /* JADX INFO: renamed from: d */
    private static String m7365d() {
        return UUID.randomUUID().toString();
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m7360a() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public static String m7361b() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /* JADX INFO: renamed from: c */
    public static String m7363c() {
        return m7365d().replace("-", "");
    }

    /* JADX INFO: renamed from: a */
    public static void m7358a(C1339a c1339a, String str) {
        if (TextUtils.isEmpty(c1339a.m7023b("interfaceType", ""))) {
            c1339a.m7015a("interfaceType", str);
            return;
        }
        c1339a.m7015a("interfaceType", c1339a.m7022b("interfaceType") + Constants.PACKNAME_END + str);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7359a(C1340a c1340a) {
        return C1394k.m7326a("logCloseTime", 0L) + ((long) (c1340a.m7049l() * 3600000)) >= System.currentTimeMillis();
    }
}
