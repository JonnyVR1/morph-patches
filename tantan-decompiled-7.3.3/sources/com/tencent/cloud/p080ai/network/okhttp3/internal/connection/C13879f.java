package com.tencent.cloud.p080ai.network.okhttp3.internal.connection;

import com.google.android.gms.common.api.Api;
import com.tencent.cloud.p080ai.network.okhttp3.C13858a;
import com.tencent.cloud.p080ai.network.okhttp3.C13933s;
import com.tencent.cloud.p080ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractC13867a;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13915c;
import com.tencent.cloud.p080ai.network.okhttp3.internal.tls.C13921d;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import p153l.aqg0;
import p153l.fcg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.f */
/* JADX INFO: loaded from: classes12.dex */
public final class C13879f {

    /* JADX INFO: renamed from: g */
    public static final Executor f57370g = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), C13869c.m82795a("OkHttp ConnectionPool", true));

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ boolean f57371h = true;

    /* JADX INFO: renamed from: a */
    public final int f57372a;

    /* JADX INFO: renamed from: b */
    public final long f57373b;

    /* JADX INFO: renamed from: c */
    public final Runnable f57374c = new Runnable() { // from class: l.h1r0
        @Override // java.lang.Runnable
        public final void run() {
            this.f107478a.m82850a();
        }
    };

    /* JADX INFO: renamed from: d */
    public final Deque<C13878e> f57375d = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    public final C13880g f57376e = new C13880g();

    /* JADX INFO: renamed from: f */
    public boolean f57377f;

    public C13879f(int i, long j, TimeUnit timeUnit) {
        this.f57372a = i;
        this.f57373b = timeUnit.toNanos(j);
        if (j > 0) {
            return;
        }
        fcg0.m125008a("keepAliveDuration <= 0: ", j);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m82854a(C13858a c13858a, C13883j c13883j, List<C13933s> list, boolean z) {
        if (!f57371h && !Thread.holdsLock(this)) {
            aqg0.m99478a();
            return false;
        }
        for (C13878e c13878e : this.f57375d) {
            if (!z || c13878e.m82846a()) {
                if (c13878e.f57368p.size() < c13878e.f57367o && !c13878e.f57363k) {
                    AbstractC13867a abstractC13867a = AbstractC13867a.f57301a;
                    C13858a c13858a2 = c13878e.f57355c.f57790a;
                    ((OkHttpClient.C13852a) abstractC13867a).getClass();
                    if (c13858a2.m82769a(c13858a)) {
                        if (!c13858a.f57243a.f57760d.equals(c13878e.f57355c.f57790a.f57243a.f57760d)) {
                            if (c13878e.f57360h != null && list != null) {
                                int size = list.size();
                                for (int i = 0; i < size; i++) {
                                    C13933s c13933s = list.get(i);
                                    Proxy.Type type = c13933s.f57791b.type();
                                    Proxy.Type type2 = Proxy.Type.DIRECT;
                                    if (type == type2 && c13878e.f57355c.f57791b.type() == type2 && c13878e.f57355c.f57792c.equals(c13933s.f57792c)) {
                                        if (c13858a.f57252j != C13921d.f57661a || !c13878e.m82847a(c13858a.f57243a)) {
                                            break;
                                        }
                                        try {
                                            c13858a.f57253k.m82776a(c13858a.f57243a.f57760d, c13878e.f57358f.f57752c);
                                        } catch (SSLPeerUnverifiedException unused) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        c13883j.m82863a(c13878e);
                        return true;
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m82850a() {
        long j;
        while (true) {
            long jNanoTime = System.nanoTime();
            synchronized (this) {
                try {
                    C13878e c13878e = null;
                    long j2 = Long.MIN_VALUE;
                    int i = 0;
                    int i2 = 0;
                    for (C13878e c13878e2 : this.f57375d) {
                        if (m82852a(c13878e2, jNanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j3 = jNanoTime - c13878e2.f57369q;
                            if (j3 > j2) {
                                c13878e = c13878e2;
                                j2 = j3;
                            }
                        }
                    }
                    j = this.f57373b;
                    if (j2 >= j || i > this.f57372a) {
                        this.f57375d.remove(c13878e);
                        C13869c.m82799a(c13878e.f57357e);
                        j = 0;
                    } else if (i > 0) {
                        j -= j2;
                    } else if (i2 <= 0) {
                        this.f57377f = false;
                        j = -1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (j == -1) {
                return;
            }
            if (j > 0) {
                long j4 = j / 1000000;
                long j5 = j - (1000000 * j4);
                synchronized (this) {
                    try {
                        wait(j4, (int) j5);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82853a(C13933s c13933s, IOException iOException) {
        if (c13933s.f57791b.type() != Proxy.Type.DIRECT) {
            C13858a c13858a = c13933s.f57790a;
            c13858a.f57249g.connectFailed(c13858a.f57243a.m83050g(), c13933s.f57791b.address(), iOException);
        }
        C13880g c13880g = this.f57376e;
        synchronized (c13880g) {
            c13880g.f57378a.add(c13933s);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m82852a(C13878e c13878e, long j) {
        List<Reference<C13883j>> list = c13878e.f57368p;
        int i = 0;
        while (i < list.size()) {
            Reference<C13883j> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C13915c.f57649a.mo82972a("A connection to " + c13878e.f57355c.f57790a.f57243a + " was leaked. Did you forget to close a response body?", ((C13883j.b) reference).f57408a);
                list.remove(i);
                c13878e.f57363k = true;
                if (list.isEmpty()) {
                    c13878e.f57369q = j - this.f57373b;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
