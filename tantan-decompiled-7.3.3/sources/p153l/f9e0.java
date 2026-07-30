package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class f9e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        String strReplaceFirst = !TextUtils.isEmpty(abe0Var.m96744g()) ? abe0Var.m96744g().replaceFirst("/", "") : "svip";
        return xwa.m213327v(abe0Var.m96739b(), strReplaceFirst, TextUtils.equals("see", strReplaceFirst) ? "p_privilege,assistant_see" : "p_privilege,assistant_guide");
    }
}
