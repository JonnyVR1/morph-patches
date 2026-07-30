package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.data.RegisterNameEnvelope;
import com.p051p1.mobile.putong.account.p055ui.accountai.SignUpAiAct;
import com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view.AgeView;
import com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view.ChannelRegisterView;
import com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view.GenderView;
import com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view.MediaView;
import com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view.NameView;
import com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view.StepProgressView;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.DetectRequest;
import com.p051p1.mobile.putong.data.DetectText;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.SeeTextDynamicParam;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Calendar;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class zif0 extends jbf0<gef0, SignUpAiAct> {

    /* JADX INFO: renamed from: T */
    public static final wyd0 f204509T = new wyd0("sign_up_gender_1", "");

    /* JADX INFO: renamed from: A */
    public VLinear f204510A;

    /* JADX INFO: renamed from: B */
    public View f204511B;

    /* JADX INFO: renamed from: C */
    public Animator f204512C;

    /* JADX INFO: renamed from: D */
    public final ArrayList<Animator> f204513D;

    /* JADX INFO: renamed from: E */
    public Animator f204514E;

    /* JADX INFO: renamed from: F */
    public Animator f204515F;

    /* JADX INFO: renamed from: G */
    public Animator f204516G;

    /* JADX INFO: renamed from: H */
    public Animator f204517H;

    /* JADX INFO: renamed from: I */
    public Animator f204518I;

    /* JADX INFO: renamed from: J */
    public Animator f204519J;

    /* JADX INFO: renamed from: K */
    public Animator f204520K;

    /* JADX INFO: renamed from: L */
    public Animator f204521L;

    /* JADX INFO: renamed from: M */
    public final jxd0 f204522M;

    /* JADX INFO: renamed from: N */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final jxd0 f204523N;

    /* JADX INFO: renamed from: O */
    @SuppressLint({"SV_USE_DUP_ID"})
    public final jxd0 f204524O;

    /* JADX INFO: renamed from: P */
    public int f204525P;

    /* JADX INFO: renamed from: Q */
    public String f204526Q;

    /* JADX INFO: renamed from: R */
    public Runnable f204527R;

    /* JADX INFO: renamed from: S */
    public SignUpData f204528S;

    /* JADX INFO: renamed from: c */
    public View f204529c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f204530d;

    /* JADX INFO: renamed from: e */
    public VFrame f204531e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f204532f;

    /* JADX INFO: renamed from: g */
    public VImage f204533g;

    /* JADX INFO: renamed from: h */
    public VLinear f204534h;

    /* JADX INFO: renamed from: i */
    public VRelative f204535i;

    /* JADX INFO: renamed from: j */
    public VText f204536j;

    /* JADX INFO: renamed from: k */
    public VImage f204537k;

    /* JADX INFO: renamed from: l */
    public VText f204538l;

    /* JADX INFO: renamed from: m */
    public StepProgressView f204539m;

    /* JADX INFO: renamed from: n */
    public VLinear f204540n;

    /* JADX INFO: renamed from: o */
    public VImage f204541o;

    /* JADX INFO: renamed from: p */
    public VText f204542p;

    /* JADX INFO: renamed from: q */
    public VText f204543q;

    /* JADX INFO: renamed from: r */
    public VText f204544r;

    /* JADX INFO: renamed from: s */
    public VText f204545s;

    /* JADX INFO: renamed from: t */
    public VRelative f204546t;

    /* JADX INFO: renamed from: u */
    public VText f204547u;

    /* JADX INFO: renamed from: v */
    public VImage f204548v;

    /* JADX INFO: renamed from: w */
    public VImage f204549w;

    /* JADX INFO: renamed from: x */
    public VImage f204550x;

    /* JADX INFO: renamed from: y */
    public VText f204551y;

    /* JADX INFO: renamed from: z */
    public VScroll f204552z;

    /* JADX INFO: renamed from: l.zif0$a */
    public class C21813a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f204553a;

        public C21813a(x20 x20Var) {
            this.f204553a = x20Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            zif0.this.m219860c2(1);
            bnl0.m105525M0(zif0.this.f204533g, false);
            zif0.this.f204522M.put(Boolean.TRUE);
            if (NullChecker.m82486a(this.f204553a)) {
                this.f204553a.call();
            }
        }
    }

    /* JADX INFO: renamed from: l.zif0$b */
    public class C21814b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Animator f204555a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Animator f204556b;

        public C21814b(Animator animator, Animator animator2) {
            this.f204555a = animator;
            this.f204556b = animator2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            bnl0.m105525M0(zif0.this.f204541o, true);
            bnl0.m105524M(zif0.this.f204531e, false);
            bnl0.m105524M(zif0.this.f204529c, false);
            gt0.m132180z(this.f204555a, this.f204556b).start();
        }
    }

    /* JADX INFO: renamed from: l.zif0$c */
    public class C21815c extends Property<View, Integer> {
        public C21815c(Class cls, String str) {
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
            zif0.this.f204540n.scrollTo(0, num.intValue());
        }
    }

    /* JADX INFO: renamed from: l.zif0$d */
    public class DialogInterfaceOnDismissListenerC21816d implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f204559a;

        public DialogInterfaceOnDismissListenerC21816d(l4g0 l4g0Var) {
            this.f204559a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f204559a);
        }
    }

    public zif0(@NonNull SignUpAiAct signUpAiAct) {
        super(signUpAiAct);
        this.f204513D = new ArrayList<>();
        String str = "show_welcome_1_" + AccountModule.m29130F().userId();
        Boolean bool = Boolean.FALSE;
        this.f204522M = new jxd0(str, bool);
        this.f204523N = new jxd0("has_jump_" + AccountModule.m29130F().userId(), bool);
        this.f204524O = new jxd0("has_submit_jump_" + AccountModule.m29130F().userId(), bool);
        this.f204525P = 0;
        this.f204526Q = "肥冉小朋友";
    }

    /* JADX INFO: renamed from: A0 */
    private void m219744A0() {
        if (this.f204524O.get().booleanValue()) {
            return;
        }
        ((SignUpAiAct) this.f119872a).duringCreated(AccountModule.f16756c.m29355s2()).subscribe(psd0.m173597H(new y20() { // from class: l.chf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81802a.m219815B0((uxj0) obj);
            }
        }, new y20() { // from class: l.dhf0
            @Override // p153l.y20
            public final void call(Object obj) {
                zif0.m219771a0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m219747D0(Boolean bool) {
        if (bool.booleanValue()) {
            bsj0.m106283s(this.f119872a, this.f204552z);
            m219851V1();
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m219750G(Throwable th) {
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m219764U() {
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m219766W() {
    }

    /* JADX INFO: renamed from: Z1 */
    private void m219770Z1() {
        if (C16074bp.m105753h()) {
            this.f204523N.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ void m219771a0(Throwable th) {
    }

    /* JADX INFO: renamed from: a2 */
    private void m219772a2() {
        if (C16074bp.m105753h()) {
            bnl0.m105525M0(this.f204538l, false);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ dgq0 m219774c0(View view, dgq0 dgq0Var) {
        view.setPadding(0, 0, 0, dgq0Var.m115683i());
        return dgq0Var;
    }

    /* JADX INFO: renamed from: d2 */
    private void m219776d2(String str, String str2, final String str3, final x20 x20Var, final x20 x20Var2) {
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
        l4g0 l4g0VarM204399c = w1e.m204399c(str4, Dialog.class.getName());
        th0.C20312a c20312aM191144c = new th0.C20312a(this.f119872a).m191151j(str).m191159r(str2).m191147f("仍要跳过").m191148g(false).m191154m(new DialogInterfaceOnDismissListenerC21816d(l4g0VarM204399c)).m191149h(false).m191156o(new View.OnClickListener() { // from class: l.cif0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81936a.m219817C1(str4, str3, x20Var, view);
            }
        }).m191144c(new View.OnClickListener() { // from class: l.dif0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88632a.m219819E1(str4, str3, x20Var2, view);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
        c20312aM191144c.m191142a().m191141g();
    }

    /* JADX INFO: renamed from: e2 */
    private void m219778e2(String str, String str2, boolean z) {
        boolean zEquals = "gender".equals(str2);
        String str3 = FreeSpaceBox.TYPE;
        if (zEquals) {
            if (z) {
                str3 = "choose_male";
            }
            i4g0.m138523u("e_ai_signup_gender_skip_pop_again", str, pf60.m172085a("skip_gender", str3));
            return;
        }
        if (SeeTextDynamicParam.age.equals(str2)) {
            if (z) {
                str3 = "fill_out";
            }
            i4g0.m138523u("e_ai_signup_age_skip_pop_again", str, pf60.m172085a("skip_pop_age", str3));
        } else if (AuthenticationTokenClaims.JSON_KEY_NAME.equals(str2)) {
            if (z) {
                str3 = "fill_out";
            }
            i4g0.m138523u("e_ai_signup_name_skip_pop_again", str, pf60.m172085a("skip_pop_name", str3));
        } else if (ReminderAction.photo.equals(str2)) {
            if (z) {
                str3 = "fill_out";
            }
            i4g0.m138523u("e_ai_signup_photo_skip_pop_again", str, pf60.m172085a("skip_pop_photo", str3));
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m219782i0() {
    }

    /* JADX INFO: renamed from: r */
    private void m219798r() {
        m144220e(this.f204536j);
        ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) this.f204534h.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0221a).topMargin = bnl0.m105511F0();
        this.f204534h.setLayoutParams(c0221a);
        kkl0.m150194y0(this.f204552z, new il50() { // from class: l.ogf0
            @Override // p153l.il50
            public final dgq0 onApplyWindowInsets(View view, dgq0 dgq0Var) {
                return zif0.m219774c0(view, dgq0Var);
            }
        });
        this.f204539m.setStepCount(4);
        this.f204539m.setSpace(qa00.f156318e);
        this.f204539m.setStepAnimationDuration(400);
        this.f204539m.setDefaultStep(0);
        this.f204542p.setAlpha(0.0f);
        this.f204543q.setAlpha(0.0f);
        this.f204544r.setAlpha(0.0f);
        this.f204545s.setAlpha(0.0f);
        this.f204546t.setAlpha(0.0f);
        this.f204512C = C20198t.m188692d(this.f204541o);
        ((gef0) this.f119873b).duringCreated(Act.keyboardListenerObservable(this.f204511B)).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.zgf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204298a.m219747D0((Boolean) obj);
            }
        }));
        uqb0.f180374G.m127115L0(this.f204530d, "https://auto.tancdn.com/v1/raw/904432ed-ba77-4288-8865-1411b792009c10.webp");
        SVGALoader.with(this.f119872a).from("https://auto.tancdn.com/v1/raw/3c15132b-6c3e-487b-b09a-584b39754f2a11.pdf").autoPlay(false).repeatCount(1).into(this.f204532f);
        if (gsj0.m132062f()) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f204535i.getLayoutParams();
            layoutParams.height = qa00.f156335v;
            layoutParams.bottomMargin = 0;
            this.f204535i.setLayoutParams(layoutParams);
            this.f204536j.setTextSize(14.0f);
            this.f204540n.setPadding(0, qa00.f156322i, 0, 0);
        }
    }

    /* JADX INFO: renamed from: A1 */
    public final /* synthetic */ void m219814A1(int i, final AgeView ageView) {
        m219772a2();
        this.f204545s.setText(i + act().getResources().getString(R$string.f16933h));
        bnl0.m105524M(this.f204545s, true);
        this.f204545s.setAlpha(0.0f);
        l51.m152888H(getContext(), new Runnable() { // from class: l.eif0
            @Override // java.lang.Runnable
            public final void run() {
                this.f94143a.m219884z1(ageView);
            }
        }, 200L);
        i4g0.m138526x("e_ai_signup_birthday_response", "p_ai_signup");
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m219815B0(uxj0 uxj0Var) {
        this.f204524O.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m219816B1(Gender gender, x20 x20Var) {
        m219772a2();
        VText vText = this.f204545s;
        boolean zEquals = TEnum.equals(gender, "male");
        HoldAct holdact = this.f119872a;
        vText.setText(zEquals ? ((SignUpAiAct) holdact).getString(R$string.f16784E2) : ((SignUpAiAct) holdact).getString(R$string.f16779D2));
        bnl0.m105524M(this.f204545s, true);
        this.f204545s.setAlpha(0.0f);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        i4g0.m138526x("e_ai_signup_gender_response", "p_ai_signup");
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m219817C1(String str, String str2, x20 x20Var, View view) {
        m219778e2(str, str2, true);
        x20Var.call();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m219818E0() {
        ((gef0) this.f119873b).m130007v1();
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m219819E1(String str, String str2, x20 x20Var, View view) {
        m219778e2(str, str2, false);
        x20Var.call();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m219820F1(String str, x20 x20Var, kcg0 kcg0Var) {
        m219772a2();
        this.f204545s.setText(str);
        bnl0.m105524M(this.f204545s, true);
        this.f204545s.setAlpha(0.0f);
        x20Var.call();
        psd0.m173633z(kcg0Var);
        i4g0.m138526x("e_ai_signup_name_response", "p_ai_signup");
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m219821G0(NameView nameView, RegisterNameEnvelope registerNameEnvelope) {
        if (NullChecker.m82486a(registerNameEnvelope) && NullChecker.m82486a(registerNameEnvelope.data) && !TextUtils.isEmpty(registerNameEnvelope.data.name)) {
            String str = registerNameEnvelope.data.name;
            this.f204526Q = str;
            nameView.m29481W(C16649dy.m118580o0(str));
        }
    }

    /* JADX INFO: renamed from: G1 */
    public final /* synthetic */ void m219822G1(Animator animator, Animator animator2, Animator animator3, Animator animator4) {
        VImage vImage = this.f204541o;
        vImage.setPivotX(vImage.getWidth() / 2);
        VImage vImage2 = this.f204541o;
        vImage2.setPivotY(vImage2.getHeight() / 2);
        gt0.m132180z(animator, animator2, animator3, animator4).start();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m219823H0(Integer num) {
        if (num.intValue() == 0) {
            this.f204544r.setText(((SignUpAiAct) this.f119872a).getString(R$string.f16963m));
            this.f204544r.setBackgroundResource(bbc0.f75794D1);
            this.f204544r.setTextColor(act().getResources().getColor(a9c0.f69027l));
            i4g0.m138524v("e_ai_signup_age", "p_ai_signup", new pf60[0]);
            return;
        }
        if (num.intValue() == 1) {
            this.f204544r.setText(((SignUpAiAct) this.f119872a).getString(R$string.f16963m));
        } else if (num.intValue() == 4) {
            this.f204544r.setText(((SignUpAiAct) this.f119872a).getString(R$string.f16969n));
        } else if (num.intValue() == 5) {
            this.f204544r.setText(((SignUpAiAct) this.f119872a).getString(R$string.f16975o));
        }
        this.f204544r.setBackgroundResource(bbc0.f75797E1);
        this.f204544r.setTextColor(act().getResources().getColor(a9c0.f69026k));
        C20198t.m188691c(this.f119872a, this.f204544r);
        m219851V1();
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m219824H1(x20 x20Var) {
        tyf0 tyf0Var = new tyf0(this.f204533g, bge.f76589p);
        ezf0 ezf0Var = new ezf0();
        ezf0Var.m123347d(0.3f).m123349f(600.0f);
        tyf0Var.m193595r(ezf0Var).m104128k(0.0f).m104127j(0.5f).m193592o(1.0f);
        tyf0 tyf0Var2 = new tyf0(this.f204533g, bge.f76590q);
        ezf0 ezf0Var2 = new ezf0();
        ezf0Var2.m123347d(0.3f).m123349f(600.0f);
        tyf0Var2.m193595r(ezf0Var2).m104128k(0.0f).m104127j(0.5f).m193592o(1.0f);
        VImage vImage = this.f204533g;
        Property property = View.ALPHA;
        gt0.m132166l(vImage, property, 0L, 130L, new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f), 0.0f, 1.0f).start();
        int[] iArr = new int[2];
        this.f204541o.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = qa00.f156328o;
        int i3 = i + i2;
        int i4 = iArr[1] + i2;
        this.f204533g.getLocationInWindow(iArr);
        int i5 = iArr[0];
        int i6 = qa00.f156290C;
        int i7 = iArr[1] + i6;
        final Animator animatorM132166l = gt0.m132166l(this.f204533g, View.TRANSLATION_X, 0L, 600L, new PathInterpolator(0.42f, 0.0f, 0.2f, 1.0f), i3 - (i5 + i6));
        final Animator animatorM132166l2 = gt0.m132166l(this.f204533g, View.TRANSLATION_Y, 0L, 600L, new PathInterpolator(0.42f, 0.0f, 0.2f, 1.0f), i4 - i7);
        final Animator animatorM132166l3 = gt0.m132166l(this.f204533g, gt0.f106354i, 0L, 600L, new PathInterpolator(0.42f, 0.0f, 0.2f, 1.0f), 1.0f, 0.37037f);
        Animator animatorM132166l4 = gt0.m132166l(this.f204535i, property, 0L, 600L, new PathInterpolator(0.42f, 0.0f, 0.2f, 1.0f), 0.0f, 1.0f);
        Animator animatorM132166l5 = gt0.m132166l(this.f204539m, property, 0L, 600L, new PathInterpolator(0.42f, 0.0f, 0.2f, 1.0f), 0.0f, 1.0f);
        final Animator animatorM132166l6 = gt0.m132166l(this.f204530d, property, 0L, 600L, new PathInterpolator(0.42f, 0.0f, 0.2f, 1.0f), 0.0f, 1.0f);
        animatorM132166l5.addListener(new C21813a(x20Var));
        animatorM132166l.addListener(new C21814b(animatorM132166l4, animatorM132166l5));
        l51.m152888H(this.f119872a, new Runnable() { // from class: l.fif0
            @Override // java.lang.Runnable
            public final void run() {
                this.f99182a.m219822G1(animatorM132166l, animatorM132166l2, animatorM132166l3, animatorM132166l6);
            }
        }, 2500L);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m219825I0(AgeView ageView, Integer num) {
        m219770Z1();
        m219845S1("");
        m219854X1(num.intValue(), ageView);
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m219826I1(x20 x20Var) {
        this.f204532f.stepToFrame(0.0f, true);
        x20Var.call();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m219827J0(AgeView ageView) {
        ageView.m29450Z(this.f119872a);
    }

    /* JADX INFO: renamed from: J1 */
    public final void m219828J1() {
        if (!NullChecker.m82486a(this.f204512C) || this.f204512C.isRunning()) {
            return;
        }
        this.f204512C.start();
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m219829K0() {
        m219845S1(SeeTextDynamicParam.age);
    }

    /* JADX INFO: renamed from: K1 */
    public final void m219830K1(NameView nameView) {
        m219832L1(nameView, false);
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m219831L0(AgeView ageView) {
        m219854X1(20, ageView);
        bnl0.m105525M0(this.f204538l, false);
    }

    /* JADX INFO: renamed from: L1 */
    public final void m219832L1(final NameView nameView, boolean z) {
        if (!z) {
            ((SignUpAiAct) this.f119872a).duringCreated(AccountModule.f16756c.m29320a1()).subscribe(psd0.m173597H(new y20() { // from class: l.uhf0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f179024a.m219821G0(nameView, (RegisterNameEnvelope) obj);
                }
            }, new y20() { // from class: l.whf0
                @Override // p153l.y20
                public final void call(Object obj) {
                    zif0.m219750G((Throwable) obj);
                }
            }));
            return;
        }
        String strM158253p0 = mgf0.m158253p0(this.f204528S);
        this.f204526Q = strM158253p0;
        nameView.m29481W(C16649dy.m118580o0(strM158253p0));
        m219873o1(strM158253p0, null, new x20() { // from class: l.thf0
            @Override // p153l.x20
            public final void call() {
                this.f174359a.m219818E0();
            }
        }, nameView);
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m219833M0(final AgeView ageView, View view) {
        i4g0.m138523u("e_ai_signup_skip_button", ((SignUpAiAct) this.f119872a).pageId(), pf60.m172085a("skip_from_which", SeeTextDynamicParam.age));
        m219744A0();
        m219776d2("填写“年龄”方便为您匹配更合适的对象，若跳过则默认为“20岁”", "继续填写", SeeTextDynamicParam.age, new x20() { // from class: l.qhf0
            @Override // p153l.x20
            public final void call() {
                zif0.m219766W();
            }
        }, new x20() { // from class: l.rhf0
            @Override // p153l.x20
            public final void call() {
                this.f163160a.m219831L0(ageView);
            }
        });
    }

    /* JADX INFO: renamed from: M1 */
    public void m219834M1(SignUpData signUpData) {
        m219839P1();
        bnl0.m105524M(this.f204542p, true);
        this.f204542p.setText(TEnum.equals(signUpData.gender, "female") ? R$string.f16951k : R$string.f16957l);
        bnl0.m105524M(this.f204543q, false);
        bnl0.m105524M(this.f204544r, true);
        this.f204544r.setText(act().getString(R$string.f16963m));
        bnl0.m105524M(this.f204545s, false);
        bnl0.m105524M(this.f204546t, false);
        this.f204510A.removeAllViews();
        this.f204542p.setText(TEnum.equals(signUpData.gender, "female") ? R$string.f16939i : R$string.f16945j);
        final AgeView ageView = new AgeView(this.f119872a);
        ageView.setAlpha(0.0f);
        this.f204510A.addView(ageView, new ConstraintLayout.C0221a(-1, -2));
        ageView.m29451a0(new y20() { // from class: l.vif0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184232a.m219823H0((Integer) obj);
            }
        }, new y20() { // from class: l.wif0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189354a.m219825I0(ageView, (Integer) obj);
            }
        });
        Animator animatorM132166l = gt0.m132166l(ageView, View.ALPHA, 0L, 400L, null, 0.0f, 1.0f);
        gt0.m132176v(animatorM132166l, new Runnable() { // from class: l.xif0
            @Override // java.lang.Runnable
            public final void run() {
                this.f194462a.m219827J0(ageView);
            }
        });
        i4g0.m138526x("e_ai_signup_age", "p_ai_signup");
        Animator animatorM132173s = gt0.m132173s(C20198t.m188689a(this.f204542p, 0L), C20198t.m188689a(this.f204544r, 600L), animatorM132166l);
        this.f204516G = animatorM132173s;
        animatorM132173s.start();
        this.f204513D.add(this.f204516G);
        gt0.m132160f(this.f204516G, new Runnable() { // from class: l.yif0
            @Override // java.lang.Runnable
            public final void run() {
                this.f200083a.m219829K0();
            }
        });
        m219828J1();
        bnl0.m105509E0(this.f204538l, new View.OnClickListener() { // from class: l.pgf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152258a.m219833M0(ageView, view);
            }
        });
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m219835N0() {
        i4g0.m138520r("e_signup_complete", ((SignUpAiAct) this.f119872a).pageId());
        ((gef0) this.f119873b).m129988B1();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m219836O0() {
        ((gef0) this.f119873b).m129994g1(false, true);
        i4g0.m138520r("e_photo_again_upload", ((SignUpAiAct) this.f119872a).pageId());
    }

    /* JADX INFO: renamed from: O1 */
    public void m219837O1(SignUpData signUpData) {
        this.f204528S = signUpData;
        m219849U1();
        bnl0.m105524M(this.f204542p, false);
        bnl0.m105524M(this.f204551y, true);
        m219772a2();
        if (C16074bp.m105752g()) {
            this.f204551y.setText("你还没有上传照片,为了不影响交友体验,记得注册完成后尽快上传头像照片哦～");
        }
        this.f204510A.removeAllViews();
        boolean zM105752g = C16074bp.m105752g();
        HoldAct holdact = this.f119872a;
        if (zM105752g) {
            i4g0.m138526x("e_signup_complete", ((SignUpAiAct) holdact).pageId());
            MediaView mediaView = new MediaView(this.f119872a);
            mediaView.setButtonText("注册完成");
            mediaView.setClickListener(new x20() { // from class: l.lif0
                @Override // p153l.x20
                public final void call() {
                    this.f132219a.m219835N0();
                }
            });
            this.f204510A.addView(mediaView, new ConstraintLayout.C0221a(-1, -2));
        } else {
            i4g0.m138526x("e_photo_again_refuse", ((SignUpAiAct) holdact).pageId());
            i4g0.m138526x("e_photo_again_upload", ((SignUpAiAct) this.f119872a).pageId());
            ChannelRegisterView channelRegisterView = new ChannelRegisterView(this.f119872a);
            channelRegisterView.setUploadClickListener(new x20() { // from class: l.mif0
                @Override // p153l.x20
                public final void call() {
                    this.f136966a.m219836O0();
                }
            });
            channelRegisterView.setRegisterClickListener(new x20() { // from class: l.nif0
                @Override // p153l.x20
                public final void call() {
                    this.f142119a.m219838P0();
                }
            });
            this.f204510A.addView(channelRegisterView, new ConstraintLayout.C0221a(-1, -2));
        }
        Animator animatorM132173s = gt0.m132173s(C20198t.m188689a(this.f204551y, 0L));
        this.f204521L = animatorM132173s;
        animatorM132173s.start();
        this.f204513D.add(this.f204521L);
        m219828J1();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m219838P0() {
        ((gef0) this.f119873b).m129988B1();
        i4g0.m138520r("e_photo_again_refuse", ((SignUpAiAct) this.f119872a).pageId());
    }

    /* JADX INFO: renamed from: P1 */
    public void m219839P1() {
        C16330cp.m111722h();
        bnl0.m105525M0(this.f204537k, false);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m219840Q0(GenderView genderView) {
        m219845S1("gender");
        genderView.m29464S();
    }

    /* JADX INFO: renamed from: Q1 */
    public void m219841Q1() {
        ((gef0) this.f119873b).m139328O0();
        m219839P1();
        bnl0.m105524M(this.f204542p, true);
        this.f204542p.setAlpha(0.0f);
        this.f204542p.setText(R$string.f16981p);
        bnl0.m105524M(this.f204543q, true);
        this.f204543q.setAlpha(0.0f);
        this.f204543q.setText(R$string.f16986q);
        bnl0.m105524M(this.f204544r, true);
        this.f204544r.setAlpha(0.0f);
        this.f204544r.setText(act().getString(R$string.f16991r));
        bnl0.m105524M(this.f204545s, false);
        bnl0.m105524M(this.f204546t, false);
        this.f204510A.removeAllViews();
        final GenderView genderView = new GenderView(this.f119872a);
        genderView.setAlpha(0.0f);
        ConstraintLayout.C0221a c0221a = new ConstraintLayout.C0221a(-1, -2);
        final x20 x20Var = new x20() { // from class: l.qgf0
            @Override // p153l.x20
            public final void call() {
                this.f157406a.m219855Y0(genderView);
            }
        };
        genderView.setGenderSaveListener(new y20() { // from class: l.rgf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163011a.m219857Z0(x20Var, genderView, (Gender) obj);
            }
        });
        this.f204510A.addView(genderView, c0221a);
        m219866g2(new x20() { // from class: l.sgf0
            @Override // p153l.x20
            public final void call() {
                this.f167848a.m219842R0(genderView);
            }
        });
        bnl0.m105509E0(this.f204538l, new View.OnClickListener() { // from class: l.tgf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174077a.m219848U0(x20Var, genderView, view);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m219842R0(final GenderView genderView) {
        m219828J1();
        Animator animatorM132173s = gt0.m132173s(C20198t.m188689a(this.f204542p, 0L), C20198t.m188689a(this.f204543q, 2000L), C20198t.m188689a(this.f204544r, 600L), gt0.m132180z(gt0.m132166l(genderView, View.TRANSLATION_Y, 0L, 400L, null, 120.0f, 0.0f), gt0.m132166l(genderView, View.ALPHA, 0L, 400L, null, 0.0f, 1.0f)));
        this.f204514E = animatorM132173s;
        gt0.m132160f(animatorM132173s, new Runnable() { // from class: l.shf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f168700a.m219840Q0(genderView);
            }
        });
        this.f204514E.start();
        this.f204513D.add(this.f204514E);
        i4g0.m138526x("e_ai_signup_gender", "p_ai_signup");
    }

    /* JADX INFO: renamed from: R1 */
    public void m219843R1(SignUpData signUpData) {
        this.f204528S = signUpData;
        m219839P1();
        m219849U1();
        if (NullChecker.m82486a(signUpData.gender)) {
            f204509T.put(signUpData.gender.toString());
        } else {
            wyd0 wyd0Var = f204509T;
            if (!TextUtils.isEmpty(wyd0Var.get())) {
                signUpData.gender = Gender.get(wyd0Var.get());
            }
        }
        if (mgf0.m158256r0()) {
            m219744A0();
            ((gef0) this.f119873b).m129988B1();
            return;
        }
        bnl0.m105524M(this.f204542p, true);
        this.f204542p.setText(R$string.f16996s);
        bnl0.m105524M(this.f204543q, true);
        this.f204543q.setText(R$string.f17001t);
        bnl0.m105524M(this.f204544r, false);
        bnl0.m105524M(this.f204545s, false);
        if (TEnum.equals(signUpData.gender, "male")) {
            this.f204548v.setImageResource(bbc0.f75935z1);
            this.f204549w.setImageResource(bbc0.f75785A1);
            this.f204550x.setImageResource(bbc0.f75788B1);
        } else if (TEnum.equals(signUpData.gender, "female")) {
            this.f204548v.setImageResource(bbc0.f75926w1);
            this.f204549w.setImageResource(bbc0.f75929x1);
            this.f204550x.setImageResource(bbc0.f75932y1);
        }
        bnl0.m105524M(this.f204546t, true);
        this.f204510A.removeAllViews();
        MediaView mediaView = new MediaView(this.f119872a);
        mediaView.setAlpha(0.0f);
        mediaView.setClickListener(new x20() { // from class: l.vhf0
            @Override // p153l.x20
            public final void call() {
                this.f184163a.m219858a1();
            }
        });
        this.f204510A.addView(mediaView, new ConstraintLayout.C0221a(-1, -2));
        Animator animatorM132173s = gt0.m132173s(C20198t.m188689a(this.f204542p, 0L), C20198t.m188689a(this.f204543q, 1200L), C20198t.m188689a(this.f204546t, 600L), gt0.m132180z(gt0.m132166l(mediaView, View.ALPHA, 0L, 400L, null, 0.0f, 1.0f)));
        this.f204520K = animatorM132173s;
        animatorM132173s.start();
        gt0.m132160f(this.f204520K, new Runnable() { // from class: l.gif0
            @Override // java.lang.Runnable
            public final void run() {
                this.f104489a.m219861d1();
            }
        });
        this.f204513D.add(this.f204520K);
        m219828J1();
        i4g0.m138526x("e_ai_signup_photo", "p_ai_signup");
        bnl0.m105509E0(this.f204538l, new View.OnClickListener() { // from class: l.rif0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163360a.m219863f1(view);
            }
        });
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m219844S0(x20 x20Var, GenderView genderView) {
        m219770Z1();
        m219845S1("");
        m219856Y1(Gender.get("male"), x20Var, genderView);
    }

    /* JADX INFO: renamed from: S1 */
    public void m219845S1(String str) {
        if (!C16074bp.m105753h() || this.f204523N.get().booleanValue()) {
            bnl0.m105525M0(this.f204538l, false);
        } else {
            i4g0.m138492A("e_ai_signup_skip_button", ((SignUpAiAct) this.f119872a).pageId(), pf60.m172085a("skip_from_which", str));
            bnl0.m105525M0(this.f204538l, true);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m219846T0(x20 x20Var, GenderView genderView) {
        bnl0.m105525M0(this.f204538l, false);
        m219856Y1(Gender.get("female"), x20Var, genderView);
    }

    /* JADX INFO: renamed from: T1 */
    public void m219847T1(SignUpData signUpData) {
        this.f204528S = signUpData;
        m219839P1();
        m219849U1();
        if (mgf0.m158256r0()) {
            m219832L1(new NameView(this.f119872a), true);
            return;
        }
        bnl0.m105524M(this.f204542p, true);
        this.f204542p.setText(R$string.f17006u);
        bnl0.m105524M(this.f204543q, false);
        bnl0.m105524M(this.f204544r, false);
        bnl0.m105524M(this.f204545s, false);
        bnl0.m105524M(this.f204546t, false);
        final NameView nameView = new NameView(this.f119872a);
        nameView.setAlpha(0.0f);
        ConstraintLayout.C0221a c0221a = new ConstraintLayout.C0221a(-1, -2);
        final kcg0 kcg0VarSubscribe = ((gef0) this.f119873b).duringCreated(Act.keyboardListenerObservable(this.f204511B)).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.ehf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94039a.m219865g1(nameView, (Boolean) obj);
            }
        }));
        final x20 x20Var = new x20() { // from class: l.fhf0
            @Override // p153l.x20
            public final void call() {
                this.f99046a.m219871m1(nameView);
            }
        };
        nameView.m29483b0(new y20() { // from class: l.ghf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104121a.m219872n1((String) obj);
            }
        }, new y20() { // from class: l.hhf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109883a.m219873o1(kcg0VarSubscribe, x20Var, nameView, (String) obj);
            }
        });
        this.f204510A.removeAllViews();
        this.f204510A.addView(nameView, c0221a);
        Animator animatorM132166l = gt0.m132166l(nameView, View.ALPHA, 0L, 400L, null, 0.0f, 1.0f);
        gt0.m132176v(animatorM132166l, new Runnable() { // from class: l.ihf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f114935a.m219874p1(nameView);
            }
        });
        Animator animatorM132173s = gt0.m132173s(C20198t.m188689a(this.f204542p, 0L), animatorM132166l);
        this.f204518I = animatorM132173s;
        animatorM132173s.start();
        gt0.m132160f(this.f204518I, new Runnable() { // from class: l.jhf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f120970a.m219876r1(nameView);
            }
        });
        this.f204513D.add(this.f204518I);
        m219828J1();
        i4g0.m138526x("e_ai_signup_name", "p_ai_signup");
        bnl0.m105509E0(this.f204538l, new View.OnClickListener() { // from class: l.lhf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132092a.m219878t1(nameView, kcg0VarSubscribe, x20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m219848U0(final x20 x20Var, final GenderView genderView, View view) {
        i4g0.m138523u("e_ai_signup_skip_button", ((SignUpAiAct) this.f119872a).pageId(), pf60.m172085a("skip_from_which", "gender"));
        m219744A0();
        m219776d2("系统默认您为“女性”方便为您精准匹配用户，性别更改机会只有一次", "我是男生", "gender", new x20() { // from class: l.ohf0
            @Override // p153l.x20
            public final void call() {
                this.f147439a.m219844S0(x20Var, genderView);
            }
        }, new x20() { // from class: l.phf0
            @Override // p153l.x20
            public final void call() {
                this.f152428a.m219846T0(x20Var, genderView);
            }
        });
    }

    /* JADX INFO: renamed from: U1 */
    public final void m219849U1() {
        if (this.f204525P != 0) {
            this.f204540n.scrollTo(0, 0);
            this.f204525P = 0;
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m219850V0() {
        m219860c2(2);
    }

    /* JADX INFO: renamed from: V1 */
    public final void m219851V1() {
        if (this.f204527R == null) {
            this.f204527R = new Runnable() { // from class: l.khf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f126868a.m219879u1();
                }
            };
        }
        l51.m152890J(this.f204527R);
        l51.m152888H(this.f119872a, this.f204527R, 300L);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m219852W0() {
        ((gef0) this.f119873b).m130007v1();
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m219853X0(GenderView genderView) {
        VText vText = this.f204545s;
        vText.setPivotX(vText.getWidth());
        VText vText2 = this.f204545s;
        vText2.setPivotY(vText2.getHeight());
        Animator animatorM188693e = C20198t.m188693e(400L, this.f204542p, this.f204543q, this.f204544r, this.f204545s, this.f204546t);
        gt0.m132176v(animatorM188693e, new Runnable() { // from class: l.yhf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f199962a.m219850V0();
            }
        });
        Animator animatorM132173s = gt0.m132173s(gt0.m132180z(gt0.m132166l(genderView, View.ALPHA, 200L, 400L, null, 1.0f, 0.0f), C20198t.m188690b(this.f204545s, 400L)), animatorM188693e);
        this.f204515F = animatorM132173s;
        gt0.m132160f(animatorM132173s, new Runnable() { // from class: l.zhf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f204412a.m219852W0();
            }
        });
        this.f204515F.start();
        this.f204513D.add(this.f204515F);
    }

    /* JADX INFO: renamed from: X1 */
    public final void m219854X1(final int i, final AgeView ageView) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(pzi0.m174454o());
        calendar.set(1, calendar.get(1) - i);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        AccountModule.f16756c.m29329e2(calendar.getTimeInMillis());
        AccountModule.f16756c.m29325c2(i);
        ((gef0) this.f119873b).m139323H0(AccountTempApi.SignUpType.birthInfoSaved, new x20() { // from class: l.ahf0
            @Override // p153l.x20
            public final void call() {
                this.f71355a.m219814A1(i, ageView);
            }
        }, new y20() { // from class: l.bhf0
            @Override // p153l.y20
            public final void call(Object obj) {
                ageView.m29448V();
            }
        });
        i4g0.m138523u("e_ai_signup_age", "p_ai_signup", jyb.m147494Y("user_age", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m219855Y0(final GenderView genderView) {
        l51.m152888H(getContext(), new Runnable() { // from class: l.ugf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f178889a.m219853X0(genderView);
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m219856Y1(final Gender gender, final x20 x20Var, final GenderView genderView) {
        ((gef0) this.f119873b).m129991E1(gender);
        ((gef0) this.f119873b).m139323H0(AccountTempApi.SignUpType.genderInfoSave, new x20() { // from class: l.vgf0
            @Override // p153l.x20
            public final void call() {
                this.f184024a.m219816B1(gender, x20Var);
            }
        }, new y20() { // from class: l.wgf0
            @Override // p153l.y20
            public final void call(Object obj) {
                genderView.m29464S();
            }
        });
        i4g0.m138523u("e_ai_signup_gender", "p_ai_signup", pf60.m172085a("ai_signup_gender", TEnum.equals(gender, "male") ? "male" : "female"));
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m219857Z0(x20 x20Var, GenderView genderView, Gender gender) {
        m219770Z1();
        m219845S1("");
        m219856Y1(gender, x20Var, genderView);
        ((gef0) this.f119873b).m139328O0();
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m219858a1() {
        boolean zEquals = TextUtils.equals("DouyinTantan01", ls4.m155671b());
        Presenter presenter = this.f119873b;
        if (zEquals) {
            ((gef0) presenter).m129994g1(false, true);
        } else {
            ((gef0) presenter).m129994g1(false, false);
        }
        i4g0.m138520r("e_ai_signup_photo", "p_ai_signup");
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public final void m219873o1(String str, kcg0 kcg0Var, x20 x20Var, NameView nameView) {
        AccountModule.f16756c.m29338j2(str);
        m219864f2(nameView, kcg0Var, x20Var, str);
        i4g0.m138520r("e_ai_signup_name", "p_ai_signup");
    }

    /* JADX INFO: renamed from: c2 */
    public void m219860c2(int i) {
        if (mgf0.m158256r0()) {
            i = Math.min(2, i);
        }
        if (i < 0) {
            return;
        }
        this.f204539m.setDefaultStep(i - 1);
        if (i < 1) {
            return;
        }
        this.f204539m.setTargetStep(i);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m219861d1() {
        if (C16074bp.m105753h()) {
            bnl0.m105525M0(this.f204538l, true);
            i4g0.m138492A("e_ai_signup_skip_button", ((SignUpAiAct) this.f119872a).pageId(), pf60.m172085a("skip_from_which", ReminderAction.photo));
        }
    }

    @Override // p153l.jbf0, p153l.iam
    public void destroy() {
        super.destroy();
        if (NullChecker.m82486a(this.f204512C)) {
            this.f204512C.cancel();
        }
        int i = 0;
        while (true) {
            int size = this.f204513D.size();
            ArrayList<Animator> arrayList = this.f204513D;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            if (NullChecker.m82486a(arrayList.get(i)) && this.f204513D.get(i).isRunning()) {
                this.f204513D.get(i).cancel();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m219862e1() {
        ((gef0) this.f119873b).m129988B1();
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m219863f1(View view) {
        i4g0.m138523u("e_ai_signup_skip_button", ((SignUpAiAct) this.f119872a).pageId(), pf60.m172085a("skip_from_which", ReminderAction.photo));
        m219744A0();
        m219776d2("跳过将会影响您进入后匹配用户的体验", "继续上传", ReminderAction.photo, new x20() { // from class: l.mhf0
            @Override // p153l.x20
            public final void call() {
                zif0.m219782i0();
            }
        }, new x20() { // from class: l.nhf0
            @Override // p153l.x20
            public final void call() {
                this.f141989a.m219862e1();
            }
        });
    }

    /* JADX INFO: renamed from: f2 */
    public final void m219864f2(final NameView nameView, final kcg0 kcg0Var, final x20 x20Var, final String str) {
        DetectRequest detectRequestNew_ = DetectRequest.new_();
        detectRequestNew_.category = DetectCategoryType.get("login");
        DetectText detectTextNew_ = DetectText.new_();
        detectTextNew_.key = "nikeName";
        detectTextNew_.value = str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(detectTextNew_);
        detectRequestNew_.text = arrayList;
        ((gef0) this.f119873b).m139329P0(detectRequestNew_, nameView, AccountTempApi.SignUpType.nameInfoSaved, new x20() { // from class: l.hif0
            @Override // p153l.x20
            public final void call() {
                this.f110021a.m219820F1(str, x20Var, kcg0Var);
            }
        }, new y20() { // from class: l.iif0
            @Override // p153l.y20
            public final void call(Object obj) {
                nameView.m29479T();
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m219865g1(NameView nameView, Boolean bool) {
        if (bool.booleanValue()) {
            nameView.m29482a0(this.f119872a);
        } else {
            nameView.m29480V();
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final void m219866g2(final x20 x20Var) {
        if (this.f204522M.get().booleanValue()) {
            m219860c2(1);
            if (NullChecker.m82486a(x20Var)) {
                x20Var.call();
                return;
            }
            return;
        }
        bnl0.m105524M(this.f204531e, true);
        this.f204533g.setAlpha(0.0f);
        this.f204530d.setAlpha(0.0f);
        this.f204529c.setVisibility(0);
        bnl0.m105525M0(this.f204541o, false);
        this.f204535i.setAlpha(0.0f);
        this.f204539m.setAlpha(0.0f);
        final x20 x20Var2 = new x20() { // from class: l.xgf0
            @Override // p153l.x20
            public final void call() {
                this.f194186a.m219824H1(x20Var);
            }
        };
        l51.m152888H(this.f119872a, new Runnable() { // from class: l.ygf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f199827a.m219826I1(x20Var2);
            }
        }, 500L);
        i4g0.m138526x("e_ai_appear", "p_ai_signup");
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m219867h1() {
        act().hideInput(this.f204511B);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f204511B = m219883z0(layoutInflater, viewGroup);
        m219798r();
        return this.f204511B;
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m219868j1() {
        m219860c2(4);
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m219869k1() {
        ((gef0) this.f119873b).m130007v1();
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m219870l1(NameView nameView) {
        Animator animatorM132166l = gt0.m132166l(nameView, View.ALPHA, 200L, 400L, null, 1.0f, 0.0f);
        gt0.m132160f(animatorM132166l, new Runnable() { // from class: l.oif0
            @Override // java.lang.Runnable
            public final void run() {
                this.f147527a.m219867h1();
            }
        });
        Animator animatorM188693e = C20198t.m188693e(400L, this.f204542p, this.f204543q, this.f204544r, this.f204545s, this.f204546t);
        gt0.m132176v(animatorM188693e, new Runnable() { // from class: l.pif0
            @Override // java.lang.Runnable
            public final void run() {
                this.f152532a.m219868j1();
            }
        });
        Animator animatorM132173s = gt0.m132173s(gt0.m132180z(animatorM132166l, C20198t.m188690b(this.f204545s, 400L)), animatorM188693e);
        this.f204519J = animatorM132173s;
        gt0.m132160f(animatorM132173s, new Runnable() { // from class: l.qif0
            @Override // java.lang.Runnable
            public final void run() {
                this.f157836a.m219869k1();
            }
        });
        this.f204519J.start();
        this.f204513D.add(this.f204519J);
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m219871m1(final NameView nameView) {
        l51.m152888H(getContext(), new Runnable() { // from class: l.xhf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f194361a.m219870l1(nameView);
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m219872n1(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f204544r;
        if (zIsEmpty) {
            bnl0.m105524M(vText, false);
            i4g0.m138524v("e_ai_signup_name", "p_ai_signup", new pf60[0]);
            return;
        }
        vText.setText(str);
        this.f204544r.setBackgroundResource(bbc0.f75797E1);
        this.f204544r.setTextColor(((SignUpAiAct) this.f119872a).getResources().getColor(a9c0.f69026k));
        bnl0.m105524M(this.f204544r, true);
        this.f204544r.setAlpha(1.0f);
        C20198t.m188691c(this.f119872a, this.f204544r);
        m219851V1();
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m219874p1(NameView nameView) {
        nameView.m29482a0(this.f119872a);
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m219875q1(NameView nameView, View view) {
        i4g0.m138520r("e_ai_signup_chage_name_button", ((SignUpAiAct) this.f119872a).pageId());
        m219830K1(nameView);
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m219876r1(final NameView nameView) {
        if (C16074bp.m105753h()) {
            m219845S1(AuthenticationTokenClaims.JSON_KEY_NAME);
            nameView.setEditViewPadding(true);
            bnl0.m105524M(nameView.f17130e, true);
            bnl0.m105509E0(nameView.f17130e, new View.OnClickListener() { // from class: l.jif0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f121078a.m219875q1(nameView, view);
                }
            });
        } else {
            nameView.setEditViewPadding(false);
            bnl0.m105524M(nameView.f17130e, false);
        }
        if (!TextUtils.isEmpty(AccountModule.f16756c.m29289I2().get())) {
            nameView.post(new Runnable() { // from class: l.kif0
                @Override // java.lang.Runnable
                public final void run() {
                    nameView.m29481W(C16649dy.m118580o0(AccountModule.f16756c.m29289I2().get()));
                }
            });
        } else if (C16074bp.m105753h()) {
            m219830K1(nameView);
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m219877s1(NameView nameView, kcg0 kcg0Var, x20 x20Var) {
        bnl0.m105525M0(this.f204538l, false);
        m219873o1(!TextUtils.isEmpty(nameView.getLastName()) ? nameView.getLastName() : this.f204526Q, kcg0Var, x20Var, nameView);
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m219878t1(final NameView nameView, final kcg0 kcg0Var, final x20 x20Var, View view) {
        i4g0.m138523u("e_ai_signup_skip_button", ((SignUpAiAct) this.f119872a).pageId(), pf60.m172085a("skip_from_which", AuthenticationTokenClaims.JSON_KEY_NAME));
        m219744A0();
        m219776d2("填写“昵称”方便别人更快记住你，若仍要跳过，系统将随机展示昵称，您可进入后自行更改", "继续填写", AuthenticationTokenClaims.JSON_KEY_NAME, new x20() { // from class: l.aif0
            @Override // p153l.x20
            public final void call() {
                zif0.m219764U();
            }
        }, new x20() { // from class: l.bif0
            @Override // p153l.x20
            public final void call() {
                this.f76869a.m219877s1(nameView, kcg0Var, x20Var);
            }
        });
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m219879u1() {
        int i;
        int height;
        if (!NullChecker.m82486a(act()) || act().isFinishing()) {
            return;
        }
        int[] iArr = new int[2];
        this.f204552z.getLocationInWindow(iArr);
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        if (bnl0.m105529O0(this.f204544r)) {
            this.f204544r.getLocationInWindow(iArr2);
            i = iArr2[1];
            height = this.f204544r.getHeight();
        } else if (bnl0.m105529O0(this.f204543q)) {
            this.f204543q.getLocationInWindow(iArr2);
            i = iArr2[1];
            height = this.f204543q.getHeight();
        } else {
            this.f204542p.getLocationInWindow(iArr2);
            i = iArr2[1];
            height = this.f204542p.getHeight();
        }
        int i3 = i + height;
        if (i2 < i3) {
            this.f204525P = (i3 - i2) + this.f204540n.getScrollY();
            gt0.m132167m(this.f204540n, new C21815c(Integer.TYPE, ""), 0L, 200L, null, this.f204540n.getScrollY(), this.f204525P).start();
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m219880v1() {
        act().hideInput(this.f204511B);
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m219881w1() {
        m219860c2(3);
    }

    /* JADX INFO: renamed from: y1 */
    public final /* synthetic */ void m219882y1() {
        ((gef0) this.f119873b).m130007v1();
    }

    /* JADX INFO: renamed from: z0 */
    public View m219883z0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ajf0.m98380b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m219884z1(AgeView ageView) {
        Animator animatorM132166l = gt0.m132166l(ageView, View.ALPHA, 200L, 400L, null, 1.0f, 0.0f);
        gt0.m132160f(animatorM132166l, new Runnable() { // from class: l.sif0
            @Override // java.lang.Runnable
            public final void run() {
                this.f168820a.m219880v1();
            }
        });
        Animator animatorM188693e = C20198t.m188693e(400L, this.f204542p, this.f204543q, this.f204544r, this.f204545s, this.f204546t);
        gt0.m132176v(animatorM188693e, new Runnable() { // from class: l.tif0
            @Override // java.lang.Runnable
            public final void run() {
                this.f174459a.m219881w1();
            }
        });
        Animator animatorM132173s = gt0.m132173s(gt0.m132180z(animatorM132166l, C20198t.m188690b(this.f204545s, 400L)), animatorM188693e);
        this.f204517H = animatorM132173s;
        gt0.m132160f(animatorM132173s, new Runnable() { // from class: l.uif0
            @Override // java.lang.Runnable
            public final void run() {
                this.f179094a.m219882y1();
            }
        });
        this.f204517H.start();
        this.f204513D.add(this.f204517H);
    }
}
