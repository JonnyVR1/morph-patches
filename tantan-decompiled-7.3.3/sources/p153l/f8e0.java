package p153l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;

/* JADX INFO: loaded from: classes9.dex */
public class f8e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        if (rbb0.m180744q()) {
            CoreModule.m30933P().m143405a().mo34537l1((Act) abe0Var.m96739b(), "p_chat,assistant_quickchat");
        } else {
            abe0Var.m96739b().startActivity(LikersAct.m57727Y1(abe0Var.m96739b(), ""));
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
