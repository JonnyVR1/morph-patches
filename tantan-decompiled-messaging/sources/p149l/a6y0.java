package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class a6y0 {

    /* JADX INFO: renamed from: c */
    public static final a6y0 f67812c;

    /* JADX INFO: renamed from: d */
    public static final a6y0 f67813d;

    /* JADX INFO: renamed from: e */
    public static final a6y0 f67814e;

    /* JADX INFO: renamed from: f */
    public static final a6y0 f67815f;

    /* JADX INFO: renamed from: g */
    public static final a6y0 f67816g;

    /* JADX INFO: renamed from: a */
    public final long f67817a;

    /* JADX INFO: renamed from: b */
    public final long f67818b;

    static {
        a6y0 a6y0Var = new a6y0(0L, 0L);
        f67812c = a6y0Var;
        f67813d = new a6y0(Long.MAX_VALUE, Long.MAX_VALUE);
        f67814e = new a6y0(Long.MAX_VALUE, 0L);
        f67815f = new a6y0(0L, Long.MAX_VALUE);
        f67816g = a6y0Var;
    }

    public a6y0(long j, long j2) {
        f5v0.m119533d(j >= 0);
        f5v0.m119533d(j2 >= 0);
        this.f67817a = j;
        this.f67818b = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a6y0.class == obj.getClass()) {
            a6y0 a6y0Var = (a6y0) obj;
            if (this.f67817a == a6y0Var.f67817a && this.f67818b == a6y0Var.f67818b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f67817a) * 31) + ((int) this.f67818b);
    }
}
