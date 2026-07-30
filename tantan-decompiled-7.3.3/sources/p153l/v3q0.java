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
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.EmailLoginOptAct;
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
import java.util.HashMap;
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
public class v3q0 extends ar2<AbstractC19037o6> {

    /* JADX INFO: renamed from: I */
    public static boolean f182228I = false;

    /* JADX INFO: renamed from: J */
    public static jxd0 f182229J = new jxd0("has_wechat_login_detail_complete", Boolean.TRUE);

    /* JADX INFO: renamed from: K */
    public static wyd0 f182230K = new wyd0("user_invite_code", "");

    /* JADX INFO: renamed from: L */
    public static jxd0 f182231L = new jxd0("has_click_visitor", Boolean.FALSE);

    /* JADX INFO: renamed from: A */
    public x20 f182232A;

    /* JADX INFO: renamed from: B */
    public y20<SignUpData> f182233B;

    /* JADX INFO: renamed from: C */
    public x20 f182234C;

    /* JADX INFO: renamed from: D */
    public View.OnClickListener f182235D;

    /* JADX INFO: renamed from: E */
    public jl80 f182236E;

    /* JADX INFO: renamed from: F */
    public x20 f182237F;

    /* JADX INFO: renamed from: G */
    public View.OnClickListener f182238G;

    /* JADX INFO: renamed from: H */
    public View.OnClickListener f182239H;

    /* JADX INFO: renamed from: a */
    public boolean f182240a;

    /* JADX INFO: renamed from: b */
    public AccountTempApi.InactiveType f182241b;

    /* JADX INFO: renamed from: c */
    public String f182242c;

    /* JADX INFO: renamed from: d */
    public Runnable f182243d;

    /* JADX INFO: renamed from: e */
    public SignUpData f182244e;

    /* JADX INFO: renamed from: f */
    public String f182245f;

    /* JADX INFO: renamed from: g */
    public OneClickStatus f182246g;

    /* JADX INFO: renamed from: h */
    public boolean f182247h;

    /* JADX INFO: renamed from: i */
    public boolean f182248i;

    /* JADX INFO: renamed from: j */
    public boolean f182249j;

    /* JADX INFO: renamed from: k */
    public boolean f182250k;

    /* JADX INFO: renamed from: l */
    public C22507a<String> f182251l;

    /* JADX INFO: renamed from: m */
    public View.OnClickListener f182252m;

    /* JADX INFO: renamed from: n */
    public View.OnClickListener f182253n;

    /* JADX INFO: renamed from: o */
    public b30<Throwable, ThirdPartyData, Runnable, SignInGrantType> f182254o;

    /* JADX INFO: renamed from: p */
    public b94 f182255p;

    /* JADX INFO: renamed from: q */
    public AccessToken f182256q;

    /* JADX INFO: renamed from: r */
    public x20 f182257r;

    /* JADX INFO: renamed from: s */
    public x20 f182258s;

    /* JADX INFO: renamed from: t */
    public boolean f182259t;

    /* JADX INFO: renamed from: u */
    public boolean f182260u;

    /* JADX INFO: renamed from: v */
    public kcg0 f182261v;

    /* JADX INFO: renamed from: w */
    public x20 f182262w;

    /* JADX INFO: renamed from: x */
    public IWXAPI f182263x;

    /* JADX INFO: renamed from: y */
    public IUiListener f182264y;

    /* JADX INFO: renamed from: z */
    public int f182265z;

    /* JADX INFO: renamed from: l.v3q0$c */
    public class DialogInterfaceOnDismissListenerC20740c implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f182269a;

