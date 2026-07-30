package com.p046p1.mobile.putong.facertification;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.VerificationProcessIdentity;
import com.p046p1.mobile.putong.data.VerificationProcessParams;
import com.p046p1.mobile.putong.data.VerificationToken;
import com.p046p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p046p1.mobile.putong.data.VolcEngineProToken;
import com.p046p1.mobile.putong.facertification.RxFacertification;
import com.p046p1.mobile.putong.facertification.TTFacertificationClient;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediamncertification.FacertificationSDKType;
import com.tencent.connect.common.Constants;
import org.json.JSONObject;
import p133rx.C22306c;
import p149l.d30;
import p149l.e30;
import p149l.ia20;
import p149l.jo0;
import p149l.mqi0;
import p149l.poh0;
import p149l.puk0;
import p149l.qib0;
import p149l.v9j;
import p149l.vvf;
import p149l.vwb;
import p149l.w9j;
import p149l.wvf;
import p149l.xh5;
import p149l.xql;

/* JADX INFO: loaded from: classes12.dex */
public class TTFacertificationClient {

    /* JADX INFO: renamed from: a */
    public final poh0 f38845a;

    /* JADX INFO: renamed from: b */
    public int f38846b;

    public static class InternalException extends Exception {
        private InternalException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.facertification.TTFacertificationClient$a */
    public interface InterfaceC10730a {
        /* JADX INFO: renamed from: a */
        void mo46556a(VerificationToken verificationToken, RxFacertification.PreDetectException preDetectException);

        /* JADX INFO: renamed from: b */
        void mo46557b(VerificationToken verificationToken);

        /* JADX INFO: renamed from: c */
        void mo46558c(VerificationToken verificationToken, vvf vvfVar);

        /* JADX INFO: renamed from: d */
        void mo46559d(Throwable th);

        /* JADX INFO: renamed from: e */
        void mo46560e(VerificationToken verificationToken);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.facertification.TTFacertificationClient$b */
    public static final class C10731b {

        /* JADX INFO: renamed from: a */
        public static final TTFacertificationClient f38847a = new TTFacertificationClient();
    }

