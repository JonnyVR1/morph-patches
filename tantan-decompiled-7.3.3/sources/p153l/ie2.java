package p153l;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes7.dex */
public final class ie2 {

    /* JADX INFO: renamed from: a */
    public final ke2[] f114545a;

    /* JADX INFO: renamed from: b */
    public int f114546b;

    /* JADX INFO: renamed from: c */
    public final int f114547c;

    /* JADX INFO: renamed from: d */
    public final int f114548d;

    public ie2(int i, int i2) {
        ke2[] ke2VarArr = new ke2[i];
        this.f114545a = ke2VarArr;
        int length = ke2VarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f114545a[i3] = new ke2(((i2 + 4) * 17) + 1);
        }
        this.f114548d = i2 * 17;
        this.f114547c = i;
        this.f114546b = -1;
    }

    /* JADX INFO: renamed from: a */
    public ke2 m139585a() {
        return this.f114545a[this.f114546b];
    }

    /* JADX INFO: renamed from: b */
    public byte[][] m139586b(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f114547c * i2, this.f114548d * i);
        int i3 = this.f114547c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f114545a[i4 / i2].m149291b(i);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public void m139587c() {
        this.f114546b++;
    }
}
