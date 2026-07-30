package p153l;

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
public final class n6f {

    /* JADX INFO: renamed from: a */
    public final oij0 f140446a;

    /* JADX INFO: renamed from: b */
    public final ry3 f140447b;

    /* JADX INFO: renamed from: c */
    public final t4f f140448c;

    /* JADX INFO: renamed from: d */
    public final p6f f140449d;

    /* JADX INFO: renamed from: e */
    public final o6f f140450e;

    /* JADX INFO: renamed from: f */
    public boolean f140451f;

    /* JADX INFO: renamed from: l.n6f$a */
    public final class C18812a extends ForwardingSink {

        /* JADX INFO: renamed from: a */
        public boolean f140452a;

        /* JADX INFO: renamed from: b */
        public long f140453b;

        /* JADX INFO: renamed from: c */
        public long f140454c;

        /* JADX INFO: renamed from: d */
        public boolean f140455d;

        public C18812a(Sink sink, long j) {
            super(sink);
            this.f140453b = j;
        }

        /* JADX INFO: renamed from: b */
        private IOException m161782b(IOException iOException) {
            if (this.f140452a) {
                return iOException;
            }
            this.f140452a = true;
            return n6f.this.m161764a(this.f140454c, false, true, iOException);
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f140455d) {
                return;
            }
            this.f140455d = true;
            long j = this.f140453b;
            if (j != -1 && this.f140454c != j) {
                e7b0.m119688a("unexpected end of stream");
                return;
            }
            try {
                super.close();
                m161782b(null);
            } catch (IOException e) {
                throw m161782b(e);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw m161782b(e);
            }
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(Buffer buffer, long j) throws IOException {
            if (this.f140455d) {
                wtq0.m207906a("closed");
                return;
            }
            long j2 = this.f140453b;
            if (j2 == -1 || this.f140454c + j <= j2) {
                try {
                    super.write(buffer, j);
                    this.f140454c += j;
                    return;
                } catch (IOException e) {
                    throw m161782b(e);
                }
            }
            throw new ProtocolException("expected " + this.f140453b + " bytes but received " + (this.f140454c + j));
        }
    }

    /* JADX INFO: renamed from: l.n6f$b */
    public final class C18813b extends ForwardingSource {

        /* JADX INFO: renamed from: a */
        public final long f140457a;

        /* JADX INFO: renamed from: b */
        public long f140458b;

        /* JADX INFO: renamed from: c */
        public boolean f140459c;

        /* JADX INFO: renamed from: d */
        public boolean f140460d;

        public C18813b(Source source, long j) {
            super(source);
            this.f140457a = j;
            if (j == 0) {
                m161783b(null);
            }
        }

        /* JADX INFO: renamed from: b */
        public IOException m161783b(IOException iOException) {
            if (this.f140459c) {
                return iOException;
            }
            this.f140459c = true;
            return n6f.this.m161764a(this.f140458b, true, false, iOException);
        }

