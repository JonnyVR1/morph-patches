package p153l;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class gnt0 {

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public static final String f105139j = Integer.toString(0, 36);

    /* JADX INFO: renamed from: k */
    public static final String f105140k = Integer.toString(1, 36);

    /* JADX INFO: renamed from: l */
    @VisibleForTesting
    public static final String f105141l = Integer.toString(2, 36);

    /* JADX INFO: renamed from: m */
    @VisibleForTesting
    public static final String f105142m = Integer.toString(3, 36);

    /* JADX INFO: renamed from: n */
    @VisibleForTesting
    public static final String f105143n = Integer.toString(4, 36);

    /* JADX INFO: renamed from: o */
    public static final String f105144o = Integer.toString(5, 36);

    /* JADX INFO: renamed from: p */
    public static final String f105145p = Integer.toString(6, 36);

    /* JADX INFO: renamed from: q */
    @Deprecated
    public static final mhy0 f105146q = new mhy0() { // from class: l.ylt0
    };

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Object f105147a;

    /* JADX INFO: renamed from: b */
    public final int f105148b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final trs0 f105149c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final Object f105150d;

    /* JADX INFO: renamed from: e */
    public final int f105151e;

    /* JADX INFO: renamed from: f */
    public final long f105152f;

    /* JADX INFO: renamed from: g */
    public final long f105153g;

    /* JADX INFO: renamed from: h */
    public final int f105154h;

    /* JADX INFO: renamed from: i */
    public final int f105155i;

    public gnt0(@Nullable Object obj, int i, @Nullable trs0 trs0Var, @Nullable Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.f105147a = obj;
        this.f105148b = i;
        this.f105149c = trs0Var;
        this.f105150d = obj2;
        this.f105151e = i2;
        this.f105152f = j;
        this.f105153g = j2;
        this.f105154h = i3;
        this.f105155i = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gnt0.class == obj.getClass()) {
            gnt0 gnt0Var = (gnt0) obj;
            if (this.f105148b == gnt0Var.f105148b && this.f105151e == gnt0Var.f105151e && this.f105152f == gnt0Var.f105152f && this.f105153g == gnt0Var.f105153g && this.f105154h == gnt0Var.f105154h && this.f105155i == gnt0Var.f105155i && kow0.m150688a(this.f105149c, gnt0Var.f105149c) && kow0.m150688a(this.f105147a, gnt0Var.f105147a) && kow0.m150688a(this.f105150d, gnt0Var.f105150d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f105147a, Integer.valueOf(this.f105148b), this.f105149c, this.f105150d, Integer.valueOf(this.f105151e), Long.valueOf(this.f105152f), Long.valueOf(this.f105153g), Integer.valueOf(this.f105154h), Integer.valueOf(this.f105155i)});
    }
}
