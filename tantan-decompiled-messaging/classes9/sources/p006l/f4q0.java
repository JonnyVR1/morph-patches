package p006l;

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
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.welcome.WelcomeV2Act;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.ui.splash.FakeSplashView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import l.d30;
import l.e30;
import l.e51;
import l.eqh0;
import l.i0g0;
import l.j760;
import l.juk;
import l.l5j0;
import l.mep0;
import l.t100;
import l.vuw;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VCheckBox;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VProgressBar;
import v.VText;
import v.VText_AutoFit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class f4q0 extends AbstractC1250s6 {

    /* JADX INFO: renamed from: A */
    public ConstraintLayout f11613A;

    /* JADX INFO: renamed from: B */
    public VText f11614B;

    /* JADX INFO: renamed from: C */
    public ConstraintLayout f11615C;

    /* JADX INFO: renamed from: D */
    public VText f11616D;

    /* JADX INFO: renamed from: E */
    public ViewStub f11617E;

    /* JADX INFO: renamed from: F */
    public VProgressBar f11618F;

    /* JADX INFO: renamed from: G */
    public VLinear f11619G;

    /* JADX INFO: renamed from: H */
    public VCheckBox f11620H;

    /* JADX INFO: renamed from: I */
    public VText f11621I;

    /* JADX INFO: renamed from: J */
    public ImageView f11622J;

    /* JADX INFO: renamed from: K */
    public ImageView f11623K;

    /* JADX INFO: renamed from: L */
    public y2q0 f11624L;

    /* JADX INFO: renamed from: M */
    public WelcomeV2Act f11625M;

    /* JADX INFO: renamed from: N */
    public long f11626N;

    /* JADX INFO: renamed from: Q */
    public boolean f11629Q;

    /* JADX INFO: renamed from: R */
    public View f11630R;

    /* JADX INFO: renamed from: T */
    public l5j0 f11632T;

    /* JADX INFO: renamed from: U */
    public Runnable f11633U;

    /* JADX INFO: renamed from: V */
    public l5j0 f11634V;

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f11638a;

    /* JADX INFO: renamed from: b */
    public View f11639b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f11640c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f11641d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f11642e;

    /* JADX INFO: renamed from: f */
    public VImage f11643f;

    /* JADX INFO: renamed from: g */
    public VText f11644g;

    /* JADX INFO: renamed from: h */
    public ImageView f11645h;

    /* JADX INFO: renamed from: i */
    public VText f11646i;

    /* JADX INFO: renamed from: j */
    public VText_AutoFit f11647j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f11648k;

    /* JADX INFO: renamed from: l */
    public VFrame f11649l;

    /* JADX INFO: renamed from: m */
    public VText f11650m;

    /* JADX INFO: renamed from: n */
    public LinearLayout f11651n;

    /* JADX INFO: renamed from: o */
    public ConstraintLayout f11652o;

    /* JADX INFO: renamed from: p */
    public VImage f11653p;

    /* JADX INFO: renamed from: q */
    public VText f11654q;

    /* JADX INFO: renamed from: r */
    public VText f11655r;

    /* JADX INFO: renamed from: s */
    public ConstraintLayout f11656s;

    /* JADX INFO: renamed from: t */
    public VImage f11657t;

    /* JADX INFO: renamed from: u */
    public VText f11658u;

    /* JADX INFO: renamed from: v */
    public VText f11659v;

    /* JADX INFO: renamed from: w */
    public ConstraintLayout f11660w;

    /* JADX INFO: renamed from: x */
    public VImage f11661x;

    /* JADX INFO: renamed from: y */
    public VText f11662y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f11663z;

    /* JADX INFO: renamed from: O */
    public Runnable f11627O = null;

    /* JADX INFO: renamed from: P */
    public ValueAnimator f11628P = null;

    /* JADX INFO: renamed from: S */
    public boolean f11631S = false;

    /* JADX INFO: renamed from: W */
    public Handler f11635W = new HandlerC0704b();

    /* JADX INFO: renamed from: X */
    public boolean f11636X = false;

    /* JADX INFO: renamed from: Y */
    public d30 f11637Y = new d30() { // from class: l.o3q0
        public final void call() {
            this.f18006a.m15057e0();
        }
    };

    /* JADX INFO: renamed from: l.f4q0$a */
    public class RunnableC0703a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f11664a;

        public RunnableC0703a() {
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m15083c() {
            f4q0.this.act().postDelayed(this, 300L);
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m15084d() {
            try {
                vuw.d(f4q0.this.act());
            } catch (Throwable th) {
                CrashHelper.c(th);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f11664a == null) {
                this.f11664a = f4q0.this.act().dialog().D(R$string.f101O).o0(f4q0.this.act().color(u0c0.f22410q)).l0(R$string.f59F2, new Runnable() { // from class: l.d4q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10014a.m15083c();
                    }
                }).t0(R$string.f191f, new Runnable() { // from class: l.e4q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10764a.m15084d();
                    }
                }).B(false).z();
            }
            this.f11664a.show();
        }
    }

    /* JADX INFO: renamed from: l.f4q0$b */
    public class HandlerC0704b extends Handler {
        public HandlerC0704b() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i != 10001) {
                if (i != 10002) {
                    return;
                }
                d.l().k("privacy_check_tip");
            } else if (hasMessages(10002)) {
                removeMessages(10002);
                sendEmptyMessageDelayed(10002, 2000L);
            } else {
                zvf0.A("e_agree_privacy_policy", "p_sign_in_type_selection_view", new j760[]{vwb.Y("agreement_entrance", "landing_page")});
                d.l().u(new a(f4q0.this.act()).D(f4q0.this.act().getResources().getString(R$string.f69H2)).J(13.0f).x(-t100.g).o(a.O, t100.d(12.0f)).q(a.O | a.Q), f4q0.this.f11620H, "privacy_check_tip");
                sendEmptyMessageDelayed(10002, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: l.f4q0$c */
    public class C0705c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f11667a;

        /* JADX INFO: renamed from: l.f4q0$c$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f4q0.this.f11626N += (long) (new Random().nextInt(30) + 90);
                f4q0 f4q0Var = f4q0.this;
                f4q0Var.f11647j.setText(String.format(f4q0Var.act().getResources().getString(R$string.f257q0), f4q0.m15033V(f4q0.this.f11626N)));
                f4q0.this.m15073o0();
                e51.H(f4q0.this.act(), this, 1000L);
            }
        }

        public C0705c(long j) {
            this.f11667a = j;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z = f4q0.this.f11629Q;
            f4q0 f4q0Var = f4q0.this;
            if (z) {
                f4q0Var.f11629Q = false;
                return;
            }
            f4q0Var.f11626N = this.f11667a;
            if (f4q0.this.f11627O == null) {
                f4q0.this.f11627O = new a();
                e51.H(f4q0.this.act(), f4q0.this.f11627O, 1000L);
            }
        }
    }

    public f4q0(@Nullable WelcomeV2Act welcomeV2Act) {
        this.f11625M = welcomeV2Act;
    }

    /* JADX INFO: renamed from: V */
    public static String m15033V(long j) {
        String strValueOf = String.valueOf(j);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strValueOf.length(); i++) {
            if (((strValueOf.length() - i) - 1) % 3 != 0 || i == strValueOf.length() - 1) {
                sb.append(strValueOf.charAt(i));
            } else {
                sb.append(strValueOf.charAt(i));
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m15034Z(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m15035b0() {
        this.f11624L.m28018r5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m15036d0(View view) {
        zvf0.r("e_other_signin_entrance", "p_sign_in_type_selection_view");
        if (NullChecker.a(this.f11634V) && this.f11634V.isShowing()) {
            this.f11634V.dismiss();
            this.f11634V = null;
        }
        this.f11634V = C0726fo.m15392S(act(), mo15056e(), this.f11624L.m28009N3(), m15047W(), new d30() { // from class: l.c4q0
            public final void call() {
                this.f9348a.m15051a0();
            }
        }, new d30() { // from class: l.p3q0
            public final void call() {
                this.f18583a.m15035b0();
            }
        }, new e30() { // from class: l.q3q0
            public final void call(Object obj) {
                this.f19561a.m15054c0((Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m15037i0(CompoundButton compoundButton, boolean z) {
        zvf0.u("e_sign_in_agreement", ((PutongAct) act()).pageId(), new j760[]{vwb.Y("agreement_entrance", "landing_page")});
        if (z) {
            m15075p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m15038j0(View view) {
        if (this.f11621I.getSelectionStart() == -1 && this.f11621I.getSelectionEnd() == -1) {
            m15039q0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    private void m15039q0() {
        VCheckBox vCheckBox = this.f11620H;
        vCheckBox.setChecked(!vCheckBox.isChecked());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m15044C0() {
        return this.f11625M;
    }

    /* JADX INFO: renamed from: T */
    public View m15045T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g4q0.m15578b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void m15063i1(y2q0 y2q0Var) {
        this.f11624L = y2q0Var;
    }

    /* JADX INFO: renamed from: W */
    public boolean m15047W() {
        return this.f11624L.m28007M3() && RemoteConfig.x().s("qq_login");
    }

    /* JADX INFO: renamed from: X */
    public boolean m15048X() {
        return this.f11624L.m28009N3() || m15047W();
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m15049Y() {
        SVGALoader.with(this.f11625M).from("https://auto.tancdn.com/v1/raw/3b3b6a62-29e1-489f-ac59-bf4a287378a714.svga").autoPlay(true).repeatCount(1).into(this.f11641d);
    }

    @Override // p006l.AbstractC1250s6
    /* JADX INFO: renamed from: a */
    public void mo15050a() {
        if (C0775gp.m15902i() && NullChecker.a(this.f11634V) && this.f11634V.isShowing()) {
            this.f11634V.dismiss();
            this.f11634V = null;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m15051a0() {
        this.f11624L.m28019s5();
    }

    @Override // p006l.AbstractC1250s6
    /* JADX INFO: renamed from: b */
    public void mo15052b(boolean z) {
        this.f11615C.setEnabled(!z);
        ConstraintLayout constraintLayout = this.f11615C;
        if (z) {
            constraintLayout.setAlpha(0.5f);
        } else {
            constraintLayout.setAlpha(1.0f);
        }
    }

    @Override // p006l.AbstractC1250s6
    /* JADX INFO: renamed from: c */
    public Runnable mo15053c(boolean z) {
        y2q0 y2q0Var = this.f11624L;
        Objects.requireNonNull(y2q0Var);
        y2q0Var.m28002F5(null, new l0q0(y2q0Var));
        if (!z) {
            return null;
        }
        act().hideInput(act().findViewById(R.id.content));
        RunnableC0703a runnableC0703a = new RunnableC0703a();
        runnableC0703a.run();
        return runnableC0703a;
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m15054c0(Boolean bool) {
        if (bool.booleanValue()) {
            m15075p0();
        }
        this.f11620H.setChecked(bool.booleanValue());
    }

    @Override // p006l.AbstractC1250s6
    /* JADX INFO: renamed from: d */
    public boolean mo15055d() {
        return this.f11618F.isShown();
    }

    @Override // p006l.AbstractC1250s6
    /* JADX INFO: renamed from: e */
    public boolean mo15056e() {
        if (this.f11620H.isChecked()) {
            m15075p0();
        }
        return this.f11620H.isChecked();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m15057e0() {
        this.f11620H.setChecked(true);
        m15075p0();
        this.f11624L.m27998A5();
    }

    @Override // p006l.AbstractC1250s6
    /* JADX INFO: renamed from: f */
    public void mo15058f() {
        e51.G(new Runnable() { // from class: l.y3q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f28000a.m15059f0();
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m15059f0() {
        final long jLongValue = ((Long) AccountModule.f26c.f318j.get()).longValue();
        ValueAnimator valueAnimator = this.f11628P;
        if (valueAnimator == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f11628P = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.t3q0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    long j = jLongValue;
                    ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                }
            });
            this.f11628P.setInterpolator(new DecelerateInterpolator());
            this.f11628P.addListener(new C0705c(jLongValue));
            this.f11628P.setStartDelay(100L);
            this.f11628P.setDuration(150L);
        } else if (valueAnimator.isRunning()) {
            this.f11629Q = true;
            this.f11628P.cancel();
        }
        this.f11628P.start();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m15060g0(View.OnClickListener onClickListener, View view) {
        mo15080v();
        onClickListener.onClick(view);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m15061h0() {
        e51.J(this.f11633U);
    }

    @Override // p006l.AbstractC1250s6
    /* JADX INFO: renamed from: i */
    public void mo15062i(final View.OnClickListener onClickListener, final View view) {
        this.f11632T = C0726fo.m15391R(act(), new d30() { // from class: l.z3q0
            public final void call() {
                this.f28607a.m15060g0(onClickListener, view);
            }
        }, new d30() { // from class: l.a4q0
            public final void call() {
                this.f8103a.m15061h0();
            }
        });
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m15045T(layoutInflater, viewGroup);
    }

    @Override // p006l.AbstractC1250s6
    /* JADX INFO: renamed from: j */
    public void mo15064j() {
        zvf0.x("e_signin_phone_button", ((PutongAct) act()).pageId());
    }

    @Override // p006l.AbstractC1250s6
    /* JADX INFO: renamed from: k */
    public void mo15065k() {
        xdl0.M(this.f11613A, true);
        xdl0.M(this.f11618F, false);
        xdl0.M(this.f11652o, false);
        xdl0.M(this.f11663z, true);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m15066k0(View view) {
        this.f11624L.m28018r5();
        zvf0.r("e_signin_qq_button", act().pageId());
    }

    @Override // p006l.AbstractC1250s6
    /* JADX INFO: renamed from: l */
    public void mo15067l() {
        xdl0.M(this.f11615C, true);
        xdl0.M(this.f11663z, true);
        xdl0.E0(this.f11615C, this.f11624L.m28010N5());
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m15068l0(View view) {
        this.f11624L.m28019s5();
        zvf0.r("e_signin_wechat_button", ((PutongAct) act()).pageId());
    }

    @Override // p006l.AbstractC1250s6
    /* JADX INFO: renamed from: m */
    public void mo15069m() {
        xdl0.M(this.f11638a, true);
        this.f11647j.setText(String.format(act().getResources().getString(R$string.f257q0), m15033V(16497018449L)));
        m15073o0();
        xdl0.M(this.f11656s, true);
        xdl0.E0(this.f11656s, this.f11624L.m28003H3(false));
        xdl0.M0(this.f11613A, false);
        xdl0.M(this.f11615C, false);
        xdl0.M(this.f11663z, false);
        xdl0.M(this.f11618F, true);
        xdl0.M(this.f11652o, false);
        boolean zM15p = IntlCountryCodeController.m15p();
        VCheckBox vCheckBox = this.f11620H;
        if (zM15p) {
            xdl0.M(vCheckBox, true);
        } else {
            xdl0.M(vCheckBox, false);
        }
        this.f11621I.setGravity(17);
        m15070m0();
    }

    /* JADX INFO: renamed from: m0 */
    public void m15070m0() {
        String string;
        xdl0.M(this.f11619G, true);
        this.f11620H.setChecked(FakeSplashView.B);
        if (this.f11620H.isChecked()) {
            m15075p0();
        }
        this.f11620H.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.r3q0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f20284a.m15037i0(compoundButton, z);
            }
        });
        FakeSplashView.B = false;
        xdl0.E0(this.f11621I, new View.OnClickListener() { // from class: l.s3q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21005a.m15038j0(view);
            }
        });
        zvf0.A("e_sign_in_agreement", ((PutongAct) act()).pageId(), new j760[]{vwb.Y("agreement_entrance", "landing_page")});
        boolean zEquals = "zh".equals(Locale.getDefault().getLanguage());
        VText vText = this.f11621I;
        Act act = act();
        Typeface typeface = Typeface.DEFAULT_BOLD;
        if (zEquals) {
            string = act().getString(R$string.f105O3, String.format(" %s ", "《" + act().string(R$string.f262r0) + "》"), String.format(" %s", "《" + act().string(R$string.f74I2) + "》"));
        } else {
            string = act().getString(R$string.f105O3, "《" + act().string(R$string.f262r0) + "》", "《" + act().string(R$string.f74I2) + "》");
        }
        vText.setText(i0g0.A(act, typeface, string, new String[]{"《" + act().string(R$string.f262r0) + "》", juk.j(), "《" + act().string(R$string.f74I2) + "》", juk.i()}));
        this.f11621I.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p006l.AbstractC1250s6
    /* JADX INFO: renamed from: n */
    public void mo15071n(boolean z) {
        xdl0.M0(this.f11656s, !z);
        if (this.f11624L.m28009N3()) {
            boolean zM15902i = C0775gp.m15902i();
            ConstraintLayout constraintLayout = this.f11652o;
            if (zM15902i) {
                xdl0.M0(constraintLayout, false);
            } else {
                xdl0.M0(constraintLayout, !z);
            }
        }
        if (this.f11636X) {
            boolean zM15902i2 = C0775gp.m15902i();
            ConstraintLayout constraintLayout2 = this.f11660w;
            if (zM15902i2) {
                xdl0.M0(constraintLayout2, false);
            } else {
                xdl0.M0(constraintLayout2, !z);
            }
        }
        xdl0.M(this.f11618F, z);
    }

    /* JADX INFO: renamed from: n0 */
    public void m15072n0() {
        if (!m15047W() || C0775gp.m15902i()) {
            return;
        }
        xdl0.M(this.f11660w, true);
        xdl0.U(this.f11656s, t100.j);
        xdl0.U(this.f11660w, (int) (xdl0.w0() * (this.f11624L.m28009N3() ? 0.1f : 0.15f)));
        xdl0.E0(this.f11660w, new View.OnClickListener() { // from class: l.b4q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8728a.m15066k0(view);
            }
        });
        zvf0.x("e_signin_qq_button", act().pageId());
        this.f11636X = true;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m15073o0() {
        int i;
        String string = this.f11647j.getText().toString();
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
        this.f11647j.setText(spannableString);
    }

    @Override // p006l.AbstractC1250s6
    /* JADX INFO: renamed from: p */
    public void mo15074p() {
        xdl0.M(this.f11656s, true);
        xdl0.M(this.f11652o, false);
        xdl0.M(this.f11613A, false);
        xdl0.M(this.f11618F, false);
        xdl0.M(this.f11615C, false);
        xdl0.M(this.f11663z, false);
        xdl0.E0(this.f11656s, this.f11624L.m28003H3(false));
    }

    /* JADX INFO: renamed from: p0 */
    public void m15075p0() {
        this.f11631S = true;
        e51.J(this.f11633U);
    }

    @Override // p006l.AbstractC1250s6
    /* JADX INFO: renamed from: q */
    public void mo15076q(boolean z) {
        this.f11613A.setEnabled(!z);
        ConstraintLayout constraintLayout = this.f11613A;
        if (z) {
            constraintLayout.setAlpha(0.5f);
        } else {
            constraintLayout.setAlpha(1.0f);
        }
    }

    @Override // p006l.AbstractC1250s6
    /* JADX INFO: renamed from: r */
    public void mo15077r() {
        this.f11644g.setTypeface(eqh0.c(3), 1);
        xdl0.M(this.f11644g, false);
        if (C0775gp.m15902i()) {
            if (this.f11624L.m28009N3()) {
                xdl0.M(this.f11652o, false);
                xdl0.M(this.f11622J, false);
            }
            if (m15047W()) {
                xdl0.M(this.f11660w, false);
                xdl0.M(this.f11623K, false);
            }
            if (m15048X()) {
                zvf0.x("e_other_signin_entrance", "p_sign_in_type_selection_view");
            }
            xdl0.M(this.f11644g, m15048X());
        }
        xdl0.M(this.f11643f, false);
        xdl0.E0(this.f11643f, new View.OnClickListener() { // from class: l.u3q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22456a.m15034Z(view);
            }
        });
        xdl0.E0(this.f11644g, new View.OnClickListener() { // from class: l.v3q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24115a.m15036d0(view);
            }
        });
        this.f11646i.setAllCaps(true);
        this.f11646i.setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.M0(this.f11646i, true);
        xdl0.M0(this.f11645h, false);
        this.f11630R = this.f11646i;
        qib0.f19782G.m12744L0(this.f11640c, "https://auto.tancdn.com/v1/raw/bd65c5b2-6e7f-4488-9f07-4ef082a1515b11.webp");
        SVGALoader.with(this.f11625M).from("https://auto.tancdn.com/v1/raw/ea993b91-602c-476d-8727-17ec9436139f14.svga").autoPlay(true).repeatCount(1).into(this.f11642e);
        mep0.d1(this.f11642e, xdl0.w(16.0f));
        this.f11641d.postDelayed(new Runnable() { // from class: l.w3q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f24913a.m15049Y();
            }
        }, 2330L);
    }

    @Override // p006l.AbstractC1250s6
    /* JADX INFO: renamed from: s */
    public void mo15078s() {
        xdl0.E0(this.f11613A, this.f11624L.m28008M5());
    }

    @Override // p006l.AbstractC1250s6
    /* JADX INFO: renamed from: u */
    public void mo15079u() {
        this.f11647j.setText(String.format(act().getResources().getString(R$string.f257q0), m15033V(16497018449L)));
        m15073o0();
        xdl0.M(this.f11656s, true);
        xdl0.M(this.f11652o, this.f11624L.m28009N3() && !C0775gp.m15902i());
        xdl0.M(this.f11638a, true);
        xdl0.c0(this.f11648k, 0);
        xdl0.U(this.f11656s, (int) (xdl0.w0() * (this.f11624L.m28009N3() ? 0.1f : 0.15f)));
        xdl0.M(this.f11613A, false);
        xdl0.M(this.f11618F, false);
        xdl0.M(this.f11615C, false);
        xdl0.M(this.f11663z, false);
        xdl0.E0(this.f11656s, this.f11624L.m28003H3(true));
        zvf0.x("e_signin_wechat_button", ((PutongAct) act()).pageId());
        zvf0.x("e_signin_phone_button", ((PutongAct) act()).pageId());
        xdl0.E0(this.f11652o, new View.OnClickListener() { // from class: l.x3q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27339a.m15068l0(view);
            }
        });
        m15072n0();
    }

    @Override // p006l.AbstractC1250s6
    /* JADX INFO: renamed from: v */
    public void mo15080v() {
        this.f11620H.setChecked(true);
        m15075p0();
    }

    public void destroy() {
    }
}
