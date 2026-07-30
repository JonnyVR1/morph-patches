package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.OMSTemplateModeType;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.LiveExtraInFeed;
import com.p000p1.mobile.putong.feed.data.LiveMultiCallInfo;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentVoiceLiveInfos;
import com.p000p1.mobile.putong.feed.data.VoiceLive;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.i0g0;
import l.j760;
import l.sm80;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class osg {
    /* JADX INFO: renamed from: a */
    public static void m12845a(FeedCenterView feedCenterView, Moment moment, String str, boolean z, boolean z2) {
        m12846b(feedCenterView instanceof FeedCenterVideoView ? "video" : "photo", moment, str, z, z2);
    }

    /* JADX INFO: renamed from: b */
    public static void m12846b(String str, Moment moment, String str2, boolean z, boolean z2) {
        j760[] j760VarArrM17434B = zi60.m17434B(str, moment, null);
        String strM15485K = z2 ? "p_user_moment_interactions_details_view" : vqg.m15485K(str2, z);
        if (vqg.m15502Z(moment)) {
            j760VarArrM17434B = vqg.m15483J(new j760("forwarding_video_id", moment.thirdShareSource.sourceId), j760VarArrM17434B);
        }
        if (TextUtils.isEmpty(strM15485K)) {
            p6j0.m12913c("e_moment_preview", "p_user_moment_interactions_details_view", j760VarArrM17434B);
        } else {
            p6j0.m12913c("e_moment_preview", strM15485K, vqg.m15519i(str2, j760VarArrM17434B));
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m12847c(Moment moment) {
        LiveMultiCallInfo liveMultiCallInfo = moment.multiCallInfo;
        return FeedModule.m1141M().Dr((liveMultiCallInfo == null || TextUtils.isEmpty(liveMultiCallInfo.role)) ? "" : moment.multiCallInfo.role);
    }

    /* JADX INFO: renamed from: d */
    public static String m12848d(Moment moment, String str) {
        LiveExtraInFeed fromLive = LiveExtraInFeed.getFromLive(moment.live);
        return (fromLive == null || !fromLive.isMultiCallType()) ? str : "video_living";
    }

    /* JADX INFO: renamed from: e */
    public static void m12849e(boolean z) {
        zvf0.u("e_video_room_meet", OMSDialogPositon.p_nearby, new j760[]{new j760("module", z ? "video_off" : "video_living")});
    }

    /* JADX INFO: renamed from: f */
    public static void m12850f(boolean z) {
        zvf0.A("e_video_room_meet", OMSDialogPositon.p_nearby, new j760[]{new j760("module", z ? "video_off" : "video_living")});
    }

    /* JADX INFO: renamed from: h */
    public static void m12852h(Act act, String str, Moment moment, int i, boolean z, hx60 hx60Var) {
        if ("from_discover_dating".equals(str)) {
            m12854j(moment, i + 1, OMSTemplateModeType.page, "p_discover_dating", hx60Var);
            return;
        }
        if ("from_discover_discussion".equals(str)) {
            m12854j(moment, i + 1, OMSTemplateModeType.page, "p_discover_discussion", hx60Var);
            return;
        }
        if ("from_nearby_focus".equals(str)) {
            m12854j(moment, i + 1, OMSTemplateModeType.page, "p_follow", hx60Var);
            return;
        }
        if ("from_nearby_falls_feed".equals(str)) {
            m12854j(moment, i + 1, OMSTemplateModeType.page, OMSDialogPositon.p_nearby, hx60Var);
            return;
        }
        if (z) {
            m12854j(moment, i + 1, OMSTemplateModeType.page, "p_album", hx60Var);
        } else if ("from_activity_tab_one".equals(str)) {
            m12854j(moment, i + 1, OMSTemplateModeType.page, fm20.m10224d("from_activity_tab_one"), hx60Var);
        } else if ("from_activity_tab_two".equals(str)) {
            m12854j(moment, i + 1, OMSTemplateModeType.page, fm20.m10224d("from_activity_tab_two"), hx60Var);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m12853i(Moment moment, int i, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("liveId", moment.live.f228id);
            jSONObject.put("anchorId", moment.live.anchor.f264id);
            jSONObject.put("module", z ? "video_off" : "video_living");
            jSONObject.put("index", String.valueOf(i));
            jSONObject.put("right_recommend_type", "");
            jSONObject.put("live_status", (moment.isLive || !TextUtils.isEmpty(moment.liveState)) ? "on" : "off");
            jSONObject.put("liveRecommendCategory", moment.live.getRecommendCategory());
            jSONObject.put("live_room_live_type", m12847c(moment));
            zvf0.t("e_live_room_enter", OMSDialogPositon.p_nearby, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m12854j(Moment moment, int i, String str, String str2, hx60 hx60Var) {
        if (str2 == null) {
            return;
        }
        if (moment.isVoiceLive && (moment.momentVoiceLiveInfos == null)) {
            zvf0.u("e_live_audio_room_enter", str2, new j760[]{new j760("anchorId", moment.voiceLive.anchor.f264id), new j760("liveId", moment.voiceLive.f711id), new j760("topic_id", moment.voiceLive.voiceRoomInfo.topics.get(0).f300id), new j760("audio_card_type", str2.equals(OMSDialogPositon.p_nearby) ? "big_card" : "user_card"), new j760("audio_tab_id", ""), new j760("index", String.valueOf(i)), new j760("audio_room_type", moment.voiceLive.voiceRoomInfo.maskMode ? "mask_audio" : "normal_audio")});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("liveId", moment.live.f228id);
            jSONObject.put("anchorId", moment.live.anchor.f264id);
            jSONObject.put("module", m12848d(moment, str));
            jSONObject.put("index", String.valueOf(i));
            jSONObject.put("right_recommend_type", "");
            jSONObject.put("live_status", (moment.isLive || !TextUtils.isEmpty(moment.liveState)) ? "on" : "off");
            jSONObject.put("trace_id", "");
            jSONObject.put("liveRecommendCategory", moment.live.getRecommendCategory());
            jSONObject.put("live_room_live_type", m12847c(moment));
            if ("follow_photo".equals(str) || "nearby_photo".equals(str)) {
                jSONObject.put("show_label", moment.iconTitle);
            } else {
                JSONObject jSONObject2 = new JSONObject();
                if (NullChecker.a(hx60Var.mo10741m(moment.owner))) {
                    jSONObject2.put("distance", i0g0.p(hx60Var.mo10741m(moment.owner).location.distance, true));
                }
                jSONObject.put("show_label", jSONObject2);
            }
            zvf0.t("e_live_room_enter", str2, jSONObject);
        } catch (Exception e) {
            CrashHelper.c(e);
            sm80.b(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m12855k(Moment moment, int i, String str, String str2, String str3) {
        MomentVoiceLiveInfos momentVoiceLiveInfos;
        if (moment.isVoiceLive && (momentVoiceLiveInfos = moment.momentVoiceLiveInfos) != null && momentVoiceLiveInfos.momentVoiceUser != null) {
            zvf0.u("e_live_audio_room_enter", str, new j760[]{new j760("anchorId", momentVoiceLiveInfos.anchorUserID), new j760("liveId", moment.momentVoiceLiveInfos.liveID), new j760("topic_id", moment.momentVoiceLiveInfos.topicID), new j760("audio_card_type", "user_card"), new j760("audio_tab_id", ""), new j760("audio_room_label", moment.momentVoiceLiveInfos.topicName), new j760("index", String.valueOf(i)), new j760("enter_type", str3), new j760("voice_template", moment.momentVoiceLiveInfos.momentVoiceUser.momentVoiceTemplate), new j760("audio_card_type", moment.momentVoiceLiveInfos.momentVoiceUser.momentIsAnchor ? "discover_moment_anchor" : "discover_moment_room"), new j760("audio_room_type", "normal_audio")});
            return;
        }
        VoiceLive voiceLive = moment.voiceLive;
        if (voiceLive == null || str == null || str2 == null) {
            return;
        }
        zvf0.u("e_live_audio_room_enter", str, new j760[]{new j760("anchorId", voiceLive.anchor.f264id), new j760("liveId", moment.voiceLive.f711id), new j760("audio_card_type", "user_card"), new j760("audio_tab_id", ""), new j760("index", String.valueOf(i))});
    }

    /* JADX INFO: renamed from: g */
    public static void m12851g(Moment moment, String str, boolean z, PhotoAlbumBaseFrag photoAlbumBaseFrag) {
    }
}
