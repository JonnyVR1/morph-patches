package com.p000p1.mobile.putong.facertification;

import android.content.Context;
import com.p000p1.mobile.putong.data.VerificationToken;
import com.p000p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p000p1.mobile.putong.facertification.RxFacertification;
import com.p000p1.mobile.putong.facertification.TTFacertificationClient;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediamncertification.FacertificationSDKType;
import java.util.HashMap;
import java.util.Map;
import l.vnh0;
import l.vvf;
import l.wvf;
import l.yql;
import l.z3g0;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class RxFacertification {

    public static final class PreDetectException extends Exception {
        public final Map<String, Object> map;
        public final vvf prepareResult;

        public PreDetectException(vvf vvfVar, Throwable th, Map<String, Object> map) {
            super(th);
            HashMap map2 = new HashMap();
            this.map = map2;
            this.prepareResult = vvfVar;
            map2.putAll(map);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "PreDetectException{prepareResult=" + this.prepareResult + "},option = " + this.map + " ,origin = " + super.toString();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.facertification.RxFacertification$a */
    public class C1572a implements yql.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f301a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f302b;

        public C1572a(z3g0 z3g0Var, Map map) {
            this.f301a = z3g0Var;
            this.f302b = map;
        }

        /* JADX INFO: renamed from: a */
        public void m1101a(vvf vvfVar) {
            try {
                this.f301a.onNext(vvfVar);
                this.f301a.onCompleted();
            } catch (Exception e) {
                CrashHelper.c(e);
                this.f301a.onError(new PreDetectException(vvfVar, e, this.f302b));
            }
        }

        /* JADX INFO: renamed from: b */
        public void m1102b() {
        }

        /* JADX INFO: renamed from: c */
        public void m1103c(vvf vvfVar) {
            this.f301a.onError(new PreDetectException(vvfVar, new RuntimeException("error occurs during preDetect for option"), this.f302b));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.facertification.RxFacertification$b */
    public static final class C1573b {

        /* JADX INFO: renamed from: a */
        public final wvf f303a;

        /* JADX INFO: renamed from: b */
        public final VerificationToken f304b;

        /* JADX INFO: renamed from: c */
        public final VerificationTokenRequestParam f305c;

        public C1573b(wvf wvfVar, VerificationToken verificationToken, VerificationTokenRequestParam verificationTokenRequestParam) {
            this.f303a = wvfVar;
            this.f304b = verificationToken;
            this.f305c = verificationTokenRequestParam;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1097b(final VerificationToken verificationToken, final VerificationTokenRequestParam verificationTokenRequestParam, Context context, FacertificationSDKType facertificationSDKType, final z3g0 z3g0Var) {
        HashMap map = new HashMap();
        if (verificationToken.isALiProvider()) {
            map.put("option-key-token", verificationToken.certifyId);
        }
        if (verificationToken.isTencentIntlProvider()) {
            map.put("option-key-token", verificationToken.response.reflectSequence);
        }
        if (verificationToken.isTencentIntlProviderV2()) {
            map.put("option-key-token", verificationToken.token);
        }
        if (verificationToken.isMoMoProvider()) {
            map.put("option-key-mode", "VERIFY_SILENT");
            map.put("option-key-action-count", 4);
        }
        if (verificationToken.isAliyunIntlProvider()) {
            map.put("option-key-token", verificationToken.transactionId);
        }
        if (verificationToken.isVolcProvider()) {
            map.put("option-key-verity-type", verificationTokenRequestParam.verifyType);
            map.put("option-key-bytedance_token", verificationToken.volcEngineProToken.bytedanceToken);
            map.put("option-key-client_config", verificationToken.volcEngineProToken.clientConfig);
        }
        vnh0.a().b(context, facertificationSDKType, map, new yql.b() { // from class: l.bjd0
            /* JADX INFO: renamed from: a */
            public final void m8892a(wvf wvfVar) {
                RxFacertification.m1098c(z3g0Var, verificationToken, verificationTokenRequestParam, wvfVar);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1098c(z3g0 z3g0Var, VerificationToken verificationToken, VerificationTokenRequestParam verificationTokenRequestParam, wvf wvfVar) {
        try {
            z3g0Var.onNext(new C1573b(wvfVar, verificationToken, verificationTokenRequestParam));
            z3g0Var.onCompleted();
        } catch (Exception e) {
            CrashHelper.c(e);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static c<vvf> m1099d(final Context context, final Map<String, Object> map, @NotNull final VerificationToken verificationToken) {
        return c.create(new c.a() { // from class: l.ajd0
            public final void call(Object obj) {
                Context context2 = context;
                Map map2 = map;
                vnh0.a().a(context2, new HashMap(map2), TTFacertificationClient.m1118o(verificationToken), new RxFacertification.C1572a((z3g0) obj, map2));
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static c<C1573b> m1100e(final Context context, final VerificationToken verificationToken, final VerificationTokenRequestParam verificationTokenRequestParam) {
        final FacertificationSDKType facertificationSDKTypeM1118o = TTFacertificationClient.m1118o(verificationToken);
        return c.create(new c.a() { // from class: l.zid0
            public final void call(Object obj) {
                RxFacertification.m1097b(verificationToken, verificationTokenRequestParam, context, facertificationSDKTypeM1118o, (z3g0) obj);
            }
        });
    }
}
