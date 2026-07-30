package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class t9e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        if (TextUtils.isEmpty(abe0Var.m96744g()) || !"recharge".equals(abe0Var.m96744g().replaceFirst("/", ""))) {
            return null;
        }
        return xwa.m213331z(abe0Var.m96739b());
    }
}
