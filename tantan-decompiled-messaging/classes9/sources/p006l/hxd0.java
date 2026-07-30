package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.match.b;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import l.d30;
import l.e30;
import l.f30;
import l.mkd0;
import l.roj0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class hxd0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m16393e(String str, Act act, roj0 roj0Var) {
        User userM21487oa = CoreModule.f1534c.f3628e0.m21487oa(str);
        if (NullChecker.a(userM21487oa)) {
            b.o(act, userM21487oa, "p_pay_result,e_odiamond_sayhi,click", (d30) null);
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m16394f(Throwable th) {
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        String strReplaceFirst = TextUtils.isEmpty(w2e0Var.m26161g()) ? "" : w2e0Var.m26161g().replaceFirst("/", "");
        Map<String, String> mapM26160f = w2e0Var.m26160f();
        if ("match".equals(strReplaceFirst)) {
            Act actD = xdl0.D(w2e0Var.m26156b());
            if (actD instanceof Act) {
                final String str = mapM26160f.get("uid");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                final Act act = actD;
                act.duringCreated(CoreModule.f1534c.f3628e0.m21417W9(str)).subscribe(mkd0.H(new e30() { // from class: l.fxd0
                    public final void call(Object obj) {
                        hxd0.m16393e(str, act, (roj0) obj);
                    }
                }, new e30() { // from class: l.gxd0
                    public final void call(Object obj) {
                        hxd0.m16394f((Throwable) obj);
                    }
                }));
            }
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
