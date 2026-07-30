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
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.p046p1.mobile.putong.core.newui.greet.DynamicGreetStatusView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.navigationbar.VNavigationBar;
import p149l.nj2;

/* JADX INFO: loaded from: classes11.dex */
public abstract class oj2<P extends nj2<?>> implements s7m<P> {

    /* JADX INFO: renamed from: a */
    public DynamicGreetListAct f144220a;

    /* JADX INFO: renamed from: b */
    public P f144221b;

    /* JADX INFO: renamed from: c */
    public DynamicGreetStatusView f144222c;

    /* JADX INFO: renamed from: d */
    public Boolean f144223d = Boolean.FALSE;

    public oj2(DynamicGreetListAct dynamicGreetListAct) {
        this.f144220a = dynamicGreetListAct;
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f144220a;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(P p) {
        this.f144221b = p;
    }

    /* JADX INFO: renamed from: b */
    public abstract List<fxq> mo136191b();

    /* JADX INFO: renamed from: c */
    public void m164605c(VNavigationBar vNavigationBar) {
        vNavigationBar.setLeftIconAsBack(this.f144220a);
        if (ura.m195053e().m195057d().mo33699I4()) {
            vNavigationBar.setLeftIconResource(c3c0.f78523G1);
        }
        if (this.f144220a.m36457Z1()) {
            vNavigationBar.setTitle("聊天室消息");
        } else if (CoreModule.f17557o.m195057d().mo33700I5() || CoreModule.m29935P().m94651a().mo33526jj()) {
            vNavigationBar.setTitle("我的告白");
        } else {
            vNavigationBar.setTitle(this.f144220a.string(R$string.f20759G2));
        }
        if (this.f144220a.m36457Z1()) {
            return;
        }
        DynamicGreetStatusView dynamicGreetStatusView = (DynamicGreetStatusView) this.f144220a.getLayoutInflater().inflate(l6c0.f126297G, (ViewGroup) vNavigationBar, false);
        this.f144222c = dynamicGreetStatusView;
        vNavigationBar.setRightIconViews(dynamicGreetStatusView);
        this.f144222c.f21501b.getPaint().setFakeBoldText(true);
        this.f144222c.f21502c.getPaint().setFakeBoldText(true);
        if (this.f144223d.booleanValue() && NullChecker.m81303a(this.f144222c) && NullChecker.m81303a(this.f144222c.f21504e) && this.f144222c.f21506g.booleanValue()) {
            this.f144222c.f21504e.show();
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo136192d();

    /* JADX INFO: renamed from: e */
    public abstract void mo136193e();

    /* JADX INFO: renamed from: f */
    public void mo136194f(boolean z) {
        if (!this.f144220a.m36456Y1() && NullChecker.m81303a(this.f144222c)) {
            this.f144222c.setSelectTag(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo136195i() {
        if (this.f144220a.m36456Y1() || this.f144220a.m36457Z1()) {
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

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo136199r();

    @Override // p149l.s7m
    public void destroy() {
    }
}
