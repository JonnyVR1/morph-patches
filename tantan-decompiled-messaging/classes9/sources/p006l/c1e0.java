package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.breaking.SwapAnswerBottomSheetAct;
import com.tantanapp.common.utils.NullChecker;
import l.f30;
import l.lsi0;
import l.y19;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class c1e0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (y19.R() && NullChecker.a(w2e0Var.m26156b()) && (w2e0Var.m26156b() instanceof Act) && NullChecker.a(w2e0Var.m26160f()) && !TextUtils.isEmpty(w2e0Var.m26160f().get("userId"))) {
            SwapAnswerBottomSheetAct.D2(w2e0Var.m26156b(), w2e0Var.m26160f().get("userId"), (String) null);
        } else {
            lsi0.y("功能已下线");
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
