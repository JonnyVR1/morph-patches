package p149l;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes7.dex */
public final class be2 {

    /* JADX INFO: renamed from: a */
    public final de2[] f75096a;

    /* JADX INFO: renamed from: b */
    public int f75097b;

    /* JADX INFO: renamed from: c */
    public final int f75098c;

    /* JADX INFO: renamed from: d */
    public final int f75099d;

    public be2(int i, int i2) {
        de2[] de2VarArr = new de2[i];
        this.f75096a = de2VarArr;
        int length = de2VarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f75096a[i3] = new de2(((i2 + 4) * 17) + 1);
        }
        this.f75099d = i2 * 17;
        this.f75098c = i;
        this.f75097b = -1;
    }

    /* JADX INFO: renamed from: a */
    public de2 m101303a() {
        return this.f75096a[this.f75097b];
    }

    /* JADX INFO: renamed from: b */
    public byte[][] m101304b(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f75098c * i2, this.f75099d * i);
        int i3 = this.f75098c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f75096a[i4 / i2].m111091b(i);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public void m101305c() {
        this.f75097b++;
    }
}
