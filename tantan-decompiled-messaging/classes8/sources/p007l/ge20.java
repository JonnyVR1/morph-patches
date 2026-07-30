package p007l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.android.app.C0231c;
import com.p1.mobile.putong.api.api.FacebookApi;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Mobile;
import com.p1.mobile.putong.data.PhoneNumber;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l.az2;
import l.bzv;
import l.c84;
import l.czv;
import l.dsj0;
import l.dze;
import l.e30;
import l.exb;
import l.ez2;
import l.fuf;
import l.j760;
import l.k960;
import l.osi0;
import l.p4k;
import l.pv6;
import l.qib0;
import l.qy;
import l.roj0;
import l.smr;
import l.sx2;
import l.vwb;
import l.w85;
import l.w9j;
import l.x9j;
import l.yaf0;
import l.yij0;
import l.yx2;
import l.yy50;
import l.zvf0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ge20 extends jq2<oe20> {

    /* JADX INFO: renamed from: a */
    public CommonData f2762a;

    /* JADX INFO: renamed from: b */
    public final a<roj0> f2763b;

    /* JADX INFO: renamed from: c */
    public c84 f2764c;

    /* JADX INFO: renamed from: d */
    public AccessToken f2765d;

    /* JADX INFO: renamed from: l.ge20$a */
    public class C0550a implements fuf<czv> {
        public C0550a() {
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m9246c() {
        }

        /* JADX INFO: renamed from: a */
        public void m9249a(FacebookException facebookException) {
            FacebookApi.m(facebookException);
            zvf0.D("e_intl_account_add_facebook_result", ((oe20) ge20.this.viewModel).act().pageId(), new j760[]{j760.a("add_result", "fail")});
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m9250f(roj0 roj0Var) {
            zvf0.D("e_intl_account_add_facebook_result", ((oe20) ge20.this.viewModel).act().pageId(), new j760[]{j760.a("add_result", "success")});
            osi0.f(R.string.q4);
            ge20.this.m9243e1();
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [android.app.Activity, com.p1.mobile.android.app.Act] */
        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m9251g(Throwable th) {
            if (th instanceof TantanException.Client.AccountService) {
                int i = ((TantanException.Client.AccountService) th).code;
                if (i == 400152 || i == 400153) {
                    final ?? Act = ge20.this.act();
                    Act.runOnUiThread(new Runnable() { // from class: l.ee20
                        @Override // java.lang.Runnable
                        public final void run() {
                            Act act = Act;
                            new dd80.C0522a(act).m8982y0(act.getString(R.string.B1)).m8977t0(String.format(act.getString(R.string.A1), "Facebook")).m8960c0(act.getString(R.string.t1), new Runnable() { // from class: l.fe20
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ge20.C0550a.m9246c();
                                }
                            }).m8947P(false).m8975r0();
                        }
                    });
                }
                zvf0.D("e_intl_account_add_facebook_result", ((oe20) ge20.this.viewModel).act().pageId(), new j760[]{j760.a("add_result", "fail")});
            }
        }

        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onSuccess(czv czvVar) {
            ge20.this.f2765d = czvVar.a();
            if (NullChecker.a(ge20.this.f2765d)) {
                ge20.this.act().duringCreated(qib0.b0.a.Jm("facebook", ge20.this.f2765d.o(), ge20.this.f2765d.n(), "")).subscribe(mkd0.m9875H(new e30() { // from class: l.ce20
                    public final void call(Object obj) {
                        this.f2465a.m9250f((roj0) obj);
                    }
                }, new e30() { // from class: l.de20
                    public final void call(Object obj) {
                        this.f2568a.m9251g((Throwable) obj);
                    }
                }));
            }
        }

        public void onCancel() {
            zvf0.D("e_intl_account_add_facebook_result", ((oe20) ge20.this.viewModel).act().pageId(), new j760[]{j760.a("add_result", "fail")});
        }
    }

    public ge20(mcr mcrVar) {
        super(mcrVar);
        this.f2763b = a.b();
    }

    /* JADX INFO: renamed from: J0 */
    public static String m9201J0() {
        User userNa = CoreModule.c.e0.na();
        Settings settings = userNa.settings;
        if (settings == null || TextUtils.isEmpty(settings.linkedPhoneNumber.number)) {
            return "";
        }
        return "+" + userNa.settings.linkedPhoneNumber.countryCode + " " + qy.a(userNa.settings.linkedPhoneNumber.number);
    }

    /* JADX INFO: renamed from: O0 */
    private boolean m9202O0() {
        return !TextUtils.isEmpty(this.f2762a.email);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m9203X0(C0231c c0231c) {
        m9243e1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public /* synthetic */ void m9204Y0(roj0 roj0Var) {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m9208h0() {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m9210j0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m9211k0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ User m9213m0(User user, roj0 roj0Var) {
        return user;
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m9214n0() {
    }

    /* JADX INFO: renamed from: E0 */
    public void m9225E0() {
        bzv.m().u();
        bzv.m().t(act(), FacebookApi.d);
    }

    /* JADX INFO: renamed from: F0 */
    public void m9226F0() {
        ((oe20) this.viewModel).m10207i(true);
        p4k p4kVarA = com.google.android.gms.auth.api.signin.a.a(m9552Y(), new GoogleSignInOptions.a(GoogleSignInOptions.DEFAULT_SIGN_IN).b().d("218526224262-usliqg20cepnb3ql98amgeum18v8uatv.apps.googleusercontent.com").a());
        p4kVarA.d();
        act().startActivityForResult(p4kVarA.b(), 9002);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m9227G0(String str, String str2, String str3) {
        act().duringCreated(qib0.b0.a.Jm("google", str, str2, str3)).subscribe(mkd0.m9875H(new e30() { // from class: l.ae20
            public final void call(Object obj) {
                this.f1849a.m9234R0((roj0) obj);
            }
        }, new e30() { // from class: l.be20
            public final void call(Object obj) {
                this.f2307a.m9235S0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H0 */
    public final void m9228H0(Intent intent) {
        try {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) com.google.android.gms.auth.api.signin.a.b(intent).m(ApiException.class);
            ((oe20) this.viewModel).m10207i(false);
            m9227G0(googleSignInAccount.g0(), googleSignInAccount.h0(), googleSignInAccount.H());
        } catch (ApiException e) {
            if (e.getStatusCode() != 12501) {
                lsi0.m9834h(R.string.H0);
            }
            ((oe20) this.viewModel).m10207i(false);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public CommonData m9229I0() {
        if (this.f2762a == null) {
            User userNa = CoreModule.c.e0.na();
            CommonData commonDataNew_ = CommonData.new_();
            this.f2762a = commonDataNew_;
            commonDataNew_.mobile = Mobile.new_();
            Mobile mobile = this.f2762a.mobile;
            PhoneNumber phoneNumber = userNa.settings.phoneNumber;
            mobile.mobileNumber = phoneNumber.number;
            mobile.countryCode = phoneNumber.countryCode;
        }
        return this.f2762a;
    }

    /* JADX INFO: renamed from: L0 */
    public List<ez2> m9230L0() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (m9241c1()) {
            arrayList.add(new az2());
            arrayList.add(new smr());
        } else if (m9233Q0()) {
            arrayList.add(new az2());
        } else {
            arrayList2.add(new az2());
        }
        if (m9202O0()) {
            arrayList.add(new sx2());
        } else {
            arrayList2.add(new sx2());
        }
        if (m9232P0()) {
            arrayList.add(new yx2());
        } else {
            arrayList2.add(new yx2());
        }
        if (!vwb.J(arrayList)) {
            arrayList.add(0, new exb());
        }
        if (!vwb.J(arrayList2)) {
            arrayList2.add(0, new yy50());
            arrayList2.add(0, new dze());
            arrayList.addAll(arrayList2);
        }
        if (m9233Q0()) {
            arrayList.add(new dze());
            arrayList.add(new k960());
            arrayList.add(new dsj0());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N0 */
    public void m9231N0(String str) {
        pv6.s3(str).subscribe(mkd0.m9875H(new e30() { // from class: l.rd20
            public final void call(Object obj) {
                this.f4073a.m9236U0((roj0) obj);
            }
        }, new e30() { // from class: l.sd20
            public final void call(Object obj) {
                this.f4133a.m9237V0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P0 */
    public final boolean m9232P0() {
        return NullChecker.a(this.f2762a.mobile) && NullChecker.a(this.f2762a.thirdparty) && this.f2762a.thirdparty.google;
    }

    /* JADX INFO: renamed from: Q0 */
    public final boolean m9233Q0() {
        return NullChecker.a(this.f2762a.mobile) && !TextUtils.isEmpty(this.f2762a.mobile.mobileNumber);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m9234R0(roj0 roj0Var) {
        zvf0.D("e_intl_account_add_google_result", ((oe20) this.viewModel).act().pageId(), new j760[]{j760.a("add_result", "success")});
        osi0.f(R.string.q4);
        m9243e1();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.app.Activity, com.p1.mobile.android.app.Act] */
    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m9235S0(Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            yij0.D(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 400152 || i == 400153) {
            final ?? Act = act();
            Act.runOnUiThread(new Runnable() { // from class: l.md20
                @Override // java.lang.Runnable
                public final void run() {
                    Act act = Act;
                    new dd80.C0522a(act).m8982y0(act.getString(R.string.B1)).m8977t0(String.format(act.getString(R.string.A1), "Google")).m8960c0(act.getString(R.string.t1), new Runnable() { // from class: l.nd20
                        @Override // java.lang.Runnable
                        public final void run() {
                            ge20.m9208h0();
                        }
                    }).m8947P(false).m8975r0();
                }
            });
        }
        zvf0.D("e_intl_account_add_google_result", ((oe20) this.viewModel).act().pageId(), new j760[]{j760.a("add_result", "fail")});
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m9236U0(roj0 roj0Var) {
        w85.INSTANCE.m("Delete account", (Map) null);
        lsi0.m9850x(R.string.c2, false);
        User userMe_ = CoreModule.K().me_();
        if (NullChecker.a(userMe_) && TEnum.equals(userMe_.source, "google")) {
            com.google.android.gms.auth.api.signin.a.a(m9552Y(), new GoogleSignInOptions.a(GoogleSignInOptions.DEFAULT_SIGN_IN).b().d("218526224262-usliqg20cepnb3ql98amgeum18v8uatv.apps.googleusercontent.com").a()).c();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m9237V0(Throwable th) {
        act().progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m9238W0(CommonData commonData) {
        this.f2762a = commonData;
        ((oe20) this.viewModel).m10208j();
    }

    @Override // p007l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo8872a0() {
        duringCreated(mkd0.m9903r(CoreModule.K().me().distinctUntilChanged(), this.f2763b, new x9j() { // from class: l.ld20
            public final Object call(Object obj, Object obj2) {
                return ge20.m9213m0((User) obj, (roj0) obj2);
            }
        }).switchMap(new w9j() { // from class: l.td20
            public final Object call(Object obj) {
                return CoreModule.c.a0.r3();
            }
        })).subscribe(mkd0.m9875H(new e30() { // from class: l.ud20
            public final void call(Object obj) {
                this.f4893a.m9238W0((CommonData) obj);
            }
        }, new e30() { // from class: l.vd20
            public final void call(Object obj) {
                ge20.m9211k0((Throwable) obj);
            }
        }));
        duringCreated(lifecycle().filter(new w9j() { // from class: l.wd20
            public final Object call(Object obj) {
                return Boolean.valueOf(((C0231c) obj) == C0231c.f1247i);
            }
        })).subscribe(new e30() { // from class: l.xd20
            public final void call(Object obj) {
                this.f5288a.m9203X0((C0231c) obj);
            }
        });
        duringCreated((c) C0532eq.f2628c).subscribe(mkd0.m9875H(new e30() { // from class: l.yd20
            public final void call(Object obj) {
                this.f5428a.m9204Y0((roj0) obj);
            }
        }, new e30() { // from class: l.zd20
            public final void call(Object obj) {
                ge20.m9210j0((Throwable) obj);
            }
        }));
        this.f2764c = c84.b.a();
        bzv.m().y(this.f2764c, new C0550a());
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m9239a1(Act act, String str, View view) {
        act.duringCreated(qib0.b0.a.mp(str)).subscribe(mkd0.m9875H(new e30() { // from class: l.qd20
            public final void call(Object obj) {
                this.f3853a.m9240b1((roj0) obj);
            }
        }, new yaf0()));
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m9240b1(roj0 roj0Var) {
        m9243e1();
        osi0.f(R.string.r4);
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m9241c1() {
        return !TextUtils.isEmpty(m9201J0());
    }

    /* JADX INFO: renamed from: d1 */
    public void m9242d1(int i, int i2, Intent intent) {
        if (i == 9002) {
            m9228H0(intent);
        }
        if (NullChecker.a(this.f2764c)) {
            this.f2764c.a(i, i2, intent);
        }
        if (i == 786 && i2 == 0 && NullChecker.a(AccessToken.d())) {
            bzv.m().u();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public void m9243e1() {
        this.f2763b.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: f1 */
    public void m9244f1(boolean z, String str, final String str2) {
        final PutongAct putongActM10205e = ((oe20) this.viewModel).act();
        if (z) {
            new xh0.C0776a(((oe20) this.viewModel).act()).m11820s(String.format(putongActM10205e.getString(R.string.F1), str)).m11811j(putongActM10205e.getString(R.string.E1)).m11819r(putongActM10205e.getString(R.string.D1)).m11807f(putongActM10205e.getString(R.string.C1)).m11803b(true).m11809h(false).m11816o(new View.OnClickListener() { // from class: l.pd20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f3717a.m9239a1(putongActM10205e, str2, view);
                }
            }).m11802a().m11801g();
        } else {
            new dd80.C0522a(putongActM10205e).m8982y0(putongActM10205e.getString(R.string.v1)).m8977t0(putongActM10205e.getString(R.string.u1)).m8960c0(putongActM10205e.getString(R.string.t1), new Runnable() { // from class: l.od20
                @Override // java.lang.Runnable
                public final void run() {
                    ge20.m9214n0();
                }
            }).m8947P(false).m8975r0();
        }
    }

    @Override // p007l.q0m
    public void destroy() {
    }
}
