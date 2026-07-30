package p006l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class hzd0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        super.mo11681a(w2e0Var, f30Var);
        Map<String, String> mapM26160f = w2e0Var.m26160f();
        if (NullChecker.a(mapM26160f) && !mapM26160f.isEmpty() && (mapM26160f instanceof HashMap) && TextUtils.equals(mapM26160f.get("action"), "signature") && (w2e0Var.m26156b() instanceof Activity)) {
            ((Activity) w2e0Var.m26156b()).finish();
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        Map<String, String> mapM26160f = w2e0Var.m26160f();
        if (!NullChecker.a(mapM26160f) || mapM26160f.isEmpty() || !(mapM26160f instanceof HashMap)) {
            return ProfileAct.p2(w2e0Var.m26156b(), CoreModule.m1850H().userId(), "", false, true);
        }
        Intent intentP2 = ProfileAct.p2(w2e0Var.m26156b(), CoreModule.m1850H().userId(), "", false, true);
        intentP2.putExtra("params_extra_map_data", (HashMap) mapM26160f);
        return intentP2;
    }
}
