package p149l;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class jmr0 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Handler f118702a;

    public jmr0(lmr0 lmr0Var, Handler handler) {
        this.f118702a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f118702a.post(runnable);
    }
}
