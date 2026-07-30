package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class o6r0 implements v6r0 {

    /* JADX INFO: renamed from: a */
    public final long[] f142418a;

    /* JADX INFO: renamed from: b */
    public final long[] f142419b;

    /* JADX INFO: renamed from: c */
    public final long f142420c;

    /* JADX INFO: renamed from: d */
    public final boolean f142421d;

    public o6r0(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        f5v0.m119533d(length == length2);
        boolean z = length2 > 0;
        this.f142421d = z;
        if (!z || jArr2[0] <= 0) {
            this.f142418a = jArr;
            this.f142419b = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.f142418a = jArr3;
            long[] jArr4 = new long[i];
            this.f142419b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.f142420c = j;
    }

    @Override // p149l.v6r0
    /* JADX INFO: renamed from: a */
    public final t6r0 mo124628a(long j) {
        if (!this.f142421d) {
            w6r0 w6r0Var = w6r0.f184989c;
            return new t6r0(w6r0Var, w6r0Var);
        }
        int iM126076r = ggw0.m126076r(this.f142419b, j, true, true);
        w6r0 w6r0Var2 = new w6r0(this.f142419b[iM126076r], this.f142418a[iM126076r]);
        if (w6r0Var2.f184990a != j) {
            long[] jArr = this.f142419b;
            if (iM126076r != jArr.length - 1) {
                int i = iM126076r + 1;
                return new t6r0(w6r0Var2, new w6r0(jArr[i], this.f142418a[i]));
            }
        }
        return new t6r0(w6r0Var2, w6r0Var2);
    }

    @Override // p149l.v6r0
    public final long zza() {
        return this.f142420c;
    }

    @Override // p149l.v6r0
    public final boolean zzh() {
        return this.f142421d;
    }
}
