package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.data.NavigationIntent;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class k0e0 extends kxd0 {
    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        NavigationIntent navigationIntent = NavigationIntent.get("setting");
        if (!TextUtils.isEmpty(w2e0Var.m26161g()) && "chooselocation".equals(w2e0Var.m26161g().replaceFirst("/", ""))) {
            navigationIntent = NavigationIntent.get("setting_chooselocation");
        }
        return lva.m19032k(w2e0Var.m26156b(), navigationIntent);
    }
}
