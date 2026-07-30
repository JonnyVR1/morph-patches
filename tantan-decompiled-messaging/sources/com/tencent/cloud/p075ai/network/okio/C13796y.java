package com.tencent.cloud.p075ai.network.okio;

import java.nio.charset.Charset;
import p149l.lg3;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.y */
/* JADX INFO: loaded from: classes13.dex */
public final class C13796y {

    /* JADX INFO: renamed from: a */
    public static final Charset f57020a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static void m81981a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            lg3.m149750a("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)});
        }
    }

    /* JADX INFO: renamed from: a */
    public static short m81980a(short s) {
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    /* JADX INFO: renamed from: a */
    public static int m81979a(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* JADX INFO: renamed from: a */
    public static void m81982a(Throwable th) throws Throwable {
        throw th;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m81983a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
