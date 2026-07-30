package p149l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.core.glcore.util.ErrorCode;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.auth.api.signin.C2081a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.api.api.FacebookApi;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.account.NewAccountSecureAct;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Mobile;
import com.p046p1.mobile.putong.data.PhoneNumber;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Marker;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes8.dex */
public class ge20 extends jq2<oe20> {

    /* JADX INFO: renamed from: a */
    public CommonData f102150a;

    /* JADX INFO: renamed from: b */
    public final C22392a<roj0> f102151b;

    /* JADX INFO: renamed from: c */
    public c84 f102152c;

    /* JADX INFO: renamed from: d */
    public AccessToken f102153d;

    /* JADX INFO: renamed from: l.ge20$a */
    public class C17063a implements fuf<czv> {
        public C17063a() {
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m125656c() {
        }

        @Override // p149l.fuf
        /* JADX INFO: renamed from: a */
        public void mo50769a(FacebookException facebookException) {
            FacebookApi.m29530m(facebookException);
            zvf0.m220371D("e_intl_account_add_facebook_result", ((oe20) ge20.this.viewModel).getAct().pageId(), j760.m140076a("add_result", "fail"));
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m125659f(roj0 roj0Var) {
            zvf0.m220371D("e_intl_account_add_facebook_result", ((oe20) ge20.this.viewModel).getAct().pageId(), j760.m140076a("add_result", "success"));
            osi0.m165782f(R$string.f27916q4);
            ge20.this.m125653e1();
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m125660g(Throwable th) {
            if (th instanceof TantanException.Client.AccountService) {
                int i = ((TantanException.Client.AccountService) th).code;
                if (i == 400152 || i == 400153) {
                    final Act act = ge20.this.act();
                    act.runOnUiThread(new Runnable() { // from class: l.ee20
                        @Override // java.lang.Runnable
                        public final void run() {
                            Act act2 = act;
                            new dd80.C16336a(act2).m110996y0(act2.getString(R$string.f27688B1)).m110991t0(String.format(act2.getString(R$string.f27682A1), "Facebook")).m110974c0(act2.getString(R$string.f27931t1), new Runnable() { // from class: l.fe20
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ge20.C17063a.m125656c();
                                }
                            }).m110961P(false).m110989r0();
                        }
                    });
                }
                zvf0.m220371D("e_intl_account_add_facebook_result", ((oe20) ge20.this.viewModel).getAct().pageId(), j760.m140076a("add_result", "fail"));
            }
        }

        @Override // p149l.fuf
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onSuccess(czv czvVar) {
            ge20.this.f102153d = czvVar.getAccessToken();
            if (NullChecker.m81303a(ge20.this.f102153d)) {
                ge20.this.act().duringCreated(qib0.f154713b0.f139230a.mo28154Jm("facebook", ge20.this.f102153d.getUserId(), ge20.this.f102153d.getToken(), "")).subscribe(mkd0.m154956H(new e30() { // from class: l.ce20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f80433a.m125659f((roj0) obj);
                    }
                }, new e30() { // from class: l.de20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f85697a.m125660g((Throwable) obj);
                    }
                }));
            }
        }

        @Override // p149l.fuf
        public void onCancel() {
            zvf0.m220371D("e_intl_account_add_facebook_result", ((oe20) ge20.this.viewModel).getAct().pageId(), j760.m140076a("add_result", "fail"));
        }
    }

    public ge20(mcr mcrVar) {
        super(mcrVar);
        this.f102151b = C22392a.m221512b();
    }

    /* JADX INFO: renamed from: J0 */
    public static String m125611J0() {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        Settings settings = userM169520na.settings;
        if (settings == null || TextUtils.isEmpty(settings.linkedPhoneNumber.number)) {
            return "";
        }
        return Marker.ANY_NON_NULL_MARKER + userM169520na.settings.linkedPhoneNumber.countryCode + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C19604qy.m177017a(userM169520na.settings.linkedPhoneNumber.number);
    }

