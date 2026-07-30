package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.PaymentData;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class c4e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(final abe0 abe0Var, z20<String, String> z20Var) {
        if (TextUtils.equals(uqb0.f180396b0.f170324a.userId(), m107868g(abe0Var))) {
            CoreModule.f18264c.f20346S0.m35190w3().filter(new qcj() { // from class: l.a4e0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    PaymentData paymentData = (PaymentData) obj;
                    return Boolean.valueOf(paymentData.isCanUse(PaymentData.FROM_TEAM, paymentData.getCOutName()));
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.b4e0
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20346S0.m35192z3(abe0Var.m96739b(), PaymentData.FROM_TEAM, true);
                }
            }));
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final String m107868g(abe0 abe0Var) {
        Map<String, String> mapM96743f = abe0Var.m96743f();
        if (mapM96743f.containsKey(Oauth2AccessToken.KEY_UID)) {
            return mapM96743f.get(Oauth2AccessToken.KEY_UID);
        }
        return null;
    }
}
