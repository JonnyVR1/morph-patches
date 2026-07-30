package p153l;

import android.app.Activity;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class afu {
    /* JADX INFO: renamed from: a */
    public static String m97552a(String str) {
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
    public static void m97553b(String str, String str2) {
        i4g0.m138493B("e_audio_quit_rtc_room_fail", "", jyb.m147494Y("anchor_id", str), jyb.m147494Y("live_id", str2));
    }

    /* JADX INFO: renamed from: c */
    public static void m97554c(String str, tfs tfsVar) {
        i4g0.m138521s(MatchScData.ModuleId.mid_e_follow, str, tfsVar.m190970j());
    }

    /* JADX INFO: renamed from: d */
    public static void m97555d(String str, tfs tfsVar) {
        Activity activity;
        if (Act.foreground_() == null || Act.foreground_().f16062a == null || (activity = Act.foreground_().f16062a.get()) == null || !(activity instanceof LiveAct) || ((LiveAct) activity).lifecycle_() != C4470c.f16267i) {
            return;
        }
        i4g0.m138527y(MatchScData.ModuleId.mid_e_follow, str, tfsVar.m190970j());
    }

    /* JADX INFO: renamed from: e */
    public static void m97556e(LiveMessage liveMessage, zod zodVar) {
        LiveMessage.ExtInfo extInfo;
        String str;
        if (liveMessage == null || liveMessage.isErrorMessage || (extInfo = liveMessage.extInfo) == null || !"otherFollowAnchor".equals(extInfo.followType) || (str = liveMessage.extInfo.followUserId) == null || str.equals(zrv.f205799a.m207631D0())) {
            return;
        }
        m97555d(zodVar.m220737e(), tfs.m190969k().m190973c(liveMessage, zodVar).m190971a());
    }

    /* JADX INFO: renamed from: f */
    public static void m97557f(ljt ljtVar, String str) {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        q4fVar.f155581s = "e_user_live_room_swipe";
        q4fVar.f155585w = ljtVar.m154552a();
        q4fVar.f155576n = str;
        i4g0.m138515m(q4fVar);
    }

    /* JADX INFO: renamed from: g */
    public static String m97558g(BLiveAbsData bLiveAbsData, boolean z) {
        if (bLiveAbsData == null) {
            return "";
        }
        if (z) {
            return bLiveAbsData.isVoiceLive() ? "p_anchor_audio_room" : "p_anchor_live_room";
        }
        return bLiveAbsData.isVoiceLive() ? "p_user_audio_room" : "p_user_live_room";
    }

    /* JADX INFO: renamed from: h */
    public static void m97559h(kfd0 kfd0Var, String str) {
        m97560i(kfd0Var, str, Collections.EMPTY_MAP);
    }

    /* JADX INFO: renamed from: i */
    public static void m97560i(kfd0 kfd0Var, String str, Map<String, ?> map) {
        if (str != null) {
            bfu.m104073e(str, kfd0Var.m149387w(map));
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m97561j(kfd0 kfd0Var, String str) {
        m97562k(kfd0Var, str, Collections.EMPTY_MAP);
    }

    /* JADX INFO: renamed from: k */
    public static void m97562k(kfd0 kfd0Var, String str, Map<String, ?> map) {
        if (str != null) {
            bfu.m104074f(str, kfd0Var.m149387w(map));
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m97563l(LiveMessage liveMessage, String str, String str2, BLiveState bLiveState) {
        LiveMessage.ExtInfo extInfo;
        if (liveMessage == null || liveMessage.isErrorMessage || (extInfo = liveMessage.extInfo) == null || extInfo.buttonUserInfo == null) {
            return;
        }
        m97555d(zrv.f205799a.m207631D0().equals(str) ? "p_user_live_room" : "p_user_audio_room", tfs.m190969k().m190976f(str2).m190974d(str).m190977g(bLiveState).m190978h(liveMessage.extInfo.buttonUserInfo.userId).m190975e(m97567p(liveMessage.getVoiceFollowSource())).m190971a());
    }

    /* JADX INFO: renamed from: m */
    public static void m97564m(LiveMessage liveMessage, zod zodVar) {
        if (liveMessage == null || liveMessage.isErrorMessage || liveMessage.extInfo == null) {
            return;
        }
        BLiveAbsData bLiveAbsDataM220733a = zodVar.m220733a();
        if (y6s.m214494b(bLiveAbsDataM220733a.liveMode)) {
            gzl0.m133104a(liveMessage, zodVar);
        } else {
            m97555d(zodVar.m220737e(), tfs.m190969k().m190976f(bLiveAbsDataM220733a.f45171id).m190977g(bLiveAbsDataM220733a.state).m190974d(bLiveAbsDataM220733a.anchor.f45267id).m190978h(liveMessage.extInfo.followUserId).m190975e(m97567p(liveMessage.getVoiceFollowSource())).m190971a());
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m97565n(String str, String str2, String str3, String str4) {
        String str5 = zrv.f205799a.m207631D0().equals(str2) ? "p_anchor_audio_room" : "p_user_audio_room";
        String strM97552a = m97552a(str4);
        if (TextUtils.isEmpty(strM97552a)) {
            return;
        }
        i4g0.m138523u("e_live_audio_auto_msg", str5, new pf60("audio_message_type", strM97552a), new pf60("anchorId", str2), new pf60("liveId", str), new pf60("interact_user_id", str3));
    }

    /* JADX INFO: renamed from: o */
    public static void m97566o(i6t i6tVar, oo2 oo2Var, String str, String str2, String str3) {
        if (!"chatReply".equals(str3) || zrv.f205799a.m207631D0().equals(str2)) {
            String strM97552a = m97552a(str3);
            String str4 = oo2Var.m168532l0().f56859id;
            if (TextUtils.isEmpty(strM97552a)) {
                return;
            }
            i4g0.m138492A("e_live_audio_auto_msg", zrv.f205799a.m207631D0().equals(str4) ? "p_anchor_audio_room" : "p_user_audio_room", new pf60("audio_message_type", strM97552a), new pf60("anchorId", str4), new pf60("liveId", oo2Var.m202191k()), new pf60("roomId", oo2Var.m202194o()), new pf60("user_type", i9o0.m139140l(i6tVar)), new pf60("interact_user_id", str));
        }
    }

    /* JADX INFO: renamed from: p */
    public static String m97567p(int i) {
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
