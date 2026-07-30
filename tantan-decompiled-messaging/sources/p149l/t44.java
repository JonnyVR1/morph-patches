package p149l;

import java.io.IOException;
import java.net.ProtocolException;
import okio.BufferedSink;
import okio.Okio;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes2.dex */
public final class t44 implements axm {

    /* JADX INFO: renamed from: a */
    public final boolean f167686a;

    public t44(boolean z) {
        this.f167686a = z;
    }

    @Override // p149l.axm
    public exc0 intercept(axm.InterfaceC15754a interfaceC15754a) throws IOException {
        boolean z;
        mec0 mec0Var = (mec0) interfaceC15754a;
        j5f j5fVarM154177b = mec0Var.m154177b();
        stc0 stc0VarRequest = mec0Var.request();
        long jCurrentTimeMillis = System.currentTimeMillis();
        j5fVarM154177b.m139861r(stc0VarRequest);
        exc0.C16708a c16708aM139856m = null;
        if (!lkl.m150370b(stc0VarRequest.m185877g()) || stc0VarRequest.m185871a() == null) {
            j5fVarM154177b.m139854k();
            z = false;
        } else {
            if (HttpHeaderValues.CONTINUE.equalsIgnoreCase(stc0VarRequest.m185873c(HttpHeaders.EXPECT))) {
                j5fVarM154177b.m139850g();
                j5fVarM154177b.m139858o();
                c16708aM139856m = j5fVarM154177b.m139856m(true);
                z = true;
            } else {
                z = false;
            }
            if (c16708aM139856m != null) {
                j5fVarM154177b.m139854k();
                if (!j5fVarM154177b.m139846c().m101345q()) {
                    j5fVarM154177b.m139853j();
                }
            } else if (stc0VarRequest.m185871a().isDuplex()) {
                j5fVarM154177b.m139850g();
                stc0VarRequest.m185871a().writeTo(Okio.buffer(j5fVarM154177b.m139847d(stc0VarRequest, true)));
            } else {
                BufferedSink bufferedSinkBuffer = Okio.buffer(j5fVarM154177b.m139847d(stc0VarRequest, false));
                stc0VarRequest.m185871a().writeTo(bufferedSinkBuffer);
                bufferedSinkBuffer.close();
            }
        }
        if (stc0VarRequest.m185871a() == null || !stc0VarRequest.m185871a().isDuplex()) {
            j5fVarM154177b.m139849f();
        }
        if (!z) {
            j5fVarM154177b.m139858o();
        }
        if (c16708aM139856m == null) {
            c16708aM139856m = j5fVarM154177b.m139856m(false);
        }
        exc0 exc0VarM118615c = c16708aM139856m.m118629q(stc0VarRequest).m118620h(j5fVarM154177b.m139846c().mo101331c()).m118630r(jCurrentTimeMillis).m118628p(System.currentTimeMillis()).m118615c();
        int iM118609q = exc0VarM118615c.m118609q();
        if (iM118609q == 100) {
            exc0VarM118615c = j5fVarM154177b.m139856m(false).m118629q(stc0VarRequest).m118620h(j5fVarM154177b.m139846c().mo101331c()).m118630r(jCurrentTimeMillis).m118628p(System.currentTimeMillis()).m118615c();
            iM118609q = exc0VarM118615c.m118609q();
        }
        j5fVarM154177b.m139857n(exc0VarM118615c);
        exc0 exc0VarM118615c2 = (this.f167686a && iM118609q == 101) ? exc0VarM118615c.m118600N().m118614b(tck0.f169453d).m118615c() : exc0VarM118615c.m118600N().m118614b(j5fVarM154177b.m139855l(exc0VarM118615c)).m118615c();
        if ("close".equalsIgnoreCase(exc0VarM118615c2.m118604Y().m185873c("Connection")) || "close".equalsIgnoreCase(exc0VarM118615c2.m118611u("Connection"))) {
            j5fVarM154177b.m139853j();
        }
        if ((iM118609q != 204 && iM118609q != 205) || exc0VarM118615c2.m118606k().contentLength() <= 0) {
            return exc0VarM118615c2;
        }
        throw new ProtocolException("HTTP " + iM118609q + " had non-zero Content-Length: " + exc0VarM118615c2.m118606k().contentLength());
    }
}
