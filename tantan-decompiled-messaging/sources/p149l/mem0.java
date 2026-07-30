package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.List;
import java.util.Objects;
import p147v.VLinear;
import p147v.VPagerNoPage;

/* JADX INFO: loaded from: classes5.dex */
public class mem0 extends LiveMenuDialogHolder<zem0> {

    /* JADX INFO: renamed from: k */
    public VLinear f133453k;

    /* JADX INFO: renamed from: l */
    public TabLayout f133454l;

    /* JADX INFO: renamed from: m */
    public ImageView f133455m;

    /* JADX INFO: renamed from: n */
    public VPagerNoPage f133456n;

    /* JADX INFO: renamed from: o */
    public afm0 f133457o;

    /* JADX INFO: renamed from: p */
    public String f133458p;

    /* JADX INFO: renamed from: q */
    public tpd0 f133459q;

    public mem0(Act act, zem0 zem0Var) {
        super(t6c0.f168552v7, act, zem0Var, j2g0.m139458e(true));
        this.f133459q = new tpd0("voice_rest_tips_count" + ypv.f199493a.m199309D0(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m154261N(View view) {
        m154267M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m154262O(View view) {
        ((zem0) this.f47757b).m218378q4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m154263P(View view) {
        new xh0.C21150a(act()).m208740s("").m208731j(act().getString(R$string.f47221ej)).m208739r(act().getString(R$string.f47423o2)).m208729h(false).m208736o(new View.OnClickListener() { // from class: l.lem0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f127726a.m154262O(view2);
            }
        }).m208727f(act().getString(R$string.f46842N1)).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: V */
    private void m154264V(List<bfm0> list) {
        this.f133457o.m96258q(list);
        if (this.f133457o.getCount() <= 1) {
            this.f133454l.setSelectedTabIndicatorColor(16777215);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f133453k.getContext();
    }

    /* JADX INFO: renamed from: J */
    public final void m154265J(View view) {
        nem0.m159120a(this, view);
    }

    /* JADX INFO: renamed from: M */
    public final void m154267M() {
        if (((zem0) this.f47757b).m218372j4() && this.f133459q.get().intValue() <= 2) {
            ptk ptkVarM171332h = ptk.m171332h();
            String str = this.f133458p;
            if (str != null) {
                ptkVarM171332h.m171343q(str, false);
            }
            jtk jtkVarM143128t = new jtk(this.f47760e).m143129u(act().getString(R$string.f47199dj)).m143113e(act().getResources().getColor(h1c0.f105394p0)).m143119k(true).m143128t(13);
            int i = t100.f167260i;
            jtk jtkVarM143117i = jtkVarM143128t.m143124p(i).m143127s(i, i, i, i).m143130v(true).m143125q(act().getResources().getColor(h1c0.f105362e1)).m143109a(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m143121m(xdl0.m208412y0() / 3).m143117i(jtk.f119617D);
            Objects.requireNonNull(ptkVarM171332h);
            this.f133458p = ptkVarM171332h.m171346t(jtkVarM143117i.m143110b(new v24(ptkVarM171332h)).m143112d(new jtk.InterfaceC17857b() { // from class: l.kem0
                @Override // p149l.jtk.InterfaceC17857b
                /* JADX INFO: renamed from: a */
                public final void mo135260a(String str2) {
                    this.f122721a.m154268Q(str2);
                }
            }), this.f133455m);
            tpd0 tpd0Var = this.f133459q;
            tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m154268Q(String str) {
        this.f133458p = null;
    }

    /* JADX INFO: renamed from: R */
    public final void m154269R() {
        if (this.f133457o != null) {
            return;
        }
        afm0 afm0Var = new afm0(null);
        this.f133457o = afm0Var;
        this.f133456n.setAdapter(afm0Var);
        this.f133456n.m4185d(new C18447a());
    }

    /* JADX INFO: renamed from: S */
    public void m154270S(boolean z) {
        xdl0.m208344M(this.f133455m, z);
    }

    /* JADX INFO: renamed from: T */
    public void m154271T(boolean z) {
        this.f133454l.setSelectedTabIndicator(z ? i3c0.f110677D3 : i3c0.f110665C3);
        this.f133454l.setTabTextColors(-2130706433, z ? -855638017 : -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    public void m154272U(int i) {
        m71834E();
        m154271T(x4s.m207012b(((nnn0) ((zem0) this.f47757b).m206027E2()).mo149813j().liveMode));
        this.f133456n.setCurrentItem(i != 1 ? 0 : 1);
    }

    @Override // p149l.s7m
    public Act act() {
        return ((zem0) this.f47757b).act();
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
        m154264V(((zem0) this.f47757b).m218371i4());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        m154265J(view);
        m71831A(80);
        m71844z(LiveDialogEnum.MEMBER);
        this.f133454l.setupWithViewPager(this.f133456n);
        m154269R();
        m71833C(new e30() { // from class: l.iem0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112814a.m154261N((View) obj);
            }
        });
        xdl0.m208329E0(this.f133455m, new View.OnClickListener() { // from class: l.jem0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f117587a.m154263P(view2);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: x */
    public void mo71842x() {
        super.mo71842x();
        m154270S(((zem0) this.f47757b).m218372j4());
    }

    /* JADX INFO: renamed from: l.mem0$a */
    public class C18447a implements ViewPager.InterfaceC0716j {
        public C18447a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            ((zem0) mem0.this.f47757b).m218380s4(i == 0 ? 0 : 1);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(zem0 zem0Var) {
    }
}
