package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.List;
import p151v.VFrame;
import p151v.VPager;

/* JADX INFO: renamed from: l.gc */
/* JADX INFO: loaded from: classes5.dex */
public class C17193gc extends LiveMenuDialogHolder<C19338pc> {

    /* JADX INFO: renamed from: k */
    public VFrame f103509k;

    /* JADX INFO: renamed from: l */
    public TabLayout f103510l;

    /* JADX INFO: renamed from: m */
    public VPager f103511m;

    /* JADX INFO: renamed from: n */
    public dly f103512n;

    public C17193gc(Act act, C19338pc c19338pc) {
        super(yec0.f198722C6, act, c19338pc, qag0.m175924e(true));
    }

    /* JADX INFO: renamed from: I */
    private void m129815I() {
        if (this.f103512n != null) {
            return;
        }
        dly dlyVar = new dly(null);
        this.f103512n = dlyVar;
        this.f103511m.setAdapter(dlyVar);
        this.f103511m.m4187d(new a());
    }

    /* JADX INFO: renamed from: K */
    private void m129816K(List<ely> list) {
        this.f103512n.m116909q(list);
        if (this.f103512n.getCount() <= 1) {
            this.f103510l.setSelectedTabIndicatorColor(16777215);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f103509k.getContext();
    }

    /* JADX INFO: renamed from: F */
    public final void m129817F(View view) {
        C17435hc.m134441a(this, view);
    }

    /* JADX INFO: renamed from: J */
    public void m129819J(int i) {
        m73017E();
        this.f103511m.setCurrentItem(i);
    }

    @Override // p153l.iam
    public Act act() {
        return ((C19338pc) this.f48605b).act();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public void destroy() {
        super.destroy();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: l */
    public void mo73018l() {
        m129816K(((C19338pc) this.f48605b).m171546Z3());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        m129817F(view);
        m73014A(80);
        m73027z(LiveDialogEnum.MEMBER);
        this.f103511m.setScrollble(true);
        this.f103510l.setupWithViewPager(this.f103511m);
        this.f103510l.setTabIndicatorFullWidth(false);
        bnl0.m105505C0(this.f103509k, qa00.m175859d(564.0f));
        m129815I();
    }

    /* JADX INFO: renamed from: l.gc$a */
    public class a implements ViewPager.InterfaceC0718j {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            ((C19338pc) C17193gc.this.f48605b).m171549e4(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C19338pc c19338pc) {
    }
}
