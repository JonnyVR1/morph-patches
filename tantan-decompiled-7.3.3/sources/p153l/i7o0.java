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
import p151v.VLinear;
import p151v.VPagerNoPage;

/* JADX INFO: loaded from: classes10.dex */
public class i7o0 extends LiveMenuDialogHolder<b9o0> {

    /* JADX INFO: renamed from: k */
    public VLinear f113280k;

    /* JADX INFO: renamed from: l */
    public TabLayout f113281l;

    /* JADX INFO: renamed from: m */
    public VPagerNoPage f113282m;

    /* JADX INFO: renamed from: n */
    public t8o0 f113283n;

    public i7o0(Act act, b9o0 b9o0Var) {
        super(yec0.f198821K9, act, b9o0Var, qag0.m175924e(true));
    }

    /* JADX INFO: renamed from: I */
    private void m138976I() {
        if (this.f113283n != null) {
            return;
        }
        t8o0 t8o0Var = new t8o0(null);
        this.f113283n = t8o0Var;
        this.f113282m.setAdapter(t8o0Var);
        this.f113282m.m4187d(new C17663a());
    }

    /* JADX INFO: renamed from: K */
    private void m138977K(List<u8o0> list) {
        this.f113283n.m189679q(list);
        if (this.f113283n.getCount() <= 1) {
            this.f113281l.setSelectedTabIndicatorColor(16777215);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f113280k.getContext();
    }

    /* JADX INFO: renamed from: F */
    public final void m138978F(View view) {
        j7o0.m143787a(this, view);
    }

    /* JADX INFO: renamed from: J */
    public void m138980J(int i) {
        m73017E();
        this.f113282m.setCurrentItem(i == 0 ? 1 : 0);
    }

    @Override // p153l.iam
    public Act act() {
        return ((b9o0) this.f48605b).act();
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
        m138977K(((b9o0) this.f48605b).m103125b4());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        m138978F(view);
        m73014A(80);
        m73027z(LiveDialogEnum.MEMBER);
        this.f113281l.setupWithViewPager(this.f113282m);
        m138976I();
    }

    /* JADX INFO: renamed from: l.i7o0$a */
    public class C17663a implements ViewPager.InterfaceC0718j {
        public C17663a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            ((b9o0) i7o0.this.f48605b).m103127g4(i == 0 ? 1 : 0);
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
    public void mo22064i1(b9o0 b9o0Var) {
    }
}
