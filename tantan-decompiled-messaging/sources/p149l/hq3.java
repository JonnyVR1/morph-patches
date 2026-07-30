package p149l;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class hq3 {

    /* JADX INFO: renamed from: a */
    public final byte[][] f109026a;

    /* JADX INFO: renamed from: b */
    public final int f109027b;

    /* JADX INFO: renamed from: c */
    public final int f109028c;

    public hq3(int i, int i2) {
        this.f109026a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.f109027b = i;
        this.f109028c = i2;
    }

    /* JADX INFO: renamed from: a */
    public void m132421a(byte b) {
        for (byte[] bArr : this.f109026a) {
            Arrays.fill(bArr, b);
        }
    }

    /* JADX INFO: renamed from: b */
    public byte m132422b(int i, int i2) {
        return this.f109026a[i2][i];
    }

    /* JADX INFO: renamed from: c */
    public byte[][] m132423c() {
        return this.f109026a;
    }

    /* JADX INFO: renamed from: d */
    public int m132424d() {
        return this.f109028c;
    }

    /* JADX INFO: renamed from: e */
    public int m132425e() {
        return this.f109027b;
    }

    /* JADX INFO: renamed from: f */
    public void m132426f(int i, int i2, int i3) {
        this.f109026a[i2][i] = (byte) i3;
    }

    /* JADX INFO: renamed from: g */
    public void m132427g(int i, int i2, boolean z) {
        this.f109026a[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f109027b * 2 * this.f109028c) + 2);
        for (int i = 0; i < this.f109028c; i++) {
            byte[] bArr = this.f109026a[i];
            for (int i2 = 0; i2 < this.f109027b; i2++) {
                byte b = bArr[i2];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