        @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f140460d) {
                return;
            }
            this.f140460d = true;
            try {
                super.close();
                m161783b(null);
            } catch (IOException e) {
                throw m161783b(e);
            }
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            if (this.f140460d) {
                wtq0.m207906a("closed");
                return 0L;
            }
            try {
                long j2 = delegate().read(buffer, j);
                if (j2 == -1) {
                    m161783b(null);
                    return -1L;
                }
                long j3 = this.f140458b + j2;
                long j4 = this.f140457a;
                if (j4 != -1 && j3 > j4) {
                    throw new ProtocolException("expected " + this.f140457a + " bytes but received " + j3);
                }
                this.f140458b = j3;
                if (j3 == j4) {
                    m161783b(null);
                }
                return j2;
            } catch (IOException e) {
                throw m161783b(e);
            }
        }
    }

    public n6f(oij0 oij0Var, ry3 ry3Var, t4f t4fVar, p6f p6fVar, o6f o6fVar) {
        this.f140446a = oij0Var;
        this.f140447b = ry3Var;
        this.f140448c = t4fVar;
        this.f140449d = p6fVar;
        this.f140450e = o6fVar;
    }

    /* JADX INFO: renamed from: a */
    public IOException m161764a(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            m161779p(iOException);
        }
        if (z2) {
            t4f t4fVar = this.f140448c;
            if (iOException != null) {
                t4fVar.requestFailed(this.f140447b, iOException);
            } else {
                t4fVar.requestBodyEnd(this.f140447b, j);
            }
        }
        if (z) {
            t4f t4fVar2 = this.f140448c;
            if (iOException != null) {
                t4fVar2.responseFailed(this.f140447b, iOException);
            } else {
                t4fVar2.responseBodyEnd(this.f140447b, j);
            }
        }
        return this.f140446a.m167782g(this, z2, z, iOException);
    }

    /* JADX INFO: renamed from: b */
    public void m161765b() {
        this.f140450e.cancel();
    }

    /* JADX INFO: renamed from: c */
    public imc0 m161766c() {
        return this.f140450e.connection();
    }

    /* JADX INFO: renamed from: d */
    public Sink m161767d(x1d0 x1d0Var, boolean z) throws IOException {
        this.f140451f = z;
        long jContentLength = x1d0Var.m209016a().contentLength();
        this.f140448c.requestBodyStart(this.f140447b);
        return new C18812a(this.f140450e.mo105195b(x1d0Var, jContentLength), jContentLength);
    }

    /* JADX INFO: renamed from: e */
    public void m161768e() {
        this.f140450e.cancel();
        this.f140446a.m167782g(this, true, true, null);
    }

    /* JADX INFO: renamed from: f */
    public void m161769f() throws IOException {
        try {
            this.f140450e.mo105198e();
        } catch (IOException e) {
            this.f140448c.requestFailed(this.f140447b, e);
            m161779p(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m161770g() throws IOException {
        try {
            this.f140450e.mo105196c();
        } catch (IOException e) {
            this.f140448c.requestFailed(this.f140447b, e);
            m161779p(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m161771h() {
        return this.f140451f;
    }

    /* JADX INFO: renamed from: i */
    public jnc0.AbstractC17985f m161772i() throws SocketException {
        this.f140446a.m167790o();
        return this.f140450e.connection().m140915s(this);
    }

    /* JADX INFO: renamed from: j */
    public void m161773j() {
        this.f140450e.connection().m140916t();
    }

    /* JADX INFO: renamed from: k */
    public void m161774k() {
        this.f140446a.m167782g(this, true, false, null);
    }

    /* JADX INFO: renamed from: l */
    public k5d0 m161775l(i5d0 i5d0Var) throws IOException {
        try {
            this.f140448c.responseBodyStart(this.f140447b);
            String strM138675u = i5d0Var.m138675u("Content-Type");
            long jMo105194a = this.f140450e.mo105194a(i5d0Var);
            return new vmc0(strM138675u, jMo105194a, Okio.buffer(new C18813b(this.f140450e.mo105200g(i5d0Var), jMo105194a)));
        } catch (IOException e) {
            this.f140448c.responseFailed(this.f140447b, e);
            m161779p(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: m */
    public i5d0.C17653a m161776m(boolean z) throws IOException {
        try {
            i5d0.C17653a c17653aMo105199f = this.f140450e.mo105199f(z);
            if (c17653aMo105199f == null) {
                return c17653aMo105199f;
            }
            kzm.f129436a.mo152198g(c17653aMo105199f, this);
            return c17653aMo105199f;
        } catch (IOException e) {
            this.f140448c.responseFailed(this.f140447b, e);
            m161779p(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m161777n(i5d0 i5d0Var) {
        this.f140448c.responseHeadersEnd(this.f140447b, i5d0Var);
    }

    /* JADX INFO: renamed from: o */
    public void m161778o() {
        this.f140448c.responseHeadersStart(this.f140447b);
    }

    /* JADX INFO: renamed from: p */
    public void m161779p(IOException iOException) {
        this.f140449d.m170865h();
        this.f140450e.connection().m140920x(iOException);
    }

    /* JADX INFO: renamed from: q */
    public void m161780q() {
        m161764a(-1L, true, true, null);
    }

    /* JADX INFO: renamed from: r */
    public void m161781r(x1d0 x1d0Var) throws IOException {
        try {
            this.f140448c.requestHeadersStart(this.f140447b);
            this.f140450e.mo105197d(x1d0Var);
            this.f140448c.requestHeadersEnd(this.f140447b, x1d0Var);
        } catch (IOException e) {
            this.f140448c.requestFailed(this.f140447b, e);
            m161779p(e);
            throw e;
        }
    }
}
