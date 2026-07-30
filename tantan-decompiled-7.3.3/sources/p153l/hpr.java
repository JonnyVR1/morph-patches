package p153l;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes7.dex */
public interface hpr<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
