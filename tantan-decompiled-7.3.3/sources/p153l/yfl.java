package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4910y;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p051p1.mobile.putong.core.newui.home.themeslide.HomeThemeSlideFrag;
import com.p051p1.mobile.putong.core.newui.home.themeslide.ProfileCardStackThemeSlideOpt;
import com.p051p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideEmptyCardView;
import com.p051p1.mobile.putong.core.newui.home.themeslide.view.HomeThemeSlideErrorNetView;
import com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p051p1.mobile.putong.core.newui.home.views.HomeTitleLayout;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import com.p051p1.mobile.putong.core.p058ui.RadarRipple;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.main.LocationPermissionView;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.ProfileCreateData;
import com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p051p1.mobile.putong.data.LinkChannel;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.sunshine.engine.particle.SceneView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p137rx.subjects.C22507a;
import p151v.VButton_FakeShadow;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VFrame_FlipContainer;
import p151v.VFrame_Squared;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class yfl implements iam<tel>, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: A */
    public TextView f199539A;

    /* JADX INFO: renamed from: B */
    public SceneView f199540B;

    /* JADX INFO: renamed from: C */
    public VDraweeView f199541C;

    /* JADX INFO: renamed from: D */
    public VDraweeView f199542D;

    /* JADX INFO: renamed from: E */
    public VText f199543E;

    /* JADX INFO: renamed from: F */
    public VText f199545F;

    /* JADX INFO: renamed from: G */
    public ConstraintLayout f199547G;

    /* JADX INFO: renamed from: H */
    public View f199549H;

    /* JADX INFO: renamed from: I */
    public VText f199551I;

    /* JADX INFO: renamed from: I0 */
    public boolean f199552I0;

    /* JADX INFO: renamed from: J */
    public VLinear f199553J;

    /* JADX INFO: renamed from: J0 */
    public boolean f199554J0;

    /* JADX INFO: renamed from: K */
    public GradientBgButton f199555K;

    /* JADX INFO: renamed from: K0 */
    public boolean f199556K0;

    /* JADX INFO: renamed from: L */
    public GradientBgButton f199557L;

    /* JADX INFO: renamed from: L0 */
    public boolean f199558L0;

    /* JADX INFO: renamed from: M */
    public GradientBgButton f199559M;

    /* JADX INFO: renamed from: N */
    public GradientBgButton f199561N;

    /* JADX INFO: renamed from: O */
    public HomeThemeSlideErrorNetView f199563O;

    /* JADX INFO: renamed from: P */
    public SuperLikeComboAnimView f199565P;

    /* JADX INFO: renamed from: Q */
    public Act f199567Q;

    /* JADX INFO: renamed from: Q0 */
    public y20 f199568Q0;

    /* JADX INFO: renamed from: R */
    public dvl f199569R;

    /* JADX INFO: renamed from: R0 */
    public Animator f199570R0;

    /* JADX INFO: renamed from: S */
    public tel f199571S;

    /* JADX INFO: renamed from: T */
    public f1g0 f199573T;

    /* JADX INFO: renamed from: U */
    public ProfileCardStackThemeSlideOpt f199575U;

    /* JADX INFO: renamed from: U0 */
    public ViewOnTouchListenerC21574e f199576U0;

    /* JADX INFO: renamed from: V */
    public HomeThemeSlideFrag f199577V;

    /* JADX INFO: renamed from: V0 */
    public ViewOnTouchListenerC21574e f199578V0;

    /* JADX INFO: renamed from: W */
    public v740 f199579W;

    /* JADX INFO: renamed from: X */
    public int f199581X;

    /* JADX INFO: renamed from: a */
    public FrameLayout f199585a;

    /* JADX INFO: renamed from: b */
    public LocationPermissionView f199586b;

    /* JADX INFO: renamed from: c */
    public HomeTitleLayout f199587c;

    /* JADX INFO: renamed from: d */
    public VFrame f199588d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f199589e;

    /* JADX INFO: renamed from: f */
    public VFrame_Squared f199590f;

    /* JADX INFO: renamed from: g */
    public RadarRipple f199591g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f199592h;

    /* JADX INFO: renamed from: i */
    public VText f199593i;

    /* JADX INFO: renamed from: j */
    public Space f199594j;

    /* JADX INFO: renamed from: k */
    public VFrame f199595k;

    /* JADX INFO: renamed from: l */
    public VButton_FakeShadow f199597l;

    /* JADX INFO: renamed from: m */
    public HomeThemeSlideEmptyCardView f199598m;

    /* JADX INFO: renamed from: n */
    public VFrame f199599n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f199600o;

    /* JADX INFO: renamed from: p */
    public VFrame_FlipContainer f199601p;

    /* JADX INFO: renamed from: q */
    public CardOperationButton f199603q;

    /* JADX INFO: renamed from: r */
    public VText f199604r;

    /* JADX INFO: renamed from: s */
    public CardOperationButton f199605s;

    /* JADX INFO: renamed from: t */
    public CardOperationButton f199606t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f199607u;

    /* JADX INFO: renamed from: v */
    public SVGAnimationView f199608v;

    /* JADX INFO: renamed from: w */
    public VFrame_FlipContainer f199609w;

    /* JADX INFO: renamed from: x */
    public CardOperationButton f199610x;

    /* JADX INFO: renamed from: y */
    public VText f199611y;

    /* JADX INFO: renamed from: z */
    public SceneView f199612z;

    /* JADX INFO: renamed from: Y */
    public Runnable f199583Y = null;

    /* JADX INFO: renamed from: Z */
    public Runnable f199584Z = null;

    /* JADX INFO: renamed from: k0 */
    public Runnable f199596k0 = null;

    /* JADX INFO: renamed from: p0 */
    public boolean f199602p0 = true;

    /* JADX INFO: renamed from: E0 */
    public boolean f199544E0 = false;

    /* JADX INFO: renamed from: F0 */
    public boolean f199546F0 = false;

    /* JADX INFO: renamed from: G0 */
    public C22507a<Boolean> f199548G0 = C22507a.m222759c(Boolean.FALSE);

    /* JADX INFO: renamed from: H0 */
    public final View[] f199550H0 = new View[2];

    /* JADX INFO: renamed from: M0 */
    public View f199560M0 = null;

    /* JADX INFO: renamed from: N0 */
    public long f199562N0 = -1;

    /* JADX INFO: renamed from: O0 */
    public String f199564O0 = "empty";

    /* JADX INFO: renamed from: P0 */
    public String f199566P0 = "@@";

    /* JADX INFO: renamed from: S0 */
    public Runnable f199572S0 = new RunnableC21571b();

    /* JADX INFO: renamed from: T0 */
    public k3l f199574T0 = new C21572c();

    /* JADX INFO: renamed from: W0 */
    public final Runnable f199580W0 = new Runnable() { // from class: l.xel
        @Override // java.lang.Runnable
        public final void run() {
            yfl.m215620C();
        }
    };

    /* JADX INFO: renamed from: X0 */
    public zm4<kql> f199582X0 = new zm4() { // from class: l.yel
        @Override // p153l.zm4
        /* JADX INFO: renamed from: d */
        public final Object mo199122d() {
            return this.f199378a.m215721k1();
        }
    };

    /* JADX INFO: renamed from: l.yfl$a */
    public class C21570a implements x20 {
        public C21570a() {
        }

        @Override // p153l.x20
        public void call() {
            yfl.this.f199571S.m190784F2(true);
        }
    }

    /* JADX INFO: renamed from: l.yfl$b */
    public class RunnableC21571b implements Runnable {
        public RunnableC21571b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            yfl.this.f199598m.m39854v();
            if (NullChecker.m82486a(yfl.this.f199570R0)) {
                yfl.this.f199570R0.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: l.yfl$c */
    public class C21572c extends k3l {
        public C21572c() {
        }

        @Override // p153l.k3l, java.lang.Runnable
        public void run() {
            bnl0.m105525M0(yfl.this.m215720k0(), true);
            bnl0.m105525M0(yfl.this.m215711f0(), false);
            yfl.this.m215633M1(true);
            yfl.this.m215631L1(false);
            yfl.this.m215748y1(false);
            yfl.this.f199570R0.start();
            View viewFindViewWithTag = yfl.this.m215732q0().findViewWithTag(yfl.this.m215736s0().getTag() + "child");
            if (NullChecker.m82486a(viewFindViewWithTag)) {
                yfl.this.m215732q0().removeView(viewFindViewWithTag);
            }
            yfl.this.m215639T(false);
            if (!this.f123723a && !this.f123724b && !this.f123725c) {
                bnl0.m105525M0(yfl.this.m215722l0(), false);
            }
            if (IntlCountryCodeController.m29125v()) {
                bnl0.m105524M(yfl.this.m215740u0(), false);
                bnl0.m105524M(yfl.this.m215746x0(), false);
            }
        }
    }

    /* JADX INFO: renamed from: l.yfl$d */
    public class C21573d implements CardOperationButton.InterfaceC8200b {

        /* JADX INFO: renamed from: a */
        public String f199616a;

        public C21573d() {
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton.InterfaceC8200b
        /* JADX INFO: renamed from: a */
        public void mo38402a() {
            l51.m152890J(yfl.this.f199580W0);
            if (spl0.m187374Z()) {
                yfl.this.m215673G1();
            }
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton.InterfaceC8200b
        /* JADX INFO: renamed from: b */
        public void mo38403b() {
            if (spl0.m187374Z()) {
                yfl.this.m215675H1();
            }
            if (TextUtils.isEmpty(this.f199616a)) {
                return;
            }
            l51.m152888H(yfl.this.f199567Q, yfl.this.f199580W0, 1000L);
        }
    }

    /* JADX INFO: renamed from: l.yfl$e */
    public static class ViewOnTouchListenerC21574e implements View.OnTouchListener {

        /* JADX INFO: renamed from: c */
        public static int f199618c = gkc0.m130573a(8, 10);

        /* JADX INFO: renamed from: a */
        public int f199619a = 0;

        /* JADX INFO: renamed from: b */
        public VLinear.C22658a f199620b;

        public ViewOnTouchListenerC21574e() {
            VLinear.C22658a c22658a = new VLinear.C22658a();
            this.f199620b = c22658a;
            c22658a.m224310c();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f199619a <= f199618c) {
                if (motionEvent.getAction() == 0) {
                    int i = this.f199619a + 1;
                    this.f199619a = i;
                    if (i > f199618c) {
                        pf60<Boolean, Boolean> pf60VarM224309b = this.f199620b.m224309b();
                        C4910y.f20880Q = pf60VarM224309b.f152156a.booleanValue();
                        C4910y.f20881R = pf60VarM224309b.f152157b.booleanValue();
                    }
                }
                this.f199620b.m224308a(motionEvent);
            }
            if (motionEvent.getAction() == 0) {
                u7l.m194876c(true);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                u7l.m194876c(false);
            }
            return false;
        }
    }

    public yfl(Act act, HomeThemeSlideFrag homeThemeSlideFrag) {
        this.f199567Q = act;
        this.f199577V = homeThemeSlideFrag;
    }

    /* JADX INFO: renamed from: B0 */
    private void m215619B0() {
        m215706c0().setBackgroundResource(dbc0.f87333q);
        final BoostViewContainer boostViewContainerM215705b0 = m215705b0();
        boostViewContainerM215705b0.m44877b(new y20() { // from class: l.afl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f70921a.m215685P0((View) obj);
            }
        }, new vcj() { // from class: l.bfl
            @Override // p153l.vcj
            /* JADX INFO: renamed from: a */
            public final Object mo103927a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return this.f76521a.m215687Q0(boostViewContainerM215705b0, (Drawable) obj, (CharSequence) obj2, (Integer) obj3, (Integer) obj4, (Integer) obj5, (Boolean) obj6);
            }
        });
        boostViewContainerM215705b0.setSceneView(this.f199540B);
        boostViewContainerM215705b0.setInterceptFunc(new pcj() { // from class: l.cfl
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.f81513a.m215688Q1());
            }
        });
        boostViewContainerM215705b0.m44876a(new na3() { // from class: l.dfl
            @Override // p153l.na3
            /* JADX INFO: renamed from: a */
            public final void mo115522a(int i) {
                this.f88167a.m215691S0(boostViewContainerM215705b0, i);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m215620C() {
        C4499d.m21895l().m21899k("bubble_superlike_bubble");
        z5h0.m218680u();
    }

    /* JADX INFO: renamed from: J1 */
    private void m215627J1(boolean z) {
        sfj0.m185596c(MatchScData.ModuleId.mid_e_superlikeButton, this.f199577V.pageId(), sfj0.C20032a.m185615h("moments_user_id", (!NullChecker.m82486a(m215735r0().mo39816j()) || m215735r0().mo39816j().isVirtualCard()) ? "0" : m215735r0().mo39816j().f20214id), sfj0.C20032a.m185616i("is_privileged", !rbb0.m180747t()), sfj0.C20032a.m185615h("showfrom_superlike", "home"), eui0.m122572b());
        if (spl0.m187374Z() && !z) {
            bpe0.m105814f().m105816c(m215735r0().mo39816j().f20214id, 1, true, m215717i0().pageId());
        }
        if (m215735r0() != null) {
            m215641W(m215735r0(), "superlike");
        }
        if (m215688Q1()) {
            return;
        }
        this.f199571S.m190796Q2(true, z);
    }

    /* JADX INFO: renamed from: K1 */
    private void m215629K1(String str) {
        String str2;
        if (TextUtils.equals(str, "like")) {
            str2 = "right";
        } else if (TextUtils.equals(str, "superlike")) {
            str2 = "up";
        } else {
            str2 = TextUtils.equals(str, "undo") ? "back" : BLiveGiftBubblePopupTitlePosition.left;
        }
        long jM174454o = this.f199562N0 > 0 ? pzi0.m174454o() - this.f199562N0 : -1L;
        this.f199562N0 = pzi0.m174454o();
        sfj0.m185596c("e_card_click_interval", "p_suggest_users_home_view", sfj0.C20032a.m185615h("current_operation", str2), sfj0.C20032a.m185614g("operation_interval", jM174454o), sfj0.C20032a.m185615h("last_operation", this.f199564O0));
        this.f199564O0 = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public void m215631L1(boolean z) {
        HomeStatisticsHelper.m37692C(this.f199577V.getUserVisibleHint() && !this.f199577V.isHidden());
        if (z) {
            HomeStatisticsHelper.m37718u();
        } else {
            HomeStatisticsHelper.m37717t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public void m215633M1(boolean z) {
        HomeStatisticsHelper.m37692C(this.f199577V.getUserVisibleHint() && !this.f199577V.isHidden());
        if (z) {
            HomeStatisticsHelper.m37720w();
        } else {
            HomeStatisticsHelper.m37719v();
        }
    }

    /* JADX INFO: renamed from: P1 */
    private void m215637P1() {
        if (this.f199548G0.m222761e().booleanValue()) {
            m215718j0().setOnTouchListener(null);
            m215713g0().setOnTouchListener(null);
            m215718j0().setClickable(false);
            m215713g0().setClickable(false);
            m215742v0().setClickable(false);
            m215736s0().setClickable(false);
            return;
        }
        m215718j0().setOnTouchListener(this.f199576U0);
        m215713g0().setOnTouchListener(this.f199578V0);
        m215718j0().setClickable(true);
        m215713g0().setClickable(true);
        m215742v0().setClickable(true);
        m215736s0().setClickable(true);
    }

    /* JADX INFO: renamed from: S */
    private void m215638S(boolean z) {
        if (z) {
            m215705b0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m215707d0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
        } else {
            m215705b0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            m215707d0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public void m215639T(boolean z) {
        if (z) {
            m215718j0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m215738t0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m215742v0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m215713g0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            z5h0.m218675j().f203044b.m137019l(uxj0.f181467a);
        } else {
            m215718j0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            m215738t0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            m215742v0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
            m215713g0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        }
        m215638S(z);
    }

    /* JADX INFO: renamed from: V */
    private void m215640V() {
        sfj0.m185601h("e_boost_button", this.f199577V.pageId(), sfj0.C20032a.m185616i("is_privileged", !a5i0.m96174v()));
    }

    /* JADX INFO: renamed from: W */
    private void m215641W(f1g0 f1g0Var, String str) {
        m215629K1(str);
        f1g0Var.m179540h(str);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m215643b(View view) {
    }

    /* JADX INFO: renamed from: r1 */
    private void m215656r1(boolean z) {
        if (z) {
            act().removeCallbacks(this.f199572S0);
            this.f199598m.setVisibility(8);
            this.f199598m.m39845m();
        } else {
            act().removeCallbacks(this.f199572S0);
            if (this.f199571S.m190793P1()) {
                this.f199571S.m190836w2();
            } else {
                act().postDelayed(this.f199572S0, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m215661x() {
    }

    /* JADX INFO: renamed from: A0 */
    public void m215664A0(String str) {
        m215741u1();
        bnl0.m105524M(this.f199569R.mo118296m(), false);
        jz20.m147637e(act(), str, new C21570a());
    }

    /* JADX INFO: renamed from: A1 */
    public void m215665A1(boolean z, boolean z2) {
        this.f199544E0 = z;
        if (m215678J0()) {
            if (z2) {
                bnl0.m105524M(m215742v0(), z);
                bnl0.m105524M(m215744w0(), z);
                return;
            } else {
                bnl0.m105525M0(m215742v0(), z);
                bnl0.m105525M0(m215744w0(), z);
                return;
            }
        }
        if (z2) {
            bnl0.m105524M(m215742v0(), false);
            bnl0.m105524M(m215744w0(), false);
        } else {
            bnl0.m105525M0(m215742v0(), false);
            bnl0.m105525M0(m215744w0(), false);
        }
    }

    /* JADX INFO: renamed from: B1 */
    public boolean m215666B1() {
        if (m215735r0() != null && (m215735r0().mo39812d() instanceof t7m)) {
            t7m t7mVar = (t7m) m215735r0().mo39812d();
            if (!t7mVar.mo37950y() || t7mVar.mo37889f() || t7mVar.mo37839N()) {
                return false;
            }
            return ((NullChecker.m82486a(t7mVar.getCardData().m140259d()) && uih0.m196232y0(t7mVar.getCardData().m140259d().f56859id)) || uih0.m196223s0().m196283z0()) ? false : true;
        }
        return false;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f199567Q;
    }

    /* JADX INFO: renamed from: C1 */
    public void m215667C1() {
        m215709e0().setVisibility(0);
    }

    /* JADX INFO: renamed from: D0 */
    public void m215668D0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        bnl0.m105542Z(this.f199563O);
        try {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f199563O.getLayoutParams();
        } catch (ClassCastException unused) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(this.f199563O.getWidth(), this.f199563O.getHeight());
        }
        marginLayoutParams.topMargin += jvd.m147011a(act(), 56.0f);
        this.f199563O.setLayoutParams(marginLayoutParams);
        boolean z = gra.m131578I0().enabled;
        HomeThemeSlideEmptyCardView homeThemeSlideEmptyCardView = this.f199598m;
        if (z) {
            homeThemeSlideEmptyCardView.m39848p(new x20() { // from class: l.efl
                @Override // p153l.x20
                public final void call() {
                    yfl.m215661x();
                }
            }, new x20() { // from class: l.gfl
                @Override // p153l.x20
                public final void call() {
                    this.f103940a.m215692T0();
                }
            }, this.f199571S);
        } else {
            homeThemeSlideEmptyCardView.m39848p(new x20() { // from class: l.hfl
                @Override // p153l.x20
                public final void call() {
                    this.f109313a.m215694U0();
                }
            }, new x20() { // from class: l.ifl
                @Override // p153l.x20
                public final void call() {
                    this.f114677a.m215695V0();
                }
            }, this.f199571S);
        }
        this.f199563O.m39867m(this.f199571S, new x20() { // from class: l.jfl
            @Override // p153l.x20
            public final void call() {
                this.f120600a.m215696W0();
            }
        });
    }

    /* JADX INFO: renamed from: E0 */
    public void m215669E0() {
        bnl0.m105509E0(this.f199569R.getPosition(), new View.OnClickListener() { // from class: l.zel
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204036a.m215698X0(view);
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
    public void m215671F1(String str, int i) {
        if (m215735r0() == null || m215735r0().mo39812d() == null || m215735r0().mo39821o() == null || m215735r0().mo39821o().m140259d() == null) {
            return;
        }
        User userM140259d = m215735r0().mo39821o().m140259d();
        sdp.m185492i(userM140259d.f56859id);
        Intent intentM51905A2 = ProfileAct.m51905A2(act(), userM140259d.f56859id, str, true, false, false);
        if (TextUtils.equals(userM140259d.f56859id, CoreModule.f18264c.f20384f0.f20610J0.get())) {
            ProfileCreateData profileCreateData = new ProfileCreateData();
            profileCreateData.showCountdownSendMsg = true;
            intentM51905A2.putExtra("profile_create_data", profileCreateData);
        }
        this.f199577V.startActivityForResult(intentM51905A2, 114);
    }

    /* JADX INFO: renamed from: G0 */
    public void m215672G0(boolean z, boolean z2) {
        this.f199548G0.m137019l(Boolean.valueOf(z));
        this.f199571S.f173872r = z2;
        if (z) {
            m215718j0().setScaleX(0.0f);
            m215718j0().setScaleY(0.0f);
            m215713g0().setScaleX(0.0f);
            m215713g0().setScaleY(0.0f);
            m215738t0().setScaleX(0.0f);
            m215738t0().setScaleY(0.0f);
            m215742v0().setScaleX(0.0f);
            m215742v0().setScaleY(0.0f);
            m215745w1();
        } else {
            m215718j0().setScaleX(1.0f);
            m215718j0().setScaleY(1.0f);
            m215713g0().setScaleX(1.0f);
            m215713g0().setScaleY(1.0f);
            m215738t0().setScaleX(1.0f);
            m215738t0().setScaleY(1.0f);
            m215742v0().setScaleX(1.0f);
            m215742v0().setScaleY(1.0f);
            m215743v1();
        }
        m215637P1();
        m215726n0().setRadarColor(this.f199581X);
        this.f199570R0 = asj0.m99933b0(m215726n0(), m215724m0());
        bnl0.m105525M0(m215720k0(), z);
        bnl0.m105525M0(m215711f0(), !z);
        m215633M1(z);
        m215631L1(!z);
        bnl0.m105525M0(m215722l0(), false);
        if (IntlCountryCodeController.m29125v()) {
            bnl0.m105524M(m215740u0(), !z);
            bnl0.m105524M(m215746x0(), !z);
        }
        if (z && !z2) {
            bnl0.m105525M0(m215722l0(), false);
        }
        m215748y1(!z);
        this.f199594j.setVisibility(4);
    }

    /* JADX INFO: renamed from: G1 */
    public final void m215673G1() {
        KeyEvent.Callback callbackMo39812d = m215735r0().mo39812d();
        if (NullChecker.m82486a(callbackMo39812d)) {
            if ((callbackMo39812d instanceof t7m) && ((t7m) callbackMo39812d).mo37905k0()) {
                return;
            }
            ((ViewGroup) this.f199567Q.getWindow().getDecorView()).setMotionEventSplittingEnabled(false);
            t7m t7mVar = (t7m) callbackMo39812d;
            boolean z = NullChecker.m82486a(t7mVar.getCardData().m140259d()) && TextUtils.equals(t7mVar.getCardData().m140259d().f56859id, z5h0.m218675j().f203055m);
            bnl0.m105525M0(this.f199565P, true);
            bnl0.m105525M0(this.f199608v, true);
            m215731p1(false);
            this.f199565P.m56971r(z, false, t7mVar.getCardData().m140259d().isFemale());
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m215674H0() {
        final f1g0 f1g0VarM215735r0 = m215735r0();
        m215668D0();
        this.f199600o.setClipChildren(false);
        this.f199600o.setClipToPadding(false);
        if (!pgj.m172246c() && IntlCountryCodeController.m29118o()) {
            m215699Y();
            if (nmp.m163836e()) {
                m215703a0();
            }
        } else {
            m215703a0();
        }
        m215619B0();
        this.f199581X = act().color(c9c0.f80342I);
        v740 v740Var = new v740(this.f199571S, this);
        this.f199579W = v740Var;
        f1g0VarM215735r0.setAdapter(v740Var);
        m215718j0().setOnClickListener(new View.OnClickListener() { // from class: l.uel
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178671a.m215700Y0(f1g0VarM215735r0, view);
            }
        });
        m215713g0().setOnClickListener(new View.OnClickListener() { // from class: l.ffl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98793a.m215704a1(f1g0VarM215735r0, view);
            }
        });
        CardOperationButton cardOperationButtonM215718j0 = m215718j0();
        ViewOnTouchListenerC21574e viewOnTouchListenerC21574e = new ViewOnTouchListenerC21574e();
        this.f199576U0 = viewOnTouchListenerC21574e;
        cardOperationButtonM215718j0.setOnTouchListener(viewOnTouchListenerC21574e);
        CardOperationButton cardOperationButtonM215713g0 = m215713g0();
        ViewOnTouchListenerC21574e viewOnTouchListenerC21574e2 = new ViewOnTouchListenerC21574e();
        this.f199578V0 = viewOnTouchListenerC21574e2;
        cardOperationButtonM215713g0.setOnTouchListener(viewOnTouchListenerC21574e2);
        this.f199568Q0 = dmk0.m116962a(500, new y20() { // from class: l.qfl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157310a.m215708d1(f1g0VarM215735r0, (xql) obj);
            }
        });
        f1g0VarM215735r0.mo39815i(new y20() { // from class: l.rfl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162809a.m215710e1(obj);
            }
        });
        f1g0VarM215735r0.mo39822p(new VSwipeStack.InterfaceC4918c() { // from class: l.sfl
            @Override // com.p051p1.mobile.putong.core.card.VSwipeStack.InterfaceC4918c
            /* JADX INFO: renamed from: b */
            public final void mo36200b(boolean z, float f, CardProgressAction cardProgressAction) {
                this.f167725a.m215712f1(f1g0VarM215735r0, z, f, cardProgressAction);
            }
        });
        final tel telVar = this.f199571S;
        Objects.requireNonNull(telVar);
        f1g0VarM215735r0.mo39814g(new pl50() { // from class: l.tfl
            @Override // p153l.pl50
            /* JADX INFO: renamed from: a */
            public final VSwipeStack.OnCardSwipeResult mo145869a(xql xqlVar, SwipeDirection swipeDirection, boolean z) {
                return telVar.m190839y2(xqlVar, swipeDirection, z);
            }
        });
        asj0.m99931Z(m215724m0(), new x20() { // from class: l.ufl
            @Override // p153l.x20
            public final void call() {
                this.f178786a.m215714g1();
            }
        });
        m215722l0().setCompoundDrawablesWithIntrinsicBounds(tu0.m192702b(act(), dbc0.f87430su), (Drawable) null, (Drawable) null, (Drawable) null);
        m215722l0().setText(act().getString(R$string.f19556ph));
        m215722l0().setOnClickListener(new View.OnClickListener() { // from class: l.vfl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183953a.m215716h1(view);
            }
        });
        f1g0VarM215735r0.setAllowUpSwipe(true);
        m215742v0().setOnClickListener(new View.OnClickListener() { // from class: l.wfl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188861a.m215719j1(f1g0VarM215735r0, view);
            }
        });
        this.f199586b.m48543d(this.f199577V, 256);
        bnl0.m105556g0(this.f199569R.mo118286c());
        bnl0.m105542Z(this.f199588d);
        m215706c0().setOnLongClickListener(new View.OnLongClickListener() { // from class: l.xfl
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f194047a.m215702Z0(view);
            }
        });
        CoreBusinessModule.m30906m0().mo122546f(this);
        if (gra.m131550C2()) {
            this.f199603q.setNormalStateLayerBackground(this.f199567Q.drawable(dbc0.f86877c2));
            this.f199605s.setNormalStateLayerBackground(this.f199567Q.drawable(dbc0.f86877c2));
            this.f199606t.setNormalStateLayerBackground(this.f199567Q.drawable(dbc0.f86877c2));
            this.f199610x.setNormalStateLayerBackground(this.f199567Q.drawable(dbc0.f86877c2));
        }
        m215669E0();
    }

    /* JADX INFO: renamed from: H1 */
    public final void m215675H1() {
        KeyEvent.Callback callbackMo39812d = m215735r0().mo39812d();
        if (NullChecker.m82486a(callbackMo39812d) && (callbackMo39812d instanceof t7m)) {
            t7m t7mVar = (t7m) callbackMo39812d;
            if (t7mVar.mo37905k0()) {
                return;
            }
            ((ViewGroup) this.f199567Q.getWindow().getDecorView()).setMotionEventSplittingEnabled(true);
            bnl0.m105525M0(this.f199565P, false);
            this.f199608v.stopAnimation(true);
            bnl0.m105525M0(this.f199608v, false);
            int iM56974u = this.f199565P.m56974u();
            if (NullChecker.m82486a(t7mVar.getCardData().m140259d())) {
                bpe0.m105814f().m105816c(t7mVar.getCardData().m140259d().f56859id, iM56974u, false, m215717i0().pageId());
                m215627J1(true);
            }
        }
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m215676I0() {
        return this.f199558L0;
    }

    /* JADX INFO: renamed from: I1 */
    public final void m215677I1() {
        m215627J1(false);
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m215678J0() {
        return this.f199544E0;
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m215679K0() {
        return this.f199548G0.m222761e().booleanValue();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m215680L0() {
        bnl0.m105524M(this.f199545F, false);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m215681M0(View view) {
        m215677I1();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m215682N0(View view) {
        m215677I1();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m215683O0(View view) {
        m215684O1();
    }

    /* JADX INFO: renamed from: O1 */
    public void m215684O1() {
        if (m215688Q1()) {
            return;
        }
        if (!h7d0.m133774m0() || !CoreModule.m30930K().me_().isNewUserIn24H() || !h7d0.m133773i0().getCanGuideUndoTips()) {
            this.f199571S.m190794P2(false);
        } else {
            h7d0.m133773i0().m133781k0();
            h7d0.m133773i0().m133786r0(false);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m215685P0(View view) {
        this.f199585a.removeView(view);
    }

    /* JADX INFO: renamed from: Q */
    public View m215686Q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zfl.m219543b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ View m215687Q0(BoostViewContainer boostViewContainer, Drawable drawable, CharSequence charSequence, Integer num, Integer num2, Integer num3, Boolean bool) {
        return m215701Z(boostViewContainer, drawable, charSequence, num.intValue(), num2.intValue(), num3.intValue(), bool.booleanValue(), null);
    }

    /* JADX INFO: renamed from: Q1 */
    public boolean m215688Q1() {
        return m215735r0().mo39812d() == null;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public NewMainAct getAct() {
        return (NewMainAct) this.f199567Q;
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ Boolean m215690R0() {
        return Boolean.valueOf(act().m40818h6());
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m215691S0(final BoostViewContainer boostViewContainer, int i) {
        if (i == 2) {
            this.f199571S.m190790M2();
            boostViewContainer.m44880e(this.f199567Q, new x20() { // from class: l.ofl
                @Override // p153l.x20
                public final void call() {
                    boostViewContainer.m44882g(true);
                }
            }, new pcj() { // from class: l.pfl
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f152194a.m215690R0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m215692T0() {
        this.f199571S.m190837x1();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(tel telVar) {
        this.f199571S = telVar;
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m215694U0() {
        this.f199571S.m190828s1();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m215696W0() {
        this.f199571S.m190779B2();
    }

    /* JADX INFO: renamed from: X */
    public CardOperationButton m215697X(boolean z, boolean z2) {
        if (z) {
            return z2 ? m215736s0() : m215718j0();
        }
        return m215713g0();
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m215698X0(View view) {
        CoreModule.f18276o.m132214d().mo34741Pa(getContext());
        sfj0.m185596c("e_suggest_users_home_location", "p_suggest_users_home_view", eui0.m122572b());
    }

    /* JADX INFO: renamed from: Y */
    public void m215699Y() {
        m215735r0().setAllowUpSwipe(false);
        bnl0.m105524M(m215738t0(), false);
        m215665A1(false, true);
        if (h7d0.m133774m0()) {
            h7d0.m133773i0().m133784p0(false);
            LinearLayout linearLayout = this.f199600o;
            int i = qa00.f156335v;
            linearLayout.setPadding(i, linearLayout.getPaddingTop(), i, this.f199600o.getPaddingBottom());
        }
        if (IntlCountryCodeController.m29125v()) {
            bnl0.m105524M(this.f199555K, false);
            bnl0.m105524M(this.f199561N, false);
            m215665A1(false, true);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m215700Y0(f1g0 f1g0Var, View view) {
        String str = "0";
        sfj0.m185596c("e_suggest_like_button", this.f199577V.pageId(), sfj0.C20032a.m185615h("other_user_id", (NullChecker.m82486a(f1g0Var.mo39821o()) && NullChecker.m82486a(f1g0Var.mo39821o().m140259d())) ? f1g0Var.mo39821o().m140259d().f56859id : "0"), eui0.m122572b());
        String strPageId = this.f199577V.pageId();
        if (NullChecker.m82486a(f1g0Var.mo39821o()) && NullChecker.m82486a(f1g0Var.mo39821o().m140259d())) {
            str = f1g0Var.mo39821o().m140259d().f56859id;
        }
        sfj0.m185596c(MatchScData.ModuleId.mid_e_likeButton, strPageId, sfj0.C20032a.m185615h("moments_user_id", str), eui0.m122572b());
        m215641W(f1g0Var, "like");
        if (m215688Q1()) {
            return;
        }
        f1g0Var.mo39823r(SwipeDirection.RIGHT, true);
    }

    /* JADX INFO: renamed from: Z */
    public View m215701Z(View view, Drawable drawable, CharSequence charSequence, int i, int i2, int i3, boolean z, x20 x20Var) {
        int i4;
        int i5;
        int iM175859d;
        int iM175859d2;
        if (view != m215705b0() && view != m215706c0()) {
            bnl0.m105524M(this.f199545F, false);
            if (z) {
                i4 = 0;
                i5 = 0;
                iM175859d = 0;
                iM175859d2 = 0;
            } else {
                int iM175859d3 = qa00.m175859d(18.0f);
                int iM175859d4 = qa00.m175859d(17.0f);
                iM175859d = qa00.m175859d(18.0f);
                i4 = iM175859d3;
                i5 = iM175859d4;
                iM175859d2 = qa00.m175859d(21.0f);
            }
            return qnp0.m177259b1(m215732q0(), view, drawable, charSequence, i, i2, 17, i3, i4, i5, iM175859d, iM175859d2, bnl0.m105592y0() - qa00.m175859d(60.0f), 17, 0, false, x20Var);
        }
        VText vText = this.f199545F;
        NewMainAct newMainActAct = act();
        Objects.requireNonNull(newMainActAct);
        vText.setBackground(newMainActAct.drawable(dbc0.f87508va));
        ViewGroup.LayoutParams layoutParams = this.f199545F.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = qa00.m175859d(7.0f);
            marginLayoutParams.topMargin = qa00.m175859d(2.0f);
        }
        this.f199545F.setLayoutParams(layoutParams);
        this.f199545F.setPadding(qa00.m175859d(16.0f), qa00.m175859d(16.0f), qa00.m175859d(16.0f), qa00.m175859d(10.0f));
        this.f199545F.setTextSize(13.0f);
        this.f199545F.setText(charSequence);
        bnl0.m105524M(this.f199545F, true);
        if (i3 != -1) {
            if (this.f199584Z == null) {
                this.f199584Z = new Runnable() { // from class: l.nfl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f141743a.m215680L0();
                    }
                };
            }
            l51.m152888H(act(), this.f199584Z, i3);
        }
        return this.f199545F;
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ boolean m215702Z0(View view) {
        if (CoreModule.f18264c.f20318J0.m156766F3()) {
            return true;
        }
        m215705b0().m44881f();
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public void m215703a0() {
        m215735r0().setAllowUpSwipe(true);
        if (h7d0.m133774m0()) {
            h7d0.m133773i0().m133784p0(true);
            LinearLayout linearLayout = this.f199600o;
            int i = qa00.f156321h;
            linearLayout.setPadding(i, linearLayout.getPaddingTop(), i, this.f199600o.getPaddingBottom());
        }
        if (IntlCountryCodeController.m29125v()) {
            bnl0.m105524M(this.f199555K, true);
            bnl0.m105524M(this.f199561N, true);
            m215665A1(true, false);
        }
        if (fcp.m125033y()) {
            this.f199602p0 = true;
        }
        m215738t0().setVisibility(0);
        m215665A1(true, false);
        m215738t0().setOnClickListener(new View.OnClickListener() { // from class: l.kfl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126439a.m215681M0(view);
            }
        });
        m215736s0().setOnClickListener(new View.OnClickListener() { // from class: l.lfl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131855a.m215682N0(view);
            }
        });
        m215736s0().setOnLongPressListener(new C21573d());
        m215742v0().setOnClickListener(new View.OnClickListener() { // from class: l.mfl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136655a.m215683O0(view);
            }
        });
        bnl0.m105564k0(m215709e0());
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m215704a1(f1g0 f1g0Var, View view) {
        String str = "0";
        sfj0.m185596c("e_suggest_dislike_button", this.f199577V.pageId(), sfj0.C20032a.m185615h("other_user_id", (NullChecker.m82486a(f1g0Var.mo39821o()) && NullChecker.m82486a(f1g0Var.mo39821o().m140259d())) ? f1g0Var.mo39821o().m140259d().f56859id : "0"), eui0.m122572b());
        String strPageId = this.f199577V.pageId();
        if (NullChecker.m82486a(f1g0Var.mo39821o()) && NullChecker.m82486a(f1g0Var.mo39821o().m140259d())) {
            str = f1g0Var.mo39821o().m140259d().f56859id;
        }
        sfj0.m185596c("e_dislikeButton", strPageId, sfj0.C20032a.m185615h("moments_user_id", str), eui0.m122572b());
        m215641W(f1g0Var, "dislike");
        if (m215688Q1()) {
            return;
        }
        f1g0Var.mo39823r(SwipeDirection.LEFT, true);
    }

    /* JADX INFO: renamed from: b0 */
    public BoostViewContainer m215705b0() {
        return this.f199569R.mo118292i();
    }

    /* JADX INFO: renamed from: c0 */
    public View m215706c0() {
        return this.f199569R.mo118292i().getBoostButton();
    }

    /* JADX INFO: renamed from: d0 */
    public View m215707d0() {
        return this.f199569R.mo118292i().getBoostHeartScene();
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m215708d1(f1g0 f1g0Var, xql xqlVar) {
        if (NullChecker.m82486a(m215735r0().mo39812d())) {
            if ((uih0.m196214m0() && NullChecker.m82486a(m215735r0().mo39816j()) && NullChecker.m82486a(m215735r0().mo39821o().m140259d()) && (uih0.m196232y0(m215735r0().mo39821o().m140259d().f56859id) || m215735r0().mo39816j() == null)) || m215735r0().m179541q() || m215735r0().m179539f()) {
                return;
            }
            if (f1g0Var.mo39819m()) {
                f1g0Var.mo39820n();
                return;
            }
            t7m t7mVar = m215735r0().mo39812d() instanceof t7m ? (t7m) m215735r0().mo39812d() : null;
            if (NullChecker.m82486a(t7mVar) && CoreModule.m30932N().mo61478M8()) {
                NewNewProfileCard.m37790Y1();
            }
            if (NullChecker.m82486a(t7mVar)) {
                t7mVar.mo37809C();
            }
            boolean z = false;
            int i = (t7mVar == null || !t7mVar.mo37845P()) ? 1 : 0;
            boolean zIsUserLikeMe = (NullChecker.m82486a(t7mVar) && NullChecker.m82486a(t7mVar.getCardData()) && NullChecker.m82486a(t7mVar.getCardData().m140260e())) ? t7mVar.getCardData().m140260e().isUserLikeMe() : false;
            String str = zIsUserLikeMe ? "upper_right" : "null";
            if (NullChecker.m82486a(t7mVar) && t7mVar.mo37812D("female_like_flag_lower_left")) {
                str = "lower_left";
                zIsUserLikeMe = true;
            }
            CoreSuggested.UserInfo userInfoMo39816j = m215735r0().mo39816j();
            CoreMomentInfo momentInfoProxy = xqlVar.getMomentInfoProxy();
            String strPageId = this.f199577V.pageId();
            sfj0.C20032a c20032aM185613f = sfj0.C20032a.m185613f("IsWhiteBlock", i);
            sfj0.C20032a c20032aM185615h = sfj0.C20032a.m185615h("moments_user_id", NullChecker.m82486a(xqlVar.getUserProxy()) ? xqlVar.getUserProxy().f56859id : "0");
            sfj0.C20032a c20032aM185616i = sfj0.C20032a.m185616i("show_he_liked", zIsUserLikeMe);
            sfj0.C20032a c20032aM185615h2 = sfj0.C20032a.m185615h("show_he_liked_position", str);
            sfj0.C20032a c20032aM185616i2 = sfj0.C20032a.m185616i("is_first_picture", this.f199571S.m190791N1(NullChecker.m82486a(xqlVar.getUserProxy()) ? xqlVar.getUserProxy().f56859id : "0") && xqlVar.getShowPictureIndexProxy() == 0);
            sfj0.C20032a c20032aM185615h3 = sfj0.C20032a.m185615h("swipe_scene", "default");
            if (NullChecker.m82486a(userInfoMo39816j) && userInfoMo39816j.isThemeCard) {
                z = true;
            }
            sfj0.m185596c(MatchScData.ModuleId.mid_e_card, strPageId, c20032aM185613f, c20032aM185615h, c20032aM185616i, c20032aM185615h2, c20032aM185616i2, c20032aM185615h3, sfj0.C20032a.m185616i("theme_card_ornot", z), sfj0.C20032a.m185615h("is_moment_card", xqlVar.mo37953z() ? "1" : "0"), sfj0.C20032a.m185615h("moment_id", momentInfoProxy != null ? momentInfoProxy.f56856id : "0"), eui0.m122572b());
            sfj0.m185596c("e_moment", this.f199577V.pageId(), sfj0.C20032a.m185615h("moment_id", momentInfoProxy != null ? momentInfoProxy.f56856id : "0"), sfj0.C20032a.m185615h("owner_id", momentInfoProxy != null ? momentInfoProxy.owner : "0"), sfj0.C20032a.m185615h("recommend_reason", "more history like"), eui0.m122572b());
            pci.m171689y(true);
            m215671F1("home_moment_theme_card", act().color(c9c0.f80365P1));
        }
    }

    @Override // p153l.iam
    public void destroy() {
        this.f199587c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    /* JADX INFO: renamed from: e0 */
    public LinearLayout m215709e0() {
        return this.f199600o;
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m215710e1(Object obj) {
        this.f199568Q0.call(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public View m215711f0() {
        return this.f199599n;
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m215712f1(f1g0 f1g0Var, boolean z, float f, CardProgressAction cardProgressAction) {
        KeyEvent.Callback callbackMo39812d = f1g0Var.mo39812d();
        if (NullChecker.m82486a(callbackMo39812d)) {
            t7m t7mVar = callbackMo39812d instanceof t7m ? (t7m) callbackMo39812d : null;
            if (t7mVar == null || !t7mVar.mo38920R()) {
                if (t7mVar != null && t7mVar.mo38919F()) {
                    if (this.f199552I0) {
                        m215713g0().mo39362j(-f);
                    }
                    if (this.f199554J0) {
                        m215718j0().mo39362j(f);
                    }
                    if (this.f199556K0) {
                        m215736s0().mo39362j(f);
                        return;
                    }
                    return;
                }
                if (f <= 0.0f) {
                    m215736s0().reset();
                    m215718j0().reset();
                    m215713g0().mo39362j(-f);
                    this.f199552I0 = true;
                    this.f199554J0 = false;
                    this.f199556K0 = false;
                    return;
                }
                if (z) {
                    m215736s0().reset();
                    m215713g0().reset();
                    m215718j0().mo39362j(f);
                    this.f199554J0 = true;
                    this.f199552I0 = false;
                    this.f199556K0 = false;
                    return;
                }
                m215718j0().reset();
                m215713g0().reset();
                m215736s0().mo39362j(f);
                this.f199552I0 = false;
                this.f199554J0 = false;
                this.f199556K0 = true;
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public CardOperationButton m215713g0() {
        return this.f199605s;
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m215714g1() {
        this.f199571S.m190779B2();
    }

    /* JADX INFO: renamed from: h0 */
    public DraweeView m215715h0() {
        return this.f199598m.f24100b;
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m215716h1(View view) {
        CoreDlg.m46161D1(act(), "home", jyb.m147507f0(LinkChannel.get("unknown")));
    }

    /* JADX INFO: renamed from: i0 */
    public HomeThemeSlideFrag m215717i0() {
        return this.f199577V;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM215686Q = m215686Q(layoutInflater, viewGroup);
        this.f199569R = new kl8(this.f199587c);
        bnl0.m105525M0(this.f199587c, false);
        ProfileCardStackThemeSlideOpt profileCardStackThemeSlideOpt = new ProfileCardStackThemeSlideOpt(act(), new uxl0() { // from class: l.vel
            @Override // p153l.uxl0
            /* JADX INFO: renamed from: d2 */
            public final sxl0 mo37757d2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
                return this.f183804a.m215747y0(virtualCardType, userInfo);
            }
        }, this);
        this.f199575U = profileCardStackThemeSlideOpt;
        profileCardStackThemeSlideOpt.setClipChildren(false);
        this.f199575U.setClipToPadding(false);
        this.f199599n.addView(this.f199575U, 0, new FrameLayout.LayoutParams(-1, -1));
        this.f199573T = this.f199575U;
        bnl0.m105509E0(this.f199600o, new View.OnClickListener() { // from class: l.wel
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yfl.m215643b(view);
            }
        });
        return viewM215686Q;
    }

    /* JADX INFO: renamed from: j0 */
    public CardOperationButton m215718j0() {
        return this.f199606t;
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m215719j1(f1g0 f1g0Var, View view) {
        String strPageId = this.f199577V.pageId();
        User user = CoreModule.f18264c.f20408n0.f20281R;
        sfj0.m185596c("e_undo_button", strPageId, sfj0.C20032a.m185615h("moments_user_id", user == null ? "NA" : user.f56859id), eui0.m122572b());
        m215641W(f1g0Var, "undo");
        m215741u1();
        if (m215688Q1()) {
            return;
        }
        if (!h7d0.m133774m0() || !CoreModule.m30930K().me_().isNewUserIn24H() || !h7d0.m133773i0().getCanGuideUndoTips()) {
            this.f199571S.m190794P2(false);
        } else {
            h7d0.m133773i0().m133781k0();
            h7d0.m133773i0().m133786r0(false);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public RelativeLayout m215720k0() {
        return this.f199589e;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ kql m215721k1() {
        if (!NullChecker.m82486a(m215735r0())) {
            return null;
        }
        KeyEvent.Callback callbackMo39812d = m215735r0().mo39812d();
        if (callbackMo39812d instanceof kql) {
            return (kql) callbackMo39812d;
        }
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public VButton_FakeShadow m215722l0() {
        return this.f199597l;
    }

    /* JADX INFO: renamed from: l1 */
    public void m215723l1(boolean z) {
        this.f199558L0 = z;
        if (z && NullChecker.m82486a(act())) {
            m215741u1();
            hkl0.m135638a(act().getWindow().getDecorView(), false);
        }
        if (!z && bnl0.m105529O0(m215705b0())) {
            m215640V();
        }
        if (this.f199558L0 && NullChecker.m82486a(m215735r0()) && NullChecker.m82486a(m215735r0().mo39812d()) && (m215735r0().mo39812d() instanceof t7m)) {
            ((t7m) m215735r0().mo39812d()).mo37809C();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public VDraweeView m215724m0() {
        return this.f199592h;
    }

    /* JADX INFO: renamed from: m1 */
    public void m215725m1() {
        if (NullChecker.m82486a(m215735r0())) {
            m215735r0().mo39809a();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public RadarRipple m215726n0() {
        return this.f199591g;
    }

    /* JADX INFO: renamed from: n1 */
    public void m215727n1() {
        if (this.f199548G0.m222761e().booleanValue()) {
            this.f199570R0.start();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public LocationPermissionView m215728o0() {
        return this.f199586b;
    }

    /* JADX INFO: renamed from: o1 */
    public void m215729o1() {
        pci.m171689y(true);
        this.f199570R0.cancel();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) this.f199587c.getChildAt(0);
        int childCount = linearLayoutCompat.getChildCount();
        int measuredWidth = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayoutCompat.getChildAt(i);
            if (childAt.isShown() && childAt.getId() != adc0.f70512pf) {
                measuredWidth += linearLayoutCompat.getChildAt(i).getMeasuredWidth();
                LinearLayoutCompat.C0132a c0132a = (LinearLayoutCompat.C0132a) childAt.getLayoutParams();
                int i2 = ((ViewGroup.MarginLayoutParams) c0132a).leftMargin;
                if (i2 != 0) {
                    measuredWidth += i2;
                }
                int i3 = ((ViewGroup.MarginLayoutParams) c0132a).rightMargin;
                if (i3 != 0) {
                    measuredWidth += i3;
                }
                if (c0132a.getMarginEnd() != 0) {
                    measuredWidth += c0132a.getMarginEnd();
                }
                if (c0132a.getMarginStart() != 0) {
                    measuredWidth += c0132a.getMarginStart();
                }
            }
        }
        jj40.m145005h(bnl0.m105592y0() - measuredWidth);
    }

    /* JADX INFO: renamed from: p0 */
    public tel m215730p0() {
        return this.f199571S;
    }

    /* JADX INFO: renamed from: p1 */
    public void m215731p1(boolean z) {
        bnl0.m105525M0(this.f199608v, true);
        if (z) {
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/02f79ff2-ea08-4696-9df5-d227b6fa4f2d12.pdf").autoPlay(true).repeatCount(-1).into(this.f199608v);
        } else {
            SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/9a957b00-c134-4bf0-8dfd-1cdff0f4ec7513.pdf").autoPlay(true).repeatCount(-1).into(this.f199608v);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public FrameLayout m215732q0() {
        return this.f199585a;
    }

    /* JADX INFO: renamed from: q1 */
    public void m215733q1() {
        this.f199579W = null;
        this.f199548G0.m137019l(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: r */
    public void m215734r() {
        m215674H0();
    }

    /* JADX INFO: renamed from: r0 */
    public f1g0 m215735r0() {
        return this.f199573T;
    }

    /* JADX INFO: renamed from: s0 */
    public CardOperationButton m215736s0() {
        return this.f199610x;
    }

    /* JADX INFO: renamed from: s1 */
    public void m215737s1(boolean z, boolean z2) {
        m215739t1(z, z2, false);
    }

    /* JADX INFO: renamed from: t0 */
    public FrameLayout m215738t0() {
        return this.f199607u;
    }

    /* JADX INFO: renamed from: t1 */
    public void m215739t1(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.f199571S.f173857c = "";
        }
        m215656r1(z2);
        if (this.f199548G0.m222761e().booleanValue() && !z) {
            l51.m152890J(this.f199574T0);
            bnl0.m105525M0(m215711f0(), true);
            m215631L1(true);
            m215748y1(true);
            this.f199570R0.cancel();
            if (NullChecker.m82486a(m215720k0())) {
                bnl0.m105525M0(m215720k0(), false);
                m215633M1(false);
            }
            m215639T(true);
            if (m215722l0().getVisibility() != 4) {
                bnl0.m105525M0(m215722l0(), false);
            }
        } else if (!this.f199548G0.m222761e().booleanValue() && z) {
            this.f199574T0.m148116a(z2, false, false);
            if (z3) {
                l51.m152888H(act(), this.f199574T0, vo0.f184959f);
            } else {
                this.f199574T0.run();
            }
        } else if (this.f199548G0.m222761e().booleanValue() && z && !z2 && this.f199571S.m190782D1()) {
            bnl0.m105525M0(m215722l0(), false);
        }
        this.f199548G0.m137019l(Boolean.valueOf(z));
        this.f199571S.f173872r = z2;
        m215637P1();
    }

    /* JADX INFO: renamed from: u0 */
    public LinearLayout m215740u0() {
        return this.f199553J;
    }

    /* JADX INFO: renamed from: u1 */
    public void m215741u1() {
        if (NullChecker.m82486a(m215735r0()) && NullChecker.m82486a(m215735r0().mo39812d()) && (m215735r0().mo39812d() instanceof t7m)) {
            ((t7m) m215735r0().mo39812d()).mo37920p(true, false);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public CardOperationButton m215742v0() {
        return this.f199603q;
    }

    /* JADX INFO: renamed from: v1 */
    public void m215743v1() {
        m215705b0().setScaleX(1.0f);
        m215705b0().setScaleY(1.0f);
        m215707d0().setScaleX(1.0f);
        m215707d0().setScaleY(1.0f);
    }

    /* JADX INFO: renamed from: w0 */
    public VFrame_FlipContainer m215744w0() {
        return this.f199601p;
    }

    /* JADX INFO: renamed from: w1 */
    public void m215745w1() {
        m215705b0().setScaleX(0.0f);
        m215705b0().setScaleY(0.0f);
        m215707d0().setScaleX(0.0f);
        m215707d0().setScaleY(0.0f);
    }

    /* JADX INFO: renamed from: x0 */
    public ConstraintLayout m215746x0() {
        return this.f199547G;
    }

    /* JADX INFO: renamed from: y0 */
    public sxl0 m215747y0(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        return null;
    }

    /* JADX INFO: renamed from: y1 */
    public void m215748y1(boolean z) {
        this.f199546F0 = z;
        if (!z || (!pgj.m172246c() && rbb0.m180742o())) {
            bnl0.m105524M(m215705b0(), true);
            return;
        }
        if (!bnl0.m105529O0(m215705b0())) {
            m215640V();
        }
        bnl0.m105524M(m215705b0(), true);
    }

    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public void m215695V0() {
        m215664A0(this.f199577V.pageId());
    }

    /* JADX INFO: renamed from: E1 */
    public void m215670E1(int i) {
    }

    /* JADX INFO: renamed from: z1 */
    public void m215750z1(VSwipeStack.OnCardSwipeResult onCardSwipeResult, SwipeDirection swipeDirection) {
    }
}
