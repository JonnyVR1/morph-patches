package p149l;

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
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.welcome.VText_Medium;
import com.p046p1.mobile.putong.account.p050ui.welcome.WelcomeAct;
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
public class bwp0 extends AbstractC19646r6 {

    /* JADX INFO: renamed from: A */
    public ConstraintLayout f77640A;

    /* JADX INFO: renamed from: B */
    public VText_Medium f77641B;

    /* JADX INFO: renamed from: C */
    public ConstraintLayout f77642C;

    /* JADX INFO: renamed from: D */
    public VText_Medium f77643D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f77644E;

    /* JADX INFO: renamed from: F */
    public VText_Medium f77645F;

    /* JADX INFO: renamed from: G */
    public VText_Medium f77646G;

    /* JADX INFO: renamed from: H */
    public ViewStub f77647H;

    /* JADX INFO: renamed from: I */
    public VProgressBar f77648I;

    /* JADX INFO: renamed from: J */
    public VLinear f77649J;

    /* JADX INFO: renamed from: K */
    public VCheckBox f77650K;

    /* JADX INFO: renamed from: L */
    public VText f77651L;

    /* JADX INFO: renamed from: M */
    public rup0 f77652M;

    /* JADX INFO: renamed from: N */
    public WelcomeAct f77653N;

    /* JADX INFO: renamed from: O */
    public long f77654O;

    /* JADX INFO: renamed from: R */
    public boolean f77657R;

    /* JADX INFO: renamed from: S */
    public View f77658S;

    /* JADX INFO: renamed from: U */
    public l5j0 f77660U;

    /* JADX INFO: renamed from: V */
    public Runnable f77661V;

    /* JADX INFO: renamed from: W */
    public l5j0 f77662W;

    /* JADX INFO: renamed from: a */
    public ImageView f77666a;

    /* JADX INFO: renamed from: b */
    public ImageView f77667b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f77668c;

    /* JADX INFO: renamed from: d */
    public View f77669d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f77670e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f77671f;

    /* JADX INFO: renamed from: g */
    public VImage f77672g;

    /* JADX INFO: renamed from: h */
    public VText f77673h;

    /* JADX INFO: renamed from: i */
    public ImageView f77674i;

    /* JADX INFO: renamed from: j */
    public VText f77675j;

    /* JADX INFO: renamed from: k */
    public VText_AutoFit f77676k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f77677l;

    /* JADX INFO: renamed from: m */
    public VFrame f77678m;

    /* JADX INFO: renamed from: n */
    public VText f77679n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f77680o;

    /* JADX INFO: renamed from: p */
    public ConstraintLayout f77681p;

    /* JADX INFO: renamed from: q */
    public VText_Medium f77682q;

    /* JADX INFO: renamed from: r */
    public VText f77683r;

    /* JADX INFO: renamed from: s */
    public ConstraintLayout f77684s;

    /* JADX INFO: renamed from: t */
    public VText_Medium f77685t;

    /* JADX INFO: renamed from: u */
    public VText f77686u;

    /* JADX INFO: renamed from: v */
    public ConstraintLayout f77687v;

    /* JADX INFO: renamed from: w */
    public VText_Medium f77688w;

    /* JADX INFO: renamed from: x */
    public ConstraintLayout f77689x;

    /* JADX INFO: renamed from: y */
    public VText_Medium f77690y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f77691z;

    /* JADX INFO: renamed from: P */
    public Runnable f77655P = null;

    /* JADX INFO: renamed from: Q */
    public ValueAnimator f77656Q = null;

    /* JADX INFO: renamed from: T */
    public boolean f77659T = false;

    /* JADX INFO: renamed from: X */
    public Handler f77663X = new HandlerC15997b();

    /* JADX INFO: renamed from: Y */
    public boolean f77664Y = false;

