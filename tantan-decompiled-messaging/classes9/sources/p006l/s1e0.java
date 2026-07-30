package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.data.NavigationIntent;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class s1e0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    private Intent m23483e(w2e0 w2e0Var, String str, String str2, boolean z, boolean z2, boolean z3) {
        Intent intentI5 = NewMainAct.I5(w2e0Var.m26156b(), NavigationIntent.get("webview"));
        intentI5.putExtra("webview_url", str);
        intentI5.putExtra("webview_title", str2);
        intentI5.putExtra("hideNavigationBar", z);
        intentI5.putExtra("hardwareAccelerated", z2);
        intentI5.putExtra("useMkWebview", z3);
        return intentI5;
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        super.mo11681a(w2e0Var, f30Var);
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m26160f().get("title");
        String strM21917g = q1e0.m21917g(w2e0Var.m26160f().get("url"), w2e0Var);
        if (TextUtils.isEmpty(strM21917g)) {
            return null;
        }
        return j2e0.m17246k() ? lva.m19018B(w2e0Var.m26156b(), strM21917g) : m23483e(w2e0Var, strM21917g, str, true, true, true);
    }
}
