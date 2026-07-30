package p149l;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public interface rmw0 extends ExecutorService, AutoCloseable {
    /* JADX INFO: renamed from: R */
    gnr mo122102R(Callable callable);

    /* JADX INFO: renamed from: a */
    gnr mo122103a(Runnable runnable);

    @Override // java.lang.AutoCloseable
    /* synthetic */ default void close() {
        reg0.m179043a(this);
    }
}