    /* JADX INFO: renamed from: Z */
    public d30 f77665Z = new d30() { // from class: l.hvp0
        @Override // p149l.d30
        public final void call() {
            this.f109688a.m104208h0();
        }
    };

    /* JADX INFO: renamed from: l.bwp0$a */
    public class RunnableC15996a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f77692a;

        public RunnableC15996a() {
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m104236c() {
            bwp0.this.getAct().postDelayed(this, 300L);
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m104237d() {
            try {
                vuw.m200138d(bwp0.this.getAct());
            } catch (Throwable th) {
                CrashHelper.m81296c(th);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f77692a == null) {
                this.f77692a = bwp0.this.getAct().dialog().m20500D(R$string.f16112O).m20546o0(bwp0.this.getAct().color(u0c0.f172896q)).m20542l0(R$string.f16070F2, new Runnable() { // from class: l.zvp0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f205054a.m104236c();
                    }
                }).m20556t0(R$string.f16202f, new Runnable() { // from class: l.awp0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f72071a.m104237d();
                    }
                }).m20496B(false).m20567z();
            }
            this.f77692a.show();
        }
    }

    /* JADX INFO: renamed from: l.bwp0$b */
    public class HandlerC15997b extends Handler {
        public HandlerC15997b() {
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
                C4348d.m20896l().m20909u(new C4345a(bwp0.this.getAct()).m20849D(bwp0.this.getAct().getResources().getString(R$string.f16080H2)).m20855J(13.0f).m20882x(-t100.f167258g).m20873o(C4345a.f15681O, t100.m186890d(12.0f)).m20875q(C4345a.f15681O | C4345a.f15683Q), bwp0.this.f77650K, "privacy_check_tip");
                sendEmptyMessageDelayed(10002, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: l.bwp0$c */
    public class C15998c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f77695a;

        /* JADX INFO: renamed from: l.bwp0$c$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                bwp0.this.f77654O += (long) (new Random().nextInt(30) + 90);
                bwp0 bwp0Var = bwp0.this;
                bwp0Var.f77676k.setText(String.format(bwp0Var.getAct().getResources().getString(R$string.f16268q0), bwp0.m104183W(bwp0.this.f77654O)));
                e51.m114743H(bwp0.this.getAct(), this, 1000L);
            }
        }

        public C15998c(long j) {
            this.f77695a = j;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z = bwp0.this.f77657R;
            bwp0 bwp0Var = bwp0.this;
            if (z) {
                bwp0Var.f77657R = false;
                return;
            }
            bwp0Var.f77654O = this.f77695a;
            if (bwp0.this.f77655P == null) {
                bwp0.this.f77655P = new a();
                e51.m114743H(bwp0.this.getAct(), bwp0.this.f77655P, 1000L);
            }
        }
    }

    public bwp0(@Nullable WelcomeAct welcomeAct) {
        this.f77653N = welcomeAct;
    }

    /* JADX INFO: renamed from: W */
    public static String m104183W(long j) {
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
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m104184a0(View view) {
        zvf0.m220396r("e_other_signin_entrance", WXEntryActivity.PID);
        if (NullChecker.m81303a(this.f77662W) && this.f77662W.isShowing()) {
            this.f77662W.dismiss();
            this.f77662W = null;
        }
        this.f77662W = C21176xm.m210017l0(getAct(), mo104205e(), this.f77652M.m181103S3(), m104198X(), new d30() { // from class: l.yvp0
            @Override // p149l.d30
            public final void call() {
                this.f200285a.m104188e0();
            }
        }, new d30() { // from class: l.ivp0
            @Override // p149l.d30
            public final void call() {
                this.f115189a.m104189f0();
            }
        }, new e30() { // from class: l.jvp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119964a.m104207g0((Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m104185b0(View view) {
        m104197V(view, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m104186c0(View view) {
        m104197V(view, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m104187d0(View view) {
        getAct().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m104188e0() {
        this.f77652M.m181177z5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m104189f0() {
        this.f77652M.m181175y5();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f77653N;
    }

    /* JADX INFO: renamed from: T */
    public View m104195T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cwp0.m109052b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rup0 rup0Var) {
        this.f77652M = rup0Var;
    }

    /* JADX INFO: renamed from: V */
    public final void m104197V(final View view, boolean z) {
        this.f77652M.f161105k = z;
        if (z) {
            zvf0.m220396r("e_intl_new_here", getAct().pageId());
            for (int i = 0; i < this.f77680o.getChildCount(); i++) {
                View childAt = this.f77680o.getChildAt(i);
                xdl0.m208344M(childAt, childAt.getId() == q4c0.f152590d0 || childAt.getId() == q4c0.f152611q);
            }
            this.f77685t.setText(getAct().getString(R$string.f16211g2));
        } else {
            zvf0.m220396r("e_intl_have_been_here_before", getAct().pageId());
        }
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = this.f77644E;
        Property property = View.TRANSLATION_Y;
        Animator animatorM103741n = bt0.m103741n(linearLayout, property, 0.0f, t100.f167271t);
        LinearLayout linearLayout2 = this.f77644E;
        Property property2 = View.ALPHA;
        animatorSet.playTogether(animatorM103741n, bt0.m103741n(linearLayout2, property2, 1.0f, 0.0f));
        animatorSet.setDuration(250L);
        bt0.m103749v(animatorSet, new Runnable() { // from class: l.mvp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f135959a.m104230t0();
            }
        });
        bt0.m103733f(animatorSet, new Runnable() { // from class: l.nvp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f140808a.m104200Z(view);
            }
        });
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(bt0.m103741n(this.f77680o, property, t100.f167231F, 0.0f), bt0.m103741n(this.f77680o, property2, 0.0f, 1.0f));
        animatorSet2.setDuration(250L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        animatorSet3.start();
    }

    /* JADX INFO: renamed from: X */
    public boolean m104198X() {
        return this.f77652M.m181100R3() && RemoteConfig.m79298x().m79330s("qq_login");
    }

    /* JADX INFO: renamed from: Y */
    public boolean m104199Y() {
        return this.f77652M.m181103S3() || m104198X();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m104200Z(View view) {
        xdl0.m208344M(view, false);
        xdl0.m208344M(this.f77644E, false);
    }

    @Override // p149l.AbstractC19646r6
    /* JADX INFO: renamed from: a */
    public void mo104201a() {
        if (C17133gp.m127318i() && NullChecker.m81303a(this.f77662W) && this.f77662W.isShowing()) {
            this.f77662W.dismiss();
            this.f77662W = null;
        }
    }

    @Override // p149l.AbstractC19646r6
    /* JADX INFO: renamed from: b */
    public void mo104202b(boolean z) {
        this.f77642C.setEnabled(!z);
        ConstraintLayout constraintLayout = this.f77642C;
        if (z) {
            constraintLayout.setAlpha(0.5f);
        } else {
            constraintLayout.setAlpha(1.0f);
        }
    }

    @Override // p149l.AbstractC19646r6
    /* JADX INFO: renamed from: c */
    public Runnable mo104203c(boolean z) {
        rup0 rup0Var = this.f77652M;
        Objects.requireNonNull(rup0Var);
        rup0Var.m181091M5(null, new asp0(rup0Var));
        if (!z) {
            return null;
        }
        getAct().hideInput(getAct().findViewById(R.id.content));
        RunnableC15996a runnableC15996a = new RunnableC15996a();
        runnableC15996a.run();
        return runnableC15996a;
    }

    @Override // p149l.AbstractC19646r6
    /* JADX INFO: renamed from: d */
    public boolean mo104204d() {
        return this.f77648I.isShown();
    }

    @Override // p149l.AbstractC19646r6
    /* JADX INFO: renamed from: e */
    public boolean mo104205e() {
        if (this.f77650K.isChecked()) {
            m104232u0();
        }
        return this.f77650K.isChecked();
    }

    @Override // p149l.AbstractC19646r6
    /* JADX INFO: renamed from: f */
    public void mo104206f() {
        e51.m114742G(new Runnable() { // from class: l.rvp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f161247a.m104212j0();
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m104207g0(Boolean bool) {
        if (bool.booleanValue()) {
            m104232u0();
        }
        this.f77650K.setChecked(bool.booleanValue());
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m104208h0() {
        this.f77650K.setChecked(true);
        m104232u0();
        this.f77652M.m181080H5();
    }

    @Override // p149l.AbstractC19646r6
    /* JADX INFO: renamed from: i */
    public void mo104209i(final View.OnClickListener onClickListener, final View view) {
        this.f77660U = C21176xm.m210015k0(getAct(), new d30() { // from class: l.ovp0
            @Override // p149l.d30
            public final void call() {
                this.f145825a.m104214k0(onClickListener, view);
            }
        }, new d30() { // from class: l.pvp0
            @Override // p149l.d30
            public final void call() {
                this.f151497a.m104216l0();
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m104210i0(long j, ValueAnimator valueAnimator) {
        this.f77676k.setText(String.format(getAct().getResources().getString(R$string.f16268q0), m104183W((((j - 16497018449L) * ((long) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0E7f))) / 10000000) + 16497018449L)));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m104195T(layoutInflater, viewGroup);
    }

    @Override // p149l.AbstractC19646r6
    /* JADX INFO: renamed from: j */
    public void mo104211j() {
        xdl0.m208344M(this.f77640A, true);
        xdl0.m208344M(this.f77648I, false);
        xdl0.m208344M(this.f77681p, false);
        xdl0.m208344M(this.f77691z, true);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m104212j0() {
        final long jLongValue = AccountModule.f16037c.f16329j.get().longValue();
        ValueAnimator valueAnimator = this.f77656Q;
        if (valueAnimator == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f77656Q = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xvp0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f194662a.m104210i0(jLongValue, valueAnimator2);
                }
            });
            this.f77656Q.setInterpolator(new DecelerateInterpolator());
            this.f77656Q.addListener(new C15998c(jLongValue));
            this.f77656Q.setStartDelay(300L);
            this.f77656Q.setDuration(1500L);
        } else if (valueAnimator.isRunning()) {
            this.f77657R = true;
            this.f77656Q.cancel();
        }
        this.f77656Q.start();
    }

    @Override // p149l.AbstractC19646r6
    /* JADX INFO: renamed from: k */
    public void mo104213k() {
        xdl0.m208344M(this.f77642C, true);
        xdl0.m208344M(this.f77691z, true);
        xdl0.m208329E0(this.f77642C, this.f77652M.m181114V5());
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m104214k0(View.OnClickListener onClickListener, View view) {
        mo104231u();
        onClickListener.onClick(view);
    }

    @Override // p149l.AbstractC19646r6
    /* JADX INFO: renamed from: l */
    public void mo104215l() {
        xdl0.m208344M(this.f77668c, true);
        VText_AutoFit vText_AutoFit = this.f77676k;
        vText_AutoFit.setTypeface(vText_AutoFit.getTypeface(), 1);
        this.f77676k.setText(String.format(getAct().getResources().getString(R$string.f16268q0), m104183W(16497018449L)));
        xdl0.m208344M(this.f77684s, true);
        xdl0.m208329E0(this.f77684s, this.f77652M.m181092N3(false));
        xdl0.m208345M0(this.f77640A, false);
        xdl0.m208344M(this.f77642C, false);
        xdl0.m208344M(this.f77691z, false);
        xdl0.m208344M(this.f77648I, false);
        xdl0.m208344M(this.f77681p, false);
        xdl0.m208344M(this.f77689x, false);
        xdl0.m208344M(this.f77687v, true);
        xdl0.m208329E0(this.f77687v, this.f77652M.m181084J3());
        boolean zM28120p = IntlCountryCodeController.m28120p();
        VCheckBox vCheckBox = this.f77650K;
        if (zM28120p) {
            xdl0.m208344M(vCheckBox, true);
        } else {
            xdl0.m208344M(vCheckBox, false);
        }
        this.f77651L.setGravity(17);
        m104227r0();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m104216l0() {
        e51.m114745J(this.f77661V);
    }

    @Override // p149l.AbstractC19646r6
    /* JADX INFO: renamed from: m */
    public void mo104217m(boolean z) {
        xdl0.m208345M0(this.f77684s, !z);
        if (this.f77652M.m181103S3()) {
            boolean zM127318i = C17133gp.m127318i();
            ConstraintLayout constraintLayout = this.f77681p;
            if (zM127318i) {
                xdl0.m208345M0(constraintLayout, false);
            } else {
                xdl0.m208345M0(constraintLayout, !z);
            }
        }
        if (this.f77664Y) {
            boolean zM127318i2 = C17133gp.m127318i();
            ConstraintLayout constraintLayout2 = this.f77689x;
            if (zM127318i2) {
                xdl0.m208345M0(constraintLayout2, false);
            } else {
                xdl0.m208345M0(constraintLayout2, !z);
            }
        }
        xdl0.m208344M(this.f77648I, z);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m104218m0(CompoundButton compoundButton, boolean z) {
        zvf0.m220399u("e_sign_in_agreement", ((PutongAct) getAct()).pageId(), vwb.m200311Y("agreement_entrance", "landing_page"));
        if (z) {
            m104232u0();
        }
    }

    @Override // p149l.AbstractC19646r6
    /* JADX INFO: renamed from: n */
    public void mo104219n() {
        xdl0.m208344M(this.f77684s, true);
        xdl0.m208344M(this.f77681p, false);
        xdl0.m208344M(this.f77640A, false);
        xdl0.m208344M(this.f77648I, false);
        xdl0.m208344M(this.f77642C, false);
        xdl0.m208344M(this.f77691z, false);
        xdl0.m208329E0(this.f77684s, this.f77652M.m181092N3(false));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m104220n0(View view) {
        if (this.f77651L.getSelectionStart() == -1 && this.f77651L.getSelectionEnd() == -1) {
            m104233v0();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m104221o0(View view) {
        this.f77652M.m181175y5();
        zvf0.m220396r("e_signin_qq_button", getAct().pageId());
    }

    @Override // p149l.AbstractC19646r6
    /* JADX INFO: renamed from: p */
    public void mo104222p(boolean z) {
        this.f77640A.setEnabled(!z);
        ConstraintLayout constraintLayout = this.f77640A;
        if (z) {
            constraintLayout.setAlpha(0.5f);
        } else {
            constraintLayout.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m104223p0(View view) {
        this.f77652M.m181177z5();
        zvf0.m220396r("e_signin_wechat_button", ((PutongAct) getAct()).pageId());
    }

    @Override // p149l.AbstractC19646r6
    /* JADX INFO: renamed from: q */
    public void mo104224q() {
        xdl0.m208329E0(this.f77640A, this.f77652M.m181111U5());
    }

    /* JADX INFO: renamed from: q0 */
    public void m104225q0() {
        zvf0.m220402x("e_signin_phone_button", ((PutongAct) getAct()).pageId());
    }

    @Override // p149l.AbstractC19646r6
    /* JADX INFO: renamed from: r */
    public void mo104226r() {
        this.f77673h.setTypeface(eqh0.m117752c(3), 1);
        xdl0.m208344M(this.f77673h, false);
        if (C17133gp.m127318i()) {
            if (this.f77652M.m181103S3()) {
                xdl0.m208344M(this.f77681p, false);
                xdl0.m208344M(this.f77666a, false);
            }
            if (m104198X()) {
                xdl0.m208344M(this.f77689x, false);
                xdl0.m208344M(this.f77667b, false);
            }
            if (m104199Y()) {
                zvf0.m220402x("e_other_signin_entrance", WXEntryActivity.PID);
            }
            xdl0.m208344M(this.f77673h, m104199Y());
        }
        xdl0.m208344M(this.f77672g, false);
        xdl0.m208329E0(this.f77672g, new View.OnClickListener() { // from class: l.svp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166587a.m104187d0(view);
            }
        });
        xdl0.m208329E0(this.f77673h, new View.OnClickListener() { // from class: l.tvp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172331a.m104184a0(view);
            }
        });
        xdl0.m208345M0(this.f77675j, true);
        xdl0.m208345M0(this.f77674i, false);
        this.f77658S = this.f77675j;
        try {
            boolean zEquals = TextUtils.equals(Locale.getDefault().getLanguage(), "en");
            VText vText = this.f77675j;
            if (zEquals) {
                vText.setText(vText.getText().toString().toLowerCase());
                this.f77675j.setTextSize(41.0f);
                this.f77675j.setTypeface(Typeface.createFromAsset(getAct().getAssets(), "font/nexa_xbold.ttf"));
            } else {
                vText.setTextSize(32.0f);
                this.f77675j.setTypeface(Typeface.DEFAULT_BOLD);
            }
        } catch (Exception unused) {
        }
        this.f77658S.setAlpha(0.0f);
        this.f77676k.setAlpha(0.0f);
        qib0.f154691G.m102331L0(this.f77670e, "https://auto.tancdn.com/v1/raw/bd65c5b2-6e7f-4488-9f07-4ef082a1515b11.webp");
        SVGALoader.with(this.f77653N).from("welcome_top.svga").autoPlay(true).repeatCount(1).into(this.f77671f);
        VDraweeView vDraweeView = this.f77670e;
        Property property = View.ALPHA;
        Animator animatorM103739l = bt0.m103739l(vDraweeView, property, 620L, 340L, null, 0.0f, 1.0f);
        Animator animatorM103739l2 = bt0.m103739l(this.f77658S, property, 2120L, 460L, null, 0.0f, 1.0f);
        Animator animatorM103739l3 = bt0.m103739l(this.f77676k, property, 2120L, 460L, null, 0.0f, 1.0f);
        View view = this.f77658S;
        Property property2 = View.TRANSLATION_Y;
        int i = t100.f167256e;
        bt0.m103753z(animatorM103739l, animatorM103739l2, animatorM103739l3, bt0.m103739l(view, property2, 2120L, 460L, null, i, 0.0f), bt0.m103739l(this.f77676k, property2, 2120L, 460L, null, i, 0.0f)).start();
        if (AccountModule.f16037c.f16332m.get().booleanValue()) {
            xdl0.m208344M(this.f77644E, true);
            this.f77680o.setAlpha(0.0f);
            xdl0.m208329E0(this.f77645F, new View.OnClickListener() { // from class: l.uvp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f178550a.m104185b0(view2);
                }
            });
            xdl0.m208329E0(this.f77646G, new View.OnClickListener() { // from class: l.vvp0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f183247a.m104186c0(view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m104227r0() {
        xdl0.m208344M(this.f77649J, true);
        this.f77650K.setChecked(FakeSplashView.f54680B);
        if (this.f77650K.isChecked()) {
            m104232u0();
        }
        this.f77650K.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.kvp0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f124786a.m104218m0(compoundButton, z);
            }
        });
        FakeSplashView.f54680B = false;
        xdl0.m208329E0(this.f77651L, new View.OnClickListener() { // from class: l.lvp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130183a.m104220n0(view);
            }
        });
        zvf0.m220368A("e_sign_in_agreement", ((PutongAct) getAct()).pageId(), vwb.m200311Y("agreement_entrance", "landing_page"));
        this.f77651L.setText(i0g0.m133835B(getAct(), "zh".equals(Locale.getDefault().getLanguage()) ? getAct().getString(R$string.f16116O3, String.format(" %s ", getAct().string(R$string.f16273r0)), String.format(" %s", getAct().string(R$string.f16085I2))) : getAct().getString(R$string.f16116O3, getAct().string(R$string.f16273r0), getAct().string(R$string.f16085I2)), getAct().string(R$string.f16273r0), juk.m143328j(), getAct().string(R$string.f16085I2), juk.m143327i()));
        this.f77651L.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p149l.AbstractC19646r6
    /* JADX INFO: renamed from: s */
    public void mo104228s() {
        VText_AutoFit vText_AutoFit = this.f77676k;
        vText_AutoFit.setTypeface(vText_AutoFit.getTypeface(), 1);
        this.f77676k.setText(String.format(getAct().getResources().getString(R$string.f16268q0), m104183W(16497018449L)));
        xdl0.m208344M(this.f77684s, true);
        xdl0.m208344M(this.f77681p, this.f77652M.m181103S3() && !C17133gp.m127318i());
        xdl0.m208344M(this.f77668c, true);
        xdl0.m208368c0(this.f77677l, 0);
        xdl0.m208357U(this.f77684s, (int) (xdl0.m208408w0() * (this.f77652M.m181103S3() ? 0.1f : 0.15f)));
        this.f77684s.setBackgroundResource(v2c0.f179406J1);
        this.f77681p.setBackgroundResource(v2c0.f179406J1);
        xdl0.m208344M(this.f77640A, false);
        xdl0.m208344M(this.f77648I, false);
        xdl0.m208344M(this.f77642C, false);
        xdl0.m208344M(this.f77691z, false);
        xdl0.m208329E0(this.f77684s, this.f77652M.m181092N3(true));
        zvf0.m220402x("e_signin_wechat_button", ((PutongAct) getAct()).pageId());
        zvf0.m220402x("e_signin_phone_button", ((PutongAct) getAct()).pageId());
        xdl0.m208329E0(this.f77681p, new View.OnClickListener() { // from class: l.qvp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156617a.m104223p0(view);
            }
        });
        m104229s0();
    }

    /* JADX INFO: renamed from: s0 */
    public void m104229s0() {
        if (!m104198X() || C17133gp.m127318i()) {
            return;
        }
        xdl0.m208344M(this.f77689x, true);
        xdl0.m208357U(this.f77684s, t100.f167261j);
        xdl0.m208357U(this.f77689x, (int) (xdl0.m208408w0() * (this.f77652M.m181103S3() ? 0.1f : 0.15f)));
        xdl0.m208329E0(this.f77689x, new View.OnClickListener() { // from class: l.wvp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188276a.m104221o0(view);
            }
        });
        zvf0.m220402x("e_signin_qq_button", getAct().pageId());
        this.f77664Y = true;
    }

    /* JADX INFO: renamed from: t0 */
    public void m104230t0() {
        if (xdl0.m208349O0(this.f77684s)) {
            m104225q0();
        }
        if (xdl0.m208349O0(this.f77640A)) {
            zvf0.m220402x("e_signin_fb_button", ((PutongAct) getAct()).pageId());
        }
        if (xdl0.m208349O0(this.f77642C)) {
            zvf0.m220402x("e_signin_google_button", ((PutongAct) getAct()).pageId());
        }
    }

    @Override // p149l.AbstractC19646r6
    /* JADX INFO: renamed from: u */
    public void mo104231u() {
        this.f77650K.setChecked(true);
        m104232u0();
    }

    /* JADX INFO: renamed from: u0 */
    public void m104232u0() {
        this.f77659T = true;
        e51.m114745J(this.f77661V);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m104233v0() {
        VCheckBox vCheckBox = this.f77650K;
        vCheckBox.setChecked(!vCheckBox.isChecked());
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
