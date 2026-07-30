package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.NavigationCardIntent;

/* JADX INFO: loaded from: classes9.dex */
public class bxd0 extends kxd0 {
    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        NavigationCardIntent navigationCardIntent;
        if (TextUtils.equals("/card", w2e0Var.m201099g())) {
            navigationCardIntent = NavigationCardIntent.get("cards");
        } else {
            navigationCardIntent = TextUtils.equals("/momentThemeCard", w2e0Var.m201099g()) ? NavigationCardIntent.get(NavigationCardIntent.moment_theme_card) : null;
        }
        return lva.m151851g(w2e0Var.m201094b(), navigationCardIntent, w2e0Var.m201098f());
    }
}
