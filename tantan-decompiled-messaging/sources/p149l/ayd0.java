package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.RelationshipStatus;

/* JADX INFO: loaded from: classes9.dex */
public class ayd0 extends kxd0 {
    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        boolean z;
        String str = w2e0Var.m201098f().get("userId");
        String str2 = w2e0Var.m201098f().get("from");
        try {
            z = Boolean.parseBoolean(w2e0Var.m201098f().get("showFollow"));
        } catch (Exception unused) {
            z = true;
        }
        boolean z2 = z;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ProfileAct.m50743v2(w2e0Var.m201094b(), str, str2, false, false, false, RelationshipStatus.get("unknown_"), 273, false, true, false, z2);
    }
}
