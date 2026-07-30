package p149l;

import com.alibaba.fastjson.JSONObject;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveShootGameInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveShootGameTask;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class swe0 {
    /* JADX INFO: renamed from: c */
    public C22306c<BLiveShootGameTask> m186159c(String str, boolean z, int i, String str2) {
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/shoot-game/users/" + str + "/tasks"));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isAnchor", (Object) Boolean.valueOf(z));
        jSONObject.put("receiveStatus", (Object) "completed");
        jSONObject.put("stage", (Object) Integer.valueOf(i));
        jSONObject.put("roomId", (Object) str2);
        return upv.m194929q(c16188aM67307m.m107537d(), "completedTask" + str + i, BLiveExtraResponse.JSON_ADAPTER, jSONObject.toJSONString()).map(new w9j() { // from class: l.rwe0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveExtraResponse) obj).data.shootGameTask;
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public void m186160d(String str, int i) {
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/shoot-game/users/" + str + "/task-duration"));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BLiveOperationTitleShowType.duration, (Object) Integer.valueOf(i));
        upv.m194928p(c16188aM67307m.m107537d(), "recordTaskCountDown" + str, jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: e */
    public C22306c<BLiveShootGameInfo> m186161e(String str, boolean z) {
        cll.C16188a c16188aM67307m = LiveApiBuilder.m67307m(ytr.m216073b("/shoot-game/users/" + str));
        c16188aM67307m.m107536c("isAnchor", z ? "true" : "false");
        return upv.m194921i(c16188aM67307m.m107537d(), "requestShootGameInfo" + str, BLiveExtraResponse.JSON_ADAPTER).map(new w9j() { // from class: l.qwe0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveExtraResponse) obj).data.shootGameUserInfo;
            }
        });
    }
}
