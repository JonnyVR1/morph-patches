package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class b9e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        if (TextUtils.isEmpty(abe0Var.m96743f().get("identifier")) || TextUtils.isEmpty(abe0Var.m96743f().get("id"))) {
            return null;
        }
        Intent intentM213314i = xwa.m213314i(abe0Var.m96739b(), abe0Var.m96740c());
        intentM213314i.putExtra("oms_id", abe0Var.m96743f().get("id"));
        intentM213314i.putExtra("oms_identifier", abe0Var.m96743f().get("identifier"));
        return intentM213314i;
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
    }
}
