package p149l;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gld implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Handler f103311a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f103311a.post(runnable);
    }
}
