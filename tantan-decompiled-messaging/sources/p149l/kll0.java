package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes4.dex */
public class kll0 extends kud0<ygt> {
    /* JADX WARN: Type inference failed for: r2v4, types: [l.ho2] */
    @Override // p149l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo95830a(ygt ygtVar, c2e0 c2e0Var, x1e0.C21019b c21019b) {
        Act act = c2e0Var.act();
        if (act == null || act.isFinishing() || act.isDestroyed()) {
            return;
        }
        if (c2e0Var.m206032L2()) {
            lsi0.m151595y("正在直播中，无法调起 Vip 购买页");
        } else if (TextUtils.equals(bqq.m103386a(c2e0Var, c2e0Var.m206027E2().m132146l0().f56011id, ypv.f199493a.m199309D0(), 200), "callUser")) {
            lsi0.m151595y("正在连线中，无法调起 Vip 购买页");
        } else {
            ypv.f199493a.m199373t0(act, "live_purchase");
        }
    }
}
