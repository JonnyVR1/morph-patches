package com.xiaomi.push.service;

import android.os.SystemClock;
import com.facebook.AuthenticationTokenClaims;
import java.util.concurrent.RejectedExecutionException;
import p149l.ilq0;
import p149l.jfd0;
import p149l.y3g0;

/* JADX INFO: renamed from: com.xiaomi.push.service.n */
/* JADX INFO: loaded from: classes2.dex */
public class C14872n {

    /* JADX INFO: renamed from: a */
    private static long f63062a;

    /* JADX INFO: renamed from: b */
    private static long f63063b;

    /* JADX INFO: renamed from: c */
    private static long f63064c;

    /* JADX INFO: renamed from: a */
    private final a f63065a;

    /* JADX INFO: renamed from: a */
    private final c f63066a;

    /* JADX INFO: renamed from: com.xiaomi.push.service.n$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final c f63067a;

        public a(c cVar) {
            this.f63067a = cVar;
        }

        public void finalize() throws Throwable {
            try {
                synchronized (this.f63067a) {
                    this.f63067a.f63074c = true;
                    this.f63067a.notify();
                }
                super.finalize();
            } catch (Throwable th) {
                super.finalize();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.n$b */
    public static abstract class b implements Runnable {

        /* JADX INFO: renamed from: a */
        protected int f63068a;

        public b(int i) {
            this.f63068a = i;
        }
    }

    static {
        long jElapsedRealtime = SystemClock.elapsedRealtime() > 0 ? SystemClock.elapsedRealtime() : 0L;
        f63062a = jElapsedRealtime;
        f63063b = jElapsedRealtime;
    }

    public C14872n(String str, boolean z) {
        if (str == null) {
            jfd0.m141176a("name == null");
            throw null;
        }
        c cVar = new c(str, z);
        this.f63066a = cVar;
        this.f63065a = new a(cVar);
    }

