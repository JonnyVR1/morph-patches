package p149l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveActivity;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class c6j0 {
    /* JADX INFO: renamed from: a */
    public static String m105475a(BLive bLive) {
        return j7d0.m140090a(bLive.multiCallInfo, "onlive");
    }

    /* JADX INFO: renamed from: b */
    public static String m105476b(BLive bLive, BLiveActivity bLiveActivity) {
        return j7d0.m140090a(bLiveActivity.multiCallInfo, "onlive");
    }

    /* JADX INFO: renamed from: c */
    public static void m105477c(boolean z, String str, String str2, BLiveState bLiveState, String str3) {
        m105478d(z, str, str2, bLiveState, str3, "");
    }

    /* JADX INFO: renamed from: d */
    public static void m105478d(boolean z, String str, String str2, BLiveState bLiveState, String str3, String str4) {
        HashMap map = new HashMap();
        map.put("anchorId", str);
        map.put(FirebaseAnalytics.Param.INDEX, "NA");
        map.put("is_gif", 0);
        map.put("liveId", str2);
        map.put("liveRecommendCategory", "NA");
        map.put("live_status", !TEnum.equals(bLiveState, "stopped") ? "on" : BLiveOperationTitleShowType.off);
        map.put("module", "my_room");
        map.put("live_room_live_type", str3);
        if (!TextUtils.isEmpty(str4) && TextUtils.equals("home_card", str4)) {
            map.put("live_enter_source", "suggest_live_card_profile");
        }
        if (z) {
            adu.m96010f(OMSDialogPositon.p_suggest_user_profile_info_view, map);
        } else {
            adu.m96009e(OMSDialogPositon.p_suggest_user_profile_info_view, map);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m105479e(boolean z, String str, String str2, String str3, String str4, String str5) {
        HashMap map = new HashMap();
        map.put("anchorId", str);
        map.put(FirebaseAnalytics.Param.INDEX, "NA");
        map.put("is_gif", 0);
        map.put("liveId", str2);
        map.put("liveRecommendCategory", "NA");
        map.put("live_status", "stopped".equals(str3) ? "on" : BLiveOperationTitleShowType.off);
        map.put("module", "my_room");
        map.put("live_room_live_type", j7d0.m140091b(str4, str3));
        if (!TextUtils.isEmpty(str5) && TextUtils.equals("home_card", str5)) {
            map.put("live_enter_source", "suggest_live_card_profile");
        }
        if (z) {
            adu.m96010f(OMSDialogPositon.p_suggest_user_profile_info_view, map);
        } else {
            adu.m96009e(OMSDialogPositon.p_suggest_user_profile_info_view, map);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m105480f(aw10 aw10Var, boolean z, String str) {
        if (z) {
            m105482h(false, aw10Var.m99223a().anchor.f44419id, aw10Var.m99223a().f44323id, ((BLiveVoiceRoom) aw10Var.m99224b()).isMaskMode(), vwb.m200296J(((BLiveVoiceRoom) aw10Var.m99224b()).topics) ? "" : ((BLiveVoiceRoom) aw10Var.m99224b()).topics.get(0).f44514id, false);
        } else {
            m105478d(false, aw10Var.m99223a().anchor.f44419id, aw10Var.m99223a().f44323id, aw10Var.m99223a().state, m105475a((BLive) aw10Var.m99223a()), str);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m105481g(aw10 aw10Var, boolean z) {
        if (z) {
            m105482h(true, aw10Var.m99223a().anchor.f44419id, aw10Var.m99223a().f44323id, ((BLiveVoiceRoom) aw10Var.m99224b()).isMaskMode(), vwb.m200296J(((BLiveVoiceRoom) aw10Var.m99224b()).topics) ? "" : ((BLiveVoiceRoom) aw10Var.m99224b()).topics.get(0).f44514id, false);
        } else {
            m105477c(true, aw10Var.m99223a().anchor.f44419id, aw10Var.m99223a().f44323id, aw10Var.m99223a().state, m105475a((BLive) aw10Var.m99223a()));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m105482h(boolean z, String str, String str2, boolean z2, String str3, boolean z3) {
        HashMap map = new HashMap();
        map.put("anchorId", str);
        map.put("audio_room_type", z2 ? "mask_audio" : "normal_audio");
        map.put("liveId", str2);
        map.put("topic_id", str3);
        map.put(FirebaseAnalytics.Param.INDEX, "NA");
        if (z3) {
            map.put("audio_card_type", "profile_settled_room");
        }
        if (z) {
            zvf0.m220403y("e_live_audio_room_enter", OMSDialogPositon.p_suggest_user_profile_info_view, map);
        } else {
            zvf0.m220397s("e_live_audio_room_enter", OMSDialogPositon.p_suggest_user_profile_info_view, map);
        }
    }
}
