package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.e16;
import l.jhe;
import l.qib0;
import l.t100;
import l.xdl0;
import v.VDraweeView;
import v.VLinear;
import v.VRecyclerView;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ihe extends oj2<hhe> {

    /* JADX INFO: renamed from: e */
    public VNavigationBar f14633e;

    /* JADX INFO: renamed from: f */
    public VLinear f14634f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f14635g;

    /* JADX INFO: renamed from: h */
    public VText f14636h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f14637i;

    /* JADX INFO: renamed from: j */
    public xge f14638j;

    public ihe(DynamicGreetListAct dynamicGreetListAct) {
        super(dynamicGreetListAct);
        this.f14638j = new xge(dynamicGreetListAct);
    }

    @Override // p009l.oj2
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo16547C0() {
        return this.f18073a;
    }

    @Override // p009l.oj2
    /* JADX INFO: renamed from: b */
    public List<fxq> mo16548b() {
        return this.f14638j.m24875Z();
    }

    @Override // p009l.oj2
    /* JADX INFO: renamed from: d */
    public void mo16549d() {
        this.f14638j.m24883g0();
    }

    @Override // p009l.oj2
    /* JADX INFO: renamed from: e */
    public void mo16550e() {
        xdl0.M(this.f14634f, true);
        xdl0.M(this.f14637i, false);
        qib0.G.Y0(this.f14635g, c3c0.o1);
        this.f14636h.setText("暂时没有新的小纸条消息");
    }

    @Override // p009l.oj2
    /* JADX INFO: renamed from: f */
    public void mo16551f(boolean z) {
        if (!this.f18073a.m385Y1() && NullChecker.a(this.f18075c)) {
            this.f18075c.setSelectTag(Boolean.valueOf(z));
        }
    }

    @Override // p009l.oj2
    /* JADX INFO: renamed from: i */
    public void mo16552i() {
        if (this.f18073a.m385Y1()) {
            return;
        }
        d dVarL = d.l();
        a aVarQ = new a(this.f18073a).D("可设置今日是否接收招呼").k(new int[]{e16.c(this.f18073a, a1c0.o)}).G(a1c0.q).t(true).J(14.0f).e(false).E(false).b(5000L).w(t100.i).q(jtk.f15293A);
        if (CoreModule.o.d().I5() || CoreModule.P().a().jj()) {
            aVarQ.D("可设置今日是否接收告白");
        }
        dVarL.t(aVarQ, this.f18075c.f278a);
        CoreModule.c.r0.R.put(Boolean.TRUE);
    }

    @Override // p009l.oj2
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM16553j = m16553j(layoutInflater, viewGroup);
        m19818c(this.f14633e);
        return viewM16553j;
    }

    /* JADX INFO: renamed from: j */
    public View m16553j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jhe.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l */
    public void m16555l(List<fxq> list) {
        xdl0.M(this.f14634f, false);
        xdl0.M(this.f14637i, true);
        this.f14638j.m24884l0(list);
    }

    @Override // p009l.oj2
    /* JADX INFO: renamed from: r */
    public void mo16556r() {
        this.f14637i.setItemAnimator((RecyclerView.l) null);
        this.f14637i.setAdapter(this.f14638j);
    }

    @Override // p009l.oj2
    public void destroy() {
    }

    /* JADX INFO: renamed from: k */
    public void m16554k() {
    }
}
