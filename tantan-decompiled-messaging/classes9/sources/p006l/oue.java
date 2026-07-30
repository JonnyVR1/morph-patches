package p006l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.a;
import com.google.android.gms.common.api.ApiException;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.api.C0002b;
import com.p000p1.mobile.putong.account.data.CaptchaData;
import com.p000p1.mobile.putong.account.data.ThirdPartyData;
import com.p000p1.mobile.putong.account.p002ui.accountnew.SignUpDetailsNewAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.EmailVerifyCodeAct;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.Captcha;
import com.p1.mobile.putong.data.Device;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.SignInGrantType;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.SignupStage;
import com.p1.mobile.putong.data.StepSignupStage;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.regex.Pattern;
import l.d30;
import l.dd80;
import l.e30;
import l.e51;
import l.h30;
import l.i0g0;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.p4k;
import l.px0;
import l.roj0;
import l.s7m;
import l.tan;
import l.vjf0;
import l.vwb;
import l.w85;
import l.w9j;
import l.yij0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class oue extends b3f0<ive> {

    /* JADX INFO: renamed from: m */
    public static final Pattern f18380m = Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$");

    /* JADX INFO: renamed from: e */
    public String f18381e;

    /* JADX INFO: renamed from: f */
    public CaptchaData f18382f;

    /* JADX INFO: renamed from: g */
    public VerifyReason f18383g;

    /* JADX INFO: renamed from: h */
    public String f18384h;

    /* JADX INFO: renamed from: i */
    public boolean f18385i;

    /* JADX INFO: renamed from: j */
    public boolean f18386j;

    /* JADX INFO: renamed from: k */
    public h30<Throwable, ThirdPartyData, Runnable, SignInGrantType> f18387k;

    /* JADX INFO: renamed from: l */
    public View.OnClickListener f18388l;

    public oue(mcr mcrVar) {
        super(mcrVar);
        this.f18385i = false;
        this.f18386j = false;
        this.f18387k = new h30() { // from class: l.nue
            /* JADX INFO: renamed from: b */
            public final void m20204b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f17872a.m20804e2((Throwable) obj, (ThirdPartyData) obj2, (Runnable) obj3, (SignInGrantType) obj4);
            }
        };
        this.f18388l = new View.OnClickListener() { // from class: l.fte
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12899a.m20805f2(view);
            }
        };
    }

    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ void m20746C1(SignInGrantType signInGrantType, ThirdPartyData thirdPartyData, final d30 d30Var, final Runnable runnable) {
        SignInData signInData = new SignInData();
        signInData.grantType = signInGrantType;
        signInData.thirdPartyId = thirdPartyData.thirdPartyId;
        signInData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        AccountModule.f26c.m244o2(signInData, true, null).subscribe(mkd0.H(new e30() { // from class: l.xte
            public final void call(Object obj) {
                oue.m20773p1(d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.yte
            public final void call(Object obj) {
                oue.m20747D1(runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ void m20747D1(Runnable runnable, Throwable th) {
        runnable.run();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m20751S0(d30 d30Var, roj0 roj0Var) {
        tan.b();
        d30Var.call();
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m20754W0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ void m20758a2(Bundle bundle) {
        e51.G(new Runnable() { // from class: l.gte
            @Override // java.lang.Runnable
            public final void run() {
                this.f13491a.m20800Z1();
            }
        });
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ void m20765h1() {
    }

    /* JADX INFO: renamed from: p1 */
    public static /* synthetic */ void m20773p1(d30 d30Var, roj0 roj0Var) {
        tan.b();
        d30Var.call();
    }

    /* JADX INFO: renamed from: z1 */
    public static /* synthetic */ void m20781z1(Throwable th) {
    }

    /* JADX INFO: renamed from: A2 */
    public void m20782A2() {
        SignInData signInData = new SignInData();
        signInData.username = ((ive) ((jq2) this).viewModel).m17093M();
        signInData.password = ((ive) ((jq2) this).viewModel).m17094N();
        signInData.grantType = SignInGrantType.get("email");
        Device device = new Device();
        signInData.device = device;
        device.identifiers = pk8.m21563N();
        ((ive) ((jq2) this).viewModel).m17084B0();
        act().progress(R$string.f216j0);
        m12506L0(signInData, new d30() { // from class: l.due
            public final void call() {
                this.f10597a.m20816q2();
            }
        }, new e30() { // from class: l.eue
            public final void call(Object obj) {
                this.f11453a.m20817r2((String) obj);
            }
        }, true);
    }

    /* JADX INFO: renamed from: F1 */
    public final void m20783F1(String str) {
        zvf0.D("e_intl_email_verification_risk_graph_result", ((ive) ((jq2) this).viewModel).m17126u0(), new j760[]{vwb.Y("cerfificated_result", str), vwb.Y("login_channel", "email")});
    }

    /* JADX INFO: renamed from: H1 */
    public void m20784H1() {
        if (((ive) ((jq2) this).viewModel).m17102V() && NullChecker.a(this.f18382f)) {
            duringCreated(AccountModule.f26c.m180H0(this.f18382f.token, ((ive) ((jq2) this).viewModel).m17092L())).subscribe(mkd0.H(new e30() { // from class: l.fue
                public final void call(Object obj) {
                    this.f12923a.m20793S1((roj0) obj);
                }
            }, new e30() { // from class: l.gue
                public final void call(Object obj) {
                    this.f13512a.m20794T1((Throwable) obj);
                }
            }));
        } else {
            m20820u2(null);
        }
    }

    /* JADX INFO: renamed from: I1 */
    public boolean m20785I1(String str) {
        if (str == null) {
            return false;
        }
        return f18380m.matcher(str).matches();
    }

    /* JADX INFO: renamed from: J1 */
    public final void m20786J1(Intent intent) {
        try {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) a.b(intent).m(ApiException.class);
            ((ive) ((jq2) this).viewModel).m17096P(false);
            m20787L1(googleSignInAccount.g0(), googleSignInAccount.h0(), googleSignInAccount.H());
        } catch (ApiException e) {
            if (e.getStatusCode() != 12501) {
                lsi0.h(R$string.f300y3);
            }
            ((ive) ((jq2) this).viewModel).m17096P(false);
        }
    }

    /* JADX INFO: renamed from: L1 */
    public void m20787L1(String str, String str2, String str3) {
        final Runnable runnable = new Runnable() { // from class: l.iue
            @Override // java.lang.Runnable
            public final void run() {
                this.f14790a.m20795U1();
            }
        };
        if (m20790P1() || m20791Q1()) {
            duringCreated(AccountModule.f26c.m255u2("google", str, str2, str3)).subscribe(mkd0.H(new e30() { // from class: l.jue
                public final void call(Object obj) {
                    this.f15431a.m20796V1((roj0) obj);
                }
            }, new e30() { // from class: l.kue
                public final void call(Object obj) {
                    this.f16001a.m20797W1((Throwable) obj);
                }
            }));
            return;
        }
        final ThirdPartyData thirdPartyDataNew_ = ThirdPartyData.new_();
        thirdPartyDataNew_.thirdPartyId = str;
        thirdPartyDataNew_.thirdPartyToken = str2;
        thirdPartyDataNew_.email = str3;
        duringCreated(AccountModule.f26c.m171D2(thirdPartyDataNew_)).subscribe(mkd0.K(new e30() { // from class: l.lue
            public final void call(Object obj) {
                this.f16652a.m20798X1(thirdPartyDataNew_, (roj0) obj);
            }
        }, new e30() { // from class: l.mue
            public final void call(Object obj) {
                this.f17289a.m20799Y1(thirdPartyDataNew_, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: N1 */
    public void m20788N1(VerifyReason verifyReason, String str, boolean z, boolean z2) {
        this.f18383g = verifyReason;
        this.f18384h = str;
        this.f18385i = z;
        this.f18386j = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O1 */
    public final boolean m20789O1(Throwable th) {
        return NullChecker.a(th) && (th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40037;
    }

    /* JADX INFO: renamed from: P1 */
    public boolean m20790P1() {
        return VerifyReason.get("bind-email").equals(this.f18383g);
    }

    /* JADX INFO: renamed from: Q1 */
    public boolean m20791Q1() {
        return VerifyReason.get("change-email").equals(this.f18383g);
    }

    /* JADX INFO: renamed from: R1 */
    public boolean m20792R1() {
        return VerifyReason.get("bind-email").equals(this.f18383g) && TextUtils.equals(this.f18384h, "google_login_verify_email");
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m20793S1(roj0 roj0Var) {
        m20783F1("success");
        m20820u2(null);
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m20794T1(Throwable th) {
        m20783F1("fail");
        yij0.D(th);
        m20821v2();
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m20795U1() {
        ((ive) ((jq2) this).viewModel).m17096P(false);
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m20796V1(roj0 roj0Var) {
        this.f18385i = false;
        osi0.f(R$string.f244n4);
        ((ive) ((jq2) this).viewModel).m17086E0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m20797W1(Throwable th) {
        if (th instanceof TantanException.Client.AccountService) {
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 400152 || i == 400153) {
                final Act act = act();
                act.runOnUiThread(new Runnable() { // from class: l.hte
                    @Override // java.lang.Runnable
                    public final void run() {
                        Act act2 = act;
                        new dd80.a(act2).y0(act2.getString(R$string.f147X0)).t0(String.format(act2.getString(R$string.f142W0), "Google")).c0(act2.getString(R$string.f127T0), new Runnable() { // from class: l.tte
                            @Override // java.lang.Runnable
                            public final void run() {
                                oue.m20765h1();
                            }
                        }).P(false).r0();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m20798X1(ThirdPartyData thirdPartyData, roj0 roj0Var) {
        SignUpData signUpData = new SignUpData();
        signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(App.e);
        signUpData.signUpType = AccountTempApi.SignUpType.google;
        m20819t2(signUpData, thirdPartyData);
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m20799Y1(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
        if (m20789O1(th)) {
            this.f18387k.b(th, thirdPartyData, runnable, SignInGrantType.get("google"));
        } else {
            e51.G(runnable);
            yij0.D(th);
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m20800Z1() {
        ((ive) ((jq2) this).viewModel).m17123r();
    }

    @Override // p006l.b3f0
    /* JADX INFO: renamed from: a0 */
    public void mo12401a0() {
        super.mo12401a0();
        creates(new e30() { // from class: l.ete
            public final void call(Object obj) {
                this.f11444a.m20758a2((Bundle) obj);
            }
        });
        act().duringCreated(vjf0.e().b).filter(new w9j() { // from class: l.pte
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Captcha) obj).localExpired);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.aue
            public final void call(Object obj) {
                this.f8531a.m20801b2((Captcha) obj);
            }
        }, new e30() { // from class: l.hue
            public final void call(Object obj) {
                oue.m20754W0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m20801b2(Captcha captcha) {
        if (NullChecker.a(captcha)) {
            m20820u2(captcha);
        }
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m20802c2() {
        AuthData authData = (AuthData) AccountModule.f26c.m207V0().b();
        act().startActivity(C0811hp.m16306f(((ive) ((jq2) this).viewModel).act(), NullChecker.a(authData) ? authData.signupStage.toString() : ""));
        act().finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m20803d2(final SignInGrantType signInGrantType, final ThirdPartyData thirdPartyData, final d30 d30Var, final Runnable runnable, Throwable th, Throwable th2) {
        if (!(th2 instanceof TantanException.Client.AccountService)) {
            runnable.run();
            yij0.D(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th2).code;
        if (i == 40020 || i == 40091) {
            boolean z = i == 40020;
            act().dialog().E0(z ? R$string.f139V2 : R$string.f129T2).D(z ? R$string.f144W2 : R$string.f134U2).t0(R$string.f301z, new Runnable() { // from class: l.ute
                @Override // java.lang.Runnable
                public final void run() {
                    oue.m20746C1(signInGrantType, thirdPartyData, d30Var, runnable);
                }
            }).l0(R$string.f167b, runnable).z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.vte
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    runnable.run();
                }
            });
        }
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m20804e2(final Throwable th, final ThirdPartyData thirdPartyData, final Runnable runnable, final SignInGrantType signInGrantType) {
        SignInData signInData = new SignInData();
        signInData.grantType = signInGrantType;
        signInData.thirdPartyId = thirdPartyData.thirdPartyId;
        signInData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        final d30 d30Var = new d30() { // from class: l.kte
            public final void call() {
                this.f15993a.m20802c2();
            }
        };
        AccountModule.f26c.m244o2(signInData, false, null).subscribe(mkd0.H(new e30() { // from class: l.lte
            public final void call(Object obj) {
                oue.m20751S0(d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.mte
            public final void call(Object obj) {
                this.f17238a.m20803d2(signInGrantType, thirdPartyData, d30Var, runnable, th, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m20805f2(View view) {
        ((ive) ((jq2) this).viewModel).m17096P(true);
        p4k p4kVarA = a.a(Y(), new GoogleSignInOptions.a(GoogleSignInOptions.DEFAULT_SIGN_IN).b().d("218526224262-usliqg20cepnb3ql98amgeum18v8uatv.apps.googleusercontent.com").a());
        p4kVarA.d();
        act().startActivityForResult(p4kVarA.b(), 9001);
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m20806g2() {
        ((ive) ((jq2) this).viewModel).m17096P(false);
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m20807h2(SignUpData signUpData, roj0 roj0Var) {
        act().startActivity(SignUpDetailsNewAct.m393a2(act(), signUpData));
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m20808i2(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
        if (m20789O1(th)) {
            this.f18387k.b(th, thirdPartyData, runnable, SignInGrantType.get("google"));
        } else {
            e51.G(runnable);
            yij0.D(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m20809j2(Throwable th) {
        ((ive) ((jq2) this).viewModel).m17097Q();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 400150) {
            osi0.f(R$string.f186e0);
        } else if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m20821v2();
        } else if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            vij.INSTANCE.m25824d("email", act());
        } else if (z && ((TantanException.Client.AccountService) th).code == 400149) {
            osi0.f(R$string.f169b1);
        } else if (z && ((TantanException.Client.AccountService) th).code == 400126) {
            osi0.f(R$string.f147X0);
        } else if (!((ive) ((jq2) this).viewModel).m17131z0(th, "send_code")) {
            C1478yf.m28232b(th);
            HashMap map = new HashMap();
            map.put("Sign up status", "Email register fail");
            w85.INSTANCE.m("Sign Up", map);
        }
        ((ive) ((jq2) this).viewModel).m17085D0();
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m20810k2(roj0 roj0Var) {
        ((ive) ((jq2) this).viewModel).m17085D0();
        ((ive) ((jq2) this).viewModel).m17124s0();
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m20811l2(CaptchaData captchaData) {
        this.f18382f = captchaData;
        ((ive) ((jq2) this).viewModel).m17130y0(captchaData);
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m20812m2(View view) {
        eje.m14574h().m14579f(SignupStage.get("verified"), StepSignupStage.get("google-email-saved"));
        zmi0.f28828d.put(Boolean.TRUE);
        Intent intentM16305e = C0811hp.m16305e(act());
        intentM16305e.addFlags(67108864);
        act().startActivity(intentM16305e);
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ boolean m20813n2(int i, int i2, Intent intent) {
        if (i2 != -1 || !intent.hasExtra("back_reason")) {
            return false;
        }
        String stringExtra = intent.getStringExtra("back_reason");
        this.f18381e = stringExtra;
        if ("show_captcha".equals(stringExtra)) {
            m20821v2();
            return true;
        }
        if ("change_number".equals(this.f18381e) || !"password_login".equals(this.f18381e)) {
            return true;
        }
        ((ive) ((jq2) this).viewModel).m17083A0();
        return true;
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m20814o2() {
        ((ive) ((jq2) this).viewModel).m17128w0();
        act().startActivityForResult(EmailVerifyCodeAct.m567Y1(act(), ((ive) ((jq2) this).viewModel).m17093M(), 1, this.f18383g, this.f18384h), new com.p1.mobile.android.app.a.a() { // from class: l.bue
            /* JADX INFO: renamed from: a */
            public final boolean m12901a(int i, int i2, Intent intent) {
                return this.f9093a.m20813n2(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m20815p2(View view) {
        if (NullChecker.a(act())) {
            act().hideInput();
        }
        zvf0.r("e_signin_google_button", ((ive) ((jq2) this).viewModel).m17126u0());
        this.f18388l.onClick(view);
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m20816q2() {
        ((ive) ((jq2) this).viewModel).m17085D0();
        act().progressDismiss();
        e51.K(((ive) ((jq2) this).viewModel).m17095O());
        C0775gp.m15903j();
        HashMap map = new HashMap();
        map.put("Method used", "email");
        map.put("Status", "Success");
        map.put("Version", px0.b(App.e));
        w85.INSTANCE.m("Login", map);
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m20817r2(String str) {
        act().progressDismiss();
        if (!"newDevice".equals(str)) {
            zvf0.x("e_password_verifypage_wrong_tips", ((ive) ((jq2) this).viewModel).m17126u0());
        }
        if (TextUtils.equals("suspicious", str)) {
            m20821v2();
        }
        ((ive) ((jq2) this).viewModel).m17087G0();
        if (TextUtils.equals(str, "inActivated")) {
            return;
        }
        HashMap map = new HashMap();
        map.put("Sign up status", "Email register fail");
        w85.INSTANCE.m("Sign Up", map);
    }

    /* JADX INFO: renamed from: s2 */
    public void m20818s2(int i, int i2, Intent intent) {
        if (i == 9001) {
            m20786J1(intent);
        }
    }

    /* JADX INFO: renamed from: t2 */
    public final void m20819t2(final SignUpData signUpData, final ThirdPartyData thirdPartyData) {
        final Runnable runnable = new Runnable() { // from class: l.nte
            @Override // java.lang.Runnable
            public final void run() {
                this.f17847a.m20806g2();
            }
        };
        signUpData.thirdPartyId = thirdPartyData.thirdPartyId;
        signUpData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        signUpData.signUpType = AccountTempApi.SignUpType.google;
        duringCreated(eje.m14577r(signUpData, null, true)).subscribe(mkd0.H(new e30() { // from class: l.ote
            public final void call(Object obj) {
                this.f18366a.m20807h2(signUpData, (roj0) obj);
            }
        }, new e30() { // from class: l.qte
            public final void call(Object obj) {
                this.f20056a.m20808i2(thirdPartyData, runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u2 */
    public void m20820u2(Captcha captcha) {
        VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.language = i0g0.y();
        verifyDataNew_.action = this.f18383g;
        verifyDataNew_.email = ((ive) ((jq2) this).viewModel).m17093M();
        verifyDataNew_.codeLength = 4;
        if (((ive) ((jq2) this).viewModel).m17102V() && NullChecker.a(this.f18382f)) {
            s7m s7mVar = ((jq2) this).viewModel;
            if (((ive) s7mVar).f14807C) {
                verifyDataNew_.captchaToken = this.f18382f.token;
                verifyDataNew_.captchaValue = ((ive) s7mVar).m17092L();
            }
        }
        if (NullChecker.a(captcha)) {
            verifyDataNew_.captcha = captcha;
        }
        ((ive) ((jq2) this).viewModel).m17084B0();
        AccountModule.f27d.m25929I(verifyDataNew_).compose(C0002b.m271f()).subscribe(mkd0.K(new e30() { // from class: l.ite
            public final void call(Object obj) {
                this.f14780a.m20810k2((roj0) obj);
            }
        }, new e30() { // from class: l.jte
            public final void call(Object obj) {
                this.f15389a.m20809j2((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: v2 */
    public void m20821v2() {
        duringCreated(AccountModule.f26c.m209W0()).subscribe(mkd0.H(new e30() { // from class: l.rte
            public final void call(Object obj) {
                this.f20735a.m20811l2((CaptchaData) obj);
            }
        }, new e30() { // from class: l.ste
            public final void call(Object obj) {
                oue.m20781z1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w2 */
    public void m20822w2(Throwable th) {
        ((ive) ((jq2) this).viewModel).m17131z0(th, "send_code");
    }

    /* JADX INFO: renamed from: x2 */
    public View.OnClickListener m20823x2() {
        return new View.OnClickListener() { // from class: l.cue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9858a.m20812m2(view);
            }
        };
    }

    /* JADX INFO: renamed from: y2 */
    public void m20824y2() {
        e51.G(new Runnable() { // from class: l.wte
            @Override // java.lang.Runnable
            public final void run() {
                this.f25400a.m20814o2();
            }
        });
    }

    /* JADX INFO: renamed from: z2 */
    public View.OnClickListener m20825z2() {
        return new View.OnClickListener() { // from class: l.zte
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28974a.m20815p2(view);
            }
        };
    }
}
