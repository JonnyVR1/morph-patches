package com.p000p1.mobile.putong.core.newui.home.insert.myself;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0032b;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView;
import com.p000p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout;
import com.p000p1.mobile.putong.core.profile.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.core.ui.profile.EditProfileAct;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.core.ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.core.ui.profile.loop.ProfileInfoLoopEditAct;
import com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl;
import com.p1.mobile.putong.core.util.CertificationUtil;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.HashSet;
import l.a1m;
import l.c4g0;
import l.e30;
import l.f6c0;
import l.j2e0;
import l.j760;
import l.mae0;
import l.mkd0;
import l.o6j0;
import l.qib0;
import l.rzb0;
import l.t100;
import l.upa;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.xh0;
import l.zvf0;
import p009l.bol;
import p009l.hae0;
import p009l.l480;
import p009l.sfh0;
import p009l.wn90;
import p009l.zub;
import rx.c;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SeeMyselfRootLayout extends FrameLayout {

    /* JADX INFO: renamed from: A */
    public int f1789A;

    /* JADX INFO: renamed from: B */
    public HashSet<String> f1790B;

    /* JADX INFO: renamed from: C */
    public bol f1791C;

    /* JADX INFO: renamed from: a */
    public SimpleDraweeView f1792a;

    /* JADX INFO: renamed from: b */
    public VFrame f1793b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f1794c;

    /* JADX INFO: renamed from: d */
    public VText f1795d;

    /* JADX INFO: renamed from: e */
    public VText f1796e;

    /* JADX INFO: renamed from: f */
    public VImage f1797f;

    /* JADX INFO: renamed from: g */
    public VText f1798g;

    /* JADX INFO: renamed from: h */
    public VImage f1799h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f1800i;

    /* JADX INFO: renamed from: j */
    public VText f1801j;

    /* JADX INFO: renamed from: k */
    public VImage f1802k;

    /* JADX INFO: renamed from: l */
    public VText f1803l;

    /* JADX INFO: renamed from: m */
    public SimpleDraweeView f1804m;

    /* JADX INFO: renamed from: n */
    public SimpleDraweeView f1805n;

    /* JADX INFO: renamed from: o */
    public VImage f1806o;

    /* JADX INFO: renamed from: p */
    public VText_Bold f1807p;

    /* JADX INFO: renamed from: q */
    public VText f1808q;

    /* JADX INFO: renamed from: r */
    public VFrame f1809r;

    /* JADX INFO: renamed from: s */
    public FrameLayout f1810s;

    /* JADX INFO: renamed from: t */
    public ExpandedImageSwitchView f1811t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f1812u;

    /* JADX INFO: renamed from: v */
    public ConstraintLayout f1813v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f1814w;

    /* JADX INFO: renamed from: x */
    public VImage f1815x;

    /* JADX INFO: renamed from: y */
    public VText_Bold f1816y;

    /* JADX INFO: renamed from: z */
    public c4g0 f1817z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout$a */
    public class ViewOnClickListenerC0161a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f1818a;

        public ViewOnClickListenerC0161a(User user) {
            this.f1818a = user;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CertificationUtil.j(SeeMyselfRootLayout.this.f1799h.getContext(), this.f1818a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout$b */
    public class ViewOnClickListenerC0162b implements View.OnClickListener {
        public ViewOnClickListenerC0162b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeeMyselfRootLayout.this.m2589R("swipe");
            CoreModule.c.m0.I2.onNext(j760.a(SwipeDirection.RIGHT, (Object) null));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout$c */
    public class ViewOnClickListenerC0163c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f1821a;

        public ViewOnClickListenerC0163c(User user) {
            this.f1821a = user;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0030  */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            User userI2;
            ProfileAct context = SeeMyselfRootLayout.this.getContext();
            if (context instanceof Act) {
                ProfileAct profileAct = (Act) context;
                Intent intentQ2 = ProfileAct.q2(profileAct, ((DbObject) this.f1821a).id, "preview_card", false, false, 0);
                if (profileAct instanceof ProfileAct) {
                    a1m a1mVarC2 = profileAct.C2();
                    if (a1mVarC2 instanceof a1m) {
                        userI2 = a1mVarC2.i2();
                    } else {
                        userI2 = null;
                    }
                } else {
                    userI2 = null;
                }
                if (userI2 == null) {
                    userI2 = wn90.m24339F().f22203a;
                }
                intentQ2.putExtra("preview_user_info", (Serializable) userI2);
                profileAct.startActivity(intentQ2);
                profileAct.overridePendingTransition(rzb0.y, rzb0.o);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout$d */
    public class C0164d implements a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LoopInputType f1823a;

        public C0164d(LoopInputType loopInputType) {
            this.f1823a = loopInputType;
        }

        /* JADX INFO: renamed from: a */
        public boolean m2599a(int i, int i2, Intent intent) {
            if (i2 != -1 || !(SeeMyselfRootLayout.this.m2593u() instanceof EditProfileAct)) {
                return false;
            }
            EditProfileAct editProfileActM2593u = SeeMyselfRootLayout.this.m2593u();
            editProfileActM2593u.b3();
            ProfileListFragLocalEditImpl profileListFragLocalEditImplC2 = editProfileActM2593u.C2();
            if (!(profileListFragLocalEditImplC2 instanceof ProfileListFragLocalEditImpl) || this.f1823a != LoopInputType.MY_LIFE_SEE_MYSELF) {
                return false;
            }
            profileListFragLocalEditImplC2.J3();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout$e */
    public class C0165e implements ExpandedImageSwitchView.InterfaceC0131b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f1825a;

        public C0165e(User user) {
            this.f1825a = user;
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC0131b
        /* JADX INFO: renamed from: c */
        public void mo2313c(boolean z) {
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC0131b
        /* JADX INFO: renamed from: d */
        public void mo2314d(int i, Media media, boolean z) {
            if (this.f1825a.pictures.size() > i) {
                qib0.G.L0(SeeMyselfRootLayout.this.f1792a, zub.m25966f(this.f1825a.media(i).cover()).formatted());
                bol bolVar = SeeMyselfRootLayout.this.f1791C;
                if (bolVar != null) {
                    bolVar.mo1403a(i, true);
                }
            }
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC0131b
        /* JADX INFO: renamed from: e */
        public boolean mo2315e(Media media) {
            return false;
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView.InterfaceC0131b
        /* JADX INFO: renamed from: f */
        public void mo2316f(int i, boolean z) {
        }
    }

    public SeeMyselfRootLayout(@NonNull Context context) {
        super(context);
        this.f1789A = 0;
        this.f1790B = new HashSet<>();
        m2573B();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m2558f(View view) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ j760 m2559g(VerificationCenter verificationCenter) {
        StudentVerificationStatus studentVerificationStatus = StudentVerificationStatus.get("default");
        StudentVerificationStatus studentVerificationStatus2 = StudentVerificationStatus.get("default");
        if (NullChecker.a(verificationCenter) && NullChecker.a(verificationCenter.picVerificationInfo)) {
            studentVerificationStatus = verificationCenter.picVerificationInfo.status;
        }
        if (NullChecker.a(verificationCenter) && NullChecker.a(verificationCenter.idCard)) {
            studentVerificationStatus2 = verificationCenter.idCard.status;
        }
        return j760.a(studentVerificationStatus, studentVerificationStatus2);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m2561i(Throwable th) {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m2568p(View view) {
    }

    private void setImageStyle(boolean z) {
        RoundingParams roundingParamsP = this.f1792a.getHierarchy().p();
        if (roundingParamsP == null) {
            roundingParamsP = new RoundingParams();
        }
        int i = t100.m;
        if (z) {
            i = t100.o;
        }
        int i2 = i;
        float f = i;
        float f2 = i2;
        roundingParamsP.r(f, f, f2, f2);
        this.f1792a.getHierarchy().H(roundingParamsP);
    }

    /* JADX INFO: renamed from: A */
    public final void m2572A(sfh0 sfh0Var, User user) {
        this.f1811t.m2309l();
        this.f1811t.m2307j(sfh0Var, user, new C0165e(user));
    }

    /* JADX INFO: renamed from: B */
    public final void m2573B() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(f6c0.Lb, (ViewGroup) this, false);
        addView(viewInflate, new FrameLayout.LayoutParams(-1, -1));
        m2592t(viewInflate);
        this.f1792a.getHierarchy().E(new l480(t100.m));
        xdl0.E0(this.f1800i, new View.OnClickListener() { // from class: l.u9e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SeeMyselfRootLayout.m2558f(view);
            }
        });
        xdl0.E0(this.f1794c, new View.OnClickListener() { // from class: l.dae0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SeeMyselfRootLayout.m2568p(view);
            }
        });
        boolean z = upa.z();
        VImage vImage = this.f1797f;
        if (z) {
            vImage.setImageResource(x2c0.d7);
            this.f1802k.setImageResource(x2c0.ns);
            this.f1804m.setBackgroundResource(x2c0.c7);
            this.f1805n.setBackgroundResource(x2c0.c7);
            this.f1807p.setBackgroundResource(x2c0.w1);
        } else {
            vImage.setImageResource(x2c0.a8);
            this.f1802k.setImageResource(x2c0.f8);
            this.f1804m.setBackgroundResource(x2c0.Y7);
            this.f1805n.setBackgroundResource(x2c0.Y7);
            this.f1807p.setBackgroundResource(x2c0.s);
            ViewGroup.LayoutParams layoutParams = this.f1799h.getLayoutParams();
            int iD = t100.d(70.0f);
            layoutParams.width = iD;
            layoutParams.height = iD;
            this.f1799h.setLayoutParams(layoutParams);
        }
        if (upa.N3()) {
            this.f1811t.setIndicatorColor(Color.parseColor("#57000000"));
            this.f1811t.setIndicatorColorBorder(Color.parseColor("#57A0A0A0"));
            this.f1811t.setIndicatorSelectedColorBorder(Color.parseColor("#4DA0A0A0"));
            this.f1811t.setupIndicator(this.f1810s);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m2574C(User user) {
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m2576E(j760 j760Var) {
        User user = (User) j760Var.a;
        Object obj = j760Var.b;
        m2587P(user, (StudentVerificationStatus) ((j760) obj).a, (StudentVerificationStatus) ((j760) obj).b, this.f1789A);
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m2577F(int i, String str, View view) {
        if (m2594v() || m2595w()) {
            return;
        }
        m2589R("photo");
        if (i == 2) {
            m2598z(LoopInputType.MY_LIFE_SEE_MYSELF);
            return;
        }
        j2e0.m(xdl0.D(getContext()), Uri.parse("tantan://user_mirror?entry=picture&from=" + str));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m2578G(int i, String str, View view) {
        if (m2594v() || m2595w()) {
            return;
        }
        m2589R("photo");
        if (i == 2) {
            m2598z(LoopInputType.MY_LIFE_SEE_MYSELF);
            return;
        }
        j2e0.m(xdl0.D(getContext()), Uri.parse("tantan://user_mirror?entry=picture&from=" + str));
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m2579H(View view) {
        m2589R("swipe");
        CoreModule.c.m0.I2.onNext(j760.a(SwipeDirection.RIGHT, (Object) null));
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m2580I(View view) {
        if (m2594v() || m2595w()) {
            return;
        }
        m2589R("complete_profile");
        j2e0.m(xdl0.D(getContext()), Uri.parse("tantan://user_mirror?entry=".concat(TextUtils.isEmpty(CoreModule.c.e0.na().description) ? "signature" : "picture")));
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m2581J(View view) {
        m2589R("later");
        CoreModule.c.m0.I2.onNext(j760.a(SwipeDirection.LEFT, (Object) null));
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m2582K(View view) {
        m2589R("avatar_verify");
        j2e0.m(xdl0.D(getContext()), Uri.parse("tantan://verificationcenter"));
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m2583L(int i, String str, View view) {
        if (m2594v() || m2595w()) {
            return;
        }
        m2589R("avatar_verify");
        if (i == 2) {
            m2598z(LoopInputType.VERIFICATION);
            return;
        }
        j2e0.m(xdl0.D(getContext()), Uri.parse("tantan://user_mirror?entry=verification&from=" + str));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m2584M(int i, String str, View view) {
        if (m2594v() || m2595w()) {
            return;
        }
        m2589R("self_introduction");
        if (i == 2) {
            m2598z(LoopInputType.SIGNATURE);
            return;
        }
        j2e0.m(xdl0.D(getContext()), Uri.parse("tantan://user_mirror?entry=signature&from=" + str));
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m2585N(xh0[] xh0VarArr, View view) {
        m2593u().startActivity(CoreModule.K().startMessagesAct(m2593u(), "-1", true, false));
        xh0VarArr[0].c();
    }

    /* JADX INFO: renamed from: O */
    public void m2586O(Act act) {
        m2590S(act);
        mkd0.z(this.f1817z);
        c cVarO9 = CoreModule.c.e0.o9();
        if (this.f1789A == 2) {
            cVarO9 = c.just(wn90.m24339F().f22203a);
        }
        this.f1817z = act.duringCreated(c.combineLatest(cVarO9.distinctUntilChanged().doOnNext(new e30() { // from class: l.eae0
            public final void call(Object obj) {
                this.f12472a.m2574C((User) obj);
            }
        }), CoreModule.c.B0.j4().map(new w9j() { // from class: l.fae0
            public final Object call(Object obj) {
                return SeeMyselfRootLayout.m2559g((VerificationCenter) obj);
            }
        }).distinctUntilChanged().doOnNext(new e30() { // from class: l.gae0
            public final void call(Object obj) {
                this.f13392a.m2575D((j760) obj);
            }
        }), new hae0())).subscribe(mkd0.H(new e30() { // from class: l.iae0
            public final void call(Object obj) {
                this.f14453a.m2576E((j760) obj);
            }
        }, new e30() { // from class: l.jae0
            public final void call(Object obj) {
                SeeMyselfRootLayout.m2561i((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public final void m2587P(User user, StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2, final int i) {
        boolean z = i == 0 || i == 2;
        setImageStyle(z);
        User userRiskAuditUser = user.riskAuditUser(CoreModule.c.e0.Pa("fake_risk_audit_default_" + ((DbObject) user).id));
        qib0.G.L0(this.f1792a, zub.m25966f(userRiskAuditUser.fp()).formatted());
        this.f1795d.setText("Hi，" + userRiskAuditUser.name);
        final String str = "home_complete_card";
        if (i != 0) {
            if (i == 1) {
                str = "mytab_complete_card";
            } else if (i == 2) {
                str = "edit_profile_complete_card";
            }
        }
        VText vText = this.f1796e;
        if (i == 2) {
            vText.setText("你的卡片信息有点少\n补全信息可以吸引到更多人的喜欢");
        } else {
            vText.setText("你的卡片信息有点少\n补全一下你的信息吧");
        }
        xdl0.E0(this.f1797f, (View.OnClickListener) null);
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            xdl0.M(this.f1799h, true);
            xdl0.M(this.f1797f, false);
            xdl0.M(this.f1798g, false);
            if (upa.z()) {
                xdl0.C0(this.f1799h, t100.d(z ? 30.0f : 24.0f));
            }
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                boolean z2 = upa.z();
                VImage vImage = this.f1799h;
                if (z2) {
                    vImage.setImageResource(z ? x2c0.O6 : x2c0.K2);
                } else {
                    vImage.setImageResource(x2c0.J2);
                }
            } else {
                boolean z3 = upa.z();
                VImage vImage2 = this.f1799h;
                if (z3) {
                    vImage2.setImageResource(z ? x2c0.V6 : x2c0.O2);
                } else {
                    vImage2.setImageResource(x2c0.N2);
                }
            }
            if (i == 2) {
                xdl0.E0(this.f1799h, new ViewOnClickListenerC0161a(userRiskAuditUser));
            }
        } else {
            boolean zEquals = TEnum.equals(studentVerificationStatus, "pending");
            VText vText2 = this.f1798g;
            if (zEquals) {
                vText2.setText("认证中");
                xdl0.E0(this.f1797f, new View.OnClickListener() { // from class: l.kae0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f15566a.m2582K(view);
                    }
                });
            } else {
                vText2.setText("头像认证");
                xdl0.E0(this.f1797f, new View.OnClickListener() { // from class: l.lae0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f16034a.m2583L(i, str, view);
                    }
                });
            }
            xdl0.M(this.f1799h, false);
            xdl0.M(this.f1797f, true);
            xdl0.M(this.f1798g, true);
        }
        boolean zIsEmpty = TextUtils.isEmpty(userRiskAuditUser.description);
        VText vText3 = this.f1803l;
        if (zIsEmpty) {
            xdl0.M(vText3, false);
            xdl0.M(this.f1802k, false);
            xdl0.M(this.f1801j, true);
            xdl0.E0(this.f1801j, new View.OnClickListener() { // from class: l.v9e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21486a.m2584M(i, str, view);
                }
            });
        } else {
            xdl0.M(vText3, true);
            xdl0.M(this.f1802k, true);
            xdl0.M(this.f1801j, false);
            this.f1803l.setText(userRiskAuditUser.description);
        }
        xdl0.E0(this.f1804m, (View.OnClickListener) null);
        xdl0.E0(this.f1805n, (View.OnClickListener) null);
        this.f1804m.setClickable(false);
        this.f1805n.setClickable(false);
        if (userRiskAuditUser.pictures.size() > 1) {
            qib0.G.L0(this.f1804m, ((Media) userRiskAuditUser.pictures.get(1)).cover().profileSmall().formatted());
        } else {
            this.f1804m.setImageResource(0);
            xdl0.E0(this.f1804m, new View.OnClickListener() { // from class: l.w9e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21955a.m2577F(i, str, view);
                }
            });
        }
        if (userRiskAuditUser.pictures.size() > 2) {
            qib0.G.L0(this.f1805n, ((Media) userRiskAuditUser.pictures.get(2)).cover().profileSmall().formatted());
        } else {
            this.f1805n.setImageResource(0);
            xdl0.E0(this.f1805n, new View.OnClickListener() { // from class: l.x9e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22481a.m2578G(i, str, view);
                }
            });
        }
        if (m2597y(userRiskAuditUser)) {
            m2591T();
        }
        if (!upa.N3() || !m2597y(userRiskAuditUser)) {
            xdl0.M(this.f1793b, true);
            xdl0.M(this.f1809r, false);
            VText_Bold vText_Bold = this.f1807p;
            if (i != 0) {
                xdl0.M(vText_Bold, false);
                xdl0.M(this.f1808q, false);
                return;
            }
            xdl0.M(vText_Bold, true);
            xdl0.M(this.f1808q, true);
            boolean zM2597y = m2597y(userRiskAuditUser);
            VText_Bold vText_Bold2 = this.f1807p;
            if (zM2597y) {
                vText_Bold2.setText("继续划卡");
                xdl0.E0(this.f1807p, new View.OnClickListener() { // from class: l.y9e0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f22942a.m2579H(view);
                    }
                });
            } else {
                vText_Bold2.setText("立即完善");
                xdl0.E0(this.f1807p, new View.OnClickListener() { // from class: l.z9e0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f23528a.m2580I(view);
                    }
                });
            }
            xdl0.E0(this.f1808q, new View.OnClickListener() { // from class: l.aae0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9351a.m2581J(view);
                }
            });
            return;
        }
        xdl0.M(this.f1793b, false);
        xdl0.M(this.f1809r, true);
        m2572A(new sfh0(new CoreSuggested.UserInfo(), userRiskAuditUser), userRiskAuditUser);
        if (this.f1791C == null) {
            this.f1791C = new C0032b(false, getContext(), this.f1814w, null);
        }
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.id = ((DbObject) userRiskAuditUser).id;
        this.f1791C.mo1407e(null, userRiskAuditUser, userInfo, true, null);
        this.f1791C.mo1403a(0, false);
        if (i == 0) {
            xdl0.M(this.f1816y, true);
            xdl0.M(this.f1815x, false);
            xdl0.E0(this.f1816y, new ViewOnClickListenerC0162b());
            xdl0.E0(this.f1813v, new ViewOnClickListenerC0163c(userRiskAuditUser));
            boolean zEquals2 = TEnum.equals(studentVerificationStatus, "verified");
            VDraweeView vDraweeView = this.f1812u;
            if (!zEquals2) {
                xdl0.M(vDraweeView, false);
                return;
            }
            xdl0.M(vDraweeView, true);
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                qib0.G.Y0(this.f1812u, x2c0.J2);
            } else {
                qib0.G.Y0(this.f1812u, x2c0.N2);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m2588Q() {
        xh0.a aVarO = new xh0.a(m2593u()).g(false).h(false).r(m2593u().getResources().getString(R$string.f6518L)).o(new View.OnClickListener() { // from class: l.bae0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xh0VarArr[0].c();
            }
        });
        aVarO.j(m2593u().getString(R$string.f6533O)).f(getResources().getString(R$string.f6513K)).c(new View.OnClickListener() { // from class: l.cae0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10485a.m2585N(xh0VarArr, view);
            }
        });
        xh0 xh0VarA = aVarO.a();
        final xh0[] xh0VarArr = {xh0VarA};
        xh0VarA.g();
    }

    /* JADX INFO: renamed from: R */
    public final void m2589R(String str) {
        String str2;
        int i = this.f1789A;
        if (i == 0) {
            str2 = "p_suggest_users_home_view";
        } else if (i == 1) {
            str2 = "p_navigation_view";
        } else {
            str2 = i == 2 ? "p_edit_profile_view" : "";
        }
        zvf0.u("e_complete_card_info", str2, new j760[]{j760.a("complete_card_info_entrance", str)});
    }

    /* JADX INFO: renamed from: S */
    public final void m2590S(Act act) {
        if (this.f1789A == 2) {
            if ((act instanceof EditProfileAct) && ((EditProfileAct) act).a3()) {
                o6j0.i("e_complete_card_info", "p_edit_profile_view");
                return;
            }
            return;
        }
        if (this.f1790B.contains("e_complete_card_info_mv")) {
            return;
        }
        this.f1790B.add("e_complete_card_info_mv");
        zvf0.x("e_complete_card_info", this.f1789A == 0 ? "p_suggest_users_home_view" : "p_navigation_view");
    }

    /* JADX INFO: renamed from: T */
    public final void m2591T() {
        if (this.f1790B.contains("e_complete_card_success")) {
            return;
        }
        this.f1790B.add("e_complete_card_success");
        zvf0.D("e_complete_card_success", this.f1789A == 0 ? "p_suggest_users_home_view" : "p_navigation_view", new j760[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.z(this.f1817z);
        this.f1790B.clear();
    }

    public void setRenderType(int i) {
        this.f1789A = i;
        if (i == 0) {
            this.f1796e.setTextSize(15.0f);
            xdl0.X(this.f1796e, t100.d(4.0f));
            this.f1798g.setTextSize(15.0f);
            this.f1801j.setTextSize(16.0f);
            xdl0.C0(this.f1801j, t100.d(56.0f));
            boolean zY = upa.y();
            VText vText = this.f1803l;
            if (!zY) {
                vText.setTextSize(18.0f);
                return;
            } else {
                vText.setTextSize(16.0f);
                xdl0.W(this.f1803l, t100.d(44.0f));
                return;
            }
        }
        if (i == 1) {
            this.f1796e.setTextSize(13.0f);
            xdl0.X(this.f1796e, t100.d(4.0f));
            this.f1798g.setTextSize(13.0f);
            this.f1801j.setTextSize(13.0f);
            xdl0.C0(this.f1801j, t100.d(48.0f));
            this.f1803l.setTextSize(16.0f);
            return;
        }
        if (i == 2) {
            this.f1796e.setTextSize(15.0f);
            xdl0.X(this.f1796e, t100.d(4.0f));
            this.f1798g.setTextSize(15.0f);
            this.f1801j.setTextSize(16.0f);
            xdl0.C0(this.f1801j, t100.d(56.0f));
            boolean zY2 = upa.y();
            VText vText2 = this.f1803l;
            if (zY2) {
                vText2.setTextSize(16.0f);
                xdl0.W(this.f1803l, t100.d(44.0f));
                xdl0.M(this.f1806o, true);
            } else {
                vText2.setTextSize(18.0f);
                xdl0.W(this.f1803l, 0);
            }
            xdl0.M(this.f1807p, false);
            xdl0.M(this.f1808q, false);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m2592t(View view) {
        mae0.a(this, view);
    }

    /* JADX INFO: renamed from: u */
    public final Act m2593u() {
        return xdl0.E(this);
    }

    /* JADX INFO: renamed from: v */
    public boolean m2594v() {
        if (!CoreModule.c.e0.na().isJailed()) {
            return false;
        }
        CoreModule.K().startJailedDialogLikeAct();
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m2595w() {
        if (!CoreModule.c.e0.na().isProfileJailed()) {
            return false;
        }
        m2588Q();
        return true;
    }

    /* JADX INFO: renamed from: x */
    public void m2596x() {
        mkd0.z(this.f1817z);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m2597y(User user) {
        return user.pictures.size() >= 3 && !TextUtils.isEmpty(user.description);
    }

    /* JADX INFO: renamed from: z */
    public void m2598z(LoopInputType loopInputType) {
        boolean z = loopInputType == LoopInputType.VERIFICATION;
        Intent intentX1 = ProfileInfoLoopEditAct.X1(m2593u(), LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT, loopInputType, wn90.m24339F().f22203a);
        intentX1.putExtra("loop_create_from_page", "edit_profile_complete_card");
        intentX1.putExtra("loop_edit_patch_flag", z);
        m2593u().startActivityForResult(intentX1, new C0164d(loopInputType));
    }

    public SeeMyselfRootLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1789A = 0;
        this.f1790B = new HashSet<>();
        m2573B();
    }

    public SeeMyselfRootLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1789A = 0;
        this.f1790B = new HashSet<>();
        m2573B();
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m2575D(j760 j760Var) {
    }
}
