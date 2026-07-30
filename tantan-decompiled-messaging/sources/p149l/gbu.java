package p149l;

import com.tantanapp.common.utils.CrashHelper;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes13.dex */
public final class gbu {

    /* JADX INFO: renamed from: b */
    public static final gbu f101912b = new gbu();

    /* JADX INFO: renamed from: a */
    public ExecutorService f101913a;

    /* JADX INFO: renamed from: a */
    public void m125328a(Runnable runnable) {
        ExecutorService executorServiceM125329b = m125329b();
        if (executorServiceM125329b != null) {
            executorServiceM125329b.execute(runnable);
        } else {
            new Thread(runnable, "live-thread-pool").start();
        }
    }

    /* JADX INFO: renamed from: b */
    public final ExecutorService m125329b() {
        if (this.f101913a == null) {
            try {
                this.f101913a = hbu.m130335a("live-gift");
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
        return this.f101913a;
    }
}
