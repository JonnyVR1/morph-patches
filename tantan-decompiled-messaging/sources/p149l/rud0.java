package p149l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.oms.OmsBaseRender;

/* JADX INFO: loaded from: classes11.dex */
public class rud0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m180868e(yk5 yk5Var, String str, String str2, View view) {
        yk5Var.dismiss();
        OmsBaseRender omsBaseRenderM158918g = nc50.m158912f().m158918g(str);
        if (omsBaseRenderM158918g == null) {
            return;
        }
        omsBaseRenderM158918g.m79261U(str2);
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        String strM201099g = w2e0Var.m201099g();
        strM201099g.getClass();
        if (!strM201099g.equals("/protocol")) {
            super.mo94421a(w2e0Var, f30Var);
            return;
        }
        final String str = w2e0Var.m201098f().get("identifier");
        String str2 = w2e0Var.m201098f().get(AuthenticationTokenClaims.JSON_KEY_NAME);
        if (TextUtils.isEmpty(str2)) {
            str2 = CoreModule.f17545c.f19552B0.m31613l4().f116564a.booleanValue() ? "real-avatar" : "real-id";
        }
        final String str3 = w2e0Var.m201098f().get("type");
        final yk5 yk5Var = new yk5(w2e0Var.m201094b(), TextUtils.equals(str2, "real-avatar") ? 1 : 2);
        yk5Var.m215118D(new View.OnClickListener() { // from class: l.qud0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rud0.m180868e(yk5Var, str, str3, view);
            }
        });
        yk5Var.show();
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