    public TTFacertificationClient() {
        this.f38845a = new poh0();
        this.f38846b = 0;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m60191f(InterfaceC10730a interfaceC10730a, VerificationToken verificationToken, Throwable th) {
        if (th instanceof RxFacertification.PreDetectException) {
            interfaceC10730a.mo46556a(verificationToken, (RxFacertification.PreDetectException) th);
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Boolean m60197l(String str, InterfaceC10730a interfaceC10730a, VerificationToken verificationToken) {
        if (!m60198m(verificationToken.provider)) {
            return Boolean.FALSE;
        }
        if (TextUtils.equals(str, "fromPicVerificationDlg") || TextUtils.equals(str, "fromNameVerificationDlg")) {
            return Boolean.TRUE;
        }
        if (!verificationToken.omitLiveData) {
            return Boolean.TRUE;
        }
        interfaceC10730a.mo46560e(verificationToken);
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m60198m(String str) {
        return vwb.m200324f0("tencentIntl", "aliyunIntl", "tencentIntlV2").contains(str);
    }

    /* JADX INFO: renamed from: n */
    public static C22306c<Envelope> m60199n(String str) {
        final String strM208761i = xh5.m208761i("/users/me/verifications/" + str);
        return qib0.f154694I.now("anchorVerification" + str, ia20.m135117a(new v9j() { // from class: l.yoh0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xh5.network.auth().m185898q(strM208761i).m185887f().m185883b();
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public static FacertificationSDKType m60200o(VerificationToken verificationToken) {
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
    public static TTFacertificationClient m60201p() {
        return C10731b.f38847a;
    }

    /* JADX INFO: renamed from: q */
    public static String m60202q() {
        return "IDArltB0";
    }

    /* JADX INFO: renamed from: v */
    public static C22306c<Envelope> m60203v(String str, String str2, String str3) {
        final String strM208761i = xh5.m208761i("/users/" + str + "/verifications/" + str + "?process=new");
        final VerificationProcessParams verificationProcessParamsNew_ = VerificationProcessParams.new_();
        VerificationProcessIdentity verificationProcessIdentityNew_ = VerificationProcessIdentity.new_();
        verificationProcessIdentityNew_.provider = str2;
        verificationProcessIdentityNew_.certifyId = str3;
        verificationProcessParamsNew_.identity = verificationProcessIdentityNew_;
        return qib0.f154694I.now("processVerificationResult" + str, ia20.m135117a(new v9j() { // from class: l.toh0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xh5.network.auth().m185898q(strM208761i).m185892k(utc0.create(Network.JSON, verificationProcessParamsNew_.toJson())).m185883b();
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public static C22306c<Envelope> m60204y(final JSONObject jSONObject) {
        final String strM208754b = xh5.m208754b("/retrieve/verification?process=new");
        return qib0.f154694I.now("accountVerificationResult" + mqi0.m155944o(), ia20.m135121e(new v9j() { // from class: l.qoh0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xh5.network.auth().m185898q(strM208754b).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).observeOn(jo0.m142408a()));
    }

    /* JADX INFO: renamed from: A */
    public C22306c<RxFacertification.C10729b> m60205A(final Context context, final String str, final VerificationTokenRequestParam verificationTokenRequestParam, @NonNull final xql xqlVar, @NonNull final InterfaceC10730a interfaceC10730a, final String str2) {
        boolean zEquals = TextUtils.equals(str2, "fromAccountBackH5");
        poh0 poh0Var = this.f38845a;
        return (zEquals ? poh0Var.m170595x(str, verificationTokenRequestParam) : poh0Var.m170580A(str, verificationTokenRequestParam)).doOnNext(new e30() { // from class: l.uoh0
            @Override // p149l.e30
            public final void call(Object obj) {
                interfaceC10730a.mo46557b((VerificationToken) obj);
            }
        }).doOnError(new e30() { // from class: l.voh0
            @Override // p149l.e30
            public final void call(Object obj) {
                interfaceC10730a.mo46559d((Throwable) obj);
            }
        }).filter(new w9j() { // from class: l.woh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return TTFacertificationClient.m60197l(str2, interfaceC10730a, (VerificationToken) obj);
            }
        }).flatMap(new w9j() { // from class: l.xoh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f193840a.m60209u(context, xqlVar, interfaceC10730a, str, verificationTokenRequestParam, (VerificationToken) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m60206r(InterfaceC10730a interfaceC10730a, VerificationToken verificationToken, vvf vvfVar) {
        interfaceC10730a.mo46558c(verificationToken, vvfVar);
        int i = this.f38846b + 1;
        this.f38846b = i;
        if (i > 1) {
            CrashHelper.m81296c(new InternalException("sdk loaded repeatedly at one time, loadedCount = " + this.f38846b));
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ C22306c m60207s(VerificationToken verificationToken, String str, vvf vvfVar) {
        return verificationToken.isTencentIntlProvider() ? this.f38845a.m170597z(str, verificationToken, vvfVar) : C22306c.just(vvfVar);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m60208t() {
        this.f38846b--;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C22306c m60209u(final Context context, xql xqlVar, final InterfaceC10730a interfaceC10730a, final String str, final VerificationTokenRequestParam verificationTokenRequestParam, final VerificationToken verificationToken) {
        return RxFacertification.m60181d(context, xqlVar.mo180312a(verificationToken), verificationToken).doOnNext(new e30() { // from class: l.zoh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204112a.m60206r(interfaceC10730a, verificationToken, (vvf) obj);
            }
        }).flatMap(new w9j() { // from class: l.aph0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f71046a.m60207s(verificationToken, str, (vvf) obj);
            }
        }).doOnUnsubscribe(new d30() { // from class: l.bph0
            @Override // p149l.d30
            public final void call() {
                this.f76627a.m60208t();
            }
        }).doOnError(new e30() { // from class: l.roh0
            @Override // p149l.e30
            public final void call(Object obj) {
                TTFacertificationClient.m60191f(interfaceC10730a, verificationToken, (Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.soh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return RxFacertification.m60182e(context, verificationToken, verificationTokenRequestParam);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public C22306c<Envelope> m60210w(RxFacertification.C10729b c10729b, String str, int i) {
        return m60211x(c10729b, str, i, null);
    }

    /* JADX INFO: renamed from: x */
    public C22306c<Envelope> m60211x(RxFacertification.C10729b c10729b, String str, int i, JSONObject jSONObject) {
        VerificationTokenRequestParam verificationTokenRequestParam;
        JSONObject jSONObject2;
        String str2;
        String str3;
        String str4;
        wvf wvfVar = c10729b.f38842a;
        VerificationToken verificationToken = c10729b.f38843b;
        VerificationTokenRequestParam verificationTokenRequestParam2 = c10729b.f38844c;
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        try {
            if (i == 2) {
                if (verificationToken.isTencentProvider()) {
                    jSONObject5.put("provider", "tencent");
                    jSONObject5.put("orderNo", verificationToken.tencentToken.agreementNo);
                    jSONObject5.put("publicUserId", verificationToken.tencentToken.userId);
                    jSONObject5.put("providerAppId", m60202q());
                } else if (verificationToken.isALiProvider()) {
                    jSONObject5.put("provider", "aliyun");
                    jSONObject5.put("certifyId", verificationToken.certifyId);
                } else if (verificationToken.isVolcProvider()) {
                    jSONObject5.put("provider", "volcEnginePro");
                    VolcEngineProToken volcEngineProToken = verificationToken.volcEngineProToken;
                    jSONObject5.put("bytedanceToken", volcEngineProToken == null ? "" : volcEngineProToken.bytedanceToken);
                    jSONObject5.put("clientStatus", wvfVar.f188237b);
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
                    jSONObject2.put("providerAppId", m60202q());
                } else {
                    jSONObject2 = jSONObject4;
                    if (verificationToken.isALiProvider()) {
                        verificationTokenRequestParam = verificationTokenRequestParam2;
                        jSONObject2.put("provider", "aliyun");
                        jSONObject2.put("certifyId", verificationToken.certifyId);
                    } else if (verificationToken.isMoMoProvider()) {
                        verificationTokenRequestParam = verificationTokenRequestParam2;
                        jSONObject2.put("provider", "momocv");
                        jSONObject2.put("personID", wvfVar.f188250o);
                    } else if (verificationToken.isTencentIntlProvider()) {
                        verificationTokenRequestParam = verificationTokenRequestParam2;
                        jSONObject2.put("provider", "tencentIntl");
                        jSONObject2.put("liveData", Base64.encodeToString(wvfVar.f188249n, 0));
                    } else if (verificationToken.isTencentIntlProviderV2()) {
                        verificationTokenRequestParam = verificationTokenRequestParam2;
                        jSONObject2.put("provider", "tencentIntlV2");
                        jSONObject2.put("tencentIntlToken", c10729b.f38843b.token);
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
                        jSONObject2.put("clientStatus", wvfVar.f188237b);
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
            if (i == 3 && NullChecker.m81303a(jSONObject)) {
                jSONObject3.put("ctdid", jSONObject);
            }
            if (TextUtils.equals(verificationTokenRequestParam.productId, Constants.VIA_SHARE_TYPE_INFO)) {
                jSONObject3.put("groupName", puk0.m171431e().m171434d());
            }
            if (TextUtils.equals(verificationTokenRequestParam.productId, "7")) {
                jSONObject3.put("retrieveID", verificationTokenRequestParam.retrieveId);
                jSONObject3.put(str3, verificationTokenRequestParam.verifyType);
                jSONObject3.put(str4, verificationTokenRequestParam.appId);
            }
            jSONObject3.put("newProcess", verificationTokenRequestParam.newProcess);
            return TextUtils.equals(verificationTokenRequestParam.productId, "7") ? m60204y(jSONObject3) : this.f38845a.m170592M(str, jSONObject3);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return C22306c.error(e);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m60212z(VerificationTokenRequestParam verificationTokenRequestParam) {
        this.f38845a.m170593N(verificationTokenRequestParam);
    }
}
