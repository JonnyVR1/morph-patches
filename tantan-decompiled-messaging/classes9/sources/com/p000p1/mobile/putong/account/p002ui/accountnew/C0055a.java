package com.p000p1.mobile.putong.account.p002ui.accountnew;

import android.content.Context;
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
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.Device;
import com.p1.mobile.putong.data.PhoneNumber;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.SignInGrantType;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.a3e0;
import l.d30;
import l.e30;
import l.e51;
import l.i0g0;
import l.j760;
import l.lsi0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.xvf0;
import l.yk5;
import l.ys60;
import l.zvf0;
import p006l.C0775gp;
import p006l.C1444xm;
import p006l.C1478yf;
import p006l.c3f0;
import p006l.djj0;
import p006l.fyk0;
import p006l.n6j0;
import p006l.pk8;
import p006l.pxk0;
import p006l.q4c0;
import p006l.vij;
import v.VButton_FakeShadow;
import v.VCheckBox;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0055a extends c3f0<pxk0, VerifyCodeInputAct> {

    /* JADX INFO: renamed from: w */
    public static String f465w;

    /* JADX INFO: renamed from: x */
    public static int f466x;

    /* JADX INFO: renamed from: c */
    public VText f467c;

    /* JADX INFO: renamed from: d */
    public VText f468d;

    /* JADX INFO: renamed from: e */
    public VerifyCodeView f469e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f470f;

    /* JADX INFO: renamed from: g */
    public VText f471g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f472h;

    /* JADX INFO: renamed from: i */
    public VText f473i;

    /* JADX INFO: renamed from: j */
    public VText f474j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f475k;

    /* JADX INFO: renamed from: l */
    public VCheckBox f476l;

    /* JADX INFO: renamed from: m */
    public VText f477m;

    /* JADX INFO: renamed from: n */
    public VButton_FakeShadow f478n;

    /* JADX INFO: renamed from: o */
    public pxk0 f479o;

    /* JADX INFO: renamed from: p */
    public boolean f480p;

    /* JADX INFO: renamed from: q */
    public int f481q;

    /* JADX INFO: renamed from: r */
    public boolean f482r;

    /* JADX INFO: renamed from: s */
    public boolean f483s;

    /* JADX INFO: renamed from: t */
    public long f484t;

    /* JADX INFO: renamed from: u */
    public yk5 f485u;

    /* JADX INFO: renamed from: v */
    public boolean f486v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.accountnew.a$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0055a.this.f476l.setChecked(true);
            C0055a.this.f479o.f19428o.call();
            C0055a.this.f485u.dismiss();
        }
    }

    public C0055a(@NonNull VerifyCodeInputAct verifyCodeInputAct) {
        super(verifyCodeInputAct);
        this.f481q = 0;
        this.f482r = false;
        this.f484t = 0L;
        this.f486v = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m429N(View view) {
        this.f479o.f19428o.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m430P() {
        if (NullChecker.a(this.f9323a) && NullChecker.a(this.f469e)) {
            ((VerifyCodeInputAct) this.f9323a).showInput(this.f469e, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m431Q() {
        this.f469e.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m432R() {
        if (m455L()) {
            return;
        }
        m451H();
        zvf0.r("e_appeal_phone_number_verification_policy", ((VerifyCodeInputAct) this.f9323a).pageId());
        this.f485u.show();
    }

    /* JADX INFO: renamed from: C */
    public View m447C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fyk0.m15533b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: E */
    public void m448E(Menu menu) {
        menu.add(0, q4c0.f19616l0, 0, R$string.f236m2).setShowAsAction(2);
    }

    @Override // p006l.c3f0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo476i1(pxk0 pxk0Var) {
        this.f479o = pxk0Var;
    }

    /* JADX INFO: renamed from: G */
    public void m450G() {
        this.f469e.setText("");
        this.f481q++;
    }

    /* JADX INFO: renamed from: H */
    public void m451H() {
        if (NullChecker.c(this.f469e, "account", CrashHelper.ReportLevel.p9)) {
            this.f469e.m424c();
        }
    }

    /* JADX INFO: renamed from: I */
    public void m452I() {
        ((VerifyCodeInputAct) this.f9323a).onHomePressed();
        this.f482r = true;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [HoldAct extends com.p1.mobile.putong.app.PutongAct, android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v11, types: [HoldAct extends com.p1.mobile.putong.app.PutongAct, android.content.Context] */
    /* JADX INFO: renamed from: J */
    public void m453J(VerifyReason verifyReason, int i, String str, VerifyData verifyData, boolean z, String str2) {
        this.f480p = true;
        e51.G(new Runnable() { // from class: l.qxk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f20144a.m431Q();
            }
        });
        if (TEnum.equals(verifyReason, "ban-appeal")) {
            ((VerifyCodeInputAct) this.f9323a).setTitle(R$string.f178c4);
            this.f478n.setText(R$string.f179d);
        }
        String string = ((VerifyCodeInputAct) this.f9323a).getResources().getString(R$string.f172b4);
        String str3 = ((VerifyCodeInputAct) this.f9323a).getResources().getString(R$string.f166a4) + string;
        if (NullChecker.a(AccountModule.m27H()) && AccountModule.m27H().tg() == 1) {
            string = ((VerifyCodeInputAct) this.f9323a).getResources().getString(R$string.f160Z3);
            str3 = ((VerifyCodeInputAct) this.f9323a).getResources().getString(R$string.f155Y3) + string;
        }
        this.f477m.setText(str3);
        yk5 yk5Var = new yk5((Context) this.f9323a, NullChecker.a(AccountModule.m27H()) ? AccountModule.m27H().tg() : 1);
        this.f485u = yk5Var;
        yk5Var.D(new a());
        djj0.m14045c(this.f477m, string, new d30() { // from class: l.wxk0
            public final void call() {
                this.f25489a.m432R();
            }
        });
        this.f468d.setText(ys60.a(i, str));
        this.f467c.setText(R$string.f150X3);
        if (e51.B(this.f479o.m21820p1(verifyReason))) {
            this.f479o.m21821q1();
        } else {
            ((VerifyCodeInputAct) this.f9323a).progress(R$string.f216j0);
            verifyData.language = i0g0.y();
            this.f479o.m21815W1(true);
            this.f479o.f19427n.run();
        }
        this.f469e.setOnCompleteAction(this.f479o.f19428o);
        this.f469e.setOnClickListener(new View.OnClickListener() { // from class: l.xxk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27778a.m458S(view);
            }
        });
        this.f469e.setListener(new VerifyCodeView.InterfaceC0053a() { // from class: l.yxk0
            @Override // com.p000p1.mobile.putong.account.p002ui.accountnew.VerifyCodeView.InterfaceC0053a
            /* JADX INFO: renamed from: a */
            public final void mo426a(String str4) {
                this.f28490a.m456M(str4);
            }
        });
        xdl0.y(this.f478n, this.f469e.getText().length() == 4);
        this.f478n.setOnClickListener(new View.OnClickListener() { // from class: l.zxk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f29024a.m429N(view);
            }
        });
        if (C0775gp.m15904k()) {
            xdl0.X(this.f467c, t100.d(32.0f));
            xdl0.X(this.f468d, t100.d(16.0f));
            xdl0.X(this.f469e, t100.d(24.0f));
            xdl0.X(this.f470f, t100.d(24.0f));
            xdl0.M0(this.f472h, true);
            xdl0.E0(this.f473i, new View.OnClickListener() { // from class: l.ayk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8604a.m457O(view);
                }
            });
        }
        this.f475k.setVisibility(8);
        e51.H((Context) this.f9323a, new Runnable() { // from class: l.byk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9229a.m430P();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: K */
    public int m454K() {
        try {
            return Integer.parseInt(vwb.q(this.f469e.getText()));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: L */
    public final boolean m455L() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f484t;
        long j2 = jElapsedRealtime - j;
        if (j > 0 && j2 < 500) {
            return true;
        }
        this.f484t = jElapsedRealtime;
        return false;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m456M(String str) {
        if (this.f480p && str.length() > 0) {
            this.f480p = false;
            if (!TEnum.equals(this.f479o.m21819o1(), "ban-appeal")) {
                xvf0.a("e_verification_code_input", ((VerifyCodeInputAct) this.f9323a).pageId(), ((VerifyCodeInputAct) this.f9323a).getClass().getName(), new Object[0]);
            }
        }
        xdl0.y(this.f478n, str.length() == 4);
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m457O(View view) {
        zvf0.r("e_prelogin_verification_code_page_feedback", "p_sign_in_verification_code_view");
        act().startActivity(WebViewAct.a2(act(), "帮助与反馈", a3e0.a("https://feedback.tantanapp.com/feedback-mobile/pre-login"), true));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m458S(View view) {
        if (TEnum.equals(this.f479o.m21819o1(), "ban-appeal")) {
            return;
        }
        zvf0.r("e_verification_code_input", ((VerifyCodeInputAct) this.f9323a).pageId());
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m459T() {
        this.f483s = true;
        this.f479o.m21816X1();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m460U(VerifyData verifyData) {
        m13097f(PasswordResetNewAct.m385V1(this.f9323a, verifyData));
        ((VerifyCodeInputAct) this.f9323a).finish();
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m461V(VerifyReason verifyReason) {
        e51.K(this.f479o.m21820p1(verifyReason));
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m462W(int i, String str, final VerifyReason verifyReason) {
        SignInData signInData = new SignInData();
        signInData.code = Integer.valueOf(m454K());
        signInData.username = i + " " + str;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = pk8.m21563N();
        signInData.grantType = SignInGrantType.get("confirmation_code");
        this.f479o.m12505J0(signInData, new d30() { // from class: l.uxk0
            public final void call() {
                this.f23796a.m461V(verifyReason);
            }
        }, null);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m463X(int i, String str) {
        PhoneNumber phoneNumberNew_ = PhoneNumber.new_();
        phoneNumberNew_.countryCode = i;
        phoneNumberNew_.number = str;
        AccountModule.m27H().verifyAppealIdentity(act(), phoneNumberNew_);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m464Y(Pair pair) {
        this.f479o.m21814V1(pair);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m465Z(String str) {
        if (m455L()) {
            return;
        }
        if (!TEnum.equals(this.f479o.m21819o1(), "ban-appeal")) {
            zvf0.u("e_get_another_code_button", ((VerifyCodeInputAct) this.f9323a).pageId(), new j760[]{vwb.Y("phone_num", str)});
        }
        this.f479o.m21815W1(false);
        this.f479o.f19427n.run();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m466a0(String str) {
        if (m455L()) {
            return;
        }
        if (!TEnum.equals(this.f479o.m21819o1(), "ban-appeal")) {
            zvf0.u("e_get_another_code_button", ((VerifyCodeInputAct) this.f9323a).pageId(), new j760[]{vwb.Y("phone_num", str)});
        }
        this.f479o.m21815W1(false);
        this.f479o.f19427n.run();
    }

    /* JADX INFO: renamed from: b0 */
    public void m468b0(VerifyReason verifyReason) {
        if (TEnum.equals(verifyReason, "ban-appeal")) {
            n6j0.m19689b("e_p_appeal_verify_phonenumber_page_back", ((VerifyCodeInputAct) this.f9323a).pageId(), new n6j0.C1041a[0]);
        }
        this.f482r = false;
    }

    /* JADX INFO: renamed from: c0 */
    public void m469c0(final VerifyData verifyData, final VerifyReason verifyReason, final int i, final String str, boolean z) {
        d30 d30Var;
        int i2 = f466x;
        f466x = i2 + 1;
        if (i2 >= 5) {
            this.f469e.setText("");
            lsi0.h(R$string.f305z3);
            return;
        }
        verifyData.code = m454K();
        if (TEnum.equals(verifyReason, "signup")) {
            d30Var = new d30() { // from class: l.cyk0
                public final void call() {
                    this.f9934a.m459T();
                }
            };
        } else if (TEnum.equals(verifyReason, "forgot-password")) {
            d30Var = new d30() { // from class: l.dyk0
                public final void call() {
                    this.f10657a.m460U(verifyData);
                }
            };
        } else if (TEnum.equals(verifyReason, "signin")) {
            d30Var = new d30() { // from class: l.eyk0
                public final void call() {
                    this.f11514a.m462W(i, str, verifyReason);
                }
            };
        } else {
            d30Var = TEnum.equals(verifyReason, "ban-appeal") ? new d30() { // from class: l.rxk0
                public final void call() {
                    this.f20899a.m463X(i, str);
                }
            } : null;
        }
        if (TEnum.equals(verifyReason, "fix_verify_code_hack") || TEnum.equals(verifyReason, "signup_signin")) {
            this.f479o.m21818Z1();
        } else {
            this.f479o.m21817Y1(d30Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    public void m470d0(Throwable th, VerifyReason verifyReason, final String str) {
        ((VerifyCodeInputAct) this.f9323a).progressDismiss();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m473g0(str);
            C1444xm.m27328n0(act(), new e30() { // from class: l.sxk0
                public final void call(Object obj) {
                    this.f21739a.m464Y((Pair) obj);
                }
            });
        } else {
            if (z && ((TantanException.Client.AccountService) th).code == 403003) {
                vij.INSTANCE.m25823c(act());
                return;
            }
            xdl0.M0(this.f471g, !e51.B(this.f479o.m21820p1(verifyReason)));
            this.f471g.setText(R$string.f50D3);
            djj0.m14045c(this.f471g, ((VerifyCodeInputAct) this.f9323a).string(R$string.f55E3), new d30() { // from class: l.txk0
                public final void call() {
                    this.f22324a.m465Z(str);
                }
            });
            C1478yf.m28232b(th);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m471e0(VerifyReason verifyReason) {
        ((VerifyCodeInputAct) this.f9323a).progressDismiss();
        f466x = 0;
        this.f479o.m21821q1();
        xdl0.M0(this.f474j, true);
        xdl0.M0(this.f471g, false);
    }

    /* JADX INFO: renamed from: f0 */
    public void m472f0(String str, VerifyReason verifyReason) {
        if (!TextUtils.equals(str, f465w)) {
            e51.K(this.f479o.m21820p1(verifyReason));
        }
        f465w = str;
    }

    /* JADX INFO: renamed from: g0 */
    public void m473g0(final String str) {
        this.f474j.setText(((VerifyCodeInputAct) this.f9323a).getString(R$string.f149X2, 60));
        xdl0.M0(this.f471g, true);
        xdl0.M0(this.f474j, false);
        this.f471g.setText(R$string.f50D3);
        djj0.m14045c(this.f471g, ((VerifyCodeInputAct) this.f9323a).string(R$string.f55E3), new d30() { // from class: l.vxk0
            public final void call() {
                this.f24524a.m466a0(str);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m474h0(boolean z) {
        this.f486v = z;
    }

    /* JADX INFO: renamed from: i0 */
    public void m475i0(long j) {
        this.f474j.setText(((VerifyCodeInputAct) this.f9323a).getString(R$string.f149X2, Long.valueOf(59 - j)));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m447C(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public void m477j0(VerifyReason verifyReason, boolean z) {
        boolean zEquals = TEnum.equals(verifyReason, "signin");
        HoldAct holdact = this.f9323a;
        if (zEquals) {
            ((VerifyCodeInputAct) holdact).setTitle(R$string.f80J3);
        } else {
            ((VerifyCodeInputAct) holdact).setTitle(R$string.f80J3);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m478k0(VerifyReason verifyReason, VerifyData verifyData, int i, String str, Throwable th) {
        ((VerifyCodeInputAct) this.f9323a).progressDismiss();
        this.f469e.setText("");
        C1478yf.m28232b(th);
    }

    /* JADX INFO: renamed from: l0 */
    public void m479l0() {
        ((VerifyCodeInputAct) this.f9323a).hideInput();
        ((VerifyCodeInputAct) this.f9323a).progressDismiss();
    }
}
