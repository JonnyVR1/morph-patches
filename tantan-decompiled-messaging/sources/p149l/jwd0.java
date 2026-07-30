package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.NavigationIntent;

/* JADX INFO: loaded from: classes9.dex */
public class jwd0 extends kxd0 {
    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (!TextUtils.isEmpty(w2e0Var.m201099g()) && "quickchat".equals(w2e0Var.m201099g().replaceFirst("/", ""))) {
            return lva.m151855k(w2e0Var.m201094b(), NavigationIntent.get("quickchat"));
        }
        if (w2e0Var.m201098f().size() > 0 && !TextUtils.isEmpty(w2e0Var.m201098f().get("publicId"))) {
            if (!TextUtils.equals(CoreModule.f17545c.f19639e0.m169527p9().publicId, w2e0Var.m201098f().get("publicId"))) {
                return lva.m151855k(w2e0Var.m201094b(), NavigationIntent.get("cards"));
            }
        }
        return lva.m151855k(w2e0Var.m201094b(), NavigationIntent.get(NavigationIntent.menu));
    }
}
