package p149l;

import android.animation.Animator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.DraweeView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4759y;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.GameOperate;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p046p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p046p1.mobile.putong.core.newui.intltribe.IntlTribeSlideFrag;
import com.p046p1.mobile.putong.core.newui.intltribe.IntlTribeSwipeAct;
import com.p046p1.mobile.putong.core.newui.intltribe.ProfileCardStackIntlTribeSlideOpt;
import com.p046p1.mobile.putong.core.newui.intltribe.view.IntlTribeSlideEmptyCardView;
import com.p046p1.mobile.putong.core.p053ui.C8275a;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import com.p046p1.mobile.putong.core.p053ui.RadarRipple;
import com.p046p1.mobile.putong.core.p053ui.main.LocationPermissionView;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.ProfileCreateData;
import com.p046p1.mobile.putong.core.p053ui.settings.SettingsFragOld;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p133rx.subjects.C22392a;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VFrame_FlipContainer;
import p147v.VFrame_Squared;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class pip implements s7m<hhp> {

    /* JADX INFO: renamed from: A */
    public Act f149603A;

    /* JADX INFO: renamed from: B */
    public hhp f149604B;

    /* JADX INFO: renamed from: C */
    public wsf0 f149605C;

    /* JADX INFO: renamed from: D */
    public ProfileCardStackIntlTribeSlideOpt f149606D;

    /* JADX INFO: renamed from: E */
    public IntlTribeSlideFrag f149607E;

    /* JADX INFO: renamed from: F */
    public ez30 f149609F;

    /* JADX INFO: renamed from: G */
    public int f149611G;

    /* JADX INFO: renamed from: G0 */
    public ViewOnTouchListenerC19238e f149612G0;

    /* JADX INFO: renamed from: H0 */
    public ViewOnTouchListenerC19238e f149614H0;

    /* JADX INFO: renamed from: J0 */
    public dd80 f149618J0;

    /* JADX INFO: renamed from: L */
    public boolean f149620L;

    /* JADX INFO: renamed from: M */
    public boolean f149621M;

    /* JADX INFO: renamed from: N */
    public boolean f149622N;

    /* JADX INFO: renamed from: O */
    public boolean f149623O;

    /* JADX INFO: renamed from: T */
    public String f149628T;

    /* JADX INFO: renamed from: U */
    public String f149629U;

    /* JADX INFO: renamed from: V */
    public String f149630V;

    /* JADX INFO: renamed from: W */
    public String f149631W;

    /* JADX INFO: renamed from: X */
    public String f149632X;

    /* JADX INFO: renamed from: Y */
    public e30 f149633Y;

    /* JADX INFO: renamed from: Z */
    public chj0 f149634Z;

    /* JADX INFO: renamed from: a */
    public FrameLayout f149635a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f149636b;

    /* JADX INFO: renamed from: c */
    public IntlTribeSlideEmptyCardView f149637c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f149638d;

    /* JADX INFO: renamed from: e */
    public VFrame_Squared f149639e;

    /* JADX INFO: renamed from: f */
    public RadarRipple f149640f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f149641g;

    /* JADX INFO: renamed from: h */
    public VRelative f149642h;

    /* JADX INFO: renamed from: i */
    public VImage f149643i;

    /* JADX INFO: renamed from: j */
    public VImage f149644j;

    /* JADX INFO: renamed from: k */
    public VLinear f149645k;

    /* JADX INFO: renamed from: k0 */
    public osl f149646k0;

    /* JADX INFO: renamed from: l */
    public VDraweeView f149647l;

    /* JADX INFO: renamed from: m */
    public VText f149648m;

    /* JADX INFO: renamed from: n */
    public LocationPermissionView f149649n;

    /* JADX INFO: renamed from: o */
    public VFrame f149650o;

    /* JADX INFO: renamed from: p */
    public VFrame f149651p;

    /* JADX INFO: renamed from: p0 */
    public Animator f149652p0;

    /* JADX INFO: renamed from: q */
    public ConstraintLayout f149653q;

    /* JADX INFO: renamed from: r */
    public View f149654r;

    /* JADX INFO: renamed from: s */
    public VText f149655s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f149656t;

    /* JADX INFO: renamed from: u */
    public GradientBgButton f149657u;

    /* JADX INFO: renamed from: v */
    public GradientBgButton f149658v;

    /* JADX INFO: renamed from: w */
    public GradientBgButton f149659w;

    /* JADX INFO: renamed from: x */
    public GradientBgButton f149660x;

    /* JADX INFO: renamed from: y */
    public GradientBgButton f149661y;

    /* JADX INFO: renamed from: z */
    public SuperLikeComboAnimView f149662z;

    /* JADX INFO: renamed from: H */
    public boolean f149613H = true;

    /* JADX INFO: renamed from: I */
    public boolean f149615I = false;

    /* JADX INFO: renamed from: J */
    public boolean f149617J = false;

    /* JADX INFO: renamed from: K */
    public C22392a<Boolean> f149619K = C22392a.m221513c(Boolean.FALSE);

    /* JADX INFO: renamed from: P */
    public View f149624P = null;

    /* JADX INFO: renamed from: Q */
    public long f149625Q = -1;

    /* JADX INFO: renamed from: R */
    public String f149626R = "empty";

    /* JADX INFO: renamed from: S */
    public String f149627S = "@@";

    /* JADX INFO: renamed from: E0 */
    public Runnable f149608E0 = new RunnableC19235b();

    /* JADX INFO: renamed from: F0 */
    public u0l f149610F0 = new C19236c();

    /* JADX INFO: renamed from: I0 */
    public final Runnable f149616I0 = new Runnable() { // from class: l.php
        @Override // java.lang.Runnable
        public final void run() {
            pip.m169659j();
        }
    };

    /* JADX INFO: renamed from: l.pip$a */
    public class C19234a implements C8275a.d {

        /* JADX INFO: renamed from: a */
        public String f149663a;

        public C19234a() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.C8275a.d
        /* JADX INFO: renamed from: a */
        public void mo37398a() {
            e51.m114745J(pip.this.f149616I0);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.C8275a.d
        public void release() {
            if (TextUtils.isEmpty(this.f149663a)) {
                return;
            }
            e51.m114743H(pip.this.f149603A, pip.this.f149616I0, 1000L);
        }
    }

    /* JADX INFO: renamed from: l.pip$b */
    public class RunnableC19235b implements Runnable {
        public RunnableC19235b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            pip.this.f149637c.m39544o();
            if (NullChecker.m81303a(pip.this.f149652p0)) {
                pip.this.f149652p0.end();
            }
        }
    }

    /* JADX INFO: renamed from: l.pip$c */
    public class C19236c extends u0l {
        public C19236c() {
        }

        @Override // p149l.u0l, java.lang.Runnable
        public void run() {
            xdl0.m208345M0(pip.this.m169721g0(), true);
            xdl0.m208345M0(pip.this.m169715b0(), false);
            pip.this.m169639M1(true);
            pip.this.m169636L1(false);
            pip.this.f149652p0.start();
            View viewFindViewWithTag = pip.this.m169727l0().findViewWithTag(pip.this.m169731n0().getRealView().getTag() + "child");
            if (NullChecker.m81303a(viewFindViewWithTag)) {
                pip.this.m169727l0().removeView(viewFindViewWithTag);
            }
            pip.this.m169646T(false);
            if (IntlCountryCodeController.m28126v()) {
                xdl0.m208344M(pip.this.m169737q0(), false);
                xdl0.m208344M(pip.this.m169743t0(), false);
            }
        }
    }

    /* JADX INFO: renamed from: l.pip$d */
    public class C19237d implements CardOperationButton.InterfaceC8049b {

        /* JADX INFO: renamed from: a */
        public String f149667a;

        public C19237d() {
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.views.CardOperationButton.InterfaceC8049b
        /* JADX INFO: renamed from: a */
        public void mo37399a() {
            e51.m114745J(pip.this.f149616I0);
            this.f149667a = pip.this.m169681C1(-1);
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.views.CardOperationButton.InterfaceC8049b
        /* JADX INFO: renamed from: b */
        public void mo37400b() {
            if (TextUtils.isEmpty(this.f149667a)) {
                return;
            }
            e51.m114743H(pip.this.f149603A, pip.this.f149616I0, 1000L);
        }
    }

    /* JADX INFO: renamed from: l.pip$e */
    public static class ViewOnTouchListenerC19238e implements View.OnTouchListener {

        /* JADX INFO: renamed from: c */
        public static int f149669c = zbc0.m217835a(8, 10);

        /* JADX INFO: renamed from: a */
        public int f149670a = 0;

        /* JADX INFO: renamed from: b */
        public VLinear.C22543a f149671b;

        public ViewOnTouchListenerC19238e() {
            VLinear.C22543a c22543a = new VLinear.C22543a();
            this.f149671b = c22543a;
            c22543a.m223064c();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f149670a <= f149669c) {
                if (motionEvent.getAction() == 0) {
                    int i = this.f149670a + 1;
                    this.f149670a = i;
                    if (i > f149669c) {
                        j760<Boolean, Boolean> j760VarM223063b = this.f149671b.m223063b();
                        C4759y.f20138Q = j760VarM223063b.f116564a.booleanValue();
                        C4759y.f20139R = j760VarM223063b.f116565b.booleanValue();
                    }
                }
                this.f149671b.m223062a(motionEvent);
            }
            if (motionEvent.getAction() == 0) {
                e5l.m114834c(true);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                e5l.m114834c(false);
            }
            return false;
        }
    }

    public pip(Act act, IntlTribeSlideFrag intlTribeSlideFrag) {
        this.f149603A = act;
        this.f149607E = intlTribeSlideFrag;
    }

    /* JADX INFO: renamed from: A0 */
    private void m169620A0() {
        if (u59.m191799H()) {
            this.f149646k0 = m169672w0(f6c0.f95721c4);
        } else {
            this.f149646k0 = m169672w0(f6c0.f95654Y3);
        }
        if (IntlCountryCodeController.m28126v()) {
            return;
        }
        ViewGroup buttonRootLayout = this.f149646k0.getButtonRootLayout();
        buttonRootLayout.setId(u4c0.f174428q5);
        this.f149651p.addView(buttonRootLayout, this.f149646k0.getRootBtnLayoutParams());
    }

    /* JADX INFO: renamed from: H1 */
    private void m169627H1() {
        m169629I1(false);
    }

    /* JADX INFO: renamed from: I1 */
    private void m169629I1(boolean z) {
        o6j0.m162859c(MatchScData.ModuleId.mid_e_superlikeButton, this.f149603A.pageId(), o6j0.C18854a.m162878h("moments_user_id", (!NullChecker.m81303a(m169729m0().mo38813j()) || m169729m0().mo38813j().isVirtualCard()) ? "0" : m169729m0().mo38813j().f19472id), o6j0.C18854a.m162879i("is_privileged", !n3b0.m157745t()), o6j0.C18854a.m162878h("showfrom_superlike", "home"));
        if (m169729m0() != null) {
            m169647V(m169729m0(), "superlike");
        }
        if (m169697Q1()) {
            return;
        }
        this.f149604B.m131053F2(true, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public /* synthetic */ void m169632K0(View view) {
        m169627H1();
    }

    /* JADX INFO: renamed from: K1 */
    private void m169633K1(String str) {
        String str2;
        if (TextUtils.equals(str, "like")) {
            str2 = "right";
        } else if (TextUtils.equals(str, "superlike")) {
            str2 = "up";
        } else {
            str2 = TextUtils.equals(str, "undo") ? "back" : BLiveGiftBubblePopupTitlePosition.left;
        }
        long jM155944o = this.f149625Q > 0 ? mqi0.m155944o() - this.f149625Q : -1L;
        this.f149625Q = mqi0.m155944o();
        o6j0.m162859c("e_card_click_interval", "p_suggest_users_home_view", o6j0.C18854a.m162878h("current_operation", str2), o6j0.C18854a.m162877g("operation_interval", jM155944o), o6j0.C18854a.m162878h("last_operation", this.f149626R));
        this.f149626R = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m169635L0(View view) {
        m169627H1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public void m169636L1(boolean z) {
        HomeStatisticsHelper.m36689C(this.f149607E.getUserVisibleHint() && !this.f149607E.isHidden());
        if (z) {
            HomeStatisticsHelper.m36715u();
        } else {
            HomeStatisticsHelper.m36714t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public /* synthetic */ void m169638M0(View view) {
        m169694O1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public void m169639M1(boolean z) {
        HomeStatisticsHelper.m36689C(this.f149607E.getUserVisibleHint() && !this.f149607E.isHidden());
        if (z) {
            HomeStatisticsHelper.m36717w();
        } else {
            HomeStatisticsHelper.m36716v();
        }
    }

    /* JADX INFO: renamed from: P1 */
    private void m169643P1() {
        if (this.f149619K.m221515e().booleanValue()) {
            m169720f0().getRealView().setOnTouchListener(null);
            m169716c0().getRealView().setOnTouchListener(null);
            m169720f0().getRealView().setClickable(false);
            m169716c0().getRealView().setClickable(false);
            m169739r0().getRealView().setClickable(false);
            m169731n0().getRealView().setClickable(false);
            return;
        }
        m169720f0().getRealView().setOnTouchListener(this.f149612G0);
        m169716c0().getRealView().setOnTouchListener(this.f149614H0);
        m169720f0().getRealView().setClickable(true);
        m169716c0().getRealView().setClickable(true);
        m169739r0().getRealView().setClickable(true);
        m169731n0().getRealView().setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m169645R0() {
        if (!CoreModule.m29932K().mo30809q7()) {
            CoreModule.m29932K().mo30728Ug(this.f149603A, "p_intl_tribe_empty_state_view,e_intl_tribe_empty_state_location_click,click");
            return;
        }
        CoreBusinessService coreBusinessServiceM94651a = CoreModule.m29935P().m94651a();
        Act act = this.f149603A;
        m169685F1(coreBusinessServiceM94651a.mo33464aj(act, act.pageId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public void m169646T(boolean z) {
        View immediatelyMatch = this.f149646k0.getImmediatelyMatch();
        if (z) {
            m169720f0().getRealView().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m169733o0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m169739r0().getRealView().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m169716c0().getRealView().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            if (u59.m191797F() && immediatelyMatch != null) {
                immediatelyMatch.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            }
            rxg0.m181572j().f161457b.onNext(roj0.f160388a);
            return;
        }
        m169720f0().getRealView().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        m169733o0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        m169739r0().getRealView().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        m169716c0().getRealView().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        if (!u59.m191797F() || immediatelyMatch == null) {
            return;
        }
        immediatelyMatch.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
    }

    /* JADX INFO: renamed from: V */
    private void m169647V(wsf0 wsf0Var, String str) {
        m169633K1(str);
        wsf0Var.m161386h(str);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m169652e(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public /* synthetic */ void m169653e1(wsf0 wsf0Var, View view) {
        m169691J1(wsf0Var.mo38809d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public /* synthetic */ void m169655f1(wsf0 wsf0Var, View view) {
        o6j0.m162859c("e_intl_tribe_card_like_click", this.f149603A.pageId(), o6j0.C18854a.m162878h("receiver_user_id", (NullChecker.m81303a(wsf0Var.mo38818o()) && NullChecker.m81303a(wsf0Var.mo38818o().m141745d())) ? wsf0Var.mo38818o().m141745d().f56011id : "0"), o6j0.C18854a.m162878h("intl_tribe_source_name", this.f149629U), o6j0.C18854a.m162878h("intl_get_see_source", "tribe"));
        m169647V(wsf0Var, "like");
        wsf0Var.mo38801A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public /* synthetic */ void m169656g1(wsf0 wsf0Var, View view) {
        if (NullChecker.m81303a(m169729m0().mo38809d()) && NullChecker.m81303a(m169729m0().mo38818o())) {
            NullChecker.m81303a(m169729m0().mo38813j());
        }
        wsf0Var.mo38801A(SwipeDirection.UP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public /* synthetic */ void m169657h1(wsf0 wsf0Var, View view) {
        o6j0.m162859c("e_intl_tribe_card_dislike_click", this.f149603A.pageId(), o6j0.C18854a.m162878h("receiver_user_id", (NullChecker.m81303a(wsf0Var.mo38818o()) && NullChecker.m81303a(wsf0Var.mo38818o().m141745d())) ? wsf0Var.mo38818o().m141745d().f56011id : "0"), o6j0.C18854a.m162878h("intl_tribe_source_name", this.f149629U), o6j0.C18854a.m162878h("intl_get_see_source", "tribe"));
        m169647V(wsf0Var, "dislike");
        m169729m0().mo38801A(SwipeDirection.LEFT);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m169659j() {
        C4348d.m20896l().m20900k("bubble_superlike_bubble");
        rxg0.m181577u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public /* synthetic */ void m169660j1(View view) {
        m169694O1();
    }

    /* JADX INFO: renamed from: t1 */
    private void m169668t1(boolean z) {
        if (z) {
            getAct().removeCallbacks(this.f149608E0);
            this.f149637c.setVisibility(8);
            this.f149637c.m39537h();
        } else {
            getAct().removeCallbacks(this.f149608E0);
            if (this.f149604B.m131049D1()) {
                this.f149604B.m131079m2();
            } else {
                getAct().postDelayed(this.f149608E0, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m169671w(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w0 */
    private osl m169672w0(int i) {
        osl oslVar = (osl) LayoutInflater.from(getAct()).inflate(i, (ViewGroup) this.f149651p, false);
        if (oslVar instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) oslVar;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        return oslVar;
    }

    /* JADX INFO: renamed from: x0 */
    private void m169674x0() {
        xdl0.m208329E0(this.f149646k0.getImmediatelyMatch(), new View.OnClickListener() { // from class: l.whp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186459a.m169693O0(view);
            }
        });
        this.f149646k0.getImmediatelyMatchButton().setNormalStateLayerBackground(this.f149603A.drawable(this.f149646k0.getOperationBtnBg()));
        this.f149646k0.getDislikeBtn().setNormalStateLayerBackground(this.f149603A.drawable(this.f149646k0.getOperationBtnBg()));
        this.f149646k0.getDislikeBtn().setPressedStateLayerBackground(this.f149603A.drawable(this.f149646k0.getDislikePressBg()));
        this.f149646k0.getLikeBtn().setNormalStateLayerBackground(this.f149603A.drawable(this.f149646k0.getOperationBtnBg()));
        this.f149646k0.getLikeBtn().setPressedStateLayerBackground(this.f149603A.drawable(this.f149646k0.getLikePressBg()));
    }

    /* JADX INFO: renamed from: y0 */
    private void m169676y0() {
        xdl0.m208344M(this.f149657u, true);
        xdl0.m208329E0(this.f149657u, new View.OnClickListener() { // from class: l.vhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181522a.m169696Q0(view);
            }
        });
        if (u59.m191800I()) {
            xdl0.m208344M(this.f149661y, true);
        }
    }

    /* JADX INFO: renamed from: A1 */
    public boolean m169678A1() {
        if (m169729m0() != null && (m169729m0().mo38809d() instanceof d5m)) {
            d5m d5mVar = (d5m) m169729m0().mo38809d();
            if (!d5mVar.mo36947y() || d5mVar.mo36886f() || d5mVar.mo36836N()) {
                return false;
            }
            return ((NullChecker.m81303a(d5mVar.getCardData().m141745d()) && mah0.m153738y0(d5mVar.getCardData().m141745d().f56011id)) || mah0.m153729s0().m153789z0()) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: B0 */
    public void m169679B0(boolean z, boolean z2) {
        this.f149619K.onNext(Boolean.valueOf(z));
        this.f149604B.f107764s = z2;
        View immediatelyMatch = this.f149646k0.getImmediatelyMatch();
        if (z) {
            m169720f0().getRealView().setScaleX(0.0f);
            m169720f0().getRealView().setScaleY(0.0f);
            m169716c0().getRealView().setScaleX(0.0f);
            m169716c0().getRealView().setScaleY(0.0f);
            m169733o0().setScaleX(0.0f);
            m169733o0().setScaleY(0.0f);
            m169739r0().getRealView().setScaleX(0.0f);
            m169739r0().getRealView().setScaleY(0.0f);
            if (u59.m191797F() && immediatelyMatch != null) {
                immediatelyMatch.setScaleX(0.0f);
                immediatelyMatch.setScaleY(0.0f);
            }
        } else {
            m169720f0().getRealView().setScaleX(1.0f);
            m169720f0().getRealView().setScaleY(1.0f);
            m169716c0().getRealView().setScaleX(1.0f);
            m169716c0().getRealView().setScaleY(1.0f);
            m169733o0().setScaleX(1.0f);
            m169733o0().setScaleY(1.0f);
            m169739r0().getRealView().setScaleX(1.0f);
            m169739r0().getRealView().setScaleY(1.0f);
            if (u59.m191797F() && immediatelyMatch != null) {
                immediatelyMatch.setScaleX(1.0f);
                immediatelyMatch.setScaleY(1.0f);
            }
        }
        m169643P1();
        m169723i0().setRadarColor(this.f149611G);
        this.f149652p0 = xij0.m209659b0(m169723i0(), m169722h0());
        xdl0.m208345M0(m169721g0(), z);
        xdl0.m208345M0(m169715b0(), !z);
        m169639M1(z);
        m169636L1(!z);
        if (IntlCountryCodeController.m28126v()) {
            xdl0.m208344M(m169737q0(), !z);
            xdl0.m208344M(m169743t0(), !z);
        }
    }

    /* JADX INFO: renamed from: B1 */
    public void m169680B1() {
        if (IntlCountryCodeController.m28126v()) {
            m169737q0().setVisibility(0);
        } else {
            m169711Z().setVisibility(0);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f149603A;
    }

    /* JADX INFO: renamed from: C1 */
    public String m169681C1(int i) {
        View viewM169733o0 = IntlCountryCodeController.m28126v() ? this.f149658v : m169733o0();
        if (IntlCountryCodeController.m28126v()) {
            if (NullChecker.m81303a(viewM169733o0) && NullChecker.m81303a(m169733o0()) && xdl0.m208349O0(viewM169733o0) && m169733o0().getScaleY() == 1.0f && !m169735p0().m223031c()) {
                return rxg0.m181572j().m181584K(this.f149607E, IntlCountryCodeController.m28126v() ? this.f149658v : m169733o0(), i);
            }
            return null;
        }
        if (CoreModule.f17545c.m31484o3() == null || !m169688H0() || CoreModule.f17545c.m31484o3().superLikeLimit.remainToday() == 0) {
            return null;
        }
        boolean zM223031c = m169735p0().m223031c();
        osl oslVar = this.f149646k0;
        if (zM223031c) {
            oslVar.getSuperLikeRemaining().setText(String.valueOf(CoreModule.f17545c.m31484o3().superLikeLimit.remainToday()));
            return "bubble_superlike_bubble";
        }
        oslVar.getSuperLikeRemaining().setText(String.valueOf(CoreModule.f17545c.m31484o3().superLikeLimit.remainToday()));
        rxg0.m181560G(this.f149603A, m169735p0(), this.f149646k0.getSuperLikeRemaining());
        return "bubble_superlike_bubble";
    }

    /* JADX INFO: renamed from: D0 */
    public void m169682D0(Bundle bundle) {
        this.f149628T = bundle.getString("groupCategory");
        this.f149629U = bundle.getString("subType");
        this.f149630V = bundle.getString("title");
        this.f149631W = bundle.getString("icon");
        this.f149632X = bundle.getString("bigCoverUrl");
        m169683E0();
    }

    /* JADX INFO: renamed from: E0 */
    public void m169683E0() {
        this.f149648m.setTypeface(Typeface.defaultFromStyle(1));
        xdl0.m208362Z(this.f149642h);
        xdl0.m208362Z(this.f149647l);
        xdl0.m208329E0(this.f149643i, new View.OnClickListener() { // from class: l.ihp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113321a.m169701T0(view);
            }
        });
        xdl0.m208344M(this.f149644j, TextUtils.equals(this.f149629U, "night-free"));
        xdl0.m208329E0(this.f149644j, new View.OnClickListener() { // from class: l.mip
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134026a.m169714a1(view);
            }
        });
        if (!TextUtils.isEmpty(this.f149632X)) {
            qib0.f154691G.m102331L0(this.f149636b, this.f149632X);
        }
        if (!TextUtils.isEmpty(this.f149631W)) {
            qib0.f154691G.m102331L0(this.f149647l, this.f149631W);
        }
        this.f149648m.setText(this.f149630V);
        final wsf0 wsf0VarM169729m0 = m169729m0();
        m169750z0();
        if (IntlCountryCodeController.m28126v() && NullChecker.m81303a(this.f149654r)) {
            this.f149654r.setOnClickListener(new View.OnClickListener() { // from class: l.nip
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f139121a.m169718d1(wsf0VarM169729m0, view);
                }
            });
            this.f149655s.setOnClickListener(new View.OnClickListener() { // from class: l.oip
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f144144a.m169653e1(wsf0VarM169729m0, view);
                }
            });
            xdl0.m208345M0(this.f149656t, true);
            xdl0.m208325C0(m169711Z(), 0);
            xdl0.m208345M0(this.f149653q, true);
            chj0 chj0Var = new chj0(getAct(), wsf0VarM169729m0, this.f149650o);
            this.f149634Z = chj0Var;
            wsf0VarM169729m0.setUsHomeCardAnimHelper(chj0Var);
            xdl0.m208329E0(this.f149659w, new View.OnClickListener() { // from class: l.jhp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f117966a.m169655f1(wsf0VarM169729m0, view);
                }
            });
            xdl0.m208329E0(this.f149658v, new View.OnClickListener() { // from class: l.khp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f123194a.m169656g1(wsf0VarM169729m0, view);
                }
            });
            xdl0.m208329E0(this.f149660x, new View.OnClickListener() { // from class: l.lhp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f128123a.m169657h1(wsf0VarM169729m0, view);
                }
            });
            xdl0.m208329E0(this.f149661y, new View.OnClickListener() { // from class: l.mhp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f133833a.m169660j1(view);
                }
            });
            this.f149658v.setLongPressingListener(new C19234a());
        }
        if (!vdj.m198001c() && IntlCountryCodeController.m28119o()) {
            m169707X();
            if (nkp.m159986e()) {
                m169709Y();
            }
        } else {
            m169709Y();
        }
        this.f149611G = getAct().color(w0c0.f183773I);
        ez30 ez30Var = new ez30(this.f149604B, this);
        this.f149609F = ez30Var;
        wsf0VarM169729m0.setAdapter(ez30Var);
        m169720f0().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.nhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139010a.m169726k1(wsf0VarM169729m0, view);
            }
        });
        m169716c0().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.ohp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144033a.m169703U0(wsf0VarM169729m0, view);
            }
        });
        View realView = m169720f0().getRealView();
        ViewOnTouchListenerC19238e viewOnTouchListenerC19238e = new ViewOnTouchListenerC19238e();
        this.f149612G0 = viewOnTouchListenerC19238e;
        realView.setOnTouchListener(viewOnTouchListenerC19238e);
        View realView2 = m169716c0().getRealView();
        ViewOnTouchListenerC19238e viewOnTouchListenerC19238e2 = new ViewOnTouchListenerC19238e();
        this.f149614H0 = viewOnTouchListenerC19238e2;
        realView2.setOnTouchListener(viewOnTouchListenerC19238e2);
        this.f149633Y = xck0.m208120a(500, new e30() { // from class: l.thp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170269a.m169704V0(wsf0VarM169729m0, (mol) obj);
            }
        });
        wsf0VarM169729m0.mo38812i(new e30() { // from class: l.eip
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f91623a.m169706W0(obj);
            }
        });
        wsf0VarM169729m0.mo38819p(new VSwipeStack.InterfaceC4767c() { // from class: l.iip
            @Override // com.p046p1.mobile.putong.core.card.VSwipeStack.InterfaceC4767c
            /* JADX INFO: renamed from: b */
            public final void mo35197b(boolean z, float f, CardProgressAction cardProgressAction) {
                this.f113419a.m169708X0(wsf0VarM169729m0, z, f, cardProgressAction);
            }
        });
        final hhp hhpVar = this.f149604B;
        Objects.requireNonNull(hhpVar);
        wsf0VarM169729m0.mo38811g(new id50() { // from class: l.jip
            @Override // p149l.id50
            /* JADX INFO: renamed from: a */
            public final VSwipeStack.OnCardSwipeResult mo111028a(mol molVar, SwipeDirection swipeDirection, boolean z) {
                return hhpVar.m131083o2(molVar, swipeDirection, z);
            }
        });
        xij0.m209657Z(m169722h0(), new d30() { // from class: l.kip
            @Override // p149l.d30
            public final void call() {
                this.f123371a.m169710Y0();
            }
        });
        wsf0VarM169729m0.setAllowUpSwipe(true);
        m169739r0().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.lip
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128237a.m169712Z0(view);
            }
        });
        this.f149649n.m47360d(this.f149607E, 256);
        xdl0.m208362Z(this.f149650o);
        if (upa.m194619C2()) {
            if (this.f149646k0.getUndo() != null) {
                this.f149646k0.getUndo().setNormalStateLayerBackground(this.f149603A.drawable(this.f149646k0.getOperationBtnBg()));
            }
            this.f149646k0.getDislikeBtn().setNormalStateLayerBackground(this.f149603A.drawable(this.f149646k0.getOperationBtnBg()));
            this.f149646k0.getLikeBtn().setNormalStateLayerBackground(this.f149603A.drawable(this.f149646k0.getOperationBtnBg()));
            this.f149646k0.getSuperLike().setNormalStateLayerBackground(this.f149603A.drawable(this.f149646k0.getOperationBtnBg()));
        }
        if (u59.m191799H()) {
            m169674x0();
        } else if (u59.m191800I()) {
            m169676y0();
        }
    }

    /* JADX INFO: renamed from: E1 */
    public void m169684E1(@NonNull Act act) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_intl_tribe_exit_intercept_pop", s4e.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("intl_tribe_exit_name", this.f149629U));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(act.getString(R$string.f17757Ga));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#4D000000")), 0, act.getString(R$string.f17757Ga).length(), 17);
        this.f149618J0 = new dd80.C16336a(act).m110964S(x2c0.f189262Dc).m110987p0(true).m110975d0(x2c0.f189655Q).m110980i0(x2c0.f189230Cc).m110996y0(act.getString(R$string.f17847Ja)).m110991t0(act.getString(R$string.f17817Ia)).m110974c0(act.getString(R$string.f17787Ha), new Runnable() { // from class: l.aip
            @Override // java.lang.Runnable
            public final void run() {
                o6j0.m162859c("e_intl_tribe_exit_wait_click", "p_intl_tribe_exit_intercept_pop", new o6j0.C18854a[0]);
            }
        }).m110979h0(spannableStringBuilder, new Runnable() { // from class: l.bip
            @Override // java.lang.Runnable
            public final void run() {
                this.f75784a.m169730m1();
            }
        }).m110961P(true).m110958M(true).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.cip
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110989r0();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: F1 */
    public void m169685F1(Intent intent) {
        this.f149607E.startActivity(intent);
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m169686G0() {
        return this.f149623O;
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
    /* JADX INFO: renamed from: G1 */
    public void m169687G1(String str, int i) {
        if (m169729m0() == null || m169729m0().mo38809d() == null || m169729m0().mo38818o() == null || m169729m0().mo38818o().m141745d() == null) {
            return;
        }
        User userM141745d = m169729m0().mo38818o().m141745d();
        sbp.m183249i(userM141745d.f56011id);
        Intent intentM50746z2 = ProfileAct.m50746z2(getAct(), userM141745d.f56011id, str, true, false, false);
        if (TextUtils.equals(userM141745d.f56011id, CoreModule.f17545c.f19642f0.f19868J0.get())) {
            ProfileCreateData profileCreateData = new ProfileCreateData();
            profileCreateData.showCountdownSendMsg = true;
            intentM50746z2.putExtra("profile_create_data", profileCreateData);
        }
        this.f149607E.startActivityForResult(intentM50746z2, 114);
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m169688H0() {
        return this.f149613H;
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m169689I0() {
        return this.f149615I;
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m169690J0() {
        return this.f149619K.m221515e().booleanValue();
    }

    /* JADX INFO: renamed from: J1 */
    public void m169691J1(View view) {
        zvf0.m220399u("e_intl_tribe_card_profile_entranc_click", this.f149603A.pageId(), j760.m140076a("intl_tribe_source_name", this.f149629U));
        e30 e30Var = this.f149633Y;
        if (e30Var != null) {
            e30Var.call(view);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m169692N0() {
        if (NullChecker.m81303a(m169729m0()) && NullChecker.m81303a(m169729m0().mo38818o()) && NullChecker.m81303a(m169729m0().mo38818o().m141745d())) {
            CoreModule.f17545c.f19663m0.m30994E8(m169729m0().mo38818o().m141745d().f56011id);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m169693O0(View view) {
        C8455a.m47588w().m47610p(this.f149603A, m169713a0(this.f149607E), "p_suggest_users_home_view,e_intl_instantmatch_btn,p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click", new d30() { // from class: l.hip
            @Override // p149l.d30
            public final void call() {
                this.f107952a.m169692N0();
            }
        });
    }

    /* JADX INFO: renamed from: O1 */
    public void m169694O1() {
        String strPageId = this.f149603A.pageId();
        o6j0.C18854a c18854aM162878h = o6j0.C18854a.m162878h("intl_tribe_source_name", this.f149629U);
        User user = CoreModule.f17545c.f19669o0.f20059U;
        o6j0.m162859c("e_intl_tribe_card_regret_click", strPageId, c18854aM162878h, o6j0.C18854a.m162878h("receiver_user_id", user == null ? "NA" : user.f56011id));
        if (m169697Q1()) {
            return;
        }
        if (!ezc0.m118907m0() || !CoreModule.m29932K().me_().isNewUserIn24H() || !ezc0.m118906i0().getCanGuideUndoTips()) {
            this.f149604B.m131051E2(false);
        } else {
            ezc0.m118906i0().m118914k0();
            ezc0.m118906i0().m118919r0(false);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m169695P0() {
        if (NullChecker.m81303a(m169729m0()) && NullChecker.m81303a(m169729m0().mo38818o()) && NullChecker.m81303a(m169729m0().mo38818o().m141745d())) {
            CoreModule.f17545c.f19663m0.m30994E8(m169729m0().mo38818o().m141745d().f56011id);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m169696Q0(View view) {
        C8455a.m47588w().m47610p(this.f149603A, m169713a0(this.f149607E), "p_suggest_users_home_view,e_intl_instantmatch_btn,p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click", new d30() { // from class: l.dip
            @Override // p149l.d30
            public final void call() {
                this.f86414a.m169695P0();
            }
        });
    }

    /* JADX INFO: renamed from: Q1 */
    public boolean m169697Q1() {
        return m169729m0().mo38809d() == null;
    }

    /* JADX INFO: renamed from: R */
    public View m169698R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qip.m174903b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public IntlTribeSwipeAct getAct() {
        return (IntlTribeSwipeAct) this.f149603A;
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m169701T0(View view) {
        getAct().m66873d2();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(hhp hhpVar) {
        this.f149604B = hhpVar;
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m169703U0(wsf0 wsf0Var, View view) {
        o6j0.m162859c("e_intl_tribe_card_dislike_click", this.f149603A.pageId(), o6j0.C18854a.m162878h("receiver_user_id", (NullChecker.m81303a(wsf0Var.mo38818o()) && NullChecker.m81303a(wsf0Var.mo38818o().m141745d())) ? wsf0Var.mo38818o().m141745d().f56011id : "0"), o6j0.C18854a.m162878h("intl_tribe_source_name", this.f149629U), o6j0.C18854a.m162878h("intl_get_see_source", "tribe"));
        m169647V(wsf0Var, "dislike");
        if (m169697Q1()) {
            return;
        }
        wsf0Var.mo38820r(SwipeDirection.LEFT, true);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m169704V0(wsf0 wsf0Var, mol molVar) {
        if (NullChecker.m81303a(m169729m0().mo38809d())) {
            if ((mah0.m153720m0() && NullChecker.m81303a(m169729m0().mo38813j()) && NullChecker.m81303a(m169729m0().mo38818o().m141745d()) && (mah0.m153738y0(m169729m0().mo38818o().m141745d().f56011id) || m169729m0().mo38813j() == null)) || m169729m0().m161387q() || m169729m0().m161385f()) {
                return;
            }
            if (wsf0Var.mo38816m()) {
                wsf0Var.mo38817n();
                return;
            }
            d5m d5mVar = m169729m0().mo38809d() instanceof d5m ? (d5m) m169729m0().mo38809d() : null;
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
            CoreSuggested.UserInfo userInfoMo38813j = m169729m0().mo38813j();
            CoreMomentInfo momentInfoProxy = molVar.getMomentInfoProxy();
            String strPageId = this.f149603A.pageId();
            o6j0.C18854a c18854aM162876f = o6j0.C18854a.m162876f("IsWhiteBlock", i);
            o6j0.C18854a c18854aM162878h = o6j0.C18854a.m162878h("moments_user_id", NullChecker.m81303a(molVar.getUserProxy()) ? molVar.getUserProxy().f56011id : "0");
            o6j0.C18854a c18854aM162879i = o6j0.C18854a.m162879i("show_he_liked", zIsUserLikeMe);
            o6j0.C18854a c18854aM162878h2 = o6j0.C18854a.m162878h("show_he_liked_position", str);
            o6j0.C18854a c18854aM162879i2 = o6j0.C18854a.m162879i("is_first_picture", this.f149604B.m131045B1(NullChecker.m81303a(molVar.getUserProxy()) ? molVar.getUserProxy().f56011id : "0") && molVar.getShowPictureIndexProxy() == 0);
            o6j0.C18854a c18854aM162878h3 = o6j0.C18854a.m162878h("swipe_scene", "default");
            if (NullChecker.m81303a(userInfoMo38813j) && userInfoMo38813j.isThemeCard) {
                z = true;
            }
            o6j0.m162859c(MatchScData.ModuleId.mid_e_card, strPageId, c18854aM162876f, c18854aM162878h, c18854aM162879i, c18854aM162878h2, c18854aM162879i2, c18854aM162878h3, o6j0.C18854a.m162879i("theme_card_ornot", z), o6j0.C18854a.m162878h("is_moment_card", molVar.mo36950z() ? "1" : "0"), o6j0.C18854a.m162878h("moment_id", momentInfoProxy != null ? momentInfoProxy.f56008id : "0"));
            zvf0.m220399u("e_intl_tribe_card_profile_entranc_click", this.f149603A.pageId(), j760.m140076a("intl_tribe_source_name", this.f149629U));
            abi.m95650y(true);
            m169687G1("home_moment_theme_card", getAct().color(w0c0.f183793O1));
        }
    }

    /* JADX INFO: renamed from: W */
    public nsl m169705W(boolean z, boolean z2) {
        if (z) {
            return z2 ? m169731n0() : m169720f0();
        }
        return m169716c0();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m169706W0(Object obj) {
        this.f149633Y.call(obj);
    }

    /* JADX INFO: renamed from: X */
    public void m169707X() {
        m169729m0().setAllowUpSwipe(false);
        xdl0.m208344M(m169733o0(), false);
        m169751z1(false, true);
        if (IntlCountryCodeController.m28126v()) {
            xdl0.m208344M(this.f149658v, false);
            xdl0.m208344M(this.f149661y, false);
            m169751z1(false, true);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m169708X0(wsf0 wsf0Var, boolean z, float f, CardProgressAction cardProgressAction) {
        KeyEvent.Callback callbackMo38809d = wsf0Var.mo38809d();
        if (NullChecker.m81303a(callbackMo38809d)) {
            d5m d5mVar = callbackMo38809d instanceof d5m ? (d5m) callbackMo38809d : null;
            if (d5mVar == null || !d5mVar.mo37917R()) {
                if (d5mVar != null && d5mVar.mo37916F()) {
                    if (this.f149620L) {
                        m169716c0().mo38359j(-f);
                    }
                    if (this.f149621M) {
                        m169720f0().mo38359j(f);
                    }
                    if (this.f149622N) {
                        m169731n0().mo38359j(f);
                        return;
                    }
                    return;
                }
                if (f <= 0.0f) {
                    m169731n0().reset();
                    m169720f0().reset();
                    m169716c0().mo38359j(-f);
                    this.f149620L = true;
                    this.f149621M = false;
                    this.f149622N = false;
                    return;
                }
                if (z) {
                    m169731n0().reset();
                    m169716c0().reset();
                    m169720f0().mo38359j(f);
                    this.f149621M = true;
                    this.f149620L = false;
                    this.f149622N = false;
                    return;
                }
                m169720f0().reset();
                m169716c0().reset();
                m169731n0().mo38359j(f);
                this.f149620L = false;
                this.f149621M = false;
                this.f149622N = true;
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m169709Y() {
        m169729m0().setAllowUpSwipe(true);
        if (IntlCountryCodeController.m28126v()) {
            xdl0.m208344M(this.f149658v, true);
            xdl0.m208344M(this.f149661y, true);
            m169751z1(true, false);
        }
        if (fap.m120266y()) {
            this.f149613H = true;
        }
        m169733o0().setVisibility(0);
        m169751z1(true, false);
        m169733o0().setOnClickListener(new View.OnClickListener() { // from class: l.xhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192901a.m169632K0(view);
            }
        });
        m169731n0().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.yhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198379a.m169635L0(view);
            }
        });
        m169731n0().setOnLongPressListener(new C19237d());
        m169739r0().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.zhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203201a.m169638M0(view);
            }
        });
        xdl0.m208384k0(m169711Z());
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m169710Y0() {
        this.f149604B.m131087r2();
    }

    /* JADX INFO: renamed from: Z */
    public View m169711Z() {
        return this.f149646k0.getButtonRootLayout();
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m169712Z0(View view) {
        m169694O1();
    }

    /* JADX INFO: renamed from: a0 */
    public final User m169713a0(IntlTribeSlideFrag intlTribeSlideFrag) {
        CoreSuggested.UserInfo userInfoMo38813j = intlTribeSlideFrag.f24338C.m169729m0().mo38813j();
        if (NullChecker.m81303a(userInfoMo38813j)) {
            return userInfoMo38813j.getRenderUser();
        }
        return null;
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m169714a1(View view) {
        o6j0.m162859c("e_intl_tribe_exit_btn", this.f149603A.pageId(), new o6j0.C18854a[0]);
        m169684E1(this.f149603A);
    }

    /* JADX INFO: renamed from: b0 */
    public View m169715b0() {
        return this.f149651p;
    }

    /* JADX INFO: renamed from: c0 */
    public nsl m169716c0() {
        return this.f149646k0.getDislikeBtn();
    }

    /* JADX INFO: renamed from: d0 */
    public DraweeView m169717d0() {
        return this.f149637c.f24362b;
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m169718d1(wsf0 wsf0Var, View view) {
        m169691J1(wsf0Var.mo38809d());
    }

    /* JADX INFO: renamed from: e0 */
    public IntlTribeSlideFrag m169719e0() {
        return this.f149607E;
    }

    /* JADX INFO: renamed from: f0 */
    public nsl m169720f0() {
        return this.f149646k0.getLikeBtn();
    }

    /* JADX INFO: renamed from: g0 */
    public RelativeLayout m169721g0() {
        return this.f149638d;
    }

    /* JADX INFO: renamed from: h0 */
    public VDraweeView m169722h0() {
        return this.f149641g;
    }

    /* JADX INFO: renamed from: i0 */
    public RadarRipple m169723i0() {
        return this.f149640f;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM169698R = m169698R(layoutInflater, viewGroup);
        ProfileCardStackIntlTribeSlideOpt profileCardStackIntlTribeSlideOpt = new ProfileCardStackIntlTribeSlideOpt(getAct(), new qol0() { // from class: l.qhp
            @Override // p149l.qol0
            /* JADX INFO: renamed from: d2 */
            public final ool0 mo36754d2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
                return this.f154504a.m169744u0(virtualCardType, userInfo);
            }
        }, this);
        this.f149606D = profileCardStackIntlTribeSlideOpt;
        profileCardStackIntlTribeSlideOpt.setClipChildren(false);
        this.f149606D.setClipToPadding(false);
        this.f149651p.addView(this.f149606D, 0, new FrameLayout.LayoutParams(-1, -1));
        this.f149605C = this.f149606D;
        m169620A0();
        xdl0.m208329E0(this.f149646k0.getButtonRootLayout(), new View.OnClickListener() { // from class: l.rhp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pip.m169671w(view);
            }
        });
        return viewM169698R;
    }

    /* JADX INFO: renamed from: j0 */
    public LocationPermissionView m169724j0() {
        return this.f149649n;
    }

    /* JADX INFO: renamed from: k0 */
    public hhp m169725k0() {
        return this.f149604B;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m169726k1(wsf0 wsf0Var, View view) {
        o6j0.m162859c("e_intl_tribe_card_like_click", this.f149603A.pageId(), o6j0.C18854a.m162878h("receiver_user_id", (NullChecker.m81303a(wsf0Var.mo38818o()) && NullChecker.m81303a(wsf0Var.mo38818o().m141745d())) ? wsf0Var.mo38818o().m141745d().f56011id : "0"), o6j0.C18854a.m162878h("intl_tribe_source_name", this.f149629U), o6j0.C18854a.m162878h("intl_get_see_source", "tribe"));
        m169647V(wsf0Var, "like");
        if (m169697Q1()) {
            return;
        }
        wsf0Var.mo38820r(SwipeDirection.RIGHT, true);
    }

    /* JADX INFO: renamed from: l0 */
    public FrameLayout m169727l0() {
        return this.f149635a;
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m169728l1(Envelope envelope) {
        this.f149603A.m66873d2();
    }

    /* JADX INFO: renamed from: m0 */
    public wsf0 m169729m0() {
        return this.f149605C;
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m169730m1() {
        o6j0.m162859c("e_intl_tribe_exit_leave_click", "p_intl_tribe_exit_intercept_pop", new o6j0.C18854a[0]);
        m169740r1(this.f149628T, this.f149629U);
    }

    /* JADX INFO: renamed from: n0 */
    public nsl m169731n0() {
        return this.f149646k0.getSuperLike();
    }

    /* JADX INFO: renamed from: n1 */
    public void m169732n1(boolean z) {
        this.f149623O = z;
        if (z && NullChecker.m81303a(getAct())) {
            m169748w1();
            dbl0.m110646a(getAct().getWindow().getDecorView(), false);
        }
        if (this.f149623O && NullChecker.m81303a(m169729m0()) && NullChecker.m81303a(m169729m0().mo38809d()) && (m169729m0().mo38809d() instanceof d5m)) {
            ((d5m) m169729m0().mo38809d()).mo36806C();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public View m169733o0() {
        return this.f149646k0.getSuperLikeWarpLayout();
    }

    /* JADX INFO: renamed from: o1 */
    public void m169734o1() {
        if (NullChecker.m81303a(m169729m0())) {
            m169729m0().mo38806a();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public VFrame_FlipContainer m169735p0() {
        return this.f149646k0.getSuperLikeLayout();
    }

    /* JADX INFO: renamed from: p1 */
    public void m169736p1() {
        if (this.f149619K.m221515e().booleanValue()) {
            this.f149652p0.start();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public LinearLayout m169737q0() {
        return this.f149656t;
    }

    /* JADX INFO: renamed from: q1 */
    public void m169738q1() {
        abi.m95650y(true);
        this.f149652p0.cancel();
    }

    /* JADX INFO: renamed from: r0 */
    public nsl m169739r0() {
        return this.f149646k0.getUndo();
    }

    /* JADX INFO: renamed from: r1 */
    public void m169740r1(String str, String str2) {
        this.f149603A.duringCreated(CoreModule.f17545c.f19667n1.m34269H3(GameOperate.quit, str, str2)).subscribe(mkd0.m154956H(new e30() { // from class: l.fip
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97707a.m169728l1((Envelope) obj);
            }
        }, new e30() { // from class: l.gip
            @Override // p149l.e30
            public final void call(Object obj) {
                pip.m169652e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public View m169741s0() {
        return this.f149646k0.getUndoLayout();
    }

    /* JADX INFO: renamed from: s1 */
    public void m169742s1() {
        this.f149609F = null;
        this.f149619K.onNext(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: t0 */
    public ConstraintLayout m169743t0() {
        return this.f149653q;
    }

    /* JADX INFO: renamed from: u0 */
    public ool0 m169744u0(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        return null;
    }

    /* JADX INFO: renamed from: u1 */
    public void m169745u1(boolean z, boolean z2) {
        m169747v1(z, z2, false);
    }

    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public void m169700S0() {
        Intent intent = new Intent(getAct(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", SettingsFragOld.class.getSimpleName());
        getAct().startActivity(intent);
    }

    /* JADX INFO: renamed from: v1 */
    public void m169747v1(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.f149604B.f107750e = "";
        }
        m169668t1(z2);
        if (this.f149619K.m221515e().booleanValue() && !z) {
            e51.m114745J(this.f149610F0);
            xdl0.m208345M0(m169715b0(), true);
            m169636L1(true);
            this.f149652p0.cancel();
            if (NullChecker.m81303a(m169721g0())) {
                xdl0.m208345M0(m169721g0(), false);
                m169639M1(false);
            }
            m169646T(true);
            if (IntlCountryCodeController.m28126v()) {
                xdl0.m208344M(m169737q0(), true);
                xdl0.m208344M(m169743t0(), true);
                xdl0.m208344M(m169711Z(), false);
            }
        } else if (this.f149619K.m221515e().booleanValue() || !z) {
            this.f149619K.m221515e().booleanValue();
        } else {
            this.f149610F0.m191342a(z2, false, false);
            if (z3) {
                e51.m114743H(getAct(), this.f149610F0, zo0.f204053f);
            } else {
                this.f149610F0.run();
            }
        }
        this.f149619K.onNext(Boolean.valueOf(z));
        this.f149604B.f107764s = z2;
        m169643P1();
    }

    /* JADX INFO: renamed from: w1 */
    public void m169748w1() {
        if (NullChecker.m81303a(m169729m0()) && NullChecker.m81303a(m169729m0().mo38809d()) && (m169729m0().mo38809d() instanceof d5m)) {
            ((d5m) m169729m0().mo38809d()).mo36917p(true, false);
        }
    }

    /* JADX INFO: renamed from: y1 */
    public void m169749y1(VSwipeStack.OnCardSwipeResult onCardSwipeResult, SwipeDirection swipeDirection) {
        if (NullChecker.m81303a(this.f149634Z)) {
            this.f149634Z.m106896i(onCardSwipeResult, swipeDirection);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m169750z0() {
        this.f149637c.m39540k(new d30() { // from class: l.shp
            @Override // p149l.d30
            public final void call() {
                this.f164621a.m169645R0();
            }
        }, new d30() { // from class: l.uhp
            @Override // p149l.d30
            public final void call() {
                this.f176584a.m169700S0();
            }
        }, this.f149604B);
    }

    /* JADX INFO: renamed from: z1 */
    public void m169751z1(boolean z, boolean z2) {
        this.f149615I = z;
        if (m169689I0()) {
            if (z2) {
                xdl0.m208344M(m169739r0().getRealView(), z);
                xdl0.m208344M(m169741s0(), z);
                return;
            } else {
                xdl0.m208345M0(m169739r0().getRealView(), z);
                xdl0.m208345M0(m169741s0(), z);
                return;
            }
        }
        if (z2) {
            xdl0.m208344M(m169739r0().getRealView(), false);
            xdl0.m208344M(m169741s0(), false);
        } else {
            xdl0.m208345M0(m169739r0().getRealView(), false);
            xdl0.m208345M0(m169741s0(), false);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
