package p153l;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class hr3 {

    /* JADX INFO: renamed from: a */
    public final byte[][] f111220a;

    /* JADX INFO: renamed from: b */
    public final int f111221b;

    /* JADX INFO: renamed from: c */
    public final int f111222c;

    public hr3(int i, int i2) {
        this.f111220a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.f111221b = i;
        this.f111222c = i2;
    }

    /* JADX INFO: renamed from: a */
    public void m136736a(byte b) {
        for (byte[] bArr : this.f111220a) {
            Arrays.fill(bArr, b);
        }
    }

    /* JADX INFO: renamed from: b */
    public byte m136737b(int i, int i2) {
        return this.f111220a[i2][i];
    }

    /* JADX INFO: renamed from: c */
    public byte[][] m136738c() {
        return this.f111220a;
    }

    /* JADX INFO: renamed from: d */
    public int m136739d() {
        return this.f111222c;
    }

    /* JADX INFO: renamed from: e */
    public int m136740e() {
        return this.f111221b;
    }

    /* JADX INFO: renamed from: f */
    public void m136741f(int i, int i2, int i3) {
        this.f111220a[i2][i] = (byte) i3;
    }

    /* JADX INFO: renamed from: g */
    public void m136742g(int i, int i2, boolean z) {
        this.f111220a[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f111221b * 2 * this.f111222c) + 2);
        for (int i = 0; i < this.f111222c; i++) {
            byte[] bArr = this.f111220a[i];
            for (int i2 = 0; i2 < this.f111221b; i2++) {
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
