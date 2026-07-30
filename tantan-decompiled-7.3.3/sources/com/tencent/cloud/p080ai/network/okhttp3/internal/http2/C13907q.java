package com.tencent.cloud.p080ai.network.okhttp3.internal.http2;

import com.tencent.cloud.p080ai.network.okhttp3.C13929o;
import com.tencent.cloud.p080ai.network.okio.C13937c;
import com.tencent.cloud.p080ai.network.okio.C13939e;
import com.tencent.cloud.p080ai.network.okio.C13958x;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13956v;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13957w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.RejectedExecutionException;
import p153l.aqg0;
import p153l.fcg0;
import p153l.mnd0;
import p153l.wtq0;
import p153l.zpg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.q */
/* JADX INFO: loaded from: classes12.dex */
public final class C13907q {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ boolean f57590m = true;

    /* JADX INFO: renamed from: a */
    public long f57591a = 0;

    /* JADX INFO: renamed from: b */
    public long f57592b;

    /* JADX INFO: renamed from: c */
    public final int f57593c;

    /* JADX INFO: renamed from: d */
    public final C13896f f57594d;

    /* JADX INFO: renamed from: e */
    public final Deque<C13929o> f57595e;

    /* JADX INFO: renamed from: f */
    public boolean f57596f;

    /* JADX INFO: renamed from: g */
    public final b f57597g;

    /* JADX INFO: renamed from: h */
    public final a f57598h;

    /* JADX INFO: renamed from: i */
    public final c f57599i;

    /* JADX INFO: renamed from: j */
    public final c f57600j;

    /* JADX INFO: renamed from: k */
    public EnumC13892b f57601k;

    /* JADX INFO: renamed from: l */
    public IOException f57602l;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.q$a */
    public final class a implements InterfaceC13956v {

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ boolean f57603e = true;

        /* JADX INFO: renamed from: a */
        public final C13939e f57604a = new C13939e();

        /* JADX INFO: renamed from: b */
        public boolean f57605b;

