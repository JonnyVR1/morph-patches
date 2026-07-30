package com.p051p1.mobile.putong.facertification;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.VerificationProcessIdentity;
import com.p051p1.mobile.putong.data.VerificationProcessParams;
import com.p051p1.mobile.putong.data.VerificationToken;
import com.p051p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p051p1.mobile.putong.data.VolcEngineProToken;
import com.p051p1.mobile.putong.facertification.RxFacertification;
import com.p051p1.mobile.putong.facertification.TTFacertificationClient;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediamncertification.FacertificationSDKType;
import com.tencent.connect.common.Constants;
import org.json.JSONObject;
import p137rx.C22421c;
import p153l.fo0;
import p153l.jxf;
import p153l.jyb;
import p153l.ktl;
import p153l.kxf;
import p153l.pcj;
import p153l.pzi0;
import p153l.qcj;
import p153l.qi20;
import p153l.uqb0;
import p153l.v3l0;
import p153l.wwh0;
import p153l.x20;
import p153l.xi5;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class TTFacertificationClient {

    /* JADX INFO: renamed from: a */
    public final wwh0 f39693a;

    /* JADX INFO: renamed from: b */
    public int f39694b;

    public static class InternalException extends Exception {
        private InternalException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.facertification.TTFacertificationClient$a */
    public interface InterfaceC10893a {
        /* JADX INFO: renamed from: a */
        void mo47739a(VerificationToken verificationToken, RxFacertification.PreDetectException preDetectException);

        /* JADX INFO: renamed from: b */
        void mo47740b(VerificationToken verificationToken);

        /* JADX INFO: renamed from: c */
        void mo47741c(VerificationToken verificationToken, jxf jxfVar);

        /* JADX INFO: renamed from: d */
        void mo47742d(Throwable th);

        /* JADX INFO: renamed from: e */
        void mo47743e(VerificationToken verificationToken);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.facertification.TTFacertificationClient$b */
    public static final class C10894b {

        /* JADX INFO: renamed from: a */
        public static final TTFacertificationClient f39695a = new TTFacertificationClient();
    }

    public TTFacertificationClient() {
        this.f39693a = new wwh0();
        this.f39694b = 0;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m61375f(InterfaceC10893a interfaceC10893a, VerificationToken verificationToken, Throwable th) {
        if (th instanceof RxFacertification.PreDetectException) {
            interfaceC10893a.mo47739a(verificationToken, (RxFacertification.PreDetectException) th);
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Boolean m61381l(String str, InterfaceC10893a interfaceC10893a, VerificationToken verificationToken) {
        if (!m61382m(verificationToken.provider)) {
            return Boolean.FALSE;
        }
        if (TextUtils.equals(str, "fromPicVerificationDlg") || TextUtils.equals(str, "fromNameVerificationDlg")) {
            return Boolean.TRUE;
        }
        if (!verificationToken.omitLiveData) {
            return Boolean.TRUE;
        }
        interfaceC10893a.mo47743e(verificationToken);
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m61382m(String str) {
        return jyb.m147507f0("tencentIntl", "aliyunIntl", "tencentIntlV2").contains(str);
    }

    /* JADX INFO: renamed from: n */
    public static C22421c<Envelope> m61383n(String str) {
        final String strM211107i = xi5.m211107i("/users/me/verifications/" + str);
        return uqb0.f180377I.now("anchorVerification" + str, qi20.m176654a(new pcj() { // from class: l.fxh0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return xi5.network.auth().m209043q(strM211107i).m209032f().m209028b();
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public static FacertificationSDKType m61384o(VerificationToken verificationToken) {
        if (verificationToken.isALiProvider()) {
            return FacertificationSDKType.FACERTIFICATION_SDK_TYPE_ALI;
        }
        if (verificationToken.isTencentProvider()) {
            return FacertificationSDKType.FACERTIFICATION_SDK_TYPE_TX;
        }
        if (verificationToken.isMoMoProvider()) {
            return FacertificationSDKType.FACERTIFICATION_SDK_TYPE_MOMO;
        }
        if (verificationToken.isTencentIntlProvider()) {
            return FacertificationSDKType.FACERTIFICATION_SDK_TYPE_TX_INTL;
        }
        if (verificationToken.isTencentIntlProviderV2()) {
            return FacertificationSDKType.FACERTIFICATION_SDK_TYPE_TX_INTL_V2;
        }
        if (verificationToken.isVolcProvider()) {
            return FacertificationSDKType.FACERTIFICATION_SDK_TYPE_BYTE_VOLC;
        }
        return verificationToken.isAliyunIntlProvider() ? FacertificationSDKType.FACERTIFICATION_SDK_TYPE_ALI_INTL : FacertificationSDKType.FACERTIFICATION_SDK_TYPE_EXT;
    }

    /* JADX INFO: renamed from: p */
    public static TTFacertificationClient m61385p() {
        return C10894b.f39695a;
    }

    /* JADX INFO: renamed from: q */
    public static String m61386q() {
        return "IDArltB0";
    }

    /* JADX INFO: renamed from: v */
    public static C22421c<Envelope> m61387v(String str, String str2, String str3) {
        final String strM211107i = xi5.m211107i("/users/" + str + "/verifications/" + str + "?process=new");
        final VerificationProcessParams verificationProcessParamsNew_ = VerificationProcessParams.new_();
        VerificationProcessIdentity verificationProcessIdentityNew_ = VerificationProcessIdentity.new_();
        verificationProcessIdentityNew_.provider = str2;
        verificationProcessIdentityNew_.certifyId = str3;
        verificationProcessParamsNew_.identity = verificationProcessIdentityNew_;
        return uqb0.f180377I.now("processVerificationResult" + str, qi20.m176654a(new pcj() { // from class: l.axh0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return xi5.network.auth().m209043q(strM211107i).m209037k(z1d0.create(Network.JSON, verificationProcessParamsNew_.toJson())).m209028b();
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public static C22421c<Envelope> m61388y(final JSONObject jSONObject) {
        final String strM211100b = xi5.m211100b("/retrieve/verification?process=new");
        return uqb0.f180377I.now("accountVerificationResult" + pzi0.m174454o(), qi20.m176658e(new pcj() { // from class: l.xwh0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return xi5.network.auth().m209043q(strM211100b).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).observeOn(fo0.m126432a()));
    }

    /* JADX INFO: renamed from: A */
    public C22421c<RxFacertification.C10892b> m61389A(final Context context, final String str, final VerificationTokenRequestParam verificationTokenRequestParam, @NonNull final ktl ktlVar, @NonNull final InterfaceC10893a interfaceC10893a, final String str2) {
        boolean zEquals = TextUtils.equals(str2, "fromAccountBackH5");
        wwh0 wwh0Var = this.f39693a;
        return (zEquals ? wwh0Var.m208243x(str, verificationTokenRequestParam) : wwh0Var.m208228A(str, verificationTokenRequestParam)).doOnNext(new y20() { // from class: l.bxh0
            @Override // p153l.y20
            public final void call(Object obj) {
                interfaceC10893a.mo47740b((VerificationToken) obj);
            }
        }).doOnError(new y20() { // from class: l.cxh0
            @Override // p153l.y20
            public final void call(Object obj) {
                interfaceC10893a.mo47742d((Throwable) obj);
            }
        }).filter(new qcj() { // from class: l.dxh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return TTFacertificationClient.m61381l(str2, interfaceC10893a, (VerificationToken) obj);
            }
        }).flatMap(new qcj() { // from class: l.exh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f96287a.m61393u(context, ktlVar, interfaceC10893a, str, verificationTokenRequestParam, (VerificationToken) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m61390r(InterfaceC10893a interfaceC10893a, VerificationToken verificationToken, jxf jxfVar) {
        interfaceC10893a.mo47741c(verificationToken, jxfVar);
        int i = this.f39694b + 1;
        this.f39694b = i;
        if (i > 1) {
            CrashHelper.m82479c(new InternalException("sdk loaded repeatedly at one time, loadedCount = " + this.f39694b));
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ C22421c m61391s(VerificationToken verificationToken, String str, jxf jxfVar) {
        return verificationToken.isTencentIntlProvider() ? this.f39693a.m208245z(str, verificationToken, jxfVar) : C22421c.just(jxfVar);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m61392t() {
        this.f39694b--;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C22421c m61393u(final Context context, ktl ktlVar, final InterfaceC10893a interfaceC10893a, final String str, final VerificationTokenRequestParam verificationTokenRequestParam, final VerificationToken verificationToken) {
        return RxFacertification.m61365d(context, ktlVar.mo151359a(verificationToken), verificationToken).doOnNext(new y20() { // from class: l.gxh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106945a.m61390r(interfaceC10893a, verificationToken, (jxf) obj);
            }
        }).flatMap(new qcj() { // from class: l.hxh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f112007a.m61391s(verificationToken, str, (jxf) obj);
            }
        }).doOnUnsubscribe(new x20() { // from class: l.ixh0
            @Override // p153l.x20
            public final void call() {
                this.f117418a.m61392t();
            }
        }).doOnError(new y20() { // from class: l.ywh0
            @Override // p153l.y20
            public final void call(Object obj) {
                TTFacertificationClient.m61375f(interfaceC10893a, verificationToken, (Throwable) obj);
            }
        }).flatMap(new qcj() { // from class: l.zwh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return RxFacertification.m61366e(context, verificationToken, verificationTokenRequestParam);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public C22421c<Envelope> m61394w(RxFacertification.C10892b c10892b, String str, int i) {
        return m61395x(c10892b, str, i, null);
    }

    /* JADX INFO: renamed from: x */
    public C22421c<Envelope> m61395x(RxFacertification.C10892b c10892b, String str, int i, JSONObject jSONObject) {
        VerificationTokenRequestParam verificationTokenRequestParam;
        JSONObject jSONObject2;
        String str2;
        String str3;
        String str4;
        kxf kxfVar = c10892b.f39690a;
        VerificationToken verificationToken = c10892b.f39691b;
        VerificationTokenRequestParam verificationTokenRequestParam2 = c10892b.f39692c;
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        try {
            if (i == 2) {
                if (verificationToken.isTencentProvider()) {
                    jSONObject5.put("provider", "tencent");
                    jSONObject5.put("orderNo", verificationToken.tencentToken.agreementNo);
                    jSONObject5.put("publicUserId", verificationToken.tencentToken.userId);
                    jSONObject5.put("providerAppId", m61386q());
                } else if (verificationToken.isALiProvider()) {
                    jSONObject5.put("provider", "aliyun");
                    jSONObject5.put("certifyId", verificationToken.certifyId);
                } else if (verificationToken.isVolcProvider()) {
                    jSONObject5.put("provider", "volcEnginePro");
                    VolcEngineProToken volcEngineProToken = verificationToken.volcEngineProToken;
                    jSONObject5.put("bytedanceToken", volcEngineProToken == null ? "" : volcEngineProToken.bytedanceToken);
                    jSONObject5.put("clientStatus", kxfVar.f129189b);
                }
                jSONObject5.put("withPV", verificationToken.withPV);
                jSONObject3.put("idCard", jSONObject5);
                verificationTokenRequestParam = verificationTokenRequestParam2;
                jSONObject3.put("productId", verificationTokenRequestParam.productId);
                str4 = RemoteConfigConstants.RequestFieldKey.APP_ID;
                str3 = "verifyType";
            } else {
                if (verificationToken.isTencentProvider()) {
                    verificationTokenRequestParam = verificationTokenRequestParam2;
                    jSONObject2 = jSONObject4;
                    jSONObject2.put("provider", "tencent");
                    jSONObject2.put("orderNo", verificationToken.tencentToken.agreementNo);
                    jSONObject2.put("publicUserId", verificationToken.tencentToken.userId);
                    jSONObject2.put("providerAppId", m61386q());
                } else {
                    jSONObject2 = jSONObject4;
                    if (verificationToken.isALiProvider()) {
                        verificationTokenRequestParam = verificationTokenRequestParam2;
                        jSONObject2.put("provider", "aliyun");
                        jSONObject2.put("certifyId", verificationToken.certifyId);
                    } else if (verificationToken.isMoMoProvider()) {
                        verificationTokenRequestParam = verificationTokenRequestParam2;
                        jSONObject2.put("provider", "momocv");
                        jSONObject2.put("personID", kxfVar.f129202o);
                    } else if (verificationToken.isTencentIntlProvider()) {
                        verificationTokenRequestParam = verificationTokenRequestParam2;
                        jSONObject2.put("provider", "tencentIntl");
                        jSONObject2.put("liveData", Base64.encodeToString(kxfVar.f129201n, 0));
                    } else if (verificationToken.isTencentIntlProviderV2()) {
                        verificationTokenRequestParam = verificationTokenRequestParam2;
                        jSONObject2.put("provider", "tencentIntlV2");
                        jSONObject2.put("tencentIntlToken", c10892b.f39691b.token);
                    } else if (verificationToken.isVolcProvider()) {
                        jSONObject2.put("provider", "volcEnginePro");
                        VolcEngineProToken volcEngineProToken2 = verificationToken.volcEngineProToken;
                        if (volcEngineProToken2 == null) {
                            verificationTokenRequestParam = verificationTokenRequestParam2;
                            str2 = "";
                        } else {
                            verificationTokenRequestParam = verificationTokenRequestParam2;
                            str2 = volcEngineProToken2.bytedanceToken;
                        }
                        jSONObject2.put("bytedanceToken", str2);
                        jSONObject2.put("clientStatus", kxfVar.f129189b);
                    } else if (verificationToken.isAliyunIntlProvider()) {
                        verificationTokenRequestParam = verificationTokenRequestParam2;
                        jSONObject2.put("provider", "aliyunIntl");
                        jSONObject2.put("transactionId", verificationToken.transactionId);
                    }
                }
                verificationTokenRequestParam = verificationTokenRequestParam2;
                str3 = "verifyType";
                jSONObject3.put(str3, verificationTokenRequestParam.verifyType);
                String str5 = verificationTokenRequestParam.appId;
                str4 = RemoteConfigConstants.RequestFieldKey.APP_ID;
                jSONObject3.put(str4, str5);
                jSONObject3.put("productId", verificationTokenRequestParam.productId);
                jSONObject3.put("picture", jSONObject2);
            }
            if (i == 3 && NullChecker.m82486a(jSONObject)) {
                jSONObject3.put("ctdid", jSONObject);
            }
            if (TextUtils.equals(verificationTokenRequestParam.productId, Constants.VIA_SHARE_TYPE_INFO)) {
                jSONObject3.put("groupName", v3l0.m199281e().m199284d());
            }
            if (TextUtils.equals(verificationTokenRequestParam.productId, "7")) {
                jSONObject3.put("retrieveID", verificationTokenRequestParam.retrieveId);
                jSONObject3.put(str3, verificationTokenRequestParam.verifyType);
                jSONObject3.put(str4, verificationTokenRequestParam.appId);
            }
            jSONObject3.put("newProcess", verificationTokenRequestParam.newProcess);
            return TextUtils.equals(verificationTokenRequestParam.productId, "7") ? m61388y(jSONObject3) : this.f39693a.m208240M(str, jSONObject3);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return C22421c.error(e);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m61396z(VerificationTokenRequestParam verificationTokenRequestParam) {
        this.f39693a.m208241N(verificationTokenRequestParam);
    }
}
