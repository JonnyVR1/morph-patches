package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4759y;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p046p1.mobile.putong.core.newui.home.themeslide.HomeThemeSlideFrag;
import com.p046p1.mobile.putong.core.newui.home.themeslide.ProfileCardStackThemeSlideOpt;
import com.p046p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideEmptyCardView;
import com.p046p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideErrorNetView;
import com.p046p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p046p1.mobile.putong.core.newui.home.views.HomeTitleLayout;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import com.p046p1.mobile.putong.core.p053ui.RadarRipple;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.main.LocationPermissionView;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.ProfileCreateData;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p046p1.mobile.putong.data.LinkChannel;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.sunshine.engine.particle.SceneView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p133rx.subjects.C22392a;
import p147v.VButton_FakeShadow;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VFrame_FlipContainer;
import p147v.VFrame_Squared;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class idl implements s7m<dcl>, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: A */
    public TextView f112569A;

    /* JADX INFO: renamed from: B */
    public SceneView f112570B;

    /* JADX INFO: renamed from: C */
    public VDraweeView f112571C;

    /* JADX INFO: renamed from: D */
    public VDraweeView f112572D;

    /* JADX INFO: renamed from: E */
    public VText f112573E;

    /* JADX INFO: renamed from: F */
    public VText f112575F;

    /* JADX INFO: renamed from: G */
    public ConstraintLayout f112577G;

    /* JADX INFO: renamed from: H */
    public View f112579H;

    /* JADX INFO: renamed from: I */
    public VText f112581I;

    /* JADX INFO: renamed from: I0 */
    public boolean f112582I0;

    /* JADX INFO: renamed from: J */
    public VLinear f112583J;

    /* JADX INFO: renamed from: J0 */
    public boolean f112584J0;

    /* JADX INFO: renamed from: K */
    public GradientBgButton f112585K;

    /* JADX INFO: renamed from: K0 */
    public boolean f112586K0;

    /* JADX INFO: renamed from: L */
    public GradientBgButton f112587L;

    /* JADX INFO: renamed from: L0 */
    public boolean f112588L0;

    /* JADX INFO: renamed from: M */
    public GradientBgButton f112589M;

    /* JADX INFO: renamed from: N */
    public GradientBgButton f112591N;

    /* JADX INFO: renamed from: O */
    public HomeThemeSlideErrorNetView f112593O;

    /* JADX INFO: renamed from: P */
    public SuperLikeComboAnimView f112595P;

    /* JADX INFO: renamed from: Q */
    public Act f112597Q;

    /* JADX INFO: renamed from: Q0 */
    public e30 f112598Q0;

    /* JADX INFO: renamed from: R */
    public qsl f112599R;

    /* JADX INFO: renamed from: R0 */
    public Animator f112600R0;

    /* JADX INFO: renamed from: S */
    public dcl f112601S;

    /* JADX INFO: renamed from: T */
    public wsf0 f112603T;

    /* JADX INFO: renamed from: U */
    public ProfileCardStackThemeSlideOpt f112605U;

    /* JADX INFO: renamed from: U0 */
    public ViewOnTouchListenerC17528e f112606U0;

    /* JADX INFO: renamed from: V */
    public HomeThemeSlideFrag f112607V;

    /* JADX INFO: renamed from: V0 */
    public ViewOnTouchListenerC17528e f112608V0;

    /* JADX INFO: renamed from: W */
    public hz30 f112609W;

    /* JADX INFO: renamed from: X */
    public int f112611X;

    /* JADX INFO: renamed from: a */
    public FrameLayout f112615a;

    /* JADX INFO: renamed from: b */
    public LocationPermissionView f112616b;

    /* JADX INFO: renamed from: c */
    public HomeTitleLayout f112617c;

    /* JADX INFO: renamed from: d */
    public VFrame f112618d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f112619e;

    /* JADX INFO: renamed from: f */
    public VFrame_Squared f112620f;

    /* JADX INFO: renamed from: g */
    public RadarRipple f112621g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f112622h;

    /* JADX INFO: renamed from: i */
    public VText f112623i;

    /* JADX INFO: renamed from: j */
    public Space f112624j;

    /* JADX INFO: renamed from: k */
    public VFrame f112625k;

    /* JADX INFO: renamed from: l */
    public VButton_FakeShadow f112627l;

    /* JADX INFO: renamed from: m */
    public HomeThemeSlideEmptyCardView f112628m;

    /* JADX INFO: renamed from: n */
    public VFrame f112629n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f112630o;

    /* JADX INFO: renamed from: p */
    public VFrame_FlipContainer f112631p;

    /* JADX INFO: renamed from: q */
    public CardOperationButton f112633q;

    /* JADX INFO: renamed from: r */
    public VText f112634r;

    /* JADX INFO: renamed from: s */
    public CardOperationButton f112635s;

    /* JADX INFO: renamed from: t */
    public CardOperationButton f112636t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f112637u;

    /* JADX INFO: renamed from: v */
    public SVGAnimationView f112638v;

    /* JADX INFO: renamed from: w */
    public VFrame_FlipContainer f112639w;

    /* JADX INFO: renamed from: x */
    public CardOperationButton f112640x;

    /* JADX INFO: renamed from: y */
    public VText f112641y;

    /* JADX INFO: renamed from: z */
    public SceneView f112642z;

    /* JADX INFO: renamed from: Y */
    public Runnable f112613Y = null;

    /* JADX INFO: renamed from: Z */
    public Runnable f112614Z = null;

    /* JADX INFO: renamed from: k0 */
    public Runnable f112626k0 = null;

    /* JADX INFO: renamed from: p0 */
    public boolean f112632p0 = true;

    /* JADX INFO: renamed from: E0 */
    public boolean f112574E0 = false;

    /* JADX INFO: renamed from: F0 */
    public boolean f112576F0 = false;

    /* JADX INFO: renamed from: G0 */
    public C22392a<Boolean> f112578G0 = C22392a.m221513c(Boolean.FALSE);

    /* JADX INFO: renamed from: H0 */
    public final View[] f112580H0 = new View[2];

    /* JADX INFO: renamed from: M0 */
    public View f112590M0 = null;

    /* JADX INFO: renamed from: N0 */
    public long f112592N0 = -1;

    /* JADX INFO: renamed from: O0 */
    public String f112594O0 = "empty";

    /* JADX INFO: renamed from: P0 */
    public String f112596P0 = "@@";

    /* JADX INFO: renamed from: S0 */
    public Runnable f112602S0 = new RunnableC17525b();

    /* JADX INFO: renamed from: T0 */
    public u0l f112604T0 = new C17526c();

    /* JADX INFO: renamed from: W0 */
    public final Runnable f112610W0 = new Runnable() { // from class: l.hcl
        @Override // java.lang.Runnable
        public final void run() {
            idl.m135467C();
        }
    };

    /* JADX INFO: renamed from: X0 */
    public am4<znl> f112612X0 = new am4() { // from class: l.icl
        @Override // p149l.am4
        /* JADX INFO: renamed from: d */
        public final Object mo97474d() {
            return this.f112468a.m135568k1();
        }
    };

    /* JADX INFO: renamed from: l.idl$a */
    public class C17524a implements d30 {
        public C17524a() {
        }

        @Override // p149l.d30
        public void call() {
            idl.this.f112601S.m110802F2(true);
        }
    }

    /* JADX INFO: renamed from: l.idl$b */
    public class RunnableC17525b implements Runnable {
        public RunnableC17525b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            idl.this.f112628m.m38851v();
            if (NullChecker.m81303a(idl.this.f112600R0)) {
                idl.this.f112600R0.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: l.idl$c */
    public class C17526c extends u0l {
        public C17526c() {
        }

        @Override // p149l.u0l, java.lang.Runnable
        public void run() {
            xdl0.m208345M0(idl.this.m135567k0(), true);
            xdl0.m208345M0(idl.this.m135558f0(), false);
            idl.this.m135480M1(true);
            idl.this.m135478L1(false);
            idl.this.m135595y1(false);
            idl.this.f112600R0.start();
            View viewFindViewWithTag = idl.this.m135579q0().findViewWithTag(idl.this.m135583s0().getTag() + "child");
            if (NullChecker.m81303a(viewFindViewWithTag)) {
                idl.this.m135579q0().removeView(viewFindViewWithTag);
            }
            idl.this.m135486T(false);
            if (!this.f172921a && !this.f172922b && !this.f172923c) {
                xdl0.m208345M0(idl.this.m135569l0(), false);
            }
            if (IntlCountryCodeController.m28126v()) {
                xdl0.m208344M(idl.this.m135587u0(), false);
                xdl0.m208344M(idl.this.m135593x0(), false);
            }
        }
    }

    /* JADX INFO: renamed from: l.idl$d */
    public class C17527d implements CardOperationButton.InterfaceC8049b {

        /* JADX INFO: renamed from: a */
        public String f112646a;

        public C17527d() {
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.views.CardOperationButton.InterfaceC8049b
        /* JADX INFO: renamed from: a */
        public void mo37399a() {
            e51.m114745J(idl.this.f112610W0);
            if (ogl0.m164247Z()) {
                idl.this.m135520G1();
            }
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.views.CardOperationButton.InterfaceC8049b
        /* JADX INFO: renamed from: b */
        public void mo37400b() {
            if (ogl0.m164247Z()) {
                idl.this.m135522H1();
            }
            if (TextUtils.isEmpty(this.f112646a)) {
                return;
            }
            e51.m114743H(idl.this.f112597Q, idl.this.f112610W0, 1000L);
        }
    }

    /* JADX INFO: renamed from: l.idl$e */
    public static class ViewOnTouchListenerC17528e implements View.OnTouchListener {

        /* JADX INFO: renamed from: c */
        public static int f112648c = zbc0.m217835a(8, 10);

        /* JADX INFO: renamed from: a */
        public int f112649a = 0;

        /* JADX INFO: renamed from: b */
        public VLinear.C22543a f112650b;

        public ViewOnTouchListenerC17528e() {
            VLinear.C22543a c22543a = new VLinear.C22543a();
            this.f112650b = c22543a;
            c22543a.m223064c();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f112649a <= f112648c) {
                if (motionEvent.getAction() == 0) {
                    int i = this.f112649a + 1;
                    this.f112649a = i;
                    if (i > f112648c) {
                        j760<Boolean, Boolean> j760VarM223063b = this.f112650b.m223063b();
                        C4759y.f20138Q = j760VarM223063b.f116564a.booleanValue();
                        C4759y.f20139R = j760VarM223063b.f116565b.booleanValue();
                    }
                }
                this.f112650b.m223062a(motionEvent);
            }
            if (motionEvent.getAction() == 0) {
                e5l.m114834c(true);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                e5l.m114834c(false);
            }
            return false;
        }
    }

    public idl(Act act, HomeThemeSlideFrag homeThemeSlideFrag) {
        this.f112597Q = act;
        this.f112607V = homeThemeSlideFrag;
    }

    /* JADX INFO: renamed from: B0 */
    private void m135466B0() {
        m135553c0().setBackgroundResource(x2c0.f190442p);
        final BoostViewContainer boostViewContainerM135552b0 = m135552b0();
        boostViewContainerM135552b0.m43691b(new e30() { // from class: l.kcl
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122393a.m135532P0((View) obj);
            }
        }, new baj() { // from class: l.lcl
            @Override // p149l.baj
            /* JADX INFO: renamed from: a */
            public final Object mo100908a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return this.f127428a.m135534Q0(boostViewContainerM135552b0, (Drawable) obj, (CharSequence) obj2, (Integer) obj3, (Integer) obj4, (Integer) obj5, (Boolean) obj6);
            }
        });
        boostViewContainerM135552b0.setSceneView(this.f112570B);
        boostViewContainerM135552b0.setInterceptFunc(new v9j() { // from class: l.mcl
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.f133147a.m135535Q1());
            }
        });
        boostViewContainerM135552b0.m43690a(new y93() { // from class: l.ncl
            @Override // p149l.y93
            /* JADX INFO: renamed from: a */
            public final void mo123970a(int i) {
                this.f138179a.m135538S0(boostViewContainerM135552b0, i);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m135467C() {
        C4348d.m20896l().m20900k("bubble_superlike_bubble");
        rxg0.m181577u();
    }

    /* JADX INFO: renamed from: J1 */
    private void m135474J1(boolean z) {
        o6j0.m162859c(MatchScData.ModuleId.mid_e_superlikeButton, this.f112607V.pageId(), o6j0.C18854a.m162878h("moments_user_id", (!NullChecker.m81303a(m135582r0().mo38813j()) || m135582r0().mo38813j().isVirtualCard()) ? "0" : m135582r0().mo38813j().f19472id), o6j0.C18854a.m162879i("is_privileged", !n3b0.m157745t()), o6j0.C18854a.m162878h("showfrom_superlike", "home"), eli0.m117122b());
        if (ogl0.m164247Z() && !z) {
            wge0.m203034f().m203036c(m135582r0().mo38813j().f19472id, 1, true, m135564i0().pageId());
        }
        if (m135582r0() != null) {
            m135488W(m135582r0(), "superlike");
        }
        if (m135535Q1()) {
            return;
        }
        this.f112601S.m110814Q2(true, z);
    }

    /* JADX INFO: renamed from: K1 */
    private void m135476K1(String str) {
        String str2;
        if (TextUtils.equals(str, "like")) {
            str2 = "right";
        } else if (TextUtils.equals(str, "superlike")) {
            str2 = "up";
        } else {
            str2 = TextUtils.equals(str, "undo") ? "back" : BLiveGiftBubblePopupTitlePosition.left;
        }
        long jM155944o = this.f112592N0 > 0 ? mqi0.m155944o() - this.f112592N0 : -1L;
        this.f112592N0 = mqi0.m155944o();
        o6j0.m162859c("e_card_click_interval", "p_suggest_users_home_view", o6j0.C18854a.m162878h("current_operation", str2), o6j0.C18854a.m162877g("operation_interval", jM155944o), o6j0.C18854a.m162878h("last_operation", this.f112594O0));
        this.f112594O0 = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public void m135478L1(boolean z) {
        HomeStatisticsHelper.m36689C(this.f112607V.getUserVisibleHint() && !this.f112607V.isHidden());
        if (z) {
            HomeStatisticsHelper.m36715u();
        } else {
            HomeStatisticsHelper.m36714t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public void m135480M1(boolean z) {
        HomeStatisticsHelper.m36689C(this.f112607V.getUserVisibleHint() && !this.f112607V.isHidden());
        if (z) {
            HomeStatisticsHelper.m36717w();
        } else {
            HomeStatisticsHelper.m36716v();
        }
    }

    /* JADX INFO: renamed from: P1 */
    private void m135484P1() {
        if (this.f112578G0.m221515e().booleanValue()) {
            m135565j0().setOnTouchListener(null);
            m135560g0().setOnTouchListener(null);
            m135565j0().setClickable(false);
            m135560g0().setClickable(false);
            m135589v0().setClickable(false);
            m135583s0().setClickable(false);
            return;
        }
        m135565j0().setOnTouchListener(this.f112606U0);
        m135560g0().setOnTouchListener(this.f112608V0);
        m135565j0().setClickable(true);
        m135560g0().setClickable(true);
        m135589v0().setClickable(true);
        m135583s0().setClickable(true);
    }

    /* JADX INFO: renamed from: S */
    private void m135485S(boolean z) {
        if (z) {
            m135552b0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m135554d0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
        } else {
            m135552b0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            m135554d0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public void m135486T(boolean z) {
        if (z) {
            m135565j0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m135585t0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m135589v0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m135560g0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            rxg0.m181572j().f161457b.m132487l(roj0.f160388a);
        } else {
            m135565j0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            m135585t0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            m135589v0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            m135560g0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        }
        m135485S(z);
    }

    /* JADX INFO: renamed from: V */
    private void m135487V() {
        o6j0.m162864h("e_boost_button", this.f112607V.pageId(), o6j0.C18854a.m162879i("is_privileged", !swh0.m186269v()));
    }

    /* JADX INFO: renamed from: W */
    private void m135488W(wsf0 wsf0Var, String str) {
        m135476K1(str);
        wsf0Var.m161386h(str);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m135490b(View view) {
    }

    /* JADX INFO: renamed from: r1 */
    private void m135503r1(boolean z) {
        if (z) {
            act().removeCallbacks(this.f112602S0);
            this.f112628m.setVisibility(8);
            this.f112628m.m38842m();
        } else {
            act().removeCallbacks(this.f112602S0);
            if (this.f112601S.m110811P1()) {
                this.f112601S.m110854w2();
            } else {
                act().postDelayed(this.f112602S0, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m135508x() {
    }

    /* JADX INFO: renamed from: A0 */
    public void m135511A0(String str) {
        m135588u1();
        xdl0.m208344M(this.f112599R.mo126602m(), false);
        zq20.m219840e(act(), str, new C17524a());
    }

    /* JADX INFO: renamed from: A1 */
    public void m135512A1(boolean z, boolean z2) {
        this.f112574E0 = z;
        if (m135525J0()) {
            if (z2) {
                xdl0.m208344M(m135589v0(), z);
                xdl0.m208344M(m135591w0(), z);
                return;
            } else {
                xdl0.m208345M0(m135589v0(), z);
                xdl0.m208345M0(m135591w0(), z);
                return;
            }
        }
        if (z2) {
            xdl0.m208344M(m135589v0(), false);
            xdl0.m208344M(m135591w0(), false);
        } else {
            xdl0.m208345M0(m135589v0(), false);
            xdl0.m208345M0(m135591w0(), false);
        }
    }

    /* JADX INFO: renamed from: B1 */
    public boolean m135513B1() {
        if (m135582r0() != null && (m135582r0().mo38809d() instanceof d5m)) {
            d5m d5mVar = (d5m) m135582r0().mo38809d();
            if (!d5mVar.mo36947y() || d5mVar.mo36886f() || d5mVar.mo36836N()) {
                return false;
            }
            return ((NullChecker.m81303a(d5mVar.getCardData().m141745d()) && mah0.m153738y0(d5mVar.getCardData().m141745d().f56011id)) || mah0.m153729s0().m153789z0()) ? false : true;
        }
        return false;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f112597Q;
    }

    /* JADX INFO: renamed from: C1 */
    public void m135514C1() {
        m135556e0().setVisibility(0);
    }

    /* JADX INFO: renamed from: D0 */
    public void m135515D0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        xdl0.m208362Z(this.f112593O);
        try {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f112593O.getLayoutParams();
        } catch (ClassCastException unused) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(this.f112593O.getWidth(), this.f112593O.getHeight());
        }
        marginLayoutParams.topMargin += vtd.m199996a(act(), 56.0f);
        this.f112593O.setLayoutParams(marginLayoutParams);
        boolean z = upa.m194647I0().enabled;
        HomeThemeSlideEmptyCardView homeThemeSlideEmptyCardView = this.f112628m;
        if (z) {
            homeThemeSlideEmptyCardView.m38845p(new d30() { // from class: l.ocl
                @Override // p149l.d30
                public final void call() {
                    idl.m135508x();
                }
            }, new d30() { // from class: l.qcl
                @Override // p149l.d30
                public final void call() {
                    this.f153763a.m135539T0();
                }
            }, this.f112601S);
        } else {
            homeThemeSlideEmptyCardView.m38845p(new d30() { // from class: l.rcl
                @Override // p149l.d30
                public final void call() {
                    this.f158781a.m135541U0();
                }
            }, new d30() { // from class: l.scl
                @Override // p149l.d30
                public final void call() {
                    this.f163751a.m135542V0();
                }
            }, this.f112601S);
        }
        this.f112593O.m38864m(this.f112601S, new d30() { // from class: l.tcl
            @Override // p149l.d30
            public final void call() {
                this.f169462a.m135543W0();
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public void m135516E0() {
        xdl0.m208329E0(this.f112599R.getPosition(), new View.OnClickListener() { // from class: l.jcl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117338a.m135545X0(view);
            }
        });
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
    /* JADX INFO: renamed from: F1 */
    public void m135518F1(String str, int i) {
        if (m135582r0() == null || m135582r0().mo38809d() == null || m135582r0().mo38818o() == null || m135582r0().mo38818o().m141745d() == null) {
            return;
        }
        User userM141745d = m135582r0().mo38818o().m141745d();
        sbp.m183249i(userM141745d.f56011id);
        Intent intentM50746z2 = ProfileAct.m50746z2(act(), userM141745d.f56011id, str, true, false, false);
        if (TextUtils.equals(userM141745d.f56011id, CoreModule.f17545c.f19642f0.f19868J0.get())) {
            ProfileCreateData profileCreateData = new ProfileCreateData();
            profileCreateData.showCountdownSendMsg = true;
            intentM50746z2.putExtra("profile_create_data", profileCreateData);
        }
        this.f112607V.startActivityForResult(intentM50746z2, 114);
    }

    /* JADX INFO: renamed from: G0 */
    public void m135519G0(boolean z, boolean z2) {
        this.f112578G0.m132487l(Boolean.valueOf(z));
        this.f112601S.f85469r = z2;
        if (z) {
            m135565j0().setScaleX(0.0f);
            m135565j0().setScaleY(0.0f);
            m135560g0().setScaleX(0.0f);
            m135560g0().setScaleY(0.0f);
            m135585t0().setScaleX(0.0f);
            m135585t0().setScaleY(0.0f);
            m135589v0().setScaleX(0.0f);
            m135589v0().setScaleY(0.0f);
            m135592w1();
        } else {
            m135565j0().setScaleX(1.0f);
            m135565j0().setScaleY(1.0f);
            m135560g0().setScaleX(1.0f);
            m135560g0().setScaleY(1.0f);
            m135585t0().setScaleX(1.0f);
            m135585t0().setScaleY(1.0f);
            m135589v0().setScaleX(1.0f);
            m135589v0().setScaleY(1.0f);
            m135590v1();
        }
        m135484P1();
        m135573n0().setRadarColor(this.f112611X);
        this.f112600R0 = xij0.m209659b0(m135573n0(), m135571m0());
        xdl0.m208345M0(m135567k0(), z);
        xdl0.m208345M0(m135558f0(), !z);
        m135480M1(z);
        m135478L1(!z);
        xdl0.m208345M0(m135569l0(), false);
        if (IntlCountryCodeController.m28126v()) {
            xdl0.m208344M(m135587u0(), !z);
            xdl0.m208344M(m135593x0(), !z);
        }
        if (z && !z2) {
            xdl0.m208345M0(m135569l0(), false);
        }
        m135595y1(!z);
        this.f112624j.setVisibility(4);
    }

    /* JADX INFO: renamed from: G1 */
    public final void m135520G1() {
        KeyEvent.Callback callbackMo38809d = m135582r0().mo38809d();
        if (NullChecker.m81303a(callbackMo38809d)) {
            if ((callbackMo38809d instanceof d5m) && ((d5m) callbackMo38809d).mo36902k0()) {
                return;
            }
            ((ViewGroup) this.f112597Q.getWindow().getDecorView()).setMotionEventSplittingEnabled(false);
            d5m d5mVar = (d5m) callbackMo38809d;
            boolean z = NullChecker.m81303a(d5mVar.getCardData().m141745d()) && TextUtils.equals(d5mVar.getCardData().m141745d().f56011id, rxg0.m181572j().f161468m);
            xdl0.m208345M0(this.f112595P, true);
            xdl0.m208345M0(this.f112638v, true);
            m135578p1(false);
            this.f112595P.m55788r(z, false, d5mVar.getCardData().m141745d().isFemale());
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m135521H0() {
        final wsf0 wsf0VarM135582r0 = m135582r0();
        m135515D0();
        this.f112630o.setClipChildren(false);
        this.f112630o.setClipToPadding(false);
        if (!vdj.m198001c() && IntlCountryCodeController.m28119o()) {
            m135546Y();
            if (nkp.m159986e()) {
                m135550a0();
            }
        } else {
            m135550a0();
        }
        m135466B0();
        this.f112611X = act().color(w0c0.f183773I);
        hz30 hz30Var = new hz30(this.f112601S, this);
        this.f112609W = hz30Var;
        wsf0VarM135582r0.setAdapter(hz30Var);
        m135565j0().setOnClickListener(new View.OnClickListener() { // from class: l.ecl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90550a.m135547Y0(wsf0VarM135582r0, view);
            }
        });
        m135560g0().setOnClickListener(new View.OnClickListener() { // from class: l.pcl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148186a.m135551a1(wsf0VarM135582r0, view);
            }
        });
        CardOperationButton cardOperationButtonM135565j0 = m135565j0();
        ViewOnTouchListenerC17528e viewOnTouchListenerC17528e = new ViewOnTouchListenerC17528e();
        this.f112606U0 = viewOnTouchListenerC17528e;
        cardOperationButtonM135565j0.setOnTouchListener(viewOnTouchListenerC17528e);
        CardOperationButton cardOperationButtonM135560g0 = m135560g0();
        ViewOnTouchListenerC17528e viewOnTouchListenerC17528e2 = new ViewOnTouchListenerC17528e();
        this.f112608V0 = viewOnTouchListenerC17528e2;
        cardOperationButtonM135560g0.setOnTouchListener(viewOnTouchListenerC17528e2);
        this.f112598Q0 = xck0.m208120a(500, new e30() { // from class: l.adl
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68946a.m135555d1(wsf0VarM135582r0, (mol) obj);
            }
        });
        wsf0VarM135582r0.mo38812i(new e30() { // from class: l.bdl
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75042a.m135557e1(obj);
            }
        });
        wsf0VarM135582r0.mo38819p(new VSwipeStack.InterfaceC4767c() { // from class: l.cdl
            @Override // com.p046p1.mobile.putong.core.card.VSwipeStack.InterfaceC4767c
            /* JADX INFO: renamed from: b */
            public final void mo35197b(boolean z, float f, CardProgressAction cardProgressAction) {
                this.f80376a.m135559f1(wsf0VarM135582r0, z, f, cardProgressAction);
            }
        });
        final dcl dclVar = this.f112601S;
        Objects.requireNonNull(dclVar);
        wsf0VarM135582r0.mo38811g(new id50() { // from class: l.ddl
            @Override // p149l.id50
            /* JADX INFO: renamed from: a */
            public final VSwipeStack.OnCardSwipeResult mo111028a(mol molVar, SwipeDirection swipeDirection, boolean z) {
                return dclVar.m110857y2(molVar, swipeDirection, z);
            }
        });
        xij0.m209657Z(m135571m0(), new d30() { // from class: l.edl
            @Override // p149l.d30
            public final void call() {
                this.f90614a.m135561g1();
            }
        });
        m135569l0().setCompoundDrawablesWithIntrinsicBounds(nu0.m161424b(act(), x2c0.f189311Et), (Drawable) null, (Drawable) null, (Drawable) null);
        m135569l0().setText(act().getString(R$string.f18183Ug));
        m135569l0().setOnClickListener(new View.OnClickListener() { // from class: l.fdl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97057a.m135563h1(view);
            }
        });
        wsf0VarM135582r0.setAllowUpSwipe(true);
        m135589v0().setOnClickListener(new View.OnClickListener() { // from class: l.gdl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102122a.m135566j1(wsf0VarM135582r0, view);
            }
        });
        this.f112616b.m47360d(this.f112607V, 256);
        xdl0.m208376g0(this.f112599R.mo126592c());
        xdl0.m208362Z(this.f112618d);
        m135553c0().setOnLongClickListener(new View.OnLongClickListener() { // from class: l.hdl
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f107252a.m135549Z0(view);
            }
        });
        CoreBusinessModule.m29908m0().mo190519f(this);
        if (upa.m194619C2()) {
            this.f112633q.setNormalStateLayerBackground(this.f112597Q.drawable(x2c0.f190000b2));
            this.f112635s.setNormalStateLayerBackground(this.f112597Q.drawable(x2c0.f190000b2));
            this.f112636t.setNormalStateLayerBackground(this.f112597Q.drawable(x2c0.f190000b2));
            this.f112640x.setNormalStateLayerBackground(this.f112597Q.drawable(x2c0.f190000b2));
        }
        m135516E0();
    }

    /* JADX INFO: renamed from: H1 */
    public final void m135522H1() {
        KeyEvent.Callback callbackMo38809d = m135582r0().mo38809d();
        if (NullChecker.m81303a(callbackMo38809d) && (callbackMo38809d instanceof d5m)) {
            d5m d5mVar = (d5m) callbackMo38809d;
            if (d5mVar.mo36902k0()) {
                return;
            }
            ((ViewGroup) this.f112597Q.getWindow().getDecorView()).setMotionEventSplittingEnabled(true);
            xdl0.m208345M0(this.f112595P, false);
            this.f112638v.stopAnimation(true);
            xdl0.m208345M0(this.f112638v, false);
            int iM55791u = this.f112595P.m55791u();
            if (NullChecker.m81303a(d5mVar.getCardData().m141745d())) {
                wge0.m203034f().m203036c(d5mVar.getCardData().m141745d().f56011id, iM55791u, false, m135564i0().pageId());
                m135474J1(true);
            }
        }
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m135523I0() {
        return this.f112588L0;
    }

    /* JADX INFO: renamed from: I1 */
    public final void m135524I1() {
        m135474J1(false);
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m135525J0() {
        return this.f112574E0;
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m135526K0() {
        return this.f112578G0.m221515e().booleanValue();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m135527L0() {
        xdl0.m208344M(this.f112575F, false);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m135528M0(View view) {
        m135524I1();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m135529N0(View view) {
        m135524I1();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m135530O0(View view) {
        m135531O1();
    }

    /* JADX INFO: renamed from: O1 */
    public void m135531O1() {
        if (m135535Q1()) {
            return;
        }
        if (!ezc0.m118907m0() || !CoreModule.m29932K().me_().isNewUserIn24H() || !ezc0.m118906i0().getCanGuideUndoTips()) {
            this.f112601S.m110812P2(false);
        } else {
            ezc0.m118906i0().m118914k0();
            ezc0.m118906i0().m118919r0(false);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m135532P0(View view) {
        this.f112615a.removeView(view);
    }

    /* JADX INFO: renamed from: Q */
    public View m135533Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jdl.m141037b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ View m135534Q0(BoostViewContainer boostViewContainer, Drawable drawable, CharSequence charSequence, Integer num, Integer num2, Integer num3, Boolean bool) {
        return m135548Z(boostViewContainer, drawable, charSequence, num.intValue(), num2.intValue(), num3.intValue(), bool.booleanValue(), null);
    }

    /* JADX INFO: renamed from: Q1 */
    public boolean m135535Q1() {
        return m135582r0().mo38809d() == null;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public NewMainAct getAct() {
        return (NewMainAct) this.f112597Q;
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ Boolean m135537R0() {
        return Boolean.valueOf(act().m39810d6());
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m135538S0(final BoostViewContainer boostViewContainer, int i) {
        if (i == 2) {
            this.f112601S.m110808M2();
            boostViewContainer.m43694e(this.f112597Q, new d30() { // from class: l.ycl
                @Override // p149l.d30
                public final void call() {
                    boostViewContainer.m43696g(true);
                }
            }, new v9j() { // from class: l.zcl
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f202556a.m135537R0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m135539T0() {
        this.f112601S.m110855x1();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(dcl dclVar) {
        this.f112601S = dclVar;
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m135541U0() {
        this.f112601S.m110846s1();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m135543W0() {
        this.f112601S.m110797B2();
    }

    /* JADX INFO: renamed from: X */
    public CardOperationButton m135544X(boolean z, boolean z2) {
        if (z) {
            return z2 ? m135583s0() : m135565j0();
        }
        return m135560g0();
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m135545X0(View view) {
        CoreModule.f17557o.m195057d().mo33738Pa(getContext());
        o6j0.m162859c("e_suggest_users_home_location", "p_suggest_users_home_view", eli0.m117122b());
    }

    /* JADX INFO: renamed from: Y */
    public void m135546Y() {
        m135582r0().setAllowUpSwipe(false);
        xdl0.m208344M(m135585t0(), false);
        m135512A1(false, true);
        if (ezc0.m118907m0()) {
            ezc0.m118906i0().m118917p0(false);
            LinearLayout linearLayout = this.f112630o;
            int i = t100.f167273v;
            linearLayout.setPadding(i, linearLayout.getPaddingTop(), i, this.f112630o.getPaddingBottom());
        }
        if (IntlCountryCodeController.m28126v()) {
            xdl0.m208344M(this.f112585K, false);
            xdl0.m208344M(this.f112591N, false);
            m135512A1(false, true);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m135547Y0(wsf0 wsf0Var, View view) {
        String str = "0";
        o6j0.m162859c("e_suggest_like_button", this.f112607V.pageId(), o6j0.C18854a.m162878h("other_user_id", (NullChecker.m81303a(wsf0Var.mo38818o()) && NullChecker.m81303a(wsf0Var.mo38818o().m141745d())) ? wsf0Var.mo38818o().m141745d().f56011id : "0"), eli0.m117122b());
        String strPageId = this.f112607V.pageId();
        if (NullChecker.m81303a(wsf0Var.mo38818o()) && NullChecker.m81303a(wsf0Var.mo38818o().m141745d())) {
            str = wsf0Var.mo38818o().m141745d().f56011id;
        }
        o6j0.m162859c(MatchScData.ModuleId.mid_e_likeButton, strPageId, o6j0.C18854a.m162878h("moments_user_id", str), eli0.m117122b());
        m135488W(wsf0Var, "like");
        if (m135535Q1()) {
            return;
        }
        wsf0Var.mo38820r(SwipeDirection.RIGHT, true);
    }

    /* JADX INFO: renamed from: Z */
    public View m135548Z(View view, Drawable drawable, CharSequence charSequence, int i, int i2, int i3, boolean z, d30 d30Var) {
        int i4;
        int i5;
        int iM186890d;
        int iM186890d2;
        if (view != m135552b0() && view != m135553c0()) {
            xdl0.m208344M(this.f112575F, false);
            if (z) {
                i4 = 0;
                i5 = 0;
                iM186890d = 0;
                iM186890d2 = 0;
            } else {
                int iM186890d3 = t100.m186890d(18.0f);
                int iM186890d4 = t100.m186890d(17.0f);
                iM186890d = t100.m186890d(18.0f);
                i4 = iM186890d3;
                i5 = iM186890d4;
                iM186890d2 = t100.m186890d(21.0f);
            }
            return mep0.m154300b1(m135579q0(), view, drawable, charSequence, i, i2, 17, i3, i4, i5, iM186890d, iM186890d2, xdl0.m208412y0() - t100.m186890d(60.0f), 17, 0, false, d30Var);
        }
        VText vText = this.f112575F;
        NewMainAct newMainActAct = act();
        Objects.requireNonNull(newMainActAct);
        vText.setBackground(newMainActAct.drawable(x2c0.f190613ua));
        ViewGroup.LayoutParams layoutParams = this.f112575F.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = t100.m186890d(7.0f);
            marginLayoutParams.topMargin = t100.m186890d(2.0f);
        }
        this.f112575F.setLayoutParams(layoutParams);
        this.f112575F.setPadding(t100.m186890d(16.0f), t100.m186890d(16.0f), t100.m186890d(16.0f), t100.m186890d(10.0f));
        this.f112575F.setTextSize(13.0f);
        this.f112575F.setText(charSequence);
        xdl0.m208344M(this.f112575F, true);
        if (i3 != -1) {
            if (this.f112614Z == null) {
                this.f112614Z = new Runnable() { // from class: l.xcl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f192241a.m135527L0();
                    }
                };
            }
            e51.m114743H(act(), this.f112614Z, i3);
        }
        return this.f112575F;
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ boolean m135549Z0(View view) {
        if (CoreModule.f17545c.f19576J0.m139254F3()) {
            return true;
        }
        m135552b0().m43695f();
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public void m135550a0() {
        m135582r0().setAllowUpSwipe(true);
        if (ezc0.m118907m0()) {
            ezc0.m118906i0().m118917p0(true);
            LinearLayout linearLayout = this.f112630o;
            int i = t100.f167259h;
            linearLayout.setPadding(i, linearLayout.getPaddingTop(), i, this.f112630o.getPaddingBottom());
        }
        if (IntlCountryCodeController.m28126v()) {
            xdl0.m208344M(this.f112585K, true);
            xdl0.m208344M(this.f112591N, true);
            m135512A1(true, false);
        }
        if (fap.m120266y()) {
            this.f112632p0 = true;
        }
        m135585t0().setVisibility(0);
        m135512A1(true, false);
        m135585t0().setOnClickListener(new View.OnClickListener() { // from class: l.ucl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175831a.m135528M0(view);
            }
        });
        m135583s0().setOnClickListener(new View.OnClickListener() { // from class: l.vcl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180963a.m135529N0(view);
            }
        });
        m135583s0().setOnLongPressListener(new C17527d());
        m135589v0().setOnClickListener(new View.OnClickListener() { // from class: l.wcl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185696a.m135530O0(view);
            }
        });
        xdl0.m208384k0(m135556e0());
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m135551a1(wsf0 wsf0Var, View view) {
        String str = "0";
        o6j0.m162859c("e_suggest_dislike_button", this.f112607V.pageId(), o6j0.C18854a.m162878h("other_user_id", (NullChecker.m81303a(wsf0Var.mo38818o()) && NullChecker.m81303a(wsf0Var.mo38818o().m141745d())) ? wsf0Var.mo38818o().m141745d().f56011id : "0"), eli0.m117122b());
        String strPageId = this.f112607V.pageId();
        if (NullChecker.m81303a(wsf0Var.mo38818o()) && NullChecker.m81303a(wsf0Var.mo38818o().m141745d())) {
            str = wsf0Var.mo38818o().m141745d().f56011id;
        }
        o6j0.m162859c("e_dislikeButton", strPageId, o6j0.C18854a.m162878h("moments_user_id", str), eli0.m117122b());
        m135488W(wsf0Var, "dislike");
        if (m135535Q1()) {
            return;
        }
        wsf0Var.mo38820r(SwipeDirection.LEFT, true);
    }

    /* JADX INFO: renamed from: b0 */
    public BoostViewContainer m135552b0() {
        return this.f112599R.mo126598i();
    }

    /* JADX INFO: renamed from: c0 */
    public View m135553c0() {
        return this.f112599R.mo126598i().getBoostButton();
    }

    /* JADX INFO: renamed from: d0 */
    public View m135554d0() {
        return this.f112599R.mo126598i().getBoostHeartScene();
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m135555d1(wsf0 wsf0Var, mol molVar) {
        if (NullChecker.m81303a(m135582r0().mo38809d())) {
            if ((mah0.m153720m0() && NullChecker.m81303a(m135582r0().mo38813j()) && NullChecker.m81303a(m135582r0().mo38818o().m141745d()) && (mah0.m153738y0(m135582r0().mo38818o().m141745d().f56011id) || m135582r0().mo38813j() == null)) || m135582r0().m161387q() || m135582r0().m161385f()) {
                return;
            }
            if (wsf0Var.mo38816m()) {
                wsf0Var.mo38817n();
                return;
            }
            d5m d5mVar = m135582r0().mo38809d() instanceof d5m ? (d5m) m135582r0().mo38809d() : null;
            if (NullChecker.m81303a(d5mVar) && CoreModule.m29934N().mo60294M8()) {
                NewNewProfileCard.m36787Y1();
            }
            if (NullChecker.m81303a(d5mVar)) {
                d5mVar.mo36806C();
            }
            boolean z = false;
            int i = (d5mVar == null || !d5mVar.mo36842P()) ? 1 : 0;
            boolean zIsUserLikeMe = (NullChecker.m81303a(d5mVar) && NullChecker.m81303a(d5mVar.getCardData()) && NullChecker.m81303a(d5mVar.getCardData().m141746e())) ? d5mVar.getCardData().m141746e().isUserLikeMe() : false;
            String str = zIsUserLikeMe ? "upper_right" : "null";
            if (NullChecker.m81303a(d5mVar) && d5mVar.mo36809D("female_like_flag_lower_left")) {
                str = "lower_left";
                zIsUserLikeMe = true;
            }
            CoreSuggested.UserInfo userInfoMo38813j = m135582r0().mo38813j();
            CoreMomentInfo momentInfoProxy = molVar.getMomentInfoProxy();
            String strPageId = this.f112607V.pageId();
            o6j0.C18854a c18854aM162876f = o6j0.C18854a.m162876f("IsWhiteBlock", i);
            o6j0.C18854a c18854aM162878h = o6j0.C18854a.m162878h("moments_user_id", NullChecker.m81303a(molVar.getUserProxy()) ? molVar.getUserProxy().f56011id : "0");
            o6j0.C18854a c18854aM162879i = o6j0.C18854a.m162879i("show_he_liked", zIsUserLikeMe);
            o6j0.C18854a c18854aM162878h2 = o6j0.C18854a.m162878h("show_he_liked_position", str);
            o6j0.C18854a c18854aM162879i2 = o6j0.C18854a.m162879i("is_first_picture", this.f112601S.m110809N1(NullChecker.m81303a(molVar.getUserProxy()) ? molVar.getUserProxy().f56011id : "0") && molVar.getShowPictureIndexProxy() == 0);
            o6j0.C18854a c18854aM162878h3 = o6j0.C18854a.m162878h("swipe_scene", "default");
            if (NullChecker.m81303a(userInfoMo38813j) && userInfoMo38813j.isThemeCard) {
                z = true;
            }
            o6j0.m162859c(MatchScData.ModuleId.mid_e_card, strPageId, c18854aM162876f, c18854aM162878h, c18854aM162879i, c18854aM162878h2, c18854aM162879i2, c18854aM162878h3, o6j0.C18854a.m162879i("theme_card_ornot", z), o6j0.C18854a.m162878h("is_moment_card", molVar.mo36950z() ? "1" : "0"), o6j0.C18854a.m162878h("moment_id", momentInfoProxy != null ? momentInfoProxy.f56008id : "0"), eli0.m117122b());
            o6j0.m162859c("e_moment", this.f112607V.pageId(), o6j0.C18854a.m162878h("moment_id", momentInfoProxy != null ? momentInfoProxy.f56008id : "0"), o6j0.C18854a.m162878h("owner_id", momentInfoProxy != null ? momentInfoProxy.owner : "0"), o6j0.C18854a.m162878h("recommend_reason", "more history like"), eli0.m117122b());
            abi.m95650y(true);
            m135518F1("home_moment_theme_card", act().color(w0c0.f183793O1));
        }
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f112617c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    /* JADX INFO: renamed from: e0 */
    public LinearLayout m135556e0() {
        return this.f112630o;
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m135557e1(Object obj) {
        this.f112598Q0.call(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public View m135558f0() {
        return this.f112629n;
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m135559f1(wsf0 wsf0Var, boolean z, float f, CardProgressAction cardProgressAction) {
        KeyEvent.Callback callbackMo38809d = wsf0Var.mo38809d();
        if (NullChecker.m81303a(callbackMo38809d)) {
            d5m d5mVar = callbackMo38809d instanceof d5m ? (d5m) callbackMo38809d : null;
            if (d5mVar == null || !d5mVar.mo37917R()) {
                if (d5mVar != null && d5mVar.mo37916F()) {
                    if (this.f112582I0) {
                        m135560g0().mo38359j(-f);
                    }
                    if (this.f112584J0) {
                        m135565j0().mo38359j(f);
                    }
                    if (this.f112586K0) {
                        m135583s0().mo38359j(f);
                        return;
                    }
                    return;
                }
                if (f <= 0.0f) {
                    m135583s0().reset();
                    m135565j0().reset();
                    m135560g0().mo38359j(-f);
                    this.f112582I0 = true;
                    this.f112584J0 = false;
                    this.f112586K0 = false;
                    return;
                }
                if (z) {
                    m135583s0().reset();
                    m135560g0().reset();
                    m135565j0().mo38359j(f);
                    this.f112584J0 = true;
                    this.f112582I0 = false;
                    this.f112586K0 = false;
                    return;
                }
                m135565j0().reset();
                m135560g0().reset();
                m135583s0().mo38359j(f);
                this.f112582I0 = false;
                this.f112584J0 = false;
                this.f112586K0 = true;
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public CardOperationButton m135560g0() {
        return this.f112635s;
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m135561g1() {
        this.f112601S.m110797B2();
    }

    /* JADX INFO: renamed from: h0 */
    public DraweeView m135562h0() {
        return this.f112628m.f23358b;
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m135563h1(View view) {
        CoreDlg.m44978D1(act(), "home", vwb.m200324f0(LinkChannel.get("unknown")));
    }

    /* JADX INFO: renamed from: i0 */
    public HomeThemeSlideFrag m135564i0() {
        return this.f112607V;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM135533Q = m135533Q(layoutInflater, viewGroup);
        this.f112599R = new gk8(this.f112617c);
        xdl0.m208345M0(this.f112617c, false);
        ProfileCardStackThemeSlideOpt profileCardStackThemeSlideOpt = new ProfileCardStackThemeSlideOpt(act(), new qol0() { // from class: l.fcl
            @Override // p149l.qol0
            /* JADX INFO: renamed from: d2 */
            public final ool0 mo36754d2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
                return this.f96835a.m135594y0(virtualCardType, userInfo);
            }
        }, this);
        this.f112605U = profileCardStackThemeSlideOpt;
        profileCardStackThemeSlideOpt.setClipChildren(false);
        this.f112605U.setClipToPadding(false);
        this.f112629n.addView(this.f112605U, 0, new FrameLayout.LayoutParams(-1, -1));
        this.f112603T = this.f112605U;
        xdl0.m208329E0(this.f112630o, new View.OnClickListener() { // from class: l.gcl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                idl.m135490b(view);
            }
        });
        return viewM135533Q;
    }

    /* JADX INFO: renamed from: j0 */
    public CardOperationButton m135565j0() {
        return this.f112636t;
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m135566j1(wsf0 wsf0Var, View view) {
        String strPageId = this.f112607V.pageId();
        User user = CoreModule.f17545c.f19666n0.f19539R;
        o6j0.m162859c("e_undo_button", strPageId, o6j0.C18854a.m162878h("moments_user_id", user == null ? "NA" : user.f56011id), eli0.m117122b());
        m135488W(wsf0Var, "undo");
        m135588u1();
        if (m135535Q1()) {
            return;
        }
        if (!ezc0.m118907m0() || !CoreModule.m29932K().me_().isNewUserIn24H() || !ezc0.m118906i0().getCanGuideUndoTips()) {
            this.f112601S.m110812P2(false);
        } else {
            ezc0.m118906i0().m118914k0();
            ezc0.m118906i0().m118919r0(false);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public RelativeLayout m135567k0() {
        return this.f112619e;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ znl m135568k1() {
        if (!NullChecker.m81303a(m135582r0())) {
            return null;
        }
        KeyEvent.Callback callbackMo38809d = m135582r0().mo38809d();
        if (callbackMo38809d instanceof znl) {
            return (znl) callbackMo38809d;
        }
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public VButton_FakeShadow m135569l0() {
        return this.f112627l;
    }

    /* JADX INFO: renamed from: l1 */
    public void m135570l1(boolean z) {
        this.f112588L0 = z;
        if (z && NullChecker.m81303a(act())) {
            m135588u1();
            dbl0.m110646a(act().getWindow().getDecorView(), false);
        }
        if (!z && xdl0.m208349O0(m135552b0())) {
            m135487V();
        }
        if (this.f112588L0 && NullChecker.m81303a(m135582r0()) && NullChecker.m81303a(m135582r0().mo38809d()) && (m135582r0().mo38809d() instanceof d5m)) {
            ((d5m) m135582r0().mo38809d()).mo36806C();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public VDraweeView m135571m0() {
        return this.f112622h;
    }

    /* JADX INFO: renamed from: m1 */
    public void m135572m1() {
        if (NullChecker.m81303a(m135582r0())) {
            m135582r0().mo38806a();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public RadarRipple m135573n0() {
        return this.f112621g;
    }

    /* JADX INFO: renamed from: n1 */
    public void m135574n1() {
        if (this.f112578G0.m221515e().booleanValue()) {
            this.f112600R0.start();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public LocationPermissionView m135575o0() {
        return this.f112616b;
    }

    /* JADX INFO: renamed from: o1 */
    public void m135576o1() {
        abi.m95650y(true);
        this.f112600R0.cancel();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) this.f112617c.getChildAt(0);
        int childCount = linearLayoutCompat.getChildCount();
        int measuredWidth = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayoutCompat.getChildAt(i);
            if (childAt.isShown() && childAt.getId() != u4c0.f174370mf) {
                measuredWidth += linearLayoutCompat.getChildAt(i).getMeasuredWidth();
                LinearLayoutCompat.C0131a c0131a = (LinearLayoutCompat.C0131a) childAt.getLayoutParams();
                int i2 = ((ViewGroup.MarginLayoutParams) c0131a).leftMargin;
                if (i2 != 0) {
                    measuredWidth += i2;
                }
                int i3 = ((ViewGroup.MarginLayoutParams) c0131a).rightMargin;
                if (i3 != 0) {
                    measuredWidth += i3;
                }
                if (c0131a.getMarginEnd() != 0) {
                    measuredWidth += c0131a.getMarginEnd();
                }
                if (c0131a.getMarginStart() != 0) {
                    measuredWidth += c0131a.getMarginStart();
                }
            }
        }
        va40.m197626h(xdl0.m208412y0() - measuredWidth);
    }

    /* JADX INFO: renamed from: p0 */
    public dcl m135577p0() {
        return this.f112601S;
    }

    /* JADX INFO: renamed from: p1 */
    public void m135578p1(boolean z) {
        xdl0.m208345M0(this.f112638v, true);
        if (z) {
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/02f79ff2-ea08-4696-9df5-d227b6fa4f2d12.pdf").autoPlay(true).repeatCount(-1).into(this.f112638v);
        } else {
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/9a957b00-c134-4bf0-8dfd-1cdff0f4ec7513.pdf").autoPlay(true).repeatCount(-1).into(this.f112638v);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public FrameLayout m135579q0() {
        return this.f112615a;
    }

    /* JADX INFO: renamed from: q1 */
    public void m135580q1() {
        this.f112609W = null;
        this.f112578G0.m132487l(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: r */
    public void m135581r() {
        m135521H0();
    }

    /* JADX INFO: renamed from: r0 */
    public wsf0 m135582r0() {
        return this.f112603T;
    }

    /* JADX INFO: renamed from: s0 */
    public CardOperationButton m135583s0() {
        return this.f112640x;
    }

    /* JADX INFO: renamed from: s1 */
    public void m135584s1(boolean z, boolean z2) {
        m135586t1(z, z2, false);
    }

    /* JADX INFO: renamed from: t0 */
    public FrameLayout m135585t0() {
        return this.f112637u;
    }

    /* JADX INFO: renamed from: t1 */
    public void m135586t1(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.f112601S.f85454c = "";
        }
        m135503r1(z2);
        if (this.f112578G0.m221515e().booleanValue() && !z) {
            e51.m114745J(this.f112604T0);
            xdl0.m208345M0(m135558f0(), true);
            m135478L1(true);
            m135595y1(true);
            this.f112600R0.cancel();
            if (NullChecker.m81303a(m135567k0())) {
                xdl0.m208345M0(m135567k0(), false);
                m135480M1(false);
            }
            m135486T(true);
            if (m135569l0().getVisibility() != 4) {
                xdl0.m208345M0(m135569l0(), false);
            }
        } else if (!this.f112578G0.m221515e().booleanValue() && z) {
            this.f112604T0.m191342a(z2, false, false);
            if (z3) {
                e51.m114743H(act(), this.f112604T0, zo0.f204053f);
            } else {
                this.f112604T0.run();
            }
        } else if (this.f112578G0.m221515e().booleanValue() && z && !z2 && this.f112601S.m110800D1()) {
            xdl0.m208345M0(m135569l0(), false);
        }
        this.f112578G0.m132487l(Boolean.valueOf(z));
        this.f112601S.f85469r = z2;
        m135484P1();
    }

    /* JADX INFO: renamed from: u0 */
    public LinearLayout m135587u0() {
        return this.f112583J;
    }

    /* JADX INFO: renamed from: u1 */
    public void m135588u1() {
        if (NullChecker.m81303a(m135582r0()) && NullChecker.m81303a(m135582r0().mo38809d()) && (m135582r0().mo38809d() instanceof d5m)) {
            ((d5m) m135582r0().mo38809d()).mo36917p(true, false);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public CardOperationButton m135589v0() {
        return this.f112633q;
    }

    /* JADX INFO: renamed from: v1 */
    public void m135590v1() {
        m135552b0().setScaleX(1.0f);
        m135552b0().setScaleY(1.0f);
        m135554d0().setScaleX(1.0f);
        m135554d0().setScaleY(1.0f);
    }

    /* JADX INFO: renamed from: w0 */
    public VFrame_FlipContainer m135591w0() {
        return this.f112631p;
    }

    /* JADX INFO: renamed from: w1 */
    public void m135592w1() {
        m135552b0().setScaleX(0.0f);
        m135552b0().setScaleY(0.0f);
        m135554d0().setScaleX(0.0f);
        m135554d0().setScaleY(0.0f);
    }

    /* JADX INFO: renamed from: x0 */
    public ConstraintLayout m135593x0() {
        return this.f112577G;
    }

    /* JADX INFO: renamed from: y0 */
    public ool0 m135594y0(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        return null;
    }

    /* JADX INFO: renamed from: y1 */
    public void m135595y1(boolean z) {
        this.f112576F0 = z;
        if (!z || (!vdj.m198001c() && n3b0.m157740o())) {
            xdl0.m208344M(m135552b0(), true);
            return;
        }
        if (!xdl0.m208349O0(m135552b0())) {
            m135487V();
        }
        xdl0.m208344M(m135552b0(), true);
    }

    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public void m135542V0() {
        m135511A0(this.f112607V.pageId());
    }

    /* JADX INFO: renamed from: E1 */
    public void m135517E1(int i) {
    }

    /* JADX INFO: renamed from: z1 */
    public void m135597z1(VSwipeStack.OnCardSwipeResult onCardSwipeResult, SwipeDirection swipeDirection) {
    }
}
