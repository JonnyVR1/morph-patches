package p153l;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AppealInfo;
import com.p051p1.mobile.putong.core.data.FakeGuideData;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderView;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderViewV2;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.IdentifyView;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.StateScrollVIew;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import p151v.VFrame;
import p151v.VImage;
import p151v.VOnlineIndicator;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class f920 extends ag40<u820> {

    /* JADX INFO: renamed from: b */
    public VNavigationBar f97800b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f97801c;

    /* JADX INFO: renamed from: d */
    public StateScrollVIew f97802d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f97803e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f97804f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f97805g;

    /* JADX INFO: renamed from: h */
    public u820 f97806h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f97807i;

    /* JADX INFO: renamed from: j */
    public VOnlineIndicator f97808j;

    /* JADX INFO: renamed from: k */
    public PrivilegeEntranceView f97809k;

    /* JADX INFO: renamed from: l */
    public NotifyHeaderView f97810l;

    /* JADX INFO: renamed from: m */
    public IdentifyView f97811m;

    /* JADX INFO: renamed from: n */
    public NotifyHeaderViewV2 f97812n;

    /* JADX INFO: renamed from: o */
    public int f97813o;

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m124595w(boolean z) {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(u820 u820Var) {
        this.f97806h = u820Var;
    }

    /* JADX INFO: renamed from: B */
    public Collection<? extends pf60<String, x20>> m124599B() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f97806h.m194966i1().mo157170e0());
        arrayList.add(jyb.m147494Y("self look", new x20() { // from class: l.y820
            @Override // p153l.x20
            public final void call() {
                this.f197936a.m124606J();
            }
        }));
        arrayList.add(jyb.m147494Y("change style", new x20() { // from class: l.z820
            @Override // p153l.x20
            public final void call() {
                this.f203302a.m124607K();
            }
        }));
        arrayList.add(jyb.m147494Y("task tips", new x20() { // from class: l.a920
            @Override // p153l.x20
            public final void call() {
                this.f68982a.m124608L();
            }
        }));
        arrayList.add(jyb.m147494Y("task input loop : picture", new x20() { // from class: l.b920
            @Override // p153l.x20
            public final void call() {
                this.f75502a.m124609M();
            }
        }));
        arrayList.add(jyb.m147494Y("task input loop : signature", new x20() { // from class: l.c920
            @Override // p153l.x20
            public final void call() {
                this.f80282a.m124610N();
            }
        }));
        arrayList.add(jyb.m147494Y("task input loop : verification", new x20() { // from class: l.d920
            @Override // p153l.x20
            public final void call() {
                this.f85706a.m124611O();
            }
        }));
        return arrayList;
    }

    /* JADX INFO: renamed from: C */
    public final void m124600C(LayoutInflater layoutInflater) {
        if (gra.m131731p2() && (this.f97806h.m194967j1() instanceof w620)) {
            ((w620) this.f97806h.m194967j1()).m205078b(this.f97807i, new x20() { // from class: l.v820
                @Override // p153l.x20
                public final void call() {
                    this.f182845a.m124612P();
                }
            });
        }
        View viewInflateView = this.f97806h.m194967j1().inflateView(layoutInflater, this.f97805g);
        FrameLayout frameLayout = this.f97805g;
        if (viewInflateView != frameLayout) {
            frameLayout.addView(viewInflateView);
        }
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: D1 */
    public void mo44371D1() {
        iq40 iq40VarM194968k1;
        this.f97806h.m194967j1().mo44371D1();
        if ((CoreModule.m30932N().mo61537fs() || CoreModule.m30932N().mo61549ko()) && this.f97806h.m194968k1() != null) {
            final iq40 iq40VarM194968k2 = this.f97806h.m194968k1();
            iq40VarM194968k2.m141646x0();
            l51.m152888H(act(), new Runnable() { // from class: l.w820
                @Override // java.lang.Runnable
                public final void run() {
                    this.f187823a.m124614R(iq40VarM194968k2);
                }
            }, this.f97813o);
        }
        u820 u820Var = this.f97806h;
        if (u820Var != null && (iq40VarM194968k1 = u820Var.m194968k1()) != null) {
            iq40VarM194968k1.m141595D1();
        }
        if (NullChecker.m82486a(this.f97809k)) {
            this.f97809k.m45584d(false);
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
    public final void m124601E(LayoutInflater layoutInflater) {
        IdentifyView identifyView = (IdentifyView) layoutInflater.inflate(kec0.f125374D7, (ViewGroup) this.f97800b, false);
        this.f97811m = identifyView;
        this.f97800b.setLeftIconView(identifyView);
        if (gra.m131778z()) {
            this.f97811m.m44654k0();
            this.f97800b.setBackgroundColor(0);
        }
        VImage vImage = new VImage(m97580d().getContext());
        int i = dbc0.f86990fh;
        int iM175859d = qa00.m175859d(32.0f);
        if (gra.m131596L3()) {
            i = gra.m131778z() ? dbc0.f87056hh : dbc0.f87023gh;
            iM175859d = qa00.m175859d(36.0f);
        }
        vImage.setImageResource(i);
        VFrame vFrame = new VFrame(m97580d().getContext());
        vFrame.addView(vImage, new FrameLayout.LayoutParams(iM175859d, iM175859d));
        int i2 = qa00.f156323j;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 53;
        VOnlineIndicator vOnlineIndicator = new VOnlineIndicator(m97580d().getContext());
        this.f97808j = vOnlineIndicator;
        vOnlineIndicator.setIndicatorStyle(1);
        vFrame.setPadding(20, 4, 8, 4);
        vFrame.addView(this.f97808j, layoutParams);
        this.f97800b.setRightIconViews(vFrame);
        bnl0.m105509E0(vFrame, new View.OnClickListener() { // from class: l.e920
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92585a.m124613Q(view);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final void m124602F(LayoutInflater layoutInflater) {
        NotifyHeaderViewV2 notifyHeaderViewV2 = (NotifyHeaderViewV2) layoutInflater.inflate(kec0.f125504L7, (ViewGroup) this.f97801c, false);
        this.f97812n = notifyHeaderViewV2;
        this.f97801c.addView(notifyHeaderViewV2);
        this.f97812n.m44569d(this.f97806h);
        boolean zM131778z = gra.m131778z();
        FrameLayout frameLayout = this.f97801c;
        if (zM131778z) {
            bnl0.m105548c0(frameLayout, qa00.f156318e);
        } else {
            bnl0.m105548c0(frameLayout, 0);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m124603G(LayoutInflater layoutInflater) {
        NotifyHeaderView notifyHeaderView = (NotifyHeaderView) layoutInflater.inflate(kec0.f125536N7, (ViewGroup) this.f97801c, false);
        this.f97810l = notifyHeaderView;
        this.f97801c.addView(notifyHeaderView);
        this.f97810l.m44552h(this.f97806h);
        bnl0.m105548c0(this.f97801c, qa00.f156318e);
    }

    /* JADX INFO: renamed from: H */
    public final void m124604H() {
        this.f97809k = new PrivilegeEntranceView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = qa00.f156321h;
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        layoutParams.topMargin = -qa00.f156317d;
        this.f97807i.addView(this.f97809k, layoutParams);
        this.f97809k.m45583c(act());
    }

    /* JADX INFO: renamed from: I */
    public final void m124605I(LayoutInflater layoutInflater) {
        LinearLayout linearLayout = new LinearLayout(m97580d().getContext());
        this.f97807i = linearLayout;
        linearLayout.setOrientation(1);
        this.f97807i.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f97807i.addView(this.f97806h.m194968k1().inflateView(layoutInflater, this.f97807i));
        this.f97804f.addView(this.f97807i);
        if (CoreModule.m30932N().mo61537fs()) {
            this.f97806h.m194968k1().m141639q0();
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m124606J() {
        this.f97806h.m194968k1().m141644v0();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m124607K() {
        this.f97806h.act().hideInput();
        this.f97806h.m194968k1().m141600H();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m124608L() {
        m97586l(this.f97800b.getRightIconContainer());
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m124609M() {
        nae0.m162083m(this.f97806h.act(), Uri.parse("tantan://user_mirror?entry=picture"));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m124610N() {
        nae0.m162083m(this.f97806h.act(), Uri.parse("tantan://user_mirror?entry=signature"));
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m124611O() {
        nae0.m162083m(this.f97806h.act(), Uri.parse("tantan://user_mirror?entry=verification"));
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m124612P() {
        if (this.f97807i.getParent() == null) {
            this.f97804f.addView(this.f97807i);
        } else if (this.f97807i.getParent() != this.f97804f) {
            ((ViewGroup) this.f97807i.getParent()).removeView(this.f97807i);
            this.f97804f.addView(this.f97807i);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m124613Q(View view) {
        this.f97806h.m194961H1();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m124614R(iq40 iq40Var) {
        if (this.f71083a.isHidden()) {
            this.f97813o = 0;
        } else if (CoreModule.m30932N().mo61549ko()) {
            iq40Var.m141645w0();
        } else {
            iq40Var.m141642t0();
        }
    }

    /* JADX INFO: renamed from: S */
    public void m124615S() {
        NotifyHeaderView notifyHeaderView = this.f97810l;
        if (notifyHeaderView != null) {
            notifyHeaderView.m44557m();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m124616T(FakeGuideData fakeGuideData) {
        NotifyHeaderViewV2 notifyHeaderViewV2 = this.f97812n;
        if (notifyHeaderViewV2 != null) {
            notifyHeaderViewV2.m44571f(fakeGuideData);
        } else {
            this.f97810l.m44558n(fakeGuideData);
            this.f97810l.m44562r();
        }
    }

    /* JADX INFO: renamed from: U */
    public void m124617U() {
        NotifyHeaderView notifyHeaderView = this.f97810l;
        if (notifyHeaderView != null) {
            notifyHeaderView.m44559o();
        }
    }

    /* JADX INFO: renamed from: V */
    public void m124618V() {
        bnl0.m105542Z(this.f97800b);
    }

    /* JADX INFO: renamed from: W */
    public void m124619W(int i, boolean z) {
        if (i != 6) {
            return;
        }
        bnl0.m105524M(this.f97808j, z);
    }

    /* JADX INFO: renamed from: X */
    public void m124620X() {
        if (NullChecker.m82486a(this.f97800b) && NullChecker.m82486a(this.f97800b.getRightIconContainer())) {
            m97586l(this.f97800b.getRightIconContainer());
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m124621Y(boolean z, String str) {
        NotifyHeaderViewV2 notifyHeaderViewV2 = this.f97812n;
        if (notifyHeaderViewV2 != null) {
            notifyHeaderViewV2.m44572g(z, str);
        } else {
            this.f97810l.m44563s(z, str);
            this.f97810l.m44562r();
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m124622Z(pf60<AppealInfo, User> pf60Var) {
        NotifyHeaderViewV2 notifyHeaderViewV2 = this.f97812n;
        if (notifyHeaderViewV2 != null) {
            notifyHeaderViewV2.m44573h(pf60Var);
        } else {
            this.f97810l.m44565u(pf60Var);
            this.f97810l.m44562r();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m124623a0() {
        this.f97809k.m45586f();
    }

    @Override // p153l.iam
    public void destroy() {
        this.f97806h.m194967j1().destroy();
    }

    @Override // p153l.ag40
    /* JADX INFO: renamed from: e */
    public View mo97581e() {
        return this.f97808j;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM124625z = m124625z(layoutInflater, viewGroup);
        m124601E(layoutInflater);
        if (gra.m131778z()) {
            m124602F(layoutInflater);
        } else {
            m124603G(layoutInflater);
        }
        m124605I(layoutInflater);
        m124604H();
        m124600C(layoutInflater);
        return viewM124625z;
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: o */
    public boolean mo44445o() {
        return this.f97806h.m194967j1().mo44445o();
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: r */
    public void mo44452r() {
        this.f97802d.setOnScrollStateListener(new StateScrollVIew.InterfaceC8396a() { // from class: l.x820
            @Override // com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.StateScrollVIew.InterfaceC8396a
            /* JADX INFO: renamed from: a */
            public final void mo44682a(boolean z) {
                f920.m124595w(z);
            }
        });
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: x1 */
    public void mo124624x1() {
        super.mo124624x1();
        v1b0 v1b0VarM194967j1 = this.f97806h.m194967j1();
        if (v1b0VarM194967j1 != null) {
            v1b0VarM194967j1.mo124624x1();
        }
        if (NullChecker.m82486a(this.f97809k)) {
            this.f97809k.m45584d(true);
        }
    }

    @Override // p153l.v1b0
    /* JADX INFO: renamed from: x2 */
    public void mo44466x2() {
        if (NullChecker.m82486a(this.f97809k)) {
            this.f97809k.m45584d(false);
        }
    }

    /* JADX INFO: renamed from: z */
    public View m124625z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g920.m129513b(this, layoutInflater, viewGroup);
    }
}
