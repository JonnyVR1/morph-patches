package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogTopAnimView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VFrame;
import p151v.VPager;

/* JADX INFO: loaded from: classes4.dex */
public class mhy extends LiveMenuDialogHolder<lly> {

    /* JADX INFO: renamed from: k */
    public VFrame f136899k;

    /* JADX INFO: renamed from: l */
    public HourBoardDialogTopAnimView f136900l;

    /* JADX INFO: renamed from: m */
    public TabLayout f136901m;

    /* JADX INFO: renamed from: n */
    public ImageView f136902n;

    /* JADX INFO: renamed from: o */
    public VPager f136903o;

    /* JADX INFO: renamed from: p */
    public dly f136904p;

    public mhy(Act act, lly llyVar) {
        super(yec0.f198887Q3, act, llyVar, qag0.m175924e(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m158444K(View view) {
        ((lly) this.f48605b).m138875v3(efv.f93869z, qa00.m175859d(497.0f), 4100);
    }

    /* JADX INFO: renamed from: O */
    private void m158445O(List<ely> list) {
        this.f136904p.m116909q(list);
        if (this.f136904p.getCount() <= 1) {
            this.f136901m.setSelectedTabIndicatorColor(16777215);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f136899k.getContext();
    }

    /* JADX INFO: renamed from: H */
    public final void m158446H(View view) {
        nhy.m163255a(this, view);
    }

    /* JADX INFO: renamed from: L */
    public final void m158448L() {
        if (this.f136904p != null) {
            return;
        }
        dly dlyVar = new dly(null);
        this.f136904p = dlyVar;
        this.f136903o.setAdapter(dlyVar);
        this.f136903o.m4187d(new C18617a());
    }

    /* JADX INFO: renamed from: M */
    public final void m158449M(boolean z) {
        HourBoardDialogTopAnimView hourBoardDialogTopAnimView = this.f136900l;
        if (!z) {
            hourBoardDialogTopAnimView.m76000F0(false);
        } else {
            hourBoardDialogTopAnimView.m76000F0(true);
            this.f136900l.m76004l0(false);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m158450N(int i) {
        m73017E();
        this.f136903o.setCurrentItem(i);
    }

    @Override // p153l.iam
    public Act act() {
        return ((lly) this.f48605b).act();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: l */
    public void mo73018l() {
        m158445O(((lly) this.f48605b).m154820b4());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        m158446H(view);
        m73014A(80);
        m73027z(LiveDialogEnum.MEMBER);
        boolean zM203589b7 = zrv.m221193k().m203589b7();
        this.f136903o.setScrollble(zM203589b7);
        this.f136901m.setupWithViewPager(this.f136903o);
        this.f136901m.setTabIndicatorFullWidth(!zM203589b7);
        bnl0.m105505C0(this.f136899k, qa00.m175859d(zM203589b7 ? 564.0f : 487.0f));
        this.f136900l.m76003k0();
        m158448L();
        bnl0.m105509E0(this.f136902n, new View.OnClickListener() { // from class: l.lhy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f132160a.m158444K(view2);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo73024w() {
        super.mo73024w();
        if (NullChecker.m82486a(this.f136900l)) {
            this.f136900l.m76002j0();
        }
    }

    /* JADX INFO: renamed from: l.mhy$a */
    public class C18617a implements ViewPager.InterfaceC0718j {
        public C18617a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            ((lly) mhy.this.f48605b).m154823g4(i);
            bnl0.m105524M(mhy.this.f136902n, i != 0 && vxr.m203876d().m171026u0() && vxr.m203876d().m171022s0() && !zrv.m221193k().m203589b7());
            mhy.this.m158449M(i == 2);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(lly llyVar) {
    }
}
