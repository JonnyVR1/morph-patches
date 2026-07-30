package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class bnt0 {

    /* JADX INFO: renamed from: h */
    public static final String f76437h = Integer.toString(0, 36);

    /* JADX INFO: renamed from: i */
    public static final String f76438i = Integer.toString(1, 36);

    /* JADX INFO: renamed from: j */
    public static final String f76439j = Integer.toString(2, 36);

    /* JADX INFO: renamed from: k */
    public static final String f76440k = Integer.toString(3, 36);

    /* JADX INFO: renamed from: l */
    public static final String f76441l = Integer.toString(4, 36);

    /* JADX INFO: renamed from: m */
    @Deprecated
    public static final g8y0 f76442m = new g8y0() { // from class: l.tlt0
    };

    /* JADX INFO: renamed from: a */
    @Nullable
    public Object f76443a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Object f76444b;

    /* JADX INFO: renamed from: c */
    public int f76445c;

    /* JADX INFO: renamed from: d */
    public long f76446d;

    /* JADX INFO: renamed from: e */
    public long f76447e;

    /* JADX INFO: renamed from: f */
    public boolean f76448f;

    /* JADX INFO: renamed from: g */
    public yut0 f76449g = yut0.f200123e;

    /* JADX INFO: renamed from: a */
    public final int m102860a(int i) {
        return this.f76449g.m216160a(i).f120120b;
    }

    /* JADX INFO: renamed from: b */
    public final int m102861b() {
        int i = this.f76449g.f200130a;
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m102862c(long j) {
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final int m102863d(long j) {
        this.f76449g.m216161b(-1);
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public final int m102864e(int i) {
        return this.f76449g.m216160a(i).m143666a(-1);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bnt0.class.equals(obj.getClass())) {
            bnt0 bnt0Var = (bnt0) obj;
            if (ggw0.m126064f(this.f76443a, bnt0Var.f76443a) && ggw0.m126064f(this.f76444b, bnt0Var.f76444b) && this.f76445c == bnt0Var.f76445c && this.f76446d == bnt0Var.f76446d && this.f76448f == bnt0Var.f76448f && ggw0.m126064f(this.f76449g, bnt0Var.f76449g)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m102865f(int i, int i2) {
        return this.f76449g.m216160a(i).m143666a(i2);
    }

    /* JADX INFO: renamed from: g */
    public final int m102866g() {
        int i = this.f76449g.f200132c;
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public final long m102867h(int i, int i2) {
        jws0 jws0VarM216160a = this.f76449g.m216160a(i);
        if (jws0VarM216160a.f120120b != -1) {
            return jws0VarM216160a.f120124f[i2];
        }
        return -9223372036854775807L;
    }

    public final int hashCode() {
        Object obj = this.f76443a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f76444b;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f76445c;
        long j = this.f76446d;
        return (((((iHashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.f76448f ? 1 : 0)) * 31) + this.f76449g.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final long m102868i(int i) {
        long j = this.f76449g.m216160a(i).f120119a;
        return 0L;
    }

    /* JADX INFO: renamed from: j */
    public final long m102869j() {
        long j = this.f76449g.f200131b;
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public final long m102870k(int i) {
        long j = this.f76449g.m216160a(i).f120125g;
        return 0L;
    }

    /* JADX INFO: renamed from: l */
    public final bnt0 m102871l(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2, yut0 yut0Var, boolean z) {
        this.f76443a = obj;
        this.f76444b = obj2;
        this.f76445c = i;
        this.f76446d = j;
        this.f76447e = 0L;
        this.f76449g = yut0Var;
        this.f76448f = z;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m102872m(int i) {
        m102861b();
        if (i != -1) {
            return false;
        }
        this.f76449g.m216161b(-1);
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m102873n(int i) {
        boolean z = this.f76449g.m216160a(i).f120126h;
        return false;
    }
}
