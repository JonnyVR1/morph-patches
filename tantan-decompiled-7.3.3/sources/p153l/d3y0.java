package p153l;

import com.google.android.gms.measurement.internal.C2481g;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class d3y0 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2481g f84956a;

    public d3y0(C2481g c2481g) {
        this.f84956a = c2481g;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f84956a.zzl().m177841w(runnable);
    }
}
