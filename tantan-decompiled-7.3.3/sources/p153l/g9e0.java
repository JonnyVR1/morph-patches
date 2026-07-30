package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.breaking.SwapAnswerBottomSheetAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class g9e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        if (h39.m133429R() && NullChecker.m82486a(abe0Var.m96739b()) && (abe0Var.m96739b() instanceof Act) && NullChecker.m82486a(abe0Var.m96743f()) && !TextUtils.isEmpty(abe0Var.m96743f().get("userId"))) {
            SwapAnswerBottomSheetAct.m45633E2((Act) abe0Var.m96739b(), abe0Var.m96743f().get("userId"), null);
        } else {
            o1j0.m165651y("功能已下线");
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
