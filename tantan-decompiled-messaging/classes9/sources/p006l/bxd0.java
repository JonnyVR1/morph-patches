package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.data.NavigationCardIntent;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class bxd0 extends kxd0 {
    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        NavigationCardIntent navigationCardIntent;
        if (TextUtils.equals("/card", w2e0Var.m26161g())) {
            navigationCardIntent = NavigationCardIntent.get("cards");
        } else {
            navigationCardIntent = TextUtils.equals("/momentThemeCard", w2e0Var.m26161g()) ? NavigationCardIntent.get("moment_theme_card") : null;
        }
        return lva.m19028g(w2e0Var.m26156b(), navigationCardIntent, w2e0Var.m26160f());
    }
}
