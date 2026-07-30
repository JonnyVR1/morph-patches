package p133rx.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import p149l.f31;
import p149l.fud0;
import p149l.xa40;

/* JADX INFO: renamed from: rx.internal.schedulers.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C22356a implements fud0 {
    public static final C22356a INSTANCE;

    /* JADX INFO: renamed from: b */
    public static final ScheduledExecutorService[] f207400b = new ScheduledExecutorService[0];

    /* JADX INFO: renamed from: c */
    public static final ScheduledExecutorService f207401c;

    /* JADX INFO: renamed from: d */
    public static int f207402d;

    /* JADX INFO: renamed from: a */
    public final AtomicReference<ScheduledExecutorService[]> f207403a = new AtomicReference<>(f207400b);

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f207401c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        INSTANCE = new C22356a();
    }

    public C22356a() {
        start();
    }

    /* JADX INFO: renamed from: a */
    public static ScheduledExecutorService m221459a() {
        ScheduledExecutorService[] scheduledExecutorServiceArr = INSTANCE.f207403a.get();
        if (scheduledExecutorServiceArr == f207400b) {
            return f207401c;
        }
        int i = f207402d + 1;
        if (i >= scheduledExecutorServiceArr.length) {
            i = 0;
        }
        f207402d = i;
        return scheduledExecutorServiceArr[i];
    }

    @Override // p149l.fud0
    public void shutdown() {
        ScheduledExecutorService[] scheduledExecutorServiceArr;
        ScheduledExecutorService[] scheduledExecutorServiceArr2;
        do {
            scheduledExecutorServiceArr = this.f207403a.get();
            scheduledExecutorServiceArr2 = f207400b;
            if (scheduledExecutorServiceArr == scheduledExecutorServiceArr2) {
                return;
            }
        } while (!f31.m119248a(this.f207403a, scheduledExecutorServiceArr, scheduledExecutorServiceArr2));
        for (ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr) {
            xa40.m207521e(scheduledExecutorService);
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // p149l.fud0
    public void start() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (iAvailableProcessors > 4) {
            iAvailableProcessors /= 2;
        }
        if (iAvailableProcessors > 8) {
            iAvailableProcessors = 8;
        }
        ScheduledExecutorService[] scheduledExecutorServiceArr = new ScheduledExecutorService[iAvailableProcessors];
        int i = 0;
        for (int i2 = 0; i2 < iAvailableProcessors; i2++) {
            scheduledExecutorServiceArr[i2] = GenericScheduledExecutorServiceFactory.create();
        }
        if (!f31.m119248a(this.f207403a, f207400b, scheduledExecutorServiceArr)) {
            while (i < iAvailableProcessors) {
                scheduledExecutorServiceArr[i].shutdownNow();
                i++;
            }
        } else {
            while (i < iAvailableProcessors) {
                ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceArr[i];
                if (!xa40.m207525l(scheduledExecutorService) && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
                    xa40.m207524h((ScheduledThreadPoolExecutor) scheduledExecutorService);
                }
                i++;
            }
        }
    }
}
