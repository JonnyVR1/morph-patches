package p002l;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.tantanapp.common.utils.CrashHelper;
import java.util.UUID;
import l.cll;
import l.mt0;
import l.roj0;
import l.upv;
import l.w9j;
import l.ytr;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fcu {
    /* JADX INFO: renamed from: b */
    public static c<roj0> m13054b(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        cll cllVarU = LiveApiBuilder.u(ytr.b("/live/superChat/".concat(z ? "topChat" : "shoutingChat")), new mt0[0]);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("giftId", Integer.valueOf(str2));
            jSONObject.put("anchorId", str);
            jSONObject.put("fakeId", str3);
            jSONObject.put("content", str4);
            jSONObject.put("originalId", UUID.randomUUID().toString());
            jSONObject.put("roomId", str5);
            jSONObject.put("liveId", str6);
            jSONObject.put("liveType", "live");
            jSONObject.put("liveMode", "normal");
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        return upv.e(cllVarU, "sendTopChat" + str2, jSONObject.toString()).map(new w9j() { // from class: l.ecu
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }
}
