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
import java.util.List;
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
import l.v9j;
import l.vwb;
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
public class y2q0 extends jq2<AbstractC1250s6> {

    /* JADX INFO: renamed from: G */
    public static boolean f27944G = false;

    /* JADX INFO: renamed from: A */
    public e30<SignUpData> f27945A;

    /* JADX INFO: renamed from: B */
    public d30 f27946B;

    /* JADX INFO: renamed from: C */
    public View.OnClickListener f27947C;

    /* JADX INFO: renamed from: D */
    public dd80 f27948D;

    /* JADX INFO: renamed from: E */
    public d30 f27949E;

    /* JADX INFO: renamed from: F */
    public View.OnClickListener f27950F;

    /* JADX INFO: renamed from: a */
    public boolean f27951a;

    /* JADX INFO: renamed from: b */
    public AccountTempApi.InactiveType f27952b;

    /* JADX INFO: renamed from: c */
    public String f27953c;

    /* JADX INFO: renamed from: d */
    public Runnable f27954d;

    /* JADX INFO: renamed from: e */
    public SignUpData f27955e;

    /* JADX INFO: renamed from: f */
    public String f27956f;

    /* JADX INFO: renamed from: g */
    public OneClickStatus f27957g;

    /* JADX INFO: renamed from: h */
    public boolean f27958h;

    /* JADX INFO: renamed from: i */
    public boolean f27959i;

    /* JADX INFO: renamed from: j */
    public boolean f27960j;

    /* JADX INFO: renamed from: k */
    public a<String> f27961k;

    /* JADX INFO: renamed from: l */
    public View.OnClickListener f27962l;

    /* JADX INFO: renamed from: m */
    public View.OnClickListener f27963m;

    /* JADX INFO: renamed from: n */
    public h30<Throwable, ThirdPartyData, Runnable, SignInGrantType> f27964n;

    /* JADX INFO: renamed from: o */
    public c84 f27965o;

    /* JADX INFO: renamed from: p */
    public AccessToken f27966p;

    /* JADX INFO: renamed from: q */
    public d30 f27967q;

    /* JADX INFO: renamed from: r */
    public d30 f27968r;

    /* JADX INFO: renamed from: s */
    public boolean f27969s;

    /* JADX INFO: renamed from: t */
    public boolean f27970t;

    /* JADX INFO: renamed from: u */
    public c4g0 f27971u;

    /* JADX INFO: renamed from: v */
    public d30 f27972v;

    /* JADX INFO: renamed from: w */
    public IWXAPI f27973w;

    /* JADX INFO: renamed from: x */
    public IUiListener f27974x;

    /* JADX INFO: renamed from: y */
    public int f27975y;

    /* JADX INFO: renamed from: z */
    public d30 f27976z;

    /* JADX INFO: renamed from: l.y2q0$c */
    public class DialogInterfaceOnDismissListenerC1461c implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f27980a;

