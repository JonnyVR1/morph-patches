package p153l;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.C2098b;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class lct0 implements Executor {

    /* JADX INFO: renamed from: a */
    public final Handler f131382a = new pyv0(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.f131382a.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            bxy0.m106934r();
            C2098b.m12373l(bxy0.m106933q().m120260d(), th);
            throw th;
        }
    }
}
