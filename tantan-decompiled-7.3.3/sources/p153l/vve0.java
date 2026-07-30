package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class vve0 {

    /* JADX INFO: renamed from: a */
    public int f185924a;

    /* JADX INFO: renamed from: b */
    public final int[] f185925b = new int[10];

    /* JADX INFO: renamed from: a */
    public void m203003a() {
        this.f185924a = 0;
        Arrays.fill(this.f185925b, 0);
    }

    /* JADX INFO: renamed from: b */
    public int m203004b(int i) {
        return this.f185925b[i];
    }

    /* JADX INFO: renamed from: c */
    public int m203005c() {
        if ((this.f185924a & 2) != 0) {
            return this.f185925b[1];
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public int m203006d() {
        return (this.f185924a & 128) != 0 ? this.f185925b[7] : p7f.COLOR_SPACE_UNCALIBRATED;
    }

    /* JADX INFO: renamed from: e */
    public int m203007e(int i) {
        return (this.f185924a & 16) != 0 ? this.f185925b[4] : i;
    }

    /* JADX INFO: renamed from: f */
    public int m203008f(int i) {
        return (this.f185924a & 32) != 0 ? this.f185925b[5] : i;
    }

    /* JADX INFO: renamed from: g */
    public boolean m203009g(int i) {
        return (this.f185924a & (1 << i)) != 0;
    }

    /* JADX INFO: renamed from: h */
    public void m203010h(vve0 vve0Var) {
        for (int i = 0; i < 10; i++) {
            if (vve0Var.m203009g(i)) {
                m203011i(i, vve0Var.m203004b(i));
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public vve0 m203011i(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f185925b;
            if (i < iArr.length) {
                this.f185924a = (1 << i) | this.f185924a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: j */
    public int m203012j() {
        return Integer.bitCount(this.f185924a);
    }
}
