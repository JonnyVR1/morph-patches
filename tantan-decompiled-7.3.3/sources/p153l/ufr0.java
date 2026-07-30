package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class ufr0 implements bgr0 {

    /* JADX INFO: renamed from: a */
    public final long[] f178800a;

    /* JADX INFO: renamed from: b */
    public final long[] f178801b;

    /* JADX INFO: renamed from: c */
    public final long f178802c;

    /* JADX INFO: renamed from: d */
    public final boolean f178803d;

    public ufr0(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        lev0.m153956d(length == length2);
        boolean z = length2 > 0;
        this.f178803d = z;
        if (!z || jArr2[0] <= 0) {
            this.f178800a = jArr;
            this.f178801b = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.f178800a = jArr3;
            long[] jArr4 = new long[i];
            this.f178801b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.f178802c = j;
    }

    @Override // p153l.bgr0
    /* JADX INFO: renamed from: a */
    public final zfr0 mo97719a(long j) {
        if (!this.f178803d) {
            cgr0 cgr0Var = cgr0.f81725c;
            return new zfr0(cgr0Var, cgr0Var);
        }
        int iM159420r = mpw0.m159420r(this.f178801b, j, true, true);
        cgr0 cgr0Var2 = new cgr0(this.f178801b[iM159420r], this.f178800a[iM159420r]);
        if (cgr0Var2.f81726a != j) {
            long[] jArr = this.f178801b;
            if (iM159420r != jArr.length - 1) {
                int i = iM159420r + 1;
                return new zfr0(cgr0Var2, new cgr0(jArr[i], this.f178800a[i]));
            }
        }
        return new zfr0(cgr0Var2, cgr0Var2);
    }

    @Override // p153l.bgr0
    public final long zza() {
        return this.f178802c;
    }

    @Override // p153l.bgr0
    public final boolean zzh() {
        return this.f178803d;
    }
}
