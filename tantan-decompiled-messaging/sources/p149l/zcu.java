package p149l;

import android.app.Activity;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class zcu {
    /* JADX INFO: renamed from: a */
    public static String m218086a(String str) {
        str.getClass();
        switch (str) {
            case "userApplyVoiceCall":
                return "enter_voice_chat";
            case "anchorInviteCall":
                return "invite_voice_chat";
            case "chat":
                return "welcome_message";
            case "buttonOpenProfile":
                return "open_profile_card";
            case "inviteVoiceCall":
                return "enter_invite_voice_chat";
            case "jumpVoiceFlameMarket":
                return "rights_exchange";
            case "chatReply":
                return "reply_msg";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m218087b(String str, String str2) {
        zvf0.m220369B("e_audio_quit_rtc_room_fail", "", vwb.m200311Y("anchor_id", str), vwb.m200311Y("live_id", str2));
    }

    /* JADX INFO: renamed from: c */
    public static void m218088c(String str, sds sdsVar) {
        zvf0.m220397s(MatchScData.ModuleId.mid_e_follow, str, sdsVar.m183541j());
    }

    /* JADX INFO: renamed from: d */
    public static void m218089d(String str, sds sdsVar) {
        Activity activity;
        if (Act.foreground_() == null || Act.foreground_().f15343a == null || (activity = Act.foreground_().f15343a.get()) == null || !(activity instanceof LiveAct) || ((LiveAct) activity).lifecycle_() != C4319c.f15548i) {
            return;
        }
        zvf0.m220403y(MatchScData.ModuleId.mid_e_follow, str, sdsVar.m183541j());
    }

    /* JADX INFO: renamed from: e */
    public static void m218090e(LiveMessage liveMessage, und undVar) {
        LiveMessage.ExtInfo extInfo;
        String str;
        if (liveMessage == null || liveMessage.isErrorMessage || (extInfo = liveMessage.extInfo) == null || !"otherFollowAnchor".equals(extInfo.followType) || (str = liveMessage.extInfo.followUserId) == null || str.equals(ypv.f199493a.m199309D0())) {
            return;
        }
        m218089d(undVar.m194418e(), sds.m183540k().m183544c(liveMessage, undVar).m183542a());
    }

    /* JADX INFO: renamed from: f */
    public static void m218091f(kht khtVar, String str) {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        l3fVar.f125900s = "e_user_live_room_swipe";
        l3fVar.f125904w = khtVar.m145996a();
        l3fVar.f125895n = str;
        zvf0.m220391m(l3fVar);
    }

    /* JADX INFO: renamed from: g */
    public static String m218092g(BLiveAbsData bLiveAbsData, boolean z) {
        if (bLiveAbsData == null) {
            return "";
        }
        if (z) {
            return bLiveAbsData.isVoiceLive() ? "p_anchor_audio_room" : "p_anchor_live_room";
        }
        return bLiveAbsData.isVoiceLive() ? "p_user_audio_room" : "p_user_live_room";
    }

    /* JADX INFO: renamed from: h */
    public static void m218093h(h7d0 h7d0Var, String str) {
        m218094i(h7d0Var, str, Collections.EMPTY_MAP);
    }

    /* JADX INFO: renamed from: i */
    public static void m218094i(h7d0 h7d0Var, String str, Map<String, ?> map) {
        if (str != null) {
            adu.m96009e(str, h7d0Var.m129657w(map));
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m218095j(h7d0 h7d0Var, String str) {
        m218096k(h7d0Var, str, Collections.EMPTY_MAP);
    }

    /* JADX INFO: renamed from: k */
    public static void m218096k(h7d0 h7d0Var, String str, Map<String, ?> map) {
        if (str != null) {
            adu.m96010f(str, h7d0Var.m129657w(map));
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m218097l(LiveMessage liveMessage, String str, String str2, BLiveState bLiveState) {
        LiveMessage.ExtInfo extInfo;
        if (liveMessage == null || liveMessage.isErrorMessage || (extInfo = liveMessage.extInfo) == null || extInfo.buttonUserInfo == null) {
            return;
        }
        m218089d(ypv.f199493a.m199309D0().equals(str) ? "p_user_live_room" : "p_user_audio_room", sds.m183540k().m183547f(str2).m183545d(str).m183548g(bLiveState).m183549h(liveMessage.extInfo.buttonUserInfo.userId).m183546e(m218101p(liveMessage.getVoiceFollowSource())).m183542a());
    }

    /* JADX INFO: renamed from: m */
    public static void m218098m(LiveMessage liveMessage, und undVar) {
        if (liveMessage == null || liveMessage.isErrorMessage || liveMessage.extInfo == null) {
            return;
        }
        BLiveAbsData bLiveAbsDataM194414a = undVar.m194414a();
        if (x4s.m207012b(bLiveAbsDataM194414a.liveMode)) {
            cql0.m108279a(liveMessage, undVar);
        } else {
            m218089d(undVar.m194418e(), sds.m183540k().m183547f(bLiveAbsDataM194414a.f44323id).m183548g(bLiveAbsDataM194414a.state).m183545d(bLiveAbsDataM194414a.anchor.f44419id).m183549h(liveMessage.extInfo.followUserId).m183546e(m218101p(liveMessage.getVoiceFollowSource())).m183542a());
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m218099n(String str, String str2, String str3, String str4) {
        String str5 = ypv.f199493a.m199309D0().equals(str2) ? "p_anchor_audio_room" : "p_user_audio_room";
        String strM218086a = m218086a(str4);
        if (TextUtils.isEmpty(strM218086a)) {
            return;
        }
        zvf0.m220399u("e_live_audio_auto_msg", str5, new j760("audio_message_type", strM218086a), new j760("anchorId", str2), new j760("liveId", str), new j760("interact_user_id", str3));
    }

    /* JADX INFO: renamed from: o */
    public static void m218100o(h4t h4tVar, ho2 ho2Var, String str, String str2, String str3) {
        if (!"chatReply".equals(str3) || ypv.f199493a.m199309D0().equals(str2)) {
            String strM218086a = m218086a(str3);
            String str4 = ho2Var.m132146l0().f56011id;
            if (TextUtils.isEmpty(strM218086a)) {
                return;
            }
            zvf0.m220368A("e_live_audio_auto_msg", ypv.f199493a.m199309D0().equals(str4) ? "p_anchor_audio_room" : "p_user_audio_room", new j760("audio_message_type", strM218086a), new j760("anchorId", str4), new j760("liveId", ho2Var.m149814k()), new j760("roomId", ho2Var.m149818o()), new j760("user_type", e0o0.m114325l(h4tVar)), new j760("interact_user_id", str));
        }
    }

    /* JADX INFO: renamed from: p */
    public static String m218101p(int i) {
        if (i == 0) {
            return "message_match_condition_stay_duration";
        }
        if (i == 1) {
            return "message_match_condition_voice_call";
        }
        if (i != 2) {
            return i != 3 ? "audio_message" : "message_match_condition_someone_follow_anchor";
        }
        return "message_match_condition_send_gift";
    }
}
