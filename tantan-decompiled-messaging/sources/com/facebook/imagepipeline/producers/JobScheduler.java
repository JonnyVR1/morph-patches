package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p149l.ci2;
import p149l.jze;
import p149l.n6j;

/* JADX INFO: loaded from: classes.dex */
public class JobScheduler {

    /* JADX INFO: renamed from: a */
    public final Executor f6467a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1623d f6468b;

    /* JADX INFO: renamed from: e */
    public final int f6471e;

    /* JADX INFO: renamed from: c */
    public final Runnable f6469c = new RunnableC1620a();

    /* JADX INFO: renamed from: d */
    public final Runnable f6470d = new RunnableC1621b();

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public jze f6472f = null;

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public int f6473g = 0;

    /* JADX INFO: renamed from: h */
    @VisibleForTesting
    public JobState f6474h = JobState.IDLE;

    /* JADX INFO: renamed from: i */
    @VisibleForTesting
    public long f6475i = 0;

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public long f6476j = 0;

    @VisibleForTesting
    public enum JobState {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.JobScheduler$a */
    public class RunnableC1620a implements Runnable {
        public RunnableC1620a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            JobScheduler.this.m8473d();
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.JobScheduler$b */
    public class RunnableC1621b implements Runnable {
        public RunnableC1621b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            JobScheduler.this.m8478j();
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.JobScheduler$c */
    public static /* synthetic */ class C1622c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6479a;

        static {
            int[] iArr = new int[JobState.values().length];
            f6479a = iArr;
            try {
                iArr[JobState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6479a[JobState.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6479a[JobState.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6479a[JobState.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.JobScheduler$d */
    public interface InterfaceC1623d {
        /* JADX INFO: renamed from: a */
        void mo8480a(jze jzeVar, int i);
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.JobScheduler$e */
    @VisibleForTesting
    public static class C1624e {

        /* JADX INFO: renamed from: a */
        public static ScheduledExecutorService f6480a;

        /* JADX INFO: renamed from: a */
        public static ScheduledExecutorService m8481a() {
            if (f6480a == null) {
                f6480a = Executors.newSingleThreadScheduledExecutor();
            }
            return f6480a;
        }
    }

    public JobScheduler(Executor executor, InterfaceC1623d interfaceC1623d, int i) {
        this.f6467a = executor;
        this.f6468b = interfaceC1623d;
        this.f6471e = i;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m8471i(jze jzeVar, int i) {
        return ci2.m107028d(i) || ci2.m107032m(i, 4) || jze.m143894c0(jzeVar);
    }

    /* JADX INFO: renamed from: c */
    public void m8472c() {
        jze jzeVar;
        synchronized (this) {
            jzeVar = this.f6472f;
            this.f6472f = null;
            this.f6473g = 0;
        }
        jze.m143896n(jzeVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m8473d() {
        jze jzeVar;
        int i;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            jzeVar = this.f6472f;
            i = this.f6473g;
            this.f6472f = null;
            this.f6473g = 0;
            this.f6474h = JobState.RUNNING;
            this.f6476j = jUptimeMillis;
        }
        try {
            if (m8471i(jzeVar, i)) {
                this.f6468b.mo8480a(jzeVar, i);
            }
        } finally {
            jze.m143896n(jzeVar);
            m8476g();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8474e(long j) {
        Runnable runnableM158041a = n6j.m158041a(this.f6470d, "JobScheduler_enqueueJob");
        if (j > 0) {
            C1624e.m8481a().schedule(runnableM158041a, j, TimeUnit.MILLISECONDS);
        } else {
            runnableM158041a.run();
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized long m8475f() {
        return this.f6476j - this.f6475i;
    }

    /* JADX INFO: renamed from: g */
    public final void m8476g() {
        long jMax;
        boolean z;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.f6474h == JobState.RUNNING_AND_PENDING) {
                    jMax = Math.max(this.f6476j + ((long) this.f6471e), jUptimeMillis);
                    this.f6475i = jUptimeMillis;
                    this.f6474h = JobState.QUEUED;
                    z = true;
                } else {
                    this.f6474h = JobState.IDLE;
                    jMax = 0;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m8474e(jMax - jUptimeMillis);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m8477h() {
        long jMax;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                boolean z = false;
                if (!m8471i(this.f6472f, this.f6473g)) {
                    return false;
                }
                int i = C1622c.f6479a[this.f6474h.ordinal()];
                if (i != 1) {
                    if (i == 3) {
                        this.f6474h = JobState.RUNNING_AND_PENDING;
                    }
                    jMax = 0;
                } else {
                    jMax = Math.max(this.f6476j + ((long) this.f6471e), jUptimeMillis);
                    this.f6475i = jUptimeMillis;
                    this.f6474h = JobState.QUEUED;
                    z = true;
                }
                if (z) {
                    m8474e(jMax - jUptimeMillis);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8478j() {
        this.f6467a.execute(n6j.m158041a(this.f6469c, "JobScheduler_submitJob"));
    }

    /* JADX INFO: renamed from: k */
    public boolean m8479k(jze jzeVar, int i) {
        jze jzeVar2;
        if (!m8471i(jzeVar, i)) {
            return false;
        }
        synchronized (this) {
            jzeVar2 = this.f6472f;
            this.f6472f = jze.m143895m(jzeVar);
            this.f6473g = i;
        }
        jze.m143896n(jzeVar2);
        return true;
    }
}
