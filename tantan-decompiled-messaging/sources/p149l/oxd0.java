package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class oxd0 extends kxd0 {

    /* JADX INFO: renamed from: a */
    public static final Map<String, PurchaseType> f146199a = nxd0.m161943a(new Map.Entry[]{new AbstractMap.SimpleEntry("premium", PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE), new AbstractMap.SimpleEntry(SummarizedPrivilegesId.ultraPremium, PurchaseType.TYPE_ULTRA_PREMIUM), new AbstractMap.SimpleEntry("vip", PurchaseType.TYPE_GET_VIP)});

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        Privilege privilegeValueOf;
        Act act = (Act) w2e0Var.m201094b();
        if (act == null) {
            return null;
        }
        String strReplaceFirst = TextUtils.isEmpty(w2e0Var.m201099g()) ? "premium" : w2e0Var.m201099g().replaceFirst("/", "");
        Map<String, String> mapM201098f = w2e0Var.m201098f();
        String str = TextUtils.isEmpty(mapM201098f.get("from")) ? "deeplink_intlPurchase" : mapM201098f.get("from");
        String str2 = mapM201098f.get("skuDuration");
        String str3 = mapM201098f.get("privilege");
        boolean zEqualsIgnoreCase = "true".equalsIgnoreCase(mapM201098f.get("autoPay"));
        PurchaseType orDefault = f146199a.getOrDefault(strReplaceFirst, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        if (TextUtils.isEmpty(str3)) {
            privilegeValueOf = null;
        } else {
            try {
                privilegeValueOf = Privilege.valueOf(str3);
            } catch (IllegalArgumentException unused) {
                privilegeValueOf = null;
            }
        }
        w6p.C20813a c20813aM201948d = new w6p.C20813a(act).m201953i(vwb.m200324f0(orDefault), privilegeValueOf != null ? vwb.m200324f0(privilegeValueOf) : vwb.m200324f0(new Privilege[0])).m201948d(str);
        if (!TextUtils.isEmpty(str2)) {
            c20813aM201948d.m201947c(str2);
        }
        if (zEqualsIgnoreCase) {
            c20813aM201948d.m201946b(true);
        }
        c20813aM201948d.m201945a().show();
        return null;
    }
}
