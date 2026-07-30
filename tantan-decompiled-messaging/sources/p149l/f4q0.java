package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.welcome.WelcomeV2Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.splash.FakeSplashView;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.wxapi.WXEntryActivity;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import p147v.VCheckBox;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;
import p147v.VText_AutoFit;

/* JADX INFO: loaded from: classes9.dex */
public class f4q0 extends AbstractC19863s6 {

    /* JADX INFO: renamed from: A */
    public ConstraintLayout f94864A;

    /* JADX INFO: renamed from: B */
    public VText f94865B;

    /* JADX INFO: renamed from: C */
    public ConstraintLayout f94866C;

    /* JADX INFO: renamed from: D */
    public VText f94867D;

    /* JADX INFO: renamed from: E */
    public ViewStub f94868E;

    /* JADX INFO: renamed from: F */
    public VProgressBar f94869F;

    /* JADX INFO: renamed from: G */
    public VLinear f94870G;

    /* JADX INFO: renamed from: H */
    public VCheckBox f94871H;

    /* JADX INFO: renamed from: I */
    public VText f94872I;

    /* JADX INFO: renamed from: J */
    public ImageView f94873J;

    /* JADX INFO: renamed from: K */
    public ImageView f94874K;

    /* JADX INFO: renamed from: L */
    public y2q0 f94875L;

    /* JADX INFO: renamed from: M */
    public WelcomeV2Act f94876M;

    /* JADX INFO: renamed from: N */
    public long f94877N;

    /* JADX INFO: renamed from: Q */
    public boolean f94880Q;

    /* JADX INFO: renamed from: R */
    public View f94881R;

    /* JADX INFO: renamed from: T */
    public l5j0 f94883T;

    /* JADX INFO: renamed from: U */
    public Runnable f94884U;

    /* JADX INFO: renamed from: V */
    public l5j0 f94885V;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f94889a;

    /* JADX INFO: renamed from: b */
    public View f94890b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f94891c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f94892d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f94893e;

    /* JADX INFO: renamed from: f */
    public VImage f94894f;

    /* JADX INFO: renamed from: g */
    public VText f94895g;

    /* JADX INFO: renamed from: h */
    public ImageView f94896h;

    /* JADX INFO: renamed from: i */
    public VText f94897i;

    /* JADX INFO: renamed from: j */
    public VText_AutoFit f94898j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f94899k;

    /* JADX INFO: renamed from: l */
    public VFrame f94900l;

    /* JADX INFO: renamed from: m */
    public VText f94901m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f94902n;

    /* JADX INFO: renamed from: o */
    public ConstraintLayout f94903o;

    /* JADX INFO: renamed from: p */
    public VImage f94904p;

    /* JADX INFO: renamed from: q */
    public VText f94905q;

    /* JADX INFO: renamed from: r */
    public VText f94906r;

    /* JADX INFO: renamed from: s */
    public ConstraintLayout f94907s;

    /* JADX INFO: renamed from: t */
    public VImage f94908t;

    /* JADX INFO: renamed from: u */
    public VText f94909u;

    /* JADX INFO: renamed from: v */
    public VText f94910v;

    /* JADX INFO: renamed from: w */
    public ConstraintLayout f94911w;

    /* JADX INFO: renamed from: x */
    public VImage f94912x;

    /* JADX INFO: renamed from: y */
    public VText f94913y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f94914z;

    /* JADX INFO: renamed from: O */
    public Runnable f94878O = null;

    /* JADX INFO: renamed from: P */
    public ValueAnimator f94879P = null;

    /* JADX INFO: renamed from: S */
    public boolean f94882S = false;

    /* JADX INFO: renamed from: W */
    public Handler f94886W = new HandlerC16758b();

    /* JADX INFO: renamed from: X */
    public boolean f94887X = false;

    /* JADX INFO: renamed from: Y */
    public d30 f94888Y = new d30() { // from class: l.o3q0
        @Override // p149l.d30
        public final void call() {
            this.f141703a.m119397e0();
        }
    };

