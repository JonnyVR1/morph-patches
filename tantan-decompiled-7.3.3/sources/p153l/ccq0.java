package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.hume.readapk.HumeSDK;
import com.core.glcore.util.ErrorCode;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.google.android.gms.auth.api.signin.C2104a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.p051p1.mobile.account_core.reponse_data.OneClickStatus;
import com.p051p1.mobile.account_core.request_data.OperatorType;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.api.C4726a;
import com.p051p1.mobile.putong.account.api.ThirdPartLoginApi;
import com.p051p1.mobile.putong.account.data.AccountTestFactor;
import com.p051p1.mobile.putong.account.data.AccountTestGroup;
import com.p051p1.mobile.putong.account.data.MatchCounterEnvelope;
import com.p051p1.mobile.putong.account.data.ThirdPartVetify;
import com.p051p1.mobile.putong.account.data.ThirdPartyData;
import com.p051p1.mobile.putong.account.data.WeChatToken;
import com.p051p1.mobile.putong.account.data.WeChatUserInfo;
import com.p051p1.mobile.putong.account.p055ui.accountai.SignUpAiAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.SignUpDetailsNewAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.PhoneNumberLoginOptAct;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.api.FacebookApi;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MobileRespInfo;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.RememberUserInfo;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.SignupStage;
import com.p051p1.mobile.putong.data.ThirdPartyValidation;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.wxapi.WXEntryActivity;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.UserInfo;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.p106mm.opensdk.modelmsg.SendAuth;
import com.tencent.p106mm.opensdk.openapi.IWXAPI;
import com.tencent.p106mm.opensdk.openapi.WXAPIFactory;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;
import java.io.IOException;
import java.util.List;
import org.json.JSONObject;
import p137rx.AsyncEmitter;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class ccq0 extends ar2<AbstractC19302p6> {

    /* JADX INFO: renamed from: G */
    public static boolean f80985G = false;

    /* JADX INFO: renamed from: A */
    public y20<SignUpData> f80986A;

    /* JADX INFO: renamed from: B */
    public x20 f80987B;

    /* JADX INFO: renamed from: C */
    public View.OnClickListener f80988C;

    /* JADX INFO: renamed from: D */
    public jl80 f80989D;

    /* JADX INFO: renamed from: E */
    public x20 f80990E;

    /* JADX INFO: renamed from: F */
    public View.OnClickListener f80991F;

    /* JADX INFO: renamed from: a */
    public boolean f80992a;

    /* JADX INFO: renamed from: b */
    public AccountTempApi.InactiveType f80993b;

    /* JADX INFO: renamed from: c */
    public String f80994c;

    /* JADX INFO: renamed from: d */
    public Runnable f80995d;

    /* JADX INFO: renamed from: e */
    public SignUpData f80996e;

    /* JADX INFO: renamed from: f */
    public String f80997f;

    /* JADX INFO: renamed from: g */
    public OneClickStatus f80998g;

    /* JADX INFO: renamed from: h */
    public boolean f80999h;

    /* JADX INFO: renamed from: i */
    public boolean f81000i;

    /* JADX INFO: renamed from: j */
    public boolean f81001j;

    /* JADX INFO: renamed from: k */
    public C22507a<String> f81002k;

    /* JADX INFO: renamed from: l */
    public View.OnClickListener f81003l;

    /* JADX INFO: renamed from: m */
    public View.OnClickListener f81004m;

    /* JADX INFO: renamed from: n */
    public b30<Throwable, ThirdPartyData, Runnable, SignInGrantType> f81005n;

    /* JADX INFO: renamed from: o */
    public b94 f81006o;

    /* JADX INFO: renamed from: p */
    public AccessToken f81007p;

    /* JADX INFO: renamed from: q */
    public x20 f81008q;

    /* JADX INFO: renamed from: r */
    public x20 f81009r;

    /* JADX INFO: renamed from: s */
    public boolean f81010s;

    /* JADX INFO: renamed from: t */
    public boolean f81011t;

    /* JADX INFO: renamed from: u */
    public kcg0 f81012u;

    /* JADX INFO: renamed from: v */
    public x20 f81013v;

    /* JADX INFO: renamed from: w */
    public IWXAPI f81014w;

    /* JADX INFO: renamed from: x */
    public IUiListener f81015x;

    /* JADX INFO: renamed from: y */
    public int f81016y;

    /* JADX INFO: renamed from: z */
    public x20 f81017z;

    /* JADX INFO: renamed from: l.ccq0$c */
    public class DialogInterfaceOnDismissListenerC16229c implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f81021a;

        public DialogInterfaceOnDismissListenerC16229c(l4g0 l4g0Var) {
            this.f81021a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f81021a);
        }
    }

    /* JADX INFO: renamed from: l.ccq0$d */
    public class DialogInterfaceOnDismissListenerC16230d implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f81023a;

        public DialogInterfaceOnDismissListenerC16230d(l4g0 l4g0Var) {
            this.f81023a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f81023a);
        }
    }

    /* JADX INFO: renamed from: l.ccq0$e */
    public class C16231e implements tvf<a1w> {

        /* JADX INFO: renamed from: a */
        public a30<ThirdPartyData, ThirdPartyValidation, SignUpData> f81025a = new a30() { // from class: l.mcq0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                this.f135839a.m109040r((ThirdPartyData) obj, (ThirdPartyValidation) obj2, (SignUpData) obj3);
            }
        };

        public C16231e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: A */
        public /* synthetic */ void m109020A() {
            ((AbstractC19302p6) ccq0.this.viewModel).mo144491q(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: B */
        public /* synthetic */ void m109021B(ThirdPartyData thirdPartyData, SignUpData signUpData) {
            this.f81025a.mo37058a(thirdPartyData, null, signUpData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: C */
        public /* synthetic */ void m109022C(final ThirdPartyData thirdPartyData, final SignUpData signUpData) {
            l51.m152887G(new Runnable() { // from class: l.icq0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f114425a.m109021B(thirdPartyData, signUpData);
                }
            });
        }

        /* JADX INFO: renamed from: D */
        private void m109023D(final SignUpData signUpData, final ThirdPartyData thirdPartyData) {
            final Runnable runnable = new Runnable() { // from class: l.fcq0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f98255a.m109043u();
                }
            };
            signUpData.thirdPartyId = thirdPartyData.thirdPartyId;
            signUpData.thirdPartyToken = thirdPartyData.thirdPartyToken;
            ccq0.this.duringCreated(ike.m140279r(signUpData, null, true)).subscribe(psd0.m173597H(new y20() { // from class: l.gcq0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f103598a.m109044v(signUpData, (uxj0) obj);
                }
            }, new y20() { // from class: l.hcq0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f108728a.m109045w(thirdPartyData, runnable, (Throwable) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ SignUpData m109032j(Throwable th) {
            SignUpData signUpData = new SignUpData();
            signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(App.f16088e);
            signUpData.signUpType = AccountTempApi.SignUpType.facebook;
            return signUpData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public /* synthetic */ void m109039q(ThirdPartyValidation thirdPartyValidation, SignUpData signUpData, ThirdPartyData thirdPartyData, C4470c c4470c) {
            if (NullChecker.m82486a(thirdPartyValidation)) {
                signUpData.thirdPartyValidation = thirdPartyValidation;
            }
            m109023D(signUpData, thirdPartyData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public /* synthetic */ void m109040r(final ThirdPartyData thirdPartyData, final ThirdPartyValidation thirdPartyValidation, final SignUpData signUpData) {
            ccq0.this.lifecycle().filter(new qcj() { // from class: l.ocq0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
                }
            }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.pcq0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f151625a.m109039q(thirdPartyValidation, signUpData, thirdPartyData, (C4470c) obj);
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s */
        public /* synthetic */ void m109041s() {
            ((AbstractC19302p6) ccq0.this.viewModel).mo144491q(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: t */
        public /* synthetic */ void m109042t() {
            ((AbstractC19302p6) ccq0.this.viewModel).mo144491q(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: u */
        public /* synthetic */ void m109043u() {
            ((AbstractC19302p6) ccq0.this.viewModel).mo144491q(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: v */
        public /* synthetic */ void m109044v(SignUpData signUpData, uxj0 uxj0Var) {
            AccountModule.f16756c.m29304Q0().put(signUpData.name);
            if (NullChecker.m82486a(signUpData.birthdate)) {
                AccountModule.f16756c.m29300O0().put(signUpData.birthdate);
            }
            if (NullChecker.m82486a(signUpData.gender)) {
                AccountModule.f16756c.m29302P0().put(signUpData.gender.toString());
            }
            boolean zIsEmpty = TextUtils.isEmpty(signUpData.profilePath);
            ccq0 ccq0Var = ccq0.this;
            if (zIsEmpty) {
                ccq0Var.act().startActivity(SignUpDetailsNewAct.m29496b2(ccq0.this.act(), signUpData));
            } else {
                ccq0Var.f80986A.call(signUpData);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: w */
        public /* synthetic */ void m109045w(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
            if (ccq0.this.m108783K3(th)) {
                ccq0.this.f81005n.mo102266b(th, thirdPartyData, runnable, SignInGrantType.get("facebook"));
            } else {
                l51.m152887G(runnable);
                bsj0.m106246D(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: x */
        public /* synthetic */ void m109046x(Throwable th) {
            ccq0.this.f81009r.call();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: y */
        public /* synthetic */ void m109047y(final ThirdPartyData thirdPartyData, uxj0 uxj0Var) {
            AccountModule.f16756c.m29318Y1(ccq0.this.f81007p.getUserId(), ccq0.this.f81007p.getToken()).onErrorReturn(new qcj() { // from class: l.qcq0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ccq0.C16231e.m109032j((Throwable) obj);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.rcq0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f162248a.m109022C(thirdPartyData, (SignUpData) obj);
                }
            }, new y20() { // from class: l.ecq0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f93101a.m109046x((Throwable) obj);
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public /* synthetic */ void m109048z(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
            if (ccq0.this.m108783K3(th)) {
                ccq0.this.f81005n.mo102266b(th, thirdPartyData, runnable, SignInGrantType.get("facebook"));
            } else {
                l51.m152887G(runnable);
                bsj0.m106246D(th);
            }
        }

        @Override // p153l.tvf
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void onSuccess(a1w a1wVar) {
            ccq0.this.f81007p = a1wVar.getAccessToken();
            final Runnable runnable = new Runnable() { // from class: l.dcq0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f87806a.m109020A();
                }
            };
            final ThirdPartyData thirdPartyDataNew_ = ThirdPartyData.new_();
            thirdPartyDataNew_.thirdPartyId = ccq0.this.f81007p.getUserId();
            thirdPartyDataNew_.thirdPartyToken = ccq0.this.f81007p.getToken();
            AccountModule.f16756c.m29273C2(thirdPartyDataNew_).subscribe(psd0.m173600K(new y20() { // from class: l.jcq0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f120088a.m109047y(thirdPartyDataNew_, (uxj0) obj);
                }
            }, new y20() { // from class: l.kcq0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f125089a.m109048z(thirdPartyDataNew_, runnable, (Throwable) obj);
                }
            }, false));
        }

        @Override // p153l.tvf
        /* JADX INFO: renamed from: a */
        public void mo51952a(FacebookException facebookException) {
            FacebookApi.m30528m(facebookException);
            l51.m152887G(new Runnable() { // from class: l.lcq0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f131375a.m109042t();
                }
            });
        }

        @Override // p153l.tvf
        public void onCancel() {
            l51.m152887G(new Runnable() { // from class: l.ncq0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f141394a.m109041s();
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.ccq0$f */
    public class DialogInterfaceOnDismissListenerC16232f implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f81027a;

        public DialogInterfaceOnDismissListenerC16232f(l4g0 l4g0Var) {
            this.f81027a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f81027a);
        }
    }

    /* JADX INFO: renamed from: l.ccq0$g */
    public static /* synthetic */ class C16233g {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f81029a;

        static {
            int[] iArr = new int[OperatorType.values().length];
            f81029a = iArr;
            try {
                iArr[OperatorType.china_mobile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81029a[OperatorType.china_telecom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81029a[OperatorType.china_unicom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ccq0(ner nerVar) {
        super(nerVar);
        this.f80992a = false;
        this.f80993b = AccountTempApi.InactiveType.None;
        this.f80994c = "";
        this.f81002k = C22507a.m222758b();
        this.f81003l = new View.OnClickListener() { // from class: l.z7q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203260a.m108758E4(view);
            }
        };
        this.f81004m = new View.OnClickListener() { // from class: l.n8q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140708a.m108762F4(view);
            }
        };
        this.f81005n = new b30() { // from class: l.o8q0
            @Override // p153l.b30
            /* JADX INFO: renamed from: b */
            public final void mo102266b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f145458a.m108993z4((Throwable) obj, (ThirdPartyData) obj2, (Runnable) obj3, (SignInGrantType) obj4);
            }
        };
        this.f81008q = new x20() { // from class: l.p8q0
            @Override // p153l.x20
            public final void call() {
                this.f151058a.m108737A4();
            }
        };
        this.f81009r = new x20() { // from class: l.q8q0
            @Override // p153l.x20
            public final void call() {
                this.f156156a.m108747C4();
            }
        };
        this.f81010s = false;
        this.f81011t = false;
        this.f81013v = new x20() { // from class: l.s8q0
            @Override // p153l.x20
            public final void call() {
                this.f166841a.m108752D4();
            }
        };
        this.f81015x = new C16227a();
        this.f81017z = new x20() { // from class: l.t8q0
            @Override // p153l.x20
            public final void call() {
                this.f172564a.m108769H4();
            }
        };
        this.f80986A = new y20() { // from class: l.u8q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178067a.m108960s4((SignUpData) obj);
            }
        };
        this.f80987B = new x20() { // from class: l.v8q0
            @Override // p153l.x20
            public final void call() {
                this.f182890a.m108965t4();
            }
        };
        this.f80988C = new View.OnClickListener() { // from class: l.w8q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187927a.m108970u4(view);
            }
        };
        this.f80990E = new x20() { // from class: l.k8q0
            @Override // p153l.x20
            public final void call() {
                this.f124410a.m108978w4();
            }
        };
        this.f80991F = new View.OnClickListener() { // from class: l.m8q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135275a.m108988y4(view);
            }
        };
    }

    /* JADX INFO: renamed from: A3 */
    private void m108736A3() {
        if (this.f81014w == null) {
            this.f81014w = WXAPIFactory.createWXAPI(m99640Y(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m108737A4() {
        this.f81011t = false;
        this.f81010s = false;
        ((AbstractC19302p6) this.viewModel).mo144489p();
    }

    /* JADX INFO: renamed from: B2 */
    public static /* synthetic */ void m108739B2(Runnable runnable, Throwable th) {
        runnable.run();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: B3 */
    private void m108740B3() {
        if (this.f80992a) {
            act().hideInput();
            return;
        }
        act().startActivity(C16330cp.m111719e(act()));
        act().m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public /* synthetic */ void m108741B4() {
        ((AbstractC19302p6) this.viewModel).mo144491q(false);
    }

    /* JADX INFO: renamed from: B5 */
    private void m108742B5() {
        m108748C5(false);
    }

    /* JADX INFO: renamed from: C2 */
    public static /* synthetic */ void m108745C2(SignInGrantType signInGrantType, ThirdPartyData thirdPartyData, final x20 x20Var, final Runnable runnable) {
        SignInData signInData = new SignInData();
        signInData.grantType = signInGrantType;
        signInData.thirdPartyId = thirdPartyData.thirdPartyId;
        signInData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        AccountModule.f16756c.m29348o2(signInData, true, null).subscribe(psd0.m173597H(new y20() { // from class: l.nbq0
            @Override // p153l.y20
            public final void call(Object obj) {
                ccq0.m108782K2(x20Var, (uxj0) obj);
            }
        }, new y20() { // from class: l.obq0
            @Override // p153l.y20
            public final void call(Object obj) {
                ccq0.m108739B2(runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C3 */
    private void m108746C3(Intent intent) throws Throwable {
        try {
            GoogleSignInAccount googleSignInAccountMo15428m = C2104a.m12496b(intent).mo15428m(ApiException.class);
            ((AbstractC19302p6) this.viewModel).mo144468b(false);
            m109000J3(googleSignInAccountMo15428m.m12460h0(), googleSignInAccountMo15428m.m12461i0());
        } catch (ApiException e) {
            if (e.getStatusCode() != 12501) {
                o1j0.m165634h(R$string.f17030y3);
            }
            ((AbstractC19302p6) this.viewModel).mo144468b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public /* synthetic */ void m108747C4() {
        l51.m152887G(new Runnable() { // from class: l.k9q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f124569a.m108741B4();
            }
        });
        if (NullChecker.m82486a(AccessToken.m7462d())) {
            z0w.m218186m().m218213u();
        }
    }

    /* JADX INFO: renamed from: C5 */
    private void m108748C5(boolean z) {
        ((AbstractC19302p6) this.viewModel).mo144484m();
        RememberUserInfo rememberUserInfoMo107143b = uqb0.f180380L.f17865d.mo107143b();
        if (NullChecker.m82486a(rememberUserInfoMo107143b) && z) {
            m108776I5(rememberUserInfoMo107143b, act(), new h6q0(this));
        }
        final AccountTestFactor accountTestFactor = new AccountTestFactor();
        accountTestFactor.step = "appOpen";
        accountTestFactor.channel = "googleplay";
        final x20 x20Var = new x20() { // from class: l.x8q0
            @Override // p153l.x20
            public final void call() {
                this.f192866a.m108867c5(accountTestFactor);
            }
        };
        AccountModule.f16756c.m29286H2().subscribe(psd0.m173597H(new y20() { // from class: l.y8q0
            @Override // p153l.y20
            public final void call(Object obj) {
                x20Var.call();
            }
        }, new y20() { // from class: l.z8q0
            @Override // p153l.y20
            public final void call(Object obj) {
                x20Var.call();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public /* synthetic */ void m108752D4() {
        this.f81011t = true;
        ((AbstractC19302p6) this.viewModel).mo144494u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D5 */
    public void m108753D5() {
        ((AbstractC19302p6) this.viewModel).mo144486n(false);
        o1j0.m165636j("授权失败，请再次尝试");
    }

    /* JADX INFO: renamed from: E3 */
    private void m108757E3(final SignUpData signUpData) {
        C4726a.m29249q2(signUpData, null).subscribe(psd0.m173597H(new y20() { // from class: l.d7q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85543a.m108812R3(signUpData, (uxj0) obj);
            }
        }, new y20() { // from class: l.o7q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145292a.m108817S3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m108758E4(View view) {
        act().startActivity(PhoneNumberLoginOptAct.m29678Z1(act()));
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ Boolean m108759F0(Runnable runnable, WeChatUserInfo weChatUserInfo) {
        if (NullChecker.m82486a(weChatUserInfo)) {
            return Boolean.TRUE;
        }
        runnable.run();
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m108762F4(View view) {
        act().startActivity(PhoneNumberLoginOptAct.m29678Z1(act()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G4 */
    public /* synthetic */ void m108764G4() {
        AuthData authDataMo107143b = AccountModule.f16756c.m29311V0().mo107143b();
        act().startActivity(C16330cp.m111720f(((AbstractC19302p6) this.viewModel).getAct(), NullChecker.m82486a(authDataMo107143b) ? authDataMo107143b.signupStage.toString() : ""));
        AccountModule.f16758e.m29179h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f80997f);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: G5 */
    private void m108765G5(boolean z, final SignInData signInData, final Runnable runnable) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        ((AbstractC19302p6) this.viewModel).getAct().dialog().m21502E0(z ? R$string.f16869V2 : R$string.f16859T2).m21499D(z ? R$string.f16874W2 : R$string.f16864U2).m21555t0(R$string.f17031z, new Runnable() { // from class: l.t6q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f172357a.m108872d5(signInData, runnable);
            }
        }).m21541l0(R$string.f16897b, new Runnable() { // from class: l.u6q0
            @Override // java.lang.Runnable
            public final void run() {
                i4g0.m138520r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
            }
        }).m21525V(new DialogInterfaceOnDismissListenerC16232f(l4g0VarM204399c)).m21567z0();
    }

    /* JADX INFO: renamed from: H5 */
    private void m108770H5(boolean z, final String str, final String str2, final Runnable runnable, final y20<Boolean> y20Var) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        act().dialog().m21502E0(z ? R$string.f16869V2 : R$string.f16859T2).m21499D(z ? R$string.f16874W2 : R$string.f16864U2).m21555t0(R$string.f17031z, new Runnable() { // from class: l.l6q0
            @Override // java.lang.Runnable
            public final void run() {
                ccq0.m108834W0(str, str2, y20Var, runnable);
            }
        }).m21541l0(R$string.f16897b, new Runnable() { // from class: l.m6q0
            @Override // java.lang.Runnable
            public final void run() {
                ccq0.m108906j3(runnable);
            }
        }).m21525V(new DialogInterfaceOnDismissListenerC16230d(l4g0VarM204399c)).m21567z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.n6q0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public static Tencent m108774I3(Context context) {
        Tencent.setIsPermissionGranted(true);
        return Tencent.createInstance(cy5.f84298b, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I4 */
    public /* synthetic */ void m108775I4() {
        ((AbstractC19302p6) this.viewModel).mo144468b(false);
    }

    /* JADX INFO: renamed from: I5 */
    private void m108776I5(RememberUserInfo rememberUserInfo, Act act, final x20 x20Var) {
        if (((AbstractC19302p6) this.viewModel).mo144471d()) {
            return;
        }
        if (NullChecker.m82486a(this.f80989D) && this.f80989D.isShowing()) {
            return;
        }
        jl80.C17971a c17971aNewDialog = act.newDialog();
        View viewInflate = act.inflater().inflate(hec0.f109120k0, (ViewGroup) null);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(wcc0.f188411G);
        VImage vImage = (VImage) viewInflate.findViewById(wcc0.f188445h);
        VButton vButton = (VButton) viewInflate.findViewById(wcc0.f188409E);
        VText vText = (VText) viewInflate.findViewById(wcc0.f188441f);
        VText vText2 = (VText) viewInflate.findViewById(wcc0.f188412H);
        fsb0 fsb0Var = uqb0.f180374G;
        String str = rememberUserInfo.imgUrl;
        int i = qa00.f156306S;
        fsb0Var.m127109I0(vDraweeView, str, i, i);
        vText2.setText(rememberUserInfo.name);
        vButton.setText(act.getResources().getString(R$string.f16901b3, m109009Q5(rememberUserInfo.name)));
        vText.setText(R$string.f16907c3);
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_signin_with_saved_info", Dialog.class.getName());
        this.f80989D = c17971aNewDialog.m146023R(viewInflate).m146021P(true).m146046o0(new DialogInterface.OnShowListener() { // from class: l.e9q0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                w1e.m204402f(l4g0VarM204399c);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.f9q0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146043l0(new DialogInterface.OnCancelListener() { // from class: l.g9q0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                i4g0.m138523u("e_switch_account_button", "p_signin_with_saved_info", jyb.m147494Y("switch_account", "close"));
            }
        }).m146049r0();
        vImage.setOnClickListener(new View.OnClickListener() { // from class: l.h9q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108427a.m108878e5(view);
            }
        });
        vButton.setOnClickListener(new View.OnClickListener() { // from class: l.i9q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113497a.m108884f5(x20Var, view);
            }
        });
        vText.setOnClickListener(new View.OnClickListener() { // from class: l.j9q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118899a.m108890g5(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J4 */
    public /* synthetic */ void m108780J4(SignUpData signUpData, uxj0 uxj0Var) {
        act().startActivity(SignUpDetailsNewAct.m29496b2(act(), signUpData));
    }

    /* JADX INFO: renamed from: J5 */
    private void m108781J5(boolean z, final WeChatToken weChatToken, final Runnable runnable, final y20<Boolean> y20Var) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        act().dialog().m21502E0(z ? R$string.f16869V2 : R$string.f16859T2).m21499D(z ? R$string.f16874W2 : R$string.f16864U2).m21555t0(R$string.f17031z, new Runnable() { // from class: l.p7q0
            @Override // java.lang.Runnable
            public final void run() {
                ccq0.m108898i1(weChatToken, y20Var, runnable);
            }
        }).m21541l0(R$string.f16897b, new Runnable() { // from class: l.q7q0
            @Override // java.lang.Runnable
            public final void run() {
                ccq0.m108785L0(runnable);
            }
        }).m21525V(new DialogInterfaceOnDismissListenerC16229c(l4g0VarM204399c)).m21567z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.r7q0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
    }

    /* JADX INFO: renamed from: K2 */
    public static /* synthetic */ void m108782K2(x20 x20Var, uxj0 uxj0Var) {
        tcn.m190485b();
        x20Var.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public boolean m108783K3(Throwable th) {
        return NullChecker.m82486a(th) && (th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40037;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K4 */
    public /* synthetic */ void m108784K4(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
        if (m108783K3(th)) {
            this.f81005n.mo102266b(th, thirdPartyData, runnable, SignInGrantType.get("google"));
        } else {
            l51.m152887G(runnable);
            bsj0.m106246D(th);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m108785L0(Runnable runnable) {
        i4g0.m138520r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L4 */
    public /* synthetic */ void m108788L4() {
        act().progressDismiss();
        ((AbstractC19302p6) this.viewModel).mo144466a();
        ((AbstractC19302p6) this.viewModel).mo144486n(false);
        o1j0.m165651y("QQ登录失败，请重试");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M4 */
    public /* synthetic */ void m108790M4() {
        ((AbstractC19302p6) this.viewModel).mo144486n(false);
        o1j0.m165651y("登录失败，绑定手机号后再试");
    }

    /* JADX INFO: renamed from: N2 */
    public static /* synthetic */ void m108793N2(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N4 */
    public /* synthetic */ void m108794N4() {
        act().progressDismiss();
        ((AbstractC19302p6) this.viewModel).mo144486n(false);
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m108796O1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public /* synthetic */ void m108797O3(uxj0 uxj0Var) {
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169074h(this.f80997f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O4 */
    public /* synthetic */ C22421c m108798O4(ThirdPartVetify thirdPartVetify) {
        return m108997F3();
    }

    /* JADX INFO: renamed from: P2 */
    public static /* synthetic */ void m108801P2(Envelope envelope) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m108802P3(uxj0 uxj0Var) {
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169074h(this.f80997f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public /* synthetic */ void m108803P4(WeChatUserInfo weChatUserInfo) {
        m109017x5(weChatUserInfo, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q3 */
    public /* synthetic */ void m108807Q3(MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            int i = this.f81016y + 1;
            this.f81016y = i;
            if (i < 5) {
                m108769H4();
            } else {
                ABManager.m30320L().take(1).subscribe(psd0.m173596G(new y20() { // from class: l.eaq0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f92804a.m108797O3((uxj0) obj);
                    }
                }));
                AccountModule.f16758e.m29179h(act(), ThirdPartLoginApi.ReportMobileSource.landing_page, this.f80997f);
            }
        } else {
            this.f80997f = mobileRespInfo.mobileNumber;
            ABManager.m30320L().take(1).subscribe(psd0.m173596G(new y20() { // from class: l.faq0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f98002a.m108802P3((uxj0) obj);
                }
            }));
            AccountModule.f16758e.m29179h(act(), ThirdPartLoginApi.ReportMobileSource.landing_page, this.f80997f);
        }
        i4g0.m138495D("e_login_phone_acquisition", WXEntryActivity.PID, jyb.m147494Y("get_phone_or_not", !TextUtils.isEmpty(this.f80997f) ? "yes" : "no"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public /* synthetic */ void m108808Q4(WeChatUserInfo weChatUserInfo) {
        m109017x5(weChatUserInfo, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m108812R3(SignUpData signUpData, uxj0 uxj0Var) {
        if (TEnum.equals(signUpData.gender, "male")) {
            uqb0.m197269e1("signup_male_fb", new Object[0]);
        } else if (TEnum.equals(signUpData.gender, "female")) {
            uqb0.m197269e1("signup_female_fb", new Object[0]);
        }
        Intent intentNewMainActClearStack = AccountModule.m29131H().newMainActClearStack(m99640Y(), true, false);
        intentNewMainActClearStack.putExtra("from_sign_up", true);
        act().startActivity(intentNewMainActClearStack);
        act().m68056e2();
        bsj0.m106261S(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public /* synthetic */ void m108813R4(final Runnable runnable, final WeChatUserInfo weChatUserInfo, final Runnable runnable2) {
        C21841zn.m220547P(act(), "qq", "verified", new x20() { // from class: l.e7q0
            @Override // p153l.x20
            public final void call() {
                runnable.run();
            }
        }, new x20() { // from class: l.f7q0
            @Override // p153l.x20
            public final void call() {
                this.f97586a.m108808Q4(weChatUserInfo);
            }
        }, new x20() { // from class: l.g7q0
            @Override // p153l.x20
            public final void call() {
                runnable2.run();
            }
        });
    }

    /* JADX INFO: renamed from: S2 */
    public static /* synthetic */ void m108816S2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m108817S3(Throwable th) {
        this.f81009r.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m108818S4(WeChatUserInfo weChatUserInfo) {
        m109017x5(weChatUserInfo, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S5 */
    public void m108819S5() {
        ((AbstractC19302p6) this.viewModel).getAct().startActivity(PhoneNumberLoginOptAct.m29678Z1(((AbstractC19302p6) this.viewModel).getAct()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m108822T3(AsyncEmitter asyncEmitter) {
        new UserInfo(act(), m108774I3(act()).getQQToken()).getUserInfo(new C16228b(asyncEmitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4 */
    public /* synthetic */ void m108823T4(final Runnable runnable, final WeChatUserInfo weChatUserInfo, final Runnable runnable2, uxj0 uxj0Var) {
        act().progressDismiss();
        if (!C16074bp.m105751f()) {
            m109017x5(weChatUserInfo, false);
        } else if (TextUtils.isEmpty(this.f80997f) || !m108995D3()) {
            C21841zn.m220547P(act(), "qq", "", new x20() { // from class: l.a7q0
                @Override // p153l.x20
                public final void call() {
                    runnable2.run();
                }
            }, new x20() { // from class: l.b7q0
                @Override // p153l.x20
                public final void call() {
                    this.f75335a.m108818S4(weChatUserInfo);
                }
            }, new x20() { // from class: l.c7q0
                @Override // p153l.x20
                public final void call() {
                    runnable.run();
                }
            });
        } else {
            C21841zn.m220548Q(act(), "qq", this.f80997f, new x20() { // from class: l.w6q0
                @Override // p153l.x20
                public final void call() {
                    runnable.run();
                }
            }, new x20() { // from class: l.x6q0
                @Override // p153l.x20
                public final void call() {
                    this.f192605a.m108803P4(weChatUserInfo);
                }
            }, new x20() { // from class: l.y6q0
                @Override // p153l.x20
                public final void call() {
                    runnable2.run();
                }
            }, new x20() { // from class: l.z6q0
                @Override // p153l.x20
                public final void call() {
                    this.f203176a.m108813R4(runnable2, weChatUserInfo, runnable);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m108827U3(View view) {
        if (((AbstractC19302p6) this.viewModel).mo144472e() || !IntlCountryCodeController.m29119p()) {
            this.f81003l.onClick(view);
        } else {
            ((AbstractC19302p6) this.viewModel).mo144478i(this.f81003l, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public /* synthetic */ void m108828U4(String str, String str2, final Runnable runnable, final Runnable runnable2, final WeChatUserInfo weChatUserInfo) {
        SignUpData signUpData = new SignUpData();
        signUpData.name = weChatUserInfo.nickname;
        signUpData.signUpType = AccountTempApi.SignUpType.qq;
        signUpData.thirdPartyId = str;
        signUpData.thirdPartyToken = str2;
        AccountModule.f16756c.m29336i2(signUpData);
        duringCreated(ike.m140279r(signUpData, null, true)).subscribe(psd0.m173597H(new y20() { // from class: l.vbq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183270a.m108823T4(runnable, weChatUserInfo, runnable2, (uxj0) obj);
            }
        }, new y20() { // from class: l.wbq0
            @Override // p153l.y20
            public final void call(Object obj) {
                ccq0.m108859b2(runnable2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m108832V3(boolean z, final View view) {
        if (z) {
            i4g0.m138520r("e_signin_phone_button", ((PutongAct) act()).pageId());
        }
        m108998F5(new x20() { // from class: l.paq0
            @Override // p153l.x20
            public final void call() {
                this.f151320a.m108827U3(view);
            }
        }, new p9q0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public /* synthetic */ void m108833V4(Boolean bool) {
        AuthData authDataMo107143b = AccountModule.f16756c.m29311V0().mo107143b();
        String string = NullChecker.m82486a(authDataMo107143b) ? authDataMo107143b.signupStage.toString() : "";
        if (C16074bp.m105751f() && bool.booleanValue()) {
            act().startActivity(SignUpAiAct.m29394Z1(act()));
        } else {
            act().startActivity(C16330cp.m111720f(((AbstractC19302p6) this.viewModel).getAct(), string));
        }
        AccountModule.f16758e.m29179h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f80997f);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m108834W0(String str, String str2, final y20 y20Var, final Runnable runnable) {
        i4g0.m138520r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("qq");
        signInData.thirdPartyId = str;
        signInData.thirdPartyToken = str2;
        AccountModule.f16756c.m29348o2(signInData, true, new Runnable() { // from class: l.b8q0
            @Override // java.lang.Runnable
            public final void run() {
                ccq0.m108947q2();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.c8q0
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var.call(Boolean.FALSE);
            }
        }, new y20() { // from class: l.d8q0
            @Override // p153l.y20
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m108837W3() {
        ((AbstractC19302p6) this.viewModel).mo144468b(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public /* synthetic */ void m108838W4(final Runnable runnable, final y20 y20Var, final Runnable runnable2) {
        C21841zn.m220547P(act(), "qq", "verified", new x20() { // from class: l.x7q0
            @Override // p153l.x20
            public final void call() {
                runnable.run();
            }
        }, new x20() { // from class: l.y7q0
            @Override // p153l.x20
            public final void call() {
                y20Var.call(Boolean.TRUE);
            }
        }, new x20() { // from class: l.a8q0
            @Override // p153l.x20
            public final void call() {
                runnable2.run();
            }
        });
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ Boolean m108839X0(WeChatToken weChatToken, Runnable runnable, WeChatToken weChatToken2) {
        if (!NullChecker.m82486a(weChatToken2) || TextUtils.isEmpty(weChatToken2.thirdpartyId) || TextUtils.isEmpty(weChatToken2.thirdpartyAccessToken)) {
            runnable.run();
            return Boolean.FALSE;
        }
        weChatToken.thirdpartyId = weChatToken2.thirdpartyId;
        weChatToken.thirdpartyAccessToken = weChatToken2.thirdpartyAccessToken;
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m108842X3(ThirdPartyData thirdPartyData, uxj0 uxj0Var) {
        SignUpData signUpData = new SignUpData();
        signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(App.f16088e);
        signUpData.signUpType = AccountTempApi.SignUpType.google;
        m108971u5(signUpData, thirdPartyData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m108843X4(final Runnable runnable, final y20 y20Var, final Runnable runnable2, uxj0 uxj0Var) {
        act().progressDismiss();
        if (!C16074bp.m105751f()) {
            y20Var.call(Boolean.FALSE);
            return;
        }
        if (!C4726a.m29232i1()) {
            y20Var.call(Boolean.FALSE);
            return;
        }
        C4726a.m29219Z1();
        if (TextUtils.isEmpty(this.f80997f) || !m108995D3()) {
            C21841zn.m220547P(act(), "qq", "", new x20() { // from class: l.i6q0
                @Override // p153l.x20
                public final void call() {
                    runnable2.run();
                }
            }, new x20() { // from class: l.j6q0
                @Override // p153l.x20
                public final void call() {
                    y20Var.call(Boolean.TRUE);
                }
            }, new x20() { // from class: l.k6q0
                @Override // p153l.x20
                public final void call() {
                    runnable.run();
                }
            });
        } else {
            C21841zn.m220548Q(act(), "qq", this.f80997f, new x20() { // from class: l.xbq0
                @Override // p153l.x20
                public final void call() {
                    runnable.run();
                }
            }, new x20() { // from class: l.ybq0
                @Override // p153l.x20
                public final void call() {
                    y20Var.call(Boolean.TRUE);
                }
            }, new x20() { // from class: l.zbq0
                @Override // p153l.x20
                public final void call() {
                    runnable2.run();
                }
            }, new x20() { // from class: l.acq0
                @Override // p153l.x20
                public final void call() {
                    this.f69750a.m108838W4(runnable2, y20Var, runnable);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public static /* synthetic */ void m108846Y2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public /* synthetic */ void m108847Y3(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
        if (m108783K3(th)) {
            this.f81005n.mo102266b(th, thirdPartyData, runnable, SignInGrantType.get("google"));
        } else {
            l51.m152887G(runnable);
            bsj0.m106246D(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y4 */
    public /* synthetic */ void m108848Y4(String str, String str2, Runnable runnable, y20 y20Var, Runnable runnable2, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable2.run();
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40020 || i == 40091) {
            m108770H5(i == 40020, str, str2, runnable, y20Var);
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m108851Z3(Bundle bundle) {
        if (NullChecker.m82486a(act().getSupportActionBar())) {
            act().getSupportActionBar().mo102186m();
        }
        ((AbstractC19302p6) this.viewModel).mo144492r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m108852Z4(final Runnable runnable, final String str, final String str2, final Runnable runnable2, final Runnable runnable3, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable.run();
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40033) {
            ((AbstractC19302p6) this.viewModel).mo144486n(false);
            o1j0.m165651y("QQ暂不支持注册");
            return;
        }
        if (i != 40037) {
            runnable.run();
            return;
        }
        AccountModule.f16756c.m29344m2(AccountTempApi.SignUpType.qq);
        final y20 y20Var = new y20() { // from class: l.rbq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162037a.m108833V4((Boolean) obj);
            }
        };
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("qq");
        signInData.thirdPartyId = str;
        signInData.thirdPartyToken = str2;
        signInData.device = tl8.m191616M();
        AccountModule.f16756c.m29348o2(signInData, false, new Runnable() { // from class: l.sbq0
            @Override // java.lang.Runnable
            public final void run() {
                ccq0.m108933o0();
            }
        }).subscribe(psd0.m173600K(new y20() { // from class: l.tbq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172981a.m108843X4(runnable2, y20Var, runnable, (uxj0) obj);
            }
        }, new y20() { // from class: l.ubq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178342a.m108848Y4(str, str2, runnable3, y20Var, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m108856a4(User user) {
        if (C16074bp.m105751f()) {
            return;
        }
        ike.m140276h().m140288o(user);
        m108740B3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m108857a5(AccountTestGroup accountTestGroup) {
        if (accountTestGroup.facebookEntry) {
            ((AbstractC19302p6) this.viewModel).mo144479j();
            this.f80987B.call();
        } else {
            this.f81008q.call();
        }
        if (accountTestGroup.googleEntry && C16074bp.m105749d()) {
            i4g0.m138526x("e_signin_google_button", ((PutongAct) act()).pageId());
            ((AbstractC19302p6) this.viewModel).mo144482l();
        }
    }

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ void m108859b2(Runnable runnable, Throwable th) {
        runnable.run();
        CrashHelper.m82479c(new Exception("wechat signup no transition--> message:" + th.getMessage(), th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m108861b4(Throwable th) {
        if ((th instanceof ApiExcep.Client.NotFound) || (th instanceof ApiExcep.Client.Unauthorized) || ((th instanceof App.HandledGlobally) && (((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            ike.m140276h().m140286m();
        } else {
            ike.m140276h().m140282g();
            m108740B3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b5 */
    public /* synthetic */ void m108862b5(Throwable th) {
        this.f81008q.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m108866c4(Bundle bundle) {
        this.f80995d = ((AbstractC19302p6) this.viewModel).mo144469c(this.f80992a);
        m108748C5(this.f80999h);
        if (IntlCountryCodeController.m29112i()) {
            AccountTempApi.InactiveType inactiveType = this.f80993b;
            if (inactiveType == AccountTempApi.InactiveType.Pause) {
                C21841zn.m220551T(act(), act().string(R$string.f16940i0), act().string(R$string.f16934h0), act().string(R$string.f16809J2));
            } else if (inactiveType == AccountTempApi.InactiveType.DeleteImmediately) {
                C21841zn.m220551T(act(), act().string(R$string.f16928g0), this.f81000i ? String.format("%s\n\n%s", act().string(R$string.f16922f0), act().string(R$string.f16958l0)) : act().string(R$string.f16922f0), act().string(R$string.f16809J2));
            }
        }
        if (this.f80993b == AccountTempApi.InactiveType.DeleteImmediately && !TextUtils.isEmpty(this.f80994c) && RemoteConfig.m80481x().m80485F("setting_snail_diversion_config").contains(this.f80994c)) {
            nae0.m162083m(act(), Uri.parse("tantan://webview?url=".concat(zwk.m221905e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/love-snail/index.html?speed=true&_bid=1004028&hideNavigationBar=1&hideNotch=1" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/love-snail/index.html?speed=true&_bid=1004028&hideNavigationBar=1&hideNotch=1")));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c5 */
    public /* synthetic */ void m108867c5(AccountTestFactor accountTestFactor) {
        AccountModule.f16756c.m29357t2(accountTestFactor).subscribe(psd0.m173597H(new y20() { // from class: l.naq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141039a.m108857a5((AccountTestGroup) obj);
            }
        }, new y20() { // from class: l.oaq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145750a.m108862b5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m108871d4() {
        act().removeCallbacks(this.f80995d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public /* synthetic */ void m108872d5(SignInData signInData, Runnable runnable) {
        i4g0.m138520r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        m109001K5(signInData, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m108877e4() {
        if (!m109003M3()) {
            o1j0.m165651y("未安装QQ");
        } else if (m108774I3(act()).isSessionValid()) {
            m108774I3(act()).logout(act());
        } else {
            ((AbstractC19302p6) this.viewModel).mo144486n(true);
            m108774I3(act()).login(act(), "all", this.f81015x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e5 */
    public /* synthetic */ void m108878e5(View view) {
        i4g0.m138523u("e_switch_account_button", "p_signin_with_saved_info", jyb.m147494Y("switch_account", "close"));
        this.f80989D.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m108883f4() {
        ((AbstractC19302p6) this.viewModel).getAct().progress(R$string.f16946j0);
        ((AbstractC19302p6) this.viewModel).mo144486n(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f5 */
    public /* synthetic */ void m108884f5(x20 x20Var, View view) {
        i4g0.m138520r("e_signin_with_saved_info_button", "p_signin_with_saved_info");
        x20Var.call();
        this.f80989D.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public /* synthetic */ void m108889g4() {
        ((AbstractC19302p6) this.viewModel).mo144466a();
        ((AbstractC19302p6) this.viewModel).getAct().progressDismiss();
        ((AbstractC19302p6) this.viewModel).mo144486n(false);
        o1j0.m165651y(act().string(R$string.f16980o4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g5 */
    public /* synthetic */ void m108890g5(View view) {
        i4g0.m138523u("e_switch_account_button", "p_signin_with_saved_info", jyb.m147494Y("switch_account", "signin_another_account"));
        this.f80989D.dismiss();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m108891h0(x20 x20Var, uxj0 uxj0Var) {
        tcn.m190485b();
        x20Var.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ void m108895h4() {
        ((AbstractC19302p6) this.viewModel).getAct().progressDismiss();
        ((AbstractC19302p6) this.viewModel).mo144486n(false);
        o1j0.m165651y("登录失败，绑定手机号后再试");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h5 */
    public /* synthetic */ void m108896h5(Runnable runnable, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            ((AbstractC19302p6) this.viewModel).getAct().progressDismiss();
            o1j0.m165638l(((AbstractC19302p6) this.viewModel).getAct().getResources().getString(R$string.f16794G2), false, true);
            if (NullChecker.m82486a(runnable)) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m108898i1(WeChatToken weChatToken, final y20 y20Var, final Runnable runnable) {
        i4g0.m138520r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("wechat");
        signInData.thirdPartyId = weChatToken.thirdpartyId;
        signInData.thirdPartyToken = weChatToken.thirdpartyAccessToken;
        AccountModule.f16756c.m29348o2(signInData, true, new Runnable() { // from class: l.i8q0
            @Override // java.lang.Runnable
            public final void run() {
                ccq0.m108816S2();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.j8q0
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var.call(Boolean.FALSE);
            }
        }, new y20() { // from class: l.l8q0
            @Override // p153l.y20
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4 */
    public /* synthetic */ void m108901i4() {
        ((AbstractC19302p6) this.viewModel).getAct().progressDismiss();
        ((AbstractC19302p6) this.viewModel).mo144486n(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i5 */
    public /* synthetic */ void m108902i5(uxj0 uxj0Var) {
        m109010R5();
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169076j(this.f80997f);
        }
    }

    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ void m108906j3(Runnable runnable) {
        i4g0.m138520r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ Boolean m108907j4(Runnable runnable, Runnable runnable2, ThirdPartLoginApi.C4725a c4725a) {
        if (c4725a.f17041b != 0) {
            runnable2.run();
            return Boolean.FALSE;
        }
        this.f81010s = true;
        runnable.run();
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j5 */
    public /* synthetic */ void m108908j5(Runnable runnable, Throwable th) {
        ((AbstractC19302p6) this.viewModel).getAct().progressDismiss();
        o1j0.m165638l(((AbstractC19302p6) this.viewModel).getAct().getResources().getString(R$string.f16794G2), false, true);
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m108913k4(WeChatToken weChatToken, WeChatUserInfo weChatUserInfo) {
        SignUpData signUpData = new SignUpData();
        int i = weChatUserInfo.sex;
        if (i == 1) {
            signUpData.gender = Gender.get("male");
        } else if (i == 2) {
            signUpData.gender = Gender.get("female");
        }
        signUpData.name = weChatUserInfo.nickname;
        signUpData.signUpType = AccountTempApi.SignUpType.wechat;
        signUpData.thirdPartyId = weChatToken.thirdpartyId;
        signUpData.thirdPartyToken = weChatToken.thirdpartyAccessToken;
        signUpData.thirdPartyUnionid = weChatUserInfo.unionid;
        act().startActivity(SignUpDetailsNewAct.m29496b2(act(), signUpData));
        m109012U5();
        act().m68056e2();
        bsj0.m106261S(act());
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169076j(this.f80997f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k5 */
    public /* synthetic */ void m108914k5(Runnable runnable, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            ((AbstractC19302p6) this.viewModel).getAct().progressDismiss();
            o1j0.m165638l(((AbstractC19302p6) this.viewModel).getAct().getResources().getString(R$string.f16794G2), false, true);
            if (NullChecker.m82486a(runnable)) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m108918l3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m108919l4(Boolean bool) {
        AuthData authDataMo107143b = AccountModule.f16756c.m29311V0().mo107143b();
        String string = NullChecker.m82486a(authDataMo107143b) ? authDataMo107143b.signupStage.toString() : "";
        Intent intentM29394Z1 = (C16074bp.m105751f() && bool.booleanValue()) ? SignUpAiAct.m29394Z1(act()) : C16330cp.m111720f(((AbstractC19302p6) this.viewModel).getAct(), string);
        if ("verified".equals(string) && !ike.m140276h().m140284j(authDataMo107143b.finishedStages)) {
            v3q0.f182229J.put(Boolean.FALSE);
        }
        act().startActivity(intentM29394Z1);
        AccountModule.f16758e.m29179h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f80997f);
        m109012U5();
        act().m68056e2();
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169076j(this.f80997f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l5 */
    public /* synthetic */ void m108920l5(uxj0 uxj0Var) {
        AccountModule.f16756c.m29344m2(AccountTempApi.SignUpType.cosmos);
        m109010R5();
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169076j(this.f80997f);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ C22421c m108921m0(SignInData signInData, MobileRespInfo mobileRespInfo) {
        signInData.grantType = mobileRespInfo.grantType;
        signInData.thirdPartyToken = mobileRespInfo.token;
        signInData.thirdPartyAccessCode = mobileRespInfo.accessCode;
        signInData.thirdPartyId = mobileRespInfo.openId;
        return AccountModule.f16756c.m29348o2(signInData, false, new Runnable() { // from class: l.v6q0
            @Override // java.lang.Runnable
            public final void run() {
                ccq0.m108918l3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m108925m4(final Runnable runnable, final y20 y20Var, final Runnable runnable2) {
        C21841zn.m220547P(act(), "wechat", "verified", new x20() { // from class: l.e8q0
            @Override // p153l.x20
            public final void call() {
                runnable.run();
            }
        }, new x20() { // from class: l.f8q0
            @Override // p153l.x20
            public final void call() {
                y20Var.call(Boolean.TRUE);
            }
        }, new x20() { // from class: l.g8q0
            @Override // p153l.x20
            public final void call() {
                runnable2.run();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m5 */
    public /* synthetic */ void m108926m5(SignInData signInData, Runnable runnable, Throwable th) {
        int i;
        ((AbstractC19302p6) this.viewModel).getAct().progressDismiss();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((i = ((TantanException.Client.AccountService) th).code) == 40020 || i == 40091)) {
            m108765G5(i == 40020, signInData, runnable);
            return;
        }
        if (!z || ((TantanException.Client.AccountService) th).code != 40016) {
            o1j0.m165638l(((AbstractC19302p6) this.viewModel).getAct().getResources().getString(R$string.f16794G2), false, true);
            if (NullChecker.m82486a(runnable)) {
                runnable.run();
                return;
            }
            return;
        }
        SignUpData signUpData = new SignUpData();
        if (TEnum.equals(signInData.grantType, SignInGrantType.cosmos)) {
            signUpData.signUpType = AccountTempApi.SignUpType.cosmos;
        }
        AccountModule.f16756c.m29336i2(signUpData);
        AccountModule.f16756c.m29324c1().phoneNumber = this.f80997f;
        ((AbstractC19302p6) this.viewModel).getAct().startActivity(SignUpDetailsNewAct.m29496b2(((AbstractC19302p6) this.viewModel).getAct(), signUpData));
        ((AbstractC19302p6) this.viewModel).getAct().progressDismiss();
        ((AbstractC19302p6) this.viewModel).getAct().m68056e2();
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169076j(this.f80997f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m108931n4(final Runnable runnable, final y20 y20Var, final Runnable runnable2, uxj0 uxj0Var) {
        act().progressDismiss();
        if (C16074bp.m105751f()) {
            if (C4726a.m29232i1()) {
                C4726a.m29219Z1();
                if (TextUtils.isEmpty(this.f80997f) || !m108995D3()) {
                    C21841zn.m220547P(act(), "wechat", "", new x20() { // from class: l.l7q0
                        @Override // p153l.x20
                        public final void call() {
                            runnable2.run();
                        }
                    }, new x20() { // from class: l.m7q0
                        @Override // p153l.x20
                        public final void call() {
                            y20Var.call(Boolean.TRUE);
                        }
                    }, new x20() { // from class: l.n7q0
                        @Override // p153l.x20
                        public final void call() {
                            runnable.run();
                        }
                    });
                    return;
                } else {
                    C21841zn.m220548Q(act(), "wechat", this.f80997f, new x20() { // from class: l.h7q0
                        @Override // p153l.x20
                        public final void call() {
                            runnable.run();
                        }
                    }, new x20() { // from class: l.i7q0
                        @Override // p153l.x20
                        public final void call() {
                            y20Var.call(Boolean.TRUE);
                        }
                    }, new x20() { // from class: l.j7q0
                        @Override // p153l.x20
                        public final void call() {
                            runnable2.run();
                        }
                    }, new x20() { // from class: l.k7q0
                        @Override // p153l.x20
                        public final void call() {
                            this.f124284a.m108925m4(runnable2, y20Var, runnable);
                        }
                    });
                    return;
                }
            }
            y20Var.call(Boolean.FALSE);
        }
        y20Var.call(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n5 */
    public /* synthetic */ void m108932n5(View view) {
        i4g0.m138520r("e_signin_fb_button", ((PutongAct) act()).pageId());
        if (((AbstractC19302p6) this.viewModel).mo144472e() || !IntlCountryCodeController.m29119p()) {
            this.f80988C.onClick(view);
        } else {
            ((AbstractC19302p6) this.viewModel).mo144478i(this.f80988C, view);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m108933o0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ void m108937o4(WeChatToken weChatToken, Runnable runnable, y20 y20Var, Runnable runnable2, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable2.run();
            CrashHelper.m82479c(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40020 || i == 40091) {
            m108781J5(i == 40020, weChatToken, runnable, y20Var);
        } else {
            runnable2.run();
            CrashHelper.m82479c(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o5 */
    public /* synthetic */ void m108938o5(View view) {
        i4g0.m138520r("e_signin_google_button", ((PutongAct) act()).pageId());
        this.f80991F.onClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m108943p4(final Runnable runnable, final WeChatToken weChatToken, final Runnable runnable2, final Runnable runnable3, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable.run();
            CrashHelper.m82479c(th);
            return;
        }
        if (((TantanException.Client.AccountService) th).code != 40037) {
            runnable.run();
            return;
        }
        AccountModule.f16756c.m29344m2(AccountTempApi.SignUpType.wechat);
        if (TextUtils.isEmpty(weChatToken.thirdpartyId) || TextUtils.isEmpty(weChatToken.thirdpartyAccessToken)) {
            runnable.run();
            CrashHelper.m82479c(th);
            return;
        }
        final y20 y20Var = new y20() { // from class: l.o6q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145204a.m108919l4((Boolean) obj);
            }
        };
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("wechat");
        signInData.thirdPartyId = weChatToken.thirdpartyId;
        signInData.thirdPartyToken = weChatToken.thirdpartyAccessToken;
        signInData.device = tl8.m191616M();
        AccountModule.f16756c.m29348o2(signInData, false, new Runnable() { // from class: l.p6q0
            @Override // java.lang.Runnable
            public final void run() {
                ccq0.m108796O1();
            }
        }).subscribe(psd0.m173600K(new y20() { // from class: l.q6q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155831a.m108931n4(runnable2, y20Var, runnable, (uxj0) obj);
            }
        }, new y20() { // from class: l.r6q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161489a.m108937o4(weChatToken, runnable3, y20Var, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public /* synthetic */ void m108944p5(String str, uxj0 uxj0Var) {
        uqb0.f180380L.f17865d.m123194i();
        if ("oppo_quick_login".equals(str)) {
            AccountModule.f16756c.m29322b1("user.oppo.signin").subscribe(psd0.m173596G(new y20() { // from class: l.daq0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ccq0.m108801P2((Envelope) obj);
                }
            }));
        } else {
            str = "saved_sign-in_info";
        }
        i4g0.m138495D("e_signin_success", "", jyb.m147494Y("signin_type", str));
        uqb0.m197269e1(VerifyReason.signin, new Object[0]);
        act().startActivity(AccountModule.m29131H().newMainActClearStack(m99640Y(), false, true));
        m109012U5();
        act().m68056e2();
        bsj0.m106261S(act());
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ void m108947q2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public /* synthetic */ void m108949q4(final Runnable runnable, final Runnable runnable2, final Runnable runnable3, final Runnable runnable4) {
        this.f81014w.registerApp(WXEntryActivity.APPID);
        SendAuth.Req req = new SendAuth.Req();
        req.scope = "snsapi_userinfo";
        req.state = "";
        this.f81014w.sendReq(req);
        runnable.run();
        m109012U5();
        final WeChatToken weChatToken = new WeChatToken();
        this.f81012u = AccountModule.f16758e.m29180i().filter(new qcj() { // from class: l.waq0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f188155a.m108907j4(runnable, runnable2, (ThirdPartLoginApi.C4725a) obj);
            }
        }).flatMap(new qcj() { // from class: l.xaq0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return AccountModule.f16758e.m29178g(((ThirdPartLoginApi.C4725a) obj).f17042c);
            }
        }).filter(new qcj() { // from class: l.yaq0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ccq0.m108839X0(weChatToken, runnable2, (WeChatToken) obj);
            }
        }).flatMap(new qcj() { // from class: l.zaq0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                WeChatToken weChatToken2 = (WeChatToken) obj;
                return AccountModule.f16758e.m29184m(weChatToken2.thirdpartyId, weChatToken2.thirdpartyAccessToken, false);
            }
        }).filter(new qcj() { // from class: l.abq0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ccq0.m108980x0(runnable2, (ThirdPartVetify) obj);
            }
        }).flatMap(new qcj() { // from class: l.bbq0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                WeChatToken weChatToken2 = weChatToken;
                return AccountModule.f16758e.m29183l(weChatToken2.thirdpartyAccessToken, weChatToken2.thirdpartyId);
            }
        }).filter(new qcj() { // from class: l.cbq0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ccq0.m108759F0(runnable2, (WeChatUserInfo) obj);
            }
        }).first().subscribe(psd0.m173600K(new y20() { // from class: l.dbq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87694a.m108913k4(weChatToken, (WeChatUserInfo) obj);
            }
        }, new y20() { // from class: l.ebq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92949a.m108943p4(runnable2, weChatToken, runnable3, runnable4, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q5 */
    public /* synthetic */ void m108950q5(Throwable th) {
        o560.m166092b().m166093a();
        act().progressDismiss();
        Throwable throwable = th instanceof App.HandledGlobally ? ((App.HandledGlobally) th).getThrowable() : th;
        if (!dmk0.m116964c(throwable, ApiExcep.Client.Unauthorized.class) && !dmk0.m116964c(throwable, ApiExcep.Client.NotFound.class)) {
            bsj0.m106246D(th);
        } else {
            o1j0.m165634h(R$string.f16836P);
            m108996E5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public /* synthetic */ void m108955r4(SignUpData signUpData, String str) {
        signUpData.profilePath = str;
        AccountModule.f16756c.m29306R0().put(str);
        act().startActivity(SignUpDetailsNewAct.m29496b2(act(), signUpData));
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m108956s0(MatchCounterEnvelope matchCounterEnvelope) {
        long j = matchCounterEnvelope.totalCounters.matches;
        if (j > 0) {
            AccountModule.f16756c.f17048j.put(Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m108960s4(final SignUpData signUpData) {
        uqb0.f180374G.m98793i(signUpData.profilePath, new y20() { // from class: l.z9q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203506a.m108955r4(signUpData, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t2 */
    public static /* synthetic */ C22421c m108963t2(SignInData signInData, MobileRespInfo mobileRespInfo) {
        signInData.grantType = mobileRespInfo.grantType;
        signInData.thirdPartyToken = mobileRespInfo.token;
        signInData.thirdPartyAccessCode = mobileRespInfo.accessCode;
        signInData.thirdPartyId = mobileRespInfo.openId;
        return AccountModule.f16756c.m29348o2(signInData, true, new Runnable() { // from class: l.h8q0
            @Override // java.lang.Runnable
            public final void run() {
                ccq0.m108973v2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public /* synthetic */ void m108965t4() {
        ((AbstractC19302p6) this.viewModel).mo144480k();
        i4g0.m138526x("e_signin_fb_button", ((PutongAct) act()).pageId());
        this.f81006o = b94.C15949b.m103051a();
        z0w.m218186m().m218216y(this.f81006o, new C16231e());
        ((AbstractC19302p6) this.viewModel).mo144493s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m108970u4(View view) {
        ((AbstractC19302p6) this.viewModel).mo144491q(true);
        z0w.m218186m().m218213u();
        z0w.m218186m().m218212t(act(), FacebookApi.f17871d);
    }

    /* JADX INFO: renamed from: u5 */
    private void m108971u5(final SignUpData signUpData, final ThirdPartyData thirdPartyData) {
        final Runnable runnable = new Runnable() { // from class: l.a9q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f69067a.m108775I4();
            }
        };
        signUpData.thirdPartyId = thirdPartyData.thirdPartyId;
        signUpData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        signUpData.signUpType = AccountTempApi.SignUpType.google;
        duringCreated(ike.m140279r(signUpData, null, true)).subscribe(psd0.m173597H(new y20() { // from class: l.b9q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75604a.m108780J4(signUpData, (uxj0) obj);
            }
        }, new y20() { // from class: l.d9q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85809a.m108784K4(thirdPartyData, runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v2 */
    public static /* synthetic */ void m108973v2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public /* synthetic */ void m108975v4() {
        ((AbstractC19302p6) this.viewModel).mo144495v();
        SignInData signInData = new SignInData();
        signInData.device = tl8.m191616M();
        m109002L5(signInData, new Runnable() { // from class: l.caq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f80612a.m108819S5();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public /* synthetic */ void m108978w4() {
        m108998F5(new x20() { // from class: l.o9q0
            @Override // p153l.x20
            public final void call() {
                this.f145624a.m108975v4();
            }
        }, new p9q0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w5 */
    public void m108979w5(JSONObject jSONObject) {
        Exception exc;
        String string;
        String string2;
        ((AbstractC19302p6) this.viewModel).mo144486n(true);
        final Runnable runnable = new Runnable() { // from class: l.gaq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f103020a.m108788L4();
            }
        };
        final Runnable runnable2 = new Runnable() { // from class: l.haq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f108512a.m108790M4();
            }
        };
        final Runnable runnable3 = new Runnable() { // from class: l.iaq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f113613a.m108794N4();
            }
        };
        String string3 = "";
        try {
            string = jSONObject.getString("openid");
            try {
                string2 = jSONObject.getString("access_token");
                try {
                    string3 = jSONObject.getString("expires_in");
                } catch (Exception e) {
                    exc = e;
                    CrashHelper.m82479c(exc);
                }
            } catch (Exception e2) {
                exc = e2;
                string2 = "";
            }
        } catch (Exception e3) {
            exc = e3;
            string = "";
            string2 = string;
        }
        final String str = string2;
        final String str2 = string;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(string3) || TextUtils.isEmpty(str2)) {
            runnable.run();
            return;
        }
        m108774I3(act()).setAccessToken(str, string3);
        m108774I3(act()).setOpenId(str2);
        AccountModule.f16758e.m29184m(str2, str, true).first().flatMap(new qcj() { // from class: l.kaq0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f124708a.m108798O4((ThirdPartVetify) obj);
            }
        }).first().subscribe(psd0.m173600K(new y20() { // from class: l.laq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130725a.m108828U4(str2, str, runnable2, runnable, (WeChatUserInfo) obj);
            }
        }, new y20() { // from class: l.maq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135582a.m108852Z4(runnable, str2, str, runnable2, runnable3, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ Boolean m108980x0(Runnable runnable, ThirdPartVetify thirdPartVetify) {
        if (NullChecker.m82486a(thirdPartVetify) && thirdPartVetify.code == 200) {
            return Boolean.TRUE;
        }
        runnable.run();
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m108984x4(final SignInGrantType signInGrantType, final ThirdPartyData thirdPartyData, final x20 x20Var, final Runnable runnable, Throwable th, Throwable th2) {
        if (!(th2 instanceof TantanException.Client.AccountService)) {
            runnable.run();
            bsj0.m106246D(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th2).code;
        if (i == 40020 || i == 40091) {
            boolean z = i == 40020;
            act().dialog().m21502E0(z ? R$string.f16869V2 : R$string.f16859T2).m21499D(z ? R$string.f16874W2 : R$string.f16864U2).m21555t0(R$string.f17031z, new Runnable() { // from class: l.aaq0
                @Override // java.lang.Runnable
                public final void run() {
                    ccq0.m108745C2(signInGrantType, thirdPartyData, x20Var, runnable);
                }
            }).m21541l0(R$string.f16897b, runnable).m21567z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.baq0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    runnable.run();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m108988y4(View view) {
        ((AbstractC19302p6) this.viewModel).mo144468b(true);
        h7k h7kVarM12495a = C2104a.m12495a(m99640Y(), new GoogleSignInOptions.C2103a(GoogleSignInOptions.DEFAULT_SIGN_IN).m12488b().m12490d("218526224262-usliqg20cepnb3ql98amgeum18v8uatv.apps.googleusercontent.com").m12487a());
        h7kVarM12495a.m133801d();
        act().startActivityForResult(h7kVarM12495a.m133799b(), ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z3, reason: merged with bridge method [inline-methods] */
    public void m108769H4() {
        duringCreated(new pcj() { // from class: l.w9q0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return ChinaMobileController.m30591b().m30599i(5000);
            }
        }, false).subscribe(psd0.m173596G(new y20() { // from class: l.x9q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192956a.m108807Q3((MobileRespInfo) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public /* synthetic */ void m108993z4(final Throwable th, final ThirdPartyData thirdPartyData, final Runnable runnable, final SignInGrantType signInGrantType) {
        SignInData signInData = new SignInData();
        signInData.grantType = signInGrantType;
        signInData.thirdPartyId = thirdPartyData.thirdPartyId;
        signInData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        final x20 x20Var = new x20() { // from class: l.t9q0
            @Override // p153l.x20
            public final void call() {
                this.f172657a.m108764G4();
            }
        };
        AccountModule.f16756c.m29348o2(signInData, false, null).subscribe(psd0.m173597H(new y20() { // from class: l.u9q0
            @Override // p153l.y20
            public final void call(Object obj) {
                ccq0.m108891h0(x20Var, (uxj0) obj);
            }
        }, new y20() { // from class: l.v9q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183016a.m108984x4(signInGrantType, thirdPartyData, x20Var, runnable, th, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A5 */
    public void m108994A5() {
        this.f80990E.call();
    }

    /* JADX INFO: renamed from: D3 */
    public boolean m108995D3() {
        OperatorType operatorTypeM136471c;
        if (this.f80998g == null || (operatorTypeM136471c = AccountModule.f16757d.f154351a.m136471c()) == null) {
            return true;
        }
        int i = C16233g.f81029a[operatorTypeM136471c.ordinal()];
        if (i == 1 || i == 2) {
            return this.f80998g.chinaMobile;
        }
        if (i != 3) {
            return true;
        }
        return this.f80998g.chinaUnicom;
    }

    /* JADX INFO: renamed from: E5 */
    public void m108996E5() {
        uqb0.f180380L.f17865d.m123194i();
        m108742B5();
    }

    /* JADX INFO: renamed from: F3 */
    public C22421c<WeChatUserInfo> m108997F3() {
        return C22421c.fromAsync(new y20() { // from class: l.pbq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151410a.m108822T3((AsyncEmitter) obj);
            }
        }, AsyncEmitter.BackpressureMode.LATEST);
    }

    /* JADX INFO: renamed from: F5 */
    public void m108998F5(x20 x20Var, x20 x20Var2) {
        if (x20Var2 != null) {
            x20Var2.call();
        }
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: H3 */
    public View.OnClickListener m108999H3(final boolean z) {
        return new View.OnClickListener() { // from class: l.l9q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130624a.m108832V3(z, view);
            }
        };
    }

    /* JADX INFO: renamed from: J3 */
    public void m109000J3(String str, String str2) {
        final Runnable runnable = new Runnable() { // from class: l.r8q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f161749a.m108837W3();
            }
        };
        final ThirdPartyData thirdPartyDataNew_ = ThirdPartyData.new_();
        thirdPartyDataNew_.thirdPartyId = str;
        thirdPartyDataNew_.thirdPartyToken = str2;
        duringCreated(AccountModule.f16756c.m29275D2(thirdPartyDataNew_)).subscribe(psd0.m173600K(new y20() { // from class: l.c9q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80515a.m108842X3(thirdPartyDataNew_, (uxj0) obj);
            }
        }, new y20() { // from class: l.n9q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140933a.m108847Y3(thirdPartyDataNew_, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: K5 */
    public void m109001K5(final SignInData signInData, final Runnable runnable) {
        ((AbstractC19302p6) this.viewModel).getAct().progress(R$string.f16946j0, true);
        ((AbstractC19302p6) this.viewModel).getAct().duringCreated((C22421c) ChinaMobileController.m30591b().m30598h(5000).doOnNext(new y20() { // from class: l.s7q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166706a.m108896h5(runnable, (MobileRespInfo) obj);
            }
        }).filter(new qcj() { // from class: l.t7q0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new qcj() { // from class: l.u7q0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ccq0.m108963t2(signInData, (MobileRespInfo) obj);
            }
        }), false).subscribe(psd0.m173597H(new y20() { // from class: l.v7q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182796a.m108902i5((uxj0) obj);
            }
        }, new y20() { // from class: l.w7q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187777a.m108908j5(runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L5 */
    public void m109002L5(final SignInData signInData, final Runnable runnable) {
        ((AbstractC19302p6) this.viewModel).getAct().progress(R$string.f16946j0, true);
        ((AbstractC19302p6) this.viewModel).getAct().duringCreated((C22421c) ChinaMobileController.m30591b().m30598h(5000).doOnNext(new y20() { // from class: l.hbq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108611a.m108914k5(runnable, (MobileRespInfo) obj);
            }
        }).filter(new qcj() { // from class: l.ibq0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new qcj() { // from class: l.jbq0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ccq0.m108921m0(signInData, (MobileRespInfo) obj);
            }
        }), false).subscribe(psd0.m173600K(new y20() { // from class: l.kbq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124973a.m108920l5((uxj0) obj);
            }
        }, new y20() { // from class: l.lbq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131221a.m108926m5(signInData, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: M3 */
    public boolean m109003M3() {
        try {
            return act().getPackageManager().getPackageInfo("com.tencent.mobileqq", 0) != null;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: M5 */
    public View.OnClickListener m109004M5() {
        return new View.OnClickListener() { // from class: l.m9q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135432a.m108932n5(view);
            }
        };
    }

    /* JADX INFO: renamed from: N3 */
    public boolean m109005N3() {
        m108736A3();
        return this.f81014w.isWXAppInstalled();
    }

    /* JADX INFO: renamed from: N5 */
    public View.OnClickListener m109006N5() {
        return new View.OnClickListener() { // from class: l.gbq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103485a.m108938o5(view);
            }
        };
    }

    /* JADX INFO: renamed from: O5 */
    public void m109007O5() {
        m109008P5(null, null);
    }

    /* JADX INFO: renamed from: P5 */
    public void m109008P5(RememberUserInfo rememberUserInfo, final String str) {
        act().progress(R$string.f16946j0);
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("unknown_");
        AccountModule.f16756c.m29346n2(signInData, rememberUserInfo, false, new Runnable() { // from class: l.q9q0
            @Override // java.lang.Runnable
            public final void run() {
                ccq0.m108846Y2();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.r9q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161860a.m108944p5(str, (uxj0) obj);
            }
        }, new y20() { // from class: l.s9q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166965a.m108950q5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q5 */
    public String m109009Q5(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (char c : str.toCharArray()) {
            if (c < 19968 || c > 40869) {
                i++;
            } else {
                if (i == 11) {
                    sb.append("...");
                    break;
                }
                i += 2;
            }
            sb.append(c);
            if (i >= 12) {
                sb.append("...");
                break;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: R5 */
    public void m109010R5() {
        SignupStage signupStage = AccountModule.f16756c.m29311V0().mo107143b().signupStage;
        Intent intentM111720f = !TEnum.equals(signupStage, "unknown_") ? C16330cp.m111720f(act(), signupStage.toString()) : AccountModule.m29131H().toNewMainAct(act(), false, true);
        ((AbstractC19302p6) this.viewModel).getAct().progressDismiss();
        ((AbstractC19302p6) this.viewModel).getAct().startActivity(intentM111720f);
        ((AbstractC19302p6) this.viewModel).getAct().m68056e2();
    }

    /* JADX INFO: renamed from: T5 */
    public void m109011T5() {
        yp50.m217003f();
        if (App.f16092i.get().intValue() != 1 || f80985G) {
            return;
        }
        f80985G = true;
        if (!hxk.m137623g() || !hxk.m137622c().m137629h()) {
            if (TextUtils.isEmpty(ls4.f133389a) || !ls4.f133389a.toLowerCase().startsWith("douyin")) {
                i4g0.m138495D("e_app_1st_open", "", new pf60("is_first_open", Boolean.valueOf(this.f81001j)), new pf60("user_agent", gsp0.getDefaultUserAgent(App.f16088e)), new pf60("device_model_raw", Build.MODEL), new pf60(Device.IMEI, qzd.m178772e()), new pf60("imei2", qzd.m178773f()), new pf60(Device.OAID, hb00.m134333b()), new pf60(Device.MEID, qzd.m178774g()));
                return;
            } else {
                i4g0.m138495D("e_app_1st_open", "", new pf60("is_first_open", Boolean.valueOf(this.f81001j)), new pf60("user_agent", gsp0.getDefaultUserAgent(App.f16088e)), new pf60("device_model_raw", Build.MODEL), jyb.m147494Y("toutiao_channel", HumeSDK.getChannel(App.f16088e)), new pf60(Device.IMEI, qzd.m178772e()), new pf60("imei2", qzd.m178773f()), new pf60(Device.OAID, hb00.m134333b()), new pf60(Device.MEID, qzd.m178774g()));
                return;
            }
        }
        i4g0.m138495D("e_app_1st_open", "", new pf60("is_first_open", Boolean.valueOf(this.f81001j)), new pf60("package_name", act().getPackageName()), new pf60("referrer", hxk.m137622c().m137626d()), new pf60("click_time", hxk.m137622c().m137624a()), new pf60("install_time", hxk.m137622c().m137625b()), new pf60("track", hxk.m137622c().m137627e()), new pf60("user_agent", gsp0.getDefaultUserAgent(App.f16088e)), new pf60("device_model_raw", Build.MODEL), new pf60(Device.IMEI, qzd.m178772e()), new pf60("imei2", qzd.m178773f()), new pf60(Device.OAID, hb00.m134333b()), new pf60(Device.MEID, qzd.m178774g()));
        boolean z = kzv.f129469a;
        hxk.m137622c().m137626d();
        hxk.m137622c().m137624a();
        hxk.m137622c().m137625b();
        hxk.m137622c().m137627e();
    }

    /* JADX INFO: renamed from: U5 */
    public void m109012U5() {
        if (!NullChecker.m82486a(this.f81012u) || this.f81012u.isUnsubscribed()) {
            return;
        }
        this.f81012u.unsubscribe();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.y9q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198117a.m108851Z3((Bundle) obj);
            }
        });
        String str = ike.m140276h().f115355a.get();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(AccountModule.m29130F().userId()) && !"finished".equals(str) && !"unknown_".equals(str)) {
            duringCreated(AccountModule.f16756c.m29317Y0()).subscribe(psd0.m173597H(new y20() { // from class: l.jaq0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f119006a.m108856a4((User) obj);
                }
            }, new y20() { // from class: l.uaq0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f178224a.m108861b4((Throwable) obj);
                }
            }));
        }
        uqb0.f180370E.m80051t();
        creates(new y20() { // from class: l.fbq0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98139a.m108866c4((Bundle) obj);
            }
        }, new x20() { // from class: l.qbq0
            @Override // p153l.x20
            public final void call() {
                this.f156496a.m108871d4();
            }
        });
        AccountModule.f16759f.m144648k();
    }

    /* JADX INFO: renamed from: r5 */
    public void m109013r5() {
        m108998F5(new x20() { // from class: l.mbq0
            @Override // p153l.x20
            public final void call() {
                this.f135744a.m108877e4();
            }
        }, new p9q0(this));
    }

    /* JADX INFO: renamed from: s5 */
    public void m109014s5() {
        final Runnable runnable = new Runnable() { // from class: l.qaq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f156407a.m108883f4();
            }
        };
        final Runnable runnable2 = new Runnable() { // from class: l.raq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f161941a.m108889g4();
            }
        };
        final Runnable runnable3 = new Runnable() { // from class: l.saq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f167066a.m108895h4();
            }
        };
        final Runnable runnable4 = new Runnable() { // from class: l.taq0
            @Override // java.lang.Runnable
            public final void run() {
                this.f172758a.m108901i4();
            }
        };
        this.f81010s = false;
        m108736A3();
        if (m109005N3()) {
            m108998F5(new x20() { // from class: l.vaq0
                @Override // p153l.x20
                public final void call() {
                    this.f183147a.m108949q4(runnable, runnable2, runnable3, runnable4);
                }
            }, new p9q0(this));
        } else {
            o1j0.m165651y(App.f16088e.getString(R$string.f16950j4));
        }
    }

    /* JADX INFO: renamed from: t5 */
    public void m109015t5(int i, int i2, Intent intent) {
        if (i == 9001) {
            m108746C3(intent);
        }
        if (NullChecker.m82486a(this.f81006o)) {
            this.f81006o.mo8715a(i, i2, intent);
        }
        if (i == 786 && i2 == 0) {
            this.f81009r.call();
        }
        if (i == 11101) {
            Tencent.onActivityResultData(i, i2, intent, this.f81015x);
        }
    }

    /* JADX INFO: renamed from: v5 */
    public void m109016v5(List<Media> list) {
        if (list.size() > 0 && (list.get(0) instanceof Picture) && NullChecker.m82488c(this.f80996e, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            sim simVar = new sim(oki.m168038z(list.get(0).url), TXEAudioDef.TXE_OPUS_SAMPLE_NUM);
            try {
                this.f80996e.profilePath = simVar.m186025d();
                m108757E3(this.f80996e);
            } catch (IOException e) {
                CrashHelper.m82479c(e);
                this.f81009r.call();
            }
        }
    }

    /* JADX INFO: renamed from: x5 */
    public void m109017x5(WeChatUserInfo weChatUserInfo, boolean z) {
        AccountModule.f16758e.m29179h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f80997f);
        if (z) {
            v3q0.f182229J.put(Boolean.FALSE);
        }
        AccountModule.f16756c.m29289I2().put(weChatUserInfo.nickname);
        act().startActivity(C16330cp.m111719e(((AbstractC19302p6) this.viewModel).getAct()));
    }

    /* JADX INFO: renamed from: y5 */
    public void m109018y5() {
        RememberUserInfo rememberUserInfoMo107143b = uqb0.f180380L.f17865d.mo107143b();
        if (NullChecker.m82486a(rememberUserInfoMo107143b)) {
            m108776I5(rememberUserInfoMo107143b, act(), new h6q0(this));
        }
    }

    /* JADX INFO: renamed from: z5 */
    public void m109019z5() {
        if (this.f81011t) {
            if (!this.f81010s) {
                ((AbstractC19302p6) this.viewModel).mo144486n(false);
            }
            this.f81010s = false;
        }
        duringCreated(AccountModule.f16756c.m29315X0()).subscribe(psd0.m173597H(new y20() { // from class: l.bcq0
            @Override // p153l.y20
            public final void call(Object obj) {
                ccq0.m108956s0((MatchCounterEnvelope) obj);
            }
        }, new y20() { // from class: l.s6q0
            @Override // p153l.y20
            public final void call(Object obj) {
                ccq0.m108793N2((Throwable) obj);
            }
        }));
        ((AbstractC19302p6) this.viewModel).mo144474f();
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.ccq0$a */
    public class C16227a implements IUiListener {
        public C16227a() {
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            ccq0.this.m108753D5();
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            ccq0.this.f81010s = true;
            if (obj == null || !(obj instanceof JSONObject)) {
                ccq0.this.m108753D5();
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            int length = jSONObject.length();
            ccq0 ccq0Var = ccq0.this;
            if (length == 0) {
                ccq0Var.m108753D5();
            } else {
                ccq0Var.m108979w5(jSONObject);
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            ccq0.this.m108753D5();
        }

        @Override // com.tencent.tauth.IUiListener
        public void onWarning(int i) {
        }
    }

    /* JADX INFO: renamed from: l.ccq0$b */
    public class C16228b implements IUiListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AsyncEmitter f81019a;

        public C16228b(AsyncEmitter asyncEmitter) {
            this.f81019a = asyncEmitter;
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            this.f81019a.onError(new IllegalStateException("cancel get qq user info"));
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            if (obj == null) {
                this.f81019a.onError(new IllegalStateException("qq user info null"));
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.length() == 0) {
                this.f81019a.onError(new IllegalStateException("qq user info null"));
                return;
            }
            WeChatUserInfo weChatUserInfoNew_ = WeChatUserInfo.new_();
            try {
                weChatUserInfoNew_.nickname = jSONObject.getString("nickname");
                this.f81019a.onNext(weChatUserInfoNew_);
                this.f81019a.onCompleted();
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                this.f81019a.onError(new IllegalStateException("qq user info parse error"));
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            this.f81019a.onError(new IllegalStateException("error get qq user info" + uiError.errorMessage));
        }

        @Override // com.tencent.tauth.IUiListener
        public void onWarning(int i) {
        }
    }
}
