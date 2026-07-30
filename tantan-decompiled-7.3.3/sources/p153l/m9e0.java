package p153l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;

/* JADX INFO: loaded from: classes9.dex */
public class m9e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        int i;
        String str = abe0Var.m96743f().get("userId");
        boolean zEquals = TextUtils.equals(abe0Var.m96743f().get("follow"), "1");
        boolean zEquals2 = TextUtils.equals(abe0Var.m96743f().get(BLivePkInviteSource.query), "christmas");
        TextUtils.equals(abe0Var.m96743f().get("shouldHideToolbarButton"), "true");
        String str2 = abe0Var.m96743f().get(Reason.TYPE);
        String str3 = abe0Var.m96743f().get("tag");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return ProfileAct.m51927w2(abe0Var.m96739b(), str, zEquals2 ? "from_christmas" : "team_account", false, false, false, RelationshipStatus.get("unknown_"), 273, false, true, false, zEquals);
        }
        if (!xwa.m213303C(str)) {
            return null;
        }
        try {
            i = Integer.parseInt(str2);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        int i2 = i;
        Context contextM96739b = abe0Var.m96739b();
        RelationshipStatus relationshipStatus = RelationshipStatus.get("unknown_");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return ProfileAct.m51928y2(contextM96739b, str, "push_like", true, false, false, relationshipStatus, 273, false, true, false, false, i2, str3);
    }
}
