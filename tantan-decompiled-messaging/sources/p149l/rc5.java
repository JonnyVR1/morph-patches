package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class rc5 {
    /* JADX INFO: renamed from: a */
    public static dac0<C8765d> m178786a(Act act, List<C8765d> list, f30<C8765d, Boolean> f30Var) {
        return new y5n(act, list, f30Var);
    }

    /* JADX INFO: renamed from: b */
    public static uol m178787b(Act act, int i, PurchaseType purchaseType) {
        if (m178792g(i)) {
            return new dmo(act, i, purchaseType);
        }
        return CoreModule.m29932K().mo30835xf() ? new sfn(act, i, purchaseType) : new sdj(act, i, purchaseType);
    }

    /* JADX INFO: renamed from: c */
    public static vol m178788c(Act act, int i) {
        if (m178792g(i)) {
            return new gmo(act, i);
        }
        return CoreModule.m29932K().mo30835xf() ? new p7n(act, i) : new pc5(act, i);
    }

    /* JADX INFO: renamed from: d */
    public static wol m178789d(Act act, PurchaseType purchaseType) {
        return new imo(act, purchaseType);
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC15503a<C8765d> m178790e(Act act, List<C8765d> list, f30<C8765d, Boolean> f30Var, int i) {
        return new od5(act, list, f30Var, i);
    }

    /* JADX INFO: renamed from: f */
    public static wol m178791f(Act act, int i) {
        return new ld5(act, i);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m178792g(int i) {
        return 1 == i || 2 == i || 12 == i || 14 == i || 22 == i || 27 == i || 28 == i || 29 == i || 30 == i;
    }
}
