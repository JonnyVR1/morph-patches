package p137rx.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import p153l.j2e0;
import p153l.lj40;
import p153l.m31;

/* JADX INFO: renamed from: rx.internal.schedulers.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C22471a implements j2e0 {
    public static final C22471a INSTANCE;

    /* JADX INFO: renamed from: b */
    public static final ScheduledExecutorService[] f208322b = new ScheduledExecutorService[0];

    /* JADX INFO: renamed from: c */
    public static final ScheduledExecutorService f208323c;

    /* JADX INFO: renamed from: d */
    public static int f208324d;

    /* JADX INFO: renamed from: a */
    public final AtomicReference<ScheduledExecutorService[]> f208325a = new AtomicReference<>(f208322b);

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f208323c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        INSTANCE = new C22471a();
    }

    public C22471a() {
        start();
    }

    /* JADX INFO: renamed from: a */
    public static ScheduledExecutorService m222705a() {
        ScheduledExecutorService[] scheduledExecutorServiceArr = INSTANCE.f208325a.get();
        if (scheduledExecutorServiceArr == f208322b) {
            return f208323c;
        }
        int i = f208324d + 1;
        if (i >= scheduledExecutorServiceArr.length) {
            i = 0;
        }
        f208324d = i;
        return scheduledExecutorServiceArr[i];
    }

    @Override // p153l.j2e0
    public void shutdown() {
        ScheduledExecutorService[] scheduledExecutorServiceArr;
        ScheduledExecutorService[] scheduledExecutorServiceArr2;
        do {
            scheduledExecutorServiceArr = this.f208325a.get();
            scheduledExecutorServiceArr2 = f208322b;
            if (scheduledExecutorServiceArr == scheduledExecutorServiceArr2) {
                return;
            }
        } while (!m31.m156916a(this.f208325a, scheduledExecutorServiceArr, scheduledExecutorServiceArr2));
        for (ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr) {
            lj40.m154457e(scheduledExecutorService);
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // p153l.j2e0
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
        if (!m31.m156916a(this.f208325a, f208322b, scheduledExecutorServiceArr)) {
            while (i < iAvailableProcessors) {
                scheduledExecutorServiceArr[i].shutdownNow();
                i++;
            }
        } else {
            while (i < iAvailableProcessors) {
                ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceArr[i];
                if (!lj40.m154461l(scheduledExecutorService) && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
                    lj40.m154460h((ScheduledThreadPoolExecutor) scheduledExecutorService);
                }
                i++;
            }
        }
    }
}
