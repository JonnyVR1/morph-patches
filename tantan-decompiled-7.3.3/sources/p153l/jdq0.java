package p153l;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.welcome.WelcomeV2Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.splash.FakeSplashView;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.wxapi.WXEntryActivity;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import p151v.VCheckBox;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;
import p151v.VText_AutoFit;

/* JADX INFO: loaded from: classes9.dex */
public class jdq0 extends AbstractC19302p6 {

    /* JADX INFO: renamed from: A */
    public ConstraintLayout f120290A;

    /* JADX INFO: renamed from: B */
    public VText f120291B;

    /* JADX INFO: renamed from: C */
    public ConstraintLayout f120292C;

    /* JADX INFO: renamed from: D */
    public VText f120293D;

    /* JADX INFO: renamed from: E */
    public ViewStub f120294E;

    /* JADX INFO: renamed from: F */
    public VProgressBar f120295F;

    /* JADX INFO: renamed from: G */
    public VLinear f120296G;

    /* JADX INFO: renamed from: H */
    public VCheckBox f120297H;

    /* JADX INFO: renamed from: I */
    public VText f120298I;

    /* JADX INFO: renamed from: J */
    public ImageView f120299J;

    /* JADX INFO: renamed from: K */
    public ImageView f120300K;

    /* JADX INFO: renamed from: L */
    public ccq0 f120301L;

    /* JADX INFO: renamed from: M */
    public WelcomeV2Act f120302M;

    /* JADX INFO: renamed from: N */
    public long f120303N;

    /* JADX INFO: renamed from: Q */
    public boolean f120306Q;

    /* JADX INFO: renamed from: R */
    public View f120307R;

    /* JADX INFO: renamed from: T */
    public pej0 f120309T;

    /* JADX INFO: renamed from: U */
    public Runnable f120310U;

    /* JADX INFO: renamed from: V */
    public pej0 f120311V;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f120315a;

    /* JADX INFO: renamed from: b */
    public View f120316b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f120317c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f120318d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f120319e;

    /* JADX INFO: renamed from: f */
    public VImage f120320f;

    /* JADX INFO: renamed from: g */
    public VText f120321g;

    /* JADX INFO: renamed from: h */
    public ImageView f120322h;

    /* JADX INFO: renamed from: i */
    public VText f120323i;

    /* JADX INFO: renamed from: j */
    public VText_AutoFit f120324j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f120325k;

    /* JADX INFO: renamed from: l */
    public VFrame f120326l;

    /* JADX INFO: renamed from: m */
    public VText f120327m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f120328n;

    /* JADX INFO: renamed from: o */
    public ConstraintLayout f120329o;

    /* JADX INFO: renamed from: p */
    public VImage f120330p;

    /* JADX INFO: renamed from: q */
    public VText f120331q;

    /* JADX INFO: renamed from: r */
    public VText f120332r;

    /* JADX INFO: renamed from: s */
    public ConstraintLayout f120333s;

    /* JADX INFO: renamed from: t */
    public VImage f120334t;

    /* JADX INFO: renamed from: u */
    public VText f120335u;

    /* JADX INFO: renamed from: v */
    public VText f120336v;

    /* JADX INFO: renamed from: w */
    public ConstraintLayout f120337w;

    /* JADX INFO: renamed from: x */
    public VImage f120338x;

    /* JADX INFO: renamed from: y */
    public VText f120339y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f120340z;

    /* JADX INFO: renamed from: O */
    public Runnable f120304O = null;

    /* JADX INFO: renamed from: P */
    public ValueAnimator f120305P = null;

    /* JADX INFO: renamed from: S */
    public boolean f120308S = false;

    /* JADX INFO: renamed from: W */
    public Handler f120312W = new HandlerC17929b();

    /* JADX INFO: renamed from: X */
    public boolean f120313X = false;

    /* JADX INFO: renamed from: Y */
    public x20 f120314Y = new x20() { // from class: l.scq0
        @Override // p153l.x20
        public final void call() {
            this.f167276a.m144473e0();
        }
    };

    /* JADX INFO: renamed from: l.jdq0$a */
    public class RunnableC17928a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f120341a;

