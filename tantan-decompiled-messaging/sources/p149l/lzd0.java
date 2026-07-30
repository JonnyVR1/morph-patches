package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class lzd0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        w2e0Var.m201094b().startActivity(lva.m151868x(w2e0Var.m201094b(), !TextUtils.isEmpty(w2e0Var.m201099g()) ? w2e0Var.m201099g().replaceFirst("/", "") : "quickchat", "p_privilege,assistant_guide"));
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
