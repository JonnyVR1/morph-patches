package p153l;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.core.glcore.util.ErrorCode;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.auth.api.signin.C2104a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.api.api.FacebookApi;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.account.NewAccountSecureAct;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Mobile;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Marker;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class qm20 extends ar2<ym20> {

    /* JADX INFO: renamed from: a */
    public CommonData f158293a;

    /* JADX INFO: renamed from: b */
    public final C22507a<uxj0> f158294b;

    /* JADX INFO: renamed from: c */
    public b94 f158295c;

    /* JADX INFO: renamed from: d */
    public AccessToken f158296d;

    /* JADX INFO: renamed from: l.qm20$a */
    public class C19597a implements tvf<a1w> {
        public C19597a() {
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m177065c() {
        }

        @Override // p153l.tvf
        /* JADX INFO: renamed from: a */
        public void mo51952a(FacebookException facebookException) {
            FacebookApi.m30528m(facebookException);
            i4g0.m138495D("e_intl_account_add_facebook_result", ((ym20) qm20.this.viewModel).getAct().pageId(), pf60.m172085a("add_result", "fail"));
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m177068f(uxj0 uxj0Var) {
            i4g0.m138495D("e_intl_account_add_facebook_result", ((ym20) qm20.this.viewModel).getAct().pageId(), pf60.m172085a("add_result", "success"));
            r1j0.m179419f(R$string.f28764q4);
            qm20.this.m177062e1();
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m177069g(Throwable th) {
            if (th instanceof TantanException.Client.AccountService) {
                int i = ((TantanException.Client.AccountService) th).code;
                if (i == 400152 || i == 400153) {
                    final Act act = qm20.this.act();
                    act.runOnUiThread(new Runnable() { // from class: l.om20
                        @Override // java.lang.Runnable
                        public final void run() {
                            Act act2 = act;
                            new jl80.C17971a(act2).m146056y0(act2.getString(R$string.f28536B1)).m146051t0(String.format(act2.getString(R$string.f28530A1), "Facebook")).m146034c0(act2.getString(R$string.f28779t1), new Runnable() { // from class: l.pm20
                                @Override // java.lang.Runnable
                                public final void run() {
                                    qm20.C19597a.m177065c();
                                }
                            }).m146021P(false).m146049r0();
                        }
                    });
                }
                i4g0.m138495D("e_intl_account_add_facebook_result", ((ym20) qm20.this.viewModel).getAct().pageId(), pf60.m172085a("add_result", "fail"));
            }
        }

        @Override // p153l.tvf
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onSuccess(a1w a1wVar) {
            qm20.this.f158296d = a1wVar.getAccessToken();
            if (NullChecker.m82486a(qm20.this.f158296d)) {
                qm20.this.act().duringCreated(uqb0.f180396b0.f170324a.mo29153Jm("facebook", qm20.this.f158296d.getUserId(), qm20.this.f158296d.getToken(), "")).subscribe(psd0.m173597H(new y20() { // from class: l.mm20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f137465a.m177068f((uxj0) obj);
                    }
                }, new y20() { // from class: l.nm20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f142614a.m177069g((Throwable) obj);
                    }
                }));
            }
        }

        @Override // p153l.tvf
        public void onCancel() {
            i4g0.m138495D("e_intl_account_add_facebook_result", ((ym20) qm20.this.viewModel).getAct().pageId(), pf60.m172085a("add_result", "fail"));
        }
    }

    public qm20(ner nerVar) {
        super(nerVar);
        this.f158294b = C22507a.m222758b();
    }

    /* JADX INFO: renamed from: J0 */
    public static String m177020J0() {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        Settings settings = userM116593na.settings;
        if (settings == null || TextUtils.isEmpty(settings.linkedPhoneNumber.number)) {
            return "";
        }
        return Marker.ANY_NON_NULL_MARKER + userM116593na.settings.linkedPhoneNumber.countryCode + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + C18296ky.m151902a(userM116593na.settings.linkedPhoneNumber.number);
    }

    /* JADX INFO: renamed from: O0 */
    private boolean m177021O0() {
        return !TextUtils.isEmpty(this.f158293a.email);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m177022X0(C4470c c4470c) {
        m177062e1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public /* synthetic */ void m177023Y0(uxj0 uxj0Var) {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m177027h0() {
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m177029j0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m177030k0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ User m177032m0(User user, uxj0 uxj0Var) {
        return user;
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m177033n0() {
    }

    /* JADX INFO: renamed from: E0 */
    public void m177044E0() {
        z0w.m218186m().m218213u();
        z0w.m218186m().m218212t(act(), FacebookApi.f17871d);
    }

    /* JADX INFO: renamed from: F0 */
    public void m177045F0() {
        ((ym20) this.viewModel).m216661i(true);
        h7k h7kVarM12495a = C2104a.m12495a(m99640Y(), new GoogleSignInOptions.C2103a(GoogleSignInOptions.DEFAULT_SIGN_IN).m12488b().m12490d("218526224262-usliqg20cepnb3ql98amgeum18v8uatv.apps.googleusercontent.com").m12487a());
        h7kVarM12495a.m133801d();
        act().startActivityForResult(h7kVarM12495a.m133799b(), ErrorCode.DECODE_VIDEO_INIT_MUXER_FAILED);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m177046G0(String str, String str2, String str3) {
        act().duringCreated(uqb0.f180396b0.f170324a.mo29153Jm("google", str, str2, str3)).subscribe(psd0.m173597H(new y20() { // from class: l.km20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127432a.m177053R0((uxj0) obj);
            }
        }, new y20() { // from class: l.lm20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132647a.m177054S0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H0 */
    public final void m177047H0(Intent intent) throws Throwable {
        try {
            GoogleSignInAccount googleSignInAccountMo15428m = C2104a.m12496b(intent).mo15428m(ApiException.class);
            ((ym20) this.viewModel).m216661i(false);
            m177046G0(googleSignInAccountMo15428m.m12460h0(), googleSignInAccountMo15428m.m12461i0(), googleSignInAccountMo15428m.m12457H());
        } catch (ApiException e) {
            if (e.getStatusCode() != 12501) {
                o1j0.m165634h(R$string.f28569H0);
            }
            ((ym20) this.viewModel).m216661i(false);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public CommonData m177048I0() {
        if (this.f158293a == null) {
            User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
            CommonData commonDataNew_ = CommonData.new_();
            this.f158293a = commonDataNew_;
            commonDataNew_.mobile = Mobile.new_();
            Mobile mobile = this.f158293a.mobile;
            PhoneNumber phoneNumber = userM116593na.settings.phoneNumber;
            mobile.mobileNumber = phoneNumber.number;
            mobile.countryCode = phoneNumber.countryCode;
        }
        return this.f158293a;
    }

    /* JADX INFO: renamed from: L0 */
    public List<tz2> m177049L0() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (m177060c1()) {
            arrayList.add(new pz2());
            arrayList.add(new tor());
        } else if (m177052Q0()) {
            arrayList.add(new pz2());
        } else {
            arrayList2.add(new pz2());
        }
        if (m177021O0()) {
            arrayList.add(new hy2());
        } else {
            arrayList2.add(new hy2());
        }
        if (m177051P0()) {
            arrayList.add(new ny2());
        } else {
            arrayList2.add(new ny2());
        }
        if (!jyb.m147479J(arrayList)) {
            arrayList.add(0, new syb());
        }
        if (!jyb.m147479J(arrayList2)) {
            arrayList2.add(0, new d760());
            arrayList2.add(0, new h0f());
            arrayList.addAll(arrayList2);
        }
        if (m177052Q0()) {
            arrayList.add(new h0f());
            arrayList.add(new ph60());
            arrayList.add(new h1k0());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N0 */
    public void m177050N0(String str) {
        sw6.m188256s3(str).subscribe(psd0.m173597H(new y20() { // from class: l.bm20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77235a.m177055U0((uxj0) obj);
            }
        }, new y20() { // from class: l.cm20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82506a.m177056V0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P0 */
    public final boolean m177051P0() {
        return NullChecker.m82486a(this.f158293a.mobile) && NullChecker.m82486a(this.f158293a.thirdparty) && this.f158293a.thirdparty.google;
    }

    /* JADX INFO: renamed from: Q0 */
    public final boolean m177052Q0() {
        return NullChecker.m82486a(this.f158293a.mobile) && !TextUtils.isEmpty(this.f158293a.mobile.mobileNumber);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m177053R0(uxj0 uxj0Var) {
        i4g0.m138495D("e_intl_account_add_google_result", ((ym20) this.viewModel).getAct().pageId(), pf60.m172085a("add_result", "success"));
        r1j0.m179419f(R$string.f28764q4);
        m177062e1();
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m177054S0(Throwable th) {
        if (!(th instanceof TantanException.Client.AccountService)) {
            bsj0.m106246D(th);
            return;
        }
        int i = ((TantanException.Client.AccountService) th).code;
        if (i == 400152 || i == 400153) {
            final Act act = act();
            act.runOnUiThread(new Runnable() { // from class: l.wl20
                @Override // java.lang.Runnable
                public final void run() {
                    Act act2 = act;
                    new jl80.C17971a(act2).m146056y0(act2.getString(R$string.f28536B1)).m146051t0(String.format(act2.getString(R$string.f28530A1), ThirdPushManager.VENDOR_TYPE_FCM)).m146034c0(act2.getString(R$string.f28779t1), new Runnable() { // from class: l.xl20
                        @Override // java.lang.Runnable
                        public final void run() {
                            qm20.m177027h0();
                        }
                    }).m146021P(false).m146049r0();
                }
            });
        }
        i4g0.m138495D("e_intl_account_add_google_result", ((ym20) this.viewModel).getAct().pageId(), pf60.m172085a("add_result", "fail"));
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m177055U0(uxj0 uxj0Var) {
        x95.INSTANCE.m209793m("Delete account", null);
        o1j0.m165650x(R$string.f28678c2, false);
        User userMe_ = CoreModule.m30930K().me_();
        if (NullChecker.m82486a(userMe_) && TEnum.equals(userMe_.source, "google")) {
            C2104a.m12495a(m99640Y(), new GoogleSignInOptions.C2103a(GoogleSignInOptions.DEFAULT_SIGN_IN).m12488b().m12490d("218526224262-usliqg20cepnb3ql98amgeum18v8uatv.apps.googleusercontent.com").m12487a()).m133800c();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m177056V0(Throwable th) {
        act().progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m177057W0(CommonData commonData) {
        this.f158293a = commonData;
        ((ym20) this.viewModel).m216662j();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        duringCreated(psd0.m173625r(CoreModule.m30930K().mo31798me().distinctUntilChanged(), this.f158294b, new rcj() { // from class: l.vl20
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return qm20.m177032m0((User) obj, (uxj0) obj2);
            }
        }).switchMap(new qcj() { // from class: l.dm20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20369a0.m188266r3();
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.em20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94613a.m177057W0((CommonData) obj);
            }
        }, new y20() { // from class: l.fm20
            @Override // p153l.y20
            public final void call(Object obj) {
                qm20.m177030k0((Throwable) obj);
            }
        }));
        duringCreated(lifecycle().filter(new qcj() { // from class: l.gm20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        })).subscribe(new y20() { // from class: l.hm20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110571a.m177022X0((C4470c) obj);
            }
        });
        duringCreated(C21846zp.f205406c).subscribe(psd0.m173597H(new y20() { // from class: l.im20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115647a.m177023Y0((uxj0) obj);
            }
        }, new y20() { // from class: l.jm20
            @Override // p153l.y20
            public final void call(Object obj) {
                qm20.m177029j0((Throwable) obj);
            }
        }));
        this.f158295c = b94.C15949b.m103051a();
        z0w.m218186m().m218216y(this.f158295c, new C19597a());
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m177058a1(Act act, String str, View view) {
        act.duringCreated(uqb0.f180396b0.f170324a.mo29168mp(str)).subscribe(psd0.m173597H(new y20() { // from class: l.am20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72194a.m177059b1((uxj0) obj);
            }
        }, new fjf0()));
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m177059b1(uxj0 uxj0Var) {
        m177062e1();
        r1j0.m179419f(R$string.f28770r4);
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m177060c1() {
        return !TextUtils.isEmpty(m177020J0());
    }

    /* JADX INFO: renamed from: d1 */
    public void m177061d1(int i, int i2, Intent intent) {
        if (i == 9002) {
            m177047H0(intent);
        }
        if (NullChecker.m82486a(this.f158295c)) {
            this.f158295c.mo8715a(i, i2, intent);
        }
        if (i == 786 && i2 == 0 && NullChecker.m82486a(AccessToken.m7462d())) {
            z0w.m218186m().m218213u();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public void m177062e1() {
        this.f158294b.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: f1 */
    public void m177063f1(boolean z, String str, final String str2) {
        final NewAccountSecureAct newAccountSecureActM216659e = ((ym20) this.viewModel).getAct();
        if (z) {
            new th0.C20312a(((ym20) this.viewModel).getAct()).m191160s(String.format(newAccountSecureActM216659e.getString(R$string.f28560F1), str)).m191151j(newAccountSecureActM216659e.getString(R$string.f28554E1)).m191159r(newAccountSecureActM216659e.getString(R$string.f28548D1)).m191147f(newAccountSecureActM216659e.getString(R$string.f28542C1)).m191143b(true).m191149h(false).m191156o(new View.OnClickListener() { // from class: l.zl20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f204876a.m177058a1(newAccountSecureActM216659e, str2, view);
                }
            }).m191142a().m191141g();
        } else {
            new jl80.C17971a(newAccountSecureActM216659e).m146056y0(newAccountSecureActM216659e.getString(R$string.f28791v1)).m146051t0(newAccountSecureActM216659e.getString(R$string.f28785u1)).m146034c0(newAccountSecureActM216659e.getString(R$string.f28779t1), new Runnable() { // from class: l.yl20
                @Override // java.lang.Runnable
                public final void run() {
                    qm20.m177033n0();
                }
            }).m146021P(false).m146049r0();
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
