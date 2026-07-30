package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.OMSDialogPositon;

/* JADX INFO: loaded from: classes9.dex */
public class cwd0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (TextUtils.equals("coin", !TextUtils.isEmpty(w2e0Var.m201099g()) ? w2e0Var.m201099g().replaceFirst("/", "") : null)) {
            o6j0.m162859c("e_assistant_recharge_message", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
            new fd5.C16808e((Act) w2e0Var.m201094b()).m120958j(PurchaseType.TYPE_INTL_TTT_COIN).m120952d("p_assistant_message,e_assistant_recharge_message,click").m120960l();
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
