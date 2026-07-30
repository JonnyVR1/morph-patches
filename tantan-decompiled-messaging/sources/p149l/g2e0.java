package p149l;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupProfileAct;

/* JADX INFO: loaded from: classes9.dex */
public class g2e0 extends kxd0 {
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m124153f(Throwable th) {
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if ("moment".equals(w2e0Var.m201098f().get("from"))) {
            m124154g(w2e0Var, w2e0Var.m201098f().get("groupId"));
        } else {
            super.mo94421a(w2e0Var, f30Var);
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m201098f().get("groupId");
        Intent intentM151850f = lva.m151850f(w2e0Var.m201094b());
        intentM151850f.putExtra("extra_join_group_id", str);
        return intentM151850f;
    }

    /* JADX INFO: renamed from: g */
    public final void m124154g(w2e0 w2e0Var, final String str) {
        final Activity activityM208326D;
        if (upa.m194706V1() && (activityM208326D = xdl0.m208326D(w2e0Var.m201094b())) != null) {
            CoreModule.f17545c.f19645g0.m31809H6(str).filter(new qh7()).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.e2e0
                @Override // p149l.e30
                public final void call(Object obj) {
                    Activity activity = activityM208326D;
                    activity.startActivity(GroupProfileAct.m49107Z1(activity, str, (ChatGroup) obj, true));
                }
            }, new e30() { // from class: l.f2e0
                @Override // p149l.e30
                public final void call(Object obj) {
                    g2e0.m124153f((Throwable) obj);
                }
            }));
        }
    }
}
