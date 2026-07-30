package p149l;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.C2075b;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class f3t0 implements Executor {

    /* JADX INFO: renamed from: a */
    public final Handler f94718a = new jpv0(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.f94718a.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            vny0.m199080r();
            C2075b.m12319l(vny0.m199079q().m212275d(), th);
            throw th;
        }
    }
}
