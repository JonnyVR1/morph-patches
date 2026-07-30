package p149l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class vzs0 {

    /* JADX INFO: renamed from: a */
    public final Clock f183663a;

    /* JADX INFO: renamed from: b */
    public final tzs0 f183664b;

    public vzs0(Clock clock, tzs0 tzs0Var) {
        this.f183663a = clock;
        this.f183664b = tzs0Var;
    }

    /* JADX INFO: renamed from: a */
    public static vzs0 m200780a(Context context) {
        return n0t0.m157287d(context).mo128976b();
    }

    /* JADX INFO: renamed from: b */
    public final void m200781b(int i, long j) {
        this.f183664b.m191215a(i, j);
    }

    /* JADX INFO: renamed from: c */
    public final void m200782c(zzff zzffVar) {
        this.f183664b.m191215a(-1, this.f183663a.currentTimeMillis());
    }

    /* JADX INFO: renamed from: d */
    public final void m200783d() {
        this.f183664b.m191215a(-1, this.f183663a.currentTimeMillis());
    }
}
