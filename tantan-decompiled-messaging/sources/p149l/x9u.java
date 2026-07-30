package p149l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p046p1.mobile.putong.live.base.data.BLiveCoverLabel;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLabel;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BLiveTrackShowLabel;
import com.p046p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class x9u {
    /* JADX INFO: renamed from: a */
    public static q4s m207516a(int i) {
        q4s q4sVar = new q4s();
        q4sVar.m172969r(i);
        return q4sVar;
    }

    /* JADX INFO: renamed from: b */
    public static void m207517b(int i, awu awuVar, String str) {
        LiveGoAction liveGoAction = new LiveGoAction();
        liveGoAction.setType(i);
        HashMap map = new HashMap();
        if (i == 4) {
            liveGoAction.setGoData(awuVar.live.room.f44452id);
            map.put("source", RelationshipStatus.suggested);
        } else {
            liveGoAction.setGoData(awuVar.live.f44450id);
            map.put("pullFlv", awuVar.live.streamFlvUrl);
            map.put("pullFlvIpv6", awuVar.live.streamFlvUrlIpv6);
            map.put("callback", awuVar.live.callback);
            map.put("provider", awuVar.live.streamCdnInfo.provider + "");
            map.put("businessType", awuVar.live.streamCdnInfo.businessType + "");
            map.put("roomId", awuVar.live.room.f44452id);
            map.put("liveMode", awuVar.live.liveMode);
            map.put("source", str);
            map.put("category", awuVar.live.getRecommendCategory());
        }
        liveGoAction.setGoExtra(map);
        awuVar.localGoAction = liveGoAction;
    }

    /* JADX INFO: renamed from: c */
    public static void m207518c(awu awuVar, int i, String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        BLiveTrackShowLabel bLiveTrackShowLabelM207519d = m207519d(awuVar.live);
        String str3 = "0";
        if (bLiveTrackShowLabelM207519d != null) {
            try {
                jSONObject.put("distance", bLiveTrackShowLabelM207519d.distance);
                jSONObject.put("room_name", bLiveTrackShowLabelM207519d.room_name);
                jSONObject.put("label_name", bLiveTrackShowLabelM207519d.label_name);
                jSONObject.put("viewer", bLiveTrackShowLabelM207519d.viewer);
                jSONObject.put("label_name_top", bLiveTrackShowLabelM207519d.label_name_top);
                jSONObject.put("label_name_sp", bLiveTrackShowLabelM207519d.label_name_sp);
                jSONObject.put("label_name_tool", bLiveTrackShowLabelM207519d.label_name_tool);
                jSONObject.put("state_label", bLiveTrackShowLabelM207519d.state_label);
                jSONObject.put("label_name_custom", bLiveTrackShowLabelM207519d.label_name_custom);
                jSONObject.put("label_name_fixed", bLiveTrackShowLabelM207519d.label_name_fixed);
                str3 = bLiveTrackShowLabelM207519d.have_red_packet;
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                sm80.m184942b(e);
            }
        }
        BLiveSuggestLive bLiveSuggestLive = awuVar.live;
        String str4 = BLiveOperationTitleShowType.off;
        if (bLiveSuggestLive == null) {
            str2 = "NA";
        } else if (TextUtils.equals(bLiveSuggestLive.state, "stopped")) {
            str2 = BLiveOperationTitleShowType.off;
        } else {
            BLiveMultiCallInfo bLiveMultiCallInfo = awuVar.live.multiCallInfo;
            str2 = (bLiveMultiCallInfo == null || !bLiveMultiCallInfo.onGoing) ? "common_live" : "video_live";
        }
        LiveCardTrackData liveCardTrackData = new LiveCardTrackData();
        liveCardTrackData.setPageId(str);
        liveCardTrackData.setModuleId("e_live_room_enter");
        liveCardTrackData.put("right_recommend_type", "");
        liveCardTrackData.put("trace_id", "");
        liveCardTrackData.put("liveRecommendCategory", awuVar.live.getRecommendCategory());
        liveCardTrackData.put("module", OMSTemplateModeType.page);
        liveCardTrackData.put("live_room_live_type", str2);
        liveCardTrackData.put("window_type", "");
        liveCardTrackData.put(FirebaseAnalytics.Param.INDEX, "");
        liveCardTrackData.put("anchorId", awuVar.live.anchor.f44451id);
        liveCardTrackData.put("liveId", awuVar.live.f44450id);
        liveCardTrackData.put("from", "");
        liveCardTrackData.put("redpacket_icon", str3);
        if (!TextUtils.equals(awuVar.live.state, "stopped")) {
            str4 = "on";
        }
        liveCardTrackData.put("live_status", str4);
        liveCardTrackData.put("show_label", jSONObject);
        awuVar.m99327c(liveCardTrackData);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static BLiveTrackShowLabel m207519d(BLiveSuggestLive bLiveSuggestLive) {
        String strM202221x = w8u.m202221x(bLiveSuggestLive.anchor.location);
        if (strM202221x == null) {
            return null;
        }
        BLiveTrackShowLabel bLiveTrackShowLabelNew_ = BLiveTrackShowLabel.new_();
        bLiveTrackShowLabelNew_.distance = strM202221x;
        bLiveTrackShowLabelNew_.room_name = bLiveSuggestLive.room.title;
        bLiveTrackShowLabelNew_.viewer = String.valueOf(bLiveSuggestLive.memberCount);
        BLiveSuggestLabel bLiveSuggestLabel = bLiveSuggestLive.specialLabel;
        bLiveTrackShowLabelNew_.label_name = bLiveSuggestLabel == null ? "" : bLiveSuggestLabel.value;
        bLiveTrackShowLabelNew_.have_red_packet = "0";
        if (!vwb.m200296J(bLiveSuggestLive.coverLabelsV2)) {
            int i = 0;
            while (true) {
                int size = bLiveSuggestLive.coverLabelsV2.size();
                List<BLiveCoverLabel> list = bLiveSuggestLive.coverLabelsV2;
                if (i < size) {
                    String str = list.get(i).type;
                    str.getClass();
                    byte b = -1;
                    switch (str) {
                        case "A":
                            b = 0;
                        case "B":
                            b = 1;
                        case "C":
                            b = 2;
                        default:
                            switch (b) {
                                case 0:
                                    bLiveTrackShowLabelNew_.label_name = bLiveSuggestLive.coverLabelsV2.get(i).name;
                                    break;
                                case 1:
                                    bLiveTrackShowLabelNew_.label_name_custom = bLiveSuggestLive.coverLabelsV2.get(i).name;
                                    break;
                                case 2:
                                    bLiveTrackShowLabelNew_.label_name_fixed = bLiveSuggestLive.coverLabelsV2.get(i).name;
                                    break;
                            }
                    }
                } else {
                    bLiveTrackShowLabelNew_.have_red_packet = LiveNewOptLabelView.m68750B(list);
                }
            }
        }
        return bLiveTrackShowLabelNew_;
    }
}
