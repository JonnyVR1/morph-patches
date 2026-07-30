package p149l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.SchemeKey;

/* JADX INFO: loaded from: classes9.dex */
public class ixd0 extends kxd0 {
    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (SchemeKey.pettune.equals(w2e0Var.m201096d()) || SchemeKey.sportsman.equals(w2e0Var.m201096d()) || "trip".equals(w2e0Var.m201096d())) {
            return lva.m151855k(w2e0Var.m201094b(), NavigationIntent.get(NavigationIntent.intl_operating_pet));
        }
        if (SchemeKey.intl520.equals(w2e0Var.m201096d())) {
            return lva.m151855k(w2e0Var.m201094b(), NavigationIntent.get(NavigationIntent.intl_similar_interests));
        }
        if (SchemeKey.campingactivity.equals(w2e0Var.m201096d())) {
            return lva.m151855k(w2e0Var.m201094b(), NavigationIntent.get(NavigationIntent.intl_camping));
        }
        if (!"regular_main_popup".equals(w2e0Var.m201096d())) {
            return null;
        }
        return lva.m151855k(w2e0Var.m201094b(), NavigationIntent.get("regular_main_popup"));
    }
}
