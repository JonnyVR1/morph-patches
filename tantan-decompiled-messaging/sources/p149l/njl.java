package p149l;

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

/* JADX INFO: loaded from: classes2.dex */
public final class njl implements k5f {

    /* JADX INFO: renamed from: g */
    public static final List<String> f139284g = tck0.m188020u("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: h */
    public static final List<String> f139285h = tck0.m188020u("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a */
    public final axm.InterfaceC15754a f139286a;

    /* JADX INFO: renamed from: b */
    public final bec0 f139287b;

    /* JADX INFO: renamed from: c */
    public final mjl f139288c;

    /* JADX INFO: renamed from: d */
    public volatile pjl f139289d;

    /* JADX INFO: renamed from: e */
    public final Protocol f139290e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f139291f;

    public njl(k850 k850Var, bec0 bec0Var, axm.InterfaceC15754a interfaceC15754a, mjl mjlVar) {
        this.f139287b = bec0Var;
        this.f139286a = interfaceC15754a;
        this.f139288c = mjlVar;
        List<Protocol> listM144870z = k850Var.m144870z();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f139290e = listM144870z.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    /* JADX INFO: renamed from: h */
    public static List<hxk> m159743h(stc0 stc0Var) {
        oxk oxkVarM185875e = stc0Var.m185875e();
        ArrayList arrayList = new ArrayList(oxkVarM185875e.m166559k() + 4);
        arrayList.add(new hxk(hxk.f109877f, stc0Var.m185877g()));
        arrayList.add(new hxk(hxk.f109878g, fuc0.m123186c(stc0Var.m185881k())));
        String strM185873c = stc0Var.m185873c("Host");
        if (strM185873c != null) {
            arrayList.add(new hxk(hxk.f109880i, strM185873c));
        }
        arrayList.add(new hxk(hxk.f109879h, stc0Var.m185881k().m107514I()));
        int iM166559k = oxkVarM185875e.m166559k();
        for (int i = 0; i < iM166559k; i++) {
            String lowerCase = oxkVarM185875e.m166556f(i).toLowerCase(Locale.US);
            if (!f139284g.contains(lowerCase) || (lowerCase.equals("te") && oxkVarM185875e.m166561m(i).equals("trailers"))) {
                arrayList.add(new hxk(lowerCase, oxkVarM185875e.m166561m(i)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static exc0.C16708a m159744i(oxk oxkVar, Protocol protocol) throws IOException {
        oxk.C19066a c19066a = new oxk.C19066a();
        int iM166559k = oxkVar.m166559k();
        hwf0 hwf0VarM133243a = null;
        for (int i = 0; i < iM166559k; i++) {
            String strM166556f = oxkVar.m166556f(i);
            String strM166561m = oxkVar.m166561m(i);
            if (strM166556f.equals(":status")) {
                hwf0VarM133243a = hwf0.m133243a("HTTP/1.1 " + strM166561m);
            } else if (!f139285h.contains(strM166556f)) {
                kxm.f125142a.mo144872b(c19066a, strM166556f, strM166561m);
            }
        }
        if (hwf0VarM133243a != null) {
            return new exc0.C16708a().m118627o(protocol).m118619g(hwf0VarM133243a.f109757b).m118624l(hwf0VarM133243a.f109758c).m118622j(c19066a.m166567e());
        }
        aza0.m99642a("Expected ':status' header not present");
        return null;
    }

    @Override // p149l.k5f
    /* JADX INFO: renamed from: a */
    public long mo144532a(exc0 exc0Var) {
        return kkl.m146334b(exc0Var);
    }

    @Override // p149l.k5f
    /* JADX INFO: renamed from: b */
    public Sink mo144533b(stc0 stc0Var, long j) {
        return this.f139289d.m169893h();
    }

    @Override // p149l.k5f
    /* JADX INFO: renamed from: c */
    public void mo144534c() throws IOException {
        this.f139288c.flush();
    }

    @Override // p149l.k5f
    public void cancel() {
        this.f139291f = true;
        if (this.f139289d != null) {
            this.f139289d.m169891f(ErrorCode.CANCEL);
        }
    }

    @Override // p149l.k5f
    public bec0 connection() {
        return this.f139287b;
    }

    @Override // p149l.k5f
    /* JADX INFO: renamed from: d */
    public void mo144535d(stc0 stc0Var) throws IOException {
        if (this.f139289d != null) {
            return;
        }
        this.f139289d = this.f139288c.m154860I(m159743h(stc0Var), stc0Var.m185871a() != null);
        boolean z = this.f139291f;
        pjl pjlVar = this.f139289d;
        if (z) {
            pjlVar.m169891f(ErrorCode.CANCEL);
            rhg0.m179353a("Canceled");
            return;
        }
        Timeout timeoutM169897l = pjlVar.m169897l();
        long timeoutMillis = this.f139286a.readTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeoutM169897l.timeout(timeoutMillis, timeUnit);
        this.f139289d.m169903r().timeout(this.f139286a.writeTimeoutMillis(), timeUnit);
    }

    @Override // p149l.k5f
    /* JADX INFO: renamed from: e */
    public void mo144536e() throws IOException {
        this.f139289d.m169893h().close();
    }

    @Override // p149l.k5f
    /* JADX INFO: renamed from: f */
    public exc0.C16708a mo144537f(boolean z) throws IOException {
        exc0.C16708a c16708aM159744i = m159744i(this.f139289d.m169901p(), this.f139290e);
        if (z && kxm.f125142a.mo144874d(c16708aM159744i) == 100) {
            return null;
        }
        return c16708aM159744i;
    }

    @Override // p149l.k5f
    /* JADX INFO: renamed from: g */
    public Source mo144538g(exc0 exc0Var) {
        return this.f139289d.m169894i();
    }
}
