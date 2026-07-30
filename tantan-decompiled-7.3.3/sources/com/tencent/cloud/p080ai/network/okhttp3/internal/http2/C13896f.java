package com.tencent.cloud.p080ai.network.okhttp3.internal.http2;

import com.google.android.gms.common.api.Api;
import com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractRunnableC13868b;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okio.C13939e;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13940f;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13941g;
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
import p153l.aqg0;
import p153l.p7f;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.f */
/* JADX INFO: loaded from: classes12.dex */
public final class C13896f implements Closeable {

    /* JADX INFO: renamed from: y */
    public static final ExecutorService f57501y = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), C13869c.m82795a("OkHttp Http2Connection", true));

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ boolean f57502z = true;

    /* JADX INFO: renamed from: a */
    public final boolean f57503a;

    /* JADX INFO: renamed from: b */
    public final e f57504b;

    /* JADX INFO: renamed from: d */
    public final String f57506d;

    /* JADX INFO: renamed from: e */
    public int f57507e;

    /* JADX INFO: renamed from: f */
    public int f57508f;

    /* JADX INFO: renamed from: g */
    public boolean f57509g;

    /* JADX INFO: renamed from: h */
    public final ScheduledExecutorService f57510h;

    /* JADX INFO: renamed from: i */
    public final ExecutorService f57511i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC13910t f57512j;

    /* JADX INFO: renamed from: r */
    public long f57520r;

    /* JADX INFO: renamed from: t */
    public final C13911u f57522t;

    /* JADX INFO: renamed from: u */
    public final Socket f57523u;

    /* JADX INFO: renamed from: v */
    public final C13908r f57524v;

    /* JADX INFO: renamed from: w */
    public final g f57525w;

    /* JADX INFO: renamed from: x */
    public final Set<Integer> f57526x;

    /* JADX INFO: renamed from: c */
    public final Map<Integer, C13907q> f57505c = new LinkedHashMap();

    /* JADX INFO: renamed from: k */
    public long f57513k = 0;

    /* JADX INFO: renamed from: l */
    public long f57514l = 0;

    /* JADX INFO: renamed from: m */
    public long f57515m = 0;

    /* JADX INFO: renamed from: n */
    public long f57516n = 0;

    /* JADX INFO: renamed from: o */
    public long f57517o = 0;

    /* JADX INFO: renamed from: p */
    public long f57518p = 0;

    /* JADX INFO: renamed from: q */
    public long f57519q = 0;

    /* JADX INFO: renamed from: s */
    public C13911u f57521s = new C13911u();

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.f$a */
    public class a extends AbstractRunnableC13868b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f57527b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ EnumC13892b f57528c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i, EnumC13892b enumC13892b) {
            super(str, objArr);
            this.f57527b = i;
            this.f57528c = enumC13892b;
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractRunnableC13868b
        /* JADX INFO: renamed from: a */
        public void mo82780a() {
            try {
                C13896f c13896f = C13896f.this;
                c13896f.f57524v.m82955a(this.f57527b, this.f57528c);
            } catch (IOException e) {
                C13896f c13896f2 = C13896f.this;
                EnumC13892b enumC13892b = EnumC13892b.PROTOCOL_ERROR;
                c13896f2.m82922a(enumC13892b, enumC13892b, e);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.f$b */
    public class b extends AbstractRunnableC13868b {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f57530b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f57531c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f57530b = i;
            this.f57531c = j;
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractRunnableC13868b
        /* JADX INFO: renamed from: a */
        public void mo82780a() {
            try {
                C13896f.this.f57524v.m82954a(this.f57530b, this.f57531c);
            } catch (IOException e) {
                C13896f c13896f = C13896f.this;
                EnumC13892b enumC13892b = EnumC13892b.PROTOCOL_ERROR;
                c13896f.m82922a(enumC13892b, enumC13892b, e);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.f$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public Socket f57533a;

        /* JADX INFO: renamed from: b */
        public String f57534b;

        /* JADX INFO: renamed from: c */
        public InterfaceC13941g f57535c;

        /* JADX INFO: renamed from: d */
        public InterfaceC13940f f57536d;

        /* JADX INFO: renamed from: e */
        public e f57537e = e.f57542a;

        /* JADX INFO: renamed from: f */
        public InterfaceC13910t f57538f = InterfaceC13910t.f57631a;

        /* JADX INFO: renamed from: g */
        public boolean f57539g;

        /* JADX INFO: renamed from: h */
        public int f57540h;

        public c(boolean z) {
            this.f57539g = z;
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.f$d */
    public final class d extends AbstractRunnableC13868b {
        public d() {
            super("OkHttp %s ping", C13896f.this.f57506d);
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractRunnableC13868b
        /* JADX INFO: renamed from: a */
        public void mo82780a() {
            C13896f c13896f;
            boolean z;
            synchronized (C13896f.this) {
                c13896f = C13896f.this;
                long j = c13896f.f57514l;
                long j2 = c13896f.f57513k;
                if (j < j2) {
                    z = true;
                } else {
                    c13896f.f57513k = j2 + 1;
                    z = false;
                }
            }
            if (!z) {
                c13896f.m82923a(false, 1, 0);
            } else {
                EnumC13892b enumC13892b = EnumC13892b.PROTOCOL_ERROR;
                c13896f.m82922a(enumC13892b, enumC13892b, (IOException) null);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.f$e */
    public static abstract class e {

        /* JADX INFO: renamed from: a */
        public static final e f57542a = new a();

        /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.f$e$a */
        public class a extends e {
            @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.http2.C13896f.e
            /* JADX INFO: renamed from: a */
            public void mo82845a(C13907q c13907q) {
                c13907q.m82941a(EnumC13892b.REFUSED_STREAM, (IOException) null);
            }
        }

        /* JADX INFO: renamed from: a */
        public void mo82844a(C13896f c13896f) {
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo82845a(C13907q c13907q);
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.f$f */
    public final class f extends AbstractRunnableC13868b {

        /* JADX INFO: renamed from: b */
        public final boolean f57543b;

        /* JADX INFO: renamed from: c */
        public final int f57544c;

        /* JADX INFO: renamed from: d */
        public final int f57545d;

        public f(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", C13896f.this.f57506d, Integer.valueOf(i), Integer.valueOf(i2));
            this.f57543b = z;
            this.f57544c = i;
            this.f57545d = i2;
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractRunnableC13868b
        /* JADX INFO: renamed from: a */
        public void mo82780a() {
            C13896f.this.m82923a(this.f57543b, this.f57544c, this.f57545d);
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.f$g */
    public class g extends AbstractRunnableC13868b implements C13906p.b {

        /* JADX INFO: renamed from: b */
        public final C13906p f57547b;

        public g(C13906p c13906p) {
            super("OkHttp %s", C13896f.this.f57506d);
            this.f57547b = c13906p;
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.AbstractRunnableC13868b
        /* JADX INFO: renamed from: a */
        public void mo82780a() throws Throwable {
            Throwable th;
            EnumC13892b enumC13892b;
            EnumC13892b enumC13892b2;
            EnumC13892b enumC13892b3 = EnumC13892b.INTERNAL_ERROR;
            IOException e = null;
            try {
                this.f57547b.m82930a(this);
                while (this.f57547b.m82934a(false, (C13906p.b) this)) {
                }
                enumC13892b = EnumC13892b.NO_ERROR;
                try {
                    try {
                        enumC13892b2 = EnumC13892b.CANCEL;
                    } catch (IOException e2) {
                        e = e2;
                        enumC13892b = EnumC13892b.PROTOCOL_ERROR;
                        enumC13892b2 = enumC13892b;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C13896f.this.m82922a(enumC13892b, enumC13892b3, e);
                    C13869c.m82798a(this.f57547b);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th3) {
                th = th3;
                enumC13892b = enumC13892b3;
                C13896f.this.m82922a(enumC13892b, enumC13892b3, e);
                C13869c.m82798a(this.f57547b);
                throw th;
            }
            C13896f.this.m82922a(enumC13892b, enumC13892b2, e);
            C13869c.m82798a(this.f57547b);
        }
    }

    public C13896f(c cVar) {
        C13911u c13911u = new C13911u();
        this.f57522t = c13911u;
        this.f57526x = new LinkedHashSet();
        this.f57512j = cVar.f57538f;
        boolean z = cVar.f57539g;
        this.f57503a = z;
        this.f57504b = cVar.f57537e;
        int i = z ? 1 : 2;
        this.f57508f = i;
        if (z) {
            this.f57508f = i + 2;
        }
        if (z) {
            this.f57521s.m82964a(7, 16777216);
        }
        String str = cVar.f57534b;
        this.f57506d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C13869c.m82795a(C13869c.m82788a("OkHttp %s Writer", str), false));
        this.f57510h = scheduledThreadPoolExecutor;
        if (cVar.f57540h != 0) {
            d dVar = new d();
            long j = cVar.f57540h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(dVar, j, j, TimeUnit.MILLISECONDS);
        }
        this.f57511i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C13869c.m82795a(C13869c.m82788a("OkHttp %s Push Observer", str), true));
        c13911u.m82964a(7, p7f.COLOR_SPACE_UNCALIBRATED);
        c13911u.m82964a(5, 16384);
        this.f57520r = c13911u.m82963a();
        this.f57523u = cVar.f57533a;
        this.f57524v = new C13908r(cVar.f57536d, z);
        this.f57525w = new g(new C13906p(cVar.f57535c, z));
    }

    /* JADX INFO: renamed from: a */
    public void m82920a(int i, boolean z, C13939e c13939e, long j) {
        long j2;
        int iMin;
        long j3;
        if (j == 0) {
            this.f57524v.m82959a(z, i, c13939e, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.f57520r;
                            if (j2 <= 0) {
                                if (!this.f57505c.containsKey(Integer.valueOf(i))) {
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
                iMin = Math.min((int) Math.min(j, j2), this.f57524v.f57621d);
                j3 = iMin;
                this.f57520r -= j3;
            }
            j -= j3;
            this.f57524v.m82959a(z && j == 0, i, c13939e, iMin);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m82922a(EnumC13892b.NO_ERROR, EnumC13892b.CANCEL, (IOException) null);
    }

    /* JADX INFO: renamed from: d */
    public boolean m82924d(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* JADX INFO: renamed from: e */
    public synchronized C13907q m82925e(int i) {
        C13907q c13907qRemove;
        c13907qRemove = this.f57505c.remove(Integer.valueOf(i));
        notifyAll();
        return c13907qRemove;
    }

    public void flush() {
        C13908r c13908r = this.f57524v;
        synchronized (c13908r) {
            if (c13908r.f57622e) {
                throw new IOException("closed");
            }
            c13908r.f57618a.flush();
        }
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m82926h(long j) {
        long j2 = this.f57519q + j;
        this.f57519q = j2;
        if (j2 >= this.f57521s.m82963a() / 2) {
            m82918a(0, this.f57519q);
            this.f57519q = 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82919a(int i, EnumC13892b enumC13892b) {
        try {
            this.f57510h.execute(new a("OkHttp %s stream %d", new Object[]{this.f57506d, Integer.valueOf(i)}, i, enumC13892b));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82918a(int i, long j) {
        try {
            this.f57510h.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f57506d, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82923a(boolean z, int i, int i2) {
        try {
            this.f57524v.m82958a(z, i, i2);
        } catch (IOException e2) {
            EnumC13892b enumC13892b = EnumC13892b.PROTOCOL_ERROR;
            m82922a(enumC13892b, enumC13892b, e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82921a(EnumC13892b enumC13892b) {
        synchronized (this.f57524v) {
            synchronized (this) {
                if (this.f57509g) {
                    return;
                }
                this.f57509g = true;
                this.f57524v.m82956a(this.f57507e, enumC13892b, C13869c.f57303a);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82922a(EnumC13892b enumC13892b, EnumC13892b enumC13892b2, IOException iOException) {
        C13907q[] c13907qArr;
        if (!f57502z && Thread.holdsLock(this)) {
            aqg0.m99478a();
            return;
        }
        try {
            m82921a(enumC13892b);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f57505c.isEmpty()) {
                    c13907qArr = null;
                } else {
                    c13907qArr = (C13907q[]) this.f57505c.values().toArray(new C13907q[this.f57505c.size()]);
                    this.f57505c.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c13907qArr != null) {
            for (C13907q c13907q : c13907qArr) {
                try {
                    c13907q.m82941a(enumC13892b2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f57524v.close();
        } catch (IOException unused3) {
        }
        try {
            this.f57523u.close();
        } catch (IOException unused4) {
        }
        this.f57510h.shutdown();
        this.f57511i.shutdown();
    }
}
