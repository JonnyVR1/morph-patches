package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.profile.ProfileFrag;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import l.e30;
import l.j760;
import l.mkd0;
import l.o6j0;
import l.q0m;
import l.t100;
import l.upa;
import l.w0c0;
import l.w9j;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class m740<P extends q0m> implements rta0<P> {

    /* JADX INFO: renamed from: a */
    public ProfileFrag f16743a;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m18284c(Throwable th) {
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m18285C0() {
        return this.f16743a.getContext();
    }

    @Nullable
    public Act act() {
        return this.f16743a.act();
    }

    /* JADX INFO: renamed from: d */
    public ProfileFrag m18286d() {
        return this.f16743a;
    }

    /* JADX INFO: renamed from: e */
    public abstract View mo18287e();

    /* JADX INFO: renamed from: f */
    public void m18288f() {
        if (act() instanceof NewMainAct) {
            NewMainAct newMainActAct = act();
            newMainActAct.duringCreated(mkd0.r(newMainActAct.m3895i7().distinctUntilChanged(), newMainActAct.lifecycle().distinctUntilChanged(), new bs30()).filter(new w9j() { // from class: l.j740
                public final Object call(Object obj) {
                    j760 j760Var = (j760) obj;
                    return Boolean.valueOf(j760Var.b == c.i && TextUtils.equals(((TabName) j760Var.a).name(), TabName.Me.name()));
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.k740
                public final void call(Object obj) {
                    this.f15433a.m18290j((j760) obj);
                }
            }, new e30() { // from class: l.l740
                public final void call(Object obj) {
                    m740.m18284c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m18289i() {
        return this.f16743a.isHidden();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m18290j(j760 j760Var) {
        if (mo18287e() == null || !xdl0.O0(mo18287e())) {
            return;
        }
        o6j0.h("e_broadside_red_dot", "p_new_navigation", new o6j0.a[0]);
    }

    /* JADX INFO: renamed from: l */
    public void m18292l(View view) {
        a aVar = new a(view.getContext());
        aVar.B(t100.d(2.0f)).l(t100.d(9.0f)).p(75).J(13.0f).w(t100.d(2.0f)).e(true).k(new int[]{act().getResources().getColor(upa.z() ? w0c0.A : w0c0.I)}).M(true).y(true).b(3000L).D("关注和粉丝移到这里啦").x(t100.d(3.0f)).q(a.N | a.R);
        d.l().t(aVar, view);
    }

    /* JADX INFO: renamed from: k */
    public void m18291k() {
    }
}
