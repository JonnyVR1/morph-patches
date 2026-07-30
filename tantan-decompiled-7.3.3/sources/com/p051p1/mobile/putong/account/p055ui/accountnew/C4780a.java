package com.p051p1.mobile.putong.account.p055ui.accountnew;

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
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton_FakeShadow;
import p151v.VCheckBox;
import p151v.VText;
import p153l.C16074bp;
import p153l.C20102sm;
import p153l.C20299tf;
import p153l.bm5;
import p153l.bnl0;
import p153l.e170;
import p153l.ebe0;
import p153l.g4g0;
import p153l.gsj0;
import p153l.i4g0;
import p153l.jbf0;
import p153l.jyb;
import p153l.l51;
import p153l.l7l0;
import p153l.o1j0;
import p153l.olj;
import p153l.q8g0;
import p153l.qa00;
import p153l.rfj0;
import p153l.tl8;
import p153l.v6l0;
import p153l.wcc0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.a */
/* JADX INFO: loaded from: classes9.dex */
public class C4780a extends jbf0<v6l0, VerifyCodeInputAct> {

    /* JADX INFO: renamed from: w */
    public static String f17195w;

    /* JADX INFO: renamed from: x */
    public static int f17196x;

    /* JADX INFO: renamed from: c */
    public VText f17197c;

    /* JADX INFO: renamed from: d */
    public VText f17198d;

    /* JADX INFO: renamed from: e */
    public VerifyCodeView f17199e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f17200f;

    /* JADX INFO: renamed from: g */
    public VText f17201g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f17202h;

    /* JADX INFO: renamed from: i */
    public VText f17203i;

    /* JADX INFO: renamed from: j */
    public VText f17204j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f17205k;

    /* JADX INFO: renamed from: l */
    public VCheckBox f17206l;

    /* JADX INFO: renamed from: m */
    public VText f17207m;

    /* JADX INFO: renamed from: n */
    public VButton_FakeShadow f17208n;

    /* JADX INFO: renamed from: o */
    public v6l0 f17209o;

    /* JADX INFO: renamed from: p */
    public boolean f17210p;

    /* JADX INFO: renamed from: q */
    public int f17211q;

    /* JADX INFO: renamed from: r */
    public boolean f17212r;

    /* JADX INFO: renamed from: s */
    public boolean f17213s;

    /* JADX INFO: renamed from: t */
    public long f17214t;

    /* JADX INFO: renamed from: u */
    public bm5 f17215u;

