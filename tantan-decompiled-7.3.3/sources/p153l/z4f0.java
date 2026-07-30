package p153l;

import com.alibaba.fastjson.JSONObject;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveShootGameInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveShootGameTask;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class z4f0 {
    /* JADX INFO: renamed from: c */
    public C22421c<BLiveShootGameTask> m218585c(String str, boolean z, int i, String str2) {
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/shoot-game/users/" + str + "/tasks"));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isAnchor", (Object) Boolean.valueOf(z));
        jSONObject.put("receiveStatus", (Object) "completed");
        jSONObject.put("stage", (Object) Integer.valueOf(i));
        jSONObject.put("roomId", (Object) str2);
        return vrv.m202556q(c19886aM68490m.m182301d(), "completedTask" + str + i, BLiveExtraResponse.JSON_ADAPTER, jSONObject.toJSONString()).map(new qcj() { // from class: l.y4f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveExtraResponse) obj).data.shootGameTask;
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public void m218586d(String str, int i) {
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/shoot-game/users/" + str + "/task-duration"));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BLiveOperationTitleShowType.duration, (Object) Integer.valueOf(i));
        vrv.m202555p(c19886aM68490m.m182301d(), "recordTaskCountDown" + str, jSONObject.toJSONString());
    }

    /* JADX INFO: renamed from: e */
    public C22421c<BLiveShootGameInfo> m218587e(String str, boolean z) {
        rnl.C19886a c19886aM68490m = LiveApiBuilder.m68490m(zvr.m221802b("/shoot-game/users/" + str));
        c19886aM68490m.m182300c("isAnchor", z ? "true" : "false");
        return vrv.m202548i(c19886aM68490m.m182301d(), "requestShootGameInfo" + str, BLiveExtraResponse.JSON_ADAPTER).map(new qcj() { // from class: l.x4f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveExtraResponse) obj).data.shootGameUserInfo;
            }
        });
    }
}
