package p149l;

import com.google.android.gms.measurement.internal.C2458g;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class xtx0 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2458g f194448a;

    public xtx0(C2458g c2458g) {
        this.f194448a = c2458g;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f194448a.zzl().m146305w(runnable);
    }
}
