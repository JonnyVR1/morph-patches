package p149l;

import Suddo.Sudimport;
import Suddo.Sudwhile;
import android.net.NetworkInfo;
import java.io.IOException;
import java.util.UUID;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes.dex */
public final class lng0 extends mpg0 {

    /* JADX INFO: renamed from: a */
    public final fpg0 f128990a;

    /* JADX INFO: renamed from: b */
    public final rqg0 f128991b;

    public lng0(fpg0 fpg0Var, rqg0 rqg0Var) {
        this.f128990a = fpg0Var;
        this.f128991b = rqg0Var;
    }

    @Override // p149l.mpg0
    /* JADX INFO: renamed from: a */
    public final int mo150688a() {
        return 2;
    }

    @Override // p149l.mpg0
    /* JADX INFO: renamed from: b */
    public final s9g0 mo113471b(dpg0 dpg0Var, int i) throws IOException {
        zw3 zw3VarM220571a;
        if (i == 0) {
            zw3VarM220571a = null;
        } else if ((i & 4) != 0) {
            zw3VarM220571a = zw3.f205115o;
        } else {
            zw3.C21791a c21791a = new zw3.C21791a();
            if ((i & 1) != 0) {
                c21791a.m220573c();
            }
            if ((i & 2) != 0) {
                c21791a.m220574d();
            }
            zw3VarM220571a = c21791a.m220571a();
        }
        stc0.C20027a c20027aM185898q = new stc0.C20027a().m185882a(HttpHeaders.REFERER, dog0.m112806b(yog0.m215499b(UUID.randomUUID().toString()))).m185882a("sud-device-brand", ghg0.m126182a(hig0.m131254a())).m185882a("sud-os-version", hig0.m131257d()).m185882a("sud-device-id", hig0.m131256c()).m185898q(dpg0Var.f87271a.toString());
        if (zw3VarM220571a != null) {
            c20027aM185898q.m185884c(zw3VarM220571a);
        }
        exc0 exc0VarExecute = this.f128990a.f98696a.mo144849a(c20027aM185898q.m185883b()).execute();
        gxc0 gxc0VarM118606k = exc0VarExecute.m118606k();
        if (!exc0VarExecute.m118597I()) {
            gxc0VarM118606k.close();
            throw new Sudimport(exc0VarExecute.m118609q());
        }
        int i2 = exc0VarExecute.m118608n() == null ? 3 : 2;
        if (i2 == 2 && gxc0VarM118606k.contentLength() == 0) {
            gxc0VarM118606k.close();
            throw new Sudwhile();
        }
        if (i2 == 3 && gxc0VarM118606k.contentLength() > 0) {
            rqg0 rqg0Var = this.f128991b;
            long jContentLength = gxc0VarM118606k.contentLength();
            epg0 epg0Var = rqg0Var.f160631b;
            epg0Var.sendMessage(epg0Var.obtainMessage(4, Long.valueOf(jContentLength)));
        }
        return new s9g0(gxc0VarM118606k.source(), i2);
    }

    @Override // p149l.mpg0
    /* JADX INFO: renamed from: c */
    public final boolean mo150689c(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // p149l.mpg0
    /* JADX INFO: renamed from: d */
    public final boolean mo113472d(dpg0 dpg0Var) {
        String scheme = dpg0Var.f87271a.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }
}
