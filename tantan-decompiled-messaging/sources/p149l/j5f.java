package p149l;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import okio.Buffer;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;

/* JADX INFO: loaded from: classes2.dex */
public final class j5f {

    /* JADX INFO: renamed from: a */
    public final k9j0 f116300a;

    /* JADX INFO: renamed from: b */
    public final sx3 f116301b;

    /* JADX INFO: renamed from: c */
    public final o3f f116302c;

    /* JADX INFO: renamed from: d */
    public final l5f f116303d;

    /* JADX INFO: renamed from: e */
    public final k5f f116304e;

    /* JADX INFO: renamed from: f */
    public boolean f116305f;

    /* JADX INFO: renamed from: l.j5f$a */
    public final class C17689a extends ForwardingSink {

        /* JADX INFO: renamed from: a */
        public boolean f116306a;

        /* JADX INFO: renamed from: b */
        public long f116307b;

        /* JADX INFO: renamed from: c */
        public long f116308c;

        /* JADX INFO: renamed from: d */
        public boolean f116309d;

        public C17689a(Sink sink, long j) {
            super(sink);
            this.f116307b = j;
        }

        /* JADX INFO: renamed from: b */
        private IOException m139862b(IOException iOException) {
            if (this.f116306a) {
                return iOException;
            }
            this.f116306a = true;
            return j5f.this.m139844a(this.f116308c, false, true, iOException);
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f116309d) {
                return;
            }
            this.f116309d = true;
            long j = this.f116307b;
            if (j != -1 && this.f116308c != j) {
                aza0.m99642a("unexpected end of stream");
                return;
            }
            try {
                super.close();
                m139862b(null);
            } catch (IOException e) {
                throw m139862b(e);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw m139862b(e);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(Buffer buffer, long j) throws IOException {
            if (this.f116309d) {
                qkq0.m175383a("closed");
                return;
            }
            long j2 = this.f116307b;
            if (j2 == -1 || this.f116308c + j <= j2) {
                try {
                    super.write(buffer, j);
                    this.f116308c += j;
                    return;
                } catch (IOException e) {
                    throw m139862b(e);
                }
            }
            throw new ProtocolException("expected " + this.f116307b + " bytes but received " + (this.f116308c + j));
        }
    }

    /* JADX INFO: renamed from: l.j5f$b */
    public final class C17690b extends ForwardingSource {

        /* JADX INFO: renamed from: a */
        public final long f116311a;

        /* JADX INFO: renamed from: b */
        public long f116312b;

        /* JADX INFO: renamed from: c */
        public boolean f116313c;

        /* JADX INFO: renamed from: d */
        public boolean f116314d;

        public C17690b(Source source, long j) {
            super(source);
            this.f116311a = j;
            if (j == 0) {
                m139863b(null);
            }
        }

        /* JADX INFO: renamed from: b */
        public IOException m139863b(IOException iOException) {
            if (this.f116313c) {
                return iOException;
            }
            this.f116313c = true;
            return j5f.this.m139844a(this.f116312b, true, false, iOException);
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f116314d) {
                return;
            }
            this.f116314d = true;
            try {
                super.close();
                m139863b(null);
            } catch (IOException e) {
                throw m139863b(e);
            }
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            if (this.f116314d) {
                qkq0.m175383a("closed");
                return 0L;
            }
            try {
                long j2 = delegate().read(buffer, j);
                if (j2 == -1) {
                    m139863b(null);
                    return -1L;
                }
                long j3 = this.f116312b + j2;
                long j4 = this.f116311a;
                if (j4 != -1 && j3 > j4) {
                    throw new ProtocolException("expected " + this.f116311a + " bytes but received " + j3);
                }
                this.f116312b = j3;
                if (j3 == j4) {
                    m139863b(null);
                }
                return j2;
            } catch (IOException e) {
                throw m139863b(e);
            }
        }
    }

    public j5f(k9j0 k9j0Var, sx3 sx3Var, o3f o3fVar, l5f l5fVar, k5f k5fVar) {
        this.f116300a = k9j0Var;
        this.f116301b = sx3Var;
        this.f116302c = o3fVar;
        this.f116303d = l5fVar;
        this.f116304e = k5fVar;
    }

