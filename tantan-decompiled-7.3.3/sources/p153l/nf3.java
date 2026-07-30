package p153l;

import java.io.IOException;
import java.util.List;
import okio.GzipSource;
import okio.Okio;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes2.dex */
public final class nf3 implements azm {

    /* JADX INFO: renamed from: a */
    public final eu6 f141707a;

    public nf3(eu6 eu6Var) {
        this.f141707a = eu6Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m162917a(List<du6> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            du6 du6Var = list.get(i);
            sb.append(du6Var.m118076c());
            sb.append('=');
            sb.append(du6Var.m118078k());
        }
        return sb.toString();
    }

    @Override // p153l.azm
    public i5d0 intercept(azm.InterfaceC15867a interfaceC15867a) throws IOException {
        x1d0 x1d0VarRequest = interfaceC15867a.request();
        x1d0.C21228a c21228aM209023h = x1d0VarRequest.m209023h();
        z1d0 z1d0VarM209016a = x1d0VarRequest.m209016a();
        if (z1d0VarM209016a != null) {
            e7y e7yVarContentType = z1d0VarM209016a.contentType();
            if (e7yVarContentType != null) {
                c21228aM209023h.m209034h("Content-Type", e7yVarContentType.toString());
            }
            long jContentLength = z1d0VarM209016a.contentLength();
            if (jContentLength != -1) {
                c21228aM209023h.m209034h("Content-Length", Long.toString(jContentLength));
                c21228aM209023h.m209040n(HttpHeaders.TRANSFER_ENCODING);
            } else {
                c21228aM209023h.m209034h(HttpHeaders.TRANSFER_ENCODING, HttpHeaderValues.CHUNKED);
                c21228aM209023h.m209040n("Content-Length");
            }
        }
        boolean z = false;
        if (x1d0VarRequest.m209018c("Host") == null) {
            c21228aM209023h.m209034h("Host", zlk0.m220257s(x1d0VarRequest.m209026k(), false));
        }
        if (x1d0VarRequest.m209018c(HttpHeaders.CONNECTION) == null) {
            c21228aM209023h.m209034h(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
        }
        if (x1d0VarRequest.m209018c(HttpHeaders.ACCEPT_ENCODING) == null && x1d0VarRequest.m209018c("Range") == null) {
            c21228aM209023h.m209034h(HttpHeaders.ACCEPT_ENCODING, HttpHeaderValues.GZIP);
            z = true;
        }
        List<du6> listMo122536a = this.f141707a.mo122536a(x1d0VarRequest.m209026k());
        if (!listMo122536a.isEmpty()) {
            c21228aM209023h.m209034h(HttpHeaders.COOKIE, m162917a(listMo122536a));
        }
        if (x1d0VarRequest.m209018c("User-Agent") == null) {
            c21228aM209023h.m209034h("User-Agent", q9l0.m175842a());
        }
        i5d0 i5d0VarMo101076a = interfaceC15867a.mo101076a(c21228aM209023h.m209028b());
        yml.m216704g(this.f141707a, x1d0VarRequest.m209026k(), i5d0VarMo101076a.m138659F());
        i5d0.C17653a c17653aM138693q = i5d0VarMo101076a.m138664N().m138693q(x1d0VarRequest);
        if (z && HttpHeaderValues.GZIP.equalsIgnoreCase(i5d0VarMo101076a.m138675u("Content-Encoding")) && yml.m216700c(i5d0VarMo101076a)) {
            GzipSource gzipSource = new GzipSource(i5d0VarMo101076a.m138670k().source());
            c17653aM138693q.m138686j(i5d0VarMo101076a.m138659F().m118877h().m118888g("Content-Encoding").m118888g("Content-Length").m118886e());
            c17653aM138693q.m138678b(new vmc0(i5d0VarMo101076a.m138675u("Content-Type"), -1L, Okio.buffer(gzipSource)));
        }
        return c17653aM138693q.m138679c();
    }
}
