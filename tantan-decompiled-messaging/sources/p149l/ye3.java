package p149l;

import java.io.IOException;
import java.util.List;
import okio.GzipSource;
import okio.Okio;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes2.dex */
public final class ye3 implements axm {

    /* JADX INFO: renamed from: a */
    public final bt6 f197658a;

    public ye3(bt6 bt6Var) {
        this.f197658a = bt6Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m214332a(List<at6> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            at6 at6Var = list.get(i);
            sb.append(at6Var.m98775g());
            sb.append('=');
            sb.append(at6Var.m98780r());
        }
        return sb.toString();
    }

    @Override // p149l.axm
    public exc0 intercept(axm.InterfaceC15754a interfaceC15754a) throws IOException {
        stc0 stc0VarRequest = interfaceC15754a.request();
        stc0.C20027a c20027aM185878h = stc0VarRequest.m185878h();
        utc0 utc0VarM185871a = stc0VarRequest.m185871a();
        if (utc0VarM185871a != null) {
            hyx hyxVarContentType = utc0VarM185871a.contentType();
            if (hyxVarContentType != null) {
                c20027aM185878h.m185889h("Content-Type", hyxVarContentType.toString());
            }
            long jContentLength = utc0VarM185871a.contentLength();
            if (jContentLength != -1) {
                c20027aM185878h.m185889h("Content-Length", Long.toString(jContentLength));
                c20027aM185878h.m185895n(HttpHeaders.TRANSFER_ENCODING);
            } else {
                c20027aM185878h.m185889h(HttpHeaders.TRANSFER_ENCODING, HttpHeaderValues.CHUNKED);
                c20027aM185878h.m185895n("Content-Length");
            }
        }
        boolean z = false;
        if (stc0VarRequest.m185873c("Host") == null) {
            c20027aM185878h.m185889h("Host", tck0.m188018s(stc0VarRequest.m185881k(), false));
        }
        if (stc0VarRequest.m185873c("Connection") == null) {
            c20027aM185878h.m185889h("Connection", HttpHeaders.KEEP_ALIVE);
        }
        if (stc0VarRequest.m185873c("Accept-Encoding") == null && stc0VarRequest.m185873c("Range") == null) {
            c20027aM185878h.m185889h("Accept-Encoding", HttpHeaderValues.GZIP);
            z = true;
        }
        List<at6> listMo103810a = this.f197658a.mo103810a(stc0VarRequest.m185881k());
        if (!listMo103810a.isEmpty()) {
            c20027aM185878h.m185889h("Cookie", m214332a(listMo103810a));
        }
        if (stc0VarRequest.m185873c("User-Agent") == null) {
            c20027aM185878h.m185889h("User-Agent", l0l0.m148099a());
        }
        exc0 exc0VarMo99454a = interfaceC15754a.mo99454a(c20027aM185878h.m185883b());
        kkl.m146339g(this.f197658a, stc0VarRequest.m185881k(), exc0VarMo99454a.m118595F());
        exc0.C16708a c16708aM118629q = exc0VarMo99454a.m118600N().m118629q(stc0VarRequest);
        if (z && HttpHeaderValues.GZIP.equalsIgnoreCase(exc0VarMo99454a.m118611u("Content-Encoding")) && kkl.m146335c(exc0VarMo99454a)) {
            GzipSource gzipSource = new GzipSource(exc0VarMo99454a.m118606k().source());
            c16708aM118629q.m118622j(exc0VarMo99454a.m118595F().m166558h().m166569g("Content-Encoding").m166569g("Content-Length").m166567e());
            c16708aM118629q.m118614b(new oec0(exc0VarMo99454a.m118611u("Content-Type"), -1L, Okio.buffer(gzipSource)));
        }
        return c16708aM118629q.m118615c();
    }
}
