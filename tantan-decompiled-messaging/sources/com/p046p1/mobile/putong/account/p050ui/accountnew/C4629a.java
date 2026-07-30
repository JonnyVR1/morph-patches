package com.p046p1.mobile.putong.account.p050ui.accountnew;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.PhoneNumber;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton_FakeShadow;
import p147v.VCheckBox;
import p147v.VText;
import p149l.C17133gp;
import p149l.C21176xm;
import p149l.C21383yf;
import p149l.a3e0;
import p149l.c3f0;
import p149l.d30;
import p149l.djj0;
import p149l.e30;
import p149l.e51;
import p149l.fyk0;
import p149l.i0g0;
import p149l.lsi0;
import p149l.n6j0;
import p149l.pk8;
import p149l.pxk0;
import p149l.q4c0;
import p149l.t100;
import p149l.vij;
import p149l.vwb;
import p149l.xdl0;
import p149l.xvf0;
import p149l.yk5;
import p149l.ys60;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.a */
/* JADX INFO: loaded from: classes9.dex */
public class C4629a extends c3f0<pxk0, VerifyCodeInputAct> {

    /* JADX INFO: renamed from: w */
    public static String f16476w;

    /* JADX INFO: renamed from: x */
    public static int f16477x;

    /* JADX INFO: renamed from: c */
    public VText f16478c;

    /* JADX INFO: renamed from: d */
    public VText f16479d;

    /* JADX INFO: renamed from: e */
    public VerifyCodeView f16480e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f16481f;

    /* JADX INFO: renamed from: g */
    public VText f16482g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f16483h;

    /* JADX INFO: renamed from: i */
    public VText f16484i;

    /* JADX INFO: renamed from: j */
    public VText f16485j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f16486k;

    /* JADX INFO: renamed from: l */
    public VCheckBox f16487l;

    /* JADX INFO: renamed from: m */
    public VText f16488m;

    /* JADX INFO: renamed from: n */
    public VButton_FakeShadow f16489n;

    /* JADX INFO: renamed from: o */
    public pxk0 f16490o;

    /* JADX INFO: renamed from: p */
    public boolean f16491p;

    /* JADX INFO: renamed from: q */
    public int f16492q;

    /* JADX INFO: renamed from: r */
    public boolean f16493r;

    /* JADX INFO: renamed from: s */
    public boolean f16494s;

    /* JADX INFO: renamed from: t */
    public long f16495t;

    /* JADX INFO: renamed from: u */
    public yk5 f16496u;

