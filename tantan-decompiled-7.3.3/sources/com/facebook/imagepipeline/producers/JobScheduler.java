package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p153l.h9j;
import p153l.ji2;
import p153l.n0f;

/* JADX INFO: loaded from: classes.dex */
public class JobScheduler {

    /* JADX INFO: renamed from: a */
    public final Executor f6504a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1646d f6505b;

    /* JADX INFO: renamed from: e */
    public final int f6508e;

    /* JADX INFO: renamed from: c */
    public final Runnable f6506c = new RunnableC1643a();

    /* JADX INFO: renamed from: d */
    public final Runnable f6507d = new RunnableC1644b();

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public n0f f6509f = null;

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public int f6510g = 0;

    /* JADX INFO: renamed from: h */
    @VisibleForTesting
    public JobState f6511h = JobState.IDLE;

    /* JADX INFO: renamed from: i */
    @VisibleForTesting
    public long f6512i = 0;

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public long f6513j = 0;

    @VisibleForTesting
    public enum JobState {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.JobScheduler$a */
    public class RunnableC1643a implements Runnable {
        public RunnableC1643a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            JobScheduler.this.m8527d();
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.JobScheduler$b */
    public class RunnableC1644b implements Runnable {
        public RunnableC1644b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            JobScheduler.this.m8532j();
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.JobScheduler$c */
    public static /* synthetic */ class C1645c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6516a;

        static {
            int[] iArr = new int[JobState.values().length];
            f6516a = iArr;
            try {
                iArr[JobState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6516a[JobState.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6516a[JobState.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6516a[JobState.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.JobScheduler$d */
    public interface InterfaceC1646d {
        /* JADX INFO: renamed from: a */
        void mo8534a(n0f n0fVar, int i);
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.JobScheduler$e */
    @VisibleForTesting
    public static class C1647e {

        /* JADX INFO: renamed from: a */
        public static ScheduledExecutorService f6517a;

        /* JADX INFO: renamed from: a */
        public static ScheduledExecutorService m8535a() {
            if (f6517a == null) {
                f6517a = Executors.newSingleThreadScheduledExecutor();
            }
            return f6517a;
        }
    }

    public JobScheduler(Executor executor, InterfaceC1646d interfaceC1646d, int i) {
        this.f6504a = executor;
        this.f6505b = interfaceC1646d;
        this.f6508e = i;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m8525i(n0f n0fVar, int i) {
        return ji2.m144947d(i) || ji2.m144951m(i, 4) || n0f.m160957d0(n0fVar);
    }

    /* JADX INFO: renamed from: c */
    public void m8526c() {
        n0f n0fVar;
        synchronized (this) {
            n0fVar = this.f6509f;
            this.f6509f = null;
            this.f6510g = 0;
        }
        n0f.m160959n(n0fVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m8527d() {
        n0f n0fVar;
        int i;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            n0fVar = this.f6509f;
            i = this.f6510g;
            this.f6509f = null;
            this.f6510g = 0;
            this.f6511h = JobState.RUNNING;
            this.f6513j = jUptimeMillis;
        }
        try {
            if (m8525i(n0fVar, i)) {
                this.f6505b.mo8534a(n0fVar, i);
            }
        } finally {
            n0f.m160959n(n0fVar);
            m8530g();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8528e(long j) {
        Runnable runnableM134074a = h9j.m134074a(this.f6507d, "JobScheduler_enqueueJob");
        if (j > 0) {
            C1647e.m8535a().schedule(runnableM134074a, j, TimeUnit.MILLISECONDS);
        } else {
            runnableM134074a.run();
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized long m8529f() {
        return this.f6513j - this.f6512i;
    }

    /* JADX INFO: renamed from: g */
    public final void m8530g() {
        long jMax;
        boolean z;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.f6511h == JobState.RUNNING_AND_PENDING) {
                    jMax = Math.max(this.f6513j + ((long) this.f6508e), jUptimeMillis);
                    this.f6512i = jUptimeMillis;
                    this.f6511h = JobState.QUEUED;
                    z = true;
                } else {
                    this.f6511h = JobState.IDLE;
                    jMax = 0;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m8528e(jMax - jUptimeMillis);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m8531h() {
        long jMax;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                boolean z = false;
                if (!m8525i(this.f6509f, this.f6510g)) {
                    return false;
                }
                int i = C1645c.f6516a[this.f6511h.ordinal()];
                if (i != 1) {
                    if (i == 3) {
                        this.f6511h = JobState.RUNNING_AND_PENDING;
                    }
                    jMax = 0;
                } else {
                    jMax = Math.max(this.f6513j + ((long) this.f6508e), jUptimeMillis);
                    this.f6512i = jUptimeMillis;
                    this.f6511h = JobState.QUEUED;
                    z = true;
                }
                if (z) {
                    m8528e(jMax - jUptimeMillis);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8532j() {
        this.f6504a.execute(h9j.m134074a(this.f6506c, "JobScheduler_submitJob"));
    }

    /* JADX INFO: renamed from: k */
    public boolean m8533k(n0f n0fVar, int i) {
        n0f n0fVar2;
        if (!m8525i(n0fVar, i)) {
            return false;
        }
        synchronized (this) {
            n0fVar2 = this.f6509f;
            this.f6509f = n0f.m160958m(n0fVar);
            this.f6510g = i;
        }
        n0f.m160959n(n0fVar2);
        return true;
    }
}
