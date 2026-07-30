package com.p046p1.mobile.putong.facertification;

import android.content.Context;
import com.p046p1.mobile.putong.data.VerificationToken;
import com.p046p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p046p1.mobile.putong.facertification.RxFacertification;
import com.p046p1.mobile.putong.facertification.TTFacertificationClient;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.media.ttmediamncertification.FacertificationSDKType;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p149l.vnh0;
import p149l.vvf;
import p149l.wvf;
import p149l.yql;
import p149l.z3g0;

/* JADX INFO: loaded from: classes12.dex */
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
    public class C10728a implements yql.InterfaceC21480a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f38840a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f38841b;

        public C10728a(z3g0 z3g0Var, Map map) {
            this.f38840a = z3g0Var;
            this.f38841b = map;
        }

        @Override // p149l.yql.InterfaceC21480a
        /* JADX INFO: renamed from: a */
        public void mo60183a(vvf vvfVar) {
            try {
                this.f38840a.onNext(vvfVar);
                this.f38840a.onCompleted();
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                this.f38840a.onError(new PreDetectException(vvfVar, e, this.f38841b));
            }
        }

        @Override // p149l.yql.InterfaceC21480a
        /* JADX INFO: renamed from: b */
        public void mo60184b() {
        }

        @Override // p149l.yql.InterfaceC21480a
        /* JADX INFO: renamed from: c */
        public void mo60185c(vvf vvfVar) {
            this.f38840a.onError(new PreDetectException(vvfVar, new RuntimeException("error occurs during preDetect for option"), this.f38841b));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.facertification.RxFacertification$b */
    public static final class C10729b {

        /* JADX INFO: renamed from: a */
        public final wvf f38842a;

        /* JADX INFO: renamed from: b */
        public final VerificationToken f38843b;

        /* JADX INFO: renamed from: c */
        public final VerificationTokenRequestParam f38844c;

        public C10729b(wvf wvfVar, VerificationToken verificationToken, VerificationTokenRequestParam verificationTokenRequestParam) {
            this.f38842a = wvfVar;
            this.f38843b = verificationToken;
            this.f38844c = verificationTokenRequestParam;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m60179b(final VerificationToken verificationToken, final VerificationTokenRequestParam verificationTokenRequestParam, Context context, FacertificationSDKType facertificationSDKType, final z3g0 z3g0Var) {
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
        vnh0.m199014a().mo211258b(context, facertificationSDKType, map, new yql.InterfaceC21481b() { // from class: l.bjd0
            @Override // p149l.yql.InterfaceC21481b
            /* JADX INFO: renamed from: a */
            public final void mo102166a(wvf wvfVar) {
                RxFacertification.m60180c(z3g0Var, verificationToken, verificationTokenRequestParam, wvfVar);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m60180c(z3g0 z3g0Var, VerificationToken verificationToken, VerificationTokenRequestParam verificationTokenRequestParam, wvf wvfVar) {
        try {
            z3g0Var.onNext(new C10729b(wvfVar, verificationToken, verificationTokenRequestParam));
            z3g0Var.onCompleted();
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            z3g0Var.onError(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static C22306c<vvf> m60181d(final Context context, final Map<String, Object> map, @NotNull final VerificationToken verificationToken) {
        return C22306c.create(new C22306c.a() { // from class: l.ajd0
            @Override // p149l.e30
            public final void call(Object obj) {
                Context context2 = context;
                Map map2 = map;
                vnh0.m199014a().mo211257a(context2, new HashMap<>(map2), TTFacertificationClient.m60200o(verificationToken), new RxFacertification.C10728a((z3g0) obj, map2));
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static C22306c<C10729b> m60182e(final Context context, final VerificationToken verificationToken, final VerificationTokenRequestParam verificationTokenRequestParam) {
        final FacertificationSDKType facertificationSDKTypeM60200o = TTFacertificationClient.m60200o(verificationToken);
        return C22306c.create(new C22306c.a() { // from class: l.zid0
            @Override // p149l.e30
            public final void call(Object obj) {
                RxFacertification.m60179b(verificationToken, verificationTokenRequestParam, context, facertificationSDKTypeM60200o, (z3g0) obj);
            }
        });
    }
}
