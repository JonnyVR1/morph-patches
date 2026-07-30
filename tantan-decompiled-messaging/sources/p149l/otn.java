package p149l;

import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class otn {
    /* JADX INFO: renamed from: a */
    public static void m165947a(BLiveAbsData bLiveAbsData, int i, rrr rrrVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("room_name", rrrVar.f160774c.title);
            jSONObject.put("label_name", rrrVar.f160775d.value);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
        adu.m96007c(h7d0.m129655x().m129684w(OMSTemplateModeType.page).m129673l(i + 1).m129663b(bLiveAbsData).m129681t(c6j0.m105476b((BLive) bLiveAbsData, rrrVar.f160775d)).m129658A(jSONObject).m129662a(), "p_live_follow");
    }

    /* JADX INFO: renamed from: b */
    public static void m165948b(BLiveAbsData bLiveAbsData, int i, rrr rrrVar) {
        String strM105476b = c6j0.m105476b((BLive) bLiveAbsData, rrrVar.f160775d);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("room_name", rrrVar.f160774c.title);
            jSONObject.put("label_name", rrrVar.f160775d.value);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
        adu.m96011g(h7d0.m129655x().m129684w(OMSTemplateModeType.page).m129673l(i + 1).m129663b(bLiveAbsData).m129681t(strM105476b).m129658A(jSONObject).m129662a(), "p_live_follow");
    }
}
