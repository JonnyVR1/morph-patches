package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.List;
import p147v.VLinear;
import p147v.VPagerNoPage;

/* JADX INFO: loaded from: classes11.dex */
public class eyn0 extends LiveMenuDialogHolder<xzn0> {

    /* JADX INFO: renamed from: k */
    public VLinear f93773k;

    /* JADX INFO: renamed from: l */
    public TabLayout f93774l;

    /* JADX INFO: renamed from: m */
    public VPagerNoPage f93775m;

    /* JADX INFO: renamed from: n */
    public pzn0 f93776n;

    public eyn0(Act act, xzn0 xzn0Var) {
        super(t6c0.f168089K9, act, xzn0Var, j2g0.m139458e(true));
    }

    /* JADX INFO: renamed from: I */
    private void m118782I() {
        if (this.f93776n != null) {
            return;
        }
        pzn0 pzn0Var = new pzn0(null);
        this.f93776n = pzn0Var;
        this.f93775m.setAdapter(pzn0Var);
        this.f93775m.m4185d(new C16722a());
    }

    /* JADX INFO: renamed from: K */
    private void m118783K(List<qzn0> list) {
        this.f93776n.m172243q(list);
        if (this.f93776n.getCount() <= 1) {
            this.f93774l.setSelectedTabIndicatorColor(16777215);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f93773k.getContext();
    }

    /* JADX INFO: renamed from: F */
    public final void m118784F(View view) {
        fyn0.m123786a(this, view);
    }

    /* JADX INFO: renamed from: J */
    public void m118786J(int i) {
        m71834E();
        this.f93775m.setCurrentItem(i == 0 ? 1 : 0);
    }

    @Override // p149l.s7m
    public Act act() {
        return ((xzn0) this.f47757b).act();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public void destroy() {
        super.destroy();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: l */
    public void mo71835l() {
        m118783K(((xzn0) this.f47757b).m212009b4());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        m118784F(view);
        m71831A(80);
        m71844z(LiveDialogEnum.MEMBER);
        this.f93774l.setupWithViewPager(this.f93775m);
        m118782I();
    }

    /* JADX INFO: renamed from: l.eyn0$a */
    public class C16722a implements ViewPager.InterfaceC0716j {
        public C16722a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            ((xzn0) eyn0.this.f47757b).m212011g4(i == 0 ? 1 : 0);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(xzn0 xzn0Var) {
    }
}
