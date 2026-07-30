package p006l;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.welcome.VText_Medium;
import com.p000p1.mobile.putong.account.p002ui.welcome.WelcomeAct;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
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
import l.bt0;
import l.d30;
import l.e30;
import l.e51;
import l.eqh0;
import l.i0g0;
import l.j760;
import l.juk;
import l.l5j0;
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
public class bwp0 extends AbstractC1211r6 {

    /* JADX INFO: renamed from: A */
    public ConstraintLayout f9140A;

    /* JADX INFO: renamed from: B */
    public VText_Medium f9141B;

    /* JADX INFO: renamed from: C */
    public ConstraintLayout f9142C;

    /* JADX INFO: renamed from: D */
    public VText_Medium f9143D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f9144E;

    /* JADX INFO: renamed from: F */
    public VText_Medium f9145F;

    /* JADX INFO: renamed from: G */
    public VText_Medium f9146G;

    /* JADX INFO: renamed from: H */
    public ViewStub f9147H;

    /* JADX INFO: renamed from: I */
    public VProgressBar f9148I;

    /* JADX INFO: renamed from: J */
    public VLinear f9149J;

    /* JADX INFO: renamed from: K */
    public VCheckBox f9150K;

    /* JADX INFO: renamed from: L */
    public VText f9151L;

    /* JADX INFO: renamed from: M */
    public rup0 f9152M;

    /* JADX INFO: renamed from: N */
    public WelcomeAct f9153N;

    /* JADX INFO: renamed from: O */
    public long f9154O;

    /* JADX INFO: renamed from: R */
    public boolean f9157R;

    /* JADX INFO: renamed from: S */
    public View f9158S;

    /* JADX INFO: renamed from: U */
    public l5j0 f9160U;

    /* JADX INFO: renamed from: V */
    public Runnable f9161V;

    /* JADX INFO: renamed from: W */
    public l5j0 f9162W;

    /* JADX INFO: renamed from: a */
    public ImageView f9166a;

    /* JADX INFO: renamed from: b */
    public ImageView f9167b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f9168c;

    /* JADX INFO: renamed from: d */
    public View f9169d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f9170e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f9171f;

    /* JADX INFO: renamed from: g */
    public VImage f9172g;

    /* JADX INFO: renamed from: h */
    public VText f9173h;

    /* JADX INFO: renamed from: i */
    public ImageView f9174i;

    /* JADX INFO: renamed from: j */
    public VText f9175j;

    /* JADX INFO: renamed from: k */
    public VText_AutoFit f9176k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f9177l;

    /* JADX INFO: renamed from: m */
    public VFrame f9178m;

    /* JADX INFO: renamed from: n */
    public VText f9179n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f9180o;

    /* JADX INFO: renamed from: p */
    public ConstraintLayout f9181p;

    /* JADX INFO: renamed from: q */
    public VText_Medium f9182q;

    /* JADX INFO: renamed from: r */
    public VText f9183r;

    /* JADX INFO: renamed from: s */
    public ConstraintLayout f9184s;

    /* JADX INFO: renamed from: t */
    public VText_Medium f9185t;

    /* JADX INFO: renamed from: u */
    public VText f9186u;

    /* JADX INFO: renamed from: v */
    public ConstraintLayout f9187v;

    /* JADX INFO: renamed from: w */
    public VText_Medium f9188w;

    /* JADX INFO: renamed from: x */
    public ConstraintLayout f9189x;

    /* JADX INFO: renamed from: y */
    public VText_Medium f9190y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f9191z;

    /* JADX INFO: renamed from: P */
    public Runnable f9155P = null;

    /* JADX INFO: renamed from: Q */
    public ValueAnimator f9156Q = null;

    /* JADX INFO: renamed from: T */
    public boolean f9159T = false;

    /* JADX INFO: renamed from: X */
    public Handler f9163X = new HandlerC0580b();

    /* JADX INFO: renamed from: Y */
    public boolean f9164Y = false;

    /* JADX INFO: renamed from: Z */
    public d30 f9165Z = new d30() { // from class: l.hvp0
        public final void call() {
            this.f14104a.m12984h0();
        }
    };

    /* JADX INFO: renamed from: l.bwp0$a */
    public class RunnableC0579a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f9192a;

