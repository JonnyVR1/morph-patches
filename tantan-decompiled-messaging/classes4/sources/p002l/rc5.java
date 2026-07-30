package p002l;

import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import java.util.List;
import l.a;
import l.dac0;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rc5 {
    /* JADX INFO: renamed from: a */
    public static dac0<C0190d> m21898a(Act act, List<C0190d> list, f30<C0190d, Boolean> f30Var) {
        return new y5n(act, list, f30Var);
    }

    /* JADX INFO: renamed from: b */
    public static uol m21899b(Act act, int i, PurchaseType purchaseType) {
        if (m21904g(i)) {
            return new dmo(act, i, purchaseType);
        }
        return CoreModule.K().xf() ? new sfn(act, i, purchaseType) : new sdj(act, i, purchaseType);
    }

    /* JADX INFO: renamed from: c */
    public static vol m21900c(Act act, int i) {
        if (m21904g(i)) {
            return new gmo(act, i);
        }
        return CoreModule.K().xf() ? new p7n(act, i) : new pc5(act, i);
    }

    /* JADX INFO: renamed from: d */
    public static wol m21901d(Act act, PurchaseType purchaseType) {
        return new imo(act, purchaseType);
    }

    /* JADX INFO: renamed from: e */
    public static a<C0190d> m21902e(Act act, List<C0190d> list, f30<C0190d, Boolean> f30Var, int i) {
        return new od5(act, list, f30Var, i);
    }

    /* JADX INFO: renamed from: f */
    public static wol m21903f(Act act, int i) {
        return new ld5(act, i);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m21904g(int i) {
        return 1 == i || 2 == i || 12 == i || 14 == i || 22 == i || 27 == i || 28 == i || 29 == i || 30 == i;
    }
}
