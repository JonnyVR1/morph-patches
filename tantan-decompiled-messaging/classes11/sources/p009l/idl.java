package p009l;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.DraweeView;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p000p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p000p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p000p1.mobile.putong.core.newui.home.themeslide.HomeThemeSlideFrag;
import com.p000p1.mobile.putong.core.newui.home.themeslide.ProfileCardStackThemeSlideOpt;
import com.p000p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideEmptyCardView;
import com.p000p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideErrorNetView;
import com.p000p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p000p1.mobile.putong.core.newui.home.views.HomeTitleLayout;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.y;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.ui.GradientBgButton;
import com.p1.mobile.putong.core.ui.RadarRipple;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.core.ui.main.LocationPermissionView;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.profile.helpers.ProfileCreateData;
import com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p1.mobile.putong.data.LinkChannel;
import com.p1.mobile.putong.data.User;
import com.sunshine.engine.particle.SceneView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.Objects;
import l.abi;
import l.baj;
import l.d30;
import l.dbl0;
import l.e30;
import l.e51;
import l.ezc0;
import l.fap;
import l.j760;
import l.jdl;
import l.mah0;
import l.mep0;
import l.n3b0;
import l.nkp;
import l.nu0;
import l.o6j0;
import l.ogl0;
import l.ool0;
import l.qol0;
import l.roj0;
import l.rxg0;
import l.s7m;
import l.swh0;
import l.t100;
import l.u4c0;
import l.upa;
import l.v9j;
import l.vdj;
import l.vwb;
import l.w0c0;
import l.wge0;
import l.x2c0;
import l.xck0;
import l.xdl0;
import l.xij0;
import l.zbc0;
import l.zq20;
import rx.subjects.a;
import v.VButton_FakeShadow;
import v.VDraweeView;
import v.VFrame;
import v.VFrame_FlipContainer;
import v.VFrame_Squared;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class idl implements s7m<dcl>, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: A */
    public TextView f14500A;

    /* JADX INFO: renamed from: B */
    public SceneView f14501B;

    /* JADX INFO: renamed from: C */
    public VDraweeView f14502C;

    /* JADX INFO: renamed from: D */
    public VDraweeView f14503D;

    /* JADX INFO: renamed from: E */
    public VText f14504E;

    /* JADX INFO: renamed from: F */
    public VText f14506F;

    /* JADX INFO: renamed from: G */
    public ConstraintLayout f14508G;

    /* JADX INFO: renamed from: H */
    public View f14510H;

    /* JADX INFO: renamed from: I */
    public VText f14512I;

    /* JADX INFO: renamed from: I0 */
    public boolean f14513I0;

    /* JADX INFO: renamed from: J */
    public VLinear f14514J;

    /* JADX INFO: renamed from: J0 */
    public boolean f14515J0;

    /* JADX INFO: renamed from: K */
    public GradientBgButton f14516K;

    /* JADX INFO: renamed from: K0 */
    public boolean f14517K0;

    /* JADX INFO: renamed from: L */
    public GradientBgButton f14518L;

    /* JADX INFO: renamed from: L0 */
    public boolean f14519L0;

    /* JADX INFO: renamed from: M */
    public GradientBgButton f14520M;

    /* JADX INFO: renamed from: N */
    public GradientBgButton f14522N;

    /* JADX INFO: renamed from: O */
    public HomeThemeSlideErrorNetView f14524O;

    /* JADX INFO: renamed from: P */
    public SuperLikeComboAnimView f14526P;

    /* JADX INFO: renamed from: Q */
    public Act f14528Q;

    /* JADX INFO: renamed from: Q0 */
    public e30 f14529Q0;

    /* JADX INFO: renamed from: R */
    public qsl f14530R;

    /* JADX INFO: renamed from: R0 */
    public Animator f14531R0;

    /* JADX INFO: renamed from: S */
    public dcl f14532S;

    /* JADX INFO: renamed from: T */
    public wsf0 f14534T;

    /* JADX INFO: renamed from: U */
    public ProfileCardStackThemeSlideOpt f14536U;

    /* JADX INFO: renamed from: U0 */
    public ViewOnTouchListenerC0957e f14537U0;

    /* JADX INFO: renamed from: V */
    public HomeThemeSlideFrag f14538V;

    /* JADX INFO: renamed from: V0 */
    public ViewOnTouchListenerC0957e f14539V0;

    /* JADX INFO: renamed from: W */
    public hz30 f14540W;

    /* JADX INFO: renamed from: X */
    public int f14542X;

    /* JADX INFO: renamed from: a */
    public FrameLayout f14546a;

    /* JADX INFO: renamed from: b */
    public LocationPermissionView f14547b;

    /* JADX INFO: renamed from: c */
    public HomeTitleLayout f14548c;

    /* JADX INFO: renamed from: d */
    public VFrame f14549d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f14550e;

    /* JADX INFO: renamed from: f */
    public VFrame_Squared f14551f;

    /* JADX INFO: renamed from: g */
    public RadarRipple f14552g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f14553h;

    /* JADX INFO: renamed from: i */
    public VText f14554i;

    /* JADX INFO: renamed from: j */
    public Space f14555j;

    /* JADX INFO: renamed from: k */
    public VFrame f14556k;

    /* JADX INFO: renamed from: l */
    public VButton_FakeShadow f14558l;

    /* JADX INFO: renamed from: m */
    public HomeThemeSlideEmptyCardView f14559m;

    /* JADX INFO: renamed from: n */
    public VFrame f14560n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f14561o;

    /* JADX INFO: renamed from: p */
    public VFrame_FlipContainer f14562p;

    /* JADX INFO: renamed from: q */
    public CardOperationButton f14564q;

    /* JADX INFO: renamed from: r */
    public VText f14565r;

    /* JADX INFO: renamed from: s */
    public CardOperationButton f14566s;

    /* JADX INFO: renamed from: t */
    public CardOperationButton f14567t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f14568u;

    /* JADX INFO: renamed from: v */
    public SVGAnimationView f14569v;

    /* JADX INFO: renamed from: w */
    public VFrame_FlipContainer f14570w;

    /* JADX INFO: renamed from: x */
    public CardOperationButton f14571x;

    /* JADX INFO: renamed from: y */
    public VText f14572y;

    /* JADX INFO: renamed from: z */
    public SceneView f14573z;

    /* JADX INFO: renamed from: Y */
    public Runnable f14544Y = null;

    /* JADX INFO: renamed from: Z */
    public Runnable f14545Z = null;

    /* JADX INFO: renamed from: k0 */
    public Runnable f14557k0 = null;

    /* JADX INFO: renamed from: p0 */
    public boolean f14563p0 = true;

    /* JADX INFO: renamed from: E0 */
    public boolean f14505E0 = false;

    /* JADX INFO: renamed from: F0 */
    public boolean f14507F0 = false;

    /* JADX INFO: renamed from: G0 */
    public a<Boolean> f14509G0 = a.c(Boolean.FALSE);

    /* JADX INFO: renamed from: H0 */
    public final View[] f14511H0 = new View[2];

    /* JADX INFO: renamed from: M0 */
    public View f14521M0 = null;

    /* JADX INFO: renamed from: N0 */
    public long f14523N0 = -1;

    /* JADX INFO: renamed from: O0 */
    public String f14525O0 = "empty";

    /* JADX INFO: renamed from: P0 */
    public String f14527P0 = "@@";

    /* JADX INFO: renamed from: S0 */
    public Runnable f14533S0 = new RunnableC0954b();

    /* JADX INFO: renamed from: T0 */
    public u0l f14535T0 = new C0955c();

    /* JADX INFO: renamed from: W0 */
    public final Runnable f14541W0 = new Runnable() { // from class: l.hcl
        @Override // java.lang.Runnable
        public final void run() {
            idl.m16358C();
        }
    };

    /* JADX INFO: renamed from: X0 */
    public am4<znl> f14543X0 = new am4() { // from class: l.icl
        @Override // p009l.am4
        /* JADX INFO: renamed from: d */
        public final Object mo11522d() {
            return this.f14487a.m16461k1();
        }
    };

    /* JADX INFO: renamed from: l.idl$a */
    public class C0953a implements d30 {
        public C0953a() {
        }

        public void call() {
            idl.this.f14532S.m13112F2(true);
        }
    }

    /* JADX INFO: renamed from: l.idl$b */
    public class RunnableC0954b implements Runnable {
        public RunnableC0954b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            idl.this.f14559m.m2854v();
            if (NullChecker.a(idl.this.f14531R0)) {
                idl.this.f14531R0.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: l.idl$c */
    public class C0955c extends u0l {
        public C0955c() {
        }

        @Override // p009l.u0l, java.lang.Runnable
        public void run() {
            xdl0.M0(idl.this.m16460k0(), true);
            xdl0.M0(idl.this.m16450f0(), false);
            idl.this.m16371M1(true);
            idl.this.m16369L1(false);
            idl.this.m16488y1(false);
            idl.this.f14531R0.start();
            View viewFindViewWithTag = idl.this.m16472q0().findViewWithTag(idl.this.m16476s0().getTag() + "child");
            if (NullChecker.a(viewFindViewWithTag)) {
                idl.this.m16472q0().removeView(viewFindViewWithTag);
            }
            idl.this.m16377T(false);
            if (!this.f20948a && !this.f20949b && !this.f20950c) {
                xdl0.M0(idl.this.m16462l0(), false);
            }
            if (IntlCountryCodeController.v()) {
                xdl0.M(idl.this.m16480u0(), false);
                xdl0.M(idl.this.m16486x0(), false);
            }
        }
    }

    /* JADX INFO: renamed from: l.idl$d */
    public class C0956d implements CardOperationButton.InterfaceC0213b {

        /* JADX INFO: renamed from: a */
        public String f14577a;

        public C0956d() {
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.views.CardOperationButton.InterfaceC0213b
        /* JADX INFO: renamed from: a */
        public void mo1370a() {
            e51.J(idl.this.f14541W0);
            if (ogl0.Z()) {
                idl.this.m16412G1();
            }
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.views.CardOperationButton.InterfaceC0213b
        /* JADX INFO: renamed from: b */
        public void mo1371b() {
            if (ogl0.Z()) {
                idl.this.m16414H1();
            }
            if (TextUtils.isEmpty(this.f14577a)) {
                return;
            }
            e51.H(idl.this.f14528Q, idl.this.f14541W0, 1000L);
        }
    }

    /* JADX INFO: renamed from: l.idl$e */
    public static class ViewOnTouchListenerC0957e implements View.OnTouchListener {

        /* JADX INFO: renamed from: c */
        public static int f14579c = zbc0.a(8, 10);

        /* JADX INFO: renamed from: a */
        public int f14580a = 0;

        /* JADX INFO: renamed from: b */
        public VLinear.a f14581b;

        public ViewOnTouchListenerC0957e() {
            VLinear.a aVar = new VLinear.a();
            this.f14581b = aVar;
            aVar.c();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f14580a <= f14579c) {
                if (motionEvent.getAction() == 0) {
                    int i = this.f14580a + 1;
                    this.f14580a = i;
                    if (i > f14579c) {
                        j760 j760VarB = this.f14581b.b();
                        y.Q = ((Boolean) j760VarB.a).booleanValue();
                        y.R = ((Boolean) j760VarB.b).booleanValue();
                    }
                }
                this.f14581b.a(motionEvent);
            }
            if (motionEvent.getAction() == 0) {
                e5l.m13742c(true);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                e5l.m13742c(false);
            }
            return false;
        }
    }

    public idl(Act act, HomeThemeSlideFrag homeThemeSlideFrag) {
        this.f14528Q = act;
        this.f14538V = homeThemeSlideFrag;
    }

    /* JADX INFO: renamed from: B0 */
    private void m16357B0() {
        m16445c0().setBackgroundResource(x2c0.p);
        final BoostViewContainer boostViewContainerM16444b0 = m16444b0();
        boostViewContainerM16444b0.m7955b(new e30() { // from class: l.kcl
            public final void call(Object obj) {
                this.f15603a.m16424P0((View) obj);
            }
        }, new baj() { // from class: l.lcl
            /* JADX INFO: renamed from: a */
            public final Object m17829a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return this.f16079a.m16426Q0(boostViewContainerM16444b0, (Drawable) obj, (CharSequence) obj2, (Integer) obj3, (Integer) obj4, (Integer) obj5, (Boolean) obj6);
            }
        });
        boostViewContainerM16444b0.setSceneView(this.f14501B);
        boostViewContainerM16444b0.setInterceptFunc(new v9j() { // from class: l.mcl
            public final Object call() {
                return Boolean.valueOf(this.f16801a.m16427Q1());
            }
        });
        boostViewContainerM16444b0.m7954a(new y93() { // from class: l.ncl
            @Override // p009l.y93
            /* JADX INFO: renamed from: a */
            public final void mo15344a(int i) {
                this.f17406a.m16430S0(boostViewContainerM16444b0, i);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m16358C() {
        d.l().k("bubble_superlike_bubble");
        rxg0.u();
    }

    /* JADX INFO: renamed from: J1 */
    private void m16365J1(boolean z) {
        o6j0.c("e_superlikeButton", this.f14538V.pageId(), new o6j0.a[]{o6j0.a.h("moments_user_id", (!NullChecker.a(m16475r0().mo2809j()) || m16475r0().mo2809j().isVirtualCard()) ? "0" : m16475r0().mo2809j().id), o6j0.a.i("is_privileged", !n3b0.t()), o6j0.a.h("showfrom_superlike", "home"), eli0.m13975b()});
        if (ogl0.Z() && !z) {
            wge0.f().c(m16475r0().mo2809j().id, 1, true, m16456i0().pageId());
        }
        if (m16475r0() != null) {
            m16379W(m16475r0(), "superlike");
        }
        if (m16427Q1()) {
            return;
        }
        this.f14532S.m13124Q2(true, z);
    }

    /* JADX INFO: renamed from: K1 */
    private void m16367K1(String str) {
        String str2;
        if (TextUtils.equals(str, "like")) {
            str2 = "right";
        } else if (TextUtils.equals(str, "superlike")) {
            str2 = "up";
        } else {
            str2 = TextUtils.equals(str, "undo") ? "back" : "left";
        }
        long jM18550o = this.f14523N0 > 0 ? mqi0.m18550o() - this.f14523N0 : -1L;
        this.f14523N0 = mqi0.m18550o();
        o6j0.c("e_card_click_interval", "p_suggest_users_home_view", new o6j0.a[]{o6j0.a.h("current_operation", str2), o6j0.a.g("operation_interval", jM18550o), o6j0.a.h("last_operation", this.f14525O0)});
        this.f14525O0 = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public void m16369L1(boolean z) {
        HomeStatisticsHelper.m638C(this.f14538V.getUserVisibleHint() && !this.f14538V.isHidden());
        if (z) {
            HomeStatisticsHelper.m664u();
        } else {
            HomeStatisticsHelper.m663t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public void m16371M1(boolean z) {
        HomeStatisticsHelper.m638C(this.f14538V.getUserVisibleHint() && !this.f14538V.isHidden());
        if (z) {
            HomeStatisticsHelper.m666w();
        } else {
            HomeStatisticsHelper.m665v();
        }
    }

    /* JADX INFO: renamed from: P1 */
    private void m16375P1() {
        if (((Boolean) this.f14509G0.e()).booleanValue()) {
            m16458j0().setOnTouchListener((View.OnTouchListener) null);
            m16452g0().setOnTouchListener((View.OnTouchListener) null);
            m16458j0().setClickable(false);
            m16452g0().setClickable(false);
            m16482v0().setClickable(false);
            m16476s0().setClickable(false);
            return;
        }
        m16458j0().setOnTouchListener(this.f14537U0);
        m16452g0().setOnTouchListener(this.f14539V0);
        m16458j0().setClickable(true);
        m16452g0().setClickable(true);
        m16482v0().setClickable(true);
        m16476s0().setClickable(true);
    }

    /* JADX INFO: renamed from: S */
    private void m16376S(boolean z) {
        if (z) {
            m16444b0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m16446d0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
        } else {
            m16444b0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            m16446d0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public void m16377T(boolean z) {
        if (z) {
            m16458j0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m16478t0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m16482v0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m16452g0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            rxg0.j().b.onNext(roj0.a);
        } else {
            m16458j0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            m16478t0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            m16482v0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            m16452g0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        }
        m16376S(z);
    }

    /* JADX INFO: renamed from: V */
    private void m16378V() {
        o6j0.h("e_boost_button", this.f14538V.pageId(), new o6j0.a[]{o6j0.a.i("is_privileged", !swh0.v())});
    }

    /* JADX INFO: renamed from: W */
    private void m16379W(wsf0 wsf0Var, String str) {
        m16367K1(str);
        wsf0Var.m19514h(str);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m16381b(View view) {
    }

    /* JADX INFO: renamed from: r1 */
    private void m16394r1(boolean z) {
        if (z) {
            act().removeCallbacks(this.f14533S0);
            this.f14559m.setVisibility(8);
            this.f14559m.m2845m();
        } else {
            act().removeCallbacks(this.f14533S0);
            if (this.f14532S.m13121P1()) {
                this.f14532S.m13165w2();
            } else {
                act().postDelayed(this.f14533S0, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m16399x() {
    }

    /* JADX INFO: renamed from: A0 */
    public void m16402A0(String str) {
        m16481u1();
        xdl0.M(this.f14530R.mo15099m(), false);
        zq20.e(act(), str, new C0953a());
    }

    /* JADX INFO: renamed from: A1 */
    public void m16403A1(boolean z, boolean z2) {
        this.f14505E0 = z;
        if (m16417J0()) {
            if (z2) {
                xdl0.M(m16482v0(), z);
                xdl0.M(m16484w0(), z);
                return;
            } else {
                xdl0.M0(m16482v0(), z);
                xdl0.M0(m16484w0(), z);
                return;
            }
        }
        if (z2) {
            xdl0.M(m16482v0(), false);
            xdl0.M(m16484w0(), false);
        } else {
            xdl0.M0(m16482v0(), false);
            xdl0.M0(m16484w0(), false);
        }
    }

    /* JADX INFO: renamed from: B1 */
    public boolean m16404B1() {
        if (m16475r0() != null && (m16475r0().mo2805d() instanceof d5m)) {
            d5m d5mVar = (d5m) m16475r0().mo2805d();
            if (!d5mVar.mo914y() || d5mVar.mo847f() || d5mVar.mo793N()) {
                return false;
            }
            return ((NullChecker.a(d5mVar.getCardData().m17130d()) && mah0.y0(((DbObject) d5mVar.getCardData().m17130d()).id)) || mah0.s0().z0()) ? false : true;
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m16405C0() {
        return this.f14528Q;
    }

    /* JADX INFO: renamed from: C1 */
    public void m16406C1() {
        m16448e0().setVisibility(0);
    }

    /* JADX INFO: renamed from: D0 */
    public void m16407D0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        xdl0.Z(new View[]{this.f14524O});
        try {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f14524O.getLayoutParams();
        } catch (ClassCastException unused) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(this.f14524O.getWidth(), this.f14524O.getHeight());
        }
        marginLayoutParams.topMargin += vtd.m23720a(act(), 56.0f);
        this.f14524O.setLayoutParams(marginLayoutParams);
        boolean z = upa.I0().enabled;
        HomeThemeSlideEmptyCardView homeThemeSlideEmptyCardView = this.f14559m;
        if (z) {
            homeThemeSlideEmptyCardView.m2848p(new d30() { // from class: l.ocl
                public final void call() {
                    idl.m16399x();
                }
            }, new d30() { // from class: l.qcl
                public final void call() {
                    this.f19137a.m16431T0();
                }
            }, this.f14532S);
        } else {
            homeThemeSlideEmptyCardView.m2848p(new d30() { // from class: l.rcl
                public final void call() {
                    this.f19735a.m16433U0();
                }
            }, new d30() { // from class: l.scl
                public final void call() {
                    this.f20167a.m16434V0();
                }
            }, this.f14532S);
        }
        this.f14524O.m2867m(this.f14532S, new d30() { // from class: l.tcl
            public final void call() {
                this.f20613a.m16435W0();
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public void m16408E0() {
        xdl0.E0(this.f14530R.getPosition(), new View.OnClickListener() { // from class: l.jcl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15055a.m16437X0(view);
            }
        });
    }

    /* JADX INFO: renamed from: F1 */
    public void m16410F1(String str, int i) {
        if (m16475r0() == null || m16475r0().mo2805d() == null || m16475r0().mo2814o() == null || m16475r0().mo2814o().m17130d() == null) {
            return;
        }
        User userM17130d = m16475r0().mo2814o().m17130d();
        sbp.m22052i(((DbObject) userM17130d).id);
        Intent intentZ2 = ProfileAct.z2(act(), ((DbObject) userM17130d).id, str, true, false, false);
        if (TextUtils.equals(((DbObject) userM17130d).id, (CharSequence) CoreModule.c.f0.J0.get())) {
            ProfileCreateData profileCreateData = new ProfileCreateData();
            profileCreateData.showCountdownSendMsg = true;
            intentZ2.putExtra("profile_create_data", (Serializable) profileCreateData);
        }
        this.f14538V.startActivityForResult(intentZ2, 114);
    }

    /* JADX INFO: renamed from: G0 */
    public void m16411G0(boolean z, boolean z2) {
        this.f14509G0.onNext(Boolean.valueOf(z));
        this.f14532S.f11757r = z2;
        if (z) {
            m16458j0().setScaleX(0.0f);
            m16458j0().setScaleY(0.0f);
            m16452g0().setScaleX(0.0f);
            m16452g0().setScaleY(0.0f);
            m16478t0().setScaleX(0.0f);
            m16478t0().setScaleY(0.0f);
            m16482v0().setScaleX(0.0f);
            m16482v0().setScaleY(0.0f);
            m16485w1();
        } else {
            m16458j0().setScaleX(1.0f);
            m16458j0().setScaleY(1.0f);
            m16452g0().setScaleX(1.0f);
            m16452g0().setScaleY(1.0f);
            m16478t0().setScaleX(1.0f);
            m16478t0().setScaleY(1.0f);
            m16482v0().setScaleX(1.0f);
            m16482v0().setScaleY(1.0f);
            m16483v1();
        }
        m16375P1();
        m16466n0().setRadarColor(this.f14542X);
        this.f14531R0 = xij0.b0(m16466n0(), m16464m0());
        xdl0.M0(m16460k0(), z);
        xdl0.M0(m16450f0(), !z);
        m16371M1(z);
        m16369L1(!z);
        xdl0.M0(m16462l0(), false);
        if (IntlCountryCodeController.v()) {
            xdl0.M(m16480u0(), !z);
            xdl0.M(m16486x0(), !z);
        }
        if (z && !z2) {
            xdl0.M0(m16462l0(), false);
        }
        m16488y1(!z);
        this.f14555j.setVisibility(4);
    }

    /* JADX INFO: renamed from: G1 */
    public final void m16412G1() {
        KeyEvent.Callback callbackMo2805d = m16475r0().mo2805d();
        if (NullChecker.a(callbackMo2805d)) {
            if ((callbackMo2805d instanceof d5m) && ((d5m) callbackMo2805d).mo865k0()) {
                return;
            }
            ((ViewGroup) this.f14528Q.getWindow().getDecorView()).setMotionEventSplittingEnabled(false);
            d5m d5mVar = (d5m) callbackMo2805d;
            boolean z = NullChecker.a(d5mVar.getCardData().m17130d()) && TextUtils.equals(((DbObject) d5mVar.getCardData().m17130d()).id, rxg0.j().m);
            xdl0.M0(this.f14526P, true);
            xdl0.M0(this.f14569v, true);
            m16471p1(false);
            this.f14526P.r(z, false, d5mVar.getCardData().m17130d().isFemale());
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m16413H0() {
        final wsf0 wsf0VarM16475r0 = m16475r0();
        m16407D0();
        this.f14561o.setClipChildren(false);
        this.f14561o.setClipToPadding(false);
        if (!vdj.c() && IntlCountryCodeController.o()) {
            m16438Y();
            if (nkp.e()) {
                m16442a0();
            }
        } else {
            m16442a0();
        }
        m16357B0();
        this.f14542X = act().color(w0c0.I);
        hz30 hz30Var = new hz30(this.f14532S, this);
        this.f14540W = hz30Var;
        wsf0VarM16475r0.setAdapter(hz30Var);
        m16458j0().setOnClickListener(new View.OnClickListener() { // from class: l.ecl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12505a.m16439Y0(wsf0VarM16475r0, view);
            }
        });
        m16452g0().setOnClickListener(new View.OnClickListener() { // from class: l.pcl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18468a.m16443a1(wsf0VarM16475r0, view);
            }
        });
        CardOperationButton cardOperationButtonM16458j0 = m16458j0();
        ViewOnTouchListenerC0957e viewOnTouchListenerC0957e = new ViewOnTouchListenerC0957e();
        this.f14537U0 = viewOnTouchListenerC0957e;
        cardOperationButtonM16458j0.setOnTouchListener(viewOnTouchListenerC0957e);
        CardOperationButton cardOperationButtonM16452g0 = m16452g0();
        ViewOnTouchListenerC0957e viewOnTouchListenerC0957e2 = new ViewOnTouchListenerC0957e();
        this.f14539V0 = viewOnTouchListenerC0957e2;
        cardOperationButtonM16452g0.setOnTouchListener(viewOnTouchListenerC0957e2);
        this.f14529Q0 = xck0.a(500, new e30() { // from class: l.adl
            public final void call(Object obj) {
                this.f9424a.m16447d1(wsf0VarM16475r0, (mol) obj);
            }
        });
        wsf0VarM16475r0.mo2808i(new e30() { // from class: l.bdl
            public final void call(Object obj) {
                this.f10024a.m16449e1(obj);
            }
        });
        wsf0VarM16475r0.mo2815p(new VSwipeStack.c() { // from class: l.cdl
            /* JADX INFO: renamed from: b */
            public final void m12511b(boolean z, float f, CardProgressAction cardProgressAction) {
                this.f10548a.m16451f1(wsf0VarM16475r0, z, f, cardProgressAction);
            }
        });
        final dcl dclVar = this.f14532S;
        Objects.requireNonNull(dclVar);
        wsf0VarM16475r0.mo2807g(new id50() { // from class: l.ddl
            @Override // p009l.id50
            /* JADX INFO: renamed from: a */
            public final VSwipeStack.OnCardSwipeResult mo13174a(mol molVar, SwipeDirection swipeDirection, boolean z) {
                return dclVar.m13168y2(molVar, swipeDirection, z);
            }
        });
        xij0.Z(m16464m0(), new d30() { // from class: l.edl
            public final void call() {
                this.f12514a.m16453g1();
            }
        });
        m16462l0().setCompoundDrawablesWithIntrinsicBounds(nu0.b(act(), x2c0.Et), null, null, null);
        m16462l0().setText(act().getString(R.string.Ug));
        m16462l0().setOnClickListener(new View.OnClickListener() { // from class: l.fdl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12954a.m16455h1(view);
            }
        });
        wsf0VarM16475r0.setAllowUpSwipe(true);
        m16482v0().setOnClickListener(new View.OnClickListener() { // from class: l.gdl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13448a.m16459j1(wsf0VarM16475r0, view);
            }
        });
        this.f14547b.d(this.f14538V, 256);
        xdl0.g0(new View[]{this.f14530R.mo15089c()});
        xdl0.Z(new View[]{this.f14549d});
        m16445c0().setOnLongClickListener(new View.OnLongClickListener() { // from class: l.hdl
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f13985a.m16441Z0(view);
            }
        });
        CoreBusinessModule.m0().f(this);
        if (upa.C2()) {
            this.f14564q.setNormalStateLayerBackground(this.f14528Q.drawable(x2c0.b2));
            this.f14566s.setNormalStateLayerBackground(this.f14528Q.drawable(x2c0.b2));
            this.f14567t.setNormalStateLayerBackground(this.f14528Q.drawable(x2c0.b2));
            this.f14571x.setNormalStateLayerBackground(this.f14528Q.drawable(x2c0.b2));
        }
        m16408E0();
    }

    /* JADX INFO: renamed from: H1 */
    public final void m16414H1() {
        KeyEvent.Callback callbackMo2805d = m16475r0().mo2805d();
        if (NullChecker.a(callbackMo2805d) && (callbackMo2805d instanceof d5m)) {
            d5m d5mVar = (d5m) callbackMo2805d;
            if (d5mVar.mo865k0()) {
                return;
            }
            ((ViewGroup) this.f14528Q.getWindow().getDecorView()).setMotionEventSplittingEnabled(true);
            xdl0.M0(this.f14526P, false);
            this.f14569v.stopAnimation(true);
            xdl0.M0(this.f14569v, false);
            int iU = this.f14526P.u();
            if (NullChecker.a(d5mVar.getCardData().m17130d())) {
                wge0.f().c(((DbObject) d5mVar.getCardData().m17130d()).id, iU, false, m16456i0().pageId());
                m16365J1(true);
            }
        }
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m16415I0() {
        return this.f14519L0;
    }

    /* JADX INFO: renamed from: I1 */
    public final void m16416I1() {
        m16365J1(false);
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m16417J0() {
        return this.f14505E0;
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m16418K0() {
        return ((Boolean) this.f14509G0.e()).booleanValue();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m16419L0() {
        xdl0.M(this.f14506F, false);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m16420M0(View view) {
        m16416I1();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m16421N0(View view) {
        m16416I1();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m16422O0(View view) {
        m16423O1();
    }

    /* JADX INFO: renamed from: O1 */
    public void m16423O1() {
        if (m16427Q1()) {
            return;
        }
        if (!ezc0.m0() || !CoreModule.K().me_().isNewUserIn24H() || !ezc0.i0().h0()) {
            this.f14532S.m13122P2(false);
        } else {
            ezc0.i0().k0();
            ezc0.i0().r0(false);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m16424P0(View view) {
        this.f14546a.removeView(view);
    }

    /* JADX INFO: renamed from: Q */
    public View m16425Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jdl.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ View m16426Q0(BoostViewContainer boostViewContainer, Drawable drawable, CharSequence charSequence, Integer num, Integer num2, Integer num3, Boolean bool) {
        return m16440Z(boostViewContainer, drawable, charSequence, num.intValue(), num2.intValue(), num3.intValue(), bool.booleanValue(), null);
    }

    /* JADX INFO: renamed from: Q1 */
    public boolean m16427Q1() {
        return m16475r0().mo2805d() == null;
    }

    @Nullable
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return this.f14528Q;
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ Boolean m16429R0() {
        return Boolean.valueOf(act().m3886d6());
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m16430S0(final BoostViewContainer boostViewContainer, int i) {
        if (i == 2) {
            this.f14532S.m13118M2();
            boostViewContainer.m7958e(this.f14528Q, new d30() { // from class: l.ycl
                public final void call() {
                    boostViewContainer.m7960g(true);
                }
            }, new v9j() { // from class: l.zcl
                public final Object call() {
                    return this.f23578a.m16429R0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m16431T0() {
        this.f14532S.m13166x1();
    }

    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void m16457i1(dcl dclVar) {
        this.f14532S = dclVar;
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m16433U0() {
        this.f14532S.m13157s1();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m16435W0() {
        this.f14532S.m13107B2();
    }

    /* JADX INFO: renamed from: X */
    public CardOperationButton m16436X(boolean z, boolean z2) {
        if (z) {
            return z2 ? m16476s0() : m16458j0();
        }
        return m16452g0();
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m16437X0(View view) {
        CoreModule.o.d().Pa(m16405C0());
        o6j0.c("e_suggest_users_home_location", "p_suggest_users_home_view", new o6j0.a[]{eli0.m13975b()});
    }

    /* JADX INFO: renamed from: Y */
    public void m16438Y() {
        m16475r0().setAllowUpSwipe(false);
        xdl0.M(m16478t0(), false);
        m16403A1(false, true);
        if (ezc0.m0()) {
            ezc0.i0().p0(false);
            LinearLayout linearLayout = this.f14561o;
            int i = t100.v;
            linearLayout.setPadding(i, linearLayout.getPaddingTop(), i, this.f14561o.getPaddingBottom());
        }
        if (IntlCountryCodeController.v()) {
            xdl0.M(this.f14516K, false);
            xdl0.M(this.f14522N, false);
            m16403A1(false, true);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m16439Y0(wsf0 wsf0Var, View view) {
        String str = "0";
        o6j0.c("e_suggest_like_button", this.f14538V.pageId(), new o6j0.a[]{o6j0.a.h("other_user_id", (NullChecker.a(wsf0Var.mo2814o()) && NullChecker.a(wsf0Var.mo2814o().m17130d())) ? ((DbObject) wsf0Var.mo2814o().m17130d()).id : "0"), eli0.m13975b()});
        String strPageId = this.f14538V.pageId();
        if (NullChecker.a(wsf0Var.mo2814o()) && NullChecker.a(wsf0Var.mo2814o().m17130d())) {
            str = ((DbObject) wsf0Var.mo2814o().m17130d()).id;
        }
        o6j0.c("e_likeButton", strPageId, new o6j0.a[]{o6j0.a.h("moments_user_id", str), eli0.m13975b()});
        m16379W(wsf0Var, "like");
        if (m16427Q1()) {
            return;
        }
        wsf0Var.mo2816r(SwipeDirection.RIGHT, true);
    }

    /* JADX INFO: renamed from: Z */
    public View m16440Z(View view, Drawable drawable, CharSequence charSequence, int i, int i2, int i3, boolean z, d30 d30Var) {
        int i4;
        int i5;
        int iD;
        int iD2;
        if (view != m16444b0() && view != m16445c0()) {
            xdl0.M(this.f14506F, false);
            if (z) {
                i4 = 0;
                i5 = 0;
                iD = 0;
                iD2 = 0;
            } else {
                int iD3 = t100.d(18.0f);
                int iD4 = t100.d(17.0f);
                iD = t100.d(18.0f);
                i4 = iD3;
                i5 = iD4;
                iD2 = t100.d(21.0f);
            }
            return mep0.b1(m16472q0(), view, drawable, charSequence, i, i2, 17, i3, i4, i5, iD, iD2, xdl0.y0() - t100.d(60.0f), 17, 0, false, d30Var);
        }
        VText vText = this.f14506F;
        NewMainAct newMainActAct = act();
        Objects.requireNonNull(newMainActAct);
        vText.setBackground(newMainActAct.drawable(x2c0.ua));
        ViewGroup.LayoutParams layoutParams = this.f14506F.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = t100.d(7.0f);
            marginLayoutParams.topMargin = t100.d(2.0f);
        }
        this.f14506F.setLayoutParams(layoutParams);
        this.f14506F.setPadding(t100.d(16.0f), t100.d(16.0f), t100.d(16.0f), t100.d(10.0f));
        this.f14506F.setTextSize(13.0f);
        this.f14506F.setText(charSequence);
        xdl0.M(this.f14506F, true);
        if (i3 != -1) {
            if (this.f14545Z == null) {
                this.f14545Z = new Runnable() { // from class: l.xcl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22509a.m16419L0();
                    }
                };
            }
            e51.H(act(), this.f14545Z, i3);
        }
        return this.f14506F;
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ boolean m16441Z0(View view) {
        if (CoreModule.c.J0.F3()) {
            return true;
        }
        m16444b0().m7959f();
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public void m16442a0() {
        m16475r0().setAllowUpSwipe(true);
        if (ezc0.m0()) {
            ezc0.i0().p0(true);
            LinearLayout linearLayout = this.f14561o;
            int i = t100.h;
            linearLayout.setPadding(i, linearLayout.getPaddingTop(), i, this.f14561o.getPaddingBottom());
        }
        if (IntlCountryCodeController.v()) {
            xdl0.M(this.f14516K, true);
            xdl0.M(this.f14522N, true);
            m16403A1(true, false);
        }
        if (fap.y()) {
            this.f14563p0 = true;
        }
        m16478t0().setVisibility(0);
        m16403A1(true, false);
        m16478t0().setOnClickListener(new View.OnClickListener() { // from class: l.ucl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21069a.m16420M0(view);
            }
        });
        m16476s0().setOnClickListener(new View.OnClickListener() { // from class: l.vcl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21533a.m16421N0(view);
            }
        });
        m16476s0().setOnLongPressListener(new C0956d());
        m16482v0().setOnClickListener(new View.OnClickListener() { // from class: l.wcl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22002a.m16422O0(view);
            }
        });
        xdl0.k0(m16448e0());
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m16443a1(wsf0 wsf0Var, View view) {
        String str = "0";
        o6j0.c("e_suggest_dislike_button", this.f14538V.pageId(), new o6j0.a[]{o6j0.a.h("other_user_id", (NullChecker.a(wsf0Var.mo2814o()) && NullChecker.a(wsf0Var.mo2814o().m17130d())) ? ((DbObject) wsf0Var.mo2814o().m17130d()).id : "0"), eli0.m13975b()});
        String strPageId = this.f14538V.pageId();
        if (NullChecker.a(wsf0Var.mo2814o()) && NullChecker.a(wsf0Var.mo2814o().m17130d())) {
            str = ((DbObject) wsf0Var.mo2814o().m17130d()).id;
        }
        o6j0.c("e_dislikeButton", strPageId, new o6j0.a[]{o6j0.a.h("moments_user_id", str), eli0.m13975b()});
        m16379W(wsf0Var, "dislike");
        if (m16427Q1()) {
            return;
        }
        wsf0Var.mo2816r(SwipeDirection.LEFT, true);
    }

    /* JADX INFO: renamed from: b0 */
    public BoostViewContainer m16444b0() {
        return this.f14530R.mo15095i();
    }

    /* JADX INFO: renamed from: c0 */
    public View m16445c0() {
        return this.f14530R.mo15095i().getBoostButton();
    }

    /* JADX INFO: renamed from: d0 */
    public View m16446d0() {
        return this.f14530R.mo15095i().getBoostHeartScene();
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m16447d1(wsf0 wsf0Var, mol molVar) {
        if (NullChecker.a(m16475r0().mo2805d())) {
            if ((mah0.m0() && NullChecker.a(m16475r0().mo2809j()) && NullChecker.a(m16475r0().mo2814o().m17130d()) && (mah0.y0(((DbObject) m16475r0().mo2814o().m17130d()).id) || m16475r0().mo2809j() == null)) || m16475r0().m19515q() || m16475r0().m19513f()) {
                return;
            }
            if (wsf0Var.mo2812m()) {
                wsf0Var.mo2813n();
                return;
            }
            d5m d5mVar = m16475r0().mo2805d() instanceof d5m ? (d5m) m16475r0().mo2805d() : null;
            if (NullChecker.a(d5mVar) && CoreModule.N().M8()) {
                NewNewProfileCard.m743Y1();
            }
            if (NullChecker.a(d5mVar)) {
                d5mVar.mo762C();
            }
            boolean z = false;
            int i = (d5mVar == null || !d5mVar.mo799P()) ? 1 : 0;
            boolean zIsUserLikeMe = (NullChecker.a(d5mVar) && NullChecker.a(d5mVar.getCardData()) && NullChecker.a(d5mVar.getCardData().m17131e())) ? d5mVar.getCardData().m17131e().isUserLikeMe() : false;
            String str = zIsUserLikeMe ? "upper_right" : "null";
            if (NullChecker.a(d5mVar) && d5mVar.mo765D("female_like_flag_lower_left")) {
                str = "lower_left";
                zIsUserLikeMe = true;
            }
            CoreSuggested.UserInfo userInfoMo2809j = m16475r0().mo2809j();
            CoreMomentInfo momentInfoProxy = molVar.getMomentInfoProxy();
            String strPageId = this.f14538V.pageId();
            o6j0.a aVarF = o6j0.a.f("IsWhiteBlock", i);
            o6j0.a aVarH = o6j0.a.h("moments_user_id", NullChecker.a(molVar.getUserProxy()) ? ((DbObject) molVar.getUserProxy()).id : "0");
            o6j0.a aVarI = o6j0.a.i("show_he_liked", zIsUserLikeMe);
            o6j0.a aVarH2 = o6j0.a.h("show_he_liked_position", str);
            o6j0.a aVarI2 = o6j0.a.i("is_first_picture", this.f14532S.m13119N1(NullChecker.a(molVar.getUserProxy()) ? ((DbObject) molVar.getUserProxy()).id : "0") && molVar.getShowPictureIndexProxy() == 0);
            o6j0.a aVarH3 = o6j0.a.h("swipe_scene", "default");
            if (NullChecker.a(userInfoMo2809j) && userInfoMo2809j.isThemeCard) {
                z = true;
            }
            o6j0.c("e_card", strPageId, new o6j0.a[]{aVarF, aVarH, aVarI, aVarH2, aVarI2, aVarH3, o6j0.a.i("theme_card_ornot", z), o6j0.a.h("is_moment_card", molVar.mo917z() ? "1" : "0"), o6j0.a.h("moment_id", momentInfoProxy != null ? ((CopyObject) momentInfoProxy).id : "0"), eli0.m13975b()});
            o6j0.c("e_moment", this.f14538V.pageId(), new o6j0.a[]{o6j0.a.h("moment_id", momentInfoProxy != null ? ((CopyObject) momentInfoProxy).id : "0"), o6j0.a.h("owner_id", momentInfoProxy != null ? momentInfoProxy.owner : "0"), o6j0.a.h("recommend_reason", "more history like"), eli0.m13975b()});
            abi.y(true);
            m16410F1("home_moment_theme_card", act().color(w0c0.O1));
        }
    }

    public void destroy() {
        this.f14548c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    /* JADX INFO: renamed from: e0 */
    public LinearLayout m16448e0() {
        return this.f14561o;
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m16449e1(Object obj) {
        this.f14529Q0.call(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public View m16450f0() {
        return this.f14560n;
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m16451f1(wsf0 wsf0Var, boolean z, float f, CardProgressAction cardProgressAction) {
        KeyEvent.Callback callbackMo2805d = wsf0Var.mo2805d();
        if (NullChecker.a(callbackMo2805d)) {
            d5m d5mVar = callbackMo2805d instanceof d5m ? (d5m) callbackMo2805d : null;
            if (d5mVar == null || !d5mVar.mo1891R()) {
                if (d5mVar != null && d5mVar.mo1890F()) {
                    if (this.f14513I0) {
                        m16452g0().mo2337j(-f);
                    }
                    if (this.f14515J0) {
                        m16458j0().mo2337j(f);
                    }
                    if (this.f14517K0) {
                        m16476s0().mo2337j(f);
                        return;
                    }
                    return;
                }
                if (f <= 0.0f) {
                    m16476s0().reset();
                    m16458j0().reset();
                    m16452g0().mo2337j(-f);
                    this.f14513I0 = true;
                    this.f14515J0 = false;
                    this.f14517K0 = false;
                    return;
                }
                if (z) {
                    m16476s0().reset();
                    m16452g0().reset();
                    m16458j0().mo2337j(f);
                    this.f14515J0 = true;
                    this.f14513I0 = false;
                    this.f14517K0 = false;
                    return;
                }
                m16458j0().reset();
                m16452g0().reset();
                m16476s0().mo2337j(f);
                this.f14513I0 = false;
                this.f14515J0 = false;
                this.f14517K0 = true;
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public CardOperationButton m16452g0() {
        return this.f14566s;
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m16453g1() {
        this.f14532S.m13107B2();
    }

    /* JADX INFO: renamed from: h0 */
    public DraweeView m16454h0() {
        return this.f14559m.f2136b;
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m16455h1(View view) {
        CoreDlg.D1(act(), "home", vwb.f0(new LinkChannel[]{LinkChannel.get("unknown")}));
    }

    /* JADX INFO: renamed from: i0 */
    public HomeThemeSlideFrag m16456i0() {
        return this.f14538V;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM16425Q = m16425Q(layoutInflater, viewGroup);
        this.f14530R = new gk8(this.f14548c);
        xdl0.M0(this.f14548c, false);
        ProfileCardStackThemeSlideOpt profileCardStackThemeSlideOpt = new ProfileCardStackThemeSlideOpt((Context) act(), new qol0() { // from class: l.fcl
            /* JADX INFO: renamed from: d2 */
            public final ool0 m14358d2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
                return this.f12921a.m16487y0(virtualCardType, userInfo);
            }
        }, this);
        this.f14536U = profileCardStackThemeSlideOpt;
        profileCardStackThemeSlideOpt.setClipChildren(false);
        this.f14536U.setClipToPadding(false);
        this.f14560n.addView(this.f14536U, 0, new FrameLayout.LayoutParams(-1, -1));
        this.f14534T = this.f14536U;
        xdl0.E0(this.f14561o, new View.OnClickListener() { // from class: l.gcl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                idl.m16381b(view);
            }
        });
        return viewM16425Q;
    }

    /* JADX INFO: renamed from: j0 */
    public CardOperationButton m16458j0() {
        return this.f14567t;
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m16459j1(wsf0 wsf0Var, View view) {
        String strPageId = this.f14538V.pageId();
        User user = CoreModule.c.n0.R;
        o6j0.c("e_undo_button", strPageId, new o6j0.a[]{o6j0.a.h("moments_user_id", user == null ? "NA" : ((DbObject) user).id), eli0.m13975b()});
        m16379W(wsf0Var, "undo");
        m16481u1();
        if (m16427Q1()) {
            return;
        }
        if (!ezc0.m0() || !CoreModule.K().me_().isNewUserIn24H() || !ezc0.i0().h0()) {
            this.f14532S.m13122P2(false);
        } else {
            ezc0.i0().k0();
            ezc0.i0().r0(false);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public RelativeLayout m16460k0() {
        return this.f14550e;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ znl m16461k1() {
        if (!NullChecker.a(m16475r0())) {
            return null;
        }
        KeyEvent.Callback callbackMo2805d = m16475r0().mo2805d();
        if (callbackMo2805d instanceof znl) {
            return (znl) callbackMo2805d;
        }
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public VButton_FakeShadow m16462l0() {
        return this.f14558l;
    }

    /* JADX INFO: renamed from: l1 */
    public void m16463l1(boolean z) {
        this.f14519L0 = z;
        if (z && NullChecker.a(act())) {
            m16481u1();
            dbl0.a(act().getWindow().getDecorView(), false);
        }
        if (!z && xdl0.O0(m16444b0())) {
            m16378V();
        }
        if (this.f14519L0 && NullChecker.a(m16475r0()) && NullChecker.a(m16475r0().mo2805d()) && (m16475r0().mo2805d() instanceof d5m)) {
            ((d5m) m16475r0().mo2805d()).mo762C();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public VDraweeView m16464m0() {
        return this.f14553h;
    }

    /* JADX INFO: renamed from: m1 */
    public void m16465m1() {
        if (NullChecker.a(m16475r0())) {
            m16475r0().mo2802a();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public RadarRipple m16466n0() {
        return this.f14552g;
    }

    /* JADX INFO: renamed from: n1 */
    public void m16467n1() {
        if (((Boolean) this.f14509G0.e()).booleanValue()) {
            this.f14531R0.start();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public LocationPermissionView m16468o0() {
        return this.f14547b;
    }

    /* JADX INFO: renamed from: o1 */
    public void m16469o1() {
        abi.y(true);
        this.f14531R0.cancel();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        LinearLayoutCompat childAt = this.f14548c.getChildAt(0);
        int childCount = childAt.getChildCount();
        int measuredWidth = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt2 = childAt.getChildAt(i);
            if (childAt2.isShown() && childAt2.getId() != u4c0.mf) {
                measuredWidth += childAt.getChildAt(i).getMeasuredWidth();
                LinearLayoutCompat.a layoutParams = childAt2.getLayoutParams();
                int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                if (i2 != 0) {
                    measuredWidth += i2;
                }
                int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (i3 != 0) {
                    measuredWidth += i3;
                }
                if (layoutParams.getMarginEnd() != 0) {
                    measuredWidth += layoutParams.getMarginEnd();
                }
                if (layoutParams.getMarginStart() != 0) {
                    measuredWidth += layoutParams.getMarginStart();
                }
            }
        }
        va40.m23337h(xdl0.y0() - measuredWidth);
    }

    /* JADX INFO: renamed from: p0 */
    public dcl m16470p0() {
        return this.f14532S;
    }

    /* JADX INFO: renamed from: p1 */
    public void m16471p1(boolean z) {
        xdl0.M0(this.f14569v, true);
        if (z) {
            SVGALoader.with(m16405C0()).from("https://auto.tancdn.com/v1/raw/02f79ff2-ea08-4696-9df5-d227b6fa4f2d12.pdf").autoPlay(true).repeatCount(-1).into(this.f14569v);
        } else {
            SVGALoader.with(m16405C0()).from("https://auto.tancdn.com/v1/raw/9a957b00-c134-4bf0-8dfd-1cdff0f4ec7513.pdf").autoPlay(true).repeatCount(-1).into(this.f14569v);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public FrameLayout m16472q0() {
        return this.f14546a;
    }

    /* JADX INFO: renamed from: q1 */
    public void m16473q1() {
        this.f14540W = null;
        this.f14509G0.onNext(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: r */
    public void m16474r() {
        m16413H0();
    }

    /* JADX INFO: renamed from: r0 */
    public wsf0 m16475r0() {
        return this.f14534T;
    }

    /* JADX INFO: renamed from: s0 */
    public CardOperationButton m16476s0() {
        return this.f14571x;
    }

    /* JADX INFO: renamed from: s1 */
    public void m16477s1(boolean z, boolean z2) {
        m16479t1(z, z2, false);
    }

    /* JADX INFO: renamed from: t0 */
    public FrameLayout m16478t0() {
        return this.f14568u;
    }

    /* JADX INFO: renamed from: t1 */
    public void m16479t1(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.f14532S.f11742c = "";
        }
        m16394r1(z2);
        if (((Boolean) this.f14509G0.e()).booleanValue() && !z) {
            e51.J(this.f14535T0);
            xdl0.M0(m16450f0(), true);
            m16369L1(true);
            m16488y1(true);
            this.f14531R0.cancel();
            if (NullChecker.a(m16460k0())) {
                xdl0.M0(m16460k0(), false);
                m16371M1(false);
            }
            m16377T(true);
            if (m16462l0().getVisibility() != 4) {
                xdl0.M0(m16462l0(), false);
            }
        } else if (!((Boolean) this.f14509G0.e()).booleanValue() && z) {
            this.f14535T0.m22715a(z2, false, false);
            if (z3) {
                e51.H(act(), this.f14535T0, zo0.f23777f);
            } else {
                this.f14535T0.run();
            }
        } else if (((Boolean) this.f14509G0.e()).booleanValue() && z && !z2 && this.f14532S.m13110D1()) {
            xdl0.M0(m16462l0(), false);
        }
        this.f14509G0.onNext(Boolean.valueOf(z));
        this.f14532S.f11757r = z2;
        m16375P1();
    }

    /* JADX INFO: renamed from: u0 */
    public LinearLayout m16480u0() {
        return this.f14514J;
    }

    /* JADX INFO: renamed from: u1 */
    public void m16481u1() {
        if (NullChecker.a(m16475r0()) && NullChecker.a(m16475r0().mo2805d()) && (m16475r0().mo2805d() instanceof d5m)) {
            ((d5m) m16475r0().mo2805d()).mo883p(true, false);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public CardOperationButton m16482v0() {
        return this.f14564q;
    }

    /* JADX INFO: renamed from: v1 */
    public void m16483v1() {
        m16444b0().setScaleX(1.0f);
        m16444b0().setScaleY(1.0f);
        m16446d0().setScaleX(1.0f);
        m16446d0().setScaleY(1.0f);
    }

    /* JADX INFO: renamed from: w0 */
    public VFrame_FlipContainer m16484w0() {
        return this.f14562p;
    }

    /* JADX INFO: renamed from: w1 */
    public void m16485w1() {
        m16444b0().setScaleX(0.0f);
        m16444b0().setScaleY(0.0f);
        m16446d0().setScaleX(0.0f);
        m16446d0().setScaleY(0.0f);
    }

    /* JADX INFO: renamed from: x0 */
    public ConstraintLayout m16486x0() {
        return this.f14508G;
    }

    /* JADX INFO: renamed from: y0 */
    public ool0 m16487y0(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        return null;
    }

    /* JADX INFO: renamed from: y1 */
    public void m16488y1(boolean z) {
        this.f14507F0 = z;
        if (!z || (!vdj.c() && n3b0.o())) {
            xdl0.M(m16444b0(), true);
            return;
        }
        if (!xdl0.O0(m16444b0())) {
            m16378V();
        }
        xdl0.M(m16444b0(), true);
    }

    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public void m16434V0() {
        m16402A0(this.f14538V.pageId());
    }

    /* JADX INFO: renamed from: E1 */
    public void m16409E1(int i) {
    }

    /* JADX INFO: renamed from: z1 */
    public void m16490z1(VSwipeStack.OnCardSwipeResult onCardSwipeResult, SwipeDirection swipeDirection) {
    }
}
