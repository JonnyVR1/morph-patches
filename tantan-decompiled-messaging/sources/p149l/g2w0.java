package p149l;

import androidx.annotation.VisibleForTesting;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class g2w0 implements gnr {

    /* JADX INFO: renamed from: a */
    public final Object f100310a;

    /* JADX INFO: renamed from: b */
    public final String f100311b;

    /* JADX INFO: renamed from: c */
    public final gnr f100312c;

    @VisibleForTesting(otherwise = 3)
    public g2w0(Object obj, String str, gnr gnrVar) {
        this.f100310a = obj;
        this.f100311b = str;
        this.f100312c = gnrVar;
    }

    /* JADX INFO: renamed from: a */
    public final Object m124189a() {
        return this.f100310a;
    }

    @Override // p149l.gnr
    public final void addListener(Runnable runnable, Executor executor) {
        this.f100312c.addListener(runnable, executor);
    }

    /* JADX INFO: renamed from: b */
    public final String m124190b() {
        return this.f100311b;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f100312c.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f100312c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f100312c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f100312c.isDone();
    }

    public final String toString() {
        return this.f100311b + "@" + System.identityHashCode(this);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f100312c.get(j, timeUnit);
    }
}
