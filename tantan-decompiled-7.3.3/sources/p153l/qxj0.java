package p153l;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes7.dex */
public final class qxj0 {
    /* JADX INFO: renamed from: a */
    public static <V> V m178604a(Future<V> future) throws ExecutionException {
        V v2;
        boolean z = false;
        while (true) {
            try {
                v2 = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v2;
    }
}
