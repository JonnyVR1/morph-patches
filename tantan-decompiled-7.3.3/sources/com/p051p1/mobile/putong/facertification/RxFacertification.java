package com.p051p1.mobile.putong.facertification;

import android.content.Context;
import com.p051p1.mobile.putong.data.VerificationToken;
import com.p051p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p051p1.mobile.putong.facertification.RxFacertification;
import com.p051p1.mobile.putong.facertification.TTFacertificationClient;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediamncertification.FacertificationSDKType;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p153l.cwh0;
import p153l.gcg0;
import p153l.jxf;
import p153l.kxf;
import p153l.ltl;

/* JADX INFO: loaded from: classes12.dex */
public class RxFacertification {

    public static final class PreDetectException extends Exception {
        public final Map<String, Object> map;
        public final jxf prepareResult;

        public PreDetectException(jxf jxfVar, Throwable th, Map<String, Object> map) {
            super(th);
            HashMap map2 = new HashMap();
            this.map = map2;
            this.prepareResult = jxfVar;
            map2.putAll(map);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "PreDetectException{prepareResult=" + this.prepareResult + "},option = " + this.map + " ,origin = " + super.toString();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.facertification.RxFacertification$a */
    public class C10891a implements ltl.InterfaceC18462a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gcg0 f39688a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f39689b;

        public C10891a(gcg0 gcg0Var, Map map) {
            this.f39688a = gcg0Var;
            this.f39689b = map;
        }

        @Override // p153l.ltl.InterfaceC18462a
        /* JADX INFO: renamed from: a */
        public void mo61367a(jxf jxfVar) {
            try {
                this.f39688a.onNext(jxfVar);
                this.f39688a.onCompleted();
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                this.f39688a.onError(new PreDetectException(jxfVar, e, this.f39689b));
            }
        }

        @Override // p153l.ltl.InterfaceC18462a
        /* JADX INFO: renamed from: b */
        public void mo61368b() {
        }

        @Override // p153l.ltl.InterfaceC18462a
        /* JADX INFO: renamed from: c */
        public void mo61369c(jxf jxfVar) {
            this.f39688a.onError(new PreDetectException(jxfVar, new RuntimeException("error occurs during preDetect for option"), this.f39689b));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.facertification.RxFacertification$b */
    public static final class C10892b {

        /* JADX INFO: renamed from: a */
        public final kxf f39690a;

        /* JADX INFO: renamed from: b */
        public final VerificationToken f39691b;

        /* JADX INFO: renamed from: c */
        public final VerificationTokenRequestParam f39692c;

        public C10892b(kxf kxfVar, VerificationToken verificationToken, VerificationTokenRequestParam verificationTokenRequestParam) {
            this.f39690a = kxfVar;
            this.f39691b = verificationToken;
            this.f39692c = verificationTokenRequestParam;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m61363b(final VerificationToken verificationToken, final VerificationTokenRequestParam verificationTokenRequestParam, Context context, FacertificationSDKType facertificationSDKType, final gcg0 gcg0Var) {
        HashMap<String, Object> map = new HashMap<>();
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
        cwh0.m112902a().mo155799b(context, facertificationSDKType, map, new ltl.InterfaceC18463b() { // from class: l.erd0
            @Override // p153l.ltl.InterfaceC18463b
            /* JADX INFO: renamed from: a */
            public final void mo122142a(kxf kxfVar) {
                RxFacertification.m61364c(gcg0Var, verificationToken, verificationTokenRequestParam, kxfVar);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m61364c(gcg0 gcg0Var, VerificationToken verificationToken, VerificationTokenRequestParam verificationTokenRequestParam, kxf kxfVar) {
        try {
            gcg0Var.onNext(new C10892b(kxfVar, verificationToken, verificationTokenRequestParam));
            gcg0Var.onCompleted();
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            gcg0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static C22421c<jxf> m61365d(final Context context, final Map<String, Object> map, @NotNull final VerificationToken verificationToken) {
        return C22421c.create(new C22421c.a() { // from class: l.drd0
            @Override // p153l.y20
            public final void call(Object obj) {
                Context context2 = context;
                Map map2 = map;
                cwh0.m112902a().mo155798a(context2, new HashMap<>(map2), TTFacertificationClient.m61384o(verificationToken), new RxFacertification.C10891a((gcg0) obj, map2));
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static C22421c<C10892b> m61366e(final Context context, final VerificationToken verificationToken, final VerificationTokenRequestParam verificationTokenRequestParam) {
        final FacertificationSDKType facertificationSDKTypeM61384o = TTFacertificationClient.m61384o(verificationToken);
        return C22421c.create(new C22421c.a() { // from class: l.crd0
            @Override // p153l.y20
            public final void call(Object obj) {
                RxFacertification.m61363b(verificationToken, verificationTokenRequestParam, context, facertificationSDKTypeM61384o, (gcg0) obj);
            }
        });
    }
}
