package p006l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.likers.LikersAct;
import com.p1.mobile.android.app.Act;
import l.f30;
import l.n3b0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class b0e0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (n3b0.q()) {
            CoreModule.m1854P().m11706a().m5471l1((Act) w2e0Var.m26156b(), "p_chat,assistant_quickchat");
        } else {
            w2e0Var.m26156b().startActivity(LikersAct.m9986X1(w2e0Var.m26156b(), ""));
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
