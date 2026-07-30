package p153l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.appsflyer.AppsFlyerLib;
import com.clevertap.android.sdk.Constants;
import com.core.glcore.util.ErrorCode;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import com.google.android.gms.auth.api.signin.C2104a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.api.C4727b;
import com.p051p1.mobile.putong.account.data.CaptchaData;
import com.p051p1.mobile.putong.account.data.ThirdPartyData;
import com.p051p1.mobile.putong.account.p055ui.accountnew.SignUpDetailsNewAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.EmailVerifyCodeAct;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.data.Captcha;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.SignupStage;
import com.p051p1.mobile.putong.data.StepSignupStage;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class sve extends ibf0<mwe> {

    /* JADX INFO: renamed from: m */
    public static final Pattern f170825m = Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$");

    /* JADX INFO: renamed from: e */
    public String f170826e;

    /* JADX INFO: renamed from: f */
    public CaptchaData f170827f;

    /* JADX INFO: renamed from: g */
    public VerifyReason f170828g;

    /* JADX INFO: renamed from: h */
    public String f170829h;

    /* JADX INFO: renamed from: i */
    public boolean f170830i;

    /* JADX INFO: renamed from: j */
    public boolean f170831j;

    /* JADX INFO: renamed from: k */
    public b30<Throwable, ThirdPartyData, Runnable, SignInGrantType> f170832k;

    /* JADX INFO: renamed from: l */
    public View.OnClickListener f170833l;

    public sve(ner nerVar) {
        super(nerVar);
        this.f170830i = false;
        this.f170831j = false;
        this.f170832k = new b30() { // from class: l.rve
            @Override // p153l.b30
            /* JADX INFO: renamed from: b */
            public final void mo102266b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f165009a.m188174e2((Throwable) obj, (ThirdPartyData) obj2, (Runnable) obj3, (SignInGrantType) obj4);
            }
        };
        this.f170833l = new View.OnClickListener() { // from class: l.jue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122705a.m188175f2(view);
            }
        };
    }

    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ void m188116C1(SignInGrantType signInGrantType, ThirdPartyData thirdPartyData, final x20 x20Var, final Runnable runnable) {
        SignInData signInData = new SignInData();
        signInData.grantType = signInGrantType;
        signInData.thirdPartyId = thirdPartyData.thirdPartyId;
        signInData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        AccountModule.f16756c.m29348o2(signInData, true, null).subscribe(psd0.m173597H(new y20() { // from class: l.bve
            @Override // p153l.y20
            public final void call(Object obj) {
                sve.m188143p1(x20Var, (uxj0) obj);
            }
        }, new y20() { // from class: l.cve
            @Override // p153l.y20
            public final void call(Object obj) {
                sve.m188117D1(runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ void m188117D1(Runnable runnable, Throwable th) {
        runnable.run();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m188121S0(x20 x20Var, uxj0 uxj0Var) {
        tcn.m190485b();
        x20Var.call();
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m188124W0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ void m188128a2(Bundle bundle) {
        l51.m152887G(new Runnable() { // from class: l.kue
            @Override // java.lang.Runnable
            public final void run() {
                this.f128851a.m188170Z1();
            }
        });
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ void m188135h1() {
    }

    /* JADX INFO: renamed from: p1 */
    public static /* synthetic */ void m188143p1(x20 x20Var, uxj0 uxj0Var) {
        tcn.m190485b();
        x20Var.call();
    }

    /* JADX INFO: renamed from: z1 */
    public static /* synthetic */ void m188151z1(Throwable th) {
    }

    /* JADX INFO: renamed from: A2 */
    public void m188152A2() {
        SignInData signInData = new SignInData();
        signInData.username = ((mwe) this.viewModel).m160512M();
        signInData.password = ((mwe) this.viewModel).m160513N();
        signInData.grantType = SignInGrantType.get("email");
        Device device = new Device();
        signInData.device = device;
        device.identifiers = tl8.m191617N();
        ((mwe) this.viewModel).m160503B0();
        act().progress(R$string.f16946j0);
        m139326L0(signInData, new x20() { // from class: l.hve
            @Override // p153l.x20
            public final void call() {
                this.f111751a.m188186q2();
            }
        }, new y20() { // from class: l.ive
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117050a.m188187r2((String) obj);
            }
        }, true);
    }

    /* JADX INFO: renamed from: F1 */
    public final void m188153F1(String str) {
        i4g0.m138495D("e_intl_email_verification_risk_graph_result", ((mwe) this.viewModel).m160545u0(), jyb.m147494Y("cerfificated_result", str), jyb.m147494Y("login_channel", "email"));
    }

    /* JADX INFO: renamed from: H1 */
    public void m188154H1() {
        if (((mwe) this.viewModel).m160521V() && NullChecker.m82486a(this.f170827f)) {
            duringCreated(AccountModule.f16756c.m29284H0(this.f170827f.token, ((mwe) this.viewModel).m160511L())).subscribe(psd0.m173597H(new y20() { // from class: l.jve
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f122798a.m188163S1((uxj0) obj);
                }
            }, new y20() { // from class: l.kve
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f128954a.m188164T1((Throwable) obj);
                }
            }));
        } else {
            m188190u2(null);
        }
    }

    /* JADX INFO: renamed from: I1 */
    public boolean m188155I1(String str) {
        if (str == null) {
            return false;
        }
        return f170825m.matcher(str).matches();
    }

    /* JADX INFO: renamed from: J1 */
    public final void m188156J1(Intent intent) throws Throwable {
        try {
            GoogleSignInAccount googleSignInAccountMo15428m = C2104a.m12496b(intent).mo15428m(ApiException.class);
            ((mwe) this.viewModel).m160515P(false);
            m188157L1(googleSignInAccountMo15428m.m12460h0(), googleSignInAccountMo15428m.m12461i0(), googleSignInAccountMo15428m.m12457H());
        } catch (ApiException e) {
            if (e.getStatusCode() != 12501) {
                o1j0.m165634h(R$string.f17030y3);
            }
            ((mwe) this.viewModel).m160515P(false);
        }
    }

    /* JADX INFO: renamed from: L1 */
    public void m188157L1(String str, String str2, String str3) {
        final Runnable runnable = new Runnable() { // from class: l.mve
            @Override // java.lang.Runnable
            public final void run() {
                this.f138890a.m188165U1();
            }
        };
        if (m188160P1() || m188161Q1()) {
            duringCreated(AccountModule.f16756c.m29359u2("google", str, str2, str3)).subscribe(psd0.m173597H(new y20() { // from class: l.nve
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f143794a.m188166V1((uxj0) obj);
                }
            }, new y20() { // from class: l.ove
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f149259a.m188167W1((Throwable) obj);
                }
            }));
            return;
        }
        final ThirdPartyData thirdPartyDataNew_ = ThirdPartyData.new_();
        thirdPartyDataNew_.thirdPartyId = str;
        thirdPartyDataNew_.thirdPartyToken = str2;
        thirdPartyDataNew_.email = str3;
        duringCreated(AccountModule.f16756c.m29275D2(thirdPartyDataNew_)).subscribe(psd0.m173600K(new y20() { // from class: l.pve
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154286a.m188168X1(thirdPartyDataNew_, (uxj0) obj);
            }
        }, new y20() { // from class: l.qve
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159741a.m188169Y1(thirdPartyDataNew_, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: N1 */
    public void m188158N1(VerifyReason verifyReason, String str, boolean z, boolean z2) {
        this.f170828g = verifyReason;
        this.f170829h = str;
        this.f170830i = z;
        this.f170831j = z2;
    }

    /* JADX INFO: renamed from: O1 */
    public final boolean m188159O1(Throwable th) {
        return NullChecker.m82486a(th) && (th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40037;
    }

    /* JADX INFO: renamed from: P1 */
    public boolean m188160P1() {
        return VerifyReason.get(VerifyReason.bind_email).equals(this.f170828g);
    }

    /* JADX INFO: renamed from: Q1 */
    public boolean m188161Q1() {
        return VerifyReason.get(VerifyReason.change_email).equals(this.f170828g);
    }

    /* JADX INFO: renamed from: R1 */
    public boolean m188162R1() {
        return VerifyReason.get(VerifyReason.bind_email).equals(this.f170828g) && TextUtils.equals(this.f170829h, "google_login_verify_email");
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m188163S1(uxj0 uxj0Var) {
        m188153F1("success");
        m188190u2(null);
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m188164T1(Throwable th) {
        m188153F1("fail");
        bsj0.m106246D(th);
        m188191v2();
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m188165U1() {
        ((mwe) this.viewModel).m160515P(false);
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m188166V1(uxj0 uxj0Var) {
        this.f170830i = false;
        r1j0.m179419f(R$string.f16974n4);
        ((mwe) this.viewModel).m160505E0();
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m188167W1(Throwable th) {
        if (th instanceof TantanException.Client.AccountService) {
            int i = ((TantanException.Client.AccountService) th).code;
            if (i == 400152 || i == 400153) {
                final Act act = act();
                act.runOnUiThread(new Runnable() { // from class: l.lue
                    @Override // java.lang.Runnable
                    public final void run() {
                        Act act2 = act;
                        new jl80.C17971a(act2).m146056y0(act2.getString(R$string.f16877X0)).m146051t0(String.format(act2.getString(R$string.f16872W0), ThirdPushManager.VENDOR_TYPE_FCM)).m146034c0(act2.getString(R$string.f16857T0), new Runnable() { // from class: l.xue
                            @Override // java.lang.Runnable
                            public final void run() {
                                sve.m188135h1();
                            }
                        }).m146021P(false).m146049r0();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m188168X1(ThirdPartyData thirdPartyData, uxj0 uxj0Var) {
        SignUpData signUpData = new SignUpData();
        signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(App.f16088e);
        signUpData.signUpType = AccountTempApi.SignUpType.google;
        m188189t2(signUpData, thirdPartyData);
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m188169Y1(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
        if (m188159O1(th)) {
            this.f170832k.mo102266b(th, thirdPartyData, runnable, SignInGrantType.get("google"));
        } else {
            l51.m152887G(runnable);
            bsj0.m106246D(th);
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m188170Z1() {
        ((mwe) this.viewModel).m160542r();
    }

    @Override // p153l.ibf0, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.iue
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116921a.m188128a2((Bundle) obj);
            }
        });
        act().duringCreated(esf0.m122324e().f95596b).filter(new qcj() { // from class: l.tue
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Captcha) obj).localExpired);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.eve
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95999a.m188171b2((Captcha) obj);
            }
        }, new y20() { // from class: l.lve
            @Override // p153l.y20
            public final void call(Object obj) {
                sve.m188124W0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m188171b2(Captcha captcha) {
        if (NullChecker.m82486a(captcha)) {
            m188190u2(captcha);
        }
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m188172c2() {
        AuthData authDataMo107143b = AccountModule.f16756c.m29311V0().mo107143b();
        act().startActivity(C16330cp.m111720f(((mwe) this.viewModel).act(), NullChecker.m82486a(authDataMo107143b) ? authDataMo107143b.signupStage.toString() : ""));
        act().m68056e2();
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m188173d2(final SignInGrantType signInGrantType, final ThirdPartyData thirdPartyData, final x20 x20Var, final Runnable runnable, Throwable th, Throwable th2) {
        if (!(th2 instanceof TantanException.Client.AccountService)) {
            runnable.run();
            bsj0.m106246D(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th2).code;
        if (i == 40020 || i == 40091) {
            boolean z = i == 40020;
            act().dialog().m21502E0(z ? R$string.f16869V2 : R$string.f16859T2).m21499D(z ? R$string.f16874W2 : R$string.f16864U2).m21555t0(R$string.f17031z, new Runnable() { // from class: l.yue
                @Override // java.lang.Runnable
                public final void run() {
                    sve.m188116C1(signInGrantType, thirdPartyData, x20Var, runnable);
                }
            }).m21541l0(R$string.f16897b, runnable).m21567z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.zue
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    runnable.run();
                }
            });
        }
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m188174e2(final Throwable th, final ThirdPartyData thirdPartyData, final Runnable runnable, final SignInGrantType signInGrantType) {
        SignInData signInData = new SignInData();
        signInData.grantType = signInGrantType;
        signInData.thirdPartyId = thirdPartyData.thirdPartyId;
        signInData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        final x20 x20Var = new x20() { // from class: l.oue
            @Override // p153l.x20
            public final void call() {
                this.f149139a.m188172c2();
            }
        };
        AccountModule.f16756c.m29348o2(signInData, false, null).subscribe(psd0.m173597H(new y20() { // from class: l.pue
            @Override // p153l.y20
            public final void call(Object obj) {
                sve.m188121S0(x20Var, (uxj0) obj);
            }
        }, new y20() { // from class: l.que
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159558a.m188173d2(signInGrantType, thirdPartyData, x20Var, runnable, th, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m188175f2(View view) {
        ((mwe) this.viewModel).m160515P(true);
        h7k h7kVarM12495a = C2104a.m12495a(m99640Y(), new GoogleSignInOptions.C2103a(GoogleSignInOptions.DEFAULT_SIGN_IN).m12488b().m12490d("218526224262-usliqg20cepnb3ql98amgeum18v8uatv.apps.googleusercontent.com").m12487a());
        h7kVarM12495a.m133801d();
        act().startActivityForResult(h7kVarM12495a.m133799b(), ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED);
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m188176g2() {
        ((mwe) this.viewModel).m160515P(false);
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m188177h2(SignUpData signUpData, uxj0 uxj0Var) {
        act().startActivity(SignUpDetailsNewAct.m29496b2(act(), signUpData));
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m188178i2(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
        if (m188159O1(th)) {
            this.f170832k.mo102266b(th, thirdPartyData, runnable, SignInGrantType.get("google"));
        } else {
            l51.m152887G(runnable);
            bsj0.m106246D(th);
        }
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m188179j2(Throwable th) {
        ((mwe) this.viewModel).m160516Q();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 400150) {
            r1j0.m179419f(R$string.f16916e0);
        } else if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m188191v2();
        } else if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            olj.INSTANCE.m168131d("email", act());
        } else if (z && ((TantanException.Client.AccountService) th).code == 400149) {
            r1j0.m179419f(R$string.f16899b1);
        } else if (z && ((TantanException.Client.AccountService) th).code == 400126) {
            r1j0.m179419f(R$string.f16877X0);
        } else if (!((mwe) this.viewModel).m160550z0(th, "send_code")) {
            C20299tf.m190906b(th);
            HashMap map = new HashMap();
            map.put("Sign up status", "Email register fail");
            x95.INSTANCE.m209793m("Sign Up", map);
        }
        ((mwe) this.viewModel).m160504D0();
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m188180k2(uxj0 uxj0Var) {
        ((mwe) this.viewModel).m160504D0();
        ((mwe) this.viewModel).m160543s0();
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m188181l2(CaptchaData captchaData) {
        this.f170827f = captchaData;
        ((mwe) this.viewModel).m160549y0(captchaData);
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m188182m2(View view) {
        ike.m140276h().m140281f(SignupStage.get("verified"), StepSignupStage.get(StepSignupStage.google_email_saved));
        awi0.f73760d.put(Boolean.TRUE);
        Intent intentM111719e = C16330cp.m111719e(act());
        intentM111719e.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        act().startActivity(intentM111719e);
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ boolean m188183n2(int i, int i2, Intent intent) {
        if (i2 != -1 || !intent.hasExtra("back_reason")) {
            return false;
        }
        String stringExtra = intent.getStringExtra("back_reason");
        this.f170826e = stringExtra;
        if ("show_captcha".equals(stringExtra)) {
            m188191v2();
            return true;
        }
        if ("change_number".equals(this.f170826e) || !"password_login".equals(this.f170826e)) {
            return true;
        }
        ((mwe) this.viewModel).m160502A0();
        return true;
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m188184o2() {
        ((mwe) this.viewModel).m160547w0();
        act().startActivityForResult(EmailVerifyCodeAct.m29667Z1(act(), ((mwe) this.viewModel).m160512M(), 1, this.f170828g, this.f170829h), new C4468a.a() { // from class: l.fve
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return this.f101009a.m188183n2(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m188185p2(View view) {
        if (NullChecker.m82486a(act())) {
            act().hideInput();
        }
        i4g0.m138520r("e_signin_google_button", ((mwe) this.viewModel).m160545u0());
        this.f170833l.onClick(view);
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m188186q2() {
        ((mwe) this.viewModel).m160504D0();
        act().progressDismiss();
        l51.m152891K(((mwe) this.viewModel).m160514O());
        C16074bp.m105755j();
        HashMap map = new HashMap();
        map.put("Method used", "email");
        map.put("Status", "Success");
        map.put(Constants.CLTAP_APP_VERSION, wx0.m208362b(App.f16088e));
        x95.INSTANCE.m209793m("Login", map);
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m188187r2(String str) {
        act().progressDismiss();
        if (!"newDevice".equals(str)) {
            i4g0.m138526x("e_password_verifypage_wrong_tips", ((mwe) this.viewModel).m160545u0());
        }
        if (TextUtils.equals("suspicious", str)) {
            m188191v2();
        }
        ((mwe) this.viewModel).m160506G0();
        if (TextUtils.equals(str, "inActivated")) {
            return;
        }
        HashMap map = new HashMap();
        map.put("Sign up status", "Email register fail");
        x95.INSTANCE.m209793m("Sign Up", map);
    }

    /* JADX INFO: renamed from: s2 */
    public void m188188s2(int i, int i2, Intent intent) throws Throwable {
        if (i == 9001) {
            m188156J1(intent);
        }
    }

    /* JADX INFO: renamed from: t2 */
    public final void m188189t2(final SignUpData signUpData, final ThirdPartyData thirdPartyData) {
        final Runnable runnable = new Runnable() { // from class: l.rue
            @Override // java.lang.Runnable
            public final void run() {
                this.f164915a.m188176g2();
            }
        };
        signUpData.thirdPartyId = thirdPartyData.thirdPartyId;
        signUpData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        signUpData.signUpType = AccountTempApi.SignUpType.google;
        duringCreated(ike.m140279r(signUpData, null, true)).subscribe(psd0.m173597H(new y20() { // from class: l.sue
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170678a.m188177h2(signUpData, (uxj0) obj);
            }
        }, new y20() { // from class: l.uue
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181056a.m188178i2(thirdPartyData, runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u2 */
    public void m188190u2(Captcha captcha) {
        VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.language = q8g0.m175820y();
        verifyDataNew_.action = this.f170828g;
        verifyDataNew_.email = ((mwe) this.viewModel).m160512M();
        verifyDataNew_.codeLength = 4;
        if (((mwe) this.viewModel).m160521V() && NullChecker.m82486a(this.f170827f)) {
            V v2 = this.viewModel;
            if (((mwe) v2).f139057C) {
                verifyDataNew_.captchaToken = this.f170827f.token;
                verifyDataNew_.captchaValue = ((mwe) v2).m160511L();
            }
        }
        if (NullChecker.m82486a(captcha)) {
            verifyDataNew_.captcha = captcha;
        }
        ((mwe) this.viewModel).m160503B0();
        AccountModule.f16757d.m174018I(verifyDataNew_).compose(C4727b.m29375f()).subscribe(psd0.m173600K(new y20() { // from class: l.mue
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138768a.m188180k2((uxj0) obj);
            }
        }, new y20() { // from class: l.nue
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143700a.m188179j2((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: v2 */
    public void m188191v2() {
        duringCreated(AccountModule.f16756c.m29313W0()).subscribe(psd0.m173597H(new y20() { // from class: l.vue
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185778a.m188181l2((CaptchaData) obj);
            }
        }, new y20() { // from class: l.wue
            @Override // p153l.y20
            public final void call(Object obj) {
                sve.m188151z1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w2 */
    public void m188192w2(Throwable th) {
        ((mwe) this.viewModel).m160550z0(th, "send_code");
    }

    /* JADX INFO: renamed from: x2 */
    public View.OnClickListener m188193x2() {
        return new View.OnClickListener() { // from class: l.gve
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106623a.m188182m2(view);
            }
        };
    }

    /* JADX INFO: renamed from: y2 */
    public void m188194y2() {
        l51.m152887G(new Runnable() { // from class: l.ave
            @Override // java.lang.Runnable
            public final void run() {
                this.f73609a.m188184o2();
            }
        });
    }

    /* JADX INFO: renamed from: z2 */
    public View.OnClickListener m188195z2() {
        return new View.OnClickListener() { // from class: l.dve
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90924a.m188185p2(view);
            }
        };
    }
}
