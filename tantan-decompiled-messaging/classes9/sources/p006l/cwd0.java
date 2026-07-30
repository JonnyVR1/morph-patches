package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.data.PurchaseType;
import l.f30;
import l.fd5;
import l.o6j0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class cwd0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (TextUtils.equals("coin", !TextUtils.isEmpty(w2e0Var.m26161g()) ? w2e0Var.m26161g().replaceFirst("/", "") : null)) {
            o6j0.c("e_assistant_recharge_message", "p_chat_view", new o6j0.a[0]);
            new fd5.e(w2e0Var.m26156b()).j(PurchaseType.TYPE_INTL_TTT_COIN).d("p_assistant_message,e_assistant_recharge_message,click").l();
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
