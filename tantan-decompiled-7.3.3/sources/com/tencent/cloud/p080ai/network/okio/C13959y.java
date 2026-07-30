package com.tencent.cloud.p080ai.network.okio;

import java.nio.charset.Charset;
import p153l.zg3;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.y */
/* JADX INFO: loaded from: classes12.dex */
public final class C13959y {

    /* JADX INFO: renamed from: a */
    public static final Charset f57868a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static void m83164a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            zg3.m219589a("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)});
        }
    }

    /* JADX INFO: renamed from: a */
    public static short m83163a(short s) {
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    /* JADX INFO: renamed from: a */
    public static int m83162a(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* JADX INFO: renamed from: a */
    public static void m83165a(Throwable th) throws Throwable {
        throw th;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m83166a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
