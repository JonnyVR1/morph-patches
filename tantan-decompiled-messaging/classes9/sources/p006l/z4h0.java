package p006l;

import com.p000p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.data.SurveySparrowData;
import kotlin.Metadata;
import l.mkd0;
import l.stc0;
import l.utc0;
import l.v9j;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ll/z4h0;", "Ll/xh5;", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/data/SurveySparrowData;", "D", "()Lrx/c;", "", "token", "F", "(Ljava/lang/String;)Lrx/c;", "putong-common_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z4h0 extends xh5 {
    /* JADX INFO: renamed from: A */
    public static c m28560A(Throwable th) {
        return c.empty();
    }

    /* JADX INFO: renamed from: C */
    public static c m28562C(Throwable th) {
        return c.empty();
    }

    /* JADX INFO: renamed from: E */
    public static final stc0 m28563E() {
        return qib0.f19784H.auth().q(xh5.m27250i("/survey/token")).f().b();
    }

    /* JADX INFO: renamed from: G */
    public static final stc0 m28564G(JSONObject jSONObject) {
        return qib0.f19784H.auth().q(xh5.m27250i("/survey/submit")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: x */
    public static c m28565x() {
        return ia20.m16572f(new v9j() { // from class: l.x4h0
            public final Object call() {
                return z4h0.m28563E();
            }
        }, SurveySparrowData.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: z */
    public static c m28567z(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("token", str);
        } catch (Exception unused) {
        }
        return ia20.m16571e(new v9j() { // from class: l.y4h0
            public final Object call() {
                return z4h0.m28564G(jSONObject);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final c<SurveySparrowData> m28568D() {
        c<SurveySparrowData> cVarCompose = scheduled("get_survey_token", 0, new v9j() { // from class: l.t4h0
            public final Object call() {
                return z4h0.m28565x();
            }
        }).onErrorResumeNext(new w9j() { // from class: l.u4h0
            public final Object call(Object obj) {
                return z4h0.m28560A((Throwable) obj);
            }
        }).compose(mkd0.C());
        cVarCompose.getClass();
        return cVarCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final c<?> m28569F(@NotNull final String token) {
        token.getClass();
        c<?> cVarCompose = scheduled("submit_survey", -1, new v9j() { // from class: l.v4h0
            public final Object call() {
                return z4h0.m28567z(token);
            }
        }).onErrorResumeNext(new w9j() { // from class: l.w4h0
            public final Object call(Object obj) {
                return z4h0.m28562C((Throwable) obj);
            }
        }).compose(mkd0.C());
        cVarCompose.getClass();
        return cVarCompose;
    }
}