    /* JADX INFO: renamed from: O0 */
    private boolean m125612O0() {
        return !TextUtils.isEmpty(this.f102150a.email);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m125613X0(C4319c c4319c) {
        m125653e1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public /* synthetic */ void m125614Y0(roj0 roj0Var) {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m125618h0() {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m125620j0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m125621k0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ User m125623m0(User user, roj0 roj0Var) {
        return user;
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m125624n0() {
    }

    /* JADX INFO: renamed from: E0 */
    public void m125635E0() {
        bzv.m104655m().m104682u();
        bzv.m104655m().m104681t(act(), FacebookApi.f17152d);
    }

    /* JADX INFO: renamed from: F0 */
    public void m125636F0() {
        ((oe20) this.viewModel).m163788i(true);
        p4k p4kVarM12441a = C2081a.m12441a(m142773Y(), new GoogleSignInOptions.C2080a(GoogleSignInOptions.DEFAULT_SIGN_IN).m12434b().m12436d("218526224262-usliqg20cepnb3ql98amgeum18v8uatv.apps.googleusercontent.com").m12433a());
        p4kVarM12441a.m167392d();
        act().startActivityForResult(p4kVarM12441a.m167390b(), ErrorCode.DECODE_VIDEO_INIT_MUXER_FAILED);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m125637G0(String str, String str2, String str3) {
        act().duringCreated(qib0.f154713b0.f139230a.mo28154Jm("google", str, str2, str3)).subscribe(mkd0.m154956H(new e30() { // from class: l.ae20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68986a.m125644R0((roj0) obj);
            }
        }, new e30() { // from class: l.be20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75100a.m125645S0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H0 */
    public final void m125638H0(Intent intent) throws Throwable {
        try {
            GoogleSignInAccount googleSignInAccountMo15374m = C2081a.m12442b(intent).mo15374m(ApiException.class);
            ((oe20) this.viewModel).m163788i(false);
            m125637G0(googleSignInAccountMo15374m.m12406g0(), googleSignInAccountMo15374m.m12407h0(), googleSignInAccountMo15374m.m12403H());
        } catch (ApiException e) {
            if (e.getStatusCode() != 12501) {
                lsi0.m151578h(R$string.f27721H0);
            }
            ((oe20) this.viewModel).m163788i(false);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public CommonData m125639I0() {
        if (this.f102150a == null) {
            User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
            CommonData commonDataNew_ = CommonData.new_();
            this.f102150a = commonDataNew_;
            commonDataNew_.mobile = Mobile.new_();
            Mobile mobile = this.f102150a.mobile;
            PhoneNumber phoneNumber = userM169520na.settings.phoneNumber;
            mobile.mobileNumber = phoneNumber.number;
            mobile.countryCode = phoneNumber.countryCode;
        }
        return this.f102150a;
    }

    /* JADX INFO: renamed from: L0 */
    public List<ez2> m125640L0() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (m125651c1()) {
            arrayList.add(new az2());
            arrayList.add(new smr());
        } else if (m125643Q0()) {
            arrayList.add(new az2());
        } else {
            arrayList2.add(new az2());
        }
        if (m125612O0()) {
            arrayList.add(new sx2());
        } else {
            arrayList2.add(new sx2());
        }
        if (m125642P0()) {
            arrayList.add(new yx2());
        } else {
            arrayList2.add(new yx2());
        }
        if (!vwb.m200296J(arrayList)) {
            arrayList.add(0, new exb());
        }
        if (!vwb.m200296J(arrayList2)) {
            arrayList2.add(0, new yy50());
            arrayList2.add(0, new dze());
            arrayList.addAll(arrayList2);
        }
        if (m125643Q0()) {
            arrayList.add(new dze());
            arrayList.add(new k960());
            arrayList.add(new dsj0());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N0 */
    public void m125641N0(String str) {
        pv6.m171560s3(str).subscribe(mkd0.m154956H(new e30() { // from class: l.rd20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158857a.m125646U0((roj0) obj);
            }
        }, new e30() { // from class: l.sd20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163800a.m125647V0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P0 */
    public final boolean m125642P0() {
        return NullChecker.m81303a(this.f102150a.mobile) && NullChecker.m81303a(this.f102150a.thirdparty) && this.f102150a.thirdparty.google;
    }

    /* JADX INFO: renamed from: Q0 */
    public final boolean m125643Q0() {
        return NullChecker.m81303a(this.f102150a.mobile) && !TextUtils.isEmpty(this.f102150a.mobile.mobileNumber);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m125644R0(roj0 roj0Var) {
        zvf0.m220371D("e_intl_account_add_google_result", ((oe20) this.viewModel).getAct().pageId(), j760.m140076a("add_result", "success"));
        osi0.m165782f(R$string.f27916q4);
        m125653e1();
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m125645S0(Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            yij0.m214926D(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 400152 || i == 400153) {
            final Act act = act();
            act.runOnUiThread(new Runnable() { // from class: l.md20
                @Override // java.lang.Runnable
                public final void run() {
                    Act act2 = act;
                    new dd80.C16336a(act2).m110996y0(act2.getString(R$string.f27688B1)).m110991t0(String.format(act2.getString(R$string.f27682A1), ThirdPushManager.VENDOR_TYPE_FCM)).m110974c0(act2.getString(R$string.f27931t1), new Runnable() { // from class: l.nd20
                        @Override // java.lang.Runnable
                        public final void run() {
                            ge20.m125618h0();
                        }
                    }).m110961P(false).m110989r0();
                }
            });
        }
        zvf0.m220371D("e_intl_account_add_google_result", ((oe20) this.viewModel).getAct().pageId(), j760.m140076a("add_result", "fail"));
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m125646U0(roj0 roj0Var) {
        w85.INSTANCE.m202145m("Delete account", null);
        lsi0.m151594x(R$string.f27830c2, false);
        User userMe_ = CoreModule.m29932K().me_();
        if (NullChecker.m81303a(userMe_) && TEnum.equals(userMe_.source, "google")) {
            C2081a.m12441a(m142773Y(), new GoogleSignInOptions.C2080a(GoogleSignInOptions.DEFAULT_SIGN_IN).m12434b().m12436d("218526224262-usliqg20cepnb3ql98amgeum18v8uatv.apps.googleusercontent.com").m12433a()).m167391c();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m125647V0(Throwable th) {
        act().progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m125648W0(CommonData commonData) {
        this.f102150a = commonData;
        ((oe20) this.viewModel).m163789j();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        duringCreated(mkd0.m154984r(CoreModule.m29932K().mo30795me().distinctUntilChanged(), this.f102151b, new x9j() { // from class: l.ld20
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return ge20.m125623m0((User) obj, (roj0) obj2);
            }
        }).switchMap(new w9j() { // from class: l.td20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19627a0.m171570r3();
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.ud20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175892a.m125648W0((CommonData) obj);
            }
        }, new e30() { // from class: l.vd20
            @Override // p149l.e30
            public final void call(Object obj) {
                ge20.m125621k0((Throwable) obj);
            }
        }));
        duringCreated(lifecycle().filter(new w9j() { // from class: l.wd20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        })).subscribe(new e30() { // from class: l.xd20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192292a.m125613X0((C4319c) obj);
            }
        });
        duringCreated(C16665eq.f92732c).subscribe(mkd0.m154956H(new e30() { // from class: l.yd20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197516a.m125614Y0((roj0) obj);
            }
        }, new e30() { // from class: l.zd20
            @Override // p149l.e30
            public final void call(Object obj) {
                ge20.m125620j0((Throwable) obj);
            }
        }));
        this.f102152c = c84.C16094b.m105650a();
        bzv.m104655m().m104685y(this.f102152c, new C17063a());
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m125649a1(Act act, String str, View view) {
        act.duringCreated(qib0.f154713b0.f139230a.mo28169mp(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.qd20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153862a.m125650b1((roj0) obj);
            }
        }, new yaf0()));
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m125650b1(roj0 roj0Var) {
        m125653e1();
        osi0.m165782f(R$string.f27922r4);
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m125651c1() {
        return !TextUtils.isEmpty(m125611J0());
    }

    /* JADX INFO: renamed from: d1 */
    public void m125652d1(int i, int i2, Intent intent) {
        if (i == 9002) {
            m125638H0(intent);
        }
        if (NullChecker.m81303a(this.f102152c)) {
            this.f102152c.mo8661a(i, i2, intent);
        }
        if (i == 786 && i2 == 0 && NullChecker.m81303a(AccessToken.m7408d())) {
            bzv.m104655m().m104682u();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public void m125653e1() {
        this.f102151b.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: f1 */
    public void m125654f1(boolean z, String str, final String str2) {
        final NewAccountSecureAct newAccountSecureActM163786e = ((oe20) this.viewModel).getAct();
        if (z) {
            new xh0.C21150a(((oe20) this.viewModel).getAct()).m208740s(String.format(newAccountSecureActM163786e.getString(R$string.f27712F1), str)).m208731j(newAccountSecureActM163786e.getString(R$string.f27706E1)).m208739r(newAccountSecureActM163786e.getString(R$string.f27700D1)).m208727f(newAccountSecureActM163786e.getString(R$string.f27694C1)).m208723b(true).m208729h(false).m208736o(new View.OnClickListener() { // from class: l.pd20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f148253a.m125649a1(newAccountSecureActM163786e, str2, view);
                }
            }).m208722a().m208721g();
        } else {
            new dd80.C16336a(newAccountSecureActM163786e).m110996y0(newAccountSecureActM163786e.getString(R$string.f27943v1)).m110991t0(newAccountSecureActM163786e.getString(R$string.f27937u1)).m110974c0(newAccountSecureActM163786e.getString(R$string.f27931t1), new Runnable() { // from class: l.od20
                @Override // java.lang.Runnable
                public final void run() {
                    ge20.m125624n0();
                }
            }).m110961P(false).m110989r0();
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