        public DialogInterfaceOnDismissListenerC1461c(cwf0 cwf0Var) {
            this.f27980a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.e(this.f27980a);
        }
    }

    /* JADX INFO: renamed from: l.y2q0$d */
    public class DialogInterfaceOnDismissListenerC1462d implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f27982a;

        public DialogInterfaceOnDismissListenerC1462d(cwf0 cwf0Var) {
            this.f27982a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.e(this.f27982a);
        }
    }

    /* JADX INFO: renamed from: l.y2q0$e */
    public class C1463e implements fuf<czv> {

        /* JADX INFO: renamed from: a */
        public g30<ThirdPartyData, ThirdPartyValidation, SignUpData> f27984a = new g30() { // from class: l.i3q0
            /* JADX INFO: renamed from: a */
            public final void m16461a(Object obj, Object obj2, Object obj3) {
                this.f14219a.m28045r((ThirdPartyData) obj, (ThirdPartyValidation) obj2, (SignUpData) obj3);
            }
        };

        public C1463e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: A */
        public /* synthetic */ void m28025A() {
            ((AbstractC1250s6) ((jq2) y2q0.this).viewModel).mo15076q(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: B */
        public /* synthetic */ void m28026B(ThirdPartyData thirdPartyData, SignUpData signUpData) {
            this.f27984a.a(thirdPartyData, (Object) null, signUpData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: C */
        public /* synthetic */ void m28027C(final ThirdPartyData thirdPartyData, final SignUpData signUpData) {
            e51.G(new Runnable() { // from class: l.e3q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10751a.m28026B(thirdPartyData, signUpData);
                }
            });
        }

        /* JADX INFO: renamed from: D */
        private void m28028D(final SignUpData signUpData, final ThirdPartyData thirdPartyData) {
            final Runnable runnable = new Runnable() { // from class: l.b3q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8708a.m28048u();
                }
            };
            signUpData.thirdPartyId = thirdPartyData.thirdPartyId;
            signUpData.thirdPartyToken = thirdPartyData.thirdPartyToken;
            y2q0.this.duringCreated(eje.m14577r(signUpData, null, true)).subscribe(mkd0.H(new e30() { // from class: l.c3q0
                public final void call(Object obj) {
                    this.f9327a.m28049v(signUpData, (roj0) obj);
                }
            }, new e30() { // from class: l.d3q0
                public final void call(Object obj) {
                    this.f10006a.m28050w(thirdPartyData, runnable, (Throwable) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ SignUpData m28037j(Throwable th) {
            SignUpData signUpData = new SignUpData();
            signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(App.e);
            signUpData.signUpType = AccountTempApi.SignUpType.facebook;
            return signUpData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public /* synthetic */ void m28044q(ThirdPartyValidation thirdPartyValidation, SignUpData signUpData, ThirdPartyData thirdPartyData, c cVar) {
            if (NullChecker.a(thirdPartyValidation)) {
                signUpData.thirdPartyValidation = thirdPartyValidation;
            }
            m28028D(signUpData, thirdPartyData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public /* synthetic */ void m28045r(final ThirdPartyData thirdPartyData, final ThirdPartyValidation thirdPartyValidation, final SignUpData signUpData) {
            y2q0.this.lifecycle().filter(new w9j() { // from class: l.k3q0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.i);
                }
            }).take(1).subscribe(mkd0.G(new e30() { // from class: l.l3q0
                public final void call(Object obj) {
                    this.f16218a.m28044q(thirdPartyValidation, signUpData, thirdPartyData, (c) obj);
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s */
        public /* synthetic */ void m28046s() {
            ((AbstractC1250s6) ((jq2) y2q0.this).viewModel).mo15076q(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: t */
        public /* synthetic */ void m28047t() {
            ((AbstractC1250s6) ((jq2) y2q0.this).viewModel).mo15076q(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: u */
        public /* synthetic */ void m28048u() {
            ((AbstractC1250s6) ((jq2) y2q0.this).viewModel).mo15076q(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: v */
        public /* synthetic */ void m28049v(SignUpData signUpData, roj0 roj0Var) {
            AccountModule.f26c.m200Q0().put(signUpData.name);
            if (NullChecker.a(signUpData.birthdate)) {
                AccountModule.f26c.m196O0().put(signUpData.birthdate);
            }
            if (NullChecker.a(signUpData.gender)) {
                AccountModule.f26c.m198P0().put(signUpData.gender.toString());
            }
            boolean zIsEmpty = TextUtils.isEmpty(signUpData.profilePath);
            y2q0 y2q0Var = y2q0.this;
            if (zIsEmpty) {
                y2q0Var.act().startActivity(SignUpDetailsNewAct.m393a2(y2q0.this.act(), signUpData));
            } else {
                y2q0Var.f27945A.call(signUpData);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: w */
        public /* synthetic */ void m28050w(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
            if (y2q0.this.m27787K3(th)) {
                y2q0.this.f27964n.b(th, thirdPartyData, runnable, SignInGrantType.get("facebook"));
            } else {
                e51.G(runnable);
                yij0.D(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: x */
        public /* synthetic */ void m28051x(Throwable th) {
            y2q0.this.f27968r.call();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: y */
        public /* synthetic */ void m28052y(final ThirdPartyData thirdPartyData, roj0 roj0Var) {
            AccountModule.f26c.m214Y1(y2q0.this.f27966p.o(), y2q0.this.f27966p.n()).onErrorReturn(new w9j() { // from class: l.m3q0
                public final Object call(Object obj) {
                    return y2q0.C1463e.m28037j((Throwable) obj);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.n3q0
                public final void call(Object obj) {
                    this.f17467a.m28027C(thirdPartyData, (SignUpData) obj);
                }
            }, new e30() { // from class: l.a3q0
                public final void call(Object obj) {
                    this.f8087a.m28051x((Throwable) obj);
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public /* synthetic */ void m28053z(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
            if (y2q0.this.m27787K3(th)) {
                y2q0.this.f27964n.b(th, thirdPartyData, runnable, SignInGrantType.get("facebook"));
            } else {
                e51.G(runnable);
                yij0.D(th);
            }
        }

        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void onSuccess(czv czvVar) {
            y2q0.this.f27966p = czvVar.a();
            final Runnable runnable = new Runnable() { // from class: l.z2q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28601a.m28025A();
                }
            };
            final ThirdPartyData thirdPartyDataNew_ = ThirdPartyData.new_();
            thirdPartyDataNew_.thirdPartyId = y2q0.this.f27966p.o();
            thirdPartyDataNew_.thirdPartyToken = y2q0.this.f27966p.n();
            AccountModule.f26c.m169C2(thirdPartyDataNew_).subscribe(mkd0.K(new e30() { // from class: l.f3q0
                public final void call(Object obj) {
                    this.f11601a.m28052y(thirdPartyDataNew_, (roj0) obj);
                }
            }, new e30() { // from class: l.g3q0
                public final void call(Object obj) {
                    this.f13046a.m28053z(thirdPartyDataNew_, runnable, (Throwable) obj);
                }
            }, false));
        }

        /* JADX INFO: renamed from: a */
        public void m28055a(FacebookException facebookException) {
            FacebookApi.m1436m(facebookException);
            e51.G(new Runnable() { // from class: l.h3q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13670a.m28047t();
                }
            });
        }

        public void onCancel() {
            e51.G(new Runnable() { // from class: l.j3q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14989a.m28046s();
                }
            });
        }
    }

    /* JADX INFO: renamed from: l.y2q0$f */
    public class DialogInterfaceOnDismissListenerC1464f implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f27986a;

        public DialogInterfaceOnDismissListenerC1464f(cwf0 cwf0Var) {
            this.f27986a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.e(this.f27986a);
        }
    }

    /* JADX INFO: renamed from: l.y2q0$g */
    public static /* synthetic */ class C1465g {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f27988a;

        static {
            int[] iArr = new int[OperatorType.values().length];
            f27988a = iArr;
            try {
                iArr[OperatorType.china_mobile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27988a[OperatorType.china_telecom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27988a[OperatorType.china_unicom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public y2q0(mcr mcrVar) {
        super(mcrVar);
        this.f27951a = false;
        this.f27952b = AccountTempApi.InactiveType.None;
        this.f27953c = "";
        this.f27961k = a.b();
        this.f27962l = new View.OnClickListener() { // from class: l.vyp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24545a.m27762E4(view);
            }
        };
        this.f27963m = new View.OnClickListener() { // from class: l.jzp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15515a.m27766F4(view);
            }
        };
        this.f27964n = new h30() { // from class: l.kzp0
            /* JADX INFO: renamed from: b */
            public final void m18399b(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f16119a.m27997z4((Throwable) obj, (ThirdPartyData) obj2, (Runnable) obj3, (SignInGrantType) obj4);
            }
        };
        this.f27967q = new d30() { // from class: l.lzp0
            public final void call() {
                this.f16729a.m27741A4();
            }
        };
        this.f27968r = new d30() { // from class: l.mzp0
            public final void call() {
                this.f17421a.m27751C4();
            }
        };
        this.f27969s = false;
        this.f27970t = false;
        this.f27972v = new d30() { // from class: l.ozp0
            public final void call() {
                this.f18525a.m27756D4();
            }
        };
        this.f27974x = new C1459a();
        this.f27976z = new d30() { // from class: l.pzp0
            public final void call() {
                this.f19471a.m27773H4();
            }
        };
        this.f27945A = new e30() { // from class: l.qzp0
            public final void call(Object obj) {
                this.f20208a.m27964s4((SignUpData) obj);
            }
        };
        this.f27946B = new d30() { // from class: l.rzp0
            public final void call() {
                this.f20956a.m27969t4();
            }
        };
        this.f27947C = new View.OnClickListener() { // from class: l.szp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21782a.m27974u4(view);
            }
        };
        this.f27949E = new d30() { // from class: l.gzp0
            public final void call() {
                this.f13614a.m27982w4();
            }
        };
        this.f27950F = new View.OnClickListener() { // from class: l.izp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14909a.m27992y4(view);
            }
        };
    }

    /* JADX INFO: renamed from: A3 */
    private void m27740A3() {
        if (this.f27973w == null) {
            this.f27973w = WXAPIFactory.createWXAPI(Y(), (String) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m27741A4() {
        this.f27970t = false;
        this.f27969s = false;
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15074p();
    }

    /* JADX INFO: renamed from: B2 */
    public static /* synthetic */ void m27743B2(Runnable runnable, Throwable th) {
        runnable.run();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: B3 */
    private void m27744B3() {
        if (this.f27951a) {
            act().hideInput();
            return;
        }
        act().startActivity(C0811hp.m16305e(act()));
        act().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public /* synthetic */ void m27745B4() {
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15076q(false);
    }

    /* JADX INFO: renamed from: B5 */
    private void m27746B5() {
        m27752C5(false);
    }

    /* JADX INFO: renamed from: C2 */
    public static /* synthetic */ void m27749C2(SignInGrantType signInGrantType, ThirdPartyData thirdPartyData, final d30 d30Var, final Runnable runnable) {
        SignInData signInData = new SignInData();
        signInData.grantType = signInGrantType;
        signInData.thirdPartyId = thirdPartyData.thirdPartyId;
        signInData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        AccountModule.f26c.m244o2(signInData, true, null).subscribe(mkd0.H(new e30() { // from class: l.j2q0
            public final void call(Object obj) {
                y2q0.m27786K2(d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.k2q0
            public final void call(Object obj) {
                y2q0.m27743B2(runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C3 */
    private void m27750C3(Intent intent) {
        try {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) com.google.android.gms.auth.api.signin.a.b(intent).m(ApiException.class);
            ((AbstractC1250s6) ((jq2) this).viewModel).mo15052b(false);
            m28004J3(googleSignInAccount.g0(), googleSignInAccount.h0());
        } catch (ApiException e) {
            if (e.getStatusCode() != 12501) {
                lsi0.h(R$string.f300y3);
            }
            ((AbstractC1250s6) ((jq2) this).viewModel).mo15052b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public /* synthetic */ void m27751C4() {
        e51.G(new Runnable() { // from class: l.g0q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13017a.m27745B4();
            }
        });
        if (NullChecker.a(AccessToken.d())) {
            bzv.m().u();
        }
    }

    /* JADX INFO: renamed from: C5 */
    private void m27752C5(boolean z) {
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15069m();
        RememberUserInfo rememberUserInfo = (RememberUserInfo) qib0.f19788L.f1135d.b();
        if (NullChecker.a(rememberUserInfo) && z) {
            m27780I5(rememberUserInfo, act(), new dxp0(this));
        }
        final AccountTestFactor accountTestFactor = new AccountTestFactor();
        accountTestFactor.step = "appOpen";
        accountTestFactor.channel = "googleplay";
        final d30 d30Var = new d30() { // from class: l.tzp0
            public final void call() {
                this.f22370a.m27871c5(accountTestFactor);
            }
        };
        AccountModule.f26c.m182H2().subscribe(mkd0.H(new e30() { // from class: l.uzp0
            public final void call(Object obj) {
                d30Var.call();
            }
        }, new e30() { // from class: l.vzp0
            public final void call(Object obj) {
                d30Var.call();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public /* synthetic */ void m27756D4() {
        this.f27970t = true;
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15079u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D5 */
    public void m27757D5() {
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15071n(false);
        lsi0.j("授权失败，请再次尝试");
    }

    /* JADX INFO: renamed from: E3 */
    private void m27761E3(final SignUpData signUpData) {
        C0001a.m145q2(signUpData, null).subscribe(mkd0.H(new e30() { // from class: l.zxp0
            public final void call(Object obj) {
                this.f29026a.m27816R3(signUpData, (roj0) obj);
            }
        }, new e30() { // from class: l.kyp0
            public final void call(Object obj) {
                this.f16105a.m27821S3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m27762E4(View view) {
        act().startActivity(PhoneNumberLoginOptAct.m578Y1(act()));
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ Boolean m27763F0(Runnable runnable, WeChatUserInfo weChatUserInfo) {
        if (NullChecker.a(weChatUserInfo)) {
            return Boolean.TRUE;
        }
        runnable.run();
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m27766F4(View view) {
        act().startActivity(PhoneNumberLoginOptAct.m578Y1(act()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G4 */
    public /* synthetic */ void m27768G4() {
        AuthData authData = (AuthData) AccountModule.f26c.m207V0().b();
        act().startActivity(C0811hp.m16306f(((AbstractC1250s6) ((jq2) this).viewModel).act(), NullChecker.a(authData) ? authData.signupStage.toString() : ""));
        AccountModule.f28e.m75h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f27956f);
        act().finish();
    }

    /* JADX INFO: renamed from: G5 */
    private void m27769G5(boolean z, final SignInData signInData, final Runnable runnable) {
        cwf0 cwf0VarC = i0e.c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        i0e.f(cwf0VarC);
        ((AbstractC1250s6) ((jq2) this).viewModel).act().dialog().E0(z ? R$string.f139V2 : R$string.f129T2).D(z ? R$string.f144W2 : R$string.f134U2).t0(R$string.f301z, new Runnable() { // from class: l.pxp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19431a.m27876d5(signInData, runnable);
            }
        }).l0(R$string.f167b, new Runnable() { // from class: l.qxp0
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
            }
        }).V(new DialogInterfaceOnDismissListenerC1464f(cwf0VarC)).z0();
    }

    /* JADX INFO: renamed from: H5 */
    private void m27774H5(boolean z, final String str, final String str2, final Runnable runnable, final e30<Boolean> e30Var) {
        cwf0 cwf0VarC = i0e.c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        i0e.f(cwf0VarC);
        act().dialog().E0(z ? R$string.f139V2 : R$string.f129T2).D(z ? R$string.f144W2 : R$string.f134U2).t0(R$string.f301z, new Runnable() { // from class: l.hxp0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m27838W0(str, str2, e30Var, runnable);
            }
        }).l0(R$string.f167b, new Runnable() { // from class: l.ixp0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m27910j3(runnable);
            }
        }).V(new DialogInterfaceOnDismissListenerC1462d(cwf0VarC)).z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.jxp0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
    }

    /* JADX INFO: renamed from: I3 */
    public static Tencent m27778I3(Context context) {
        Tencent.setIsPermissionGranted(true);
        return Tencent.createInstance(xw5.b, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I4 */
    public /* synthetic */ void m27779I4() {
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15052b(false);
    }

    /* JADX INFO: renamed from: I5 */
    private void m27780I5(RememberUserInfo rememberUserInfo, Act act, final d30 d30Var) {
        if (((AbstractC1250s6) ((jq2) this).viewModel).mo15055d()) {
            return;
        }
        if (NullChecker.a(this.f27948D) && this.f27948D.isShowing()) {
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
        vButtonFindViewById.setText(act.getResources().getString(R$string.f171b3, m28013Q5(rememberUserInfo.name)));
        vTextFindViewById.setText(R$string.f177c3);
        final cwf0 cwf0VarC = i0e.c("p_signin_with_saved_info", Dialog.class.getName());
        this.f27948D = aVarNewDialog.R(viewInflate).P(true).o0(new DialogInterface.OnShowListener() { // from class: l.a0q0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.f(cwf0VarC);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.b0q0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).l0(new DialogInterface.OnCancelListener() { // from class: l.c0q0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zvf0.u("e_switch_account_button", "p_signin_with_saved_info", new j760[]{vwb.Y("switch_account", "close")});
            }
        }).r0();
        vImageFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.d0q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9966a.m27882e5(view);
            }
        });
        vButtonFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.e0q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10715a.m27888f5(d30Var, view);
            }
        });
        vTextFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.f0q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11555a.m27894g5(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J4 */
    public /* synthetic */ void m27784J4(SignUpData signUpData, roj0 roj0Var) {
        act().startActivity(SignUpDetailsNewAct.m393a2(act(), signUpData));
    }

    /* JADX INFO: renamed from: J5 */
    private void m27785J5(boolean z, final WeChatToken weChatToken, final Runnable runnable, final e30<Boolean> e30Var) {
        cwf0 cwf0VarC = i0e.c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        i0e.f(cwf0VarC);
        act().dialog().E0(z ? R$string.f139V2 : R$string.f129T2).D(z ? R$string.f144W2 : R$string.f134U2).t0(R$string.f301z, new Runnable() { // from class: l.lyp0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m27902i1(weChatToken, e30Var, runnable);
            }
        }).l0(R$string.f167b, new Runnable() { // from class: l.myp0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m27789L0(runnable);
            }
        }).V(new DialogInterfaceOnDismissListenerC1461c(cwf0VarC)).z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.nyp0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
    }

    /* JADX INFO: renamed from: K2 */
    public static /* synthetic */ void m27786K2(d30 d30Var, roj0 roj0Var) {
        tan.b();
        d30Var.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public boolean m27787K3(Throwable th) {
        return NullChecker.a(th) && (th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40037;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K4 */
    public /* synthetic */ void m27788K4(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
        if (m27787K3(th)) {
            this.f27964n.b(th, thirdPartyData, runnable, SignInGrantType.get("google"));
        } else {
            e51.G(runnable);
            yij0.D(th);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m27789L0(Runnable runnable) {
        zvf0.r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L4 */
    public /* synthetic */ void m27792L4() {
        act().progressDismiss();
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15050a();
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15071n(false);
        lsi0.y("QQ登录失败，请重试");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M4 */
    public /* synthetic */ void m27794M4() {
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15071n(false);
        lsi0.y("登录失败，绑定手机号后再试");
    }

    /* JADX INFO: renamed from: N2 */
    public static /* synthetic */ void m27797N2(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N4 */
    public /* synthetic */ void m27798N4() {
        act().progressDismiss();
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15071n(false);
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m27800O1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public /* synthetic */ void m27801O3(roj0 roj0Var) {
        if (C0775gp.m15903j()) {
            al40.m11881e().m11884h(this.f27956f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O4 */
    public /* synthetic */ rx.c m27802O4(ThirdPartVetify thirdPartVetify) {
        return m28001F3();
    }

    /* JADX INFO: renamed from: P2 */
    public static /* synthetic */ void m27805P2(Envelope envelope) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public /* synthetic */ void m27806P3(roj0 roj0Var) {
        if (C0775gp.m15903j()) {
            al40.m11881e().m11884h(this.f27956f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public /* synthetic */ void m27807P4(WeChatUserInfo weChatUserInfo) {
        m28022x5(weChatUserInfo, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q3 */
    public /* synthetic */ void m27811Q3(MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            int i = this.f27975y + 1;
            this.f27975y = i;
            if (i < 5) {
                m27773H4();
            } else {
                ABManager.m1228L().take(1).subscribe(mkd0.G(new e30() { // from class: l.a1q0
                    public final void call(Object obj) {
                        this.f8058a.m27801O3((roj0) obj);
                    }
                }));
                AccountModule.f28e.m75h(act(), ThirdPartLoginApi.ReportMobileSource.landing_page, this.f27956f);
            }
        } else {
            this.f27956f = mobileRespInfo.mobileNumber;
            ABManager.m1228L().take(1).subscribe(mkd0.G(new e30() { // from class: l.b1q0
                public final void call(Object obj) {
                    this.f8672a.m27806P3((roj0) obj);
                }
            }));
            AccountModule.f28e.m75h(act(), ThirdPartLoginApi.ReportMobileSource.landing_page, this.f27956f);
        }
        zvf0.D("e_login_phone_acquisition", "p_sign_in_type_selection_view", new j760[]{vwb.Y("get_phone_or_not", !TextUtils.isEmpty(this.f27956f) ? "yes" : "no")});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public /* synthetic */ void m27812Q4(WeChatUserInfo weChatUserInfo) {
        m28022x5(weChatUserInfo, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public /* synthetic */ void m27816R3(SignUpData signUpData, roj0 roj0Var) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public /* synthetic */ void m27817R4(final Runnable runnable, final WeChatUserInfo weChatUserInfo, final Runnable runnable2) {
        C0726fo.m15389P(act(), "qq", "verified", new d30() { // from class: l.ayp0
            public final void call() {
                runnable.run();
            }
        }, new d30() { // from class: l.byp0
            public final void call() {
                this.f9230a.m27812Q4(weChatUserInfo);
            }
        }, new d30() { // from class: l.cyp0
            public final void call() {
                runnable2.run();
            }
        });
    }

    /* JADX INFO: renamed from: S2 */
    public static /* synthetic */ void m27820S2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m27821S3(Throwable th) {
        this.f27968r.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m27822S4(WeChatUserInfo weChatUserInfo) {
        m28022x5(weChatUserInfo, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S5 */
    public void m27823S5() {
        ((AbstractC1250s6) ((jq2) this).viewModel).act().startActivity(PhoneNumberLoginOptAct.m578Y1(((AbstractC1250s6) ((jq2) this).viewModel).act()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m27826T3(AsyncEmitter asyncEmitter) {
        new UserInfo(act(), m27778I3(act()).getQQToken()).getUserInfo(new C1460b(asyncEmitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4 */
    public /* synthetic */ void m27827T4(final Runnable runnable, final WeChatUserInfo weChatUserInfo, final Runnable runnable2, roj0 roj0Var) {
        act().progressDismiss();
        if (!C0775gp.m15899f()) {
            m28022x5(weChatUserInfo, false);
        } else if (TextUtils.isEmpty(this.f27956f) || !m27999D3()) {
            C0726fo.m15389P(act(), "qq", "", new d30() { // from class: l.wxp0
                public final void call() {
                    runnable2.run();
                }
            }, new d30() { // from class: l.xxp0
                public final void call() {
                    this.f27779a.m27822S4(weChatUserInfo);
                }
            }, new d30() { // from class: l.yxp0
                public final void call() {
                    runnable.run();
                }
            });
        } else {
            C0726fo.m15390Q(act(), "qq", this.f27956f, new d30() { // from class: l.sxp0
                public final void call() {
                    runnable.run();
                }
            }, new d30() { // from class: l.txp0
                public final void call() {
                    this.f22326a.m27807P4(weChatUserInfo);
                }
            }, new d30() { // from class: l.uxp0
                public final void call() {
                    runnable2.run();
                }
            }, new d30() { // from class: l.vxp0
                public final void call() {
                    this.f24526a.m27817R4(runnable2, weChatUserInfo, runnable);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m27831U3(View view) {
        if (((AbstractC1250s6) ((jq2) this).viewModel).mo15056e() || !IntlCountryCodeController.m15p()) {
            this.f27962l.onClick(view);
        } else {
            ((AbstractC1250s6) ((jq2) this).viewModel).mo15062i(this.f27962l, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public /* synthetic */ void m27832U4(String str, String str2, final Runnable runnable, final Runnable runnable2, final WeChatUserInfo weChatUserInfo) {
        SignUpData signUpData = new SignUpData();
        signUpData.name = weChatUserInfo.nickname;
        signUpData.signUpType = AccountTempApi.SignUpType.qq;
        signUpData.thirdPartyId = str;
        signUpData.thirdPartyToken = str2;
        AccountModule.f26c.m232i2(signUpData);
        duringCreated(eje.m14577r(signUpData, null, true)).subscribe(mkd0.H(new e30() { // from class: l.r2q0
            public final void call(Object obj) {
                this.f20276a.m27827T4(runnable, weChatUserInfo, runnable2, (roj0) obj);
            }
        }, new e30() { // from class: l.s2q0
            public final void call(Object obj) {
                y2q0.m27863b2(runnable2, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m27836V3(boolean z, final View view) {
        if (z) {
            zvf0.r("e_signin_phone_button", ((PutongAct) act()).pageId());
        }
        m28002F5(new d30() { // from class: l.l1q0
            public final void call() {
                this.f16181a.m27831U3(view);
            }
        }, new l0q0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public /* synthetic */ void m27837V4(Boolean bool) {
        AuthData authData = (AuthData) AccountModule.f26c.m207V0().b();
        String string = NullChecker.a(authData) ? authData.signupStage.toString() : "";
        if (C0775gp.m15899f() && bool.booleanValue()) {
            act().startActivity(SignUpAiAct.m291Y1(act()));
        } else {
            act().startActivity(C0811hp.m16306f(((AbstractC1250s6) ((jq2) this).viewModel).act(), string));
        }
        AccountModule.f28e.m75h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f27956f);
        act().finish();
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m27838W0(String str, String str2, final e30 e30Var, final Runnable runnable) {
        zvf0.r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("qq");
        signInData.thirdPartyId = str;
        signInData.thirdPartyToken = str2;
        AccountModule.f26c.m244o2(signInData, true, new Runnable() { // from class: l.xyp0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m27951q2();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.yyp0
            public final void call(Object obj) {
                e30Var.call(Boolean.FALSE);
            }
        }, new e30() { // from class: l.zyp0
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m27841W3() {
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15052b(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public /* synthetic */ void m27842W4(final Runnable runnable, final e30 e30Var, final Runnable runnable2) {
        C0726fo.m15389P(act(), "qq", "verified", new d30() { // from class: l.typ0
            public final void call() {
                runnable.run();
            }
        }, new d30() { // from class: l.uyp0
            public final void call() {
                e30Var.call(Boolean.TRUE);
            }
        }, new d30() { // from class: l.wyp0
            public final void call() {
                runnable2.run();
            }
        });
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ Boolean m27843X0(WeChatToken weChatToken, Runnable runnable, WeChatToken weChatToken2) {
        if (!NullChecker.a(weChatToken2) || TextUtils.isEmpty(weChatToken2.thirdpartyId) || TextUtils.isEmpty(weChatToken2.thirdpartyAccessToken)) {
            runnable.run();
            return Boolean.FALSE;
        }
        weChatToken.thirdpartyId = weChatToken2.thirdpartyId;
        weChatToken.thirdpartyAccessToken = weChatToken2.thirdpartyAccessToken;
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m27846X3(ThirdPartyData thirdPartyData, roj0 roj0Var) {
        SignUpData signUpData = new SignUpData();
        signUpData.appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(App.e);
        signUpData.signUpType = AccountTempApi.SignUpType.google;
        m27975u5(signUpData, thirdPartyData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m27847X4(final Runnable runnable, final e30 e30Var, final Runnable runnable2, roj0 roj0Var) {
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
        if (TextUtils.isEmpty(this.f27956f) || !m27999D3()) {
            C0726fo.m15389P(act(), "qq", "", new d30() { // from class: l.exp0
                public final void call() {
                    runnable2.run();
                }
            }, new d30() { // from class: l.fxp0
                public final void call() {
                    e30Var.call(Boolean.TRUE);
                }
            }, new d30() { // from class: l.gxp0
                public final void call() {
                    runnable.run();
                }
            });
        } else {
            C0726fo.m15390Q(act(), "qq", this.f27956f, new d30() { // from class: l.t2q0
                public final void call() {
                    runnable.run();
                }
            }, new d30() { // from class: l.u2q0
                public final void call() {
                    e30Var.call(Boolean.TRUE);
                }
            }, new d30() { // from class: l.v2q0
                public final void call() {
                    runnable2.run();
                }
            }, new d30() { // from class: l.w2q0
                public final void call() {
                    this.f24896a.m27842W4(runnable2, e30Var, runnable);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public static /* synthetic */ void m27850Y2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public /* synthetic */ void m27851Y3(ThirdPartyData thirdPartyData, Runnable runnable, Throwable th) {
        if (m27787K3(th)) {
            this.f27964n.b(th, thirdPartyData, runnable, SignInGrantType.get("google"));
        } else {
            e51.G(runnable);
            yij0.D(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y4 */
    public /* synthetic */ void m27852Y4(String str, String str2, Runnable runnable, e30 e30Var, Runnable runnable2, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable2.run();
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40020 || i == 40091) {
            m27774H5(i == 40020, str, str2, runnable, e30Var);
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m27855Z3(Bundle bundle) {
        if (NullChecker.a(act().getSupportActionBar())) {
            act().getSupportActionBar().m();
        }
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15077r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m27856Z4(final Runnable runnable, final String str, final String str2, final Runnable runnable2, final Runnable runnable3, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable.run();
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40033) {
            ((AbstractC1250s6) ((jq2) this).viewModel).mo15071n(false);
            lsi0.y("QQ暂不支持注册");
            return;
        }
        if (i != 40037) {
            runnable.run();
            return;
        }
        AccountModule.f26c.m240m2(AccountTempApi.SignUpType.qq);
        final e30 e30Var = new e30() { // from class: l.n2q0
            public final void call(Object obj) {
                this.f17456a.m27837V4((Boolean) obj);
            }
        };
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("qq");
        signInData.thirdPartyId = str;
        signInData.thirdPartyToken = str2;
        signInData.device = pk8.m21562M();
        AccountModule.f26c.m244o2(signInData, false, new Runnable() { // from class: l.o2q0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m27937o0();
            }
        }).subscribe(mkd0.K(new e30() { // from class: l.p2q0
            public final void call(Object obj) {
                this.f18569a.m27847X4(runnable2, e30Var, runnable, (roj0) obj);
            }
        }, new e30() { // from class: l.q2q0
            public final void call(Object obj) {
                this.f19543a.m27852Y4(str, str2, runnable3, e30Var, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m27860a4(User user) {
        if (C0775gp.m15899f()) {
            return;
        }
        eje.m14574h().m14586o(user);
        m27744B3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public /* synthetic */ void m27861a5(AccountTestGroup accountTestGroup) {
        if (accountTestGroup.facebookEntry) {
            ((AbstractC1250s6) ((jq2) this).viewModel).mo15064j();
            this.f27946B.call();
        } else {
            this.f27967q.call();
        }
        if (accountTestGroup.googleEntry && C0775gp.m15897d()) {
            zvf0.x("e_signin_google_button", ((PutongAct) act()).pageId());
            ((AbstractC1250s6) ((jq2) this).viewModel).mo15067l();
        }
    }

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ void m27863b2(Runnable runnable, Throwable th) {
        runnable.run();
        CrashHelper.c(new Exception("wechat signup no transition--> message:" + th.getMessage(), th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m27865b4(Throwable th) {
        if ((th instanceof ApiExcep.Client.NotFound) || (th instanceof ApiExcep.Client.Unauthorized) || ((th instanceof App.HandledGlobally) && (((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            eje.m14574h().m14584m();
        } else {
            eje.m14574h().m14580g();
            m27744B3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b5 */
    public /* synthetic */ void m27866b5(Throwable th) {
        this.f27967q.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m27870c4(Bundle bundle) {
        this.f27954d = ((AbstractC1250s6) ((jq2) this).viewModel).mo15053c(this.f27951a);
        m27752C5(this.f27958h);
        if (IntlCountryCodeController.m8i()) {
            AccountTempApi.InactiveType inactiveType = this.f27952b;
            if (inactiveType == AccountTempApi.InactiveType.Pause) {
                C0726fo.m15393T(act(), act().string(R$string.f210i0), act().string(R$string.f204h0), act().string(R$string.f79J2));
            } else if (inactiveType == AccountTempApi.InactiveType.DeleteImmediately) {
                C0726fo.m15393T(act(), act().string(R$string.f198g0), this.f27959i ? String.format("%s\n\n%s", act().string(R$string.f192f0), act().string(R$string.f228l0)) : act().string(R$string.f192f0), act().string(R$string.f79J2));
            }
        }
        if (this.f27952b == AccountTempApi.InactiveType.DeleteImmediately && !TextUtils.isEmpty(this.f27953c) && RemoteConfig.x().F("setting_snail_diversion_config").contains(this.f27953c)) {
            j2e0.m17248m(act(), Uri.parse("tantan://webview?url=".concat(juk.e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/love-snail/index.html?speed=true&_bid=1004028&hideNavigationBar=1&hideNotch=1" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/love-snail/index.html?speed=true&_bid=1004028&hideNavigationBar=1&hideNotch=1")));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c5 */
    public /* synthetic */ void m27871c5(AccountTestFactor accountTestFactor) {
        AccountModule.f26c.m253t2(accountTestFactor).subscribe(mkd0.H(new e30() { // from class: l.j1q0
            public final void call(Object obj) {
                this.f14960a.m27861a5((AccountTestGroup) obj);
            }
        }, new e30() { // from class: l.k1q0
            public final void call(Object obj) {
                this.f15548a.m27866b5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m27875d4() {
        act().removeCallbacks(this.f27954d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public /* synthetic */ void m27876d5(SignInData signInData, Runnable runnable) {
        zvf0.r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        m28005K5(signInData, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m27881e4() {
        if (!m28007M3()) {
            lsi0.y("未安装QQ");
        } else if (m27778I3(act()).isSessionValid()) {
            m27778I3(act()).logout(act());
        } else {
            ((AbstractC1250s6) ((jq2) this).viewModel).mo15071n(true);
            m27778I3(act()).login(act(), "all", this.f27974x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e5 */
    public /* synthetic */ void m27882e5(View view) {
        zvf0.u("e_switch_account_button", "p_signin_with_saved_info", new j760[]{vwb.Y("switch_account", "close")});
        this.f27948D.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m27887f4() {
        ((AbstractC1250s6) ((jq2) this).viewModel).act().progress(R$string.f216j0);
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15071n(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f5 */
    public /* synthetic */ void m27888f5(d30 d30Var, View view) {
        zvf0.r("e_signin_with_saved_info_button", "p_signin_with_saved_info");
        d30Var.call();
        this.f27948D.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public /* synthetic */ void m27893g4() {
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15050a();
        ((AbstractC1250s6) ((jq2) this).viewModel).act().progressDismiss();
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15071n(false);
        lsi0.y(act().string(R$string.f250o4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g5 */
    public /* synthetic */ void m27894g5(View view) {
        zvf0.u("e_switch_account_button", "p_signin_with_saved_info", new j760[]{vwb.Y("switch_account", "signin_another_account")});
        this.f27948D.dismiss();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m27895h0(d30 d30Var, roj0 roj0Var) {
        tan.b();
        d30Var.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ void m27899h4() {
        ((AbstractC1250s6) ((jq2) this).viewModel).act().progressDismiss();
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15071n(false);
        lsi0.y("登录失败，绑定手机号后再试");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h5 */
    public /* synthetic */ void m27900h5(Runnable runnable, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            ((AbstractC1250s6) ((jq2) this).viewModel).act().progressDismiss();
            lsi0.l(((AbstractC1250s6) ((jq2) this).viewModel).act().getResources().getString(R$string.f64G2), false, true);
            if (NullChecker.a(runnable)) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m27902i1(WeChatToken weChatToken, final e30 e30Var, final Runnable runnable) {
        zvf0.r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("wechat");
        signInData.thirdPartyId = weChatToken.thirdpartyId;
        signInData.thirdPartyToken = weChatToken.thirdpartyAccessToken;
        AccountModule.f26c.m244o2(signInData, true, new Runnable() { // from class: l.ezp0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m27820S2();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.fzp0
            public final void call(Object obj) {
                e30Var.call(Boolean.FALSE);
            }
        }, new e30() { // from class: l.hzp0
            public final void call(Object obj) {
                runnable.run();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4 */
    public /* synthetic */ void m27905i4() {
        ((AbstractC1250s6) ((jq2) this).viewModel).act().progressDismiss();
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15071n(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i5 */
    public /* synthetic */ void m27906i5(roj0 roj0Var) {
        m28014R5();
        if (C0775gp.m15903j()) {
            al40.m11881e().m11886j(this.f27956f);
        }
    }

    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ void m27910j3(Runnable runnable) {
        zvf0.r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ Boolean m27911j4(Runnable runnable, Runnable runnable2, ThirdPartLoginApi.C0000a c0000a) {
        if (c0000a.f311b != 0) {
            runnable2.run();
            return Boolean.FALSE;
        }
        this.f27969s = true;
        runnable.run();
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j5 */
    public /* synthetic */ void m27912j5(Runnable runnable, Throwable th) {
        ((AbstractC1250s6) ((jq2) this).viewModel).act().progressDismiss();
        lsi0.l(((AbstractC1250s6) ((jq2) this).viewModel).act().getResources().getString(R$string.f64G2), false, true);
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m27917k4(WeChatToken weChatToken, WeChatUserInfo weChatUserInfo) {
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
        m28016U5();
        act().finish();
        yij0.S(act());
        if (C0775gp.m15903j()) {
            al40.m11881e().m11886j(this.f27956f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k5 */
    public /* synthetic */ void m27918k5(Runnable runnable, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            ((AbstractC1250s6) ((jq2) this).viewModel).act().progressDismiss();
            lsi0.l(((AbstractC1250s6) ((jq2) this).viewModel).act().getResources().getString(R$string.f64G2), false, true);
            if (NullChecker.a(runnable)) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m27922l3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m27923l4(Boolean bool) {
        AuthData authData = (AuthData) AccountModule.f26c.m207V0().b();
        String string = NullChecker.a(authData) ? authData.signupStage.toString() : "";
        Intent intentM291Y1 = (C0775gp.m15899f() && bool.booleanValue()) ? SignUpAiAct.m291Y1(act()) : C0811hp.m16306f(((AbstractC1250s6) ((jq2) this).viewModel).act(), string);
        if ("verified".equals(string) && !eje.m14574h().m14582j(authData.finishedStages)) {
            rup0.f20755J.put(Boolean.FALSE);
        }
        act().startActivity(intentM291Y1);
        AccountModule.f28e.m75h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f27956f);
        m28016U5();
        act().finish();
        if (C0775gp.m15903j()) {
            al40.m11881e().m11886j(this.f27956f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l5 */
    public /* synthetic */ void m27924l5(roj0 roj0Var) {
        AccountModule.f26c.m240m2(AccountTempApi.SignUpType.cosmos);
        m28014R5();
        if (C0775gp.m15903j()) {
            al40.m11881e().m11886j(this.f27956f);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ rx.c m27925m0(SignInData signInData, MobileRespInfo mobileRespInfo) {
        signInData.grantType = mobileRespInfo.grantType;
        signInData.thirdPartyToken = mobileRespInfo.token;
        signInData.thirdPartyAccessCode = mobileRespInfo.accessCode;
        signInData.thirdPartyId = mobileRespInfo.openId;
        return AccountModule.f26c.m244o2(signInData, false, new Runnable() { // from class: l.rxp0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m27922l3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m27929m4(final Runnable runnable, final e30 e30Var, final Runnable runnable2) {
        C0726fo.m15389P(act(), "wechat", "verified", new d30() { // from class: l.azp0
            public final void call() {
                runnable.run();
            }
        }, new d30() { // from class: l.bzp0
            public final void call() {
                e30Var.call(Boolean.TRUE);
            }
        }, new d30() { // from class: l.czp0
            public final void call() {
                runnable2.run();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m5 */
    public /* synthetic */ void m27930m5(SignInData signInData, Runnable runnable, Throwable th) {
        int i;
        ((AbstractC1250s6) ((jq2) this).viewModel).act().progressDismiss();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((i = ((TantanException.Client.AccountService) th).code) == 40020 || i == 40091)) {
            m27769G5(i == 40020, signInData, runnable);
            return;
        }
        if (!z || ((TantanException.Client.AccountService) th).code != 40016) {
            lsi0.l(((AbstractC1250s6) ((jq2) this).viewModel).act().getResources().getString(R$string.f64G2), false, true);
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
        AccountModule.f26c.m220c1().phoneNumber = this.f27956f;
        ((AbstractC1250s6) ((jq2) this).viewModel).act().startActivity(SignUpDetailsNewAct.m393a2(((AbstractC1250s6) ((jq2) this).viewModel).act(), signUpData));
        ((AbstractC1250s6) ((jq2) this).viewModel).act().progressDismiss();
        ((AbstractC1250s6) ((jq2) this).viewModel).act().finish();
        if (C0775gp.m15903j()) {
            al40.m11881e().m11886j(this.f27956f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m27935n4(final Runnable runnable, final e30 e30Var, final Runnable runnable2, roj0 roj0Var) {
        act().progressDismiss();
        if (C0775gp.m15899f()) {
            if (C0001a.m128i1()) {
                C0001a.m115Z1();
                if (TextUtils.isEmpty(this.f27956f) || !m27999D3()) {
                    C0726fo.m15389P(act(), "wechat", "", new d30() { // from class: l.hyp0
                        public final void call() {
                            runnable2.run();
                        }
                    }, new d30() { // from class: l.iyp0
                        public final void call() {
                            e30Var.call(Boolean.TRUE);
                        }
                    }, new d30() { // from class: l.jyp0
                        public final void call() {
                            runnable.run();
                        }
                    });
                    return;
                } else {
                    C0726fo.m15390Q(act(), "wechat", this.f27956f, new d30() { // from class: l.dyp0
                        public final void call() {
                            runnable.run();
                        }
                    }, new d30() { // from class: l.eyp0
                        public final void call() {
                            e30Var.call(Boolean.TRUE);
                        }
                    }, new d30() { // from class: l.fyp0
                        public final void call() {
                            runnable2.run();
                        }
                    }, new d30() { // from class: l.gyp0
                        public final void call() {
                            this.f13591a.m27929m4(runnable2, e30Var, runnable);
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
    public /* synthetic */ void m27936n5(View view) {
        zvf0.r("e_signin_fb_button", ((PutongAct) act()).pageId());
        if (((AbstractC1250s6) ((jq2) this).viewModel).mo15056e() || !IntlCountryCodeController.m15p()) {
            this.f27947C.onClick(view);
        } else {
            ((AbstractC1250s6) ((jq2) this).viewModel).mo15062i(this.f27947C, view);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m27937o0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ void m27941o4(WeChatToken weChatToken, Runnable runnable, e30 e30Var, Runnable runnable2, Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            runnable2.run();
            CrashHelper.c(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 40020 || i == 40091) {
            m27785J5(i == 40020, weChatToken, runnable, e30Var);
        } else {
            runnable2.run();
            CrashHelper.c(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o5 */
    public /* synthetic */ void m27942o5(View view) {
        zvf0.r("e_signin_google_button", ((PutongAct) act()).pageId());
        this.f27950F.onClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p4 */
    public /* synthetic */ void m27947p4(final Runnable runnable, final WeChatToken weChatToken, final Runnable runnable2, final Runnable runnable3, Throwable th) {
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
        final e30 e30Var = new e30() { // from class: l.kxp0
            public final void call(Object obj) {
                this.f16070a.m27923l4((Boolean) obj);
            }
        };
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("wechat");
        signInData.thirdPartyId = weChatToken.thirdpartyId;
        signInData.thirdPartyToken = weChatToken.thirdpartyAccessToken;
        signInData.device = pk8.m21562M();
        AccountModule.f26c.m244o2(signInData, false, new Runnable() { // from class: l.lxp0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m27800O1();
            }
        }).subscribe(mkd0.K(new e30() { // from class: l.mxp0
            public final void call(Object obj) {
                this.f17358a.m27935n4(runnable2, e30Var, runnable, (roj0) obj);
            }
        }, new e30() { // from class: l.nxp0
            public final void call(Object obj) {
                this.f17919a.m27941o4(weChatToken, runnable3, e30Var, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public /* synthetic */ void m27948p5(String str, roj0 roj0Var) {
        qib0.f19788L.f1135d.i();
        if ("oppo_quick_login".equals(str)) {
            AccountModule.f26c.m218b1("user.oppo.signin").subscribe(mkd0.G(new e30() { // from class: l.z0q0
                public final void call(Object obj) {
                    y2q0.m27805P2((Envelope) obj);
                }
            }));
        } else {
            str = "saved_sign-in_info";
        }
        zvf0.D("e_signin_success", "", new j760[]{vwb.Y("signin_type", str)});
        qib0.m22159e1("signin", new Object[0]);
        act().startActivity(AccountModule.m27H().newMainActClearStack(Y(), false, true));
        m28016U5();
        act().finish();
        yij0.S(act());
    }

    /* JADX INFO: renamed from: q2 */
    public static /* synthetic */ void m27951q2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public /* synthetic */ void m27953q4(final Runnable runnable, final Runnable runnable2, final Runnable runnable3, final Runnable runnable4) {
        this.f27973w.registerApp("wx67f59443a9c801bb");
        SendAuth.Req req = new SendAuth.Req();
        req.scope = "snsapi_userinfo";
        req.state = "";
        this.f27973w.sendReq(req);
        runnable.run();
        m28016U5();
        final WeChatToken weChatToken = new WeChatToken();
        this.f27971u = AccountModule.f28e.m76i().filter(new w9j() { // from class: l.s1q0
            public final Object call(Object obj) {
                return this.f20977a.m27911j4(runnable, runnable2, (ThirdPartLoginApi.C0000a) obj);
            }
        }).flatMap(new w9j() { // from class: l.t1q0
            public final Object call(Object obj) {
                return AccountModule.f28e.m74g(((ThirdPartLoginApi.C0000a) obj).f312c);
            }
        }).filter(new w9j() { // from class: l.u1q0
            public final Object call(Object obj) {
                return y2q0.m27843X0(weChatToken, runnable2, (WeChatToken) obj);
            }
        }).flatMap(new w9j() { // from class: l.v1q0
            public final Object call(Object obj) {
                WeChatToken weChatToken2 = (WeChatToken) obj;
                return AccountModule.f28e.m80m(weChatToken2.thirdpartyId, weChatToken2.thirdpartyAccessToken, false);
            }
        }).filter(new w9j() { // from class: l.w1q0
            public final Object call(Object obj) {
                return y2q0.m27984x0(runnable2, (ThirdPartVetify) obj);
            }
        }).flatMap(new w9j() { // from class: l.x1q0
            public final Object call(Object obj) {
                WeChatToken weChatToken2 = weChatToken;
                return AccountModule.f28e.m79l(weChatToken2.thirdpartyAccessToken, weChatToken2.thirdpartyId);
            }
        }).filter(new w9j() { // from class: l.y1q0
            public final Object call(Object obj) {
                return y2q0.m27763F0(runnable2, (WeChatUserInfo) obj);
            }
        }).first().subscribe(mkd0.K(new e30() { // from class: l.z1q0
            public final void call(Object obj) {
                this.f28554a.m27917k4(weChatToken, (WeChatUserInfo) obj);
            }
        }, new e30() { // from class: l.a2q0
            public final void call(Object obj) {
                this.f8074a.m27947p4(runnable2, weChatToken, runnable3, runnable4, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q5 */
    public /* synthetic */ void m27954q5(Throwable th) {
        ix50.b().a();
        act().progressDismiss();
        Throwable throwable = th instanceof App.HandledGlobally ? ((App.HandledGlobally) th).getThrowable() : th;
        if (!xck0.c(throwable, ApiExcep.Client.Unauthorized.class) && !xck0.c(throwable, ApiExcep.Client.NotFound.class)) {
            yij0.D(th);
        } else {
            lsi0.h(R$string.f106P);
            m28000E5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public /* synthetic */ void m27959r4(SignUpData signUpData, String str) {
        signUpData.profilePath = str;
        AccountModule.f26c.m202R0().put(str);
        act().startActivity(SignUpDetailsNewAct.m393a2(act(), signUpData));
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m27960s0(MatchCounterEnvelope matchCounterEnvelope) {
        long j = matchCounterEnvelope.totalCounters.matches;
        if (j > 0) {
            AccountModule.f26c.f318j.put(Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m27964s4(final SignUpData signUpData) {
        qib0.f19782G.i(signUpData.profilePath, new e30() { // from class: l.v0q0
            public final void call(Object obj) {
                this.f23872a.m27959r4(signUpData, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t2 */
    public static /* synthetic */ rx.c m27967t2(SignInData signInData, MobileRespInfo mobileRespInfo) {
        signInData.grantType = mobileRespInfo.grantType;
        signInData.thirdPartyToken = mobileRespInfo.token;
        signInData.thirdPartyAccessCode = mobileRespInfo.accessCode;
        signInData.thirdPartyId = mobileRespInfo.openId;
        return AccountModule.f26c.m244o2(signInData, true, new Runnable() { // from class: l.dzp0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m27977v2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public /* synthetic */ void m27969t4() {
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15065k();
        zvf0.x("e_signin_fb_button", ((PutongAct) act()).pageId());
        this.f27965o = c84.b.a();
        bzv.m().y(this.f27965o, new C1463e());
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15078s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m27974u4(View view) {
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15076q(true);
        bzv.m().u();
        bzv.m().t(act(), FacebookApi.f1141d);
    }

    /* JADX INFO: renamed from: u5 */
    private void m27975u5(final SignUpData signUpData, final ThirdPartyData thirdPartyData) {
        final Runnable runnable = new Runnable() { // from class: l.wzp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f25513a.m27779I4();
            }
        };
        signUpData.thirdPartyId = thirdPartyData.thirdPartyId;
        signUpData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        signUpData.signUpType = AccountTempApi.SignUpType.google;
        duringCreated(eje.m14577r(signUpData, null, true)).subscribe(mkd0.H(new e30() { // from class: l.xzp0
            public final void call(Object obj) {
                this.f27830a.m27784J4(signUpData, (roj0) obj);
            }
        }, new e30() { // from class: l.zzp0
            public final void call(Object obj) {
                this.f29055a.m27788K4(thirdPartyData, runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v2 */
    public static /* synthetic */ void m27977v2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public /* synthetic */ void m27979v4() {
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15080v();
        SignInData signInData = new SignInData();
        signInData.device = pk8.m21562M();
        m28006L5(signInData, new Runnable() { // from class: l.y0q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f27852a.m27823S5();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public /* synthetic */ void m27982w4() {
        m28002F5(new d30() { // from class: l.k0q0
            public final void call() {
                this.f15534a.m27979v4();
            }
        }, new l0q0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w5 */
    public void m27983w5(JSONObject jSONObject) {
        Exception exc;
        String string;
        String string2;
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15071n(true);
        final Runnable runnable = new Runnable() { // from class: l.c1q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9284a.m27792L4();
            }
        };
        final Runnable runnable2 = new Runnable() { // from class: l.d1q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9981a.m27794M4();
            }
        };
        final Runnable runnable3 = new Runnable() { // from class: l.e1q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10727a.m27798N4();
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
        m27778I3(act()).setAccessToken(str, string3);
        m27778I3(act()).setOpenId(str2);
        AccountModule.f28e.m80m(str2, str, true).first().flatMap(new w9j() { // from class: l.g1q0
            public final Object call(Object obj) {
                return this.f13027a.m27802O4((ThirdPartVetify) obj);
            }
        }).first().subscribe(mkd0.K(new e30() { // from class: l.h1q0
            public final void call(Object obj) {
                this.f13631a.m27832U4(str2, str, runnable2, runnable, (WeChatUserInfo) obj);
            }
        }, new e30() { // from class: l.i1q0
            public final void call(Object obj) {
                this.f14196a.m27856Z4(runnable, str2, str, runnable2, runnable3, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ Boolean m27984x0(Runnable runnable, ThirdPartVetify thirdPartVetify) {
        if (NullChecker.a(thirdPartVetify) && thirdPartVetify.code == 200) {
            return Boolean.TRUE;
        }
        runnable.run();
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m27988x4(final SignInGrantType signInGrantType, final ThirdPartyData thirdPartyData, final d30 d30Var, final Runnable runnable, Throwable th, Throwable th2) {
        if (!(th2 instanceof TantanException.Client.AccountService)) {
            runnable.run();
            yij0.D(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th2).code;
        if (i == 40020 || i == 40091) {
            boolean z = i == 40020;
            act().dialog().E0(z ? R$string.f139V2 : R$string.f129T2).D(z ? R$string.f144W2 : R$string.f134U2).t0(R$string.f301z, new Runnable() { // from class: l.w0q0
                @Override // java.lang.Runnable
                public final void run() {
                    y2q0.m27749C2(signInGrantType, thirdPartyData, d30Var, runnable);
                }
            }).l0(R$string.f167b, runnable).z0().setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.x0q0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    runnable.run();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m27992y4(View view) {
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15052b(true);
        p4k p4kVarA = com.google.android.gms.auth.api.signin.a.a(Y(), new GoogleSignInOptions.a(GoogleSignInOptions.DEFAULT_SIGN_IN).b().d("218526224262-usliqg20cepnb3ql98amgeum18v8uatv.apps.googleusercontent.com").a());
        p4kVarA.d();
        act().startActivityForResult(p4kVarA.b(), 9001);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z3, reason: merged with bridge method [inline-methods] */
    public void m27773H4() {
        duringCreated(new v9j() { // from class: l.s0q0
            public final Object call() {
                return ChinaMobileController.m1499b().m1507i(5000);
            }
        }, false).subscribe(mkd0.G(new e30() { // from class: l.t0q0
            public final void call(Object obj) {
                this.f21798a.m27811Q3((MobileRespInfo) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public /* synthetic */ void m27997z4(final Throwable th, final ThirdPartyData thirdPartyData, final Runnable runnable, final SignInGrantType signInGrantType) {
        SignInData signInData = new SignInData();
        signInData.grantType = signInGrantType;
        signInData.thirdPartyId = thirdPartyData.thirdPartyId;
        signInData.thirdPartyToken = thirdPartyData.thirdPartyToken;
        final d30 d30Var = new d30() { // from class: l.p0q0
            public final void call() {
                this.f18544a.m27768G4();
            }
        };
        AccountModule.f26c.m244o2(signInData, false, null).subscribe(mkd0.H(new e30() { // from class: l.q0q0
            public final void call(Object obj) {
                y2q0.m27895h0(d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.r0q0
            public final void call(Object obj) {
                this.f20219a.m27988x4(signInGrantType, thirdPartyData, d30Var, runnable, th, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A5 */
    public void m27998A5() {
        this.f27949E.call();
    }

    /* JADX INFO: renamed from: D3 */
    public boolean m27999D3() {
        OperatorType operatorTypeM12625c;
        if (this.f27957g == null || (operatorTypeM12625c = AccountModule.f27d.f24489a.m12625c()) == null) {
            return true;
        }
        int i = C1465g.f27988a[operatorTypeM12625c.ordinal()];
        if (i == 1 || i == 2) {
            return this.f27957g.chinaMobile;
        }
        if (i != 3) {
            return true;
        }
        return this.f27957g.chinaUnicom;
    }

    /* JADX INFO: renamed from: E5 */
    public void m28000E5() {
        qib0.f19788L.f1135d.i();
        m27746B5();
    }

    /* JADX INFO: renamed from: F3 */
    public rx.c<WeChatUserInfo> m28001F3() {
        return rx.c.fromAsync(new e30() { // from class: l.l2q0
            public final void call(Object obj) {
                this.f16202a.m27826T3((AsyncEmitter) obj);
            }
        }, AsyncEmitter.BackpressureMode.LATEST);
    }

    /* JADX INFO: renamed from: F5 */
    public void m28002F5(d30 d30Var, d30 d30Var2) {
        if (d30Var2 != null) {
            d30Var2.call();
        }
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: H3 */
    public View.OnClickListener m28003H3(final boolean z) {
        return new View.OnClickListener() { // from class: l.h0q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13625a.m27836V3(z, view);
            }
        };
    }

    /* JADX INFO: renamed from: J3 */
    public void m28004J3(String str, String str2) {
        final Runnable runnable = new Runnable() { // from class: l.nzp0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17953a.m27841W3();
            }
        };
        final ThirdPartyData thirdPartyDataNew_ = ThirdPartyData.new_();
        thirdPartyDataNew_.thirdPartyId = str;
        thirdPartyDataNew_.thirdPartyToken = str2;
        duringCreated(AccountModule.f26c.m171D2(thirdPartyDataNew_)).subscribe(mkd0.K(new e30() { // from class: l.yzp0
            public final void call(Object obj) {
                this.f28530a.m27846X3(thirdPartyDataNew_, (roj0) obj);
            }
        }, new e30() { // from class: l.j0q0
            public final void call(Object obj) {
                this.f14919a.m27851Y3(thirdPartyDataNew_, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: K5 */
    public void m28005K5(final SignInData signInData, final Runnable runnable) {
        ((AbstractC1250s6) ((jq2) this).viewModel).act().progress(R$string.f216j0, true);
        ((AbstractC1250s6) ((jq2) this).viewModel).act().duringCreated(ChinaMobileController.m1499b().m1506h(5000).doOnNext(new e30() { // from class: l.oyp0
            public final void call(Object obj) {
                this.f18500a.m27900h5(runnable, (MobileRespInfo) obj);
            }
        }).filter(new w9j() { // from class: l.pyp0
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new w9j() { // from class: l.qyp0
            public final Object call(Object obj) {
                return y2q0.m27967t2(signInData, (MobileRespInfo) obj);
            }
        }), false).subscribe(mkd0.H(new e30() { // from class: l.ryp0
            public final void call(Object obj) {
                this.f20921a.m27906i5((roj0) obj);
            }
        }, new e30() { // from class: l.syp0
            public final void call(Object obj) {
                this.f21768a.m27912j5(runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L5 */
    public void m28006L5(final SignInData signInData, final Runnable runnable) {
        ((AbstractC1250s6) ((jq2) this).viewModel).act().progress(R$string.f216j0, true);
        ((AbstractC1250s6) ((jq2) this).viewModel).act().duringCreated(ChinaMobileController.m1499b().m1506h(5000).doOnNext(new e30() { // from class: l.d2q0
            public final void call(Object obj) {
                this.f9989a.m27918k5(runnable, (MobileRespInfo) obj);
            }
        }).filter(new w9j() { // from class: l.e2q0
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new w9j() { // from class: l.f2q0
            public final Object call(Object obj) {
                return y2q0.m27925m0(signInData, (MobileRespInfo) obj);
            }
        }), false).subscribe(mkd0.K(new e30() { // from class: l.g2q0
            public final void call(Object obj) {
                this.f13037a.m27924l5((roj0) obj);
            }
        }, new e30() { // from class: l.h2q0
            public final void call(Object obj) {
                this.f13656a.m27930m5(signInData, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: M3 */
    public boolean m28007M3() {
        try {
            return act().getPackageManager().getPackageInfo("com.tencent.mobileqq", 0) != null;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: M5 */
    public View.OnClickListener m28008M5() {
        return new View.OnClickListener() { // from class: l.i0q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14186a.m27936n5(view);
            }
        };
    }

    /* JADX INFO: renamed from: N3 */
    public boolean m28009N3() {
        m27740A3();
        return this.f27973w.isWXAppInstalled();
    }

    /* JADX INFO: renamed from: N5 */
    public View.OnClickListener m28010N5() {
        return new View.OnClickListener() { // from class: l.c2q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9298a.m27942o5(view);
            }
        };
    }

    /* JADX INFO: renamed from: O5 */
    public void m28011O5() {
        m28012P5(null, null);
    }

    /* JADX INFO: renamed from: P5 */
    public void m28012P5(RememberUserInfo rememberUserInfo, final String str) {
        act().progress(R$string.f216j0);
        SignInData signInData = new SignInData();
        signInData.grantType = SignInGrantType.get("unknown_");
        AccountModule.f26c.m242n2(signInData, rememberUserInfo, false, new Runnable() { // from class: l.m0q0
            @Override // java.lang.Runnable
            public final void run() {
                y2q0.m27850Y2();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.n0q0
            public final void call(Object obj) {
                this.f17436a.m27948p5(str, (roj0) obj);
            }
        }, new e30() { // from class: l.o0q0
            public final void call(Object obj) {
                this.f17972a.m27954q5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q5 */
    public String m28013Q5(String str) {
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
    public void m28014R5() {
        SignupStage signupStage = ((AuthData) AccountModule.f26c.m207V0().b()).signupStage;
        Intent intentM16306f = !TEnum.equals(signupStage, "unknown_") ? C0811hp.m16306f(act(), signupStage.toString()) : AccountModule.m27H().toNewMainAct(act(), false, true);
        ((AbstractC1250s6) ((jq2) this).viewModel).act().progressDismiss();
        ((AbstractC1250s6) ((jq2) this).viewModel).act().startActivity(intentM16306f);
        ((AbstractC1250s6) ((jq2) this).viewModel).act().finish();
    }

    /* JADX INFO: renamed from: T5 */
    public void m28015T5() {
        sh50.m23747f();
        if (((Integer) App.i.get()).intValue() != 1 || f27944G) {
            return;
        }
        f27944G = true;
        if (!ruk.m22952g() || !ruk.m22951c().m22958h()) {
            if (TextUtils.isEmpty(mr4.f17192a) || !mr4.f17192a.toLowerCase().startsWith("douyin")) {
                zvf0.D("e_app_1st_open", "", new j760[]{new j760("is_first_open", Boolean.valueOf(this.f27960j)), new j760("user_agent", bjp0.getDefaultUserAgent(App.e)), new j760("device_model_raw", Build.MODEL), new j760("imei", dyd.e()), new j760("imei2", dyd.f()), new j760("oaid", k200.m17914b()), new j760("meid", dyd.g())});
                return;
            } else {
                zvf0.D("e_app_1st_open", "", new j760[]{new j760("is_first_open", Boolean.valueOf(this.f27960j)), new j760("user_agent", bjp0.getDefaultUserAgent(App.e)), new j760("device_model_raw", Build.MODEL), vwb.Y("toutiao_channel", HumeSDK.getChannel(App.e)), new j760("imei", dyd.e()), new j760("imei2", dyd.f()), new j760("oaid", k200.m17914b()), new j760("meid", dyd.g())});
                return;
            }
        }
        zvf0.D("e_app_1st_open", "", new j760[]{new j760("is_first_open", Boolean.valueOf(this.f27960j)), new j760("package_name", act().getPackageName()), new j760("referrer", ruk.m22951c().m22955d()), new j760("click_time", ruk.m22951c().m22953a()), new j760("install_time", ruk.m22951c().m22954b()), new j760("track", ruk.m22951c().m22956e()), new j760("user_agent", bjp0.getDefaultUserAgent(App.e)), new j760("device_model_raw", Build.MODEL), new j760("imei", dyd.e()), new j760("imei2", dyd.f()), new j760("oaid", k200.m17914b()), new j760("meid", dyd.g())});
        boolean z = nxv.a;
        ruk.m22951c().m22955d();
        ruk.m22951c().m22953a();
        ruk.m22951c().m22954b();
        ruk.m22951c().m22956e();
    }

    /* JADX INFO: renamed from: U5 */
    public void m28016U5() {
        if (!NullChecker.a(this.f27971u) || this.f27971u.isUnsubscribed()) {
            return;
        }
        this.f27971u.unsubscribe();
    }

    /* JADX INFO: renamed from: a0 */
    public void m28017a0() {
        super.a0();
        creates(new e30() { // from class: l.u0q0
            public final void call(Object obj) {
                this.f22416a.m27855Z3((Bundle) obj);
            }
        });
        String str = (String) eje.m14574h().f11185a.get();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(AccountModule.m26F().userId()) && !"finished".equals(str) && !"unknown_".equals(str)) {
            duringCreated(AccountModule.f26c.m213Y0()).subscribe(mkd0.H(new e30() { // from class: l.f1q0
                public final void call(Object obj) {
                    this.f11566a.m27860a4((User) obj);
                }
            }, new e30() { // from class: l.q1q0
                public final void call(Object obj) {
                    this.f19528a.m27865b4((Throwable) obj);
                }
            }));
        }
        qib0.f19778E.t();
        creates(new e30() { // from class: l.b2q0
            public final void call(Object obj) {
                this.f8693a.m27870c4((Bundle) obj);
            }
        }, new d30() { // from class: l.m2q0
            public final void call() {
                this.f16775a.m27875d4();
            }
        });
        AccountModule.f29f.m11771k();
    }

    /* JADX INFO: renamed from: r5 */
    public void m28018r5() {
        m28002F5(new d30() { // from class: l.i2q0
            public final void call() {
                this.f14212a.m27881e4();
            }
        }, new l0q0(this));
    }

    /* JADX INFO: renamed from: s5 */
    public void m28019s5() {
        final Runnable runnable = new Runnable() { // from class: l.m1q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16752a.m27887f4();
            }
        };
        final Runnable runnable2 = new Runnable() { // from class: l.n1q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17447a.m27893g4();
            }
        };
        final Runnable runnable3 = new Runnable() { // from class: l.o1q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17981a.m27899h4();
            }
        };
        final Runnable runnable4 = new Runnable() { // from class: l.p1q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18556a.m27905i4();
            }
        };
        this.f27969s = false;
        m27740A3();
        if (m28009N3()) {
            m28002F5(new d30() { // from class: l.r1q0
                public final void call() {
                    this.f20254a.m27953q4(runnable, runnable2, runnable3, runnable4);
                }
            }, new l0q0(this));
        } else {
            lsi0.y(App.e.getString(R$string.f220j4));
        }
    }

    /* JADX INFO: renamed from: t5 */
    public void m28020t5(int i, int i2, Intent intent) {
        if (i == 9001) {
            m27750C3(intent);
        }
        if (NullChecker.a(this.f27965o)) {
            this.f27965o.a(i, i2, intent);
        }
        if (i == 786 && i2 == 0) {
            this.f27968r.call();
        }
        if (i == 11101) {
            Tencent.onActivityResultData(i, i2, intent, this.f27974x);
        }
    }

    /* JADX INFO: renamed from: v5 */
    public void m28021v5(List<Media> list) {
        if (list.size() > 0 && (list.get(0) instanceof Picture) && NullChecker.c(this.f27955e, "account", CrashHelper.ReportLevel.p9)) {
            pgm pgmVar = new pgm(rhi.z(list.get(0).url), 960);
            try {
                this.f27955e.profilePath = pgmVar.d();
                m27761E3(this.f27955e);
            } catch (IOException e) {
                CrashHelper.c(e);
                this.f27968r.call();
            }
        }
    }

    /* JADX INFO: renamed from: x5 */
    public void m28022x5(WeChatUserInfo weChatUserInfo, boolean z) {
        AccountModule.f28e.m75h(act().getApplicationContext(), ThirdPartLoginApi.ReportMobileSource.wechat_login, this.f27956f);
        if (z) {
            rup0.f20755J.put(Boolean.FALSE);
        }
        AccountModule.f26c.m185I2().put(weChatUserInfo.nickname);
        act().startActivity(C0811hp.m16305e(((AbstractC1250s6) ((jq2) this).viewModel).act()));
    }

    /* JADX INFO: renamed from: y5 */
    public void m28023y5() {
        RememberUserInfo rememberUserInfo = (RememberUserInfo) qib0.f19788L.f1135d.b();
        if (NullChecker.a(rememberUserInfo)) {
            m27780I5(rememberUserInfo, act(), new dxp0(this));
        }
    }

    /* JADX INFO: renamed from: z5 */
    public void m28024z5() {
        if (this.f27970t) {
            if (!this.f27969s) {
                ((AbstractC1250s6) ((jq2) this).viewModel).mo15071n(false);
            }
            this.f27969s = false;
        }
        duringCreated(AccountModule.f26c.m211X0()).subscribe(mkd0.H(new e30() { // from class: l.x2q0
            public final void call(Object obj) {
                y2q0.m27960s0((MatchCounterEnvelope) obj);
            }
        }, new e30() { // from class: l.oxp0
            public final void call(Object obj) {
                y2q0.m27797N2((Throwable) obj);
            }
        }));
        ((AbstractC1250s6) ((jq2) this).viewModel).mo15058f();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.y2q0$a */
    public class C1459a implements IUiListener {
        public C1459a() {
        }

        public void onCancel() {
            y2q0.this.m27757D5();
        }

        public void onComplete(Object obj) {
            y2q0.this.f27969s = true;
            if (obj == null || !(obj instanceof JSONObject)) {
                y2q0.this.m27757D5();
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            int length = jSONObject.length();
            y2q0 y2q0Var = y2q0.this;
            if (length == 0) {
                y2q0Var.m27757D5();
            } else {
                y2q0Var.m27983w5(jSONObject);
            }
        }

        public void onError(UiError uiError) {
            y2q0.this.m27757D5();
        }

        public void onWarning(int i) {
        }
    }

    /* JADX INFO: renamed from: l.y2q0$b */
    public class C1460b implements IUiListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AsyncEmitter f27978a;

        public C1460b(AsyncEmitter asyncEmitter) {
            this.f27978a = asyncEmitter;
        }

        public void onCancel() {
            this.f27978a.onError(new IllegalStateException("cancel get qq user info"));
        }

        public void onComplete(Object obj) {
            if (obj == null) {
                this.f27978a.onError(new IllegalStateException("qq user info null"));
                return;
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.length() == 0) {
                this.f27978a.onError(new IllegalStateException("qq user info null"));
                return;
            }
            WeChatUserInfo weChatUserInfoNew_ = WeChatUserInfo.new_();
            try {
                weChatUserInfoNew_.nickname = jSONObject.getString("nickname");
                this.f27978a.onNext(weChatUserInfoNew_);
                this.f27978a.onCompleted();
            } catch (Exception e) {
                CrashHelper.c(e);
                this.f27978a.onError(new IllegalStateException("qq user info parse error"));
            }
        }

        public void onError(UiError uiError) {
            this.f27978a.onError(new IllegalStateException("error get qq user info" + uiError.errorMessage));
        }

        public void onWarning(int i) {
        }
    }
}
