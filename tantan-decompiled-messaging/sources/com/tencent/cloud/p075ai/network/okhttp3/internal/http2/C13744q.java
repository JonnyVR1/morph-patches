package com.tencent.cloud.p075ai.network.okhttp3.internal.http2;

import com.tencent.cloud.p075ai.network.okhttp3.C13766o;
import com.tencent.cloud.p075ai.network.okio.C13774c;
import com.tencent.cloud.p075ai.network.okio.C13776e;
import com.tencent.cloud.p075ai.network.okio.C13795x;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13793v;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13794w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.RejectedExecutionException;
import p149l.jfd0;
import p149l.qkq0;
import p149l.rhg0;
import p149l.shg0;
import p149l.y3g0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.q */
/* JADX INFO: loaded from: classes13.dex */
public final class C13744q {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ boolean f56742m = true;

    /* JADX INFO: renamed from: a */
    public long f56743a = 0;

    /* JADX INFO: renamed from: b */
    public long f56744b;

    /* JADX INFO: renamed from: c */
    public final int f56745c;

    /* JADX INFO: renamed from: d */
    public final C13733f f56746d;

    /* JADX INFO: renamed from: e */
    public final Deque<C13766o> f56747e;

    /* JADX INFO: renamed from: f */
    public boolean f56748f;

    /* JADX INFO: renamed from: g */
    public final b f56749g;

    /* JADX INFO: renamed from: h */
    public final a f56750h;

    /* JADX INFO: renamed from: i */
    public final c f56751i;

    /* JADX INFO: renamed from: j */
    public final c f56752j;

    /* JADX INFO: renamed from: k */
    public EnumC13729b f56753k;

    /* JADX INFO: renamed from: l */
    public IOException f56754l;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.q$a */
    public final class a implements InterfaceC13793v {

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ boolean f56755e = true;

        /* JADX INFO: renamed from: a */
        public final C13776e f56756a = new C13776e();

        /* JADX INFO: renamed from: b */
        public boolean f56757b;

