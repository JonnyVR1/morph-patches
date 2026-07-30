package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.PaymentData;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class bwd0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m104151e(w2e0 w2e0Var, Boolean bool) {
        if (bool.booleanValue()) {
            String strM104153g = m104153g(w2e0Var);
            if (NullChecker.m81303a(strM104153g)) {
                Intent intentM80150Z1 = AccessTokenWebViewAct.m80150Z1(w2e0Var.m201094b(), w2e0Var.m201094b().getString(R$string.f18225Vs), strM104153g);
                intentM80150Z1.setFlags(268435456);
                w2e0Var.m201094b().startActivity(intentM80150Z1);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private static String m104153g(w2e0 w2e0Var) {
        Map<String, String> mapM201098f = w2e0Var.m201098f();
        String str = mapM201098f.get("url");
        if (!NullChecker.m81303a(str)) {
            return null;
        }
        if (str.contains("#")) {
            return str.replaceFirst("&", "?");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("?");
        for (Map.Entry<String, String> entry : mapM201098f.entrySet()) {
            if (!TextUtils.equals(entry.getKey(), "url")) {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append("&");
            }
        }
        return sb.toString();
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(final w2e0 w2e0Var, f30<String, String> f30Var) {
        CoreModule.f17545c.f19604S0.m34187w3().map(new w9j() { // from class: l.zvd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                PaymentData paymentData = (PaymentData) obj;
                return Boolean.valueOf(paymentData.isCanUse(PaymentData.FROM_RESULT, paymentData.getCodaName()) || paymentData.isCanUse(PaymentData.FROM_RESULT, paymentData.getCOutName()));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.awd0
            @Override // p149l.e30
            public final void call(Object obj) {
                bwd0.m104151e(w2e0Var, (Boolean) obj);
            }
        }));
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
