package p149l;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Protocol;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpStatus;

/* JADX INFO: loaded from: classes2.dex */
public final class bx3 implements axm {

    /* JADX INFO: renamed from: a */
    public final lxm f77731a;

    /* JADX INFO: renamed from: l.bx3$a */
    public class C16004a implements Source {

        /* JADX INFO: renamed from: a */
        public boolean f77732a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BufferedSource f77733b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ hx3 f77734c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ BufferedSink f77735d;

        public C16004a(BufferedSource bufferedSource, hx3 hx3Var, BufferedSink bufferedSink) {
            this.f77733b = bufferedSource;
            this.f77734c = hx3Var;
            this.f77735d = bufferedSink;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.f77732a && !tck0.m188015p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f77732a = true;
                this.f77734c.mo133295a();
            }
            this.f77733b.close();
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            try {
                long j2 = this.f77733b.read(buffer, j);
                if (j2 != -1) {
                    buffer.copyTo(this.f77735d.getBufferField(), buffer.size() - j2, j2);
                    this.f77735d.emitCompleteSegments();
                    return j2;
                }
                if (!this.f77732a) {
                    this.f77732a = true;
                    this.f77735d.close();
                }
                return -1L;
            } catch (IOException e) {
                if (this.f77732a) {
                    throw e;
                }
                this.f77732a = true;
                this.f77734c.mo133295a();
                throw e;
            }
        }

        @Override // okio.Source
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return this.f77733b.getTimeout();
        }
    }

    public bx3(lxm lxmVar) {
        this.f77731a = lxmVar;
    }

    /* JADX INFO: renamed from: b */
    public static oxk m104269b(oxk oxkVar, oxk oxkVar2) {
        oxk.C19066a c19066a = new oxk.C19066a();
        int iM166559k = oxkVar.m166559k();
        for (int i = 0; i < iM166559k; i++) {
            String strM166556f = oxkVar.m166556f(i);
            String strM166561m = oxkVar.m166561m(i);
            if ((!HttpHeaders.WARNING.equalsIgnoreCase(strM166556f) || !strM166561m.startsWith("1")) && (m104270c(strM166556f) || !m104271d(strM166556f) || oxkVar2.m166555d(strM166556f) == null)) {
                kxm.f125142a.mo144872b(c19066a, strM166556f, strM166561m);
            }
        }
        int iM166559k2 = oxkVar2.m166559k();
        for (int i2 = 0; i2 < iM166559k2; i2++) {
            String strM166556f2 = oxkVar2.m166556f(i2);
            if (!m104270c(strM166556f2) && m104271d(strM166556f2)) {
                kxm.f125142a.mo144872b(c19066a, strM166556f2, oxkVar2.m166561m(i2));
            }
        }
        return c19066a.m166567e();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m104270c(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m104271d(String str) {
        return ("Connection".equalsIgnoreCase(str) || HttpHeaders.KEEP_ALIVE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHENTICATE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHORIZATION.equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || HttpHeaders.TRANSFER_ENCODING.equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static exc0 m104272e(exc0 exc0Var) {
        return (exc0Var == null || exc0Var.m118606k() == null) ? exc0Var : exc0Var.m118600N().m118614b(null).m118615c();
    }

    /* JADX INFO: renamed from: a */
    public final exc0 m104273a(hx3 hx3Var, exc0 exc0Var) throws IOException {
        Sink sinkMo133296b;
        if (hx3Var == null || (sinkMo133296b = hx3Var.mo133296b()) == null) {
            return exc0Var;
        }
        return exc0Var.m118600N().m118614b(new oec0(exc0Var.m118611u("Content-Type"), exc0Var.m118606k().contentLength(), Okio.buffer(new C16004a(exc0Var.m118606k().source(), hx3Var, Okio.buffer(sinkMo133296b))))).m118615c();
    }

    @Override // p149l.axm
    public exc0 intercept(axm.InterfaceC15754a interfaceC15754a) throws IOException {
        lxm lxmVar = this.f77731a;
        exc0 exc0VarMo152071e = lxmVar != null ? lxmVar.mo152071e(interfaceC15754a.request()) : null;
        jx3 jx3VarM143752c = new jx3.C17886a(System.currentTimeMillis(), interfaceC15754a.request(), exc0VarMo152071e).m143752c();
        stc0 stc0Var = jx3VarM143752c.f120175a;
        exc0 exc0Var = jx3VarM143752c.f120176b;
        lxm lxmVar2 = this.f77731a;
        if (lxmVar2 != null) {
            lxmVar2.mo152072f(jx3VarM143752c);
        }
        if (exc0VarMo152071e != null && exc0Var == null) {
            tck0.m188006g(exc0VarMo152071e.m118606k());
        }
        if (stc0Var == null && exc0Var == null) {
            return new exc0.C16708a().m118629q(interfaceC15754a.request()).m118627o(Protocol.HTTP_1_1).m118619g(HttpStatus.GATEWAY_TIMEOUT_504).m118624l("Unsatisfiable Request (only-if-cached)").m118614b(tck0.f169453d).m118630r(-1L).m118628p(System.currentTimeMillis()).m118615c();
        }
        if (stc0Var == null) {
            return exc0Var.m118600N().m118616d(m104272e(exc0Var)).m118615c();
        }
        try {
            exc0 exc0VarMo99454a = interfaceC15754a.mo99454a(stc0Var);
            if (exc0VarMo99454a == null && exc0VarMo152071e != null) {
                tck0.m188006g(exc0VarMo152071e.m118606k());
            }
            if (exc0Var != null) {
                if (exc0VarMo99454a.m118609q() == 304) {
                    exc0 exc0VarM118615c = exc0Var.m118600N().m118622j(m104269b(exc0Var.m118595F(), exc0VarMo99454a.m118595F())).m118630r(exc0VarMo99454a.m118605Z()).m118628p(exc0VarMo99454a.m118603T()).m118616d(m104272e(exc0Var)).m118625m(m104272e(exc0VarMo99454a)).m118615c();
                    exc0VarMo99454a.m118606k().close();
                    this.f77731a.mo152070d();
                    this.f77731a.mo152069c(exc0Var, exc0VarM118615c);
                    return exc0VarM118615c;
                }
                tck0.m188006g(exc0Var.m118606k());
            }
            exc0 exc0VarM118615c2 = exc0VarMo99454a.m118600N().m118616d(m104272e(exc0Var)).m118625m(m104272e(exc0VarMo99454a)).m118615c();
            if (this.f77731a != null) {
                if (kkl.m146335c(exc0VarM118615c2) && jx3.m143748a(exc0VarM118615c2, stc0Var)) {
                    return m104273a(this.f77731a.mo152067a(exc0VarM118615c2), exc0VarM118615c2);
                }
                if (lkl.m150369a(stc0Var.m185877g())) {
                    try {
                        this.f77731a.mo152068b(stc0Var);
                    } catch (IOException unused) {
                    }
                }
            }
            return exc0VarM118615c2;
        } catch (Throwable th) {
            if (exc0VarMo152071e != null) {
                tck0.m188006g(exc0VarMo152071e.m118606k());
            }
            throw th;
        }
    }
}
