package p149l;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class wrm implements hce0 {

    /* JADX INFO: renamed from: a */
    public final long[] f187804a;

    /* JADX INFO: renamed from: b */
    public final long[] f187805b;

    /* JADX INFO: renamed from: c */
    public final long f187806c;

    /* JADX INFO: renamed from: d */
    public final boolean f187807d;

    public wrm(long[] jArr, long[] jArr2, long j) {
        p11.m167007a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f187807d = z;
        if (!z || jArr2[0] <= 0) {
            this.f187804a = jArr;
            this.f187805b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f187804a = jArr3;
            long[] jArr4 = new long[i];
            this.f187805b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f187806c = j;
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: d */
    public hce0.C17274a mo98121d(long j) {
        if (!this.f187807d) {
            return new hce0.C17274a(jce0.f117294c);
        }
        int iM197863i = vck0.m197863i(this.f187805b, j, true, true);
        jce0 jce0Var = new jce0(this.f187805b[iM197863i], this.f187804a[iM197863i]);
        if (jce0Var.f117295a == j || iM197863i == this.f187805b.length - 1) {
            return new hce0.C17274a(jce0Var);
        }
        int i = iM197863i + 1;
        return new hce0.C17274a(jce0Var, new jce0(this.f187805b[i], this.f187804a[i]));
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: e */
    public boolean mo98122e() {
        return this.f187807d;
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: i */
    public long mo98123i() {
        return this.f187806c;
    }
}
