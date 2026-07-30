package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.data.NavigationIntent;

/* JADX INFO: loaded from: classes9.dex */
public class s1e0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    private Intent m181959e(w2e0 w2e0Var, String str, String str2, boolean z, boolean z2, boolean z3) {
        Intent intentM39685I5 = NewMainAct.m39685I5(w2e0Var.m201094b(), NavigationIntent.get("webview"));
        intentM39685I5.putExtra("webview_url", str);
        intentM39685I5.putExtra("webview_title", str2);
        intentM39685I5.putExtra("hideNavigationBar", z);
        intentM39685I5.putExtra("hardwareAccelerated", z2);
        intentM39685I5.putExtra("useMkWebview", z3);
        return intentM39685I5;
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        super.mo94421a(w2e0Var, f30Var);
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m201098f().get("title");
        String strM172394g = q1e0.m172394g(w2e0Var.m201098f().get("url"), w2e0Var);
        if (TextUtils.isEmpty(strM172394g)) {
            return null;
        }
        return j2e0.m139444k() ? lva.m151841B(w2e0Var.m201094b(), strM172394g) : m181959e(w2e0Var, strM172394g, str, true, true, true);
    }
}
