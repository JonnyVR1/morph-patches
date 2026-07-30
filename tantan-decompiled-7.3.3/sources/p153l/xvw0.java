package p153l;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public interface xvw0 extends ExecutorService, AutoCloseable {
    /* JADX INFO: renamed from: R */
    hpr mo155969R(Callable callable);

    /* JADX INFO: renamed from: a */
    hpr mo155970a(Runnable runnable);

    @Override // java.lang.AutoCloseable
    /* synthetic */ default void close() {
        zmg0.m220382a(this);
    }
}
