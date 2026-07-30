package p002l;

import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import l.lsi0;
import l.ygt;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kll0 extends kud0<ygt> {
    /* JADX WARN: Type inference failed for: r2v4, types: [l.ho2] */
    @Override // p002l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo9496a(ygt ygtVar, c2e0 c2e0Var, x1e0.C0892b c0892b) {
        Act act = c2e0Var.act();
        if (act == null || act.isFinishing() || act.isDestroyed()) {
            return;
        }
        if (c2e0Var.m25552L2()) {
            lsi0.y("正在直播中，无法调起 Vip 购买页");
        } else if (TextUtils.equals(bqq.m10554a(c2e0Var, ((DbObject) c2e0Var.m25547E2().m14582l0()).id, ypv.a.D0(), 200), "callUser")) {
            lsi0.y("正在连线中，无法调起 Vip 购买页");
        } else {
            ypv.a.t0(act, "live_purchase");
        }
    }
}
