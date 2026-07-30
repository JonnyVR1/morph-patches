package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class ihe extends oj2<hhe> {

    /* JADX INFO: renamed from: e */
    public VNavigationBar f113242e;

    /* JADX INFO: renamed from: f */
    public VLinear f113243f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f113244g;

    /* JADX INFO: renamed from: h */
    public VText f113245h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f113246i;

    /* JADX INFO: renamed from: j */
    public xge f113247j;

    public ihe(DynamicGreetListAct dynamicGreetListAct) {
        super(dynamicGreetListAct);
        this.f113247j = new xge(dynamicGreetListAct);
    }

    @Override // p149l.oj2, p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f144220a;
    }

    @Override // p149l.oj2
    /* JADX INFO: renamed from: b */
    public List<fxq> mo136191b() {
        return this.f113247j.m208661Z();
    }

    @Override // p149l.oj2
    /* JADX INFO: renamed from: d */
    public void mo136192d() {
        this.f113247j.m208668g0();
    }

    @Override // p149l.oj2
    /* JADX INFO: renamed from: e */
    public void mo136193e() {
        xdl0.m208344M(this.f113243f, true);
        xdl0.m208344M(this.f113246i, false);
        qib0.f154691G.m102354Y0(this.f113244g, c3c0.f78820o1);
        this.f113245h.setText("暂时没有新的小纸条消息");
    }

    @Override // p149l.oj2
    /* JADX INFO: renamed from: f */
    public void mo136194f(boolean z) {
        if (!this.f144220a.m36456Y1() && NullChecker.m81303a(this.f144222c)) {
            this.f144222c.setSelectTag(Boolean.valueOf(z));
        }
    }

    @Override // p149l.oj2
    /* JADX INFO: renamed from: i */
    public void mo136195i() {
        if (this.f144220a.m36456Y1()) {
            return;
        }
        C4348d c4348dM20896l = C4348d.m20896l();
        C4345a c4345aM20875q = new C4345a(this.f144220a).m20849D("可设置今日是否接收招呼").m20870k(e16.m114375c(this.f144220a, a1c0.f67161o)).m20852G(a1c0.f67163q).m20878t(true).m20855J(14.0f).m20864e(false).m20850E(false).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20881w(t100.f167260i).m20875q(jtk.f119614A);
        if (CoreModule.f17557o.m195057d().mo33700I5() || CoreModule.m29935P().m94651a().mo33526jj()) {
            c4345aM20875q.m20849D("可设置今日是否接收告白");
        }
        c4348dM20896l.m20908t(c4345aM20875q, this.f144222c.f21500a);
        CoreModule.f17545c.f19678r0.f20011R.put(Boolean.TRUE);
    }

    @Override // p149l.oj2, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM136196j = m136196j(layoutInflater, viewGroup);
        m164605c(this.f113242e);
        return viewM136196j;
    }

    /* JADX INFO: renamed from: j */
    public View m136196j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jhe.m141499b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m136198l(List<fxq> list) {
        xdl0.m208344M(this.f113243f, false);
        xdl0.m208344M(this.f113246i, true);
        this.f113247j.m208669l0(list);
    }

    @Override // p149l.oj2
    /* JADX INFO: renamed from: r */
    public void mo136199r() {
        this.f113246i.setItemAnimator(null);
        this.f113246i.setAdapter(this.f113247j);
    }

    @Override // p149l.oj2, p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: k */
    public void m136197k() {
    }
}
