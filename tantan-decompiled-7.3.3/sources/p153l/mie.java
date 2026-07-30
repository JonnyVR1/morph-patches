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
import com.p051p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class mie extends wj2<lie> {

    /* JADX INFO: renamed from: e */
    public VNavigationBar f136958e;

    /* JADX INFO: renamed from: f */
    public VLinear f136959f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f136960g;

    /* JADX INFO: renamed from: h */
    public VText f136961h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f136962i;

    /* JADX INFO: renamed from: j */
    public bie f136963j;

    public mie(DynamicGreetListAct dynamicGreetListAct) {
        super(dynamicGreetListAct);
        this.f136963j = new bie(dynamicGreetListAct);
    }

    @Override // p153l.wj2, p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f189411a;
    }

    @Override // p153l.wj2
    /* JADX INFO: renamed from: b */
    public List<fzq> mo158500b() {
        return this.f136963j.m104453Z();
    }

    @Override // p153l.wj2
    /* JADX INFO: renamed from: d */
    public void mo158501d() {
        this.f136963j.m104460g0();
    }

    @Override // p153l.wj2
    /* JADX INFO: renamed from: e */
    public void mo158502e() {
        bnl0.m105524M(this.f136959f, true);
        bnl0.m105524M(this.f136962i, false);
        uqb0.f180374G.m127138Y0(this.f136960g, ibc0.f114095o1);
        this.f136961h.setText("暂时没有新的小纸条消息");
    }

    @Override // p153l.wj2
    /* JADX INFO: renamed from: f */
    public void mo158503f(boolean z) {
        if (!this.f189411a.m37459Z1() && NullChecker.m82486a(this.f189413c)) {
            this.f189413c.setSelectTag(Boolean.valueOf(z));
        }
    }

    @Override // p153l.wj2
    /* JADX INFO: renamed from: i */
    public void mo158504i() {
        if (this.f189411a.m37459Z1()) {
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

    @Override // p153l.wj2, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM158505j = m158505j(layoutInflater, viewGroup);
        m206617c(this.f136958e);
        return viewM158505j;
    }

    /* JADX INFO: renamed from: j */
    public View m158505j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nie.m163274b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m158507l(List<fzq> list) {
        bnl0.m105524M(this.f136959f, false);
        bnl0.m105524M(this.f136962i, true);
        this.f136963j.m104461l0(list);
    }

    @Override // p153l.wj2
    /* JADX INFO: renamed from: r */
    public void mo158508r() {
        this.f136962i.setItemAnimator(null);
        this.f136962i.setAdapter(this.f136963j);
    }

    @Override // p153l.wj2, p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: k */
    public void m158506k() {
    }
}
