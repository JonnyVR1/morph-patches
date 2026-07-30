package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;

/* JADX INFO: loaded from: classes9.dex */
public class x9e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        Privilege privilege;
        String str = abe0Var.m96743f().get("from");
        String str2 = abe0Var.m96743f().get("privilege");
        if (!s7a.m184997z()) {
            o1j0.m165651y("功能已下线");
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
        C8927c.m54607R0((Act) abe0Var.m96739b(), str, privilege, null, null, null, null);
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
