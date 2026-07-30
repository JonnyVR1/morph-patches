package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.PurchaseType;

/* JADX INFO: loaded from: classes9.dex */
public class rk60 {
    /* JADX INFO: renamed from: a */
    public static void m181779a(Act act, PurchaseType purchaseType, boolean z, String str, String str2, bn50 bn50Var) {
        m181780b(act, purchaseType, z, str, str2, bn50Var, null);
    }

    /* JADX INFO: renamed from: b */
    public static void m181780b(Act act, PurchaseType purchaseType, boolean z, String str, String str2, bn50 bn50Var, y20<Integer> y20Var) {
        hso hsoVar = new hso(act, purchaseType);
        hsoVar.m137011t(bn50Var);
        hsoVar.m137010s(y20Var);
        hsoVar.m137008q(aso.m99953h(act, act instanceof PutongAct ? ((PutongAct) act).iap().m103295i() : null), z, str, str2);
    }
}
