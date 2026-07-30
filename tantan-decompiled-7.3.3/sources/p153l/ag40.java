package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.profile.ProfileFrag;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import p153l.k3m;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ag40<P extends k3m> implements v1b0<P> {

    /* JADX INFO: renamed from: a */
    public ProfileFrag f71083a;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m97579c(Throwable th) {
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f71083a.getContext();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f71083a.act();
    }

    /* JADX INFO: renamed from: d */
    public ProfileFrag m97580d() {
        return this.f71083a;
    }

    /* JADX INFO: renamed from: e */
    public abstract View mo97581e();

    /* JADX INFO: renamed from: f */
    public void m97582f() {
        if (getAct() instanceof NewMainAct) {
            NewMainAct newMainAct = (NewMainAct) getAct();
            newMainAct.duringCreated(psd0.m173625r(newMainAct.m40829o7().distinctUntilChanged(), newMainAct.lifecycle().distinctUntilChanged(), new p040()).filter(new qcj() { // from class: l.xf40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    pf60 pf60Var = (pf60) obj;
                    return Boolean.valueOf(pf60Var.f152157b == C4470c.f16267i && TextUtils.equals(((TabName) pf60Var.f152156a).name(), TabName.Me.name()));
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.yf40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f199449a.m97584j((pf60) obj);
                }
            }, new y20() { // from class: l.zf40
                @Override // p153l.y20
                public final void call(Object obj) {
                    ag40.m97579c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m97583i() {
        return this.f71083a.isHidden();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m97584j(pf60 pf60Var) {
        if (mo97581e() == null || !bnl0.m105529O0(mo97581e())) {
            return;
        }
        sfj0.m185601h("e_broadside_red_dot", "p_new_navigation", new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: l */
    public void m97586l(View view) {
        C4496a c4496a = new C4496a(view.getContext());
        c4496a.m21846B(qa00.m175859d(2.0f)).m21870l(qa00.m175859d(9.0f)).m21873p(75).m21854J(13.0f).m21880w(qa00.m175859d(2.0f)).m21863e(true).m21869k(getAct().getResources().getColor(gra.m131778z() ? c9c0.f80318A : c9c0.f80342I)).m21857M(true).m21882y(true).m21860b(3000L).m21848D("关注和粉丝移到这里啦").m21881x(qa00.m175859d(3.0f)).m21874q(C4496a.f16399N | C4496a.f16403R);
        C4499d.m21895l().m21907t(c4496a, view);
    }

    /* JADX INFO: renamed from: k */
    public void m97585k() {
    }
}