        public RunnableC17928a() {
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m144498c() {
            jdq0.this.getAct().postDelayed(this, 300L);
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m144499d() {
            try {
                uxw.m198548d(jdq0.this.getAct());
            } catch (Throwable th) {
                CrashHelper.m82479c(th);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f120341a == null) {
                this.f120341a = jdq0.this.getAct().dialog().m21499D(R$string.f16831O).m21545o0(jdq0.this.getAct().color(a9c0.f69032q)).m21541l0(R$string.f16789F2, new Runnable() { // from class: l.hdq0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f109033a.m144498c();
                    }
                }).m21555t0(R$string.f16921f, new Runnable() { // from class: l.idq0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f114518a.m144499d();
                    }
                }).m21495B(false).m21566z();
            }
            this.f120341a.show();
        }
    }

    /* JADX INFO: renamed from: l.jdq0$b */
    public class HandlerC17929b extends Handler {
        public HandlerC17929b() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i != 10001) {
                if (i != 10002) {
                    return;
                }
                C4499d.m21895l().m21899k("privacy_check_tip");
            } else if (hasMessages(10002)) {
                removeMessages(10002);
                sendEmptyMessageDelayed(10002, 2000L);
            } else {
                i4g0.m138492A("e_agree_privacy_policy", WXEntryActivity.PID, jyb.m147494Y("agreement_entrance", "landing_page"));
                C4499d.m21895l().m21908u(new C4496a(jdq0.this.getAct()).m21848D(jdq0.this.getAct().getResources().getString(R$string.f16799H2)).m21854J(13.0f).m21881x(-qa00.f156320g).m21872o(C4496a.f16400O, qa00.m175859d(12.0f)).m21874q(C4496a.f16400O | C4496a.f16402Q), jdq0.this.f120297H, "privacy_check_tip");
                sendEmptyMessageDelayed(10002, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: l.jdq0$c */
    public class C17930c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f120344a;

        /* JADX INFO: renamed from: l.jdq0$c$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                jdq0.this.f120303N += (long) (new Random().nextInt(30) + 90);
                jdq0 jdq0Var = jdq0.this;
                jdq0Var.f120324j.setText(String.format(jdq0Var.getAct().getResources().getString(R$string.f16987q0), jdq0.m144450V(jdq0.this.f120303N)));
                jdq0.this.m144488o0();
                l51.m152888H(jdq0.this.getAct(), this, 1000L);
            }
        }

        public C17930c(long j) {
            this.f120344a = j;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z = jdq0.this.f120306Q;
            jdq0 jdq0Var = jdq0.this;
            if (z) {
                jdq0Var.f120306Q = false;
                return;
            }
            jdq0Var.f120303N = this.f120344a;
            if (jdq0.this.f120304O == null) {
                jdq0.this.f120304O = new a();
                l51.m152888H(jdq0.this.getAct(), jdq0.this.f120304O, 1000L);
            }
        }
    }

    public jdq0(@Nullable WelcomeV2Act welcomeV2Act) {
        this.f120302M = welcomeV2Act;
    }

    /* JADX INFO: renamed from: V */
    public static String m144450V(long j) {
        String strValueOf = String.valueOf(j);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strValueOf.length(); i++) {
            if (((strValueOf.length() - i) - 1) % 3 != 0 || i == strValueOf.length() - 1) {
                sb.append(strValueOf.charAt(i));
            } else {
                sb.append(strValueOf.charAt(i));
                sb.append(Constants.SEPARATOR_COMMA);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m144451Z(View view) {
        getAct().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m144452b0() {
        this.f120301L.m109013r5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m144453d0(View view) {
        i4g0.m138520r("e_other_signin_entrance", WXEntryActivity.PID);
        if (NullChecker.m82486a(this.f120311V) && this.f120311V.isShowing()) {
            this.f120311V.dismiss();
            this.f120311V = null;
        }
        this.f120311V = C21841zn.m220550S(getAct(), mo144472e(), this.f120301L.m109005N3(), m144463W(), new x20() { // from class: l.gdq0
            @Override // p153l.x20
            public final void call() {
                this.f103732a.m144467a0();
            }
        }, new x20() { // from class: l.tcq0
            @Override // p153l.x20
            public final void call() {
                this.f173269a.m144452b0();
            }
        }, new y20() { // from class: l.ucq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178458a.m144470c0((Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m144454i0(CompoundButton compoundButton, boolean z) {
        i4g0.m138523u("e_sign_in_agreement", ((PutongAct) getAct()).pageId(), jyb.m147494Y("agreement_entrance", "landing_page"));
        if (z) {
            m144490p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m144455j0(View view) {
        if (this.f120298I.getSelectionStart() == -1 && this.f120298I.getSelectionEnd() == -1) {
            m144456q0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    private void m144456q0() {
        VCheckBox vCheckBox = this.f120297H;
        vCheckBox.setChecked(!vCheckBox.isChecked());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f120302M;
    }

    /* JADX INFO: renamed from: T */
    public View m144461T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kdq0.m149261b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ccq0 ccq0Var) {
        this.f120301L = ccq0Var;
    }

    /* JADX INFO: renamed from: W */
    public boolean m144463W() {
        return this.f120301L.m109003M3() && RemoteConfig.m80481x().m80513s("qq_login");
    }

    /* JADX INFO: renamed from: X */
    public boolean m144464X() {
        return this.f120301L.m109005N3() || m144463W();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m144465Y() {
        SVGALoader.with(this.f120302M).from("https://auto.tancdn.com/v1/raw/3b3b6a62-29e1-489f-ac59-bf4a287378a714.svga").autoPlay(true).repeatCount(1).into(this.f120318d);
    }

    @Override // p153l.AbstractC19302p6
    /* JADX INFO: renamed from: a */
    public void mo144466a() {
        if (C16074bp.m105754i() && NullChecker.m82486a(this.f120311V) && this.f120311V.isShowing()) {
            this.f120311V.dismiss();
            this.f120311V = null;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m144467a0() {
        this.f120301L.m109014s5();
    }

    @Override // p153l.AbstractC19302p6
    /* JADX INFO: renamed from: b */
    public void mo144468b(boolean z) {
        this.f120292C.setEnabled(!z);
        ConstraintLayout constraintLayout = this.f120292C;
        if (z) {
            constraintLayout.setAlpha(0.5f);
        } else {
            constraintLayout.setAlpha(1.0f);
        }
    }

    @Override // p153l.AbstractC19302p6
    /* JADX INFO: renamed from: c */
    public Runnable mo144469c(boolean z) {
        ccq0 ccq0Var = this.f120301L;
        Objects.requireNonNull(ccq0Var);
        ccq0Var.m108998F5(null, new p9q0(ccq0Var));
        if (!z) {
            return null;
        }
        getAct().hideInput(getAct().findViewById(R.id.content));
        RunnableC17928a runnableC17928a = new RunnableC17928a();
        runnableC17928a.run();
        return runnableC17928a;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m144470c0(Boolean bool) {
        if (bool.booleanValue()) {
            m144490p0();
        }
        this.f120297H.setChecked(bool.booleanValue());
    }

    @Override // p153l.AbstractC19302p6
    /* JADX INFO: renamed from: d */
    public boolean mo144471d() {
        return this.f120295F.isShown();
    }

    @Override // p153l.AbstractC19302p6
    /* JADX INFO: renamed from: e */
    public boolean mo144472e() {
        if (this.f120297H.isChecked()) {
            m144490p0();
        }
        return this.f120297H.isChecked();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m144473e0() {
        this.f120297H.setChecked(true);
        m144490p0();
        this.f120301L.m108994A5();
    }

    @Override // p153l.AbstractC19302p6
    /* JADX INFO: renamed from: f */
    public void mo144474f() {
        l51.m152887G(new Runnable() { // from class: l.cdq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f81259a.m144475f0();
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m144475f0() {
        final long jLongValue = AccountModule.f16756c.f17048j.get().longValue();
        ValueAnimator valueAnimator = this.f120305P;
        if (valueAnimator == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f120305P = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xcq0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    long j = jLongValue;
                    ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                }
            });
            this.f120305P.setInterpolator(new DecelerateInterpolator());
            this.f120305P.addListener(new C17930c(jLongValue));
            this.f120305P.setStartDelay(100L);
            this.f120305P.setDuration(150L);
        } else if (valueAnimator.isRunning()) {
            this.f120306Q = true;
            this.f120305P.cancel();
        }
        this.f120305P.start();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m144476g0(View.OnClickListener onClickListener, View view) {
        mo144495v();
        onClickListener.onClick(view);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m144477h0() {
        l51.m152890J(this.f120310U);
    }

    @Override // p153l.AbstractC19302p6
    /* JADX INFO: renamed from: i */
    public void mo144478i(final View.OnClickListener onClickListener, final View view) {
        this.f120309T = C21841zn.m220549R(getAct(), new x20() { // from class: l.ddq0
            @Override // p153l.x20
            public final void call() {
                this.f87958a.m144476g0(onClickListener, view);
            }
        }, new x20() { // from class: l.edq0
            @Override // p153l.x20
            public final void call() {
                this.f93570a.m144477h0();
            }
        });
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m144461T(layoutInflater, viewGroup);
    }

    @Override // p153l.AbstractC19302p6
    /* JADX INFO: renamed from: j */
    public void mo144479j() {
        i4g0.m138526x("e_signin_phone_button", ((PutongAct) getAct()).pageId());
    }

    @Override // p153l.AbstractC19302p6
    /* JADX INFO: renamed from: k */
    public void mo144480k() {
        bnl0.m105524M(this.f120290A, true);
        bnl0.m105524M(this.f120295F, false);
        bnl0.m105524M(this.f120329o, false);
        bnl0.m105524M(this.f120340z, true);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m144481k0(View view) {
        this.f120301L.m109013r5();
        i4g0.m138520r("e_signin_qq_button", getAct().pageId());
    }

    @Override // p153l.AbstractC19302p6
    /* JADX INFO: renamed from: l */
    public void mo144482l() {
        bnl0.m105524M(this.f120292C, true);
        bnl0.m105524M(this.f120340z, true);
        bnl0.m105509E0(this.f120292C, this.f120301L.m109006N5());
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m144483l0(View view) {
        this.f120301L.m109014s5();
        i4g0.m138520r("e_signin_wechat_button", ((PutongAct) getAct()).pageId());
    }

    @Override // p153l.AbstractC19302p6
    /* JADX INFO: renamed from: m */
    public void mo144484m() {
        bnl0.m105524M(this.f120315a, true);
        this.f120324j.setText(String.format(getAct().getResources().getString(R$string.f16987q0), m144450V(16497018449L)));
        m144488o0();
        bnl0.m105524M(this.f120333s, true);
        bnl0.m105509E0(this.f120333s, this.f120301L.m108999H3(false));
        bnl0.m105525M0(this.f120290A, false);
        bnl0.m105524M(this.f120292C, false);
        bnl0.m105524M(this.f120340z, false);
        bnl0.m105524M(this.f120295F, true);
        bnl0.m105524M(this.f120329o, false);
        boolean zM29119p = IntlCountryCodeController.m29119p();
        VCheckBox vCheckBox = this.f120297H;
        if (zM29119p) {
            bnl0.m105524M(vCheckBox, true);
        } else {
            bnl0.m105524M(vCheckBox, false);
        }
        this.f120298I.setGravity(17);
        m144485m0();
    }

    /* JADX INFO: renamed from: m0 */
    public void m144485m0() {
        String string;
        bnl0.m105524M(this.f120296G, true);
        this.f120297H.setChecked(FakeSplashView.f55528B);
        if (this.f120297H.isChecked()) {
            m144490p0();
        }
        this.f120297H.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.vcq0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f183480a.m144454i0(compoundButton, z);
            }
        });
        FakeSplashView.f55528B = false;
        bnl0.m105509E0(this.f120298I, new View.OnClickListener() { // from class: l.wcq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188493a.m144455j0(view);
            }
        });
        i4g0.m138492A("e_sign_in_agreement", ((PutongAct) getAct()).pageId(), jyb.m147494Y("agreement_entrance", "landing_page"));
        boolean zEquals = "zh".equals(Locale.getDefault().getLanguage());
        VText vText = this.f120298I;
        Act act = getAct();
        Typeface typeface = Typeface.DEFAULT_BOLD;
        if (zEquals) {
            string = getAct().getString(R$string.f16835O3, String.format(" %s ", "《" + getAct().string(R$string.f16992r0) + "》"), String.format(" %s", "《" + getAct().string(R$string.f16804I2) + "》"));
        } else {
            string = getAct().getString(R$string.f16835O3, "《" + getAct().string(R$string.f16992r0) + "》", "《" + getAct().string(R$string.f16804I2) + "》");
        }
        vText.setText(q8g0.m175769A(act, typeface, string, "《" + getAct().string(R$string.f16992r0) + "》", zwk.m221910j(), "《" + getAct().string(R$string.f16804I2) + "》", zwk.m221909i()));
        this.f120298I.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p153l.AbstractC19302p6
    /* JADX INFO: renamed from: n */
    public void mo144486n(boolean z) {
        bnl0.m105525M0(this.f120333s, !z);
        if (this.f120301L.m109005N3()) {
            boolean zM105754i = C16074bp.m105754i();
            ConstraintLayout constraintLayout = this.f120329o;
            if (zM105754i) {
                bnl0.m105525M0(constraintLayout, false);
            } else {
                bnl0.m105525M0(constraintLayout, !z);
            }
        }
        if (this.f120313X) {
            boolean zM105754i2 = C16074bp.m105754i();
            ConstraintLayout constraintLayout2 = this.f120337w;
            if (zM105754i2) {
                bnl0.m105525M0(constraintLayout2, false);
            } else {
                bnl0.m105525M0(constraintLayout2, !z);
            }
        }
        bnl0.m105524M(this.f120295F, z);
    }

    /* JADX INFO: renamed from: n0 */
    public void m144487n0() {
        if (!m144463W() || C16074bp.m105754i()) {
            return;
        }
        bnl0.m105524M(this.f120337w, true);
        bnl0.m105537U(this.f120333s, qa00.f156323j);
        bnl0.m105537U(this.f120337w, (int) (bnl0.m105588w0() * (this.f120301L.m109005N3() ? 0.1f : 0.15f)));
        bnl0.m105509E0(this.f120337w, new View.OnClickListener() { // from class: l.fdq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98492a.m144481k0(view);
            }
        });
        i4g0.m138526x("e_signin_qq_button", getAct().pageId());
        this.f120313X = true;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m144488o0() {
        int i;
        String string = this.f120324j.getText().toString();
        SpannableString spannableString = new SpannableString(string);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= string.length()) {
                i3 = 0;
                break;
            } else if (Character.isDigit(string.charAt(i3))) {
                break;
            } else {
                i3++;
            }
        }
        for (int length = string.length() - 1; length >= 0; length--) {
            if (Character.isDigit(string.charAt(length))) {
                i2 = length;
                break;
            }
        }
        if (i2 <= i3 || (i = i2 + 1) >= string.length()) {
            return;
        }
        spannableString.setSpan(new ForegroundColorSpan(-36854), i3, i, 33);
        this.f120324j.setText(spannableString);
    }

    @Override // p153l.AbstractC19302p6
    /* JADX INFO: renamed from: p */
    public void mo144489p() {
        bnl0.m105524M(this.f120333s, true);
        bnl0.m105524M(this.f120329o, false);
        bnl0.m105524M(this.f120290A, false);
        bnl0.m105524M(this.f120295F, false);
        bnl0.m105524M(this.f120292C, false);
        bnl0.m105524M(this.f120340z, false);
        bnl0.m105509E0(this.f120333s, this.f120301L.m108999H3(false));
    }

    /* JADX INFO: renamed from: p0 */
    public void m144490p0() {
        this.f120308S = true;
        l51.m152890J(this.f120310U);
    }

    @Override // p153l.AbstractC19302p6
    /* JADX INFO: renamed from: q */
    public void mo144491q(boolean z) {
        this.f120290A.setEnabled(!z);
        ConstraintLayout constraintLayout = this.f120290A;
        if (z) {
            constraintLayout.setAlpha(0.5f);
        } else {
            constraintLayout.setAlpha(1.0f);
        }
    }

    @Override // p153l.AbstractC19302p6
    /* JADX INFO: renamed from: r */
    public void mo144492r() {
        this.f120321g.setTypeface(lyh0.m156283c(3), 1);
        bnl0.m105524M(this.f120321g, false);
        if (C16074bp.m105754i()) {
            if (this.f120301L.m109005N3()) {
                bnl0.m105524M(this.f120329o, false);
                bnl0.m105524M(this.f120299J, false);
            }
            if (m144463W()) {
                bnl0.m105524M(this.f120337w, false);
                bnl0.m105524M(this.f120300K, false);
            }
            if (m144464X()) {
                i4g0.m138526x("e_other_signin_entrance", WXEntryActivity.PID);
            }
            bnl0.m105524M(this.f120321g, m144464X());
        }
        bnl0.m105524M(this.f120320f, false);
        bnl0.m105509E0(this.f120320f, new View.OnClickListener() { // from class: l.ycq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198535a.m144451Z(view);
            }
        });
        bnl0.m105509E0(this.f120321g, new View.OnClickListener() { // from class: l.zcq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203820a.m144453d0(view);
            }
        });
        this.f120323i.setAllCaps(true);
        this.f120323i.setTypeface(Typeface.DEFAULT_BOLD);
        bnl0.m105525M0(this.f120323i, true);
        bnl0.m105525M0(this.f120322h, false);
        this.f120307R = this.f120323i;
        uqb0.f180374G.m127115L0(this.f120317c, "https://auto.tancdn.com/v1/raw/bd65c5b2-6e7f-4488-9f07-4ef082a1515b11.webp");
        SVGALoader.with(this.f120302M).from("https://auto.tancdn.com/v1/raw/ea993b91-602c-476d-8727-17ec9436139f14.svga").autoPlay(true).repeatCount(1).into(this.f120319e);
        qnp0.m177261d1(this.f120319e, bnl0.m105587w(16.0f));
        this.f120318d.postDelayed(new Runnable() { // from class: l.adq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f70723a.m144465Y();
            }
        }, 2330L);
    }

    @Override // p153l.AbstractC19302p6
    /* JADX INFO: renamed from: s */
    public void mo144493s() {
        bnl0.m105509E0(this.f120290A, this.f120301L.m109004M5());
    }

    @Override // p153l.AbstractC19302p6
    /* JADX INFO: renamed from: u */
    public void mo144494u() {
        this.f120324j.setText(String.format(getAct().getResources().getString(R$string.f16987q0), m144450V(16497018449L)));
        m144488o0();
        bnl0.m105524M(this.f120333s, true);
        bnl0.m105524M(this.f120329o, this.f120301L.m109005N3() && !C16074bp.m105754i());
        bnl0.m105524M(this.f120315a, true);
        bnl0.m105548c0(this.f120325k, 0);
        bnl0.m105537U(this.f120333s, (int) (bnl0.m105588w0() * (this.f120301L.m109005N3() ? 0.1f : 0.15f)));
        bnl0.m105524M(this.f120290A, false);
        bnl0.m105524M(this.f120295F, false);
        bnl0.m105524M(this.f120292C, false);
        bnl0.m105524M(this.f120340z, false);
        bnl0.m105509E0(this.f120333s, this.f120301L.m108999H3(true));
        i4g0.m138526x("e_signin_wechat_button", ((PutongAct) getAct()).pageId());
        i4g0.m138526x("e_signin_phone_button", ((PutongAct) getAct()).pageId());
        bnl0.m105509E0(this.f120329o, new View.OnClickListener() { // from class: l.bdq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76287a.m144483l0(view);
            }
        });
        m144487n0();
    }

    @Override // p153l.AbstractC19302p6
    /* JADX INFO: renamed from: v */
    public void mo144495v() {
        this.f120297H.setChecked(true);
        m144490p0();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
