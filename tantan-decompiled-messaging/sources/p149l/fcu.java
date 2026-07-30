package p149l;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.tantanapp.common.utils.CrashHelper;
import java.util.UUID;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class fcu {
    /* JADX INFO: renamed from: b */
    public static C22306c<roj0> m120464b(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        cll cllVarM67315u = LiveApiBuilder.m67315u(ytr.m216073b("/live/superChat/".concat(z ? "topChat" : "shoutingChat")), new mt0[0]);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("giftId", (Object) Integer.valueOf(str2));
            jSONObject.put("anchorId", (Object) str);
            jSONObject.put("fakeId", (Object) str3);
            jSONObject.put("content", (Object) str4);
            jSONObject.put("originalId", (Object) UUID.randomUUID().toString());
            jSONObject.put("roomId", (Object) str5);
            jSONObject.put("liveId", (Object) str6);
            jSONObject.put("liveType", (Object) "live");
            jSONObject.put("liveMode", (Object) "normal");
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        return upv.m194917e(cllVarM67315u, "sendTopChat" + str2, jSONObject.toString()).map(new w9j() { // from class: l.ecu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }
}
