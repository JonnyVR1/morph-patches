package p153l;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupProfileAct;

/* JADX INFO: loaded from: classes9.dex */
public class kae0 extends o5e0 {
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m148942f(Throwable th) {
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        if ("moment".equals(abe0Var.m96743f().get("from"))) {
            m148943g(abe0Var, abe0Var.m96743f().get("groupId"));
        } else {
            super.mo95798a(abe0Var, z20Var);
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        String str = abe0Var.m96743f().get("groupId");
        Intent intentM213311f = xwa.m213311f(abe0Var.m96739b());
        intentM213311f.putExtra("extra_join_group_id", str);
        return intentM213311f;
    }

    /* JADX INFO: renamed from: g */
    public final void m148943g(abe0 abe0Var, final String str) {
        final Activity activityM105506D;
        if (gra.m131637V1() && (activityM105506D = bnl0.m105506D(abe0Var.m96739b())) != null) {
            CoreModule.f18264c.f20387g0.m32812H6(str).filter(new ui7()).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.iae0
                @Override // p153l.y20
                public final void call(Object obj) {
                    Activity activity = activityM105506D;
                    activity.startActivity(GroupProfileAct.m50290a2(activity, str, (ChatGroup) obj, true));
                }
            }, new y20() { // from class: l.jae0
                @Override // p153l.y20
                public final void call(Object obj) {
                    kae0.m148942f((Throwable) obj);
                }
            }));
        }
    }
}
