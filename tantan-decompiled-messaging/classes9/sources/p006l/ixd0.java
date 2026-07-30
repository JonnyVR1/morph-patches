package p006l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.data.NavigationIntent;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ixd0 extends kxd0 {
    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        if ("pettune".equals(w2e0Var.m26158d()) || "sportsman".equals(w2e0Var.m26158d()) || "trip".equals(w2e0Var.m26158d())) {
            return lva.m19032k(w2e0Var.m26156b(), NavigationIntent.get("intl_operating_pet"));
        }
        if ("intl520".equals(w2e0Var.m26158d())) {
            return lva.m19032k(w2e0Var.m26156b(), NavigationIntent.get("intl_similar_interests"));
        }
        if ("campingactivity".equals(w2e0Var.m26158d())) {
            return lva.m19032k(w2e0Var.m26156b(), NavigationIntent.get("intl_camping"));
        }
        if (!"regular_main_popup".equals(w2e0Var.m26158d())) {
            return null;
        }
        return lva.m19032k(w2e0Var.m26156b(), NavigationIntent.get("regular_main_popup"));
    }
}
