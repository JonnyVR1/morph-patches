package com.xiaomi.push.service;

import android.os.SystemClock;
import com.facebook.AuthenticationTokenClaims;
import java.util.concurrent.RejectedExecutionException;
import p153l.fcg0;
import p153l.mnd0;
import p153l.ouq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.n */
/* JADX INFO: loaded from: classes2.dex */
public class C15020n {

    /* JADX INFO: renamed from: a */
    private static long f63909a;

    /* JADX INFO: renamed from: b */
    private static long f63910b;

    /* JADX INFO: renamed from: c */
    private static long f63911c;

    /* JADX INFO: renamed from: a */
    private final a f63912a;

    /* JADX INFO: renamed from: a */
    private final c f63913a;

    /* JADX INFO: renamed from: com.xiaomi.push.service.n$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final c f63914a;

        public a(c cVar) {
            this.f63914a = cVar;
        }

        public void finalize() throws Throwable {
            try {
                synchronized (this.f63914a) {
                    this.f63914a.f63921c = true;
                    this.f63914a.notify();
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
        protected int f63915a;

        public b(int i) {
            this.f63915a = i;
        }
    }

    static {
        long jElapsedRealtime = SystemClock.elapsedRealtime() > 0 ? SystemClock.elapsedRealtime() : 0L;
        f63909a = jElapsedRealtime;
        f63910b = jElapsedRealtime;
    }

    public C15020n(String str, boolean z) {
        if (str == null) {
            mnd0.m159157a("name == null");
            throw null;
        }
        c cVar = new c(str, z);
        this.f63913a = cVar;
        this.f63912a = new a(cVar);
    }

    /* JADX INFO: renamed from: b */
    private void m87894b(b bVar, long j) {
        synchronized (this.f63913a) {
            try {
                if (this.f63913a.f63920b) {
                    throw new IllegalStateException("Timer was canceled");
                }
                long jM87892a = j + m87892a();
                if (jM87892a < 0) {
                    throw new IllegalArgumentException("Illegal delay to start the TimerTask: " + jM87892a);
                }
                d dVar = new d();
                dVar.f63926a = bVar.f63915a;
                dVar.f63928a = bVar;
                dVar.f63927a = jM87892a;
                this.f63913a.m87905a(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87898a(b bVar) {
        if (ouq0.m169381a() >= 1 || Thread.currentThread() == this.f63913a) {
            bVar.run();
        } else {
            ouq0.m169378B("run job outside job job thread");
            throw new RejectedExecutionException("Run job outside job thread");
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.n$c */
    public static final class c extends Thread {

        /* JADX INFO: renamed from: b */
        private boolean f63920b;

        /* JADX INFO: renamed from: c */
        private boolean f63921c;

        /* JADX INFO: renamed from: a */
        private volatile long f63916a = 0;

        /* JADX INFO: renamed from: a */
        private volatile boolean f63918a = false;

        /* JADX INFO: renamed from: b */
        private long f63919b = 50;

        /* JADX INFO: renamed from: a */
        private a f63917a = new a();

        public c(String str, boolean z) {
            setName(str);
            setDaemon(z);
            start();
        }

        /* JADX INFO: renamed from: a */
        public boolean m87909a() {
            return this.f63918a && SystemClock.uptimeMillis() - this.f63916a > AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED;
        }

        /* JADX WARN: Code restructure failed: missing block: B:59:0x009a, code lost:
        
            r10.f63916a = android.os.SystemClock.uptimeMillis();
            r10.f63918a = true;
            r2.f63928a.run();
            r10.f63918a = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00ab, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00ac, code lost:
        
            monitor-enter(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00ad, code lost:
        
            r10.f63920b = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00b0, code lost:
        
            throw r1;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f63920b) {
                            return;
                        }
                        if (!this.f63917a.m87919a()) {
                            long jM87892a = C15020n.m87892a();
                            d dVarM87914a = this.f63917a.m87914a();
                            synchronized (dVarM87914a.f63929a) {
                                if (dVarM87914a.f63930a) {
                                    this.f63917a.m87922b(0);
                                } else {
                                    long j = dVarM87914a.f63927a - jM87892a;
                                    if (j > 0) {
                                        long j2 = this.f63919b;
                                        if (j > j2) {
                                            j = j2;
                                        }
                                        long j3 = j2 + 50;
                                        this.f63919b = j3;
                                        if (j3 > 500) {
                                            this.f63919b = 500L;
                                        }
                                        try {
                                            wait(j);
                                        } catch (InterruptedException unused) {
                                        }
                                    } else {
                                        this.f63919b = 50L;
                                        synchronized (dVarM87914a.f63929a) {
                                            try {
                                                int iM87911a = this.f63917a.m87914a().f63927a != dVarM87914a.f63927a ? this.f63917a.m87911a(dVarM87914a) : 0;
                                                if (dVarM87914a.f63930a) {
                                                    a aVar = this.f63917a;
                                                    aVar.m87922b(aVar.m87911a(dVarM87914a));
                                                } else {
                                                    dVarM87914a.m87923a(dVarM87914a.f63927a);
                                                    this.f63917a.m87922b(iM87911a);
                                                    dVarM87914a.f63927a = 0L;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (this.f63921c) {
                            return;
                        } else {
                            try {
                                wait();
                            } catch (InterruptedException unused2) {
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m87905a(d dVar) {
            this.f63917a.m87918a(dVar);
            notify();
        }

        /* JADX INFO: renamed from: com.xiaomi.push.service.n$c$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private int f63922a;

            /* JADX INFO: renamed from: a */
            private d[] f63923a;

            /* JADX INFO: renamed from: b */
            private int f63924b;

            /* JADX INFO: renamed from: c */
            private int f63925c;

            private a() {
                this.f63922a = 256;
                this.f63923a = new d[256];
                this.f63924b = 0;
                this.f63925c = 0;
            }

            /* JADX INFO: renamed from: c */
            private void m87913c(int i) {
                int i2 = (i * 2) + 1;
                while (true) {
                    int i3 = this.f63924b;
                    if (i2 >= i3 || i3 <= 0) {
                        return;
                    }
                    int i4 = i2 + 1;
                    if (i4 < i3) {
                        d[] dVarArr = this.f63923a;
                        if (dVarArr[i4].f63927a < dVarArr[i2].f63927a) {
                            i2 = i4;
                        }
                    }
                    d[] dVarArr2 = this.f63923a;
                    d dVar = dVarArr2[i];
                    long j = dVar.f63927a;
                    d dVar2 = dVarArr2[i2];
                    if (j < dVar2.f63927a) {
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
            public void m87918a(d dVar) {
                d[] dVarArr = this.f63923a;
                int length = dVarArr.length;
                int i = this.f63924b;
                if (length == i) {
                    d[] dVarArr2 = new d[i * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, i);
                    this.f63923a = dVarArr2;
                }
                d[] dVarArr3 = this.f63923a;
                int i2 = this.f63924b;
                this.f63924b = i2 + 1;
                dVarArr3[i2] = dVar;
                m87912c();
            }

            /* JADX INFO: renamed from: b */
            public void m87921b() {
                int i = 0;
                while (i < this.f63924b) {
                    if (this.f63923a[i].f63930a) {
                        this.f63925c++;
                        m87922b(i);
                        i--;
                    }
                    i++;
                }
            }

            /* JADX INFO: renamed from: b */
            public void m87922b(int i) {
                int i2;
                if (i < 0 || i >= (i2 = this.f63924b)) {
                    return;
                }
                d[] dVarArr = this.f63923a;
                int i3 = i2 - 1;
                this.f63924b = i3;
                dVarArr[i] = dVarArr[i3];
                dVarArr[i3] = null;
                m87913c(i);
            }

            /* JADX INFO: renamed from: a */
            public d m87914a() {
                return this.f63923a[0];
            }

            /* JADX INFO: renamed from: a */
            public boolean m87919a() {
                return this.f63924b == 0;
            }

            /* JADX INFO: renamed from: a */
            public boolean m87920a(int i) {
                for (int i2 = 0; i2 < this.f63924b; i2++) {
                    if (this.f63923a[i2].f63926a == i) {
                        return true;
                    }
                }
                return false;
            }

            /* JADX INFO: renamed from: a */
            public void m87916a(int i) {
                for (int i2 = 0; i2 < this.f63924b; i2++) {
                    d dVar = this.f63923a[i2];
                    if (dVar.f63926a == i) {
                        dVar.m87924a();
                    }
                }
                m87921b();
            }

            /* JADX INFO: renamed from: a */
            public void m87917a(int i, b bVar) {
                for (int i2 = 0; i2 < this.f63924b; i2++) {
                    d dVar = this.f63923a[i2];
                    if (dVar.f63928a == bVar) {
                        dVar.m87924a();
                    }
                }
                m87921b();
            }

            /* JADX INFO: renamed from: a */
            public void m87915a() {
                this.f63923a = new d[this.f63922a];
                this.f63924b = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: a */
            public int m87911a(d dVar) {
                int i = 0;
                while (true) {
                    d[] dVarArr = this.f63923a;
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
            private void m87912c() {
                int i = this.f63924b;
                int i2 = i - 1;
                int i3 = (i - 2) / 2;
                while (true) {
                    d[] dVarArr = this.f63923a;
                    d dVar = dVarArr[i2];
                    long j = dVar.f63927a;
                    d dVar2 = dVarArr[i3];
                    if (j >= dVar2.f63927a) {
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
        public synchronized void m87908a() {
            this.f63920b = true;
            this.f63917a.m87915a();
            notify();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.n$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        int f63926a;

        /* JADX INFO: renamed from: a */
        long f63927a;

        /* JADX INFO: renamed from: a */
        b f63928a;

        /* JADX INFO: renamed from: a */
        final Object f63929a = new Object();

        /* JADX INFO: renamed from: a */
        boolean f63930a;

        /* JADX INFO: renamed from: b */
        private long f63931b;

        /* JADX INFO: renamed from: a */
        public boolean m87924a() {
            boolean z;
            synchronized (this.f63929a) {
                try {
                    z = !this.f63930a && this.f63927a > 0;
                    this.f63930a = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        /* JADX INFO: renamed from: a */
        public void m87923a(long j) {
            synchronized (this.f63929a) {
                this.f63931b = j;
            }
        }
    }

    public C15020n(String str) {
        this(str, false);
    }

    public C15020n(boolean z) {
        this("Timer-" + m87893b(), z);
    }

    public C15020n() {
        this(false);
    }

    /* JADX INFO: renamed from: a */
    public void m87895a() {
        ouq0.m169393m("quit. finalizer:" + this.f63912a);
        this.f63913a.m87908a();
    }

    /* JADX INFO: renamed from: a */
    public boolean m87901a(int i) {
        boolean zM87920a;
        synchronized (this.f63913a) {
            zM87920a = this.f63913a.f63917a.m87920a(i);
        }
        return zM87920a;
    }

    /* JADX INFO: renamed from: a */
    public void m87896a(int i) {
        synchronized (this.f63913a) {
            this.f63913a.f63917a.m87916a(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87897a(int i, b bVar) {
        synchronized (this.f63913a) {
            this.f63913a.f63917a.m87917a(i, bVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m87900a() {
        return this.f63913a.m87909a();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized long m87892a() {
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = f63910b;
            if (jElapsedRealtime > j) {
                f63909a += jElapsedRealtime - j;
            }
            f63910b = jElapsedRealtime;
        } catch (Throwable th) {
            throw th;
        }
        return f63909a;
    }

    /* JADX INFO: renamed from: a */
    public void m87899a(b bVar, long j) {
        if (j >= 0) {
            m87894b(bVar, j);
        } else {
            fcg0.m125008a("delay < 0: ", j);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m87902b() {
        synchronized (this.f63913a) {
            this.f63913a.f63917a.m87915a();
        }
    }

    /* JADX INFO: renamed from: b */
    private static synchronized long m87893b() {
        long j;
        j = f63911c;
        f63911c = 1 + j;
        return j;
    }
}
