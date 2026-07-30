package p153l;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class pvr0 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Handler f154323a;

    public pvr0(rvr0 rvr0Var, Handler handler) {
        this.f154323a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f154323a.post(runnable);
    }
}
