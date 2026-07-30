package p006l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p004ui.vip.likers.LikersAct;
import com.p1.mobile.putong.data.NavigationIntent;
import l.f30;
import l.n3b0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class pyd0 extends kxd0 {
    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return n3b0.q() ? lva.m19032k(w2e0Var.m26156b(), NavigationIntent.get("seeLikes")) : LikersAct.m9986X1(w2e0Var.m26156b(), "");
    }
}
