package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.PaymentData;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class yvd0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(final w2e0 w2e0Var, f30<String, String> f30Var) {
        if (TextUtils.equals(qib0.f154713b0.f139230a.userId(), m216203g(w2e0Var))) {
            CoreModule.f17545c.f19604S0.m34187w3().filter(new w9j() { // from class: l.wvd0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    PaymentData paymentData = (PaymentData) obj;
                    return Boolean.valueOf(paymentData.isCanUse(PaymentData.FROM_TEAM, paymentData.getCOutName()));
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.xvd0
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19604S0.m34189z3(w2e0Var.m201094b(), PaymentData.FROM_TEAM, true);
                }
            }));
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final String m216203g(w2e0 w2e0Var) {
        Map<String, String> mapM201098f = w2e0Var.m201098f();
        if (mapM201098f.containsKey(Oauth2AccessToken.KEY_UID)) {
            return mapM201098f.get(Oauth2AccessToken.KEY_UID);
        }
        return null;
    }
}
