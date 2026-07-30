package p153l;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.tantanapp.common.utils.CrashHelper;
import java.util.UUID;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class geu {
    /* JADX INFO: renamed from: b */
    public static C22421c<uxj0> m130029b(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        rnl rnlVarM68498u = LiveApiBuilder.m68498u(zvr.m221802b("/live/superChat/".concat(z ? "topChat" : "shoutingChat")), new st0[0]);
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
            CrashHelper.m82479c(e);
        }
        return vrv.m202544e(rnlVarM68498u, "sendTopChat" + str2, jSONObject.toString()).map(new qcj() { // from class: l.feu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }
}
