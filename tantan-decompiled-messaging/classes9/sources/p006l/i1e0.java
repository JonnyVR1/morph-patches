package p006l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.RelationshipStatus;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class i1e0 extends kxd0 {
    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        int i;
        String str = w2e0Var.m26160f().get("userId");
        boolean zEquals = TextUtils.equals(w2e0Var.m26160f().get("follow"), "1");
        boolean zEquals2 = TextUtils.equals(w2e0Var.m26160f().get("query"), "christmas");
        TextUtils.equals(w2e0Var.m26160f().get("shouldHideToolbarButton"), "true");
        String str2 = w2e0Var.m26160f().get("reason");
        String str3 = w2e0Var.m26160f().get("tag");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return ProfileAct.v2(w2e0Var.m26156b(), str, zEquals2 ? "from_christmas" : "team_account", false, false, false, RelationshipStatus.get("unknown_"), 273, false, true, false, zEquals);
        }
        if (!lva.m19019C(str)) {
            return null;
        }
        try {
            i = Integer.parseInt(str2);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        int i2 = i;
        Context contextM26156b = w2e0Var.m26156b();
        RelationshipStatus relationshipStatus = RelationshipStatus.get("unknown_");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return ProfileAct.w2(contextM26156b, str, "push_like", true, false, false, relationshipStatus, 273, false, true, false, false, i2, str3);
    }
}
