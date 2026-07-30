package com.tencent.cloud.p075ai.network.okhttp3.internal.connection;

import com.google.android.gms.common.api.Api;
import com.tencent.cloud.p075ai.network.okhttp3.C13695a;
import com.tencent.cloud.p075ai.network.okhttp3.C13770s;
import com.tencent.cloud.p075ai.network.okhttp3.OkHttpClient;
import com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractC13704a;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13752c;
import com.tencent.cloud.p075ai.network.okhttp3.internal.tls.C13758d;
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
import p149l.shg0;
import p149l.y3g0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.f */
/* JADX INFO: loaded from: classes13.dex */
public final class C13716f {

    /* JADX INFO: renamed from: g */
    public static final Executor f56522g = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), C13706c.m81612a("OkHttp ConnectionPool", true));

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ boolean f56523h = true;

    /* JADX INFO: renamed from: a */
    public final int f56524a;

    /* JADX INFO: renamed from: b */
    public final long f56525b;

    /* JADX INFO: renamed from: c */
    public final Runnable f56526c = new Runnable() { // from class: l.bsq0
        @Override // java.lang.Runnable
        public final void run() {
            this.f77116a.m81667a();
        }
    };

    /* JADX INFO: renamed from: d */
    public final Deque<C13715e> f56527d = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    public final C13717g f56528e = new C13717g();

    /* JADX INFO: renamed from: f */
    public boolean f56529f;

    public C13716f(int i, long j, TimeUnit timeUnit) {
        this.f56524a = i;
        this.f56525b = timeUnit.toNanos(j);
        if (j > 0) {
            return;
        }
        y3g0.m212802a("keepAliveDuration <= 0: ", j);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m81671a(C13695a c13695a, C13720j c13720j, List<C13770s> list, boolean z) {
        if (!f56523h && !Thread.holdsLock(this)) {
            shg0.m184191a();
            return false;
        }
        for (C13715e c13715e : this.f56527d) {
            if (!z || c13715e.m81663a()) {
                if (c13715e.f56520p.size() < c13715e.f56519o && !c13715e.f56515k) {
                    AbstractC13704a abstractC13704a = AbstractC13704a.f56453a;
                    C13695a c13695a2 = c13715e.f56507c.f56942a;
                    ((OkHttpClient.C13689a) abstractC13704a).getClass();
                    if (c13695a2.m81586a(c13695a)) {
                        if (!c13695a.f56395a.f56912d.equals(c13715e.f56507c.f56942a.f56395a.f56912d)) {
                            if (c13715e.f56512h != null && list != null) {
                                int size = list.size();
                                for (int i = 0; i < size; i++) {
                                    C13770s c13770s = list.get(i);
                                    Proxy.Type type = c13770s.f56943b.type();
                                    Proxy.Type type2 = Proxy.Type.DIRECT;
                                    if (type == type2 && c13715e.f56507c.f56943b.type() == type2 && c13715e.f56507c.f56944c.equals(c13770s.f56944c)) {
                                        if (c13695a.f56404j != C13758d.f56813a || !c13715e.m81664a(c13695a.f56395a)) {
                                            break;
                                        }
                                        try {
                                            c13695a.f56405k.m81593a(c13695a.f56395a.f56912d, c13715e.f56510f.f56904c);
                                        } catch (SSLPeerUnverifiedException unused) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        c13720j.m81680a(c13715e);
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
    public void m81667a() {
        long j;
        while (true) {
            long jNanoTime = System.nanoTime();
            synchronized (this) {
                try {
                    C13715e c13715e = null;
                    long j2 = Long.MIN_VALUE;
                    int i = 0;
                    int i2 = 0;
                    for (C13715e c13715e2 : this.f56527d) {
                        if (m81669a(c13715e2, jNanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j3 = jNanoTime - c13715e2.f56521q;
                            if (j3 > j2) {
                                c13715e = c13715e2;
                                j2 = j3;
                            }
                        }
                    }
                    j = this.f56525b;
                    if (j2 >= j || i > this.f56524a) {
                        this.f56527d.remove(c13715e);
                        C13706c.m81616a(c13715e.f56509e);
                        j = 0;
                    } else if (i > 0) {
                        j -= j2;
                    } else if (i2 <= 0) {
                        this.f56529f = false;
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
    public void m81670a(C13770s c13770s, IOException iOException) {
        if (c13770s.f56943b.type() != Proxy.Type.DIRECT) {
            C13695a c13695a = c13770s.f56942a;
            c13695a.f56401g.connectFailed(c13695a.f56395a.m81867g(), c13770s.f56943b.address(), iOException);
        }
        C13717g c13717g = this.f56528e;
        synchronized (c13717g) {
            c13717g.f56530a.add(c13770s);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m81669a(C13715e c13715e, long j) {
        List<Reference<C13720j>> list = c13715e.f56520p;
        int i = 0;
        while (i < list.size()) {
            Reference<C13720j> reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C13752c.f56801a.mo81789a("A connection to " + c13715e.f56507c.f56942a.f56395a + " was leaked. Did you forget to close a response body?", ((C13720j.b) reference).f56560a);
                list.remove(i);
                c13715e.f56515k = true;
                if (list.isEmpty()) {
                    c13715e.f56521q = j - this.f56525b;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
