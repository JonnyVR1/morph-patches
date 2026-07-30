package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.PurchaseType;

/* JADX INFO: loaded from: classes9.dex */
public class mc60 {
    /* JADX INFO: renamed from: a */
    public static void m153987a(Act act, PurchaseType purchaseType, boolean z, String str, String str2, ue50 ue50Var) {
        m153988b(act, purchaseType, z, str, str2, ue50Var, null);
    }

    /* JADX INFO: renamed from: b */
    public static void m153988b(Act act, PurchaseType purchaseType, boolean z, String str, String str2, ue50 ue50Var, e30<Integer> e30Var) {
        hqo hqoVar = new hqo(act, purchaseType);
        hqoVar.m132479t(ue50Var);
        hqoVar.m132478s(e30Var);
        hqoVar.m132476q(aqo.m98316h(act, act instanceof PutongAct ? ((PutongAct) act).iap().m148933i() : null), z, str, str2);
    }
}
