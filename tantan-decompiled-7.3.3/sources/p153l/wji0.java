package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.VerificationCoreEnvelope;
import com.p051p1.mobile.putong.data.SliderData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VerificationToken;
import com.p051p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.facertification.RxFacertification;
import com.p051p1.mobile.putong.facertification.TTFacertificationClient;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.p070ui.webview.WebViewDialogAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class wji0 extends wc00 {

    /* JADX INFO: renamed from: l.wji0$a */
    public class C21129a implements TTFacertificationClient.InterfaceC10893a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ JSONObject f189459a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ xc00 f189460b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f189461c;

        public C21129a(JSONObject jSONObject, xc00 xc00Var, String str) {
            this.f189459a = jSONObject;
            this.f189460b = xc00Var;
            this.f189461c = str;
        }

        @Override // com.p051p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10893a
        /* JADX INFO: renamed from: a */
        public void mo47739a(VerificationToken verificationToken, RxFacertification.PreDetectException preDetectException) {
            jxf jxfVar = preDetectException.prepareResult;
            if (verificationToken.isTencentProvider()) {
                if (hxf.m137590k(this.f189460b.mo99543c(), jxfVar.f123025c, this.f189461c, 2)) {
                    return;
                }
                q5l0.m175471P(this.f189460b.mo99543c(), jxfVar.f123025c);
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", User.ID_TEAM_ACCOUNT);
                } catch (JSONException unused) {
                }
                sfj0.m185607n("e_verification_scanface_sdk", "p_profile_picture_verification_pageShow", sfj0.C20032a.m185615h("sdk_name", verificationToken.provider), sfj0.C20032a.m185615h("verification_result_code", jxfVar.f123025c), sfj0.C20032a.m185615h("verification_type", TextUtils.equals(verificationToken.verifyType, "identity") ? "id_ability" : "avatar_ability"), sfj0.C20032a.m185615h("verification_scene", "change_bind_new_phone"));
                wji0.this.m205740H(this.f189459a, jSONObject.toString());
            }
        }

        @Override // com.p051p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10893a
        /* JADX INFO: renamed from: b */
        public void mo47740b(VerificationToken verificationToken) {
            sfj0.m185607n("e_verification_scanface_token", "p_profile_picture_verification_pageShow", sfj0.C20032a.m185615h("sdk_name", verificationToken.provider), sfj0.C20032a.m185613f("verification_result_code", 0), sfj0.C20032a.m185615h("verification_type", TextUtils.equals(verificationToken.verifyType, "identity") ? "id_ability" : "avatar_ability"), sfj0.C20032a.m185615h("verification_scene", "change_bind_new_phone"));
        }

        @Override // com.p051p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10893a
        /* JADX INFO: renamed from: c */
        public void mo47741c(VerificationToken verificationToken, jxf jxfVar) {
            sfj0.m185607n("e_verification_scanface_sdk", "p_profile_picture_verification_pageShow", sfj0.C20032a.m185615h("sdk_name", verificationToken.provider), sfj0.C20032a.m185613f("verification_result_code", 0), sfj0.C20032a.m185615h("verification_type", TextUtils.equals(verificationToken.verifyType, "identity") ? "id_ability" : "avatar_ability"), sfj0.C20032a.m185615h("verification_scene", "change_bind_new_phone"));
        }

        @Override // com.p051p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10893a
        /* JADX INFO: renamed from: d */
        public void mo47742d(Throwable th) {
            JSONObject jSONObject = new JSONObject();
            sfj0.m185607n("e_verification_scanface_token", "p_profile_picture_verification_pageShow", sfj0.C20032a.m185615h("sdk_name", ""), sfj0.C20032a.m185615h("verification_result_code", String.valueOf(((TantanException.Client.CoreService) th).code)), sfj0.C20032a.m185615h("verification_type", ""), sfj0.C20032a.m185615h("verification_scene", "change_bind_new_phone"));
            try {
                jSONObject.put("code", "300003");
            } catch (JSONException unused) {
            }
            wji0.this.m205740H(this.f189459a, jSONObject.toString());
        }

        @Override // com.p051p1.mobile.putong.facertification.TTFacertificationClient.InterfaceC10893a
        /* JADX INFO: renamed from: e */
        public void mo47743e(VerificationToken verificationToken) {
            this.f189460b.mo99543c().setResult(-1);
            this.f189460b.mo99543c().m68056e2();
        }
    }

    public wji0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m206648N(JSONObject jSONObject, xc00 xc00Var) {
        String strOptString = jSONObject.optString("retrieveId");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        pq4.m173304l(xc00Var.mo99543c(), "fromAccountBackH5", strOptString);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ C22421c m206650P(xc00 xc00Var, String str, JSONObject jSONObject, TTFacertificationClient.InterfaceC10893a interfaceC10893a, String str2, Unit unit) {
        try {
            System.loadLibrary("megface");
        } catch (Throwable unused) {
        }
        return TTFacertificationClient.m61385p().m61389A(xc00Var.mo99543c(), str, VerificationTokenRequestParam.builder().setIdName(jSONObject.optString("idCardName")).setIdNumber(jSONObject.optString("idCardNumber")).useAccountBackTemplate(ixf.m142515c(xc00Var.mo99543c(), true), false, "", jSONObject.optString("productId"), jSONObject.optString("retrieveId")).build(), new wq8(), interfaceC10893a, str2);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m206651Q(Throwable th) {
    }

    /* JADX INFO: renamed from: b0 */
    public void m206662b0(final xc00 xc00Var, final JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        l51.m152893M(new Runnable() { // from class: l.oji0
            @Override // java.lang.Runnable
            public final void run() {
                wji0.m206648N(jSONObject, xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final C22421c<VerificationCoreEnvelope> m206663c0(String str) {
        final String strM211107i = xi5.m211107i("/users/me/verifications/" + str);
        return uqb0.f180377I.now("anchorVerification" + str, qi20.m176656c(new pcj() { // from class: l.hji0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return xi5.network.auth().m209043q(strM211107i).m209032f().m209028b();
            }
        }, VerificationCoreEnvelope.JSON_ADAPTER));
    }

    @NonNull
    /* JADX INFO: renamed from: d0 */
    public final TTFacertificationClient.InterfaceC10893a m206664d0(@NonNull xc00 xc00Var, String str, String str2, JSONObject jSONObject) {
        return new C21129a(jSONObject, xc00Var, str);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m206665e0(@NonNull xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152887G(new Runnable() { // from class: l.rji0
            @Override // java.lang.Runnable
            public final void run() {
                this.f163457a.m206668h0(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m206666f0(final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152893M(new Runnable() { // from class: l.pji0
            @Override // java.lang.Runnable
            public final void run() {
                this.f152698a.m206670j0(jSONObject, xc00Var);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final void m206667g0(xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152887G(new Runnable() { // from class: l.qji0
            @Override // java.lang.Runnable
            public final void run() {
                this.f157975a.m206671k0(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m206668h0(JSONObject jSONObject) {
        if (NullChecker.m82486a(jSONObject) && TextUtils.equals(jSONObject.optString("from"), "findPhonenumber")) {
            m205740H(jSONObject, esf0.m122324e().f95601g.get());
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m206669i0(xc00 xc00Var, JSONObject jSONObject, String str, TTFacertificationClient.InterfaceC10893a interfaceC10893a, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (z) {
            m206679s0(xc00Var, jSONObject, str, "fromAccountBackH5", interfaceC10893a);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("code", "300002");
        } catch (JSONException unused) {
        }
        m205740H(jSONObject, jSONObject2.toString());
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m206670j0(final JSONObject jSONObject, final xc00 xc00Var) {
        String strOptString = jSONObject.optString("idCardName");
        String strOptString2 = jSONObject.optString("idCardNumber");
        String strOptString3 = jSONObject.optString("productId");
        String strOptString4 = jSONObject.optString("retrieveId");
        final String strOptString5 = jSONObject.optString("publicId");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3) || TextUtils.isEmpty(strOptString4) || TextUtils.isEmpty(strOptString5)) {
            return;
        }
        final TTFacertificationClient.InterfaceC10893a interfaceC10893aM206664d0 = m206664d0(xc00Var, "fromAccountBackH5", xc00Var.mo99543c().string(R$string.f19262g0), jSONObject);
        PermissionHelper.m81065c().m81083r("android.permission.CAMERA").m81088w(false).m81086u(true).m81077l(new PermissionHelper.InterfaceC13292b() { // from class: l.vji0
            @Override // com.p051p1.mobile.putong.p070ui.permission.PermissionHelper.InterfaceC13292b
            /* JADX INFO: renamed from: a */
            public final void mo81089a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                this.f184396a.m206669i0(xc00Var, jSONObject, strOptString5, interfaceC10893aM206664d0, z, permissionDeniedReason);
            }
        }).m81074i(xc00Var.mo99543c());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m206671k0(JSONObject jSONObject) {
        int i;
        if (NullChecker.m82486a(jSONObject)) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (!NullChecker.m82486a(userM116600p9) || !NullChecker.m82486a(userM116600p9.settings) || !NullChecker.m82486a(userM116600p9.settings.verification) || !NullChecker.m82486a(userM116600p9.settings.verification.studies)) {
                i = 0;
            } else if (TEnum.equals(userM116600p9.settings.verification.studies.status, "verified")) {
                i = 1;
            } else if (TEnum.equals(userM116600p9.settings.verification.studies.status, "pending")) {
                i = 2;
            } else {
                i = 0;
            }
            m205740H(jSONObject, String.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m206672l0(xc00 xc00Var, JSONObject jSONObject, VerificationToken verificationToken, JSONObject jSONObject2, VerificationCoreEnvelope verificationCoreEnvelope) {
        xc00Var.mo99543c().progressDismiss();
        if (jyb.m147479J(verificationCoreEnvelope.data.verificationCenter)) {
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
            sfj0.m185607n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", sfj0.C20032a.m185615h("sdk_name", verificationToken.provider), sfj0.C20032a.m185613f("verification_result_code", 0), sfj0.C20032a.m185615h("verification_type", TextUtils.equals(verificationToken.verifyType, "identity") ? "id_ability" : "avatar_ability"), sfj0.C20032a.m185615h("verification_scene", "change_bind_new_phone"));
        }
        m205740H(jSONObject2, jSONObject.toString());
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m206673m0(JSONObject jSONObject, xc00 xc00Var, JSONObject jSONObject2, VerificationToken verificationToken, Throwable th) {
        try {
            if (th instanceof TantanException.Client.CoreService) {
                jSONObject.put("code", String.valueOf(((TantanException.Client.CoreService) th).code));
            } else {
                jSONObject.put("code", "300001");
            }
        } catch (JSONException unused) {
        }
        xc00Var.mo99543c().progressDismiss();
        o1j0.m165651y(xc00Var.mo99543c().string(R$string.f18406Dr));
        m205740H(jSONObject2, jSONObject.toString());
        sfj0.m185607n("e_verification_scanface_submit", "p_profile_picture_verification_pageShow", sfj0.C20032a.m185615h("sdk_name", verificationToken.provider), sfj0.C20032a.m185615h("verification_result_code", String.valueOf(((TantanException.Client.CoreService) th).code)), sfj0.C20032a.m185615h("verification_type", TextUtils.equals(verificationToken.verifyType, "identity") ? "id_ability" : "avatar_ability"), sfj0.C20032a.m185615h("verification_scene", "change_bind_new_phone"));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m206674n0(JSONObject jSONObject, Throwable th) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", User.ID_TEAM_ACCOUNT);
            m205740H(jSONObject, jSONObject2.toString());
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m206675o0(xc00 xc00Var, String str, JSONObject jSONObject, RxFacertification.C10892b c10892b) {
        VerificationTokenRequestParam verificationTokenRequestParam = c10892b.f39692c;
        if (verificationTokenRequestParam != null) {
            sfj0.m185607n("e_verification_scanface_request", "p_profile_picture_verification_pageShow", sfj0.C20032a.m185615h("verification_type", TextUtils.equals(verificationTokenRequestParam.verifyType, "identity") ? "id_ability" : "avatar_ability"), sfj0.C20032a.m185615h("verification_scene", "change_bind_new_phone"));
        }
        m206678r0(xc00Var, c10892b.f39692c, str, c10892b, jSONObject);
        sfj0.m185607n("e_verification_scanface_finish", "p_profile_picture_verification_pageShow", sfj0.C20032a.m185615h("sdk_name", c10892b.f39691b.provider), sfj0.C20032a.m185613f("verification_result_code", 0), sfj0.C20032a.m185615h("verification_type", TextUtils.equals(c10892b.f39691b.verifyType, "identity") ? "id_ability" : "avatar_ability"), sfj0.C20032a.m185615h("verification_scene", "change_bind_new_phone"));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m206676p0(String str) {
        m205747x().m97007e("tantan_verification_getSlideSuccessData", str);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m206677q0(JSONObject jSONObject, xc00 xc00Var) {
        SliderData sliderDataNew_ = SliderData.new_();
        if (!NullChecker.m82486a(jSONObject)) {
            m205740H(jSONObject, "0");
            return;
        }
        sliderDataNew_.uuid = jSONObject.optString("uuid");
        sliderDataNew_.supplier = jSONObject.optInt("supplier");
        sliderDataNew_.retryClose = jSONObject.optInt("retryClose");
        sliderDataNew_.delayClose = jSONObject.optInt("delayClose");
        sliderDataNew_.allowClose = jSONObject.optInt("allowClose");
        String strOptString = jSONObject.optString("projectType");
        esf0.m122324e().f95607m.put(Boolean.TRUE);
        xc00Var.mo99543c().duringCreated(esf0.m122324e().f95595a).subscribe(psd0.m173597H(new y20() { // from class: l.tji0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174592a.m206676p0((String) obj);
            }
        }, new y20() { // from class: l.uji0
            @Override // p153l.y20
            public final void call(Object obj) {
                wji0.m206651Q((Throwable) obj);
            }
        }));
        if (TextUtils.equals(strOptString, "accountGetBackType")) {
            esf0.m122324e().m122345w("accountGetBackType");
            if (ConnectivityReceiver.m82467g()) {
                m206683w0(xc00Var, sliderDataNew_);
                return;
            }
            return;
        }
        esf0.m122324e().m122344v(sliderDataNew_);
        if (TextUtils.isEmpty(esf0.m122324e().m122334k())) {
            return;
        }
        if (ConnectivityReceiver.m82467g()) {
            m206682v0(xc00Var, strOptString);
        } else {
            esf0.m122324e().m122348z().m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m206678r0(@NonNull final xc00 xc00Var, VerificationTokenRequestParam verificationTokenRequestParam, String str, RxFacertification.C10892b c10892b, final JSONObject jSONObject) {
        final JSONObject jSONObject2 = new JSONObject();
        final VerificationToken verificationToken = c10892b.f39691b;
        JSONObject jSONObject3 = new JSONObject();
        kxf kxfVar = c10892b.f39690a;
        if (!kxfVar.f129195h) {
            xc00Var.mo99543c().progressDismiss();
            try {
                jSONObject2.put("code", kxfVar.f129189b);
                jSONObject2.put("data", kxfVar.toString());
                m205740H(jSONObject, jSONObject2.toString());
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
                jSONObject3.put("providerAppId", TTFacertificationClient.m61386q());
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
        xc00Var.mo99543c().duringCreated(TextUtils.equals(kxfVar.f129189b, "2006") ? m206663c0(str) : m206680t0(str, jSONObject)).subscribe(psd0.m173597H(new y20() { // from class: l.lji0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132333a.m206672l0(xc00Var, jSONObject2, verificationToken, jSONObject, (VerificationCoreEnvelope) obj);
            }
        }, new y20() { // from class: l.mji0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137078a.m206673m0(jSONObject2, xc00Var, jSONObject, verificationToken, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public final void m206679s0(final xc00 xc00Var, final JSONObject jSONObject, final String str, final String str2, final TTFacertificationClient.InterfaceC10893a interfaceC10893a) {
        xc00Var.mo99543c().duringCreated(SharedLibraryLoader.m82637k().m82647r("facertification")).take(1).flatMap(new qcj() { // from class: l.iji0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return wji0.m206650P(xc00Var, str, jSONObject, interfaceC10893a, str2, (Unit) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.jji0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121181a.m206675o0(xc00Var, str, jSONObject, (RxFacertification.C10892b) obj);
            }
        }, new y20() { // from class: l.kji0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127102a.m206674n0(jSONObject, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public final C22421c<VerificationCoreEnvelope> m206680t0(String str, final JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return C22421c.error(new NullPointerException("empty userId"));
        }
        final String strM211100b = xi5.m211100b("/retrieve/verification?process=new");
        return uqb0.f180377I.now("accountVerificationResult" + str, qi20.m176659f(new pcj() { // from class: l.nji0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return xi5.network.auth().m209043q(strM211100b).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }, VerificationCoreEnvelope.JSON_ADAPTER).observeOn(fo0.m126432a()));
    }

    /* JADX INFO: renamed from: u0 */
    public final void m206681u0(final xc00 xc00Var, final JSONObject jSONObject) {
        l51.m152887G(new Runnable() { // from class: l.sji0
            @Override // java.lang.Runnable
            public final void run() {
                this.f168975a.m206677q0(jSONObject, xc00Var);
            }
        });
    }

    @Override // p153l.wc00
    /* JADX INFO: renamed from: v */
    public boolean mo47831v(@NonNull @NotNull xc00 xc00Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "getSliderDataByFrom":
                m206665e0(xc00Var, jSONObject);
                return true;
            case "identifierVerification":
                m206666f0(xc00Var, jSONObject);
                return true;
            case "ctdidVerification":
                m206662b0(xc00Var, jSONObject);
                return true;
            case "isStudentVerified":
                m206667g0(xc00Var, jSONObject);
                return true;
            case "showCaptchaVerification":
                m206681u0(xc00Var, jSONObject);
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m206682v0(xc00 xc00Var, String str) {
        String strM193947z = NullChecker.m82486a(CoreBusinessModule.f18252c) ? CoreBusinessModule.f18252c.m193947z() : "";
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        String strM122335m = esf0.m122324e().m122335m(strM193947z, NullChecker.m82486a(userM116600p9) ? userM116600p9.publicId : "", esf0.m122324e().m122332i(), str, true);
        if (TextUtils.isEmpty(strM122335m)) {
            return;
        }
        Intent intentM81356n2 = WebViewDialogAct.m81356n2(CoreModule.f18263b, "", strM122335m, true, true);
        intentM81356n2.putExtra("hideNavigationBar", true);
        intentM81356n2.putExtra("skipLoading", true);
        xc00Var.mo99543c().startActivity(intentM81356n2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX INFO: renamed from: w0 */
    public void m206683w0(xc00 xc00Var, SliderData sliderData) {
        String str;
        String strM193947z = NullChecker.m82486a(CoreBusinessModule.f18252c) ? CoreBusinessModule.f18252c.m193947z() : "";
        if (NullChecker.m82486a(CoreModule.f18264c)) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (NullChecker.m82486a(userM116600p9)) {
                str = userM116600p9.publicId;
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        String strM122335m = esf0.m122324e().m122335m(strM193947z, str, sliderData, "chang_bind_new_phone", true);
        if (TextUtils.isEmpty(strM122335m)) {
            return;
        }
        Intent intentM81356n2 = WebViewDialogAct.m81356n2(CoreModule.f18263b, "", strM122335m, true, true);
        intentM81356n2.putExtra("hideNavigationBar", true);
        intentM81356n2.putExtra("skipLoading", true);
        xc00Var.mo99543c().startActivity(intentM81356n2);
    }
}
