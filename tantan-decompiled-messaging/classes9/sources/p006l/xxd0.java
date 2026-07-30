package p006l;

import android.content.Intent;
import android.os.ResultReceiver;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class xxd0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m26160f().get("url");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        w2e0Var.m26156b().startActivity(MkWebViewAct.d2(w2e0Var.m26156b(), "", str, true, true, false, (ResultReceiver) null));
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
