package p003l;

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
import l.f31;
import p014rx.internal.schedulers.ScheduledAction;
import p014rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class xa40 extends bud0.AbstractC0185a implements c4g0 {

    /* JADX INFO: renamed from: c */
    public static final boolean f8750c;

    /* JADX INFO: renamed from: g */
    public static volatile Object f8754g;

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f8756a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f8757b;

    /* JADX INFO: renamed from: h */
    public static final Object f8755h = new Object();

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> f8752e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f */
    public static final AtomicReference<ScheduledExecutorService> f8753f = new AtomicReference<>();

    /* JADX INFO: renamed from: d */
    public static final int f8751d = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();

    /* JADX INFO: renamed from: l.xa40$a */
    public static class RunnableC0638a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            xa40.m8692g();
        }
    }

    static {
        boolean z = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int iM8470a = w480.m8470a();
        f8750c = !z && (iM8470a == 0 || iM8470a >= 21);
    }

    public xa40(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!m8694l(scheduledExecutorServiceNewScheduledThreadPool) && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            m8693h((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f8756a = scheduledExecutorServiceNewScheduledThreadPool;
    }

    /* JADX INFO: renamed from: e */
    public static void m8690e(ScheduledExecutorService scheduledExecutorService) {
        f8752e.remove(scheduledExecutorService);
    }

    /* JADX INFO: renamed from: f */
    public static Method m8691f(ScheduledExecutorService scheduledExecutorService) {
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
    public static void m8692g() {
        try {
            Iterator<ScheduledThreadPoolExecutor> it = f8752e.keySet().iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor next = it.next();
                if (next.isShutdown()) {
                    it.remove();
                } else {
                    next.purge();
                }
            }
        } catch (Throwable th) {
            f5f.m3964e(th);
            ejd0.m3864j(th);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m8693h(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f8753f;
            if (atomicReference.get() != null) {
                break;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge-"));
            if (f31.a(atomicReference, (Object) null, scheduledExecutorServiceNewScheduledThreadPool)) {
                RunnableC0638a runnableC0638a = new RunnableC0638a();
                int i = f8751d;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(runnableC0638a, i, i, TimeUnit.MILLISECONDS);
                break;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
        f8752e.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m8694l(ScheduledExecutorService scheduledExecutorService) {
        Method methodM8691f;
        if (f8750c) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = f8754g;
                Object obj2 = f8755h;
                if (obj == obj2) {
                    return false;
                }
                if (obj == null) {
                    methodM8691f = m8691f(scheduledExecutorService);
                    if (methodM8691f != null) {
                        obj2 = methodM8691f;
                    }
                    f8754g = obj2;
                } else {
                    methodM8691f = (Method) obj;
                }
            } else {
                methodM8691f = m8691f(scheduledExecutorService);
            }
            if (methodM8691f != null) {
                try {
                    methodM8691f.invoke(scheduledExecutorService, Boolean.TRUE);
                    return true;
                } catch (IllegalAccessException e) {
                    ejd0.m3864j(e);
                } catch (IllegalArgumentException e2) {
                    ejd0.m3864j(e2);
                } catch (InvocationTargetException e3) {
                    ejd0.m3864j(e3);
                }
            }
        }
        return false;
    }

    @Override // p003l.bud0.AbstractC0185a
    /* JADX INFO: renamed from: b */
    public c4g0 mo2914b(d30 d30Var) {
        return mo2915c(d30Var, 0L, null);
    }

    @Override // p003l.bud0.AbstractC0185a
    /* JADX INFO: renamed from: c */
    public c4g0 mo2915c(d30 d30Var, long j, TimeUnit timeUnit) {
        return this.f8757b ? h4g0.m4917d() : m8695i(d30Var, j, timeUnit);
    }

    /* JADX INFO: renamed from: i */
    public ScheduledAction m8695i(d30 d30Var, long j, TimeUnit timeUnit) {
        ScheduledAction scheduledAction = new ScheduledAction(ejd0.m3871q(d30Var));
        ScheduledExecutorService scheduledExecutorService = this.f8756a;
        scheduledAction.add(j <= 0 ? scheduledExecutorService.submit(scheduledAction) : scheduledExecutorService.schedule(scheduledAction, j, timeUnit));
        return scheduledAction;
    }

    @Override // p003l.c4g0
    public boolean isUnsubscribed() {
        return this.f8757b;
    }

    /* JADX INFO: renamed from: j */
    public ScheduledAction m8696j(d30 d30Var, long j, TimeUnit timeUnit, bs5 bs5Var) {
        ScheduledAction scheduledAction = new ScheduledAction(ejd0.m3871q(d30Var), bs5Var);
        bs5Var.m3164a(scheduledAction);
        ScheduledExecutorService scheduledExecutorService = this.f8756a;
        scheduledAction.add(j <= 0 ? scheduledExecutorService.submit(scheduledAction) : scheduledExecutorService.schedule(scheduledAction, j, timeUnit));
        return scheduledAction;
    }

    /* JADX INFO: renamed from: k */
    public ScheduledAction m8697k(d30 d30Var, long j, TimeUnit timeUnit, g4g0 g4g0Var) {
        ScheduledAction scheduledAction = new ScheduledAction(ejd0.m3871q(d30Var), g4g0Var);
        g4g0Var.m4517a(scheduledAction);
        ScheduledExecutorService scheduledExecutorService = this.f8756a;
        scheduledAction.add(j <= 0 ? scheduledExecutorService.submit(scheduledAction) : scheduledExecutorService.schedule(scheduledAction, j, timeUnit));
        return scheduledAction;
    }

    @Override // p003l.c4g0
    public void unsubscribe() {
        this.f8757b = true;
        this.f8756a.shutdownNow();
        m8690e(this.f8756a);
    }
}
