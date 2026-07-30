package p149l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;

/* JADX INFO: loaded from: classes9.dex */
public class i1e0 extends kxd0 {
    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        int i;
        String str = w2e0Var.m201098f().get("userId");
        boolean zEquals = TextUtils.equals(w2e0Var.m201098f().get("follow"), "1");
        boolean zEquals2 = TextUtils.equals(w2e0Var.m201098f().get(BLivePkInviteSource.query), "christmas");
        TextUtils.equals(w2e0Var.m201098f().get("shouldHideToolbarButton"), "true");
        String str2 = w2e0Var.m201098f().get(Reason.TYPE);
        String str3 = w2e0Var.m201098f().get("tag");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return ProfileAct.m50743v2(w2e0Var.m201094b(), str, zEquals2 ? "from_christmas" : "team_account", false, false, false, RelationshipStatus.get("unknown_"), 273, false, true, false, zEquals);
        }
        if (!lva.m151842C(str)) {
            return null;
        }
        try {
            i = Integer.parseInt(str2);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        int i2 = i;
        Context contextM201094b = w2e0Var.m201094b();
        RelationshipStatus relationshipStatus = RelationshipStatus.get("unknown_");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return ProfileAct.m50744w2(contextM201094b, str, "push_like", true, false, false, relationshipStatus, 273, false, true, false, false, i2, str3);
    }
}
