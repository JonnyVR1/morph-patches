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
import p133rx.C22306c;
import p133rx.internal.util.RxThreadFactory;
import p133rx.schedulers.Schedulers;
import p149l.edk0;
import p149l.jfd0;
import p149l.jo0;
import p149l.qjd0;
import p149l.roj0;

/* JADX INFO: loaded from: classes13.dex */
public class ThreadUtil {

    /* JADX INFO: renamed from: a */
    public static final Handler f56080a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public static final int f56081b;

    /* JADX INFO: renamed from: c */
    public static final int f56082c;

    /* JADX INFO: renamed from: d */
    public static final C13635b f56083d;

    /* JADX INFO: renamed from: e */
    public static int f56084e;

    /* JADX INFO: renamed from: f */
    public static final int f56085f;

    /* JADX INFO: renamed from: g */
    public static final ThreadPoolExecutor f56086g;

    public static abstract class PriorityRunnable implements Runnable, Comparable<PriorityRunnable> {

        /* JADX INFO: renamed from: a */
        public Priority f56087a;

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
        public abstract int m81316b(PriorityRunnable priorityRunnable);
    }

    /* JADX INFO: renamed from: com.tantanapp.common.utils.ThreadUtil$b */
    public static class C13635b {

        /* JADX INFO: renamed from: a */
        public final Map<String, Runnable> f56088a;

        /* JADX INFO: renamed from: b */
        public final LinkedList<Runnable> f56089b;

        /* JADX INFO: renamed from: c */
        public final PriorityBlockingQueue<Runnable> f56090c;

        public C13635b() {
            this.f56088a = new HashMap();
            this.f56089b = new LinkedList<>();
            this.f56090c = new PriorityBlockingQueue<>(11, new Comparator() { // from class: l.hpi0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ThreadUtil.C13635b.m81317a(this.f108929a, (Runnable) obj, (Runnable) obj2);
                }
            });
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ int m81317a(C13635b c13635b, Runnable runnable, Runnable runnable2) {
            int iIndexOf;
            int iIndexOf2;
            c13635b.getClass();
            boolean z = runnable instanceof PriorityRunnable;
            if (z && (runnable2 instanceof PriorityRunnable)) {
                int iM81316b = ((PriorityRunnable) runnable).m81316b((PriorityRunnable) runnable2);
                if (iM81316b != 0) {
                    return iM81316b;
                }
                iIndexOf = c13635b.f56089b.indexOf(runnable);
                iIndexOf2 = c13635b.f56089b.indexOf(runnable2);
            } else {
                if (z) {
                    return ((PriorityRunnable) runnable).f56087a.priority - 1;
                }
                if (runnable2 instanceof PriorityRunnable) {
                    return 1 - ((PriorityRunnable) runnable2).f56087a.priority;
                }
                iIndexOf = c13635b.f56089b.indexOf(runnable);
                iIndexOf2 = c13635b.f56089b.indexOf(runnable2);
            }
            return iIndexOf - iIndexOf2;
        }

        /* JADX INFO: renamed from: b */
        public synchronized void m81318b(Runnable runnable) {
            try {
                if (runnable instanceof AbstractRunnableC13636c) {
                    AbstractRunnableC13636c abstractRunnableC13636c = (AbstractRunnableC13636c) runnable;
                    AbstractRunnableC13636c abstractRunnableC13636c2 = (AbstractRunnableC13636c) this.f56088a.get(abstractRunnableC13636c.m81321a());
                    if (abstractRunnableC13636c2 != null) {
                        this.f56089b.remove(abstractRunnableC13636c2);
                        this.f56090c.remove(abstractRunnableC13636c2);
                    }
                    this.f56088a.put(abstractRunnableC13636c.m81321a(), runnable);
                }
                this.f56089b.addLast(runnable);
                this.f56090c.add(runnable);
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: c */
        public synchronized Runnable m81319c() {
            Runnable runnablePoll;
            runnablePoll = this.f56090c.poll();
            this.f56089b.remove(runnablePoll);
            if (runnablePoll != null && (runnablePoll instanceof AbstractRunnableC13636c)) {
                this.f56088a.remove(((AbstractRunnableC13636c) runnablePoll).m81321a());
            }
            return runnablePoll;
        }

        /* JADX INFO: renamed from: d */
        public synchronized int m81320d() {
            return this.f56090c.size();
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.common.utils.ThreadUtil$c */
    public static abstract class AbstractRunnableC13636c implements Runnable {
        /* JADX INFO: renamed from: a */
        public abstract String m81321a();
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() * 3;
        f56081b = iAvailableProcessors;
        f56082c = Math.max(5, iAvailableProcessors - 1);
        f56083d = new C13635b();
        f56084e = 0;
        int iMax = Math.max(5, Runtime.getRuntime().availableProcessors());
        f56085f = iMax;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iMax, iMax, 8L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new RxThreadFactory("TTIoPool-"));
        f56086g = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ roj0 m81306a() {
        while (true) {
            Runnable runnableM81319c = f56083d.m81319c();
            if (runnableM81319c == null) {
                m81312g(new Runnable() { // from class: l.gpi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ThreadUtil.m81307b();
                    }
                });
                return roj0.f160388a;
            }
            if (edk0.f90613c) {
                Thread.currentThread().getName();
            }
            try {
                runnableM81319c.run();
            } catch (Throwable th) {
                CrashHelper.m81296c(new Throwable("ThreadUtil io executeRunnableTask:" + th.getMessage(), th));
                if (th instanceof DBCorruptException) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m81307b() {
        if (edk0.f90613c) {
            Thread.currentThread().getName();
        }
        f56084e--;
        m81308c();
    }

    /* JADX INFO: renamed from: c */
    public static void m81308c() {
        int i;
        if (f56083d.m81320d() <= 0 || (i = f56084e) >= f56082c) {
            return;
        }
        f56084e = i + 1;
        m81309d();
    }

    /* JADX INFO: renamed from: d */
    public static void m81309d() {
        C22306c.fromCallable(new Callable() { // from class: l.fpi0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ThreadUtil.m81306a();
            }
        }).compose(qjd0.m174993e(Schedulers.from(f56086g))).observeOn(jo0.m142408a()).materialize().subscribe();
    }

    /* JADX INFO: renamed from: e */
    public static void m81310e(Runnable runnable, boolean z) {
        if (runnable == null) {
            jfd0.m141176a("Runnable could not be null !!!");
            return;
        }
        if (m81311f() || z) {
            f56083d.m81318b(runnable);
            m81308c();
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            CrashHelper.m81296c(new Throwable("ThreadUtil io throwable:" + th.getMessage(), th));
            if (th instanceof DBCorruptException) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m81311f() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    /* JADX INFO: renamed from: g */
    public static void m81312g(Runnable runnable) {
        f56080a.post(runnable);
    }

    /* JADX INFO: renamed from: h */
    public static void m81313h(Runnable runnable, long j) {
        f56080a.postDelayed(runnable, j);
    }

    /* JADX INFO: renamed from: i */
    public static void m81314i(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            f56080a.post(runnable);
        }
    }
}
