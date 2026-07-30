package p149l;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes7.dex */
public interface gnr<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
