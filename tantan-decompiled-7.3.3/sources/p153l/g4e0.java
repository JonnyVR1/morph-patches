package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;

/* JADX INFO: loaded from: classes9.dex */
public class g4e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        if (TextUtils.equals("coin", !TextUtils.isEmpty(abe0Var.m96744g()) ? abe0Var.m96744g().replaceFirst("/", "") : null)) {
            sfj0.m185596c("e_assistant_recharge_message", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
            new fe5.C16962e((Act) abe0Var.m96739b()).m125281j(PurchaseType.TYPE_INTL_TTT_COIN).m125275d("p_assistant_message,e_assistant_recharge_message,click").m125283l();
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
