package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveSuggestLabel;
import com.p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p1.mobile.putong.live.base.data.BLiveTrackShowLabel;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.List;
import l.adu;
import l.h7d0;
import l.sm80;
import l.w8u;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ydd0 {
    /* JADX INFO: renamed from: a */
    public static void m26652a(String str, BLiveSuggestLive bLiveSuggestLive) {
        if (bLiveSuggestLive == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String strX = w8u.x(bLiveSuggestLive.anchor.location);
            if (strX != null) {
                BLiveTrackShowLabel bLiveTrackShowLabelNew_ = BLiveTrackShowLabel.new_();
                bLiveTrackShowLabelNew_.distance = strX;
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
            CrashHelper.c(e);
            sm80.b(e);
        }
        h7d0 h7d0VarA = h7d0.x().c(bLiveSuggestLive).l(1).w("page").A(jSONObject).p("0").o(false).a();
        HashMap map = new HashMap();
        map.put("module", "no_action_toast");
        List list = bLiveSuggestLive.redPacketIds;
        if (list != null) {
            map.put("redpacket_icon", list.size() != 0 ? "true" : "false");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        adu.e(str, h7d0VarA.w(map));
    }

    /* JADX INFO: renamed from: b */
    public static void m26653b(String str, BLiveSuggestLive bLiveSuggestLive) {
        if (bLiveSuggestLive == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String strX = w8u.x(bLiveSuggestLive.anchor.location);
            if (strX != null) {
                BLiveTrackShowLabel bLiveTrackShowLabelNew_ = BLiveTrackShowLabel.new_();
                bLiveTrackShowLabelNew_.distance = strX;
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
            CrashHelper.c(e);
            sm80.b(e);
        }
        h7d0 h7d0VarA = h7d0.x().c(bLiveSuggestLive).l(1).w("page").A(jSONObject).p("0").o(false).a();
        HashMap map = new HashMap();
        map.put("module", "no_action_toast");
        List list = bLiveSuggestLive.redPacketIds;
        if (list != null) {
            map.put("redpacket_icon", list.size() != 0 ? "true" : "false");
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        adu.f(str, h7d0VarA.w(map));
    }
}
