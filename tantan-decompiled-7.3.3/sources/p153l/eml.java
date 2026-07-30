package p153l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Protocol;
import okhttp3.internal.http2.ErrorCode;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.eclipse.jetty.http.HttpHeaderValues;

/* JADX INFO: loaded from: classes2.dex */
public final class eml implements o6f {

    /* JADX INFO: renamed from: g */
    public static final List<String> f94663g = zlk0.m220259u("connection", "host", HttpHeaderValues.KEEP_ALIVE, "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: h */
    public static final List<String> f94664h = zlk0.m220259u("connection", "host", HttpHeaderValues.KEEP_ALIVE, "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a */
    public final azm.InterfaceC15867a f94665a;

    /* JADX INFO: renamed from: b */
    public final imc0 f94666b;

    /* JADX INFO: renamed from: c */
    public final dml f94667c;

    /* JADX INFO: renamed from: d */
    public volatile gml f94668d;

    /* JADX INFO: renamed from: e */
    public final Protocol f94669e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f94670f;

    public eml(rg50 rg50Var, imc0 imc0Var, azm.InterfaceC15867a interfaceC15867a, dml dmlVar) {
        this.f94666b = imc0Var;
        this.f94665a = interfaceC15867a;
        this.f94667c = dmlVar;
        List<Protocol> listM181362z = rg50Var.m181362z();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f94669e = listM181362z.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    /* JADX INFO: renamed from: h */
    public static List<xzk> m121369h(x1d0 x1d0Var) {
        e0l e0lVarM209020e = x1d0Var.m209020e();
        ArrayList arrayList = new ArrayList(e0lVarM209020e.m118878k() + 4);
        arrayList.add(new xzk(xzk.f196880f, x1d0Var.m209022g()));
        arrayList.add(new xzk(xzk.f196881g, i2d0.m138187c(x1d0Var.m209026k())));
        String strM209018c = x1d0Var.m209018c("Host");
        if (strM209018c != null) {
            arrayList.add(new xzk(xzk.f196883i, strM209018c));
        }
        arrayList.add(new xzk(xzk.f196882h, x1d0Var.m209026k().m182278I()));
        int iM118878k = e0lVarM209020e.m118878k();
        for (int i = 0; i < iM118878k; i++) {
            String lowerCase = e0lVarM209020e.m118875f(i).toLowerCase(Locale.US);
            if (!f94663g.contains(lowerCase) || (lowerCase.equals("te") && e0lVarM209020e.m118880m(i).equals("trailers"))) {
                arrayList.add(new xzk(lowerCase, e0lVarM209020e.m118880m(i)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static i5d0.C17653a m121370i(e0l e0lVar, Protocol protocol) throws IOException {
        e0l.C16674a c16674a = new e0l.C16674a();
        int iM118878k = e0lVar.m118878k();
        r4g0 r4g0VarM179760a = null;
        for (int i = 0; i < iM118878k; i++) {
            String strM118875f = e0lVar.m118875f(i);
            String strM118880m = e0lVar.m118880m(i);
            if (strM118875f.equals(":status")) {
                r4g0VarM179760a = r4g0.m179760a("HTTP/1.1 " + strM118880m);
            } else if (!f94664h.contains(strM118875f)) {
                kzm.f129436a.mo152193b(c16674a, strM118875f, strM118880m);
            }
        }
        if (r4g0VarM179760a != null) {
            return new i5d0.C17653a().m138691o(protocol).m138683g(r4g0VarM179760a.f161202b).m138688l(r4g0VarM179760a.f161203c).m138686j(c16674a.m118886e());
        }
        e7b0.m119688a("Expected ':status' header not present");
        return null;
    }

    @Override // p153l.o6f
    /* JADX INFO: renamed from: a */
    public long mo105194a(i5d0 i5d0Var) {
        return yml.m216699b(i5d0Var);
    }

    @Override // p153l.o6f
    /* JADX INFO: renamed from: b */
    public Sink mo105195b(x1d0 x1d0Var, long j) {
        return this.f94668d.m130807h();
    }

    @Override // p153l.o6f
    /* JADX INFO: renamed from: c */
    public void mo105196c() throws IOException {
        this.f94667c.flush();
    }

    @Override // p153l.o6f
    public void cancel() {
        this.f94670f = true;
        if (this.f94668d != null) {
            this.f94668d.m130805f(ErrorCode.CANCEL);
        }
    }

    @Override // p153l.o6f
    public imc0 connection() {
        return this.f94666b;
    }

    @Override // p153l.o6f
    /* JADX INFO: renamed from: d */
    public void mo105197d(x1d0 x1d0Var) throws IOException {
        if (this.f94668d != null) {
            return;
        }
        this.f94668d = this.f94667c.m116982I(m121369h(x1d0Var), x1d0Var.m209016a() != null);
        boolean z = this.f94670f;
        gml gmlVar = this.f94668d;
        if (z) {
            gmlVar.m130805f(ErrorCode.CANCEL);
            zpg0.m220844a("Canceled");
            return;
        }
        Timeout timeoutM130811l = gmlVar.m130811l();
        long timeoutMillis = this.f94665a.readTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeoutM130811l.timeout(timeoutMillis, timeUnit);
        this.f94668d.m130817r().timeout(this.f94665a.writeTimeoutMillis(), timeUnit);
    }

    @Override // p153l.o6f
    /* JADX INFO: renamed from: e */
    public void mo105198e() throws IOException {
        this.f94668d.m130807h().close();
    }

    @Override // p153l.o6f
    /* JADX INFO: renamed from: f */
    public i5d0.C17653a mo105199f(boolean z) throws IOException {
        i5d0.C17653a c17653aM121370i = m121370i(this.f94668d.m130815p(), this.f94669e);
        if (z && kzm.f129436a.mo152195d(c17653aM121370i) == 100) {
            return null;
        }
        return c17653aM121370i;
    }

    @Override // p153l.o6f
    /* JADX INFO: renamed from: g */
    public Source mo105200g(i5d0 i5d0Var) {
        return this.f94668d.m130808i();
    }
}
