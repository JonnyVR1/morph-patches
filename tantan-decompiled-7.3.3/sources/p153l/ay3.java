package p153l;

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
public final class ay3 implements azm {

    /* JADX INFO: renamed from: a */
    public final lzm f73938a;

    /* JADX INFO: renamed from: l.ay3$a */
    public class C15859a implements Source {

        /* JADX INFO: renamed from: a */
        public boolean f73939a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BufferedSource f73940b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ gy3 f73941c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ BufferedSink f73942d;

        public C15859a(BufferedSource bufferedSource, gy3 gy3Var, BufferedSink bufferedSink) {
            this.f73940b = bufferedSource;
            this.f73941c = gy3Var;
            this.f73942d = bufferedSink;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.f73939a && !zlk0.m220254p(this, 100, TimeUnit.MILLISECONDS)) {
                this.f73939a = true;
                this.f73941c.mo132930a();
            }
            this.f73940b.close();
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            try {
                long j2 = this.f73940b.read(buffer, j);
                if (j2 != -1) {
                    buffer.copyTo(this.f73942d.getBufferField(), buffer.size() - j2, j2);
                    this.f73942d.emitCompleteSegments();
                    return j2;
                }
                if (!this.f73939a) {
                    this.f73939a = true;
                    this.f73942d.close();
                }
                return -1L;
            } catch (IOException e) {
                if (this.f73939a) {
                    throw e;
                }
                this.f73939a = true;
                this.f73941c.mo132930a();
                throw e;
            }
        }

        @Override // okio.Source
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return this.f73940b.getTimeout();
        }
    }

    public ay3(lzm lzmVar) {
        this.f73938a = lzmVar;
    }

    /* JADX INFO: renamed from: b */
    public static e0l m100859b(e0l e0lVar, e0l e0lVar2) {
        e0l.C16674a c16674a = new e0l.C16674a();
        int iM118878k = e0lVar.m118878k();
        for (int i = 0; i < iM118878k; i++) {
            String strM118875f = e0lVar.m118875f(i);
            String strM118880m = e0lVar.m118880m(i);
            if ((!HttpHeaders.WARNING.equalsIgnoreCase(strM118875f) || !strM118880m.startsWith("1")) && (m100860c(strM118875f) || !m100861d(strM118875f) || e0lVar2.m118874d(strM118875f) == null)) {
                kzm.f129436a.mo152193b(c16674a, strM118875f, strM118880m);
            }
        }
        int iM118878k2 = e0lVar2.m118878k();
        for (int i2 = 0; i2 < iM118878k2; i2++) {
            String strM118875f2 = e0lVar2.m118875f(i2);
            if (!m100860c(strM118875f2) && m100861d(strM118875f2)) {
                kzm.f129436a.mo152193b(c16674a, strM118875f2, e0lVar2.m118880m(i2));
            }
        }
        return c16674a.m118886e();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m100860c(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m100861d(String str) {
        return (HttpHeaders.CONNECTION.equalsIgnoreCase(str) || HttpHeaders.KEEP_ALIVE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHENTICATE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHORIZATION.equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || HttpHeaders.TRANSFER_ENCODING.equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static i5d0 m100862e(i5d0 i5d0Var) {
        return (i5d0Var == null || i5d0Var.m138670k() == null) ? i5d0Var : i5d0Var.m138664N().m138678b(null).m138679c();
    }

    /* JADX INFO: renamed from: a */
    public final i5d0 m100863a(gy3 gy3Var, i5d0 i5d0Var) throws IOException {
        Sink sinkMo132931b;
        if (gy3Var == null || (sinkMo132931b = gy3Var.mo132931b()) == null) {
            return i5d0Var;
        }
        return i5d0Var.m138664N().m138678b(new vmc0(i5d0Var.m138675u("Content-Type"), i5d0Var.m138670k().contentLength(), Okio.buffer(new C15859a(i5d0Var.m138670k().source(), gy3Var, Okio.buffer(sinkMo132931b))))).m138679c();
    }

    @Override // p153l.azm
    public i5d0 intercept(azm.InterfaceC15867a interfaceC15867a) throws IOException {
        lzm lzmVar = this.f73938a;
        i5d0 i5d0VarMo156447e = lzmVar != null ? lzmVar.mo156447e(interfaceC15867a.request()) : null;
        iy3 iy3VarM142605c = new iy3.C17820a(System.currentTimeMillis(), interfaceC15867a.request(), i5d0VarMo156447e).m142605c();
        x1d0 x1d0Var = iy3VarM142605c.f117497a;
        i5d0 i5d0Var = iy3VarM142605c.f117498b;
        lzm lzmVar2 = this.f73938a;
        if (lzmVar2 != null) {
            lzmVar2.mo156448f(iy3VarM142605c);
        }
        if (i5d0VarMo156447e != null && i5d0Var == null) {
            zlk0.m220245g(i5d0VarMo156447e.m138670k());
        }
        if (x1d0Var == null && i5d0Var == null) {
            return new i5d0.C17653a().m138693q(interfaceC15867a.request()).m138691o(Protocol.HTTP_1_1).m138683g(HttpStatus.GATEWAY_TIMEOUT_504).m138688l("Unsatisfiable Request (only-if-cached)").m138678b(zlk0.f204949d).m138694r(-1L).m138692p(System.currentTimeMillis()).m138679c();
        }
        if (x1d0Var == null) {
            return i5d0Var.m138664N().m138680d(m100862e(i5d0Var)).m138679c();
        }
        try {
            i5d0 i5d0VarMo101076a = interfaceC15867a.mo101076a(x1d0Var);
            if (i5d0VarMo101076a == null && i5d0VarMo156447e != null) {
                zlk0.m220245g(i5d0VarMo156447e.m138670k());
            }
            if (i5d0Var != null) {
                if (i5d0VarMo101076a.m138673q() == 304) {
                    i5d0 i5d0VarM138679c = i5d0Var.m138664N().m138686j(m100859b(i5d0Var.m138659F(), i5d0VarMo101076a.m138659F())).m138694r(i5d0VarMo101076a.m138669a0()).m138692p(i5d0VarMo101076a.m138667U()).m138680d(m100862e(i5d0Var)).m138689m(m100862e(i5d0VarMo101076a)).m138679c();
                    i5d0VarMo101076a.m138670k().close();
                    this.f73938a.mo156446d();
                    this.f73938a.mo156445c(i5d0Var, i5d0VarM138679c);
                    return i5d0VarM138679c;
                }
                zlk0.m220245g(i5d0Var.m138670k());
            }
            i5d0 i5d0VarM138679c2 = i5d0VarMo101076a.m138664N().m138680d(m100862e(i5d0Var)).m138689m(m100862e(i5d0VarMo101076a)).m138679c();
            if (this.f73938a != null) {
                if (yml.m216700c(i5d0VarM138679c2) && iy3.m142601a(i5d0VarM138679c2, x1d0Var)) {
                    return m100863a(this.f73938a.mo156443a(i5d0VarM138679c2), i5d0VarM138679c2);
                }
                if (zml.m220392a(x1d0Var.m209022g())) {
                    try {
                        this.f73938a.mo156444b(x1d0Var);
                    } catch (IOException unused) {
                    }
                }
            }
            return i5d0VarM138679c2;
        } catch (Throwable th) {
            if (i5d0VarMo156447e != null) {
                zlk0.m220245g(i5d0VarMo156447e.m138670k());
            }
            throw th;
        }
    }
}
