package p149l;

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
import com.google.android.gms.auth.api.signin.C2081a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.p046p1.mobile.account_core.reponse_data.OneClickStatus;
import com.p046p1.mobile.account_core.request_data.OperatorType;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.api.C4575a;
import com.p046p1.mobile.putong.account.api.ThirdPartLoginApi;
import com.p046p1.mobile.putong.account.data.AccountTestFactor;
import com.p046p1.mobile.putong.account.data.AccountTestGroup;
import com.p046p1.mobile.putong.account.data.MatchCounterEnvelope;
import com.p046p1.mobile.putong.account.data.ThirdPartVetify;
import com.p046p1.mobile.putong.account.data.ThirdPartyData;
import com.p046p1.mobile.putong.account.data.WeChatToken;
import com.p046p1.mobile.putong.account.data.WeChatUserInfo;
import com.p046p1.mobile.putong.account.p050ui.accountai.SignUpAiAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.SignUpDetailsNewAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.PhoneNumberLoginOptAct;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.api.api.FacebookApi;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MobileRespInfo;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.RememberUserInfo;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.SignupStage;
import com.p046p1.mobile.putong.data.ThirdPartyValidation;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.wxapi.WXEntryActivity;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.UserInfo;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.p101mm.opensdk.modelmsg.SendAuth;
import com.tencent.p101mm.opensdk.openapi.IWXAPI;
import com.tencent.p101mm.opensdk.openapi.WXAPIFactory;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;
import java.io.IOException;
import java.util.List;
import org.json.JSONObject;
import p133rx.AsyncEmitter;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class y2q0 extends jq2<AbstractC19863s6> {

    /* JADX INFO: renamed from: G */
    public static boolean f195663G = false;

    /* JADX INFO: renamed from: A */
    public e30<SignUpData> f195664A;

    /* JADX INFO: renamed from: B */
    public d30 f195665B;

    /* JADX INFO: renamed from: C */
    public View.OnClickListener f195666C;

    /* JADX INFO: renamed from: D */
    public dd80 f195667D;

    /* JADX INFO: renamed from: E */
    public d30 f195668E;

    /* JADX INFO: renamed from: F */
    public View.OnClickListener f195669F;

    /* JADX INFO: renamed from: a */
    public boolean f195670a;

    /* JADX INFO: renamed from: b */
    public AccountTempApi.InactiveType f195671b;

    /* JADX INFO: renamed from: c */
    public String f195672c;

    /* JADX INFO: renamed from: d */
    public Runnable f195673d;

    /* JADX INFO: renamed from: e */
    public SignUpData f195674e;

    /* JADX INFO: renamed from: f */
    public String f195675f;

    /* JADX INFO: renamed from: g */
    public OneClickStatus f195676g;

    /* JADX INFO: renamed from: h */
    public boolean f195677h;

    /* JADX INFO: renamed from: i */
    public boolean f195678i;

    /* JADX INFO: renamed from: j */
    public boolean f195679j;

    /* JADX INFO: renamed from: k */
    public C22392a<String> f195680k;

    /* JADX INFO: renamed from: l */
    public View.OnClickListener f195681l;

    /* JADX INFO: renamed from: m */
    public View.OnClickListener f195682m;

    /* JADX INFO: renamed from: n */
    public h30<Throwable, ThirdPartyData, Runnable, SignInGrantType> f195683n;

    /* JADX INFO: renamed from: o */
    public c84 f195684o;

    /* JADX INFO: renamed from: p */
    public AccessToken f195685p;

    /* JADX INFO: renamed from: q */
    public d30 f195686q;

    /* JADX INFO: renamed from: r */
    public d30 f195687r;

    /* JADX INFO: renamed from: s */
    public boolean f195688s;

    /* JADX INFO: renamed from: t */
    public boolean f195689t;

    /* JADX INFO: renamed from: u */
    public c4g0 f195690u;

    /* JADX INFO: renamed from: v */
    public d30 f195691v;

    /* JADX INFO: renamed from: w */
    public IWXAPI f195692w;

    /* JADX INFO: renamed from: x */
    public IUiListener f195693x;

    /* JADX INFO: renamed from: y */
    public int f195694y;

    /* JADX INFO: renamed from: z */
    public d30 f195695z;

    /* JADX INFO: renamed from: l.y2q0$c */
    public class DialogInterfaceOnDismissListenerC21293c implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f195699a;

        public DialogInterfaceOnDismissListenerC21293c(cwf0 cwf0Var) {
            this.f195699a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f195699a);
        }
    }

    /* JADX INFO: renamed from: l.y2q0$d */
    public class DialogInterfaceOnDismissListenerC21294d implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f195701a;

        public DialogInterfaceOnDismissListenerC21294d(cwf0 cwf0Var) {
            this.f195701a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f195701a);
        }
    }

    /* JADX INFO: renamed from: l.y2q0$e */
    public class C21295e implements fuf<czv> {

        /* JADX INFO: renamed from: a */
        public g30<ThirdPartyData, ThirdPartyValidation, SignUpData> f195703a = new g30() { // from class: l.i3q0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                this.f111362a.m212737r((ThirdPartyData) obj, (ThirdPartyValidation) obj2, (SignUpData) obj3);
            }
        };

        public C21295e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: A */
        public /* synthetic */ void m212717A() {
            ((AbstractC19863s6) y2q0.this.viewModel).mo119415q(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: B */
        public /* synthetic */ void m212718B(ThirdPartyData thirdPartyData, SignUpData signUpData) {
            this.f195703a.mo36055a(thirdPartyData, null, signUpData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: C */
        public /* synthetic */ void m212719C(final ThirdPartyData thirdPartyData, final SignUpData signUpData) {
            e51.m114742G(new Runnable() { // from class: l.e3q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89206a.m212718B(thirdPartyData, signUpData);
                }
            });
        }

        /* JADX INFO: renamed from: D */
        private void m212720D(final SignUpData signUpData, final ThirdPartyData thirdPartyData) {
            final Runnable runnable = new Runnable() { // from class: l.b3q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73251a.m212740u();
                }
            };
            signUpData.thirdPartyId = thirdPartyData.thirdPartyId;
            signUpData.thirdPartyToken = thirdPartyData.thirdPartyToken;
            y2q0.this.duringCreated(eje.m116827r(signUpData, null, true)).subscribe(mkd0.m154956H(new e30() { // from class: l.c3q0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f79024a.m212741v(signUpData, (roj0) obj);
                }
            }, new e30() { // from class: l.d3q0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f84250a.m212742w(thirdPartyData, runnable, (Throwable) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ SignUpData m212729j(Throwable th) {
            SignUpData signUpData = new SignUpData();
            signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(App.f15369e);
            signUpData.signUpType = AccountTempApi.SignUpType.facebook;
            return signUpData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public /* synthetic */ void m212736q(ThirdPartyValidation thirdPartyValidation, SignUpData signUpData, ThirdPartyData thirdPartyData, C4319c c4319c) {
            if (NullChecker.m81303a(thirdPartyValidation)) {
                signUpData.thirdPartyValidation = thirdPartyValidation;
            }
            m212720D(signUpData, thirdPartyData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public /* synthetic */ void m212737r(final ThirdPartyData thirdPartyData, final ThirdPartyValidation thirdPartyValidation, final SignUpData signUpData) {
            y2q0.this.lifecycle().filter(new w9j() { // from class: l.k3q0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
                }
            }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.l3q0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f125935a.m212736q(thirdPartyValidation, signUpData, thirdPartyData, (C4319c) obj);
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s */
        public /* synthetic */ void m212738s() {
            ((AbstractC19863s6) y2q0.this.viewModel).mo119415q(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: t */
        public /* synthetic */ void m212739t() {
            ((AbstractC19863s6) y2q0.this.viewModel).mo119415q(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: u */
        public /* synthetic */ void m212740u() {
            ((AbstractC19863s6) y2q0.this.viewModel).mo119415q(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: v */
        public /* synthetic */ void m212741v(SignUpData signUpData, roj0 roj0Var) {
            AccountModule.f16037c.m28305Q0().put(signUpData.name);
            if (NullChecker.m81303a(signUpData.birthdate)) {
                AccountModule.f16037c.m28301O0().put(signUpData.birthdate);
            }
            if (NullChecker.m81303a(signUpData.gender)) {
                AccountModule.f16037c.m28303P0().put(signUpData.gender.toString());
            }
            boolean zIsEmpty = TextUtils.isEmpty(signUpData.profilePath);
            y2q0 y2q0Var = y2q0.this;
            if (zIsEmpty) {
                y2q0Var.act().startActivity(SignUpDetailsNewAct.m28497a2(y2q0.this.act(), signUpData));
            } else {
                y2q0Var.f195664A.call(signUpData);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: w */
        public /* synthetic */ void m212742w(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
            if (y2q0.this.m212480K3(th)) {
                y2q0.this.f195683n.mo105798b(th, thirdPartyData, runnable, SignInGrantType.get("facebook"));
            } else {
                e51.m114742G(runnable);
                yij0.m214926D(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: x */
        public /* synthetic */ void m212743x(Throwable th) {
            y2q0.this.f195687r.call();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: y */
        public /* synthetic */ void m212744y(final ThirdPartyData thirdPartyData, roj0 roj0Var) {
            AccountModule.f16037c.m28319Y1(y2q0.this.f195685p.getUserId(), y2q0.this.f195685p.getToken()).onErrorReturn(new w9j() { // from class: l.m3q0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return y2q0.C21295e.m212729j((Throwable) obj);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.n3q0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f137014a.m212719C(thirdPartyData, (SignUpData) obj);
                }
            }, new e30() { // from class: l.a3q0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f67409a.m212743x((Throwable) obj);
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public /* synthetic */ void m212745z(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
            if (y2q0.this.m212480K3(th)) {
                y2q0.this.f195683n.mo105798b(th, thirdPartyData, runnable, SignInGrantType.get("facebook"));
            } else {
                e51.m114742G(runnable);
                yij0.m214926D(th);
            }
        }

        @Override // p149l.fuf
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void onSuccess(czv czvVar) {
            y2q0.this.f195685p = czvVar.getAccessToken();
            final Runnable runnable = new Runnable() { // from class: l.z2q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f201267a.m212717A();
                }
            };
            final ThirdPartyData thirdPartyDataNew_ = ThirdPartyData.new_();
            thirdPartyDataNew_.thirdPartyId = y2q0.this.f195685p.getUserId();
            thirdPartyDataNew_.thirdPartyToken = y2q0.this.f195685p.getToken();
            AccountModule.f16037c.m28274C2(thirdPartyDataNew_).subscribe(mkd0.m154959K(new e30() { // from class: l.f3q0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f94705a.m212744y(thirdPartyDataNew_, (roj0) obj);
                }
            }, new e30() { // from class: l.g3q0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f100501a.m212745z(thirdPartyDataNew_, runnable, (Throwable) obj);
                }
            }, false));
        }

        @Override // p149l.fuf
        /* JADX INFO: renamed from: a */
        public void mo50769a(FacebookException facebookException) {
            FacebookApi.m29530m(facebookException);
            e51.m114742G(new Runnable() { // from class: l.h3q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f105755a.m212739t();
                }
            });
        }

        @Override // p149l.fuf
        public void onCancel() {
            e51.m114742G(new Runnable() { // from class: l.j3q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f116106a.m212738s();
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.y2q0$f */
    public class DialogInterfaceOnDismissListenerC21296f implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f195705a;

        public DialogInterfaceOnDismissListenerC21296f(cwf0 cwf0Var) {
            this.f195705a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f195705a);
        }
    }

    /* JADX INFO: renamed from: l.y2q0$g */
    public static /* synthetic */ class C21297g {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f195707a;

        static {
            int[] iArr = new int[OperatorType.values().length];
            f195707a = iArr;
            try {
                iArr[OperatorType.china_mobile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f195707a[OperatorType.china_telecom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f195707a[OperatorType.china_unicom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public y2q0(mcr mcrVar) {
        super(mcrVar);
        this.f195670a = false;
        this.f195671b = AccountTempApi.InactiveType.None;
        this.f195672c = "";
        this.f195680k = C22392a.m221512b();
        this.f195681l = new View.OnClickListener() { // from class: l.vyp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183544a.m212455E4(view);
            }
        };
        this.f195682m = new View.OnClickListener() { // from class: l.jzp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120409a.m212459F4(view);
            }
        };
        this.f195683n = new h30() { // from class: l.kzp0
            @Override // p149l.h30
            /* JADX INFO: renamed from: b */
            public final void mo105798b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f125406a.m212690z4((Throwable) obj, (ThirdPartyData) obj2, (Runnable) obj3, (SignInGrantType) obj4);
            }
        };
        this.f195686q = new d30() { // from class: l.lzp0
            @Override // p149l.d30
            public final void call() {
                this.f130668a.m212434A4();
            }
        };
        this.f195687r = new d30() { // from class: l.mzp0
            @Override // p149l.d30
            public final void call() {
                this.f136410a.m212444C4();
            }
        };
        this.f195688s = false;
        this.f195689t = false;
        this.f195691v = new d30() { // from class: l.ozp0
            @Override // p149l.d30
            public final void call() {
                this.f146490a.m212449D4();
            }
        };
        this.f195693x = new C21291a();
        this.f195695z = new d30() { // from class: l.pzp0
            @Override // p149l.d30
            public final void call() {
                this.f151966a.m212466H4();
            }
        };
        this.f195664A = new e30() { // from class: l.qzp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157087a.m212657s4((SignUpData) obj);
            }
        };
        this.f195665B = new d30() { // from class: l.rzp0
            @Override // p149l.d30
            public final void call() {
                this.f161673a.m212662t4();
            }
        };
        this.f195666C = new View.OnClickListener() { // from class: l.szp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167072a.m212667u4(view);
            }
        };
        this.f195668E = new d30() { // from class: l.gzp0
            @Override // p149l.d30
            public final void call() {
                this.f105164a.m212675w4();
            }
        };
        this.f195669F = new View.OnClickListener() { // from class: l.izp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115588a.m212685y4(view);
            }
        };
    }

    /* JADX INFO: renamed from: A3 */
    private void m212433A3() {
        if (this.f195692w == null) {
            this.f195692w = WXAPIFactory.createWXAPI(m142773Y(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m212434A4() {
        this.f195689t = false;
        this.f195688s = false;
        ((AbstractC19863s6) this.viewModel).mo119413p();
    }

    /* JADX INFO: renamed from: B2 */
    public static /* synthetic */ void m212436B2(Runnable runnable, Throwable th) {
        runnable.run();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: B3 */
    private void m212437B3() {
        if (this.f195670a) {
            act().hideInput();
            return;
        }
        act().startActivity(C17367hp.m132321e(act()));
        act().m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public /* synthetic */ void m212438B4() {
        ((AbstractC19863s6) this.viewModel).mo119415q(false);
    }

    /* JADX INFO: renamed from: B5 */
    private void m212439B5() {
        m212445C5(false);
    }

    /* JADX INFO: renamed from: C2 */
    public static /* synthetic */ void m212442C2(SignInGrantType signInGrantType, ThirdPartyData thirdPartyData, final d30 d30Var, final Runnable runnable) {
        SignInData signInData = new SignInData();
        signInData.grantType = signInGrantType;
        signInData.thirdPartyId = thirdPartyData.thirdPartyId;
        signInData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        AccountModule.f16037c.m28349o2(signInData, true, null).subscribe(mkd0.m154956H(new e30() { // from class: l.j2q0
            @Override // p149l.e30
            public final void call(Object obj) {
                y2q0.m212479K2(d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.k2q0
            @Override // p149l.e30
            public final void call(Object obj) {
                y2q0.m212436B2(runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C3 */
    private void m212443C3(Intent intent) throws Throwable {
        try {
            GoogleSignInAccount googleSignInAccountMo15374m = C2081a.m12442b(intent).mo15374m(ApiException.class);
            ((AbstractC19863s6) this.viewModel).mo119392b(false);
            m212697J3(googleSignInAccountMo15374m.m12406g0(), googleSignInAccountMo15374m.m12407h0());
        } catch (ApiException e) {
            if (e.getStatusCode() != 12501) {
                lsi0.m151578h(R$string.f16311y3);
            }
            ((AbstractC19863s6) this.viewModel).mo119392b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public /* synthetic */ void m212444C4() {
        e51.m114742G(new Runnable() { // from class: l.g0q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f100075a.m212438B4();
            }
        });
        if (NullChecker.m81303a(AccessToken.m7408d())) {
            bzv.m104655m().m104682u();
        }
    }

    /* JADX INFO: renamed from: C5 */
    private void m212445C5(boolean z) {
        ((AbstractC19863s6) this.viewModel).mo119408m();
        RememberUserInfo rememberUserInfoMo108248b = qib0.f154697L.f17146d.mo108248b();
        if (NullChecker.m81303a(rememberUserInfoMo108248b) && z) {
            m212473I5(rememberUserInfoMo108248b, act(), new dxp0(this));
        }
        final AccountTestFactor accountTestFactor = new AccountTestFactor();
        accountTestFactor.step = "appOpen";
        accountTestFactor.channel = "googleplay";
        final d30 d30Var = new d30() { // from class: l.tzp0
            @Override // p149l.d30
            public final void call() {
                this.f172749a.m212564c5(accountTestFactor);
            }
        };
        AccountModule.f16037c.m28287H2().subscribe(mkd0.m154956H(new e30() { // from class: l.uzp0
            @Override // p149l.e30
            public final void call(Object obj) {
                d30Var.call();
            }
        }, new e30() { // from class: l.vzp0
            @Override // p149l.e30
            public final void call(Object obj) {
                d30Var.call();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public /* synthetic */ void m212449D4() {
        this.f195689t = true;
        ((AbstractC19863s6) this.viewModel).mo119418u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D5 */
    public void m212450D5() {
        ((AbstractC19863s6) this.viewModel).mo119410n(false);
        lsi0.m151580j("授权失败，请再次尝试");
    }

    /* JADX INFO: renamed from: E3 */
    private void m212454E3(final SignUpData signUpData) {
        C4575a.m28250q2(signUpData, null).subscribe(mkd0.m154956H(new e30() { // from class: l.zxp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205479a.m212509R3(signUpData, (roj0) obj);
            }
        }, new e30() { // from class: l.kyp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125326a.m212514S3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m212455E4(View view) {
        act().startActivity(PhoneNumberLoginOptAct.m28679Y1(act()));
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ Boolean m212456F0(Runnable runnable, WeChatUserInfo weChatUserInfo) {
        if (NullChecker.m81303a(weChatUserInfo)) {
            return Boolean.TRUE;
        }
        runnable.run();
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m212459F4(View view) {
        act().startActivity(PhoneNumberLoginOptAct.m28679Y1(act()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G4 */
    public /* synthetic */ void m212461G4() {
        AuthData authDataMo108248b = AccountModule.f16037c.m28312V0().mo108248b();
        act().startActivity(C17367hp.m132322f(((AbstractC19863s6) this.viewModel).getAct(), NullChecker.m81303a(authDataMo108248b) ? authDataMo108248b.signupStage.toString() : ""));
        AccountModule.f16039e.m28180h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f195675f);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: G5 */
    private void m212462G5(boolean z, final SignInData signInData, final Runnable runnable) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        ((AbstractC19863s6) this.viewModel).getAct().dialog().m20503E0(z ? R$string.f16150V2 : R$string.f16140T2).m20500D(z ? R$string.f16155W2 : R$string.f16145U2).m20556t0(R$string.f16312z, new Runnable() { // from class: l.pxp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f151714a.m212569d5(signInData, runnable);
            }
        }).m20542l0(R$string.f16178b, new Runnable() { // from class: l.qxp0
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.m220396r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
            }
        }).m20526V(new DialogInterfaceOnDismissListenerC21296f(cwf0VarM133794c)).m20568z0();
    }

    /* JADX INFO: renamed from: H5 */
    private void m212467H5(boolean z, final String str, final String str2, final Runnable runnable, final e30<Boolean> e30Var) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        act().dialog().m20503E0(z ? R$string.f16150V2 : R$string.f16140T2).m20500D(z ? R$string.f16155W2 : R$string.f16145U2).m20556t0(R$string.f16312z, new Runnable() { // from class: l.hxp0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m212531W0(str, str2, e30Var, runnable);
            }
        }).m20542l0(R$string.f16178b, new Runnable() { // from class: l.ixp0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m212603j3(runnable);
            }
        }).m20526V(new DialogInterfaceOnDismissListenerC21294d(cwf0VarM133794c)).m20568z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.jxp0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public static Tencent m212471I3(Context context) {
        Tencent.setIsPermissionGranted(true);
        return Tencent.createInstance(xw5.f194697b, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I4 */
    public /* synthetic */ void m212472I4() {
        ((AbstractC19863s6) this.viewModel).mo119392b(false);
    }

    /* JADX INFO: renamed from: I5 */
    private void m212473I5(RememberUserInfo rememberUserInfo, Act act, final d30 d30Var) {
        if (((AbstractC19863s6) this.viewModel).mo119395d()) {
            return;
        }
        if (NullChecker.m81303a(this.f195667D) && this.f195667D.isShowing()) {
            return;
        }
        dd80.C16336a c16336aNewDialog = act.newDialog();
        View viewInflate = act.inflater().inflate(c6c0.f79508k0, (ViewGroup) null);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(q4c0.f152563G);
        VImage vImage = (VImage) viewInflate.findViewById(q4c0.f152597h);
        VButton vButton = (VButton) viewInflate.findViewById(q4c0.f152561E);
        VText vText = (VText) viewInflate.findViewById(q4c0.f152593f);
        VText vText2 = (VText) viewInflate.findViewById(q4c0.f152564H);
        bkb0 bkb0Var = qib0.f154691G;
        String str = rememberUserInfo.imgUrl;
        int i = t100.f167244S;
        bkb0Var.m102325I0(vDraweeView, str, i, i);
        vText2.setText(rememberUserInfo.name);
        vButton.setText(act.getResources().getString(R$string.f16182b3, m212706Q5(rememberUserInfo.name)));
        vText.setText(R$string.f16188c3);
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_signin_with_saved_info", Dialog.class.getName());
        this.f195667D = c16336aNewDialog.m110963R(viewInflate).m110961P(true).m110986o0(new DialogInterface.OnShowListener() { // from class: l.a0q0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.m133797f(cwf0VarM133794c);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.b0q0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110983l0(new DialogInterface.OnCancelListener() { // from class: l.c0q0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zvf0.m220399u("e_switch_account_button", "p_signin_with_saved_info", vwb.m200311Y("switch_account", "close"));
            }
        }).m110989r0();
        vImage.setOnClickListener(new View.OnClickListener() { // from class: l.d0q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83204a.m212575e5(view);
            }
        });
        vButton.setOnClickListener(new View.OnClickListener() { // from class: l.e0q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88666a.m212581f5(d30Var, view);
            }
        });
        vText.setOnClickListener(new View.OnClickListener() { // from class: l.f0q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93999a.m212587g5(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J4 */
    public /* synthetic */ void m212477J4(SignUpData signUpData, roj0 roj0Var) {
        act().startActivity(SignUpDetailsNewAct.m28497a2(act(), signUpData));
    }

    /* JADX INFO: renamed from: J5 */
    private void m212478J5(boolean z, final WeChatToken weChatToken, final Runnable runnable, final e30<Boolean> e30Var) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        act().dialog().m20503E0(z ? R$string.f16150V2 : R$string.f16140T2).m20500D(z ? R$string.f16155W2 : R$string.f16145U2).m20556t0(R$string.f16312z, new Runnable() { // from class: l.lyp0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m212595i1(weChatToken, e30Var, runnable);
            }
        }).m20542l0(R$string.f16178b, new Runnable() { // from class: l.myp0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m212482L0(runnable);
            }
        }).m20526V(new DialogInterfaceOnDismissListenerC21293c(cwf0VarM133794c)).m20568z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.nyp0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
    }

    /* JADX INFO: renamed from: K2 */
    public static /* synthetic */ void m212479K2(d30 d30Var, roj0 roj0Var) {
        tan.m187741b();
        d30Var.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public boolean m212480K3(Throwable th) {
        return NullChecker.m81303a(th) && (th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40037;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K4 */
    public /* synthetic */ void m212481K4(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
        if (m212480K3(th)) {
            this.f195683n.mo105798b(th, thirdPartyData, runnable, SignInGrantType.get("google"));
        } else {
            e51.m114742G(runnable);
            yij0.m214926D(th);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m212482L0(Runnable runnable) {
        zvf0.m220396r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L4 */
    public /* synthetic */ void m212485L4() {
        act().progressDismiss();
        ((AbstractC19863s6) this.viewModel).mo119390a();
        ((AbstractC19863s6) this.viewModel).mo119410n(false);
        lsi0.m151595y("QQ登录失败，请重试");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M4 */
    public /* synthetic */ void m212487M4() {
        ((AbstractC19863s6) this.viewModel).mo119410n(false);
        lsi0.m151595y("登录失败，绑定手机号后再试");
    }

    /* JADX INFO: renamed from: N2 */
    public static /* synthetic */ void m212490N2(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N4 */
    public /* synthetic */ void m212491N4() {
        act().progressDismiss();
        ((AbstractC19863s6) this.viewModel).mo119410n(false);
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m212493O1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public /* synthetic */ void m212494O3(roj0 roj0Var) {
        if (C17133gp.m127319j()) {
            al40.m97271e().m97274h(this.f195675f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O4 */
    public /* synthetic */ C22306c m212495O4(ThirdPartVetify thirdPartVetify) {
        return m212694F3();
    }

    /* JADX INFO: renamed from: P2 */
    public static /* synthetic */ void m212498P2(Envelope envelope) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m212499P3(roj0 roj0Var) {
        if (C17133gp.m127319j()) {
            al40.m97271e().m97274h(this.f195675f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public /* synthetic */ void m212500P4(WeChatUserInfo weChatUserInfo) {
        m212714x5(weChatUserInfo, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q3 */
    public /* synthetic */ void m212504Q3(MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            int i = this.f195694y + 1;
            this.f195694y = i;
            if (i < 5) {
                m212466H4();
            } else {
                ABManager.m29322L().take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.a1q0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f67195a.m212494O3((roj0) obj);
                    }
                }));
                AccountModule.f16039e.m28180h(act(), ThirdPartLoginApi.ReportMobileSource.landing_page, this.f195675f);
            }
        } else {
            this.f195675f = mobileRespInfo.mobileNumber;
            ABManager.m29322L().take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.b1q0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f72620a.m212499P3((roj0) obj);
                }
            }));
            AccountModule.f16039e.m28180h(act(), ThirdPartLoginApi.ReportMobileSource.landing_page, this.f195675f);
        }
        zvf0.m220371D("e_login_phone_acquisition", WXEntryActivity.PID, vwb.m200311Y("get_phone_or_not", !TextUtils.isEmpty(this.f195675f) ? "yes" : "no"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public /* synthetic */ void m212505Q4(WeChatUserInfo weChatUserInfo) {
        m212714x5(weChatUserInfo, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m212509R3(SignUpData signUpData, roj0 roj0Var) {
        if (TEnum.equals(signUpData.gender, "male")) {
            qib0.m174815e1("signup_male_fb", new Object[0]);
        } else if (TEnum.equals(signUpData.gender, "female")) {
            qib0.m174815e1("signup_female_fb", new Object[0]);
        }
        Intent intentNewMainActClearStack = AccountModule.m28132H().newMainActClearStack(m142773Y(), true, false);
        intentNewMainActClearStack.putExtra("from_sign_up", true);
        act().startActivity(intentNewMainActClearStack);
        act().m66873d2();
        yij0.m214941S(act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public /* synthetic */ void m212510R4(final Runnable runnable, final WeChatUserInfo weChatUserInfo, final Runnable runnable2) {
        C16891fo.m122403P(act(), "qq", "verified", new d30() { // from class: l.ayp0
            @Override // p149l.d30
            public final void call() {
                runnable.run();
            }
        }, new d30() { // from class: l.byp0
            @Override // p149l.d30
            public final void call() {
                this.f77955a.m212505Q4(weChatUserInfo);
            }
        }, new d30() { // from class: l.cyp0
            @Override // p149l.d30
            public final void call() {
                runnable2.run();
            }
        });
    }

    /* JADX INFO: renamed from: S2 */
    public static /* synthetic */ void m212513S2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m212514S3(Throwable th) {
        this.f195687r.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m212515S4(WeChatUserInfo weChatUserInfo) {
        m212714x5(weChatUserInfo, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S5 */
    public void m212516S5() {
        ((AbstractC19863s6) this.viewModel).getAct().startActivity(PhoneNumberLoginOptAct.m28679Y1(((AbstractC19863s6) this.viewModel).getAct()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m212519T3(AsyncEmitter asyncEmitter) {
        new UserInfo(act(), m212471I3(act()).getQQToken()).getUserInfo(new C21292b(asyncEmitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4 */
    public /* synthetic */ void m212520T4(final Runnable runnable, final WeChatUserInfo weChatUserInfo, final Runnable runnable2, roj0 roj0Var) {
        act().progressDismiss();
        if (!C17133gp.m127315f()) {
            m212714x5(weChatUserInfo, false);
        } else if (TextUtils.isEmpty(this.f195675f) || !m212692D3()) {
            C16891fo.m122403P(act(), "qq", "", new d30() { // from class: l.wxp0
                @Override // p149l.d30
                public final void call() {
                    runnable2.run();
                }
            }, new d30() { // from class: l.xxp0
                @Override // p149l.d30
                public final void call() {
                    this.f194902a.m212515S4(weChatUserInfo);
                }
            }, new d30() { // from class: l.yxp0
                @Override // p149l.d30
                public final void call() {
                    runnable.run();
                }
            });
        } else {
            C16891fo.m122404Q(act(), "qq", this.f195675f, new d30() { // from class: l.sxp0
                @Override // p149l.d30
                public final void call() {
                    runnable.run();
                }
            }, new d30() { // from class: l.txp0
                @Override // p149l.d30
                public final void call() {
                    this.f172525a.m212500P4(weChatUserInfo);
                }
            }, new d30() { // from class: l.uxp0
                @Override // p149l.d30
                public final void call() {
                    runnable2.run();
                }
            }, new d30() { // from class: l.vxp0
                @Override // p149l.d30
                public final void call() {
                    this.f183470a.m212510R4(runnable2, weChatUserInfo, runnable);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m212524U3(View view) {
        if (((AbstractC19863s6) this.viewModel).mo119396e() || !IntlCountryCodeController.m28120p()) {
            this.f195681l.onClick(view);
        } else {
            ((AbstractC19863s6) this.viewModel).mo119402i(this.f195681l, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public /* synthetic */ void m212525U4(String str, String str2, final Runnable runnable, final Runnable runnable2, final WeChatUserInfo weChatUserInfo) {
        SignUpData signUpData = new SignUpData();
        signUpData.name = weChatUserInfo.nickname;
        signUpData.signUpType = AccountTempApi.SignUpType.qq;
        signUpData.thirdPartyId = str;
        signUpData.thirdPartyToken = str2;
        AccountModule.f16037c.m28337i2(signUpData);
        duringCreated(eje.m116827r(signUpData, null, true)).subscribe(mkd0.m154956H(new e30() { // from class: l.r2q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157432a.m212520T4(runnable, weChatUserInfo, runnable2, (roj0) obj);
            }
        }, new e30() { // from class: l.s2q0
            @Override // p149l.e30
            public final void call(Object obj) {
                y2q0.m212556b2(runnable2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m212529V3(boolean z, final View view) {
        if (z) {
            zvf0.m220396r("e_signin_phone_button", ((PutongAct) act()).pageId());
        }
        m212695F5(new d30() { // from class: l.l1q0
            @Override // p149l.d30
            public final void call() {
                this.f125676a.m212524U3(view);
            }
        }, new l0q0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public /* synthetic */ void m212530V4(Boolean bool) {
        AuthData authDataMo108248b = AccountModule.f16037c.m28312V0().mo108248b();
        String string = NullChecker.m81303a(authDataMo108248b) ? authDataMo108248b.signupStage.toString() : "";
        if (C17133gp.m127315f() && bool.booleanValue()) {
            act().startActivity(SignUpAiAct.m28395Y1(act()));
        } else {
            act().startActivity(C17367hp.m132322f(((AbstractC19863s6) this.viewModel).getAct(), string));
        }
        AccountModule.f16039e.m28180h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f195675f);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m212531W0(String str, String str2, final e30 e30Var, final Runnable runnable) {
        zvf0.m220396r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("qq");
        signInData.thirdPartyId = str;
        signInData.thirdPartyToken = str2;
        AccountModule.f16037c.m28349o2(signInData, true, new Runnable() { // from class: l.xyp0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m212644q2();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.yyp0
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var.call(Boolean.FALSE);
            }
        }, new e30() { // from class: l.zyp0
            @Override // p149l.e30
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m212534W3() {
        ((AbstractC19863s6) this.viewModel).mo119392b(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public /* synthetic */ void m212535W4(final Runnable runnable, final e30 e30Var, final Runnable runnable2) {
        C16891fo.m122403P(act(), "qq", "verified", new d30() { // from class: l.typ0
            @Override // p149l.d30
            public final void call() {
                runnable.run();
            }
        }, new d30() { // from class: l.uyp0
            @Override // p149l.d30
            public final void call() {
                e30Var.call(Boolean.TRUE);
            }
        }, new d30() { // from class: l.wyp0
            @Override // p149l.d30
            public final void call() {
                runnable2.run();
            }
        });
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ Boolean m212536X0(WeChatToken weChatToken, Runnable runnable, WeChatToken weChatToken2) {
        if (!NullChecker.m81303a(weChatToken2) || TextUtils.isEmpty(weChatToken2.thirdpartyId) || TextUtils.isEmpty(weChatToken2.thirdpartyAccessToken)) {
            runnable.run();
            return Boolean.FALSE;
        }
        weChatToken.thirdpartyId = weChatToken2.thirdpartyId;
        weChatToken.thirdpartyAccessToken = weChatToken2.thirdpartyAccessToken;
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m212539X3(ThirdPartyData thirdPartyData, roj0 roj0Var) {
        SignUpData signUpData = new SignUpData();
        signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(App.f15369e);
        signUpData.signUpType = AccountTempApi.SignUpType.google;
        m212668u5(signUpData, thirdPartyData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m212540X4(final Runnable runnable, final e30 e30Var, final Runnable runnable2, roj0 roj0Var) {
        act().progressDismiss();
        if (!C17133gp.m127315f()) {
            e30Var.call(Boolean.FALSE);
            return;
        }
        if (!C4575a.m28233i1()) {
            e30Var.call(Boolean.FALSE);
            return;
        }
        C4575a.m28220Z1();
        if (TextUtils.isEmpty(this.f195675f) || !m212692D3()) {
            C16891fo.m122403P(act(), "qq", "", new d30() { // from class: l.exp0
                @Override // p149l.d30
                public final void call() {
                    runnable2.run();
                }
            }, new d30() { // from class: l.fxp0
                @Override // p149l.d30
                public final void call() {
                    e30Var.call(Boolean.TRUE);
                }
            }, new d30() { // from class: l.gxp0
                @Override // p149l.d30
                public final void call() {
                    runnable.run();
                }
            });
        } else {
            C16891fo.m122404Q(act(), "qq", this.f195675f, new d30() { // from class: l.t2q0
                @Override // p149l.d30
                public final void call() {
                    runnable.run();
                }
            }, new d30() { // from class: l.u2q0
                @Override // p149l.d30
                public final void call() {
                    e30Var.call(Boolean.TRUE);
                }
            }, new d30() { // from class: l.v2q0
                @Override // p149l.d30
                public final void call() {
                    runnable2.run();
                }
            }, new d30() { // from class: l.w2q0
                @Override // p149l.d30
                public final void call() {
                    this.f184278a.m212535W4(runnable2, e30Var, runnable);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public static /* synthetic */ void m212543Y2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public /* synthetic */ void m212544Y3(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
        if (m212480K3(th)) {
            this.f195683n.mo105798b(th, thirdPartyData, runnable, SignInGrantType.get("google"));
        } else {
            e51.m114742G(runnable);
            yij0.m214926D(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y4 */
    public /* synthetic */ void m212545Y4(String str, String str2, Runnable runnable, e30 e30Var, Runnable runnable2, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable2.run();
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40020 || i == 40091) {
            m212467H5(i == 40020, str, str2, runnable, e30Var);
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m212548Z3(Bundle bundle) {
        if (NullChecker.m81303a(act().getSupportActionBar())) {
            act().getSupportActionBar().mo134126m();
        }
        ((AbstractC19863s6) this.viewModel).mo119416r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m212549Z4(final Runnable runnable, final String str, final String str2, final Runnable runnable2, final Runnable runnable3, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable.run();
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40033) {
            ((AbstractC19863s6) this.viewModel).mo119410n(false);
            lsi0.m151595y("QQ暂不支持注册");
            return;
        }
        if (i != 40037) {
            runnable.run();
            return;
        }
        AccountModule.f16037c.m28345m2(AccountTempApi.SignUpType.qq);
        final e30 e30Var = new e30() { // from class: l.n2q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136867a.m212530V4((Boolean) obj);
            }
        };
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("qq");
        signInData.thirdPartyId = str;
        signInData.thirdPartyToken = str2;
        signInData.device = pk8.m169980M();
        AccountModule.f16037c.m28349o2(signInData, false, new Runnable() { // from class: l.o2q0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m212630o0();
            }
        }).subscribe(mkd0.m154959K(new e30() { // from class: l.p2q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146906a.m212540X4(runnable2, e30Var, runnable, (roj0) obj);
            }
        }, new e30() { // from class: l.q2q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152286a.m212545Y4(str, str2, runnable3, e30Var, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m212553a4(User user) {
        if (C17133gp.m127315f()) {
            return;
        }
        eje.m116824h().m116836o(user);
        m212437B3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m212554a5(AccountTestGroup accountTestGroup) {
        if (accountTestGroup.facebookEntry) {
            ((AbstractC19863s6) this.viewModel).mo119403j();
            this.f195665B.call();
        } else {
            this.f195686q.call();
        }
        if (accountTestGroup.googleEntry && C17133gp.m127313d()) {
            zvf0.m220402x("e_signin_google_button", ((PutongAct) act()).pageId());
            ((AbstractC19863s6) this.viewModel).mo119406l();
        }
    }

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ void m212556b2(Runnable runnable, Throwable th) {
        runnable.run();
        CrashHelper.m81296c(new Exception("wechat signup no transition--> message:" + th.getMessage(), th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m212558b4(Throwable th) {
        if ((th instanceof ApiExcep.Client.NotFound) || (th instanceof ApiExcep.Client.Unauthorized) || ((th instanceof App.HandledGlobally) && (((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            eje.m116824h().m116834m();
        } else {
            eje.m116824h().m116830g();
            m212437B3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b5 */
    public /* synthetic */ void m212559b5(Throwable th) {
        this.f195686q.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m212563c4(Bundle bundle) {
        this.f195673d = ((AbstractC19863s6) this.viewModel).mo119393c(this.f195670a);
        m212445C5(this.f195677h);
        if (IntlCountryCodeController.m28113i()) {
            AccountTempApi.InactiveType inactiveType = this.f195671b;
            if (inactiveType == AccountTempApi.InactiveType.Pause) {
                C16891fo.m122407T(act(), act().string(R$string.f16221i0), act().string(R$string.f16215h0), act().string(R$string.f16090J2));
            } else if (inactiveType == AccountTempApi.InactiveType.DeleteImmediately) {
                C16891fo.m122407T(act(), act().string(R$string.f16209g0), this.f195678i ? String.format("%s\n\n%s", act().string(R$string.f16203f0), act().string(R$string.f16239l0)) : act().string(R$string.f16203f0), act().string(R$string.f16090J2));
            }
        }
        if (this.f195671b == AccountTempApi.InactiveType.DeleteImmediately && !TextUtils.isEmpty(this.f195672c) && RemoteConfig.m79298x().m79302F("setting_snail_diversion_config").contains(this.f195672c)) {
            j2e0.m139446m(act(), Uri.parse("tantan://webview?url=".concat(juk.m143323e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/love-snail/index.html?speed=true&_bid=1004028&hideNavigationBar=1&hideNotch=1" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/love-snail/index.html?speed=true&_bid=1004028&hideNavigationBar=1&hideNotch=1")));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c5 */
    public /* synthetic */ void m212564c5(AccountTestFactor accountTestFactor) {
        AccountModule.f16037c.m28358t2(accountTestFactor).subscribe(mkd0.m154956H(new e30() { // from class: l.j1q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115833a.m212554a5((AccountTestGroup) obj);
            }
        }, new e30() { // from class: l.k1q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120640a.m212559b5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m212568d4() {
        act().removeCallbacks(this.f195673d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public /* synthetic */ void m212569d5(SignInData signInData, Runnable runnable) {
        zvf0.m220396r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        m212698K5(signInData, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m212574e4() {
        if (!m212700M3()) {
            lsi0.m151595y("未安装QQ");
        } else if (m212471I3(act()).isSessionValid()) {
            m212471I3(act()).logout(act());
        } else {
            ((AbstractC19863s6) this.viewModel).mo119410n(true);
            m212471I3(act()).login(act(), "all", this.f195693x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e5 */
    public /* synthetic */ void m212575e5(View view) {
        zvf0.m220399u("e_switch_account_button", "p_signin_with_saved_info", vwb.m200311Y("switch_account", "close"));
        this.f195667D.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m212580f4() {
        ((AbstractC19863s6) this.viewModel).getAct().progress(R$string.f16227j0);
        ((AbstractC19863s6) this.viewModel).mo119410n(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f5 */
    public /* synthetic */ void m212581f5(d30 d30Var, View view) {
        zvf0.m220396r("e_signin_with_saved_info_button", "p_signin_with_saved_info");
        d30Var.call();
        this.f195667D.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public /* synthetic */ void m212586g4() {
        ((AbstractC19863s6) this.viewModel).mo119390a();
        ((AbstractC19863s6) this.viewModel).getAct().progressDismiss();
        ((AbstractC19863s6) this.viewModel).mo119410n(false);
        lsi0.m151595y(act().string(R$string.f16261o4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g5 */
    public /* synthetic */ void m212587g5(View view) {
        zvf0.m220399u("e_switch_account_button", "p_signin_with_saved_info", vwb.m200311Y("switch_account", "signin_another_account"));
        this.f195667D.dismiss();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m212588h0(d30 d30Var, roj0 roj0Var) {
        tan.m187741b();
        d30Var.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ void m212592h4() {
        ((AbstractC19863s6) this.viewModel).getAct().progressDismiss();
        ((AbstractC19863s6) this.viewModel).mo119410n(false);
        lsi0.m151595y("登录失败，绑定手机号后再试");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h5 */
    public /* synthetic */ void m212593h5(Runnable runnable, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            ((AbstractC19863s6) this.viewModel).getAct().progressDismiss();
            lsi0.m151582l(((AbstractC19863s6) this.viewModel).getAct().getResources().getString(R$string.f16075G2), false, true);
            if (NullChecker.m81303a(runnable)) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m212595i1(WeChatToken weChatToken, final e30 e30Var, final Runnable runnable) {
        zvf0.m220396r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("wechat");
        signInData.thirdPartyId = weChatToken.thirdpartyId;
        signInData.thirdPartyToken = weChatToken.thirdpartyAccessToken;
        AccountModule.f16037c.m28349o2(signInData, true, new Runnable() { // from class: l.ezp0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m212513S2();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.fzp0
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var.call(Boolean.FALSE);
            }
        }, new e30() { // from class: l.hzp0
            @Override // p149l.e30
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4 */
    public /* synthetic */ void m212598i4() {
        ((AbstractC19863s6) this.viewModel).getAct().progressDismiss();
        ((AbstractC19863s6) this.viewModel).mo119410n(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i5 */
    public /* synthetic */ void m212599i5(roj0 roj0Var) {
        m212707R5();
        if (C17133gp.m127319j()) {
            al40.m97271e().m97276j(this.f195675f);
        }
    }

    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ void m212603j3(Runnable runnable) {
        zvf0.m220396r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ Boolean m212604j4(Runnable runnable, Runnable runnable2, ThirdPartLoginApi.C4574a c4574a) {
        if (c4574a.f16322b != 0) {
            runnable2.run();
            return Boolean.FALSE;
        }
        this.f195688s = true;
        runnable.run();
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j5 */
    public /* synthetic */ void m212605j5(Runnable runnable, Throwable th) {
        ((AbstractC19863s6) this.viewModel).getAct().progressDismiss();
        lsi0.m151582l(((AbstractC19863s6) this.viewModel).getAct().getResources().getString(R$string.f16075G2), false, true);
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m212610k4(WeChatToken weChatToken, WeChatUserInfo weChatUserInfo) {
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
        act().startActivity(SignUpDetailsNewAct.m28497a2(act(), signUpData));
        m212709U5();
        act().m66873d2();
        yij0.m214941S(act());
        if (C17133gp.m127319j()) {
            al40.m97271e().m97276j(this.f195675f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k5 */
    public /* synthetic */ void m212611k5(Runnable runnable, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            ((AbstractC19863s6) this.viewModel).getAct().progressDismiss();
            lsi0.m151582l(((AbstractC19863s6) this.viewModel).getAct().getResources().getString(R$string.f16075G2), false, true);
            if (NullChecker.m81303a(runnable)) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m212615l3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m212616l4(Boolean bool) {
        AuthData authDataMo108248b = AccountModule.f16037c.m28312V0().mo108248b();
        String string = NullChecker.m81303a(authDataMo108248b) ? authDataMo108248b.signupStage.toString() : "";
        Intent intentM28395Y1 = (C17133gp.m127315f() && bool.booleanValue()) ? SignUpAiAct.m28395Y1(act()) : C17367hp.m132322f(((AbstractC19863s6) this.viewModel).getAct(), string);
        if ("verified".equals(string) && !eje.m116824h().m116832j(authDataMo108248b.finishedStages)) {
            rup0.f161084J.put(Boolean.FALSE);
        }
        act().startActivity(intentM28395Y1);
        AccountModule.f16039e.m28180h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f195675f);
        m212709U5();
        act().m66873d2();
        if (C17133gp.m127319j()) {
            al40.m97271e().m97276j(this.f195675f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l5 */
    public /* synthetic */ void m212617l5(roj0 roj0Var) {
        AccountModule.f16037c.m28345m2(AccountTempApi.SignUpType.cosmos);
        m212707R5();
        if (C17133gp.m127319j()) {
            al40.m97271e().m97276j(this.f195675f);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ C22306c m212618m0(SignInData signInData, MobileRespInfo mobileRespInfo) {
        signInData.grantType = mobileRespInfo.grantType;
        signInData.thirdPartyToken = mobileRespInfo.token;
        signInData.thirdPartyAccessCode = mobileRespInfo.accessCode;
        signInData.thirdPartyId = mobileRespInfo.openId;
        return AccountModule.f16037c.m28349o2(signInData, false, new Runnable() { // from class: l.rxp0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m212615l3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m212622m4(final Runnable runnable, final e30 e30Var, final Runnable runnable2) {
        C16891fo.m122403P(act(), "wechat", "verified", new d30() { // from class: l.azp0
            @Override // p149l.d30
            public final void call() {
                runnable.run();
            }
        }, new d30() { // from class: l.bzp0
            @Override // p149l.d30
            public final void call() {
                e30Var.call(Boolean.TRUE);
            }
        }, new d30() { // from class: l.czp0
            @Override // p149l.d30
            public final void call() {
                runnable2.run();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m5 */
    public /* synthetic */ void m212623m5(SignInData signInData, Runnable runnable, Throwable th) {
        int i;
        ((AbstractC19863s6) this.viewModel).getAct().progressDismiss();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((i = ((TantanException.Client.AccountService) th).code) == 40020 || i == 40091)) {
            m212462G5(i == 40020, signInData, runnable);
            return;
        }
        if (!z || ((TantanException.Client.AccountService) th).code != 40016) {
            lsi0.m151582l(((AbstractC19863s6) this.viewModel).getAct().getResources().getString(R$string.f16075G2), false, true);
            if (NullChecker.m81303a(runnable)) {
                runnable.run();
                return;
            }
            return;
        }
        SignUpData signUpData = new SignUpData();
        if (TEnum.equals(signInData.grantType, SignInGrantType.cosmos)) {
            signUpData.signUpType = AccountTempApi.SignUpType.cosmos;
        }
        AccountModule.f16037c.m28337i2(signUpData);
        AccountModule.f16037c.m28325c1().phoneNumber = this.f195675f;
        ((AbstractC19863s6) this.viewModel).getAct().startActivity(SignUpDetailsNewAct.m28497a2(((AbstractC19863s6) this.viewModel).getAct(), signUpData));
        ((AbstractC19863s6) this.viewModel).getAct().progressDismiss();
        ((AbstractC19863s6) this.viewModel).getAct().m66873d2();
        if (C17133gp.m127319j()) {
            al40.m97271e().m97276j(this.f195675f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m212628n4(final Runnable runnable, final e30 e30Var, final Runnable runnable2, roj0 roj0Var) {
        act().progressDismiss();
        if (C17133gp.m127315f()) {
            if (C4575a.m28233i1()) {
                C4575a.m28220Z1();
                if (TextUtils.isEmpty(this.f195675f) || !m212692D3()) {
                    C16891fo.m122403P(act(), "wechat", "", new d30() { // from class: l.hyp0
                        @Override // p149l.d30
                        public final void call() {
                            runnable2.run();
                        }
                    }, new d30() { // from class: l.iyp0
                        @Override // p149l.d30
                        public final void call() {
                            e30Var.call(Boolean.TRUE);
                        }
                    }, new d30() { // from class: l.jyp0
                        @Override // p149l.d30
                        public final void call() {
                            runnable.run();
                        }
                    });
                    return;
                } else {
                    C16891fo.m122404Q(act(), "wechat", this.f195675f, new d30() { // from class: l.dyp0
                        @Override // p149l.d30
                        public final void call() {
                            runnable.run();
                        }
                    }, new d30() { // from class: l.eyp0
                        @Override // p149l.d30
                        public final void call() {
                            e30Var.call(Boolean.TRUE);
                        }
                    }, new d30() { // from class: l.fyp0
                        @Override // p149l.d30
                        public final void call() {
                            runnable2.run();
                        }
                    }, new d30() { // from class: l.gyp0
                        @Override // p149l.d30
                        public final void call() {
                            this.f105028a.m212622m4(runnable2, e30Var, runnable);
                        }
                    });
                    return;
                }
            }
            e30Var.call(Boolean.FALSE);
        }
        e30Var.call(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n5 */
    public /* synthetic */ void m212629n5(View view) {
        zvf0.m220396r("e_signin_fb_button", ((PutongAct) act()).pageId());
        if (((AbstractC19863s6) this.viewModel).mo119396e() || !IntlCountryCodeController.m28120p()) {
            this.f195666C.onClick(view);
        } else {
            ((AbstractC19863s6) this.viewModel).mo119402i(this.f195666C, view);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m212630o0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ void m212634o4(WeChatToken weChatToken, Runnable runnable, e30 e30Var, Runnable runnable2, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable2.run();
            CrashHelper.m81296c(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40020 || i == 40091) {
            m212478J5(i == 40020, weChatToken, runnable, e30Var);
        } else {
            runnable2.run();
            CrashHelper.m81296c(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o5 */
    public /* synthetic */ void m212635o5(View view) {
        zvf0.m220396r("e_signin_google_button", ((PutongAct) act()).pageId());
        this.f195669F.onClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m212640p4(final Runnable runnable, final WeChatToken weChatToken, final Runnable runnable2, final Runnable runnable3, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable.run();
            CrashHelper.m81296c(th);
            return;
        }
        if (((TantanException.Client.AccountService) th).code != 40037) {
            runnable.run();
            return;
        }
        AccountModule.f16037c.m28345m2(AccountTempApi.SignUpType.wechat);
        if (TextUtils.isEmpty(weChatToken.thirdpartyId) || TextUtils.isEmpty(weChatToken.thirdpartyAccessToken)) {
            runnable.run();
            CrashHelper.m81296c(th);
            return;
        }
        final e30 e30Var = new e30() { // from class: l.kxp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125152a.m212616l4((Boolean) obj);
            }
        };
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("wechat");
        signInData.thirdPartyId = weChatToken.thirdpartyId;
        signInData.thirdPartyToken = weChatToken.thirdpartyAccessToken;
        signInData.device = pk8.m169980M();
        AccountModule.f16037c.m28349o2(signInData, false, new Runnable() { // from class: l.lxp0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m212493O1();
            }
        }).subscribe(mkd0.m154959K(new e30() { // from class: l.mxp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136193a.m212628n4(runnable2, e30Var, runnable, (roj0) obj);
            }
        }, new e30() { // from class: l.nxp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141039a.m212634o4(weChatToken, runnable3, e30Var, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public /* synthetic */ void m212641p5(String str, roj0 roj0Var) {
        qib0.f154697L.f17146d.m108250i();
        if ("oppo_quick_login".equals(str)) {
            AccountModule.f16037c.m28323b1("user.oppo.signin").subscribe(mkd0.m154955G(new e30() { // from class: l.z0q0
                @Override // p149l.e30
                public final void call(Object obj) {
                    y2q0.m212498P2((Envelope) obj);
                }
            }));
        } else {
            str = "saved_sign-in_info";
        }
        zvf0.m220371D("e_signin_success", "", vwb.m200311Y("signin_type", str));
        qib0.m174815e1(VerifyReason.signin, new Object[0]);
        act().startActivity(AccountModule.m28132H().newMainActClearStack(m142773Y(), false, true));
        m212709U5();
        act().m66873d2();
        yij0.m214941S(act());
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ void m212644q2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public /* synthetic */ void m212646q4(final Runnable runnable, final Runnable runnable2, final Runnable runnable3, final Runnable runnable4) {
        this.f195692w.registerApp(WXEntryActivity.APPID);
        SendAuth.Req req = new SendAuth.Req();
        req.scope = "snsapi_userinfo";
        req.state = "";
        this.f195692w.sendReq(req);
        runnable.run();
        m212709U5();
        final WeChatToken weChatToken = new WeChatToken();
        this.f195690u = AccountModule.f16039e.m28181i().filter(new w9j() { // from class: l.s1q0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f161928a.m212604j4(runnable, runnable2, (ThirdPartLoginApi.C4574a) obj);
            }
        }).flatMap(new w9j() { // from class: l.t1q0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return AccountModule.f16039e.m28179g(((ThirdPartLoginApi.C4574a) obj).f16323c);
            }
        }).filter(new w9j() { // from class: l.u1q0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return y2q0.m212536X0(weChatToken, runnable2, (WeChatToken) obj);
            }
        }).flatMap(new w9j() { // from class: l.v1q0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                WeChatToken weChatToken2 = (WeChatToken) obj;
                return AccountModule.f16039e.m28185m(weChatToken2.thirdpartyId, weChatToken2.thirdpartyAccessToken, false);
            }
        }).filter(new w9j() { // from class: l.w1q0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return y2q0.m212677x0(runnable2, (ThirdPartVetify) obj);
            }
        }).flatMap(new w9j() { // from class: l.x1q0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                WeChatToken weChatToken2 = weChatToken;
                return AccountModule.f16039e.m28184l(weChatToken2.thirdpartyAccessToken, weChatToken2.thirdpartyId);
            }
        }).filter(new w9j() { // from class: l.y1q0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return y2q0.m212456F0(runnable2, (WeChatUserInfo) obj);
            }
        }).first().subscribe(mkd0.m154959K(new e30() { // from class: l.z1q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201090a.m212610k4(weChatToken, (WeChatUserInfo) obj);
            }
        }, new e30() { // from class: l.a2q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67278a.m212640p4(runnable2, weChatToken, runnable3, runnable4, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q5 */
    public /* synthetic */ void m212647q5(Throwable th) {
        ix50.m138790b().m138791a();
        act().progressDismiss();
        Throwable throwable = th instanceof App.HandledGlobally ? ((App.HandledGlobally) th).getThrowable() : th;
        if (!xck0.m208122c(throwable, ApiExcep.Client.Unauthorized.class) && !xck0.m208122c(throwable, ApiExcep.Client.NotFound.class)) {
            yij0.m214926D(th);
        } else {
            lsi0.m151578h(R$string.f16117P);
            m212693E5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public /* synthetic */ void m212652r4(SignUpData signUpData, String str) {
        signUpData.profilePath = str;
        AccountModule.f16037c.m28307R0().put(str);
        act().startActivity(SignUpDetailsNewAct.m28497a2(act(), signUpData));
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m212653s0(MatchCounterEnvelope matchCounterEnvelope) {
        long j = matchCounterEnvelope.totalCounters.matches;
        if (j > 0) {
            AccountModule.f16037c.f16329j.put(Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m212657s4(final SignUpData signUpData) {
        qib0.f154691G.m184720i(signUpData.profilePath, new e30() { // from class: l.v0q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179137a.m212652r4(signUpData, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t2 */
    public static /* synthetic */ C22306c m212660t2(SignInData signInData, MobileRespInfo mobileRespInfo) {
        signInData.grantType = mobileRespInfo.grantType;
        signInData.thirdPartyToken = mobileRespInfo.token;
        signInData.thirdPartyAccessCode = mobileRespInfo.accessCode;
        signInData.thirdPartyId = mobileRespInfo.openId;
        return AccountModule.f16037c.m28349o2(signInData, true, new Runnable() { // from class: l.dzp0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m212670v2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public /* synthetic */ void m212662t4() {
        ((AbstractC19863s6) this.viewModel).mo119404k();
        zvf0.m220402x("e_signin_fb_button", ((PutongAct) act()).pageId());
        this.f195684o = c84.C16094b.m105650a();
        bzv.m104655m().m104685y(this.f195684o, new C21295e());
        ((AbstractC19863s6) this.viewModel).mo119417s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m212667u4(View view) {
        ((AbstractC19863s6) this.viewModel).mo119415q(true);
        bzv.m104655m().m104682u();
        bzv.m104655m().m104681t(act(), FacebookApi.f17152d);
    }

    /* JADX INFO: renamed from: u5 */
    private void m212668u5(final SignUpData signUpData, final ThirdPartyData thirdPartyData) {
        final Runnable runnable = new Runnable() { // from class: l.wzp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f188757a.m212472I4();
            }
        };
        signUpData.thirdPartyId = thirdPartyData.thirdPartyId;
        signUpData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        signUpData.signUpType = AccountTempApi.SignUpType.google;
        duringCreated(eje.m116827r(signUpData, null, true)).subscribe(mkd0.m154956H(new e30() { // from class: l.xzp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195217a.m212477J4(signUpData, (roj0) obj);
            }
        }, new e30() { // from class: l.zzp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205814a.m212481K4(thirdPartyData, runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v2 */
    public static /* synthetic */ void m212670v2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public /* synthetic */ void m212672v4() {
        ((AbstractC19863s6) this.viewModel).mo119419v();
        SignInData signInData = new SignInData();
        signInData.device = pk8.m169980M();
        m212699L5(signInData, new Runnable() { // from class: l.y0q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f195323a.m212516S5();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public /* synthetic */ void m212675w4() {
        m212695F5(new d30() { // from class: l.k0q0
            @Override // p149l.d30
            public final void call() {
                this.f120510a.m212672v4();
            }
        }, new l0q0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w5 */
    public void m212676w5(JSONObject jSONObject) {
        Exception exc;
        String string;
        String string2;
        ((AbstractC19863s6) this.viewModel).mo119410n(true);
        final Runnable runnable = new Runnable() { // from class: l.c1q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f78294a.m212485L4();
            }
        };
        final Runnable runnable2 = new Runnable() { // from class: l.d1q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f83287a.m212487M4();
            }
        };
        final Runnable runnable3 = new Runnable() { // from class: l.e1q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f88842a.m212491N4();
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
                    CrashHelper.m81296c(exc);
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
        m212471I3(act()).setAccessToken(str, string3);
        m212471I3(act()).setOpenId(str2);
        AccountModule.f16039e.m28185m(str2, str, true).first().flatMap(new w9j() { // from class: l.g1q0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f100195a.m212495O4((ThirdPartVetify) obj);
            }
        }).first().subscribe(mkd0.m154959K(new e30() { // from class: l.h1q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105449a.m212525U4(str2, str, runnable2, runnable, (WeChatUserInfo) obj);
            }
        }, new e30() { // from class: l.i1q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110486a.m212549Z4(runnable, str2, str, runnable2, runnable3, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ Boolean m212677x0(Runnable runnable, ThirdPartVetify thirdPartVetify) {
        if (NullChecker.m81303a(thirdPartVetify) && thirdPartVetify.code == 200) {
            return Boolean.TRUE;
        }
        runnable.run();
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m212681x4(final SignInGrantType signInGrantType, final ThirdPartyData thirdPartyData, final d30 d30Var, final Runnable runnable, Throwable th, Throwable th2) {
        if (!(th2 instanceof TantanException.Client.AccountService)) {
            runnable.run();
            yij0.m214926D(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th2).code;
        if (i == 40020 || i == 40091) {
            boolean z = i == 40020;
            act().dialog().m20503E0(z ? R$string.f16150V2 : R$string.f16140T2).m20500D(z ? R$string.f16155W2 : R$string.f16145U2).m20556t0(R$string.f16312z, new Runnable() { // from class: l.w0q0
                @Override // java.lang.Runnable
                public final void run() {
                    y2q0.m212442C2(signInGrantType, thirdPartyData, d30Var, runnable);
                }
            }).m20542l0(R$string.f16178b, runnable).m20568z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.x0q0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    runnable.run();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m212685y4(View view) {
        ((AbstractC19863s6) this.viewModel).mo119392b(true);
        p4k p4kVarM12441a = C2081a.m12441a(m142773Y(), new GoogleSignInOptions.C2080a(GoogleSignInOptions.DEFAULT_SIGN_IN).m12434b().m12436d("218526224262-usliqg20cepnb3ql98amgeum18v8uatv.apps.googleusercontent.com").m12433a());
        p4kVarM12441a.m167392d();
        act().startActivityForResult(p4kVarM12441a.m167390b(), ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z3, reason: merged with bridge method [inline-methods] */
    public void m212466H4() {
        duringCreated(new v9j() { // from class: l.s0q0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ChinaMobileController.m29593b().m29601i(5000);
            }
        }, false).subscribe(mkd0.m154955G(new e30() { // from class: l.t0q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167205a.m212504Q3((MobileRespInfo) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public /* synthetic */ void m212690z4(final Throwable th, final ThirdPartyData thirdPartyData, final Runnable runnable, final SignInGrantType signInGrantType) {
        SignInData signInData = new SignInData();
        signInData.grantType = signInGrantType;
        signInData.thirdPartyId = thirdPartyData.thirdPartyId;
        signInData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        final d30 d30Var = new d30() { // from class: l.p0q0
            @Override // p149l.d30
            public final void call() {
                this.f146615a.m212461G4();
            }
        };
        AccountModule.f16037c.m28349o2(signInData, false, null).subscribe(mkd0.m154956H(new e30() { // from class: l.q0q0
            @Override // p149l.e30
            public final void call(Object obj) {
                y2q0.m212588h0(d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.r0q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157189a.m212681x4(signInGrantType, thirdPartyData, d30Var, runnable, th, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A5 */
    public void m212691A5() {
        this.f195668E.call();
    }

    /* JADX INFO: renamed from: D3 */
    public boolean m212692D3() {
        OperatorType operatorTypeM101759c;
        if (this.f195676g == null || (operatorTypeM101759c = AccountModule.f16038d.f183283a.m101759c()) == null) {
            return true;
        }
        int i = C21297g.f195707a[operatorTypeM101759c.ordinal()];
        if (i == 1 || i == 2) {
            return this.f195676g.chinaMobile;
        }
        if (i != 3) {
            return true;
        }
        return this.f195676g.chinaUnicom;
    }

    /* JADX INFO: renamed from: E5 */
    public void m212693E5() {
        qib0.f154697L.f17146d.m108250i();
        m212439B5();
    }

    /* JADX INFO: renamed from: F3 */
    public C22306c<WeChatUserInfo> m212694F3() {
        return C22306c.fromAsync(new e30() { // from class: l.l2q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125804a.m212519T3((AsyncEmitter) obj);
            }
        }, AsyncEmitter.BackpressureMode.LATEST);
    }

    /* JADX INFO: renamed from: F5 */
    public void m212695F5(d30 d30Var, d30 d30Var2) {
        if (d30Var2 != null) {
            d30Var2.call();
        }
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: H3 */
    public View.OnClickListener m212696H3(final boolean z) {
        return new View.OnClickListener() { // from class: l.h0q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105236a.m212529V3(z, view);
            }
        };
    }

    /* JADX INFO: renamed from: J3 */
    public void m212697J3(String str, String str2) {
        final Runnable runnable = new Runnable() { // from class: l.nzp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f141246a.m212534W3();
            }
        };
        final ThirdPartyData thirdPartyDataNew_ = ThirdPartyData.new_();
        thirdPartyDataNew_.thirdPartyId = str;
        thirdPartyDataNew_.thirdPartyToken = str2;
        duringCreated(AccountModule.f16037c.m28276D2(thirdPartyDataNew_)).subscribe(mkd0.m154959K(new e30() { // from class: l.yzp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200906a.m212539X3(thirdPartyDataNew_, (roj0) obj);
            }
        }, new e30() { // from class: l.j0q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115702a.m212544Y3(thirdPartyDataNew_, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: K5 */
    public void m212698K5(final SignInData signInData, final Runnable runnable) {
        ((AbstractC19863s6) this.viewModel).getAct().progress(R$string.f16227j0, true);
        ((AbstractC19863s6) this.viewModel).getAct().duringCreated((C22306c) ChinaMobileController.m29593b().m29600h(5000).doOnNext(new e30() { // from class: l.oyp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146337a.m212593h5(runnable, (MobileRespInfo) obj);
            }
        }).filter(new w9j() { // from class: l.pyp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new w9j() { // from class: l.qyp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return y2q0.m212660t2(signInData, (MobileRespInfo) obj);
            }
        }), false).subscribe(mkd0.m154956H(new e30() { // from class: l.ryp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161577a.m212599i5((roj0) obj);
            }
        }, new e30() { // from class: l.syp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166972a.m212605j5(runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L5 */
    public void m212699L5(final SignInData signInData, final Runnable runnable) {
        ((AbstractC19863s6) this.viewModel).getAct().progress(R$string.f16227j0, true);
        ((AbstractC19863s6) this.viewModel).getAct().duringCreated((C22306c) ChinaMobileController.m29593b().m29600h(5000).doOnNext(new e30() { // from class: l.d2q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83424a.m212611k5(runnable, (MobileRespInfo) obj);
            }
        }).filter(new w9j() { // from class: l.e2q0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new w9j() { // from class: l.f2q0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return y2q0.m212618m0(signInData, (MobileRespInfo) obj);
            }
        }), false).subscribe(mkd0.m154959K(new e30() { // from class: l.g2q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100281a.m212617l5((roj0) obj);
            }
        }, new e30() { // from class: l.h2q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105548a.m212623m5(signInData, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: M3 */
    public boolean m212700M3() {
        try {
            return act().getPackageManager().getPackageInfo("com.tencent.mobileqq", 0) != null;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: M5 */
    public View.OnClickListener m212701M5() {
        return new View.OnClickListener() { // from class: l.i0q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110371a.m212629n5(view);
            }
        };
    }

    /* JADX INFO: renamed from: N3 */
    public boolean m212702N3() {
        m212433A3();
        return this.f195692w.isWXAppInstalled();
    }

    /* JADX INFO: renamed from: N5 */
    public View.OnClickListener m212703N5() {
        return new View.OnClickListener() { // from class: l.c2q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78377a.m212635o5(view);
            }
        };
    }

    /* JADX INFO: renamed from: O5 */
    public void m212704O5() {
        m212705P5(null, null);
    }

    /* JADX INFO: renamed from: P5 */
    public void m212705P5(RememberUserInfo rememberUserInfo, final String str) {
        act().progress(R$string.f16227j0);
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("unknown_");
        AccountModule.f16037c.m28347n2(signInData, rememberUserInfo, false, new Runnable() { // from class: l.m0q0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m212543Y2();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.n0q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136580a.m212641p5(str, (roj0) obj);
            }
        }, new e30() { // from class: l.o0q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141357a.m212647q5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q5 */
    public String m212706Q5(String str) {
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
    public void m212707R5() {
        SignupStage signupStage = AccountModule.f16037c.m28312V0().mo108248b().signupStage;
        Intent intentM132322f = !TEnum.equals(signupStage, "unknown_") ? C17367hp.m132322f(act(), signupStage.toString()) : AccountModule.m28132H().toNewMainAct(act(), false, true);
        ((AbstractC19863s6) this.viewModel).getAct().progressDismiss();
        ((AbstractC19863s6) this.viewModel).getAct().startActivity(intentM132322f);
        ((AbstractC19863s6) this.viewModel).getAct().m66873d2();
    }

    /* JADX INFO: renamed from: T5 */
    public void m212708T5() {
        sh50.m184161f();
        if (App.f15373i.get().intValue() != 1 || f195663G) {
            return;
        }
        f195663G = true;
        if (!ruk.m180873g() || !ruk.m180872c().m180879h()) {
            if (TextUtils.isEmpty(mr4.f135329a) || !mr4.f135329a.toLowerCase().startsWith("douyin")) {
                zvf0.m220371D("e_app_1st_open", "", new j760("is_first_open", Boolean.valueOf(this.f195679j)), new j760("user_agent", bjp0.getDefaultUserAgent(App.f15369e)), new j760("device_model_raw", Build.MODEL), new j760(Device.IMEI, dyd.m114059e()), new j760("imei2", dyd.m114060f()), new j760(Device.OAID, k200.m144241b()), new j760(Device.MEID, dyd.m114061g()));
                return;
            } else {
                zvf0.m220371D("e_app_1st_open", "", new j760("is_first_open", Boolean.valueOf(this.f195679j)), new j760("user_agent", bjp0.getDefaultUserAgent(App.f15369e)), new j760("device_model_raw", Build.MODEL), vwb.m200311Y("toutiao_channel", HumeSDK.getChannel(App.f15369e)), new j760(Device.IMEI, dyd.m114059e()), new j760("imei2", dyd.m114060f()), new j760(Device.OAID, k200.m144241b()), new j760(Device.MEID, dyd.m114061g()));
                return;
            }
        }
        zvf0.m220371D("e_app_1st_open", "", new j760("is_first_open", Boolean.valueOf(this.f195679j)), new j760("package_name", act().getPackageName()), new j760("referrer", ruk.m180872c().m180876d()), new j760("click_time", ruk.m180872c().m180874a()), new j760("install_time", ruk.m180872c().m180875b()), new j760("track", ruk.m180872c().m180877e()), new j760("user_agent", bjp0.getDefaultUserAgent(App.f15369e)), new j760("device_model_raw", Build.MODEL), new j760(Device.IMEI, dyd.m114059e()), new j760("imei2", dyd.m114060f()), new j760(Device.OAID, k200.m144241b()), new j760(Device.MEID, dyd.m114061g()));
        boolean z = nxv.f141053a;
        ruk.m180872c().m180876d();
        ruk.m180872c().m180874a();
        ruk.m180872c().m180875b();
        ruk.m180872c().m180877e();
    }

    /* JADX INFO: renamed from: U5 */
    public void m212709U5() {
        if (!NullChecker.m81303a(this.f195690u) || this.f195690u.isUnsubscribed()) {
            return;
        }
        this.f195690u.unsubscribe();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.u0q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172936a.m212548Z3((Bundle) obj);
            }
        });
        String str = eje.m116824h().f91713a.get();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(AccountModule.m28131F().userId()) && !"finished".equals(str) && !"unknown_".equals(str)) {
            duringCreated(AccountModule.f16037c.m28318Y0()).subscribe(mkd0.m154956H(new e30() { // from class: l.f1q0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f94111a.m212553a4((User) obj);
                }
            }, new e30() { // from class: l.q1q0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f152158a.m212558b4((Throwable) obj);
                }
            }));
        }
        qib0.f154687E.m78868t();
        creates(new e30() { // from class: l.b2q0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72713a.m212563c4((Bundle) obj);
            }
        }, new d30() { // from class: l.m2q0
            @Override // p149l.d30
            public final void call() {
                this.f130938a.m212568d4();
            }
        });
        AccountModule.f16040f.m95181k();
    }

    /* JADX INFO: renamed from: r5 */
    public void m212710r5() {
        m212695F5(new d30() { // from class: l.i2q0
            @Override // p149l.d30
            public final void call() {
                this.f110577a.m212574e4();
            }
        }, new l0q0(this));
    }

    /* JADX INFO: renamed from: s5 */
    public void m212711s5() {
        final Runnable runnable = new Runnable() { // from class: l.m1q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f130849a.m212580f4();
            }
        };
        final Runnable runnable2 = new Runnable() { // from class: l.n1q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f136682a.m212586g4();
            }
        };
        final Runnable runnable3 = new Runnable() { // from class: l.o1q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f141471a.m212592h4();
            }
        };
        final Runnable runnable4 = new Runnable() { // from class: l.p1q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f146757a.m212598i4();
            }
        };
        this.f195688s = false;
        m212433A3();
        if (m212702N3()) {
            m212695F5(new d30() { // from class: l.r1q0
                @Override // p149l.d30
                public final void call() {
                    this.f157321a.m212646q4(runnable, runnable2, runnable3, runnable4);
                }
            }, new l0q0(this));
        } else {
            lsi0.m151595y(App.f15369e.getString(R$string.f16231j4));
        }
    }

    /* JADX INFO: renamed from: t5 */
    public void m212712t5(int i, int i2, Intent intent) {
        if (i == 9001) {
            m212443C3(intent);
        }
        if (NullChecker.m81303a(this.f195684o)) {
            this.f195684o.mo8661a(i, i2, intent);
        }
        if (i == 786 && i2 == 0) {
            this.f195687r.call();
        }
        if (i == 11101) {
            Tencent.onActivityResultData(i, i2, intent, this.f195693x);
        }
    }

    /* JADX INFO: renamed from: v5 */
    public void m212713v5(List<Media> list) {
        if (list.size() > 0 && (list.get(0) instanceof Picture) && NullChecker.m81305c(this.f195674e, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            pgm pgmVar = new pgm(rhi.m179382z(list.get(0).url), TXEAudioDef.TXE_OPUS_SAMPLE_NUM);
            try {
                this.f195674e.profilePath = pgmVar.m168764d();
                m212454E3(this.f195674e);
            } catch (IOException e) {
                CrashHelper.m81296c(e);
                this.f195687r.call();
            }
        }
    }

    /* JADX INFO: renamed from: x5 */
    public void m212714x5(WeChatUserInfo weChatUserInfo, boolean z) {
        AccountModule.f16039e.m28180h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f195675f);
        if (z) {
            rup0.f161084J.put(Boolean.FALSE);
        }
        AccountModule.f16037c.m28290I2().put(weChatUserInfo.nickname);
        act().startActivity(C17367hp.m132321e(((AbstractC19863s6) this.viewModel).getAct()));
    }

    /* JADX INFO: renamed from: y5 */
    public void m212715y5() {
        RememberUserInfo rememberUserInfoMo108248b = qib0.f154697L.f17146d.mo108248b();
        if (NullChecker.m81303a(rememberUserInfoMo108248b)) {
            m212473I5(rememberUserInfoMo108248b, act(), new dxp0(this));
        }
    }

    /* JADX INFO: renamed from: z5 */
    public void m212716z5() {
        if (this.f195689t) {
            if (!this.f195688s) {
                ((AbstractC19863s6) this.viewModel).mo119410n(false);
            }
            this.f195688s = false;
        }
        duringCreated(AccountModule.f16037c.m28316X0()).subscribe(mkd0.m154956H(new e30() { // from class: l.x2q0
            @Override // p149l.e30
            public final void call(Object obj) {
                y2q0.m212653s0((MatchCounterEnvelope) obj);
            }
        }, new e30() { // from class: l.oxp0
            @Override // p149l.e30
            public final void call(Object obj) {
                y2q0.m212490N2((Throwable) obj);
            }
        }));
        ((AbstractC19863s6) this.viewModel).mo119398f();
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.y2q0$a */
    public class C21291a implements IUiListener {
        public C21291a() {
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            y2q0.this.m212450D5();
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            y2q0.this.f195688s = true;
            if (obj == null || !(obj instanceof JSONObject)) {
                y2q0.this.m212450D5();
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            int length = jSONObject.length();
            y2q0 y2q0Var = y2q0.this;
            if (length == 0) {
                y2q0Var.m212450D5();
            } else {
                y2q0Var.m212676w5(jSONObject);
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            y2q0.this.m212450D5();
        }

        @Override // com.tencent.tauth.IUiListener
        public void onWarning(int i) {
        }
    }

    /* JADX INFO: renamed from: l.y2q0$b */
    public class C21292b implements IUiListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AsyncEmitter f195697a;

        public C21292b(AsyncEmitter asyncEmitter) {
            this.f195697a = asyncEmitter;
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            this.f195697a.onError(new IllegalStateException("cancel get qq user info"));
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            if (obj == null) {
                this.f195697a.onError(new IllegalStateException("qq user info null"));
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.length() == 0) {
                this.f195697a.onError(new IllegalStateException("qq user info null"));
                return;
            }
            WeChatUserInfo weChatUserInfoNew_ = WeChatUserInfo.new_();
            try {
                weChatUserInfoNew_.nickname = jSONObject.getString("nickname");
                this.f195697a.onNext(weChatUserInfoNew_);
                this.f195697a.onCompleted();
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                this.f195697a.onError(new IllegalStateException("qq user info parse error"));
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            this.f195697a.onError(new IllegalStateException("error get qq user info" + uiError.errorMessage));
        }

        @Override // com.tencent.tauth.IUiListener
        public void onWarning(int i) {
        }
    }
}
