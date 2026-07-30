package p153l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTrackData;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p051p1.mobile.putong.live.base.data.BLiveCoverLabel;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLabel;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.base.data.BLiveTrackShowLabel;
import com.p051p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class ybu {
    /* JADX INFO: renamed from: a */
    public static r6s m215110a(int i) {
        r6s r6sVar = new r6s();
        r6sVar.m180034r(i);
        return r6sVar;
    }

    /* JADX INFO: renamed from: b */
    public static void m215111b(int i, byu byuVar, String str) {
        LiveGoAction liveGoAction = new LiveGoAction();
        liveGoAction.setType(i);
        HashMap map = new HashMap();
        if (i == 4) {
            liveGoAction.setGoData(byuVar.live.room.f45300id);
            map.put("source", RelationshipStatus.suggested);
        } else {
            liveGoAction.setGoData(byuVar.live.f45298id);
            map.put("pullFlv", byuVar.live.streamFlvUrl);
            map.put("pullFlvIpv6", byuVar.live.streamFlvUrlIpv6);
            map.put("callback", byuVar.live.callback);
            map.put("provider", byuVar.live.streamCdnInfo.provider + "");
            map.put("businessType", byuVar.live.streamCdnInfo.businessType + "");
            map.put("roomId", byuVar.live.room.f45300id);
            map.put("liveMode", byuVar.live.liveMode);
            map.put("source", str);
            map.put("category", byuVar.live.getRecommendCategory());
        }
        liveGoAction.setGoExtra(map);
        byuVar.localGoAction = liveGoAction;
    }

    /* JADX INFO: renamed from: c */
    public static void m215112c(byu byuVar, int i, String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        BLiveTrackShowLabel bLiveTrackShowLabelM215113d = m215113d(byuVar.live);
        String str3 = "0";
        if (bLiveTrackShowLabelM215113d != null) {
            try {
                jSONObject.put("distance", bLiveTrackShowLabelM215113d.distance);
                jSONObject.put("room_name", bLiveTrackShowLabelM215113d.room_name);
                jSONObject.put("label_name", bLiveTrackShowLabelM215113d.label_name);
                jSONObject.put("viewer", bLiveTrackShowLabelM215113d.viewer);
                jSONObject.put("label_name_top", bLiveTrackShowLabelM215113d.label_name_top);
                jSONObject.put("label_name_sp", bLiveTrackShowLabelM215113d.label_name_sp);
                jSONObject.put("label_name_tool", bLiveTrackShowLabelM215113d.label_name_tool);
                jSONObject.put("state_label", bLiveTrackShowLabelM215113d.state_label);
                jSONObject.put("label_name_custom", bLiveTrackShowLabelM215113d.label_name_custom);
                jSONObject.put("label_name_fixed", bLiveTrackShowLabelM215113d.label_name_fixed);
                str3 = bLiveTrackShowLabelM215113d.have_red_packet;
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                wu80.m207938b(e);
            }
        }
        BLiveSuggestLive bLiveSuggestLive = byuVar.live;
        String str4 = BLiveOperationTitleShowType.off;
        if (bLiveSuggestLive == null) {
            str2 = "NA";
        } else if (TextUtils.equals(bLiveSuggestLive.state, "stopped")) {
            str2 = BLiveOperationTitleShowType.off;
        } else {
            BLiveMultiCallInfo bLiveMultiCallInfo = byuVar.live.multiCallInfo;
            str2 = (bLiveMultiCallInfo == null || !bLiveMultiCallInfo.onGoing) ? "common_live" : "video_live";
        }
        LiveCardTrackData liveCardTrackData = new LiveCardTrackData();
        liveCardTrackData.setPageId(str);
        liveCardTrackData.setModuleId("e_live_room_enter");
        liveCardTrackData.put("right_recommend_type", "");
        liveCardTrackData.put("trace_id", "");
        liveCardTrackData.put("liveRecommendCategory", byuVar.live.getRecommendCategory());
        liveCardTrackData.put("module", OMSTemplateModeType.page);
        liveCardTrackData.put("live_room_live_type", str2);
        liveCardTrackData.put("window_type", "");
        liveCardTrackData.put(FirebaseAnalytics.Param.INDEX, "");
        liveCardTrackData.put("anchorId", byuVar.live.anchor.f45299id);
        liveCardTrackData.put("liveId", byuVar.live.f45298id);
        liveCardTrackData.put("from", "");
        liveCardTrackData.put("redpacket_icon", str3);
        if (!TextUtils.equals(byuVar.live.state, "stopped")) {
            str4 = "on";
        }
        liveCardTrackData.put("live_status", str4);
        liveCardTrackData.put("show_label", jSONObject);
        byuVar.m107081c(liveCardTrackData);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static BLiveTrackShowLabel m215113d(BLiveSuggestLive bLiveSuggestLive) {
        String strM209914x = xau.m209914x(bLiveSuggestLive.anchor.location);
        if (strM209914x == null) {
            return null;
        }
        BLiveTrackShowLabel bLiveTrackShowLabelNew_ = BLiveTrackShowLabel.new_();
        bLiveTrackShowLabelNew_.distance = strM209914x;
        bLiveTrackShowLabelNew_.room_name = bLiveSuggestLive.room.title;
        bLiveTrackShowLabelNew_.viewer = String.valueOf(bLiveSuggestLive.memberCount);
        BLiveSuggestLabel bLiveSuggestLabel = bLiveSuggestLive.specialLabel;
        bLiveTrackShowLabelNew_.label_name = bLiveSuggestLabel == null ? "" : bLiveSuggestLabel.value;
        bLiveTrackShowLabelNew_.have_red_packet = "0";
        if (!jyb.m147479J(bLiveSuggestLive.coverLabelsV2)) {
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
                    bLiveTrackShowLabelNew_.have_red_packet = LiveNewOptLabelView.m69933B(list);
                }
            }
        }
        return bLiveTrackShowLabelNew_;
    }
}
