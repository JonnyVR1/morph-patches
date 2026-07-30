package p006l;

import com.p000p1.mobile.putong.app.PutongAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import l.aqo;
import l.e30;
import l.hqo;
import l.ue50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class mc60 {
    /* JADX INFO: renamed from: a */
    public static void m19204a(Act act, PurchaseType purchaseType, boolean z, String str, String str2, ue50 ue50Var) {
        m19205b(act, purchaseType, z, str, str2, ue50Var, null);
    }

    /* JADX INFO: renamed from: b */
    public static void m19205b(Act act, PurchaseType purchaseType, boolean z, String str, String str2, ue50 ue50Var, e30<Integer> e30Var) {
        hqo hqoVar = new hqo(act, purchaseType);
        hqoVar.t(ue50Var);
        hqoVar.s(e30Var);
        hqoVar.q(aqo.h(act, act instanceof PutongAct ? ((PutongAct) act).iap().i() : null), z, str, str2);
    }
}