    /* JADX INFO: renamed from: v */
    public boolean f17216v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.a$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4780a.this.f17206l.setChecked(true);
            C4780a.this.f17209o.f182669o.call();
            C4780a.this.f17215u.dismiss();
        }
    }

    public C4780a(@NonNull VerifyCodeInputAct verifyCodeInputAct) {
        super(verifyCodeInputAct);
        this.f17211q = 0;
        this.f17212r = false;
        this.f17214t = 0L;
        this.f17216v = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m29532N(View view) {
        this.f17209o.f182669o.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m29533P() {
        if (NullChecker.m82486a(this.f119872a) && NullChecker.m82486a(this.f17199e)) {
            ((VerifyCodeInputAct) this.f119872a).showInput(this.f17199e, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m29534Q() {
        this.f17199e.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m29535R() {
        if (m29558L()) {
            return;
        }
        m29554H();
        i4g0.m138520r("e_appeal_phone_number_verification_policy", ((VerifyCodeInputAct) this.f119872a).pageId());
        this.f17215u.show();
    }

    /* JADX INFO: renamed from: C */
    public View m29550C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l7l0.m153145b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: E */
    public void m29551E(Menu menu) {
        menu.add(0, wcc0.f188454l0, 0, R$string.f16966m2).setShowAsAction(2);
    }

    @Override // p153l.jbf0, p153l.iam
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(v6l0 v6l0Var) {
        this.f17209o = v6l0Var;
    }

    /* JADX INFO: renamed from: G */
    public void m29553G() {
        this.f17199e.setText("");
        this.f17211q++;
    }

    /* JADX INFO: renamed from: H */
    public void m29554H() {
        if (NullChecker.m82488c(this.f17199e, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            this.f17199e.m29527c();
        }
    }

    /* JADX INFO: renamed from: I */
    public void m29555I() {
        ((VerifyCodeInputAct) this.f119872a).onHomePressed();
        this.f17212r = true;
    }

    /* JADX INFO: renamed from: J */
    public void m29556J(VerifyReason verifyReason, int i, String str, VerifyData verifyData, boolean z, String str2) {
        this.f17210p = true;
        l51.m152887G(new Runnable() { // from class: l.w6l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f187629a.m29534Q();
            }
        });
        if (TEnum.equals(verifyReason, VerifyReason.ban_appeal)) {
            ((VerifyCodeInputAct) this.f119872a).setTitle(R$string.f16908c4);
            this.f17208n.setText(R$string.f16909d);
        }
        String string = ((VerifyCodeInputAct) this.f119872a).getResources().getString(R$string.f16902b4);
        String str3 = ((VerifyCodeInputAct) this.f119872a).getResources().getString(R$string.f16896a4) + string;
        if (NullChecker.m82486a(AccountModule.m29131H()) && AccountModule.m29131H().mo31825tg() == 1) {
            string = ((VerifyCodeInputAct) this.f119872a).getResources().getString(R$string.f16890Z3);
            str3 = ((VerifyCodeInputAct) this.f119872a).getResources().getString(R$string.f16885Y3) + string;
        }
        this.f17207m.setText(str3);
        bm5 bm5Var = new bm5(this.f119872a, NullChecker.m82486a(AccountModule.m29131H()) ? AccountModule.m29131H().mo31825tg() : 1);
        this.f17215u = bm5Var;
        bm5Var.m104999D(new a());
        gsj0.m132059c(this.f17207m, string, new x20() { // from class: l.c7l0
            @Override // p153l.x20
            public final void call() {
                this.f80119a.m29535R();
            }
        });
        this.f17198d.setText(e170.m118942a(i, str));
        this.f17197c.setText(R$string.f16880X3);
        if (l51.m152882B(this.f17209o.m200122p1(verifyReason))) {
            this.f17209o.m200123q1();
        } else {
            ((VerifyCodeInputAct) this.f119872a).progress(R$string.f16946j0);
            verifyData.language = q8g0.m175820y();
            this.f17209o.m200117W1(true);
            this.f17209o.f182668n.run();
        }
        this.f17199e.setOnCompleteAction(this.f17209o.f182669o);
        this.f17199e.setOnClickListener(new View.OnClickListener() { // from class: l.d7l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85534a.m29561S(view);
            }
        });
        this.f17199e.setListener(new VerifyCodeView.InterfaceC4778a() { // from class: l.e7l0
            @Override // com.p051p1.mobile.putong.account.p055ui.accountnew.VerifyCodeView.InterfaceC4778a
            /* JADX INFO: renamed from: a */
            public final void mo29529a(String str4) {
                this.f92447a.m29559M(str4);
            }
        });
        bnl0.m105591y(this.f17208n, this.f17199e.getText().length() == 4);
        this.f17208n.setOnClickListener(new View.OnClickListener() { // from class: l.f7l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97573a.m29532N(view);
            }
        });
        if (C16074bp.m105756k()) {
            bnl0.m105540X(this.f17197c, qa00.m175859d(32.0f));
            bnl0.m105540X(this.f17198d, qa00.m175859d(16.0f));
            bnl0.m105540X(this.f17199e, qa00.m175859d(24.0f));
            bnl0.m105540X(this.f17200f, qa00.m175859d(24.0f));
            bnl0.m105525M0(this.f17202h, true);
            bnl0.m105509E0(this.f17203i, new View.OnClickListener() { // from class: l.g7l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f102590a.m29560O(view);
                }
            });
        }
        this.f17205k.setVisibility(8);
        l51.m152888H(this.f119872a, new Runnable() { // from class: l.h7l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f108140a.m29533P();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: K */
    public int m29557K() {
        try {
            return Integer.parseInt(jyb.m147528q(this.f17199e.getText()));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: L */
    public final boolean m29558L() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f17214t;
        long j2 = jElapsedRealtime - j;
        if (j > 0 && j2 < 500) {
            return true;
        }
        this.f17214t = jElapsedRealtime;
        return false;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m29559M(String str) {
        if (this.f17210p && str.length() > 0) {
            this.f17210p = false;
            if (!TEnum.equals(this.f17209o.m200121o1(), VerifyReason.ban_appeal)) {
                g4g0.m128878a("e_verification_code_input", ((VerifyCodeInputAct) this.f119872a).pageId(), ((VerifyCodeInputAct) this.f119872a).getClass().getName(), new Object[0]);
            }
        }
        bnl0.m105591y(this.f17208n, str.length() == 4);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m29560O(View view) {
        i4g0.m138520r("e_prelogin_verification_code_page_feedback", "p_sign_in_verification_code_view");
        act().startActivity(WebViewAct.m81348b2(act(), "帮助与反馈", ebe0.m120159a("https://feedback.tantanapp.com/feedback-mobile/pre-login"), true));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m29561S(View view) {
        if (TEnum.equals(this.f17209o.m200121o1(), VerifyReason.ban_appeal)) {
            return;
        }
        i4g0.m138520r("e_verification_code_input", ((VerifyCodeInputAct) this.f119872a).pageId());
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m29562T() {
        this.f17213s = true;
        this.f17209o.m200118X1();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m29563U(VerifyData verifyData) {
        m144221f(PasswordResetNewAct.m29488X1(this.f119872a, verifyData));
        ((VerifyCodeInputAct) this.f119872a).m51642n2();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m29564V(VerifyReason verifyReason) {
        l51.m152891K(this.f17209o.m200122p1(verifyReason));
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m29565W(int i, String str, final VerifyReason verifyReason) {
        SignInData signInData = new SignInData();
        signInData.code = Integer.valueOf(m29557K());
        signInData.username = i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = tl8.m191617N();
        signInData.grantType = SignInGrantType.get(SignInGrantType.confirmation_code);
        this.f17209o.m139325J0(signInData, new x20() { // from class: l.a7l0
            @Override // p153l.x20
            public final void call() {
                this.f68826a.m29564V(verifyReason);
            }
        }, null);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m29566X(int i, String str) {
        PhoneNumber phoneNumberNew_ = PhoneNumber.new_();
        phoneNumberNew_.countryCode = i;
        phoneNumberNew_.number = str;
        AccountModule.m29131H().verifyAppealIdentity(act(), phoneNumberNew_);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m29567Y(Pair pair) {
        this.f17209o.m200116V1(pair);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m29568Z(String str) {
        if (m29558L()) {
            return;
        }
        if (!TEnum.equals(this.f17209o.m200121o1(), VerifyReason.ban_appeal)) {
            i4g0.m138523u("e_get_another_code_button", ((VerifyCodeInputAct) this.f119872a).pageId(), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, str));
        }
        this.f17209o.m200117W1(false);
        this.f17209o.f182668n.run();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m29569a0(String str) {
        if (m29558L()) {
            return;
        }
        if (!TEnum.equals(this.f17209o.m200121o1(), VerifyReason.ban_appeal)) {
            i4g0.m138523u("e_get_another_code_button", ((VerifyCodeInputAct) this.f119872a).pageId(), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, str));
        }
        this.f17209o.m200117W1(false);
        this.f17209o.f182668n.run();
    }

    /* JADX INFO: renamed from: b0 */
    public void m29571b0(VerifyReason verifyReason) {
        if (TEnum.equals(verifyReason, VerifyReason.ban_appeal)) {
            rfj0.m181214b("e_p_appeal_verify_phonenumber_page_back", ((VerifyCodeInputAct) this.f119872a).pageId(), new rfj0.C19825a[0]);
        }
        this.f17212r = false;
    }

    /* JADX INFO: renamed from: c0 */
    public void m29572c0(final VerifyData verifyData, final VerifyReason verifyReason, final int i, final String str, boolean z) {
        x20 x20Var;
        int i2 = f17196x;
        f17196x = i2 + 1;
        if (i2 >= 5) {
            this.f17199e.setText("");
            o1j0.m165634h(R$string.f17035z3);
            return;
        }
        verifyData.code = m29557K();
        if (TEnum.equals(verifyReason, VerifyReason.signup)) {
            x20Var = new x20() { // from class: l.i7l0
                @Override // p153l.x20
                public final void call() {
                    this.f113266a.m29562T();
                }
            };
        } else if (TEnum.equals(verifyReason, VerifyReason.forgot_password)) {
            x20Var = new x20() { // from class: l.j7l0
                @Override // p153l.x20
                public final void call() {
                    this.f118695a.m29563U(verifyData);
                }
            };
        } else if (TEnum.equals(verifyReason, VerifyReason.signin)) {
            x20Var = new x20() { // from class: l.k7l0
                @Override // p153l.x20
                public final void call() {
                    this.f124274a.m29565W(i, str, verifyReason);
                }
            };
        } else {
            x20Var = TEnum.equals(verifyReason, VerifyReason.ban_appeal) ? new x20() { // from class: l.x6l0
                @Override // p153l.x20
                public final void call() {
                    this.f192599a.m29566X(i, str);
                }
            } : null;
        }
        if (TEnum.equals(verifyReason, VerifyReason.fix_verify_code_hack) || TEnum.equals(verifyReason, VerifyReason.signup_signin)) {
            this.f17209o.m200120Z1();
        } else {
            this.f17209o.m200119Y1(x20Var);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m29573d0(Throwable th, VerifyReason verifyReason, final String str) {
        ((VerifyCodeInputAct) this.f119872a).progressDismiss();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m29576g0(str);
            C20102sm.m186706n0(act(), new y20() { // from class: l.y6l0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f197695a.m29567Y((Pair) obj);
                }
            });
        } else {
            if (z && ((TantanException.Client.AccountService) th).code == 403003) {
                olj.INSTANCE.m168130c(act());
                return;
            }
            bnl0.m105525M0(this.f17201g, !l51.m152882B(this.f17209o.m200122p1(verifyReason)));
            this.f17201g.setText(R$string.f16780D3);
            gsj0.m132059c(this.f17201g, ((VerifyCodeInputAct) this.f119872a).string(R$string.f16785E3), new x20() { // from class: l.z6l0
                @Override // p153l.x20
                public final void call() {
                    this.f203165a.m29568Z(str);
                }
            });
            C20299tf.m190906b(th);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m29574e0(VerifyReason verifyReason) {
        ((VerifyCodeInputAct) this.f119872a).progressDismiss();
        f17196x = 0;
        this.f17209o.m200123q1();
        bnl0.m105525M0(this.f17204j, true);
        bnl0.m105525M0(this.f17201g, false);
    }

    /* JADX INFO: renamed from: f0 */
    public void m29575f0(String str, VerifyReason verifyReason) {
        if (!TextUtils.equals(str, f17195w)) {
            l51.m152891K(this.f17209o.m200122p1(verifyReason));
        }
        f17195w = str;
    }

    /* JADX INFO: renamed from: g0 */
    public void m29576g0(final String str) {
        this.f17204j.setText(((VerifyCodeInputAct) this.f119872a).getString(R$string.f16879X2, 60));
        bnl0.m105525M0(this.f17201g, true);
        bnl0.m105525M0(this.f17204j, false);
        this.f17201g.setText(R$string.f16780D3);
        gsj0.m132059c(this.f17201g, ((VerifyCodeInputAct) this.f119872a).string(R$string.f16785E3), new x20() { // from class: l.b7l0
            @Override // p153l.x20
            public final void call() {
                this.f75309a.m29569a0(str);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m29577h0(boolean z) {
        this.f17216v = z;
    }

    /* JADX INFO: renamed from: i0 */
    public void m29578i0(long j) {
        this.f17204j.setText(((VerifyCodeInputAct) this.f119872a).getString(R$string.f16879X2, Long.valueOf(59 - j)));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m29550C(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public void m29579j0(VerifyReason verifyReason, boolean z) {
        boolean zEquals = TEnum.equals(verifyReason, VerifyReason.signin);
        HoldAct holdact = this.f119872a;
        if (zEquals) {
            ((VerifyCodeInputAct) holdact).setTitle(R$string.f16810J3);
        } else {
            ((VerifyCodeInputAct) holdact).setTitle(R$string.f16810J3);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m29580k0(VerifyReason verifyReason, VerifyData verifyData, int i, String str, Throwable th) {
        ((VerifyCodeInputAct) this.f119872a).progressDismiss();
        this.f17199e.setText("");
        C20299tf.m190906b(th);
    }

    /* JADX INFO: renamed from: l0 */
    public void m29581l0() {
        ((VerifyCodeInputAct) this.f119872a).hideInput();
        ((VerifyCodeInputAct) this.f119872a).progressDismiss();
    }
}
