package p006l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.data.NavigationCardIntent;
import com.p1.mobile.putong.data.NavigationIntent;
import java.util.List;
import l.bcp;
import l.f30;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class d2e0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    private Activity m13745e() {
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return null;
        }
        List list = (List) Act.globalLifeCycle_().values().iterator().next();
        if (vwb.J(list)) {
            return null;
        }
        return (Activity) ((Act.r) list.get(list.size() - 1)).a.get();
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (TextUtils.equals("verify_avatar", w2e0Var.m26161g().replaceFirst("/", ""))) {
            Act actM13745e = m13745e();
            if (actM13745e instanceof Act) {
                if (actM13745e.isDestroyed() || actM13745e.isFinishing()) {
                    return m13746f(w2e0Var);
                }
                bcp.INSTANCE.u(actM13745e, w2e0Var.m26160f().get("status"));
                return null;
            }
        }
        return m13746f(w2e0Var);
    }

    /* JADX INFO: renamed from: f */
    public Intent m13746f(w2e0 w2e0Var) {
        return NewMainAct.K5(w2e0Var.m26156b(), NavigationIntent.get("verify_avatar"), (NavigationCardIntent) null, w2e0Var.m26160f());
    }
}
