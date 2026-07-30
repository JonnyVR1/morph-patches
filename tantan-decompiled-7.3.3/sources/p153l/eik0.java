package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.livingroom.R$string;

/* JADX INFO: loaded from: classes4.dex */
public class eik0 extends o2e0<zit> {
    /* JADX WARN: Type inference failed for: r0v11, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.oo2] */
    /* JADX INFO: renamed from: b */
    public final String m120936b(gae0 gae0Var) {
        return (gae0Var.m213810E2() == 0 || gae0Var.m213810E2().m168532l0() == null || TextUtils.isEmpty(gae0Var.m213810E2().m168532l0().f56859id)) ? "" : gae0Var.m213810E2().m168532l0().f56859id;
    }

    @Override // p153l.o2e0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo97254a(zit zitVar, gae0 gae0Var, bae0.C15954b c15954b) {
        fik0.C16979a c16979a = (fik0.C16979a) gae0Var.m138856F3(new fik0(700));
        if (gae0Var.m213815L2()) {
            o1j0.m165649w(R$string.f48013c7);
        } else if (c16979a != null) {
            m120936b(gae0Var);
            zrv.f205799a.m207702x(gae0Var.act(), c16979a);
        }
    }
}
