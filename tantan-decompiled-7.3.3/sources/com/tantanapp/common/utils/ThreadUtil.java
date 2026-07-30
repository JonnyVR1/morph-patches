package com.tantanapp.common.utils;

import android.os.Handler;
import android.os.Looper;
import com.tantanapp.common.utils.ThreadUtil;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.internal.util.RxThreadFactory;
import p137rx.schedulers.Schedulers;
import p153l.fo0;
import p153l.kmk0;
import p153l.mnd0;
import p153l.trd0;
import p153l.uxj0;

/* JADX INFO: loaded from: classes11.dex */
public class ThreadUtil {

    /* JADX INFO: renamed from: a */
    public static final Handler f56928a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public static final int f56929b;

    /* JADX INFO: renamed from: c */
    public static final int f56930c;

    /* JADX INFO: renamed from: d */
    public static final C13798b f56931d;

    /* JADX INFO: renamed from: e */
    public static int f56932e;

    /* JADX INFO: renamed from: f */
    public static final int f56933f;

    /* JADX INFO: renamed from: g */
    public static final ThreadPoolExecutor f56934g;

    public static abstract class PriorityRunnable implements Runnable, Comparable<PriorityRunnable> {

        /* JADX INFO: renamed from: a */
        public Priority f56935a;

        public enum Priority {
            HIGH(0),
            NORMAL(1),
            LOW(2);

            private int priority;

            Priority(int i) {
                this.priority = i;
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract int m82499b(PriorityRunnable priorityRunnable);
    }

    /* JADX INFO: renamed from: com.tantanapp.common.utils.ThreadUtil$b */
    public static class C13798b {

        /* JADX INFO: renamed from: a */
        public final Map<String, Runnable> f56936a;

        /* JADX INFO: renamed from: b */
        public final LinkedList<Runnable> f56937b;

        /* JADX INFO: renamed from: c */
        public final PriorityBlockingQueue<Runnable> f56938c;

        public C13798b() {
            this.f56936a = new HashMap();
            this.f56937b = new LinkedList<>();
            this.f56938c = new PriorityBlockingQueue<>(11, new Comparator() { // from class: l.jyi0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ThreadUtil.C13798b.m82500a(this.f123176a, (Runnable) obj, (Runnable) obj2);
                }
            });
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ int m82500a(C13798b c13798b, Runnable runnable, Runnable runnable2) {
            int iIndexOf;
            int iIndexOf2;
            c13798b.getClass();
            boolean z = runnable instanceof PriorityRunnable;
            if (z && (runnable2 instanceof PriorityRunnable)) {
                int iM82499b = ((PriorityRunnable) runnable).m82499b((PriorityRunnable) runnable2);
                if (iM82499b != 0) {
                    return iM82499b;
                }
                iIndexOf = c13798b.f56937b.indexOf(runnable);
                iIndexOf2 = c13798b.f56937b.indexOf(runnable2);
            } else {
                if (z) {
                    return ((PriorityRunnable) runnable).f56935a.priority - 1;
                }
                if (runnable2 instanceof PriorityRunnable) {
                    return 1 - ((PriorityRunnable) runnable2).f56935a.priority;
                }
                iIndexOf = c13798b.f56937b.indexOf(runnable);
                iIndexOf2 = c13798b.f56937b.indexOf(runnable2);
            }
            return iIndexOf - iIndexOf2;
        }

        /* JADX INFO: renamed from: b */
        public synchronized void m82501b(Runnable runnable) {
            try {
                if (runnable instanceof AbstractRunnableC13799c) {
                    AbstractRunnableC13799c abstractRunnableC13799c = (AbstractRunnableC13799c) runnable;
                    AbstractRunnableC13799c abstractRunnableC13799c2 = (AbstractRunnableC13799c) this.f56936a.get(abstractRunnableC13799c.m82504a());
                    if (abstractRunnableC13799c2 != null) {
                        this.f56937b.remove(abstractRunnableC13799c2);
                        this.f56938c.remove(abstractRunnableC13799c2);
                    }
                    this.f56936a.put(abstractRunnableC13799c.m82504a(), runnable);
                }
                this.f56937b.addLast(runnable);
                this.f56938c.add(runnable);
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: c */
        public synchronized Runnable m82502c() {
            Runnable runnablePoll;
            runnablePoll = this.f56938c.poll();
            this.f56937b.remove(runnablePoll);
            if (runnablePoll != null && (runnablePoll instanceof AbstractRunnableC13799c)) {
                this.f56936a.remove(((AbstractRunnableC13799c) runnablePoll).m82504a());
            }
            return runnablePoll;
        }

        /* JADX INFO: renamed from: d */
        public synchronized int m82503d() {
            return this.f56938c.size();
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.common.utils.ThreadUtil$c */
    public static abstract class AbstractRunnableC13799c implements Runnable {
        /* JADX INFO: renamed from: a */
        public abstract String m82504a();
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() * 3;
        f56929b = iAvailableProcessors;
        f56930c = Math.max(5, iAvailableProcessors - 1);
        f56931d = new C13798b();
        f56932e = 0;
        int iMax = Math.max(5, Runtime.getRuntime().availableProcessors());
        f56933f = iMax;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iMax, iMax, 8L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new RxThreadFactory("TTIoPool-"));
        f56934g = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ uxj0 m82489a() {
        while (true) {
            Runnable runnableM82502c = f56931d.m82502c();
            if (runnableM82502c == null) {
                m82495g(new Runnable() { // from class: l.iyi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ThreadUtil.m82490b();
                    }
                });
                return uxj0.f181467a;
            }
            if (kmk0.f127510c) {
                Thread.currentThread().getName();
            }
            try {
                runnableM82502c.run();
            } catch (Throwable th) {
                CrashHelper.m82479c(new Throwable("ThreadUtil io executeRunnableTask:" + th.getMessage(), th));
                if (th instanceof DBCorruptException) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m82490b() {
        if (kmk0.f127510c) {
            Thread.currentThread().getName();
        }
        f56932e--;
        m82491c();
    }

    /* JADX INFO: renamed from: c */
    public static void m82491c() {
        int i;
        if (f56931d.m82503d() <= 0 || (i = f56932e) >= f56930c) {
            return;
        }
        f56932e = i + 1;
        m82492d();
    }

    /* JADX INFO: renamed from: d */
    public static void m82492d() {
        C22421c.fromCallable(new Callable() { // from class: l.hyi0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ThreadUtil.m82489a();
            }
        }).compose(trd0.m192475e(Schedulers.from(f56934g))).observeOn(fo0.m126432a()).materialize().subscribe();
    }

    /* JADX INFO: renamed from: e */
    public static void m82493e(Runnable runnable, boolean z) {
        if (runnable == null) {
            mnd0.m159157a("Runnable could not be null !!!");
            return;
        }
        if (m82494f() || z) {
            f56931d.m82501b(runnable);
            m82491c();
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            CrashHelper.m82479c(new Throwable("ThreadUtil io throwable:" + th.getMessage(), th));
            if (th instanceof DBCorruptException) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m82494f() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    /* JADX INFO: renamed from: g */
    public static void m82495g(Runnable runnable) {
        f56928a.post(runnable);
    }

    /* JADX INFO: renamed from: h */
    public static void m82496h(Runnable runnable, long j) {
        f56928a.postDelayed(runnable, j);
    }

    /* JADX INFO: renamed from: i */
    public static void m82497i(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            f56928a.post(runnable);
        }
    }
}
