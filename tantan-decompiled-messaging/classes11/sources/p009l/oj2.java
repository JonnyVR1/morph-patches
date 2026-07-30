package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.p000p1.mobile.putong.core.newui.greet.DynamicGreetStatusView;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.e16;
import l.l6c0;
import l.s7m;
import l.t100;
import l.ura;
import p009l.nj2;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class oj2<P extends nj2<?>> implements s7m<P> {

    /* JADX INFO: renamed from: a */
    public DynamicGreetListAct f18073a;

    /* JADX INFO: renamed from: b */
    public P f18074b;

    /* JADX INFO: renamed from: c */
    public DynamicGreetStatusView f18075c;

    /* JADX INFO: renamed from: d */
    public Boolean f18076d = Boolean.FALSE;

    public oj2(DynamicGreetListAct dynamicGreetListAct) {
        this.f18073a = dynamicGreetListAct;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo16547C0() {
        return this.f18073a;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m19819i1(P p) {
        this.f18074b = p;
    }

    /* JADX INFO: renamed from: b */
    public abstract List<fxq> mo16548b();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public void m19818c(VNavigationBar vNavigationBar) {
        vNavigationBar.setLeftIconAsBack(this.f18073a);
        if (ura.e().d().I4()) {
            vNavigationBar.setLeftIconResource(c3c0.G1);
        }
        if (this.f18073a.m386Z1()) {
            vNavigationBar.setTitle("聊天室消息");
        } else if (CoreModule.o.d().I5() || CoreModule.P().a().jj()) {
            vNavigationBar.setTitle("我的告白");
        } else {
            vNavigationBar.setTitle(this.f18073a.string(R.string.G2));
        }
        if (this.f18073a.m386Z1()) {
            return;
        }
        DynamicGreetStatusView dynamicGreetStatusView = (DynamicGreetStatusView) this.f18073a.getLayoutInflater().inflate(l6c0.G, (ViewGroup) vNavigationBar, false);
        this.f18075c = dynamicGreetStatusView;
        vNavigationBar.setRightIconViews(new View[]{dynamicGreetStatusView});
        this.f18075c.f279b.getPaint().setFakeBoldText(true);
        this.f18075c.f280c.getPaint().setFakeBoldText(true);
        if (this.f18076d.booleanValue() && NullChecker.a(this.f18075c) && NullChecker.a(this.f18075c.f282e) && this.f18075c.f284g.booleanValue()) {
            this.f18075c.f282e.show();
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo16549d();

    /* JADX INFO: renamed from: e */
    public abstract void mo16550e();

    /* JADX INFO: renamed from: f */
    public void mo16551f(boolean z) {
        if (!this.f18073a.m385Y1() && NullChecker.a(this.f18075c)) {
            this.f18075c.setSelectTag(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo16552i() {
        if (this.f18073a.m385Y1() || this.f18073a.m386Z1()) {
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

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo16556r();

    public void destroy() {
    }
}