    /* JADX INFO: renamed from: a */
    public IOException m139844a(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            m139859p(iOException);
        }
        if (z2) {
            o3f o3fVar = this.f116302c;
            if (iOException != null) {
                o3fVar.requestFailed(this.f116301b, iOException);
            } else {
                o3fVar.requestBodyEnd(this.f116301b, j);
            }
        }
        if (z) {
            o3f o3fVar2 = this.f116302c;
            if (iOException != null) {
                o3fVar2.responseFailed(this.f116301b, iOException);
            } else {
                o3fVar2.responseBodyEnd(this.f116301b, j);
            }
        }
        return this.f116300a.m145090g(this, z2, z, iOException);
    }

    /* JADX INFO: renamed from: b */
    public void m139845b() {
        this.f116304e.cancel();
    }

    /* JADX INFO: renamed from: c */
    public bec0 m139846c() {
        return this.f116304e.connection();
    }

    /* JADX INFO: renamed from: d */
    public Sink m139847d(stc0 stc0Var, boolean z) throws IOException {
        this.f116305f = z;
        long jContentLength = stc0Var.m185871a().contentLength();
        this.f116302c.requestBodyStart(this.f116301b);
        return new C17689a(this.f116304e.mo144533b(stc0Var, jContentLength), jContentLength);
    }

    /* JADX INFO: renamed from: e */
    public void m139848e() {
        this.f116304e.cancel();
        this.f116300a.m145090g(this, true, true, null);
    }

    /* JADX INFO: renamed from: f */
    public void m139849f() throws IOException {
        try {
            this.f116304e.mo144536e();
        } catch (IOException e) {
            this.f116302c.requestFailed(this.f116301b, e);
            m139859p(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m139850g() throws IOException {
        try {
            this.f116304e.mo144534c();
        } catch (IOException e) {
            this.f116302c.requestFailed(this.f116301b, e);
            m139859p(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m139851h() {
        return this.f116305f;
    }

    /* JADX INFO: renamed from: i */
    public cfc0.AbstractC16122f m139852i() throws SocketException {
        this.f116300a.m145098o();
        return this.f116304e.connection().m101347s(this);
    }

    /* JADX INFO: renamed from: j */
    public void m139853j() {
        this.f116304e.connection().m101348t();
    }

    /* JADX INFO: renamed from: k */
    public void m139854k() {
        this.f116300a.m145090g(this, true, false, null);
    }

    /* JADX INFO: renamed from: l */
    public gxc0 m139855l(exc0 exc0Var) throws IOException {
        try {
            this.f116302c.responseBodyStart(this.f116301b);
            String strM118611u = exc0Var.m118611u("Content-Type");
            long jMo144532a = this.f116304e.mo144532a(exc0Var);
            return new oec0(strM118611u, jMo144532a, Okio.buffer(new C17690b(this.f116304e.mo144538g(exc0Var), jMo144532a)));
        } catch (IOException e) {
            this.f116302c.responseFailed(this.f116301b, e);
            m139859p(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: m */
    public exc0.C16708a m139856m(boolean z) throws IOException {
        try {
            exc0.C16708a c16708aMo144537f = this.f116304e.mo144537f(z);
            if (c16708aMo144537f == null) {
                return c16708aMo144537f;
            }
            kxm.f125142a.mo144877g(c16708aMo144537f, this);
            return c16708aMo144537f;
        } catch (IOException e) {
            this.f116302c.responseFailed(this.f116301b, e);
            m139859p(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m139857n(exc0 exc0Var) {
        this.f116302c.responseHeadersEnd(this.f116301b, exc0Var);
    }

    /* JADX INFO: renamed from: o */
    public void m139858o() {
        this.f116302c.responseHeadersStart(this.f116301b);
    }

    /* JADX INFO: renamed from: p */
    public void m139859p(IOException iOException) {
        this.f116303d.m148629h();
        this.f116304e.connection().m101352x(iOException);
    }

    /* JADX INFO: renamed from: q */
    public void m139860q() {
        m139844a(-1L, true, true, null);
    }

    /* JADX INFO: renamed from: r */
    public void m139861r(stc0 stc0Var) throws IOException {
        try {
            this.f116302c.requestHeadersStart(this.f116301b);
            this.f116304e.mo144535d(stc0Var);
            this.f116302c.requestHeadersEnd(this.f116301b, stc0Var);
        } catch (IOException e) {
            this.f116302c.requestFailed(this.f116301b, e);
            m139859p(e);
            throw e;
        }
    }
}
