package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import java.util.AbstractMap;
import java.util.Map;
import l.f30;
import l.vwb;
import l.w6p;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class oxd0 extends kxd0 {

    /* JADX INFO: renamed from: a */
    public static final Map<String, PurchaseType> f18473a = nxd0.m20256a(new Map.Entry[]{new AbstractMap.SimpleEntry("premium", PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE), new AbstractMap.SimpleEntry("ultraPremium", PurchaseType.TYPE_ULTRA_PREMIUM), new AbstractMap.SimpleEntry("vip", PurchaseType.TYPE_GET_VIP)});

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        Privilege privilegeValueOf;
        Act actM26156b = w2e0Var.m26156b();
        if (actM26156b == null) {
            return null;
        }
        String strReplaceFirst = TextUtils.isEmpty(w2e0Var.m26161g()) ? "premium" : w2e0Var.m26161g().replaceFirst("/", "");
        Map<String, String> mapM26160f = w2e0Var.m26160f();
        String str = TextUtils.isEmpty(mapM26160f.get("from")) ? "deeplink_intlPurchase" : mapM26160f.get("from");
        String str2 = mapM26160f.get("skuDuration");
        String str3 = mapM26160f.get("privilege");
        boolean zEqualsIgnoreCase = "true".equalsIgnoreCase(mapM26160f.get("autoPay"));
        PurchaseType orDefault = f18473a.getOrDefault(strReplaceFirst, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        if (TextUtils.isEmpty(str3)) {
            privilegeValueOf = null;
        } else {
            try {
                privilegeValueOf = Privilege.valueOf(str3);
            } catch (IllegalArgumentException unused) {
                privilegeValueOf = null;
            }
        }
        w6p.a aVarD = new w6p.a(actM26156b).i(vwb.f0(new PurchaseType[]{orDefault}), privilegeValueOf != null ? vwb.f0(new Privilege[]{privilegeValueOf}) : vwb.f0(new Privilege[0])).d(str);
        if (!TextUtils.isEmpty(str2)) {
            aVarD.c(str2);
        }
        if (zEqualsIgnoreCase) {
            aVarD.b(true);
        }
        aVarD.a().show();
        return null;
    }
}
