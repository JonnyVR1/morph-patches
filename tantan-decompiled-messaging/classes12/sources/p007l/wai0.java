package p007l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.data.Data;
import com.p000p1.mobile.putong.data.Device;
import com.p000p1.mobile.putong.data.SearchPriority;
import com.p000p1.mobile.putong.data.SliderData;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.VerificationToken;
import com.p000p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.facertification.RxFacertification;
import com.p000p1.mobile.putong.facertification.TTFacertificationClient;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.data.VerificationCoreEnvelope;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.p1.mobile.putong.ui.webview.WebViewDialogAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import kotlin.Unit;
import l.e30;
import l.e400;
import l.e51;
import l.f400;
import l.ia20;
import l.jo0;
import l.kwk0;
import l.lsi0;
import l.mkd0;
import l.o6j0;
import l.qib0;
import l.qp4;
import l.roj0;
import l.rp8;
import l.tvf;
import l.utc0;
import l.uvf;
import l.v9j;
import l.vjf0;
import l.vvf;
import l.vwb;
import l.w9j;
import l.wvf;
import l.xh5;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class wai0 extends e400 {

    /* JADX INFO: renamed from: l.wai0$a */
    public class C2529a implements TTFacertificationClient.InterfaceC1574a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ JSONObject f14492a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ f400 f14493b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f14494c;

        public C2529a(JSONObject jSONObject, f400 f400Var, String str) {
            this.f14492a = jSONObject;
            this.f14493b = f400Var;
            this.f14494c = str;
        }

        @Override // com.p000p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC1574a
        /* JADX INFO: renamed from: a */
        public void mo222a(VerificationToken verificationToken, RxFacertification.PreDetectException preDetectException) {
            vvf vvfVar = preDetectException.prepareResult;
            if (verificationToken.isTencentProvider()) {
                if (tvf.k(this.f14493b.c(), vvfVar.c, this.f14494c, 2)) {
                    return;
                }
                kwk0.P(this.f14493b.c(), vvfVar.c);
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", User.ID_TEAM_ACCOUNT);
                } catch (JSONException unused) {
                }
                o6j0.n("e_verification_scanface_sdk", "p_profile_picture_verification_pageShow", new o6j0.a[]{o6j0.a.h("sdk_name", verificationToken.provider), o6j0.a.h("verification_result_code", vvfVar.c), o6j0.a.h("verification_type", TextUtils.equals(verificationToken.verifyType, "identity") ? "id_ability" : "avatar_ability"), o6j0.a.h("verification_scene", "change_bind_new_phone")});
                wai0.this.z(this.f14492a, jSONObject.toString());
            }
        }

        @Override // com.p000p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC1574a
        /* JADX INFO: renamed from: b */
        public void mo223b(VerificationToken verificationToken) {
            o6j0.n("e_verification_scanface_token", "p_profile_picture_verification_pageShow", new o6j0.a[]{o6j0.a.h("sdk_name", verificationToken.provider), o6j0.a.f("verification_result_code", 0), o6j0.a.h("verification_type", TextUtils.equals(verificationToken.verifyType, "identity") ? "id_ability" : "avatar_ability"), o6j0.a.h("verification_scene", "change_bind_new_phone")});
        }

        @Override // com.p000p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC1574a
        /* JADX INFO: renamed from: c */
        public void mo224c(VerificationToken verificationToken, vvf vvfVar) {
            o6j0.n("e_verification_scanface_sdk", "p_profile_picture_verification_pageShow", new o6j0.a[]{o6j0.a.h("sdk_name", verificationToken.provider), o6j0.a.f("verification_result_code", 0), o6j0.a.h("verification_type", TextUtils.equals(verificationToken.verifyType, "identity") ? "id_ability" : "avatar_ability"), o6j0.a.h("verification_scene", "change_bind_new_phone")});
        }

        @Override // com.p000p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC1574a
        /* JADX INFO: renamed from: d */
        public void mo225d(Throwable th) {
            JSONObject jSONObject = new JSONObject();
            o6j0.n("e_verification_scanface_token", "p_profile_picture_verification_pageShow", new o6j0.a[]{o6j0.a.h("sdk_name", ""), o6j0.a.h("verification_result_code", String.valueOf(((TantanException.Client.CoreService) th).code)), o6j0.a.h("verification_type", ""), o6j0.a.h("verification_scene", "change_bind_new_phone")});
            try {
                jSONObject.put("code", "300003");
            } catch (JSONException unused) {
            }
            wai0.this.z(this.f14492a, jSONObject.toString());
        }

        @Override // com.p000p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC1574a
        /* JADX INFO: renamed from: e */
        public void mo226e(VerificationToken verificationToken) {
            this.f14493b.c().setResult(-1);
            this.f14493b.c().finish();
        }
    }

    public wai0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m15770F(JSONObject jSONObject, f400 f400Var) {
        String strOptString = jSONObject.optString("retrieveId");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        qp4.l(f400Var.c(), "fromAccountBackH5", strOptString);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ c m15772H(f400 f400Var, String str, JSONObject jSONObject, TTFacertificationClient.InterfaceC1574a interfaceC1574a, String str2, Unit unit) {
        try {
            System.loadLibrary("megface");
        } catch (Throwable unused) {
        }
        return TTFacertificationClient.m1119p().m1123A(f400Var.c(), str, VerificationTokenRequestParam.builder().setIdName(jSONObject.optString("idCardName")).setIdNumber(jSONObject.optString("idCardNumber")).useAccountBackTemplate(uvf.c(f400Var.c(), true), false, "", jSONObject.optString("productId"), jSONObject.optString("retrieveId")).build(), new rp8(), interfaceC1574a, str2);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m15773I(Throwable th) {
    }

    /* JADX INFO: renamed from: T */
    public void m15784T(final f400 f400Var, final JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        e51.M(new Runnable() { // from class: l.oai0
            @Override // java.lang.Runnable
            public final void run() {
                wai0.m15770F(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final c<VerificationCoreEnvelope> m15785U(String str) {
        final String strI = xh5.i("/users/me/verifications/" + str);
        return qib0.I.now("anchorVerification" + str, ia20.c(new v9j() { // from class: l.hai0
            public final Object call() {
                return xh5.network.auth().q(strI).f().b();
            }
        }, VerificationCoreEnvelope.JSON_ADAPTER));
    }

    @NonNull
    /* JADX INFO: renamed from: V */
    public final TTFacertificationClient.InterfaceC1574a m15786V(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        return new C2529a(jSONObject, f400Var, str);
    }

    /* JADX INFO: renamed from: W */
    public final void m15787W(@NonNull f400 f400Var, final JSONObject jSONObject) {
        e51.G(new Runnable() { // from class: l.rai0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12582a.m15790Z(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public void m15788X(final f400 f400Var, final JSONObject jSONObject) {
        e51.M(new Runnable() { // from class: l.pai0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11755a.m15792b0(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public final void m15789Y(f400 f400Var, final JSONObject jSONObject) {
        e51.G(new Runnable() { // from class: l.qai0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12182a.m15793c0(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m15790Z(JSONObject jSONObject) {
        if (NullChecker.a(jSONObject) && TextUtils.equals(jSONObject.optString("from"), "findPhonenumber")) {
            z(jSONObject, (String) vjf0.e().g.get());
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m15791a0(f400 f400Var, JSONObject jSONObject, String str, TTFacertificationClient.InterfaceC1574a interfaceC1574a, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (z) {
            m15801k0(f400Var, jSONObject, str, "fromAccountBackH5", interfaceC1574a);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("code", "300002");
        } catch (JSONException unused) {
        }
        z(jSONObject, jSONObject2.toString());
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m15792b0(final JSONObject jSONObject, final f400 f400Var) {
        String strOptString = jSONObject.optString("idCardName");
        String strOptString2 = jSONObject.optString("idCardNumber");
        String strOptString3 = jSONObject.optString("productId");
        String strOptString4 = jSONObject.optString("retrieveId");
        final String strOptString5 = jSONObject.optString("publicId");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3) || TextUtils.isEmpty(strOptString4) || TextUtils.isEmpty(strOptString5)) {
            return;
        }
        final TTFacertificationClient.InterfaceC1574a interfaceC1574aM15786V = m15786V(f400Var, "fromAccountBackH5", f400Var.c().string(R.string.g0), jSONObject);
        PermissionHelper.c().r(new String[]{"android.permission.CAMERA"}).w(false).u(true).l(new PermissionHelper.b() { // from class: l.vai0
            /* JADX INFO: renamed from: a */
            public final void m15401a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                this.f14128a.m15791a0(f400Var, jSONObject, strOptString5, interfaceC1574aM15786V, z, permissionDeniedReason);
            }
        }).i(f400Var.c());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m15793c0(JSONObject jSONObject) {
        int i;
        if (NullChecker.a(jSONObject)) {
            User userP9 = CoreModule.c.e0.p9();
            if (!NullChecker.a(userP9) || !NullChecker.a(userP9.settings) || !NullChecker.a(userP9.settings.verification) || !NullChecker.a(userP9.settings.verification.studies)) {
                i = 0;
            } else if (TEnum.equals(userP9.settings.verification.studies.status, "verified")) {
                i = 1;
            } else if (TEnum.equals(userP9.settings.verification.studies.status, "pending")) {
                i = 2;
            } else {
                i = 0;
            }
            z(jSONObject, String.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m15794d0(f400 f400Var, JSONObject jSONObject, VerificationToken verificationToken, JSONObject jSONObject2, VerificationCoreEnvelope verificationCoreEnvelope) {
        f400Var.c().progressDismiss();
        if (vwb.J(verificationCoreEnvelope.data.verificationCenter)) {
            try {
                jSONObject.put("code", User.ID_TEAM_ACCOUNT);
            } catch (JSONException unused) {
            }
        } else {
            try {
                jSONObject.put("code", verificationCoreEnvelope.meta.code);
                jSONObject.put(Data.TYPE, ((VerificationCenter) verificationCoreEnvelope.data.verificationCenter.get(0)).toJson());
            } catch (JSONException unused2) {
            }
            o6j0.n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", new o6j0.a[]{o6j0.a.h("sdk_name", verificationToken.provider), o6j0.a.f("verification_result_code", 0), o6j0.a.h("verification_type", TextUtils.equals(verificationToken.verifyType, "identity") ? "id_ability" : "avatar_ability"), o6j0.a.h("verification_scene", "change_bind_new_phone")});
        }
        z(jSONObject2, jSONObject.toString());
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m15795e0(JSONObject jSONObject, f400 f400Var, JSONObject jSONObject2, VerificationToken verificationToken, Throwable th) {
        try {
            if (th instanceof TantanException.Client.CoreService) {
                jSONObject.put("code", String.valueOf(((TantanException.Client.CoreService) th).code));
            } else {
                jSONObject.put("code", "300001");
            }
        } catch (JSONException unused) {
        }
        f400Var.c().progressDismiss();
        lsi0.y(f400Var.c().string(R.string.hr));
        z(jSONObject2, jSONObject.toString());
        o6j0.n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", new o6j0.a[]{o6j0.a.h("sdk_name", verificationToken.provider), o6j0.a.h("verification_result_code", String.valueOf(((TantanException.Client.CoreService) th).code)), o6j0.a.h("verification_type", TextUtils.equals(verificationToken.verifyType, "identity") ? "id_ability" : "avatar_ability"), o6j0.a.h("verification_scene", "change_bind_new_phone")});
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m15796f0(JSONObject jSONObject, Throwable th) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", User.ID_TEAM_ACCOUNT);
            z(jSONObject, jSONObject2.toString());
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m15797g0(f400 f400Var, String str, JSONObject jSONObject, RxFacertification.C1573b c1573b) {
        VerificationTokenRequestParam verificationTokenRequestParam = c1573b.f305c;
        if (verificationTokenRequestParam != null) {
            o6j0.n("e_verification_scanface_request", "p_profile_picture_verification_pageShow", new o6j0.a[]{o6j0.a.h("verification_type", TextUtils.equals(verificationTokenRequestParam.verifyType, "identity") ? "id_ability" : "avatar_ability"), o6j0.a.h("verification_scene", "change_bind_new_phone")});
        }
        m15800j0(f400Var, c1573b.f305c, str, c1573b, jSONObject);
        o6j0.n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", new o6j0.a[]{o6j0.a.h("sdk_name", c1573b.f304b.provider), o6j0.a.f("verification_result_code", 0), o6j0.a.h("verification_type", TextUtils.equals(c1573b.f304b.verifyType, "identity") ? "id_ability" : "avatar_ability"), o6j0.a.h("verification_scene", "change_bind_new_phone")});
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m15798h0(String str) {
        p().e("tantan_verification_getSlideSuccessData", new String[]{str});
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m15799i0(JSONObject jSONObject, f400 f400Var) {
        SliderData sliderDataNew_ = SliderData.new_();
        if (!NullChecker.a(jSONObject)) {
            z(jSONObject, "0");
            return;
        }
        sliderDataNew_.uuid = jSONObject.optString(Device.UUID);
        sliderDataNew_.supplier = jSONObject.optInt("supplier");
        sliderDataNew_.retryClose = jSONObject.optInt("retryClose");
        sliderDataNew_.delayClose = jSONObject.optInt("delayClose");
        sliderDataNew_.allowClose = jSONObject.optInt("allowClose");
        String strOptString = jSONObject.optString("projectType");
        vjf0.e().m.put(Boolean.TRUE);
        f400Var.c().duringCreated(vjf0.e().a).subscribe(mkd0.H(new e30() { // from class: l.tai0
            public final void call(Object obj) {
                this.f13248a.m15798h0((String) obj);
            }
        }, new e30() { // from class: l.uai0
            public final void call(Object obj) {
                wai0.m15773I((Throwable) obj);
            }
        }));
        if (TextUtils.equals(strOptString, "accountGetBackType")) {
            vjf0.e().w("accountGetBackType");
            if (ConnectivityReceiver.g()) {
                m15806o0(f400Var, sliderDataNew_);
                return;
            }
            return;
        }
        vjf0.e().v(sliderDataNew_);
        if (TextUtils.isEmpty(vjf0.e().k())) {
            return;
        }
        if (ConnectivityReceiver.g()) {
            m15805n0(f400Var, strOptString);
        } else {
            vjf0.e().z().onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m15800j0(@NonNull final f400 f400Var, VerificationTokenRequestParam verificationTokenRequestParam, String str, RxFacertification.C1573b c1573b, final JSONObject jSONObject) {
        final JSONObject jSONObject2 = new JSONObject();
        final VerificationToken verificationToken = c1573b.f304b;
        JSONObject jSONObject3 = new JSONObject();
        wvf wvfVar = c1573b.f303a;
        if (!wvfVar.h) {
            f400Var.c().progressDismiss();
            try {
                jSONObject2.put("code", wvfVar.b);
                jSONObject2.put(Data.TYPE, wvfVar.toString());
                z(jSONObject, jSONObject2.toString());
                return;
            } catch (JSONException unused) {
                return;
            }
        }
        try {
            if (verificationToken.isTencentProvider()) {
                jSONObject3.put("provider", "tencent");
                jSONObject3.put("orderNo", verificationToken.tencentToken.agreementNo);
                jSONObject3.put("publicUserId", verificationToken.tencentToken.userId);
                jSONObject3.put("providerAppId", TTFacertificationClient.m1120q());
            } else if (verificationToken.isALiProvider()) {
                jSONObject3.put("provider", "aliyun");
                jSONObject3.put("certifyId", verificationToken.certifyId);
            }
            jSONObject3.put("withPV", verificationToken.withPV);
            jSONObject.put(SearchPriority.idCard, jSONObject3);
            jSONObject.put("productId", verificationTokenRequestParam.productId);
            jSONObject.put("retrieveID", verificationTokenRequestParam.retrieveId);
            jSONObject.put("appId", verificationTokenRequestParam.appId);
            jSONObject.put("verifyType", verificationTokenRequestParam.verifyType);
        } catch (JSONException unused2) {
        }
        f400Var.c().duringCreated(TextUtils.equals(wvfVar.b, "2006") ? m15785U(str) : m15802l0(str, jSONObject)).subscribe(mkd0.H(new e30() { // from class: l.lai0
            public final void call(Object obj) {
                this.f9986a.m15794d0(f400Var, jSONObject2, verificationToken, jSONObject, (VerificationCoreEnvelope) obj);
            }
        }, new e30() { // from class: l.mai0
            public final void call(Object obj) {
                this.f10402a.m15795e0(jSONObject2, f400Var, jSONObject, verificationToken, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m15801k0(final f400 f400Var, final JSONObject jSONObject, final String str, final String str2, final TTFacertificationClient.InterfaceC1574a interfaceC1574a) {
        f400Var.c().duringCreated(SharedLibraryLoader.k().r("facertification")).take(1).flatMap(new w9j() { // from class: l.iai0
            public final Object call(Object obj) {
                return wai0.m15772H(f400Var, str, jSONObject, interfaceC1574a, str2, (Unit) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.jai0
            public final void call(Object obj) {
                this.f9297a.m15797g0(f400Var, str, jSONObject, (RxFacertification.C1573b) obj);
            }
        }, new e30() { // from class: l.kai0
            public final void call(Object obj) {
                this.f9661a.m15796f0(jSONObject, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public final c<VerificationCoreEnvelope> m15802l0(String str, final JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return c.error(new NullPointerException("empty userId"));
        }
        final String strB = xh5.b("/retrieve/verification?process=new");
        return qib0.I.now("accountVerificationResult" + str, ia20.f(new v9j() { // from class: l.nai0
            public final Object call() {
                return xh5.network.auth().q(strB).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }, VerificationCoreEnvelope.JSON_ADAPTER).observeOn(jo0.a()));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m15803m0(final f400 f400Var, final JSONObject jSONObject) {
        e51.G(new Runnable() { // from class: l.sai0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12863a.m15799i0(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public boolean m15804n(@NonNull @NotNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "getSliderDataByFrom":
                m15787W(f400Var, jSONObject);
                return true;
            case "identifierVerification":
                m15788X(f400Var, jSONObject);
                return true;
            case "ctdidVerification":
                m15784T(f400Var, jSONObject);
                return true;
            case "isStudentVerified":
                m15789Y(f400Var, jSONObject);
                return true;
            case "showCaptchaVerification":
                m15803m0(f400Var, jSONObject);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m15805n0(f400 f400Var, String str) {
        String strZ = NullChecker.a(CoreBusinessModule.c) ? CoreBusinessModule.c.z() : "";
        User userP9 = CoreModule.c.e0.p9();
        String strM = vjf0.e().m(strZ, NullChecker.a(userP9) ? userP9.publicId : "", vjf0.e().i(), str, true);
        if (TextUtils.isEmpty(strM)) {
            return;
        }
        Intent intentM2 = WebViewDialogAct.m2(CoreModule.b, "", strM, true, true);
        intentM2.putExtra("hideNavigationBar", true);
        intentM2.putExtra("skipLoading", true);
        f400Var.c().startActivity(intentM2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX INFO: renamed from: o0 */
    public void m15806o0(f400 f400Var, SliderData sliderData) {
        String str;
        String strZ = NullChecker.a(CoreBusinessModule.c) ? CoreBusinessModule.c.z() : "";
        if (NullChecker.a(CoreModule.c)) {
            User userP9 = CoreModule.c.e0.p9();
            if (NullChecker.a(userP9)) {
                str = userP9.publicId;
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        String strM = vjf0.e().m(strZ, str, sliderData, "chang_bind_new_phone", true);
        if (TextUtils.isEmpty(strM)) {
            return;
        }
        Intent intentM2 = WebViewDialogAct.m2(CoreModule.b, "", strM, true, true);
        intentM2.putExtra("hideNavigationBar", true);
        intentM2.putExtra("skipLoading", true);
        f400Var.c().startActivity(intentM2);
    }
}
