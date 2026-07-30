package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.C2268v3;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public class n3t0 implements gnr {

    /* JADX INFO: renamed from: a */
    public final C2268v3 f137020a = C2268v3.m13379C();

    /* JADX INFO: renamed from: a */
    public static final boolean m157773a(boolean z) {
        if (!z) {
            vny0.m199079q().m212289v(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    @Override // p149l.gnr
    public final void addListener(Runnable runnable, Executor executor) {
        this.f137020a.addListener(runnable, executor);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m157774b(@Nullable Object obj) {
        boolean zMo13021e = this.f137020a.mo13021e(obj);
        m157773a(zMo13021e);
        return zMo13021e;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m157775c(Throwable th) {
        boolean zMo13022f = this.f137020a.mo13022f(th);
        m157773a(zMo13022f);
        return zMo13022f;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f137020a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f137020a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f137020a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f137020a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f137020a.get(j, timeUnit);
    }
}
