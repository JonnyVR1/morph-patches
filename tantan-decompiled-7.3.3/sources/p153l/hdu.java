package p153l;

import com.tantanapp.common.utils.CrashHelper;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes13.dex */
public final class hdu {

    /* JADX INFO: renamed from: b */
    public static final hdu f109038b = new hdu();

    /* JADX INFO: renamed from: a */
    public ExecutorService f109039a;

    /* JADX INFO: renamed from: a */
    public void m134613a(Runnable runnable) {
        ExecutorService executorServiceM134614b = m134614b();
        if (executorServiceM134614b != null) {
            executorServiceM134614b.execute(runnable);
        } else {
            new Thread(runnable, "live-thread-pool").start();
        }
    }

    /* JADX INFO: renamed from: b */
    public final ExecutorService m134614b() {
        if (this.f109039a == null) {
            try {
                this.f109039a = idu.m139544a("live-gift");
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
        return this.f109039a;
    }
}
