package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;

/* JADX INFO: loaded from: classes9.dex */
public class t1e0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        Privilege privilege;
        String str = w2e0Var.m201098f().get("from");
        String str2 = w2e0Var.m201098f().get("privilege");
        if (!g6a.m124577z()) {
            lsi0.m151595y("功能已下线");
            return;
        }
        if (TextUtils.equals(str2, "roamingLocation")) {
            privilege = Privilege.youth_roaming;
        } else if (TextUtils.equals(str2, "findPartner")) {
            privilege = Privilege.youth_find_partner;
        } else if (TextUtils.equals(str2, "blindBox")) {
            privilege = Privilege.youth_blind_box;
        } else if (TextUtils.equals(str2, "superlike")) {
            privilege = Privilege.youth_superlike;
        } else {
            privilege = TextUtils.equals(str2, "messageReadStatus") ? Privilege.youth_message_read : Privilege.youth_roaming;
        }
        C8764c.m53424R0((Act) w2e0Var.m201094b(), str, privilege, null, null, null, null);
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
