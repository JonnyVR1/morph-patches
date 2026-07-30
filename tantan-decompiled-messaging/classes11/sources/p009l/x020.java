package p009l;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderView;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderViewV2;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view.IdentifyView;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view.StateScrollVIew;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.AppealInfo;
import com.p1.mobile.putong.core.data.FakeGuideData;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import l.d30;
import l.e51;
import l.f6c0;
import l.j2e0;
import l.j760;
import l.t100;
import l.upa;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.y020;
import v.VFrame;
import v.VImage;
import v.VOnlineIndicator;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class x020 extends m740<m020> {

    /* JADX INFO: renamed from: b */
    public VNavigationBar f22373b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f22374c;

    /* JADX INFO: renamed from: d */
    public StateScrollVIew f22375d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f22376e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f22377f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f22378g;

    /* JADX INFO: renamed from: h */
    public m020 f22379h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f22380i;

    /* JADX INFO: renamed from: j */
    public VOnlineIndicator f22381j;

    /* JADX INFO: renamed from: k */
    public PrivilegeEntranceView f22382k;

    /* JADX INFO: renamed from: l */
    public NotifyHeaderView f22383l;

    /* JADX INFO: renamed from: m */
    public IdentifyView f22384m;

    /* JADX INFO: renamed from: n */
    public NotifyHeaderViewV2 f22385n;

    /* JADX INFO: renamed from: o */
    public int f22386o;

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m24604w(boolean z) {
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void m24633i1(m020 m020Var) {
        this.f22379h = m020Var;
    }

    /* JADX INFO: renamed from: B */
    public Collection<? extends j760<String, d30>> m24608B() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f22379h.m18194i1().mo14154e0());
        arrayList.add(vwb.Y("self look", new d30() { // from class: l.q020
            public final void call() {
                this.f18980a.m24615J();
            }
        }));
        arrayList.add(vwb.Y("change style", new d30() { // from class: l.r020
            public final void call() {
                this.f19601a.m24616K();
            }
        }));
        arrayList.add(vwb.Y("task tips", new d30() { // from class: l.s020
            public final void call() {
                this.f20044a.m24617L();
            }
        }));
        arrayList.add(vwb.Y("task input loop : picture", new d30() { // from class: l.t020
            public final void call() {
                this.f20506a.m24618M();
            }
        }));
        arrayList.add(vwb.Y("task input loop : signature", new d30() { // from class: l.u020
            public final void call() {
                this.f20942a.m24619N();
            }
        }));
        arrayList.add(vwb.Y("task input loop : verification", new d30() { // from class: l.v020
            public final void call() {
                this.f21404a.m24620O();
            }
        }));
        return arrayList;
    }

    /* JADX INFO: renamed from: C */
    public final void m24609C(LayoutInflater layoutInflater) {
        if (upa.p2() && (this.f22379h.m18195j1() instanceof oy10)) {
            ((oy10) this.f22379h.m18195j1()).m20044b(this.f22380i, new d30() { // from class: l.n020
                public final void call() {
                    this.f17171a.m24621P();
                }
            });
        }
        View viewInflateView = this.f22379h.m18195j1().inflateView(layoutInflater, this.f22378g);
        FrameLayout frameLayout = this.f22378g;
        if (viewInflateView != frameLayout) {
            frameLayout.addView(viewInflateView);
        }
    }

    @Override // p009l.rta0
    /* JADX INFO: renamed from: D1 */
    public void mo16014D1() {
        uh40 uh40VarM18196k1;
        this.f22379h.m18195j1().mo16014D1();
        if ((CoreModule.N().fs() || CoreModule.N().ko()) && this.f22379h.m18196k1() != null) {
            final uh40 uh40VarM18196k2 = this.f22379h.m18196k1();
            uh40VarM18196k2.m23020x0();
            e51.H(act(), new Runnable() { // from class: l.o020
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17789a.m24623R(uh40VarM18196k2);
                }
            }, this.f22386o);
        }
        m020 m020Var = this.f22379h;
        if (m020Var != null && (uh40VarM18196k1 = m020Var.m18196k1()) != null) {
            uh40VarM18196k1.m22968D1();
        }
        if (NullChecker.a(this.f22382k)) {
            this.f22382k.d(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View, com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.IdentifyView] */
    /* JADX INFO: renamed from: E */
    public final void m24610E(LayoutInflater layoutInflater) {
        ?? r7 = (IdentifyView) layoutInflater.inflate(f6c0.w7, (ViewGroup) this.f22373b, false);
        this.f22384m = r7;
        this.f22373b.setLeftIconView((View) r7);
        if (upa.z()) {
            this.f22384m.m7714k0();
            this.f22373b.setBackgroundColor(0);
        }
        View vImage = new VImage(m18286d().getContext());
        int i = x2c0.rg;
        int iD = t100.d(32.0f);
        if (upa.L3()) {
            i = upa.z() ? x2c0.tg : x2c0.sg;
            iD = t100.d(36.0f);
        }
        vImage.setImageResource(i);
        VFrame vFrame = new VFrame(m18286d().getContext());
        vFrame.addView(vImage, new FrameLayout.LayoutParams(iD, iD));
        int i2 = t100.j;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 53;
        VOnlineIndicator vOnlineIndicator = new VOnlineIndicator(m18286d().getContext());
        this.f22381j = vOnlineIndicator;
        vOnlineIndicator.setIndicatorStyle(1);
        vFrame.setPadding(20, 4, 8, 4);
        vFrame.addView(this.f22381j, layoutParams);
        this.f22373b.setRightIconViews(new View[]{vFrame});
        xdl0.E0(vFrame, new View.OnClickListener() { // from class: l.w020
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21829a.m24622Q(view);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final void m24611F(LayoutInflater layoutInflater) {
        NotifyHeaderViewV2 notifyHeaderViewV2 = (NotifyHeaderViewV2) layoutInflater.inflate(f6c0.E7, (ViewGroup) this.f22374c, false);
        this.f22385n = notifyHeaderViewV2;
        this.f22374c.addView(notifyHeaderViewV2);
        this.f22385n.m7610d(this.f22379h);
        boolean z = upa.z();
        FrameLayout frameLayout = this.f22374c;
        if (z) {
            xdl0.c0(frameLayout, t100.e);
        } else {
            xdl0.c0(frameLayout, 0);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m24612G(LayoutInflater layoutInflater) {
        NotifyHeaderView notifyHeaderView = (NotifyHeaderView) layoutInflater.inflate(f6c0.G7, (ViewGroup) this.f22374c, false);
        this.f22383l = notifyHeaderView;
        this.f22374c.addView(notifyHeaderView);
        this.f22383l.m7593h(this.f22379h);
        xdl0.c0(this.f22374c, t100.e);
    }

    /* JADX INFO: renamed from: H */
    public final void m24613H() {
        this.f22382k = new PrivilegeEntranceView(m18285C0());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = t100.h;
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        layoutParams.topMargin = -t100.d;
        this.f22380i.addView((View) this.f22382k, (ViewGroup.LayoutParams) layoutParams);
        this.f22382k.c(act());
    }

    /* JADX INFO: renamed from: I */
    public final void m24614I(LayoutInflater layoutInflater) {
        LinearLayout linearLayout = new LinearLayout(m18286d().getContext());
        this.f22380i = linearLayout;
        linearLayout.setOrientation(1);
        this.f22380i.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f22380i.addView(this.f22379h.m18196k1().inflateView(layoutInflater, this.f22380i));
        this.f22377f.addView(this.f22380i);
        if (CoreModule.N().fs()) {
            this.f22379h.m18196k1().m23013q0();
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m24615J() {
        this.f22379h.m18196k1().m23018v0();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m24616K() {
        this.f22379h.act().hideInput();
        this.f22379h.m18196k1().m22973H();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m24617L() {
        m18292l(this.f22373b.getRightIconContainer());
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m24618M() {
        j2e0.m(this.f22379h.act(), Uri.parse("tantan://user_mirror?entry=picture"));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m24619N() {
        j2e0.m(this.f22379h.act(), Uri.parse("tantan://user_mirror?entry=signature"));
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m24620O() {
        j2e0.m(this.f22379h.act(), Uri.parse("tantan://user_mirror?entry=verification"));
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m24621P() {
        if (this.f22380i.getParent() == null) {
            this.f22377f.addView(this.f22380i);
        } else if (this.f22380i.getParent() != this.f22377f) {
            ((ViewGroup) this.f22380i.getParent()).removeView(this.f22380i);
            this.f22377f.addView(this.f22380i);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m24622Q(View view) {
        this.f22379h.m18187H1();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m24623R(uh40 uh40Var) {
        if (this.f16743a.isHidden()) {
            this.f22386o = 0;
        } else if (CoreModule.N().ko()) {
            uh40Var.m23019w0();
        } else {
            uh40Var.m23016t0();
        }
    }

    /* JADX INFO: renamed from: S */
    public void m24624S() {
        NotifyHeaderView notifyHeaderView = this.f22383l;
        if (notifyHeaderView != null) {
            notifyHeaderView.m7598m();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m24625T(FakeGuideData fakeGuideData) {
        NotifyHeaderViewV2 notifyHeaderViewV2 = this.f22385n;
        if (notifyHeaderViewV2 != null) {
            notifyHeaderViewV2.m7612f(fakeGuideData);
        } else {
            this.f22383l.m7599n(fakeGuideData);
            this.f22383l.m7603r();
        }
    }

    /* JADX INFO: renamed from: U */
    public void m24626U() {
        NotifyHeaderView notifyHeaderView = this.f22383l;
        if (notifyHeaderView != null) {
            notifyHeaderView.m7600o();
        }
    }

    /* JADX INFO: renamed from: V */
    public void m24627V() {
        xdl0.Z(new View[]{this.f22373b});
    }

    /* JADX INFO: renamed from: W */
    public void m24628W(int i, boolean z) {
        if (i != 6) {
            return;
        }
        xdl0.M(this.f22381j, z);
    }

    /* JADX INFO: renamed from: X */
    public void m24629X() {
        if (NullChecker.a(this.f22373b) && NullChecker.a(this.f22373b.getRightIconContainer())) {
            m18292l(this.f22373b.getRightIconContainer());
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m24630Y(boolean z, String str) {
        NotifyHeaderViewV2 notifyHeaderViewV2 = this.f22385n;
        if (notifyHeaderViewV2 != null) {
            notifyHeaderViewV2.m7613g(z, str);
        } else {
            this.f22383l.m7604s(z, str);
            this.f22383l.m7603r();
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m24631Z(j760<AppealInfo, User> j760Var) {
        NotifyHeaderViewV2 notifyHeaderViewV2 = this.f22385n;
        if (notifyHeaderViewV2 != null) {
            notifyHeaderViewV2.m7614h(j760Var);
        } else {
            this.f22383l.m7606u(j760Var);
            this.f22383l.m7603r();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m24632a0() {
        this.f22382k.f();
    }

    public void destroy() {
        this.f22379h.m18195j1().destroy();
    }

    @Override // p009l.m740
    /* JADX INFO: renamed from: e */
    public View mo18287e() {
        return this.f22381j;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM24634z = m24634z(layoutInflater, viewGroup);
        m24610E(layoutInflater);
        if (upa.z()) {
            m24611F(layoutInflater);
        } else {
            m24612G(layoutInflater);
        }
        m24614I(layoutInflater);
        m24613H();
        m24609C(layoutInflater);
        return viewM24634z;
    }

    @Override // p009l.rta0
    /* JADX INFO: renamed from: o */
    public boolean mo16026o() {
        return this.f22379h.m18195j1().mo16026o();
    }

    @Override // p009l.rta0
    /* JADX INFO: renamed from: r */
    public void mo16029r() {
        this.f22375d.setOnScrollStateListener(new StateScrollVIew.InterfaceC0397a() { // from class: l.p020
            @Override // com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view.StateScrollVIew.InterfaceC0397a
            /* JADX INFO: renamed from: a */
            public final void mo7742a(boolean z) {
                x020.m24604w(z);
            }
        });
    }

    @Override // p009l.rta0
    /* JADX INFO: renamed from: x1 */
    public void mo20047x1() {
        super.mo20047x1();
        rta0 rta0VarM18195j1 = this.f22379h.m18195j1();
        if (rta0VarM18195j1 != null) {
            rta0VarM18195j1.mo20047x1();
        }
        if (NullChecker.a(this.f22382k)) {
            this.f22382k.d(true);
        }
    }

    @Override // p009l.rta0
    /* JADX INFO: renamed from: x2 */
    public void mo16031x2() {
        if (NullChecker.a(this.f22382k)) {
            this.f22382k.d(false);
        }
    }

    /* JADX INFO: renamed from: z */
    public View m24634z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return y020.b(this, layoutInflater, viewGroup);
    }
}
