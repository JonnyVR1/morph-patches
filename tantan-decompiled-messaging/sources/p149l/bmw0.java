package p149l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class bmw0 extends amw0 {

    /* JADX INFO: renamed from: h */
    public final gnr f76353h;

    public bmw0(gnr gnrVar) {
        gnrVar.getClass();
        this.f76353h = gnrVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2204n3, p149l.gnr
    public final void addListener(Runnable runnable, Executor executor) {
        this.f76353h.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2204n3, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f76353h.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2204n3, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f76353h.get();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2204n3, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f76353h.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2204n3, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f76353h.isDone();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2204n3
    public final String toString() {
        return this.f76353h.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2204n3, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f76353h.get(j, timeUnit);
    }
}
