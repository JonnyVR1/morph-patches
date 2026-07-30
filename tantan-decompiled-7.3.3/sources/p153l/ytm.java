package p153l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ytm implements mke0 {

    /* JADX INFO: renamed from: a */
    public final long[] f201522a;

    /* JADX INFO: renamed from: b */
    public final long[] f201523b;

    /* JADX INFO: renamed from: c */
    public final long f201524c;

    /* JADX INFO: renamed from: d */
    public final boolean f201525d;

    public ytm(long[] jArr, long[] jArr2, long j) {
        w11.m204365a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f201525d = z;
        if (!z || jArr2[0] <= 0) {
            this.f201522a = jArr;
            this.f201523b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f201522a = jArr3;
            long[] jArr4 = new long[i];
            this.f201523b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f201524c = j;
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: d */
    public mke0.C18640a mo107791d(long j) {
        if (!this.f201525d) {
            return new mke0.C18640a(oke0.f147750c);
        }
        int iM105141i = bmk0.m105141i(this.f201523b, j, true, true);
        oke0 oke0Var = new oke0(this.f201523b[iM105141i], this.f201522a[iM105141i]);
        if (oke0Var.f147751a == j || iM105141i == this.f201523b.length - 1) {
            return new mke0.C18640a(oke0Var);
        }
        int i = iM105141i + 1;
        return new mke0.C18640a(oke0Var, new oke0(this.f201523b[i], this.f201522a[i]));
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: e */
    public boolean mo107792e() {
        return this.f201525d;
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: i */
    public long mo107793i() {
        return this.f201524c;
    }
}
