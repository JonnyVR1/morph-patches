package p153l;

import com.google.android.gms.internal.ads.AbstractC2227n3;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public final class yvw0 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Executor f201769a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC2227n3 f201770b;

    public yvw0(Executor executor, AbstractC2227n3 abstractC2227n3) {
        this.f201769a = executor;
        this.f201770b = abstractC2227n3;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f201769a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f201770b.mo13076f(e);
        }
    }
}
