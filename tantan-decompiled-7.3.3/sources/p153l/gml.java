package p153l;

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
public final class gml {

    /* JADX INFO: renamed from: a */
    public long f104989a = 0;

    /* JADX INFO: renamed from: b */
    public long f104990b;

    /* JADX INFO: renamed from: c */
    public final int f104991c;

    /* JADX INFO: renamed from: d */
    public final dml f104992d;

    /* JADX INFO: renamed from: e */
    public final Deque<e0l> f104993e;

    /* JADX INFO: renamed from: f */
    public boolean f104994f;

    /* JADX INFO: renamed from: g */
    public final C17254b f104995g;

    /* JADX INFO: renamed from: h */
    public final C17253a f104996h;

    /* JADX INFO: renamed from: i */
    public final C17255c f104997i;

    /* JADX INFO: renamed from: j */
    public final C17255c f104998j;

    /* JADX INFO: renamed from: k */
    public ErrorCode f104999k;

    /* JADX INFO: renamed from: l */
    public IOException f105000l;

    /* JADX INFO: renamed from: l.gml$a */
    public final class C17253a implements Sink {

        /* JADX INFO: renamed from: a */
        public final Buffer f105001a = new Buffer();

        /* JADX INFO: renamed from: b */
        public e0l f105002b;

        /* JADX INFO: renamed from: c */
        public boolean f105003c;

        /* JADX INFO: renamed from: d */
        public boolean f105004d;

        public C17253a() {
        }

