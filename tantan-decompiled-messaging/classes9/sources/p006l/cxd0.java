package p006l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.data.NavigationCardIntent;
import com.p1.mobile.putong.data.NavigationIntent;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class cxd0 extends kxd0 {
    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return NewMainAct.K5(w2e0Var.m26156b(), NavigationIntent.get("cards"), NavigationCardIntent.get("wanwan"), w2e0Var.m26160f());
    }
}
