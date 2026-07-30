package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLabel;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BLiveTrackShowLabel;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ydd0 {
    /* JADX INFO: renamed from: a */
    public static void m214279a(String str, BLiveSuggestLive bLiveSuggestLive) {
        if (bLiveSuggestLive == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String strM202221x = w8u.m202221x(bLiveSuggestLive.anchor.location);
            if (strM202221x != null) {
                BLiveTrackShowLabel bLiveTrackShowLabelNew_ = BLiveTrackShowLabel.new_();
                bLiveTrackShowLabelNew_.distance = strM202221x;
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
            CrashHelper.m81296c(e);
            sm80.m184942b(e);
        }
        h7d0 h7d0VarM129662a = h7d0.m129655x().m129664c(bLiveSuggestLive).m129673l(1).m129684w(OMSTemplateModeType.page).m129658A(jSONObject).m129677p("0").m129676o(false).m129662a();
        HashMap map = new HashMap();
        map.put("module", "no_action_toast");
        List<String> list = bLiveSuggestLive.redPacketIds;
        if (list != null) {
            map.put("redpacket_icon", list.size() != 0 ? "true" : "false");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        adu.m96009e(str, h7d0VarM129662a.m129657w(map));
    }

    /* JADX INFO: renamed from: b */
    public static void m214280b(String str, BLiveSuggestLive bLiveSuggestLive) {
        if (bLiveSuggestLive == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String strM202221x = w8u.m202221x(bLiveSuggestLive.anchor.location);
            if (strM202221x != null) {
                BLiveTrackShowLabel bLiveTrackShowLabelNew_ = BLiveTrackShowLabel.new_();
                bLiveTrackShowLabelNew_.distance = strM202221x;
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
            CrashHelper.m81296c(e);
            sm80.m184942b(e);
        }
        h7d0 h7d0VarM129662a = h7d0.m129655x().m129664c(bLiveSuggestLive).m129673l(1).m129684w(OMSTemplateModeType.page).m129658A(jSONObject).m129677p("0").m129676o(false).m129662a();
        HashMap map = new HashMap();
        map.put("module", "no_action_toast");
        List<String> list = bLiveSuggestLive.redPacketIds;
        if (list != null) {
            map.put("redpacket_icon", list.size() != 0 ? "true" : "false");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        adu.m96010f(str, h7d0VarM129662a.m129657w(map));
    }
}