        public RunnableC0579a() {
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m13013c() {
            bwp0.this.act().postDelayed(this, 300L);
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m13014d() {
            try {
                vuw.d(bwp0.this.act());
            } catch (Throwable th) {
                CrashHelper.c(th);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9192a == null) {
                this.f9192a = bwp0.this.act().dialog().D(R$string.f101O).o0(bwp0.this.act().color(u0c0.f22410q)).l0(R$string.f59F2, new Runnable() { // from class: l.zvp0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f29004a.m13013c();
                    }
                }).t0(R$string.f191f, new Runnable() { // from class: l.awp0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8577a.m13014d();
                    }
                }).B(false).z();
            }
            this.f9192a.show();
        }
    }

    /* JADX INFO: renamed from: l.bwp0$b */
    public class HandlerC0580b extends Handler {
        public HandlerC0580b() {
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
                d.l().u(new a(bwp0.this.act()).D(bwp0.this.act().getResources().getString(R$string.f69H2)).J(13.0f).x(-t100.g).o(a.O, t100.d(12.0f)).q(a.O | a.Q), bwp0.this.f9150K, "privacy_check_tip");
                sendEmptyMessageDelayed(10002, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: l.bwp0$c */
    public class C0581c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f9195a;

        /* JADX INFO: renamed from: l.bwp0$c$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                bwp0.this.f9154O += (long) (new Random().nextInt(30) + 90);
                bwp0 bwp0Var = bwp0.this;
                bwp0Var.f9176k.setText(String.format(bwp0Var.act().getResources().getString(R$string.f257q0), bwp0.m12958W(bwp0.this.f9154O)));
                e51.H(bwp0.this.act(), this, 1000L);
            }
        }

        public C0581c(long j) {
            this.f9195a = j;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z = bwp0.this.f9157R;
            bwp0 bwp0Var = bwp0.this;
            if (z) {
                bwp0Var.f9157R = false;
                return;
            }
            bwp0Var.f9154O = this.f9195a;
            if (bwp0.this.f9155P == null) {
                bwp0.this.f9155P = new a();
                e51.H(bwp0.this.act(), bwp0.this.f9155P, 1000L);
            }
        }
    }

    public bwp0(@Nullable WelcomeAct welcomeAct) {
        this.f9153N = welcomeAct;
    }

    /* JADX INFO: renamed from: W */
    public static String m12958W(long j) {
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
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m12959a0(View view) {
        zvf0.r("e_other_signin_entrance", "p_sign_in_type_selection_view");
        if (NullChecker.a(this.f9162W) && this.f9162W.isShowing()) {
            this.f9162W.dismiss();
            this.f9162W = null;
        }
        this.f9162W = C1444xm.m27324l0(act(), mo12981e(), this.f9152M.m23179S3(), m12974X(), new d30() { // from class: l.yvp0
            public final void call() {
                this.f28426a.m12963e0();
            }
        }, new d30() { // from class: l.ivp0
            public final void call() {
                this.f14845a.m12964f0();
            }
        }, new e30() { // from class: l.jvp0
            public final void call(Object obj) {
                this.f15455a.m12983g0((Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m12960b0(View view) {
        m12973V(view, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m12961c0(View view) {
        m12973V(view, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m12962d0(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m12963e0() {
        this.f9152M.m23254z5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m12964f0() {
        this.f9152M.m23252y5();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12970C0() {
        return this.f9153N;
    }

    /* JADX INFO: renamed from: T */
    public View m12971T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cwp0.m13683b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void m12987i1(rup0 rup0Var) {
        this.f9152M = rup0Var;
    }

    /* JADX INFO: renamed from: V */
    public final void m12973V(final View view, boolean z) {
        this.f9152M.f20776k = z;
        if (z) {
            zvf0.r("e_intl_new_here", act().pageId());
            for (int i = 0; i < this.f9180o.getChildCount(); i++) {
                View childAt = this.f9180o.getChildAt(i);
                xdl0.M(childAt, childAt.getId() == q4c0.f19600d0 || childAt.getId() == q4c0.f19621q);
            }
            this.f9185t.setText(act().getString(R$string.f200g2));
        } else {
            zvf0.r("e_intl_have_been_here_before", act().pageId());
        }
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = this.f9144E;
        Property property = View.TRANSLATION_Y;
        Animator animatorN = bt0.n(linearLayout, property, new float[]{0.0f, t100.t});
        LinearLayout linearLayout2 = this.f9144E;
        Property property2 = View.ALPHA;
        animatorSet.playTogether(animatorN, bt0.n(linearLayout2, property2, new float[]{1.0f, 0.0f}));
        animatorSet.setDuration(250L);
        bt0.v(animatorSet, new Runnable() { // from class: l.mvp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17315a.m13007t0();
            }
        });
        bt0.f(animatorSet, new Runnable() { // from class: l.nvp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17895a.m12976Z(view);
            }
        });
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(bt0.n(this.f9180o, property, new float[]{t100.F, 0.0f}), bt0.n(this.f9180o, property2, new float[]{0.0f, 1.0f}));
        animatorSet2.setDuration(250L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        animatorSet3.start();
    }

    /* JADX INFO: renamed from: X */
    public boolean m12974X() {
        return this.f9152M.m23176R3() && RemoteConfig.x().s("qq_login");
    }

    /* JADX INFO: renamed from: Y */
    public boolean m12975Y() {
        return this.f9152M.m23179S3() || m12974X();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m12976Z(View view) {
        xdl0.M(view, false);
        xdl0.M(this.f9144E, false);
    }

    @Override // p006l.AbstractC1211r6
    /* JADX INFO: renamed from: a */
    public void mo12977a() {
        if (C0775gp.m15902i() && NullChecker.a(this.f9162W) && this.f9162W.isShowing()) {
            this.f9162W.dismiss();
            this.f9162W = null;
        }
    }

    @Override // p006l.AbstractC1211r6
    /* JADX INFO: renamed from: b */
    public void mo12978b(boolean z) {
        this.f9142C.setEnabled(!z);
        ConstraintLayout constraintLayout = this.f9142C;
        if (z) {
            constraintLayout.setAlpha(0.5f);
        } else {
            constraintLayout.setAlpha(1.0f);
        }
    }

    @Override // p006l.AbstractC1211r6
    /* JADX INFO: renamed from: c */
    public Runnable mo12979c(boolean z) {
        rup0 rup0Var = this.f9152M;
        Objects.requireNonNull(rup0Var);
        rup0Var.m23167M5(null, new asp0(rup0Var));
        if (!z) {
            return null;
        }
        act().hideInput(act().findViewById(R.id.content));
        RunnableC0579a runnableC0579a = new RunnableC0579a();
        runnableC0579a.run();
        return runnableC0579a;
    }

    @Override // p006l.AbstractC1211r6
    /* JADX INFO: renamed from: d */
    public boolean mo12980d() {
        return this.f9148I.isShown();
    }

    @Override // p006l.AbstractC1211r6
    /* JADX INFO: renamed from: e */
    public boolean mo12981e() {
        if (this.f9150K.isChecked()) {
            m13009u0();
        }
        return this.f9150K.isChecked();
    }

    @Override // p006l.AbstractC1211r6
    /* JADX INFO: renamed from: f */
    public void mo12982f() {
        e51.G(new Runnable() { // from class: l.rvp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f20821a.m12989j0();
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m12983g0(Boolean bool) {
        if (bool.booleanValue()) {
            m13009u0();
        }
        this.f9150K.setChecked(bool.booleanValue());
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m12984h0() {
        this.f9150K.setChecked(true);
        m13009u0();
        this.f9152M.m23156H5();
    }

    @Override // p006l.AbstractC1211r6
    /* JADX INFO: renamed from: i */
    public void mo12985i(final View.OnClickListener onClickListener, final View view) {
        this.f9160U = C1444xm.m27322k0(act(), new d30() { // from class: l.ovp0
            public final void call() {
                this.f18410a.m12991k0(onClickListener, view);
            }
        }, new d30() { // from class: l.pvp0
            public final void call() {
                this.f19385a.m12993l0();
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m12986i0(long j, ValueAnimator valueAnimator) {
        this.f9176k.setText(String.format(act().getResources().getString(R$string.f257q0), m12958W((((j - 16497018449L) * ((long) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0E7f))) / 10000000) + 16497018449L)));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m12971T(layoutInflater, viewGroup);
    }

    @Override // p006l.AbstractC1211r6
    /* JADX INFO: renamed from: j */
    public void mo12988j() {
        xdl0.M(this.f9140A, true);
        xdl0.M(this.f9148I, false);
        xdl0.M(this.f9181p, false);
        xdl0.M(this.f9191z, true);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m12989j0() {
        final long jLongValue = ((Long) AccountModule.f26c.f318j.get()).longValue();
        ValueAnimator valueAnimator = this.f9156Q;
        if (valueAnimator == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f9156Q = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xvp0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f27743a.m12986i0(jLongValue, valueAnimator2);
                }
            });
            this.f9156Q.setInterpolator(new DecelerateInterpolator());
            this.f9156Q.addListener(new C0581c(jLongValue));
            this.f9156Q.setStartDelay(300L);
            this.f9156Q.setDuration(1500L);
        } else if (valueAnimator.isRunning()) {
            this.f9157R = true;
            this.f9156Q.cancel();
        }
        this.f9156Q.start();
    }

    @Override // p006l.AbstractC1211r6
    /* JADX INFO: renamed from: k */
    public void mo12990k() {
        xdl0.M(this.f9142C, true);
        xdl0.M(this.f9191z, true);
        xdl0.E0(this.f9142C, this.f9152M.m23190V5());
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m12991k0(View.OnClickListener onClickListener, View view) {
        mo13008u();
        onClickListener.onClick(view);
    }

    @Override // p006l.AbstractC1211r6
    /* JADX INFO: renamed from: l */
    public void mo12992l() {
        xdl0.M(this.f9168c, true);
        VText_AutoFit vText_AutoFit = this.f9176k;
        vText_AutoFit.setTypeface(vText_AutoFit.getTypeface(), 1);
        this.f9176k.setText(String.format(act().getResources().getString(R$string.f257q0), m12958W(16497018449L)));
        xdl0.M(this.f9184s, true);
        xdl0.E0(this.f9184s, this.f9152M.m23168N3(false));
        xdl0.M0(this.f9140A, false);
        xdl0.M(this.f9142C, false);
        xdl0.M(this.f9191z, false);
        xdl0.M(this.f9148I, false);
        xdl0.M(this.f9181p, false);
        xdl0.M(this.f9189x, false);
        xdl0.M(this.f9187v, true);
        xdl0.E0(this.f9187v, this.f9152M.m23160J3());
        boolean zM15p = IntlCountryCodeController.m15p();
        VCheckBox vCheckBox = this.f9150K;
        if (zM15p) {
            xdl0.M(vCheckBox, true);
        } else {
            xdl0.M(vCheckBox, false);
        }
        this.f9151L.setGravity(17);
        m13004r0();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m12993l0() {
        e51.J(this.f9161V);
    }

    @Override // p006l.AbstractC1211r6
    /* JADX INFO: renamed from: m */
    public void mo12994m(boolean z) {
        xdl0.M0(this.f9184s, !z);
        if (this.f9152M.m23179S3()) {
            boolean zM15902i = C0775gp.m15902i();
            ConstraintLayout constraintLayout = this.f9181p;
            if (zM15902i) {
                xdl0.M0(constraintLayout, false);
            } else {
                xdl0.M0(constraintLayout, !z);
            }
        }
        if (this.f9164Y) {
            boolean zM15902i2 = C0775gp.m15902i();
            ConstraintLayout constraintLayout2 = this.f9189x;
            if (zM15902i2) {
                xdl0.M0(constraintLayout2, false);
            } else {
                xdl0.M0(constraintLayout2, !z);
            }
        }
        xdl0.M(this.f9148I, z);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m12995m0(CompoundButton compoundButton, boolean z) {
        zvf0.u("e_sign_in_agreement", ((PutongAct) act()).pageId(), new j760[]{vwb.Y("agreement_entrance", "landing_page")});
        if (z) {
            m13009u0();
        }
    }

    @Override // p006l.AbstractC1211r6
    /* JADX INFO: renamed from: n */
    public void mo12996n() {
        xdl0.M(this.f9184s, true);
        xdl0.M(this.f9181p, false);
        xdl0.M(this.f9140A, false);
        xdl0.M(this.f9148I, false);
        xdl0.M(this.f9142C, false);
        xdl0.M(this.f9191z, false);
        xdl0.E0(this.f9184s, this.f9152M.m23168N3(false));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m12997n0(View view) {
        if (this.f9151L.getSelectionStart() == -1 && this.f9151L.getSelectionEnd() == -1) {
            m13010v0();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m12998o0(View view) {
        this.f9152M.m23252y5();
        zvf0.r("e_signin_qq_button", act().pageId());
    }

    @Override // p006l.AbstractC1211r6
    /* JADX INFO: renamed from: p */
    public void mo12999p(boolean z) {
        this.f9140A.setEnabled(!z);
        ConstraintLayout constraintLayout = this.f9140A;
        if (z) {
            constraintLayout.setAlpha(0.5f);
        } else {
            constraintLayout.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m13000p0(View view) {
        this.f9152M.m23254z5();
        zvf0.r("e_signin_wechat_button", ((PutongAct) act()).pageId());
    }

    @Override // p006l.AbstractC1211r6
    /* JADX INFO: renamed from: q */
    public void mo13001q() {
        xdl0.E0(this.f9140A, this.f9152M.m23187U5());
    }

    /* JADX INFO: renamed from: q0 */
    public void m13002q0() {
        zvf0.x("e_signin_phone_button", ((PutongAct) act()).pageId());
    }

    @Override // p006l.AbstractC1211r6
    /* JADX INFO: renamed from: r */
    public void mo13003r() {
        this.f9173h.setTypeface(eqh0.c(3), 1);
        xdl0.M(this.f9173h, false);
        if (C0775gp.m15902i()) {
            if (this.f9152M.m23179S3()) {
                xdl0.M(this.f9181p, false);
                xdl0.M(this.f9166a, false);
            }
            if (m12974X()) {
                xdl0.M(this.f9189x, false);
                xdl0.M(this.f9167b, false);
            }
            if (m12975Y()) {
                zvf0.x("e_other_signin_entrance", "p_sign_in_type_selection_view");
            }
            xdl0.M(this.f9173h, m12975Y());
        }
        xdl0.M(this.f9172g, false);
        xdl0.E0(this.f9172g, new View.OnClickListener() { // from class: l.svp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21694a.m12962d0(view);
            }
        });
        xdl0.E0(this.f9173h, new View.OnClickListener() { // from class: l.tvp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22301a.m12959a0(view);
            }
        });
        xdl0.M0(this.f9175j, true);
        xdl0.M0(this.f9174i, false);
        this.f9158S = this.f9175j;
        try {
            boolean zEquals = TextUtils.equals(Locale.getDefault().getLanguage(), "en");
            VText vText = this.f9175j;
            if (zEquals) {
                vText.setText(vText.getText().toString().toLowerCase());
                this.f9175j.setTextSize(41.0f);
                this.f9175j.setTypeface(Typeface.createFromAsset(act().getAssets(), "font/nexa_xbold.ttf"));
            } else {
                vText.setTextSize(32.0f);
                this.f9175j.setTypeface(Typeface.DEFAULT_BOLD);
            }
        } catch (Exception unused) {
        }
        this.f9158S.setAlpha(0.0f);
        this.f9176k.setAlpha(0.0f);
        qib0.f19782G.m12744L0(this.f9170e, "https://auto.tancdn.com/v1/raw/bd65c5b2-6e7f-4488-9f07-4ef082a1515b11.webp");
        SVGALoader.with(this.f9153N).from("welcome_top.svga").autoPlay(true).repeatCount(1).into(this.f9171f);
        VDraweeView vDraweeView = this.f9170e;
        Property property = View.ALPHA;
        Animator animatorL = bt0.l(vDraweeView, property, 620L, 340L, (Interpolator) null, new float[]{0.0f, 1.0f});
        Animator animatorL2 = bt0.l(this.f9158S, property, 2120L, 460L, (Interpolator) null, new float[]{0.0f, 1.0f});
        Animator animatorL3 = bt0.l(this.f9176k, property, 2120L, 460L, (Interpolator) null, new float[]{0.0f, 1.0f});
        View view = this.f9158S;
        Property property2 = View.TRANSLATION_Y;
        int i = t100.e;
        bt0.z(new Animator[]{animatorL, animatorL2, animatorL3, bt0.l(view, property2, 2120L, 460L, (Interpolator) null, new float[]{i, 0.0f}), bt0.l(this.f9176k, property2, 2120L, 460L, (Interpolator) null, new float[]{i, 0.0f})}).start();
        if (((Boolean) AccountModule.f26c.f321m.get()).booleanValue()) {
            xdl0.M(this.f9144E, true);
            this.f9180o.setAlpha(0.0f);
            xdl0.E0(this.f9145F, new View.OnClickListener() { // from class: l.uvp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f23772a.m12960b0(view2);
                }
            });
            xdl0.E0(this.f9146G, new View.OnClickListener() { // from class: l.vvp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f24488a.m12961c0(view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m13004r0() {
        xdl0.M(this.f9149J, true);
        this.f9150K.setChecked(FakeSplashView.B);
        if (this.f9150K.isChecked()) {
            m13009u0();
        }
        this.f9150K.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.kvp0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f16012a.m12995m0(compoundButton, z);
            }
        });
        FakeSplashView.B = false;
        xdl0.E0(this.f9151L, new View.OnClickListener() { // from class: l.lvp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16678a.m12997n0(view);
            }
        });
        zvf0.A("e_sign_in_agreement", ((PutongAct) act()).pageId(), new j760[]{vwb.Y("agreement_entrance", "landing_page")});
        this.f9151L.setText(i0g0.B(act(), "zh".equals(Locale.getDefault().getLanguage()) ? act().getString(R$string.f105O3, String.format(" %s ", act().string(R$string.f262r0)), String.format(" %s", act().string(R$string.f74I2))) : act().getString(R$string.f105O3, act().string(R$string.f262r0), act().string(R$string.f74I2)), new String[]{act().string(R$string.f262r0), juk.j(), act().string(R$string.f74I2), juk.i()}));
        this.f9151L.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p006l.AbstractC1211r6
    /* JADX INFO: renamed from: s */
    public void mo13005s() {
        VText_AutoFit vText_AutoFit = this.f9176k;
        vText_AutoFit.setTypeface(vText_AutoFit.getTypeface(), 1);
        this.f9176k.setText(String.format(act().getResources().getString(R$string.f257q0), m12958W(16497018449L)));
        xdl0.M(this.f9184s, true);
        xdl0.M(this.f9181p, this.f9152M.m23179S3() && !C0775gp.m15902i());
        xdl0.M(this.f9168c, true);
        xdl0.c0(this.f9177l, 0);
        xdl0.U(this.f9184s, (int) (xdl0.w0() * (this.f9152M.m23179S3() ? 0.1f : 0.15f)));
        this.f9184s.setBackgroundResource(v2c0.f23970J1);
        this.f9181p.setBackgroundResource(v2c0.f23970J1);
        xdl0.M(this.f9140A, false);
        xdl0.M(this.f9148I, false);
        xdl0.M(this.f9142C, false);
        xdl0.M(this.f9191z, false);
        xdl0.E0(this.f9184s, this.f9152M.m23168N3(true));
        zvf0.x("e_signin_wechat_button", ((PutongAct) act()).pageId());
        zvf0.x("e_signin_phone_button", ((PutongAct) act()).pageId());
        xdl0.E0(this.f9181p, new View.OnClickListener() { // from class: l.qvp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20095a.m13000p0(view);
            }
        });
        m13006s0();
    }

    /* JADX INFO: renamed from: s0 */
    public void m13006s0() {
        if (!m12974X() || C0775gp.m15902i()) {
            return;
        }
        xdl0.M(this.f9189x, true);
        xdl0.U(this.f9184s, t100.j);
        xdl0.U(this.f9189x, (int) (xdl0.w0() * (this.f9152M.m23179S3() ? 0.1f : 0.15f)));
        xdl0.E0(this.f9189x, new View.OnClickListener() { // from class: l.wvp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25430a.m12998o0(view);
            }
        });
        zvf0.x("e_signin_qq_button", act().pageId());
        this.f9164Y = true;
    }

    /* JADX INFO: renamed from: t0 */
    public void m13007t0() {
        if (xdl0.O0(this.f9184s)) {
            m13002q0();
        }
        if (xdl0.O0(this.f9140A)) {
            zvf0.x("e_signin_fb_button", ((PutongAct) act()).pageId());
        }
        if (xdl0.O0(this.f9142C)) {
            zvf0.x("e_signin_google_button", ((PutongAct) act()).pageId());
        }
    }

    @Override // p006l.AbstractC1211r6
    /* JADX INFO: renamed from: u */
    public void mo13008u() {
        this.f9150K.setChecked(true);
        m13009u0();
    }

    /* JADX INFO: renamed from: u0 */
    public void m13009u0() {
        this.f9159T = true;
        e51.J(this.f9161V);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m13010v0() {
        VCheckBox vCheckBox = this.f9150K;
        vCheckBox.setChecked(!vCheckBox.isChecked());
    }

    public void destroy() {
    }
}
