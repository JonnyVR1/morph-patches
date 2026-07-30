package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveUndercoverGame;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class nuj0 {
    /* JADX INFO: renamed from: i */
    public static String m164804i() {
        return zvr.m221802b("/voice-lives/");
    }

    /* JADX INFO: renamed from: j */
    public static String m164805j() {
        return zvr.m221802b("/voice-undercovers/");
    }

    /* JADX INFO: renamed from: k */
    public static C22421c<BLiveUndercoverGame> m164806k(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return C22421c.create(new C22421c.a() { // from class: l.luj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((gcg0) obj).onError(new RuntimeException("Empty undercoverId"));
                }
            });
        }
        String str3 = m164805j() + str + "/votes";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("candidateUserId", str2);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        return vrv.m202556q(rnl.m182265r(str3), str3, BLiveExtraResponse.JSON_ADAPTER, jSONObject.toString()).map(new qcj() { // from class: l.muj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveExtraResponse) obj).data.undercoverGame;
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static C22421c<BLiveUndercoverGame> m164807l(String str) {
        if (TextUtils.isEmpty(str)) {
            return C22421c.create(new C22421c.a() { // from class: l.huj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((gcg0) obj).onError(new RuntimeException("Empty liveId"));
                }
            });
        }
        String str2 = m164804i() + str + "/undercovers";
        return vrv.m202550k(rnl.m182265r(str2), str2, BLiveExtraResponse.JSON_ADAPTER).map(new qcj() { // from class: l.iuj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveExtraResponse) obj).data.undercoverGame;
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static C22421c<BLiveUndercoverGame> m164808m(String str) {
        if (TextUtils.isEmpty(str)) {
            return C22421c.create(new C22421c.a() { // from class: l.fuj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((gcg0) obj).onError(new RuntimeException("Empty liveId"));
                }
            });
        }
        String str2 = m164804i() + str + "/voice-undercovers";
        return vrv.m202556q(rnl.m182265r(str2), str2, BLiveExtraResponse.JSON_ADAPTER, "").map(new qcj() { // from class: l.guj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveExtraResponse) obj).data.undercoverGame;
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static C22421c<BLiveUndercoverGame> m164809n(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return C22421c.create(new C22421c.a() { // from class: l.juj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((gcg0) obj).onError(new RuntimeException("Empty liveId"));
                }
            });
        }
        String str4 = m164804i() + str + "/voice-undercovers/" + str2;
        return vrv.m202553n(rnl.m182265r(str4).m182288p().m182300c("action", str3).m182301d(), str4, BLiveExtraResponse.JSON_ADAPTER, "").map(new qcj() { // from class: l.kuj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveExtraResponse) obj).data.undercoverGame;
            }
        });
    }
}
