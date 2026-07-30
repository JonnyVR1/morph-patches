package p153l;

import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.SurveySparrowData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/hdh0;", "Ll/xi5;", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/data/SurveySparrowData;", "D", "()Lrx/c;", "", "token", "F", "(Ljava/lang/String;)Lrx/c;", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class hdh0 extends xi5 {
    /* JADX INFO: renamed from: A */
    public static C22421c m134596A(Throwable th) {
        return C22421c.empty();
    }

    /* JADX INFO: renamed from: C */
    public static C22421c m134598C(Throwable th) {
        return C22421c.empty();
    }

    /* JADX INFO: renamed from: E */
    public static final x1d0 m134599E() {
        return uqb0.f180376H.auth().m209043q(xi5.m211107i("/survey/token")).m209032f().m209028b();
    }

    /* JADX INFO: renamed from: G */
    public static final x1d0 m134600G(JSONObject jSONObject) {
        return uqb0.f180376H.auth().m209043q(xi5.m211107i("/survey/submit")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: x */
    public static C22421c m134601x() {
        return qi20.m176659f(new pcj() { // from class: l.fdh0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return hdh0.m134599E();
            }
        }, SurveySparrowData.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: z */
    public static C22421c m134603z(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("token", str);
        } catch (Exception unused) {
        }
        return qi20.m176658e(new pcj() { // from class: l.gdh0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return hdh0.m134600G(jSONObject);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final C22421c<SurveySparrowData> m134604D() {
        C22421c<SurveySparrowData> c22421cCompose = scheduled("get_survey_token", 0, new pcj() { // from class: l.bdh0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return hdh0.m134601x();
            }
        }).onErrorResumeNext(new qcj() { // from class: l.cdh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return hdh0.m134596A((Throwable) obj);
            }
        }).compose(psd0.m173592C());
        c22421cCompose.getClass();
        return c22421cCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final C22421c<?> m134605F(@NotNull final String token) {
        token.getClass();
        C22421c<?> c22421cCompose = scheduled("submit_survey", -1, new pcj() { // from class: l.ddh0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return hdh0.m134603z(token);
            }
        }).onErrorResumeNext(new qcj() { // from class: l.edh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return hdh0.m134598C((Throwable) obj);
            }
        }).compose(psd0.m173592C());
        c22421cCompose.getClass();
        return c22421cCompose;
    }
}
