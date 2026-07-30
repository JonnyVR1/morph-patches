package p014rx.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import l.f31;
import p003l.fud0;
import p003l.xa40;

/* JADX INFO: renamed from: rx.internal.schedulers.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class C1149a implements fud0 {
    public static final C1149a INSTANCE;

    /* JADX INFO: renamed from: b */
    public static final ScheduledExecutorService[] f11025b = new ScheduledExecutorService[0];

    /* JADX INFO: renamed from: c */
    public static final ScheduledExecutorService f11026c;

    /* JADX INFO: renamed from: d */
    public static int f11027d;

    /* JADX INFO: renamed from: a */
    public final AtomicReference<ScheduledExecutorService[]> f11028a = new AtomicReference<>(f11025b);

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f11026c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        INSTANCE = new C1149a();
    }

    public C1149a() {
        start();
    }

    /* JADX INFO: renamed from: a */
    public static ScheduledExecutorService m9916a() {
        ScheduledExecutorService[] scheduledExecutorServiceArr = INSTANCE.f11028a.get();
        if (scheduledExecutorServiceArr == f11025b) {
            return f11026c;
        }
        int i = f11027d + 1;
        if (i >= scheduledExecutorServiceArr.length) {
            i = 0;
        }
        f11027d = i;
        return scheduledExecutorServiceArr[i];
    }

    @Override // p003l.fud0
    public void shutdown() {
        ScheduledExecutorService[] scheduledExecutorServiceArr;
        ScheduledExecutorService[] scheduledExecutorServiceArr2;
        do {
            scheduledExecutorServiceArr = this.f11028a.get();
            scheduledExecutorServiceArr2 = f11025b;
            if (scheduledExecutorServiceArr == scheduledExecutorServiceArr2) {
                return;
            }
        } while (!f31.a(this.f11028a, scheduledExecutorServiceArr, scheduledExecutorServiceArr2));
        for (ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr) {
            xa40.m8690e(scheduledExecutorService);
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // p003l.fud0
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
        if (!f31.a(this.f11028a, f11025b, scheduledExecutorServiceArr)) {
            while (i < iAvailableProcessors) {
                scheduledExecutorServiceArr[i].shutdownNow();
                i++;
            }
        } else {
            while (i < iAvailableProcessors) {
                ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceArr[i];
                if (!xa40.m8694l(scheduledExecutorService) && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
                    xa40.m8693h((ScheduledThreadPoolExecutor) scheduledExecutorService);
                }
                i++;
            }
        }
    }
}
