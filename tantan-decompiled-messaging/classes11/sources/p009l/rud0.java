package p009l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p000p1.mobile.putong.oms.OmsBaseRender;
import com.p1.mobile.putong.core.CoreModule;
import l.f30;
import l.kxd0;
import l.w2e0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rud0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m21807e(yk5 yk5Var, String str, String str2, View view) {
        yk5Var.dismiss();
        OmsBaseRender omsBaseRenderM18845g = nc50.m18839f().m18845g(str);
        if (omsBaseRenderM18845g == null) {
            return;
        }
        omsBaseRenderM18845g.m9580U(str2);
    }

    /* JADX INFO: renamed from: a */
    public void m21808a(w2e0 w2e0Var, f30<String, String> f30Var) {
        String strG = w2e0Var.g();
        strG.getClass();
        if (!strG.equals("/protocol")) {
            super.a(w2e0Var, f30Var);
            return;
        }
        final String str = (String) w2e0Var.f().get("identifier");
        String str2 = (String) w2e0Var.f().get("name");
        if (TextUtils.isEmpty(str2)) {
            str2 = ((Boolean) CoreModule.c.B0.l4().a).booleanValue() ? "real-avatar" : "real-id";
        }
        final String str3 = (String) w2e0Var.f().get(MiniWidgetProvider.KEY_TYPE);
        final yk5 yk5Var = new yk5(w2e0Var.b(), TextUtils.equals(str2, "real-avatar") ? 1 : 2);
        yk5Var.m25443D(new View.OnClickListener() { // from class: l.qud0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rud0.m21807e(yk5Var, str, str3, view);
            }
        });
        yk5Var.show();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent m21809c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
