package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.p051p1.mobile.putong.core.newui.greet.DynamicGreetStatusView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.navigationbar.VNavigationBar;
import p153l.vj2;

/* JADX INFO: loaded from: classes11.dex */
public abstract class wj2<P extends vj2<?>> implements iam<P> {

    /* JADX INFO: renamed from: a */
    public DynamicGreetListAct f189411a;

    /* JADX INFO: renamed from: b */
    public P f189412b;

    /* JADX INFO: renamed from: c */
    public DynamicGreetStatusView f189413c;

    /* JADX INFO: renamed from: d */
    public Boolean f189414d = Boolean.FALSE;

    public wj2(DynamicGreetListAct dynamicGreetListAct) {
        this.f189411a = dynamicGreetListAct;
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f189411a;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(P p) {
        this.f189412b = p;
    }

    /* JADX INFO: renamed from: b */
    public abstract List<fzq> mo158500b();

    /* JADX INFO: renamed from: c */
    public void m206617c(VNavigationBar vNavigationBar) {
        vNavigationBar.setLeftIconAsBack(this.f189411a);
        if (gta.m132210e().m132214d().mo34702I4()) {
            vNavigationBar.setLeftIconResource(ibc0.f113798G1);
        }
        if (this.f189411a.m37460a2()) {
            vNavigationBar.setTitle("聊天室消息");
        } else if (CoreModule.f18276o.m132214d().mo34703I5() || CoreModule.m30933P().m143405a().mo34529jj()) {
            vNavigationBar.setTitle("我的告白");
        } else {
            vNavigationBar.setTitle(this.f189411a.string(R$string.f21501G2));
        }
        if (this.f189411a.m37460a2()) {
            return;
        }
        DynamicGreetStatusView dynamicGreetStatusView = (DynamicGreetStatusView) this.f189411a.getLayoutInflater().inflate(qec0.f156853G, (ViewGroup) vNavigationBar, false);
        this.f189413c = dynamicGreetStatusView;
        vNavigationBar.setRightIconViews(dynamicGreetStatusView);
        this.f189413c.f22243b.getPaint().setFakeBoldText(true);
        this.f189413c.f22244c.getPaint().setFakeBoldText(true);
        if (this.f189414d.booleanValue() && NullChecker.m82486a(this.f189413c) && NullChecker.m82486a(this.f189413c.f22246e) && this.f189413c.f22248g.booleanValue()) {
            this.f189413c.f22246e.show();
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo158501d();

    /* JADX INFO: renamed from: e */
    public abstract void mo158502e();

    /* JADX INFO: renamed from: f */
    public void mo158503f(boolean z) {
        if (!this.f189411a.m37459Z1() && NullChecker.m82486a(this.f189413c)) {
            this.f189413c.setSelectTag(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo158504i() {
        if (this.f189411a.m37459Z1() || this.f189411a.m37460a2()) {
            return;
        }
        C4499d c4499dM21895l = C4499d.m21895l();
        C4496a c4496aM21874q = new C4496a(this.f189411a).m21848D("可设置今日是否接收招呼").m21869k(j26.m143190c(this.f189411a, g9c0.f102825o)).m21851G(g9c0.f102827q).m21877t(true).m21854J(14.0f).m21863e(false).m21849E(false).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21880w(qa00.f156322i).m21874q(zvk.f206224A);
        if (CoreModule.f18276o.m132214d().mo34703I5() || CoreModule.m30933P().m143405a().mo34529jj()) {
            c4496aM21874q.m21848D("可设置今日是否接收告白");
        }
        c4499dM21895l.m21907t(c4496aM21874q, this.f189413c.f22242a);
        CoreModule.f18264c.f20420r0.f20753R.put(Boolean.TRUE);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo158508r();

    @Override // p153l.iam
    public void destroy() {
    }
}
