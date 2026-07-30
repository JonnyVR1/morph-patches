package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.data.NavigationIntent;

/* JADX INFO: loaded from: classes9.dex */
public class w9e0 extends o5e0 {
    /* JADX INFO: renamed from: e */
    private Intent m205569e(abe0 abe0Var, String str, String str2, boolean z, boolean z2, boolean z3) {
        Intent intentM40697M5 = NewMainAct.m40697M5(abe0Var.m96739b(), NavigationIntent.get("webview"));
        intentM40697M5.putExtra("webview_url", str);
        intentM40697M5.putExtra("webview_title", str2);
        intentM40697M5.putExtra("hideNavigationBar", z);
        intentM40697M5.putExtra("hardwareAccelerated", z2);
        intentM40697M5.putExtra("useMkWebview", z3);
        return intentM40697M5;
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        super.mo95798a(abe0Var, z20Var);
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        String str = abe0Var.m96743f().get("title");
        String strM195090g = u9e0.m195090g(abe0Var.m96743f().get("url"), abe0Var);
        if (TextUtils.isEmpty(strM195090g)) {
            return null;
        }
        return nae0.m162081k() ? xwa.m213302B(abe0Var.m96739b(), strM195090g) : m205569e(abe0Var, strM195090g, str, true, true, true);
    }
}
