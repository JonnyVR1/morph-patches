package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class r45 implements mke0 {

    /* JADX INFO: renamed from: a */
    public final int f161142a;

    /* JADX INFO: renamed from: b */
    public final int[] f161143b;

    /* JADX INFO: renamed from: c */
    public final long[] f161144c;

    /* JADX INFO: renamed from: d */
    public final long[] f161145d;

    /* JADX INFO: renamed from: e */
    public final long[] f161146e;

    /* JADX INFO: renamed from: f */
    public final long f161147f;

    public r45(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f161143b = iArr;
        this.f161144c = jArr;
        this.f161145d = jArr2;
        this.f161146e = jArr3;
        int length = iArr.length;
        this.f161142a = length;
        if (length > 0) {
            this.f161147f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f161147f = 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m179740a(long j) {
        return bmk0.m105141i(this.f161146e, j, true, true);
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: d */
    public mke0.C18640a mo107791d(long j) {
        int iM179740a = m179740a(j);
        oke0 oke0Var = new oke0(this.f161146e[iM179740a], this.f161144c[iM179740a]);
        if (oke0Var.f147751a >= j || iM179740a == this.f161142a - 1) {
            return new mke0.C18640a(oke0Var);
        }
        int i = iM179740a + 1;
        return new mke0.C18640a(oke0Var, new oke0(this.f161146e[i], this.f161144c[i]));
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: e */
    public boolean mo107792e() {
        return true;
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: i */
    public long mo107793i() {
        return this.f161147f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f161142a + ", sizes=" + Arrays.toString(this.f161143b) + ", offsets=" + Arrays.toString(this.f161144c) + ", timeUs=" + Arrays.toString(this.f161146e) + ", durationsUs=" + Arrays.toString(this.f161145d) + ")";
    }
}
