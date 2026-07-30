package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;

/* JADX INFO: loaded from: classes9.dex */
public class b6e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        String str = abe0Var.m96743f().get("url");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        abe0Var.m96739b().startActivity(MkWebViewAct.m81422e2(abe0Var.m96739b(), "", str, true, true, false, null));
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
