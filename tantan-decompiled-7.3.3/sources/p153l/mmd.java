package p153l;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mmd implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Handler f137560a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f137560a.post(runnable);
    }
}
