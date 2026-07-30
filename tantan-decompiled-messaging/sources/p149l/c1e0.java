package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.breaking.SwapAnswerBottomSheetAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class c1e0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (y19.m212158R() && NullChecker.m81303a(w2e0Var.m201094b()) && (w2e0Var.m201094b() instanceof Act) && NullChecker.m81303a(w2e0Var.m201098f()) && !TextUtils.isEmpty(w2e0Var.m201098f().get("userId"))) {
            SwapAnswerBottomSheetAct.m44449D2((Act) w2e0Var.m201094b(), w2e0Var.m201098f().get("userId"), null);
        } else {
            lsi0.m151595y("功能已下线");
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
