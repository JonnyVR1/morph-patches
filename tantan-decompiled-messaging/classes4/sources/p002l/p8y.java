package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogTopAnimView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.ddv;
import l.t100;
import l.uvr;
import l.xdl0;
import l.ypv;
import v.VFrame;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class p8y extends LiveMenuDialogHolder<ocy> {

    /* JADX INFO: renamed from: k */
    public VFrame f17069k;

    /* JADX INFO: renamed from: l */
    public HourBoardDialogTopAnimView f17070l;

    /* JADX INFO: renamed from: m */
    public TabLayout f17071m;

    /* JADX INFO: renamed from: n */
    public ImageView f17072n;

    /* JADX INFO: renamed from: o */
    public VPager f17073o;

    /* JADX INFO: renamed from: p */
    public gcy f17074p;

    public p8y(Act act, ocy ocyVar) {
        super(t6c0.f19651Q3, act, ocyVar, j2g0.m15579e(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m20135K(View view) {
        ((ocy) this.f3799b).m14203v3(ddv.z, t100.d(497.0f), 4100);
    }

    /* JADX INFO: renamed from: O */
    private void m20136O(List<hcy> list) {
        this.f17074p.m13723q(list);
        if (this.f17074p.getCount() <= 1) {
            this.f17071m.setSelectedTabIndicatorColor(16777215);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        return this.f17069k.getContext();
    }

    /* JADX INFO: renamed from: H */
    public final void m20137H(View view) {
        q8y.m21104a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public final void m20139L() {
        if (this.f17074p != null) {
            return;
        }
        gcy gcyVar = new gcy(null);
        this.f17074p = gcyVar;
        this.f17073o.setAdapter(gcyVar);
        this.f17073o.d(new C0744a());
    }

    /* JADX INFO: renamed from: M */
    public final void m20140M(boolean z) {
        HourBoardDialogTopAnimView hourBoardDialogTopAnimView = this.f17070l;
        if (!z) {
            hourBoardDialogTopAnimView.m8416F0(false);
        } else {
            hourBoardDialogTopAnimView.m8416F0(true);
            this.f17070l.m8420l0(false);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m20141N(int i) {
        m5211E();
        this.f17073o.setCurrentItem(i);
    }

    public Act act() {
        return ((ocy) this.f3799b).act();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: l */
    public void mo5213l() {
        m20136O(((ocy) this.f3799b).m19406b4());
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        m20137H(view);
        m5207A(80);
        m5222z(LiveDialogEnum.MEMBER);
        boolean zB7 = ypv.k().b7();
        this.f17073o.setScrollble(zB7);
        this.f17071m.setupWithViewPager(this.f17073o);
        this.f17071m.setTabIndicatorFullWidth(!zB7);
        xdl0.C0(this.f17069k, t100.d(zB7 ? 564.0f : 487.0f));
        this.f17070l.m8419k0();
        m20139L();
        xdl0.E0(this.f17072n, new View.OnClickListener() { // from class: l.o8y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f16441a.m20135K(view2);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo5219w() {
        super.mo5219w();
        if (NullChecker.a(this.f17070l)) {
            this.f17070l.m8418j0();
        }
    }

    /* JADX INFO: renamed from: l.p8y$a */
    public class C0744a implements ViewPager.j {
        public C0744a() {
        }

        public void onPageSelected(int i) {
            ((ocy) p8y.this.f3799b).m19409g4(i);
            xdl0.M(p8y.this.f17072n, i != 0 && uvr.d().u0() && uvr.d().s0() && !ypv.k().b7());
            p8y.this.m20140M(i == 2);
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(ocy ocyVar) {
    }
}
