package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class e8e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        abe0Var.m96739b().startActivity(xwa.m213325t(abe0Var.m96739b(), !TextUtils.isEmpty(abe0Var.m96744g()) ? abe0Var.m96744g().replaceFirst("/", "") : "see"));
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
