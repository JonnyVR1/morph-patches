package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.profile.ProfileFrag;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import p149l.q0m;

/* JADX INFO: loaded from: classes11.dex */
public abstract class m740<P extends q0m> implements rta0<P> {

    /* JADX INFO: renamed from: a */
    public ProfileFrag f131789a;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m153339c(Throwable th) {
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f131789a.getContext();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f131789a.act();
    }

    /* JADX INFO: renamed from: d */
    public ProfileFrag m153340d() {
        return this.f131789a;
    }

    /* JADX INFO: renamed from: e */
    public abstract View mo153341e();

    /* JADX INFO: renamed from: f */
    public void m153342f() {
        if (getAct() instanceof NewMainAct) {
            NewMainAct newMainAct = (NewMainAct) getAct();
            newMainAct.duringCreated(mkd0.m154984r(newMainAct.m39819i7().distinctUntilChanged(), newMainAct.lifecycle().distinctUntilChanged(), new bs30()).filter(new w9j() { // from class: l.j740
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    j760 j760Var = (j760) obj;
                    return Boolean.valueOf(j760Var.f116565b == C4319c.f15548i && TextUtils.equals(((TabName) j760Var.f116564a).name(), TabName.Me.name()));
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.k740
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f121531a.m153344j((j760) obj);
                }
            }, new e30() { // from class: l.l740
                @Override // p149l.e30
                public final void call(Object obj) {
                    m740.m153339c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m153343i() {
        return this.f131789a.isHidden();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m153344j(j760 j760Var) {
        if (mo153341e() == null || !xdl0.m208349O0(mo153341e())) {
            return;
        }
        o6j0.m162864h("e_broadside_red_dot", "p_new_navigation", new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: l */
    public void m153346l(View view) {
        C4345a c4345a = new C4345a(view.getContext());
        c4345a.m20847B(t100.m186890d(2.0f)).m20871l(t100.m186890d(9.0f)).m20874p(75).m20855J(13.0f).m20881w(t100.m186890d(2.0f)).m20864e(true).m20870k(getAct().getResources().getColor(upa.m194847z() ? w0c0.f183749A : w0c0.f183773I)).m20858M(true).m20883y(true).m20861b(3000L).m20849D("关注和粉丝移到这里啦").m20882x(t100.m186890d(3.0f)).m20875q(C4345a.f15680N | C4345a.f15684R);
        C4348d.m20896l().m20908t(c4345a, view);
    }

    /* JADX INFO: renamed from: k */
    public void m153345k() {
    }
}
