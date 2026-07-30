package p153l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.internal.schedulers.ScheduledAction;
import p137rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public class lj40 extends f2e0.AbstractC16877a implements kcg0 {

    /* JADX INFO: renamed from: c */
    public static final boolean f132298c;

    /* JADX INFO: renamed from: g */
    public static volatile Object f132302g;

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f132304a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f132305b;

    /* JADX INFO: renamed from: h */
    public static final Object f132303h = new Object();

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> f132300e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f */
    public static final AtomicReference<ScheduledExecutorService> f132301f = new AtomicReference<>();

    /* JADX INFO: renamed from: d */
    public static final int f132299d = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();

    /* JADX INFO: renamed from: l.lj40$a */
    public static class RunnableC18403a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            lj40.m154459g();
        }
    }

    static {
        boolean z = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int iM109124a = cd80.m109124a();
        f132298c = !z && (iM109124a == 0 || iM109124a >= 21);
    }

    public lj40(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!m154461l(scheduledExecutorServiceNewScheduledThreadPool) && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            m154460h((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f132304a = scheduledExecutorServiceNewScheduledThreadPool;
    }

    /* JADX INFO: renamed from: e */
    public static void m154457e(ScheduledExecutorService scheduledExecutorService) {
        f132300e.remove(scheduledExecutorService);
    }

    /* JADX INFO: renamed from: f */
    public static Method m154458f(ScheduledExecutorService scheduledExecutorService) {
        for (Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static void m154459g() {
        try {
            Iterator<ScheduledThreadPoolExecutor> it = f132300e.keySet().iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor next = it.next();
                if (next.isShutdown()) {
                    it.remove();
                } else {
                    next.purge();
                }
            }
        } catch (Throwable th) {
            j6f.m143663e(th);
            hrd0.m136792j(th);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m154460h(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f132301f;
            if (atomicReference.get() != null) {
                break;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge-"));
            if (m31.m156916a(atomicReference, null, scheduledExecutorServiceNewScheduledThreadPool)) {
                RunnableC18403a runnableC18403a = new RunnableC18403a();
                int i = f132299d;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(runnableC18403a, i, i, TimeUnit.MILLISECONDS);
                break;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
        f132300e.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m154461l(ScheduledExecutorService scheduledExecutorService) {
        Method methodM154458f;
        if (f132298c) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = f132302g;
                Object obj2 = f132303h;
                if (obj == obj2) {
                    return false;
                }
                if (obj == null) {
                    methodM154458f = m154458f(scheduledExecutorService);
                    if (methodM154458f != null) {
                        obj2 = methodM154458f;
                    }
                    f132302g = obj2;
                } else {
                    methodM154458f = (Method) obj;
                }
            } else {
                methodM154458f = m154458f(scheduledExecutorService);
            }
            if (methodM154458f != null) {
                try {
                    methodM154458f.invoke(scheduledExecutorService, Boolean.TRUE);
                    return true;
                } catch (IllegalAccessException e) {
                    hrd0.m136792j(e);
                } catch (IllegalArgumentException e2) {
                    hrd0.m136792j(e2);
                } catch (InvocationTargetException e3) {
                    hrd0.m136792j(e3);
                }
            }
        }
        return false;
    }

    @Override // p153l.f2e0.AbstractC16877a
    /* JADX INFO: renamed from: b */
    public kcg0 mo102836b(x20 x20Var) {
        return mo102837c(x20Var, 0L, null);
    }

    @Override // p153l.f2e0.AbstractC16877a
    /* JADX INFO: renamed from: c */
    public kcg0 mo102837c(x20 x20Var, long j, TimeUnit timeUnit) {
        return this.f132305b ? pcg0.m171651d() : m154462i(x20Var, j, timeUnit);
    }

    /* JADX INFO: renamed from: i */
    public ScheduledAction m154462i(x20 x20Var, long j, TimeUnit timeUnit) {
        ScheduledAction scheduledAction = new ScheduledAction(hrd0.m136799q(x20Var));
        ScheduledExecutorService scheduledExecutorService = this.f132304a;
        scheduledAction.add(j <= 0 ? scheduledExecutorService.submit(scheduledAction) : scheduledExecutorService.schedule(scheduledAction, j, timeUnit));
        return scheduledAction;
    }

    @Override // p153l.kcg0
    public boolean isUnsubscribed() {
        return this.f132305b;
    }

    /* JADX INFO: renamed from: j */
    public ScheduledAction m154463j(x20 x20Var, long j, TimeUnit timeUnit, ft5 ft5Var) {
        ScheduledAction scheduledAction = new ScheduledAction(hrd0.m136799q(x20Var), ft5Var);
        ft5Var.m127297a(scheduledAction);
        ScheduledExecutorService scheduledExecutorService = this.f132304a;
        scheduledAction.add(j <= 0 ? scheduledExecutorService.submit(scheduledAction) : scheduledExecutorService.schedule(scheduledAction, j, timeUnit));
        return scheduledAction;
    }

    /* JADX INFO: renamed from: k */
    public ScheduledAction m154464k(x20 x20Var, long j, TimeUnit timeUnit, ocg0 ocg0Var) {
        ScheduledAction scheduledAction = new ScheduledAction(hrd0.m136799q(x20Var), ocg0Var);
        ocg0Var.m167213a(scheduledAction);
        ScheduledExecutorService scheduledExecutorService = this.f132304a;
        scheduledAction.add(j <= 0 ? scheduledExecutorService.submit(scheduledAction) : scheduledExecutorService.schedule(scheduledAction, j, timeUnit));
        return scheduledAction;
    }

    @Override // p153l.kcg0
    public void unsubscribe() {
        this.f132305b = true;
        this.f132304a.shutdownNow();
        m154457e(this.f132304a);
    }
}
