package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.VerificationCoreEnvelope;
import com.p046p1.mobile.putong.data.SliderData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VerificationToken;
import com.p046p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.facertification.RxFacertification;
import com.p046p1.mobile.putong.facertification.TTFacertificationClient;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.p065ui.webview.WebViewDialogAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class wai0 extends e400 {

    /* JADX INFO: renamed from: l.wai0$a */
    public class C20841a implements TTFacertificationClient.InterfaceC10730a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ JSONObject f185469a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ f400 f185470b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f185471c;

        public C20841a(JSONObject jSONObject, f400 f400Var, String str) {
            this.f185469a = jSONObject;
            this.f185470b = f400Var;
            this.f185471c = str;
        }

        @Override // com.p046p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10730a
        /* JADX INFO: renamed from: a */
        public void mo46556a(VerificationToken verificationToken, RxFacertification.PreDetectException preDetectException) {
            vvf vvfVar = preDetectException.prepareResult;
            if (verificationToken.isTencentProvider()) {
                if (tvf.m190733k(this.f185470b.mo102961c(), vvfVar.f183221c, this.f185471c, 2)) {
                    return;
                }
                kwk0.m147565P(this.f185470b.mo102961c(), vvfVar.f183221c);
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", User.ID_TEAM_ACCOUNT);
                } catch (JSONException unused) {
                }
                o6j0.m162870n("e_verification_scanface_sdk", "p_profile_picture_verification_pageShow", o6j0.C18854a.m162878h("sdk_name", verificationToken.provider), o6j0.C18854a.m162878h("verification_result_code", vvfVar.f183221c), o6j0.C18854a.m162878h("verification_type", TextUtils.equals(verificationToken.verifyType, "identity") ? "id_ability" : "avatar_ability"), o6j0.C18854a.m162878h("verification_scene", "change_bind_new_phone"));
                wai0.this.m114661z(this.f185469a, jSONObject.toString());
            }
        }

        @Override // com.p046p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10730a
        /* JADX INFO: renamed from: b */
        public void mo46557b(VerificationToken verificationToken) {
            o6j0.m162870n("e_verification_scanface_token", "p_profile_picture_verification_pageShow", o6j0.C18854a.m162878h("sdk_name", verificationToken.provider), o6j0.C18854a.m162876f("verification_result_code", 0), o6j0.C18854a.m162878h("verification_type", TextUtils.equals(verificationToken.verifyType, "identity") ? "id_ability" : "avatar_ability"), o6j0.C18854a.m162878h("verification_scene", "change_bind_new_phone"));
        }

        @Override // com.p046p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10730a
        /* JADX INFO: renamed from: c */
        public void mo46558c(VerificationToken verificationToken, vvf vvfVar) {
            o6j0.m162870n("e_verification_scanface_sdk", "p_profile_picture_verification_pageShow", o6j0.C18854a.m162878h("sdk_name", verificationToken.provider), o6j0.C18854a.m162876f("verification_result_code", 0), o6j0.C18854a.m162878h("verification_type", TextUtils.equals(verificationToken.verifyType, "identity") ? "id_ability" : "avatar_ability"), o6j0.C18854a.m162878h("verification_scene", "change_bind_new_phone"));
        }

        @Override // com.p046p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10730a
        /* JADX INFO: renamed from: d */
        public void mo46559d(Throwable th) {
            JSONObject jSONObject = new JSONObject();
            o6j0.m162870n("e_verification_scanface_token", "p_profile_picture_verification_pageShow", o6j0.C18854a.m162878h("sdk_name", ""), o6j0.C18854a.m162878h("verification_result_code", String.valueOf(((TantanException.Client.CoreService) th).code)), o6j0.C18854a.m162878h("verification_type", ""), o6j0.C18854a.m162878h("verification_scene", "change_bind_new_phone"));
            try {
                jSONObject.put("code", "300003");
            } catch (JSONException unused) {
            }
            wai0.this.m114661z(this.f185469a, jSONObject.toString());
        }

        @Override // com.p046p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10730a
        /* JADX INFO: renamed from: e */
        public void mo46560e(VerificationToken verificationToken) {
            this.f185470b.mo102961c().setResult(-1);
            this.f185470b.mo102961c().m66873d2();
        }
    }

    public wai0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m202399F(JSONObject jSONObject, f400 f400Var) {
        String strOptString = jSONObject.optString("retrieveId");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        qp4.m175806l(f400Var.mo102961c(), "fromAccountBackH5", strOptString);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ C22306c m202401H(f400 f400Var, String str, JSONObject jSONObject, TTFacertificationClient.InterfaceC10730a interfaceC10730a, String str2, Unit unit) {
        try {
            System.loadLibrary("megface");
        } catch (Throwable unused) {
        }
        return TTFacertificationClient.m60201p().m60205A(f400Var.mo102961c(), str, VerificationTokenRequestParam.builder().setIdName(jSONObject.optString("idCardName")).setIdNumber(jSONObject.optString("idCardNumber")).useAccountBackTemplate(uvf.m196075c(f400Var.mo102961c(), true), false, "", jSONObject.optString("productId"), jSONObject.optString("retrieveId")).build(), new rp8(), interfaceC10730a, str2);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m202402I(Throwable th) {
    }

    /* JADX INFO: renamed from: T */
    public void m202413T(final f400 f400Var, final JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        e51.m114748M(new Runnable() { // from class: l.oai0
            @Override // java.lang.Runnable
            public final void run() {
                wai0.m202399F(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final C22306c<VerificationCoreEnvelope> m202414U(String str) {
        final String strM208761i = xh5.m208761i("/users/me/verifications/" + str);
        return qib0.f154694I.now("anchorVerification" + str, ia20.m135119c(new v9j() { // from class: l.hai0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xh5.network.auth().m185898q(strM208761i).m185887f().m185883b();
            }
        }, VerificationCoreEnvelope.JSON_ADAPTER));
    }

    @NonNull
    /* JADX INFO: renamed from: V */
    public final TTFacertificationClient.InterfaceC10730a m202415V(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        return new C20841a(jSONObject, f400Var, str);
    }

    /* JADX INFO: renamed from: W */
    public final void m202416W(@NonNull f400 f400Var, final JSONObject jSONObject) {
        e51.m114742G(new Runnable() { // from class: l.rai0
            @Override // java.lang.Runnable
            public final void run() {
                this.f158520a.m202419Z(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public void m202417X(final f400 f400Var, final JSONObject jSONObject) {
        e51.m114748M(new Runnable() { // from class: l.pai0
            @Override // java.lang.Runnable
            public final void run() {
                this.f147980a.m202421b0(jSONObject, f400Var);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public final void m202418Y(f400 f400Var, final JSONObject jSONObject) {
        e51.m114742G(new Runnable() { // from class: l.qai0
            @Override // java.lang.Runnable
            public final void run() {
                this.f153540a.m202422c0(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m202419Z(JSONObject jSONObject) {
        if (NullChecker.m81303a(jSONObject) && TextUtils.equals(jSONObject.optString("from"), "findPhonenumber")) {
            m114661z(jSONObject, vjf0.m198623e().f181692g.get());
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m202420a0(f400 f400Var, JSONObject jSONObject, String str, TTFacertificationClient.InterfaceC10730a interfaceC10730a, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (z) {
            m202430k0(f400Var, jSONObject, str, "fromAccountBackH5", interfaceC10730a);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("code", "300002");
        } catch (JSONException unused) {
        }
        m114661z(jSONObject, jSONObject2.toString());
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m202421b0(final JSONObject jSONObject, final f400 f400Var) {
        String strOptString = jSONObject.optString("idCardName");
        String strOptString2 = jSONObject.optString("idCardNumber");
        String strOptString3 = jSONObject.optString("productId");
        String strOptString4 = jSONObject.optString("retrieveId");
        final String strOptString5 = jSONObject.optString("publicId");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3) || TextUtils.isEmpty(strOptString4) || TextUtils.isEmpty(strOptString5)) {
            return;
        }
        final TTFacertificationClient.InterfaceC10730a interfaceC10730aM202415V = m202415V(f400Var, "fromAccountBackH5", f400Var.mo102961c().string(R$string.f18532g0), jSONObject);
        PermissionHelper.m79882c().m79900r("android.permission.CAMERA").m79905w(false).m79903u(true).m79894l(new PermissionHelper.InterfaceC13129b() { // from class: l.vai0
            @Override // com.p046p1.mobile.putong.p065ui.permission.PermissionHelper.InterfaceC13129b
            /* JADX INFO: renamed from: a */
            public final void mo79906a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                this.f180740a.m202420a0(f400Var, jSONObject, strOptString5, interfaceC10730aM202415V, z, permissionDeniedReason);
            }
        }).m79891i(f400Var.mo102961c());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m202422c0(JSONObject jSONObject) {
        int i;
        if (NullChecker.m81303a(jSONObject)) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (!NullChecker.m81303a(userM169527p9) || !NullChecker.m81303a(userM169527p9.settings) || !NullChecker.m81303a(userM169527p9.settings.verification) || !NullChecker.m81303a(userM169527p9.settings.verification.studies)) {
                i = 0;
            } else if (TEnum.equals(userM169527p9.settings.verification.studies.status, "verified")) {
                i = 1;
            } else if (TEnum.equals(userM169527p9.settings.verification.studies.status, "pending")) {
                i = 2;
            } else {
                i = 0;
            }
            m114661z(jSONObject, String.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m202423d0(f400 f400Var, JSONObject jSONObject, VerificationToken verificationToken, JSONObject jSONObject2, VerificationCoreEnvelope verificationCoreEnvelope) {
        f400Var.mo102961c().progressDismiss();
        if (vwb.m200296J(verificationCoreEnvelope.data.verificationCenter)) {
            try {
                jSONObject.put("code", User.ID_TEAM_ACCOUNT);
            } catch (JSONException unused) {
            }
        } else {
            try {
                jSONObject.put("code", verificationCoreEnvelope.meta.code);
                jSONObject.put("data", verificationCoreEnvelope.data.verificationCenter.get(0).toJson());
            } catch (JSONException unused2) {
            }
            o6j0.m162870n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", o6j0.C18854a.m162878h("sdk_name", verificationToken.provider), o6j0.C18854a.m162876f("verification_result_code", 0), o6j0.C18854a.m162878h("verification_type", TextUtils.equals(verificationToken.verifyType, "identity") ? "id_ability" : "avatar_ability"), o6j0.C18854a.m162878h("verification_scene", "change_bind_new_phone"));
        }
        m114661z(jSONObject2, jSONObject.toString());
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m202424e0(JSONObject jSONObject, f400 f400Var, JSONObject jSONObject2, VerificationToken verificationToken, Throwable th) {
        try {
            if (th instanceof TantanException.Client.CoreService) {
                jSONObject.put("code", String.valueOf(((TantanException.Client.CoreService) th).code));
            } else {
                jSONObject.put("code", "300001");
            }
        } catch (JSONException unused) {
        }
        f400Var.mo102961c().progressDismiss();
        lsi0.m151595y(f400Var.mo102961c().string(R$string.f18590hr));
        m114661z(jSONObject2, jSONObject.toString());
        o6j0.m162870n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", o6j0.C18854a.m162878h("sdk_name", verificationToken.provider), o6j0.C18854a.m162878h("verification_result_code", String.valueOf(((TantanException.Client.CoreService) th).code)), o6j0.C18854a.m162878h("verification_type", TextUtils.equals(verificationToken.verifyType, "identity") ? "id_ability" : "avatar_ability"), o6j0.C18854a.m162878h("verification_scene", "change_bind_new_phone"));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m202425f0(JSONObject jSONObject, Throwable th) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", User.ID_TEAM_ACCOUNT);
            m114661z(jSONObject, jSONObject2.toString());
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m202426g0(f400 f400Var, String str, JSONObject jSONObject, RxFacertification.C10729b c10729b) {
        VerificationTokenRequestParam verificationTokenRequestParam = c10729b.f38844c;
        if (verificationTokenRequestParam != null) {
            o6j0.m162870n("e_verification_scanface_request", "p_profile_picture_verification_pageShow", o6j0.C18854a.m162878h("verification_type", TextUtils.equals(verificationTokenRequestParam.verifyType, "identity") ? "id_ability" : "avatar_ability"), o6j0.C18854a.m162878h("verification_scene", "change_bind_new_phone"));
        }
        m202429j0(f400Var, c10729b.f38844c, str, c10729b, jSONObject);
        o6j0.m162870n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", o6j0.C18854a.m162878h("sdk_name", c10729b.f38843b.provider), o6j0.C18854a.m162876f("verification_result_code", 0), o6j0.C18854a.m162878h("verification_type", TextUtils.equals(c10729b.f38843b.verifyType, "identity") ? "id_ability" : "avatar_ability"), o6j0.C18854a.m162878h("verification_scene", "change_bind_new_phone"));
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m202427h0(String str) {
        m114651p().m134313e("tantan_verification_getSlideSuccessData", str);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m202428i0(JSONObject jSONObject, f400 f400Var) {
        SliderData sliderDataNew_ = SliderData.new_();
        if (!NullChecker.m81303a(jSONObject)) {
            m114661z(jSONObject, "0");
            return;
        }
        sliderDataNew_.uuid = jSONObject.optString("uuid");
        sliderDataNew_.supplier = jSONObject.optInt("supplier");
        sliderDataNew_.retryClose = jSONObject.optInt("retryClose");
        sliderDataNew_.delayClose = jSONObject.optInt("delayClose");
        sliderDataNew_.allowClose = jSONObject.optInt("allowClose");
        String strOptString = jSONObject.optString("projectType");
        vjf0.m198623e().f181698m.put(Boolean.TRUE);
        f400Var.mo102961c().duringCreated(vjf0.m198623e().f181686a).subscribe(mkd0.m154956H(new e30() { // from class: l.tai0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169120a.m202427h0((String) obj);
            }
        }, new e30() { // from class: l.uai0
            @Override // p149l.e30
            public final void call(Object obj) {
                wai0.m202402I((Throwable) obj);
            }
        }));
        if (TextUtils.equals(strOptString, "accountGetBackType")) {
            vjf0.m198623e().m198644w("accountGetBackType");
            if (ConnectivityReceiver.m81284g()) {
                m202434o0(f400Var, sliderDataNew_);
                return;
            }
            return;
        }
        vjf0.m198623e().m198643v(sliderDataNew_);
        if (TextUtils.isEmpty(vjf0.m198623e().m198633k())) {
            return;
        }
        if (ConnectivityReceiver.m81284g()) {
            m202433n0(f400Var, strOptString);
        } else {
            vjf0.m198623e().m198647z().m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m202429j0(@NonNull final f400 f400Var, VerificationTokenRequestParam verificationTokenRequestParam, String str, RxFacertification.C10729b c10729b, final JSONObject jSONObject) {
        final JSONObject jSONObject2 = new JSONObject();
        final VerificationToken verificationToken = c10729b.f38843b;
        JSONObject jSONObject3 = new JSONObject();
        wvf wvfVar = c10729b.f38842a;
        if (!wvfVar.f188243h) {
            f400Var.mo102961c().progressDismiss();
            try {
                jSONObject2.put("code", wvfVar.f188237b);
                jSONObject2.put("data", wvfVar.toString());
                m114661z(jSONObject, jSONObject2.toString());
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
                jSONObject3.put("providerAppId", TTFacertificationClient.m60202q());
            } else if (verificationToken.isALiProvider()) {
                jSONObject3.put("provider", "aliyun");
                jSONObject3.put("certifyId", verificationToken.certifyId);
            }
            jSONObject3.put("withPV", verificationToken.withPV);
            jSONObject.put("idCard", jSONObject3);
            jSONObject.put("productId", verificationTokenRequestParam.productId);
            jSONObject.put("retrieveID", verificationTokenRequestParam.retrieveId);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.APP_ID, verificationTokenRequestParam.appId);
            jSONObject.put("verifyType", verificationTokenRequestParam.verifyType);
        } catch (JSONException unused2) {
        }
        f400Var.mo102961c().duringCreated(TextUtils.equals(wvfVar.f188237b, "2006") ? m202414U(str) : m202431l0(str, jSONObject)).subscribe(mkd0.m154956H(new e30() { // from class: l.lai0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127210a.m202423d0(f400Var, jSONObject2, verificationToken, jSONObject, (VerificationCoreEnvelope) obj);
            }
        }, new e30() { // from class: l.mai0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132912a.m202424e0(jSONObject2, f400Var, jSONObject, verificationToken, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m202430k0(final f400 f400Var, final JSONObject jSONObject, final String str, final String str2, final TTFacertificationClient.InterfaceC10730a interfaceC10730a) {
        f400Var.mo102961c().duringCreated(SharedLibraryLoader.m81454k().m81464r("facertification")).take(1).flatMap(new w9j() { // from class: l.iai0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return wai0.m202401H(f400Var, str, jSONObject, interfaceC10730a, str2, (Unit) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.jai0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117092a.m202426g0(f400Var, str, jSONObject, (RxFacertification.C10729b) obj);
            }
        }, new e30() { // from class: l.kai0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122120a.m202425f0(jSONObject, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public final C22306c<VerificationCoreEnvelope> m202431l0(String str, final JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return C22306c.error(new NullPointerException("empty userId"));
        }
        final String strM208754b = xh5.m208754b("/retrieve/verification?process=new");
        return qib0.f154694I.now("accountVerificationResult" + str, ia20.m135122f(new v9j() { // from class: l.nai0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xh5.network.auth().m185898q(strM208754b).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }, VerificationCoreEnvelope.JSON_ADAPTER).observeOn(jo0.m142408a()));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m202432m0(final f400 f400Var, final JSONObject jSONObject) {
        e51.m114742G(new Runnable() { // from class: l.sai0
            @Override // java.lang.Runnable
            public final void run() {
                this.f163410a.m202428i0(jSONObject, f400Var);
            }
        });
    }

    @Override // p149l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo46640n(@NonNull @NotNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "getSliderDataByFrom":
                m202416W(f400Var, jSONObject);
                return true;
            case "identifierVerification":
                m202417X(f400Var, jSONObject);
                return true;
            case "ctdidVerification":
                m202413T(f400Var, jSONObject);
                return true;
            case "isStudentVerified":
                m202418Y(f400Var, jSONObject);
                return true;
            case "showCaptchaVerification":
                m202432m0(f400Var, jSONObject);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m202433n0(f400 f400Var, String str) {
        String strM177378z = NullChecker.m81303a(CoreBusinessModule.f17533c) ? CoreBusinessModule.f17533c.m177378z() : "";
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        String strM198634m = vjf0.m198623e().m198634m(strM177378z, NullChecker.m81303a(userM169527p9) ? userM169527p9.publicId : "", vjf0.m198623e().m198631i(), str, true);
        if (TextUtils.isEmpty(strM198634m)) {
            return;
        }
        Intent intentM80173m2 = WebViewDialogAct.m80173m2(CoreModule.f17544b, "", strM198634m, true, true);
        intentM80173m2.putExtra("hideNavigationBar", true);
        intentM80173m2.putExtra("skipLoading", true);
        f400Var.mo102961c().startActivity(intentM80173m2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX INFO: renamed from: o0 */
    public void m202434o0(f400 f400Var, SliderData sliderData) {
        String str;
        String strM177378z = NullChecker.m81303a(CoreBusinessModule.f17533c) ? CoreBusinessModule.f17533c.m177378z() : "";
        if (NullChecker.m81303a(CoreModule.f17545c)) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (NullChecker.m81303a(userM169527p9)) {
                str = userM169527p9.publicId;
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        String strM198634m = vjf0.m198623e().m198634m(strM177378z, str, sliderData, "chang_bind_new_phone", true);
        if (TextUtils.isEmpty(strM198634m)) {
            return;
        }
        Intent intentM80173m2 = WebViewDialogAct.m80173m2(CoreModule.f17544b, "", strM198634m, true, true);
        intentM80173m2.putExtra("hideNavigationBar", true);
        intentM80173m2.putExtra("skipLoading", true);
        f400Var.mo102961c().startActivity(intentM80173m2);
    }
}
