package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class gfy0 {

    /* JADX INFO: renamed from: c */
    public static final gfy0 f103966c;

    /* JADX INFO: renamed from: d */
    public static final gfy0 f103967d;

    /* JADX INFO: renamed from: e */
    public static final gfy0 f103968e;

    /* JADX INFO: renamed from: f */
    public static final gfy0 f103969f;

    /* JADX INFO: renamed from: g */
    public static final gfy0 f103970g;

    /* JADX INFO: renamed from: a */
    public final long f103971a;

    /* JADX INFO: renamed from: b */
    public final long f103972b;

    static {
        gfy0 gfy0Var = new gfy0(0L, 0L);
        f103966c = gfy0Var;
        f103967d = new gfy0(Long.MAX_VALUE, Long.MAX_VALUE);
        f103968e = new gfy0(Long.MAX_VALUE, 0L);
        f103969f = new gfy0(0L, Long.MAX_VALUE);
        f103970g = gfy0Var;
    }

    public gfy0(long j, long j2) {
        lev0.m153956d(j >= 0);
        lev0.m153956d(j2 >= 0);
        this.f103971a = j;
        this.f103972b = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gfy0.class == obj.getClass()) {
            gfy0 gfy0Var = (gfy0) obj;
            if (this.f103971a == gfy0Var.f103971a && this.f103972b == gfy0Var.f103972b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f103971a) * 31) + ((int) this.f103972b);
    }
}
