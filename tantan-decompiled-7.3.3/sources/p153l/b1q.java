package p153l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class b1q {
    /* JADX INFO: renamed from: a */
    public static void m101489a(ByteBuffer byteBuffer, double d) {
        int i = (int) (d * 1.073741824E9d);
        byteBuffer.put((byte) (((-16777216) & i) >> 24));
        byteBuffer.put((byte) ((16711680 & i) >> 16));
        byteBuffer.put((byte) ((65280 & i) >> 8));
        byteBuffer.put((byte) (i & 255));
    }

    /* JADX INFO: renamed from: b */
    public static void m101490b(ByteBuffer byteBuffer, double d) {
        int i = (int) (d * 65536.0d);
        byteBuffer.put((byte) (((-16777216) & i) >> 24));
        byteBuffer.put((byte) ((16711680 & i) >> 16));
        byteBuffer.put((byte) ((65280 & i) >> 8));
        byteBuffer.put((byte) (i & 255));
    }

    /* JADX INFO: renamed from: c */
    public static void m101491c(ByteBuffer byteBuffer, double d) {
        short s = (short) (d * 256.0d);
        byteBuffer.put((byte) ((65280 & s) >> 8));
        byteBuffer.put((byte) (s & 255));
    }

    /* JADX INFO: renamed from: d */
    public static void m101492d(ByteBuffer byteBuffer, String str) {
        if (str.getBytes().length != 3) {
            v1d0.m199002a("\"", str, "\" language string isn't exactly 3 characters long!");
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            i += (str.getBytes()[i2] - 96) << ((2 - i2) * 5);
        }
        m101493e(byteBuffer, i);
    }

    /* JADX INFO: renamed from: e */
    public static void m101493e(ByteBuffer byteBuffer, int i) {
        m101498j(byteBuffer, (65535 & i) >> 8);
        m101498j(byteBuffer, i & 255);
    }

    /* JADX INFO: renamed from: f */
    public static void m101494f(ByteBuffer byteBuffer, int i) {
        int i2 = i & 16777215;
        m101493e(byteBuffer, i2 >> 8);
        m101498j(byteBuffer, i2);
    }

    /* JADX INFO: renamed from: g */
    public static void m101495g(ByteBuffer byteBuffer, long j) {
        byteBuffer.putInt((int) j);
    }

    /* JADX INFO: renamed from: h */
    public static void m101496h(ByteBuffer byteBuffer, long j) {
        m101493e(byteBuffer, (int) ((281474976710655L & j) >> 32));
        m101495g(byteBuffer, j & 4294967295L);
    }

    /* JADX INFO: renamed from: i */
    public static void m101497i(ByteBuffer byteBuffer, long j) {
        byteBuffer.putLong(j);
    }

    /* JADX INFO: renamed from: j */
    public static void m101498j(ByteBuffer byteBuffer, int i) {
        byteBuffer.put((byte) (i & 255));
    }

    /* JADX INFO: renamed from: k */
    public static void m101499k(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(slk0.m186593b(str));
        m101498j(byteBuffer, 0);
    }

    /* JADX INFO: renamed from: l */
    public static void m101500l(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(slk0.m186593b(str));
        m101498j(byteBuffer, 0);
    }
}
