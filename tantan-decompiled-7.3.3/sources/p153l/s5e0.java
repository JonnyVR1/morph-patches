package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class s5e0 extends o5e0 {

    /* JADX INFO: renamed from: a */
    public static final Map<String, PurchaseType> f166355a = r5e0.m179863a(new Map.Entry[]{new AbstractMap.SimpleEntry("premium", PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE), new AbstractMap.SimpleEntry(SummarizedPrivilegesId.ultraPremium, PurchaseType.TYPE_ULTRA_PREMIUM), new AbstractMap.SimpleEntry("vip", PurchaseType.TYPE_GET_VIP)});

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        Privilege privilegeValueOf;
        Act act = (Act) abe0Var.m96739b();
        if (act == null) {
            return null;
        }
        String strReplaceFirst = TextUtils.isEmpty(abe0Var.m96744g()) ? "premium" : abe0Var.m96744g().replaceFirst("/", "");
        Map<String, String> mapM96743f = abe0Var.m96743f();
        String str = TextUtils.isEmpty(mapM96743f.get("from")) ? "deeplink_intlPurchase" : mapM96743f.get("from");
        String str2 = mapM96743f.get("skuDuration");
        String str3 = mapM96743f.get("privilege");
        boolean zEqualsIgnoreCase = "true".equalsIgnoreCase(mapM96743f.get("autoPay"));
        PurchaseType orDefault = f166355a.getOrDefault(strReplaceFirst, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        if (TextUtils.isEmpty(str3)) {
            privilegeValueOf = null;
        } else {
            try {
                privilegeValueOf = Privilege.valueOf(str3);
            } catch (IllegalArgumentException unused) {
                privilegeValueOf = null;
            }
        }
        w8p.C21047a c21047aM205515d = new w8p.C21047a(act).m205520i(jyb.m147507f0(orDefault), privilegeValueOf != null ? jyb.m147507f0(privilegeValueOf) : jyb.m147507f0(new Privilege[0])).m205515d(str);
        if (!TextUtils.isEmpty(str2)) {
            c21047aM205515d.m205514c(str2);
        }
        if (zEqualsIgnoreCase) {
            c21047aM205515d.m205513b(true);
        }
        c21047aM205515d.m205512a().show();
        return null;
    }
}
