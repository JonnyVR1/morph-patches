package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLabel;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.data.BLiveTrackShowLabel;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class amd0 {
    /* JADX INFO: renamed from: a */
    public static void m98819a(String str, BLiveSuggestLive bLiveSuggestLive) {
        if (bLiveSuggestLive == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String strM209914x = xau.m209914x(bLiveSuggestLive.anchor.location);
            if (strM209914x != null) {
                BLiveTrackShowLabel bLiveTrackShowLabelNew_ = BLiveTrackShowLabel.new_();
                bLiveTrackShowLabelNew_.distance = strM209914x;
                bLiveTrackShowLabelNew_.room_name = bLiveSuggestLive.room.title;
                bLiveTrackShowLabelNew_.viewer = String.valueOf(bLiveSuggestLive.memberCount);
                BLiveSuggestLabel bLiveSuggestLabel = bLiveSuggestLive.specialLabel;
                bLiveTrackShowLabelNew_.label_name = bLiveSuggestLabel == null ? "" : bLiveSuggestLabel.value;
                jSONObject.put("distance", bLiveTrackShowLabelNew_.distance);
                jSONObject.put("room_name", bLiveTrackShowLabelNew_.room_name);
                jSONObject.put("label_name", bLiveTrackShowLabelNew_.label_name);
                jSONObject.put("viewer", bLiveTrackShowLabelNew_.viewer);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            wu80.m207938b(e);
        }
        kfd0 kfd0VarM149392a = kfd0.m149385x().m149394c(bLiveSuggestLive).m149403l(1).m149414w(OMSTemplateModeType.page).m149388A(jSONObject).m149407p("0").m149406o(false).m149392a();
        HashMap map = new HashMap();
        map.put("module", "no_action_toast");
        List<String> list = bLiveSuggestLive.redPacketIds;
        if (list != null) {
            map.put("redpacket_icon", list.size() != 0 ? "true" : "false");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        bfu.m104073e(str, kfd0VarM149392a.m149387w(map));
    }

    /* JADX INFO: renamed from: b */
    public static void m98820b(String str, BLiveSuggestLive bLiveSuggestLive) {
        if (bLiveSuggestLive == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String strM209914x = xau.m209914x(bLiveSuggestLive.anchor.location);
            if (strM209914x != null) {
                BLiveTrackShowLabel bLiveTrackShowLabelNew_ = BLiveTrackShowLabel.new_();
                bLiveTrackShowLabelNew_.distance = strM209914x;
                bLiveTrackShowLabelNew_.room_name = bLiveSuggestLive.room.title;
                bLiveTrackShowLabelNew_.viewer = String.valueOf(bLiveSuggestLive.memberCount);
                BLiveSuggestLabel bLiveSuggestLabel = bLiveSuggestLive.specialLabel;
                bLiveTrackShowLabelNew_.label_name = bLiveSuggestLabel == null ? "" : bLiveSuggestLabel.value;
                jSONObject.put("distance", bLiveTrackShowLabelNew_.distance);
                jSONObject.put("room_name", bLiveTrackShowLabelNew_.room_name);
                jSONObject.put("label_name", bLiveTrackShowLabelNew_.label_name);
                jSONObject.put("viewer", bLiveTrackShowLabelNew_.viewer);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            wu80.m207938b(e);
        }
        kfd0 kfd0VarM149392a = kfd0.m149385x().m149394c(bLiveSuggestLive).m149403l(1).m149414w(OMSTemplateModeType.page).m149388A(jSONObject).m149407p("0").m149406o(false).m149392a();
        HashMap map = new HashMap();
        map.put("module", "no_action_toast");
        List<String> list = bLiveSuggestLive.redPacketIds;
        if (list != null) {
            map.put("redpacket_icon", list.size() != 0 ? "true" : "false");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        bfu.m104074f(str, kfd0VarM149392a.m149387w(map));
    }
}
