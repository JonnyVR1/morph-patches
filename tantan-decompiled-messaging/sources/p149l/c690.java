package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.VipAct;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class c690 {
    /* JADX INFO: renamed from: a */
    public static int m105372a(PurchaseType purchaseType, boolean z, tab0 tab0Var) {
        int iM105375d;
        PurchaseType purchaseTypeM105373b = m105373b(purchaseType, z, tab0Var);
        if (purchaseTypeM105373b == null || (iM105375d = m105375d(purchaseTypeM105373b, tab0Var)) < 0) {
            return 0;
        }
        return iM105375d;
    }

    /* JADX INFO: renamed from: b */
    public static PurchaseType m105373b(PurchaseType purchaseType, boolean z, tab0 tab0Var) {
        PurchaseType purchaseTypeM105626b;
        PurchaseType purchaseTypeM105374c;
        ArrayList<PurchaseType> arrayListMo102549a = tab0Var.mo102549a();
        if (purchaseType != null && arrayListMo102549a != null && arrayListMo102549a.contains(purchaseType)) {
            return purchaseType;
        }
        if (z && (purchaseTypeM105374c = m105374c(arrayListMo102549a)) != null) {
            return purchaseTypeM105374c;
        }
        if (!c7r.m105630f() || (purchaseTypeM105626b = c7r.m105626b()) == null || arrayListMo102549a == null || !arrayListMo102549a.contains(purchaseTypeM105626b)) {
            return null;
        }
        return purchaseTypeM105626b;
    }

    /* JADX INFO: renamed from: c */
    public static PurchaseType m105374c(ArrayList<PurchaseType> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (CoreModule.f17545c.f19654j0.m30643y4()) {
                PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (arrayList.contains(purchaseType)) {
                    return purchaseType;
                }
            }
            if (CoreModule.f17545c.f19654j0.m30574B4()) {
                PurchaseType purchaseType2 = PurchaseType.TYPE_GET_VIP;
                if (arrayList.contains(purchaseType2)) {
                    return purchaseType2;
                }
            }
            if (CoreModule.f17545c.f19654j0.m30572A4()) {
                PurchaseType purchaseType3 = PurchaseType.TYPE_GET_LIKERS;
                if (arrayList.contains(purchaseType3)) {
                    return purchaseType3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static int m105375d(PurchaseType purchaseType, tab0 tab0Var) {
        ArrayList<PurchaseType> arrayListMo102549a;
        if (purchaseType == null || (arrayListMo102549a = tab0Var.mo102549a()) == null || arrayListMo102549a.isEmpty()) {
            return -1;
        }
        return arrayListMo102549a.indexOf(purchaseType);
    }

    /* JADX INFO: renamed from: e */
    public static void m105376e(Context context, String str, PurchaseType purchaseType, tab0 tab0Var) {
        m105377f(context, str, purchaseType, true, tab0Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m105377f(Context context, String str, PurchaseType purchaseType, boolean z, tab0 tab0Var) {
        if (context == null) {
            return;
        }
        PurchaseType purchaseTypeM105373b = m105373b(purchaseType, z, tab0Var);
        if (purchaseTypeM105373b != null) {
            context.startActivity(VipAct.m56243i2(context, str, purchaseTypeM105373b));
        } else if (u59.m191802K()) {
            context.startActivity(VipAct.m56240e2(context, str, 0));
        } else {
            context.startActivity(VipAct.m56239d2(context, str));
        }
    }
}
