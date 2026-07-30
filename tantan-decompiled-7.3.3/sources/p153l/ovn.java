package p153l;

import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class ovn {
    /* JADX INFO: renamed from: a */
    public static void m169454a(BLiveAbsData bLiveAbsData, int i, str strVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("room_name", strVar.f170601c.title);
            jSONObject.put("label_name", strVar.f170602d.value);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
        bfu.m104071c(kfd0.m149385x().m149414w(OMSTemplateModeType.page).m149403l(i + 1).m149393b(bLiveAbsData).m149411t(gfj0.m130074b((BLive) bLiveAbsData, strVar.f170602d)).m149388A(jSONObject).m149392a(), "p_live_follow");
    }

    /* JADX INFO: renamed from: b */
    public static void m169455b(BLiveAbsData bLiveAbsData, int i, str strVar) {
        String strM130074b = gfj0.m130074b((BLive) bLiveAbsData, strVar.f170602d);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("room_name", strVar.f170601c.title);
            jSONObject.put("label_name", strVar.f170602d.value);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
        bfu.m104075g(kfd0.m149385x().m149414w(OMSTemplateModeType.page).m149403l(i + 1).m149393b(bLiveAbsData).m149411t(strM130074b).m149388A(jSONObject).m149392a(), "p_live_follow");
    }
}
