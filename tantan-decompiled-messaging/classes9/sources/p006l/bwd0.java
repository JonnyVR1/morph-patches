package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.putong.data.PaymentData;
import com.p1.mobile.putong.ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import l.e30;
import l.f30;
import l.mkd0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class bwd0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m12936e(w2e0 w2e0Var, Boolean bool) {
        if (bool.booleanValue()) {
            String strM12938g = m12938g(w2e0Var);
            if (NullChecker.a(strM12938g)) {
                Intent intentZ1 = AccessTokenWebViewAct.Z1(w2e0Var.m26156b(), w2e0Var.m26156b().getString(R$string.f2214Vs), strM12938g);
                intentZ1.setFlags(268435456);
                w2e0Var.m26156b().startActivity(intentZ1);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private static String m12938g(w2e0 w2e0Var) {
        Map<String, String> mapM26160f = w2e0Var.m26160f();
        String str = mapM26160f.get("url");
        if (!NullChecker.a(str)) {
            return null;
        }
        if (str.contains("#")) {
            return str.replaceFirst("&", "?");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("?");
        for (Map.Entry<String, String> entry : mapM26160f.entrySet()) {
            if (!TextUtils.equals(entry.getKey(), "url")) {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append("&");
            }
        }
        return sb.toString();
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(final w2e0 w2e0Var, f30<String, String> f30Var) {
        CoreModule.f1534c.f3593S0.m6124w3().map(new w9j() { // from class: l.zvd0
            public final Object call(Object obj) {
                PaymentData paymentData = (PaymentData) obj;
                return Boolean.valueOf(paymentData.isCanUse("pay_result", paymentData.getCodaName()) || paymentData.isCanUse("pay_result", paymentData.getCOutName()));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.awd0
            public final void call(Object obj) {
                bwd0.m12936e(w2e0Var, (Boolean) obj);
            }
        }));
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