    /* JADX INFO: renamed from: b */
    private void m86723b(b bVar, long j) {
        synchronized (this.f63066a) {
            try {
                if (this.f63066a.f63073b) {
                    throw new IllegalStateException("Timer was canceled");
                }
                long jM86721a = j + m86721a();
                if (jM86721a < 0) {
                    throw new IllegalArgumentException("Illegal delay to start the TimerTask: " + jM86721a);
                }
                d dVar = new d();
                dVar.f63079a = bVar.f63068a;
                dVar.f63081a = bVar;
                dVar.f63080a = jM86721a;
                this.f63066a.m86734a(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86727a(b bVar) {
        if (ilq0.m137028a() >= 1 || Thread.currentThread() == this.f63066a) {
            bVar.run();
        } else {
            ilq0.m137025B("run job outside job job thread");
            throw new RejectedExecutionException("Run job outside job thread");
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.n$c */
    public static final class c extends Thread {

        /* JADX INFO: renamed from: b */
        private boolean f63073b;

        /* JADX INFO: renamed from: c */
        private boolean f63074c;

        /* JADX INFO: renamed from: a */
        private volatile long f63069a = 0;

        /* JADX INFO: renamed from: a */
        private volatile boolean f63071a = false;

        /* JADX INFO: renamed from: b */
        private long f63072b = 50;

        /* JADX INFO: renamed from: a */
        private a f63070a = new a();

        public c(String str, boolean z) {
            setName(str);
            setDaemon(z);
            start();
        }

        /* JADX INFO: renamed from: a */
        public boolean m86738a() {
            return this.f63071a && SystemClock.uptimeMillis() - this.f63069a > AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED;
        }

        /* JADX WARN: Code restructure failed: missing block: B:59:0x009a, code lost:
        
            r10.f63069a = android.os.SystemClock.uptimeMillis();
            r10.f63071a = true;
            r2.f63081a.run();
            r10.f63071a = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00ab, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00ac, code lost:
        
            monitor-enter(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00ad, code lost:
        
            r10.f63073b = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00b0, code lost:
        
            throw r1;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r10 = this;
            L0:
                monitor-enter(r10)
                boolean r0 = r10.f63073b     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto La
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L7
                goto L17
            L7:
                r0 = move-exception
                goto Lb8
            La:
                com.xiaomi.push.service.n$c$a r0 = r10.f63070a     // Catch: java.lang.Throwable -> L7
                boolean r0 = r0.m86748a()     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L1d
                boolean r0 = r10.f63074c     // Catch: java.lang.Throwable -> L7
                if (r0 == 0) goto L18
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L7
            L17:
                return
            L18:
                r10.wait()     // Catch: java.lang.Throwable -> L7 java.lang.InterruptedException -> L1b
            L1b:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L7
                goto L0
            L1d:
                long r0 = com.xiaomi.push.service.C14872n.m86721a()     // Catch: java.lang.Throwable -> L7
                com.xiaomi.push.service.n$c$a r2 = r10.f63070a     // Catch: java.lang.Throwable -> L7
                com.xiaomi.push.service.n$d r2 = r2.m86743a()     // Catch: java.lang.Throwable -> L7
                java.lang.Object r3 = r2.f63082a     // Catch: java.lang.Throwable -> L7
                monitor-enter(r3)     // Catch: java.lang.Throwable -> L7
                boolean r4 = r2.f63083a     // Catch: java.lang.Throwable -> L37
                r5 = 0
                if (r4 == 0) goto L3a
                com.xiaomi.push.service.n$c$a r0 = r10.f63070a     // Catch: java.lang.Throwable -> L37
                r0.m86751b(r5)     // Catch: java.lang.Throwable -> L37
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L7
                goto L0
            L37:
                r0 = move-exception
                goto Lb6
            L3a:
                long r6 = r2.f63080a     // Catch: java.lang.Throwable -> L37
                long r6 = r6 - r0
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
                r0 = 0
                int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                r8 = 50
                if (r3 <= 0) goto L5d
                long r0 = r10.f63072b     // Catch: java.lang.Throwable -> L7
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 <= 0) goto L4d
                r6 = r0
            L4d:
                long r0 = r0 + r8
                r10.f63072b = r0     // Catch: java.lang.Throwable -> L7
                r2 = 500(0x1f4, double:2.47E-321)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L58
                r10.f63072b = r2     // Catch: java.lang.Throwable -> L7
            L58:
                r10.wait(r6)     // Catch: java.lang.Throwable -> L7 java.lang.InterruptedException -> L5b
            L5b:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L7
                goto L0
            L5d:
                r10.f63072b = r8     // Catch: java.lang.Throwable -> L7
                java.lang.Object r3 = r2.f63082a     // Catch: java.lang.Throwable -> L7
                monitor-enter(r3)     // Catch: java.lang.Throwable -> L7
                com.xiaomi.push.service.n$c$a r4 = r10.f63070a     // Catch: java.lang.Throwable -> L77
                com.xiaomi.push.service.n$d r4 = r4.m86743a()     // Catch: java.lang.Throwable -> L77
                long r6 = r4.f63080a     // Catch: java.lang.Throwable -> L77
                long r8 = r2.f63080a     // Catch: java.lang.Throwable -> L77
                int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r4 == 0) goto L79
                com.xiaomi.push.service.n$c$a r4 = r10.f63070a     // Catch: java.lang.Throwable -> L77
                int r4 = com.xiaomi.push.service.C14872n.c.a.m86739a(r4, r2)     // Catch: java.lang.Throwable -> L77
                goto L7a
            L77:
                r0 = move-exception
                goto Lb4
            L79:
                r4 = r5
            L7a:
                boolean r6 = r2.f63083a     // Catch: java.lang.Throwable -> L77
                if (r6 == 0) goto L8b
                com.xiaomi.push.service.n$c$a r0 = r10.f63070a     // Catch: java.lang.Throwable -> L77
                int r1 = com.xiaomi.push.service.C14872n.c.a.m86739a(r0, r2)     // Catch: java.lang.Throwable -> L77
                r0.m86751b(r1)     // Catch: java.lang.Throwable -> L77
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L77
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L7
                goto L0
            L8b:
                long r6 = r2.f63080a     // Catch: java.lang.Throwable -> L77
                r2.m86752a(r6)     // Catch: java.lang.Throwable -> L77
                com.xiaomi.push.service.n$c$a r6 = r10.f63070a     // Catch: java.lang.Throwable -> L77
                r6.m86751b(r4)     // Catch: java.lang.Throwable -> L77
                r2.f63080a = r0     // Catch: java.lang.Throwable -> L77
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L77
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L7
                r0 = 1
                long r3 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> Lab
                r10.f63069a = r3     // Catch: java.lang.Throwable -> Lab
                r10.f63071a = r0     // Catch: java.lang.Throwable -> Lab
                com.xiaomi.push.service.n$b r1 = r2.f63081a     // Catch: java.lang.Throwable -> Lab
                r1.run()     // Catch: java.lang.Throwable -> Lab
                r10.f63071a = r5     // Catch: java.lang.Throwable -> Lab
                goto L0
            Lab:
                r1 = move-exception
                monitor-enter(r10)
                r10.f63073b = r0     // Catch: java.lang.Throwable -> Lb1
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb1
                throw r1
            Lb1:
                r0 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb1
                throw r0
            Lb4:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L77
                throw r0     // Catch: java.lang.Throwable -> L7
            Lb6:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
                throw r0     // Catch: java.lang.Throwable -> L7
            Lb8:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L7
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C14872n.c.run():void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m86734a(d dVar) {
            this.f63070a.m86747a(dVar);
            notify();
        }

        /* JADX INFO: renamed from: com.xiaomi.push.service.n$c$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private int f63075a;

            /* JADX INFO: renamed from: a */
            private d[] f63076a;

            /* JADX INFO: renamed from: b */
            private int f63077b;

            /* JADX INFO: renamed from: c */
            private int f63078c;

            private a() {
                this.f63075a = 256;
                this.f63076a = new d[256];
                this.f63077b = 0;
                this.f63078c = 0;
            }

            /* JADX INFO: renamed from: c */
            private void m86742c(int i) {
                int i2 = (i * 2) + 1;
                while (true) {
                    int i3 = this.f63077b;
                    if (i2 >= i3 || i3 <= 0) {
                        return;
                    }
                    int i4 = i2 + 1;
                    if (i4 < i3) {
                        d[] dVarArr = this.f63076a;
                        if (dVarArr[i4].f63080a < dVarArr[i2].f63080a) {
                            i2 = i4;
                        }
                    }
                    d[] dVarArr2 = this.f63076a;
                    d dVar = dVarArr2[i];
                    long j = dVar.f63080a;
                    d dVar2 = dVarArr2[i2];
                    if (j < dVar2.f63080a) {
                        return;
                    }
                    dVarArr2[i] = dVar2;
                    dVarArr2[i2] = dVar;
                    int i5 = i2;
                    i2 = (i2 * 2) + 1;
                    i = i5;
                }
            }

            /* JADX INFO: renamed from: a */
            public void m86747a(d dVar) {
                d[] dVarArr = this.f63076a;
                int length = dVarArr.length;
                int i = this.f63077b;
                if (length == i) {
                    d[] dVarArr2 = new d[i * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, i);
                    this.f63076a = dVarArr2;
                }
                d[] dVarArr3 = this.f63076a;
                int i2 = this.f63077b;
                this.f63077b = i2 + 1;
                dVarArr3[i2] = dVar;
                m86741c();
            }

            /* JADX INFO: renamed from: b */
            public void m86750b() {
                int i = 0;
                while (i < this.f63077b) {
                    if (this.f63076a[i].f63083a) {
                        this.f63078c++;
                        m86751b(i);
                        i--;
                    }
                    i++;
                }
            }

            /* JADX INFO: renamed from: b */
            public void m86751b(int i) {
                int i2;
                if (i < 0 || i >= (i2 = this.f63077b)) {
                    return;
                }
                d[] dVarArr = this.f63076a;
                int i3 = i2 - 1;
                this.f63077b = i3;
                dVarArr[i] = dVarArr[i3];
                dVarArr[i3] = null;
                m86742c(i);
            }

            /* JADX INFO: renamed from: a */
            public d m86743a() {
                return this.f63076a[0];
            }

            /* JADX INFO: renamed from: a */
            public boolean m86748a() {
                return this.f63077b == 0;
            }

            /* JADX INFO: renamed from: a */
            public boolean m86749a(int i) {
                for (int i2 = 0; i2 < this.f63077b; i2++) {
                    if (this.f63076a[i2].f63079a == i) {
                        return true;
                    }
                }
                return false;
            }

            /* JADX INFO: renamed from: a */
            public void m86745a(int i) {
                for (int i2 = 0; i2 < this.f63077b; i2++) {
                    d dVar = this.f63076a[i2];
                    if (dVar.f63079a == i) {
                        dVar.m86753a();
                    }
                }
                m86750b();
            }

            /* JADX INFO: renamed from: a */
            public void m86746a(int i, b bVar) {
                for (int i2 = 0; i2 < this.f63077b; i2++) {
                    d dVar = this.f63076a[i2];
                    if (dVar.f63081a == bVar) {
                        dVar.m86753a();
                    }
                }
                m86750b();
            }

            /* JADX INFO: renamed from: a */
            public void m86744a() {
                this.f63076a = new d[this.f63075a];
                this.f63077b = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: a */
            public int m86740a(d dVar) {
                int i = 0;
                while (true) {
                    d[] dVarArr = this.f63076a;
                    if (i >= dVarArr.length) {
                        return -1;
                    }
                    if (dVarArr[i] == dVar) {
                        return i;
                    }
                    i++;
                }
            }

            /* JADX INFO: renamed from: c */
            private void m86741c() {
                int i = this.f63077b;
                int i2 = i - 1;
                int i3 = (i - 2) / 2;
                while (true) {
                    d[] dVarArr = this.f63076a;
                    d dVar = dVarArr[i2];
                    long j = dVar.f63080a;
                    d dVar2 = dVarArr[i3];
                    if (j >= dVar2.f63080a) {
                        return;
                    }
                    dVarArr[i2] = dVar2;
                    dVarArr[i3] = dVar;
                    i2 = i3;
                    i3 = (i3 - 1) / 2;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public synchronized void m86737a() {
            this.f63073b = true;
            this.f63070a.m86744a();
            notify();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.n$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        int f63079a;

        /* JADX INFO: renamed from: a */
        long f63080a;

        /* JADX INFO: renamed from: a */
        b f63081a;

        /* JADX INFO: renamed from: a */
        final Object f63082a = new Object();

        /* JADX INFO: renamed from: a */
        boolean f63083a;

        /* JADX INFO: renamed from: b */
        private long f63084b;

        /* JADX INFO: renamed from: a */
        public boolean m86753a() {
            boolean z;
            synchronized (this.f63082a) {
                try {
                    z = !this.f63083a && this.f63080a > 0;
                    this.f63083a = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        /* JADX INFO: renamed from: a */
        public void m86752a(long j) {
            synchronized (this.f63082a) {
                this.f63084b = j;
            }
        }
    }

    public C14872n(String str) {
        this(str, false);
    }

    public C14872n(boolean z) {
        this("Timer-" + m86722b(), z);
    }

    public C14872n() {
        this(false);
    }

    /* JADX INFO: renamed from: a */
    public void m86724a() {
        ilq0.m137040m("quit. finalizer:" + this.f63065a);
        this.f63066a.m86737a();
    }

    /* JADX INFO: renamed from: a */
    public boolean m86730a(int i) {
        boolean zM86749a;
        synchronized (this.f63066a) {
            zM86749a = this.f63066a.f63070a.m86749a(i);
        }
        return zM86749a;
    }

    /* JADX INFO: renamed from: a */
    public void m86725a(int i) {
        synchronized (this.f63066a) {
            this.f63066a.f63070a.m86745a(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86726a(int i, b bVar) {
        synchronized (this.f63066a) {
            this.f63066a.f63070a.m86746a(i, bVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m86729a() {
        return this.f63066a.m86738a();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized long m86721a() {
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = f63063b;
            if (jElapsedRealtime > j) {
                f63062a += jElapsedRealtime - j;
            }
            f63063b = jElapsedRealtime;
        } catch (Throwable th) {
            throw th;
        }
        return f63062a;
    }

    /* JADX INFO: renamed from: a */
    public void m86728a(b bVar, long j) {
        if (j >= 0) {
            m86723b(bVar, j);
        } else {
            y3g0.m212802a("delay < 0: ", j);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m86731b() {
        synchronized (this.f63066a) {
            this.f63066a.f63070a.m86744a();
        }
    }

    /* JADX INFO: renamed from: b */
    private static synchronized long m86722b() {
        long j;
        j = f63064c;
        f63064c = 1 + j;
        return j;
    }
}
