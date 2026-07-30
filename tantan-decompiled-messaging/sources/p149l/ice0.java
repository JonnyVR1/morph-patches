package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ice0 {

    /* JADX INFO: renamed from: c */
    public static final ice0 f112451c;

    /* JADX INFO: renamed from: d */
    public static final ice0 f112452d;

    /* JADX INFO: renamed from: e */
    public static final ice0 f112453e;

    /* JADX INFO: renamed from: f */
    public static final ice0 f112454f;

    /* JADX INFO: renamed from: g */
    public static final ice0 f112455g;

    /* JADX INFO: renamed from: a */
    public final long f112456a;

    /* JADX INFO: renamed from: b */
    public final long f112457b;

    static {
        ice0 ice0Var = new ice0(0L, 0L);
        f112451c = ice0Var;
        f112452d = new ice0(Long.MAX_VALUE, Long.MAX_VALUE);
        f112453e = new ice0(Long.MAX_VALUE, 0L);
        f112454f = new ice0(0L, Long.MAX_VALUE);
        f112455g = ice0Var;
    }

    public ice0(long j, long j2) {
        p11.m167007a(j >= 0);
        p11.m167007a(j2 >= 0);
        this.f112456a = j;
        this.f112457b = j2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051 A[RETURN] */
    /* JADX INFO: renamed from: a */
    public long m135351a(long j, long j2, long j3) {
        long j4 = this.f112456a;
        if (j4 == 0 && this.f112457b == 0) {
            return j;
        }
        long jM197853e1 = vck0.m197853e1(j, j4, Long.MIN_VALUE);
        long jM197842b = vck0.m197842b(j, this.f112457b, Long.MAX_VALUE);
        boolean z = false;
        boolean z2 = jM197853e1 <= j2 && j2 <= jM197842b;
        if (jM197853e1 <= j3 && j3 <= jM197842b) {
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
            return jM197853e1;
        }
        return j2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ice0.class == obj.getClass()) {
            ice0 ice0Var = (ice0) obj;
            if (this.f112456a == ice0Var.f112456a && this.f112457b == ice0Var.f112457b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f112456a) * 31) + ((int) this.f112457b);
    }
}
