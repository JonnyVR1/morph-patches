package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.NavigationIntent;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class jwd0 extends kxd0 {
    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (!TextUtils.isEmpty(w2e0Var.m26161g()) && "quickchat".equals(w2e0Var.m26161g().replaceFirst("/", ""))) {
            return lva.m19032k(w2e0Var.m26156b(), NavigationIntent.get("quickchat"));
        }
        if (w2e0Var.m26160f().size() > 0 && !TextUtils.isEmpty(w2e0Var.m26160f().get("publicId"))) {
            if (!TextUtils.equals(CoreModule.f1534c.f3628e0.m21490p9().publicId, w2e0Var.m26160f().get("publicId"))) {
                return lva.m19032k(w2e0Var.m26156b(), NavigationIntent.get("cards"));
            }
        }
        return lva.m19032k(w2e0Var.m26156b(), NavigationIntent.get("menu"));
    }
}
