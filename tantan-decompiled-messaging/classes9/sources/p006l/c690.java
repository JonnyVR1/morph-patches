package p006l;

import android.content.Context;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.VipAct;
import com.p1.mobile.putong.core.data.PurchaseType;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class c690 {
    /* JADX INFO: renamed from: a */
    public static int m13201a(PurchaseType purchaseType, boolean z, tab0 tab0Var) {
        int iM13204d;
        PurchaseType purchaseTypeM13202b = m13202b(purchaseType, z, tab0Var);
        if (purchaseTypeM13202b == null || (iM13204d = m13204d(purchaseTypeM13202b, tab0Var)) < 0) {
            return 0;
        }
        return iM13204d;
    }

    /* JADX INFO: renamed from: b */
    public static PurchaseType m13202b(PurchaseType purchaseType, boolean z, tab0 tab0Var) {
        PurchaseType purchaseTypeM13274b;
        PurchaseType purchaseTypeM13203c;
        ArrayList<PurchaseType> arrayListMo12826a = tab0Var.mo12826a();
        if (purchaseType != null && arrayListMo12826a != null && arrayListMo12826a.contains(purchaseType)) {
            return purchaseType;
        }
        if (z && (purchaseTypeM13203c = m13203c(arrayListMo12826a)) != null) {
            return purchaseTypeM13203c;
        }
        if (!c7r.m13278f() || (purchaseTypeM13274b = c7r.m13274b()) == null || arrayListMo12826a == null || !arrayListMo12826a.contains(purchaseTypeM13274b)) {
            return null;
        }
        return purchaseTypeM13274b;
    }

    /* JADX INFO: renamed from: c */
    public static PurchaseType m13203c(ArrayList<PurchaseType> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (CoreModule.f1534c.f3643j0.m2571y4()) {
                PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (arrayList.contains(purchaseType)) {
                    return purchaseType;
                }
            }
            if (CoreModule.f1534c.f3643j0.m2502B4()) {
                PurchaseType purchaseType2 = PurchaseType.TYPE_GET_VIP;
                if (arrayList.contains(purchaseType2)) {
                    return purchaseType2;
                }
            }
            if (CoreModule.f1534c.f3643j0.m2500A4()) {
                PurchaseType purchaseType3 = PurchaseType.TYPE_GET_LIKERS;
                if (arrayList.contains(purchaseType3)) {
                    return purchaseType3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static int m13204d(PurchaseType purchaseType, tab0 tab0Var) {
        ArrayList<PurchaseType> arrayListMo12826a;
        if (purchaseType == null || (arrayListMo12826a = tab0Var.mo12826a()) == null || arrayListMo12826a.isEmpty()) {
            return -1;
        }
        return arrayListMo12826a.indexOf(purchaseType);
    }

    /* JADX INFO: renamed from: e */
    public static void m13205e(Context context, String str, PurchaseType purchaseType, tab0 tab0Var) {
        m13206f(context, str, purchaseType, true, tab0Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m13206f(Context context, String str, PurchaseType purchaseType, boolean z, tab0 tab0Var) {
        if (context == null) {
            return;
        }
        PurchaseType purchaseTypeM13202b = m13202b(purchaseType, z, tab0Var);
        if (purchaseTypeM13202b != null) {
            context.startActivity(VipAct.m9676i2(context, str, purchaseTypeM13202b));
        } else if (u59.m24973K()) {
            context.startActivity(VipAct.m9673e2(context, str, 0));
        } else {
            context.startActivity(VipAct.m9672d2(context, str));
        }
    }
}
