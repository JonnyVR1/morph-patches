package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes4.dex */
public class oul0 extends o2e0<zit> {
    /* JADX WARN: Type inference failed for: r2v4, types: [l.oo2] */
    @Override // p153l.o2e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo97254a(zit zitVar, gae0 gae0Var, bae0.C15954b c15954b) {
        Act act = gae0Var.act();
        if (act == null || act.isFinishing() || act.isDestroyed()) {
            return;
        }
        if (gae0Var.m213815L2()) {
            o1j0.m165651y("正在直播中，无法调起 Vip 购买页");
        } else if (TextUtils.equals(csq.m112227a(gae0Var, gae0Var.m213810E2().m168532l0().f56859id, zrv.f205799a.m207631D0(), 200), "callUser")) {
            o1j0.m165651y("正在连线中，无法调起 Vip 购买页");
        } else {
            zrv.f205799a.m207695t0(act, "live_purchase");
        }
    }
}
