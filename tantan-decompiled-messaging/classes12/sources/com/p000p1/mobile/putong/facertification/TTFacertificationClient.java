package com.p000p1.mobile.putong.facertification;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.SearchPriority;
import com.p000p1.mobile.putong.data.VerificationProcessIdentity;
import com.p000p1.mobile.putong.data.VerificationProcessParams;
import com.p000p1.mobile.putong.data.VerificationToken;
import com.p000p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p000p1.mobile.putong.data.VolcEngineProToken;
import com.p000p1.mobile.putong.facertification.RxFacertification;
import com.p000p1.mobile.putong.facertification.TTFacertificationClient;
import com.p1.mobile.putong.api.api.Network;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediamncertification.FacertificationSDKType;
import l.d30;
import l.e30;
import l.ia20;
import l.jo0;
import l.mqi0;
import l.puk0;
import l.qib0;
import l.utc0;
import l.v9j;
import l.vvf;
import l.vwb;
import l.w9j;
import l.wvf;
import l.xh5;
import org.json.JSONObject;
import p007l.poh0;
import p007l.xql;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class TTFacertificationClient {

    /* JADX INFO: renamed from: a */
    public final poh0 f306a;

    /* JADX INFO: renamed from: b */
    public int f307b;

    public static class InternalException extends Exception {
        private InternalException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.facertification.TTFacertificationClient$a */
    public interface InterfaceC1574a {
        /* JADX INFO: renamed from: a */
        void mo222a(VerificationToken verificationToken, RxFacertification.PreDetectException preDetectException);

        /* JADX INFO: renamed from: b */
        void mo223b(VerificationToken verificationToken);

        /* JADX INFO: renamed from: c */
        void mo224c(VerificationToken verificationToken, vvf vvfVar);

        /* JADX INFO: renamed from: d */
        void mo225d(Throwable th);

        /* JADX INFO: renamed from: e */
        void mo226e(VerificationToken verificationToken);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.facertification.TTFacertificationClient$b */
    public static final class C1575b {

        /* JADX INFO: renamed from: a */
        public static final TTFacertificationClient f308a = new TTFacertificationClient();
    }

    public TTFacertificationClient() {
        this.f306a = new poh0();
        this.f307b = 0;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m1109f(InterfaceC1574a interfaceC1574a, VerificationToken verificationToken, Throwable th) {
        if (th instanceof RxFacertification.PreDetectException) {
            interfaceC1574a.mo222a(verificationToken, (RxFacertification.PreDetectException) th);
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Boolean m1115l(String str, InterfaceC1574a interfaceC1574a, VerificationToken verificationToken) {
        if (!m1116m(verificationToken.provider)) {
            return Boolean.FALSE;
        }
        if (TextUtils.equals(str, "fromPicVerificationDlg") || TextUtils.equals(str, "fromNameVerificationDlg")) {
            return Boolean.TRUE;
        }
        if (!verificationToken.omitLiveData) {
            return Boolean.TRUE;
        }
        interfaceC1574a.mo226e(verificationToken);
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m1116m(String str) {
        return vwb.f0(new String[]{"tencentIntl", "aliyunIntl", "tencentIntlV2"}).contains(str);
    }

    /* JADX INFO: renamed from: n */
    public static c<Envelope> m1117n(String str) {
        final String strI = xh5.i("/users/me/verifications/" + str);
        return qib0.I.now("anchorVerification" + str, ia20.a(new v9j() { // from class: l.yoh0
            public final Object call() {
                return xh5.network.auth().q(strI).f().b();
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public static FacertificationSDKType m1118o(VerificationToken verificationToken) {
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
    public static TTFacertificationClient m1119p() {
        return C1575b.f308a;
    }

    /* JADX INFO: renamed from: q */
    public static String m1120q() {
        return "IDArltB0";
    }

    /* JADX INFO: renamed from: v */
    public static c<Envelope> m1121v(String str, String str2, String str3) {
        final String strI = xh5.i("/users/" + str + "/verifications/" + str + "?process=new");
        final VerificationProcessParams verificationProcessParamsNew_ = VerificationProcessParams.new_();
        VerificationProcessIdentity verificationProcessIdentityNew_ = VerificationProcessIdentity.new_();
        verificationProcessIdentityNew_.provider = str2;
        verificationProcessIdentityNew_.certifyId = str3;
        verificationProcessParamsNew_.identity = verificationProcessIdentityNew_;
        return qib0.I.now("processVerificationResult" + str, ia20.a(new v9j() { // from class: l.toh0
            public final Object call() {
                return xh5.network.auth().q(strI).k(utc0.create(Network.JSON, verificationProcessParamsNew_.toJson())).b();
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public static c<Envelope> m1122y(final JSONObject jSONObject) {
        final String strB = xh5.b("/retrieve/verification?process=new");
        return qib0.I.now("accountVerificationResult" + mqi0.o(), ia20.e(new v9j() { // from class: l.qoh0
            public final Object call() {
                return xh5.network.auth().q(strB).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).observeOn(jo0.a()));
    }

    /* JADX INFO: renamed from: A */
    public c<RxFacertification.C1573b> m1123A(final Context context, final String str, final VerificationTokenRequestParam verificationTokenRequestParam, @NonNull final xql xqlVar, @NonNull final InterfaceC1574a interfaceC1574a, final String str2) {
        boolean zEquals = TextUtils.equals(str2, "fromAccountBackH5");
        poh0 poh0Var = this.f306a;
        return (zEquals ? poh0Var.m13193x(str, verificationTokenRequestParam) : poh0Var.m13178A(str, verificationTokenRequestParam)).doOnNext(new e30() { // from class: l.uoh0
            public final void call(Object obj) {
                interfaceC1574a.mo223b((VerificationToken) obj);
            }
        }).doOnError(new e30() { // from class: l.voh0
            public final void call(Object obj) {
                interfaceC1574a.mo225d((Throwable) obj);
            }
        }).filter(new w9j() { // from class: l.woh0
            public final Object call(Object obj) {
                return TTFacertificationClient.m1115l(str2, interfaceC1574a, (VerificationToken) obj);
            }
        }).flatMap(new w9j() { // from class: l.xoh0
            public final Object call(Object obj) {
                return this.f15056a.m1127u(context, xqlVar, interfaceC1574a, str, verificationTokenRequestParam, (VerificationToken) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m1124r(InterfaceC1574a interfaceC1574a, VerificationToken verificationToken, vvf vvfVar) {
        interfaceC1574a.mo224c(verificationToken, vvfVar);
        int i = this.f307b + 1;
        this.f307b = i;
        if (i > 1) {
            CrashHelper.c(new InternalException("sdk loaded repeatedly at one time, loadedCount = " + this.f307b));
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ c m1125s(VerificationToken verificationToken, String str, vvf vvfVar) {
        return verificationToken.isTencentIntlProvider() ? this.f306a.m13195z(str, verificationToken, vvfVar) : c.just(vvfVar);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m1126t() {
        this.f307b--;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ c m1127u(final Context context, xql xqlVar, final InterfaceC1574a interfaceC1574a, final String str, final VerificationTokenRequestParam verificationTokenRequestParam, final VerificationToken verificationToken) {
        return RxFacertification.m1099d(context, xqlVar.m16802a(verificationToken), verificationToken).doOnNext(new e30() { // from class: l.zoh0
            public final void call(Object obj) {
                this.f15818a.m1124r(interfaceC1574a, verificationToken, (vvf) obj);
            }
        }).flatMap(new w9j() { // from class: l.aph0
            public final Object call(Object obj) {
                return this.f5800a.m1125s(verificationToken, str, (vvf) obj);
            }
        }).doOnUnsubscribe(new d30() { // from class: l.bph0
            public final void call() {
                this.f6401a.m1126t();
            }
        }).doOnError(new e30() { // from class: l.roh0
            public final void call(Object obj) {
                TTFacertificationClient.m1109f(interfaceC1574a, verificationToken, (Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.soh0
            public final Object call(Object obj) {
                return RxFacertification.m1100e(context, verificationToken, verificationTokenRequestParam);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public c<Envelope> m1128w(RxFacertification.C1573b c1573b, String str, int i) {
        return m1129x(c1573b, str, i, null);
    }

    /* JADX INFO: renamed from: x */
    public c<Envelope> m1129x(RxFacertification.C1573b c1573b, String str, int i, JSONObject jSONObject) {
        VerificationTokenRequestParam verificationTokenRequestParam;
        JSONObject jSONObject2;
        String str2;
        String str3;
        String str4;
        wvf wvfVar = c1573b.f303a;
        VerificationToken verificationToken = c1573b.f304b;
        VerificationTokenRequestParam verificationTokenRequestParam2 = c1573b.f305c;
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        try {
            if (i == 2) {
                if (verificationToken.isTencentProvider()) {
                    jSONObject5.put("provider", "tencent");
                    jSONObject5.put("orderNo", verificationToken.tencentToken.agreementNo);
                    jSONObject5.put("publicUserId", verificationToken.tencentToken.userId);
                    jSONObject5.put("providerAppId", m1120q());
                } else if (verificationToken.isALiProvider()) {
                    jSONObject5.put("provider", "aliyun");
                    jSONObject5.put("certifyId", verificationToken.certifyId);
                } else if (verificationToken.isVolcProvider()) {
                    jSONObject5.put("provider", "volcEnginePro");
                    VolcEngineProToken volcEngineProToken = verificationToken.volcEngineProToken;
                    jSONObject5.put("bytedanceToken", volcEngineProToken == null ? "" : volcEngineProToken.bytedanceToken);
                    jSONObject5.put("clientStatus", wvfVar.b);
                }
                jSONObject5.put("withPV", verificationToken.withPV);
                jSONObject3.put(SearchPriority.idCard, jSONObject5);
                verificationTokenRequestParam = verificationTokenRequestParam2;
                jSONObject3.put("productId", verificationTokenRequestParam.productId);
                str4 = "appId";
                str3 = "verifyType";
            } else {
                if (verificationToken.isTencentProvider()) {
                    verificationTokenRequestParam = verificationTokenRequestParam2;
                    jSONObject2 = jSONObject4;
                    jSONObject2.put("provider", "tencent");
                    jSONObject2.put("orderNo", verificationToken.tencentToken.agreementNo);
                    jSONObject2.put("publicUserId", verificationToken.tencentToken.userId);
                    jSONObject2.put("providerAppId", m1120q());
                } else {
                    jSONObject2 = jSONObject4;
                    if (verificationToken.isALiProvider()) {
                        verificationTokenRequestParam = verificationTokenRequestParam2;
                        jSONObject2.put("provider", "aliyun");
                        jSONObject2.put("certifyId", verificationToken.certifyId);
                    } else if (verificationToken.isMoMoProvider()) {
                        verificationTokenRequestParam = verificationTokenRequestParam2;
                        jSONObject2.put("provider", "momocv");
                        jSONObject2.put("personID", wvfVar.o);
                    } else if (verificationToken.isTencentIntlProvider()) {
                        verificationTokenRequestParam = verificationTokenRequestParam2;
                        jSONObject2.put("provider", "tencentIntl");
                        jSONObject2.put("liveData", Base64.encodeToString(wvfVar.n, 0));
                    } else if (verificationToken.isTencentIntlProviderV2()) {
                        verificationTokenRequestParam = verificationTokenRequestParam2;
                        jSONObject2.put("provider", "tencentIntlV2");
                        jSONObject2.put("tencentIntlToken", c1573b.f304b.token);
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
                        jSONObject2.put("clientStatus", wvfVar.b);
                    } else if (verificationToken.isAliyunIntlProvider()) {
                        verificationTokenRequestParam = verificationTokenRequestParam2;
                        jSONObject2.put("provider", "aliyunIntl");
                        jSONObject2.put("transactionId", verificationToken.transactionId);
                    }
                }
                verificationTokenRequestParam = verificationTokenRequestParam2;
                str3 = "verifyType";
                jSONObject3.put(str3, verificationTokenRequestParam.verifyType);
                str4 = "appId";
                jSONObject3.put(str4, verificationTokenRequestParam.appId);
                jSONObject3.put("productId", verificationTokenRequestParam.productId);
                jSONObject3.put("picture", jSONObject2);
            }
            if (i == 3 && NullChecker.a(jSONObject)) {
                jSONObject3.put("ctdid", jSONObject);
            }
            if (TextUtils.equals(verificationTokenRequestParam.productId, "6")) {
                jSONObject3.put("groupName", puk0.e().d());
            }
            if (TextUtils.equals(verificationTokenRequestParam.productId, "7")) {
                jSONObject3.put("retrieveID", verificationTokenRequestParam.retrieveId);
                jSONObject3.put(str3, verificationTokenRequestParam.verifyType);
                jSONObject3.put(str4, verificationTokenRequestParam.appId);
            }
            jSONObject3.put("newProcess", verificationTokenRequestParam.newProcess);
            return TextUtils.equals(verificationTokenRequestParam.productId, "7") ? m1122y(jSONObject3) : this.f306a.m13190M(str, jSONObject3);
        } catch (Exception e) {
            CrashHelper.c(e);
            return c.error(e);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m1130z(VerificationTokenRequestParam verificationTokenRequestParam) {
        this.f306a.m13191N(verificationTokenRequestParam);
    }
}
