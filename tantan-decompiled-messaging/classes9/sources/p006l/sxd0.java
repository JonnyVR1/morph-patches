package p006l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.data.NavigationIntent;
import com.tantanapp.common.utils.NullChecker;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class sxd0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (NullChecker.a(w2e0Var.m26156b()) && (w2e0Var.m26156b() instanceof Act)) {
            w2e0Var.m26156b().startActivity(NewMainAct.I5(w2e0Var.m26156b(), NavigationIntent.get("intlTribe")));
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
