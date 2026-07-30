package p149l;

import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.SurveySparrowData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Ll/z4h0;", "Ll/xh5;", "<init>", "()V", "Lrx/c;", "Lcom/p1/mobile/putong/data/SurveySparrowData;", "D", "()Lrx/c;", "", "token", "F", "(Ljava/lang/String;)Lrx/c;", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class z4h0 extends xh5 {
    /* JADX INFO: renamed from: A */
    public static C22306c m217083A(Throwable th) {
        return C22306c.empty();
    }

    /* JADX INFO: renamed from: C */
    public static C22306c m217085C(Throwable th) {
        return C22306c.empty();
    }

    /* JADX INFO: renamed from: E */
    public static final stc0 m217086E() {
        return qib0.f154693H.auth().m185898q(xh5.m208761i("/survey/token")).m185887f().m185883b();
    }

    /* JADX INFO: renamed from: G */
    public static final stc0 m217087G(JSONObject jSONObject) {
        return qib0.f154693H.auth().m185898q(xh5.m208761i("/survey/submit")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: x */
    public static C22306c m217088x() {
        return ia20.m135122f(new v9j() { // from class: l.x4h0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return z4h0.m217086E();
            }
        }, SurveySparrowData.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: z */
    public static C22306c m217090z(String str) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("token", str);
        } catch (Exception unused) {
        }
        return ia20.m135121e(new v9j() { // from class: l.y4h0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return z4h0.m217087G(jSONObject);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final C22306c<SurveySparrowData> m217091D() {
        C22306c<SurveySparrowData> c22306cCompose = scheduled("get_survey_token", 0, new v9j() { // from class: l.t4h0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return z4h0.m217088x();
            }
        }).onErrorResumeNext(new w9j() { // from class: l.u4h0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return z4h0.m217083A((Throwable) obj);
            }
        }).compose(mkd0.m154951C());
        c22306cCompose.getClass();
        return c22306cCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final C22306c<?> m217092F(@NotNull final String token) {
        token.getClass();
        C22306c<?> c22306cCompose = scheduled("submit_survey", -1, new v9j() { // from class: l.v4h0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return z4h0.m217090z(token);
            }
        }).onErrorResumeNext(new w9j() { // from class: l.w4h0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return z4h0.m217085C((Throwable) obj);
            }
        }).compose(mkd0.m154951C());
        c22306cCompose.getClass();
        return c22306cCompose;
    }
}
