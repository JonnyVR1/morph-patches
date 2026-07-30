package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.C2291v3;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public class tct0 implements hpr {

    /* JADX INFO: renamed from: a */
    public final C2291v3 f173273a = C2291v3.m13433C();

    /* JADX INFO: renamed from: a */
    public static final boolean m190493a(boolean z) {
        if (!z) {
            bxy0.m106933q().m120274v(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    @Override // p153l.hpr
    public final void addListener(Runnable runnable, Executor executor) {
        this.f173273a.addListener(runnable, executor);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m190494b(@Nullable Object obj) {
        boolean zMo13075e = this.f173273a.mo13075e(obj);
        m190493a(zMo13075e);
        return zMo13075e;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m190495c(Throwable th) {
        boolean zMo13076f = this.f173273a.mo13076f(th);
        m190493a(zMo13076f);
        return zMo13076f;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f173273a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f173273a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f173273a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f173273a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f173273a.get(j, timeUnit);
    }
}
