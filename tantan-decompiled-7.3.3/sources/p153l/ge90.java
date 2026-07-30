package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.VipAct;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class ge90 {
    /* JADX INFO: renamed from: a */
    public static int m129967a(PurchaseType purchaseType, boolean z, xib0 xib0Var) {
        int iM129970d;
        PurchaseType purchaseTypeM129968b = m129968b(purchaseType, z, xib0Var);
        if (purchaseTypeM129968b == null || (iM129970d = m129970d(purchaseTypeM129968b, xib0Var)) < 0) {
            return 0;
        }
        return iM129970d;
    }

    /* JADX INFO: renamed from: b */
    public static PurchaseType m129968b(PurchaseType purchaseType, boolean z, xib0 xib0Var) {
        PurchaseType purchaseTypeM115091b;
        PurchaseType purchaseTypeM129969c;
        ArrayList<PurchaseType> arrayListMo127518a = xib0Var.mo127518a();
        if (purchaseType != null && arrayListMo127518a != null && arrayListMo127518a.contains(purchaseType)) {
            return purchaseType;
        }
        if (z && (purchaseTypeM129969c = m129969c(arrayListMo127518a)) != null) {
            return purchaseTypeM129969c;
        }
        if (!d9r.m115095f() || (purchaseTypeM115091b = d9r.m115091b()) == null || arrayListMo127518a == null || !arrayListMo127518a.contains(purchaseTypeM115091b)) {
            return null;
        }
        return purchaseTypeM115091b;
    }

    /* JADX INFO: renamed from: c */
    public static PurchaseType m129969c(ArrayList<PurchaseType> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (CoreModule.f18264c.f20396j0.m31646y4()) {
                PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
                if (arrayList.contains(purchaseType)) {
                    return purchaseType;
                }
            }
            if (CoreModule.f18264c.f20396j0.m31577B4()) {
                PurchaseType purchaseType2 = PurchaseType.TYPE_GET_VIP;
                if (arrayList.contains(purchaseType2)) {
                    return purchaseType2;
                }
            }
            if (CoreModule.f18264c.f20396j0.m31575A4()) {
                PurchaseType purchaseType3 = PurchaseType.TYPE_GET_LIKERS;
                if (arrayList.contains(purchaseType3)) {
                    return purchaseType3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static int m129970d(PurchaseType purchaseType, xib0 xib0Var) {
        ArrayList<PurchaseType> arrayListMo127518a;
        if (purchaseType == null || (arrayListMo127518a = xib0Var.mo127518a()) == null || arrayListMo127518a.isEmpty()) {
            return -1;
        }
        return arrayListMo127518a.indexOf(purchaseType);
    }

    /* JADX INFO: renamed from: e */
    public static void m129971e(Context context, String str, PurchaseType purchaseType, xib0 xib0Var) {
        m129972f(context, str, purchaseType, true, xib0Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m129972f(Context context, String str, PurchaseType purchaseType, boolean z, xib0 xib0Var) {
        if (context == null) {
            return;
        }
        PurchaseType purchaseTypeM129968b = m129968b(purchaseType, z, xib0Var);
        if (purchaseTypeM129968b != null) {
            context.startActivity(VipAct.m57426k2(context, str, purchaseTypeM129968b));
        } else if (d79.m114653L()) {
            context.startActivity(VipAct.m57423g2(context, str, 0));
        } else {
            context.startActivity(VipAct.m57422e2(context, str));
        }
    }
}
