package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;

/* JADX INFO: loaded from: classes9.dex */
public class xxd0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m201098f().get("url");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        w2e0Var.m201094b().startActivity(MkWebViewAct.m80239d2(w2e0Var.m201094b(), "", str, true, true, false, null));
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
