package p149l;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public interface qie0 extends ExecutorService, AutoCloseable {
    @Override // java.lang.AutoCloseable
    /* synthetic */ default void close() {
        reg0.m179043a(this);
    }
}
