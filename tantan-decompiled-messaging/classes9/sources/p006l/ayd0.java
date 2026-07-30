package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.RelationshipStatus;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ayd0 extends kxd0 {
    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        boolean z;
        String str = w2e0Var.m26160f().get("userId");
        String str2 = w2e0Var.m26160f().get("from");
        try {
            z = Boolean.parseBoolean(w2e0Var.m26160f().get("showFollow"));
        } catch (Exception unused) {
            z = true;
        }
        boolean z2 = z;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ProfileAct.v2(w2e0Var.m26156b(), str, str2, false, false, false, RelationshipStatus.get("unknown_"), 273, false, true, false, z2);
    }
}
