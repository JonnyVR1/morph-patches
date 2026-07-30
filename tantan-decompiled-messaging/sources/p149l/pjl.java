package p149l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes2.dex */
public final class pjl {

    /* JADX INFO: renamed from: a */
    public long f149810a = 0;

    /* JADX INFO: renamed from: b */
    public long f149811b;

    /* JADX INFO: renamed from: c */
    public final int f149812c;

    /* JADX INFO: renamed from: d */
    public final mjl f149813d;

    /* JADX INFO: renamed from: e */
    public final Deque<oxk> f149814e;

    /* JADX INFO: renamed from: f */
    public boolean f149815f;

    /* JADX INFO: renamed from: g */
    public final C19248b f149816g;

    /* JADX INFO: renamed from: h */
    public final C19247a f149817h;

    /* JADX INFO: renamed from: i */
    public final C19249c f149818i;

    /* JADX INFO: renamed from: j */
    public final C19249c f149819j;

    /* JADX INFO: renamed from: k */
    public ErrorCode f149820k;

    /* JADX INFO: renamed from: l */
    public IOException f149821l;

    /* JADX INFO: renamed from: l.pjl$a */
    public final class C19247a implements Sink {

        /* JADX INFO: renamed from: a */
        public final Buffer f149822a = new Buffer();

        /* JADX INFO: renamed from: b */
        public oxk f149823b;

        /* JADX INFO: renamed from: c */
        public boolean f149824c;

        /* JADX INFO: renamed from: d */
        public boolean f149825d;

        public C19247a() {
        }

