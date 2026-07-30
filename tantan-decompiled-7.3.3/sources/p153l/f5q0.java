package p153l;

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
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.welcome.VText_Medium;
import com.p051p1.mobile.putong.account.p055ui.welcome.WelcomeAct;
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
public class f5q0 extends AbstractC19037o6 {

    /* JADX INFO: renamed from: A */
    public ConstraintLayout f97276A;

    /* JADX INFO: renamed from: B */
    public VText_Medium f97277B;

    /* JADX INFO: renamed from: C */
    public ConstraintLayout f97278C;

    /* JADX INFO: renamed from: D */
    public VText_Medium f97279D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f97280E;

    /* JADX INFO: renamed from: F */
    public VText_Medium f97281F;

    /* JADX INFO: renamed from: G */
    public VText_Medium f97282G;

    /* JADX INFO: renamed from: H */
    public ViewStub f97283H;

    /* JADX INFO: renamed from: I */
    public VProgressBar f97284I;

    /* JADX INFO: renamed from: J */
    public VLinear f97285J;

    /* JADX INFO: renamed from: K */
    public VCheckBox f97286K;

    /* JADX INFO: renamed from: L */
    public VText f97287L;

    /* JADX INFO: renamed from: M */
    public v3q0 f97288M;

    /* JADX INFO: renamed from: N */
    public WelcomeAct f97289N;

    /* JADX INFO: renamed from: O */
    public long f97290O;

    /* JADX INFO: renamed from: R */
    public boolean f97293R;

    /* JADX INFO: renamed from: S */
    public View f97294S;

    /* JADX INFO: renamed from: U */
    public pej0 f97296U;

    /* JADX INFO: renamed from: V */
    public Runnable f97297V;

    /* JADX INFO: renamed from: W */
    public pej0 f97298W;

    /* JADX INFO: renamed from: a */
    public ImageView f97302a;

    /* JADX INFO: renamed from: b */
    public ImageView f97303b;

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f97304c;

    /* JADX INFO: renamed from: d */
    public View f97305d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f97306e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f97307f;

    /* JADX INFO: renamed from: g */
    public VImage f97308g;

    /* JADX INFO: renamed from: h */
    public VText f97309h;

    /* JADX INFO: renamed from: i */
    public ImageView f97310i;

    /* JADX INFO: renamed from: j */
    public VText f97311j;

    /* JADX INFO: renamed from: k */
    public VText_AutoFit f97312k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f97313l;

    /* JADX INFO: renamed from: m */
    public VFrame f97314m;

    /* JADX INFO: renamed from: n */
    public VText f97315n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f97316o;

    /* JADX INFO: renamed from: p */
    public ConstraintLayout f97317p;

    /* JADX INFO: renamed from: q */
    public VText_Medium f97318q;

    /* JADX INFO: renamed from: r */
    public VText f97319r;

    /* JADX INFO: renamed from: s */
    public ConstraintLayout f97320s;

    /* JADX INFO: renamed from: t */
    public VText_Medium f97321t;

    /* JADX INFO: renamed from: u */
    public VText f97322u;

    /* JADX INFO: renamed from: v */
    public ConstraintLayout f97323v;

    /* JADX INFO: renamed from: w */
    public VText_Medium f97324w;

    /* JADX INFO: renamed from: x */
    public ConstraintLayout f97325x;

    /* JADX INFO: renamed from: y */
    public VText_Medium f97326y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f97327z;

    /* JADX INFO: renamed from: P */
    public Runnable f97291P = null;

    /* JADX INFO: renamed from: Q */
    public ValueAnimator f97292Q = null;

    /* JADX INFO: renamed from: T */
    public boolean f97295T = false;

    /* JADX INFO: renamed from: X */
    public Handler f97299X = new HandlerC16907b();

    /* JADX INFO: renamed from: Y */
    public boolean f97300Y = false;

