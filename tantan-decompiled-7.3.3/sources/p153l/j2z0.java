package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class j2z0 extends d0u0 {

    /* JADX INFO: renamed from: k */
    public static final Object f118132k = new Object();

    /* JADX INFO: renamed from: l */
    public static final trs0 f118133l;

    /* JADX INFO: renamed from: f */
    public final long f118134f;

    /* JADX INFO: renamed from: g */
    public final long f118135g;

    /* JADX INFO: renamed from: h */
    public final boolean f118136h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final trs0 f118137i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final jfs0 f118138j;

    static {
        lxr0 lxr0Var = new lxr0();
        lxr0Var.m156235a("SinglePeriodTimeline");
        lxr0Var.m156236b(Uri.EMPTY);
        f118133l = lxr0Var.m156237c();
    }

    public j2z0(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, @Nullable Object obj, trs0 trs0Var, @Nullable jfs0 jfs0Var) {
        this.f118134f = j4;
        this.f118135g = j5;
        this.f118136h = z;
        trs0Var.getClass();
        this.f118137i = trs0Var;
        this.f118138j = jfs0Var;
    }

    @Override // p153l.d0u0
    /* JADX INFO: renamed from: a */
    public final int mo113457a(Object obj) {
        return f118132k.equals(obj) ? 0 : -1;
    }

    @Override // p153l.d0u0
    /* JADX INFO: renamed from: b */
    public final int mo113458b() {
        return 1;
    }

    @Override // p153l.d0u0
    /* JADX INFO: renamed from: c */
    public final int mo113459c() {
        return 1;
    }

    @Override // p153l.d0u0
    /* JADX INFO: renamed from: d */
    public final hwt0 mo107662d(int i, hwt0 hwt0Var, boolean z) {
        lev0.m153953a(i, 0, 1);
        hwt0Var.m137516l(null, z ? f118132k : null, 0, this.f118134f, 0L, e4u0.f92149e, false);
        return hwt0Var;
    }

    @Override // p153l.d0u0
    /* JADX INFO: renamed from: e */
    public final wyt0 mo107663e(int i, wyt0 wyt0Var, long j) {
        lev0.m153953a(i, 0, 1);
        Object obj = wyt0.f191680p;
        trs0 trs0Var = this.f118137i;
        long j2 = this.f118135g;
        wyt0Var.m208628a(obj, trs0Var, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f118136h, false, this.f118138j, 0L, j2, 0, 0, 0L);
        return wyt0Var;
    }

    @Override // p153l.d0u0
    /* JADX INFO: renamed from: f */
    public final Object mo113460f(int i) {
        lev0.m153953a(i, 0, 1);
        return f118132k;
    }
}
