package p153l;

import Suddo.Sudimport;
import Suddo.Sudwhile;
import android.net.NetworkInfo;
import java.io.IOException;
import java.util.UUID;
import org.eclipse.jetty.http.HttpHeaders;

/* JADX INFO: loaded from: classes.dex */
public final class tvg0 extends uxg0 {

    /* JADX INFO: renamed from: a */
    public final nxg0 f176261a;

    /* JADX INFO: renamed from: b */
    public final zyg0 f176262b;

    public tvg0(nxg0 nxg0Var, zyg0 zyg0Var) {
        this.f176261a = nxg0Var;
        this.f176262b = zyg0Var;
    }

    @Override // p153l.uxg0
    /* JADX INFO: renamed from: a */
    public final int mo192803a() {
        return 2;
    }

    @Override // p153l.uxg0
    /* JADX INFO: renamed from: b */
    public final aig0 mo118414b(lxg0 lxg0Var, int i) throws IOException {
        yx3 yx3VarM217682a;
        if (i == 0) {
            yx3VarM217682a = null;
        } else if ((i & 4) != 0) {
            yx3VarM217682a = yx3.f201903o;
        } else {
            yx3.C21702a c21702a = new yx3.C21702a();
            if ((i & 1) != 0) {
                c21702a.m217684c();
            }
            if ((i & 2) != 0) {
                c21702a.m217685d();
            }
            yx3VarM217682a = c21702a.m217682a();
        }
        x1d0.C21228a c21228aM209043q = new x1d0.C21228a().m209027a(HttpHeaders.REFERER, lwg0.m156044b(gxg0.m132863b(UUID.randomUUID().toString()))).m209027a("sud-device-brand", opg0.m168673a(pqg0.m173348a())).m209027a("sud-os-version", pqg0.m173351d()).m209027a("sud-device-id", pqg0.m173350c()).m209043q(lxg0Var.f133955a.toString());
        if (yx3VarM217682a != null) {
            c21228aM209043q.m209029c(yx3VarM217682a);
        }
        i5d0 i5d0VarExecute = this.f176261a.f144123a.mo181341a(c21228aM209043q.m209028b()).execute();
        k5d0 k5d0VarM138670k = i5d0VarExecute.m138670k();
        if (!i5d0VarExecute.m138661I()) {
            k5d0VarM138670k.close();
            throw new Sudimport(i5d0VarExecute.m138673q());
        }
        int i2 = i5d0VarExecute.m138672n() == null ? 3 : 2;
        if (i2 == 2 && k5d0VarM138670k.contentLength() == 0) {
            k5d0VarM138670k.close();
            throw new Sudwhile();
        }
        if (i2 == 3 && k5d0VarM138670k.contentLength() > 0) {
            zyg0 zyg0Var = this.f176262b;
            long jContentLength = k5d0VarM138670k.contentLength();
            mxg0 mxg0Var = zyg0Var.f206579b;
            mxg0Var.sendMessage(mxg0Var.obtainMessage(4, Long.valueOf(jContentLength)));
        }
        return new aig0(k5d0VarM138670k.source(), i2);
    }

    @Override // p153l.uxg0
    /* JADX INFO: renamed from: c */
    public final boolean mo192804c(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // p153l.uxg0
    /* JADX INFO: renamed from: d */
    public final boolean mo118415d(lxg0 lxg0Var) {
        String scheme = lxg0Var.f133955a.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }
}