        /* JADX INFO: renamed from: c */
        public boolean f57606c;

        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:27:0x005a  */
        /* JADX INFO: renamed from: a */
        public final void m82949a(boolean z) throws IOException {
            C13907q c13907q;
            long jMin;
            C13907q c13907q2;
            boolean z2;
            synchronized (C13907q.this) {
                C13907q.this.f57600j.m83076h();
                while (true) {
                    try {
                        c13907q = C13907q.this;
                        if (c13907q.f57592b > 0 || this.f57606c || this.f57605b || c13907q.f57601k != null) {
                            break;
                        } else {
                            c13907q.m82948f();
                        }
                    } catch (Throwable th) {
                        C13907q.this.f57600j.m82952k();
                        throw th;
                    }
                }
                c13907q.f57600j.m82952k();
                C13907q.this.m82943b();
                jMin = Math.min(C13907q.this.f57592b, this.f57604a.f57818b);
                c13907q2 = C13907q.this;
                c13907q2.f57592b -= jMin;
            }
            c13907q2.f57600j.m83076h();
            if (z) {
                try {
                    if (jMin == this.f57604a.f57818b) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } finally {
                    C13907q.this.f57600j.m82952k();
                }
            } else {
                z2 = false;
            }
            boolean z3 = z2;
            C13907q c13907q3 = C13907q.this;
            c13907q3.f57594d.m82920a(c13907q3.f57593c, z3, this.f57604a, jMin);
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!f57603e && Thread.holdsLock(C13907q.this)) {
                aqg0.m99478a();
                return;
            }
            synchronized (C13907q.this) {
                try {
                    if (this.f57605b) {
                        return;
                    }
                    C13907q c13907q = C13907q.this;
                    if (!c13907q.f57598h.f57606c) {
                        if (this.f57604a.f57818b > 0) {
                            while (this.f57604a.f57818b > 0) {
                                m82949a(true);
                            }
                        } else {
                            c13907q.f57594d.m82920a(c13907q.f57593c, true, null, 0L);
                        }
                    }
                    synchronized (C13907q.this) {
                        this.f57605b = true;
                    }
                    C13907q.this.f57594d.flush();
                    C13907q.this.m82939a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v, java.io.Flushable
        public void flush() throws IOException {
            if (!f57603e && Thread.holdsLock(C13907q.this)) {
                aqg0.m99478a();
                return;
            }
            synchronized (C13907q.this) {
                C13907q.this.m82943b();
            }
            while (this.f57604a.f57818b > 0) {
                m82949a(false);
                C13907q.this.f57594d.flush();
            }
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v
        public C13958x timeout() {
            return C13907q.this.f57600j;
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v
        public void write(C13939e c13939e, long j) throws IOException {
            if (!f57603e && Thread.holdsLock(C13907q.this)) {
                aqg0.m99478a();
                return;
            }
            this.f57604a.write(c13939e, j);
            while (this.f57604a.f57818b >= 16384) {
                m82949a(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.q$b */
    public final class b implements InterfaceC13957w {

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ boolean f57608h = true;

        /* JADX INFO: renamed from: a */
        public final C13939e f57609a = new C13939e();

        /* JADX INFO: renamed from: b */
        public final C13939e f57610b = new C13939e();

        /* JADX INFO: renamed from: c */
        public final long f57611c;

        /* JADX INFO: renamed from: d */
        public C13929o f57612d;

        /* JADX INFO: renamed from: e */
        public boolean f57613e;

        /* JADX INFO: renamed from: f */
        public boolean f57614f;

        public b(long j) {
            this.f57611c = j;
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0086  */
        /* JADX WARN: Code duplicated, block: B:41:0x008a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x008c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:43:0x008d  */
        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
        /* JADX INFO: renamed from: a */
        public long mo82814a(C13939e c13939e, long j) throws Throwable {
            Throwable c13912v;
            long jMo82814a;
            if (j < 0) {
                fcg0.m125008a("byteCount < 0: ", j);
                return 0L;
            }
            while (true) {
                synchronized (C13907q.this) {
                    try {
                        C13907q.this.f57599i.m83076h();
                        try {
                            C13907q c13907q = C13907q.this;
                            EnumC13892b enumC13892b = c13907q.f57601k;
                            if (enumC13892b != null) {
                                c13912v = c13907q.f57602l;
                                if (c13912v == null) {
                                    c13912v = new C13912v(enumC13892b);
                                }
                            } else {
                                c13912v = null;
                            }
                            if (this.f57613e) {
                                throw new IOException("stream closed");
                            }
                            C13939e c13939e2 = this.f57610b;
                            long j2 = c13939e2.f57818b;
                            if (j2 > 0) {
                                jMo82814a = c13939e2.mo82814a(c13939e, Math.min(j, j2));
                                C13907q c13907q2 = C13907q.this;
                                long j3 = c13907q2.f57591a + jMo82814a;
                                c13907q2.f57591a = j3;
                                if (c13912v != null || j3 < c13907q2.f57594d.f57521s.m82963a() / 2) {
                                    break;
                                    break;
                                }
                                C13907q c13907q3 = C13907q.this;
                                c13907q3.f57594d.m82918a(c13907q3.f57593c, c13907q3.f57591a);
                                C13907q.this.f57591a = 0L;
                                break;
                            }
                            if (this.f57614f || c13912v != null) {
                                jMo82814a = -1;
                                break;
                            }
                            C13907q.this.m82948f();
                            C13907q.this.f57599i.m82952k();
                        } catch (Throwable th) {
                            C13907q.this.f57599i.m82952k();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (jMo82814a != -1) {
                    m82950h(jMo82814a);
                    return jMo82814a;
                }
                if (c13912v == null) {
                    return -1L;
                }
                throw c13912v;
            }
            C13907q.this.f57599i.m82952k();
            if (jMo82814a != -1) {
                m82950h(jMo82814a);
                return jMo82814a;
            }
            if (c13912v == null) {
                return -1L;
            }
            throw c13912v;
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long j;
            synchronized (C13907q.this) {
                this.f57613e = true;
                C13939e c13939e = this.f57610b;
                j = c13939e.f57818b;
                c13939e.m83127k();
                C13907q.this.notifyAll();
            }
            if (j > 0) {
                m82950h(j);
            }
            C13907q.this.m82939a();
        }

        /* JADX INFO: renamed from: h */
        public final void m82950h(long j) {
            if (f57608h || !Thread.holdsLock(C13907q.this)) {
                C13907q.this.f57594d.m82926h(j);
            } else {
                aqg0.m99478a();
            }
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
        public C13958x timeout() {
            return C13907q.this.f57599i;
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.q$c */
    public class c extends C13937c {
        public c() {
        }

        @Override // com.tencent.cloud.p080ai.network.okio.C13937c
        /* JADX INFO: renamed from: a */
        public IOException mo82951a(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.tencent.cloud.p080ai.network.okio.C13937c
        /* JADX INFO: renamed from: j */
        public void mo82868j() {
            C13907q.this.m82940a(EnumC13892b.CANCEL);
            C13896f c13896f = C13907q.this.f57594d;
            synchronized (c13896f) {
                try {
                    long j = c13896f.f57516n;
                    long j2 = c13896f.f57515m;
                    if (j < j2) {
                        return;
                    }
                    c13896f.f57515m = j2 + 1;
                    c13896f.f57518p = System.nanoTime() + 1000000000;
                    try {
                        c13896f.f57510h.execute(new C13897g(c13896f, "OkHttp %s ping", c13896f.f57506d));
                    } catch (RejectedExecutionException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public void m82952k() throws IOException {
            if (m83077i()) {
                throw mo82951a((IOException) null);
            }
        }
    }

    public C13907q(int i, C13896f c13896f, boolean z, boolean z2, C13929o c13929o) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f57595e = arrayDeque;
        this.f57599i = new c();
        this.f57600j = new c();
        if (c13896f == null) {
            mnd0.m159157a("connection == null");
            throw null;
        }
        this.f57593c = i;
        this.f57594d = c13896f;
        this.f57592b = c13896f.f57522t.m82963a();
        b bVar = new b(c13896f.f57521s.m82963a());
        this.f57597g = bVar;
        a aVar = new a();
        this.f57598h = aVar;
        bVar.f57614f = z2;
        aVar.f57606c = z;
        if (c13929o != null) {
            arrayDeque.add(c13929o);
        }
        if (m82946d() && c13929o != null) {
            wtq0.m207906a("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        if (m82946d() || c13929o != null) {
            return;
        }
        wtq0.m207906a("remotely-initiated streams should have headers");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0029  */
    /* JADX INFO: renamed from: a */
    public void m82939a() {
        boolean z;
        boolean zM82947e;
        if (!f57590m && Thread.holdsLock(this)) {
            aqg0.m99478a();
            return;
        }
        synchronized (this) {
            try {
                b bVar = this.f57597g;
                if (bVar.f57614f || !bVar.f57613e) {
                    z = false;
                } else {
                    a aVar = this.f57598h;
                    if (aVar.f57606c || aVar.f57605b) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zM82947e = m82947e();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m82941a(EnumC13892b.CANCEL, (IOException) null);
        } else {
            if (zM82947e) {
                return;
            }
            this.f57594d.m82925e(this.f57593c);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m82944b(EnumC13892b enumC13892b, IOException iOException) {
        if (!f57590m && Thread.holdsLock(this)) {
            aqg0.m99478a();
            return false;
        }
        synchronized (this) {
            try {
                if (this.f57601k != null) {
                    return false;
                }
                if (this.f57597g.f57614f && this.f57598h.f57606c) {
                    return false;
                }
                this.f57601k = enumC13892b;
                this.f57602l = iOException;
                notifyAll();
                this.f57594d.m82925e(this.f57593c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC13956v m82945c() {
        synchronized (this) {
            try {
                if (!this.f57596f && !m82946d()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f57598h;
    }

    /* JADX INFO: renamed from: d */
    public boolean m82946d() {
        return this.f57594d.f57503a == ((this.f57593c & 1) == 1);
    }

    /* JADX INFO: renamed from: e */
    public synchronized boolean m82947e() {
        try {
            if (this.f57601k != null) {
                return false;
            }
            b bVar = this.f57597g;
            if (bVar.f57614f || bVar.f57613e) {
                a aVar = this.f57598h;
                if ((aVar.f57606c || aVar.f57605b) && this.f57596f) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m82948f() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m82943b() throws IOException {
        a aVar = this.f57598h;
        if (!aVar.f57605b) {
            if (!aVar.f57606c) {
                EnumC13892b enumC13892b = this.f57601k;
                if (enumC13892b != null) {
                    IOException iOException = this.f57602l;
                    if (iOException == null) {
                        throw new C13912v(enumC13892b);
                    }
                    throw iOException;
                }
                return;
            }
            zpg0.m220844a("stream finished");
            return;
        }
        zpg0.m220844a("stream closed");
    }

    /* JADX INFO: renamed from: a */
    public void m82940a(EnumC13892b enumC13892b) {
        if (m82944b(enumC13892b, null)) {
            this.f57594d.m82919a(this.f57593c, enumC13892b);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82942a(C13929o c13929o, boolean z) {
        boolean zM82947e;
        if (!f57590m && Thread.holdsLock(this)) {
            aqg0.m99478a();
            return;
        }
        synchronized (this) {
            try {
                if (this.f57596f && z) {
                    this.f57597g.f57612d = c13929o;
                } else {
                    this.f57596f = true;
                    this.f57595e.add(c13929o);
                }
                if (z) {
                    this.f57597g.f57614f = true;
                }
                zM82947e = m82947e();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM82947e) {
            return;
        }
        this.f57594d.m82925e(this.f57593c);
    }

    /* JADX INFO: renamed from: a */
    public void m82941a(EnumC13892b enumC13892b, IOException iOException) {
        if (m82944b(enumC13892b, iOException)) {
            C13896f c13896f = this.f57594d;
            c13896f.f57524v.m82955a(this.f57593c, enumC13892b);
        }
    }
}
