package com.tencent.cloud.p075ai.network.okhttp3.internal.http2;

import com.google.android.gms.common.api.Api;
import com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractRunnableC13705b;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okio.C13776e;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13777f;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13778g;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p149l.j6f;
import p149l.shg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.f */
/* JADX INFO: loaded from: classes13.dex */
public final class C13733f implements Closeable {

    /* JADX INFO: renamed from: y */
    public static final ExecutorService f56653y = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), C13706c.m81612a("OkHttp Http2Connection", true));

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ boolean f56654z = true;

    /* JADX INFO: renamed from: a */
    public final boolean f56655a;

    /* JADX INFO: renamed from: b */
    public final e f56656b;

    /* JADX INFO: renamed from: d */
    public final String f56658d;

    /* JADX INFO: renamed from: e */
    public int f56659e;

    /* JADX INFO: renamed from: f */
    public int f56660f;

    /* JADX INFO: renamed from: g */
    public boolean f56661g;

    /* JADX INFO: renamed from: h */
    public final ScheduledExecutorService f56662h;

    /* JADX INFO: renamed from: i */
    public final ExecutorService f56663i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC13747t f56664j;

    /* JADX INFO: renamed from: r */
    public long f56672r;

    /* JADX INFO: renamed from: t */
    public final C13748u f56674t;

    /* JADX INFO: renamed from: u */
    public final Socket f56675u;

    /* JADX INFO: renamed from: v */
    public final C13745r f56676v;

    /* JADX INFO: renamed from: w */
    public final g f56677w;

    /* JADX INFO: renamed from: x */
    public final Set<Integer> f56678x;

    /* JADX INFO: renamed from: c */
    public final Map<Integer, C13744q> f56657c = new LinkedHashMap();

    /* JADX INFO: renamed from: k */
    public long f56665k = 0;

    /* JADX INFO: renamed from: l */
    public long f56666l = 0;

    /* JADX INFO: renamed from: m */
    public long f56667m = 0;

    /* JADX INFO: renamed from: n */
    public long f56668n = 0;

    /* JADX INFO: renamed from: o */
    public long f56669o = 0;

    /* JADX INFO: renamed from: p */
    public long f56670p = 0;

    /* JADX INFO: renamed from: q */
    public long f56671q = 0;

    /* JADX INFO: renamed from: s */
    public C13748u f56673s = new C13748u();

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.f$a */
    public class a extends AbstractRunnableC13705b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f56679b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ EnumC13729b f56680c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i, EnumC13729b enumC13729b) {
            super(str, objArr);
            this.f56679b = i;
            this.f56680c = enumC13729b;
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractRunnableC13705b
        /* JADX INFO: renamed from: a */
        public void mo81597a() {
            try {
                C13733f c13733f = C13733f.this;
                c13733f.f56676v.m81772a(this.f56679b, this.f56680c);
            } catch (IOException e) {
                C13733f c13733f2 = C13733f.this;
                EnumC13729b enumC13729b = EnumC13729b.PROTOCOL_ERROR;
                c13733f2.m81739a(enumC13729b, enumC13729b, e);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.f$b */
    public class b extends AbstractRunnableC13705b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f56682b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f56683c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f56682b = i;
            this.f56683c = j;
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractRunnableC13705b
        /* JADX INFO: renamed from: a */
        public void mo81597a() {
            try {
                C13733f.this.f56676v.m81771a(this.f56682b, this.f56683c);
            } catch (IOException e) {
                C13733f c13733f = C13733f.this;
                EnumC13729b enumC13729b = EnumC13729b.PROTOCOL_ERROR;
                c13733f.m81739a(enumC13729b, enumC13729b, e);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.f$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public Socket f56685a;

        /* JADX INFO: renamed from: b */
        public String f56686b;

        /* JADX INFO: renamed from: c */
        public InterfaceC13778g f56687c;

        /* JADX INFO: renamed from: d */
        public InterfaceC13777f f56688d;

        /* JADX INFO: renamed from: e */
        public e f56689e = e.f56694a;

        /* JADX INFO: renamed from: f */
        public InterfaceC13747t f56690f = InterfaceC13747t.f56783a;

        /* JADX INFO: renamed from: g */
        public boolean f56691g;

        /* JADX INFO: renamed from: h */
        public int f56692h;

        public c(boolean z) {
            this.f56691g = z;
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.f$d */
    public final class d extends AbstractRunnableC13705b {
        public d() {
            super("OkHttp %s ping", C13733f.this.f56658d);
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractRunnableC13705b
        /* JADX INFO: renamed from: a */
        public void mo81597a() {
            C13733f c13733f;
            boolean z;
            synchronized (C13733f.this) {
                c13733f = C13733f.this;
                long j = c13733f.f56666l;
                long j2 = c13733f.f56665k;
                if (j < j2) {
                    z = true;
                } else {
                    c13733f.f56665k = j2 + 1;
                    z = false;
                }
            }
            if (!z) {
                c13733f.m81740a(false, 1, 0);
            } else {
                EnumC13729b enumC13729b = EnumC13729b.PROTOCOL_ERROR;
                c13733f.m81739a(enumC13729b, enumC13729b, (IOException) null);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.f$e */
    public static abstract class e {

        /* JADX INFO: renamed from: a */
        public static final e f56694a = new a();

        /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.f$e$a */
        public class a extends e {
            @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.http2.C13733f.e
            /* JADX INFO: renamed from: a */
            public void mo81662a(C13744q c13744q) {
                c13744q.m81758a(EnumC13729b.REFUSED_STREAM, (IOException) null);
            }
        }

        /* JADX INFO: renamed from: a */
        public void mo81661a(C13733f c13733f) {
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo81662a(C13744q c13744q);
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.f$f */
    public final class f extends AbstractRunnableC13705b {

        /* JADX INFO: renamed from: b */
        public final boolean f56695b;

        /* JADX INFO: renamed from: c */
        public final int f56696c;

        /* JADX INFO: renamed from: d */
        public final int f56697d;

        public f(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", C13733f.this.f56658d, Integer.valueOf(i), Integer.valueOf(i2));
            this.f56695b = z;
            this.f56696c = i;
            this.f56697d = i2;
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractRunnableC13705b
        /* JADX INFO: renamed from: a */
        public void mo81597a() {
            C13733f.this.m81740a(this.f56695b, this.f56696c, this.f56697d);
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.f$g */
    public class g extends AbstractRunnableC13705b implements C13743p.b {

        /* JADX INFO: renamed from: b */
        public final C13743p f56699b;

        public g(C13743p c13743p) {
            super("OkHttp %s", C13733f.this.f56658d);
            this.f56699b = c13743p;
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.AbstractRunnableC13705b
        /* JADX INFO: renamed from: a */
        public void mo81597a() throws Throwable {
            Throwable th;
            EnumC13729b enumC13729b;
            EnumC13729b enumC13729b2;
            EnumC13729b enumC13729b3 = EnumC13729b.INTERNAL_ERROR;
            IOException e = null;
            try {
                this.f56699b.m81747a(this);
                while (this.f56699b.m81751a(false, (C13743p.b) this)) {
                }
                enumC13729b = EnumC13729b.NO_ERROR;
                try {
                    try {
                        enumC13729b2 = EnumC13729b.CANCEL;
                    } catch (IOException e2) {
                        e = e2;
                        enumC13729b = EnumC13729b.PROTOCOL_ERROR;
                        enumC13729b2 = enumC13729b;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C13733f.this.m81739a(enumC13729b, enumC13729b3, e);
                    C13706c.m81615a(this.f56699b);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th3) {
                th = th3;
                enumC13729b = enumC13729b3;
                C13733f.this.m81739a(enumC13729b, enumC13729b3, e);
                C13706c.m81615a(this.f56699b);
                throw th;
            }
            C13733f.this.m81739a(enumC13729b, enumC13729b2, e);
            C13706c.m81615a(this.f56699b);
        }
    }

    public C13733f(c cVar) {
        C13748u c13748u = new C13748u();
        this.f56674t = c13748u;
        this.f56678x = new LinkedHashSet();
        this.f56664j = cVar.f56690f;
        boolean z = cVar.f56691g;
        this.f56655a = z;
        this.f56656b = cVar.f56689e;
        int i = z ? 1 : 2;
        this.f56660f = i;
        if (z) {
            this.f56660f = i + 2;
        }
        if (z) {
            this.f56673s.m81781a(7, 16777216);
        }
        String str = cVar.f56686b;
        this.f56658d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C13706c.m81612a(C13706c.m81605a("OkHttp %s Writer", str), false));
        this.f56662h = scheduledThreadPoolExecutor;
        if (cVar.f56692h != 0) {
            d dVar = new d();
            long j = cVar.f56692h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(dVar, j, j, TimeUnit.MILLISECONDS);
        }
        this.f56663i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C13706c.m81612a(C13706c.m81605a("OkHttp %s Push Observer", str), true));
        c13748u.m81781a(7, j6f.COLOR_SPACE_UNCALIBRATED);
        c13748u.m81781a(5, 16384);
        this.f56672r = c13748u.m81780a();
        this.f56675u = cVar.f56685a;
        this.f56676v = new C13745r(cVar.f56688d, z);
        this.f56677w = new g(new C13743p(cVar.f56687c, z));
    }

    /* JADX INFO: renamed from: a */
    public void m81737a(int i, boolean z, C13776e c13776e, long j) {
        long j2;
        int iMin;
        long j3;
        if (j == 0) {
            this.f56676v.m81776a(z, i, c13776e, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.f56672r;
                            if (j2 <= 0) {
                                if (!this.f56657c.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    throw th;
                }
                iMin = Math.min((int) Math.min(j, j2), this.f56676v.f56773d);
                j3 = iMin;
                this.f56672r -= j3;
            }
            j -= j3;
            this.f56676v.m81776a(z && j == 0, i, c13776e, iMin);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m81739a(EnumC13729b.NO_ERROR, EnumC13729b.CANCEL, (IOException) null);
    }

    /* JADX INFO: renamed from: d */
    public boolean m81741d(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* JADX INFO: renamed from: e */
    public synchronized C13744q m81742e(int i) {
        C13744q c13744qRemove;
        c13744qRemove = this.f56657c.remove(Integer.valueOf(i));
        notifyAll();
        return c13744qRemove;
    }

    public void flush() {
        C13745r c13745r = this.f56676v;
        synchronized (c13745r) {
            if (c13745r.f56774e) {
                throw new IOException("closed");
            }
            c13745r.f56770a.flush();
        }
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m81743h(long j) {
        long j2 = this.f56671q + j;
        this.f56671q = j2;
        if (j2 >= this.f56673s.m81780a() / 2) {
            m81735a(0, this.f56671q);
            this.f56671q = 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m81736a(int i, EnumC13729b enumC13729b) {
        try {
            this.f56662h.execute(new a("OkHttp %s stream %d", new Object[]{this.f56658d, Integer.valueOf(i)}, i, enumC13729b));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m81735a(int i, long j) {
        try {
            this.f56662h.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f56658d, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m81740a(boolean z, int i, int i2) {
        try {
            this.f56676v.m81775a(z, i, i2);
        } catch (IOException e2) {
            EnumC13729b enumC13729b = EnumC13729b.PROTOCOL_ERROR;
            m81739a(enumC13729b, enumC13729b, e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m81738a(EnumC13729b enumC13729b) {
        synchronized (this.f56676v) {
            synchronized (this) {
                if (this.f56661g) {
                    return;
                }
                this.f56661g = true;
                this.f56676v.m81773a(this.f56659e, enumC13729b, C13706c.f56455a);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m81739a(EnumC13729b enumC13729b, EnumC13729b enumC13729b2, IOException iOException) {
        C13744q[] c13744qArr;
        if (!f56654z && Thread.holdsLock(this)) {
            shg0.m184191a();
            return;
        }
        try {
            m81738a(enumC13729b);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f56657c.isEmpty()) {
                    c13744qArr = null;
                } else {
                    c13744qArr = (C13744q[]) this.f56657c.values().toArray(new C13744q[this.f56657c.size()]);
                    this.f56657c.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c13744qArr != null) {
            for (C13744q c13744q : c13744qArr) {
                try {
                    c13744q.m81758a(enumC13729b2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f56676v.close();
        } catch (IOException unused3) {
        }
        try {
            this.f56675u.close();
        } catch (IOException unused4) {
        }
        this.f56662h.shutdown();
        this.f56663i.shutdown();
    }
}
