package p006l;

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
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.api.C0001a;
import com.p000p1.mobile.putong.account.api.ThirdPartLoginApi;
import com.p000p1.mobile.putong.account.data.AccountTestFactor;
import com.p000p1.mobile.putong.account.data.AccountTestGroup;
import com.p000p1.mobile.putong.account.data.MatchCounterEnvelope;
import com.p000p1.mobile.putong.account.data.ThirdPartVetify;
import com.p000p1.mobile.putong.account.data.ThirdPartyData;
import com.p000p1.mobile.putong.account.data.WeChatToken;
import com.p000p1.mobile.putong.account.data.WeChatUserInfo;
import com.p000p1.mobile.putong.account.p002ui.accountai.SignUpAiAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.SignUpDetailsNewAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.EmailLoginOptAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.PhoneNumberLoginOptAct;
import com.p000p1.mobile.putong.api.ABManager;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.api.api.FacebookApi;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.account_core.reponse_data.OneClickStatus;
import com.p1.mobile.account_core.request_data.OperatorType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MobileRespInfo;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.RememberUserInfo;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.SignInGrantType;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.SignupStage;
import com.p1.mobile.putong.data.ThirdPartyValidation;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.VerifyReason;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.UserInfo;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.bzv;
import l.c4g0;
import l.c84;
import l.cwf0;
import l.czv;
import l.d30;
import l.dd80;
import l.dyd;
import l.e30;
import l.e51;
import l.fuf;
import l.g30;
import l.h30;
import l.hpd0;
import l.i0e;
import l.ix50;
import l.j760;
import l.jq2;
import l.juk;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.nxv;
import l.p4k;
import l.pgm;
import l.rhi;
import l.roj0;
import l.t100;
import l.tan;
import l.uqd0;
import l.v9j;
import l.vwb;
import l.w85;
import l.w9j;
import l.xck0;
import l.xw5;
import l.yij0;
import l.zvf0;
import org.json.JSONObject;
import rx.AsyncEmitter;
import rx.subjects.a;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class rup0 extends jq2<AbstractC1211r6> {

    /* JADX INFO: renamed from: I */
    public static boolean f20754I = false;

    /* JADX INFO: renamed from: J */
    public static hpd0 f20755J = new hpd0("has_wechat_login_detail_complete", Boolean.TRUE);

    /* JADX INFO: renamed from: K */
    public static uqd0 f20756K = new uqd0("user_invite_code", "");

    /* JADX INFO: renamed from: L */
    public static hpd0 f20757L = new hpd0("has_click_visitor", Boolean.FALSE);

    /* JADX INFO: renamed from: A */
    public d30 f20758A;

    /* JADX INFO: renamed from: B */
    public e30<SignUpData> f20759B;

    /* JADX INFO: renamed from: C */
    public d30 f20760C;

    /* JADX INFO: renamed from: D */
    public View.OnClickListener f20761D;

    /* JADX INFO: renamed from: E */
    public dd80 f20762E;

    /* JADX INFO: renamed from: F */
    public d30 f20763F;

    /* JADX INFO: renamed from: G */
    public View.OnClickListener f20764G;

    /* JADX INFO: renamed from: H */
    public View.OnClickListener f20765H;

    /* JADX INFO: renamed from: a */
    public boolean f20766a;

    /* JADX INFO: renamed from: b */
    public AccountTempApi.InactiveType f20767b;

    /* JADX INFO: renamed from: c */
    public String f20768c;

    /* JADX INFO: renamed from: d */
    public Runnable f20769d;

    /* JADX INFO: renamed from: e */
    public SignUpData f20770e;

    /* JADX INFO: renamed from: f */
    public String f20771f;

    /* JADX INFO: renamed from: g */
    public OneClickStatus f20772g;

    /* JADX INFO: renamed from: h */
    public boolean f20773h;

    /* JADX INFO: renamed from: i */
    public boolean f20774i;

    /* JADX INFO: renamed from: j */
    public boolean f20775j;

    /* JADX INFO: renamed from: k */
    public boolean f20776k;

    /* JADX INFO: renamed from: l */
    public a<String> f20777l;

    /* JADX INFO: renamed from: m */
    public View.OnClickListener f20778m;

    /* JADX INFO: renamed from: n */
    public View.OnClickListener f20779n;

    /* JADX INFO: renamed from: o */
    public h30<Throwable, ThirdPartyData, Runnable, SignInGrantType> f20780o;

    /* JADX INFO: renamed from: p */
    public c84 f20781p;

    /* JADX INFO: renamed from: q */
    public AccessToken f20782q;

    /* JADX INFO: renamed from: r */
    public d30 f20783r;

    /* JADX INFO: renamed from: s */
    public d30 f20784s;

    /* JADX INFO: renamed from: t */
    public boolean f20785t;

    /* JADX INFO: renamed from: u */
    public boolean f20786u;

    /* JADX INFO: renamed from: v */
    public c4g0 f20787v;

    /* JADX INFO: renamed from: w */
    public d30 f20788w;

    /* JADX INFO: renamed from: x */
    public IWXAPI f20789x;

    /* JADX INFO: renamed from: y */
    public IUiListener f20790y;

    /* JADX INFO: renamed from: z */
    public int f20791z;

    /* JADX INFO: renamed from: l.rup0$c */
    public class DialogInterfaceOnDismissListenerC1235c implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f20795a;

        public DialogInterfaceOnDismissListenerC1235c(cwf0 cwf0Var) {
            this.f20795a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.e(this.f20795a);
        }
    }

    /* JADX INFO: renamed from: l.rup0$d */
    public class DialogInterfaceOnDismissListenerC1236d implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f20797a;

        public DialogInterfaceOnDismissListenerC1236d(cwf0 cwf0Var) {
            this.f20797a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.e(this.f20797a);
        }
    }

    /* JADX INFO: renamed from: l.rup0$e */
    public class C1237e implements fuf<czv> {

        /* JADX INFO: renamed from: a */
        public g30<ThirdPartyData, ThirdPartyValidation, SignUpData> f20799a = new g30() { // from class: l.bvp0
            /* JADX INFO: renamed from: a */
            public final void m12906a(Object obj, Object obj2, Object obj3) {
                this.f9111a.m23277r((ThirdPartyData) obj, (ThirdPartyValidation) obj2, (SignUpData) obj3);
            }
        };

        public C1237e() {
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ SignUpData m23263j(Throwable th) {
            SignUpData signUpData = new SignUpData();
            signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(App.e);
            signUpData.signUpType = AccountTempApi.SignUpType.facebook;
            return signUpData;
        }

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ void m23270A() {
            ((AbstractC1211r6) ((jq2) rup0.this).viewModel).mo12999p(false);
        }

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ void m23271B(ThirdPartyData thirdPartyData, SignUpData signUpData) {
            this.f20799a.a(thirdPartyData, (Object) null, signUpData);
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m23272C(final ThirdPartyData thirdPartyData, final SignUpData signUpData) {
            e51.G(new Runnable() { // from class: l.xup0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27729a.m23271B(thirdPartyData, signUpData);
                }
            });
        }

        /* JADX INFO: renamed from: D */
        public final void m23273D(final SignUpData signUpData, final ThirdPartyData thirdPartyData) {
            final Runnable runnable = new Runnable() { // from class: l.uup0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23759a.m23280u();
                }
            };
            signUpData.thirdPartyId = thirdPartyData.thirdPartyId;
            signUpData.thirdPartyToken = thirdPartyData.thirdPartyToken;
            rup0.this.duringCreated(eje.m14577r(signUpData, null, true)).subscribe(mkd0.H(new e30() { // from class: l.vup0
                public final void call(Object obj) {
                    this.f24478a.m23281v(signUpData, (roj0) obj);
                }
            }, new e30() { // from class: l.wup0
                public final void call(Object obj) {
                    this.f25417a.m23282w(thirdPartyData, runnable, (Throwable) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void onSuccess(czv czvVar) {
            rup0.this.f20782q = czvVar.a();
            final Runnable runnable = new Runnable() { // from class: l.yup0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28409a.m23270A();
                }
            };
            final ThirdPartyData thirdPartyDataNew_ = ThirdPartyData.new_();
            thirdPartyDataNew_.thirdPartyId = rup0.this.f20782q.o();
            thirdPartyDataNew_.thirdPartyToken = rup0.this.f20782q.n();
            AccountModule.f26c.m169C2(thirdPartyDataNew_).subscribe(mkd0.K(new e30() { // from class: l.zup0
                public final void call(Object obj) {
                    this.f28989a.m23284y(thirdPartyDataNew_, (roj0) obj);
                }
            }, new e30() { // from class: l.avp0
                public final void call(Object obj) {
                    this.f8558a.m23285z(thirdPartyDataNew_, runnable, (Throwable) obj);
                }
            }, false));
        }

        /* JADX INFO: renamed from: a */
        public void m23275a(FacebookException facebookException) {
            FacebookApi.m1436m(facebookException);
            e51.G(new Runnable() { // from class: l.sup0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21673a.m23279t();
                }
            });
        }

        public void onCancel() {
            e51.G(new Runnable() { // from class: l.cvp0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9878a.m23278s();
                }
            });
        }

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ void m23276q(ThirdPartyValidation thirdPartyValidation, SignUpData signUpData, ThirdPartyData thirdPartyData, c cVar) {
            if (NullChecker.a(thirdPartyValidation)) {
                signUpData.thirdPartyValidation = thirdPartyValidation;
            }
            m23273D(signUpData, thirdPartyData);
        }

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ void m23277r(final ThirdPartyData thirdPartyData, final ThirdPartyValidation thirdPartyValidation, final SignUpData signUpData) {
            rup0.this.lifecycle().filter(new w9j() { // from class: l.dvp0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.i);
                }
            }).take(1).subscribe(mkd0.G(new e30() { // from class: l.evp0
                public final void call(Object obj) {
                    this.f11469a.m23276q(thirdPartyValidation, signUpData, thirdPartyData, (c) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ void m23278s() {
            ((AbstractC1211r6) ((jq2) rup0.this).viewModel).mo12999p(false);
        }

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ void m23279t() {
            ((AbstractC1211r6) ((jq2) rup0.this).viewModel).mo12999p(false);
        }

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ void m23280u() {
            ((AbstractC1211r6) ((jq2) rup0.this).viewModel).mo12999p(false);
        }

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ void m23281v(SignUpData signUpData, roj0 roj0Var) {
            AccountModule.f26c.m200Q0().put(signUpData.name);
            if (NullChecker.a(signUpData.birthdate)) {
                AccountModule.f26c.m196O0().put(signUpData.birthdate);
            }
            if (NullChecker.a(signUpData.gender)) {
                AccountModule.f26c.m198P0().put(signUpData.gender.toString());
            }
            boolean zIsEmpty = TextUtils.isEmpty(signUpData.profilePath);
            rup0 rup0Var = rup0.this;
            if (zIsEmpty) {
                rup0Var.act().startActivity(SignUpDetailsNewAct.m393a2(rup0.this.act(), signUpData));
            } else {
                rup0Var.f20759B.call(signUpData);
            }
        }

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ void m23282w(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
            if (rup0.this.m23012Q3(th)) {
                rup0.this.f20780o.b(th, thirdPartyData, runnable, SignInGrantType.get("facebook"));
            } else {
                e51.G(runnable);
                yij0.D(th);
            }
        }

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ void m23283x(Throwable th) {
            rup0.this.f20784s.call();
        }

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ void m23284y(final ThirdPartyData thirdPartyData, roj0 roj0Var) {
            AccountModule.f26c.m214Y1(rup0.this.f20782q.o(), rup0.this.f20782q.n()).onErrorReturn(new w9j() { // from class: l.fvp0
                public final Object call(Object obj) {
                    return rup0.C1237e.m23263j((Throwable) obj);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.gvp0
                public final void call(Object obj) {
                    this.f13536a.m23272C(thirdPartyData, (SignUpData) obj);
                }
            }, new e30() { // from class: l.tup0
                public final void call(Object obj) {
                    this.f22287a.m23283x((Throwable) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ void m23285z(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
            if (rup0.this.m23012Q3(th)) {
                rup0.this.f20780o.b(th, thirdPartyData, runnable, SignInGrantType.get("facebook"));
            } else {
                e51.G(runnable);
                yij0.D(th);
            }
        }
    }

    /* JADX INFO: renamed from: l.rup0$f */
    public class DialogInterfaceOnDismissListenerC1238f implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f20801a;

        public DialogInterfaceOnDismissListenerC1238f(cwf0 cwf0Var) {
            this.f20801a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.e(this.f20801a);
        }
    }

    /* JADX INFO: renamed from: l.rup0$g */
    public static /* synthetic */ class C1239g {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f20803a;

        static {
            int[] iArr = new int[OperatorType.values().length];
            f20803a = iArr;
            try {
                iArr[OperatorType.china_mobile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20803a[OperatorType.china_telecom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20803a[OperatorType.china_unicom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public rup0(mcr mcrVar) {
        super(mcrVar);
        this.f20766a = false;
        this.f20767b = AccountTempApi.InactiveType.None;
        this.f20768c = "";
        this.f20776k = false;
        this.f20777l = a.b();
        this.f20778m = new View.OnClickListener() { // from class: l.nsp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17839a.m22997M4(view);
            }
        };
        this.f20779n = new View.OnClickListener() { // from class: l.fup0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12925a.m23169N4(view);
            }
        };
        this.f20780o = new h30() { // from class: l.qup0
            /* JADX INFO: renamed from: b */
            public final void m22425b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f20087a.m23152G4((Throwable) obj, (ThirdPartyData) obj2, (Runnable) obj3, (SignInGrantType) obj4);
            }
        };
        this.f20783r = new d30() { // from class: l.epp0
            public final void call() {
                this.f11390a.m23158I4();
            }
        };
        this.f20784s = new d30() { // from class: l.ppp0
            public final void call() {
                this.f19260a.m22992K4();
            }
        };
        this.f20785t = false;
        this.f20786u = false;
        this.f20788w = new d30() { // from class: l.aqp0
            public final void call() {
                this.f8448a.m23164L4();
            }
        };
        this.f20790y = new C1233a();
        this.f20758A = new d30() { // from class: l.lqp0
            public final void call() {
                this.f16581a.m23172P4();
            }
        };
        this.f20759B = new e30() { // from class: l.wqp0
            public final void call(Object obj) {
                this.f25319a.m23253z4((SignUpData) obj);
            }
        };
        this.f20760C = new d30() { // from class: l.brp0
            public final void call() {
                this.f9059a.m23138A4();
            }
        };
        this.f20761D = new View.OnClickListener() { // from class: l.crp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9803a.m23140B4(view);
            }
        };
        this.f20763F = new d30() { // from class: l.ysp0
            public final void call() {
                this.f28373a.m23145D4();
            }
        };
        this.f20764G = new View.OnClickListener() { // from class: l.jtp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15398a.m23150F4(view);
            }
        };
        this.f20765H = new View.OnClickListener() { // from class: l.utp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23750a.m23155H4(view);
            }
        };
    }

    /* JADX INFO: renamed from: B5 */
    private void m22966B5(final SignUpData signUpData, final ThirdPartyData thirdPartyData) {
        final Runnable runnable = new Runnable() { // from class: l.dsp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10555a.m23174Q4();
            }
        };
        signUpData.thirdPartyId = thirdPartyData.thirdPartyId;
        signUpData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        signUpData.email = thirdPartyData.email;
        signUpData.signUpType = AccountTempApi.SignUpType.google;
        duringCreated(eje.m14577r(signUpData, null, true)).subscribe(mkd0.H(new e30() { // from class: l.esp0
            public final void call(Object obj) {
                this.f11421a.m23177R4(signUpData, (roj0) obj);
            }
        }, new e30() { // from class: l.fsp0
            public final void call(Object obj) {
                this.f12887a.m23180S4(thirdPartyData, runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E2 */
    public static /* synthetic */ void m22975E2() {
    }

    /* JADX INFO: renamed from: F3 */
    private void m22979F3(Intent intent) {
        try {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) com.google.android.gms.auth.api.signin.a.b(intent).m(ApiException.class);
            ((AbstractC1211r6) ((jq2) this).viewModel).mo12978b(false);
            m23171P3(googleSignInAccount.g0(), googleSignInAccount.h0(), googleSignInAccount.H());
        } catch (ApiException e) {
            if (e.getStatusCode() != 12501) {
                lsi0.h(R$string.f300y3);
            }
            ((AbstractC1211r6) ((jq2) this).viewModel).mo12978b(false);
        }
    }

    /* JADX INFO: renamed from: H1 */
    public static /* synthetic */ void m22982H1() {
    }

    /* JADX INFO: renamed from: K3 */
    public static String m22991K3() {
        return (String) f20756K.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K4 */
    public /* synthetic */ void m22992K4() {
        e51.G(new Runnable() { // from class: l.yrp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f28363a.m23161J4();
            }
        });
        if (NullChecker.a(AccessToken.d())) {
            bzv.m().u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M4 */
    public /* synthetic */ void m22997M4(View view) {
        act().startActivity(PhoneNumberLoginOptAct.m578Y1(act()));
    }

    /* JADX INFO: renamed from: N2 */
    public static /* synthetic */ void m23000N2(d30 d30Var, roj0 roj0Var) {
        tan.b();
        d30Var.call();
    }

    /* JADX INFO: renamed from: N5 */
    public static void m23001N5() {
        f20756K.put("");
    }

    /* JADX INFO: renamed from: O3 */
    public static Tencent m23004O3(Context context) {
        Tencent.setIsPermissionGranted(true);
        return Tencent.createInstance(xw5.b, context);
    }

    /* JADX INFO: renamed from: O5 */
    private void m23005O5(boolean z, final SignInData signInData, final Runnable runnable) {
        cwf0 cwf0VarC = i0e.c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        i0e.f(cwf0VarC);
        ((AbstractC1211r6) ((jq2) this).viewModel).act().dialog().E0(z ? R$string.f139V2 : R$string.f129T2).D(z ? R$string.f144W2 : R$string.f134U2).t0(R$string.f301z, new Runnable() { // from class: l.qpp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19968a.m23224k5(signInData, runnable);
            }
        }).l0(R$string.f167b, new Runnable() { // from class: l.rpp0
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
            }
        }).V(new DialogInterfaceOnDismissListenerC1238f(cwf0VarC)).z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q3 */
    public boolean m23012Q3(Throwable th) {
        return NullChecker.a(th) && (th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40037;
    }

    /* JADX INFO: renamed from: S2 */
    public static /* synthetic */ void m23018S2(Runnable runnable, Throwable th) {
        runnable.run();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: U1 */
    public static /* synthetic */ void m23022U1(Envelope envelope) {
    }

    /* JADX INFO: renamed from: U2 */
    public static /* synthetic */ void m23023U2() {
    }

    /* JADX INFO: renamed from: W2 */
    public static /* synthetic */ void m23029W2() {
    }

    /* JADX INFO: renamed from: Z2 */
    public static /* synthetic */ void m23037Z2(d30 d30Var, roj0 roj0Var) {
        tan.b();
        d30Var.call();
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m23039a2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a6 */
    public void m23041a6() {
        ((AbstractC1211r6) ((jq2) this).viewModel).act().startActivity(PhoneNumberLoginOptAct.m578Y1(((AbstractC1211r6) ((jq2) this).viewModel).act()));
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ void m23054e3(String str, String str2, final e30 e30Var, final Runnable runnable) {
        zvf0.r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("qq");
        signInData.thirdPartyId = str;
        signInData.thirdPartyToken = str2;
        AccountModule.f26c.m244o2(signInData, true, new Runnable() { // from class: l.kqp0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m22975E2();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.mqp0
            public final void call(Object obj) {
                e30Var.call(Boolean.FALSE);
            }
        }, new e30() { // from class: l.nqp0
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m23055f0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public /* synthetic */ void m23063g4(Bundle bundle) {
        if (NullChecker.a(act().getSupportActionBar())) {
            act().getSupportActionBar().m();
        }
        ((AbstractC1211r6) ((jq2) this).viewModel).mo13003r();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m23064h0(Runnable runnable) {
        zvf0.r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
        runnable.run();
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ void m23065h1() {
    }

    /* JADX INFO: renamed from: h2 */
    public static /* synthetic */ void m23066h2(Runnable runnable, Throwable th) {
        runnable.run();
        CrashHelper.c(new Exception("wechat signup no transition--> message:" + th.getMessage(), th));
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m23068i0(Runnable runnable) {
        zvf0.r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4 */
    public /* synthetic */ void m23072i4(Throwable th) {
        if ((th instanceof ApiExcep.Client.NotFound) || (th instanceof ApiExcep.Client.Unauthorized) || ((th instanceof App.HandledGlobally) && (((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            eje.m14574h().m14584m();
        } else {
            eje.m14574h().m14580g();
            m23147E3();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ Boolean m23073j0(Runnable runnable, WeChatUserInfo weChatUserInfo) {
        if (NullChecker.a(weChatUserInfo)) {
            return Boolean.TRUE;
        }
        runnable.run();
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ void m23077j4(Bundle bundle) {
        this.f20769d = ((AbstractC1211r6) ((jq2) this).viewModel).mo12979c(this.f20766a);
        m23162J5(this.f20773h);
        if (IntlCountryCodeController.m8i()) {
            AccountTempApi.InactiveType inactiveType = this.f20767b;
            if (inactiveType == AccountTempApi.InactiveType.Pause) {
                C1444xm.m27326m0(act(), act().string(R$string.f210i0), act().string(R$string.f204h0), act().string(R$string.f79J2));
            } else if (inactiveType == AccountTempApi.InactiveType.DeleteImmediately) {
                C1444xm.m27326m0(act(), act().string(R$string.f198g0), this.f20774i ? String.format("%s\n\n%s", act().string(R$string.f192f0), act().string(R$string.f228l0)) : act().string(R$string.f192f0), act().string(R$string.f79J2));
            }
        }
        if (this.f20767b == AccountTempApi.InactiveType.DeleteImmediately && !TextUtils.isEmpty(this.f20768c) && RemoteConfig.x().F("setting_snail_diversion_config").contains(this.f20768c)) {
            j2e0.m17248m(act(), Uri.parse("tantan://webview?url=".concat(juk.e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/love-snail/index.html?speed=true&_bid=1004028&hideNavigationBar=1&hideNotch=1" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/love-snail/index.html?speed=true&_bid=1004028&hideNavigationBar=1&hideNotch=1")));
        }
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ Boolean m23089m3(Runnable runnable, ThirdPartVetify thirdPartVetify) {
        if (NullChecker.a(thirdPartVetify) && thirdPartVetify.code == 200) {
            return Boolean.TRUE;
        }
        runnable.run();
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: o2 */
    public static /* synthetic */ rx.c m23096o2(SignInData signInData, MobileRespInfo mobileRespInfo) {
        signInData.grantType = mobileRespInfo.grantType;
        signInData.thirdPartyToken = mobileRespInfo.token;
        signInData.thirdPartyAccessCode = mobileRespInfo.accessCode;
        signInData.thirdPartyId = mobileRespInfo.openId;
        return AccountModule.f26c.m244o2(signInData, true, new Runnable() { // from class: l.tqp0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m23065h1();
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public static /* synthetic */ Boolean m23097o3(WeChatToken weChatToken, Runnable runnable, WeChatToken weChatToken2) {
        if (!NullChecker.a(weChatToken2) || TextUtils.isEmpty(weChatToken2.thirdpartyId) || TextUtils.isEmpty(weChatToken2.thirdpartyAccessToken)) {
            runnable.run();
            return Boolean.FALSE;
        }
        weChatToken.thirdpartyId = weChatToken2.thirdpartyId;
        weChatToken.thirdpartyAccessToken = weChatToken2.thirdpartyAccessToken;
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m23106r0(WeChatToken weChatToken, final e30 e30Var, final Runnable runnable) {
        zvf0.r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("wechat");
        signInData.thirdPartyId = weChatToken.thirdpartyId;
        signInData.thirdPartyToken = weChatToken.thirdpartyAccessToken;
        AccountModule.f26c.m244o2(signInData, true, new Runnable() { // from class: l.yqp0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m23023U2();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.zqp0
            public final void call(Object obj) {
                e30Var.call(Boolean.FALSE);
            }
        }, new e30() { // from class: l.arp0
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m23110s0(MatchCounterEnvelope matchCounterEnvelope) {
        long j = matchCounterEnvelope.totalCounters.matches;
        if (j > 0) {
            AccountModule.f26c.f318j.put(Long.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: s1 */
    public static /* synthetic */ void m23111s1(SignInGrantType signInGrantType, ThirdPartyData thirdPartyData, final d30 d30Var, final Runnable runnable) {
        SignInData signInData = new SignInData();
        signInData.grantType = signInGrantType;
        signInData.thirdPartyId = thirdPartyData.thirdPartyId;
        signInData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        AccountModule.f26c.m244o2(signInData, true, null).subscribe(mkd0.H(new e30() { // from class: l.wtp0
            public final void call(Object obj) {
                rup0.m23000N2(d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.xtp0
            public final void call(Object obj) {
                rup0.m23018S2(runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ void m23122v1(Throwable th) {
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ rx.c m23127x0(SignInData signInData, MobileRespInfo mobileRespInfo) {
        signInData.grantType = mobileRespInfo.grantType;
        signInData.thirdPartyToken = mobileRespInfo.token;
        signInData.thirdPartyAccessCode = mobileRespInfo.accessCode;
        signInData.thirdPartyId = mobileRespInfo.openId;
        return AccountModule.f26c.m244o2(signInData, false, new Runnable() { // from class: l.spp0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m22982H1();
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m23134z0(Throwable th) {
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m23138A4() {
        ((AbstractC1211r6) ((jq2) this).viewModel).mo12988j();
        zvf0.x("e_signin_fb_button", ((PutongAct) act()).pageId());
        this.f20781p = c84.b.a();
        bzv.m().y(this.f20781p, new C1237e());
        ((AbstractC1211r6) ((jq2) this).viewModel).mo13001q();
    }

    /* JADX INFO: renamed from: A5 */
    public void m23139A5(int i, int i2, Intent intent) {
        if (i == 9001) {
            m22979F3(intent);
        }
        if (NullChecker.a(this.f20781p)) {
            this.f20781p.a(i, i2, intent);
        }
        if (i == 786 && i2 == 0) {
            this.f20784s.call();
        }
        if (i == 11101) {
            Tencent.onActivityResultData(i, i2, intent, this.f20790y);
        }
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m23140B4(View view) {
        ((AbstractC1211r6) ((jq2) this).viewModel).mo12999p(true);
        bzv.m().u();
        bzv.m().t(act(), FacebookApi.f1141d);
    }

    /* JADX INFO: renamed from: C3, reason: merged with bridge method [inline-methods] */
    public final void m23172P4() {
        duringCreated(new v9j() { // from class: l.osp0
            public final Object call() {
                return ChinaMobileController.m1499b().m1507i(5000);
            }
        }, false).subscribe(mkd0.G(new e30() { // from class: l.psp0
            public final void call(Object obj) {
                this.f19287a.m23188V3((MobileRespInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m23142C4() {
        ((AbstractC1211r6) ((jq2) this).viewModel).mo13008u();
        SignInData signInData = new SignInData();
        signInData.device = pk8.m21562M();
        m23184T5(signInData, new Runnable() { // from class: l.htp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14077a.m23041a6();
            }
        });
    }

    /* JADX INFO: renamed from: C5 */
    public void m23143C5(List<Media> list) {
        if (list.size() > 0 && (list.get(0) instanceof Picture) && NullChecker.c(this.f20770e, "account", CrashHelper.ReportLevel.p9)) {
            pgm pgmVar = new pgm(rhi.z(list.get(0).url), 960);
            try {
                this.f20770e.profilePath = pgmVar.d();
                m23157I3(this.f20770e);
            } catch (IOException e) {
                CrashHelper.c(e);
                this.f20784s.call();
            }
        }
    }

    /* JADX INFO: renamed from: D3 */
    public final void m23144D3() {
        if (this.f20789x == null) {
            this.f20789x = WXAPIFactory.createWXAPI(Y(), (String) null);
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ void m23145D4() {
        m23167M5(new d30() { // from class: l.zrp0
            public final void call() {
                this.f28950a.m23142C4();
            }
        }, new asp0(this));
    }

    /* JADX INFO: renamed from: D5 */
    public final void m23146D5(JSONObject jSONObject) {
        Exception exc;
        String string;
        String string2;
        ((AbstractC1211r6) ((jq2) this).viewModel).mo12994m(true);
        final Runnable runnable = new Runnable() { // from class: l.btp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9087a.m23183T4();
            }
        };
        final Runnable runnable2 = new Runnable() { // from class: l.ctp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9839a.m23186U4();
            }
        };
        final Runnable runnable3 = new Runnable() { // from class: l.dtp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10565a.m23189V4();
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
                    CrashHelper.c(exc);
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
        m23004O3(act()).setAccessToken(str, string3);
        m23004O3(act()).setOpenId(str2);
        AccountModule.f28e.m80m(str2, str, true).first().flatMap(new w9j() { // from class: l.etp0
            public final Object call(Object obj) {
                return this.f11449a.m23192W4((ThirdPartVetify) obj);
            }
        }).first().subscribe(mkd0.K(new e30() { // from class: l.ftp0
            public final void call(Object obj) {
                this.f12904a.m23210c5(str2, str, runnable2, runnable, (WeChatUserInfo) obj);
            }
        }, new e30() { // from class: l.gtp0
            public final void call(Object obj) {
                this.f13500a.m23220h5(runnable, str2, str, runnable2, runnable3, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: E3 */
    public final void m23147E3() {
        if (this.f20766a) {
            act().hideInput();
            return;
        }
        act().startActivity(C0811hp.m16305e(act()));
        act().finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m23148E4(final SignInGrantType signInGrantType, final ThirdPartyData thirdPartyData, final d30 d30Var, final Runnable runnable, Throwable th, Throwable th2) {
        if (!(th2 instanceof TantanException.Client.AccountService)) {
            runnable.run();
            yij0.D(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th2).code;
        if (i == 40020 || i == 40091) {
            boolean z = i == 40020;
            act().dialog().E0(z ? R$string.f139V2 : R$string.f129T2).D(z ? R$string.f144W2 : R$string.f134U2).t0(R$string.f301z, new Runnable() { // from class: l.ktp0
                @Override // java.lang.Runnable
                public final void run() {
                    rup0.m23111s1(signInGrantType, thirdPartyData, d30Var, runnable);
                }
            }).l0(R$string.f167b, runnable).z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.ltp0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    runnable.run();
                }
            });
        }
    }

    /* JADX INFO: renamed from: E5 */
    public void m23149E5(WeChatUserInfo weChatUserInfo, boolean z) {
        AccountModule.f28e.m75h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f20771f);
        if (z) {
            f20755J.put(Boolean.FALSE);
        }
        AccountModule.f26c.m185I2().put(weChatUserInfo.nickname);
        act().startActivity(C0811hp.m16305e(((AbstractC1211r6) ((jq2) this).viewModel).act()));
    }

    /* JADX INFO: renamed from: F4 */
    public final /* synthetic */ void m23150F4(View view) {
        ((AbstractC1211r6) ((jq2) this).viewModel).mo12978b(true);
        p4k p4kVarA = com.google.android.gms.auth.api.signin.a.a(Y(), new GoogleSignInOptions.a(GoogleSignInOptions.DEFAULT_SIGN_IN).b().d("218526224262-usliqg20cepnb3ql98amgeum18v8uatv.apps.googleusercontent.com").a());
        p4kVarA.d();
        act().startActivityForResult(p4kVarA.b(), 9001);
    }

    /* JADX INFO: renamed from: F5 */
    public void m23151F5() {
        RememberUserInfo rememberUserInfo = (RememberUserInfo) qib0.f19788L.f1135d.b();
        if (NullChecker.a(rememberUserInfo)) {
            m23175Q5(rememberUserInfo, act(), new csp0(this));
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m23152G4(final Throwable th, final ThirdPartyData thirdPartyData, final Runnable runnable, final SignInGrantType signInGrantType) {
        SignInData signInData = new SignInData();
        signInData.grantType = signInGrantType;
        signInData.thirdPartyId = thirdPartyData.thirdPartyId;
        signInData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        signInData.thirdEmail = thirdPartyData.email;
        final d30 d30Var = new d30() { // from class: l.hsp0
            public final void call() {
                this.f14039a.m23170O4();
            }
        };
        AccountModule.f26c.m244o2(signInData, false, null).subscribe(mkd0.H(new e30() { // from class: l.isp0
            public final void call(Object obj) {
                rup0.m23037Z2(d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.jsp0
            public final void call(Object obj) {
                this.f15377a.m23148E4(signInGrantType, thirdPartyData, d30Var, runnable, th, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G5 */
    public void m23153G5() {
        if (this.f20786u) {
            if (!this.f20785t) {
                ((AbstractC1211r6) ((jq2) this).viewModel).mo12994m(false);
            }
            this.f20785t = false;
        }
        duringCreated(AccountModule.f26c.m211X0()).subscribe(mkd0.H(new e30() { // from class: l.jrp0
            public final void call(Object obj) {
                rup0.m23110s0((MatchCounterEnvelope) obj);
            }
        }, new e30() { // from class: l.krp0
            public final void call(Object obj) {
                rup0.m23122v1((Throwable) obj);
            }
        }));
        ((AbstractC1211r6) ((jq2) this).viewModel).mo12982f();
    }

    /* JADX INFO: renamed from: H3 */
    public boolean m23154H3() {
        OperatorType operatorTypeM12625c;
        if (this.f20772g == null || (operatorTypeM12625c = AccountModule.f27d.f24489a.m12625c()) == null) {
            return true;
        }
        int i = C1239g.f20803a[operatorTypeM12625c.ordinal()];
        if (i == 1 || i == 2) {
            return this.f20772g.chinaMobile;
        }
        if (i != 3) {
            return true;
        }
        return this.f20772g.chinaUnicom;
    }

    /* JADX INFO: renamed from: H4 */
    public final /* synthetic */ void m23155H4(View view) {
        act().startActivity(EmailLoginOptAct.m561Y1(act(), VerifyReason.get("signup_signin"), ""));
    }

    /* JADX INFO: renamed from: H5 */
    public void m23156H5() {
        this.f20763F.call();
    }

    /* JADX INFO: renamed from: I3 */
    public final void m23157I3(final SignUpData signUpData) {
        C0001a.m145q2(signUpData, null).subscribe(mkd0.H(new e30() { // from class: l.lrp0
            public final void call(Object obj) {
                this.f16607a.m23191W3(signUpData, (roj0) obj);
            }
        }, new e30() { // from class: l.mrp0
            public final void call(Object obj) {
                this.f17214a.m23194X3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I4 */
    public final /* synthetic */ void m23158I4() {
        this.f20786u = false;
        this.f20785t = false;
        ((AbstractC1211r6) ((jq2) this).viewModel).mo12996n();
    }

    /* JADX INFO: renamed from: I5 */
    public final void m23159I5() {
        m23162J5(false);
    }

    /* JADX INFO: renamed from: J3 */
    public View.OnClickListener m23160J3() {
        return new View.OnClickListener() { // from class: l.mtp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17244a.m23200Z3(view);
            }
        };
    }

    /* JADX INFO: renamed from: J4 */
    public final /* synthetic */ void m23161J4() {
        ((AbstractC1211r6) ((jq2) this).viewModel).mo12999p(false);
    }

    /* JADX INFO: renamed from: J5 */
    public final void m23162J5(boolean z) {
        ((AbstractC1211r6) ((jq2) this).viewModel).mo12992l();
        RememberUserInfo rememberUserInfo = (RememberUserInfo) qib0.f19788L.f1135d.b();
        if (NullChecker.a(rememberUserInfo) && z) {
            m23175Q5(rememberUserInfo, act(), new csp0(this));
        }
        final AccountTestFactor accountTestFactor = new AccountTestFactor();
        accountTestFactor.step = "appOpen";
        accountTestFactor.channel = "googleplay";
        final d30 d30Var = new d30() { // from class: l.ksp0
            public final void call() {
                this.f15985a.m23222j5(accountTestFactor);
            }
        };
        AccountModule.f26c.m182H2().subscribe(mkd0.H(new e30() { // from class: l.lsp0
            public final void call(Object obj) {
                d30Var.call();
            }
        }, new e30() { // from class: l.msp0
            public final void call(Object obj) {
                d30Var.call();
            }
        }));
    }

    /* JADX INFO: renamed from: K5 */
    public final void m23163K5() {
        ((AbstractC1211r6) ((jq2) this).viewModel).mo12994m(false);
        lsi0.j("授权失败，请再次尝试");
    }

    /* JADX INFO: renamed from: L4 */
    public final /* synthetic */ void m23164L4() {
        this.f20786u = true;
        ((AbstractC1211r6) ((jq2) this).viewModel).mo13005s();
    }

    /* JADX INFO: renamed from: L5 */
    public void m23165L5() {
        qib0.f19788L.f1135d.i();
        m23159I5();
    }

    /* JADX INFO: renamed from: M3 */
    public rx.c<WeChatUserInfo> m23166M3() {
        return rx.c.fromAsync(new e30() { // from class: l.nup0
            public final void call(Object obj) {
                this.f17875a.m23204a4((AsyncEmitter) obj);
            }
        }, AsyncEmitter.BackpressureMode.LATEST);
    }

    /* JADX INFO: renamed from: M5 */
    public void m23167M5(d30 d30Var, d30 d30Var2) {
        if (d30Var2 != null) {
            d30Var2.call();
        }
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: N3 */
    public View.OnClickListener m23168N3(final boolean z) {
        return new View.OnClickListener() { // from class: l.bsp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9070a.m23209c4(z, view);
            }
        };
    }

    /* JADX INFO: renamed from: N4 */
    public final /* synthetic */ void m23169N4(View view) {
        act().startActivity(PhoneNumberLoginOptAct.m578Y1(act()));
    }

    /* JADX INFO: renamed from: O4 */
    public final /* synthetic */ void m23170O4() {
        AuthData authData = (AuthData) AccountModule.f26c.m207V0().b();
        act().startActivity(C0811hp.m16306f(((AbstractC1211r6) ((jq2) this).viewModel).act(), NullChecker.a(authData) ? authData.signupStage.toString() : ""));
        AccountModule.f28e.m75h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f20771f);
        act().finish();
    }

    /* JADX INFO: renamed from: P3 */
    public void m23171P3(String str, String str2, String str3) {
        final Runnable runnable = new Runnable() { // from class: l.top0
            @Override // java.lang.Runnable
            public final void run() {
                this.f22212a.m23212d4();
            }
        };
        final ThirdPartyData thirdPartyDataNew_ = ThirdPartyData.new_();
        thirdPartyDataNew_.thirdPartyId = str;
        thirdPartyDataNew_.thirdPartyToken = str2;
        thirdPartyDataNew_.email = str3;
        duringCreated(AccountModule.f26c.m171D2(thirdPartyDataNew_)).subscribe(mkd0.K(new e30() { // from class: l.grp0
            public final void call(Object obj) {
                this.f13462a.m23214e4(thirdPartyDataNew_, (roj0) obj);
            }
        }, new e30() { // from class: l.rrp0
            public final void call(Object obj) {
                this.f20692a.m23216f4(thirdPartyDataNew_, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: P5 */
    public final void m23173P5(boolean z, final String str, final String str2, final Runnable runnable, final e30<Boolean> e30Var) {
        cwf0 cwf0VarC = i0e.c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        i0e.f(cwf0VarC);
        act().dialog().E0(z ? R$string.f139V2 : R$string.f129T2).D(z ? R$string.f144W2 : R$string.f134U2).t0(R$string.f301z, new Runnable() { // from class: l.pup0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m23054e3(str, str2, e30Var, runnable);
            }
        }).l0(R$string.f167b, new Runnable() { // from class: l.uop0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m23064h0(runnable);
            }
        }).V(new DialogInterfaceOnDismissListenerC1236d(cwf0VarC)).z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.vop0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
    }

    /* JADX INFO: renamed from: Q4 */
    public final /* synthetic */ void m23174Q4() {
        ((AbstractC1211r6) ((jq2) this).viewModel).mo12978b(false);
    }

    /* JADX INFO: renamed from: Q5 */
    public final void m23175Q5(RememberUserInfo rememberUserInfo, Act act, final d30 d30Var) {
        if (((AbstractC1211r6) ((jq2) this).viewModel).mo12980d()) {
            return;
        }
        if (NullChecker.a(this.f20762E) && this.f20762E.isShowing()) {
            return;
        }
        dd80.a aVarNewDialog = act.newDialog();
        View viewInflate = act.inflater().inflate(c6c0.f9438k0, (ViewGroup) null);
        SimpleDraweeView simpleDraweeView = (VDraweeView) viewInflate.findViewById(q4c0.f19573G);
        VImage vImageFindViewById = viewInflate.findViewById(q4c0.f19607h);
        VButton vButtonFindViewById = viewInflate.findViewById(q4c0.f19571E);
        VText vTextFindViewById = viewInflate.findViewById(q4c0.f19603f);
        VText vTextFindViewById2 = viewInflate.findViewById(q4c0.f19574H);
        bkb0 bkb0Var = qib0.f19782G;
        String str = rememberUserInfo.imgUrl;
        int i = t100.S;
        bkb0Var.m12738I0(simpleDraweeView, str, i, i);
        vTextFindViewById2.setText(rememberUserInfo.name);
        vButtonFindViewById.setText(act.getResources().getString(R$string.f171b3, m23199Y5(rememberUserInfo.name)));
        vTextFindViewById.setText(R$string.f177c3);
        final cwf0 cwf0VarC = i0e.c("p_signin_with_saved_info", Dialog.class.getName());
        this.f20762E = aVarNewDialog.R(viewInflate).P(true).o0(new DialogInterface.OnShowListener() { // from class: l.qrp0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.f(cwf0VarC);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.srp0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).l0(new DialogInterface.OnCancelListener() { // from class: l.trp0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zvf0.u("e_switch_account_button", "p_signin_with_saved_info", new j760[]{vwb.Y("switch_account", "close")});
            }
        }).r0();
        vImageFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.urp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23723a.m23226l5(view);
            }
        });
        vButtonFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.vrp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24436a.m23228m5(d30Var, view);
            }
        });
        vTextFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.wrp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25339a.m23230n5(view);
            }
        });
    }

    /* JADX INFO: renamed from: R3 */
    public boolean m23176R3() {
        try {
            return act().getPackageManager().getPackageInfo("com.tencent.mobileqq", 0) != null;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: R4 */
    public final /* synthetic */ void m23177R4(SignUpData signUpData, roj0 roj0Var) {
        if (((Boolean) zmi0.f28826b.get()).booleanValue()) {
            act().startActivity(C0811hp.m16305e(act()));
        } else {
            act().startActivity(SignUpDetailsNewAct.m393a2(act(), signUpData));
        }
    }

    /* JADX INFO: renamed from: R5 */
    public final void m23178R5(boolean z, final WeChatToken weChatToken, final Runnable runnable, final e30<Boolean> e30Var) {
        cwf0 cwf0VarC = i0e.c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        i0e.f(cwf0VarC);
        act().dialog().E0(z ? R$string.f139V2 : R$string.f129T2).D(z ? R$string.f144W2 : R$string.f134U2).t0(R$string.f301z, new Runnable() { // from class: l.tpp0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m23106r0(weChatToken, e30Var, runnable);
            }
        }).l0(R$string.f167b, new Runnable() { // from class: l.upp0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m23068i0(runnable);
            }
        }).V(new DialogInterfaceOnDismissListenerC1235c(cwf0VarC)).z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.vpp0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
    }

    /* JADX INFO: renamed from: S3 */
    public boolean m23179S3() {
        m23144D3();
        return this.f20789x.isWXAppInstalled();
    }

    /* JADX INFO: renamed from: S4 */
    public final /* synthetic */ void m23180S4(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
        if (m23012Q3(th)) {
            this.f20780o.b(th, thirdPartyData, runnable, SignInGrantType.get("google"));
        } else {
            e51.G(runnable);
            yij0.D(th);
        }
    }

    /* JADX INFO: renamed from: S5 */
    public void m23181S5(final SignInData signInData, final Runnable runnable) {
        ((AbstractC1211r6) ((jq2) this).viewModel).act().progress(R$string.f216j0, true);
        ((AbstractC1211r6) ((jq2) this).viewModel).act().duringCreated(ChinaMobileController.m1499b().m1506h(5000).doOnNext(new e30() { // from class: l.oqp0
            public final void call(Object obj) {
                this.f18332a.m23232o5(runnable, (MobileRespInfo) obj);
            }
        }).filter(new w9j() { // from class: l.pqp0
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new w9j() { // from class: l.qqp0
            public final Object call(Object obj) {
                return rup0.m23096o2(signInData, (MobileRespInfo) obj);
            }
        }), false).subscribe(mkd0.H(new e30() { // from class: l.rqp0
            public final void call(Object obj) {
                this.f20681a.m23234p5((roj0) obj);
            }
        }, new e30() { // from class: l.sqp0
            public final void call(Object obj) {
                this.f21598a.m23236q5(runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m23182T3(roj0 roj0Var) {
        if (C0775gp.m15903j()) {
            al40.m11881e().m11884h(this.f20771f);
        }
    }

    /* JADX INFO: renamed from: T4 */
    public final /* synthetic */ void m23183T4() {
        act().progressDismiss();
        ((AbstractC1211r6) ((jq2) this).viewModel).mo12977a();
        ((AbstractC1211r6) ((jq2) this).viewModel).mo12994m(false);
        lsi0.y("QQ登录失败，请重试");
    }

    /* JADX INFO: renamed from: T5 */
    public void m23184T5(final SignInData signInData, final Runnable runnable) {
        ((AbstractC1211r6) ((jq2) this).viewModel).act().progress(R$string.f216j0, true);
        ((AbstractC1211r6) ((jq2) this).viewModel).act().duringCreated(ChinaMobileController.m1499b().m1506h(5000).doOnNext(new e30() { // from class: l.ptp0
            public final void call(Object obj) {
                this.f19332a.m23238r5(runnable, (MobileRespInfo) obj);
            }
        }).filter(new w9j() { // from class: l.qtp0
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new w9j() { // from class: l.rtp0
            public final Object call(Object obj) {
                return rup0.m23127x0(signInData, (MobileRespInfo) obj);
            }
        }), false).subscribe(mkd0.K(new e30() { // from class: l.stp0
            public final void call(Object obj) {
                this.f21652a.m23240s5((roj0) obj);
            }
        }, new e30() { // from class: l.ttp0
            public final void call(Object obj) {
                this.f22274a.m23242t5(signInData, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m23185U3(roj0 roj0Var) {
        if (C0775gp.m15903j()) {
            al40.m11881e().m11884h(this.f20771f);
        }
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m23186U4() {
        ((AbstractC1211r6) ((jq2) this).viewModel).mo12994m(false);
        lsi0.y("登录失败，绑定手机号后再试");
    }

    /* JADX INFO: renamed from: U5 */
    public View.OnClickListener m23187U5() {
        return new View.OnClickListener() { // from class: l.gsp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13477a.m23244u5(view);
            }
        };
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m23188V3(MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            int i = this.f20791z + 1;
            this.f20791z = i;
            if (i < 5) {
                m23172P4();
            } else {
                ABManager.m1228L().take(1).subscribe(mkd0.G(new e30() { // from class: l.tsp0
                    public final void call(Object obj) {
                        this.f22267a.m23182T3((roj0) obj);
                    }
                }));
                AccountModule.f28e.m75h(act(), ThirdPartLoginApi.ReportMobileSource.landing_page, this.f20771f);
            }
        } else {
            this.f20771f = mobileRespInfo.mobileNumber;
            ABManager.m1228L().take(1).subscribe(mkd0.G(new e30() { // from class: l.usp0
                public final void call(Object obj) {
                    this.f23732a.m23185U3((roj0) obj);
                }
            }));
            AccountModule.f28e.m75h(act(), ThirdPartLoginApi.ReportMobileSource.landing_page, this.f20771f);
        }
        zvf0.D("e_login_phone_acquisition", "p_sign_in_type_selection_view", new j760[]{vwb.Y("get_phone_or_not", !TextUtils.isEmpty(this.f20771f) ? "yes" : "no")});
    }

    /* JADX INFO: renamed from: V4 */
    public final /* synthetic */ void m23189V4() {
        act().progressDismiss();
        ((AbstractC1211r6) ((jq2) this).viewModel).mo12994m(false);
    }

    /* JADX INFO: renamed from: V5 */
    public View.OnClickListener m23190V5() {
        return new View.OnClickListener() { // from class: l.vtp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24461a.m23246v5(view);
            }
        };
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m23191W3(SignUpData signUpData, roj0 roj0Var) {
        if (TEnum.equals(signUpData.gender, "male")) {
            qib0.m22159e1("signup_male_fb", new Object[0]);
        } else if (TEnum.equals(signUpData.gender, "female")) {
            qib0.m22159e1("signup_female_fb", new Object[0]);
        }
        Intent intentNewMainActClearStack = AccountModule.m27H().newMainActClearStack(Y(), true, false);
        intentNewMainActClearStack.putExtra("from_sign_up", true);
        act().startActivity(intentNewMainActClearStack);
        act().finish();
        yij0.S(act());
    }

    /* JADX INFO: renamed from: W4 */
    public final /* synthetic */ rx.c m23192W4(ThirdPartVetify thirdPartVetify) {
        return m23166M3();
    }

    /* JADX INFO: renamed from: W5 */
    public void m23193W5() {
        m23196X5(null, null);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m23194X3(Throwable th) {
        this.f20784s.call();
    }

    /* JADX INFO: renamed from: X4 */
    public final /* synthetic */ void m23195X4(WeChatUserInfo weChatUserInfo) {
        m23149E5(weChatUserInfo, false);
    }

    /* JADX INFO: renamed from: X5 */
    public void m23196X5(RememberUserInfo rememberUserInfo, final String str) {
        act().progress(R$string.f216j0);
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("unknown_");
        AccountModule.f26c.m242n2(signInData, rememberUserInfo, false, new Runnable() { // from class: l.nrp0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m23039a2();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.orp0
            public final void call(Object obj) {
                this.f18352a.m23248w5(str, (roj0) obj);
            }
        }, new e30() { // from class: l.prp0
            public final void call(Object obj) {
                this.f19277a.m23250x5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m23197Y3(View view) {
        if (((AbstractC1211r6) ((jq2) this).viewModel).mo12981e() || !IntlCountryCodeController.m15p()) {
            this.f20765H.onClick(view);
        } else {
            ((AbstractC1211r6) ((jq2) this).viewModel).mo12985i(this.f20765H, view);
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m23198Y4(WeChatUserInfo weChatUserInfo) {
        m23149E5(weChatUserInfo, false);
    }

    /* JADX INFO: renamed from: Y5 */
    public String m23199Y5(String str) {
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
    public final /* synthetic */ void m23200Z3(final View view) {
        HashMap map = new HashMap();
        map.put("sign up button pressed", "email");
        w85.INSTANCE.m("Sign Up", map);
        zvf0.r("e_intl_signin_with_email_button", ((PutongAct) act()).pageId());
        m23167M5(new d30() { // from class: l.ytp0
            public final void call() {
                this.f28388a.m23197Y3(view);
            }
        }, new asp0(this));
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m23201Z4(final Runnable runnable, final WeChatUserInfo weChatUserInfo, final Runnable runnable2) {
        C1444xm.m27318i0(act(), "qq", "verified", new d30() { // from class: l.hqp0
            public final void call() {
                runnable.run();
            }
        }, new d30() { // from class: l.iqp0
            public final void call() {
                this.f14705a.m23198Y4(weChatUserInfo);
            }
        }, new d30() { // from class: l.jqp0
            public final void call() {
                runnable2.run();
            }
        });
    }

    /* JADX INFO: renamed from: Z5 */
    public void m23202Z5() {
        SignupStage signupStage = ((AuthData) AccountModule.f26c.m207V0().b()).signupStage;
        Intent intentM16306f = !TEnum.equals(signupStage, "unknown_") ? C0811hp.m16306f(act(), signupStage.toString()) : AccountModule.m27H().toNewMainAct(act(), false, true);
        ((AbstractC1211r6) ((jq2) this).viewModel).act().progressDismiss();
        ((AbstractC1211r6) ((jq2) this).viewModel).act().startActivity(intentM16306f);
        ((AbstractC1211r6) ((jq2) this).viewModel).act().finish();
    }

    /* JADX INFO: renamed from: a0 */
    public void m23203a0() {
        super.a0();
        creates(new e30() { // from class: l.drp0
            public final void call(Object obj) {
                this.f10543a.m23063g4((Bundle) obj);
            }
        });
        String str = (String) eje.m14574h().f11185a.get();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(AccountModule.m26F().userId()) && !"finished".equals(str) && !"unknown_".equals(str)) {
            duringCreated(AccountModule.f26c.m213Y0()).subscribe(mkd0.H(new e30() { // from class: l.erp0
                public final void call(Object obj) {
                    this.f11416a.m23219h4((User) obj);
                }
            }, new e30() { // from class: l.frp0
                public final void call(Object obj) {
                    this.f12876a.m23072i4((Throwable) obj);
                }
            }));
        }
        qib0.f19778E.t();
        creates(new e30() { // from class: l.hrp0
            public final void call(Object obj) {
                this.f14028a.m23077j4((Bundle) obj);
            }
        }, new d30() { // from class: l.irp0
            public final void call() {
                this.f14726a.m23223k4();
            }
        });
        AccountModule.f29f.m11771k();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m23204a4(AsyncEmitter asyncEmitter) {
        new UserInfo(act(), m23004O3(act()).getQQToken()).getUserInfo(new C1234b(asyncEmitter));
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m23205a5(WeChatUserInfo weChatUserInfo) {
        m23149E5(weChatUserInfo, false);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m23206b4(View view) {
        if (((AbstractC1211r6) ((jq2) this).viewModel).mo12981e() || !IntlCountryCodeController.m15p()) {
            this.f20778m.onClick(view);
        } else {
            ((AbstractC1211r6) ((jq2) this).viewModel).mo12985i(this.f20778m, view);
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final /* synthetic */ void m23207b5(final Runnable runnable, final WeChatUserInfo weChatUserInfo, final Runnable runnable2, roj0 roj0Var) {
        act().progressDismiss();
        if (!C0775gp.m15899f()) {
            m23149E5(weChatUserInfo, false);
        } else if (TextUtils.isEmpty(this.f20771f) || !m23154H3()) {
            C1444xm.m27318i0(act(), "qq", "", new d30() { // from class: l.app0
                public final void call() {
                    runnable2.run();
                }
            }, new d30() { // from class: l.bpp0
                public final void call() {
                    this.f9029a.m23205a5(weChatUserInfo);
                }
            }, new d30() { // from class: l.cpp0
                public final void call() {
                    runnable.run();
                }
            });
        } else {
            C1444xm.m27320j0(act(), "qq", this.f20771f, new d30() { // from class: l.wop0
                public final void call() {
                    runnable.run();
                }
            }, new d30() { // from class: l.xop0
                public final void call() {
                    this.f27666a.m23195X4(weChatUserInfo);
                }
            }, new d30() { // from class: l.yop0
                public final void call() {
                    runnable2.run();
                }
            }, new d30() { // from class: l.zop0
                public final void call() {
                    this.f28866a.m23201Z4(runnable2, weChatUserInfo, runnable);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b6 */
    public void m23208b6() {
        sh50.m23747f();
        if (((Integer) App.i.get()).intValue() != 1 || f20754I) {
            return;
        }
        f20754I = true;
        if (!ruk.m22952g() || !ruk.m22951c().m22958h()) {
            if (TextUtils.isEmpty(mr4.f17192a) || !mr4.f17192a.toLowerCase().startsWith("douyin")) {
                zvf0.D("e_app_1st_open", "", new j760[]{new j760("is_first_open", Boolean.valueOf(this.f20775j)), new j760("user_agent", bjp0.getDefaultUserAgent(App.e)), new j760("device_model_raw", Build.MODEL), new j760("imei", dyd.e()), new j760("imei2", dyd.f()), new j760("oaid", k200.m17914b()), new j760("meid", dyd.g())});
                return;
            } else {
                zvf0.D("e_app_1st_open", "", new j760[]{new j760("is_first_open", Boolean.valueOf(this.f20775j)), new j760("user_agent", bjp0.getDefaultUserAgent(App.e)), new j760("device_model_raw", Build.MODEL), vwb.Y("toutiao_channel", HumeSDK.getChannel(App.e)), new j760("imei", dyd.e()), new j760("imei2", dyd.f()), new j760("oaid", k200.m17914b()), new j760("meid", dyd.g())});
                return;
            }
        }
        zvf0.D("e_app_1st_open", "", new j760[]{new j760("is_first_open", Boolean.valueOf(this.f20775j)), new j760("package_name", act().getPackageName()), new j760("referrer", ruk.m22951c().m22955d()), new j760("click_time", ruk.m22951c().m22953a()), new j760("install_time", ruk.m22951c().m22954b()), new j760("track", ruk.m22951c().m22956e()), new j760("user_agent", bjp0.getDefaultUserAgent(App.e)), new j760("device_model_raw", Build.MODEL), new j760("imei", dyd.e()), new j760("imei2", dyd.f()), new j760("oaid", k200.m17914b()), new j760("meid", dyd.g())});
        boolean z = nxv.a;
        ruk.m22951c().m22955d();
        ruk.m22951c().m22953a();
        ruk.m22951c().m22954b();
        ruk.m22951c().m22956e();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m23209c4(boolean z, final View view) {
        if (z) {
            zvf0.r("e_signin_phone_button", ((PutongAct) act()).pageId());
        } else if (this.f20776k) {
            zvf0.r("e_intl_signin_phone", ((PutongAct) act()).pageId());
        } else {
            HashMap map = new HashMap();
            map.put("sign up button pressed", "Phone");
            w85.INSTANCE.m("Sign Up", map);
            zvf0.r("e_signin_phone_button", ((PutongAct) act()).pageId());
        }
        m23167M5(new d30() { // from class: l.qsp0
            public final void call() {
                this.f20045a.m23206b4(view);
            }
        }, new asp0(this));
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m23210c5(String str, String str2, final Runnable runnable, final Runnable runnable2, final WeChatUserInfo weChatUserInfo) {
        SignUpData signUpData = new SignUpData();
        signUpData.name = weChatUserInfo.nickname;
        signUpData.signUpType = AccountTempApi.SignUpType.qq;
        signUpData.thirdPartyId = str;
        signUpData.thirdPartyToken = str2;
        AccountModule.f26c.m232i2(signUpData);
        duringCreated(eje.m14577r(signUpData, null, true)).subscribe(mkd0.H(new e30() { // from class: l.ntp0
            public final void call(Object obj) {
                this.f17848a.m23207b5(runnable, weChatUserInfo, runnable2, (roj0) obj);
            }
        }, new e30() { // from class: l.otp0
            public final void call(Object obj) {
                rup0.m23066h2(runnable2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c6 */
    public void m23211c6() {
        if (!NullChecker.a(this.f20787v) || this.f20787v.isUnsubscribed()) {
            return;
        }
        this.f20787v.unsubscribe();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m23212d4() {
        ((AbstractC1211r6) ((jq2) this).viewModel).mo12978b(false);
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m23213d5(Boolean bool) {
        AuthData authData = (AuthData) AccountModule.f26c.m207V0().b();
        String string = NullChecker.a(authData) ? authData.signupStage.toString() : "";
        if (C0775gp.m15899f() && bool.booleanValue()) {
            act().startActivity(SignUpAiAct.m291Y1(act()));
        } else {
            act().startActivity(C0811hp.m16306f(((AbstractC1211r6) ((jq2) this).viewModel).act(), string));
        }
        AccountModule.f28e.m75h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f20771f);
        act().finish();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m23214e4(ThirdPartyData thirdPartyData, roj0 roj0Var) {
        SignUpData signUpData = new SignUpData();
        signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(App.e);
        signUpData.signUpType = AccountTempApi.SignUpType.google;
        m22966B5(signUpData, thirdPartyData);
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m23215e5(final Runnable runnable, final e30 e30Var, final Runnable runnable2) {
        C1444xm.m27318i0(act(), "qq", "verified", new d30() { // from class: l.wpp0
            public final void call() {
                runnable.run();
            }
        }, new d30() { // from class: l.xpp0
            public final void call() {
                e30Var.call(Boolean.TRUE);
            }
        }, new d30() { // from class: l.ypp0
            public final void call() {
                runnable2.run();
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m23216f4(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
        if (m23012Q3(th)) {
            this.f20780o.b(th, thirdPartyData, runnable, SignInGrantType.get("google"));
        } else {
            e51.G(runnable);
            yij0.D(th);
        }
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m23217f5(final Runnable runnable, final e30 e30Var, final Runnable runnable2, roj0 roj0Var) {
        act().progressDismiss();
        if (!C0775gp.m15899f()) {
            e30Var.call(Boolean.FALSE);
            return;
        }
        if (!C0001a.m128i1()) {
            e30Var.call(Boolean.FALSE);
            return;
        }
        C0001a.m115Z1();
        if (TextUtils.isEmpty(this.f20771f) || !m23154H3()) {
            C1444xm.m27318i0(act(), "qq", "", new d30() { // from class: l.ipp0
                public final void call() {
                    runnable2.run();
                }
            }, new d30() { // from class: l.jpp0
                public final void call() {
                    e30Var.call(Boolean.TRUE);
                }
            }, new d30() { // from class: l.kpp0
                public final void call() {
                    runnable.run();
                }
            });
        } else {
            C1444xm.m27320j0(act(), "qq", this.f20771f, new d30() { // from class: l.dpp0
                public final void call() {
                    runnable.run();
                }
            }, new d30() { // from class: l.fpp0
                public final void call() {
                    e30Var.call(Boolean.TRUE);
                }
            }, new d30() { // from class: l.gpp0
                public final void call() {
                    runnable2.run();
                }
            }, new d30() { // from class: l.hpp0
                public final void call() {
                    this.f14009a.m23215e5(runnable2, e30Var, runnable);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ void m23218g5(String str, String str2, Runnable runnable, e30 e30Var, Runnable runnable2, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable2.run();
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40020 || i == 40091) {
            m23173P5(i == 40020, str, str2, runnable, e30Var);
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m23219h4(User user) {
        if (C0775gp.m15899f()) {
            return;
        }
        eje.m14574h().m14586o(user);
        m23147E3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m23220h5(final Runnable runnable, final String str, final String str2, final Runnable runnable2, final Runnable runnable3, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable.run();
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40033) {
            ((AbstractC1211r6) ((jq2) this).viewModel).mo12994m(false);
            lsi0.y("QQ暂不支持注册");
            return;
        }
        if (i != 40037) {
            runnable.run();
            return;
        }
        AccountModule.f26c.m240m2(AccountTempApi.SignUpType.qq);
        final e30 e30Var = new e30() { // from class: l.jup0
            public final void call(Object obj) {
                this.f15434a.m23213d5((Boolean) obj);
            }
        };
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("qq");
        signInData.thirdPartyId = str;
        signInData.thirdPartyToken = str2;
        signInData.device = pk8.m21562M();
        AccountModule.f26c.m244o2(signInData, false, new Runnable() { // from class: l.kup0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m23029W2();
            }
        }).subscribe(mkd0.K(new e30() { // from class: l.lup0
            public final void call(Object obj) {
                this.f16663a.m23217f5(runnable2, e30Var, runnable, (roj0) obj);
            }
        }, new e30() { // from class: l.mup0
            public final void call(Object obj) {
                this.f17296a.m23218g5(str, str2, runnable3, e30Var, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ void m23221i5(AccountTestGroup accountTestGroup) {
        if (accountTestGroup.googleEntry) {
            zvf0.x("e_signin_google_button", ((PutongAct) act()).pageId());
            ((AbstractC1211r6) ((jq2) this).viewModel).mo12990k();
        }
    }

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ void m23222j5(AccountTestFactor accountTestFactor) {
        AccountModule.f26c.m253t2(accountTestFactor).subscribe(mkd0.H(new e30() { // from class: l.rsp0
            public final void call(Object obj) {
                this.f20709a.m23221i5((AccountTestGroup) obj);
            }
        }, new e30() { // from class: l.ssp0
            public final void call(Object obj) {
                rup0.m23134z0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m23223k4() {
        act().removeCallbacks(this.f20769d);
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m23224k5(SignInData signInData, Runnable runnable) {
        zvf0.r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        m23181S5(signInData, runnable);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m23225l4() {
        if (!m23176R3()) {
            lsi0.y("未安装QQ");
        } else if (m23004O3(act()).isSessionValid()) {
            m23004O3(act()).logout(act());
        } else {
            ((AbstractC1211r6) ((jq2) this).viewModel).mo12994m(true);
            m23004O3(act()).login(act(), "all", this.f20790y);
        }
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m23226l5(View view) {
        zvf0.u("e_switch_account_button", "p_signin_with_saved_info", new j760[]{vwb.Y("switch_account", "close")});
        this.f20762E.dismiss();
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m23227m4() {
        ((AbstractC1211r6) ((jq2) this).viewModel).act().progress(R$string.f216j0);
        ((AbstractC1211r6) ((jq2) this).viewModel).mo12994m(true);
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m23228m5(d30 d30Var, View view) {
        w85.INSTANCE.m("Login", (Map) null);
        zvf0.r("e_signin_with_saved_info_button", "p_signin_with_saved_info");
        d30Var.call();
        this.f20762E.dismiss();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m23229n4() {
        ((AbstractC1211r6) ((jq2) this).viewModel).mo12977a();
        ((AbstractC1211r6) ((jq2) this).viewModel).act().progressDismiss();
        ((AbstractC1211r6) ((jq2) this).viewModel).mo12994m(false);
        lsi0.y(act().string(R$string.f250o4));
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m23230n5(View view) {
        zvf0.u("e_switch_account_button", "p_signin_with_saved_info", new j760[]{vwb.Y("switch_account", "signin_another_account")});
        this.f20762E.dismiss();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m23231o4() {
        ((AbstractC1211r6) ((jq2) this).viewModel).act().progressDismiss();
        ((AbstractC1211r6) ((jq2) this).viewModel).mo12994m(false);
        lsi0.y("登录失败，绑定手机号后再试");
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ void m23232o5(Runnable runnable, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            ((AbstractC1211r6) ((jq2) this).viewModel).act().progressDismiss();
            lsi0.l(((AbstractC1211r6) ((jq2) this).viewModel).act().getResources().getString(R$string.f64G2), false, true);
            if (NullChecker.a(runnable)) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m23233p4() {
        ((AbstractC1211r6) ((jq2) this).viewModel).act().progressDismiss();
        ((AbstractC1211r6) ((jq2) this).viewModel).mo12994m(false);
    }

    /* JADX INFO: renamed from: p5 */
    public final /* synthetic */ void m23234p5(roj0 roj0Var) {
        m23202Z5();
        if (C0775gp.m15903j()) {
            al40.m11881e().m11886j(this.f20771f);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ Boolean m23235q4(Runnable runnable, Runnable runnable2, ThirdPartLoginApi.C0000a c0000a) {
        if (c0000a.f311b != 0) {
            runnable2.run();
            return Boolean.FALSE;
        }
        this.f20785t = true;
        runnable.run();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m23236q5(Runnable runnable, Throwable th) {
        ((AbstractC1211r6) ((jq2) this).viewModel).act().progressDismiss();
        lsi0.l(((AbstractC1211r6) ((jq2) this).viewModel).act().getResources().getString(R$string.f64G2), false, true);
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ void m23237r4(WeChatToken weChatToken, WeChatUserInfo weChatUserInfo) {
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
        act().startActivity(SignUpDetailsNewAct.m393a2(act(), signUpData));
        m23211c6();
        act().finish();
        yij0.S(act());
        if (C0775gp.m15903j()) {
            al40.m11881e().m11886j(this.f20771f);
        }
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ void m23238r5(Runnable runnable, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            ((AbstractC1211r6) ((jq2) this).viewModel).act().progressDismiss();
            lsi0.l(((AbstractC1211r6) ((jq2) this).viewModel).act().getResources().getString(R$string.f64G2), false, true);
            if (NullChecker.a(runnable)) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m23239s4(Boolean bool) {
        AuthData authData = (AuthData) AccountModule.f26c.m207V0().b();
        String string = NullChecker.a(authData) ? authData.signupStage.toString() : "";
        Intent intentM291Y1 = (C0775gp.m15899f() && bool.booleanValue()) ? SignUpAiAct.m291Y1(act()) : C0811hp.m16306f(((AbstractC1211r6) ((jq2) this).viewModel).act(), string);
        if ("verified".equals(string) && !eje.m14574h().m14582j(authData.finishedStages)) {
            f20755J.put(Boolean.FALSE);
        }
        act().startActivity(intentM291Y1);
        AccountModule.f28e.m75h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f20771f);
        m23211c6();
        act().finish();
        if (C0775gp.m15903j()) {
            al40.m11881e().m11886j(this.f20771f);
        }
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m23240s5(roj0 roj0Var) {
        AccountModule.f26c.m240m2(AccountTempApi.SignUpType.cosmos);
        m23202Z5();
        if (C0775gp.m15903j()) {
            al40.m11881e().m11886j(this.f20771f);
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m23241t4(final Runnable runnable, final e30 e30Var, final Runnable runnable2) {
        C1444xm.m27318i0(act(), "wechat", "verified", new d30() { // from class: l.uqp0
            public final void call() {
                runnable.run();
            }
        }, new d30() { // from class: l.vqp0
            public final void call() {
                e30Var.call(Boolean.TRUE);
            }
        }, new d30() { // from class: l.xqp0
            public final void call() {
                runnable2.run();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ void m23242t5(SignInData signInData, Runnable runnable, Throwable th) {
        int i;
        ((AbstractC1211r6) ((jq2) this).viewModel).act().progressDismiss();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((i = ((TantanException.Client.AccountService) th).code) == 40020 || i == 40091)) {
            m23005O5(i == 40020, signInData, runnable);
            return;
        }
        if (!z || ((TantanException.Client.AccountService) th).code != 40016) {
            lsi0.l(((AbstractC1211r6) ((jq2) this).viewModel).act().getResources().getString(R$string.f64G2), false, true);
            if (NullChecker.a(runnable)) {
                runnable.run();
                return;
            }
            return;
        }
        SignUpData signUpData = new SignUpData();
        if (TEnum.equals(signInData.grantType, "cosmos")) {
            signUpData.signUpType = AccountTempApi.SignUpType.cosmos;
        }
        AccountModule.f26c.m232i2(signUpData);
        AccountModule.f26c.m220c1().phoneNumber = this.f20771f;
        ((AbstractC1211r6) ((jq2) this).viewModel).act().startActivity(SignUpDetailsNewAct.m393a2(((AbstractC1211r6) ((jq2) this).viewModel).act(), signUpData));
        ((AbstractC1211r6) ((jq2) this).viewModel).act().progressDismiss();
        ((AbstractC1211r6) ((jq2) this).viewModel).act().finish();
        if (C0775gp.m15903j()) {
            al40.m11881e().m11886j(this.f20771f);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m23243u4(final Runnable runnable, final e30 e30Var, final Runnable runnable2, roj0 roj0Var) {
        act().progressDismiss();
        if (C0775gp.m15899f()) {
            if (C0001a.m128i1()) {
                C0001a.m115Z1();
                if (TextUtils.isEmpty(this.f20771f) || !m23154H3()) {
                    C1444xm.m27318i0(act(), "wechat", "", new d30() { // from class: l.eqp0
                        public final void call() {
                            runnable2.run();
                        }
                    }, new d30() { // from class: l.fqp0
                        public final void call() {
                            e30Var.call(Boolean.TRUE);
                        }
                    }, new d30() { // from class: l.gqp0
                        public final void call() {
                            runnable.run();
                        }
                    });
                    return;
                } else {
                    C1444xm.m27320j0(act(), "wechat", this.f20771f, new d30() { // from class: l.zpp0
                        public final void call() {
                            runnable.run();
                        }
                    }, new d30() { // from class: l.bqp0
                        public final void call() {
                            e30Var.call(Boolean.TRUE);
                        }
                    }, new d30() { // from class: l.cqp0
                        public final void call() {
                            runnable2.run();
                        }
                    }, new d30() { // from class: l.dqp0
                        public final void call() {
                            this.f10530a.m23241t4(runnable2, e30Var, runnable);
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
    public final /* synthetic */ void m23244u5(View view) {
        zvf0.r("e_signin_fb_button", ((PutongAct) act()).pageId());
        if (((AbstractC1211r6) ((jq2) this).viewModel).mo12981e() || !IntlCountryCodeController.m15p()) {
            this.f20761D.onClick(view);
        } else {
            ((AbstractC1211r6) ((jq2) this).viewModel).mo12985i(this.f20761D, view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m23245v4(WeChatToken weChatToken, Runnable runnable, e30 e30Var, Runnable runnable2, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable2.run();
            CrashHelper.c(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40020 || i == 40091) {
            m23178R5(i == 40020, weChatToken, runnable, e30Var);
        } else {
            runnable2.run();
            CrashHelper.c(th);
        }
    }

    /* JADX INFO: renamed from: v5 */
    public final /* synthetic */ void m23246v5(View view) {
        zvf0.r("e_signin_google_button", ((PutongAct) act()).pageId());
        if (((AbstractC1211r6) ((jq2) this).viewModel).mo12981e() || !IntlCountryCodeController.m15p()) {
            this.f20764G.onClick(view);
        } else {
            ((AbstractC1211r6) ((jq2) this).viewModel).mo12985i(this.f20764G, view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m23247w4(final Runnable runnable, final WeChatToken weChatToken, final Runnable runnable2, final Runnable runnable3, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable.run();
            CrashHelper.c(th);
            return;
        }
        if (((TantanException.Client.AccountService) th).code != 40037) {
            runnable.run();
            return;
        }
        AccountModule.f26c.m240m2(AccountTempApi.SignUpType.wechat);
        if (TextUtils.isEmpty(weChatToken.thirdpartyId) || TextUtils.isEmpty(weChatToken.thirdpartyAccessToken)) {
            runnable.run();
            CrashHelper.c(th);
            return;
        }
        final e30 e30Var = new e30() { // from class: l.lpp0
            public final void call(Object obj) {
                this.f16554a.m23239s4((Boolean) obj);
            }
        };
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("wechat");
        signInData.thirdPartyId = weChatToken.thirdpartyId;
        signInData.thirdPartyToken = weChatToken.thirdpartyAccessToken;
        signInData.device = pk8.m21562M();
        AccountModule.f26c.m244o2(signInData, false, new Runnable() { // from class: l.mpp0
            @Override // java.lang.Runnable
            public final void run() {
                rup0.m23055f0();
            }
        }).subscribe(mkd0.K(new e30() { // from class: l.npp0
            public final void call(Object obj) {
                this.f17800a.m23243u4(runnable2, e30Var, runnable, (roj0) obj);
            }
        }, new e30() { // from class: l.opp0
            public final void call(Object obj) {
                this.f18321a.m23245v4(weChatToken, runnable3, e30Var, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: w5 */
    public final /* synthetic */ void m23248w5(String str, roj0 roj0Var) {
        qib0.f19788L.f1135d.i();
        if ("oppo_quick_login".equals(str)) {
            AccountModule.f26c.m218b1("user.oppo.signin").subscribe(mkd0.G(new e30() { // from class: l.itp0
                public final void call(Object obj) {
                    rup0.m23022U1((Envelope) obj);
                }
            }));
        } else {
            str = "saved_sign-in_info";
        }
        zvf0.D("e_signin_success", "", new j760[]{vwb.Y("signin_type", str)});
        qib0.m22159e1("signin", new Object[0]);
        act().startActivity(AccountModule.m27H().newMainActClearStack(Y(), false, true));
        m23211c6();
        act().finish();
        yij0.S(act());
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m23249x4(final Runnable runnable, final Runnable runnable2, final Runnable runnable3, final Runnable runnable4) {
        this.f20789x.registerApp("wx67f59443a9c801bb");
        SendAuth.Req req = new SendAuth.Req();
        req.scope = "snsapi_userinfo";
        req.state = "";
        this.f20789x.sendReq(req);
        runnable.run();
        m23211c6();
        final WeChatToken weChatToken = new WeChatToken();
        this.f20787v = AccountModule.f28e.m76i().filter(new w9j() { // from class: l.ztp0
            public final Object call(Object obj) {
                return this.f28978a.m23235q4(runnable, runnable2, (ThirdPartLoginApi.C0000a) obj);
            }
        }).flatMap(new w9j() { // from class: l.aup0
            public final Object call(Object obj) {
                return AccountModule.f28e.m74g(((ThirdPartLoginApi.C0000a) obj).f312c);
            }
        }).filter(new w9j() { // from class: l.bup0
            public final Object call(Object obj) {
                return rup0.m23097o3(weChatToken, runnable2, (WeChatToken) obj);
            }
        }).flatMap(new w9j() { // from class: l.cup0
            public final Object call(Object obj) {
                WeChatToken weChatToken2 = (WeChatToken) obj;
                return AccountModule.f28e.m80m(weChatToken2.thirdpartyId, weChatToken2.thirdpartyAccessToken, false);
            }
        }).filter(new w9j() { // from class: l.dup0
            public final Object call(Object obj) {
                return rup0.m23089m3(runnable2, (ThirdPartVetify) obj);
            }
        }).flatMap(new w9j() { // from class: l.eup0
            public final Object call(Object obj) {
                WeChatToken weChatToken2 = weChatToken;
                return AccountModule.f28e.m79l(weChatToken2.thirdpartyAccessToken, weChatToken2.thirdpartyId);
            }
        }).filter(new w9j() { // from class: l.gup0
            public final Object call(Object obj) {
                return rup0.m23073j0(runnable2, (WeChatUserInfo) obj);
            }
        }).first().subscribe(mkd0.K(new e30() { // from class: l.hup0
            public final void call(Object obj) {
                this.f14090a.m23237r4(weChatToken, (WeChatUserInfo) obj);
            }
        }, new e30() { // from class: l.iup0
            public final void call(Object obj) {
                this.f14793a.m23247w4(runnable2, weChatToken, runnable3, runnable4, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ void m23250x5(Throwable th) {
        ix50.b().a();
        act().progressDismiss();
        Throwable throwable = th instanceof App.HandledGlobally ? ((App.HandledGlobally) th).getThrowable() : th;
        if (!xck0.c(throwable, ApiExcep.Client.Unauthorized.class) && !xck0.c(throwable, ApiExcep.Client.NotFound.class)) {
            yij0.D(th);
        } else {
            lsi0.h(R$string.f106P);
            m23165L5();
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m23251y4(SignUpData signUpData, String str) {
        signUpData.profilePath = str;
        AccountModule.f26c.m202R0().put(str);
        act().startActivity(SignUpDetailsNewAct.m393a2(act(), signUpData));
    }

    /* JADX INFO: renamed from: y5 */
    public void m23252y5() {
        m23167M5(new d30() { // from class: l.oup0
            public final void call() {
                this.f18389a.m23225l4();
            }
        }, new asp0(this));
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m23253z4(final SignUpData signUpData) {
        qib0.f19782G.i(signUpData.profilePath, new e30() { // from class: l.xrp0
            public final void call(Object obj) {
                this.f27697a.m23251y4(signUpData, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z5 */
    public void m23254z5() {
        final Runnable runnable = new Runnable() { // from class: l.vsp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f24447a.m23227m4();
            }
        };
        final Runnable runnable2 = new Runnable() { // from class: l.wsp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f25390a.m23229n4();
            }
        };
        final Runnable runnable3 = new Runnable() { // from class: l.xsp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f27711a.m23231o4();
            }
        };
        final Runnable runnable4 = new Runnable() { // from class: l.zsp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f28960a.m23233p4();
            }
        };
        this.f20785t = false;
        m23144D3();
        if (m23179S3()) {
            m23167M5(new d30() { // from class: l.atp0
                public final void call() {
                    this.f8511a.m23249x4(runnable, runnable2, runnable3, runnable4);
                }
            }, new asp0(this));
        } else {
            lsi0.y(App.e.getString(R$string.f220j4));
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.rup0$a */
    public class C1233a implements IUiListener {
        public C1233a() {
        }

        public void onCancel() {
            rup0.this.m23163K5();
        }

        public void onComplete(Object obj) {
            rup0.this.f20785t = true;
            if (obj == null || !(obj instanceof JSONObject)) {
                rup0.this.m23163K5();
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            int length = jSONObject.length();
            rup0 rup0Var = rup0.this;
            if (length == 0) {
                rup0Var.m23163K5();
            } else {
                rup0Var.m23146D5(jSONObject);
            }
        }

        public void onError(UiError uiError) {
            rup0.this.m23163K5();
        }

        public void onWarning(int i) {
        }
    }

    /* JADX INFO: renamed from: l.rup0$b */
    public class C1234b implements IUiListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AsyncEmitter f20793a;

        public C1234b(AsyncEmitter asyncEmitter) {
            this.f20793a = asyncEmitter;
        }

        public void onCancel() {
            this.f20793a.onError(new IllegalStateException("cancel get qq user info"));
        }

        public void onComplete(Object obj) {
            if (obj == null) {
                this.f20793a.onError(new IllegalStateException("qq user info null"));
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.length() == 0) {
                this.f20793a.onError(new IllegalStateException("qq user info null"));
                return;
            }
            WeChatUserInfo weChatUserInfoNew_ = WeChatUserInfo.new_();
            try {
                weChatUserInfoNew_.nickname = jSONObject.getString("nickname");
                this.f20793a.onNext(weChatUserInfoNew_);
                this.f20793a.onCompleted();
            } catch (Exception e) {
                CrashHelper.c(e);
                this.f20793a.onError(new IllegalStateException("qq user info parse error"));
            }
        }

        public void onError(UiError uiError) {
            this.f20793a.onError(new IllegalStateException("error get qq user info" + uiError.errorMessage));
        }

        public void onWarning(int i) {
        }
    }
}
