package p149l;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AppealInfo;
import com.p046p1.mobile.putong.core.data.FakeGuideData;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderView;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderViewV2;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.IdentifyView;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.StateScrollVIew;
import com.p046p1.mobile.putong.core.p053ui.banner.view.PrivilegeEntranceView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import p147v.VFrame;
import p147v.VImage;
import p147v.VOnlineIndicator;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class x020 extends m740<m020> {

    /* JADX INFO: renamed from: b */
    public VNavigationBar f188907b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f188908c;

    /* JADX INFO: renamed from: d */
    public StateScrollVIew f188909d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f188910e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f188911f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f188912g;

    /* JADX INFO: renamed from: h */
    public m020 f188913h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f188914i;

    /* JADX INFO: renamed from: j */
    public VOnlineIndicator f188915j;

    /* JADX INFO: renamed from: k */
    public PrivilegeEntranceView f188916k;

    /* JADX INFO: renamed from: l */
    public NotifyHeaderView f188917l;

    /* JADX INFO: renamed from: m */
    public IdentifyView f188918m;

    /* JADX INFO: renamed from: n */
    public NotifyHeaderViewV2 f188919n;

    /* JADX INFO: renamed from: o */
    public int f188920o;

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m206541w(boolean z) {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(m020 m020Var) {
        this.f188913h = m020Var;
    }

    /* JADX INFO: renamed from: B */
    public Collection<? extends j760<String, d30>> m206545B() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f188913h.m152468i1().mo118744e0());
        arrayList.add(vwb.m200311Y("self look", new d30() { // from class: l.q020
            @Override // p149l.d30
            public final void call() {
                this.f151995a.m206552J();
            }
        }));
        arrayList.add(vwb.m200311Y("change style", new d30() { // from class: l.r020
            @Override // p149l.d30
            public final void call() {
                this.f157134a.m206553K();
            }
        }));
        arrayList.add(vwb.m200311Y("task tips", new d30() { // from class: l.s020
            @Override // p149l.d30
            public final void call() {
                this.f161715a.m206554L();
            }
        }));
        arrayList.add(vwb.m200311Y("task input loop : picture", new d30() { // from class: l.t020
            @Override // p149l.d30
            public final void call() {
                this.f167094a.m206555M();
            }
        }));
        arrayList.add(vwb.m200311Y("task input loop : signature", new d30() { // from class: l.u020
            @Override // p149l.d30
            public final void call() {
                this.f172823a.m206556N();
            }
        }));
        arrayList.add(vwb.m200311Y("task input loop : verification", new d30() { // from class: l.v020
            @Override // p149l.d30
            public final void call() {
                this.f179061a.m206557O();
            }
        }));
        return arrayList;
    }

    /* JADX INFO: renamed from: C */
    public final void m206546C(LayoutInflater layoutInflater) {
        if (upa.m194800p2() && (this.f188913h.m152469j1() instanceof oy10)) {
            ((oy10) this.f188913h.m152469j1()).m166605b(this.f188914i, new d30() { // from class: l.n020
                @Override // p149l.d30
                public final void call() {
                    this.f136461a.m206558P();
                }
            });
        }
        View viewInflateView = this.f188913h.m152469j1().inflateView(layoutInflater, this.f188912g);
        FrameLayout frameLayout = this.f188912g;
        if (viewInflateView != frameLayout) {
            frameLayout.addView(viewInflateView);
        }
    }

    @Override // p149l.rta0
    /* JADX INFO: renamed from: D1 */
    public void mo133487D1() {
        uh40 uh40VarM152470k1;
        this.f188913h.m152469j1().mo133487D1();
        if ((CoreModule.m29934N().mo60353fs() || CoreModule.m29934N().mo60365ko()) && this.f188913h.m152470k1() != null) {
            final uh40 uh40VarM152470k2 = this.f188913h.m152470k1();
            uh40VarM152470k2.m193698x0();
            e51.m114743H(act(), new Runnable() { // from class: l.o020
                @Override // java.lang.Runnable
                public final void run() {
                    this.f141279a.m206560R(uh40VarM152470k2);
                }
            }, this.f188920o);
        }
        m020 m020Var = this.f188913h;
        if (m020Var != null && (uh40VarM152470k1 = m020Var.m152470k1()) != null) {
            uh40VarM152470k1.m193647D1();
        }
        if (NullChecker.m81303a(this.f188916k)) {
            this.f188916k.m44401d(false);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: E */
    public final void m206547E(LayoutInflater layoutInflater) {
        IdentifyView identifyView = (IdentifyView) layoutInflater.inflate(f6c0.f96063w7, (ViewGroup) this.f188907b, false);
        this.f188918m = identifyView;
        this.f188907b.setLeftIconView(identifyView);
        if (upa.m194847z()) {
            this.f188918m.m43468k0();
            this.f188907b.setBackgroundColor(0);
        }
        VImage vImage = new VImage(m153340d().getContext());
        int i = x2c0.f190523rg;
        int iM186890d = t100.m186890d(32.0f);
        if (upa.m194665L3()) {
            i = upa.m194847z() ? x2c0.f190587tg : x2c0.f190555sg;
            iM186890d = t100.m186890d(36.0f);
        }
        vImage.setImageResource(i);
        VFrame vFrame = new VFrame(m153340d().getContext());
        vFrame.addView(vImage, new FrameLayout.LayoutParams(iM186890d, iM186890d));
        int i2 = t100.f167261j;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 53;
        VOnlineIndicator vOnlineIndicator = new VOnlineIndicator(m153340d().getContext());
        this.f188915j = vOnlineIndicator;
        vOnlineIndicator.setIndicatorStyle(1);
        vFrame.setPadding(20, 4, 8, 4);
        vFrame.addView(this.f188915j, layoutParams);
        this.f188907b.setRightIconViews(vFrame);
        xdl0.m208329E0(vFrame, new View.OnClickListener() { // from class: l.w020
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183701a.m206559Q(view);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final void m206548F(LayoutInflater layoutInflater) {
        NotifyHeaderViewV2 notifyHeaderViewV2 = (NotifyHeaderViewV2) layoutInflater.inflate(f6c0.f95338E7, (ViewGroup) this.f188908c, false);
        this.f188919n = notifyHeaderViewV2;
        this.f188908c.addView(notifyHeaderViewV2);
        this.f188919n.m43383d(this.f188913h);
        boolean zM194847z = upa.m194847z();
        FrameLayout frameLayout = this.f188908c;
        if (zM194847z) {
            xdl0.m208368c0(frameLayout, t100.f167256e);
        } else {
            xdl0.m208368c0(frameLayout, 0);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m206549G(LayoutInflater layoutInflater) {
        NotifyHeaderView notifyHeaderView = (NotifyHeaderView) layoutInflater.inflate(f6c0.f95370G7, (ViewGroup) this.f188908c, false);
        this.f188917l = notifyHeaderView;
        this.f188908c.addView(notifyHeaderView);
        this.f188917l.m43366h(this.f188913h);
        xdl0.m208368c0(this.f188908c, t100.f167256e);
    }

    /* JADX INFO: renamed from: H */
    public final void m206550H() {
        this.f188916k = new PrivilegeEntranceView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = t100.f167259h;
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        layoutParams.topMargin = -t100.f167255d;
        this.f188914i.addView(this.f188916k, layoutParams);
        this.f188916k.m44400c(act());
    }

    /* JADX INFO: renamed from: I */
    public final void m206551I(LayoutInflater layoutInflater) {
        LinearLayout linearLayout = new LinearLayout(m153340d().getContext());
        this.f188914i = linearLayout;
        linearLayout.setOrientation(1);
        this.f188914i.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f188914i.addView(this.f188913h.m152470k1().inflateView(layoutInflater, this.f188914i));
        this.f188911f.addView(this.f188914i);
        if (CoreModule.m29934N().mo60353fs()) {
            this.f188913h.m152470k1().m193691q0();
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m206552J() {
        this.f188913h.m152470k1().m193696v0();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m206553K() {
        this.f188913h.act().hideInput();
        this.f188913h.m152470k1().m193652H();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m206554L() {
        m153346l(this.f188907b.getRightIconContainer());
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m206555M() {
        j2e0.m139446m(this.f188913h.act(), Uri.parse("tantan://user_mirror?entry=picture"));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m206556N() {
        j2e0.m139446m(this.f188913h.act(), Uri.parse("tantan://user_mirror?entry=signature"));
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m206557O() {
        j2e0.m139446m(this.f188913h.act(), Uri.parse("tantan://user_mirror?entry=verification"));
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m206558P() {
        if (this.f188914i.getParent() == null) {
            this.f188911f.addView(this.f188914i);
        } else if (this.f188914i.getParent() != this.f188911f) {
            ((ViewGroup) this.f188914i.getParent()).removeView(this.f188914i);
            this.f188911f.addView(this.f188914i);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m206559Q(View view) {
        this.f188913h.m152462H1();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m206560R(uh40 uh40Var) {
        if (this.f131789a.isHidden()) {
            this.f188920o = 0;
        } else if (CoreModule.m29934N().mo60365ko()) {
            uh40Var.m193697w0();
        } else {
            uh40Var.m193694t0();
        }
    }

    /* JADX INFO: renamed from: S */
    public void m206561S() {
        NotifyHeaderView notifyHeaderView = this.f188917l;
        if (notifyHeaderView != null) {
            notifyHeaderView.m43371m();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m206562T(FakeGuideData fakeGuideData) {
        NotifyHeaderViewV2 notifyHeaderViewV2 = this.f188919n;
        if (notifyHeaderViewV2 != null) {
            notifyHeaderViewV2.m43385f(fakeGuideData);
        } else {
            this.f188917l.m43372n(fakeGuideData);
            this.f188917l.m43376r();
        }
    }

    /* JADX INFO: renamed from: U */
    public void m206563U() {
        NotifyHeaderView notifyHeaderView = this.f188917l;
        if (notifyHeaderView != null) {
            notifyHeaderView.m43373o();
        }
    }

    /* JADX INFO: renamed from: V */
    public void m206564V() {
        xdl0.m208362Z(this.f188907b);
    }

    /* JADX INFO: renamed from: W */
    public void m206565W(int i, boolean z) {
        if (i != 6) {
            return;
        }
        xdl0.m208344M(this.f188915j, z);
    }

    /* JADX INFO: renamed from: X */
    public void m206566X() {
        if (NullChecker.m81303a(this.f188907b) && NullChecker.m81303a(this.f188907b.getRightIconContainer())) {
            m153346l(this.f188907b.getRightIconContainer());
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m206567Y(boolean z, String str) {
        NotifyHeaderViewV2 notifyHeaderViewV2 = this.f188919n;
        if (notifyHeaderViewV2 != null) {
            notifyHeaderViewV2.m43386g(z, str);
        } else {
            this.f188917l.m43377s(z, str);
            this.f188917l.m43376r();
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m206568Z(j760<AppealInfo, User> j760Var) {
        NotifyHeaderViewV2 notifyHeaderViewV2 = this.f188919n;
        if (notifyHeaderViewV2 != null) {
            notifyHeaderViewV2.m43387h(j760Var);
        } else {
            this.f188917l.m43379u(j760Var);
            this.f188917l.m43376r();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m206569a0() {
        this.f188916k.m44403f();
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f188913h.m152469j1().destroy();
    }

    @Override // p149l.m740
    /* JADX INFO: renamed from: e */
    public View mo153341e() {
        return this.f188915j;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM206570z = m206570z(layoutInflater, viewGroup);
        m206547E(layoutInflater);
        if (upa.m194847z()) {
            m206548F(layoutInflater);
        } else {
            m206549G(layoutInflater);
        }
        m206551I(layoutInflater);
        m206550H();
        m206546C(layoutInflater);
        return viewM206570z;
    }

    @Override // p149l.rta0
    /* JADX INFO: renamed from: o */
    public boolean mo133498o() {
        return this.f188913h.m152469j1().mo133498o();
    }

    @Override // p149l.rta0
    /* JADX INFO: renamed from: r */
    public void mo133501r() {
        this.f188909d.setOnScrollStateListener(new StateScrollVIew.InterfaceC8233a() { // from class: l.p020
            @Override // com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.StateScrollVIew.InterfaceC8233a
            /* JADX INFO: renamed from: a */
            public final void mo43496a(boolean z) {
                x020.m206541w(z);
            }
        });
    }

    @Override // p149l.rta0
    /* JADX INFO: renamed from: x1 */
    public void mo166607x1() {
        super.mo166607x1();
        rta0 rta0VarM152469j1 = this.f188913h.m152469j1();
        if (rta0VarM152469j1 != null) {
            rta0VarM152469j1.mo166607x1();
        }
        if (NullChecker.m81303a(this.f188916k)) {
            this.f188916k.m44401d(true);
        }
    }

    @Override // p149l.rta0
    /* JADX INFO: renamed from: x2 */
    public void mo133503x2() {
        if (NullChecker.m81303a(this.f188916k)) {
            this.f188916k.m44401d(false);
        }
    }

    /* JADX INFO: renamed from: z */
    public View m206570z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return y020.m212029b(this, layoutInflater, viewGroup);
    }
}
