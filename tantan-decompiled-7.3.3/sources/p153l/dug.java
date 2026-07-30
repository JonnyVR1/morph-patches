package p153l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.LiveExtraInFeed;
import com.p051p1.mobile.putong.feed.data.LiveMultiCallInfo;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentVoiceLiveInfos;
import com.p051p1.mobile.putong.feed.data.VoiceLive;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class dug {
    /* JADX INFO: renamed from: a */
    public static void m118135a(FeedCenterView feedCenterView, Moment moment, String str, boolean z, boolean z2) {
        m118136b(feedCenterView instanceof FeedCenterVideoView ? "video" : ReminderAction.photo, moment, str, z, z2);
    }

    /* JADX INFO: renamed from: b */
    public static void m118136b(String str, Moment moment, String str2, boolean z, boolean z2) {
        pf60[] pf60VarArrM122102B = er60.m122102B(str, moment, null);
        String strM151174K = z2 ? "p_user_moment_interactions_details_view" : ksg.m151174K(str2, z);
        if (ksg.m151191Z(moment)) {
            pf60VarArrM122102B = ksg.m151172J(new pf60("forwarding_video_id", moment.thirdShareSource.sourceId), pf60VarArrM122102B);
        }
        if (TextUtils.isEmpty(strM151174K)) {
            tfj0.m190940c("e_moment_preview", "p_user_moment_interactions_details_view", pf60VarArrM122102B);
        } else {
            tfj0.m190940c("e_moment_preview", strM151174K, ksg.m151208i(str2, pf60VarArrM122102B));
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m118137c(Moment moment) {
        LiveMultiCallInfo liveMultiCallInfo = moment.multiCallInfo;
        return FeedModule.m61407M().mo68397Dr((liveMultiCallInfo == null || TextUtils.isEmpty(liveMultiCallInfo.role)) ? "" : moment.multiCallInfo.role);
    }

    /* JADX INFO: renamed from: d */
    public static String m118138d(Moment moment, String str) {
        LiveExtraInFeed fromLive = LiveExtraInFeed.getFromLive(moment.live);
        return (fromLive == null || !fromLive.isMultiCallType()) ? str : "video_living";
    }

    /* JADX INFO: renamed from: e */
    public static void m118139e(boolean z) {
        i4g0.m138523u("e_video_room_meet", OMSDialogPositon.p_nearby, new pf60("module", z ? "video_off" : "video_living"));
    }

    /* JADX INFO: renamed from: f */
    public static void m118140f(boolean z) {
        i4g0.m138492A("e_video_room_meet", OMSDialogPositon.p_nearby, new pf60("module", z ? "video_off" : "video_living"));
    }

    /* JADX INFO: renamed from: h */
    public static void m118142h(Act act, String str, Moment moment, int i, boolean z, n570 n570Var) {
        if ("from_discover_dating".equals(str)) {
            m118144j(moment, i + 1, OMSTemplateModeType.page, "p_discover_dating", n570Var);
            return;
        }
        if ("from_discover_discussion".equals(str)) {
            m118144j(moment, i + 1, OMSTemplateModeType.page, "p_discover_discussion", n570Var);
            return;
        }
        if ("from_nearby_focus".equals(str)) {
            m118144j(moment, i + 1, OMSTemplateModeType.page, "p_follow", n570Var);
            return;
        }
        if ("from_nearby_falls_feed".equals(str)) {
            m118144j(moment, i + 1, OMSTemplateModeType.page, OMSDialogPositon.p_nearby, n570Var);
            return;
        }
        if (z) {
            m118144j(moment, i + 1, OMSTemplateModeType.page, "p_album", n570Var);
        } else if ("from_activity_tab_one".equals(str)) {
            m118144j(moment, i + 1, OMSTemplateModeType.page, pu20.m173809d("from_activity_tab_one"), n570Var);
        } else if ("from_activity_tab_two".equals(str)) {
            m118144j(moment, i + 1, OMSTemplateModeType.page, pu20.m173809d("from_activity_tab_two"), n570Var);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m118143i(Moment moment, int i, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("liveId", moment.live.f39615id);
            jSONObject.put("anchorId", moment.live.anchor.f39651id);
            jSONObject.put("module", z ? "video_off" : "video_living");
            jSONObject.put(FirebaseAnalytics.Param.INDEX, String.valueOf(i));
            jSONObject.put("right_recommend_type", "");
            jSONObject.put("live_status", (moment.isLive || !TextUtils.isEmpty(moment.liveState)) ? "on" : BLiveOperationTitleShowType.off);
            jSONObject.put("liveRecommendCategory", moment.live.getRecommendCategory());
            jSONObject.put("live_room_live_type", m118137c(moment));
            i4g0.m138522t("e_live_room_enter", OMSDialogPositon.p_nearby, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m118144j(Moment moment, int i, String str, String str2, n570 n570Var) {
        if (str2 == null) {
            return;
        }
        if (moment.isVoiceLive && (moment.momentVoiceLiveInfos == null)) {
            i4g0.m138523u("e_live_audio_room_enter", str2, new pf60("anchorId", moment.voiceLive.anchor.f39651id), new pf60("liveId", moment.voiceLive.f40098id), new pf60("topic_id", moment.voiceLive.voiceRoomInfo.topics.get(0).f39687id), new pf60("audio_card_type", str2.equals(OMSDialogPositon.p_nearby) ? "big_card" : "user_card"), new pf60("audio_tab_id", ""), new pf60(FirebaseAnalytics.Param.INDEX, String.valueOf(i)), new pf60("audio_room_type", moment.voiceLive.voiceRoomInfo.maskMode ? "mask_audio" : "normal_audio"));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("liveId", moment.live.f39615id);
            jSONObject.put("anchorId", moment.live.anchor.f39651id);
            jSONObject.put("module", m118138d(moment, str));
            jSONObject.put(FirebaseAnalytics.Param.INDEX, String.valueOf(i));
            jSONObject.put("right_recommend_type", "");
            jSONObject.put("live_status", (moment.isLive || !TextUtils.isEmpty(moment.liveState)) ? "on" : BLiveOperationTitleShowType.off);
            jSONObject.put("trace_id", "");
            jSONObject.put("liveRecommendCategory", moment.live.getRecommendCategory());
            jSONObject.put("live_room_live_type", m118137c(moment));
            if ("follow_photo".equals(str) || "nearby_photo".equals(str)) {
                jSONObject.put("show_label", moment.iconTitle);
            } else {
                JSONObject jSONObject2 = new JSONObject();
                if (NullChecker.m82486a(n570Var.mo137270m(moment.owner))) {
                    jSONObject2.put("distance", q8g0.m175811p(n570Var.mo137270m(moment.owner).location.distance, true));
                }
                jSONObject.put("show_label", jSONObject2);
            }
            i4g0.m138522t("e_live_room_enter", str2, jSONObject);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            wu80.m207938b(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m118145k(Moment moment, int i, String str, String str2, String str3) {
        MomentVoiceLiveInfos momentVoiceLiveInfos;
        if (moment.isVoiceLive && (momentVoiceLiveInfos = moment.momentVoiceLiveInfos) != null && momentVoiceLiveInfos.momentVoiceUser != null) {
            i4g0.m138523u("e_live_audio_room_enter", str, new pf60("anchorId", momentVoiceLiveInfos.anchorUserID), new pf60("liveId", moment.momentVoiceLiveInfos.liveID), new pf60("topic_id", moment.momentVoiceLiveInfos.topicID), new pf60("audio_card_type", "user_card"), new pf60("audio_tab_id", ""), new pf60("audio_room_label", moment.momentVoiceLiveInfos.topicName), new pf60(FirebaseAnalytics.Param.INDEX, String.valueOf(i)), new pf60("enter_type", str3), new pf60("voice_template", moment.momentVoiceLiveInfos.momentVoiceUser.momentVoiceTemplate), new pf60("audio_card_type", moment.momentVoiceLiveInfos.momentVoiceUser.momentIsAnchor ? "discover_moment_anchor" : "discover_moment_room"), new pf60("audio_room_type", "normal_audio"));
            return;
        }
        VoiceLive voiceLive = moment.voiceLive;
        if (voiceLive == null || str == null || str2 == null) {
            return;
        }
        i4g0.m138523u("e_live_audio_room_enter", str, new pf60("anchorId", voiceLive.anchor.f39651id), new pf60("liveId", moment.voiceLive.f40098id), new pf60("audio_card_type", "user_card"), new pf60("audio_tab_id", ""), new pf60(FirebaseAnalytics.Param.INDEX, String.valueOf(i)));
    }

    /* JADX INFO: renamed from: g */
    public static void m118141g(Moment moment, String str, boolean z, PhotoAlbumBaseFrag photoAlbumBaseFrag) {
    }
}
