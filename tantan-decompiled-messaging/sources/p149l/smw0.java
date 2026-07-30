package p149l;

import com.google.android.gms.internal.ads.AbstractC2204n3;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public final class smw0 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Executor f165387a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC2204n3 f165388b;

    public smw0(Executor executor, AbstractC2204n3 abstractC2204n3) {
        this.f165387a = executor;
        this.f165388b = abstractC2204n3;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f165387a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f165388b.mo13022f(e);
        }
    }
}
