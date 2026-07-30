package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4910y;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.GameOperate;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton;
import com.p051p1.mobile.putong.core.newui.intltribe.IntlTribeSlideFrag;
import com.p051p1.mobile.putong.core.newui.intltribe.IntlTribeSwipeAct;
import com.p051p1.mobile.putong.core.newui.intltribe.ProfileCardStackIntlTribeSlideOpt;
import com.p051p1.mobile.putong.core.newui.intltribe.view.IntlTribeSlideEmptyCardView;
import com.p051p1.mobile.putong.core.p058ui.C8438a;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import com.p051p1.mobile.putong.core.p058ui.RadarRipple;
import com.p051p1.mobile.putong.core.p058ui.main.LocationPermissionView;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.ProfileCreateData;
import com.p051p1.mobile.putong.core.p058ui.settings.SettingsFragOld;
import com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p137rx.subjects.C22507a;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VFrame_FlipContainer;
import p151v.VFrame_Squared;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class pkp implements iam<hjp> {

    /* JADX INFO: renamed from: A */
    public Act f152870A;

    /* JADX INFO: renamed from: B */
    public hjp f152871B;

    /* JADX INFO: renamed from: C */
    public f1g0 f152872C;

    /* JADX INFO: renamed from: D */
    public ProfileCardStackIntlTribeSlideOpt f152873D;

    /* JADX INFO: renamed from: E */
    public IntlTribeSlideFrag f152874E;

    /* JADX INFO: renamed from: F */
    public s740 f152876F;

    /* JADX INFO: renamed from: G */
    public int f152878G;

    /* JADX INFO: renamed from: G0 */
    public ViewOnTouchListenerC19388e f152879G0;

    /* JADX INFO: renamed from: H0 */
    public ViewOnTouchListenerC19388e f152881H0;

    /* JADX INFO: renamed from: J0 */
    public jl80 f152885J0;

    /* JADX INFO: renamed from: L */
    public boolean f152887L;

    /* JADX INFO: renamed from: M */
    public boolean f152888M;

    /* JADX INFO: renamed from: N */
    public boolean f152889N;

    /* JADX INFO: renamed from: O */
    public boolean f152890O;

    /* JADX INFO: renamed from: T */
    public String f152895T;

    /* JADX INFO: renamed from: U */
    public String f152896U;

    /* JADX INFO: renamed from: V */
    public String f152897V;

    /* JADX INFO: renamed from: W */
    public String f152898W;

    /* JADX INFO: renamed from: X */
    public String f152899X;

    /* JADX INFO: renamed from: Y */
    public y20 f152900Y;

    /* JADX INFO: renamed from: Z */
    public fqj0 f152901Z;

    /* JADX INFO: renamed from: a */
    public FrameLayout f152902a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f152903b;

    /* JADX INFO: renamed from: c */
    public IntlTribeSlideEmptyCardView f152904c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f152905d;

    /* JADX INFO: renamed from: e */
    public VFrame_Squared f152906e;

    /* JADX INFO: renamed from: f */
    public RadarRipple f152907f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f152908g;

    /* JADX INFO: renamed from: h */
    public VRelative f152909h;

    /* JADX INFO: renamed from: i */
    public VImage f152910i;

    /* JADX INFO: renamed from: j */
    public VImage f152911j;

    /* JADX INFO: renamed from: k */
    public VLinear f152912k;

    /* JADX INFO: renamed from: k0 */
    public bvl f152913k0;

    /* JADX INFO: renamed from: l */
    public VDraweeView f152914l;

    /* JADX INFO: renamed from: m */
    public VText f152915m;

    /* JADX INFO: renamed from: n */
    public LocationPermissionView f152916n;

    /* JADX INFO: renamed from: o */
    public VFrame f152917o;

    /* JADX INFO: renamed from: p */
    public VFrame f152918p;

    /* JADX INFO: renamed from: p0 */
    public Animator f152919p0;

    /* JADX INFO: renamed from: q */
    public ConstraintLayout f152920q;

    /* JADX INFO: renamed from: r */
    public View f152921r;

    /* JADX INFO: renamed from: s */
    public VText f152922s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f152923t;

    /* JADX INFO: renamed from: u */
    public GradientBgButton f152924u;

    /* JADX INFO: renamed from: v */
    public GradientBgButton f152925v;

    /* JADX INFO: renamed from: w */
    public GradientBgButton f152926w;

    /* JADX INFO: renamed from: x */
    public GradientBgButton f152927x;

    /* JADX INFO: renamed from: y */
    public GradientBgButton f152928y;

    /* JADX INFO: renamed from: z */
    public SuperLikeComboAnimView f152929z;

    /* JADX INFO: renamed from: H */
    public boolean f152880H = true;

    /* JADX INFO: renamed from: I */
    public boolean f152882I = false;

    /* JADX INFO: renamed from: J */
    public boolean f152884J = false;

    /* JADX INFO: renamed from: K */
    public C22507a<Boolean> f152886K = C22507a.m222759c(Boolean.FALSE);

    /* JADX INFO: renamed from: P */
    public View f152891P = null;

    /* JADX INFO: renamed from: Q */
    public long f152892Q = -1;

    /* JADX INFO: renamed from: R */
    public String f152893R = "empty";

    /* JADX INFO: renamed from: S */
    public String f152894S = "@@";

    /* JADX INFO: renamed from: E0 */
    public Runnable f152875E0 = new RunnableC19385b();

    /* JADX INFO: renamed from: F0 */
    public k3l f152877F0 = new C19386c();

    /* JADX INFO: renamed from: I0 */
    public final Runnable f152883I0 = new Runnable() { // from class: l.pjp
        @Override // java.lang.Runnable
        public final void run() {
            pkp.m172655j();
        }
    };

    /* JADX INFO: renamed from: l.pkp$a */
    public class C19384a implements C8438a.d {

        /* JADX INFO: renamed from: a */
        public String f152930a;

        public C19384a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.C8438a.d
        /* JADX INFO: renamed from: a */
        public void mo38401a() {
            l51.m152890J(pkp.this.f152883I0);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.C8438a.d
        public void release() {
            if (TextUtils.isEmpty(this.f152930a)) {
                return;
            }
            l51.m152888H(pkp.this.f152870A, pkp.this.f152883I0, 1000L);
        }
    }

    /* JADX INFO: renamed from: l.pkp$b */
    public class RunnableC19385b implements Runnable {
        public RunnableC19385b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            pkp.this.f152904c.m40547o();
            if (NullChecker.m82486a(pkp.this.f152919p0)) {
                pkp.this.f152919p0.end();
            }
        }
    }

    /* JADX INFO: renamed from: l.pkp$c */
    public class C19386c extends k3l {
        public C19386c() {
        }

        @Override // p153l.k3l, java.lang.Runnable
        public void run() {
            bnl0.m105525M0(pkp.this.m172717g0(), true);
            bnl0.m105525M0(pkp.this.m172711b0(), false);
            pkp.this.m172635M1(true);
            pkp.this.m172632L1(false);
            pkp.this.f152919p0.start();
            View viewFindViewWithTag = pkp.this.m172723l0().findViewWithTag(pkp.this.m172727n0().getRealView().getTag() + "child");
            if (NullChecker.m82486a(viewFindViewWithTag)) {
                pkp.this.m172723l0().removeView(viewFindViewWithTag);
            }
            pkp.this.m172642T(false);
            if (IntlCountryCodeController.m29125v()) {
                bnl0.m105524M(pkp.this.m172733q0(), false);
                bnl0.m105524M(pkp.this.m172739t0(), false);
            }
        }
    }

    /* JADX INFO: renamed from: l.pkp$d */
    public class C19387d implements CardOperationButton.InterfaceC8200b {

        /* JADX INFO: renamed from: a */
        public String f152934a;

        public C19387d() {
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton.InterfaceC8200b
        /* JADX INFO: renamed from: a */
        public void mo38402a() {
            l51.m152890J(pkp.this.f152883I0);
            this.f152934a = pkp.this.m172677C1(-1);
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton.InterfaceC8200b
        /* JADX INFO: renamed from: b */
        public void mo38403b() {
            if (TextUtils.isEmpty(this.f152934a)) {
                return;
            }
            l51.m152888H(pkp.this.f152870A, pkp.this.f152883I0, 1000L);
        }
    }

    /* JADX INFO: renamed from: l.pkp$e */
    public static class ViewOnTouchListenerC19388e implements View.OnTouchListener {

        /* JADX INFO: renamed from: c */
        public static int f152936c = gkc0.m130573a(8, 10);

        /* JADX INFO: renamed from: a */
        public int f152937a = 0;

        /* JADX INFO: renamed from: b */
        public VLinear.C22658a f152938b;

        public ViewOnTouchListenerC19388e() {
            VLinear.C22658a c22658a = new VLinear.C22658a();
            this.f152938b = c22658a;
            c22658a.m224310c();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f152937a <= f152936c) {
                if (motionEvent.getAction() == 0) {
                    int i = this.f152937a + 1;
                    this.f152937a = i;
                    if (i > f152936c) {
                        pf60<Boolean, Boolean> pf60VarM224309b = this.f152938b.m224309b();
                        C4910y.f20880Q = pf60VarM224309b.f152156a.booleanValue();
                        C4910y.f20881R = pf60VarM224309b.f152157b.booleanValue();
                    }
                }
                this.f152938b.m224308a(motionEvent);
            }
            if (motionEvent.getAction() == 0) {
                u7l.m194876c(true);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                u7l.m194876c(false);
            }
            return false;
        }
    }

    public pkp(Act act, IntlTribeSlideFrag intlTribeSlideFrag) {
        this.f152870A = act;
        this.f152874E = intlTribeSlideFrag;
    }

    /* JADX INFO: renamed from: A0 */
    private void m172616A0() {
        if (d79.m114650I()) {
            this.f152913k0 = m172668w0(kec0.f125775c4);
        } else {
            this.f152913k0 = m172668w0(kec0.f125708Y3);
        }
        if (IntlCountryCodeController.m29125v()) {
            return;
        }
        ViewGroup buttonRootLayout = this.f152913k0.getButtonRootLayout();
        buttonRootLayout.setId(adc0.f70553s5);
        this.f152918p.addView(buttonRootLayout, this.f152913k0.getRootBtnLayoutParams());
    }

    /* JADX INFO: renamed from: H1 */
    private void m172623H1() {
        m172625I1(false);
    }

    /* JADX INFO: renamed from: I1 */
    private void m172625I1(boolean z) {
        sfj0.m185596c(MatchScData.ModuleId.mid_e_superlikeButton, this.f152870A.pageId(), sfj0.C20032a.m185615h("moments_user_id", (!NullChecker.m82486a(m172725m0().mo39816j()) || m172725m0().mo39816j().isVirtualCard()) ? "0" : m172725m0().mo39816j().f20214id), sfj0.C20032a.m185616i("is_privileged", !rbb0.m180747t()), sfj0.C20032a.m185615h("showfrom_superlike", "home"));
        if (m172725m0() != null) {
            m172643V(m172725m0(), "superlike");
        }
        if (m172693Q1()) {
            return;
        }
        this.f152871B.m135457F2(true, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public /* synthetic */ void m172628K0(View view) {
        m172623H1();
    }

    /* JADX INFO: renamed from: K1 */
    private void m172629K1(String str) {
        String str2;
        if (TextUtils.equals(str, "like")) {
            str2 = "right";
        } else if (TextUtils.equals(str, "superlike")) {
            str2 = "up";
        } else {
            str2 = TextUtils.equals(str, "undo") ? "back" : BLiveGiftBubblePopupTitlePosition.left;
        }
        long jM174454o = this.f152892Q > 0 ? pzi0.m174454o() - this.f152892Q : -1L;
        this.f152892Q = pzi0.m174454o();
        sfj0.m185596c("e_card_click_interval", "p_suggest_users_home_view", sfj0.C20032a.m185615h("current_operation", str2), sfj0.C20032a.m185614g("operation_interval", jM174454o), sfj0.C20032a.m185615h("last_operation", this.f152893R));
        this.f152893R = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m172631L0(View view) {
        m172623H1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public void m172632L1(boolean z) {
        HomeStatisticsHelper.m37692C(this.f152874E.getUserVisibleHint() && !this.f152874E.isHidden());
        if (z) {
            HomeStatisticsHelper.m37718u();
        } else {
            HomeStatisticsHelper.m37717t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public /* synthetic */ void m172634M0(View view) {
        m172690O1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public void m172635M1(boolean z) {
        HomeStatisticsHelper.m37692C(this.f152874E.getUserVisibleHint() && !this.f152874E.isHidden());
        if (z) {
            HomeStatisticsHelper.m37720w();
        } else {
            HomeStatisticsHelper.m37719v();
        }
    }

    /* JADX INFO: renamed from: P1 */
    private void m172639P1() {
        if (this.f152886K.m222761e().booleanValue()) {
            m172716f0().getRealView().setOnTouchListener(null);
            m172712c0().getRealView().setOnTouchListener(null);
            m172716f0().getRealView().setClickable(false);
            m172712c0().getRealView().setClickable(false);
            m172735r0().getRealView().setClickable(false);
            m172727n0().getRealView().setClickable(false);
            return;
        }
        m172716f0().getRealView().setOnTouchListener(this.f152879G0);
        m172712c0().getRealView().setOnTouchListener(this.f152881H0);
        m172716f0().getRealView().setClickable(true);
        m172712c0().getRealView().setClickable(true);
        m172735r0().getRealView().setClickable(true);
        m172727n0().getRealView().setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m172641R0() {
        if (!CoreModule.m30930K().mo31812q7()) {
            CoreModule.m30930K().mo31731Ug(this.f152870A, "p_intl_tribe_empty_state_view,e_intl_tribe_empty_state_location_click,click");
            return;
        }
        CoreBusinessService coreBusinessServiceM143405a = CoreModule.m30933P().m143405a();
        Act act = this.f152870A;
        m172681F1(coreBusinessServiceM143405a.mo34467aj(act, act.pageId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public void m172642T(boolean z) {
        View immediatelyMatch = this.f152913k0.getImmediatelyMatch();
        if (z) {
            m172716f0().getRealView().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m172729o0().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m172735r0().getRealView().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            m172712c0().getRealView().animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            if (d79.m114648G() && immediatelyMatch != null) {
                immediatelyMatch.animate().scaleX(1.0f).scaleY(1.0f).setDuration(400L).setStartDelay(200L).start();
            }
            z5h0.m218675j().f203044b.onNext(uxj0.f181467a);
            return;
        }
        m172716f0().getRealView().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        m172729o0().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        m172735r0().getRealView().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        m172712c0().getRealView().animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
        if (!d79.m114648G() || immediatelyMatch == null) {
            return;
        }
        immediatelyMatch.animate().scaleX(0.0f).scaleY(0.0f).setStartDelay(0L).setDuration(300L).start();
    }

    /* JADX INFO: renamed from: V */
    private void m172643V(f1g0 f1g0Var, String str) {
        m172629K1(str);
        f1g0Var.m179540h(str);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m172648e(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public /* synthetic */ void m172649e1(f1g0 f1g0Var, View view) {
        m172687J1(f1g0Var.mo39812d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public /* synthetic */ void m172651f1(f1g0 f1g0Var, View view) {
        sfj0.m185596c("e_intl_tribe_card_like_click", this.f152870A.pageId(), sfj0.C20032a.m185615h("receiver_user_id", (NullChecker.m82486a(f1g0Var.mo39821o()) && NullChecker.m82486a(f1g0Var.mo39821o().m140259d())) ? f1g0Var.mo39821o().m140259d().f56859id : "0"), sfj0.C20032a.m185615h("intl_tribe_source_name", this.f152896U), sfj0.C20032a.m185615h("intl_get_see_source", "tribe"));
        m172643V(f1g0Var, "like");
        f1g0Var.mo39804A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public /* synthetic */ void m172652g1(f1g0 f1g0Var, View view) {
        if (NullChecker.m82486a(m172725m0().mo39812d()) && NullChecker.m82486a(m172725m0().mo39821o())) {
            NullChecker.m82486a(m172725m0().mo39816j());
        }
        f1g0Var.mo39804A(SwipeDirection.UP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public /* synthetic */ void m172653h1(f1g0 f1g0Var, View view) {
        sfj0.m185596c("e_intl_tribe_card_dislike_click", this.f152870A.pageId(), sfj0.C20032a.m185615h("receiver_user_id", (NullChecker.m82486a(f1g0Var.mo39821o()) && NullChecker.m82486a(f1g0Var.mo39821o().m140259d())) ? f1g0Var.mo39821o().m140259d().f56859id : "0"), sfj0.C20032a.m185615h("intl_tribe_source_name", this.f152896U), sfj0.C20032a.m185615h("intl_get_see_source", "tribe"));
        m172643V(f1g0Var, "dislike");
        m172725m0().mo39804A(SwipeDirection.LEFT);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m172655j() {
        C4499d.m21895l().m21899k("bubble_superlike_bubble");
        z5h0.m218680u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public /* synthetic */ void m172656j1(View view) {
        m172690O1();
    }

    /* JADX INFO: renamed from: t1 */
    private void m172664t1(boolean z) {
        if (z) {
            getAct().removeCallbacks(this.f152875E0);
            this.f152904c.setVisibility(8);
            this.f152904c.m40540h();
        } else {
            getAct().removeCallbacks(this.f152875E0);
            if (this.f152871B.m135453D1()) {
                this.f152871B.m135483m2();
            } else {
                getAct().postDelayed(this.f152875E0, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m172667w(View view) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w0 */
    private bvl m172668w0(int i) {
        bvl bvlVar = (bvl) LayoutInflater.from(getAct()).inflate(i, (ViewGroup) this.f152918p, false);
        if (bvlVar instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) bvlVar;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        return bvlVar;
    }

    /* JADX INFO: renamed from: x0 */
    private void m172670x0() {
        bnl0.m105509E0(this.f152913k0.getImmediatelyMatch(), new View.OnClickListener() { // from class: l.wjp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189483a.m172689O0(view);
            }
        });
        this.f152913k0.getImmediatelyMatchButton().setNormalStateLayerBackground(this.f152870A.drawable(this.f152913k0.getOperationBtnBg()));
        this.f152913k0.getDislikeBtn().setNormalStateLayerBackground(this.f152870A.drawable(this.f152913k0.getOperationBtnBg()));
        this.f152913k0.getDislikeBtn().setPressedStateLayerBackground(this.f152870A.drawable(this.f152913k0.getDislikePressBg()));
        this.f152913k0.getLikeBtn().setNormalStateLayerBackground(this.f152870A.drawable(this.f152913k0.getOperationBtnBg()));
        this.f152913k0.getLikeBtn().setPressedStateLayerBackground(this.f152870A.drawable(this.f152913k0.getLikePressBg()));
    }

    /* JADX INFO: renamed from: y0 */
    private void m172672y0() {
        bnl0.m105524M(this.f152924u, true);
        bnl0.m105509E0(this.f152924u, new View.OnClickListener() { // from class: l.vjp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184433a.m172692Q0(view);
            }
        });
        if (d79.m114651J()) {
            bnl0.m105524M(this.f152928y, true);
        }
    }

    /* JADX INFO: renamed from: A1 */
    public boolean m172674A1() {
        if (m172725m0() != null && (m172725m0().mo39812d() instanceof t7m)) {
            t7m t7mVar = (t7m) m172725m0().mo39812d();
            if (!t7mVar.mo37950y() || t7mVar.mo37889f() || t7mVar.mo37839N()) {
                return false;
            }
            return ((NullChecker.m82486a(t7mVar.getCardData().m140259d()) && uih0.m196232y0(t7mVar.getCardData().m140259d().f56859id)) || uih0.m196223s0().m196283z0()) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: B0 */
    public void m172675B0(boolean z, boolean z2) {
        this.f152886K.onNext(Boolean.valueOf(z));
        this.f152871B.f110282s = z2;
        View immediatelyMatch = this.f152913k0.getImmediatelyMatch();
        if (z) {
            m172716f0().getRealView().setScaleX(0.0f);
            m172716f0().getRealView().setScaleY(0.0f);
            m172712c0().getRealView().setScaleX(0.0f);
            m172712c0().getRealView().setScaleY(0.0f);
            m172729o0().setScaleX(0.0f);
            m172729o0().setScaleY(0.0f);
            m172735r0().getRealView().setScaleX(0.0f);
            m172735r0().getRealView().setScaleY(0.0f);
            if (d79.m114648G() && immediatelyMatch != null) {
                immediatelyMatch.setScaleX(0.0f);
                immediatelyMatch.setScaleY(0.0f);
            }
        } else {
            m172716f0().getRealView().setScaleX(1.0f);
            m172716f0().getRealView().setScaleY(1.0f);
            m172712c0().getRealView().setScaleX(1.0f);
            m172712c0().getRealView().setScaleY(1.0f);
            m172729o0().setScaleX(1.0f);
            m172729o0().setScaleY(1.0f);
            m172735r0().getRealView().setScaleX(1.0f);
            m172735r0().getRealView().setScaleY(1.0f);
            if (d79.m114648G() && immediatelyMatch != null) {
                immediatelyMatch.setScaleX(1.0f);
                immediatelyMatch.setScaleY(1.0f);
            }
        }
        m172639P1();
        m172719i0().setRadarColor(this.f152878G);
        this.f152919p0 = asj0.m99933b0(m172719i0(), m172718h0());
        bnl0.m105525M0(m172717g0(), z);
        bnl0.m105525M0(m172711b0(), !z);
        m172635M1(z);
        m172632L1(!z);
        if (IntlCountryCodeController.m29125v()) {
            bnl0.m105524M(m172733q0(), !z);
            bnl0.m105524M(m172739t0(), !z);
        }
    }

    /* JADX INFO: renamed from: B1 */
    public void m172676B1() {
        if (IntlCountryCodeController.m29125v()) {
            m172733q0().setVisibility(0);
        } else {
            m172707Z().setVisibility(0);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f152870A;
    }

    /* JADX INFO: renamed from: C1 */
    public String m172677C1(int i) {
        View viewM172729o0 = IntlCountryCodeController.m29125v() ? this.f152925v : m172729o0();
        if (IntlCountryCodeController.m29125v()) {
            if (NullChecker.m82486a(viewM172729o0) && NullChecker.m82486a(m172729o0()) && bnl0.m105529O0(viewM172729o0) && m172729o0().getScaleY() == 1.0f && !m172731p0().m224277c()) {
                return z5h0.m218675j().m218687K(this.f152874E, IntlCountryCodeController.m29125v() ? this.f152925v : m172729o0(), i);
            }
            return null;
        }
        if (CoreModule.f18264c.m32487o3() == null || !m172684H0() || CoreModule.f18264c.m32487o3().superLikeLimit.remainToday() == 0) {
            return null;
        }
        boolean zM224277c = m172731p0().m224277c();
        bvl bvlVar = this.f152913k0;
        if (zM224277c) {
            bvlVar.getSuperLikeRemaining().setText(String.valueOf(CoreModule.f18264c.m32487o3().superLikeLimit.remainToday()));
            return "bubble_superlike_bubble";
        }
        bvlVar.getSuperLikeRemaining().setText(String.valueOf(CoreModule.f18264c.m32487o3().superLikeLimit.remainToday()));
        z5h0.m218663G(this.f152870A, m172731p0(), this.f152913k0.getSuperLikeRemaining());
        return "bubble_superlike_bubble";
    }

    /* JADX INFO: renamed from: D0 */
    public void m172678D0(Bundle bundle) {
        this.f152895T = bundle.getString("groupCategory");
        this.f152896U = bundle.getString("subType");
        this.f152897V = bundle.getString("title");
        this.f152898W = bundle.getString("icon");
        this.f152899X = bundle.getString("bigCoverUrl");
        m172679E0();
    }

    /* JADX INFO: renamed from: E0 */
    public void m172679E0() {
        this.f152915m.setTypeface(Typeface.defaultFromStyle(1));
        bnl0.m105542Z(this.f152909h);
        bnl0.m105542Z(this.f152914l);
        bnl0.m105509E0(this.f152910i, new View.OnClickListener() { // from class: l.ijp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115252a.m172697T0(view);
            }
        });
        bnl0.m105524M(this.f152911j, TextUtils.equals(this.f152896U, "night-free"));
        bnl0.m105509E0(this.f152911j, new View.OnClickListener() { // from class: l.mkp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137326a.m172710a1(view);
            }
        });
        if (!TextUtils.isEmpty(this.f152899X)) {
            uqb0.f180374G.m127115L0(this.f152903b, this.f152899X);
        }
        if (!TextUtils.isEmpty(this.f152898W)) {
            uqb0.f180374G.m127115L0(this.f152914l, this.f152898W);
        }
        this.f152915m.setText(this.f152897V);
        final f1g0 f1g0VarM172725m0 = m172725m0();
        m172746z0();
        if (IntlCountryCodeController.m29125v() && NullChecker.m82486a(this.f152921r)) {
            this.f152921r.setOnClickListener(new View.OnClickListener() { // from class: l.nkp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f142474a.m172714d1(f1g0VarM172725m0, view);
                }
            });
            this.f152922s.setOnClickListener(new View.OnClickListener() { // from class: l.okp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f147769a.m172649e1(f1g0VarM172725m0, view);
                }
            });
            bnl0.m105525M0(this.f152923t, true);
            bnl0.m105505C0(m172707Z(), 0);
            bnl0.m105525M0(this.f152920q, true);
            fqj0 fqj0Var = new fqj0(getAct(), f1g0VarM172725m0, this.f152917o);
            this.f152901Z = fqj0Var;
            f1g0VarM172725m0.setUsHomeCardAnimHelper(fqj0Var);
            bnl0.m105509E0(this.f152926w, new View.OnClickListener() { // from class: l.jjp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f121214a.m172651f1(f1g0VarM172725m0, view);
                }
            });
            bnl0.m105509E0(this.f152925v, new View.OnClickListener() { // from class: l.kjp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f127125a.m172652g1(f1g0VarM172725m0, view);
                }
            });
            bnl0.m105509E0(this.f152927x, new View.OnClickListener() { // from class: l.ljp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f132382a.m172653h1(f1g0VarM172725m0, view);
                }
            });
            bnl0.m105509E0(this.f152928y, new View.OnClickListener() { // from class: l.mjp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f137111a.m172656j1(view);
                }
            });
            this.f152925v.setLongPressingListener(new C19384a());
        }
        if (!pgj.m172246c() && IntlCountryCodeController.m29118o()) {
            m172703X();
            if (nmp.m163836e()) {
                m172705Y();
            }
        } else {
            m172705Y();
        }
        this.f152878G = getAct().color(c9c0.f80342I);
        s740 s740Var = new s740(this.f152871B, this);
        this.f152876F = s740Var;
        f1g0VarM172725m0.setAdapter(s740Var);
        m172716f0().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.njp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142330a.m172722k1(f1g0VarM172725m0, view);
            }
        });
        m172712c0().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.ojp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147689a.m172699U0(f1g0VarM172725m0, view);
            }
        });
        View realView = m172716f0().getRealView();
        ViewOnTouchListenerC19388e viewOnTouchListenerC19388e = new ViewOnTouchListenerC19388e();
        this.f152879G0 = viewOnTouchListenerC19388e;
        realView.setOnTouchListener(viewOnTouchListenerC19388e);
        View realView2 = m172712c0().getRealView();
        ViewOnTouchListenerC19388e viewOnTouchListenerC19388e2 = new ViewOnTouchListenerC19388e();
        this.f152881H0 = viewOnTouchListenerC19388e2;
        realView2.setOnTouchListener(viewOnTouchListenerC19388e2);
        this.f152900Y = dmk0.m116962a(500, new y20() { // from class: l.tjp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174601a.m172700V0(f1g0VarM172725m0, (xql) obj);
            }
        });
        f1g0VarM172725m0.mo39815i(new y20() { // from class: l.ekp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94419a.m172702W0(obj);
            }
        });
        f1g0VarM172725m0.mo39822p(new VSwipeStack.InterfaceC4918c() { // from class: l.ikp
            @Override // com.p051p1.mobile.putong.core.card.VSwipeStack.InterfaceC4918c
            /* JADX INFO: renamed from: b */
            public final void mo36200b(boolean z, float f, CardProgressAction cardProgressAction) {
                this.f115438a.m172704X0(f1g0VarM172725m0, z, f, cardProgressAction);
            }
        });
        final hjp hjpVar = this.f152871B;
        Objects.requireNonNull(hjpVar);
        f1g0VarM172725m0.mo39814g(new pl50() { // from class: l.jkp
            @Override // p153l.pl50
            /* JADX INFO: renamed from: a */
            public final VSwipeStack.OnCardSwipeResult mo145869a(xql xqlVar, SwipeDirection swipeDirection, boolean z) {
                return hjpVar.m135487o2(xqlVar, swipeDirection, z);
            }
        });
        asj0.m99931Z(m172718h0(), new x20() { // from class: l.kkp
            @Override // p153l.x20
            public final void call() {
                this.f127269a.m172706Y0();
            }
        });
        f1g0VarM172725m0.setAllowUpSwipe(true);
        m172735r0().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.lkp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132492a.m172708Z0(view);
            }
        });
        this.f152916n.m48543d(this.f152874E, 256);
        bnl0.m105542Z(this.f152917o);
        if (gra.m131550C2()) {
            if (this.f152913k0.getUndo() != null) {
                this.f152913k0.getUndo().setNormalStateLayerBackground(this.f152870A.drawable(this.f152913k0.getOperationBtnBg()));
            }
            this.f152913k0.getDislikeBtn().setNormalStateLayerBackground(this.f152870A.drawable(this.f152913k0.getOperationBtnBg()));
            this.f152913k0.getLikeBtn().setNormalStateLayerBackground(this.f152870A.drawable(this.f152913k0.getOperationBtnBg()));
            this.f152913k0.getSuperLike().setNormalStateLayerBackground(this.f152870A.drawable(this.f152913k0.getOperationBtnBg()));
        }
        if (d79.m114650I()) {
            m172670x0();
        } else if (d79.m114651J()) {
            m172672y0();
        }
    }

    /* JADX INFO: renamed from: E1 */
    public void m172680E1(@NonNull Act act) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_intl_tribe_exit_intercept_pop", g6e.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("intl_tribe_exit_name", this.f152896U));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(act.getString(R$string.f18817Ra));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#4D000000")), 0, act.getString(R$string.f18817Ra).length(), 17);
        this.f152885J0 = new jl80.C17971a(act).m146024S(dbc0.f86117Ec).m146047p0(true).m146035d0(dbc0.f86520R).m146040i0(dbc0.f86085Dc).m146056y0(act.getString(R$string.f18907Ua)).m146051t0(act.getString(R$string.f18877Ta)).m146034c0(act.getString(R$string.f18847Sa), new Runnable() { // from class: l.akp
            @Override // java.lang.Runnable
            public final void run() {
                sfj0.m185596c("e_intl_tribe_exit_wait_click", "p_intl_tribe_exit_intercept_pop", new sfj0.C20032a[0]);
            }
        }).m146039h0(spannableStringBuilder, new Runnable() { // from class: l.bkp
            @Override // java.lang.Runnable
            public final void run() {
                this.f77108a.m172726m1();
            }
        }).m146021P(true).m146018M(true).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.ckp
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146049r0();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: F1 */
    public void m172681F1(Intent intent) {
        this.f152874E.startActivity(intent);
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m172682G0() {
        return this.f152890O;
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
    public void m172683G1(String str, int i) {
        if (m172725m0() == null || m172725m0().mo39812d() == null || m172725m0().mo39821o() == null || m172725m0().mo39821o().m140259d() == null) {
            return;
        }
        User userM140259d = m172725m0().mo39821o().m140259d();
        sdp.m185492i(userM140259d.f56859id);
        Intent intentM51905A2 = ProfileAct.m51905A2(getAct(), userM140259d.f56859id, str, true, false, false);
        if (TextUtils.equals(userM140259d.f56859id, CoreModule.f18264c.f20384f0.f20610J0.get())) {
            ProfileCreateData profileCreateData = new ProfileCreateData();
            profileCreateData.showCountdownSendMsg = true;
            intentM51905A2.putExtra("profile_create_data", profileCreateData);
        }
        this.f152874E.startActivityForResult(intentM51905A2, 114);
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m172684H0() {
        return this.f152880H;
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m172685I0() {
        return this.f152882I;
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m172686J0() {
        return this.f152886K.m222761e().booleanValue();
    }

    /* JADX INFO: renamed from: J1 */
    public void m172687J1(View view) {
        i4g0.m138523u("e_intl_tribe_card_profile_entranc_click", this.f152870A.pageId(), pf60.m172085a("intl_tribe_source_name", this.f152896U));
        y20 y20Var = this.f152900Y;
        if (y20Var != null) {
            y20Var.call(view);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m172688N0() {
        if (NullChecker.m82486a(m172725m0()) && NullChecker.m82486a(m172725m0().mo39821o()) && NullChecker.m82486a(m172725m0().mo39821o().m140259d())) {
            CoreModule.f18264c.f20405m0.m31997E8(m172725m0().mo39821o().m140259d().f56859id);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m172689O0(View view) {
        C8618a.m48771w().m48793p(this.f152870A, m172709a0(this.f152874E), "p_suggest_users_home_view,e_intl_instantmatch_btn,p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click", new x20() { // from class: l.hkp
            @Override // p153l.x20
            public final void call() {
                this.f110444a.m172688N0();
            }
        });
    }

    /* JADX INFO: renamed from: O1 */
    public void m172690O1() {
        String strPageId = this.f152870A.pageId();
        sfj0.C20032a c20032aM185615h = sfj0.C20032a.m185615h("intl_tribe_source_name", this.f152896U);
        User user = CoreModule.f18264c.f20411o0.f20801U;
        sfj0.m185596c("e_intl_tribe_card_regret_click", strPageId, c20032aM185615h, sfj0.C20032a.m185615h("receiver_user_id", user == null ? "NA" : user.f56859id));
        if (m172693Q1()) {
            return;
        }
        if (!h7d0.m133774m0() || !CoreModule.m30930K().me_().isNewUserIn24H() || !h7d0.m133773i0().getCanGuideUndoTips()) {
            this.f152871B.m135455E2(false);
        } else {
            h7d0.m133773i0().m133781k0();
            h7d0.m133773i0().m133786r0(false);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m172691P0() {
        if (NullChecker.m82486a(m172725m0()) && NullChecker.m82486a(m172725m0().mo39821o()) && NullChecker.m82486a(m172725m0().mo39821o().m140259d())) {
            CoreModule.f18264c.f20405m0.m31997E8(m172725m0().mo39821o().m140259d().f56859id);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m172692Q0(View view) {
        C8618a.m48771w().m48793p(this.f152870A, m172709a0(this.f152874E), "p_suggest_users_home_view,e_intl_instantmatch_btn,p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click", new x20() { // from class: l.dkp
            @Override // p153l.x20
            public final void call() {
                this.f89424a.m172691P0();
            }
        });
    }

    /* JADX INFO: renamed from: Q1 */
    public boolean m172693Q1() {
        return m172725m0().mo39812d() == null;
    }

    /* JADX INFO: renamed from: R */
    public View m172694R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qkp.m176967b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public IntlTribeSwipeAct getAct() {
        return (IntlTribeSwipeAct) this.f152870A;
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m172697T0(View view) {
        getAct().m68056e2();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(hjp hjpVar) {
        this.f152871B = hjpVar;
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m172699U0(f1g0 f1g0Var, View view) {
        sfj0.m185596c("e_intl_tribe_card_dislike_click", this.f152870A.pageId(), sfj0.C20032a.m185615h("receiver_user_id", (NullChecker.m82486a(f1g0Var.mo39821o()) && NullChecker.m82486a(f1g0Var.mo39821o().m140259d())) ? f1g0Var.mo39821o().m140259d().f56859id : "0"), sfj0.C20032a.m185615h("intl_tribe_source_name", this.f152896U), sfj0.C20032a.m185615h("intl_get_see_source", "tribe"));
        m172643V(f1g0Var, "dislike");
        if (m172693Q1()) {
            return;
        }
        f1g0Var.mo39823r(SwipeDirection.LEFT, true);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m172700V0(f1g0 f1g0Var, xql xqlVar) {
        if (NullChecker.m82486a(m172725m0().mo39812d())) {
            if ((uih0.m196214m0() && NullChecker.m82486a(m172725m0().mo39816j()) && NullChecker.m82486a(m172725m0().mo39821o().m140259d()) && (uih0.m196232y0(m172725m0().mo39821o().m140259d().f56859id) || m172725m0().mo39816j() == null)) || m172725m0().m179541q() || m172725m0().m179539f()) {
                return;
            }
            if (f1g0Var.mo39819m()) {
                f1g0Var.mo39820n();
                return;
            }
            t7m t7mVar = m172725m0().mo39812d() instanceof t7m ? (t7m) m172725m0().mo39812d() : null;
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
            CoreSuggested.UserInfo userInfoMo39816j = m172725m0().mo39816j();
            CoreMomentInfo momentInfoProxy = xqlVar.getMomentInfoProxy();
            String strPageId = this.f152870A.pageId();
            sfj0.C20032a c20032aM185613f = sfj0.C20032a.m185613f("IsWhiteBlock", i);
            sfj0.C20032a c20032aM185615h = sfj0.C20032a.m185615h("moments_user_id", NullChecker.m82486a(xqlVar.getUserProxy()) ? xqlVar.getUserProxy().f56859id : "0");
            sfj0.C20032a c20032aM185616i = sfj0.C20032a.m185616i("show_he_liked", zIsUserLikeMe);
            sfj0.C20032a c20032aM185615h2 = sfj0.C20032a.m185615h("show_he_liked_position", str);
            sfj0.C20032a c20032aM185616i2 = sfj0.C20032a.m185616i("is_first_picture", this.f152871B.m135449B1(NullChecker.m82486a(xqlVar.getUserProxy()) ? xqlVar.getUserProxy().f56859id : "0") && xqlVar.getShowPictureIndexProxy() == 0);
            sfj0.C20032a c20032aM185615h3 = sfj0.C20032a.m185615h("swipe_scene", "default");
            if (NullChecker.m82486a(userInfoMo39816j) && userInfoMo39816j.isThemeCard) {
                z = true;
            }
            sfj0.m185596c(MatchScData.ModuleId.mid_e_card, strPageId, c20032aM185613f, c20032aM185615h, c20032aM185616i, c20032aM185615h2, c20032aM185616i2, c20032aM185615h3, sfj0.C20032a.m185616i("theme_card_ornot", z), sfj0.C20032a.m185615h("is_moment_card", xqlVar.mo37953z() ? "1" : "0"), sfj0.C20032a.m185615h("moment_id", momentInfoProxy != null ? momentInfoProxy.f56856id : "0"));
            i4g0.m138523u("e_intl_tribe_card_profile_entranc_click", this.f152870A.pageId(), pf60.m172085a("intl_tribe_source_name", this.f152896U));
            pci.m171689y(true);
            m172683G1("home_moment_theme_card", getAct().color(c9c0.f80365P1));
        }
    }

    /* JADX INFO: renamed from: W */
    public avl m172701W(boolean z, boolean z2) {
        if (z) {
            return z2 ? m172727n0() : m172716f0();
        }
        return m172712c0();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m172702W0(Object obj) {
        this.f152900Y.call(obj);
    }

    /* JADX INFO: renamed from: X */
    public void m172703X() {
        m172725m0().setAllowUpSwipe(false);
        bnl0.m105524M(m172729o0(), false);
        m172747z1(false, true);
        if (IntlCountryCodeController.m29125v()) {
            bnl0.m105524M(this.f152925v, false);
            bnl0.m105524M(this.f152928y, false);
            m172747z1(false, true);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m172704X0(f1g0 f1g0Var, boolean z, float f, CardProgressAction cardProgressAction) {
        KeyEvent.Callback callbackMo39812d = f1g0Var.mo39812d();
        if (NullChecker.m82486a(callbackMo39812d)) {
            t7m t7mVar = callbackMo39812d instanceof t7m ? (t7m) callbackMo39812d : null;
            if (t7mVar == null || !t7mVar.mo38920R()) {
                if (t7mVar != null && t7mVar.mo38919F()) {
                    if (this.f152887L) {
                        m172712c0().mo39362j(-f);
                    }
                    if (this.f152888M) {
                        m172716f0().mo39362j(f);
                    }
                    if (this.f152889N) {
                        m172727n0().mo39362j(f);
                        return;
                    }
                    return;
                }
                if (f <= 0.0f) {
                    m172727n0().reset();
                    m172716f0().reset();
                    m172712c0().mo39362j(-f);
                    this.f152887L = true;
                    this.f152888M = false;
                    this.f152889N = false;
                    return;
                }
                if (z) {
                    m172727n0().reset();
                    m172712c0().reset();
                    m172716f0().mo39362j(f);
                    this.f152888M = true;
                    this.f152887L = false;
                    this.f152889N = false;
                    return;
                }
                m172716f0().reset();
                m172712c0().reset();
                m172727n0().mo39362j(f);
                this.f152887L = false;
                this.f152888M = false;
                this.f152889N = true;
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m172705Y() {
        m172725m0().setAllowUpSwipe(true);
        if (IntlCountryCodeController.m29125v()) {
            bnl0.m105524M(this.f152925v, true);
            bnl0.m105524M(this.f152928y, true);
            m172747z1(true, false);
        }
        if (fcp.m125033y()) {
            this.f152880H = true;
        }
        m172729o0().setVisibility(0);
        m172747z1(true, false);
        m172729o0().setOnClickListener(new View.OnClickListener() { // from class: l.xjp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194632a.m172628K0(view);
            }
        });
        m172727n0().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.yjp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200322a.m172631L0(view);
            }
        });
        m172727n0().setOnLongPressListener(new C19387d());
        m172735r0().getRealView().setOnClickListener(new View.OnClickListener() { // from class: l.zjp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204693a.m172634M0(view);
            }
        });
        bnl0.m105564k0(m172707Z());
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m172706Y0() {
        this.f152871B.m135491r2();
    }

    /* JADX INFO: renamed from: Z */
    public View m172707Z() {
        return this.f152913k0.getButtonRootLayout();
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m172708Z0(View view) {
        m172690O1();
    }

    /* JADX INFO: renamed from: a0 */
    public final User m172709a0(IntlTribeSlideFrag intlTribeSlideFrag) {
        CoreSuggested.UserInfo userInfoMo39816j = intlTribeSlideFrag.f25080C.m172725m0().mo39816j();
        if (NullChecker.m82486a(userInfoMo39816j)) {
            return userInfoMo39816j.getRenderUser();
        }
        return null;
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m172710a1(View view) {
        sfj0.m185596c("e_intl_tribe_exit_btn", this.f152870A.pageId(), new sfj0.C20032a[0]);
        m172680E1(this.f152870A);
    }

    /* JADX INFO: renamed from: b0 */
    public View m172711b0() {
        return this.f152918p;
    }

    /* JADX INFO: renamed from: c0 */
    public avl m172712c0() {
        return this.f152913k0.getDislikeBtn();
    }

    /* JADX INFO: renamed from: d0 */
    public DraweeView m172713d0() {
        return this.f152904c.f25104b;
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m172714d1(f1g0 f1g0Var, View view) {
        m172687J1(f1g0Var.mo39812d());
    }

    /* JADX INFO: renamed from: e0 */
    public IntlTribeSlideFrag m172715e0() {
        return this.f152874E;
    }

    /* JADX INFO: renamed from: f0 */
    public avl m172716f0() {
        return this.f152913k0.getLikeBtn();
    }

    /* JADX INFO: renamed from: g0 */
    public RelativeLayout m172717g0() {
        return this.f152905d;
    }

    /* JADX INFO: renamed from: h0 */
    public VDraweeView m172718h0() {
        return this.f152908g;
    }

    /* JADX INFO: renamed from: i0 */
    public RadarRipple m172719i0() {
        return this.f152907f;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM172694R = m172694R(layoutInflater, viewGroup);
        ProfileCardStackIntlTribeSlideOpt profileCardStackIntlTribeSlideOpt = new ProfileCardStackIntlTribeSlideOpt(getAct(), new uxl0() { // from class: l.qjp
            @Override // p153l.uxl0
            /* JADX INFO: renamed from: d2 */
            public final sxl0 mo37757d2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
                return this.f158025a.m172740u0(virtualCardType, userInfo);
            }
        }, this);
        this.f152873D = profileCardStackIntlTribeSlideOpt;
        profileCardStackIntlTribeSlideOpt.setClipChildren(false);
        this.f152873D.setClipToPadding(false);
        this.f152918p.addView(this.f152873D, 0, new FrameLayout.LayoutParams(-1, -1));
        this.f152872C = this.f152873D;
        m172616A0();
        bnl0.m105509E0(this.f152913k0.getButtonRootLayout(), new View.OnClickListener() { // from class: l.rjp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pkp.m172667w(view);
            }
        });
        return viewM172694R;
    }

    /* JADX INFO: renamed from: j0 */
    public LocationPermissionView m172720j0() {
        return this.f152916n;
    }

    /* JADX INFO: renamed from: k0 */
    public hjp m172721k0() {
        return this.f152871B;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m172722k1(f1g0 f1g0Var, View view) {
        sfj0.m185596c("e_intl_tribe_card_like_click", this.f152870A.pageId(), sfj0.C20032a.m185615h("receiver_user_id", (NullChecker.m82486a(f1g0Var.mo39821o()) && NullChecker.m82486a(f1g0Var.mo39821o().m140259d())) ? f1g0Var.mo39821o().m140259d().f56859id : "0"), sfj0.C20032a.m185615h("intl_tribe_source_name", this.f152896U), sfj0.C20032a.m185615h("intl_get_see_source", "tribe"));
        m172643V(f1g0Var, "like");
        if (m172693Q1()) {
            return;
        }
        f1g0Var.mo39823r(SwipeDirection.RIGHT, true);
    }

    /* JADX INFO: renamed from: l0 */
    public FrameLayout m172723l0() {
        return this.f152902a;
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m172724l1(Envelope envelope) {
        this.f152870A.m68056e2();
    }

    /* JADX INFO: renamed from: m0 */
    public f1g0 m172725m0() {
        return this.f152872C;
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m172726m1() {
        sfj0.m185596c("e_intl_tribe_exit_leave_click", "p_intl_tribe_exit_intercept_pop", new sfj0.C20032a[0]);
        m172736r1(this.f152895T, this.f152896U);
    }

    /* JADX INFO: renamed from: n0 */
    public avl m172727n0() {
        return this.f152913k0.getSuperLike();
    }

    /* JADX INFO: renamed from: n1 */
    public void m172728n1(boolean z) {
        this.f152890O = z;
        if (z && NullChecker.m82486a(getAct())) {
            m172744w1();
            hkl0.m135638a(getAct().getWindow().getDecorView(), false);
        }
        if (this.f152890O && NullChecker.m82486a(m172725m0()) && NullChecker.m82486a(m172725m0().mo39812d()) && (m172725m0().mo39812d() instanceof t7m)) {
            ((t7m) m172725m0().mo39812d()).mo37809C();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public View m172729o0() {
        return this.f152913k0.getSuperLikeWarpLayout();
    }

    /* JADX INFO: renamed from: o1 */
    public void m172730o1() {
        if (NullChecker.m82486a(m172725m0())) {
            m172725m0().mo39809a();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public VFrame_FlipContainer m172731p0() {
        return this.f152913k0.getSuperLikeLayout();
    }

    /* JADX INFO: renamed from: p1 */
    public void m172732p1() {
        if (this.f152886K.m222761e().booleanValue()) {
            this.f152919p0.start();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public LinearLayout m172733q0() {
        return this.f152923t;
    }

    /* JADX INFO: renamed from: q1 */
    public void m172734q1() {
        pci.m171689y(true);
        this.f152919p0.cancel();
    }

    /* JADX INFO: renamed from: r0 */
    public avl m172735r0() {
        return this.f152913k0.getUndo();
    }

    /* JADX INFO: renamed from: r1 */
    public void m172736r1(String str, String str2) {
        this.f152870A.duringCreated(CoreModule.f18264c.f20409n1.m35272H3(GameOperate.quit, str, str2)).subscribe(psd0.m173597H(new y20() { // from class: l.fkp
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99548a.m172724l1((Envelope) obj);
            }
        }, new y20() { // from class: l.gkp
            @Override // p153l.y20
            public final void call(Object obj) {
                pkp.m172648e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public View m172737s0() {
        return this.f152913k0.getUndoLayout();
    }

    /* JADX INFO: renamed from: s1 */
    public void m172738s1() {
        this.f152876F = null;
        this.f152886K.onNext(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: t0 */
    public ConstraintLayout m172739t0() {
        return this.f152920q;
    }

    /* JADX INFO: renamed from: u0 */
    public sxl0 m172740u0(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        return null;
    }

    /* JADX INFO: renamed from: u1 */
    public void m172741u1(boolean z, boolean z2) {
        m172743v1(z, z2, false);
    }

    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public void m172696S0() {
        Intent intent = new Intent(getAct(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", SettingsFragOld.class.getSimpleName());
        getAct().startActivity(intent);
    }

    /* JADX INFO: renamed from: v1 */
    public void m172743v1(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.f152871B.f110268e = "";
        }
        m172664t1(z2);
        if (this.f152886K.m222761e().booleanValue() && !z) {
            l51.m152890J(this.f152877F0);
            bnl0.m105525M0(m172711b0(), true);
            m172632L1(true);
            this.f152919p0.cancel();
            if (NullChecker.m82486a(m172717g0())) {
                bnl0.m105525M0(m172717g0(), false);
                m172635M1(false);
            }
            m172642T(true);
            if (IntlCountryCodeController.m29125v()) {
                bnl0.m105524M(m172733q0(), true);
                bnl0.m105524M(m172739t0(), true);
                bnl0.m105524M(m172707Z(), false);
            }
        } else if (this.f152886K.m222761e().booleanValue() || !z) {
            this.f152886K.m222761e().booleanValue();
        } else {
            this.f152877F0.m148116a(z2, false, false);
            if (z3) {
                l51.m152888H(getAct(), this.f152877F0, vo0.f184959f);
            } else {
                this.f152877F0.run();
            }
        }
        this.f152886K.onNext(Boolean.valueOf(z));
        this.f152871B.f110282s = z2;
        m172639P1();
    }

    /* JADX INFO: renamed from: w1 */
    public void m172744w1() {
        if (NullChecker.m82486a(m172725m0()) && NullChecker.m82486a(m172725m0().mo39812d()) && (m172725m0().mo39812d() instanceof t7m)) {
            ((t7m) m172725m0().mo39812d()).mo37920p(true, false);
        }
    }

    /* JADX INFO: renamed from: y1 */
    public void m172745y1(VSwipeStack.OnCardSwipeResult onCardSwipeResult, SwipeDirection swipeDirection) {
        if (NullChecker.m82486a(this.f152901Z)) {
            this.f152901Z.m126771i(onCardSwipeResult, swipeDirection);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void m172746z0() {
        this.f152904c.m40543k(new x20() { // from class: l.sjp
            @Override // p153l.x20
            public final void call() {
                this.f169130a.m172641R0();
            }
        }, new x20() { // from class: l.ujp
            @Override // p153l.x20
            public final void call() {
                this.f179307a.m172696S0();
            }
        }, this.f152871B);
    }

    /* JADX INFO: renamed from: z1 */
    public void m172747z1(boolean z, boolean z2) {
        this.f152882I = z;
        if (m172685I0()) {
            if (z2) {
                bnl0.m105524M(m172735r0().getRealView(), z);
                bnl0.m105524M(m172737s0(), z);
                return;
            } else {
                bnl0.m105525M0(m172735r0().getRealView(), z);
                bnl0.m105525M0(m172737s0(), z);
                return;
            }
        }
        if (z2) {
            bnl0.m105524M(m172735r0().getRealView(), false);
            bnl0.m105524M(m172737s0(), false);
        } else {
            bnl0.m105525M0(m172735r0().getRealView(), false);
            bnl0.m105525M0(m172737s0(), false);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
