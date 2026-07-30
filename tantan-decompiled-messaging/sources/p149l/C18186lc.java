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
import p147v.VFrame;
import p147v.VPager;

/* JADX INFO: renamed from: l.lc */
/* JADX INFO: loaded from: classes5.dex */
public class C18186lc extends LiveMenuDialogHolder<C20404uc> {

    /* JADX INFO: renamed from: k */
    public VFrame f127358k;

    /* JADX INFO: renamed from: l */
    public TabLayout f127359l;

    /* JADX INFO: renamed from: m */
    public VPager f127360m;

    /* JADX INFO: renamed from: n */
    public gcy f127361n;

    public C18186lc(Act act, C20404uc c20404uc) {
        super(t6c0.f167990C6, act, c20404uc, j2g0.m139458e(true));
    }

    /* JADX INFO: renamed from: I */
    private void m149273I() {
        if (this.f127361n != null) {
            return;
        }
        gcy gcyVar = new gcy(null);
        this.f127361n = gcyVar;
        this.f127360m.setAdapter(gcyVar);
        this.f127360m.m4185d(new a());
    }

    /* JADX INFO: renamed from: K */
    private void m149274K(List<hcy> list) {
        this.f127361n.m125527q(list);
        if (this.f127361n.getCount() <= 1) {
            this.f127359l.setSelectedTabIndicatorColor(16777215);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f127358k.getContext();
    }

    /* JADX INFO: renamed from: F */
    public final void m149275F(View view) {
        C18434mc.m153978a(this, view);
    }

    /* JADX INFO: renamed from: J */
    public void m149277J(int i) {
        m71834E();
        this.f127360m.setCurrentItem(i);
    }

    @Override // p149l.s7m
    public Act act() {
        return ((C20404uc) this.f47757b).act();
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
        m149274K(((C20404uc) this.f47757b).m192983Z3());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        m149275F(view);
        m71831A(80);
        m71844z(LiveDialogEnum.MEMBER);
        this.f127360m.setScrollble(true);
        this.f127359l.setupWithViewPager(this.f127360m);
        this.f127359l.setTabIndicatorFullWidth(false);
        xdl0.m208325C0(this.f127358k, t100.m186890d(564.0f));
        m149273I();
    }

    /* JADX INFO: renamed from: l.lc$a */
    public class a implements ViewPager.InterfaceC0716j {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            ((C20404uc) C18186lc.this.f47757b).m192986e4(i);
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
    public void mo21065i1(C20404uc c20404uc) {
    }
}
