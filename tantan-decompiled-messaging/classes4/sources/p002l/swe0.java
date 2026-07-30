package p002l;

import com.alibaba.fastjson.JSONObject;
import com.p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p1.mobile.putong.live.base.data.BLiveShootGameInfo;
import com.p1.mobile.putong.live.base.data.BLiveShootGameTask;
import l.cll;
import l.upv;
import l.w9j;
import l.ytr;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class swe0 {
    /* JADX INFO: renamed from: c */
    public c<BLiveShootGameTask> m22717c(String str, boolean z, int i, String str2) {
        cll.a aVarM = LiveApiBuilder.m(ytr.b("/shoot-game/users/" + str + "/tasks"));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isAnchor", Boolean.valueOf(z));
        jSONObject.put("receiveStatus", "completed");
        jSONObject.put("stage", Integer.valueOf(i));
        jSONObject.put("roomId", str2);
        return upv.q(aVarM.d(), "completedTask" + str + i, BLiveExtraResponse.JSON_ADAPTER, jSONObject.toJSONString()).map(new w9j() { // from class: l.rwe0
            public final Object call(Object obj) {
                return ((BLiveExtraResponse) obj).data.shootGameTask;
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public void m22718d(String str, int i) {
        cll.a aVarM = LiveApiBuilder.m(ytr.b("/shoot-game/users/" + str + "/task-duration"));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", Integer.valueOf(i));
        upv.p(aVarM.d(), "recordTaskCountDown" + str, jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: e */
    public c<BLiveShootGameInfo> m22719e(String str, boolean z) {
        cll.a aVarM = LiveApiBuilder.m(ytr.b("/shoot-game/users/" + str));
        aVarM.c("isAnchor", z ? "true" : "false");
        return upv.i(aVarM.d(), "requestShootGameInfo" + str, BLiveExtraResponse.JSON_ADAPTER).map(new w9j() { // from class: l.qwe0
            public final Object call(Object obj) {
                return ((BLiveExtraResponse) obj).data.shootGameUserInfo;
            }
        });
    }
}
