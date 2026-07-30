package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.PaymentData;
import java.util.Map;
import l.e30;
import l.f30;
import l.mkd0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class zwd0 extends kxd0 {
    /* JADX INFO: renamed from: g */
    private String m28840g(w2e0 w2e0Var) {
        Map<String, String> mapM26160f = w2e0Var.m26160f();
        if (mapM26160f.containsKey("uid")) {
            return mapM26160f.get("uid");
        }
        return null;
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(final w2e0 w2e0Var, f30<String, String> f30Var) {
        if (TextUtils.equals(qib0.f19804b0.f17706a.userId(), m28840g(w2e0Var))) {
            CoreModule.f1534c.f3593S0.m6124w3().filter(new w9j() { // from class: l.xwd0
                public final Object call(Object obj) {
                    PaymentData paymentData = (PaymentData) obj;
                    return Boolean.valueOf(paymentData.isCanUse("tantan_assistant", paymentData.getCodaName()));
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.ywd0
                public final void call(Object obj) {
                    CoreModule.f1534c.f3593S0.m6126z3(w2e0Var.m26156b(), "tantan_assistant", false);
                }
            }));
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
