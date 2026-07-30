package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.data.NavigationIntent;

/* JADX INFO: loaded from: classes9.dex */
public class cyd0 extends kxd0 {
    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (u59.m191823d0() && TextUtils.equals("jumpTab", w2e0Var.m201099g().replaceFirst("/", ""))) {
            return NewMainAct.m39690K5(w2e0Var.m201094b(), NavigationIntent.get("loveBuzz"), null, w2e0Var.m201098f());
        }
        return null;
    }
}