        /* JADX WARN: Code duplicated, block: B:27:0x005e  */
        /* JADX INFO: renamed from: b */
        public final void m169904b(boolean z) throws IOException {
            pjl pjlVar;
            long jMin;
            pjl pjlVar2;
            boolean z2;
            synchronized (pjl.this) {
                pjl.this.f149819j.enter();
                while (true) {
                    try {
                        pjlVar = pjl.this;
                        if (pjlVar.f149811b > 0 || this.f149825d || this.f149824c || pjlVar.f149820k != null) {
                            break;
                        } else {
                            pjlVar.m169902q();
                        }
                    } catch (Throwable th) {
                        pjl.this.f149819j.m169908a();
                        throw th;
                    }
                }
                pjlVar.f149819j.m169908a();
                pjl.this.m169888c();
                jMin = Math.min(pjl.this.f149811b, this.f149822a.size());
                pjlVar2 = pjl.this;
                pjlVar2.f149811b -= jMin;
            }
            pjlVar2.f149819j.enter();
            if (z) {
                try {
                    if (jMin == this.f149822a.size()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } finally {
                    pjl.this.f149819j.m169908a();
                }
            } else {
                z2 = false;
            }
            boolean z3 = z2;
            pjl pjlVar3 = pjl.this;
            pjlVar3.f149813d.m154873i0(pjlVar3.f149812c, z3, this.f149822a, jMin);
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (pjl.this) {
                try {
                    if (this.f149824c) {
                        return;
                    }
                    if (!pjl.this.f149817h.f149825d) {
                        boolean z = this.f149822a.size() > 0;
                        if (this.f149823b != null) {
                            while (this.f149822a.size() > 0) {
                                m169904b(false);
                            }
                            pjl pjlVar = pjl.this;
                            pjlVar.f149813d.m154874j0(pjlVar.f149812c, true, tck0.m187996I(this.f149823b));
                        } else if (z) {
                            while (this.f149822a.size() > 0) {
                                m169904b(true);
                            }
                        } else {
                            pjl pjlVar2 = pjl.this;
                            pjlVar2.f149813d.m154873i0(pjlVar2.f149812c, true, null, 0L);
                        }
                    }
                    synchronized (pjl.this) {
                        this.f149824c = true;
                    }
                    pjl.this.f149813d.flush();
                    pjl.this.m169887b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            synchronized (pjl.this) {
                pjl.this.m169888c();
            }
            while (this.f149822a.size() > 0) {
                m169904b(false);
                pjl.this.f149813d.flush();
            }
        }

        @Override // okio.Sink
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return pjl.this.f149819j;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) throws IOException {
            this.f149822a.write(buffer, j);
            while (this.f149822a.size() >= 16384) {
                m169904b(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.pjl$b */
    public final class C19248b implements Source {

        /* JADX INFO: renamed from: a */
        public final Buffer f149827a = new Buffer();

        /* JADX INFO: renamed from: b */
        public final Buffer f149828b = new Buffer();

        /* JADX INFO: renamed from: c */
        public final long f149829c;

        /* JADX INFO: renamed from: d */
        public oxk f149830d;

        /* JADX INFO: renamed from: e */
        public boolean f149831e;

        /* JADX INFO: renamed from: f */
        public boolean f149832f;

        public C19248b(long j) {
            this.f149829c = j;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            synchronized (pjl.this) {
                this.f149831e = true;
                size = this.f149828b.size();
                this.f149828b.clear();
                pjl.this.notifyAll();
            }
            if (size > 0) {
                m169907h(size);
            }
            pjl.this.m169887b();
        }

        /* JADX INFO: renamed from: d */
        public void m169906d(BufferedSource bufferedSource, long j) throws IOException {
            boolean z;
            boolean z2;
            long size;
            while (j > 0) {
                synchronized (pjl.this) {
                    z = this.f149832f;
                    z2 = this.f149828b.size() + j > this.f149829c;
                }
                if (z2) {
                    bufferedSource.skip(j);
                    pjl.this.m169891f(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    bufferedSource.skip(j);
                    return;
                }
                long j2 = bufferedSource.read(this.f149827a, j);
                if (j2 == -1) {
                    hg3.m130807a();
                    return;
                }
                j -= j2;
                synchronized (pjl.this) {
                    try {
                        if (this.f149831e) {
                            size = this.f149827a.size();
                            this.f149827a.clear();
                        } else {
                            boolean z3 = this.f149828b.size() == 0;
                            this.f149828b.writeAll(this.f149827a);
                            if (z3) {
                                pjl.this.notifyAll();
                            }
                            size = 0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (size > 0) {
                    m169907h(size);
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m169907h(long j) {
            pjl.this.f149813d.m154872h0(j);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x008e  */
        /* JADX WARN: Code duplicated, block: B:41:0x0092 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x0094 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:43:0x0095  */
        @Override // okio.Source
        public long read(Buffer buffer, long j) throws Throwable {
            Throwable streamResetException;
            long j2;
            if (j < 0) {
                y3g0.m212802a("byteCount < 0: ", j);
                return 0L;
            }
            while (true) {
                synchronized (pjl.this) {
                    try {
                        pjl.this.f149818i.enter();
                        try {
                            pjl pjlVar = pjl.this;
                            ErrorCode errorCode = pjlVar.f149820k;
                            if (errorCode != null) {
                                streamResetException = pjlVar.f149821l;
                                if (streamResetException == null) {
                                    streamResetException = new StreamResetException(errorCode);
                                }
                            } else {
                                streamResetException = null;
                            }
                            if (this.f149831e) {
                                throw new IOException("stream closed");
                            }
                            if (this.f149828b.size() > 0) {
                                Buffer buffer2 = this.f149828b;
                                j2 = buffer2.read(buffer, Math.min(j, buffer2.size()));
                                pjl pjlVar2 = pjl.this;
                                long j3 = pjlVar2.f149810a + j2;
                                pjlVar2.f149810a = j3;
                                if (streamResetException != null || j3 < pjlVar2.f149813d.f134164t.m165173d() / 2) {
                                    break;
                                    break;
                                }
                                pjl pjlVar3 = pjl.this;
                                pjlVar3.f149813d.m154878n0(pjlVar3.f149812c, pjlVar3.f149810a);
                                pjl.this.f149810a = 0L;
                                break;
                            }
                            if (this.f149832f || streamResetException != null) {
                                j2 = -1;
                                break;
                            }
                            pjl.this.m169902q();
                            pjl.this.f149818i.m169908a();
                        } catch (Throwable th) {
                            pjl.this.f149818i.m169908a();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (j2 != -1) {
                    m169907h(j2);
                    return j2;
                }
                if (streamResetException == null) {
                    return -1L;
                }
                throw streamResetException;
            }
            pjl.this.f149818i.m169908a();
            if (j2 != -1) {
                m169907h(j2);
                return j2;
            }
            if (streamResetException == null) {
                return -1L;
            }
            throw streamResetException;
        }

        @Override // okio.Source
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return pjl.this.f149818i;
        }
    }

    /* JADX INFO: renamed from: l.pjl$c */
    public class C19249c extends AsyncTimeout {
        public C19249c() {
        }

        /* JADX INFO: renamed from: a */
        public void m169908a() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // okio.AsyncTimeout
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // okio.AsyncTimeout
        public void timedOut() {
            pjl.this.m169891f(ErrorCode.CANCEL);
            pjl.this.f149813d.m154868Z();
        }
    }

    public pjl(int i, mjl mjlVar, boolean z, boolean z2, oxk oxkVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f149814e = arrayDeque;
        this.f149818i = new C19249c();
        this.f149819j = new C19249c();
        if (mjlVar == null) {
            jfd0.m141176a("connection == null");
            throw null;
        }
        this.f149812c = i;
        this.f149813d = mjlVar;
        this.f149811b = mjlVar.f134165u.m165173d();
        C19248b c19248b = new C19248b(mjlVar.f134164t.m165173d());
        this.f149816g = c19248b;
        C19247a c19247a = new C19247a();
        this.f149817h = c19247a;
        c19248b.f149832f = z2;
        c19247a.f149825d = z;
        if (oxkVar != null) {
            arrayDeque.add(oxkVar);
        }
        if (m169895j() && oxkVar != null) {
            qkq0.m175383a("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        if (m169895j() || oxkVar != null) {
            return;
        }
        qkq0.m175383a("remotely-initiated streams should have headers");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public void m169886a(long j) {
        this.f149811b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001a  */
    /* JADX INFO: renamed from: b */
    public void m169887b() throws IOException {
        boolean z;
        boolean zM169896k;
        synchronized (this) {
            try {
                C19248b c19248b = this.f149816g;
                if (c19248b.f149832f || !c19248b.f149831e) {
                    z = false;
                } else {
                    C19247a c19247a = this.f149817h;
                    if (c19247a.f149825d || c19247a.f149824c) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zM169896k = m169896k();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m169889d(ErrorCode.CANCEL, null);
        } else {
            if (zM169896k) {
                return;
            }
            this.f149813d.m154867Y(this.f149812c);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m169888c() throws IOException {
        C19247a c19247a = this.f149817h;
        if (c19247a.f149824c) {
            rhg0.m179353a("stream closed");
            return;
        }
        if (c19247a.f149825d) {
            rhg0.m179353a("stream finished");
            return;
        }
        ErrorCode errorCode = this.f149820k;
        if (errorCode != null) {
            IOException iOException = this.f149821l;
            if (iOException == null) {
                throw new StreamResetException(errorCode);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m169889d(ErrorCode errorCode, IOException iOException) throws IOException {
        if (m169890e(errorCode, iOException)) {
            this.f149813d.m154876l0(this.f149812c, errorCode);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m169890e(ErrorCode errorCode, IOException iOException) {
        synchronized (this) {
            try {
                if (this.f149820k != null) {
                    return false;
                }
                if (this.f149816g.f149832f && this.f149817h.f149825d) {
                    return false;
                }
                this.f149820k = errorCode;
                this.f149821l = iOException;
                notifyAll();
                this.f149813d.m154867Y(this.f149812c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m169891f(ErrorCode errorCode) {
        if (m169890e(errorCode, null)) {
            this.f149813d.m154877m0(this.f149812c, errorCode);
        }
    }

    /* JADX INFO: renamed from: g */
    public int m169892g() {
        return this.f149812c;
    }

    /* JADX INFO: renamed from: h */
    public Sink m169893h() {
        synchronized (this) {
            try {
                if (!this.f149815f && !m169895j()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f149817h;
    }

    /* JADX INFO: renamed from: i */
    public Source m169894i() {
        return this.f149816g;
    }

    /* JADX INFO: renamed from: j */
    public boolean m169895j() {
        return this.f149813d.f134145a == ((this.f149812c & 1) == 1);
    }

    /* JADX INFO: renamed from: k */
    public synchronized boolean m169896k() {
        try {
            if (this.f149820k != null) {
                return false;
            }
            C19248b c19248b = this.f149816g;
            if (c19248b.f149832f || c19248b.f149831e) {
                C19247a c19247a = this.f149817h;
                if ((c19247a.f149825d || c19247a.f149824c) && this.f149815f) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public Timeout m169897l() {
        return this.f149818i;
    }

    /* JADX INFO: renamed from: m */
    public void m169898m(BufferedSource bufferedSource, int i) throws IOException {
        this.f149816g.m169906d(bufferedSource, i);
    }

    /* JADX INFO: renamed from: n */
    public void m169899n(oxk oxkVar, boolean z) {
        boolean zM169896k;
        synchronized (this) {
            try {
                if (this.f149815f && z) {
                    this.f149816g.f149830d = oxkVar;
                } else {
                    this.f149815f = true;
                    this.f149814e.add(oxkVar);
                }
                if (z) {
                    this.f149816g.f149832f = true;
                }
                zM169896k = m169896k();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM169896k) {
            return;
        }
        this.f149813d.m154867Y(this.f149812c);
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m169900o(ErrorCode errorCode) {
        if (this.f149820k == null) {
            this.f149820k = errorCode;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: p */
    public synchronized oxk m169901p() throws IOException {
        this.f149818i.enter();
        while (this.f149814e.isEmpty() && this.f149820k == null) {
            try {
                m169902q();
            } catch (Throwable th) {
                this.f149818i.m169908a();
                throw th;
            }
        }
        this.f149818i.m169908a();
        if (this.f149814e.isEmpty()) {
            IOException iOException = this.f149821l;
            if (iOException != null) {
                throw iOException;
            }
            throw new StreamResetException(this.f149820k);
        }
        return this.f149814e.removeFirst();
    }

    /* JADX INFO: renamed from: q */
    public void m169902q() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* JADX INFO: renamed from: r */
    public Timeout m169903r() {
        return this.f149819j;
    }
}
