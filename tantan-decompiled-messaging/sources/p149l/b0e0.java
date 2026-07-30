package p149l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;

/* JADX INFO: loaded from: classes9.dex */
public class b0e0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (n3b0.m157742q()) {
            CoreModule.m29935P().m94651a().mo33534l1((Act) w2e0Var.m201094b(), "p_chat,assistant_quickchat");
        } else {
            w2e0Var.m201094b().startActivity(LikersAct.m56544X1(w2e0Var.m201094b(), ""));
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