    /* JADX INFO: renamed from: v */
    public boolean f16497v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.a$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4629a.this.f16487l.setChecked(true);
            C4629a.this.f16490o.f151704o.call();
            C4629a.this.f16496u.dismiss();
        }
    }

    public C4629a(@NonNull VerifyCodeInputAct verifyCodeInputAct) {
        super(verifyCodeInputAct);
        this.f16492q = 0;
        this.f16493r = false;
        this.f16495t = 0L;
        this.f16497v = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m28533N(View view) {
        this.f16490o.f151704o.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m28534P() {
        if (NullChecker.m81303a(this.f78941a) && NullChecker.m81303a(this.f16480e)) {
            ((VerifyCodeInputAct) this.f78941a).showInput(this.f16480e, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m28535Q() {
        this.f16480e.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m28536R() {
        if (m28559L()) {
            return;
        }
        m28555H();
        zvf0.m220396r("e_appeal_phone_number_verification_policy", ((VerifyCodeInputAct) this.f78941a).pageId());
        this.f16496u.show();
    }

    /* JADX INFO: renamed from: C */
    public View m28551C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fyk0.m123773b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: E */
    public void m28552E(Menu menu) {
        menu.add(0, q4c0.f152606l0, 0, R$string.f16247m2).setShowAsAction(2);
    }

    @Override // p149l.c3f0, p149l.s7m
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(pxk0 pxk0Var) {
        this.f16490o = pxk0Var;
    }

    /* JADX INFO: renamed from: G */
    public void m28554G() {
        this.f16480e.setText("");
        this.f16492q++;
    }

    /* JADX INFO: renamed from: H */
    public void m28555H() {
        if (NullChecker.m81305c(this.f16480e, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            this.f16480e.m28528c();
        }
    }

    /* JADX INFO: renamed from: I */
    public void m28556I() {
        ((VerifyCodeInputAct) this.f78941a).onHomePressed();
        this.f16493r = true;
    }

    /* JADX INFO: renamed from: J */
    public void m28557J(VerifyReason verifyReason, int i, String str, VerifyData verifyData, boolean z, String str2) {
        this.f16491p = true;
        e51.m114742G(new Runnable() { // from class: l.qxk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f156849a.m28535Q();
            }
        });
        if (TEnum.equals(verifyReason, VerifyReason.ban_appeal)) {
            ((VerifyCodeInputAct) this.f78941a).setTitle(R$string.f16189c4);
            this.f16489n.setText(R$string.f16190d);
        }
        String string = ((VerifyCodeInputAct) this.f78941a).getResources().getString(R$string.f16183b4);
        String str3 = ((VerifyCodeInputAct) this.f78941a).getResources().getString(R$string.f16177a4) + string;
        if (NullChecker.m81303a(AccountModule.m28132H()) && AccountModule.m28132H().mo30822tg() == 1) {
            string = ((VerifyCodeInputAct) this.f78941a).getResources().getString(R$string.f16171Z3);
            str3 = ((VerifyCodeInputAct) this.f78941a).getResources().getString(R$string.f16166Y3) + string;
        }
        this.f16488m.setText(str3);
        yk5 yk5Var = new yk5(this.f78941a, NullChecker.m81303a(AccountModule.m28132H()) ? AccountModule.m28132H().mo30822tg() : 1);
        this.f16496u = yk5Var;
        yk5Var.m215118D(new a());
        djj0.m112082c(this.f16488m, string, new d30() { // from class: l.wxk0
            @Override // p149l.d30
            public final void call() {
                this.f188491a.m28536R();
            }
        });
        this.f16479d.setText(ys60.m215881a(i, str));
        this.f16478c.setText(R$string.f16161X3);
        if (e51.m114737B(this.f16490o.m171901p1(verifyReason))) {
            this.f16490o.m171902q1();
        } else {
            ((VerifyCodeInputAct) this.f78941a).progress(R$string.f16227j0);
            verifyData.language = i0g0.m133885y();
            this.f16490o.m171896W1(true);
            this.f16490o.f151703n.run();
        }
        this.f16480e.setOnCompleteAction(this.f16490o.f151704o);
        this.f16480e.setOnClickListener(new View.OnClickListener() { // from class: l.xxk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194877a.m28562S(view);
            }
        });
        this.f16480e.setListener(new VerifyCodeView.InterfaceC4627a() { // from class: l.yxk0
            @Override // com.p046p1.mobile.putong.account.p050ui.accountnew.VerifyCodeView.InterfaceC4627a
            /* JADX INFO: renamed from: a */
            public final void mo28530a(String str4) {
                this.f200634a.m28560M(str4);
            }
        });
        xdl0.m208411y(this.f16489n, this.f16480e.getText().length() == 4);
        this.f16489n.setOnClickListener(new View.OnClickListener() { // from class: l.zxk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205463a.m28533N(view);
            }
        });
        if (C17133gp.m127320k()) {
            xdl0.m208360X(this.f16478c, t100.m186890d(32.0f));
            xdl0.m208360X(this.f16479d, t100.m186890d(16.0f));
            xdl0.m208360X(this.f16480e, t100.m186890d(24.0f));
            xdl0.m208360X(this.f16481f, t100.m186890d(24.0f));
            xdl0.m208345M0(this.f16483h, true);
            xdl0.m208329E0(this.f16484i, new View.OnClickListener() { // from class: l.ayk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f72296a.m28561O(view);
                }
            });
        }
        this.f16486k.setVisibility(8);
        e51.m114743H(this.f78941a, new Runnable() { // from class: l.byk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f77942a.m28534P();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: K */
    public int m28558K() {
        try {
            return Integer.parseInt(vwb.m200345q(this.f16480e.getText()));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: L */
    public final boolean m28559L() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f16495t;
        long j2 = jElapsedRealtime - j;
        if (j > 0 && j2 < 500) {
            return true;
        }
        this.f16495t = jElapsedRealtime;
        return false;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m28560M(String str) {
        if (this.f16491p && str.length() > 0) {
            this.f16491p = false;
            if (!TEnum.equals(this.f16490o.m171900o1(), VerifyReason.ban_appeal)) {
                xvf0.m211279a("e_verification_code_input", ((VerifyCodeInputAct) this.f78941a).pageId(), ((VerifyCodeInputAct) this.f78941a).getClass().getName(), new Object[0]);
            }
        }
        xdl0.m208411y(this.f16489n, str.length() == 4);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m28561O(View view) {
        zvf0.m220396r("e_prelogin_verification_code_page_feedback", "p_sign_in_verification_code_view");
        act().startActivity(WebViewAct.m80165a2(act(), "帮助与反馈", a3e0.m94685a("https://feedback.tantanapp.com/feedback-mobile/pre-login"), true));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m28562S(View view) {
        if (TEnum.equals(this.f16490o.m171900o1(), VerifyReason.ban_appeal)) {
            return;
        }
        zvf0.m220396r("e_verification_code_input", ((VerifyCodeInputAct) this.f78941a).pageId());
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m28563T() {
        this.f16494s = true;
        this.f16490o.m171897X1();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m28564U(VerifyData verifyData) {
        m105019f(PasswordResetNewAct.m28489V1(this.f78941a, verifyData));
        ((VerifyCodeInputAct) this.f78941a).m50458m2();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m28565V(VerifyReason verifyReason) {
        e51.m114746K(this.f16490o.m171901p1(verifyReason));
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m28566W(int i, String str, final VerifyReason verifyReason) {
        SignInData signInData = new SignInData();
        signInData.code = Integer.valueOf(m28558K());
        signInData.username = i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = pk8.m169981N();
        signInData.grantType = SignInGrantType.get(SignInGrantType.confirmation_code);
        this.f16490o.m100082J0(signInData, new d30() { // from class: l.uxk0
            @Override // p149l.d30
            public final void call() {
                this.f178745a.m28565V(verifyReason);
            }
        }, null);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m28567X(int i, String str) {
        PhoneNumber phoneNumberNew_ = PhoneNumber.new_();
        phoneNumberNew_.countryCode = i;
        phoneNumberNew_.number = str;
        AccountModule.m28132H().verifyAppealIdentity(act(), phoneNumberNew_);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m28568Y(Pair pair) {
        this.f16490o.m171895V1(pair);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m28569Z(String str) {
        if (m28559L()) {
            return;
        }
        if (!TEnum.equals(this.f16490o.m171900o1(), VerifyReason.ban_appeal)) {
            zvf0.m220399u("e_get_another_code_button", ((VerifyCodeInputAct) this.f78941a).pageId(), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, str));
        }
        this.f16490o.m171896W1(false);
        this.f16490o.f151703n.run();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m28570a0(String str) {
        if (m28559L()) {
            return;
        }
        if (!TEnum.equals(this.f16490o.m171900o1(), VerifyReason.ban_appeal)) {
            zvf0.m220399u("e_get_another_code_button", ((VerifyCodeInputAct) this.f78941a).pageId(), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, str));
        }
        this.f16490o.m171896W1(false);
        this.f16490o.f151703n.run();
    }

    /* JADX INFO: renamed from: b0 */
    public void m28572b0(VerifyReason verifyReason) {
        if (TEnum.equals(verifyReason, VerifyReason.ban_appeal)) {
            n6j0.m158048b("e_p_appeal_verify_phonenumber_page_back", ((VerifyCodeInputAct) this.f78941a).pageId(), new n6j0.C18629a[0]);
        }
        this.f16493r = false;
    }

    /* JADX INFO: renamed from: c0 */
    public void m28573c0(final VerifyData verifyData, final VerifyReason verifyReason, final int i, final String str, boolean z) {
        d30 d30Var;
        int i2 = f16477x;
        f16477x = i2 + 1;
        if (i2 >= 5) {
            this.f16480e.setText("");
            lsi0.m151578h(R$string.f16316z3);
            return;
        }
        verifyData.code = m28558K();
        if (TEnum.equals(verifyReason, VerifyReason.signup)) {
            d30Var = new d30() { // from class: l.cyk0
                @Override // p149l.d30
                public final void call() {
                    this.f82995a.m28563T();
                }
            };
        } else if (TEnum.equals(verifyReason, VerifyReason.forgot_password)) {
            d30Var = new d30() { // from class: l.dyk0
                @Override // p149l.d30
                public final void call() {
                    this.f88403a.m28564U(verifyData);
                }
            };
        } else if (TEnum.equals(verifyReason, VerifyReason.signin)) {
            d30Var = new d30() { // from class: l.eyk0
                @Override // p149l.d30
                public final void call() {
                    this.f93758a.m28566W(i, str, verifyReason);
                }
            };
        } else {
            d30Var = TEnum.equals(verifyReason, VerifyReason.ban_appeal) ? new d30() { // from class: l.rxk0
                @Override // p149l.d30
                public final void call() {
                    this.f161481a.m28567X(i, str);
                }
            } : null;
        }
        if (TEnum.equals(verifyReason, VerifyReason.fix_verify_code_hack) || TEnum.equals(verifyReason, VerifyReason.signup_signin)) {
            this.f16490o.m171899Z1();
        } else {
            this.f16490o.m171898Y1(d30Var);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m28574d0(Throwable th, VerifyReason verifyReason, final String str) {
        ((VerifyCodeInputAct) this.f78941a).progressDismiss();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m28577g0(str);
            C21176xm.m210021n0(act(), new e30() { // from class: l.sxk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f166801a.m28568Y((Pair) obj);
                }
            });
        } else {
            if (z && ((TantanException.Client.AccountService) th).code == 403003) {
                vij.INSTANCE.m198583c(act());
                return;
            }
            xdl0.m208345M0(this.f16482g, !e51.m114737B(this.f16490o.m171901p1(verifyReason)));
            this.f16482g.setText(R$string.f16061D3);
            djj0.m112082c(this.f16482g, ((VerifyCodeInputAct) this.f78941a).string(R$string.f16066E3), new d30() { // from class: l.txk0
                @Override // p149l.d30
                public final void call() {
                    this.f172511a.m28569Z(str);
                }
            });
            C21383yf.m214461b(th);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m28575e0(VerifyReason verifyReason) {
        ((VerifyCodeInputAct) this.f78941a).progressDismiss();
        f16477x = 0;
        this.f16490o.m171902q1();
        xdl0.m208345M0(this.f16485j, true);
        xdl0.m208345M0(this.f16482g, false);
    }

    /* JADX INFO: renamed from: f0 */
    public void m28576f0(String str, VerifyReason verifyReason) {
        if (!TextUtils.equals(str, f16476w)) {
            e51.m114746K(this.f16490o.m171901p1(verifyReason));
        }
        f16476w = str;
    }

    /* JADX INFO: renamed from: g0 */
    public void m28577g0(final String str) {
        this.f16485j.setText(((VerifyCodeInputAct) this.f78941a).getString(R$string.f16160X2, 60));
        xdl0.m208345M0(this.f16482g, true);
        xdl0.m208345M0(this.f16485j, false);
        this.f16482g.setText(R$string.f16061D3);
        djj0.m112082c(this.f16482g, ((VerifyCodeInputAct) this.f78941a).string(R$string.f16066E3), new d30() { // from class: l.vxk0
            @Override // p149l.d30
            public final void call() {
                this.f183459a.m28570a0(str);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m28578h0(boolean z) {
        this.f16497v = z;
    }

    /* JADX INFO: renamed from: i0 */
    public void m28579i0(long j) {
        this.f16485j.setText(((VerifyCodeInputAct) this.f78941a).getString(R$string.f16160X2, Long.valueOf(59 - j)));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m28551C(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public void m28580j0(VerifyReason verifyReason, boolean z) {
        boolean zEquals = TEnum.equals(verifyReason, VerifyReason.signin);
        HoldAct holdact = this.f78941a;
        if (zEquals) {
            ((VerifyCodeInputAct) holdact).setTitle(R$string.f16091J3);
        } else {
            ((VerifyCodeInputAct) holdact).setTitle(R$string.f16091J3);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m28581k0(VerifyReason verifyReason, VerifyData verifyData, int i, String str, Throwable th) {
        ((VerifyCodeInputAct) this.f78941a).progressDismiss();
        this.f16480e.setText("");
        C21383yf.m214461b(th);
    }

    /* JADX INFO: renamed from: l0 */
    public void m28582l0() {
        ((VerifyCodeInputAct) this.f78941a).hideInput();
        ((VerifyCodeInputAct) this.f78941a).progressDismiss();
    }
}