        /* JADX INFO: renamed from: c */
        public boolean f56758c;

        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:27:0x005a  */
        /* JADX INFO: renamed from: a */
        public final void m81766a(boolean z) throws IOException {
            C13744q c13744q;
            long jMin;
            C13744q c13744q2;
            boolean z2;
            synchronized (C13744q.this) {
                C13744q.this.f56752j.m81893h();
                while (true) {
                    try {
                        c13744q = C13744q.this;
                        if (c13744q.f56744b > 0 || this.f56758c || this.f56757b || c13744q.f56753k != null) {
                            break;
                        } else {
                            c13744q.m81765f();
                        }
                    } catch (Throwable th) {
                        C13744q.this.f56752j.m81769k();
                        throw th;
                    }
                }
                c13744q.f56752j.m81769k();
                C13744q.this.m81760b();
                jMin = Math.min(C13744q.this.f56744b, this.f56756a.f56970b);
                c13744q2 = C13744q.this;
                c13744q2.f56744b -= jMin;
            }
            c13744q2.f56752j.m81893h();
            if (z) {
                try {
                    if (jMin == this.f56756a.f56970b) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } finally {
                    C13744q.this.f56752j.m81769k();
                }
            } else {
                z2 = false;
            }
            boolean z3 = z2;
            C13744q c13744q3 = C13744q.this;
            c13744q3.f56746d.m81737a(c13744q3.f56745c, z3, this.f56756a, jMin);
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!f56755e && Thread.holdsLock(C13744q.this)) {
                shg0.m184191a();
                return;
            }
            synchronized (C13744q.this) {
                try {
                    if (this.f56757b) {
                        return;
                    }
                    C13744q c13744q = C13744q.this;
                    if (!c13744q.f56750h.f56758c) {
                        if (this.f56756a.f56970b > 0) {
                            while (this.f56756a.f56970b > 0) {
                                m81766a(true);
                            }
                        } else {
                            c13744q.f56746d.m81737a(c13744q.f56745c, true, null, 0L);
                        }
                    }
                    synchronized (C13744q.this) {
                        this.f56757b = true;
                    }
                    C13744q.this.f56746d.flush();
                    C13744q.this.m81756a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v, java.io.Flushable
        public void flush() throws IOException {
            if (!f56755e && Thread.holdsLock(C13744q.this)) {
                shg0.m184191a();
                return;
            }
            synchronized (C13744q.this) {
                C13744q.this.m81760b();
            }
            while (this.f56756a.f56970b > 0) {
                m81766a(false);
                C13744q.this.f56746d.flush();
            }
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v
        public C13795x timeout() {
            return C13744q.this.f56752j;
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v
        public void write(C13776e c13776e, long j) throws IOException {
            if (!f56755e && Thread.holdsLock(C13744q.this)) {
                shg0.m184191a();
                return;
            }
            this.f56756a.write(c13776e, j);
            while (this.f56756a.f56970b >= 16384) {
                m81766a(false);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.q$b */
    public final class b implements InterfaceC13794w {

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ boolean f56760h = true;

        /* JADX INFO: renamed from: a */
        public final C13776e f56761a = new C13776e();

        /* JADX INFO: renamed from: b */
        public final C13776e f56762b = new C13776e();

        /* JADX INFO: renamed from: c */
        public final long f56763c;

        /* JADX INFO: renamed from: d */
        public C13766o f56764d;

        /* JADX INFO: renamed from: e */
        public boolean f56765e;

        /* JADX INFO: renamed from: f */
        public boolean f56766f;

        public b(long j) {
            this.f56763c = j;
        }

        /* JADX WARN: Code duplicated, block: B:39:0x0086  */
        /* JADX WARN: Code duplicated, block: B:41:0x008a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x008c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:43:0x008d  */
        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
        /* JADX INFO: renamed from: a */
        public long mo81631a(C13776e c13776e, long j) throws Throwable {
            Throwable c13749v;
            long jMo81631a;
            if (j < 0) {
                y3g0.m212802a("byteCount < 0: ", j);
                return 0L;
            }
            while (true) {
                synchronized (C13744q.this) {
                    try {
                        C13744q.this.f56751i.m81893h();
                        try {
                            C13744q c13744q = C13744q.this;
                            EnumC13729b enumC13729b = c13744q.f56753k;
                            if (enumC13729b != null) {
                                c13749v = c13744q.f56754l;
                                if (c13749v == null) {
                                    c13749v = new C13749v(enumC13729b);
                                }
                            } else {
                                c13749v = null;
                            }
                            if (this.f56765e) {
                                throw new IOException("stream closed");
                            }
                            C13776e c13776e2 = this.f56762b;
                            long j2 = c13776e2.f56970b;
                            if (j2 > 0) {
                                jMo81631a = c13776e2.mo81631a(c13776e, Math.min(j, j2));
                                C13744q c13744q2 = C13744q.this;
                                long j3 = c13744q2.f56743a + jMo81631a;
                                c13744q2.f56743a = j3;
                                if (c13749v != null || j3 < c13744q2.f56746d.f56673s.m81780a() / 2) {
                                    break;
                                    break;
                                }
                                C13744q c13744q3 = C13744q.this;
                                c13744q3.f56746d.m81735a(c13744q3.f56745c, c13744q3.f56743a);
                                C13744q.this.f56743a = 0L;
                                break;
                            }
                            if (this.f56766f || c13749v != null) {
                                jMo81631a = -1;
                                break;
                            }
                            C13744q.this.m81765f();
                            C13744q.this.f56751i.m81769k();
                        } catch (Throwable th) {
                            C13744q.this.f56751i.m81769k();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (jMo81631a != -1) {
                    m81767h(jMo81631a);
                    return jMo81631a;
                }
                if (c13749v == null) {
                    return -1L;
                }
                throw c13749v;
            }
            C13744q.this.f56751i.m81769k();
            if (jMo81631a != -1) {
                m81767h(jMo81631a);
                return jMo81631a;
            }
            if (c13749v == null) {
                return -1L;
            }
            throw c13749v;
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long j;
            synchronized (C13744q.this) {
                this.f56765e = true;
                C13776e c13776e = this.f56762b;
                j = c13776e.f56970b;
                c13776e.m81944k();
                C13744q.this.notifyAll();
            }
            if (j > 0) {
                m81767h(j);
            }
            C13744q.this.m81756a();
        }

        /* JADX INFO: renamed from: h */
        public final void m81767h(long j) {
            if (f56760h || !Thread.holdsLock(C13744q.this)) {
                C13744q.this.f56746d.m81743h(j);
            } else {
                shg0.m184191a();
            }
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
        public C13795x timeout() {
            return C13744q.this.f56751i;
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.q$c */
    public class c extends C13774c {
        public c() {
        }

        @Override // com.tencent.cloud.p075ai.network.okio.C13774c
        /* JADX INFO: renamed from: a */
        public IOException mo81768a(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.tencent.cloud.p075ai.network.okio.C13774c
        /* JADX INFO: renamed from: j */
        public void mo81685j() {
            C13744q.this.m81757a(EnumC13729b.CANCEL);
            C13733f c13733f = C13744q.this.f56746d;
            synchronized (c13733f) {
                try {
                    long j = c13733f.f56668n;
                    long j2 = c13733f.f56667m;
                    if (j < j2) {
                        return;
                    }
                    c13733f.f56667m = j2 + 1;
                    c13733f.f56670p = System.nanoTime() + 1000000000;
                    try {
                        c13733f.f56662h.execute(new C13734g(c13733f, "OkHttp %s ping", c13733f.f56658d));
                    } catch (RejectedExecutionException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public void m81769k() throws IOException {
            if (m81894i()) {
                throw mo81768a((IOException) null);
            }
        }
    }

    public C13744q(int i, C13733f c13733f, boolean z, boolean z2, C13766o c13766o) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f56747e = arrayDeque;
        this.f56751i = new c();
        this.f56752j = new c();
        if (c13733f == null) {
            jfd0.m141176a("connection == null");
            throw null;
        }
        this.f56745c = i;
        this.f56746d = c13733f;
        this.f56744b = c13733f.f56674t.m81780a();
        b bVar = new b(c13733f.f56673s.m81780a());
        this.f56749g = bVar;
        a aVar = new a();
        this.f56750h = aVar;
        bVar.f56766f = z2;
        aVar.f56758c = z;
        if (c13766o != null) {
            arrayDeque.add(c13766o);
        }
        if (m81763d() && c13766o != null) {
            qkq0.m175383a("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        if (m81763d() || c13766o != null) {
            return;
        }
        qkq0.m175383a("remotely-initiated streams should have headers");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0029  */
    /* JADX INFO: renamed from: a */
    public void m81756a() {
        boolean z;
        boolean zM81764e;
        if (!f56742m && Thread.holdsLock(this)) {
            shg0.m184191a();
            return;
        }
        synchronized (this) {
            try {
                b bVar = this.f56749g;
                if (bVar.f56766f || !bVar.f56765e) {
                    z = false;
                } else {
                    a aVar = this.f56750h;
                    if (aVar.f56758c || aVar.f56757b) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zM81764e = m81764e();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m81758a(EnumC13729b.CANCEL, (IOException) null);
        } else {
            if (zM81764e) {
                return;
            }
            this.f56746d.m81742e(this.f56745c);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m81761b(EnumC13729b enumC13729b, IOException iOException) {
        if (!f56742m && Thread.holdsLock(this)) {
            shg0.m184191a();
            return false;
        }
        synchronized (this) {
            try {
                if (this.f56753k != null) {
                    return false;
                }
                if (this.f56749g.f56766f && this.f56750h.f56758c) {
                    return false;
                }
                this.f56753k = enumC13729b;
                this.f56754l = iOException;
                notifyAll();
                this.f56746d.m81742e(this.f56745c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC13793v m81762c() {
        synchronized (this) {
            try {
                if (!this.f56748f && !m81763d()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f56750h;
    }

    /* JADX INFO: renamed from: d */
    public boolean m81763d() {
        return this.f56746d.f56655a == ((this.f56745c & 1) == 1);
    }

    /* JADX INFO: renamed from: e */
    public synchronized boolean m81764e() {
        try {
            if (this.f56753k != null) {
                return false;
            }
            b bVar = this.f56749g;
            if (bVar.f56766f || bVar.f56765e) {
                a aVar = this.f56750h;
                if ((aVar.f56758c || aVar.f56757b) && this.f56748f) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m81765f() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m81760b() throws IOException {
        a aVar = this.f56750h;
        if (!aVar.f56757b) {
            if (!aVar.f56758c) {
                EnumC13729b enumC13729b = this.f56753k;
                if (enumC13729b != null) {
                    IOException iOException = this.f56754l;
                    if (iOException == null) {
                        throw new C13749v(enumC13729b);
                    }
                    throw iOException;
                }
                return;
            }
            rhg0.m179353a("stream finished");
            return;
        }
        rhg0.m179353a("stream closed");
    }

    /* JADX INFO: renamed from: a */
    public void m81757a(EnumC13729b enumC13729b) {
        if (m81761b(enumC13729b, null)) {
            this.f56746d.m81736a(this.f56745c, enumC13729b);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m81759a(C13766o c13766o, boolean z) {
        boolean zM81764e;
        if (!f56742m && Thread.holdsLock(this)) {
            shg0.m184191a();
            return;
        }
        synchronized (this) {
            try {
                if (this.f56748f && z) {
                    this.f56749g.f56764d = c13766o;
                } else {
                    this.f56748f = true;
                    this.f56747e.add(c13766o);
                }
                if (z) {
                    this.f56749g.f56766f = true;
                }
                zM81764e = m81764e();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM81764e) {
            return;
        }
        this.f56746d.m81742e(this.f56745c);
    }

    /* JADX INFO: renamed from: a */
    public void m81758a(EnumC13729b enumC13729b, IOException iOException) {
        if (m81761b(enumC13729b, iOException)) {
            C13733f c13733f = this.f56746d;
            c13733f.f56676v.m81772a(this.f56745c, enumC13729b);
        }
    }
}
