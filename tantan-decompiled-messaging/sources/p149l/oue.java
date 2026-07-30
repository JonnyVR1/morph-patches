package p149l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.AppsFlyerLib;
import com.clevertap.android.sdk.Constants;
import com.core.glcore.util.ErrorCode;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import com.google.android.gms.auth.api.signin.C2081a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.api.C4576b;
import com.p046p1.mobile.putong.account.data.CaptchaData;
import com.p046p1.mobile.putong.account.data.ThirdPartyData;
import com.p046p1.mobile.putong.account.p050ui.accountnew.SignUpDetailsNewAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.EmailVerifyCodeAct;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.data.Captcha;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.SignupStage;
import com.p046p1.mobile.putong.data.StepSignupStage;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class oue extends b3f0<ive> {

    /* JADX INFO: renamed from: m */
    public static final Pattern f145685m = Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$");

    /* JADX INFO: renamed from: e */
    public String f145686e;

    /* JADX INFO: renamed from: f */
    public CaptchaData f145687f;

    /* JADX INFO: renamed from: g */
    public VerifyReason f145688g;

    /* JADX INFO: renamed from: h */
    public String f145689h;

    /* JADX INFO: renamed from: i */
    public boolean f145690i;

    /* JADX INFO: renamed from: j */
    public boolean f145691j;

    /* JADX INFO: renamed from: k */
    public h30<Throwable, ThirdPartyData, Runnable, SignInGrantType> f145692k;

    /* JADX INFO: renamed from: l */
    public View.OnClickListener f145693l;

    public oue(mcr mcrVar) {
        super(mcrVar);
        this.f145690i = false;
        this.f145691j = false;
        this.f145692k = new h30() { // from class: l.nue
            @Override // p149l.h30
            /* JADX INFO: renamed from: b */
            public final void mo105798b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f140619a.m166045e2((Throwable) obj, (ThirdPartyData) obj2, (Runnable) obj3, (SignInGrantType) obj4);
            }
        };
        this.f145693l = new View.OnClickListener() { // from class: l.fte
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99188a.m166046f2(view);
            }
        };
    }

    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ void m165987C1(SignInGrantType signInGrantType, ThirdPartyData thirdPartyData, final d30 d30Var, final Runnable runnable) {
        SignInData signInData = new SignInData();
        signInData.grantType = signInGrantType;
        signInData.thirdPartyId = thirdPartyData.thirdPartyId;
        signInData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        AccountModule.f16037c.m28349o2(signInData, true, null).subscribe(mkd0.m154956H(new e30() { // from class: l.xte
            @Override // p149l.e30
            public final void call(Object obj) {
                oue.m166014p1(d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.yte
            @Override // p149l.e30
            public final void call(Object obj) {
                oue.m165988D1(runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ void m165988D1(Runnable runnable, Throwable th) {
        runnable.run();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m165992S0(d30 d30Var, roj0 roj0Var) {
        tan.m187741b();
        d30Var.call();
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m165995W0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ void m165999a2(Bundle bundle) {
        e51.m114742G(new Runnable() { // from class: l.gte
            @Override // java.lang.Runnable
            public final void run() {
                this.f104273a.m166041Z1();
            }
        });
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ void m166006h1() {
    }

    /* JADX INFO: renamed from: p1 */
    public static /* synthetic */ void m166014p1(d30 d30Var, roj0 roj0Var) {
        tan.m187741b();
        d30Var.call();
    }

    /* JADX INFO: renamed from: z1 */
    public static /* synthetic */ void m166022z1(Throwable th) {
    }

    /* JADX INFO: renamed from: A2 */
    public void m166023A2() {
        SignInData signInData = new SignInData();
        signInData.username = ((ive) this.viewModel).m138577M();
        signInData.password = ((ive) this.viewModel).m138578N();
        signInData.grantType = SignInGrantType.get("email");
        Device device = new Device();
        signInData.device = device;
        device.identifiers = pk8.m169981N();
        ((ive) this.viewModel).m138568B0();
        act().progress(R$string.f16227j0);
        m100083L0(signInData, new d30() { // from class: l.due
            @Override // p149l.d30
            public final void call() {
                this.f87973a.m166057q2();
            }
        }, new e30() { // from class: l.eue
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93234a.m166058r2((String) obj);
            }
        }, true);
    }

    /* JADX INFO: renamed from: F1 */
    public final void m166024F1(String str) {
        zvf0.m220371D("e_intl_email_verification_risk_graph_result", ((ive) this.viewModel).m138610u0(), vwb.m200311Y("cerfificated_result", str), vwb.m200311Y("login_channel", "email"));
    }

    /* JADX INFO: renamed from: H1 */
    public void m166025H1() {
        if (((ive) this.viewModel).m138586V() && NullChecker.m81303a(this.f145687f)) {
            duringCreated(AccountModule.f16037c.m28285H0(this.f145687f.token, ((ive) this.viewModel).m138576L())).subscribe(mkd0.m154956H(new e30() { // from class: l.fue
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f99337a.m166034S1((roj0) obj);
                }
            }, new e30() { // from class: l.gue
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f104389a.m166035T1((Throwable) obj);
                }
            }));
        } else {
            m166061u2(null);
        }
    }

    /* JADX INFO: renamed from: I1 */
    public boolean m166026I1(String str) {
        if (str == null) {
            return false;
        }
        return f145685m.matcher(str).matches();
    }

    /* JADX INFO: renamed from: J1 */
    public final void m166027J1(Intent intent) throws Throwable {
        try {
            GoogleSignInAccount googleSignInAccountMo15374m = C2081a.m12442b(intent).mo15374m(ApiException.class);
            ((ive) this.viewModel).m138580P(false);
            m166028L1(googleSignInAccountMo15374m.m12406g0(), googleSignInAccountMo15374m.m12407h0(), googleSignInAccountMo15374m.m12403H());
        } catch (ApiException e) {
            if (e.getStatusCode() != 12501) {
                lsi0.m151578h(R$string.f16311y3);
            }
            ((ive) this.viewModel).m138580P(false);
        }
    }

    /* JADX INFO: renamed from: L1 */
    public void m166028L1(String str, String str2, String str3) {
        final Runnable runnable = new Runnable() { // from class: l.iue
            @Override // java.lang.Runnable
            public final void run() {
                this.f115009a.m166036U1();
            }
        };
        if (m166031P1() || m166032Q1()) {
            duringCreated(AccountModule.f16037c.m28360u2("google", str, str2, str3)).subscribe(mkd0.m154956H(new e30() { // from class: l.jue
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f119776a.m166037V1((roj0) obj);
                }
            }, new e30() { // from class: l.kue
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f124680a.m166038W1((Throwable) obj);
                }
            }));
            return;
        }
        final ThirdPartyData thirdPartyDataNew_ = ThirdPartyData.new_();
        thirdPartyDataNew_.thirdPartyId = str;
        thirdPartyDataNew_.thirdPartyToken = str2;
        thirdPartyDataNew_.email = str3;
        duringCreated(AccountModule.f16037c.m28276D2(thirdPartyDataNew_)).subscribe(mkd0.m154959K(new e30() { // from class: l.lue
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130052a.m166039X1(thirdPartyDataNew_, (roj0) obj);
            }
        }, new e30() { // from class: l.mue
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135778a.m166040Y1(thirdPartyDataNew_, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: N1 */
    public void m166029N1(VerifyReason verifyReason, String str, boolean z, boolean z2) {
        this.f145688g = verifyReason;
        this.f145689h = str;
        this.f145690i = z;
        this.f145691j = z2;
    }

    /* JADX INFO: renamed from: O1 */
    public final boolean m166030O1(Throwable th) {
        return NullChecker.m81303a(th) && (th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40037;
    }

    /* JADX INFO: renamed from: P1 */
    public boolean m166031P1() {
        return VerifyReason.get(VerifyReason.bind_email).equals(this.f145688g);
    }

    /* JADX INFO: renamed from: Q1 */
    public boolean m166032Q1() {
        return VerifyReason.get(VerifyReason.change_email).equals(this.f145688g);
    }

    /* JADX INFO: renamed from: R1 */
    public boolean m166033R1() {
        return VerifyReason.get(VerifyReason.bind_email).equals(this.f145688g) && TextUtils.equals(this.f145689h, "google_login_verify_email");
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m166034S1(roj0 roj0Var) {
        m166024F1("success");
        m166061u2(null);
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m166035T1(Throwable th) {
        m166024F1("fail");
        yij0.m214926D(th);
        m166062v2();
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m166036U1() {
        ((ive) this.viewModel).m138580P(false);
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m166037V1(roj0 roj0Var) {
        this.f145690i = false;
        osi0.m165782f(R$string.f16255n4);
        ((ive) this.viewModel).m138570E0();
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m166038W1(Throwable th) {
        if (th instanceof TantanException.Client.AccountService) {
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 400152 || i == 400153) {
                final Act act = act();
                act.runOnUiThread(new Runnable() { // from class: l.hte
                    @Override // java.lang.Runnable
                    public final void run() {
                        Act act2 = act;
                        new dd80.C16336a(act2).m110996y0(act2.getString(R$string.f16158X0)).m110991t0(String.format(act2.getString(R$string.f16153W0), ThirdPushManager.VENDOR_TYPE_FCM)).m110974c0(act2.getString(R$string.f16138T0), new Runnable() { // from class: l.tte
                            @Override // java.lang.Runnable
                            public final void run() {
                                oue.m166006h1();
                            }
                        }).m110961P(false).m110989r0();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m166039X1(ThirdPartyData thirdPartyData, roj0 roj0Var) {
        SignUpData signUpData = new SignUpData();
        signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(App.f15369e);
        signUpData.signUpType = AccountTempApi.SignUpType.google;
        m166060t2(signUpData, thirdPartyData);
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m166040Y1(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
        if (m166030O1(th)) {
            this.f145692k.mo105798b(th, thirdPartyData, runnable, SignInGrantType.get("google"));
        } else {
            e51.m114742G(runnable);
            yij0.m214926D(th);
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m166041Z1() {
        ((ive) this.viewModel).m138607r();
    }

    @Override // p149l.b3f0, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.ete
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93106a.m165999a2((Bundle) obj);
            }
        });
        act().duringCreated(vjf0.m198623e().f181687b).filter(new w9j() { // from class: l.pte
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Captcha) obj).localExpired);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.aue
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71755a.m166042b2((Captcha) obj);
            }
        }, new e30() { // from class: l.hue
            @Override // p149l.e30
            public final void call(Object obj) {
                oue.m165995W0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m166042b2(Captcha captcha) {
        if (NullChecker.m81303a(captcha)) {
            m166061u2(captcha);
        }
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m166043c2() {
        AuthData authDataMo108248b = AccountModule.f16037c.m28312V0().mo108248b();
        act().startActivity(C17367hp.m132322f(((ive) this.viewModel).act(), NullChecker.m81303a(authDataMo108248b) ? authDataMo108248b.signupStage.toString() : ""));
        act().m66873d2();
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m166044d2(final SignInGrantType signInGrantType, final ThirdPartyData thirdPartyData, final d30 d30Var, final Runnable runnable, Throwable th, Throwable th2) {
        if (!(th2 instanceof TantanException.Client.AccountService)) {
            runnable.run();
            yij0.m214926D(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th2).code;
        if (i == 40020 || i == 40091) {
            boolean z = i == 40020;
            act().dialog().m20503E0(z ? R$string.f16150V2 : R$string.f16140T2).m20500D(z ? R$string.f16155W2 : R$string.f16145U2).m20556t0(R$string.f16312z, new Runnable() { // from class: l.ute
                @Override // java.lang.Runnable
                public final void run() {
                    oue.m165987C1(signInGrantType, thirdPartyData, d30Var, runnable);
                }
            }).m20542l0(R$string.f16178b, runnable).m20568z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.vte
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    runnable.run();
                }
            });
        }
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m166045e2(final Throwable th, final ThirdPartyData thirdPartyData, final Runnable runnable, final SignInGrantType signInGrantType) {
        SignInData signInData = new SignInData();
        signInData.grantType = signInGrantType;
        signInData.thirdPartyId = thirdPartyData.thirdPartyId;
        signInData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        final d30 d30Var = new d30() { // from class: l.kte
            @Override // p149l.d30
            public final void call() {
                this.f124578a.m166043c2();
            }
        };
        AccountModule.f16037c.m28349o2(signInData, false, null).subscribe(mkd0.m154956H(new e30() { // from class: l.lte
            @Override // p149l.e30
            public final void call(Object obj) {
                oue.m165992S0(d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.mte
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135580a.m166044d2(signInGrantType, thirdPartyData, d30Var, runnable, th, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m166046f2(View view) {
        ((ive) this.viewModel).m138580P(true);
        p4k p4kVarM12441a = C2081a.m12441a(m142773Y(), new GoogleSignInOptions.C2080a(GoogleSignInOptions.DEFAULT_SIGN_IN).m12434b().m12436d("218526224262-usliqg20cepnb3ql98amgeum18v8uatv.apps.googleusercontent.com").m12433a());
        p4kVarM12441a.m167392d();
        act().startActivityForResult(p4kVarM12441a.m167390b(), ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED);
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m166047g2() {
        ((ive) this.viewModel).m138580P(false);
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m166048h2(SignUpData signUpData, roj0 roj0Var) {
        act().startActivity(SignUpDetailsNewAct.m28497a2(act(), signUpData));
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m166049i2(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
        if (m166030O1(th)) {
            this.f145692k.mo105798b(th, thirdPartyData, runnable, SignInGrantType.get("google"));
        } else {
            e51.m114742G(runnable);
            yij0.m214926D(th);
        }
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m166050j2(Throwable th) {
        ((ive) this.viewModel).m138581Q();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 400150) {
            osi0.m165782f(R$string.f16197e0);
        } else if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m166062v2();
        } else if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            vij.INSTANCE.m198584d("email", act());
        } else if (z && ((TantanException.Client.AccountService) th).code == 400149) {
            osi0.m165782f(R$string.f16180b1);
        } else if (z && ((TantanException.Client.AccountService) th).code == 400126) {
            osi0.m165782f(R$string.f16158X0);
        } else if (!((ive) this.viewModel).m138615z0(th, "send_code")) {
            C21383yf.m214461b(th);
            HashMap map = new HashMap();
            map.put("Sign up status", "Email register fail");
            w85.INSTANCE.m202145m("Sign Up", map);
        }
        ((ive) this.viewModel).m138569D0();
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m166051k2(roj0 roj0Var) {
        ((ive) this.viewModel).m138569D0();
        ((ive) this.viewModel).m138608s0();
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m166052l2(CaptchaData captchaData) {
        this.f145687f = captchaData;
        ((ive) this.viewModel).m138614y0(captchaData);
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m166053m2(View view) {
        eje.m116824h().m116829f(SignupStage.get("verified"), StepSignupStage.get(StepSignupStage.google_email_saved));
        zmi0.f203725d.put(Boolean.TRUE);
        Intent intentM132321e = C17367hp.m132321e(act());
        intentM132321e.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        act().startActivity(intentM132321e);
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ boolean m166054n2(int i, int i2, Intent intent) {
        if (i2 != -1 || !intent.hasExtra("back_reason")) {
            return false;
        }
        String stringExtra = intent.getStringExtra("back_reason");
        this.f145686e = stringExtra;
        if ("show_captcha".equals(stringExtra)) {
            m166062v2();
            return true;
        }
        if ("change_number".equals(this.f145686e) || !"password_login".equals(this.f145686e)) {
            return true;
        }
        ((ive) this.viewModel).m138567A0();
        return true;
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m166055o2() {
        ((ive) this.viewModel).m138612w0();
        act().startActivityForResult(EmailVerifyCodeAct.m28668Y1(act(), ((ive) this.viewModel).m138577M(), 1, this.f145688g, this.f145689h), new C4317a.a() { // from class: l.bue
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return this.f77316a.m166054n2(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m166056p2(View view) {
        if (NullChecker.m81303a(act())) {
            act().hideInput();
        }
        zvf0.m220396r("e_signin_google_button", ((ive) this.viewModel).m138610u0());
        this.f145693l.onClick(view);
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m166057q2() {
        ((ive) this.viewModel).m138569D0();
        act().progressDismiss();
        e51.m114746K(((ive) this.viewModel).m138579O());
        C17133gp.m127319j();
        HashMap map = new HashMap();
        map.put("Method used", "email");
        map.put("Status", "Success");
        map.put(Constants.CLTAP_APP_VERSION, px0.m171778b(App.f15369e));
        w85.INSTANCE.m202145m("Login", map);
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m166058r2(String str) {
        act().progressDismiss();
        if (!"newDevice".equals(str)) {
            zvf0.m220402x("e_password_verifypage_wrong_tips", ((ive) this.viewModel).m138610u0());
        }
        if (TextUtils.equals("suspicious", str)) {
            m166062v2();
        }
        ((ive) this.viewModel).m138571G0();
        if (TextUtils.equals(str, "inActivated")) {
            return;
        }
        HashMap map = new HashMap();
        map.put("Sign up status", "Email register fail");
        w85.INSTANCE.m202145m("Sign Up", map);
    }

    /* JADX INFO: renamed from: s2 */
    public void m166059s2(int i, int i2, Intent intent) throws Throwable {
        if (i == 9001) {
            m166027J1(intent);
        }
    }

    /* JADX INFO: renamed from: t2 */
    public final void m166060t2(final SignUpData signUpData, final ThirdPartyData thirdPartyData) {
        final Runnable runnable = new Runnable() { // from class: l.nte
            @Override // java.lang.Runnable
            public final void run() {
                this.f140468a.m166047g2();
            }
        };
        signUpData.thirdPartyId = thirdPartyData.thirdPartyId;
        signUpData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        signUpData.signUpType = AccountTempApi.SignUpType.google;
        duringCreated(eje.m116827r(signUpData, null, true)).subscribe(mkd0.m154956H(new e30() { // from class: l.ote
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145575a.m166048h2(signUpData, (roj0) obj);
            }
        }, new e30() { // from class: l.qte
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156319a.m166049i2(thirdPartyData, runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u2 */
    public void m166061u2(Captcha captcha) {
        VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.language = i0g0.m133885y();
        verifyDataNew_.action = this.f145688g;
        verifyDataNew_.email = ((ive) this.viewModel).m138577M();
        verifyDataNew_.codeLength = 4;
        if (((ive) this.viewModel).m138586V() && NullChecker.m81303a(this.f145687f)) {
            V v2 = this.viewModel;
            if (((ive) v2).f115126C) {
                verifyDataNew_.captchaToken = this.f145687f.token;
                verifyDataNew_.captchaValue = ((ive) v2).m138576L();
            }
        }
        if (NullChecker.m81303a(captcha)) {
            verifyDataNew_.captcha = captcha;
        }
        ((ive) this.viewModel).m138568B0();
        AccountModule.f16038d.m200248I(verifyDataNew_).compose(C4576b.m28376f()).subscribe(mkd0.m154959K(new e30() { // from class: l.ite
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114874a.m166051k2((roj0) obj);
            }
        }, new e30() { // from class: l.jte
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119592a.m166050j2((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: v2 */
    public void m166062v2() {
        duringCreated(AccountModule.f16037c.m28314W0()).subscribe(mkd0.m154956H(new e30() { // from class: l.rte
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160961a.m166052l2((CaptchaData) obj);
            }
        }, new e30() { // from class: l.ste
            @Override // p149l.e30
            public final void call(Object obj) {
                oue.m166022z1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w2 */
    public void m166063w2(Throwable th) {
        ((ive) this.viewModel).m138615z0(th, "send_code");
    }

    /* JADX INFO: renamed from: x2 */
    public View.OnClickListener m166064x2() {
        return new View.OnClickListener() { // from class: l.cue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82562a.m166053m2(view);
            }
        };
    }

    /* JADX INFO: renamed from: y2 */
    public void m166065y2() {
        e51.m114742G(new Runnable() { // from class: l.wte
            @Override // java.lang.Runnable
            public final void run() {
                this.f188006a.m166055o2();
            }
        });
    }

    /* JADX INFO: renamed from: z2 */
    public View.OnClickListener m166066z2() {
        return new View.OnClickListener() { // from class: l.zte
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204715a.m166056p2(view);
            }
        };
    }
}
