package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class klj0 {
    /* JADX INFO: renamed from: i */
    public static String m146411i() {
        return ytr.m216073b("/voice-lives/");
    }

    /* JADX INFO: renamed from: j */
    public static String m146412j() {
        return ytr.m216073b("/voice-undercovers/");
    }

    /* JADX INFO: renamed from: k */
    public static C22306c<BLiveUndercoverGame> m146413k(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return C22306c.create(new C22306c.a() { // from class: l.ilj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((z3g0) obj).onError(new RuntimeException("Empty undercoverId"));
                }
            });
        }
        String str3 = m146412j() + str + "/votes";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("candidateUserId", str2);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194929q(cll.m107501r(str3), str3, BLiveExtraResponse.JSON_ADAPTER, jSONObject.toString()).map(new w9j() { // from class: l.jlj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveExtraResponse) obj).data.undercoverGame;
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static C22306c<BLiveUndercoverGame> m146414l(String str) {
        if (TextUtils.isEmpty(str)) {
            return C22306c.create(new C22306c.a() { // from class: l.elj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((z3g0) obj).onError(new RuntimeException("Empty liveId"));
                }
            });
        }
        String str2 = m146411i() + str + "/undercovers";
        return upv.m194923k(cll.m107501r(str2), str2, BLiveExtraResponse.JSON_ADAPTER).map(new w9j() { // from class: l.flj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveExtraResponse) obj).data.undercoverGame;
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static C22306c<BLiveUndercoverGame> m146415m(String str) {
        if (TextUtils.isEmpty(str)) {
            return C22306c.create(new C22306c.a() { // from class: l.clj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((z3g0) obj).onError(new RuntimeException("Empty liveId"));
                }
            });
        }
        String str2 = m146411i() + str + "/voice-undercovers";
        return upv.m194929q(cll.m107501r(str2), str2, BLiveExtraResponse.JSON_ADAPTER, "").map(new w9j() { // from class: l.dlj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveExtraResponse) obj).data.undercoverGame;
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static C22306c<BLiveUndercoverGame> m146416n(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return C22306c.create(new C22306c.a() { // from class: l.glj0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((z3g0) obj).onError(new RuntimeException("Empty liveId"));
                }
            });
        }
        String str4 = m146411i() + str + "/voice-undercovers/" + str2;
        return upv.m194926n(cll.m107501r(str4).m107524p().m107536c("action", str3).m107537d(), str4, BLiveExtraResponse.JSON_ADAPTER, "").map(new w9j() { // from class: l.hlj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveExtraResponse) obj).data.undercoverGame;
            }
        });
    }
}
