package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class rd5 {
    /* JADX INFO: renamed from: a */
    public static jic0<C8928d> m180838a(Act act, List<C8928d> list, z20<C8928d, Boolean> z20Var) {
        return new y7n(act, list, z20Var);
    }

    /* JADX INFO: renamed from: b */
    public static frl m180839b(Act act, int i, PurchaseType purchaseType) {
        if (m180844g(i)) {
            return new doo(act, i, purchaseType);
        }
        return CoreModule.m30930K().mo31838xf() ? new shn(act, i, purchaseType) : new mgj(act, i, purchaseType);
    }

    /* JADX INFO: renamed from: c */
    public static grl m180840c(Act act, int i) {
        if (m180844g(i)) {
            return new goo(act, i);
        }
        return CoreModule.m30930K().mo31838xf() ? new p9n(act, i) : new pd5(act, i);
    }

    /* JADX INFO: renamed from: d */
    public static hrl m180841d(Act act, PurchaseType purchaseType) {
        return new ioo(act, purchaseType);
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC15610a<C8928d> m180842e(Act act, List<C8928d> list, z20<C8928d, Boolean> z20Var, int i) {
        return new oe5(act, list, z20Var, i);
    }

    /* JADX INFO: renamed from: f */
    public static hrl m180843f(Act act, int i) {
        return new le5(act, i);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m180844g(int i) {
        return 1 == i || 2 == i || 12 == i || 14 == i || 22 == i || 27 == i || 28 == i || 29 == i || 30 == i;
    }
}
