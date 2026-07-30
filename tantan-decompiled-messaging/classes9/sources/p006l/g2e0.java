package p006l;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.ui.messages.group.GroupProfileAct;
import l.e30;
import l.f30;
import l.mkd0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class g2e0 extends kxd0 {
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m15564f(Throwable th) {
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if ("moment".equals(w2e0Var.m26160f().get("from"))) {
            m15565g(w2e0Var, w2e0Var.m26160f().get("groupId"));
        } else {
            super.mo11681a(w2e0Var, f30Var);
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m26160f().get("groupId");
        Intent intentM19027f = lva.m19027f(w2e0Var.m26156b());
        intentM19027f.putExtra("extra_join_group_id", str);
        return intentM19027f;
    }

    /* JADX INFO: renamed from: g */
    public final void m15565g(w2e0 w2e0Var, final String str) {
        final Activity activityD;
        if (upa.m25404V1() && (activityD = xdl0.D(w2e0Var.m26156b())) != null) {
            CoreModule.f1534c.f3634g0.m3739H6(str).filter(new qh7()).take(1).subscribe(mkd0.H(new e30() { // from class: l.e2e0
                public final void call(Object obj) {
                    Activity activity = activityD;
                    activity.startActivity(GroupProfileAct.Z1(activity, str, (ChatGroup) obj, true));
                }
            }, new e30() { // from class: l.f2e0
                public final void call(Object obj) {
                    g2e0.m15564f((Throwable) obj);
                }
            }));
        }
    }
}