    /* JADX INFO: renamed from: Z */
    public x20 f97301Z = new x20() { // from class: l.l4q0
        @Override // p153l.x20
        public final void call() {
            this.f130010a.m124202h0();
        }
    };

    /* JADX INFO: renamed from: l.f5q0$a */
    public class RunnableC16906a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f97328a;

        public RunnableC16906a() {
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m124230c() {
            f5q0.this.getAct().postDelayed(this, 300L);
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m124231d() {
            try {
                uxw.m198548d(f5q0.this.getAct());
            } catch (Throwable th) {
                CrashHelper.m82479c(th);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f97328a == null) {
                this.f97328a = f5q0.this.getAct().dialog().m21499D(R$string.f16831O).m21545o0(f5q0.this.getAct().color(a9c0.f69032q)).m21541l0(R$string.f16789F2, new Runnable() { // from class: l.d5q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f85185a.m124230c();
                    }
                }).m21555t0(R$string.f16921f, new Runnable() { // from class: l.e5q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f92229a.m124231d();
                    }
                }).m21495B(false).m21566z();
            }
            this.f97328a.show();
        }
    }

    /* JADX INFO: renamed from: l.f5q0$b */
    public class HandlerC16907b extends Handler {
        public HandlerC16907b() {
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
                C4499d.m21895l().m21908u(new C4496a(f5q0.this.getAct()).m21848D(f5q0.this.getAct().getResources().getString(R$string.f16799H2)).m21854J(13.0f).m21881x(-qa00.f156320g).m21872o(C4496a.f16400O, qa00.m175859d(12.0f)).m21874q(C4496a.f16400O | C4496a.f16402Q), f5q0.this.f97286K, "privacy_check_tip");
                sendEmptyMessageDelayed(10002, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: l.f5q0$c */
    public class C16908c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f97331a;

        /* JADX INFO: renamed from: l.f5q0$c$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f5q0.this.f97290O += (long) (new Random().nextInt(30) + 90);
                f5q0 f5q0Var = f5q0.this;
                f5q0Var.f97312k.setText(String.format(f5q0Var.getAct().getResources().getString(R$string.f16987q0), f5q0.m124177W(f5q0.this.f97290O)));
                l51.m152888H(f5q0.this.getAct(), this, 1000L);
            }
        }

        public C16908c(long j) {
            this.f97331a = j;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z = f5q0.this.f97293R;
            f5q0 f5q0Var = f5q0.this;
            if (z) {
                f5q0Var.f97293R = false;
                return;
            }
            f5q0Var.f97290O = this.f97331a;
            if (f5q0.this.f97291P == null) {
                f5q0.this.f97291P = new a();
                l51.m152888H(f5q0.this.getAct(), f5q0.this.f97291P, 1000L);
            }
        }
    }

    public f5q0(@Nullable WelcomeAct welcomeAct) {
        this.f97289N = welcomeAct;
    }

    /* JADX INFO: renamed from: W */
    public static String m124177W(long j) {
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
    public /* synthetic */ void m124178a0(View view) {
        i4g0.m138520r("e_other_signin_entrance", WXEntryActivity.PID);
        if (NullChecker.m82486a(this.f97298W) && this.f97298W.isShowing()) {
            this.f97298W.dismiss();
            this.f97298W = null;
        }
        this.f97298W = C20102sm.m186702l0(getAct(), mo124199e(), this.f97288M.m199513S3(), m124192X(), new x20() { // from class: l.c5q0
            @Override // p153l.x20
            public final void call() {
                this.f79889a.m124182e0();
            }
        }, new x20() { // from class: l.m4q0
            @Override // p153l.x20
            public final void call() {
                this.f134824a.m124183f0();
            }
        }, new y20() { // from class: l.n4q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140250a.m124201g0((Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m124179b0(View view) {
        m124191V(view, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public /* synthetic */ void m124180c0(View view) {
        m124191V(view, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m124181d0(View view) {
        getAct().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public /* synthetic */ void m124182e0() {
        this.f97288M.m199587z5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m124183f0() {
        this.f97288M.m199585y5();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f97289N;
    }

    /* JADX INFO: renamed from: T */
    public View m124189T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g5q0.m129067b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(v3q0 v3q0Var) {
        this.f97288M = v3q0Var;
    }

    /* JADX INFO: renamed from: V */
    public final void m124191V(final View view, boolean z) {
        this.f97288M.f182250k = z;
        if (z) {
            i4g0.m138520r("e_intl_new_here", getAct().pageId());
            for (int i = 0; i < this.f97316o.getChildCount(); i++) {
                View childAt = this.f97316o.getChildAt(i);
                bnl0.m105524M(childAt, childAt.getId() == wcc0.f188438d0 || childAt.getId() == wcc0.f188459q);
            }
            this.f97321t.setText(getAct().getString(R$string.f16930g2));
        } else {
            i4g0.m138520r("e_intl_have_been_here_before", getAct().pageId());
        }
        AnimatorSet animatorSet = new AnimatorSet();
        LinearLayout linearLayout = this.f97280E;
        Property property = View.TRANSLATION_Y;
        Animator animatorM132168n = gt0.m132168n(linearLayout, property, 0.0f, qa00.f156333t);
        LinearLayout linearLayout2 = this.f97280E;
        Property property2 = View.ALPHA;
        animatorSet.playTogether(animatorM132168n, gt0.m132168n(linearLayout2, property2, 1.0f, 0.0f));
        animatorSet.setDuration(250L);
        gt0.m132176v(animatorSet, new Runnable() { // from class: l.q4q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f155611a.m124224t0();
            }
        });
        gt0.m132160f(animatorSet, new Runnable() { // from class: l.r4q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f161224a.m124194Z(view);
            }
        });
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(gt0.m132168n(this.f97316o, property, qa00.f156293F, 0.0f), gt0.m132168n(this.f97316o, property2, 0.0f, 1.0f));
        animatorSet2.setDuration(250L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        animatorSet3.start();
    }

    /* JADX INFO: renamed from: X */
    public boolean m124192X() {
        return this.f97288M.m199510R3() && RemoteConfig.m80481x().m80513s("qq_login");
    }

    /* JADX INFO: renamed from: Y */
    public boolean m124193Y() {
        return this.f97288M.m199513S3() || m124192X();
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m124194Z(View view) {
        bnl0.m105524M(view, false);
        bnl0.m105524M(this.f97280E, false);
    }

    @Override // p153l.AbstractC19037o6
    /* JADX INFO: renamed from: a */
    public void mo124195a() {
        if (C16074bp.m105754i() && NullChecker.m82486a(this.f97298W) && this.f97298W.isShowing()) {
            this.f97298W.dismiss();
            this.f97298W = null;
        }
    }

    @Override // p153l.AbstractC19037o6
    /* JADX INFO: renamed from: b */
    public void mo124196b(boolean z) {
        this.f97278C.setEnabled(!z);
        ConstraintLayout constraintLayout = this.f97278C;
        if (z) {
            constraintLayout.setAlpha(0.5f);
        } else {
            constraintLayout.setAlpha(1.0f);
        }
    }

    @Override // p153l.AbstractC19037o6
    /* JADX INFO: renamed from: c */
    public Runnable mo124197c(boolean z) {
        v3q0 v3q0Var = this.f97288M;
        Objects.requireNonNull(v3q0Var);
        v3q0Var.m199501M5(null, new e1q0(v3q0Var));
        if (!z) {
            return null;
        }
        getAct().hideInput(getAct().findViewById(R.id.content));
        RunnableC16906a runnableC16906a = new RunnableC16906a();
        runnableC16906a.run();
        return runnableC16906a;
    }

    @Override // p153l.AbstractC19037o6
    /* JADX INFO: renamed from: d */
    public boolean mo124198d() {
        return this.f97284I.isShown();
    }

    @Override // p153l.AbstractC19037o6
    /* JADX INFO: renamed from: e */
    public boolean mo124199e() {
        if (this.f97286K.isChecked()) {
            m124226u0();
        }
        return this.f97286K.isChecked();
    }

    @Override // p153l.AbstractC19037o6
    /* JADX INFO: renamed from: f */
    public void mo124200f() {
        l51.m152887G(new Runnable() { // from class: l.v4q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f182419a.m124206j0();
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m124201g0(Boolean bool) {
        if (bool.booleanValue()) {
            m124226u0();
        }
        this.f97286K.setChecked(bool.booleanValue());
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m124202h0() {
        this.f97286K.setChecked(true);
        m124226u0();
        this.f97288M.m199490H5();
    }

    @Override // p153l.AbstractC19037o6
    /* JADX INFO: renamed from: i */
    public void mo124203i(final View.OnClickListener onClickListener, final View view) {
        this.f97296U = C20102sm.m186700k0(getAct(), new x20() { // from class: l.s4q0
            @Override // p153l.x20
            public final void call() {
                this.f166258a.m124208k0(onClickListener, view);
            }
        }, new x20() { // from class: l.t4q0
            @Override // p153l.x20
            public final void call() {
                this.f172097a.m124210l0();
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m124204i0(long j, ValueAnimator valueAnimator) {
        this.f97312k.setText(String.format(getAct().getResources().getString(R$string.f16987q0), m124177W((((j - 16497018449L) * ((long) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0E7f))) / 10000000) + 16497018449L)));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m124189T(layoutInflater, viewGroup);
    }

    @Override // p153l.AbstractC19037o6
    /* JADX INFO: renamed from: j */
    public void mo124205j() {
        bnl0.m105524M(this.f97276A, true);
        bnl0.m105524M(this.f97284I, false);
        bnl0.m105524M(this.f97317p, false);
        bnl0.m105524M(this.f97327z, true);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m124206j0() {
        final long jLongValue = AccountModule.f16756c.f17048j.get().longValue();
        ValueAnimator valueAnimator = this.f97292Q;
        if (valueAnimator == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f97292Q = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.b5q0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f75087a.m124204i0(jLongValue, valueAnimator2);
                }
            });
            this.f97292Q.setInterpolator(new DecelerateInterpolator());
            this.f97292Q.addListener(new C16908c(jLongValue));
            this.f97292Q.setStartDelay(300L);
            this.f97292Q.setDuration(1500L);
        } else if (valueAnimator.isRunning()) {
            this.f97293R = true;
            this.f97292Q.cancel();
        }
        this.f97292Q.start();
    }

    @Override // p153l.AbstractC19037o6
    /* JADX INFO: renamed from: k */
    public void mo124207k() {
        bnl0.m105524M(this.f97278C, true);
        bnl0.m105524M(this.f97327z, true);
        bnl0.m105509E0(this.f97278C, this.f97288M.m199524V5());
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m124208k0(View.OnClickListener onClickListener, View view) {
        mo124225u();
        onClickListener.onClick(view);
    }

    @Override // p153l.AbstractC19037o6
    /* JADX INFO: renamed from: l */
    public void mo124209l() {
        bnl0.m105524M(this.f97304c, true);
        VText_AutoFit vText_AutoFit = this.f97312k;
        vText_AutoFit.setTypeface(vText_AutoFit.getTypeface(), 1);
        this.f97312k.setText(String.format(getAct().getResources().getString(R$string.f16987q0), m124177W(16497018449L)));
        bnl0.m105524M(this.f97320s, true);
        bnl0.m105509E0(this.f97320s, this.f97288M.m199502N3(false));
        bnl0.m105525M0(this.f97276A, false);
        bnl0.m105524M(this.f97278C, false);
        bnl0.m105524M(this.f97327z, false);
        bnl0.m105524M(this.f97284I, false);
        bnl0.m105524M(this.f97317p, false);
        bnl0.m105524M(this.f97325x, false);
        bnl0.m105524M(this.f97323v, true);
        bnl0.m105509E0(this.f97323v, this.f97288M.m199494J3());
        boolean zM29119p = IntlCountryCodeController.m29119p();
        VCheckBox vCheckBox = this.f97286K;
        if (zM29119p) {
            bnl0.m105524M(vCheckBox, true);
        } else {
            bnl0.m105524M(vCheckBox, false);
        }
        this.f97287L.setGravity(17);
        m124221r0();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m124210l0() {
        l51.m152890J(this.f97297V);
    }

    @Override // p153l.AbstractC19037o6
    /* JADX INFO: renamed from: m */
    public void mo124211m(boolean z) {
        bnl0.m105525M0(this.f97320s, !z);
        if (this.f97288M.m199513S3()) {
            boolean zM105754i = C16074bp.m105754i();
            ConstraintLayout constraintLayout = this.f97317p;
            if (zM105754i) {
                bnl0.m105525M0(constraintLayout, false);
            } else {
                bnl0.m105525M0(constraintLayout, !z);
            }
        }
        if (this.f97300Y) {
            boolean zM105754i2 = C16074bp.m105754i();
            ConstraintLayout constraintLayout2 = this.f97325x;
            if (zM105754i2) {
                bnl0.m105525M0(constraintLayout2, false);
            } else {
                bnl0.m105525M0(constraintLayout2, !z);
            }
        }
        bnl0.m105524M(this.f97284I, z);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m124212m0(CompoundButton compoundButton, boolean z) {
        i4g0.m138523u("e_sign_in_agreement", ((PutongAct) getAct()).pageId(), jyb.m147494Y("agreement_entrance", "landing_page"));
        if (z) {
            m124226u0();
        }
    }

    @Override // p153l.AbstractC19037o6
    /* JADX INFO: renamed from: n */
    public void mo124213n() {
        bnl0.m105524M(this.f97320s, true);
        bnl0.m105524M(this.f97317p, false);
        bnl0.m105524M(this.f97276A, false);
        bnl0.m105524M(this.f97284I, false);
        bnl0.m105524M(this.f97278C, false);
        bnl0.m105524M(this.f97327z, false);
        bnl0.m105509E0(this.f97320s, this.f97288M.m199502N3(false));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m124214n0(View view) {
        if (this.f97287L.getSelectionStart() == -1 && this.f97287L.getSelectionEnd() == -1) {
            m124227v0();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m124215o0(View view) {
        this.f97288M.m199585y5();
        i4g0.m138520r("e_signin_qq_button", getAct().pageId());
    }

    @Override // p153l.AbstractC19037o6
    /* JADX INFO: renamed from: p */
    public void mo124216p(boolean z) {
        this.f97276A.setEnabled(!z);
        ConstraintLayout constraintLayout = this.f97276A;
        if (z) {
            constraintLayout.setAlpha(0.5f);
        } else {
            constraintLayout.setAlpha(1.0f);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m124217p0(View view) {
        this.f97288M.m199587z5();
        i4g0.m138520r("e_signin_wechat_button", ((PutongAct) getAct()).pageId());
    }

    @Override // p153l.AbstractC19037o6
    /* JADX INFO: renamed from: q */
    public void mo124218q() {
        bnl0.m105509E0(this.f97276A, this.f97288M.m199521U5());
    }

    /* JADX INFO: renamed from: q0 */
    public void m124219q0() {
        i4g0.m138526x("e_signin_phone_button", ((PutongAct) getAct()).pageId());
    }

    @Override // p153l.AbstractC19037o6
    /* JADX INFO: renamed from: r */
    public void mo124220r() {
        this.f97309h.setTypeface(lyh0.m156283c(3), 1);
        bnl0.m105524M(this.f97309h, false);
        if (C16074bp.m105754i()) {
            if (this.f97288M.m199513S3()) {
                bnl0.m105524M(this.f97317p, false);
                bnl0.m105524M(this.f97302a, false);
            }
            if (m124192X()) {
                bnl0.m105524M(this.f97325x, false);
                bnl0.m105524M(this.f97303b, false);
            }
            if (m124193Y()) {
                i4g0.m138526x("e_other_signin_entrance", WXEntryActivity.PID);
            }
            bnl0.m105524M(this.f97309h, m124193Y());
        }
        bnl0.m105524M(this.f97308g, false);
        bnl0.m105509E0(this.f97308g, new View.OnClickListener() { // from class: l.w4q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187430a.m124181d0(view);
            }
        });
        bnl0.m105509E0(this.f97309h, new View.OnClickListener() { // from class: l.x4q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192428a.m124178a0(view);
            }
        });
        bnl0.m105525M0(this.f97311j, true);
        bnl0.m105525M0(this.f97310i, false);
        this.f97294S = this.f97311j;
        try {
            boolean zEquals = TextUtils.equals(Locale.getDefault().getLanguage(), "en");
            VText vText = this.f97311j;
            if (zEquals) {
                vText.setText(vText.getText().toString().toLowerCase());
                this.f97311j.setTextSize(41.0f);
                this.f97311j.setTypeface(Typeface.createFromAsset(getAct().getAssets(), "font/nexa_xbold.ttf"));
            } else {
                vText.setTextSize(32.0f);
                this.f97311j.setTypeface(Typeface.DEFAULT_BOLD);
            }
        } catch (Exception unused) {
        }
        this.f97294S.setAlpha(0.0f);
        this.f97312k.setAlpha(0.0f);
        uqb0.f180374G.m127115L0(this.f97306e, "https://auto.tancdn.com/v1/raw/bd65c5b2-6e7f-4488-9f07-4ef082a1515b11.webp");
        SVGALoader.with(this.f97289N).from("welcome_top.svga").autoPlay(true).repeatCount(1).into(this.f97307f);
        VDraweeView vDraweeView = this.f97306e;
        Property property = View.ALPHA;
        Animator animatorM132166l = gt0.m132166l(vDraweeView, property, 620L, 340L, null, 0.0f, 1.0f);
        Animator animatorM132166l2 = gt0.m132166l(this.f97294S, property, 2120L, 460L, null, 0.0f, 1.0f);
        Animator animatorM132166l3 = gt0.m132166l(this.f97312k, property, 2120L, 460L, null, 0.0f, 1.0f);
        View view = this.f97294S;
        Property property2 = View.TRANSLATION_Y;
        int i = qa00.f156318e;
        gt0.m132180z(animatorM132166l, animatorM132166l2, animatorM132166l3, gt0.m132166l(view, property2, 2120L, 460L, null, i, 0.0f), gt0.m132166l(this.f97312k, property2, 2120L, 460L, null, i, 0.0f)).start();
        if (AccountModule.f16756c.f17051m.get().booleanValue()) {
            bnl0.m105524M(this.f97280E, true);
            this.f97316o.setAlpha(0.0f);
            bnl0.m105509E0(this.f97281F, new View.OnClickListener() { // from class: l.y4q0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f197512a.m124179b0(view2);
                }
            });
            bnl0.m105509E0(this.f97282G, new View.OnClickListener() { // from class: l.z4q0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f202973a.m124180c0(view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m124221r0() {
        bnl0.m105524M(this.f97285J, true);
        this.f97286K.setChecked(FakeSplashView.f55528B);
        if (this.f97286K.isChecked()) {
            m124226u0();
        }
        this.f97286K.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.o4q0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f145003a.m124212m0(compoundButton, z);
            }
        });
        FakeSplashView.f55528B = false;
        bnl0.m105509E0(this.f97287L, new View.OnClickListener() { // from class: l.p4q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150556a.m124214n0(view);
            }
        });
        i4g0.m138492A("e_sign_in_agreement", ((PutongAct) getAct()).pageId(), jyb.m147494Y("agreement_entrance", "landing_page"));
        this.f97287L.setText(q8g0.m175770B(getAct(), "zh".equals(Locale.getDefault().getLanguage()) ? getAct().getString(R$string.f16835O3, String.format(" %s ", getAct().string(R$string.f16992r0)), String.format(" %s", getAct().string(R$string.f16804I2))) : getAct().getString(R$string.f16835O3, getAct().string(R$string.f16992r0), getAct().string(R$string.f16804I2)), getAct().string(R$string.f16992r0), zwk.m221910j(), getAct().string(R$string.f16804I2), zwk.m221909i()));
        this.f97287L.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // p153l.AbstractC19037o6
    /* JADX INFO: renamed from: s */
    public void mo124222s() {
        VText_AutoFit vText_AutoFit = this.f97312k;
        vText_AutoFit.setTypeface(vText_AutoFit.getTypeface(), 1);
        this.f97312k.setText(String.format(getAct().getResources().getString(R$string.f16987q0), m124177W(16497018449L)));
        bnl0.m105524M(this.f97320s, true);
        bnl0.m105524M(this.f97317p, this.f97288M.m199513S3() && !C16074bp.m105754i());
        bnl0.m105524M(this.f97304c, true);
        bnl0.m105548c0(this.f97313l, 0);
        bnl0.m105537U(this.f97320s, (int) (bnl0.m105588w0() * (this.f97288M.m199513S3() ? 0.1f : 0.15f)));
        this.f97320s.setBackgroundResource(bbc0.f75812J1);
        this.f97317p.setBackgroundResource(bbc0.f75812J1);
        bnl0.m105524M(this.f97276A, false);
        bnl0.m105524M(this.f97284I, false);
        bnl0.m105524M(this.f97278C, false);
        bnl0.m105524M(this.f97327z, false);
        bnl0.m105509E0(this.f97320s, this.f97288M.m199502N3(true));
        i4g0.m138526x("e_signin_wechat_button", ((PutongAct) getAct()).pageId());
        i4g0.m138526x("e_signin_phone_button", ((PutongAct) getAct()).pageId());
        bnl0.m105509E0(this.f97317p, new View.OnClickListener() { // from class: l.u4q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177483a.m124217p0(view);
            }
        });
        m124223s0();
    }

    /* JADX INFO: renamed from: s0 */
    public void m124223s0() {
        if (!m124192X() || C16074bp.m105754i()) {
            return;
        }
        bnl0.m105524M(this.f97325x, true);
        bnl0.m105537U(this.f97320s, qa00.f156323j);
        bnl0.m105537U(this.f97325x, (int) (bnl0.m105588w0() * (this.f97288M.m199513S3() ? 0.1f : 0.15f)));
        bnl0.m105509E0(this.f97325x, new View.OnClickListener() { // from class: l.a5q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68632a.m124215o0(view);
            }
        });
        i4g0.m138526x("e_signin_qq_button", getAct().pageId());
        this.f97300Y = true;
    }

    /* JADX INFO: renamed from: t0 */
    public void m124224t0() {
        if (bnl0.m105529O0(this.f97320s)) {
            m124219q0();
        }
        if (bnl0.m105529O0(this.f97276A)) {
            i4g0.m138526x("e_signin_fb_button", ((PutongAct) getAct()).pageId());
        }
        if (bnl0.m105529O0(this.f97278C)) {
            i4g0.m138526x("e_signin_google_button", ((PutongAct) getAct()).pageId());
        }
    }

    @Override // p153l.AbstractC19037o6
    /* JADX INFO: renamed from: u */
    public void mo124225u() {
        this.f97286K.setChecked(true);
        m124226u0();
    }

    /* JADX INFO: renamed from: u0 */
    public void m124226u0() {
        this.f97295T = true;
        l51.m152890J(this.f97297V);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m124227v0() {
        VCheckBox vCheckBox = this.f97286K;
        vCheckBox.setChecked(!vCheckBox.isChecked());
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
