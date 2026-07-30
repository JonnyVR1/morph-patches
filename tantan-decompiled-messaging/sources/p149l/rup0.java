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
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.EmailLoginOptAct;
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
import java.util.HashMap;
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
public class rup0 extends jq2<AbstractC19646r6> {

    /* JADX INFO: renamed from: I */
    public static boolean f161083I = false;

    /* JADX INFO: renamed from: J */
    public static hpd0 f161084J = new hpd0("has_wechat_login_detail_complete", Boolean.TRUE);

    /* JADX INFO: renamed from: K */
    public static uqd0 f161085K = new uqd0("user_invite_code", "");

    /* JADX INFO: renamed from: L */
    public static hpd0 f161086L = new hpd0("has_click_visitor", Boolean.FALSE);

    /* JADX INFO: renamed from: A */
    public d30 f161087A;

    /* JADX INFO: renamed from: B */
    public e30<SignUpData> f161088B;

    /* JADX INFO: renamed from: C */
    public d30 f161089C;

    /* JADX INFO: renamed from: D */
    public View.OnClickListener f161090D;

    /* JADX INFO: renamed from: E */
    public dd80 f161091E;

    /* JADX INFO: renamed from: F */
    public d30 f161092F;

    /* JADX INFO: renamed from: G */
    public View.OnClickListener f161093G;

    /* JADX INFO: renamed from: H */
    public View.OnClickListener f161094H;

    /* JADX INFO: renamed from: a */
    public boolean f161095a;

    /* JADX INFO: renamed from: b */
    public AccountTempApi.InactiveType f161096b;

    /* JADX INFO: renamed from: c */
    public String f161097c;

    /* JADX INFO: renamed from: d */
    public Runnable f161098d;

    /* JADX INFO: renamed from: e */
    public SignUpData f161099e;

    /* JADX INFO: renamed from: f */
    public String f161100f;

    /* JADX INFO: renamed from: g */
    public OneClickStatus f161101g;

    /* JADX INFO: renamed from: h */
    public boolean f161102h;

    /* JADX INFO: renamed from: i */
    public boolean f161103i;

    /* JADX INFO: renamed from: j */
    public boolean f161104j;

    /* JADX INFO: renamed from: k */
    public boolean f161105k;

    /* JADX INFO: renamed from: l */
    public C22392a<String> f161106l;

    /* JADX INFO: renamed from: m */
    public View.OnClickListener f161107m;

    /* JADX INFO: renamed from: n */
    public View.OnClickListener f161108n;

    /* JADX INFO: renamed from: o */
    public h30<Throwable, ThirdPartyData, Runnable, SignInGrantType> f161109o;

    /* JADX INFO: renamed from: p */
    public c84 f161110p;

    /* JADX INFO: renamed from: q */
    public AccessToken f161111q;

    /* JADX INFO: renamed from: r */
    public d30 f161112r;

    /* JADX INFO: renamed from: s */
    public d30 f161113s;

    /* JADX INFO: renamed from: t */
    public boolean f161114t;

    /* JADX INFO: renamed from: u */
    public boolean f161115u;

    /* JADX INFO: renamed from: v */
    public c4g0 f161116v;

    /* JADX INFO: renamed from: w */
    public d30 f161117w;

    /* JADX INFO: renamed from: x */
    public IWXAPI f161118x;

    /* JADX INFO: renamed from: y */
    public IUiListener f161119y;

    /* JADX INFO: renamed from: z */
    public int f161120z;

    /* JADX INFO: renamed from: l.rup0$c */
    public class DialogInterfaceOnDismissListenerC19788c implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f161124a;

