package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.List;
import java.util.Objects;
import p151v.VLinear;
import p151v.VPagerNoPage;

/* JADX INFO: loaded from: classes5.dex */
public class qnm0 extends LiveMenuDialogHolder<dom0> {

    /* JADX INFO: renamed from: k */
    public VLinear f158498k;

    /* JADX INFO: renamed from: l */
    public TabLayout f158499l;

    /* JADX INFO: renamed from: m */
    public ImageView f158500m;

    /* JADX INFO: renamed from: n */
    public VPagerNoPage f158501n;

    /* JADX INFO: renamed from: o */
    public eom0 f158502o;

    /* JADX INFO: renamed from: p */
    public String f158503p;

    /* JADX INFO: renamed from: q */
    public vxd0 f158504q;

    public qnm0(Act act, dom0 dom0Var) {
        super(yec0.f199284v7, act, dom0Var, qag0.m175924e(true));
        this.f158504q = new vxd0("voice_rest_tips_count" + zrv.f205799a.m207631D0(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m177237N(View view) {
        m177243M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m177238O(View view) {
        ((dom0) this.f48605b).m117330q4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m177239P(View view) {
        new th0.C20312a(act()).m191160s("").m191151j(act().getString(R$string.f48069ej)).m191159r(act().getString(R$string.f48271o2)).m191149h(false).m191156o(new View.OnClickListener() { // from class: l.pnm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f153315a.m177238O(view2);
            }
        }).m191147f(act().getString(R$string.f47690N1)).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: V */
    private void m177240V(List<fom0> list) {
        this.f158502o.m121754q(list);
        if (this.f158502o.getCount() <= 1) {
            this.f158499l.setSelectedTabIndicatorColor(16777215);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f158498k.getContext();
    }

    /* JADX INFO: renamed from: J */
    public final void m177241J(View view) {
        rnm0.m182319a(this, view);
    }

    /* JADX INFO: renamed from: M */
    public final void m177243M() {
        if (((dom0) this.f48605b).m117324j4() && this.f158504q.get().intValue() <= 2) {
            fwk fwkVarM127777h = fwk.m127777h();
            String str = this.f158503p;
            if (str != null) {
                fwkVarM127777h.m127788q(str, false);
            }
            zvk zvkVarM221775t = new zvk(this.f48608e).m221776u(act().getString(R$string.f48047dj)).m221760e(act().getResources().getColor(n9c0.f140855p0)).m221766k(true).m221775t(13);
            int i = qa00.f156322i;
            zvk zvkVarM221764i = zvkVarM221775t.m221771p(i).m221774s(i, i, i, i).m221777v(true).m221772q(act().getResources().getColor(n9c0.f140823e1)).m221756a(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m221768m(bnl0.m105592y0() / 3).m221764i(zvk.f206227D);
            Objects.requireNonNull(fwkVarM127777h);
            this.f158503p = fwkVarM127777h.m127791t(zvkVarM221764i.m221757b(new u34(fwkVarM127777h)).m221759d(new zvk.InterfaceC21906b() { // from class: l.onm0
                @Override // p153l.zvk.InterfaceC21906b
                /* JADX INFO: renamed from: a */
                public final void mo96261a(String str2) {
                    this.f148097a.m177244Q(str2);
                }
            }), this.f158500m);
            vxd0 vxd0Var = this.f158504q;
            vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m177244Q(String str) {
        this.f158503p = null;
    }

    /* JADX INFO: renamed from: R */
    public final void m177245R() {
        if (this.f158502o != null) {
            return;
        }
        eom0 eom0Var = new eom0(null);
        this.f158502o = eom0Var;
        this.f158501n.setAdapter(eom0Var);
        this.f158501n.m4187d(new C19608a());
    }

    /* JADX INFO: renamed from: S */
    public void m177246S(boolean z) {
        bnl0.m105524M(this.f158500m, z);
    }

    /* JADX INFO: renamed from: T */
    public void m177247T(boolean z) {
        this.f158499l.setSelectedTabIndicator(z ? obc0.f146005D3 : obc0.f145993C3);
        this.f158499l.setTabTextColors(-2130706433, z ? -855638017 : -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    public void m177248U(int i) {
        m73017E();
        m177247T(y6s.m214494b(((rwn0) ((dom0) this.f48605b).m213810E2()).mo183435j().liveMode));
        this.f158501n.setCurrentItem(i != 1 ? 0 : 1);
    }

    @Override // p153l.iam
    public Act act() {
        return ((dom0) this.f48605b).act();
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
        m177240V(((dom0) this.f48605b).m117323i4());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        m177241J(view);
        m73014A(80);
        m73027z(LiveDialogEnum.MEMBER);
        this.f158499l.setupWithViewPager(this.f158501n);
        m177245R();
        m73016C(new y20() { // from class: l.mnm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137714a.m177237N((View) obj);
            }
        });
        bnl0.m105509E0(this.f158500m, new View.OnClickListener() { // from class: l.nnm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f142808a.m177239P(view2);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: x */
    public void mo73025x() {
        super.mo73025x();
        m177246S(((dom0) this.f48605b).m117324j4());
    }

    /* JADX INFO: renamed from: l.qnm0$a */
    public class C19608a implements ViewPager.InterfaceC0718j {
        public C19608a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            ((dom0) qnm0.this.f48605b).m117332s4(i == 0 ? 0 : 1);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(dom0 dom0Var) {
    }
}
