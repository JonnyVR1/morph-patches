package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.RelationshipStatus;

/* JADX INFO: loaded from: classes9.dex */
public class e6e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        boolean z;
        String str = abe0Var.m96743f().get("userId");
        String str2 = abe0Var.m96743f().get("from");
        try {
            z = Boolean.parseBoolean(abe0Var.m96743f().get("showFollow"));
        } catch (Exception unused) {
            z = true;
        }
        boolean z2 = z;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ProfileAct.m51927w2(abe0Var.m96739b(), str, str2, false, false, false, RelationshipStatus.get("unknown_"), 273, false, true, false, z2);
    }
}
