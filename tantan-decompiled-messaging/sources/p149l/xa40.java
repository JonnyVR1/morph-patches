package p149l;

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
import p133rx.internal.schedulers.ScheduledAction;
import p133rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public class xa40 extends bud0.AbstractC15976a implements c4g0 {

    /* JADX INFO: renamed from: c */
    public static final boolean f191677c;

    /* JADX INFO: renamed from: g */
    public static volatile Object f191681g;

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f191683a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f191684b;

    /* JADX INFO: renamed from: h */
    public static final Object f191682h = new Object();

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> f191679e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f */
    public static final AtomicReference<ScheduledExecutorService> f191680f = new AtomicReference<>();

    /* JADX INFO: renamed from: d */
    public static final int f191678d = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();

    /* JADX INFO: renamed from: l.xa40$a */
    public static class RunnableC21049a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            xa40.m207523g();
        }
    }

    static {
        boolean z = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int iM201475a = w480.m201475a();
        f191677c = !z && (iM201475a == 0 || iM201475a >= 21);
    }

    public xa40(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!m207525l(scheduledExecutorServiceNewScheduledThreadPool) && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            m207524h((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f191683a = scheduledExecutorServiceNewScheduledThreadPool;
    }

    /* JADX INFO: renamed from: e */
    public static void m207521e(ScheduledExecutorService scheduledExecutorService) {
        f191679e.remove(scheduledExecutorService);
    }

    /* JADX INFO: renamed from: f */
    public static Method m207522f(ScheduledExecutorService scheduledExecutorService) {
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
    public static void m207523g() {
        try {
            Iterator<ScheduledThreadPoolExecutor> it = f191679e.keySet().iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor next = it.next();
                if (next.isShutdown()) {
                    it.remove();
                } else {
                    next.purge();
                }
            }
        } catch (Throwable th) {
            f5f.m119491e(th);
            ejd0.m116793j(th);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m207524h(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f191680f;
            if (atomicReference.get() != null) {
                break;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge-"));
            if (f31.m119248a(atomicReference, null, scheduledExecutorServiceNewScheduledThreadPool)) {
                RunnableC21049a runnableC21049a = new RunnableC21049a();
                int i = f191678d;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(runnableC21049a, i, i, TimeUnit.MILLISECONDS);
                break;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
        f191679e.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m207525l(ScheduledExecutorService scheduledExecutorService) {
        Method methodM207522f;
        if (f191677c) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = f191681g;
                Object obj2 = f191682h;
                if (obj == obj2) {
                    return false;
                }
                if (obj == null) {
                    methodM207522f = m207522f(scheduledExecutorService);
                    if (methodM207522f != null) {
                        obj2 = methodM207522f;
                    }
                    f191681g = obj2;
                } else {
                    methodM207522f = (Method) obj;
                }
            } else {
                methodM207522f = m207522f(scheduledExecutorService);
            }
            if (methodM207522f != null) {
                try {
                    methodM207522f.invoke(scheduledExecutorService, Boolean.TRUE);
                    return true;
                } catch (IllegalAccessException e) {
                    ejd0.m116793j(e);
                } catch (IllegalArgumentException e2) {
                    ejd0.m116793j(e2);
                } catch (InvocationTargetException e3) {
                    ejd0.m116793j(e3);
                }
            }
        }
        return false;
    }

    @Override // p149l.bud0.AbstractC15976a
    /* JADX INFO: renamed from: b */
    public c4g0 mo99201b(d30 d30Var) {
        return mo99202c(d30Var, 0L, null);
    }

    @Override // p149l.bud0.AbstractC15976a
    /* JADX INFO: renamed from: c */
    public c4g0 mo99202c(d30 d30Var, long j, TimeUnit timeUnit) {
        return this.f191684b ? h4g0.m129243d() : m207526i(d30Var, j, timeUnit);
    }

    /* JADX INFO: renamed from: i */
    public ScheduledAction m207526i(d30 d30Var, long j, TimeUnit timeUnit) {
        ScheduledAction scheduledAction = new ScheduledAction(ejd0.m116800q(d30Var));
        ScheduledExecutorService scheduledExecutorService = this.f191683a;
        scheduledAction.add(j <= 0 ? scheduledExecutorService.submit(scheduledAction) : scheduledExecutorService.schedule(scheduledAction, j, timeUnit));
        return scheduledAction;
    }

    @Override // p149l.c4g0
    public boolean isUnsubscribed() {
        return this.f191684b;
    }

    /* JADX INFO: renamed from: j */
    public ScheduledAction m207527j(d30 d30Var, long j, TimeUnit timeUnit, bs5 bs5Var) {
        ScheduledAction scheduledAction = new ScheduledAction(ejd0.m116800q(d30Var), bs5Var);
        bs5Var.m103655a(scheduledAction);
        ScheduledExecutorService scheduledExecutorService = this.f191683a;
        scheduledAction.add(j <= 0 ? scheduledExecutorService.submit(scheduledAction) : scheduledExecutorService.schedule(scheduledAction, j, timeUnit));
        return scheduledAction;
    }

    /* JADX INFO: renamed from: k */
    public ScheduledAction m207528k(d30 d30Var, long j, TimeUnit timeUnit, g4g0 g4g0Var) {
        ScheduledAction scheduledAction = new ScheduledAction(ejd0.m116800q(d30Var), g4g0Var);
        g4g0Var.m124367a(scheduledAction);
        ScheduledExecutorService scheduledExecutorService = this.f191683a;
        scheduledAction.add(j <= 0 ? scheduledExecutorService.submit(scheduledAction) : scheduledExecutorService.schedule(scheduledAction, j, timeUnit));
        return scheduledAction;
    }

    @Override // p149l.c4g0
    public void unsubscribe() {
        this.f191684b = true;
        this.f191683a.shutdownNow();
        m207521e(this.f191683a);
    }
}
