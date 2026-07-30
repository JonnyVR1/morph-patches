package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class one0 {

    /* JADX INFO: renamed from: a */
    public int f144778a;

    /* JADX INFO: renamed from: b */
    public final int[] f144779b = new int[10];

    /* JADX INFO: renamed from: a */
    public void m165170a() {
        this.f144778a = 0;
        Arrays.fill(this.f144779b, 0);
    }

    /* JADX INFO: renamed from: b */
    public int m165171b(int i) {
        return this.f144779b[i];
    }

    /* JADX INFO: renamed from: c */
    public int m165172c() {
        if ((this.f144778a & 2) != 0) {
            return this.f144779b[1];
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public int m165173d() {
        return (this.f144778a & 128) != 0 ? this.f144779b[7] : j6f.COLOR_SPACE_UNCALIBRATED;
    }

    /* JADX INFO: renamed from: e */
    public int m165174e(int i) {
        return (this.f144778a & 16) != 0 ? this.f144779b[4] : i;
    }

    /* JADX INFO: renamed from: f */
    public int m165175f(int i) {
        return (this.f144778a & 32) != 0 ? this.f144779b[5] : i;
    }

    /* JADX INFO: renamed from: g */
    public boolean m165176g(int i) {
        return (this.f144778a & (1 << i)) != 0;
    }

    /* JADX INFO: renamed from: h */
    public void m165177h(one0 one0Var) {
        for (int i = 0; i < 10; i++) {
            if (one0Var.m165176g(i)) {
                m165178i(i, one0Var.m165171b(i));
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public one0 m165178i(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f144779b;
            if (i < iArr.length) {
                this.f144778a = (1 << i) | this.f144778a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: j */
    public int m165179j() {
        return Integer.bitCount(this.f144778a);
    }
}
