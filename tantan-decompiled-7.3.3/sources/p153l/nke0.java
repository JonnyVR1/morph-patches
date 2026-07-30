package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class nke0 {

    /* JADX INFO: renamed from: c */
    public static final nke0 f142449c;

    /* JADX INFO: renamed from: d */
    public static final nke0 f142450d;

    /* JADX INFO: renamed from: e */
    public static final nke0 f142451e;

    /* JADX INFO: renamed from: f */
    public static final nke0 f142452f;

    /* JADX INFO: renamed from: g */
    public static final nke0 f142453g;

    /* JADX INFO: renamed from: a */
    public final long f142454a;

    /* JADX INFO: renamed from: b */
    public final long f142455b;

    static {
        nke0 nke0Var = new nke0(0L, 0L);
        f142449c = nke0Var;
        f142450d = new nke0(Long.MAX_VALUE, Long.MAX_VALUE);
        f142451e = new nke0(Long.MAX_VALUE, 0L);
        f142452f = new nke0(0L, Long.MAX_VALUE);
        f142453g = nke0Var;
    }

    public nke0(long j, long j2) {
        w11.m204365a(j >= 0);
        w11.m204365a(j2 >= 0);
        this.f142454a = j;
        this.f142455b = j2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051 A[RETURN] */
    /* JADX INFO: renamed from: a */
    public long m163601a(long j, long j2, long j3) {
        long j4 = this.f142454a;
        if (j4 == 0 && this.f142455b == 0) {
            return j;
        }
        long jM105131e1 = bmk0.m105131e1(j, j4, Long.MIN_VALUE);
        long jM105120b = bmk0.m105120b(j, this.f142455b, Long.MAX_VALUE);
        boolean z = false;
        boolean z2 = jM105131e1 <= j2 && j2 <= jM105120b;
        if (jM105131e1 <= j3 && j3 <= jM105120b) {
            z = true;
        }
        if (z2 && z) {
            if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
            return j3;
        }
        if (!z2) {
            if (z) {
                return j3;
            }
            return jM105131e1;
        }
        return j2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nke0.class == obj.getClass()) {
            nke0 nke0Var = (nke0) obj;
            if (this.f142454a == nke0Var.f142454a && this.f142455b == nke0Var.f142455b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f142454a) * 31) + ((int) this.f142455b);
    }
}
