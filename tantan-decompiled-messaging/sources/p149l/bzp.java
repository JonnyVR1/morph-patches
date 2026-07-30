package p149l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class bzp {
    /* JADX INFO: renamed from: a */
    public static void m104629a(ByteBuffer byteBuffer, double d) {
        int i = (int) (d * 1.073741824E9d);
        byteBuffer.put((byte) (((-16777216) & i) >> 24));
        byteBuffer.put((byte) ((16711680 & i) >> 16));
        byteBuffer.put((byte) ((65280 & i) >> 8));
        byteBuffer.put((byte) (i & 255));
    }

    /* JADX INFO: renamed from: b */
    public static void m104630b(ByteBuffer byteBuffer, double d) {
        int i = (int) (d * 65536.0d);
        byteBuffer.put((byte) (((-16777216) & i) >> 24));
        byteBuffer.put((byte) ((16711680 & i) >> 16));
        byteBuffer.put((byte) ((65280 & i) >> 8));
        byteBuffer.put((byte) (i & 255));
    }

    /* JADX INFO: renamed from: c */
    public static void m104631c(ByteBuffer byteBuffer, double d) {
        short s = (short) (d * 256.0d);
        byteBuffer.put((byte) ((65280 & s) >> 8));
        byteBuffer.put((byte) (s & 255));
    }

    /* JADX INFO: renamed from: d */
    public static void m104632d(ByteBuffer byteBuffer, String str) {
        if (str.getBytes().length != 3) {
            qtc0.m176411a("\"", str, "\" language string isn't exactly 3 characters long!");
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            i += (str.getBytes()[i2] - 96) << ((2 - i2) * 5);
        }
        m104633e(byteBuffer, i);
    }

    /* JADX INFO: renamed from: e */
    public static void m104633e(ByteBuffer byteBuffer, int i) {
        m104638j(byteBuffer, (65535 & i) >> 8);
        m104638j(byteBuffer, i & 255);
    }

    /* JADX INFO: renamed from: f */
    public static void m104634f(ByteBuffer byteBuffer, int i) {
        int i2 = i & 16777215;
        m104633e(byteBuffer, i2 >> 8);
        m104638j(byteBuffer, i2);
    }

    /* JADX INFO: renamed from: g */
    public static void m104635g(ByteBuffer byteBuffer, long j) {
        byteBuffer.putInt((int) j);
    }

    /* JADX INFO: renamed from: h */
    public static void m104636h(ByteBuffer byteBuffer, long j) {
        m104633e(byteBuffer, (int) ((281474976710655L & j) >> 32));
        m104635g(byteBuffer, j & 4294967295L);
    }

    /* JADX INFO: renamed from: i */
    public static void m104637i(ByteBuffer byteBuffer, long j) {
        byteBuffer.putLong(j);
    }

    /* JADX INFO: renamed from: j */
    public static void m104638j(ByteBuffer byteBuffer, int i) {
        byteBuffer.put((byte) (i & 255));
    }

    /* JADX INFO: renamed from: k */
    public static void m104639k(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(mck0.m154017b(str));
        m104638j(byteBuffer, 0);
    }

    /* JADX INFO: renamed from: l */
    public static void m104640l(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(mck0.m154017b(str));
        m104638j(byteBuffer, 0);
    }
}