        /* JADX WARN: Code duplicated, block: B:27:0x005e  */
        /* JADX INFO: renamed from: b */
        public final void m130818b(boolean z) throws IOException {
            gml gmlVar;
            long jMin;
            gml gmlVar2;
            boolean z2;
            synchronized (gml.this) {
                gml.this.f104998j.enter();
                while (true) {
                    try {
                        gmlVar = gml.this;
                        if (gmlVar.f104990b > 0 || this.f105004d || this.f105003c || gmlVar.f104999k != null) {
                            break;
                        } else {
                            gmlVar.m130816q();
                        }
                    } catch (Throwable th) {
                        gml.this.f104998j.m130822a();
                        throw th;
                    }
                }
                gmlVar.f104998j.m130822a();
                gml.this.m130802c();
                jMin = Math.min(gml.this.f104990b, this.f105001a.size());
                gmlVar2 = gml.this;
                gmlVar2.f104990b -= jMin;
            }
            gmlVar2.f104998j.enter();
            if (z) {
                try {
                    if (jMin == this.f105001a.size()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } finally {
                    gml.this.f104998j.m130822a();
                }
            } else {
                z2 = false;
            }
            boolean z3 = z2;
            gml gmlVar3 = gml.this;
            gmlVar3.f104992d.m116995j0(gmlVar3.f104991c, z3, this.f105001a, jMin);
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (gml.this) {
                try {
                    if (this.f105003c) {
                        return;
                    }
                    if (!gml.this.f104996h.f105004d) {
                        boolean z = this.f105001a.size() > 0;
                        if (this.f105002b != null) {
                            while (this.f105001a.size() > 0) {
                                m130818b(false);
                            }
                            gml gmlVar = gml.this;
                            gmlVar.f104992d.m116996k0(gmlVar.f104991c, true, zlk0.m220235I(this.f105002b));
                        } else if (z) {
                            while (this.f105001a.size() > 0) {
                                m130818b(true);
                            }
                        } else {
                            gml gmlVar2 = gml.this;
                            gmlVar2.f104992d.m116995j0(gmlVar2.f104991c, true, null, 0L);
                        }
                    }
                    synchronized (gml.this) {
                        this.f105003c = true;
                    }
                    gml.this.f104992d.flush();
                    gml.this.m130801b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            synchronized (gml.this) {
                gml.this.m130802c();
            }
            while (this.f105001a.size() > 0) {
                m130818b(false);
                gml.this.f104992d.flush();
            }
        }

        @Override // okio.Sink
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return gml.this.f104998j;
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) throws IOException {
            this.f105001a.write(buffer, j);
            while (this.f105001a.size() >= 16384) {
                m130818b(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.gml$b */
    public final class C17254b implements Source {

        /* JADX INFO: renamed from: a */
        public final Buffer f105006a = new Buffer();

        /* JADX INFO: renamed from: b */
        public final Buffer f105007b = new Buffer();

        /* JADX INFO: renamed from: c */
        public final long f105008c;

        /* JADX INFO: renamed from: d */
        public e0l f105009d;

        /* JADX INFO: renamed from: e */
        public boolean f105010e;

        /* JADX INFO: renamed from: f */
        public boolean f105011f;

        public C17254b(long j) {
            this.f105008c = j;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            synchronized (gml.this) {
                this.f105010e = true;
                size = this.f105007b.size();
                this.f105007b.clear();
                gml.this.notifyAll();
            }
            if (size > 0) {
                m130821h(size);
            }
            gml.this.m130801b();
        }

        /* JADX INFO: renamed from: d */
        public void m130820d(BufferedSource bufferedSource, long j) throws IOException {
            boolean z;
            boolean z2;
            long size;
            while (j > 0) {
                synchronized (gml.this) {
                    z = this.f105011f;
                    z2 = this.f105007b.size() + j > this.f105008c;
                }
                if (z2) {
                    bufferedSource.skip(j);
                    gml.this.m130805f(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    bufferedSource.skip(j);
                    return;
                }
                long j2 = bufferedSource.read(this.f105006a, j);
                if (j2 == -1) {
                    vg3.m201207a();
                    return;
                }
                j -= j2;
                synchronized (gml.this) {
                    try {
                        if (this.f105010e) {
                            size = this.f105006a.size();
                            this.f105006a.clear();
                        } else {
                            boolean z3 = this.f105007b.size() == 0;
                            this.f105007b.writeAll(this.f105006a);
                            if (z3) {
                                gml.this.notifyAll();
                            }
                            size = 0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (size > 0) {
                    m130821h(size);
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m130821h(long j) {
            gml.this.f104992d.m116994i0(j);
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
                fcg0.m125008a("byteCount < 0: ", j);
                return 0L;
            }
            while (true) {
                synchronized (gml.this) {
                    try {
                        gml.this.f104997i.enter();
                        try {
                            gml gmlVar = gml.this;
                            ErrorCode errorCode = gmlVar.f104999k;
                            if (errorCode != null) {
                                streamResetException = gmlVar.f105000l;
                                if (streamResetException == null) {
                                    streamResetException = new StreamResetException(errorCode);
                                }
                            } else {
                                streamResetException = null;
                            }
                            if (this.f105010e) {
                                throw new IOException("stream closed");
                            }
                            if (this.f105007b.size() > 0) {
                                Buffer buffer2 = this.f105007b;
                                j2 = buffer2.read(buffer, Math.min(j, buffer2.size()));
                                gml gmlVar2 = gml.this;
                                long j3 = gmlVar2.f104989a + j2;
                                gmlVar2.f104989a = j3;
                                if (streamResetException != null || j3 < gmlVar2.f104992d.f89659t.m203006d() / 2) {
                                    break;
                                    break;
                                }
                                gml gmlVar3 = gml.this;
                                gmlVar3.f104992d.m117000o0(gmlVar3.f104991c, gmlVar3.f104989a);
                                gml.this.f104989a = 0L;
                                break;
                            }
                            if (this.f105011f || streamResetException != null) {
                                j2 = -1;
                                break;
                            }
                            gml.this.m130816q();
                            gml.this.f104997i.m130822a();
                        } catch (Throwable th) {
                            gml.this.f104997i.m130822a();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (j2 != -1) {
                    m130821h(j2);
                    return j2;
                }
                if (streamResetException == null) {
                    return -1L;
                }
                throw streamResetException;
            }
            gml.this.f104997i.m130822a();
            if (j2 != -1) {
                m130821h(j2);
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
            return gml.this.f104997i;
        }
    }

    /* JADX INFO: renamed from: l.gml$c */
    public class C17255c extends AsyncTimeout {
        public C17255c() {
        }

        /* JADX INFO: renamed from: a */
        public void m130822a() throws IOException {
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
            gml.this.m130805f(ErrorCode.CANCEL);
            gml.this.f104992d.m116990a0();
        }
    }

    public gml(int i, dml dmlVar, boolean z, boolean z2, e0l e0lVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f104993e = arrayDeque;
        this.f104997i = new C17255c();
        this.f104998j = new C17255c();
        if (dmlVar == null) {
            mnd0.m159157a("connection == null");
            throw null;
        }
        this.f104991c = i;
        this.f104992d = dmlVar;
        this.f104990b = dmlVar.f89660u.m203006d();
        C17254b c17254b = new C17254b(dmlVar.f89659t.m203006d());
        this.f104995g = c17254b;
        C17253a c17253a = new C17253a();
        this.f104996h = c17253a;
        c17254b.f105011f = z2;
        c17253a.f105004d = z;
        if (e0lVar != null) {
            arrayDeque.add(e0lVar);
        }
        if (m130809j() && e0lVar != null) {
            wtq0.m207906a("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        if (m130809j() || e0lVar != null) {
            return;
        }
        wtq0.m207906a("remotely-initiated streams should have headers");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public void m130800a(long j) {
        this.f104990b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001a  */
    /* JADX INFO: renamed from: b */
    public void m130801b() throws IOException {
        boolean z;
        boolean zM130810k;
        synchronized (this) {
            try {
                C17254b c17254b = this.f104995g;
                if (c17254b.f105011f || !c17254b.f105010e) {
                    z = false;
                } else {
                    C17253a c17253a = this.f104996h;
                    if (c17253a.f105004d || c17253a.f105003c) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zM130810k = m130810k();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m130803d(ErrorCode.CANCEL, null);
        } else {
            if (zM130810k) {
                return;
            }
            this.f104992d.m116989Z(this.f104991c);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m130802c() throws IOException {
        C17253a c17253a = this.f104996h;
        if (c17253a.f105003c) {
            zpg0.m220844a("stream closed");
            return;
        }
        if (c17253a.f105004d) {
            zpg0.m220844a("stream finished");
            return;
        }
        ErrorCode errorCode = this.f104999k;
        if (errorCode != null) {
            IOException iOException = this.f105000l;
            if (iOException == null) {
                throw new StreamResetException(errorCode);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m130803d(ErrorCode errorCode, IOException iOException) throws IOException {
        if (m130804e(errorCode, iOException)) {
            this.f104992d.m116998m0(this.f104991c, errorCode);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m130804e(ErrorCode errorCode, IOException iOException) {
        synchronized (this) {
            try {
                if (this.f104999k != null) {
                    return false;
                }
                if (this.f104995g.f105011f && this.f104996h.f105004d) {
                    return false;
                }
                this.f104999k = errorCode;
                this.f105000l = iOException;
                notifyAll();
                this.f104992d.m116989Z(this.f104991c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m130805f(ErrorCode errorCode) {
        if (m130804e(errorCode, null)) {
            this.f104992d.m116999n0(this.f104991c, errorCode);
        }
    }

    /* JADX INFO: renamed from: g */
    public int m130806g() {
        return this.f104991c;
    }

    /* JADX INFO: renamed from: h */
    public Sink m130807h() {
        synchronized (this) {
            try {
                if (!this.f104994f && !m130809j()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f104996h;
    }

    /* JADX INFO: renamed from: i */
    public Source m130808i() {
        return this.f104995g;
    }

    /* JADX INFO: renamed from: j */
    public boolean m130809j() {
        return this.f104992d.f89640a == ((this.f104991c & 1) == 1);
    }

    /* JADX INFO: renamed from: k */
    public synchronized boolean m130810k() {
        try {
            if (this.f104999k != null) {
                return false;
            }
            C17254b c17254b = this.f104995g;
            if (c17254b.f105011f || c17254b.f105010e) {
                C17253a c17253a = this.f104996h;
                if ((c17253a.f105004d || c17253a.f105003c) && this.f104994f) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public Timeout m130811l() {
        return this.f104997i;
    }

    /* JADX INFO: renamed from: m */
    public void m130812m(BufferedSource bufferedSource, int i) throws IOException {
        this.f104995g.m130820d(bufferedSource, i);
    }

    /* JADX INFO: renamed from: n */
    public void m130813n(e0l e0lVar, boolean z) {
        boolean zM130810k;
        synchronized (this) {
            try {
                if (this.f104994f && z) {
                    this.f104995g.f105009d = e0lVar;
                } else {
                    this.f104994f = true;
                    this.f104993e.add(e0lVar);
                }
                if (z) {
                    this.f104995g.f105011f = true;
                }
                zM130810k = m130810k();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM130810k) {
            return;
        }
        this.f104992d.m116989Z(this.f104991c);
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m130814o(ErrorCode errorCode) {
        if (this.f104999k == null) {
            this.f104999k = errorCode;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: p */
    public synchronized e0l m130815p() throws IOException {
        this.f104997i.enter();
        while (this.f104993e.isEmpty() && this.f104999k == null) {
            try {
                m130816q();
            } catch (Throwable th) {
                this.f104997i.m130822a();
                throw th;
            }
        }
        this.f104997i.m130822a();
        if (this.f104993e.isEmpty()) {
            IOException iOException = this.f105000l;
            if (iOException != null) {
                throw iOException;
            }
            throw new StreamResetException(this.f104999k);
        }
        return this.f104993e.removeFirst();
    }

    /* JADX INFO: renamed from: q */
    public void m130816q() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* JADX INFO: renamed from: r */
    public Timeout m130817r() {
        return this.f104998j;
    }
}
