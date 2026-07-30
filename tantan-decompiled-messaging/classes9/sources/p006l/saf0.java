package p006l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.data.RegisterNameEnvelope;
import com.p000p1.mobile.putong.account.p002ui.accountai.SignUpAiAct;
import com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view.AgeView;
import com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view.ChannelRegisterView;
import com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view.GenderView;
import com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view.MediaView;
import com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view.NameView;
import com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view.StepProgressView;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.data.DetectCategoryType;
import com.p1.mobile.putong.data.DetectRequest;
import com.p1.mobile.putong.data.DetectText;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Calendar;
import l.bd50;
import l.bt0;
import l.c4g0;
import l.cwf0;
import l.d30;
import l.e30;
import l.e51;
import l.gbl0;
import l.hpd0;
import l.i0e;
import l.j760;
import l.kqf0;
import l.mkd0;
import l.mqi0;
import l.roj0;
import l.t100;
import l.uqd0;
import l.vqf0;
import l.vwb;
import l.xdl0;
import l.xee;
import l.xh0;
import l.y6q0;
import l.yij0;
import l.zvf0;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VScroll;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class saf0 extends c3f0<z5f0, SignUpAiAct> {

    /* JADX INFO: renamed from: T */
    public static final uqd0 f21175T = new uqd0("sign_up_gender_1", "");

    /* JADX INFO: renamed from: A */
    public VLinear f21176A;

    /* JADX INFO: renamed from: B */
    public View f21177B;

    /* JADX INFO: renamed from: C */
    public Animator f21178C;

    /* JADX INFO: renamed from: D */
    public final ArrayList<Animator> f21179D;

    /* JADX INFO: renamed from: E */
    public Animator f21180E;

    /* JADX INFO: renamed from: F */
    public Animator f21181F;

    /* JADX INFO: renamed from: G */
    public Animator f21182G;

    /* JADX INFO: renamed from: H */
    public Animator f21183H;

    /* JADX INFO: renamed from: I */
    public Animator f21184I;

    /* JADX INFO: renamed from: J */
    public Animator f21185J;

    /* JADX INFO: renamed from: K */
    public Animator f21186K;

    /* JADX INFO: renamed from: L */
    public Animator f21187L;

    /* JADX INFO: renamed from: M */
    public final hpd0 f21188M;

    /* JADX INFO: renamed from: N */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final hpd0 f21189N;

    /* JADX INFO: renamed from: O */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final hpd0 f21190O;

    /* JADX INFO: renamed from: P */
    public int f21191P;

    /* JADX INFO: renamed from: Q */
    public String f21192Q;

    /* JADX INFO: renamed from: R */
    public Runnable f21193R;

    /* JADX INFO: renamed from: S */
    public SignUpData f21194S;

    /* JADX INFO: renamed from: c */
    public View f21195c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f21196d;

    /* JADX INFO: renamed from: e */
    public VFrame f21197e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f21198f;

    /* JADX INFO: renamed from: g */
    public VImage f21199g;

    /* JADX INFO: renamed from: h */
    public VLinear f21200h;

    /* JADX INFO: renamed from: i */
    public VRelative f21201i;

    /* JADX INFO: renamed from: j */
    public VText f21202j;

    /* JADX INFO: renamed from: k */
    public VImage f21203k;

    /* JADX INFO: renamed from: l */
    public VText f21204l;

    /* JADX INFO: renamed from: m */
    public StepProgressView f21205m;

    /* JADX INFO: renamed from: n */
    public VLinear f21206n;

    /* JADX INFO: renamed from: o */
    public VImage f21207o;

    /* JADX INFO: renamed from: p */
    public VText f21208p;

    /* JADX INFO: renamed from: q */
    public VText f21209q;

    /* JADX INFO: renamed from: r */
    public VText f21210r;

    /* JADX INFO: renamed from: s */
    public VText f21211s;

    /* JADX INFO: renamed from: t */
    public VRelative f21212t;

    /* JADX INFO: renamed from: u */
    public VText f21213u;

    /* JADX INFO: renamed from: v */
    public VImage f21214v;

    /* JADX INFO: renamed from: w */
    public VImage f21215w;

    /* JADX INFO: renamed from: x */
    public VImage f21216x;

    /* JADX INFO: renamed from: y */
    public VText f21217y;

    /* JADX INFO: renamed from: z */
    public VScroll f21218z;

    /* JADX INFO: renamed from: l.saf0$a */
    public class C1251a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f21219a;

        public C1251a(d30 d30Var) {
            this.f21219a = d30Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            saf0.this.m23659c2(1);
            xdl0.M0(saf0.this.f21199g, false);
            saf0.this.f21188M.put(Boolean.TRUE);
            if (NullChecker.a(this.f21219a)) {
                this.f21219a.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.saf0$b */
    public class C1252b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Animator f21221a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Animator f21222b;

        public C1252b(Animator animator, Animator animator2) {
            this.f21221a = animator;
            this.f21222b = animator2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.M0(saf0.this.f21207o, true);
            xdl0.M(saf0.this.f21197e, false);
            xdl0.M(saf0.this.f21195c, false);
            bt0.z(new Animator[]{this.f21221a, this.f21222b}).start();
        }
    }

    /* JADX INFO: renamed from: l.saf0$c */
    public class C1253c extends Property<View, Integer> {
        public C1253c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Integer num) {
            saf0.this.f21206n.scrollTo(0, num.intValue());
        }
    }

    /* JADX INFO: renamed from: l.saf0$d */
    public class DialogInterfaceOnDismissListenerC1254d implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f21225a;

        public DialogInterfaceOnDismissListenerC1254d(cwf0 cwf0Var) {
            this.f21225a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.e(this.f21225a);
        }
    }

    public saf0(@NonNull SignUpAiAct signUpAiAct) {
        super(signUpAiAct);
        this.f21179D = new ArrayList<>();
        String str = "show_welcome_1_" + AccountModule.m26F().userId();
        Boolean bool = Boolean.FALSE;
        this.f21188M = new hpd0(str, bool);
        this.f21189N = new hpd0("has_jump_" + AccountModule.m26F().userId(), bool);
        this.f21190O = new hpd0("has_submit_jump_" + AccountModule.m26F().userId(), bool);
        this.f21191P = 0;
        this.f21192Q = "肥冉小朋友";
    }

    /* JADX INFO: renamed from: A0 */
    private void m23543A0() {
        if (((Boolean) this.f21190O.get()).booleanValue()) {
            return;
        }
        ((SignUpAiAct) this.f9323a).duringCreated(AccountModule.f26c.m251s2()).subscribe(mkd0.H(new e30() { // from class: l.v8f0
            public final void call(Object obj) {
                this.f24220a.m23614B0((roj0) obj);
            }
        }, new e30() { // from class: l.w8f0
            public final void call(Object obj) {
                saf0.m23570a0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m23546D0(Boolean bool) {
        if (bool.booleanValue()) {
            yij0.s(this.f9323a, this.f21218z);
            m23650V1();
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m23549G(Throwable th) {
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m23563U() {
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m23565W() {
    }

    /* JADX INFO: renamed from: Z1 */
    private void m23569Z1() {
        if (C0775gp.m15901h()) {
            this.f21189N.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m23570a0(Throwable th) {
    }

    /* JADX INFO: renamed from: a2 */
    private void m23571a2() {
        if (C0775gp.m15901h()) {
            xdl0.M0(this.f21204l, false);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ y6q0 m23573c0(View view, y6q0 y6q0Var) {
        view.setPadding(0, 0, 0, y6q0Var.i());
        return y6q0Var;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [HoldAct extends com.p1.mobile.putong.app.PutongAct, android.content.Context] */
    /* JADX INFO: renamed from: d2 */
    private void m23575d2(String str, String str2, final String str3, final d30 d30Var, final d30 d30Var2) {
        final String str4;
        if ("gender".equals(str3)) {
            str4 = "p_ai_signup_gender_skip_pop";
        } else if ("age".equals(str3)) {
            str4 = "p_ai_signup_age_skip_pop";
        } else if ("name".equals(str3)) {
            str4 = "p_ai_signup_name_skip_pop";
        } else {
            str4 = "photo".equals(str3) ? "p_ai_signup_photo_skip_pop" : "";
        }
        cwf0 cwf0VarC = i0e.c(str4, Dialog.class.getName());
        xh0.a aVarC = new xh0.a((Context) this.f9323a).j(str).r(str2).f("仍要跳过").g(false).m(new DialogInterfaceOnDismissListenerC1254d(cwf0VarC)).h(false).o(new View.OnClickListener() { // from class: l.v9f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24226a.m23616C1(str4, str3, d30Var, view);
            }
        }).c(new View.OnClickListener() { // from class: l.w9f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25051a.m23618E1(str4, str3, d30Var2, view);
            }
        });
        i0e.f(cwf0VarC);
        aVarC.a().g();
    }

    /* JADX INFO: renamed from: e2 */
    private void m23577e2(String str, String str2, boolean z) {
        if ("gender".equals(str2)) {
            zvf0.u("e_ai_signup_gender_skip_pop_again", str, new j760[]{j760.a("skip_gender", z ? "choose_male" : "skip")});
            return;
        }
        if ("age".equals(str2)) {
            zvf0.u("e_ai_signup_age_skip_pop_again", str, new j760[]{j760.a("skip_pop_age", z ? "fill_out" : "skip")});
        } else if ("name".equals(str2)) {
            zvf0.u("e_ai_signup_name_skip_pop_again", str, new j760[]{j760.a("skip_pop_name", z ? "fill_out" : "skip")});
        } else if ("photo".equals(str2)) {
            zvf0.u("e_ai_signup_photo_skip_pop_again", str, new j760[]{j760.a("skip_pop_photo", z ? "fill_out" : "skip")});
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m23581i0() {
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [HoldAct extends com.p1.mobile.putong.app.PutongAct, android.content.Context] */
    /* JADX INFO: renamed from: r */
    private void m23597r() {
        m13096e(this.f21202j);
        ConstraintLayout.a layoutParams = this.f21200h.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = xdl0.F0();
        this.f21200h.setLayoutParams(layoutParams);
        gbl0.y0(this.f21218z, new bd50() { // from class: l.h8f0
            public final y6q0 onApplyWindowInsets(View view, y6q0 y6q0Var) {
                return saf0.m23573c0(view, y6q0Var);
            }
        });
        this.f21205m.setStepCount(4);
        this.f21205m.setSpace(t100.e);
        this.f21205m.setStepAnimationDuration(400);
        this.f21205m.setDefaultStep(0);
        this.f21208p.setAlpha(0.0f);
        this.f21209q.setAlpha(0.0f);
        this.f21210r.setAlpha(0.0f);
        this.f21211s.setAlpha(0.0f);
        this.f21212t.setAlpha(0.0f);
        this.f21178C = C1294t.m24407d(this.f21207o);
        ((z5f0) this.f9324b).duringCreated(Act.keyboardListenerObservable(this.f21177B)).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.s8f0
            public final void call(Object obj) {
                this.f21144a.m23546D0((Boolean) obj);
            }
        }));
        qib0.f19782G.m12744L0(this.f21196d, "https://auto.tancdn.com/v1/raw/904432ed-ba77-4288-8865-1411b792009c10.webp");
        SVGALoader.with((Context) this.f9323a).from("https://auto.tancdn.com/v1/raw/3c15132b-6c3e-487b-b09a-584b39754f2a11.pdf").autoPlay(false).repeatCount(1).into(this.f21198f);
        if (djj0.m14048f()) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f21201i.getLayoutParams();
            layoutParams2.height = t100.v;
            layoutParams2.bottomMargin = 0;
            this.f21201i.setLayoutParams(layoutParams2);
            this.f21202j.setTextSize(14.0f);
            this.f21206n.setPadding(0, t100.i, 0, 0);
        }
    }

    /* JADX INFO: renamed from: A1 */
    public final /* synthetic */ void m23613A1(int i, final AgeView ageView) {
        m23571a2();
        this.f21211s.setText(i + act().getResources().getString(R$string.f203h));
        xdl0.M(this.f21211s, true);
        this.f21211s.setAlpha(0.0f);
        e51.H(mo13092C0(), new Runnable() { // from class: l.x9f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f27398a.m23683z1(ageView);
            }
        }, 200L);
        zvf0.x("e_ai_signup_birthday_response", "p_ai_signup");
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m23614B0(roj0 roj0Var) {
        this.f21190O.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m23615B1(Gender gender, d30 d30Var) {
        m23571a2();
        VText vText = this.f21211s;
        boolean zEquals = TEnum.equals(gender, "male");
        Act act = this.f9323a;
        vText.setText(zEquals ? ((SignUpAiAct) act).getString(R$string.f54E2) : ((SignUpAiAct) act).getString(R$string.f49D2));
        xdl0.M(this.f21211s, true);
        this.f21211s.setAlpha(0.0f);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        zvf0.x("e_ai_signup_gender_response", "p_ai_signup");
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m23616C1(String str, String str2, d30 d30Var, View view) {
        m23577e2(str, str2, true);
        d30Var.call();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m23617E0() {
        ((z5f0) this.f9324b).m28604v1();
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m23618E1(String str, String str2, d30 d30Var, View view) {
        m23577e2(str, str2, false);
        d30Var.call();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m23619F1(String str, d30 d30Var, c4g0 c4g0Var) {
        m23571a2();
        this.f21211s.setText(str);
        xdl0.M(this.f21211s, true);
        this.f21211s.setAlpha(0.0f);
        d30Var.call();
        mkd0.z(c4g0Var);
        zvf0.x("e_ai_signup_name_response", "p_ai_signup");
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m23620G0(NameView nameView, RegisterNameEnvelope registerNameEnvelope) {
        if (NullChecker.a(registerNameEnvelope) && NullChecker.a(registerNameEnvelope.data) && !TextUtils.isEmpty(registerNameEnvelope.data.name)) {
            String str = registerNameEnvelope.data.name;
            this.f21192Q = str;
            nameView.m378W(C0907jy.m17845o0(str));
        }
    }

    /* JADX INFO: renamed from: G1 */
    public final /* synthetic */ void m23621G1(Animator animator, Animator animator2, Animator animator3, Animator animator4) {
        VImage vImage = this.f21207o;
        vImage.setPivotX(vImage.getWidth() / 2);
        VImage vImage2 = this.f21207o;
        vImage2.setPivotY(vImage2.getHeight() / 2);
        bt0.z(new Animator[]{animator, animator2, animator3, animator4}).start();
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [HoldAct extends com.p1.mobile.putong.app.PutongAct, android.content.Context] */
    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m23622H0(Integer num) {
        if (num.intValue() == 0) {
            this.f21210r.setText(((SignUpAiAct) this.f9323a).getString(R$string.f233m));
            this.f21210r.setBackgroundResource(v2c0.f23952D1);
            this.f21210r.setTextColor(act().getResources().getColor(u0c0.f22405l));
            zvf0.v("e_ai_signup_age", "p_ai_signup", new j760[0]);
            return;
        }
        if (num.intValue() == 1) {
            this.f21210r.setText(((SignUpAiAct) this.f9323a).getString(R$string.f233m));
        } else if (num.intValue() == 4) {
            this.f21210r.setText(((SignUpAiAct) this.f9323a).getString(R$string.f239n));
        } else if (num.intValue() == 5) {
            this.f21210r.setText(((SignUpAiAct) this.f9323a).getString(R$string.f245o));
        }
        this.f21210r.setBackgroundResource(v2c0.f23955E1);
        this.f21210r.setTextColor(act().getResources().getColor(u0c0.f22404k));
        C1294t.m24406c(this.f9323a, this.f21210r);
        m23650V1();
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [HoldAct extends com.p1.mobile.putong.app.PutongAct, android.content.Context] */
    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m23623H1(d30 d30Var) {
        kqf0 kqf0Var = new kqf0(this.f21199g, xee.p);
        vqf0 vqf0Var = new vqf0();
        vqf0Var.d(0.3f).f(600.0f);
        kqf0Var.r(vqf0Var).k(0.0f).j(0.5f).o(1.0f);
        kqf0 kqf0Var2 = new kqf0(this.f21199g, xee.q);
        vqf0 vqf0Var2 = new vqf0();
        vqf0Var2.d(0.3f).f(600.0f);
        kqf0Var2.r(vqf0Var2).k(0.0f).j(0.5f).o(1.0f);
        VImage vImage = this.f21199g;
        Property property = View.ALPHA;
        bt0.l(vImage, property, 0L, 130L, new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f), new float[]{0.0f, 1.0f}).start();
        int[] iArr = new int[2];
        this.f21207o.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = t100.o;
        int i3 = i + i2;
        int i4 = iArr[1] + i2;
        this.f21199g.getLocationInWindow(iArr);
        int i5 = iArr[0];
        int i6 = t100.C;
        int i7 = iArr[1] + i6;
        final Animator animatorL = bt0.l(this.f21199g, View.TRANSLATION_X, 0L, 600L, new PathInterpolator(0.42f, 0.0f, 0.2f, 1.0f), new float[]{i3 - (i5 + i6)});
        final Animator animatorL2 = bt0.l(this.f21199g, View.TRANSLATION_Y, 0L, 600L, new PathInterpolator(0.42f, 0.0f, 0.2f, 1.0f), new float[]{i4 - i7});
        final Animator animatorL3 = bt0.l(this.f21199g, bt0.i, 0L, 600L, new PathInterpolator(0.42f, 0.0f, 0.2f, 1.0f), new float[]{1.0f, 0.37037f});
        Animator animatorL4 = bt0.l(this.f21201i, property, 0L, 600L, new PathInterpolator(0.42f, 0.0f, 0.2f, 1.0f), new float[]{0.0f, 1.0f});
        Animator animatorL5 = bt0.l(this.f21205m, property, 0L, 600L, new PathInterpolator(0.42f, 0.0f, 0.2f, 1.0f), new float[]{0.0f, 1.0f});
        final Animator animatorL6 = bt0.l(this.f21196d, property, 0L, 600L, new PathInterpolator(0.42f, 0.0f, 0.2f, 1.0f), new float[]{0.0f, 1.0f});
        animatorL5.addListener(new C1251a(d30Var));
        animatorL.addListener(new C1252b(animatorL4, animatorL5));
        e51.H((Context) this.f9323a, new Runnable() { // from class: l.y9f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f28082a.m23621G1(animatorL, animatorL2, animatorL3, animatorL6);
            }
        }, 2500L);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m23624I0(AgeView ageView, Integer num) {
        m23569Z1();
        m23644S1("");
        m23653X1(num.intValue(), ageView);
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m23625I1(d30 d30Var) {
        this.f21198f.stepToFrame(0.0f, true);
        d30Var.call();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m23626J0(AgeView ageView) {
        ageView.m347Z(this.f9323a);
    }

    /* JADX INFO: renamed from: J1 */
    public final void m23627J1() {
        if (!NullChecker.a(this.f21178C) || this.f21178C.isRunning()) {
            return;
        }
        this.f21178C.start();
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m23628K0() {
        m23644S1("age");
    }

    /* JADX INFO: renamed from: K1 */
    public final void m23629K1(NameView nameView) {
        m23631L1(nameView, false);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m23630L0(AgeView ageView) {
        m23653X1(20, ageView);
        xdl0.M0(this.f21204l, false);
    }

    /* JADX INFO: renamed from: L1 */
    public final void m23631L1(final NameView nameView, boolean z) {
        if (!z) {
            ((SignUpAiAct) this.f9323a).duringCreated(AccountModule.f26c.m216a1()).subscribe(mkd0.H(new e30() { // from class: l.n9f0
                public final void call(Object obj) {
                    this.f17546a.m23620G0(nameView, (RegisterNameEnvelope) obj);
                }
            }, new e30() { // from class: l.p9f0
                public final void call(Object obj) {
                    saf0.m23549G((Throwable) obj);
                }
            }));
            return;
        }
        String strM15144p0 = f8f0.m15144p0(this.f21194S);
        this.f21192Q = strM15144p0;
        nameView.m378W(C0907jy.m17845o0(strM15144p0));
        m23672o1(strM15144p0, null, new d30() { // from class: l.m9f0
            public final void call() {
                this.f16874a.m23617E0();
            }
        }, nameView);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m23632M0(final AgeView ageView, View view) {
        zvf0.u("e_ai_signup_skip_button", ((SignUpAiAct) this.f9323a).pageId(), new j760[]{j760.a("skip_from_which", "age")});
        m23543A0();
        m23575d2("填写“年龄”方便为您匹配更合适的对象，若跳过则默认为“20岁”", "继续填写", "age", new d30() { // from class: l.j9f0
            public final void call() {
                saf0.m23565W();
            }
        }, new d30() { // from class: l.k9f0
            public final void call() {
                this.f15670a.m23630L0(ageView);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [HoldAct extends com.p1.mobile.putong.app.PutongAct, android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, com.p1.mobile.putong.account.ui.accountai.new2021.view.AgeView] */
    /* JADX INFO: renamed from: M1 */
    public void m23633M1(SignUpData signUpData) {
        m23638P1();
        xdl0.M(this.f21208p, true);
        this.f21208p.setText(TEnum.equals(signUpData.gender, "female") ? R$string.f221k : R$string.f227l);
        xdl0.M(this.f21209q, false);
        xdl0.M(this.f21210r, true);
        this.f21210r.setText(act().getString(R$string.f233m));
        xdl0.M(this.f21211s, false);
        xdl0.M(this.f21212t, false);
        this.f21176A.removeAllViews();
        this.f21208p.setText(TEnum.equals(signUpData.gender, "female") ? R$string.f209i : R$string.f215j);
        final ?? ageView = new AgeView(this.f9323a);
        ageView.setAlpha(0.0f);
        this.f21176A.addView(ageView, new ConstraintLayout.a(-1, -2));
        ageView.m348a0(new e30() { // from class: l.oaf0
            public final void call(Object obj) {
                this.f18111a.m23622H0((Integer) obj);
            }
        }, new e30() { // from class: l.paf0
            public final void call(Object obj) {
                this.f18661a.m23624I0(ageView, (Integer) obj);
            }
        });
        Animator animatorL = bt0.l((View) ageView, View.ALPHA, 0L, 400L, (Interpolator) null, new float[]{0.0f, 1.0f});
        bt0.v(animatorL, new Runnable() { // from class: l.qaf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19695a.m23626J0(ageView);
            }
        });
        zvf0.x("e_ai_signup_age", "p_ai_signup");
        Animator animatorS = bt0.s(new Animator[]{C1294t.m24404a(this.f21208p, 0L), C1294t.m24404a(this.f21210r, 600L), animatorL});
        this.f21182G = animatorS;
        animatorS.start();
        this.f21179D.add(this.f21182G);
        bt0.f(this.f21182G, new Runnable() { // from class: l.raf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f20467a.m23628K0();
            }
        });
        m23627J1();
        xdl0.E0(this.f21204l, new View.OnClickListener() { // from class: l.i8f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14306a.m23632M0(ageView, view);
            }
        });
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m23634N0() {
        zvf0.r("e_signup_complete", ((SignUpAiAct) this.f9323a).pageId());
        ((z5f0) this.f9324b).m28585B1();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m23635O0() {
        ((z5f0) this.f9324b).m28591g1(false, true);
        zvf0.r("e_photo_again_upload", ((SignUpAiAct) this.f9323a).pageId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [HoldAct extends com.p1.mobile.putong.app.PutongAct, android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v6, types: [HoldAct extends com.p1.mobile.putong.app.PutongAct, android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.view.View, com.p1.mobile.putong.account.ui.accountai.new2021.view.ChannelRegisterView] */
    /* JADX WARN: Type inference failed for: r4v17, types: [android.view.View, com.p1.mobile.putong.account.ui.accountai.new2021.view.MediaView] */
    /* JADX INFO: renamed from: O1 */
    public void m23636O1(SignUpData signUpData) {
        this.f21194S = signUpData;
        m23648U1();
        xdl0.M(this.f21208p, false);
        xdl0.M(this.f21217y, true);
        m23571a2();
        if (C0775gp.m15900g()) {
            this.f21217y.setText("你还没有上传照片,为了不影响交友体验,记得注册完成后尽快上传头像照片哦～");
        }
        this.f21176A.removeAllViews();
        boolean zM15900g = C0775gp.m15900g();
        HoldAct holdact = this.f9323a;
        if (zM15900g) {
            zvf0.x("e_signup_complete", ((SignUpAiAct) holdact).pageId());
            ?? mediaView = new MediaView(this.f9323a);
            mediaView.setButtonText("注册完成");
            mediaView.setClickListener(new d30() { // from class: l.eaf0
                public final void call() {
                    this.f11032a.m23634N0();
                }
            });
            this.f21176A.addView(mediaView, new ConstraintLayout.a(-1, -2));
        } else {
            zvf0.x("e_photo_again_refuse", ((SignUpAiAct) holdact).pageId());
            zvf0.x("e_photo_again_upload", ((SignUpAiAct) this.f9323a).pageId());
            ?? channelRegisterView = new ChannelRegisterView(this.f9323a);
            channelRegisterView.setUploadClickListener(new d30() { // from class: l.faf0
                public final void call() {
                    this.f12620a.m23635O0();
                }
            });
            channelRegisterView.setRegisterClickListener(new d30() { // from class: l.gaf0
                public final void call() {
                    this.f13133a.m23637P0();
                }
            });
            this.f21176A.addView(channelRegisterView, new ConstraintLayout.a(-1, -2));
        }
        Animator animatorS = bt0.s(new Animator[]{C1294t.m24404a(this.f21217y, 0L)});
        this.f21187L = animatorS;
        animatorS.start();
        this.f21179D.add(this.f21187L);
        m23627J1();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m23637P0() {
        ((z5f0) this.f9324b).m28585B1();
        zvf0.r("e_photo_again_refuse", ((SignUpAiAct) this.f9323a).pageId());
    }

    /* JADX INFO: renamed from: P1 */
    public void m23638P1() {
        C0811hp.m16308h();
        xdl0.M0(this.f21203k, false);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m23639Q0(GenderView genderView) {
        m23644S1("gender");
        genderView.m361S();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View, com.p1.mobile.putong.account.ui.accountai.new2021.view.GenderView] */
    /* JADX WARN: Type inference failed for: r1v4, types: [HoldAct extends com.p1.mobile.putong.app.PutongAct, android.content.Context] */
    /* JADX INFO: renamed from: Q1 */
    public void m23640Q1() {
        ((z5f0) this.f9324b).m12508O0();
        m23638P1();
        xdl0.M(this.f21208p, true);
        this.f21208p.setAlpha(0.0f);
        this.f21208p.setText(R$string.f251p);
        xdl0.M(this.f21209q, true);
        this.f21209q.setAlpha(0.0f);
        this.f21209q.setText(R$string.f256q);
        xdl0.M(this.f21210r, true);
        this.f21210r.setAlpha(0.0f);
        this.f21210r.setText(act().getString(R$string.f261r));
        xdl0.M(this.f21211s, false);
        xdl0.M(this.f21212t, false);
        this.f21176A.removeAllViews();
        final ?? genderView = new GenderView(this.f9323a);
        genderView.setAlpha(0.0f);
        ConstraintLayout.a aVar = new ConstraintLayout.a(-1, -2);
        final d30 d30Var = new d30() { // from class: l.j8f0
            public final void call() {
                this.f15056a.m23654Y0(genderView);
            }
        };
        genderView.setGenderSaveListener(new e30() { // from class: l.k8f0
            public final void call(Object obj) {
                this.f15651a.m23656Z0(d30Var, genderView, (Gender) obj);
            }
        });
        this.f21176A.addView(genderView, aVar);
        m23665g2(new d30() { // from class: l.l8f0
            public final void call() {
                this.f16266a.m23641R0(genderView);
            }
        });
        xdl0.E0(this.f21204l, new View.OnClickListener() { // from class: l.m8f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16855a.m23647U0(d30Var, genderView, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m23641R0(final GenderView genderView) {
        m23627J1();
        Animator animatorS = bt0.s(new Animator[]{C1294t.m24404a(this.f21208p, 0L), C1294t.m24404a(this.f21209q, 2000L), C1294t.m24404a(this.f21210r, 600L), bt0.z(new Animator[]{bt0.l(genderView, View.TRANSLATION_Y, 0L, 400L, (Interpolator) null, new float[]{120.0f, 0.0f}), bt0.l(genderView, View.ALPHA, 0L, 400L, (Interpolator) null, new float[]{0.0f, 1.0f})})});
        this.f21180E = animatorS;
        bt0.f(animatorS, new Runnable() { // from class: l.l9f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16290a.m23639Q0(genderView);
            }
        });
        this.f21180E.start();
        this.f21179D.add(this.f21180E);
        zvf0.x("e_ai_signup_gender", "p_ai_signup");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [android.view.View, com.p1.mobile.putong.account.ui.accountai.new2021.view.MediaView] */
    /* JADX WARN: Type inference failed for: r11v8, types: [HoldAct extends com.p1.mobile.putong.app.PutongAct, android.content.Context] */
    /* JADX INFO: renamed from: R1 */
    public void m23642R1(SignUpData signUpData) {
        this.f21194S = signUpData;
        m23638P1();
        m23648U1();
        if (NullChecker.a(signUpData.gender)) {
            f21175T.put(signUpData.gender.toString());
        } else {
            uqd0 uqd0Var = f21175T;
            if (!TextUtils.isEmpty((CharSequence) uqd0Var.get())) {
                signUpData.gender = Gender.get((String) uqd0Var.get());
            }
        }
        if (f8f0.m15147r0()) {
            m23543A0();
            ((z5f0) this.f9324b).m28585B1();
            return;
        }
        xdl0.M(this.f21208p, true);
        this.f21208p.setText(R$string.f266s);
        xdl0.M(this.f21209q, true);
        this.f21209q.setText(R$string.f271t);
        xdl0.M(this.f21210r, false);
        xdl0.M(this.f21211s, false);
        if (TEnum.equals(signUpData.gender, "male")) {
            this.f21214v.setImageResource(v2c0.f24093z1);
            this.f21215w.setImageResource(v2c0.f23943A1);
            this.f21216x.setImageResource(v2c0.f23946B1);
        } else if (TEnum.equals(signUpData.gender, "female")) {
            this.f21214v.setImageResource(v2c0.f24084w1);
            this.f21215w.setImageResource(v2c0.f24087x1);
            this.f21216x.setImageResource(v2c0.f24090y1);
        }
        xdl0.M(this.f21212t, true);
        this.f21176A.removeAllViews();
        ?? mediaView = new MediaView(this.f9323a);
        mediaView.setAlpha(0.0f);
        mediaView.setClickListener(new d30() { // from class: l.o9f0
            public final void call() {
                this.f18084a.m23657a1();
            }
        });
        this.f21176A.addView(mediaView, new ConstraintLayout.a(-1, -2));
        Animator animatorS = bt0.s(new Animator[]{C1294t.m24404a(this.f21208p, 0L), C1294t.m24404a(this.f21209q, 1200L), C1294t.m24404a(this.f21212t, 600L), bt0.z(new Animator[]{bt0.l((View) mediaView, View.ALPHA, 0L, 400L, (Interpolator) null, new float[]{0.0f, 1.0f})})});
        this.f21186K = animatorS;
        animatorS.start();
        bt0.f(this.f21186K, new Runnable() { // from class: l.z9f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f28678a.m23660d1();
            }
        });
        this.f21179D.add(this.f21186K);
        m23627J1();
        zvf0.x("e_ai_signup_photo", "p_ai_signup");
        xdl0.E0(this.f21204l, new View.OnClickListener() { // from class: l.kaf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15681a.m23662f1(view);
            }
        });
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m23643S0(d30 d30Var, GenderView genderView) {
        m23569Z1();
        m23644S1("");
        m23655Y1(Gender.get("male"), d30Var, genderView);
    }

    /* JADX INFO: renamed from: S1 */
    public void m23644S1(String str) {
        if (!C0775gp.m15901h() || ((Boolean) this.f21189N.get()).booleanValue()) {
            xdl0.M0(this.f21204l, false);
        } else {
            zvf0.A("e_ai_signup_skip_button", ((SignUpAiAct) this.f9323a).pageId(), new j760[]{j760.a("skip_from_which", str)});
            xdl0.M0(this.f21204l, true);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m23645T0(d30 d30Var, GenderView genderView) {
        xdl0.M0(this.f21204l, false);
        m23655Y1(Gender.get("female"), d30Var, genderView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v8, types: [HoldAct extends com.p1.mobile.putong.app.PutongAct, android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, com.p1.mobile.putong.account.ui.accountai.new2021.view.NameView] */
    /* JADX WARN: Type inference failed for: r1v1, types: [HoldAct extends com.p1.mobile.putong.app.PutongAct, android.content.Context] */
    /* JADX INFO: renamed from: T1 */
    public void m23646T1(SignUpData signUpData) {
        this.f21194S = signUpData;
        m23638P1();
        m23648U1();
        if (f8f0.m15147r0()) {
            m23631L1(new NameView(this.f9323a), true);
            return;
        }
        xdl0.M(this.f21208p, true);
        this.f21208p.setText(R$string.f276u);
        xdl0.M(this.f21209q, false);
        xdl0.M(this.f21210r, false);
        xdl0.M(this.f21211s, false);
        xdl0.M(this.f21212t, false);
        final ?? nameView = new NameView(this.f9323a);
        nameView.setAlpha(0.0f);
        ConstraintLayout.a aVar = new ConstraintLayout.a(-1, -2);
        final c4g0 c4g0VarSubscribe = ((z5f0) this.f9324b).duringCreated(Act.keyboardListenerObservable(this.f21177B)).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.x8f0
            public final void call(Object obj) {
                this.f27389a.m23664g1(nameView, (Boolean) obj);
            }
        }));
        final d30 d30Var = new d30() { // from class: l.y8f0
            public final void call() {
                this.f28077a.m23670m1(nameView);
            }
        };
        nameView.m380b0(new e30() { // from class: l.z8f0
            public final void call(Object obj) {
                this.f28675a.m23671n1((String) obj);
            }
        }, new e30() { // from class: l.a9f0
            public final void call(Object obj) {
                this.f8167a.m23672o1(c4g0VarSubscribe, d30Var, nameView, (String) obj);
            }
        });
        this.f21176A.removeAllViews();
        this.f21176A.addView(nameView, aVar);
        Animator animatorL = bt0.l((View) nameView, View.ALPHA, 0L, 400L, (Interpolator) null, new float[]{0.0f, 1.0f});
        bt0.v(animatorL, new Runnable() { // from class: l.b9f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8784a.m23673p1(nameView);
            }
        });
        Animator animatorS = bt0.s(new Animator[]{C1294t.m24404a(this.f21208p, 0L), animatorL});
        this.f21184I = animatorS;
        animatorS.start();
        bt0.f(this.f21184I, new Runnable() { // from class: l.c9f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9548a.m23675r1(nameView);
            }
        });
        this.f21179D.add(this.f21184I);
        m23627J1();
        zvf0.x("e_ai_signup_name", "p_ai_signup");
        xdl0.E0(this.f21204l, new View.OnClickListener() { // from class: l.e9f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11018a.m23677t1(nameView, c4g0VarSubscribe, d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m23647U0(final d30 d30Var, final GenderView genderView, View view) {
        zvf0.u("e_ai_signup_skip_button", ((SignUpAiAct) this.f9323a).pageId(), new j760[]{j760.a("skip_from_which", "gender")});
        m23543A0();
        m23575d2("系统默认您为“女性”方便为您精准匹配用户，性别更改机会只有一次", "我是男生", "gender", new d30() { // from class: l.h9f0
            public final void call() {
                this.f13762a.m23643S0(d30Var, genderView);
            }
        }, new d30() { // from class: l.i9f0
            public final void call() {
                this.f14323a.m23645T0(d30Var, genderView);
            }
        });
    }

    /* JADX INFO: renamed from: U1 */
    public final void m23648U1() {
        if (this.f21191P != 0) {
            this.f21206n.scrollTo(0, 0);
            this.f21191P = 0;
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m23649V0() {
        m23659c2(2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [HoldAct extends com.p1.mobile.putong.app.PutongAct, android.content.Context] */
    /* JADX INFO: renamed from: V1 */
    public final void m23650V1() {
        if (this.f21193R == null) {
            this.f21193R = new Runnable() { // from class: l.d9f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10239a.m23678u1();
                }
            };
        }
        e51.J(this.f21193R);
        e51.H((Context) this.f9323a, this.f21193R, 300L);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m23651W0() {
        ((z5f0) this.f9324b).m28604v1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m23652X0(GenderView genderView) {
        VText vText = this.f21211s;
        vText.setPivotX(vText.getWidth());
        VText vText2 = this.f21211s;
        vText2.setPivotY(vText2.getHeight());
        Animator animatorM24408e = C1294t.m24408e(400L, this.f21208p, this.f21209q, this.f21210r, this.f21211s, this.f21212t);
        bt0.v(animatorM24408e, new Runnable() { // from class: l.r9f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f20423a.m23649V0();
            }
        });
        Animator animatorS = bt0.s(new Animator[]{bt0.z(new Animator[]{bt0.l(genderView, View.ALPHA, 200L, 400L, (Interpolator) null, new float[]{1.0f, 0.0f}), C1294t.m24405b(this.f21211s, 400L)}), animatorM24408e});
        this.f21181F = animatorS;
        bt0.f(animatorS, new Runnable() { // from class: l.s9f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21158a.m23651W0();
            }
        });
        this.f21181F.start();
        this.f21179D.add(this.f21181F);
    }

    /* JADX INFO: renamed from: X1 */
    public final void m23653X1(final int i, final AgeView ageView) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mqi0.o());
        calendar.set(1, calendar.get(1) - i);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        AccountModule.f26c.m225e2(calendar.getTimeInMillis());
        AccountModule.f26c.m221c2(i);
        ((z5f0) this.f9324b).m12503H0(AccountTempApi.SignUpType.birthInfoSaved, new d30() { // from class: l.t8f0
            public final void call() {
                this.f21953a.m23613A1(i, ageView);
            }
        }, new e30() { // from class: l.u8f0
            public final void call(Object obj) {
                ageView.m345V();
            }
        });
        zvf0.u("e_ai_signup_age", "p_ai_signup", new j760[]{vwb.Y("user_age", Integer.valueOf(i))});
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m23654Y0(final GenderView genderView) {
        e51.H(mo13092C0(), new Runnable() { // from class: l.n8f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17535a.m23652X0(genderView);
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m23655Y1(final Gender gender, final d30 d30Var, final GenderView genderView) {
        ((z5f0) this.f9324b).m28588E1(gender);
        ((z5f0) this.f9324b).m12503H0(AccountTempApi.SignUpType.genderInfoSave, new d30() { // from class: l.o8f0
            public final void call() {
                this.f18073a.m23615B1(gender, d30Var);
            }
        }, new e30() { // from class: l.p8f0
            public final void call(Object obj) {
                genderView.m361S();
            }
        });
        zvf0.u("e_ai_signup_gender", "p_ai_signup", new j760[]{j760.a("ai_signup_gender", TEnum.equals(gender, "male") ? "male" : "female")});
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m23656Z0(d30 d30Var, GenderView genderView, Gender gender) {
        m23569Z1();
        m23644S1("");
        m23655Y1(gender, d30Var, genderView);
        ((z5f0) this.f9324b).m12508O0();
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m23657a1() {
        boolean zEquals = TextUtils.equals("DouyinTantan01", mr4.m19499b());
        Presenter presenter = this.f9324b;
        if (zEquals) {
            ((z5f0) presenter).m28591g1(false, true);
        } else {
            ((z5f0) presenter).m28591g1(false, false);
        }
        zvf0.r("e_ai_signup_photo", "p_ai_signup");
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public final void m23672o1(String str, c4g0 c4g0Var, d30 d30Var, NameView nameView) {
        AccountModule.f26c.m234j2(str);
        m23663f2(nameView, c4g0Var, d30Var, str);
        zvf0.r("e_ai_signup_name", "p_ai_signup");
    }

    /* JADX INFO: renamed from: c2 */
    public void m23659c2(int i) {
        if (f8f0.m15147r0()) {
            i = Math.min(2, i);
        }
        if (i < 0) {
            return;
        }
        this.f21205m.setDefaultStep(i - 1);
        if (i < 1) {
            return;
        }
        this.f21205m.setTargetStep(i);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m23660d1() {
        if (C0775gp.m15901h()) {
            xdl0.M0(this.f21204l, true);
            zvf0.A("e_ai_signup_skip_button", ((SignUpAiAct) this.f9323a).pageId(), new j760[]{j760.a("skip_from_which", "photo")});
        }
    }

    @Override // p006l.c3f0
    public void destroy() {
        super.destroy();
        if (NullChecker.a(this.f21178C)) {
            this.f21178C.cancel();
        }
        int i = 0;
        while (true) {
            int size = this.f21179D.size();
            ArrayList<Animator> arrayList = this.f21179D;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            if (NullChecker.a(arrayList.get(i)) && this.f21179D.get(i).isRunning()) {
                this.f21179D.get(i).cancel();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m23661e1() {
        ((z5f0) this.f9324b).m28585B1();
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m23662f1(View view) {
        zvf0.u("e_ai_signup_skip_button", ((SignUpAiAct) this.f9323a).pageId(), new j760[]{j760.a("skip_from_which", "photo")});
        m23543A0();
        m23575d2("跳过将会影响您进入后匹配用户的体验", "继续上传", "photo", new d30() { // from class: l.f9f0
            public final void call() {
                saf0.m23581i0();
            }
        }, new d30() { // from class: l.g9f0
            public final void call() {
                this.f13118a.m23661e1();
            }
        });
    }

    /* JADX INFO: renamed from: f2 */
    public final void m23663f2(final NameView nameView, final c4g0 c4g0Var, final d30 d30Var, final String str) {
        DetectRequest detectRequestNew_ = DetectRequest.new_();
        detectRequestNew_.category = DetectCategoryType.get("login");
        DetectText detectTextNew_ = DetectText.new_();
        detectTextNew_.key = "nikeName";
        detectTextNew_.value = str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(detectTextNew_);
        detectRequestNew_.text = arrayList;
        ((z5f0) this.f9324b).m12509P0(detectRequestNew_, nameView, AccountTempApi.SignUpType.nameInfoSaved, new d30() { // from class: l.aaf0
            public final void call() {
                this.f8182a.m23619F1(str, d30Var, c4g0Var);
            }
        }, new e30() { // from class: l.baf0
            public final void call(Object obj) {
                nameView.m376T();
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m23664g1(NameView nameView, Boolean bool) {
        if (bool.booleanValue()) {
            nameView.m379a0(this.f9323a);
        } else {
            nameView.m377V();
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [HoldAct extends com.p1.mobile.putong.app.PutongAct, android.content.Context] */
    /* JADX INFO: renamed from: g2 */
    public final void m23665g2(final d30 d30Var) {
        if (((Boolean) this.f21188M.get()).booleanValue()) {
            m23659c2(1);
            if (NullChecker.a(d30Var)) {
                d30Var.call();
                return;
            }
            return;
        }
        xdl0.M(this.f21197e, true);
        this.f21199g.setAlpha(0.0f);
        this.f21196d.setAlpha(0.0f);
        this.f21195c.setVisibility(0);
        xdl0.M0(this.f21207o, false);
        this.f21201i.setAlpha(0.0f);
        this.f21205m.setAlpha(0.0f);
        final d30 d30Var2 = new d30() { // from class: l.q8f0
            public final void call() {
                this.f19671a.m23623H1(d30Var);
            }
        };
        e51.H((Context) this.f9323a, new Runnable() { // from class: l.r8f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f20410a.m23625I1(d30Var2);
            }
        }, 500L);
        zvf0.x("e_ai_appear", "p_ai_signup");
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m23666h1() {
        act().hideInput(this.f21177B);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f21177B = m23682z0(layoutInflater, viewGroup);
        m23597r();
        return this.f21177B;
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m23667j1() {
        m23659c2(4);
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m23668k1() {
        ((z5f0) this.f9324b).m28604v1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m23669l1(NameView nameView) {
        Animator animatorL = bt0.l(nameView, View.ALPHA, 200L, 400L, (Interpolator) null, new float[]{1.0f, 0.0f});
        bt0.f(animatorL, new Runnable() { // from class: l.haf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13777a.m23666h1();
            }
        });
        Animator animatorM24408e = C1294t.m24408e(400L, this.f21208p, this.f21209q, this.f21210r, this.f21211s, this.f21212t);
        bt0.v(animatorM24408e, new Runnable() { // from class: l.iaf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14346a.m23667j1();
            }
        });
        Animator animatorS = bt0.s(new Animator[]{bt0.z(new Animator[]{animatorL, C1294t.m24405b(this.f21211s, 400L)}), animatorM24408e});
        this.f21185J = animatorS;
        bt0.f(animatorS, new Runnable() { // from class: l.jaf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f15093a.m23668k1();
            }
        });
        this.f21185J.start();
        this.f21179D.add(this.f21185J);
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m23670m1(final NameView nameView) {
        e51.H(mo13092C0(), new Runnable() { // from class: l.q9f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19683a.m23669l1(nameView);
            }
        }, 200L);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [HoldAct extends com.p1.mobile.putong.app.PutongAct, android.content.Context] */
    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m23671n1(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f21210r;
        if (zIsEmpty) {
            xdl0.M(vText, false);
            zvf0.v("e_ai_signup_name", "p_ai_signup", new j760[0]);
            return;
        }
        vText.setText(str);
        this.f21210r.setBackgroundResource(v2c0.f23955E1);
        this.f21210r.setTextColor(((SignUpAiAct) this.f9323a).getResources().getColor(u0c0.f22404k));
        xdl0.M(this.f21210r, true);
        this.f21210r.setAlpha(1.0f);
        C1294t.m24406c(this.f9323a, this.f21210r);
        m23650V1();
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m23673p1(NameView nameView) {
        nameView.m379a0(this.f9323a);
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m23674q1(NameView nameView, View view) {
        zvf0.r("e_ai_signup_chage_name_button", ((SignUpAiAct) this.f9323a).pageId());
        m23629K1(nameView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m23675r1(final NameView nameView) {
        if (C0775gp.m15901h()) {
            m23644S1("name");
            nameView.setEditViewPadding(true);
            xdl0.M(nameView.f400e, true);
            xdl0.E0(nameView.f400e, new View.OnClickListener() { // from class: l.caf0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9562a.m23674q1(nameView, view);
                }
            });
        } else {
            nameView.setEditViewPadding(false);
            xdl0.M(nameView.f400e, false);
        }
        if (!TextUtils.isEmpty((CharSequence) AccountModule.f26c.m185I2().get())) {
            nameView.post(new Runnable() { // from class: l.daf0
                @Override // java.lang.Runnable
                public final void run() {
                    nameView.m378W(C0907jy.m17845o0((String) AccountModule.f26c.m185I2().get()));
                }
            });
        } else if (C0775gp.m15901h()) {
            m23629K1(nameView);
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m23676s1(NameView nameView, c4g0 c4g0Var, d30 d30Var) {
        xdl0.M0(this.f21204l, false);
        m23672o1(!TextUtils.isEmpty(nameView.getLastName()) ? nameView.getLastName() : this.f21192Q, c4g0Var, d30Var, nameView);
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m23677t1(final NameView nameView, final c4g0 c4g0Var, final d30 d30Var, View view) {
        zvf0.u("e_ai_signup_skip_button", ((SignUpAiAct) this.f9323a).pageId(), new j760[]{j760.a("skip_from_which", "name")});
        m23543A0();
        m23575d2("填写“昵称”方便别人更快记住你，若仍要跳过，系统将随机展示昵称，您可进入后自行更改", "继续填写", "name", new d30() { // from class: l.t9f0
            public final void call() {
                saf0.m23563U();
            }
        }, new d30() { // from class: l.u9f0
            public final void call() {
                this.f23441a.m23676s1(nameView, c4g0Var, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m23678u1() {
        int i;
        int height;
        if (!NullChecker.a(act()) || act().isFinishing()) {
            return;
        }
        int[] iArr = new int[2];
        this.f21218z.getLocationInWindow(iArr);
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        if (xdl0.O0(this.f21210r)) {
            this.f21210r.getLocationInWindow(iArr2);
            i = iArr2[1];
            height = this.f21210r.getHeight();
        } else if (xdl0.O0(this.f21209q)) {
            this.f21209q.getLocationInWindow(iArr2);
            i = iArr2[1];
            height = this.f21209q.getHeight();
        } else {
            this.f21208p.getLocationInWindow(iArr2);
            i = iArr2[1];
            height = this.f21208p.getHeight();
        }
        int i3 = i + height;
        if (i2 < i3) {
            this.f21191P = (i3 - i2) + this.f21206n.getScrollY();
            bt0.m(this.f21206n, new C1253c(Integer.TYPE, ""), 0L, 200L, (Interpolator) null, new int[]{this.f21206n.getScrollY(), this.f21191P}).start();
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m23679v1() {
        act().hideInput(this.f21177B);
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m23680w1() {
        m23659c2(3);
    }

    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ void m23681y1() {
        ((z5f0) this.f9324b).m28604v1();
    }

    /* JADX INFO: renamed from: z0 */
    public View m23682z0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return taf0.m24563b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m23683z1(AgeView ageView) {
        Animator animatorL = bt0.l(ageView, View.ALPHA, 200L, 400L, (Interpolator) null, new float[]{1.0f, 0.0f});
        bt0.f(animatorL, new Runnable() { // from class: l.laf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16311a.m23679v1();
            }
        });
        Animator animatorM24408e = C1294t.m24408e(400L, this.f21208p, this.f21209q, this.f21210r, this.f21211s, this.f21212t);
        bt0.v(animatorM24408e, new Runnable() { // from class: l.maf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16883a.m23680w1();
            }
        });
        Animator animatorS = bt0.s(new Animator[]{bt0.z(new Animator[]{animatorL, C1294t.m24405b(this.f21211s, 400L)}), animatorM24408e});
        this.f21183H = animatorS;
        bt0.f(animatorS, new Runnable() { // from class: l.naf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17567a.m23681y1();
            }
        });
        this.f21183H.start();
        this.f21179D.add(this.f21183H);
    }
}
