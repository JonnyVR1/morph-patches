package p153l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes6.dex */
public final class b9t0 {

    /* JADX INFO: renamed from: a */
    public final Clock f75617a;

    /* JADX INFO: renamed from: b */
    public final z8t0 f75618b;

    public b9t0(Clock clock, z8t0 z8t0Var) {
        this.f75617a = clock;
        this.f75618b = z8t0Var;
    }

    /* JADX INFO: renamed from: a */
    public static b9t0 m103136a(Context context) {
        return t9t0.m189767d(context).mo162048b();
    }

    /* JADX INFO: renamed from: b */
    public final void m103137b(int i, long j) {
        this.f75618b.m219030a(i, j);
    }

    /* JADX INFO: renamed from: c */
    public final void m103138c(zzff zzffVar) {
        this.f75618b.m219030a(-1, this.f75617a.currentTimeMillis());
    }

    /* JADX INFO: renamed from: d */
    public final void m103139d() {
        this.f75618b.m219030a(-1, this.f75617a.currentTimeMillis());
    }
}
