package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class vfr0 {

    /* JADX INFO: renamed from: a */
    public int f183966a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f183967b;

    /* JADX INFO: renamed from: c */
    public int f183968c;

    /* JADX INFO: renamed from: d */
    public int f183969d;

    /* JADX INFO: renamed from: e */
    public int f183970e;

    /* JADX INFO: renamed from: f */
    public int f183971f;

    /* JADX INFO: renamed from: g */
    public int f183972g;

    /* JADX INFO: renamed from: a */
    public final boolean m201179a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!wfr0.m206157m(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i6 = i4 - 1;
        this.f183966a = i2;
        this.f183967b = wfr0.f188878a[3 - i3];
        int i7 = wfr0.f188879b[i5];
        this.f183969d = i7;
        if (i2 == 2) {
            i7 /= 2;
            this.f183969d = i7;
        } else if (i2 == 0) {
            i7 /= 4;
            this.f183969d = i7;
        }
        int i8 = (i >>> 9) & 1;
        this.f183972g = wfr0.m206156l(i2, i3);
        if (i3 == 3) {
            int i9 = i2 == 3 ? wfr0.f188880c[i6] : wfr0.f188881d[i6];
            this.f183971f = i9;
            this.f183968c = (((i9 * 12) / i7) + i8) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? wfr0.f188882e[i6] : wfr0.f188883f[i6];
                this.f183971f = i10;
                this.f183968c = ((i10 * 144) / i7) + i8;
            } else {
                int i11 = wfr0.f188884g[i6];
                this.f183971f = i11;
                this.f183968c = (((i3 == 1 ? 72 : 144) * i11) / i7) + i8;
            }
        }
        this.f183970e = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