    /* JADX INFO: renamed from: l.f4q0$a */
    public class RunnableC16757a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f94915a;

        public RunnableC16757a() {
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m119422c() {
            f4q0.this.getAct().postDelayed(this, 300L);
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m119423d() {
            try {
                vuw.m200138d(f4q0.this.getAct());
            } catch (Throwable th) {
                CrashHelper.m81296c(th);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f94915a == null) {
                this.f94915a = f4q0.this.getAct().dialog().m20500D(R$string.f16112O).m20546o0(f4q0.this.getAct().color(u0c0.f172896q)).m20542l0(R$string.f16070F2, new Runnable() { // from class: l.d4q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f84335a.m119422c();
                    }
                }).m20556t0(R$string.f16202f, new Runnable() { // from class: l.e4q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f89314a.m119423d();
                    }
                }).m20496B(false).m20567z();
            }
            this.f94915a.show();
        }
    }

    /* JADX INFO: renamed from: l.f4q0$b */
    public class HandlerC16758b extends Handler {
        public HandlerC16758b() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i != 10001) {
                if (i != 10002) {
                    return;
                }
                C4348d.m20896l().m20900k("privacy_check_tip");
            } else if (hasMessages(10002)) {
                removeMessages(10002);
                sendEmptyMessageDelayed(10002, 2000L);
            } else {
                zvf0.m220368A("e_agree_privacy_policy", WXEntryActivity.PID, vwb.m200311Y("agreement_entrance", "landing_page"));
                C4348d.m20896l().m20909u(new C4345a(f4q0.this.getAct()).m20849D(f4q0.this.getAct().getResources().getString(R$string.f16080H2)).m20855J(13.0f).m20882x(-t100.f167258g).m20873o(C4345a.f15681O, t100.m186890d(12.0f)).m20875q(C4345a.f15681O | C4345a.f15683Q), f4q0.this.f94871H, "privacy_check_tip");
                sendEmptyMessageDelayed(10002, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: l.f4q0$c */
    public class C16759c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f94918a;

        /* JADX INFO: renamed from: l.f4q0$c$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f4q0.this.f94877N += (long) (new Random().nextInt(30) + 90);
                f4q0 f4q0Var = f4q0.this;
                f4q0Var.f94898j.setText(String.format(f4q0Var.getAct().getResources().getString(R$string.f16268q0), f4q0.m119374V(f4q0.this.f94877N)));
                f4q0.this.m119412o0();
                e51.m114743H(f4q0.this.getAct(), this, 1000L);
            }
        }

        public C16759c(long j) {
            this.f94918a = j;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z = f4q0.this.f94880Q;
            f4q0 f4q0Var = f4q0.this;
            if (z) {
                f4q0Var.f94880Q = false;
                return;
            }
            f4q0Var.f94877N = this.f94918a;
            if (f4q0.this.f94878O == null) {
                f4q0.this.f94878O = new a();
                e51.m114743H(f4q0.this.getAct(), f4q0.this.f94878O, 1000L);
            }
        }
    }

    public f4q0(@Nullable WelcomeV2Act welcomeV2Act) {
        this.f94876M = welcomeV2Act;
    }

    /* JADX INFO: renamed from: V */
    public static String m119374V(long j) {
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
    public /* synthetic */ void m119375Z(View view) {
        getAct().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m119376b0() {
        this.f94875L.m212710r5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m119377d0(View view) {
        zvf0.m220396r("e_other_signin_entrance", WXEntryActivity.PID);
        if (NullChecker.m81303a(this.f94885V) && this.f94885V.isShowing()) {
            this.f94885V.dismiss();
            this.f94885V = null;
        }
        this.f94885V = C16891fo.m122406S(getAct(), mo119396e(), this.f94875L.m212702N3(), m119387W(), new d30() { // from class: l.c4q0
            @Override // p149l.d30
            public final void call() {
                this.f79289a.m119391a0();
            }
        }, new d30() { // from class: l.p3q0
            @Override // p149l.d30
            public final void call() {
                this.f147011a.m119376b0();
            }
        }, new e30() { // from class: l.q3q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152491a.m119394c0((Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m119378i0(CompoundButton compoundButton, boolean z) {
        zvf0.m220399u("e_sign_in_agreement", ((PutongAct) getAct()).pageId(), vwb.m200311Y("agreement_entrance", "landing_page"));
        if (z) {
            m119414p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m119379j0(View view) {
        if (this.f94872I.getSelectionStart() == -1 && this.f94872I.getSelectionEnd() == -1) {
            m119380q0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    private void m119380q0() {
        VCheckBox vCheckBox = this.f94871H;
        vCheckBox.setChecked(!vCheckBox.isChecked());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f94876M;
    }

    /* JADX INFO: renamed from: T */
    public View m119385T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g4q0.m124393b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(y2q0 y2q0Var) {
        this.f94875L = y2q0Var;
    }

    /* JADX INFO: renamed from: W */
    public boolean m119387W() {
        return this.f94875L.m212700M3() && RemoteConfig.m79298x().m79330s("qq_login");
    }

    /* JADX INFO: renamed from: X */
    public boolean m119388X() {
        return this.f94875L.m212702N3() || m119387W();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m119389Y() {
        SVGALoader.with(this.f94876M).from("https://auto.tancdn.com/v1/raw/3b3b6a62-29e1-489f-ac59-bf4a287378a714.svga").autoPlay(true).repeatCount(1).into(this.f94892d);
    }

    @Override // p149l.AbstractC19863s6
    /* JADX INFO: renamed from: a */
    public void mo119390a() {
        if (C17133gp.m127318i() && NullChecker.m81303a(this.f94885V) && this.f94885V.isShowing()) {
            this.f94885V.dismiss();
            this.f94885V = null;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m119391a0() {
        this.f94875L.m212711s5();
    }

    @Override // p149l.AbstractC19863s6
    /* JADX INFO: renamed from: b */
    public void mo119392b(boolean z) {
        this.f94866C.setEnabled(!z);
        ConstraintLayout constraintLayout = this.f94866C;
        if (z) {
            constraintLayout.setAlpha(0.5f);
        } else {
            constraintLayout.setAlpha(1.0f);
        }
    }

    @Override // p149l.AbstractC19863s6
    /* JADX INFO: renamed from: c */
    public Runnable mo119393c(boolean z) {
        y2q0 y2q0Var = this.f94875L;
        Objects.requireNonNull(y2q0Var);
        y2q0Var.m212695F5(null, new l0q0(y2q0Var));
        if (!z) {
            return null;
        }
        getAct().hideInput(getAct().findViewById(R.id.content));
        RunnableC16757a runnableC16757a = new RunnableC16757a();
        runnableC16757a.run();
        return runnableC16757a;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m119394c0(Boolean bool) {
        if (bool.booleanValue()) {
            m119414p0();
        }
        this.f94871H.setChecked(bool.booleanValue());
    }

    @Override // p149l.AbstractC19863s6
    /* JADX INFO: renamed from: d */
    public boolean mo119395d() {
        return this.f94869F.isShown();
    }

    @Override // p149l.AbstractC19863s6
    /* JADX INFO: renamed from: e */
    public boolean mo119396e() {
        if (this.f94871H.isChecked()) {
            m119414p0();
        }
        return this.f94871H.isChecked();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m119397e0() {
        this.f94871H.setChecked(true);
        m119414p0();
        this.f94875L.m212691A5();
    }

    @Override // p149l.AbstractC19863s6
    /* JADX INFO: renamed from: f */
    public void mo119398f() {
        e51.m114742G(new Runnable() { // from class: l.y3q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f195841a.m119399f0();
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m119399f0() {
        final long jLongValue = AccountModule.f16037c.f16329j.get().longValue();
        ValueAnimator valueAnimator = this.f94879P;
        if (valueAnimator == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f94879P = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.t3q0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    long j = jLongValue;
                    ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                }
            });
            this.f94879P.setInterpolator(new DecelerateInterpolator());
            this.f94879P.addListener(new C16759c(jLongValue));
            this.f94879P.setStartDelay(100L);
            this.f94879P.setDuration(150L);
        } else if (valueAnimator.isRunning()) {
            this.f94880Q = true;
            this.f94879P.cancel();
        }
        this.f94879P.start();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m119400g0(View.OnClickListener onClickListener, View view) {
        mo119419v();
        onClickListener.onClick(view);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m119401h0() {
        e51.m114745J(this.f94884U);
    }

    @Override // p149l.AbstractC19863s6
    /* JADX INFO: renamed from: i */
    public void mo119402i(final View.OnClickListener onClickListener, final View view) {
        this.f94883T = C16891fo.m122405R(getAct(), new d30() { // from class: l.z3q0
            @Override // p149l.d30
            public final void call() {
                this.f201390a.m119400g0(onClickListener, view);
            }
        }, new d30() { // from class: l.a4q0
            @Override // p149l.d30
            public final void call() {
                this.f67554a.m119401h0();
            }
        });
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m119385T(layoutInflater, viewGroup);
    }

    @Override // p149l.AbstractC19863s6
    /* JADX INFO: renamed from: j */
    public void mo119403j() {
        zvf0.m220402x("e_signin_phone_button", ((PutongAct) getAct()).pageId());
    }

    @Override // p149l.AbstractC19863s6
    /* JADX INFO: renamed from: k */
    public void mo119404k() {
        xdl0.m208344M(this.f94864A, true);
        xdl0.m208344M(this.f94869F, false);
        xdl0.m208344M(this.f94903o, false);
        xdl0.m208344M(this.f94914z, true);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m119405k0(View view) {
        this.f94875L.m212710r5();
        zvf0.m220396r("e_signin_qq_button", getAct().pageId());
    }

    @Override // p149l.AbstractC19863s6
    /* JADX INFO: renamed from: l */
    public void mo119406l() {
        xdl0.m208344M(this.f94866C, true);
        xdl0.m208344M(this.f94914z, true);
        xdl0.m208329E0(this.f94866C, this.f94875L.m212703N5());
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m119407l0(View view) {
        this.f94875L.m212711s5();
        zvf0.m220396r("e_signin_wechat_button", ((PutongAct) getAct()).pageId());
    }

    @Override // p149l.AbstractC19863s6
    /* JADX INFO: renamed from: m */
    public void mo119408m() {
        xdl0.m208344M(this.f94889a, true);
        this.f94898j.setText(String.format(getAct().getResources().getString(R$string.f16268q0), m119374V(16497018449L)));
        m119412o0();
        xdl0.m208344M(this.f94907s, true);
        xdl0.m208329E0(this.f94907s, this.f94875L.m212696H3(false));
        xdl0.m208345M0(this.f94864A, false);
        xdl0.m208344M(this.f94866C, false);
        xdl0.m208344M(this.f94914z, false);
        xdl0.m208344M(this.f94869F, true);
        xdl0.m208344M(this.f94903o, false);
        boolean zM28120p = IntlCountryCodeController.m28120p();
        VCheckBox vCheckBox = this.f94871H;
        if (zM28120p) {
            xdl0.m208344M(vCheckBox, true);
        } else {
            xdl0.m208344M(vCheckBox, false);
        }
        this.f94872I.setGravity(17);
        m119409m0();
    }

    /* JADX INFO: renamed from: m0 */
    public void m119409m0() {
        String string;
        xdl0.m208344M(this.f94870G, true);
        this.f94871H.setChecked(FakeSplashView.f54680B);
        if (this.f94871H.isChecked()) {
            m119414p0();
        }
        this.f94871H.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.r3q0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f157552a.m119378i0(compoundButton, z);
            }
        });
        FakeSplashView.f54680B = false;
        xdl0.m208329E0(this.f94872I, new View.OnClickListener() { // from class: l.s3q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162189a.m119379j0(view);
            }
        });
        zvf0.m220368A("e_sign_in_agreement", ((PutongAct) getAct()).pageId(), vwb.m200311Y("agreement_entrance", "landing_page"));
        boolean zEquals = "zh".equals(Locale.getDefault().getLanguage());
        VText vText = this.f94872I;
        Act act = getAct();
        Typeface typeface = Typeface.DEFAULT_BOLD;
        if (zEquals) {
            string = getAct().getString(R$string.f16116O3, String.format(" %s ", "《" + getAct().string(R$string.f16273r0) + "》"), String.format(" %s", "《" + getAct().string(R$string.f16085I2) + "》"));
        } else {
            string = getAct().getString(R$string.f16116O3, "《" + getAct().string(R$string.f16273r0) + "》", "《" + getAct().string(R$string.f16085I2) + "》");
        }
        vText.setText(i0g0.m133834A(act, typeface, string, "《" + getAct().string(R$string.f16273r0) + "》", juk.m143328j(), "《" + getAct().string(R$string.f16085I2) + "》", juk.m143327i()));
        this.f94872I.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p149l.AbstractC19863s6
    /* JADX INFO: renamed from: n */
    public void mo119410n(boolean z) {
        xdl0.m208345M0(this.f94907s, !z);
        if (this.f94875L.m212702N3()) {
            boolean zM127318i = C17133gp.m127318i();
            ConstraintLayout constraintLayout = this.f94903o;
            if (zM127318i) {
                xdl0.m208345M0(constraintLayout, false);
            } else {
                xdl0.m208345M0(constraintLayout, !z);
            }
        }
        if (this.f94887X) {
            boolean zM127318i2 = C17133gp.m127318i();
            ConstraintLayout constraintLayout2 = this.f94911w;
            if (zM127318i2) {
                xdl0.m208345M0(constraintLayout2, false);
            } else {
                xdl0.m208345M0(constraintLayout2, !z);
            }
        }
        xdl0.m208344M(this.f94869F, z);
    }

    /* JADX INFO: renamed from: n0 */
    public void m119411n0() {
        if (!m119387W() || C17133gp.m127318i()) {
            return;
        }
        xdl0.m208344M(this.f94911w, true);
        xdl0.m208357U(this.f94907s, t100.f167261j);
        xdl0.m208357U(this.f94911w, (int) (xdl0.m208408w0() * (this.f94875L.m212702N3() ? 0.1f : 0.15f)));
        xdl0.m208329E0(this.f94911w, new View.OnClickListener() { // from class: l.b4q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73396a.m119405k0(view);
            }
        });
        zvf0.m220402x("e_signin_qq_button", getAct().pageId());
        this.f94887X = true;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m119412o0() {
        int i;
        String string = this.f94898j.getText().toString();
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
        this.f94898j.setText(spannableString);
    }

    @Override // p149l.AbstractC19863s6
    /* JADX INFO: renamed from: p */
    public void mo119413p() {
        xdl0.m208344M(this.f94907s, true);
        xdl0.m208344M(this.f94903o, false);
        xdl0.m208344M(this.f94864A, false);
        xdl0.m208344M(this.f94869F, false);
        xdl0.m208344M(this.f94866C, false);
        xdl0.m208344M(this.f94914z, false);
        xdl0.m208329E0(this.f94907s, this.f94875L.m212696H3(false));
    }

    /* JADX INFO: renamed from: p0 */
    public void m119414p0() {
        this.f94882S = true;
        e51.m114745J(this.f94884U);
    }

    @Override // p149l.AbstractC19863s6
    /* JADX INFO: renamed from: q */
    public void mo119415q(boolean z) {
        this.f94864A.setEnabled(!z);
        ConstraintLayout constraintLayout = this.f94864A;
        if (z) {
            constraintLayout.setAlpha(0.5f);
        } else {
            constraintLayout.setAlpha(1.0f);
        }
    }

    @Override // p149l.AbstractC19863s6
    /* JADX INFO: renamed from: r */
    public void mo119416r() {
        this.f94895g.setTypeface(eqh0.m117752c(3), 1);
        xdl0.m208344M(this.f94895g, false);
        if (C17133gp.m127318i()) {
            if (this.f94875L.m212702N3()) {
                xdl0.m208344M(this.f94903o, false);
                xdl0.m208344M(this.f94873J, false);
            }
            if (m119387W()) {
                xdl0.m208344M(this.f94911w, false);
                xdl0.m208344M(this.f94874K, false);
            }
            if (m119388X()) {
                zvf0.m220402x("e_other_signin_entrance", WXEntryActivity.PID);
            }
            xdl0.m208344M(this.f94895g, m119388X());
        }
        xdl0.m208344M(this.f94894f, false);
        xdl0.m208329E0(this.f94894f, new View.OnClickListener() { // from class: l.u3q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f173645a.m119375Z(view);
            }
        });
        xdl0.m208329E0(this.f94895g, new View.OnClickListener() { // from class: l.v3q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179838a.m119377d0(view);
            }
        });
        this.f94897i.setAllCaps(true);
        this.f94897i.setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.m208345M0(this.f94897i, true);
        xdl0.m208345M0(this.f94896h, false);
        this.f94881R = this.f94897i;
        qib0.f154691G.m102331L0(this.f94891c, "https://auto.tancdn.com/v1/raw/bd65c5b2-6e7f-4488-9f07-4ef082a1515b11.webp");
        SVGALoader.with(this.f94876M).from("https://auto.tancdn.com/v1/raw/ea993b91-602c-476d-8727-17ec9436139f14.svga").autoPlay(true).repeatCount(1).into(this.f94893e);
        mep0.m154302d1(this.f94893e, xdl0.m208407w(16.0f));
        this.f94892d.postDelayed(new Runnable() { // from class: l.w3q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f184424a.m119389Y();
            }
        }, 2330L);
    }

    @Override // p149l.AbstractC19863s6
    /* JADX INFO: renamed from: s */
    public void mo119417s() {
        xdl0.m208329E0(this.f94864A, this.f94875L.m212701M5());
    }

    @Override // p149l.AbstractC19863s6
    /* JADX INFO: renamed from: u */
    public void mo119418u() {
        this.f94898j.setText(String.format(getAct().getResources().getString(R$string.f16268q0), m119374V(16497018449L)));
        m119412o0();
        xdl0.m208344M(this.f94907s, true);
        xdl0.m208344M(this.f94903o, this.f94875L.m212702N3() && !C17133gp.m127318i());
        xdl0.m208344M(this.f94889a, true);
        xdl0.m208368c0(this.f94899k, 0);
        xdl0.m208357U(this.f94907s, (int) (xdl0.m208408w0() * (this.f94875L.m212702N3() ? 0.1f : 0.15f)));
        xdl0.m208344M(this.f94864A, false);
        xdl0.m208344M(this.f94869F, false);
        xdl0.m208344M(this.f94866C, false);
        xdl0.m208344M(this.f94914z, false);
        xdl0.m208329E0(this.f94907s, this.f94875L.m212696H3(true));
        zvf0.m220402x("e_signin_wechat_button", ((PutongAct) getAct()).pageId());
        zvf0.m220402x("e_signin_phone_button", ((PutongAct) getAct()).pageId());
        xdl0.m208329E0(this.f94903o, new View.OnClickListener() { // from class: l.x3q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190915a.m119407l0(view);
            }
        });
        m119411n0();
    }

    @Override // p149l.AbstractC19863s6
    /* JADX INFO: renamed from: v */
    public void mo119419v() {
        this.f94871H.setChecked(true);
        m119414p0();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
