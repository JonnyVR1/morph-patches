package p153l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class hvw0 extends gvw0 {

    /* JADX INFO: renamed from: h */
    public final hpr f111844h;

    public hvw0(hpr hprVar) {
        hprVar.getClass();
        this.f111844h = hprVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2227n3, p153l.hpr
    public final void addListener(Runnable runnable, Executor executor) {
        this.f111844h.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2227n3, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f111844h.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2227n3, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f111844h.get();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2227n3, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f111844h.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2227n3, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f111844h.isDone();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2227n3
    public final String toString() {
        return this.f111844h.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2227n3, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f111844h.get(j, timeUnit);
    }
}
