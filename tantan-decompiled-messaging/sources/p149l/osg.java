package p149l;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.LiveExtraInFeed;
import com.p046p1.mobile.putong.feed.data.LiveMultiCallInfo;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentVoiceLiveInfos;
import com.p046p1.mobile.putong.feed.data.VoiceLive;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class osg {
    /* JADX INFO: renamed from: a */
    public static void m165766a(FeedCenterView feedCenterView, Moment moment, String str, boolean z, boolean z2) {
        m165767b(feedCenterView instanceof FeedCenterVideoView ? "video" : ReminderAction.photo, moment, str, z, z2);
    }

    /* JADX INFO: renamed from: b */
    public static void m165767b(String str, Moment moment, String str2, boolean z, boolean z2) {
        j760[] j760VarArrM218959B = zi60.m218959B(str, moment, null);
        String strM199515K = z2 ? "p_user_moment_interactions_details_view" : vqg.m199515K(str2, z);
        if (vqg.m199532Z(moment)) {
            j760VarArrM218959B = vqg.m199513J(new j760("forwarding_video_id", moment.thirdShareSource.sourceId), j760VarArrM218959B);
        }
        if (TextUtils.isEmpty(strM199515K)) {
            p6j0.m167669c("e_moment_preview", "p_user_moment_interactions_details_view", j760VarArrM218959B);
        } else {
            p6j0.m167669c("e_moment_preview", strM199515K, vqg.m199549i(str2, j760VarArrM218959B));
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m165768c(Moment moment) {
        LiveMultiCallInfo liveMultiCallInfo = moment.multiCallInfo;
        return FeedModule.m60223M().mo67214Dr((liveMultiCallInfo == null || TextUtils.isEmpty(liveMultiCallInfo.role)) ? "" : moment.multiCallInfo.role);
    }

    /* JADX INFO: renamed from: d */
    public static String m165769d(Moment moment, String str) {
        LiveExtraInFeed fromLive = LiveExtraInFeed.getFromLive(moment.live);
        return (fromLive == null || !fromLive.isMultiCallType()) ? str : "video_living";
    }

    /* JADX INFO: renamed from: e */
    public static void m165770e(boolean z) {
        zvf0.m220399u("e_video_room_meet", OMSDialogPositon.p_nearby, new j760("module", z ? "video_off" : "video_living"));
    }

    /* JADX INFO: renamed from: f */
    public static void m165771f(boolean z) {
        zvf0.m220368A("e_video_room_meet", OMSDialogPositon.p_nearby, new j760("module", z ? "video_off" : "video_living"));
    }

    /* JADX INFO: renamed from: h */
    public static void m165773h(Act act, String str, Moment moment, int i, boolean z, hx60 hx60Var) {
        if ("from_discover_dating".equals(str)) {
            m165775j(moment, i + 1, OMSTemplateModeType.page, "p_discover_dating", hx60Var);
            return;
        }
        if ("from_discover_discussion".equals(str)) {
            m165775j(moment, i + 1, OMSTemplateModeType.page, "p_discover_discussion", hx60Var);
            return;
        }
        if ("from_nearby_focus".equals(str)) {
            m165775j(moment, i + 1, OMSTemplateModeType.page, "p_follow", hx60Var);
            return;
        }
        if ("from_nearby_falls_feed".equals(str)) {
            m165775j(moment, i + 1, OMSTemplateModeType.page, OMSDialogPositon.p_nearby, hx60Var);
            return;
        }
        if (z) {
            m165775j(moment, i + 1, OMSTemplateModeType.page, "p_album", hx60Var);
        } else if ("from_activity_tab_one".equals(str)) {
            m165775j(moment, i + 1, OMSTemplateModeType.page, fm20.m122121d("from_activity_tab_one"), hx60Var);
        } else if ("from_activity_tab_two".equals(str)) {
            m165775j(moment, i + 1, OMSTemplateModeType.page, fm20.m122121d("from_activity_tab_two"), hx60Var);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m165774i(Moment moment, int i, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("liveId", moment.live.f38767id);
            jSONObject.put("anchorId", moment.live.anchor.f38803id);
            jSONObject.put("module", z ? "video_off" : "video_living");
            jSONObject.put(FirebaseAnalytics.Param.INDEX, String.valueOf(i));
            jSONObject.put("right_recommend_type", "");
            jSONObject.put("live_status", (moment.isLive || !TextUtils.isEmpty(moment.liveState)) ? "on" : BLiveOperationTitleShowType.off);
            jSONObject.put("liveRecommendCategory", moment.live.getRecommendCategory());
            jSONObject.put("live_room_live_type", m165768c(moment));
            zvf0.m220398t("e_live_room_enter", OMSDialogPositon.p_nearby, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m165775j(Moment moment, int i, String str, String str2, hx60 hx60Var) {
        if (str2 == null) {
            return;
        }
        if (moment.isVoiceLive && (moment.momentVoiceLiveInfos == null)) {
            zvf0.m220399u("e_live_audio_room_enter", str2, new j760("anchorId", moment.voiceLive.anchor.f38803id), new j760("liveId", moment.voiceLive.f39250id), new j760("topic_id", moment.voiceLive.voiceRoomInfo.topics.get(0).f38839id), new j760("audio_card_type", str2.equals(OMSDialogPositon.p_nearby) ? "big_card" : "user_card"), new j760("audio_tab_id", ""), new j760(FirebaseAnalytics.Param.INDEX, String.valueOf(i)), new j760("audio_room_type", moment.voiceLive.voiceRoomInfo.maskMode ? "mask_audio" : "normal_audio"));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("liveId", moment.live.f38767id);
            jSONObject.put("anchorId", moment.live.anchor.f38803id);
            jSONObject.put("module", m165769d(moment, str));
            jSONObject.put(FirebaseAnalytics.Param.INDEX, String.valueOf(i));
            jSONObject.put("right_recommend_type", "");
            jSONObject.put("live_status", (moment.isLive || !TextUtils.isEmpty(moment.liveState)) ? "on" : BLiveOperationTitleShowType.off);
            jSONObject.put("trace_id", "");
            jSONObject.put("liveRecommendCategory", moment.live.getRecommendCategory());
            jSONObject.put("live_room_live_type", m165768c(moment));
            if ("follow_photo".equals(str) || "nearby_photo".equals(str)) {
                jSONObject.put("show_label", moment.iconTitle);
            } else {
                JSONObject jSONObject2 = new JSONObject();
                if (NullChecker.m81303a(hx60Var.mo133306m(moment.owner))) {
                    jSONObject2.put("distance", i0g0.m133876p(hx60Var.mo133306m(moment.owner).location.distance, true));
                }
                jSONObject.put("show_label", jSONObject2);
            }
            zvf0.m220398t("e_live_room_enter", str2, jSONObject);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            sm80.m184942b(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m165776k(Moment moment, int i, String str, String str2, String str3) {
        MomentVoiceLiveInfos momentVoiceLiveInfos;
        if (moment.isVoiceLive && (momentVoiceLiveInfos = moment.momentVoiceLiveInfos) != null && momentVoiceLiveInfos.momentVoiceUser != null) {
            zvf0.m220399u("e_live_audio_room_enter", str, new j760("anchorId", momentVoiceLiveInfos.anchorUserID), new j760("liveId", moment.momentVoiceLiveInfos.liveID), new j760("topic_id", moment.momentVoiceLiveInfos.topicID), new j760("audio_card_type", "user_card"), new j760("audio_tab_id", ""), new j760("audio_room_label", moment.momentVoiceLiveInfos.topicName), new j760(FirebaseAnalytics.Param.INDEX, String.valueOf(i)), new j760("enter_type", str3), new j760("voice_template", moment.momentVoiceLiveInfos.momentVoiceUser.momentVoiceTemplate), new j760("audio_card_type", moment.momentVoiceLiveInfos.momentVoiceUser.momentIsAnchor ? "discover_moment_anchor" : "discover_moment_room"), new j760("audio_room_type", "normal_audio"));
            return;
        }
        VoiceLive voiceLive = moment.voiceLive;
        if (voiceLive == null || str == null || str2 == null) {
            return;
        }
        zvf0.m220399u("e_live_audio_room_enter", str, new j760("anchorId", voiceLive.anchor.f38803id), new j760("liveId", moment.voiceLive.f39250id), new j760("audio_card_type", "user_card"), new j760("audio_tab_id", ""), new j760(FirebaseAnalytics.Param.INDEX, String.valueOf(i)));
    }

    /* JADX INFO: renamed from: g */
    public static void m165772g(Moment moment, String str, boolean z, PhotoAlbumBaseFrag photoAlbumBaseFrag) {
    }
}
