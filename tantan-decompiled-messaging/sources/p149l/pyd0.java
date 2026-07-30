package p149l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.data.NavigationIntent;

/* JADX INFO: loaded from: classes9.dex */
public class pyd0 extends kxd0 {
    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return n3b0.m157742q() ? lva.m151855k(w2e0Var.m201094b(), NavigationIntent.get("seeLikes")) : LikersAct.m56544X1(w2e0Var.m201094b(), "");
    }
}