        public DialogInterfaceOnDismissListenerC19788c(cwf0 cwf0Var) {
            this.f161124a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f161124a);
        }
    }

    /* JADX INFO: renamed from: l.rup0$d */
    public class DialogInterfaceOnDismissListenerC19789d implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f161126a;

        public DialogInterfaceOnDismissListenerC19789d(cwf0 cwf0Var) {
            this.f161126a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f161126a);
        }
    }

    /* JADX INFO: renamed from: l.rup0$e */
    public class C19790e implements fuf<czv> {

        /* JADX INFO: renamed from: a */
        public g30<ThirdPartyData, ThirdPartyValidation, SignUpData> f161128a = new g30() { // from class: l.bvp0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                this.f77487a.m181199r((ThirdPartyData) obj, (ThirdPartyValidation) obj2, (SignUpData) obj3);
            }
        };

        public C19790e() {
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ SignUpData m181186j(Throwable th) {
            SignUpData signUpData = new SignUpData();
            signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(App.f15369e);
            signUpData.signUpType = AccountTempApi.SignUpType.facebook;
            return signUpData;
        }

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ void m181193A() {
            ((AbstractC19646r6) rup0.this.viewModel).mo104222p(false);
        }

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ void m181194B(ThirdPartyData thirdPartyData, SignUpData signUpData) {
            this.f161128a.mo36055a(thirdPartyData, null, signUpData);
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m181195C(final ThirdPartyData thirdPartyData, final SignUpData signUpData) {
            e51.m114742G(new Runnable() { // from class: l.xup0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f194537a.m181194B(thirdPartyData, signUpData);
                }
            });
        }

        /* JADX INFO: renamed from: D */
        public final void m181196D(final SignUpData signUpData, final ThirdPartyData thirdPartyData) {
            final Runnable runnable = new Runnable() { // from class: l.uup0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f178412a.m181202u();
                }
            };
            signUpData.thirdPartyId = thirdPartyData.thirdPartyId;
            signUpData.thirdPartyToken = thirdPartyData.thirdPartyToken;
            rup0.this.duringCreated(eje.m116827r(signUpData, null, true)).subscribe(mkd0.m154956H(new e30() { // from class: l.vup0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f183097a.m181203v(signUpData, (roj0) obj);
                }
            }, new e30() { // from class: l.wup0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f188150a.m181204w(thirdPartyData, runnable, (Throwable) obj);
                }
            }));
        }

        @Override // p149l.fuf
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void onSuccess(czv czvVar) {
            rup0.this.f161111q = czvVar.getAccessToken();
            final Runnable runnable = new Runnable() { // from class: l.yup0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f200116a.m181193A();
                }
            };
            final ThirdPartyData thirdPartyDataNew_ = ThirdPartyData.new_();
            thirdPartyDataNew_.thirdPartyId = rup0.this.f161111q.getUserId();
            thirdPartyDataNew_.thirdPartyToken = rup0.this.f161111q.getToken();
            AccountModule.f16037c.m28274C2(thirdPartyDataNew_).subscribe(mkd0.m154959K(new e30() { // from class: l.zup0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f204871a.m181206y(thirdPartyDataNew_, (roj0) obj);
                }
            }, new e30() { // from class: l.avp0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f71958a.m181207z(thirdPartyDataNew_, runnable, (Throwable) obj);
                }
            }, false));
        }

        @Override // p149l.fuf
        /* JADX INFO: renamed from: a */
        public void mo50769a(FacebookException facebookException) {
            FacebookApi.m29530m(facebookException);
            e51.m114742G(new Runnable() { // from class: l.sup0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f166492a.m181201t();
                }
            });
        }

        @Override // p149l.fuf
        public void onCancel() {
            e51.m114742G(new Runnable() { // from class: l.cvp0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82669a.m181200s();
                }
            });
        }

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ void m181198q(ThirdPartyValidation thirdPartyValidation, SignUpData signUpData, ThirdPartyData thirdPartyData, C4319c c4319c) {
            if (NullChecker.m81303a(thirdPartyValidation)) {
                signUpData.thirdPartyValidation = thirdPartyValidation;
            }
            m181196D(signUpData, thirdPartyData);
        }

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ void m181199r(final ThirdPartyData thirdPartyData, final ThirdPartyValidation thirdPartyValidation, final SignUpData signUpData) {
            rup0.this.lifecycle().filter(new w9j() { // from class: l.dvp0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
                }
            }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.evp0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f93368a.m181198q(thirdPartyValidation, signUpData, thirdPartyData, (C4319c) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ void m181200s() {
            ((AbstractC19646r6) rup0.this.viewModel).mo104222p(false);
        }

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ void m181201t() {
            ((AbstractC19646r6) rup0.this.viewModel).mo104222p(false);
        }

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ void m181202u() {
            ((AbstractC19646r6) rup0.this.viewModel).mo104222p(false);
        }

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ void m181203v(SignUpData signUpData, roj0 roj0Var) {
            AccountModule.f16037c.m28305Q0().put(signUpData.name);
            if (NullChecker.m81303a(signUpData.birthdate)) {
                AccountModule.f16037c.m28301O0().put(signUpData.birthdate);
            }
            if (NullChecker.m81303a(signUpData.gender)) {
                AccountModule.f16037c.m28303P0().put(signUpData.gender.toString());
            }
            boolean zIsEmpty = TextUtils.isEmpty(signUpData.profilePath);
            rup0 rup0Var = rup0.this;
            if (zIsEmpty) {
                rup0Var.act().startActivity(SignUpDetailsNewAct.m28497a2(rup0.this.act(), signUpData));
            } else {
                rup0Var.f161088B.call(signUpData);
            }
        }

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ void m181204w(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
            if (rup0.this.m180936Q3(th)) {
                rup0.this.f161109o.mo105798b(th, thirdPartyData, runnable, SignInGrantType.get("facebook"));
            } else {
                e51.m114742G(runnable);
                yij0.m214926D(th);
            }
        }

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ void m181205x(Throwable th) {
            rup0.this.f161113s.call();
        }

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ void m181206y(final ThirdPartyData thirdPartyData, roj0 roj0Var) {
            AccountModule.f16037c.m28319Y1(rup0.this.f161111q.getUserId(), rup0.this.f161111q.getToken()).onErrorReturn(new w9j() { // from class: l.fvp0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return rup0.C19790e.m181186j((Throwable) obj);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.gvp0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f104598a.m181195C(thirdPartyData, (SignUpData) obj);
                }
            }, new e30() { // from class: l.tup0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f172211a.m181205x((Throwable) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m181207z(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
            if (rup0.this.m180936Q3(th)) {
                rup0.this.f161109o.mo105798b(th, thirdPartyData, runnable, SignInGrantType.get("facebook"));
            } else {
                e51.m114742G(runnable);
                yij0.m214926D(th);
            }
        }
    }

    /* JADX INFO: renamed from: l.rup0$f */
    public class DialogInterfaceOnDismissListenerC19791f implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f161130a;

        public DialogInterfaceOnDismissListenerC19791f(cwf0 cwf0Var) {
            this.f161130a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f161130a);
        }
    }

    /* JADX INFO: renamed from: l.rup0$g */
    public static /* synthetic */ class C19792g {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f161132a;

        static {
            int[] iArr = new int[OperatorType.values().length];
            f161132a = iArr;
            try {
                iArr[OperatorType.china_mobile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f161132a[OperatorType.china_telecom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f161132a[OperatorType.china_unicom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public rup0(mcr mcrVar) {
        super(mcrVar);
        this.f161095a = false;
        this.f161096b = AccountTempApi.InactiveType.None;
        this.f161097c = "";
        this.f161105k = false;
        this.f161106l = C22392a.m221512b();
        this.f161107m = new View.OnClickListener() { // from class: l.nsp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140287a.m180921M4(view);
            }
        };
        this.f161108n = new View.OnClickListener() { // from class: l.fup0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99354a.m181093N4(view);
            }
        };
        this.f161109o = new h30() { // from class: l.qup0
            @Override // p149l.h30
            /* JADX INFO: renamed from: b */
            public final void mo105798b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f156531a.m181076G4((Throwable) obj, (ThirdPartyData) obj2, (Runnable) obj3, (SignInGrantType) obj4);
            }
        };
        this.f161112r = new d30() { // from class: l.epp0
            @Override // p149l.d30
            public final void call() {
                this.f92702a.m181082I4();
            }
        };
        this.f161113s = new d30() { // from class: l.ppp0
            @Override // p149l.d30
            public final void call() {
                this.f150674a.m180916K4();
            }
        };
        this.f161114t = false;
        this.f161115u = false;
        this.f161117w = new d30() { // from class: l.aqp0
            @Override // p149l.d30
            public final void call() {
                this.f71188a.m181088L4();
            }
        };
        this.f161119y = new C19786a();
        this.f161087A = new d30() { // from class: l.lqp0
            @Override // p149l.d30
            public final void call() {
                this.f129371a.m181096P4();
            }
        };
        this.f161088B = new e30() { // from class: l.wqp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187716a.m181176z4((SignUpData) obj);
            }
        };
        this.f161089C = new d30() { // from class: l.brp0
            @Override // p149l.d30
            public final void call() {
                this.f76933a.m181062A4();
            }
        };
        this.f161090D = new View.OnClickListener() { // from class: l.crp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82288a.m181064B4(view);
            }
        };
        this.f161092F = new d30() { // from class: l.ysp0
            @Override // p149l.d30
            public final void call() {
                this.f199800a.m181069D4();
            }
        };
        this.f161093G = new View.OnClickListener() { // from class: l.jtp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119655a.m181074F4(view);
            }
        };
        this.f161094H = new View.OnClickListener() { // from class: l.utp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178281a.m181079H4(view);
            }
        };
    }

    /* JADX INFO: renamed from: B5 */
    private void m180890B5(final SignUpData signUpData, final ThirdPartyData thirdPartyData) {
        final Runnable runnable = new Runnable() { // from class: l.dsp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f87781a.m181098Q4();
            }
        };
        signUpData.thirdPartyId = thirdPartyData.thirdPartyId;
        signUpData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        signUpData.email = thirdPartyData.email;
        signUpData.signUpType = AccountTempApi.SignUpType.google;
        duringCreated(eje.m116827r(signUpData, null, true)).subscribe(mkd0.m154956H(new e30() { // from class: l.esp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93045a.m181101R4(signUpData, (roj0) obj);
            }
        }, new e30() { // from class: l.fsp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99093a.m181104S4(thirdPartyData, runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E2 */
    public static /* synthetic */ void m180899E2() {
    }

    /* JADX INFO: renamed from: F3 */
    private void m180903F3(Intent intent) throws Throwable {
        try {
            GoogleSignInAccount googleSignInAccountMo15374m = C2081a.m12442b(intent).mo15374m(ApiException.class);
            ((AbstractC19646r6) this.viewModel).mo104202b(false);
            m181095P3(googleSignInAccountMo15374m.m12406g0(), googleSignInAccountMo15374m.m12407h0(), googleSignInAccountMo15374m.m12403H());
        } catch (ApiException e) {
            if (e.getStatusCode() != 12501) {
                lsi0.m151578h(R$string.f16311y3);
            }
            ((AbstractC19646r6) this.viewModel).mo104202b(false);
        }
    }

    /* JADX INFO: renamed from: H1 */
    public static /* synthetic */ void m180906H1() {
    }

    /* JADX INFO: renamed from: K3 */
    public static String m180915K3() {
        return f161085K.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K4 */
    public /* synthetic */ void m180916K4() {
        e51.m114742G(new Runnable() { // from class: l.yrp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f199690a.m181085J4();
            }
        });
        if (NullChecker.m81303a(AccessToken.m7408d())) {
            bzv.m104655m().m104682u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M4 */
    public /* synthetic */ void m180921M4(View view) {
        act().startActivity(PhoneNumberLoginOptAct.m28679Y1(act()));
    }

    /* JADX INFO: renamed from: N2 */
    public static /* synthetic */ void m180924N2(d30 d30Var, roj0 roj0Var) {
        tan.m187741b();
        d30Var.call();
    }

    /* JADX INFO: renamed from: N5 */
    public static void m180925N5() {
        f161085K.put("");
    }

    /* JADX INFO: renamed from: O3 */
    public static Tencent m180928O3(Context context) {
        Tencent.setIsPermissionGranted(true);
        return Tencent.createInstance(xw5.f194697b, context);
    }

    /* JADX INFO: renamed from: O5 */
    private void m180929O5(boolean z, final SignInData signInData, final Runnable runnable) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        ((AbstractC19646r6) this.viewModel).getAct().dialog().m20503E0(z ? R$string.f16150V2 : R$string.f16140T2).m20500D(z ? R$string.f16155W2 : R$string.f16145U2).m20556t0(R$string.f16312z, new Runnable() { // from class: l.qpp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f155792a.m181147k5(signInData, runnable);
            }
        }).m20542l0(R$string.f16178b, new Runnable() { // from class: l.rpp0
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.m220396r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
            }
        }).m20526V(new DialogInterfaceOnDismissListenerC19791f(cwf0VarM133794c)).m20568z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q3 */
    public boolean m180936Q3(Throwable th) {
        return NullChecker.m81303a(th) && (th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40037;
    }

    /* JADX INFO: renamed from: S2 */
    public static /* synthetic */ void m180942S2(Runnable runnable, Throwable th) {
        runnable.run();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: U1 */
    public static /* synthetic */ void m180946U1(Envelope envelope) {
    }

    /* JADX INFO: renamed from: U2 */
    public static /* synthetic */ void m180947U2() {
    }

    /* JADX INFO: renamed from: W2 */
    public static /* synthetic */ void m180953W2() {
    }

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ void m180961Z2(d30 d30Var, roj0 roj0Var) {
        tan.m187741b();
        d30Var.call();
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m180963a2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a6 */
    public void m180965a6() {
        ((AbstractC19646r6) this.viewModel).getAct().startActivity(PhoneNumberLoginOptAct.m28679Y1(((AbstractC19646r6) this.viewModel).getAct()));
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ void m180978e3(String str, String str2, final e30 e30Var, final Runnable runnable) {
        zvf0.m220396r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("qq");
        signInData.thirdPartyId = str;
        signInData.thirdPartyToken = str2;
        AccountModule.f16037c.m28349o2(signInData, true, new Runnable() { // from class: l.kqp0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m180899E2();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.mqp0
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var.call(Boolean.FALSE);
            }
        }, new e30() { // from class: l.nqp0
            @Override // p149l.e30
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m180979f0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public /* synthetic */ void m180987g4(Bundle bundle) {
        if (NullChecker.m81303a(act().getSupportActionBar())) {
            act().getSupportActionBar().mo134126m();
        }
        ((AbstractC19646r6) this.viewModel).mo104226r();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m180988h0(Runnable runnable) {
        zvf0.m220396r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
        runnable.run();
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ void m180989h1() {
    }

    /* JADX INFO: renamed from: h2 */
    public static /* synthetic */ void m180990h2(Runnable runnable, Throwable th) {
        runnable.run();
        CrashHelper.m81296c(new Exception("wechat signup no transition--> message:" + th.getMessage(), th));
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m180992i0(Runnable runnable) {
        zvf0.m220396r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4 */
    public /* synthetic */ void m180996i4(Throwable th) {
        if ((th instanceof ApiExcep.Client.NotFound) || (th instanceof ApiExcep.Client.Unauthorized) || ((th instanceof App.HandledGlobally) && (((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            eje.m116824h().m116834m();
        } else {
            eje.m116824h().m116830g();
            m181071E3();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ Boolean m180997j0(Runnable runnable, WeChatUserInfo weChatUserInfo) {
        if (NullChecker.m81303a(weChatUserInfo)) {
            return Boolean.TRUE;
        }
        runnable.run();
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ void m181001j4(Bundle bundle) {
        this.f161098d = ((AbstractC19646r6) this.viewModel).mo104203c(this.f161095a);
        m181086J5(this.f161102h);
        if (IntlCountryCodeController.m28113i()) {
            AccountTempApi.InactiveType inactiveType = this.f161096b;
            if (inactiveType == AccountTempApi.InactiveType.Pause) {
                C21176xm.m210019m0(act(), act().string(R$string.f16221i0), act().string(R$string.f16215h0), act().string(R$string.f16090J2));
            } else if (inactiveType == AccountTempApi.InactiveType.DeleteImmediately) {
                C21176xm.m210019m0(act(), act().string(R$string.f16209g0), this.f161103i ? String.format("%s\n\n%s", act().string(R$string.f16203f0), act().string(R$string.f16239l0)) : act().string(R$string.f16203f0), act().string(R$string.f16090J2));
            }
        }
        if (this.f161096b == AccountTempApi.InactiveType.DeleteImmediately && !TextUtils.isEmpty(this.f161097c) && RemoteConfig.m79298x().m79302F("setting_snail_diversion_config").contains(this.f161097c)) {
            j2e0.m139446m(act(), Uri.parse("tantan://webview?url=".concat(juk.m143323e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/love-snail/index.html?speed=true&_bid=1004028&hideNavigationBar=1&hideNotch=1" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/love-snail/index.html?speed=true&_bid=1004028&hideNavigationBar=1&hideNotch=1")));
        }
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ Boolean m181013m3(Runnable runnable, ThirdPartVetify thirdPartVetify) {
        if (NullChecker.m81303a(thirdPartVetify) && thirdPartVetify.code == 200) {
            return Boolean.TRUE;
        }
        runnable.run();
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: o2 */
    public static /* synthetic */ C22306c m181020o2(SignInData signInData, MobileRespInfo mobileRespInfo) {
        signInData.grantType = mobileRespInfo.grantType;
        signInData.thirdPartyToken = mobileRespInfo.token;
        signInData.thirdPartyAccessCode = mobileRespInfo.accessCode;
        signInData.thirdPartyId = mobileRespInfo.openId;
        return AccountModule.f16037c.m28349o2(signInData, true, new Runnable() { // from class: l.tqp0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m180989h1();
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public static /* synthetic */ Boolean m181021o3(WeChatToken weChatToken, Runnable runnable, WeChatToken weChatToken2) {
        if (!NullChecker.m81303a(weChatToken2) || TextUtils.isEmpty(weChatToken2.thirdpartyId) || TextUtils.isEmpty(weChatToken2.thirdpartyAccessToken)) {
            runnable.run();
            return Boolean.FALSE;
        }
        weChatToken.thirdpartyId = weChatToken2.thirdpartyId;
        weChatToken.thirdpartyAccessToken = weChatToken2.thirdpartyAccessToken;
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m181030r0(WeChatToken weChatToken, final e30 e30Var, final Runnable runnable) {
        zvf0.m220396r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("wechat");
        signInData.thirdPartyId = weChatToken.thirdpartyId;
        signInData.thirdPartyToken = weChatToken.thirdpartyAccessToken;
        AccountModule.f16037c.m28349o2(signInData, true, new Runnable() { // from class: l.yqp0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m180947U2();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.zqp0
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var.call(Boolean.FALSE);
            }
        }, new e30() { // from class: l.arp0
            @Override // p149l.e30
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m181034s0(MatchCounterEnvelope matchCounterEnvelope) {
        long j = matchCounterEnvelope.totalCounters.matches;
        if (j > 0) {
            AccountModule.f16037c.f16329j.put(Long.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ void m181035s1(SignInGrantType signInGrantType, ThirdPartyData thirdPartyData, final d30 d30Var, final Runnable runnable) {
        SignInData signInData = new SignInData();
        signInData.grantType = signInGrantType;
        signInData.thirdPartyId = thirdPartyData.thirdPartyId;
        signInData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        AccountModule.f16037c.m28349o2(signInData, true, null).subscribe(mkd0.m154956H(new e30() { // from class: l.wtp0
            @Override // p149l.e30
            public final void call(Object obj) {
                rup0.m180924N2(d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.xtp0
            @Override // p149l.e30
            public final void call(Object obj) {
                rup0.m180942S2(runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ void m181046v1(Throwable th) {
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ C22306c m181051x0(SignInData signInData, MobileRespInfo mobileRespInfo) {
        signInData.grantType = mobileRespInfo.grantType;
        signInData.thirdPartyToken = mobileRespInfo.token;
        signInData.thirdPartyAccessCode = mobileRespInfo.accessCode;
        signInData.thirdPartyId = mobileRespInfo.openId;
        return AccountModule.f16037c.m28349o2(signInData, false, new Runnable() { // from class: l.spp0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m180906H1();
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m181058z0(Throwable th) {
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m181062A4() {
        ((AbstractC19646r6) this.viewModel).mo104211j();
        zvf0.m220402x("e_signin_fb_button", ((PutongAct) act()).pageId());
        this.f161110p = c84.C16094b.m105650a();
        bzv.m104655m().m104685y(this.f161110p, new C19790e());
        ((AbstractC19646r6) this.viewModel).mo104224q();
    }

    /* JADX INFO: renamed from: A5 */
    public void m181063A5(int i, int i2, Intent intent) {
        if (i == 9001) {
            m180903F3(intent);
        }
        if (NullChecker.m81303a(this.f161110p)) {
            this.f161110p.mo8661a(i, i2, intent);
        }
        if (i == 786 && i2 == 0) {
            this.f161113s.call();
        }
        if (i == 11101) {
            Tencent.onActivityResultData(i, i2, intent, this.f161119y);
        }
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m181064B4(View view) {
        ((AbstractC19646r6) this.viewModel).mo104222p(true);
        bzv.m104655m().m104682u();
        bzv.m104655m().m104681t(act(), FacebookApi.f17152d);
    }

    /* JADX INFO: renamed from: C3, reason: merged with bridge method [inline-methods] */
    public final void m181096P4() {
        duringCreated(new v9j() { // from class: l.osp0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ChinaMobileController.m29593b().m29601i(5000);
            }
        }, false).subscribe(mkd0.m154955G(new e30() { // from class: l.psp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151026a.m181112V3((MobileRespInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m181066C4() {
        ((AbstractC19646r6) this.viewModel).mo104231u();
        SignInData signInData = new SignInData();
        signInData.device = pk8.m169980M();
        m181108T5(signInData, new Runnable() { // from class: l.htp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f109431a.m180965a6();
            }
        });
    }

    /* JADX INFO: renamed from: C5 */
    public void m181067C5(List<Media> list) {
        if (list.size() > 0 && (list.get(0) instanceof Picture) && NullChecker.m81305c(this.f161099e, SchemeKey.account, CrashHelper.ReportLevel.p9)) {
            pgm pgmVar = new pgm(rhi.m179382z(list.get(0).url), TXEAudioDef.TXE_OPUS_SAMPLE_NUM);
            try {
                this.f161099e.profilePath = pgmVar.m168764d();
                m181081I3(this.f161099e);
            } catch (IOException e) {
                CrashHelper.m81296c(e);
                this.f161113s.call();
            }
        }
    }

    /* JADX INFO: renamed from: D3 */
    public final void m181068D3() {
        if (this.f161118x == null) {
            this.f161118x = WXAPIFactory.createWXAPI(m142773Y(), null);
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m181069D4() {
        m181091M5(new d30() { // from class: l.zrp0
            @Override // p149l.d30
            public final void call() {
                this.f204535a.m181066C4();
            }
        }, new asp0(this));
    }

    /* JADX INFO: renamed from: D5 */
    public final void m181070D5(JSONObject jSONObject) {
        Exception exc;
        String string;
        String string2;
        ((AbstractC19646r6) this.viewModel).mo104217m(true);
        final Runnable runnable = new Runnable() { // from class: l.btp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f77254a.m181107T4();
            }
        };
        final Runnable runnable2 = new Runnable() { // from class: l.ctp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f82497a.m181110U4();
            }
        };
        final Runnable runnable3 = new Runnable() { // from class: l.dtp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f87867a.m181113V4();
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
        m180928O3(act()).setAccessToken(str, string3);
        m180928O3(act()).setOpenId(str2);
        AccountModule.f16039e.m28185m(str2, str, true).first().flatMap(new w9j() { // from class: l.etp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f93167a.m181116W4((ThirdPartVetify) obj);
            }
        }).first().subscribe(mkd0.m154959K(new e30() { // from class: l.ftp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99248a.m181133c5(str2, str, runnable2, runnable, (WeChatUserInfo) obj);
            }
        }, new e30() { // from class: l.gtp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104335a.m181143h5(runnable, str2, str, runnable2, runnable3, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: E3 */
    public final void m181071E3() {
        if (this.f161095a) {
            act().hideInput();
            return;
        }
        act().startActivity(C17367hp.m132321e(act()));
        act().m66873d2();
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m181072E4(final SignInGrantType signInGrantType, final ThirdPartyData thirdPartyData, final d30 d30Var, final Runnable runnable, Throwable th, Throwable th2) {
        if (!(th2 instanceof TantanException.Client.AccountService)) {
            runnable.run();
            yij0.m214926D(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th2).code;
        if (i == 40020 || i == 40091) {
            boolean z = i == 40020;
            act().dialog().m20503E0(z ? R$string.f16150V2 : R$string.f16140T2).m20500D(z ? R$string.f16155W2 : R$string.f16145U2).m20556t0(R$string.f16312z, new Runnable() { // from class: l.ktp0
                @Override // java.lang.Runnable
                public final void run() {
                    rup0.m181035s1(signInGrantType, thirdPartyData, d30Var, runnable);
                }
            }).m20542l0(R$string.f16178b, runnable).m20568z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.ltp0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    runnable.run();
                }
            });
        }
    }

    /* JADX INFO: renamed from: E5 */
    public void m181073E5(WeChatUserInfo weChatUserInfo, boolean z) {
        AccountModule.f16039e.m28180h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f161100f);
        if (z) {
            f161084J.put(Boolean.FALSE);
        }
        AccountModule.f16037c.m28290I2().put(weChatUserInfo.nickname);
        act().startActivity(C17367hp.m132321e(((AbstractC19646r6) this.viewModel).getAct()));
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m181074F4(View view) {
        ((AbstractC19646r6) this.viewModel).mo104202b(true);
        p4k p4kVarM12441a = C2081a.m12441a(m142773Y(), new GoogleSignInOptions.C2080a(GoogleSignInOptions.DEFAULT_SIGN_IN).m12434b().m12436d("218526224262-usliqg20cepnb3ql98amgeum18v8uatv.apps.googleusercontent.com").m12433a());
        p4kVarM12441a.m167392d();
        act().startActivityForResult(p4kVarM12441a.m167390b(), ErrorCode.DECODE_AUDIO_INIT_MUXER_FAILED);
    }

    /* JADX INFO: renamed from: F5 */
    public void m181075F5() {
        RememberUserInfo rememberUserInfoMo108248b = qib0.f154697L.f17146d.mo108248b();
        if (NullChecker.m81303a(rememberUserInfoMo108248b)) {
            m181099Q5(rememberUserInfoMo108248b, act(), new csp0(this));
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m181076G4(final Throwable th, final ThirdPartyData thirdPartyData, final Runnable runnable, final SignInGrantType signInGrantType) {
        SignInData signInData = new SignInData();
        signInData.grantType = signInGrantType;
        signInData.thirdPartyId = thirdPartyData.thirdPartyId;
        signInData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        signInData.thirdEmail = thirdPartyData.email;
        final d30 d30Var = new d30() { // from class: l.hsp0
            @Override // p149l.d30
            public final void call() {
                this.f109339a.m181094O4();
            }
        };
        AccountModule.f16037c.m28349o2(signInData, false, null).subscribe(mkd0.m154956H(new e30() { // from class: l.isp0
            @Override // p149l.e30
            public final void call(Object obj) {
                rup0.m180961Z2(d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.jsp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119532a.m181072E4(signInGrantType, thirdPartyData, d30Var, runnable, th, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G5 */
    public void m181077G5() {
        if (this.f161115u) {
            if (!this.f161114t) {
                ((AbstractC19646r6) this.viewModel).mo104217m(false);
            }
            this.f161114t = false;
        }
        duringCreated(AccountModule.f16037c.m28316X0()).subscribe(mkd0.m154956H(new e30() { // from class: l.jrp0
            @Override // p149l.e30
            public final void call(Object obj) {
                rup0.m181034s0((MatchCounterEnvelope) obj);
            }
        }, new e30() { // from class: l.krp0
            @Override // p149l.e30
            public final void call(Object obj) {
                rup0.m181046v1((Throwable) obj);
            }
        }));
        ((AbstractC19646r6) this.viewModel).mo104206f();
    }

    /* JADX INFO: renamed from: H3 */
    public boolean m181078H3() {
        OperatorType operatorTypeM101759c;
        if (this.f161101g == null || (operatorTypeM101759c = AccountModule.f16038d.f183283a.m101759c()) == null) {
            return true;
        }
        int i = C19792g.f161132a[operatorTypeM101759c.ordinal()];
        if (i == 1 || i == 2) {
            return this.f161101g.chinaMobile;
        }
        if (i != 3) {
            return true;
        }
        return this.f161101g.chinaUnicom;
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m181079H4(View view) {
        act().startActivity(EmailLoginOptAct.m28662Y1(act(), VerifyReason.get(VerifyReason.signup_signin), ""));
    }

    /* JADX INFO: renamed from: H5 */
    public void m181080H5() {
        this.f161092F.call();
    }

    /* JADX INFO: renamed from: I3 */
    public final void m181081I3(final SignUpData signUpData) {
        C4575a.m28250q2(signUpData, null).subscribe(mkd0.m154956H(new e30() { // from class: l.lrp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129744a.m181115W3(signUpData, (roj0) obj);
            }
        }, new e30() { // from class: l.mrp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135397a.m181118X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m181082I4() {
        this.f161115u = false;
        this.f161114t = false;
        ((AbstractC19646r6) this.viewModel).mo104219n();
    }

    /* JADX INFO: renamed from: I5 */
    public final void m181083I5() {
        m181086J5(false);
    }

    /* JADX INFO: renamed from: J3 */
    public View.OnClickListener m181084J3() {
        return new View.OnClickListener() { // from class: l.mtp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135669a.m181124Z3(view);
            }
        };
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m181085J4() {
        ((AbstractC19646r6) this.viewModel).mo104222p(false);
    }

    /* JADX INFO: renamed from: J5 */
    public final void m181086J5(boolean z) {
        ((AbstractC19646r6) this.viewModel).mo104215l();
        RememberUserInfo rememberUserInfoMo108248b = qib0.f154697L.f17146d.mo108248b();
        if (NullChecker.m81303a(rememberUserInfoMo108248b) && z) {
            m181099Q5(rememberUserInfoMo108248b, act(), new csp0(this));
        }
        final AccountTestFactor accountTestFactor = new AccountTestFactor();
        accountTestFactor.step = "appOpen";
        accountTestFactor.channel = "googleplay";
        final d30 d30Var = new d30() { // from class: l.ksp0
            @Override // p149l.d30
            public final void call() {
                this.f124499a.m181145j5(accountTestFactor);
            }
        };
        AccountModule.f16037c.m28287H2().subscribe(mkd0.m154956H(new e30() { // from class: l.lsp0
            @Override // p149l.e30
            public final void call(Object obj) {
                d30Var.call();
            }
        }, new e30() { // from class: l.msp0
            @Override // p149l.e30
            public final void call(Object obj) {
                d30Var.call();
            }
        }));
    }

    /* JADX INFO: renamed from: K5 */
    public final void m181087K5() {
        ((AbstractC19646r6) this.viewModel).mo104217m(false);
        lsi0.m151580j("授权失败，请再次尝试");
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m181088L4() {
        this.f161115u = true;
        ((AbstractC19646r6) this.viewModel).mo104228s();
    }

    /* JADX INFO: renamed from: L5 */
    public void m181089L5() {
        qib0.f154697L.f17146d.m108250i();
        m181083I5();
    }

    /* JADX INFO: renamed from: M3 */
    public C22306c<WeChatUserInfo> m181090M3() {
        return C22306c.fromAsync(new e30() { // from class: l.nup0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140644a.m181127a4((AsyncEmitter) obj);
            }
        }, AsyncEmitter.BackpressureMode.LATEST);
    }

    /* JADX INFO: renamed from: M5 */
    public void m181091M5(d30 d30Var, d30 d30Var2) {
        if (d30Var2 != null) {
            d30Var2.call();
        }
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: N3 */
    public View.OnClickListener m181092N3(final boolean z) {
        return new View.OnClickListener() { // from class: l.bsp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77114a.m181132c4(z, view);
            }
        };
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m181093N4(View view) {
        act().startActivity(PhoneNumberLoginOptAct.m28679Y1(act()));
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m181094O4() {
        AuthData authDataMo108248b = AccountModule.f16037c.m28312V0().mo108248b();
        act().startActivity(C17367hp.m132322f(((AbstractC19646r6) this.viewModel).getAct(), NullChecker.m81303a(authDataMo108248b) ? authDataMo108248b.signupStage.toString() : ""));
        AccountModule.f16039e.m28180h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f161100f);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: P3 */
    public void m181095P3(String str, String str2, String str3) {
        final Runnable runnable = new Runnable() { // from class: l.top0
            @Override // java.lang.Runnable
            public final void run() {
                this.f171400a.m181135d4();
            }
        };
        final ThirdPartyData thirdPartyDataNew_ = ThirdPartyData.new_();
        thirdPartyDataNew_.thirdPartyId = str;
        thirdPartyDataNew_.thirdPartyToken = str2;
        thirdPartyDataNew_.email = str3;
        duringCreated(AccountModule.f16037c.m28276D2(thirdPartyDataNew_)).subscribe(mkd0.m154959K(new e30() { // from class: l.grp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104082a.m181137e4(thirdPartyDataNew_, (roj0) obj);
            }
        }, new e30() { // from class: l.rrp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160768a.m181139f4(thirdPartyDataNew_, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: P5 */
    public final void m181097P5(boolean z, final String str, final String str2, final Runnable runnable, final e30<Boolean> e30Var) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        act().dialog().m20503E0(z ? R$string.f16150V2 : R$string.f16140T2).m20500D(z ? R$string.f16155W2 : R$string.f16145U2).m20556t0(R$string.f16312z, new Runnable() { // from class: l.pup0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m180978e3(str, str2, e30Var, runnable);
            }
        }).m20542l0(R$string.f16178b, new Runnable() { // from class: l.uop0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m180988h0(runnable);
            }
        }).m20526V(new DialogInterfaceOnDismissListenerC19789d(cwf0VarM133794c)).m20568z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.vop0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m181098Q4() {
        ((AbstractC19646r6) this.viewModel).mo104202b(false);
    }

    /* JADX INFO: renamed from: Q5 */
    public final void m181099Q5(RememberUserInfo rememberUserInfo, Act act, final d30 d30Var) {
        if (((AbstractC19646r6) this.viewModel).mo104204d()) {
            return;
        }
        if (NullChecker.m81303a(this.f161091E) && this.f161091E.isShowing()) {
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
        vButton.setText(act.getResources().getString(R$string.f16182b3, m181123Y5(rememberUserInfo.name)));
        vText.setText(R$string.f16188c3);
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_signin_with_saved_info", Dialog.class.getName());
        this.f161091E = c16336aNewDialog.m110963R(viewInflate).m110961P(true).m110986o0(new DialogInterface.OnShowListener() { // from class: l.qrp0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.m133797f(cwf0VarM133794c);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.srp0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110983l0(new DialogInterface.OnCancelListener() { // from class: l.trp0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zvf0.m220399u("e_switch_account_button", "p_signin_with_saved_info", vwb.m200311Y("switch_account", "close"));
            }
        }).m110989r0();
        vImage.setOnClickListener(new View.OnClickListener() { // from class: l.urp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177862a.m181149l5(view);
            }
        });
        vButton.setOnClickListener(new View.OnClickListener() { // from class: l.vrp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182741a.m181151m5(d30Var, view);
            }
        });
        vText.setOnClickListener(new View.OnClickListener() { // from class: l.wrp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187815a.m181153n5(view);
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public boolean m181100R3() {
        try {
            return act().getPackageManager().getPackageInfo("com.tencent.mobileqq", 0) != null;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m181101R4(SignUpData signUpData, roj0 roj0Var) {
        if (zmi0.f203723b.get().booleanValue()) {
            act().startActivity(C17367hp.m132321e(act()));
        } else {
            act().startActivity(SignUpDetailsNewAct.m28497a2(act(), signUpData));
        }
    }

    /* JADX INFO: renamed from: R5 */
    public final void m181102R5(boolean z, final WeChatToken weChatToken, final Runnable runnable, final e30<Boolean> e30Var) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        act().dialog().m20503E0(z ? R$string.f16150V2 : R$string.f16140T2).m20500D(z ? R$string.f16155W2 : R$string.f16145U2).m20556t0(R$string.f16312z, new Runnable() { // from class: l.tpp0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m181030r0(weChatToken, e30Var, runnable);
            }
        }).m20542l0(R$string.f16178b, new Runnable() { // from class: l.upp0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m180992i0(runnable);
            }
        }).m20526V(new DialogInterfaceOnDismissListenerC19788c(cwf0VarM133794c)).m20568z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.vpp0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public boolean m181103S3() {
        m181068D3();
        return this.f161118x.isWXAppInstalled();
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m181104S4(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
        if (m180936Q3(th)) {
            this.f161109o.mo105798b(th, thirdPartyData, runnable, SignInGrantType.get("google"));
        } else {
            e51.m114742G(runnable);
            yij0.m214926D(th);
        }
    }

    /* JADX INFO: renamed from: S5 */
    public void m181105S5(final SignInData signInData, final Runnable runnable) {
        ((AbstractC19646r6) this.viewModel).getAct().progress(R$string.f16227j0, true);
        ((AbstractC19646r6) this.viewModel).getAct().duringCreated((C22306c) ChinaMobileController.m29593b().m29600h(5000).doOnNext(new e30() { // from class: l.oqp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145175a.m181155o5(runnable, (MobileRespInfo) obj);
            }
        }).filter(new w9j() { // from class: l.pqp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new w9j() { // from class: l.qqp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rup0.m181020o2(signInData, (MobileRespInfo) obj);
            }
        }), false).subscribe(mkd0.m154956H(new e30() { // from class: l.rqp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160676a.m181157p5((roj0) obj);
            }
        }, new e30() { // from class: l.sqp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166012a.m181159q5(runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m181106T3(roj0 roj0Var) {
        if (C17133gp.m127319j()) {
            al40.m97271e().m97274h(this.f161100f);
        }
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ void m181107T4() {
        act().progressDismiss();
        ((AbstractC19646r6) this.viewModel).mo104201a();
        ((AbstractC19646r6) this.viewModel).mo104217m(false);
        lsi0.m151595y("QQ登录失败，请重试");
    }

    /* JADX INFO: renamed from: T5 */
    public void m181108T5(final SignInData signInData, final Runnable runnable) {
        ((AbstractC19646r6) this.viewModel).getAct().progress(R$string.f16227j0, true);
        ((AbstractC19646r6) this.viewModel).getAct().duringCreated((C22306c) ChinaMobileController.m29593b().m29600h(5000).doOnNext(new e30() { // from class: l.ptp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151198a.m181161r5(runnable, (MobileRespInfo) obj);
            }
        }).filter(new w9j() { // from class: l.qtp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new w9j() { // from class: l.rtp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rup0.m181051x0(signInData, (MobileRespInfo) obj);
            }
        }), false).subscribe(mkd0.m154959K(new e30() { // from class: l.stp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166380a.m181163s5((roj0) obj);
            }
        }, new e30() { // from class: l.ttp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172049a.m181165t5(signInData, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m181109U3(roj0 roj0Var) {
        if (C17133gp.m127319j()) {
            al40.m97271e().m97274h(this.f161100f);
        }
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m181110U4() {
        ((AbstractC19646r6) this.viewModel).mo104217m(false);
        lsi0.m151595y("登录失败，绑定手机号后再试");
    }

    /* JADX INFO: renamed from: U5 */
    public View.OnClickListener m181111U5() {
        return new View.OnClickListener() { // from class: l.gsp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104203a.m181167u5(view);
            }
        };
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m181112V3(MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            int i = this.f161120z + 1;
            this.f161120z = i;
            if (i < 5) {
                m181096P4();
            } else {
                ABManager.m29322L().take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.tsp0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f171950a.m181106T3((roj0) obj);
                    }
                }));
                AccountModule.f16039e.m28180h(act(), ThirdPartLoginApi.ReportMobileSource.landing_page, this.f161100f);
            }
        } else {
            this.f161100f = mobileRespInfo.mobileNumber;
            ABManager.m29322L().take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.usp0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f177997a.m181109U3((roj0) obj);
                }
            }));
            AccountModule.f16039e.m28180h(act(), ThirdPartLoginApi.ReportMobileSource.landing_page, this.f161100f);
        }
        zvf0.m220371D("e_login_phone_acquisition", WXEntryActivity.PID, vwb.m200311Y("get_phone_or_not", !TextUtils.isEmpty(this.f161100f) ? "yes" : "no"));
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m181113V4() {
        act().progressDismiss();
        ((AbstractC19646r6) this.viewModel).mo104217m(false);
    }

    /* JADX INFO: renamed from: V5 */
    public View.OnClickListener m181114V5() {
        return new View.OnClickListener() { // from class: l.vtp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182993a.m181169v5(view);
            }
        };
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m181115W3(SignUpData signUpData, roj0 roj0Var) {
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

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ C22306c m181116W4(ThirdPartVetify thirdPartVetify) {
        return m181090M3();
    }

    /* JADX INFO: renamed from: W5 */
    public void m181117W5() {
        m181120X5(null, null);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m181118X3(Throwable th) {
        this.f161113s.call();
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m181119X4(WeChatUserInfo weChatUserInfo) {
        m181073E5(weChatUserInfo, false);
    }

    /* JADX INFO: renamed from: X5 */
    public void m181120X5(RememberUserInfo rememberUserInfo, final String str) {
        act().progress(R$string.f16227j0);
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("unknown_");
        AccountModule.f16037c.m28347n2(signInData, rememberUserInfo, false, new Runnable() { // from class: l.nrp0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m180963a2();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.orp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145347a.m181171w5(str, (roj0) obj);
            }
        }, new e30() { // from class: l.prp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150942a.m181173x5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m181121Y3(View view) {
        if (((AbstractC19646r6) this.viewModel).mo104205e() || !IntlCountryCodeController.m28120p()) {
            this.f161094H.onClick(view);
        } else {
            ((AbstractC19646r6) this.viewModel).mo104209i(this.f161094H, view);
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m181122Y4(WeChatUserInfo weChatUserInfo) {
        m181073E5(weChatUserInfo, false);
    }

    /* JADX INFO: renamed from: Y5 */
    public String m181123Y5(String str) {
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
    public final /* synthetic */ void m181124Z3(final View view) {
        HashMap map = new HashMap();
        map.put("sign up button pressed", "email");
        w85.INSTANCE.m202145m("Sign Up", map);
        zvf0.m220396r("e_intl_signin_with_email_button", ((PutongAct) act()).pageId());
        m181091M5(new d30() { // from class: l.ytp0
            @Override // p149l.d30
            public final void call() {
                this.f200002a.m181121Y3(view);
            }
        }, new asp0(this));
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m181125Z4(final Runnable runnable, final WeChatUserInfo weChatUserInfo, final Runnable runnable2) {
        C21176xm.m210011i0(act(), "qq", "verified", new d30() { // from class: l.hqp0
            @Override // p149l.d30
            public final void call() {
                runnable.run();
            }
        }, new d30() { // from class: l.iqp0
            @Override // p149l.d30
            public final void call() {
                this.f114536a.m181122Y4(weChatUserInfo);
            }
        }, new d30() { // from class: l.jqp0
            @Override // p149l.d30
            public final void call() {
                runnable2.run();
            }
        });
    }

    /* JADX INFO: renamed from: Z5 */
    public void m181126Z5() {
        SignupStage signupStage = AccountModule.f16037c.m28312V0().mo108248b().signupStage;
        Intent intentM132322f = !TEnum.equals(signupStage, "unknown_") ? C17367hp.m132322f(act(), signupStage.toString()) : AccountModule.m28132H().toNewMainAct(act(), false, true);
        ((AbstractC19646r6) this.viewModel).getAct().progressDismiss();
        ((AbstractC19646r6) this.viewModel).getAct().startActivity(intentM132322f);
        ((AbstractC19646r6) this.viewModel).getAct().m66873d2();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.drp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87656a.m180987g4((Bundle) obj);
            }
        });
        String str = eje.m116824h().f91713a.get();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(AccountModule.m28131F().userId()) && !"finished".equals(str) && !"unknown_".equals(str)) {
            duringCreated(AccountModule.f16037c.m28318Y0()).subscribe(mkd0.m154956H(new e30() { // from class: l.erp0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f92954a.m181142h4((User) obj);
                }
            }, new e30() { // from class: l.frp0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f98990a.m180996i4((Throwable) obj);
                }
            }));
        }
        qib0.f154687E.m78868t();
        creates(new e30() { // from class: l.hrp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109237a.m181001j4((Bundle) obj);
            }
        }, new d30() { // from class: l.irp0
            @Override // p149l.d30
            public final void call() {
                this.f114671a.m181146k4();
            }
        });
        AccountModule.f16040f.m95181k();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m181127a4(AsyncEmitter asyncEmitter) {
        new UserInfo(act(), m180928O3(act()).getQQToken()).getUserInfo(new C19787b(asyncEmitter));
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m181128a5(WeChatUserInfo weChatUserInfo) {
        m181073E5(weChatUserInfo, false);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m181129b4(View view) {
        if (((AbstractC19646r6) this.viewModel).mo104205e() || !IntlCountryCodeController.m28120p()) {
            this.f161107m.onClick(view);
        } else {
            ((AbstractC19646r6) this.viewModel).mo104209i(this.f161107m, view);
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m181130b5(final Runnable runnable, final WeChatUserInfo weChatUserInfo, final Runnable runnable2, roj0 roj0Var) {
        act().progressDismiss();
        if (!C17133gp.m127315f()) {
            m181073E5(weChatUserInfo, false);
        } else if (TextUtils.isEmpty(this.f161100f) || !m181078H3()) {
            C21176xm.m210011i0(act(), "qq", "", new d30() { // from class: l.app0
                @Override // p149l.d30
                public final void call() {
                    runnable2.run();
                }
            }, new d30() { // from class: l.bpp0
                @Override // p149l.d30
                public final void call() {
                    this.f76662a.m181128a5(weChatUserInfo);
                }
            }, new d30() { // from class: l.cpp0
                @Override // p149l.d30
                public final void call() {
                    runnable.run();
                }
            });
        } else {
            C21176xm.m210013j0(act(), "qq", this.f161100f, new d30() { // from class: l.wop0
                @Override // p149l.d30
                public final void call() {
                    runnable.run();
                }
            }, new d30() { // from class: l.xop0
                @Override // p149l.d30
                public final void call() {
                    this.f193867a.m181119X4(weChatUserInfo);
                }
            }, new d30() { // from class: l.yop0
                @Override // p149l.d30
                public final void call() {
                    runnable2.run();
                }
            }, new d30() { // from class: l.zop0
                @Override // p149l.d30
                public final void call() {
                    this.f204148a.m181125Z4(runnable2, weChatUserInfo, runnable);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b6 */
    public void m181131b6() {
        sh50.m184161f();
        if (App.f15373i.get().intValue() != 1 || f161083I) {
            return;
        }
        f161083I = true;
        if (!ruk.m180873g() || !ruk.m180872c().m180879h()) {
            if (TextUtils.isEmpty(mr4.f135329a) || !mr4.f135329a.toLowerCase().startsWith("douyin")) {
                zvf0.m220371D("e_app_1st_open", "", new j760("is_first_open", Boolean.valueOf(this.f161104j)), new j760("user_agent", bjp0.getDefaultUserAgent(App.f15369e)), new j760("device_model_raw", Build.MODEL), new j760(Device.IMEI, dyd.m114059e()), new j760("imei2", dyd.m114060f()), new j760(Device.OAID, k200.m144241b()), new j760(Device.MEID, dyd.m114061g()));
                return;
            } else {
                zvf0.m220371D("e_app_1st_open", "", new j760("is_first_open", Boolean.valueOf(this.f161104j)), new j760("user_agent", bjp0.getDefaultUserAgent(App.f15369e)), new j760("device_model_raw", Build.MODEL), vwb.m200311Y("toutiao_channel", HumeSDK.getChannel(App.f15369e)), new j760(Device.IMEI, dyd.m114059e()), new j760("imei2", dyd.m114060f()), new j760(Device.OAID, k200.m144241b()), new j760(Device.MEID, dyd.m114061g()));
                return;
            }
        }
        zvf0.m220371D("e_app_1st_open", "", new j760("is_first_open", Boolean.valueOf(this.f161104j)), new j760("package_name", act().getPackageName()), new j760("referrer", ruk.m180872c().m180876d()), new j760("click_time", ruk.m180872c().m180874a()), new j760("install_time", ruk.m180872c().m180875b()), new j760("track", ruk.m180872c().m180877e()), new j760("user_agent", bjp0.getDefaultUserAgent(App.f15369e)), new j760("device_model_raw", Build.MODEL), new j760(Device.IMEI, dyd.m114059e()), new j760("imei2", dyd.m114060f()), new j760(Device.OAID, k200.m144241b()), new j760(Device.MEID, dyd.m114061g()));
        boolean z = nxv.f141053a;
        ruk.m180872c().m180876d();
        ruk.m180872c().m180874a();
        ruk.m180872c().m180875b();
        ruk.m180872c().m180877e();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m181132c4(boolean z, final View view) {
        if (z) {
            zvf0.m220396r("e_signin_phone_button", ((PutongAct) act()).pageId());
        } else if (this.f161105k) {
            zvf0.m220396r("e_intl_signin_phone", ((PutongAct) act()).pageId());
        } else {
            HashMap map = new HashMap();
            map.put("sign up button pressed", "Phone");
            w85.INSTANCE.m202145m("Sign Up", map);
            zvf0.m220396r("e_signin_phone_button", ((PutongAct) act()).pageId());
        }
        m181091M5(new d30() { // from class: l.qsp0
            @Override // p149l.d30
            public final void call() {
                this.f156264a.m181129b4(view);
            }
        }, new asp0(this));
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m181133c5(String str, String str2, final Runnable runnable, final Runnable runnable2, final WeChatUserInfo weChatUserInfo) {
        SignUpData signUpData = new SignUpData();
        signUpData.name = weChatUserInfo.nickname;
        signUpData.signUpType = AccountTempApi.SignUpType.qq;
        signUpData.thirdPartyId = str;
        signUpData.thirdPartyToken = str2;
        AccountModule.f16037c.m28337i2(signUpData);
        duringCreated(eje.m116827r(signUpData, null, true)).subscribe(mkd0.m154956H(new e30() { // from class: l.ntp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140508a.m181130b5(runnable, weChatUserInfo, runnable2, (roj0) obj);
            }
        }, new e30() { // from class: l.otp0
            @Override // p149l.e30
            public final void call(Object obj) {
                rup0.m180990h2(runnable2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c6 */
    public void m181134c6() {
        if (!NullChecker.m81303a(this.f161116v) || this.f161116v.isUnsubscribed()) {
            return;
        }
        this.f161116v.unsubscribe();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m181135d4() {
        ((AbstractC19646r6) this.viewModel).mo104202b(false);
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m181136d5(Boolean bool) {
        AuthData authDataMo108248b = AccountModule.f16037c.m28312V0().mo108248b();
        String string = NullChecker.m81303a(authDataMo108248b) ? authDataMo108248b.signupStage.toString() : "";
        if (C17133gp.m127315f() && bool.booleanValue()) {
            act().startActivity(SignUpAiAct.m28395Y1(act()));
        } else {
            act().startActivity(C17367hp.m132322f(((AbstractC19646r6) this.viewModel).getAct(), string));
        }
        AccountModule.f16039e.m28180h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f161100f);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m181137e4(ThirdPartyData thirdPartyData, roj0 roj0Var) {
        SignUpData signUpData = new SignUpData();
        signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(App.f15369e);
        signUpData.signUpType = AccountTempApi.SignUpType.google;
        m180890B5(signUpData, thirdPartyData);
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m181138e5(final Runnable runnable, final e30 e30Var, final Runnable runnable2) {
        C21176xm.m210011i0(act(), "qq", "verified", new d30() { // from class: l.wpp0
            @Override // p149l.d30
            public final void call() {
                runnable.run();
            }
        }, new d30() { // from class: l.xpp0
            @Override // p149l.d30
            public final void call() {
                e30Var.call(Boolean.TRUE);
            }
        }, new d30() { // from class: l.ypp0
            @Override // p149l.d30
            public final void call() {
                runnable2.run();
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m181139f4(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
        if (m180936Q3(th)) {
            this.f161109o.mo105798b(th, thirdPartyData, runnable, SignInGrantType.get("google"));
        } else {
            e51.m114742G(runnable);
            yij0.m214926D(th);
        }
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m181140f5(final Runnable runnable, final e30 e30Var, final Runnable runnable2, roj0 roj0Var) {
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
        if (TextUtils.isEmpty(this.f161100f) || !m181078H3()) {
            C21176xm.m210011i0(act(), "qq", "", new d30() { // from class: l.ipp0
                @Override // p149l.d30
                public final void call() {
                    runnable2.run();
                }
            }, new d30() { // from class: l.jpp0
                @Override // p149l.d30
                public final void call() {
                    e30Var.call(Boolean.TRUE);
                }
            }, new d30() { // from class: l.kpp0
                @Override // p149l.d30
                public final void call() {
                    runnable.run();
                }
            });
        } else {
            C21176xm.m210013j0(act(), "qq", this.f161100f, new d30() { // from class: l.dpp0
                @Override // p149l.d30
                public final void call() {
                    runnable.run();
                }
            }, new d30() { // from class: l.fpp0
                @Override // p149l.d30
                public final void call() {
                    e30Var.call(Boolean.TRUE);
                }
            }, new d30() { // from class: l.gpp0
                @Override // p149l.d30
                public final void call() {
                    runnable2.run();
                }
            }, new d30() { // from class: l.hpp0
                @Override // p149l.d30
                public final void call() {
                    this.f108954a.m181138e5(runnable2, e30Var, runnable);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ void m181141g5(String str, String str2, Runnable runnable, e30 e30Var, Runnable runnable2, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable2.run();
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40020 || i == 40091) {
            m181097P5(i == 40020, str, str2, runnable, e30Var);
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m181142h4(User user) {
        if (C17133gp.m127315f()) {
            return;
        }
        eje.m116824h().m116836o(user);
        m181071E3();
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m181143h5(final Runnable runnable, final String str, final String str2, final Runnable runnable2, final Runnable runnable3, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable.run();
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40033) {
            ((AbstractC19646r6) this.viewModel).mo104217m(false);
            lsi0.m151595y("QQ暂不支持注册");
            return;
        }
        if (i != 40037) {
            runnable.run();
            return;
        }
        AccountModule.f16037c.m28345m2(AccountTempApi.SignUpType.qq);
        final e30 e30Var = new e30() { // from class: l.jup0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119804a.m181136d5((Boolean) obj);
            }
        };
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("qq");
        signInData.thirdPartyId = str;
        signInData.thirdPartyToken = str2;
        signInData.device = pk8.m169980M();
        AccountModule.f16037c.m28349o2(signInData, false, new Runnable() { // from class: l.kup0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m180953W2();
            }
        }).subscribe(mkd0.m154959K(new e30() { // from class: l.lup0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130081a.m181140f5(runnable2, e30Var, runnable, (roj0) obj);
            }
        }, new e30() { // from class: l.mup0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135828a.m181141g5(str, str2, runnable3, e30Var, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ void m181144i5(AccountTestGroup accountTestGroup) {
        if (accountTestGroup.googleEntry) {
            zvf0.m220402x("e_signin_google_button", ((PutongAct) act()).pageId());
            ((AbstractC19646r6) this.viewModel).mo104213k();
        }
    }

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ void m181145j5(AccountTestFactor accountTestFactor) {
        AccountModule.f16037c.m28358t2(accountTestFactor).subscribe(mkd0.m154956H(new e30() { // from class: l.rsp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160884a.m181144i5((AccountTestGroup) obj);
            }
        }, new e30() { // from class: l.ssp0
            @Override // p149l.e30
            public final void call(Object obj) {
                rup0.m181058z0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m181146k4() {
        act().removeCallbacks(this.f161098d);
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m181147k5(SignInData signInData, Runnable runnable) {
        zvf0.m220396r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        m181105S5(signInData, runnable);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m181148l4() {
        if (!m181100R3()) {
            lsi0.m151595y("未安装QQ");
        } else if (m180928O3(act()).isSessionValid()) {
            m180928O3(act()).logout(act());
        } else {
            ((AbstractC19646r6) this.viewModel).mo104217m(true);
            m180928O3(act()).login(act(), "all", this.f161119y);
        }
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m181149l5(View view) {
        zvf0.m220399u("e_switch_account_button", "p_signin_with_saved_info", vwb.m200311Y("switch_account", "close"));
        this.f161091E.dismiss();
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m181150m4() {
        ((AbstractC19646r6) this.viewModel).getAct().progress(R$string.f16227j0);
        ((AbstractC19646r6) this.viewModel).mo104217m(true);
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m181151m5(d30 d30Var, View view) {
        w85.INSTANCE.m202145m("Login", null);
        zvf0.m220396r("e_signin_with_saved_info_button", "p_signin_with_saved_info");
        d30Var.call();
        this.f161091E.dismiss();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m181152n4() {
        ((AbstractC19646r6) this.viewModel).mo104201a();
        ((AbstractC19646r6) this.viewModel).getAct().progressDismiss();
        ((AbstractC19646r6) this.viewModel).mo104217m(false);
        lsi0.m151595y(act().string(R$string.f16261o4));
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m181153n5(View view) {
        zvf0.m220399u("e_switch_account_button", "p_signin_with_saved_info", vwb.m200311Y("switch_account", "signin_another_account"));
        this.f161091E.dismiss();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m181154o4() {
        ((AbstractC19646r6) this.viewModel).getAct().progressDismiss();
        ((AbstractC19646r6) this.viewModel).mo104217m(false);
        lsi0.m151595y("登录失败，绑定手机号后再试");
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ void m181155o5(Runnable runnable, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            ((AbstractC19646r6) this.viewModel).getAct().progressDismiss();
            lsi0.m151582l(((AbstractC19646r6) this.viewModel).getAct().getResources().getString(R$string.f16075G2), false, true);
            if (NullChecker.m81303a(runnable)) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m181156p4() {
        ((AbstractC19646r6) this.viewModel).getAct().progressDismiss();
        ((AbstractC19646r6) this.viewModel).mo104217m(false);
    }

    /* JADX INFO: renamed from: p5 */
    public final /* synthetic */ void m181157p5(roj0 roj0Var) {
        m181126Z5();
        if (C17133gp.m127319j()) {
            al40.m97271e().m97276j(this.f161100f);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ Boolean m181158q4(Runnable runnable, Runnable runnable2, ThirdPartLoginApi.C4574a c4574a) {
        if (c4574a.f16322b != 0) {
            runnable2.run();
            return Boolean.FALSE;
        }
        this.f161114t = true;
        runnable.run();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m181159q5(Runnable runnable, Throwable th) {
        ((AbstractC19646r6) this.viewModel).getAct().progressDismiss();
        lsi0.m151582l(((AbstractC19646r6) this.viewModel).getAct().getResources().getString(R$string.f16075G2), false, true);
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m181160r4(WeChatToken weChatToken, WeChatUserInfo weChatUserInfo) {
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
        m181134c6();
        act().m66873d2();
        yij0.m214941S(act());
        if (C17133gp.m127319j()) {
            al40.m97271e().m97276j(this.f161100f);
        }
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ void m181161r5(Runnable runnable, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            ((AbstractC19646r6) this.viewModel).getAct().progressDismiss();
            lsi0.m151582l(((AbstractC19646r6) this.viewModel).getAct().getResources().getString(R$string.f16075G2), false, true);
            if (NullChecker.m81303a(runnable)) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m181162s4(Boolean bool) {
        AuthData authDataMo108248b = AccountModule.f16037c.m28312V0().mo108248b();
        String string = NullChecker.m81303a(authDataMo108248b) ? authDataMo108248b.signupStage.toString() : "";
        Intent intentM28395Y1 = (C17133gp.m127315f() && bool.booleanValue()) ? SignUpAiAct.m28395Y1(act()) : C17367hp.m132322f(((AbstractC19646r6) this.viewModel).getAct(), string);
        if ("verified".equals(string) && !eje.m116824h().m116832j(authDataMo108248b.finishedStages)) {
            f161084J.put(Boolean.FALSE);
        }
        act().startActivity(intentM28395Y1);
        AccountModule.f16039e.m28180h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f161100f);
        m181134c6();
        act().m66873d2();
        if (C17133gp.m127319j()) {
            al40.m97271e().m97276j(this.f161100f);
        }
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m181163s5(roj0 roj0Var) {
        AccountModule.f16037c.m28345m2(AccountTempApi.SignUpType.cosmos);
        m181126Z5();
        if (C17133gp.m127319j()) {
            al40.m97271e().m97276j(this.f161100f);
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m181164t4(final Runnable runnable, final e30 e30Var, final Runnable runnable2) {
        C21176xm.m210011i0(act(), "wechat", "verified", new d30() { // from class: l.uqp0
            @Override // p149l.d30
            public final void call() {
                runnable.run();
            }
        }, new d30() { // from class: l.vqp0
            @Override // p149l.d30
            public final void call() {
                e30Var.call(Boolean.TRUE);
            }
        }, new d30() { // from class: l.xqp0
            @Override // p149l.d30
            public final void call() {
                runnable2.run();
            }
        });
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ void m181165t5(SignInData signInData, Runnable runnable, Throwable th) {
        int i;
        ((AbstractC19646r6) this.viewModel).getAct().progressDismiss();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((i = ((TantanException.Client.AccountService) th).code) == 40020 || i == 40091)) {
            m180929O5(i == 40020, signInData, runnable);
            return;
        }
        if (!z || ((TantanException.Client.AccountService) th).code != 40016) {
            lsi0.m151582l(((AbstractC19646r6) this.viewModel).getAct().getResources().getString(R$string.f16075G2), false, true);
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
        AccountModule.f16037c.m28325c1().phoneNumber = this.f161100f;
        ((AbstractC19646r6) this.viewModel).getAct().startActivity(SignUpDetailsNewAct.m28497a2(((AbstractC19646r6) this.viewModel).getAct(), signUpData));
        ((AbstractC19646r6) this.viewModel).getAct().progressDismiss();
        ((AbstractC19646r6) this.viewModel).getAct().m66873d2();
        if (C17133gp.m127319j()) {
            al40.m97271e().m97276j(this.f161100f);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m181166u4(final Runnable runnable, final e30 e30Var, final Runnable runnable2, roj0 roj0Var) {
        act().progressDismiss();
        if (C17133gp.m127315f()) {
            if (C4575a.m28233i1()) {
                C4575a.m28220Z1();
                if (TextUtils.isEmpty(this.f161100f) || !m181078H3()) {
                    C21176xm.m210011i0(act(), "wechat", "", new d30() { // from class: l.eqp0
                        @Override // p149l.d30
                        public final void call() {
                            runnable2.run();
                        }
                    }, new d30() { // from class: l.fqp0
                        @Override // p149l.d30
                        public final void call() {
                            e30Var.call(Boolean.TRUE);
                        }
                    }, new d30() { // from class: l.gqp0
                        @Override // p149l.d30
                        public final void call() {
                            runnable.run();
                        }
                    });
                    return;
                } else {
                    C21176xm.m210013j0(act(), "wechat", this.f161100f, new d30() { // from class: l.zpp0
                        @Override // p149l.d30
                        public final void call() {
                            runnable.run();
                        }
                    }, new d30() { // from class: l.bqp0
                        @Override // p149l.d30
                        public final void call() {
                            e30Var.call(Boolean.TRUE);
                        }
                    }, new d30() { // from class: l.cqp0
                        @Override // p149l.d30
                        public final void call() {
                            runnable2.run();
                        }
                    }, new d30() { // from class: l.dqp0
                        @Override // p149l.d30
                        public final void call() {
                            this.f87464a.m181164t4(runnable2, e30Var, runnable);
                        }
                    });
                    return;
                }
            }
            e30Var.call(Boolean.FALSE);
        }
        e30Var.call(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: u5 */
    public final /* synthetic */ void m181167u5(View view) {
        zvf0.m220396r("e_signin_fb_button", ((PutongAct) act()).pageId());
        if (((AbstractC19646r6) this.viewModel).mo104205e() || !IntlCountryCodeController.m28120p()) {
            this.f161090D.onClick(view);
        } else {
            ((AbstractC19646r6) this.viewModel).mo104209i(this.f161090D, view);
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m181168v4(WeChatToken weChatToken, Runnable runnable, e30 e30Var, Runnable runnable2, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable2.run();
            CrashHelper.m81296c(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40020 || i == 40091) {
            m181102R5(i == 40020, weChatToken, runnable, e30Var);
        } else {
            runnable2.run();
            CrashHelper.m81296c(th);
        }
    }

    /* JADX INFO: renamed from: v5 */
    public final /* synthetic */ void m181169v5(View view) {
        zvf0.m220396r("e_signin_google_button", ((PutongAct) act()).pageId());
        if (((AbstractC19646r6) this.viewModel).mo104205e() || !IntlCountryCodeController.m28120p()) {
            this.f161093G.onClick(view);
        } else {
            ((AbstractC19646r6) this.viewModel).mo104209i(this.f161093G, view);
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m181170w4(final Runnable runnable, final WeChatToken weChatToken, final Runnable runnable2, final Runnable runnable3, Throwable th) {
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
        final e30 e30Var = new e30() { // from class: l.lpp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129242a.m181162s4((Boolean) obj);
            }
        };
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("wechat");
        signInData.thirdPartyId = weChatToken.thirdpartyId;
        signInData.thirdPartyToken = weChatToken.thirdpartyAccessToken;
        signInData.device = pk8.m169980M();
        AccountModule.f16037c.m28349o2(signInData, false, new Runnable() { // from class: l.mpp0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m180979f0();
            }
        }).subscribe(mkd0.m154959K(new e30() { // from class: l.npp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139990a.m181166u4(runnable2, e30Var, runnable, (roj0) obj);
            }
        }, new e30() { // from class: l.opp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145027a.m181168v4(weChatToken, runnable3, e30Var, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: w5 */
    public final /* synthetic */ void m181171w5(String str, roj0 roj0Var) {
        qib0.f154697L.f17146d.m108250i();
        if ("oppo_quick_login".equals(str)) {
            AccountModule.f16037c.m28323b1("user.oppo.signin").subscribe(mkd0.m154955G(new e30() { // from class: l.itp0
                @Override // p149l.e30
                public final void call(Object obj) {
                    rup0.m180946U1((Envelope) obj);
                }
            }));
        } else {
            str = "saved_sign-in_info";
        }
        zvf0.m220371D("e_signin_success", "", vwb.m200311Y("signin_type", str));
        qib0.m174815e1(VerifyReason.signin, new Object[0]);
        act().startActivity(AccountModule.m28132H().newMainActClearStack(m142773Y(), false, true));
        m181134c6();
        act().m66873d2();
        yij0.m214941S(act());
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m181172x4(final Runnable runnable, final Runnable runnable2, final Runnable runnable3, final Runnable runnable4) {
        this.f161118x.registerApp(WXEntryActivity.APPID);
        SendAuth.Req req = new SendAuth.Req();
        req.scope = "snsapi_userinfo";
        req.state = "";
        this.f161118x.sendReq(req);
        runnable.run();
        m181134c6();
        final WeChatToken weChatToken = new WeChatToken();
        this.f161116v = AccountModule.f16039e.m28181i().filter(new w9j() { // from class: l.ztp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f204748a.m181158q4(runnable, runnable2, (ThirdPartLoginApi.C4574a) obj);
            }
        }).flatMap(new w9j() { // from class: l.aup0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return AccountModule.f16039e.m28179g(((ThirdPartLoginApi.C4574a) obj).f16323c);
            }
        }).filter(new w9j() { // from class: l.bup0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rup0.m181021o3(weChatToken, runnable2, (WeChatToken) obj);
            }
        }).flatMap(new w9j() { // from class: l.cup0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                WeChatToken weChatToken2 = (WeChatToken) obj;
                return AccountModule.f16039e.m28185m(weChatToken2.thirdpartyId, weChatToken2.thirdpartyAccessToken, false);
            }
        }).filter(new w9j() { // from class: l.dup0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rup0.m181013m3(runnable2, (ThirdPartVetify) obj);
            }
        }).flatMap(new w9j() { // from class: l.eup0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                WeChatToken weChatToken2 = weChatToken;
                return AccountModule.f16039e.m28184l(weChatToken2.thirdpartyAccessToken, weChatToken2.thirdpartyId);
            }
        }).filter(new w9j() { // from class: l.gup0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rup0.m180997j0(runnable2, (WeChatUserInfo) obj);
            }
        }).first().subscribe(mkd0.m154959K(new e30() { // from class: l.hup0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109578a.m181160r4(weChatToken, (WeChatUserInfo) obj);
            }
        }, new e30() { // from class: l.iup0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115040a.m181170w4(runnable2, weChatToken, runnable3, runnable4, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ void m181173x5(Throwable th) {
        ix50.m138790b().m138791a();
        act().progressDismiss();
        Throwable throwable = th instanceof App.HandledGlobally ? ((App.HandledGlobally) th).getThrowable() : th;
        if (!xck0.m208122c(throwable, ApiExcep.Client.Unauthorized.class) && !xck0.m208122c(throwable, ApiExcep.Client.NotFound.class)) {
            yij0.m214926D(th);
        } else {
            lsi0.m151578h(R$string.f16117P);
            m181089L5();
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m181174y4(SignUpData signUpData, String str) {
        signUpData.profilePath = str;
        AccountModule.f16037c.m28307R0().put(str);
        act().startActivity(SignUpDetailsNewAct.m28497a2(act(), signUpData));
    }

    /* JADX INFO: renamed from: y5 */
    public void m181175y5() {
        m181091M5(new d30() { // from class: l.oup0
            @Override // p149l.d30
            public final void call() {
                this.f145718a.m181148l4();
            }
        }, new asp0(this));
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m181176z4(final SignUpData signUpData) {
        qib0.f154691G.m184720i(signUpData.profilePath, new e30() { // from class: l.xrp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194161a.m181174y4(signUpData, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z5 */
    public void m181177z5() {
        final Runnable runnable = new Runnable() { // from class: l.vsp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f182863a.m181150m4();
            }
        };
        final Runnable runnable2 = new Runnable() { // from class: l.wsp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f187957a.m181152n4();
            }
        };
        final Runnable runnable3 = new Runnable() { // from class: l.xsp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f194299a.m181154o4();
            }
        };
        final Runnable runnable4 = new Runnable() { // from class: l.zsp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f204622a.m181156p4();
            }
        };
        this.f161114t = false;
        m181068D3();
        if (m181103S3()) {
            m181091M5(new d30() { // from class: l.atp0
                @Override // p149l.d30
                public final void call() {
                    this.f71650a.m181172x4(runnable, runnable2, runnable3, runnable4);
                }
            }, new asp0(this));
        } else {
            lsi0.m151595y(App.f15369e.getString(R$string.f16231j4));
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.rup0$a */
    public class C19786a implements IUiListener {
        public C19786a() {
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            rup0.this.m181087K5();
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            rup0.this.f161114t = true;
            if (obj == null || !(obj instanceof JSONObject)) {
                rup0.this.m181087K5();
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            int length = jSONObject.length();
            rup0 rup0Var = rup0.this;
            if (length == 0) {
                rup0Var.m181087K5();
            } else {
                rup0Var.m181070D5(jSONObject);
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            rup0.this.m181087K5();
        }

        @Override // com.tencent.tauth.IUiListener
        public void onWarning(int i) {
        }
    }

    /* JADX INFO: renamed from: l.rup0$b */
    public class C19787b implements IUiListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AsyncEmitter f161122a;

        public C19787b(AsyncEmitter asyncEmitter) {
            this.f161122a = asyncEmitter;
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
            this.f161122a.onError(new IllegalStateException("cancel get qq user info"));
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(Object obj) {
            if (obj == null) {
                this.f161122a.onError(new IllegalStateException("qq user info null"));
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.length() == 0) {
                this.f161122a.onError(new IllegalStateException("qq user info null"));
                return;
            }
            WeChatUserInfo weChatUserInfoNew_ = WeChatUserInfo.new_();
            try {
                weChatUserInfoNew_.nickname = jSONObject.getString("nickname");
                this.f161122a.onNext(weChatUserInfoNew_);
                this.f161122a.onCompleted();
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                this.f161122a.onError(new IllegalStateException("qq user info parse error"));
            }
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(UiError uiError) {
            this.f161122a.onError(new IllegalStateException("error get qq user info" + uiError.errorMessage));
        }

        @Override // com.tencent.tauth.IUiListener
        public void onWarning(int i) {
        }
    }
}
