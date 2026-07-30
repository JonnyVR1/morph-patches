package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.data.RegisterNameEnvelope;
import com.p046p1.mobile.putong.account.p050ui.accountai.SignUpAiAct;
import com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view.AgeView;
import com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view.ChannelRegisterView;
import com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view.GenderView;
import com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view.MediaView;
import com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view.NameView;
import com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view.StepProgressView;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.DetectRequest;
import com.p046p1.mobile.putong.data.DetectText;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.SeeTextDynamicParam;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Calendar;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class saf0 extends c3f0<z5f0, SignUpAiAct> {

    /* JADX INFO: renamed from: T */
    public static final uqd0 f163352T = new uqd0("sign_up_gender_1", "");

    /* JADX INFO: renamed from: A */
    public VLinear f163353A;

    /* JADX INFO: renamed from: B */
    public View f163354B;

    /* JADX INFO: renamed from: C */
    public Animator f163355C;

    /* JADX INFO: renamed from: D */
    public final ArrayList<Animator> f163356D;

    /* JADX INFO: renamed from: E */
    public Animator f163357E;

    /* JADX INFO: renamed from: F */
    public Animator f163358F;

    /* JADX INFO: renamed from: G */
    public Animator f163359G;

    /* JADX INFO: renamed from: H */
    public Animator f163360H;

    /* JADX INFO: renamed from: I */
    public Animator f163361I;

    /* JADX INFO: renamed from: J */
    public Animator f163362J;

    /* JADX INFO: renamed from: K */
    public Animator f163363K;

    /* JADX INFO: renamed from: L */
    public Animator f163364L;

    /* JADX INFO: renamed from: M */
    public final hpd0 f163365M;

    /* JADX INFO: renamed from: N */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final hpd0 f163366N;

    /* JADX INFO: renamed from: O */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final hpd0 f163367O;

    /* JADX INFO: renamed from: P */
    public int f163368P;

    /* JADX INFO: renamed from: Q */
    public String f163369Q;

    /* JADX INFO: renamed from: R */
    public Runnable f163370R;

    /* JADX INFO: renamed from: S */
    public SignUpData f163371S;

    /* JADX INFO: renamed from: c */
    public View f163372c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f163373d;

    /* JADX INFO: renamed from: e */
    public VFrame f163374e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f163375f;

    /* JADX INFO: renamed from: g */
    public VImage f163376g;

    /* JADX INFO: renamed from: h */
    public VLinear f163377h;

    /* JADX INFO: renamed from: i */
    public VRelative f163378i;

    /* JADX INFO: renamed from: j */
    public VText f163379j;

    /* JADX INFO: renamed from: k */
    public VImage f163380k;

    /* JADX INFO: renamed from: l */
    public VText f163381l;

    /* JADX INFO: renamed from: m */
    public StepProgressView f163382m;

    /* JADX INFO: renamed from: n */
    public VLinear f163383n;

    /* JADX INFO: renamed from: o */
    public VImage f163384o;

    /* JADX INFO: renamed from: p */
    public VText f163385p;

    /* JADX INFO: renamed from: q */
    public VText f163386q;

    /* JADX INFO: renamed from: r */
    public VText f163387r;

    /* JADX INFO: renamed from: s */
    public VText f163388s;

    /* JADX INFO: renamed from: t */
    public VRelative f163389t;

    /* JADX INFO: renamed from: u */
    public VText f163390u;

    /* JADX INFO: renamed from: v */
    public VImage f163391v;

    /* JADX INFO: renamed from: w */
    public VImage f163392w;

    /* JADX INFO: renamed from: x */
    public VImage f163393x;

    /* JADX INFO: renamed from: y */
    public VText f163394y;

    /* JADX INFO: renamed from: z */
    public VScroll f163395z;

    /* JADX INFO: renamed from: l.saf0$a */
    public class C19888a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f163396a;

        public C19888a(d30 d30Var) {
            this.f163396a = d30Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            saf0.this.m183031c2(1);
            xdl0.m208345M0(saf0.this.f163376g, false);
            saf0.this.f163365M.put(Boolean.TRUE);
            if (NullChecker.m81303a(this.f163396a)) {
                this.f163396a.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.saf0$b */
    public class C19889b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Animator f163398a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Animator f163399b;

        public C19889b(Animator animator, Animator animator2) {
            this.f163398a = animator;
            this.f163399b = animator2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.m208345M0(saf0.this.f163384o, true);
            xdl0.m208344M(saf0.this.f163374e, false);
            xdl0.m208344M(saf0.this.f163372c, false);
            bt0.m103753z(this.f163398a, this.f163399b).start();
        }
    }

    /* JADX INFO: renamed from: l.saf0$c */
    public class C19890c extends Property<View, Integer> {
        public C19890c(Class cls, String str) {
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
            saf0.this.f163383n.scrollTo(0, num.intValue());
        }
    }

    /* JADX INFO: renamed from: l.saf0$d */
    public class DialogInterfaceOnDismissListenerC19891d implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f163402a;

        public DialogInterfaceOnDismissListenerC19891d(cwf0 cwf0Var) {
            this.f163402a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f163402a);
        }
    }

    public saf0(@NonNull SignUpAiAct signUpAiAct) {
        super(signUpAiAct);
        this.f163356D = new ArrayList<>();
        String str = "show_welcome_1_" + AccountModule.m28131F().userId();
        Boolean bool = Boolean.FALSE;
        this.f163365M = new hpd0(str, bool);
        this.f163366N = new hpd0("has_jump_" + AccountModule.m28131F().userId(), bool);
        this.f163367O = new hpd0("has_submit_jump_" + AccountModule.m28131F().userId(), bool);
        this.f163368P = 0;
        this.f163369Q = "肥冉小朋友";
    }

    /* JADX INFO: renamed from: A0 */
    private void m182915A0() {
        if (this.f163367O.get().booleanValue()) {
            return;
        }
        ((SignUpAiAct) this.f78941a).duringCreated(AccountModule.f16037c.m28356s2()).subscribe(mkd0.m154956H(new e30() { // from class: l.v8f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180490a.m182986B0((roj0) obj);
            }
        }, new e30() { // from class: l.w8f0
            @Override // p149l.e30
            public final void call(Object obj) {
                saf0.m182942a0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m182918D0(Boolean bool) {
        if (bool.booleanValue()) {
            yij0.m214963s(this.f78941a, this.f163395z);
            m183022V1();
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m182921G(Throwable th) {
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m182935U() {
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m182937W() {
    }

    /* JADX INFO: renamed from: Z1 */
    private void m182941Z1() {
        if (C17133gp.m127317h()) {
            this.f163366N.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m182942a0(Throwable th) {
    }

    /* JADX INFO: renamed from: a2 */
    private void m182943a2() {
        if (C17133gp.m127317h()) {
            xdl0.m208345M0(this.f163381l, false);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ y6q0 m182945c0(View view, y6q0 y6q0Var) {
        view.setPadding(0, 0, 0, y6q0Var.m213182i());
        return y6q0Var;
    }

    /* JADX INFO: renamed from: d2 */
    private void m182947d2(String str, String str2, final String str3, final d30 d30Var, final d30 d30Var2) {
        final String str4;
        if ("gender".equals(str3)) {
            str4 = "p_ai_signup_gender_skip_pop";
        } else if (SeeTextDynamicParam.age.equals(str3)) {
            str4 = "p_ai_signup_age_skip_pop";
        } else if (AuthenticationTokenClaims.JSON_KEY_NAME.equals(str3)) {
            str4 = "p_ai_signup_name_skip_pop";
        } else {
            str4 = ReminderAction.photo.equals(str3) ? "p_ai_signup_photo_skip_pop" : "";
        }
        cwf0 cwf0VarM133794c = i0e.m133794c(str4, Dialog.class.getName());
        xh0.C21150a c21150aM208724c = new xh0.C21150a(this.f78941a).m208731j(str).m208739r(str2).m208727f("仍要跳过").m208728g(false).m208734m(new DialogInterfaceOnDismissListenerC19891d(cwf0VarM133794c)).m208729h(false).m208736o(new View.OnClickListener() { // from class: l.v9f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180637a.m182988C1(str4, str3, d30Var, view);
            }
        }).m208724c(new View.OnClickListener() { // from class: l.w9f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185347a.m182990E1(str4, str3, d30Var2, view);
            }
        });
        i0e.m133797f(cwf0VarM133794c);
        c21150aM208724c.m208722a().m208721g();
    }

    /* JADX INFO: renamed from: e2 */
    private void m182949e2(String str, String str2, boolean z) {
        boolean zEquals = "gender".equals(str2);
        String str3 = FreeSpaceBox.TYPE;
        if (zEquals) {
            if (z) {
                str3 = "choose_male";
            }
            zvf0.m220399u("e_ai_signup_gender_skip_pop_again", str, j760.m140076a("skip_gender", str3));
            return;
        }
        if (SeeTextDynamicParam.age.equals(str2)) {
            if (z) {
                str3 = "fill_out";
            }
            zvf0.m220399u("e_ai_signup_age_skip_pop_again", str, j760.m140076a("skip_pop_age", str3));
        } else if (AuthenticationTokenClaims.JSON_KEY_NAME.equals(str2)) {
            if (z) {
                str3 = "fill_out";
            }
            zvf0.m220399u("e_ai_signup_name_skip_pop_again", str, j760.m140076a("skip_pop_name", str3));
        } else if (ReminderAction.photo.equals(str2)) {
            if (z) {
                str3 = "fill_out";
            }
            zvf0.m220399u("e_ai_signup_photo_skip_pop_again", str, j760.m140076a("skip_pop_photo", str3));
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m182953i0() {
    }

    /* JADX INFO: renamed from: r */
    private void m182969r() {
        m105018e(this.f163379j);
        ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) this.f163377h.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0220a).topMargin = xdl0.m208331F0();
        this.f163377h.setLayoutParams(c0220a);
        gbl0.m125231y0(this.f163395z, new bd50() { // from class: l.h8f0
            @Override // p149l.bd50
            public final y6q0 onApplyWindowInsets(View view, y6q0 y6q0Var) {
                return saf0.m182945c0(view, y6q0Var);
            }
        });
        this.f163382m.setStepCount(4);
        this.f163382m.setSpace(t100.f167256e);
        this.f163382m.setStepAnimationDuration(400);
        this.f163382m.setDefaultStep(0);
        this.f163385p.setAlpha(0.0f);
        this.f163386q.setAlpha(0.0f);
        this.f163387r.setAlpha(0.0f);
        this.f163388s.setAlpha(0.0f);
        this.f163389t.setAlpha(0.0f);
        this.f163355C = C20087t.m186805d(this.f163384o);
        ((z5f0) this.f78942b).duringCreated(Act.keyboardListenerObservable(this.f163354B)).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.s8f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163057a.m182918D0((Boolean) obj);
            }
        }));
        qib0.f154691G.m102331L0(this.f163373d, "https://auto.tancdn.com/v1/raw/904432ed-ba77-4288-8865-1411b792009c10.webp");
        SVGALoader.with(this.f78941a).from("https://auto.tancdn.com/v1/raw/3c15132b-6c3e-487b-b09a-584b39754f2a11.pdf").autoPlay(false).repeatCount(1).into(this.f163375f);
        if (djj0.m112085f()) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f163378i.getLayoutParams();
            layoutParams.height = t100.f167273v;
            layoutParams.bottomMargin = 0;
            this.f163378i.setLayoutParams(layoutParams);
            this.f163379j.setTextSize(14.0f);
            this.f163383n.setPadding(0, t100.f167260i, 0, 0);
        }
    }

    /* JADX INFO: renamed from: A1 */
    public final /* synthetic */ void m182985A1(int i, final AgeView ageView) {
        m182943a2();
        this.f163388s.setText(i + act().getResources().getString(R$string.f16214h));
        xdl0.m208344M(this.f163388s, true);
        this.f163388s.setAlpha(0.0f);
        e51.m114743H(getContext(), new Runnable() { // from class: l.x9f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f191621a.m183055z1(ageView);
            }
        }, 200L);
        zvf0.m220402x("e_ai_signup_birthday_response", "p_ai_signup");
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m182986B0(roj0 roj0Var) {
        this.f163367O.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m182987B1(Gender gender, d30 d30Var) {
        m182943a2();
        VText vText = this.f163388s;
        boolean zEquals = TEnum.equals(gender, "male");
        HoldAct holdact = this.f78941a;
        vText.setText(zEquals ? ((SignUpAiAct) holdact).getString(R$string.f16065E2) : ((SignUpAiAct) holdact).getString(R$string.f16060D2));
        xdl0.m208344M(this.f163388s, true);
        this.f163388s.setAlpha(0.0f);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        zvf0.m220402x("e_ai_signup_gender_response", "p_ai_signup");
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m182988C1(String str, String str2, d30 d30Var, View view) {
        m182949e2(str, str2, true);
        d30Var.call();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m182989E0() {
        ((z5f0) this.f78942b).m217333v1();
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m182990E1(String str, String str2, d30 d30Var, View view) {
        m182949e2(str, str2, false);
        d30Var.call();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m182991F1(String str, d30 d30Var, c4g0 c4g0Var) {
        m182943a2();
        this.f163388s.setText(str);
        xdl0.m208344M(this.f163388s, true);
        this.f163388s.setAlpha(0.0f);
        d30Var.call();
        mkd0.m154992z(c4g0Var);
        zvf0.m220402x("e_ai_signup_name_response", "p_ai_signup");
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m182992G0(NameView nameView, RegisterNameEnvelope registerNameEnvelope) {
        if (NullChecker.m81303a(registerNameEnvelope) && NullChecker.m81303a(registerNameEnvelope.data) && !TextUtils.isEmpty(registerNameEnvelope.data.name)) {
            String str = registerNameEnvelope.data.name;
            this.f163369Q = str;
            nameView.m28482W(C17890jy.m143837o0(str));
        }
    }

    /* JADX INFO: renamed from: G1 */
    public final /* synthetic */ void m182993G1(Animator animator, Animator animator2, Animator animator3, Animator animator4) {
        VImage vImage = this.f163384o;
        vImage.setPivotX(vImage.getWidth() / 2);
        VImage vImage2 = this.f163384o;
        vImage2.setPivotY(vImage2.getHeight() / 2);
        bt0.m103753z(animator, animator2, animator3, animator4).start();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m182994H0(Integer num) {
        if (num.intValue() == 0) {
            this.f163387r.setText(((SignUpAiAct) this.f78941a).getString(R$string.f16244m));
            this.f163387r.setBackgroundResource(v2c0.f179388D1);
            this.f163387r.setTextColor(act().getResources().getColor(u0c0.f172891l));
            zvf0.m220400v("e_ai_signup_age", "p_ai_signup", new j760[0]);
            return;
        }
        if (num.intValue() == 1) {
            this.f163387r.setText(((SignUpAiAct) this.f78941a).getString(R$string.f16244m));
        } else if (num.intValue() == 4) {
            this.f163387r.setText(((SignUpAiAct) this.f78941a).getString(R$string.f16250n));
        } else if (num.intValue() == 5) {
            this.f163387r.setText(((SignUpAiAct) this.f78941a).getString(R$string.f16256o));
        }
        this.f163387r.setBackgroundResource(v2c0.f179391E1);
        this.f163387r.setTextColor(act().getResources().getColor(u0c0.f172890k));
        C20087t.m186804c(this.f78941a, this.f163387r);
        m183022V1();
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m182995H1(d30 d30Var) {
        kqf0 kqf0Var = new kqf0(this.f163376g, xee.f192568p);
        vqf0 vqf0Var = new vqf0();
        vqf0Var.m199490d(0.3f).m199492f(600.0f);
        kqf0Var.m146943r(vqf0Var).m208548k(0.0f).m208547j(0.5f).m146940o(1.0f);
        kqf0 kqf0Var2 = new kqf0(this.f163376g, xee.f192569q);
        vqf0 vqf0Var2 = new vqf0();
        vqf0Var2.m199490d(0.3f).m199492f(600.0f);
        kqf0Var2.m146943r(vqf0Var2).m208548k(0.0f).m208547j(0.5f).m146940o(1.0f);
        VImage vImage = this.f163376g;
        Property property = View.ALPHA;
        bt0.m103739l(vImage, property, 0L, 130L, new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f), 0.0f, 1.0f).start();
        int[] iArr = new int[2];
        this.f163384o.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = t100.f167266o;
        int i3 = i + i2;
        int i4 = iArr[1] + i2;
        this.f163376g.getLocationInWindow(iArr);
        int i5 = iArr[0];
        int i6 = t100.f167228C;
        int i7 = iArr[1] + i6;
        final Animator animatorM103739l = bt0.m103739l(this.f163376g, View.TRANSLATION_X, 0L, 600L, new PathInterpolator(0.42f, 0.0f, 0.2f, 1.0f), i3 - (i5 + i6));
        final Animator animatorM103739l2 = bt0.m103739l(this.f163376g, View.TRANSLATION_Y, 0L, 600L, new PathInterpolator(0.42f, 0.0f, 0.2f, 1.0f), i4 - i7);
        final Animator animatorM103739l3 = bt0.m103739l(this.f163376g, bt0.f77162i, 0L, 600L, new PathInterpolator(0.42f, 0.0f, 0.2f, 1.0f), 1.0f, 0.37037f);
        Animator animatorM103739l4 = bt0.m103739l(this.f163378i, property, 0L, 600L, new PathInterpolator(0.42f, 0.0f, 0.2f, 1.0f), 0.0f, 1.0f);
        Animator animatorM103739l5 = bt0.m103739l(this.f163382m, property, 0L, 600L, new PathInterpolator(0.42f, 0.0f, 0.2f, 1.0f), 0.0f, 1.0f);
        final Animator animatorM103739l6 = bt0.m103739l(this.f163373d, property, 0L, 600L, new PathInterpolator(0.42f, 0.0f, 0.2f, 1.0f), 0.0f, 1.0f);
        animatorM103739l5.addListener(new C19888a(d30Var));
        animatorM103739l.addListener(new C19889b(animatorM103739l4, animatorM103739l5));
        e51.m114743H(this.f78941a, new Runnable() { // from class: l.y9f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f196964a.m182993G1(animatorM103739l, animatorM103739l2, animatorM103739l3, animatorM103739l6);
            }
        }, 2500L);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m182996I0(AgeView ageView, Integer num) {
        m182941Z1();
        m183016S1("");
        m183025X1(num.intValue(), ageView);
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m182997I1(d30 d30Var) {
        this.f163375f.stepToFrame(0.0f, true);
        d30Var.call();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m182998J0(AgeView ageView) {
        ageView.m28451Z(this.f78941a);
    }

    /* JADX INFO: renamed from: J1 */
    public final void m182999J1() {
        if (!NullChecker.m81303a(this.f163355C) || this.f163355C.isRunning()) {
            return;
        }
        this.f163355C.start();
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m183000K0() {
        m183016S1(SeeTextDynamicParam.age);
    }

    /* JADX INFO: renamed from: K1 */
    public final void m183001K1(NameView nameView) {
        m183003L1(nameView, false);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m183002L0(AgeView ageView) {
        m183025X1(20, ageView);
        xdl0.m208345M0(this.f163381l, false);
    }

    /* JADX INFO: renamed from: L1 */
    public final void m183003L1(final NameView nameView, boolean z) {
        if (!z) {
            ((SignUpAiAct) this.f78941a).duringCreated(AccountModule.f16037c.m28321a1()).subscribe(mkd0.m154956H(new e30() { // from class: l.n9f0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f137803a.m182992G0(nameView, (RegisterNameEnvelope) obj);
                }
            }, new e30() { // from class: l.p9f0
                @Override // p149l.e30
                public final void call(Object obj) {
                    saf0.m182921G((Throwable) obj);
                }
            }));
            return;
        }
        String strM119945p0 = f8f0.m119945p0(this.f163371S);
        this.f163369Q = strM119945p0;
        nameView.m28482W(C17890jy.m143837o0(strM119945p0));
        m183044o1(strM119945p0, null, new d30() { // from class: l.m9f0
            @Override // p149l.d30
            public final void call() {
                this.f132773a.m182989E0();
            }
        }, nameView);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m183004M0(final AgeView ageView, View view) {
        zvf0.m220399u("e_ai_signup_skip_button", ((SignUpAiAct) this.f78941a).pageId(), j760.m140076a("skip_from_which", SeeTextDynamicParam.age));
        m182915A0();
        m182947d2("填写“年龄”方便为您匹配更合适的对象，若跳过则默认为“20岁”", "继续填写", SeeTextDynamicParam.age, new d30() { // from class: l.j9f0
            @Override // p149l.d30
            public final void call() {
                saf0.m182937W();
            }
        }, new d30() { // from class: l.k9f0
            @Override // p149l.d30
            public final void call() {
                this.f122007a.m183002L0(ageView);
            }
        });
    }

    /* JADX INFO: renamed from: M1 */
    public void m183005M1(SignUpData signUpData) {
        m183010P1();
        xdl0.m208344M(this.f163385p, true);
        this.f163385p.setText(TEnum.equals(signUpData.gender, "female") ? R$string.f16232k : R$string.f16238l);
        xdl0.m208344M(this.f163386q, false);
        xdl0.m208344M(this.f163387r, true);
        this.f163387r.setText(act().getString(R$string.f16244m));
        xdl0.m208344M(this.f163388s, false);
        xdl0.m208344M(this.f163389t, false);
        this.f163353A.removeAllViews();
        this.f163385p.setText(TEnum.equals(signUpData.gender, "female") ? R$string.f16220i : R$string.f16226j);
        final AgeView ageView = new AgeView(this.f78941a);
        ageView.setAlpha(0.0f);
        this.f163353A.addView(ageView, new ConstraintLayout.C0220a(-1, -2));
        ageView.m28452a0(new e30() { // from class: l.oaf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142805a.m182994H0((Integer) obj);
            }
        }, new e30() { // from class: l.paf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147975a.m182996I0(ageView, (Integer) obj);
            }
        });
        Animator animatorM103739l = bt0.m103739l(ageView, View.ALPHA, 0L, 400L, null, 0.0f, 1.0f);
        bt0.m103749v(animatorM103739l, new Runnable() { // from class: l.qaf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f153534a.m182998J0(ageView);
            }
        });
        zvf0.m220402x("e_ai_signup_age", "p_ai_signup");
        Animator animatorM103746s = bt0.m103746s(C20087t.m186802a(this.f163385p, 0L), C20087t.m186802a(this.f163387r, 600L), animatorM103739l);
        this.f163359G = animatorM103746s;
        animatorM103746s.start();
        this.f163356D.add(this.f163359G);
        bt0.m103733f(this.f163359G, new Runnable() { // from class: l.raf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f158515a.m183000K0();
            }
        });
        m182999J1();
        xdl0.m208329E0(this.f163381l, new View.OnClickListener() { // from class: l.i8f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112034a.m183004M0(ageView, view);
            }
        });
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m183006N0() {
        zvf0.m220396r("e_signup_complete", ((SignUpAiAct) this.f78941a).pageId());
        ((z5f0) this.f78942b).m217314B1();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m183007O0() {
        ((z5f0) this.f78942b).m217320g1(false, true);
        zvf0.m220396r("e_photo_again_upload", ((SignUpAiAct) this.f78941a).pageId());
    }

    /* JADX INFO: renamed from: O1 */
    public void m183008O1(SignUpData signUpData) {
        this.f163371S = signUpData;
        m183020U1();
        xdl0.m208344M(this.f163385p, false);
        xdl0.m208344M(this.f163394y, true);
        m182943a2();
        if (C17133gp.m127316g()) {
            this.f163394y.setText("你还没有上传照片,为了不影响交友体验,记得注册完成后尽快上传头像照片哦～");
        }
        this.f163353A.removeAllViews();
        boolean zM127316g = C17133gp.m127316g();
        HoldAct holdact = this.f78941a;
        if (zM127316g) {
            zvf0.m220402x("e_signup_complete", ((SignUpAiAct) holdact).pageId());
            MediaView mediaView = new MediaView(this.f78941a);
            mediaView.setButtonText("注册完成");
            mediaView.setClickListener(new d30() { // from class: l.eaf0
                @Override // p149l.d30
                public final void call() {
                    this.f90193a.m183006N0();
                }
            });
            this.f163353A.addView(mediaView, new ConstraintLayout.C0220a(-1, -2));
        } else {
            zvf0.m220402x("e_photo_again_refuse", ((SignUpAiAct) holdact).pageId());
            zvf0.m220402x("e_photo_again_upload", ((SignUpAiAct) this.f78941a).pageId());
            ChannelRegisterView channelRegisterView = new ChannelRegisterView(this.f78941a);
            channelRegisterView.setUploadClickListener(new d30() { // from class: l.faf0
                @Override // p149l.d30
                public final void call() {
                    this.f96596a.m183007O0();
                }
            });
            channelRegisterView.setRegisterClickListener(new d30() { // from class: l.gaf0
                @Override // p149l.d30
                public final void call() {
                    this.f101667a.m183009P0();
                }
            });
            this.f163353A.addView(channelRegisterView, new ConstraintLayout.C0220a(-1, -2));
        }
        Animator animatorM103746s = bt0.m103746s(C20087t.m186802a(this.f163394y, 0L));
        this.f163364L = animatorM103746s;
        animatorM103746s.start();
        this.f163356D.add(this.f163364L);
        m182999J1();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m183009P0() {
        ((z5f0) this.f78942b).m217314B1();
        zvf0.m220396r("e_photo_again_refuse", ((SignUpAiAct) this.f78941a).pageId());
    }

    /* JADX INFO: renamed from: P1 */
    public void m183010P1() {
        C17367hp.m132324h();
        xdl0.m208345M0(this.f163380k, false);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m183011Q0(GenderView genderView) {
        m183016S1("gender");
        genderView.m28465S();
    }

    /* JADX INFO: renamed from: Q1 */
    public void m183012Q1() {
        ((z5f0) this.f78942b).m100085O0();
        m183010P1();
        xdl0.m208344M(this.f163385p, true);
        this.f163385p.setAlpha(0.0f);
        this.f163385p.setText(R$string.f16262p);
        xdl0.m208344M(this.f163386q, true);
        this.f163386q.setAlpha(0.0f);
        this.f163386q.setText(R$string.f16267q);
        xdl0.m208344M(this.f163387r, true);
        this.f163387r.setAlpha(0.0f);
        this.f163387r.setText(act().getString(R$string.f16272r));
        xdl0.m208344M(this.f163388s, false);
        xdl0.m208344M(this.f163389t, false);
        this.f163353A.removeAllViews();
        final GenderView genderView = new GenderView(this.f78941a);
        genderView.setAlpha(0.0f);
        ConstraintLayout.C0220a c0220a = new ConstraintLayout.C0220a(-1, -2);
        final d30 d30Var = new d30() { // from class: l.j8f0
            @Override // p149l.d30
            public final void call() {
                this.f116714a.m183026Y0(genderView);
            }
        };
        genderView.setGenderSaveListener(new e30() { // from class: l.k8f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121804a.m183028Z0(d30Var, genderView, (Gender) obj);
            }
        });
        this.f163353A.addView(genderView, c0220a);
        m183037g2(new d30() { // from class: l.l8f0
            @Override // p149l.d30
            public final void call() {
                this.f126824a.m183013R0(genderView);
            }
        });
        xdl0.m208329E0(this.f163381l, new View.OnClickListener() { // from class: l.m8f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132569a.m183019U0(d30Var, genderView, view);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m183013R0(final GenderView genderView) {
        m182999J1();
        Animator animatorM103746s = bt0.m103746s(C20087t.m186802a(this.f163385p, 0L), C20087t.m186802a(this.f163386q, 2000L), C20087t.m186802a(this.f163387r, 600L), bt0.m103753z(bt0.m103739l(genderView, View.TRANSLATION_Y, 0L, 400L, null, 120.0f, 0.0f), bt0.m103739l(genderView, View.ALPHA, 0L, 400L, null, 0.0f, 1.0f)));
        this.f163357E = animatorM103746s;
        bt0.m103733f(animatorM103746s, new Runnable() { // from class: l.l9f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f127104a.m183011Q0(genderView);
            }
        });
        this.f163357E.start();
        this.f163356D.add(this.f163357E);
        zvf0.m220402x("e_ai_signup_gender", "p_ai_signup");
    }

    /* JADX INFO: renamed from: R1 */
    public void m183014R1(SignUpData signUpData) {
        this.f163371S = signUpData;
        m183010P1();
        m183020U1();
        if (NullChecker.m81303a(signUpData.gender)) {
            f163352T.put(signUpData.gender.toString());
        } else {
            uqd0 uqd0Var = f163352T;
            if (!TextUtils.isEmpty(uqd0Var.get())) {
                signUpData.gender = Gender.get(uqd0Var.get());
            }
        }
        if (f8f0.m119948r0()) {
            m182915A0();
            ((z5f0) this.f78942b).m217314B1();
            return;
        }
        xdl0.m208344M(this.f163385p, true);
        this.f163385p.setText(R$string.f16277s);
        xdl0.m208344M(this.f163386q, true);
        this.f163386q.setText(R$string.f16282t);
        xdl0.m208344M(this.f163387r, false);
        xdl0.m208344M(this.f163388s, false);
        if (TEnum.equals(signUpData.gender, "male")) {
            this.f163391v.setImageResource(v2c0.f179529z1);
            this.f163392w.setImageResource(v2c0.f179379A1);
            this.f163393x.setImageResource(v2c0.f179382B1);
        } else if (TEnum.equals(signUpData.gender, "female")) {
            this.f163391v.setImageResource(v2c0.f179520w1);
            this.f163392w.setImageResource(v2c0.f179523x1);
            this.f163393x.setImageResource(v2c0.f179526y1);
        }
        xdl0.m208344M(this.f163389t, true);
        this.f163353A.removeAllViews();
        MediaView mediaView = new MediaView(this.f78941a);
        mediaView.setAlpha(0.0f);
        mediaView.setClickListener(new d30() { // from class: l.o9f0
            @Override // p149l.d30
            public final void call() {
                this.f142715a.m183029a1();
            }
        });
        this.f163353A.addView(mediaView, new ConstraintLayout.C0220a(-1, -2));
        Animator animatorM103746s = bt0.m103746s(C20087t.m186802a(this.f163385p, 0L), C20087t.m186802a(this.f163386q, 1200L), C20087t.m186802a(this.f163389t, 600L), bt0.m103753z(bt0.m103739l(mediaView, View.ALPHA, 0L, 400L, null, 0.0f, 1.0f)));
        this.f163363K = animatorM103746s;
        animatorM103746s.start();
        bt0.m103733f(this.f163363K, new Runnable() { // from class: l.z9f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f202291a.m183032d1();
            }
        });
        this.f163356D.add(this.f163363K);
        m182999J1();
        zvf0.m220402x("e_ai_signup_photo", "p_ai_signup");
        xdl0.m208329E0(this.f163381l, new View.OnClickListener() { // from class: l.kaf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122111a.m183034f1(view);
            }
        });
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m183015S0(d30 d30Var, GenderView genderView) {
        m182941Z1();
        m183016S1("");
        m183027Y1(Gender.get("male"), d30Var, genderView);
    }

    /* JADX INFO: renamed from: S1 */
    public void m183016S1(String str) {
        if (!C17133gp.m127317h() || this.f163366N.get().booleanValue()) {
            xdl0.m208345M0(this.f163381l, false);
        } else {
            zvf0.m220368A("e_ai_signup_skip_button", ((SignUpAiAct) this.f78941a).pageId(), j760.m140076a("skip_from_which", str));
            xdl0.m208345M0(this.f163381l, true);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m183017T0(d30 d30Var, GenderView genderView) {
        xdl0.m208345M0(this.f163381l, false);
        m183027Y1(Gender.get("female"), d30Var, genderView);
    }

    /* JADX INFO: renamed from: T1 */
    public void m183018T1(SignUpData signUpData) {
        this.f163371S = signUpData;
        m183010P1();
        m183020U1();
        if (f8f0.m119948r0()) {
            m183003L1(new NameView(this.f78941a), true);
            return;
        }
        xdl0.m208344M(this.f163385p, true);
        this.f163385p.setText(R$string.f16287u);
        xdl0.m208344M(this.f163386q, false);
        xdl0.m208344M(this.f163387r, false);
        xdl0.m208344M(this.f163388s, false);
        xdl0.m208344M(this.f163389t, false);
        final NameView nameView = new NameView(this.f78941a);
        nameView.setAlpha(0.0f);
        ConstraintLayout.C0220a c0220a = new ConstraintLayout.C0220a(-1, -2);
        final c4g0 c4g0VarSubscribe = ((z5f0) this.f78942b).duringCreated(Act.keyboardListenerObservable(this.f163354B)).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.x8f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191507a.m183036g1(nameView, (Boolean) obj);
            }
        }));
        final d30 d30Var = new d30() { // from class: l.y8f0
            @Override // p149l.d30
            public final void call() {
                this.f196822a.m183042m1(nameView);
            }
        };
        nameView.m28484b0(new e30() { // from class: l.z8f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202150a.m183043n1((String) obj);
            }
        }, new e30() { // from class: l.a9f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68154a.m183044o1(c4g0VarSubscribe, d30Var, nameView, (String) obj);
            }
        });
        this.f163353A.removeAllViews();
        this.f163353A.addView(nameView, c0220a);
        Animator animatorM103739l = bt0.m103739l(nameView, View.ALPHA, 0L, 400L, null, 0.0f, 1.0f);
        bt0.m103749v(animatorM103739l, new Runnable() { // from class: l.b9f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f74572a.m183045p1(nameView);
            }
        });
        Animator animatorM103746s = bt0.m103746s(C20087t.m186802a(this.f163385p, 0L), animatorM103739l);
        this.f163361I = animatorM103746s;
        animatorM103746s.start();
        bt0.m103733f(this.f163361I, new Runnable() { // from class: l.c9f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79928a.m183047r1(nameView);
            }
        });
        this.f163356D.add(this.f163361I);
        m182999J1();
        zvf0.m220402x("e_ai_signup_name", "p_ai_signup");
        xdl0.m208329E0(this.f163381l, new View.OnClickListener() { // from class: l.e9f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90093a.m183049t1(nameView, c4g0VarSubscribe, d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m183019U0(final d30 d30Var, final GenderView genderView, View view) {
        zvf0.m220399u("e_ai_signup_skip_button", ((SignUpAiAct) this.f78941a).pageId(), j760.m140076a("skip_from_which", "gender"));
        m182915A0();
        m182947d2("系统默认您为“女性”方便为您精准匹配用户，性别更改机会只有一次", "我是男生", "gender", new d30() { // from class: l.h9f0
            @Override // p149l.d30
            public final void call() {
                this.f106576a.m183015S0(d30Var, genderView);
            }
        }, new d30() { // from class: l.i9f0
            @Override // p149l.d30
            public final void call() {
                this.f112214a.m183017T0(d30Var, genderView);
            }
        });
    }

    /* JADX INFO: renamed from: U1 */
    public final void m183020U1() {
        if (this.f163368P != 0) {
            this.f163383n.scrollTo(0, 0);
            this.f163368P = 0;
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m183021V0() {
        m183031c2(2);
    }

    /* JADX INFO: renamed from: V1 */
    public final void m183022V1() {
        if (this.f163370R == null) {
            this.f163370R = new Runnable() { // from class: l.d9f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f85118a.m183050u1();
                }
            };
        }
        e51.m114745J(this.f163370R);
        e51.m114743H(this.f78941a, this.f163370R, 300L);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m183023W0() {
        ((z5f0) this.f78942b).m217333v1();
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m183024X0(GenderView genderView) {
        VText vText = this.f163388s;
        vText.setPivotX(vText.getWidth());
        VText vText2 = this.f163388s;
        vText2.setPivotY(vText2.getHeight());
        Animator animatorM186806e = C20087t.m186806e(400L, this.f163385p, this.f163386q, this.f163387r, this.f163388s, this.f163389t);
        bt0.m103749v(animatorM186806e, new Runnable() { // from class: l.r9f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f158365a.m183021V0();
            }
        });
        Animator animatorM103746s = bt0.m103746s(bt0.m103753z(bt0.m103739l(genderView, View.ALPHA, 200L, 400L, null, 1.0f, 0.0f), C20087t.m186803b(this.f163388s, 400L)), animatorM186806e);
        this.f163358F = animatorM103746s;
        bt0.m103733f(animatorM103746s, new Runnable() { // from class: l.s9f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f163178a.m183023W0();
            }
        });
        this.f163358F.start();
        this.f163356D.add(this.f163358F);
    }

    /* JADX INFO: renamed from: X1 */
    public final void m183025X1(final int i, final AgeView ageView) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mqi0.m155944o());
        calendar.set(1, calendar.get(1) - i);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        AccountModule.f16037c.m28330e2(calendar.getTimeInMillis());
        AccountModule.f16037c.m28326c2(i);
        ((z5f0) this.f78942b).m100080H0(AccountTempApi.SignUpType.birthInfoSaved, new d30() { // from class: l.t8f0
            @Override // p149l.d30
            public final void call() {
                this.f168912a.m182985A1(i, ageView);
            }
        }, new e30() { // from class: l.u8f0
            @Override // p149l.e30
            public final void call(Object obj) {
                ageView.m28449V();
            }
        });
        zvf0.m220399u("e_ai_signup_age", "p_ai_signup", vwb.m200311Y("user_age", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m183026Y0(final GenderView genderView) {
        e51.m114743H(getContext(), new Runnable() { // from class: l.n8f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f137640a.m183024X0(genderView);
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m183027Y1(final Gender gender, final d30 d30Var, final GenderView genderView) {
        ((z5f0) this.f78942b).m217317E1(gender);
        ((z5f0) this.f78942b).m100080H0(AccountTempApi.SignUpType.genderInfoSave, new d30() { // from class: l.o8f0
            @Override // p149l.d30
            public final void call() {
                this.f142625a.m182987B1(gender, d30Var);
            }
        }, new e30() { // from class: l.p8f0
            @Override // p149l.e30
            public final void call(Object obj) {
                genderView.m28465S();
            }
        });
        zvf0.m220399u("e_ai_signup_gender", "p_ai_signup", j760.m140076a("ai_signup_gender", TEnum.equals(gender, "male") ? "male" : "female"));
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m183028Z0(d30 d30Var, GenderView genderView, Gender gender) {
        m182941Z1();
        m183016S1("");
        m183027Y1(gender, d30Var, genderView);
        ((z5f0) this.f78942b).m100085O0();
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m183029a1() {
        boolean zEquals = TextUtils.equals("DouyinTantan01", mr4.m156015b());
        Presenter presenter = this.f78942b;
        if (zEquals) {
            ((z5f0) presenter).m217320g1(false, true);
        } else {
            ((z5f0) presenter).m217320g1(false, false);
        }
        zvf0.m220396r("e_ai_signup_photo", "p_ai_signup");
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public final void m183044o1(String str, c4g0 c4g0Var, d30 d30Var, NameView nameView) {
        AccountModule.f16037c.m28339j2(str);
        m183035f2(nameView, c4g0Var, d30Var, str);
        zvf0.m220396r("e_ai_signup_name", "p_ai_signup");
    }

    /* JADX INFO: renamed from: c2 */
    public void m183031c2(int i) {
        if (f8f0.m119948r0()) {
            i = Math.min(2, i);
        }
        if (i < 0) {
            return;
        }
        this.f163382m.setDefaultStep(i - 1);
        if (i < 1) {
            return;
        }
        this.f163382m.setTargetStep(i);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m183032d1() {
        if (C17133gp.m127317h()) {
            xdl0.m208345M0(this.f163381l, true);
            zvf0.m220368A("e_ai_signup_skip_button", ((SignUpAiAct) this.f78941a).pageId(), j760.m140076a("skip_from_which", ReminderAction.photo));
        }
    }

    @Override // p149l.c3f0, p149l.s7m
    public void destroy() {
        super.destroy();
        if (NullChecker.m81303a(this.f163355C)) {
            this.f163355C.cancel();
        }
        int i = 0;
        while (true) {
            int size = this.f163356D.size();
            ArrayList<Animator> arrayList = this.f163356D;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            if (NullChecker.m81303a(arrayList.get(i)) && this.f163356D.get(i).isRunning()) {
                this.f163356D.get(i).cancel();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m183033e1() {
        ((z5f0) this.f78942b).m217314B1();
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m183034f1(View view) {
        zvf0.m220399u("e_ai_signup_skip_button", ((SignUpAiAct) this.f78941a).pageId(), j760.m140076a("skip_from_which", ReminderAction.photo));
        m182915A0();
        m182947d2("跳过将会影响您进入后匹配用户的体验", "继续上传", ReminderAction.photo, new d30() { // from class: l.f9f0
            @Override // p149l.d30
            public final void call() {
                saf0.m182953i0();
            }
        }, new d30() { // from class: l.g9f0
            @Override // p149l.d30
            public final void call() {
                this.f101561a.m183033e1();
            }
        });
    }

    /* JADX INFO: renamed from: f2 */
    public final void m183035f2(final NameView nameView, final c4g0 c4g0Var, final d30 d30Var, final String str) {
        DetectRequest detectRequestNew_ = DetectRequest.new_();
        detectRequestNew_.category = DetectCategoryType.get("login");
        DetectText detectTextNew_ = DetectText.new_();
        detectTextNew_.key = "nikeName";
        detectTextNew_.value = str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(detectTextNew_);
        detectRequestNew_.text = arrayList;
        ((z5f0) this.f78942b).m100086P0(detectRequestNew_, nameView, AccountTempApi.SignUpType.nameInfoSaved, new d30() { // from class: l.aaf0
            @Override // p149l.d30
            public final void call() {
                this.f68552a.m182991F1(str, d30Var, c4g0Var);
            }
        }, new e30() { // from class: l.baf0
            @Override // p149l.e30
            public final void call(Object obj) {
                nameView.m28480T();
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m183036g1(NameView nameView, Boolean bool) {
        if (bool.booleanValue()) {
            nameView.m28483a0(this.f78941a);
        } else {
            nameView.m28481V();
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final void m183037g2(final d30 d30Var) {
        if (this.f163365M.get().booleanValue()) {
            m183031c2(1);
            if (NullChecker.m81303a(d30Var)) {
                d30Var.call();
                return;
            }
            return;
        }
        xdl0.m208344M(this.f163374e, true);
        this.f163376g.setAlpha(0.0f);
        this.f163373d.setAlpha(0.0f);
        this.f163372c.setVisibility(0);
        xdl0.m208345M0(this.f163384o, false);
        this.f163378i.setAlpha(0.0f);
        this.f163382m.setAlpha(0.0f);
        final d30 d30Var2 = new d30() { // from class: l.q8f0
            @Override // p149l.d30
            public final void call() {
                this.f153189a.m182995H1(d30Var);
            }
        };
        e51.m114743H(this.f78941a, new Runnable() { // from class: l.r8f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f158214a.m182997I1(d30Var2);
            }
        }, 500L);
        zvf0.m220402x("e_ai_appear", "p_ai_signup");
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m183038h1() {
        act().hideInput(this.f163354B);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f163354B = m183054z0(layoutInflater, viewGroup);
        m182969r();
        return this.f163354B;
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m183039j1() {
        m183031c2(4);
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m183040k1() {
        ((z5f0) this.f78942b).m217333v1();
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m183041l1(NameView nameView) {
        Animator animatorM103739l = bt0.m103739l(nameView, View.ALPHA, 200L, 400L, null, 1.0f, 0.0f);
        bt0.m103733f(animatorM103739l, new Runnable() { // from class: l.haf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f106735a.m183038h1();
            }
        });
        Animator animatorM186806e = C20087t.m186806e(400L, this.f163385p, this.f163386q, this.f163387r, this.f163388s, this.f163389t);
        bt0.m103749v(animatorM186806e, new Runnable() { // from class: l.iaf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f112300a.m183039j1();
            }
        });
        Animator animatorM103746s = bt0.m103746s(bt0.m103753z(animatorM103739l, C20087t.m186803b(this.f163388s, 400L)), animatorM186806e);
        this.f163362J = animatorM103746s;
        bt0.m103733f(animatorM103746s, new Runnable() { // from class: l.jaf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f117081a.m183040k1();
            }
        });
        this.f163362J.start();
        this.f163356D.add(this.f163362J);
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m183042m1(final NameView nameView) {
        e51.m114743H(getContext(), new Runnable() { // from class: l.q9f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f153429a.m183041l1(nameView);
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m183043n1(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f163387r;
        if (zIsEmpty) {
            xdl0.m208344M(vText, false);
            zvf0.m220400v("e_ai_signup_name", "p_ai_signup", new j760[0]);
            return;
        }
        vText.setText(str);
        this.f163387r.setBackgroundResource(v2c0.f179391E1);
        this.f163387r.setTextColor(((SignUpAiAct) this.f78941a).getResources().getColor(u0c0.f172890k));
        xdl0.m208344M(this.f163387r, true);
        this.f163387r.setAlpha(1.0f);
        C20087t.m186804c(this.f78941a, this.f163387r);
        m183022V1();
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m183045p1(NameView nameView) {
        nameView.m28483a0(this.f78941a);
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m183046q1(NameView nameView, View view) {
        zvf0.m220396r("e_ai_signup_chage_name_button", ((SignUpAiAct) this.f78941a).pageId());
        m183001K1(nameView);
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m183047r1(final NameView nameView) {
        if (C17133gp.m127317h()) {
            m183016S1(AuthenticationTokenClaims.JSON_KEY_NAME);
            nameView.setEditViewPadding(true);
            xdl0.m208344M(nameView.f16411e, true);
            xdl0.m208329E0(nameView.f16411e, new View.OnClickListener() { // from class: l.caf0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f80029a.m183046q1(nameView, view);
                }
            });
        } else {
            nameView.setEditViewPadding(false);
            xdl0.m208344M(nameView.f16411e, false);
        }
        if (!TextUtils.isEmpty(AccountModule.f16037c.m28290I2().get())) {
            nameView.post(new Runnable() { // from class: l.daf0
                @Override // java.lang.Runnable
                public final void run() {
                    nameView.m28482W(C17890jy.m143837o0(AccountModule.f16037c.m28290I2().get()));
                }
            });
        } else if (C17133gp.m127317h()) {
            m183001K1(nameView);
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m183048s1(NameView nameView, c4g0 c4g0Var, d30 d30Var) {
        xdl0.m208345M0(this.f163381l, false);
        m183044o1(!TextUtils.isEmpty(nameView.getLastName()) ? nameView.getLastName() : this.f163369Q, c4g0Var, d30Var, nameView);
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m183049t1(final NameView nameView, final c4g0 c4g0Var, final d30 d30Var, View view) {
        zvf0.m220399u("e_ai_signup_skip_button", ((SignUpAiAct) this.f78941a).pageId(), j760.m140076a("skip_from_which", AuthenticationTokenClaims.JSON_KEY_NAME));
        m182915A0();
        m182947d2("填写“昵称”方便别人更快记住你，若仍要跳过，系统将随机展示昵称，您可进入后自行更改", "继续填写", AuthenticationTokenClaims.JSON_KEY_NAME, new d30() { // from class: l.t9f0
            @Override // p149l.d30
            public final void call() {
                saf0.m182935U();
            }
        }, new d30() { // from class: l.u9f0
            @Override // p149l.d30
            public final void call() {
                this.f175260a.m183048s1(nameView, c4g0Var, d30Var);
            }
        });
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m183050u1() {
        int i;
        int height;
        if (!NullChecker.m81303a(act()) || act().isFinishing()) {
            return;
        }
        int[] iArr = new int[2];
        this.f163395z.getLocationInWindow(iArr);
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        if (xdl0.m208349O0(this.f163387r)) {
            this.f163387r.getLocationInWindow(iArr2);
            i = iArr2[1];
            height = this.f163387r.getHeight();
        } else if (xdl0.m208349O0(this.f163386q)) {
            this.f163386q.getLocationInWindow(iArr2);
            i = iArr2[1];
            height = this.f163386q.getHeight();
        } else {
            this.f163385p.getLocationInWindow(iArr2);
            i = iArr2[1];
            height = this.f163385p.getHeight();
        }
        int i3 = i + height;
        if (i2 < i3) {
            this.f163368P = (i3 - i2) + this.f163383n.getScrollY();
            bt0.m103740m(this.f163383n, new C19890c(Integer.TYPE, ""), 0L, 200L, null, this.f163383n.getScrollY(), this.f163368P).start();
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m183051v1() {
        act().hideInput(this.f163354B);
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m183052w1() {
        m183031c2(3);
    }

    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ void m183053y1() {
        ((z5f0) this.f78942b).m217333v1();
    }

    /* JADX INFO: renamed from: z0 */
    public View m183054z0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return taf0.m187721b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m183055z1(AgeView ageView) {
        Animator animatorM103739l = bt0.m103739l(ageView, View.ALPHA, 200L, 400L, null, 1.0f, 0.0f);
        bt0.m103733f(animatorM103739l, new Runnable() { // from class: l.laf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f127193a.m183051v1();
            }
        });
        Animator animatorM186806e = C20087t.m186806e(400L, this.f163385p, this.f163386q, this.f163387r, this.f163388s, this.f163389t);
        bt0.m103749v(animatorM186806e, new Runnable() { // from class: l.maf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f132848a.m183052w1();
            }
        });
        Animator animatorM103746s = bt0.m103746s(bt0.m103753z(animatorM103739l, C20087t.m186803b(this.f163388s, 400L)), animatorM186806e);
        this.f163360H = animatorM103746s;
        bt0.m103733f(animatorM103746s, new Runnable() { // from class: l.naf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f137896a.m183053y1();
            }
        });
        this.f163360H.start();
        this.f163356D.add(this.f163360H);
    }
}
