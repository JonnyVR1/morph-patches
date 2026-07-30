package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.ui.purchase.c;
import l.d30;
import l.e30;
import l.f30;
import l.lsi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class t1e0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        Privilege privilege;
        String str = w2e0Var.m26160f().get("from");
        String str2 = w2e0Var.m26160f().get("privilege");
        if (!g6a.m15603z()) {
            lsi0.y("功能已下线");
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
        c.R0(w2e0Var.m26156b(), str, privilege, (e30) null, (d30) null, (d30) null, (d30) null);
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
