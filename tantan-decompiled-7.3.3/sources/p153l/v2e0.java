package p153l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.oms.OmsBaseRender;

/* JADX INFO: loaded from: classes11.dex */
public class v2e0 extends o5e0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m199130e(bm5 bm5Var, String str, String str2, View view) {
        bm5Var.dismiss();
        OmsBaseRender omsBaseRenderM196478g = uk50.m196472f().m196478g(str);
        if (omsBaseRenderM196478g == null) {
            return;
        }
        omsBaseRenderM196478g.m80444U(str2);
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        String strM96744g = abe0Var.m96744g();
        strM96744g.getClass();
        if (!strM96744g.equals("/protocol")) {
            super.mo95798a(abe0Var, z20Var);
            return;
        }
        final String str = abe0Var.m96743f().get("identifier");
        String str2 = abe0Var.m96743f().get(AuthenticationTokenClaims.JSON_KEY_NAME);
        if (TextUtils.isEmpty(str2)) {
            str2 = CoreModule.f18264c.f20294B0.m32616l4().f152156a.booleanValue() ? "real-avatar" : "real-id";
        }
        final String str3 = abe0Var.m96743f().get("type");
        final bm5 bm5Var = new bm5(abe0Var.m96739b(), TextUtils.equals(str2, "real-avatar") ? 1 : 2);
        bm5Var.m104999D(new View.OnClickListener() { // from class: l.u2e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v2e0.m199130e(bm5Var, str, str3, view);
            }
        });
        bm5Var.show();
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
