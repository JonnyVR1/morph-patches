package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.List;
import l.fyn0;
import l.j2g0;
import l.t6c0;
import v.VLinear;
import v.VPagerNoPage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class eyn0 extends LiveMenuDialogHolder<xzn0> {

    /* JADX INFO: renamed from: k */
    public VLinear f12721k;

    /* JADX INFO: renamed from: l */
    public TabLayout f12722l;

    /* JADX INFO: renamed from: m */
    public VPagerNoPage f12723m;

    /* JADX INFO: renamed from: n */
    public pzn0 f12724n;

    public eyn0(Act act, xzn0 xzn0Var) {
        super(t6c0.K9, act, xzn0Var, j2g0.e(true));
    }

    /* JADX INFO: renamed from: I */
    private void m14170I() {
        if (this.f12724n != null) {
            return;
        }
        pzn0 pzn0Var = new pzn0(null);
        this.f12724n = pzn0Var;
        this.f12723m.setAdapter(pzn0Var);
        this.f12723m.d(new C0877a());
    }

    /* JADX INFO: renamed from: K */
    private void m14171K(List<qzn0> list) {
        this.f12724n.m20793q(list);
        if (this.f12724n.getCount() <= 1) {
            this.f12722l.setSelectedTabIndicatorColor(16777215);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public Context m14172C0() {
        return this.f12721k.getContext();
    }

    /* JADX INFO: renamed from: F */
    public final void m14173F(View view) {
        fyn0.a(this, view);
    }

    /* JADX INFO: renamed from: J */
    public void m14175J(int i) {
        E();
        this.f12723m.setCurrentItem(i == 0 ? 1 : 0);
    }

    public Act act() {
        return ((xzn0) ((LiveMenuDialogHolder) this).b).act();
    }

    public void destroy() {
        super.destroy();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public void m14177l() {
        m14171K(((xzn0) ((LiveMenuDialogHolder) this).b).m25097b4());
    }

    /* JADX INFO: renamed from: m */
    public void m14178m(View view) {
        m14173F(view);
        A(80);
        z(LiveDialogEnum.MEMBER);
        this.f12722l.setupWithViewPager(this.f12723m);
        m14170I();
    }

    /* JADX INFO: renamed from: l.eyn0$a */
    public class C0877a implements ViewPager.j {
        public C0877a() {
        }

        public void onPageSelected(int i) {
            ((xzn0) ((LiveMenuDialogHolder) eyn0.this).b).m25099g4(i == 0 ? 1 : 0);
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m14179n(xzn0 xzn0Var) {
    }
}
