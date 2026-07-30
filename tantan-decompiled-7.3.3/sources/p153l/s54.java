package p153l;

import java.io.IOException;
import java.net.ProtocolException;
import okio.BufferedSink;
import okio.Okio;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes2.dex */
public final class s54 implements azm {

    /* JADX INFO: renamed from: a */
    public final boolean f166312a;

    public s54(boolean z) {
        this.f166312a = z;
    }

    @Override // p153l.azm
    public i5d0 intercept(azm.InterfaceC15867a interfaceC15867a) throws IOException {
        boolean z;
        tmc0 tmc0Var = (tmc0) interfaceC15867a;
        n6f n6fVarM191724b = tmc0Var.m191724b();
        x1d0 x1d0VarRequest = tmc0Var.request();
        long jCurrentTimeMillis = System.currentTimeMillis();
        n6fVarM191724b.m161781r(x1d0VarRequest);
        i5d0.C17653a c17653aM161776m = null;
        if (!zml.m220393b(x1d0VarRequest.m209022g()) || x1d0VarRequest.m209016a() == null) {
            n6fVarM191724b.m161774k();
            z = false;
        } else {
            if (HttpHeaderValues.CONTINUE.equalsIgnoreCase(x1d0VarRequest.m209018c(HttpHeaders.EXPECT))) {
                n6fVarM191724b.m161770g();
                n6fVarM191724b.m161778o();
                c17653aM161776m = n6fVarM191724b.m161776m(true);
                z = true;
            } else {
                z = false;
            }
            if (c17653aM161776m != null) {
                n6fVarM191724b.m161774k();
                if (!n6fVarM191724b.m161766c().m140913q()) {
                    n6fVarM191724b.m161773j();
                }
            } else if (x1d0VarRequest.m209016a().isDuplex()) {
                n6fVarM191724b.m161770g();
                x1d0VarRequest.m209016a().writeTo(Okio.buffer(n6fVarM191724b.m161767d(x1d0VarRequest, true)));
            } else {
                BufferedSink bufferedSinkBuffer = Okio.buffer(n6fVarM191724b.m161767d(x1d0VarRequest, false));
                x1d0VarRequest.m209016a().writeTo(bufferedSinkBuffer);
                bufferedSinkBuffer.close();
            }
        }
        if (x1d0VarRequest.m209016a() == null || !x1d0VarRequest.m209016a().isDuplex()) {
            n6fVarM191724b.m161769f();
        }
        if (!z) {
            n6fVarM191724b.m161778o();
        }
        if (c17653aM161776m == null) {
            c17653aM161776m = n6fVarM191724b.m161776m(false);
        }
        i5d0 i5d0VarM138679c = c17653aM161776m.m138693q(x1d0VarRequest).m138684h(n6fVarM191724b.m161766c().mo106826c()).m138694r(jCurrentTimeMillis).m138692p(System.currentTimeMillis()).m138679c();
        int iM138673q = i5d0VarM138679c.m138673q();
        if (iM138673q == 100) {
            i5d0VarM138679c = n6fVarM191724b.m161776m(false).m138693q(x1d0VarRequest).m138684h(n6fVarM191724b.m161766c().mo106826c()).m138694r(jCurrentTimeMillis).m138692p(System.currentTimeMillis()).m138679c();
            iM138673q = i5d0VarM138679c.m138673q();
        }
        n6fVarM191724b.m161777n(i5d0VarM138679c);
        i5d0 i5d0VarM138679c2 = (this.f166312a && iM138673q == 101) ? i5d0VarM138679c.m138664N().m138678b(zlk0.f204949d).m138679c() : i5d0VarM138679c.m138664N().m138678b(n6fVarM191724b.m161775l(i5d0VarM138679c)).m138679c();
        if ("close".equalsIgnoreCase(i5d0VarM138679c2.m138668Z().m209018c(HttpHeaders.CONNECTION)) || "close".equalsIgnoreCase(i5d0VarM138679c2.m138675u(HttpHeaders.CONNECTION))) {
            n6fVarM191724b.m161773j();
        }
        if ((iM138673q != 204 && iM138673q != 205) || i5d0VarM138679c2.m138670k().contentLength() <= 0) {
            return i5d0VarM138679c2;
        }
        throw new ProtocolException("HTTP " + iM138673q + " had non-zero Content-Length: " + i5d0VarM138679c2.m138670k().contentLength());
    }
}
