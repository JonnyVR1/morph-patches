package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.NavigationCardIntent;

/* JADX INFO: loaded from: classes9.dex */
public class f5e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        NavigationCardIntent navigationCardIntent;
        if (TextUtils.equals("/card", abe0Var.m96744g())) {
            navigationCardIntent = NavigationCardIntent.get("cards");
        } else {
            navigationCardIntent = TextUtils.equals("/momentThemeCard", abe0Var.m96744g()) ? NavigationCardIntent.get(NavigationCardIntent.moment_theme_card) : null;
        }
        return xwa.m213312g(abe0Var.m96739b(), navigationCardIntent, abe0Var.m96743f());
    }
}