        public DialogInterfaceOnDismissListenerC20740c(l4g0 l4g0Var) {
            this.f182269a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f182269a);
        }
    }

    /* JADX INFO: renamed from: l.v3q0$d */
    public class DialogInterfaceOnDismissListenerC20741d implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f182271a;

        public DialogInterfaceOnDismissListenerC20741d(l4g0 l4g0Var) {
            this.f182271a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f182271a);
        }
    }

    /* JADX INFO: renamed from: l.v3q0$e */
    public class C20742e implements tvf<a1w> {

        /* JADX INFO: renamed from: a */
        public a30<ThirdPartyData, ThirdPartyValidation, SignUpData> f182273a = new a30() { // from class: l.f4q0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                this.f97128a.m199609r((ThirdPartyData) obj, (ThirdPartyValidation) obj2, (SignUpData) obj3);
            }
        };

        public C20742e() {
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ SignUpData m199596j(Throwable th) {
            SignUpData signUpData = new SignUpData();
            signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(App.f16088e);
            signUpData.signUpType = AccountTempApi.SignUpType.facebook;
            return signUpData;
        }

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ void m199603A() {
            ((AbstractC19037o6) v3q0.this.viewModel).mo124216p(false);
        }

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ void m199604B(ThirdPartyData thirdPartyData, SignUpData signUpData) {
            this.f182273a.mo37058a(thirdPartyData, null, signUpData);
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m199605C(final ThirdPartyData thirdPartyData, final SignUpData signUpData) {
            l51.m152887G(new Runnable() { // from class: l.b4q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74961a.m199604B(thirdPartyData, signUpData);
                }
            });
        }

        /* JADX INFO: renamed from: D */
        public final void m199606D(final SignUpData signUpData, final ThirdPartyData thirdPartyData) {
            final Runnable runnable = new Runnable() { // from class: l.y3q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f197384a.m199612u();
                }
            };
            signUpData.thirdPartyId = thirdPartyData.thirdPartyId;
            signUpData.thirdPartyToken = thirdPartyData.thirdPartyToken;
            v3q0.this.duringCreated(ike.m140279r(signUpData, null, true)).subscribe(psd0.m173597H(new y20() { // from class: l.z3q0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f202851a.m199613v(signUpData, (uxj0) obj);
                }
            }, new y20() { // from class: l.a4q0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f68439a.m199614w(thirdPartyData, runnable, (Throwable) obj);
                }
            }));
        }

        @Override // p153l.tvf
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void onSuccess(a1w a1wVar) {
            v3q0.this.f182256q = a1wVar.getAccessToken();
            final Runnable runnable = new Runnable() { // from class: l.c4q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79727a.m199603A();
                }
            };
            final ThirdPartyData thirdPartyDataNew_ = ThirdPartyData.new_();
            thirdPartyDataNew_.thirdPartyId = v3q0.this.f182256q.getUserId();
            thirdPartyDataNew_.thirdPartyToken = v3q0.this.f182256q.getToken();
            AccountModule.f16756c.m29273C2(thirdPartyDataNew_).subscribe(psd0.m173600K(new y20() { // from class: l.d4q0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f85062a.m199616y(thirdPartyDataNew_, (uxj0) obj);
                }
            }, new y20() { // from class: l.e4q0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f92139a.m199617z(thirdPartyDataNew_, runnable, (Throwable) obj);
                }
            }, false));
        }

        @Override // p153l.tvf
        /* JADX INFO: renamed from: a */
        public void mo51952a(FacebookException facebookException) {
            FacebookApi.m30528m(facebookException);
            l51.m152887G(new Runnable() { // from class: l.w3q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f187163a.m199611t();
                }
            });
        }

        @Override // p153l.tvf
        public void onCancel() {
            l51.m152887G(new Runnable() { // from class: l.g4q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f102190a.m199610s();
                }
            });
        }

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ void m199608q(ThirdPartyValidation thirdPartyValidation, SignUpData signUpData, ThirdPartyData thirdPartyData, C4470c c4470c) {
            if (NullChecker.m82486a(thirdPartyValidation)) {
                signUpData.thirdPartyValidation = thirdPartyValidation;
            }
            m199606D(signUpData, thirdPartyData);
        }

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ void m199609r(final ThirdPartyData thirdPartyData, final ThirdPartyValidation thirdPartyValidation, final SignUpData signUpData) {
            v3q0.this.lifecycle().filter(new qcj() { // from class: l.h4q0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
                }
            }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.i4q0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f112936a.m199608q(thirdPartyValidation, signUpData, thirdPartyData, (C4470c) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ void m199610s() {
            ((AbstractC19037o6) v3q0.this.viewModel).mo124216p(false);
        }

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ void m199611t() {
            ((AbstractC19037o6) v3q0.this.viewModel).mo124216p(false);
        }

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ void m199612u() {
            ((AbstractC19037o6) v3q0.this.viewModel).mo124216p(false);
        }

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ void m199613v(SignUpData signUpData, uxj0 uxj0Var) {
            AccountModule.f16756c.m29304Q0().put(signUpData.name);
            if (NullChecker.m82486a(signUpData.birthdate)) {
                AccountModule.f16756c.m29300O0().put(signUpData.birthdate);
            }
            if (NullChecker.m82486a(signUpData.gender)) {
                AccountModule.f16756c.m29302P0().put(signUpData.gender.toString());
            }
            boolean zIsEmpty = TextUtils.isEmpty(signUpData.profilePath);
            v3q0 v3q0Var = v3q0.this;
            if (zIsEmpty) {
                v3q0Var.act().startActivity(SignUpDetailsNewAct.m29496b2(v3q0.this.act(), signUpData));
            } else {
                v3q0Var.f182233B.call(signUpData);
            }
        }

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ void m199614w(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
            if (v3q0.this.m199346Q3(th)) {
                v3q0.this.f182254o.mo102266b(th, thirdPartyData, runnable, SignInGrantType.get("facebook"));
            } else {
                l51.m152887G(runnable);
                bsj0.m106246D(th);
            }
        }

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ void m199615x(Throwable th) {
            v3q0.this.f182258s.call();
        }

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ void m199616y(final ThirdPartyData thirdPartyData, uxj0 uxj0Var) {
            AccountModule.f16756c.m29318Y1(v3q0.this.f182256q.getUserId(), v3q0.this.f182256q.getToken()).onErrorReturn(new qcj() { // from class: l.j4q0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return v3q0.C20742e.m199596j((Throwable) obj);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.k4q0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f123914a.m199605C(thirdPartyData, (SignUpData) obj);
                }
            }, new y20() { // from class: l.x3q0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f192290a.m199615x((Throwable) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m199617z(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
            if (v3q0.this.m199346Q3(th)) {
                v3q0.this.f182254o.mo102266b(th, thirdPartyData, runnable, SignInGrantType.get("facebook"));
            } else {
                l51.m152887G(runnable);
                bsj0.m106246D(th);
            }
        }
    }

    /* JADX INFO: renamed from: l.v3q0$f */
    public class DialogInterfaceOnDismissListenerC20743f implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f182275a;

        public DialogInterfaceOnDismissListenerC20743f(l4g0 l4g0Var) {
            this.f182275a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f182275a);
        }
    }

    /* JADX INFO: renamed from: l.v3q0$g */
    public static /* synthetic */ class C20744g {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f182277a;

        static {
            int[] iArr = new int[OperatorType.values().length];
            f182277a = iArr;
            try {
                iArr[OperatorType.china_mobile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f182277a[OperatorType.china_telecom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f182277a[OperatorType.china_unicom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public v3q0(ner nerVar) {
        super(nerVar);
        this.f182240a = false;
        this.f182241b = AccountTempApi.InactiveType.None;
        this.f182242c = "";
        this.f182250k = false;
        this.f182251l = C22507a.m222758b();
        this.f182252m = new View.OnClickListener() { // from class: l.r1q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160847a.m199331M4(view);
            }
        };
        this.f182253n = new View.OnClickListener() { // from class: l.j3q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118210a.m199503N4(view);
            }
        };
        this.f182254o = new b30() { // from class: l.u3q0
            @Override // p153l.b30
            /* JADX INFO: renamed from: b */
            public final void mo102266b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f177359a.m199486G4((Throwable) obj, (ThirdPartyData) obj2, (Runnable) obj3, (SignInGrantType) obj4);
            }
        };
        this.f182257r = new x20() { // from class: l.iyp0
            @Override // p153l.x20
            public final void call() {
                this.f117620a.m199492I4();
            }
        };
        this.f182258s = new x20() { // from class: l.typ0
            @Override // p153l.x20
            public final void call() {
                this.f176693a.m199326K4();
            }
        };
        this.f182259t = false;
        this.f182260u = false;
        this.f182262w = new x20() { // from class: l.ezp0
            @Override // p153l.x20
            public final void call() {
                this.f96612a.m199498L4();
            }
        };
        this.f182264y = new C20738a();
        this.f182232A = new x20() { // from class: l.pzp0
            @Override // p153l.x20
            public final void call() {
                this.f154946a.m199506P4();
            }
        };
        this.f182233B = new y20() { // from class: l.a0q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f67739a.m199586z4((SignUpData) obj);
            }
        };
        this.f182234C = new x20() { // from class: l.f0q0
            @Override // p153l.x20
            public final void call() {
                this.f96710a.m199472A4();
            }
        };
        this.f182235D = new View.OnClickListener() { // from class: l.g0q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101674a.m199474B4(view);
            }
        };
        this.f182237F = new x20() { // from class: l.c2q0
            @Override // p153l.x20
            public final void call() {
                this.f79510a.m199479D4();
            }
        };
        this.f182238G = new View.OnClickListener() { // from class: l.n2q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139880a.m199484F4(view);
            }
        };
        this.f182239H = new View.OnClickListener() { // from class: l.y2q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197275a.m199489H4(view);
            }
        };
    }

    /* JADX INFO: renamed from: B5 */
    private void m199300B5(final SignUpData signUpData, final ThirdPartyData thirdPartyData) {
        final Runnable runnable = new Runnable() { // from class: l.h1q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f107474a.m199508Q4();
            }
        };
        signUpData.thirdPartyId = thirdPartyData.thirdPartyId;
        signUpData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        signUpData.email = thirdPartyData.email;
        signUpData.signUpType = AccountTempApi.SignUpType.google;
        duringCreated(ike.m140279r(signUpData, null, true)).subscribe(psd0.m173597H(new y20() { // from class: l.i1q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112544a.m199511R4(signUpData, (uxj0) obj);
            }
        }, new y20() { // from class: l.j1q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117984a.m199514S4(thirdPartyData, runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E2 */
    public static /* synthetic */ void m199309E2() {
    }

    /* JADX INFO: renamed from: F3 */
    private void m199313F3(Intent intent) throws Throwable {
        try {
            GoogleSignInAccount googleSignInAccountMo15428m = C2104a.m12496b(intent).mo15428m(ApiException.class);
            ((AbstractC19037o6) this.viewModel).mo124196b(false);
            m199505P3(googleSignInAccountMo15428m.m12460h0(), googleSignInAccountMo15428m.m12461i0(), googleSignInAccountMo15428m.m12457H());
        } catch (ApiException e) {
            if (e.getStatusCode() != 12501) {
                o1j0.m165634h(R$string.f17030y3);
            }
            ((AbstractC19037o6) this.viewModel).mo124196b(false);
        }
    }

    /* JADX INFO: renamed from: H1 */
    public static /* synthetic */ void m199316H1() {
    }

    /* JADX INFO: renamed from: K3 */
    public static String m199325K3() {
        return f182230K.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K4 */
    public /* synthetic */ void m199326K4() {
        l51.m152887G(new Runnable() { // from class: l.c1q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79416a.m199495J4();
            }
        });
        if (NullChecker.m82486a(AccessToken.m7462d())) {
            z0w.m218186m().m218213u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M4 */
    public /* synthetic */ void m199331M4(View view) {
        act().startActivity(PhoneNumberLoginOptAct.m29678Z1(act()));
    }

    /* JADX INFO: renamed from: N2 */
    public static /* synthetic */ void m199334N2(x20 x20Var, uxj0 uxj0Var) {
        tcn.m190485b();
        x20Var.call();
    }

    /* JADX INFO: renamed from: N5 */
    public static void m199335N5() {
        f182230K.put("");
    }

    /* JADX INFO: renamed from: O3 */
    public static Tencent m199338O3(Context context) {
        Tencent.setIsPermissionGranted(true);
        return Tencent.createInstance(cy5.f84298b, context);
    }

    /* JADX INFO: renamed from: O5 */
    private void m199339O5(boolean z, final SignInData signInData, final Runnable runnable) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        ((AbstractC19037o6) this.viewModel).getAct().dialog().m21502E0(z ? R$string.f16869V2 : R$string.f16859T2).m21499D(z ? R$string.f16874W2 : R$string.f16864U2).m21555t0(R$string.f17031z, new Runnable() { // from class: l.uyp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f181656a.m199557k5(signInData, runnable);
            }
        }).m21541l0(R$string.f16897b, new Runnable() { // from class: l.vyp0
            @Override // java.lang.Runnable
            public final void run() {
                i4g0.m138520r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
            }
        }).m21525V(new DialogInterfaceOnDismissListenerC20743f(l4g0VarM204399c)).m21567z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q3 */
    public boolean m199346Q3(Throwable th) {
        return NullChecker.m82486a(th) && (th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40037;
    }

    /* JADX INFO: renamed from: S2 */
    public static /* synthetic */ void m199352S2(Runnable runnable, Throwable th) {
        runnable.run();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: U1 */
    public static /* synthetic */ void m199356U1(Envelope envelope) {
    }

    /* JADX INFO: renamed from: U2 */
    public static /* synthetic */ void m199357U2() {
    }

    /* JADX INFO: renamed from: W2 */
    public static /* synthetic */ void m199363W2() {
    }

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ void m199371Z2(x20 x20Var, uxj0 uxj0Var) {
        tcn.m190485b();
        x20Var.call();
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m199373a2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a6 */
    public void m199375a6() {
        ((AbstractC19037o6) this.viewModel).getAct().startActivity(PhoneNumberLoginOptAct.m29678Z1(((AbstractC19037o6) this.viewModel).getAct()));
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ void m199388e3(String str, String str2, final y20 y20Var, final Runnable runnable) {
        i4g0.m138520r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("qq");
        signInData.thirdPartyId = str;
        signInData.thirdPartyToken = str2;
        AccountModule.f16756c.m29348o2(signInData, true, new Runnable() { // from class: l.ozp0
            @Override // java.lang.Runnable
            public final void run() {
                v3q0.m199309E2();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.qzp0
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var.call(Boolean.FALSE);
            }
        }, new y20() { // from class: l.rzp0
            @Override // p153l.y20
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m199389f0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public /* synthetic */ void m199397g4(Bundle bundle) {
        if (NullChecker.m82486a(act().getSupportActionBar())) {
            act().getSupportActionBar().mo102186m();
        }
        ((AbstractC19037o6) this.viewModel).mo124220r();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m199398h0(Runnable runnable) {
        i4g0.m138520r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
        runnable.run();
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ void m199399h1() {
    }

    /* JADX INFO: renamed from: h2 */
    public static /* synthetic */ void m199400h2(Runnable runnable, Throwable th) {
        runnable.run();
        CrashHelper.m82479c(new Exception("wechat signup no transition--> message:" + th.getMessage(), th));
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m199402i0(Runnable runnable) {
        i4g0.m138520r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4 */
    public /* synthetic */ void m199406i4(Throwable th) {
        if ((th instanceof ApiExcep.Client.NotFound) || (th instanceof ApiExcep.Client.Unauthorized) || ((th instanceof App.HandledGlobally) && (((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            ike.m140276h().m140286m();
        } else {
            ike.m140276h().m140282g();
            m199481E3();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ Boolean m199407j0(Runnable runnable, WeChatUserInfo weChatUserInfo) {
        if (NullChecker.m82486a(weChatUserInfo)) {
            return Boolean.TRUE;
        }
        runnable.run();
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ void m199411j4(Bundle bundle) {
        this.f182243d = ((AbstractC19037o6) this.viewModel).mo124197c(this.f182240a);
        m199496J5(this.f182247h);
        if (IntlCountryCodeController.m29112i()) {
            AccountTempApi.InactiveType inactiveType = this.f182241b;
            if (inactiveType == AccountTempApi.InactiveType.Pause) {
                C20102sm.m186704m0(act(), act().string(R$string.f16940i0), act().string(R$string.f16934h0), act().string(R$string.f16809J2));
            } else if (inactiveType == AccountTempApi.InactiveType.DeleteImmediately) {
                C20102sm.m186704m0(act(), act().string(R$string.f16928g0), this.f182248i ? String.format("%s\n\n%s", act().string(R$string.f16922f0), act().string(R$string.f16958l0)) : act().string(R$string.f16922f0), act().string(R$string.f16809J2));
            }
        }
        if (this.f182241b == AccountTempApi.InactiveType.DeleteImmediately && !TextUtils.isEmpty(this.f182242c) && RemoteConfig.m80481x().m80485F("setting_snail_diversion_config").contains(this.f182242c)) {
            nae0.m162083m(act(), Uri.parse("tantan://webview?url=".concat(zwk.m221905e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/love-snail/index.html?speed=true&_bid=1004028&hideNavigationBar=1&hideNotch=1" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/love-snail/index.html?speed=true&_bid=1004028&hideNavigationBar=1&hideNotch=1")));
        }
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ Boolean m199423m3(Runnable runnable, ThirdPartVetify thirdPartVetify) {
        if (NullChecker.m82486a(thirdPartVetify) && thirdPartVetify.code == 200) {
            return Boolean.TRUE;
        }
        runnable.run();
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: o2 */
    public static /* synthetic */ C22421c m199430o2(SignInData signInData, MobileRespInfo mobileRespInfo) {
        signInData.grantType = mobileRespInfo.grantType;
        signInData.thirdPartyToken = mobileRespInfo.token;
        signInData.thirdPartyAccessCode = mobileRespInfo.accessCode;
        signInData.thirdPartyId = mobileRespInfo.openId;
        return AccountModule.f16756c.m29348o2(signInData, true, new Runnable() { // from class: l.xzp0
            @Override // java.lang.Runnable
            public final void run() {
                v3q0.m199399h1();
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public static /* synthetic */ Boolean m199431o3(WeChatToken weChatToken, Runnable runnable, WeChatToken weChatToken2) {
        if (!NullChecker.m82486a(weChatToken2) || TextUtils.isEmpty(weChatToken2.thirdpartyId) || TextUtils.isEmpty(weChatToken2.thirdpartyAccessToken)) {
            runnable.run();
            return Boolean.FALSE;
        }
        weChatToken.thirdpartyId = weChatToken2.thirdpartyId;
        weChatToken.thirdpartyAccessToken = weChatToken2.thirdpartyAccessToken;
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m199440r0(WeChatToken weChatToken, final y20 y20Var, final Runnable runnable) {
        i4g0.m138520r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("wechat");
        signInData.thirdPartyId = weChatToken.thirdpartyId;
        signInData.thirdPartyToken = weChatToken.thirdpartyAccessToken;
        AccountModule.f16756c.m29348o2(signInData, true, new Runnable() { // from class: l.c0q0
            @Override // java.lang.Runnable
            public final void run() {
                v3q0.m199357U2();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.d0q0
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var.call(Boolean.FALSE);
            }
        }, new y20() { // from class: l.e0q0
            @Override // p153l.y20
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m199444s0(MatchCounterEnvelope matchCounterEnvelope) {
        long j = matchCounterEnvelope.totalCounters.matches;
        if (j > 0) {
            AccountModule.f16756c.f17048j.put(Long.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ void m199445s1(SignInGrantType signInGrantType, ThirdPartyData thirdPartyData, final x20 x20Var, final Runnable runnable) {
        SignInData signInData = new SignInData();
        signInData.grantType = signInGrantType;
        signInData.thirdPartyId = thirdPartyData.thirdPartyId;
        signInData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        AccountModule.f16756c.m29348o2(signInData, true, null).subscribe(psd0.m173597H(new y20() { // from class: l.a3q0
            @Override // p153l.y20
            public final void call(Object obj) {
                v3q0.m199334N2(x20Var, (uxj0) obj);
            }
        }, new y20() { // from class: l.b3q0
            @Override // p153l.y20
            public final void call(Object obj) {
                v3q0.m199352S2(runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ void m199456v1(Throwable th) {
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ C22421c m199461x0(SignInData signInData, MobileRespInfo mobileRespInfo) {
        signInData.grantType = mobileRespInfo.grantType;
        signInData.thirdPartyToken = mobileRespInfo.token;
        signInData.thirdPartyAccessCode = mobileRespInfo.accessCode;
        signInData.thirdPartyId = mobileRespInfo.openId;
        return AccountModule.f16756c.m29348o2(signInData, false, new Runnable() { // from class: l.wyp0
            @Override // java.lang.Runnable
            public final void run() {
                v3q0.m199316H1();
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m199468z0(Throwable th) {
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m199472A4() {
        ((AbstractC19037o6) this.viewModel).mo124205j();
        i4g0.m138526x("e_signin_fb_button", ((PutongAct) act()).pageId());
        this.f182255p = b94.C15949b.m103051a();
        z0w.m218186m().m218216y(this.f182255p, new C20742e());
        ((AbstractC19037o6) this.viewModel).mo124218q();
    }

    /* JADX INFO: renamed from: A5 */
    public void m199473A5(int i, int i2, Intent intent) {
        if (i == 9001) {
            m199313F3(intent);
        }
        if (NullChecker.m82486a(this.f182255p)) {
            this.f182255p.mo8715a(i, i2, intent);
        }
        if (i == 786 && i2 == 0) {
            this.f182258s.call();
        }
        if (i == 11101) {
            Tencent.onActivityResultData(i, i2, intent, this.f182264y);
        }
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m199474B4(View view) {
        ((AbstractC19037o6) this.viewModel).mo124216p(true);
        z0w.m218186m().m218213u();
        z0w.m218186m().m218212t(act(), FacebookApi.f17871d);
    }

    /* JADX INFO: renamed from: C3, reason: merged with bridge method [inline-methods] */
    public final void m199506P4() {
        duringCreated(new pcj() { // from class: l.s1q0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return ChinaMobileController.m30591b().m30599i(5000);
            }
        }, false).subscribe(psd0.m173596G(new y20() { // from class: l.t1q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171690a.m199522V3((MobileRespInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m199476C4() {
        ((AbstractC19037o6) this.viewModel).mo124225u();
        SignInData signInData = new SignInData();
        signInData.device = tl8.m191616M();
        m199518T5(signInData, new Runnable() { // from class: l.l2q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f129794a.m199375a6();
            }
        });
    }

    /* JADX INFO: renamed from: C5 */
    public void m199477C5(List<Media> list) {
        if (list.size() > 0 && (list.get(0) instanceof Picture) && NullChecker.m82488c(this.f182244e, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            sim simVar = new sim(oki.m168038z(list.get(0).url), TXEAudioDef.TXE_OPUS_SAMPLE_NUM);
            try {
                this.f182244e.profilePath = simVar.m186025d();
                m199491I3(this.f182244e);
            } catch (IOException e) {
                CrashHelper.m82479c(e);
                this.f182258s.call();
            }
        }
    }

    /* JADX INFO: renamed from: D3 */
    public final void m199478D3() {
        if (this.f182263x == null) {
            this.f182263x = WXAPIFactory.createWXAPI(m99640Y(), null);
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m199479D4() {
        m199501M5(new x20() { // from class: l.d1q0
            @Override // p153l.x20
            public final void call() {
                this.f84709a.m199476C4();
            }
        }, new e1q0(this));
    }

    /* JADX INFO: renamed from: D5 */
    public final void m199480D5(JSONObject jSONObject) {
        Exception exc;
        String string;
        String string2;
        ((AbstractC19037o6) this.viewModel).mo124211m(true);
        final Runnable runnable = new Runnable() { // from class: l.f2q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f96899a.m199517T4();
            }
        };
        final Runnable runnable2 = new Runnable() { // from class: l.g2q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f101868a.m199520U4();
            }
        };
        final Runnable runnable3 = new Runnable() { // from class: l.h2q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f107579a.m199523V4();
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
        m199338O3(act()).setAccessToken(str, string3);
        m199338O3(act()).setOpenId(str2);
        AccountModule.f16758e.m29184m(str2, str, true).first().flatMap(new qcj() { // from class: l.i2q0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f112662a.m199526W4((ThirdPartVetify) obj);
            }
        }).first().subscribe(psd0.m173600K(new y20() { // from class: l.j2q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118080a.m199543c5(str2, str, runnable2, runnable, (WeChatUserInfo) obj);
            }
        }, new y20() { // from class: l.k2q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123636a.m199553h5(runnable, str2, str, runnable2, runnable3, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: E3 */
    public final void m199481E3() {
        if (this.f182240a) {
            act().hideInput();
            return;
        }
        act().startActivity(C16330cp.m111719e(act()));
        act().m68056e2();
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m199482E4(final SignInGrantType signInGrantType, final ThirdPartyData thirdPartyData, final x20 x20Var, final Runnable runnable, Throwable th, Throwable th2) {
        if (!(th2 instanceof TantanException.Client.AccountService)) {
            runnable.run();
            bsj0.m106246D(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th2).code;
        if (i == 40020 || i == 40091) {
            boolean z = i == 40020;
            act().dialog().m21502E0(z ? R$string.f16869V2 : R$string.f16859T2).m21499D(z ? R$string.f16874W2 : R$string.f16864U2).m21555t0(R$string.f17031z, new Runnable() { // from class: l.o2q0
                @Override // java.lang.Runnable
                public final void run() {
                    v3q0.m199445s1(signInGrantType, thirdPartyData, x20Var, runnable);
                }
            }).m21541l0(R$string.f16897b, runnable).m21567z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.p2q0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    runnable.run();
                }
            });
        }
    }

    /* JADX INFO: renamed from: E5 */
    public void m199483E5(WeChatUserInfo weChatUserInfo, boolean z) {
        AccountModule.f16758e.m29179h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f182245f);
        if (z) {
            f182229J.put(Boolean.FALSE);
        }
        AccountModule.f16756c.m29289I2().put(weChatUserInfo.nickname);
        act().startActivity(C16330cp.m111719e(((AbstractC19037o6) this.viewModel).getAct()));
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m199484F4(View view) {
        ((AbstractC19037o6) this.viewModel).mo124196b(true);
        h7k h7kVarM12495a = C2104a.m12495a(m99640Y(), new GoogleSignInOptions.C2103a(GoogleSignInOptions.DEFAULT_SIGN_IN).m12488b().m12490d("218526224262-usliqg20cepnb3ql98amgeum18v8uatv.apps.googleusercontent.com").m12487a());
        h7kVarM12495a.m133801d();
        act().startActivityForResult(h7kVarM12495a.m133799b(), ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED);
    }

    /* JADX INFO: renamed from: F5 */
    public void m199485F5() {
        RememberUserInfo rememberUserInfoMo107143b = uqb0.f180380L.f17865d.mo107143b();
        if (NullChecker.m82486a(rememberUserInfoMo107143b)) {
            m199509Q5(rememberUserInfoMo107143b, act(), new g1q0(this));
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m199486G4(final Throwable th, final ThirdPartyData thirdPartyData, final Runnable runnable, final SignInGrantType signInGrantType) {
        SignInData signInData = new SignInData();
        signInData.grantType = signInGrantType;
        signInData.thirdPartyId = thirdPartyData.thirdPartyId;
        signInData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        signInData.thirdEmail = thirdPartyData.email;
        final x20 x20Var = new x20() { // from class: l.l1q0
            @Override // p153l.x20
            public final void call() {
                this.f129710a.m199504O4();
            }
        };
        AccountModule.f16756c.m29348o2(signInData, false, null).subscribe(psd0.m173597H(new y20() { // from class: l.m1q0
            @Override // p153l.y20
            public final void call(Object obj) {
                v3q0.m199371Z2(x20Var, (uxj0) obj);
            }
        }, new y20() { // from class: l.n1q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139779a.m199482E4(signInGrantType, thirdPartyData, x20Var, runnable, th, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G5 */
    public void m199487G5() {
        if (this.f182260u) {
            if (!this.f182259t) {
                ((AbstractC19037o6) this.viewModel).mo124211m(false);
            }
            this.f182259t = false;
        }
        duringCreated(AccountModule.f16756c.m29315X0()).subscribe(psd0.m173597H(new y20() { // from class: l.n0q0
            @Override // p153l.y20
            public final void call(Object obj) {
                v3q0.m199444s0((MatchCounterEnvelope) obj);
            }
        }, new y20() { // from class: l.o0q0
            @Override // p153l.y20
            public final void call(Object obj) {
                v3q0.m199456v1((Throwable) obj);
            }
        }));
        ((AbstractC19037o6) this.viewModel).mo124200f();
    }

    /* JADX INFO: renamed from: H3 */
    public boolean m199488H3() {
        OperatorType operatorTypeM136471c;
        if (this.f182246g == null || (operatorTypeM136471c = AccountModule.f16757d.f154351a.m136471c()) == null) {
            return true;
        }
        int i = C20744g.f182277a[operatorTypeM136471c.ordinal()];
        if (i == 1 || i == 2) {
            return this.f182246g.chinaMobile;
        }
        if (i != 3) {
            return true;
        }
        return this.f182246g.chinaUnicom;
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m199489H4(View view) {
        act().startActivity(EmailLoginOptAct.m29661Z1(act(), VerifyReason.get(VerifyReason.signup_signin), ""));
    }

    /* JADX INFO: renamed from: H5 */
    public void m199490H5() {
        this.f182237F.call();
    }

    /* JADX INFO: renamed from: I3 */
    public final void m199491I3(final SignUpData signUpData) {
        C4726a.m29249q2(signUpData, null).subscribe(psd0.m173597H(new y20() { // from class: l.p0q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150084a.m199525W3(signUpData, (uxj0) obj);
            }
        }, new y20() { // from class: l.q0q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155076a.m199528X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m199492I4() {
        this.f182260u = false;
        this.f182259t = false;
        ((AbstractC19037o6) this.viewModel).mo124213n();
    }

    /* JADX INFO: renamed from: I5 */
    public final void m199493I5() {
        m199496J5(false);
    }

    /* JADX INFO: renamed from: J3 */
    public View.OnClickListener m199494J3() {
        return new View.OnClickListener() { // from class: l.q2q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155381a.m199534Z3(view);
            }
        };
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m199495J4() {
        ((AbstractC19037o6) this.viewModel).mo124216p(false);
    }

    /* JADX INFO: renamed from: J5 */
    public final void m199496J5(boolean z) {
        ((AbstractC19037o6) this.viewModel).mo124209l();
        RememberUserInfo rememberUserInfoMo107143b = uqb0.f180380L.f17865d.mo107143b();
        if (NullChecker.m82486a(rememberUserInfoMo107143b) && z) {
            m199509Q5(rememberUserInfoMo107143b, act(), new g1q0(this));
        }
        final AccountTestFactor accountTestFactor = new AccountTestFactor();
        accountTestFactor.step = "appOpen";
        accountTestFactor.channel = "googleplay";
        final x20 x20Var = new x20() { // from class: l.o1q0
            @Override // p153l.x20
            public final void call() {
                this.f144680a.m199555j5(accountTestFactor);
            }
        };
        AccountModule.f16756c.m29286H2().subscribe(psd0.m173597H(new y20() { // from class: l.p1q0
            @Override // p153l.y20
            public final void call(Object obj) {
                x20Var.call();
            }
        }, new y20() { // from class: l.q1q0
            @Override // p153l.y20
            public final void call(Object obj) {
                x20Var.call();
            }
        }));
    }

    /* JADX INFO: renamed from: K5 */
    public final void m199497K5() {
        ((AbstractC19037o6) this.viewModel).mo124211m(false);
        o1j0.m165636j("授权失败，请再次尝试");
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m199498L4() {
        this.f182260u = true;
        ((AbstractC19037o6) this.viewModel).mo124222s();
    }

    /* JADX INFO: renamed from: L5 */
    public void m199499L5() {
        uqb0.f180380L.f17865d.m123194i();
        m199493I5();
    }

    /* JADX INFO: renamed from: M3 */
    public C22421c<WeChatUserInfo> m199500M3() {
        return C22421c.fromAsync(new y20() { // from class: l.r3q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161076a.m199537a4((AsyncEmitter) obj);
            }
        }, AsyncEmitter.BackpressureMode.LATEST);
    }

    /* JADX INFO: renamed from: M5 */
    public void m199501M5(x20 x20Var, x20 x20Var2) {
        if (x20Var2 != null) {
            x20Var2.call();
        }
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: N3 */
    public View.OnClickListener m199502N3(final boolean z) {
        return new View.OnClickListener() { // from class: l.f1q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96818a.m199542c4(z, view);
            }
        };
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m199503N4(View view) {
        act().startActivity(PhoneNumberLoginOptAct.m29678Z1(act()));
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m199504O4() {
        AuthData authDataMo107143b = AccountModule.f16756c.m29311V0().mo107143b();
        act().startActivity(C16330cp.m111720f(((AbstractC19037o6) this.viewModel).getAct(), NullChecker.m82486a(authDataMo107143b) ? authDataMo107143b.signupStage.toString() : ""));
        AccountModule.f16758e.m29179h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f182245f);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: P3 */
    public void m199505P3(String str, String str2, String str3) {
        final Runnable runnable = new Runnable() { // from class: l.xxp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f196672a.m199545d4();
            }
        };
        final ThirdPartyData thirdPartyDataNew_ = ThirdPartyData.new_();
        thirdPartyDataNew_.thirdPartyId = str;
        thirdPartyDataNew_.thirdPartyToken = str2;
        thirdPartyDataNew_.email = str3;
        duringCreated(AccountModule.f16756c.m29275D2(thirdPartyDataNew_)).subscribe(psd0.m173600K(new y20() { // from class: l.k0q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123415a.m199547e4(thirdPartyDataNew_, (uxj0) obj);
            }
        }, new y20() { // from class: l.v0q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181888a.m199549f4(thirdPartyDataNew_, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: P5 */
    public final void m199507P5(boolean z, final String str, final String str2, final Runnable runnable, final y20<Boolean> y20Var) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        act().dialog().m21502E0(z ? R$string.f16869V2 : R$string.f16859T2).m21499D(z ? R$string.f16874W2 : R$string.f16864U2).m21555t0(R$string.f17031z, new Runnable() { // from class: l.t3q0
            @Override // java.lang.Runnable
            public final void run() {
                v3q0.m199388e3(str, str2, y20Var, runnable);
            }
        }).m21541l0(R$string.f16897b, new Runnable() { // from class: l.yxp0
            @Override // java.lang.Runnable
            public final void run() {
                v3q0.m199398h0(runnable);
            }
        }).m21525V(new DialogInterfaceOnDismissListenerC20741d(l4g0VarM204399c)).m21567z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.zxp0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m199508Q4() {
        ((AbstractC19037o6) this.viewModel).mo124196b(false);
    }

    /* JADX INFO: renamed from: Q5 */
    public final void m199509Q5(RememberUserInfo rememberUserInfo, Act act, final x20 x20Var) {
        if (((AbstractC19037o6) this.viewModel).mo124198d()) {
            return;
        }
        if (NullChecker.m82486a(this.f182236E) && this.f182236E.isShowing()) {
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
        vButton.setText(act.getResources().getString(R$string.f16901b3, m199533Y5(rememberUserInfo.name)));
        vText.setText(R$string.f16907c3);
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_signin_with_saved_info", Dialog.class.getName());
        this.f182236E = c17971aNewDialog.m146023R(viewInflate).m146021P(true).m146046o0(new DialogInterface.OnShowListener() { // from class: l.u0q0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                w1e.m204402f(l4g0VarM204399c);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.w0q0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146043l0(new DialogInterface.OnCancelListener() { // from class: l.x0q0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                i4g0.m138523u("e_switch_account_button", "p_signin_with_saved_info", jyb.m147494Y("switch_account", "close"));
            }
        }).m146049r0();
        vImage.setOnClickListener(new View.OnClickListener() { // from class: l.y0q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197032a.m199559l5(view);
            }
        });
        vButton.setOnClickListener(new View.OnClickListener() { // from class: l.z0q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202368a.m199561m5(x20Var, view);
            }
        });
        vText.setOnClickListener(new View.OnClickListener() { // from class: l.a1q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67829a.m199563n5(view);
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public boolean m199510R3() {
        try {
            return act().getPackageManager().getPackageInfo("com.tencent.mobileqq", 0) != null;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m199511R4(SignUpData signUpData, uxj0 uxj0Var) {
        if (awi0.f73758b.get().booleanValue()) {
            act().startActivity(C16330cp.m111719e(act()));
        } else {
            act().startActivity(SignUpDetailsNewAct.m29496b2(act(), signUpData));
        }
    }

    /* JADX INFO: renamed from: R5 */
    public final void m199512R5(boolean z, final WeChatToken weChatToken, final Runnable runnable, final y20<Boolean> y20Var) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        act().dialog().m21502E0(z ? R$string.f16869V2 : R$string.f16859T2).m21499D(z ? R$string.f16874W2 : R$string.f16864U2).m21555t0(R$string.f17031z, new Runnable() { // from class: l.xyp0
            @Override // java.lang.Runnable
            public final void run() {
                v3q0.m199440r0(weChatToken, y20Var, runnable);
            }
        }).m21541l0(R$string.f16897b, new Runnable() { // from class: l.yyp0
            @Override // java.lang.Runnable
            public final void run() {
                v3q0.m199402i0(runnable);
            }
        }).m21525V(new DialogInterfaceOnDismissListenerC20740c(l4g0VarM204399c)).m21567z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.zyp0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public boolean m199513S3() {
        m199478D3();
        return this.f182263x.isWXAppInstalled();
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m199514S4(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
        if (m199346Q3(th)) {
            this.f182254o.mo102266b(th, thirdPartyData, runnable, SignInGrantType.get("google"));
        } else {
            l51.m152887G(runnable);
            bsj0.m106246D(th);
        }
    }

    /* JADX INFO: renamed from: S5 */
    public void m199515S5(final SignInData signInData, final Runnable runnable) {
        ((AbstractC19037o6) this.viewModel).getAct().progress(R$string.f16946j0, true);
        ((AbstractC19037o6) this.viewModel).getAct().duringCreated((C22421c) ChinaMobileController.m30591b().m30598h(5000).doOnNext(new y20() { // from class: l.szp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171411a.m199565o5(runnable, (MobileRespInfo) obj);
            }
        }).filter(new qcj() { // from class: l.tzp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new qcj() { // from class: l.uzp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return v3q0.m199430o2(signInData, (MobileRespInfo) obj);
            }
        }), false).subscribe(psd0.m173597H(new y20() { // from class: l.vzp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186506a.m199567p5((uxj0) obj);
            }
        }, new y20() { // from class: l.wzp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191817a.m199569q5(runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m199516T3(uxj0 uxj0Var) {
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169074h(this.f182245f);
        }
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ void m199517T4() {
        act().progressDismiss();
        ((AbstractC19037o6) this.viewModel).mo124195a();
        ((AbstractC19037o6) this.viewModel).mo124211m(false);
        o1j0.m165651y("QQ登录失败，请重试");
    }

    /* JADX INFO: renamed from: T5 */
    public void m199518T5(final SignInData signInData, final Runnable runnable) {
        ((AbstractC19037o6) this.viewModel).getAct().progress(R$string.f16946j0, true);
        ((AbstractC19037o6) this.viewModel).getAct().duringCreated((C22421c) ChinaMobileController.m30591b().m30598h(5000).doOnNext(new y20() { // from class: l.t2q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171787a.m199571r5(runnable, (MobileRespInfo) obj);
            }
        }).filter(new qcj() { // from class: l.u2q0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new qcj() { // from class: l.v2q0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return v3q0.m199461x0(signInData, (MobileRespInfo) obj);
            }
        }), false).subscribe(psd0.m173600K(new y20() { // from class: l.w2q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186923a.m199573s5((uxj0) obj);
            }
        }, new y20() { // from class: l.x2q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192174a.m199575t5(signInData, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m199519U3(uxj0 uxj0Var) {
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169074h(this.f182245f);
        }
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m199520U4() {
        ((AbstractC19037o6) this.viewModel).mo124211m(false);
        o1j0.m165651y("登录失败，绑定手机号后再试");
    }

    /* JADX INFO: renamed from: U5 */
    public View.OnClickListener m199521U5() {
        return new View.OnClickListener() { // from class: l.k1q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123536a.m199577u5(view);
            }
        };
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m199522V3(MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            int i = this.f182265z + 1;
            this.f182265z = i;
            if (i < 5) {
                m199506P4();
            } else {
                ABManager.m30320L().take(1).subscribe(psd0.m173596G(new y20() { // from class: l.x1q0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f192090a.m199516T3((uxj0) obj);
                    }
                }));
                AccountModule.f16758e.m29179h(act(), ThirdPartLoginApi.ReportMobileSource.landing_page, this.f182245f);
            }
        } else {
            this.f182245f = mobileRespInfo.mobileNumber;
            ABManager.m30320L().take(1).subscribe(psd0.m173596G(new y20() { // from class: l.y1q0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f197124a.m199519U3((uxj0) obj);
                }
            }));
            AccountModule.f16758e.m29179h(act(), ThirdPartLoginApi.ReportMobileSource.landing_page, this.f182245f);
        }
        i4g0.m138495D("e_login_phone_acquisition", WXEntryActivity.PID, jyb.m147494Y("get_phone_or_not", !TextUtils.isEmpty(this.f182245f) ? "yes" : "no"));
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m199523V4() {
        act().progressDismiss();
        ((AbstractC19037o6) this.viewModel).mo124211m(false);
    }

    /* JADX INFO: renamed from: V5 */
    public View.OnClickListener m199524V5() {
        return new View.OnClickListener() { // from class: l.z2q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202727a.m199579v5(view);
            }
        };
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m199525W3(SignUpData signUpData, uxj0 uxj0Var) {
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

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ C22421c m199526W4(ThirdPartVetify thirdPartVetify) {
        return m199500M3();
    }

    /* JADX INFO: renamed from: W5 */
    public void m199527W5() {
        m199530X5(null, null);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m199528X3(Throwable th) {
        this.f182258s.call();
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m199529X4(WeChatUserInfo weChatUserInfo) {
        m199483E5(weChatUserInfo, false);
    }

    /* JADX INFO: renamed from: X5 */
    public void m199530X5(RememberUserInfo rememberUserInfo, final String str) {
        act().progress(R$string.f16946j0);
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("unknown_");
        AccountModule.f16756c.m29346n2(signInData, rememberUserInfo, false, new Runnable() { // from class: l.r0q0
            @Override // java.lang.Runnable
            public final void run() {
                v3q0.m199373a2();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.s0q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165719a.m199581w5(str, (uxj0) obj);
            }
        }, new y20() { // from class: l.t0q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171553a.m199583x5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m199531Y3(View view) {
        if (((AbstractC19037o6) this.viewModel).mo124199e() || !IntlCountryCodeController.m29119p()) {
            this.f182239H.onClick(view);
        } else {
            ((AbstractC19037o6) this.viewModel).mo124203i(this.f182239H, view);
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m199532Y4(WeChatUserInfo weChatUserInfo) {
        m199483E5(weChatUserInfo, false);
    }

    /* JADX INFO: renamed from: Y5 */
    public String m199533Y5(String str) {
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

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m199534Z3(final View view) {
        HashMap map = new HashMap();
        map.put("sign up button pressed", "email");
        x95.INSTANCE.m209793m("Sign Up", map);
        i4g0.m138520r("e_intl_signin_with_email_button", ((PutongAct) act()).pageId());
        m199501M5(new x20() { // from class: l.c3q0
            @Override // p153l.x20
            public final void call() {
                this.f79639a.m199531Y3(view);
            }
        }, new e1q0(this));
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m199535Z4(final Runnable runnable, final WeChatUserInfo weChatUserInfo, final Runnable runnable2) {
        C20102sm.m186696i0(act(), "qq", "verified", new x20() { // from class: l.lzp0
            @Override // p153l.x20
            public final void call() {
                runnable.run();
            }
        }, new x20() { // from class: l.mzp0
            @Override // p153l.x20
            public final void call() {
                this.f139540a.m199532Y4(weChatUserInfo);
            }
        }, new x20() { // from class: l.nzp0
            @Override // p153l.x20
            public final void call() {
                runnable2.run();
            }
        });
    }

    /* JADX INFO: renamed from: Z5 */
    public void m199536Z5() {
        SignupStage signupStage = AccountModule.f16756c.m29311V0().mo107143b().signupStage;
        Intent intentM111720f = !TEnum.equals(signupStage, "unknown_") ? C16330cp.m111720f(act(), signupStage.toString()) : AccountModule.m29131H().toNewMainAct(act(), false, true);
        ((AbstractC19037o6) this.viewModel).getAct().progressDismiss();
        ((AbstractC19037o6) this.viewModel).getAct().startActivity(intentM111720f);
        ((AbstractC19037o6) this.viewModel).getAct().m68056e2();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.h0q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107318a.m199397g4((Bundle) obj);
            }
        });
        String str = ike.m140276h().f115355a.get();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(AccountModule.m29130F().userId()) && !"finished".equals(str) && !"unknown_".equals(str)) {
            duringCreated(AccountModule.f16756c.m29317Y0()).subscribe(psd0.m173597H(new y20() { // from class: l.i0q0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f112432a.m199552h4((User) obj);
                }
            }, new y20() { // from class: l.j0q0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f117840a.m199406i4((Throwable) obj);
                }
            }));
        }
        uqb0.f180370E.m80051t();
        creates(new y20() { // from class: l.l0q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129583a.m199411j4((Bundle) obj);
            }
        }, new x20() { // from class: l.m0q0
            @Override // p153l.x20
            public final void call() {
                this.f134327a.m199556k4();
            }
        });
        AccountModule.f16759f.m144648k();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m199537a4(AsyncEmitter asyncEmitter) {
        new UserInfo(act(), m199338O3(act()).getQQToken()).getUserInfo(new C20739b(asyncEmitter));
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m199538a5(WeChatUserInfo weChatUserInfo) {
        m199483E5(weChatUserInfo, false);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m199539b4(View view) {
        if (((AbstractC19037o6) this.viewModel).mo124199e() || !IntlCountryCodeController.m29119p()) {
            this.f182252m.onClick(view);
        } else {
            ((AbstractC19037o6) this.viewModel).mo124203i(this.f182252m, view);
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m199540b5(final Runnable runnable, final WeChatUserInfo weChatUserInfo, final Runnable runnable2, uxj0 uxj0Var) {
        act().progressDismiss();
        if (!C16074bp.m105751f()) {
            m199483E5(weChatUserInfo, false);
        } else if (TextUtils.isEmpty(this.f182245f) || !m199488H3()) {
            C20102sm.m186696i0(act(), "qq", "", new x20() { // from class: l.eyp0
                @Override // p153l.x20
                public final void call() {
                    runnable2.run();
                }
            }, new x20() { // from class: l.fyp0
                @Override // p153l.x20
                public final void call() {
                    this.f101414a.m199538a5(weChatUserInfo);
                }
            }, new x20() { // from class: l.gyp0
                @Override // p153l.x20
                public final void call() {
                    runnable.run();
                }
            });
        } else {
            C20102sm.m186698j0(act(), "qq", this.f182245f, new x20() { // from class: l.ayp0
                @Override // p153l.x20
                public final void call() {
                    runnable.run();
                }
            }, new x20() { // from class: l.byp0
                @Override // p153l.x20
                public final void call() {
                    this.f79046a.m199529X4(weChatUserInfo);
                }
            }, new x20() { // from class: l.cyp0
                @Override // p153l.x20
                public final void call() {
                    runnable2.run();
                }
            }, new x20() { // from class: l.dyp0
                @Override // p153l.x20
                public final void call() {
                    this.f91270a.m199535Z4(runnable2, weChatUserInfo, runnable);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b6 */
    public void m199541b6() {
        yp50.m217003f();
        if (App.f16092i.get().intValue() != 1 || f182228I) {
            return;
        }
        f182228I = true;
        if (!hxk.m137623g() || !hxk.m137622c().m137629h()) {
            if (TextUtils.isEmpty(ls4.f133389a) || !ls4.f133389a.toLowerCase().startsWith("douyin")) {
                i4g0.m138495D("e_app_1st_open", "", new pf60("is_first_open", Boolean.valueOf(this.f182249j)), new pf60("user_agent", gsp0.getDefaultUserAgent(App.f16088e)), new pf60("device_model_raw", Build.MODEL), new pf60(Device.IMEI, qzd.m178772e()), new pf60("imei2", qzd.m178773f()), new pf60(Device.OAID, hb00.m134333b()), new pf60(Device.MEID, qzd.m178774g()));
                return;
            } else {
                i4g0.m138495D("e_app_1st_open", "", new pf60("is_first_open", Boolean.valueOf(this.f182249j)), new pf60("user_agent", gsp0.getDefaultUserAgent(App.f16088e)), new pf60("device_model_raw", Build.MODEL), jyb.m147494Y("toutiao_channel", HumeSDK.getChannel(App.f16088e)), new pf60(Device.IMEI, qzd.m178772e()), new pf60("imei2", qzd.m178773f()), new pf60(Device.OAID, hb00.m134333b()), new pf60(Device.MEID, qzd.m178774g()));
                return;
            }
        }
        i4g0.m138495D("e_app_1st_open", "", new pf60("is_first_open", Boolean.valueOf(this.f182249j)), new pf60("package_name", act().getPackageName()), new pf60("referrer", hxk.m137622c().m137626d()), new pf60("click_time", hxk.m137622c().m137624a()), new pf60("install_time", hxk.m137622c().m137625b()), new pf60("track", hxk.m137622c().m137627e()), new pf60("user_agent", gsp0.getDefaultUserAgent(App.f16088e)), new pf60("device_model_raw", Build.MODEL), new pf60(Device.IMEI, qzd.m178772e()), new pf60("imei2", qzd.m178773f()), new pf60(Device.OAID, hb00.m134333b()), new pf60(Device.MEID, qzd.m178774g()));
        boolean z = kzv.f129469a;
        hxk.m137622c().m137626d();
        hxk.m137622c().m137624a();
        hxk.m137622c().m137625b();
        hxk.m137622c().m137627e();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m199542c4(boolean z, final View view) {
        if (z) {
            i4g0.m138520r("e_signin_phone_button", ((PutongAct) act()).pageId());
        } else if (this.f182250k) {
            i4g0.m138520r("e_intl_signin_phone", ((PutongAct) act()).pageId());
        } else {
            HashMap map = new HashMap();
            map.put("sign up button pressed", "Phone");
            x95.INSTANCE.m209793m("Sign Up", map);
            i4g0.m138520r("e_signin_phone_button", ((PutongAct) act()).pageId());
        }
        m199501M5(new x20() { // from class: l.u1q0
            @Override // p153l.x20
            public final void call() {
                this.f177108a.m199539b4(view);
            }
        }, new e1q0(this));
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m199543c5(String str, String str2, final Runnable runnable, final Runnable runnable2, final WeChatUserInfo weChatUserInfo) {
        SignUpData signUpData = new SignUpData();
        signUpData.name = weChatUserInfo.nickname;
        signUpData.signUpType = AccountTempApi.SignUpType.qq;
        signUpData.thirdPartyId = str;
        signUpData.thirdPartyToken = str2;
        AccountModule.f16756c.m29336i2(signUpData);
        duringCreated(ike.m140279r(signUpData, null, true)).subscribe(psd0.m173597H(new y20() { // from class: l.r2q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160965a.m199540b5(runnable, weChatUserInfo, runnable2, (uxj0) obj);
            }
        }, new y20() { // from class: l.s2q0
            @Override // p153l.y20
            public final void call(Object obj) {
                v3q0.m199400h2(runnable2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c6 */
    public void m199544c6() {
        if (!NullChecker.m82486a(this.f182261v) || this.f182261v.isUnsubscribed()) {
            return;
        }
        this.f182261v.unsubscribe();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m199545d4() {
        ((AbstractC19037o6) this.viewModel).mo124196b(false);
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m199546d5(Boolean bool) {
        AuthData authDataMo107143b = AccountModule.f16756c.m29311V0().mo107143b();
        String string = NullChecker.m82486a(authDataMo107143b) ? authDataMo107143b.signupStage.toString() : "";
        if (C16074bp.m105751f() && bool.booleanValue()) {
            act().startActivity(SignUpAiAct.m29394Z1(act()));
        } else {
            act().startActivity(C16330cp.m111720f(((AbstractC19037o6) this.viewModel).getAct(), string));
        }
        AccountModule.f16758e.m29179h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f182245f);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m199547e4(ThirdPartyData thirdPartyData, uxj0 uxj0Var) {
        SignUpData signUpData = new SignUpData();
        signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(App.f16088e);
        signUpData.signUpType = AccountTempApi.SignUpType.google;
        m199300B5(signUpData, thirdPartyData);
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m199548e5(final Runnable runnable, final y20 y20Var, final Runnable runnable2) {
        C20102sm.m186696i0(act(), "qq", "verified", new x20() { // from class: l.azp0
            @Override // p153l.x20
            public final void call() {
                runnable.run();
            }
        }, new x20() { // from class: l.bzp0
            @Override // p153l.x20
            public final void call() {
                y20Var.call(Boolean.TRUE);
            }
        }, new x20() { // from class: l.czp0
            @Override // p153l.x20
            public final void call() {
                runnable2.run();
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m199549f4(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
        if (m199346Q3(th)) {
            this.f182254o.mo102266b(th, thirdPartyData, runnable, SignInGrantType.get("google"));
        } else {
            l51.m152887G(runnable);
            bsj0.m106246D(th);
        }
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m199550f5(final Runnable runnable, final y20 y20Var, final Runnable runnable2, uxj0 uxj0Var) {
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
        if (TextUtils.isEmpty(this.f182245f) || !m199488H3()) {
            C20102sm.m186696i0(act(), "qq", "", new x20() { // from class: l.myp0
                @Override // p153l.x20
                public final void call() {
                    runnable2.run();
                }
            }, new x20() { // from class: l.nyp0
                @Override // p153l.x20
                public final void call() {
                    y20Var.call(Boolean.TRUE);
                }
            }, new x20() { // from class: l.oyp0
                @Override // p153l.x20
                public final void call() {
                    runnable.run();
                }
            });
        } else {
            C20102sm.m186698j0(act(), "qq", this.f182245f, new x20() { // from class: l.hyp0
                @Override // p153l.x20
                public final void call() {
                    runnable.run();
                }
            }, new x20() { // from class: l.jyp0
                @Override // p153l.x20
                public final void call() {
                    y20Var.call(Boolean.TRUE);
                }
            }, new x20() { // from class: l.kyp0
                @Override // p153l.x20
                public final void call() {
                    runnable2.run();
                }
            }, new x20() { // from class: l.lyp0
                @Override // p153l.x20
                public final void call() {
                    this.f134126a.m199548e5(runnable2, y20Var, runnable);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ void m199551g5(String str, String str2, Runnable runnable, y20 y20Var, Runnable runnable2, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable2.run();
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40020 || i == 40091) {
            m199507P5(i == 40020, str, str2, runnable, y20Var);
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m199552h4(User user) {
        if (C16074bp.m105751f()) {
            return;
        }
        ike.m140276h().m140288o(user);
        m199481E3();
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m199553h5(final Runnable runnable, final String str, final String str2, final Runnable runnable2, final Runnable runnable3, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable.run();
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40033) {
            ((AbstractC19037o6) this.viewModel).mo124211m(false);
            o1j0.m165651y("QQ暂不支持注册");
            return;
        }
        if (i != 40037) {
            runnable.run();
            return;
        }
        AccountModule.f16756c.m29344m2(AccountTempApi.SignUpType.qq);
        final y20 y20Var = new y20() { // from class: l.n3q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140028a.m199546d5((Boolean) obj);
            }
        };
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("qq");
        signInData.thirdPartyId = str;
        signInData.thirdPartyToken = str2;
        signInData.device = tl8.m191616M();
        AccountModule.f16756c.m29348o2(signInData, false, new Runnable() { // from class: l.o3q0
            @Override // java.lang.Runnable
            public final void run() {
                v3q0.m199363W2();
            }
        }).subscribe(psd0.m173600K(new y20() { // from class: l.p3q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150460a.m199550f5(runnable2, y20Var, runnable, (uxj0) obj);
            }
        }, new y20() { // from class: l.q3q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155478a.m199551g5(str, str2, runnable3, y20Var, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ void m199554i5(AccountTestGroup accountTestGroup) {
        if (accountTestGroup.googleEntry) {
            i4g0.m138526x("e_signin_google_button", ((PutongAct) act()).pageId());
            ((AbstractC19037o6) this.viewModel).mo124207k();
        }
    }

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ void m199555j5(AccountTestFactor accountTestFactor) {
        AccountModule.f16756c.m29357t2(accountTestFactor).subscribe(psd0.m173597H(new y20() { // from class: l.v1q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181993a.m199554i5((AccountTestGroup) obj);
            }
        }, new y20() { // from class: l.w1q0
            @Override // p153l.y20
            public final void call(Object obj) {
                v3q0.m199468z0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m199556k4() {
        act().removeCallbacks(this.f182243d);
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m199557k5(SignInData signInData, Runnable runnable) {
        i4g0.m138520r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        m199515S5(signInData, runnable);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m199558l4() {
        if (!m199510R3()) {
            o1j0.m165651y("未安装QQ");
        } else if (m199338O3(act()).isSessionValid()) {
            m199338O3(act()).logout(act());
        } else {
            ((AbstractC19037o6) this.viewModel).mo124211m(true);
            m199338O3(act()).login(act(), "all", this.f182264y);
        }
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m199559l5(View view) {
        i4g0.m138523u("e_switch_account_button", "p_signin_with_saved_info", jyb.m147494Y("switch_account", "close"));
        this.f182236E.dismiss();
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m199560m4() {
        ((AbstractC19037o6) this.viewModel).getAct().progress(R$string.f16946j0);
        ((AbstractC19037o6) this.viewModel).mo124211m(true);
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m199561m5(x20 x20Var, View view) {
        x95.INSTANCE.m209793m("Login", null);
        i4g0.m138520r("e_signin_with_saved_info_button", "p_signin_with_saved_info");
        x20Var.call();
        this.f182236E.dismiss();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m199562n4() {
        ((AbstractC19037o6) this.viewModel).mo124195a();
        ((AbstractC19037o6) this.viewModel).getAct().progressDismiss();
        ((AbstractC19037o6) this.viewModel).mo124211m(false);
        o1j0.m165651y(act().string(R$string.f16980o4));
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m199563n5(View view) {
        i4g0.m138523u("e_switch_account_button", "p_signin_with_saved_info", jyb.m147494Y("switch_account", "signin_another_account"));
        this.f182236E.dismiss();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m199564o4() {
        ((AbstractC19037o6) this.viewModel).getAct().progressDismiss();
        ((AbstractC19037o6) this.viewModel).mo124211m(false);
        o1j0.m165651y("登录失败，绑定手机号后再试");
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ void m199565o5(Runnable runnable, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            ((AbstractC19037o6) this.viewModel).getAct().progressDismiss();
            o1j0.m165638l(((AbstractC19037o6) this.viewModel).getAct().getResources().getString(R$string.f16794G2), false, true);
            if (NullChecker.m82486a(runnable)) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m199566p4() {
        ((AbstractC19037o6) this.viewModel).getAct().progressDismiss();
        ((AbstractC19037o6) this.viewModel).mo124211m(false);
    }

    /* JADX INFO: renamed from: p5 */
    public final /* synthetic */ void m199567p5(uxj0 uxj0Var) {
        m199536Z5();
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169076j(this.f182245f);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ Boolean m199568q4(Runnable runnable, Runnable runnable2, ThirdPartLoginApi.C4725a c4725a) {
        if (c4725a.f17041b != 0) {
            runnable2.run();
            return Boolean.FALSE;
        }
        this.f182259t = true;
        runnable.run();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m199569q5(Runnable runnable, Throwable th) {
        ((AbstractC19037o6) this.viewModel).getAct().progressDismiss();
        o1j0.m165638l(((AbstractC19037o6) this.viewModel).getAct().getResources().getString(R$string.f16794G2), false, true);
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m199570r4(WeChatToken weChatToken, WeChatUserInfo weChatUserInfo) {
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
        m199544c6();
        act().m68056e2();
        bsj0.m106261S(act());
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169076j(this.f182245f);
        }
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ void m199571r5(Runnable runnable, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            ((AbstractC19037o6) this.viewModel).getAct().progressDismiss();
            o1j0.m165638l(((AbstractC19037o6) this.viewModel).getAct().getResources().getString(R$string.f16794G2), false, true);
            if (NullChecker.m82486a(runnable)) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m199572s4(Boolean bool) {
        AuthData authDataMo107143b = AccountModule.f16756c.m29311V0().mo107143b();
        String string = NullChecker.m82486a(authDataMo107143b) ? authDataMo107143b.signupStage.toString() : "";
        Intent intentM29394Z1 = (C16074bp.m105751f() && bool.booleanValue()) ? SignUpAiAct.m29394Z1(act()) : C16330cp.m111720f(((AbstractC19037o6) this.viewModel).getAct(), string);
        if ("verified".equals(string) && !ike.m140276h().m140284j(authDataMo107143b.finishedStages)) {
            f182229J.put(Boolean.FALSE);
        }
        act().startActivity(intentM29394Z1);
        AccountModule.f16758e.m29179h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f182245f);
        m199544c6();
        act().m68056e2();
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169076j(this.f182245f);
        }
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m199573s5(uxj0 uxj0Var) {
        AccountModule.f16756c.m29344m2(AccountTempApi.SignUpType.cosmos);
        m199536Z5();
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169076j(this.f182245f);
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m199574t4(final Runnable runnable, final y20 y20Var, final Runnable runnable2) {
        C20102sm.m186696i0(act(), "wechat", "verified", new x20() { // from class: l.yzp0
            @Override // p153l.x20
            public final void call() {
                runnable.run();
            }
        }, new x20() { // from class: l.zzp0
            @Override // p153l.x20
            public final void call() {
                y20Var.call(Boolean.TRUE);
            }
        }, new x20() { // from class: l.b0q0
            @Override // p153l.x20
            public final void call() {
                runnable2.run();
            }
        });
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ void m199575t5(SignInData signInData, Runnable runnable, Throwable th) {
        int i;
        ((AbstractC19037o6) this.viewModel).getAct().progressDismiss();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((i = ((TantanException.Client.AccountService) th).code) == 40020 || i == 40091)) {
            m199339O5(i == 40020, signInData, runnable);
            return;
        }
        if (!z || ((TantanException.Client.AccountService) th).code != 40016) {
            o1j0.m165638l(((AbstractC19037o6) this.viewModel).getAct().getResources().getString(R$string.f16794G2), false, true);
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
        AccountModule.f16756c.m29324c1().phoneNumber = this.f182245f;
        ((AbstractC19037o6) this.viewModel).getAct().startActivity(SignUpDetailsNewAct.m29496b2(((AbstractC19037o6) this.viewModel).getAct(), signUpData));
        ((AbstractC19037o6) this.viewModel).getAct().progressDismiss();
        ((AbstractC19037o6) this.viewModel).getAct().m68056e2();
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169076j(this.f182245f);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m199576u4(final Runnable runnable, final y20 y20Var, final Runnable runnable2, uxj0 uxj0Var) {
        act().progressDismiss();
        if (C16074bp.m105751f()) {
            if (C4726a.m29232i1()) {
                C4726a.m29219Z1();
                if (TextUtils.isEmpty(this.f182245f) || !m199488H3()) {
                    C20102sm.m186696i0(act(), "wechat", "", new x20() { // from class: l.izp0
                        @Override // p153l.x20
                        public final void call() {
                            runnable2.run();
                        }
                    }, new x20() { // from class: l.jzp0
                        @Override // p153l.x20
                        public final void call() {
                            y20Var.call(Boolean.TRUE);
                        }
                    }, new x20() { // from class: l.kzp0
                        @Override // p153l.x20
                        public final void call() {
                            runnable.run();
                        }
                    });
                    return;
                } else {
                    C20102sm.m186698j0(act(), "wechat", this.f182245f, new x20() { // from class: l.dzp0
                        @Override // p153l.x20
                        public final void call() {
                            runnable.run();
                        }
                    }, new x20() { // from class: l.fzp0
                        @Override // p153l.x20
                        public final void call() {
                            y20Var.call(Boolean.TRUE);
                        }
                    }, new x20() { // from class: l.gzp0
                        @Override // p153l.x20
                        public final void call() {
                            runnable2.run();
                        }
                    }, new x20() { // from class: l.hzp0
                        @Override // p153l.x20
                        public final void call() {
                            this.f112280a.m199574t4(runnable2, y20Var, runnable);
                        }
                    });
                    return;
                }
            }
            y20Var.call(Boolean.FALSE);
        }
        y20Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: u5 */
    public final /* synthetic */ void m199577u5(View view) {
        i4g0.m138520r("e_signin_fb_button", ((PutongAct) act()).pageId());
        if (((AbstractC19037o6) this.viewModel).mo124199e() || !IntlCountryCodeController.m29119p()) {
            this.f182235D.onClick(view);
        } else {
            ((AbstractC19037o6) this.viewModel).mo124203i(this.f182235D, view);
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m199578v4(WeChatToken weChatToken, Runnable runnable, y20 y20Var, Runnable runnable2, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable2.run();
            CrashHelper.m82479c(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40020 || i == 40091) {
            m199512R5(i == 40020, weChatToken, runnable, y20Var);
        } else {
            runnable2.run();
            CrashHelper.m82479c(th);
        }
    }

    /* JADX INFO: renamed from: v5 */
    public final /* synthetic */ void m199579v5(View view) {
        i4g0.m138520r("e_signin_google_button", ((PutongAct) act()).pageId());
        if (((AbstractC19037o6) this.viewModel).mo124199e() || !IntlCountryCodeController.m29119p()) {
            this.f182238G.onClick(view);
        } else {
            ((AbstractC19037o6) this.viewModel).mo124203i(this.f182238G, view);
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m199580w4(final Runnable runnable, final WeChatToken weChatToken, final Runnable runnable2, final Runnable runnable3, Throwable th) {
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
        final y20 y20Var = new y20() { // from class: l.pyp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154684a.m199572s4((Boolean) obj);
            }
        };
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("wechat");
        signInData.thirdPartyId = weChatToken.thirdpartyId;
        signInData.thirdPartyToken = weChatToken.thirdpartyAccessToken;
        signInData.device = tl8.m191616M();
        AccountModule.f16756c.m29348o2(signInData, false, new Runnable() { // from class: l.qyp0
            @Override // java.lang.Runnable
            public final void run() {
                v3q0.m199389f0();
            }
        }).subscribe(psd0.m173600K(new y20() { // from class: l.ryp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165450a.m199576u4(runnable2, y20Var, runnable, (uxj0) obj);
            }
        }, new y20() { // from class: l.syp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171282a.m199578v4(weChatToken, runnable3, y20Var, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: w5 */
    public final /* synthetic */ void m199581w5(String str, uxj0 uxj0Var) {
        uqb0.f180380L.f17865d.m123194i();
        if ("oppo_quick_login".equals(str)) {
            AccountModule.f16756c.m29322b1("user.oppo.signin").subscribe(psd0.m173596G(new y20() { // from class: l.m2q0
                @Override // p153l.y20
                public final void call(Object obj) {
                    v3q0.m199356U1((Envelope) obj);
                }
            }));
        } else {
            str = "saved_sign-in_info";
        }
        i4g0.m138495D("e_signin_success", "", jyb.m147494Y("signin_type", str));
        uqb0.m197269e1(VerifyReason.signin, new Object[0]);
        act().startActivity(AccountModule.m29131H().newMainActClearStack(m99640Y(), false, true));
        m199544c6();
        act().m68056e2();
        bsj0.m106261S(act());
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m199582x4(final Runnable runnable, final Runnable runnable2, final Runnable runnable3, final Runnable runnable4) {
        this.f182263x.registerApp(WXEntryActivity.APPID);
        SendAuth.Req req = new SendAuth.Req();
        req.scope = "snsapi_userinfo";
        req.state = "";
        this.f182263x.sendReq(req);
        runnable.run();
        m199544c6();
        final WeChatToken weChatToken = new WeChatToken();
        this.f182261v = AccountModule.f16758e.m29180i().filter(new qcj() { // from class: l.d3q0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f84932a.m199568q4(runnable, runnable2, (ThirdPartLoginApi.C4725a) obj);
            }
        }).flatMap(new qcj() { // from class: l.e3q0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return AccountModule.f16758e.m29178g(((ThirdPartLoginApi.C4725a) obj).f17042c);
            }
        }).filter(new qcj() { // from class: l.f3q0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return v3q0.m199431o3(weChatToken, runnable2, (WeChatToken) obj);
            }
        }).flatMap(new qcj() { // from class: l.g3q0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                WeChatToken weChatToken2 = (WeChatToken) obj;
                return AccountModule.f16758e.m29184m(weChatToken2.thirdpartyId, weChatToken2.thirdpartyAccessToken, false);
            }
        }).filter(new qcj() { // from class: l.h3q0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return v3q0.m199423m3(runnable2, (ThirdPartVetify) obj);
            }
        }).flatMap(new qcj() { // from class: l.i3q0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                WeChatToken weChatToken2 = weChatToken;
                return AccountModule.f16758e.m29183l(weChatToken2.thirdpartyAccessToken, weChatToken2.thirdpartyId);
            }
        }).filter(new qcj() { // from class: l.k3q0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return v3q0.m199407j0(runnable2, (WeChatUserInfo) obj);
            }
        }).first().subscribe(psd0.m173600K(new y20() { // from class: l.l3q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129901a.m199570r4(weChatToken, (WeChatUserInfo) obj);
            }
        }, new y20() { // from class: l.m3q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134692a.m199580w4(runnable2, weChatToken, runnable3, runnable4, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ void m199583x5(Throwable th) {
        o560.m166092b().m166093a();
        act().progressDismiss();
        Throwable throwable = th instanceof App.HandledGlobally ? ((App.HandledGlobally) th).getThrowable() : th;
        if (!dmk0.m116964c(throwable, ApiExcep.Client.Unauthorized.class) && !dmk0.m116964c(throwable, ApiExcep.Client.NotFound.class)) {
            bsj0.m106246D(th);
        } else {
            o1j0.m165634h(R$string.f16836P);
            m199499L5();
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m199584y4(SignUpData signUpData, String str) {
        signUpData.profilePath = str;
        AccountModule.f16756c.m29306R0().put(str);
        act().startActivity(SignUpDetailsNewAct.m29496b2(act(), signUpData));
    }

    /* JADX INFO: renamed from: y5 */
    public void m199585y5() {
        m199501M5(new x20() { // from class: l.s3q0
            @Override // p153l.x20
            public final void call() {
                this.f166027a.m199558l4();
            }
        }, new e1q0(this));
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m199586z4(final SignUpData signUpData) {
        uqb0.f180374G.m98793i(signUpData.profilePath, new y20() { // from class: l.b1q0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74391a.m199584y4(signUpData, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z5 */
    public void m199587z5() {
        final Runnable runnable = new Runnable() { // from class: l.z1q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f202589a.m199560m4();
            }
        };
        final Runnable runnable2 = new Runnable() { // from class: l.a2q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f68018a.m199562n4();
            }
        };
        final Runnable runnable3 = new Runnable() { // from class: l.b2q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f74648a.m199564o4();
            }
        };
        final Runnable runnable4 = new Runnable() { // from class: l.d2q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f84811a.m199566p4();
            }
        };
        this.f182259t = false;
        m199478D3();
        if (m199513S3()) {
            m199501M5(new x20() { // from class: l.e2q0
                @Override // p153l.x20
                public final void call() {
                    this.f91823a.m199582x4(runnable, runnable2, runnable3, runnable4);
                }
            }, new e1q0(this));
        } else {
            o1j0.m165651y(App.f16088e.getString(R$string.f16950j4));
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.v3q0$a */
    public class C20738a implements IUiListener {
        public C20738a() {
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            v3q0.this.m199497K5();
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            v3q0.this.f182259t = true;
            if (obj == null || !(obj instanceof JSONObject)) {
                v3q0.this.m199497K5();
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            int length = jSONObject.length();
            v3q0 v3q0Var = v3q0.this;
            if (length == 0) {
                v3q0Var.m199497K5();
            } else {
                v3q0Var.m199480D5(jSONObject);
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            v3q0.this.m199497K5();
        }

        @Override // com.tencent.tauth.IUiListener
        public void onWarning(int i) {
        }
    }

    /* JADX INFO: renamed from: l.v3q0$b */
    public class C20739b implements IUiListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AsyncEmitter f182267a;

        public C20739b(AsyncEmitter asyncEmitter) {
            this.f182267a = asyncEmitter;
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            this.f182267a.onError(new IllegalStateException("cancel get qq user info"));
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            if (obj == null) {
                this.f182267a.onError(new IllegalStateException("qq user info null"));
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.length() == 0) {
                this.f182267a.onError(new IllegalStateException("qq user info null"));
                return;
            }
            WeChatUserInfo weChatUserInfoNew_ = WeChatUserInfo.new_();
            try {
                weChatUserInfoNew_.nickname = jSONObject.getString("nickname");
                this.f182267a.onNext(weChatUserInfoNew_);
                this.f182267a.onCompleted();
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                this.f182267a.onError(new IllegalStateException("qq user info parse error"));
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            this.f182267a.onError(new IllegalStateException("error get qq user info" + uiError.errorMessage));
        }

        @Override // com.tencent.tauth.IUiListener
        public void onWarning(int i) {
        }
    }
}
