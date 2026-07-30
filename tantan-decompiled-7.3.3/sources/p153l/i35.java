package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class i35 {
    /* JADX INFO: renamed from: a */
    public static void m138265a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        i4g0.m138520r("e_live_fanbase_message", str);
    }

    /* JADX INFO: renamed from: b */
    public static void m138266b(String str) {
        i4g0.m138526x("e_live_fanbase_message", str);
    }

    /* JADX INFO: renamed from: c */
    public static void m138267c(String str, oo2 oo2Var, String str2) {
        afu.m97554c(str, tfs.m190969k().m190972b(oo2Var, true).m190975e(str2).m190971a());
    }

    /* JADX INFO: renamed from: d */
    public static void m138268d(String str, oo2 oo2Var, String str2) {
        afu.m97555d(str, tfs.m190969k().m190972b(oo2Var, true).m190975e(str2).m190971a());
    }

    /* JADX INFO: renamed from: e */
    public static void m138269e(String str) {
        i4g0.m138520r("e_live_redpacket_message", str);
    }

    /* JADX INFO: renamed from: f */
    public static void m138270f(String str) {
        i4g0.m138523u("e_live_chat_activity", str, jyb.m147494Y("chat_activity_type", "basketball_pop_card"));
    }

    /* JADX INFO: renamed from: g */
    public static void m138271g(String str, oo2 oo2Var, p9t p9tVar) {
        i4g0.m138523u("e_live_user_notification", str, jyb.m147494Y("anchor_id", oo2Var.m168532l0().f56859id), jyb.m147494Y("live_id", oo2Var.m202191k()), jyb.m147494Y("notification_content", p9tVar.m171384g()));
    }

    /* JADX INFO: renamed from: h */
    public static void m138272h(String str, oo2 oo2Var, p9t p9tVar) {
        i4g0.m138492A("e_live_user_notification", str, jyb.m147494Y("anchor_id", oo2Var.m168532l0().f56859id), jyb.m147494Y("live_id", oo2Var.m202191k()), jyb.m147494Y("notification_content", p9tVar.m171384g()));
    }

    /* JADX INFO: renamed from: i */
    public static void m138273i(LiveMessage liveMessage, String str) {
        if (liveMessage.isJoinRedPacketMessage()) {
            i4g0.m138526x("e_live_redpacket_message", str);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m138274j(oo2 oo2Var, LiveMessage liveMessage, i6t i6tVar) {
        LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
        if (extInfo == null || extInfo.buttonUserInfo == null || oo2Var == null) {
            return;
        }
        if ("voiceFollowUser".equals(extInfo.buttonScene)) {
            afu.m97563l(liveMessage, oo2Var.m168532l0().f56859id, oo2Var.m202191k(), oo2Var.m168538n0().state);
            return;
        }
        LiveMessage.ExtInfo extInfo2 = liveMessage.extInfo;
        String str = extInfo2.buttonUserInfo.userId;
        BLiveAtUserInfo bLiveAtUserInfo = extInfo2.atUserInfo;
        afu.m97566o(i6tVar, oo2Var, str, bLiveAtUserInfo != null ? bLiveAtUserInfo.userId : "", extInfo2.buttonScene);
    }

    /* JADX INFO: renamed from: k */
    public static void m138275k(rwn0 rwn0Var, LiveMessage liveMessage, yno0 yno0Var) {
        BLiveAtUserInfo bLiveAtUserInfo;
        LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
        if (extInfo != null && rwn0Var != null && ("sendStarToUser".equals(extInfo.buttonScene) || "guideNewUserSendStar".equals(liveMessage.extInfo.buttonScene))) {
            String str = zrv.f205799a.m207631D0().equals(rwn0Var.m168526j0()) ? "p_anchor_audio_room" : "p_user_audio_room";
            String str2 = "guideNewUserSendStar".equals(liveMessage.extInfo.buttonScene) ? "send_star_new_user" : "send_star";
            HashMap map = new HashMap();
            map.put("audio_message_type", str2);
            map.put("anchorId", rwn0Var.m168526j0());
            map.put("liveId", rwn0Var.m202191k());
            map.put("roomId", rwn0Var.m202194o());
            map.put("user_type", i9o0.m139140l(yno0Var));
            if ("sendStarToUser".equals(liveMessage.extInfo.buttonScene) && (bLiveAtUserInfo = liveMessage.extInfo.buttonUserInfo) != null) {
                map.put("interact_user_id", bLiveAtUserInfo.userId);
            }
            i4g0.m138527y("e_live_audio_auto_msg", str, map);
            return;
        }
        LiveMessage.ExtInfo extInfo2 = liveMessage.extInfo;
        if (extInfo2 != null && rwn0Var != null && "voiceRoomApplaud".equals(extInfo2.buttonScene)) {
            HashMap map2 = new HashMap();
            map2.put("audio_message_type", "upgrade_clapping");
            map2.put("anchorId", rwn0Var.m168526j0());
            map2.put("liveId", rwn0Var.m202191k());
            map2.put("roomId", rwn0Var.m202194o());
            map2.put("user_type", i9o0.m139140l(yno0Var));
            i4g0.m138527y("e_live_audio_auto_msg", "p_user_audio_room", map2);
            return;
        }
        LiveMessage.ExtInfo extInfo3 = liveMessage.extInfo;
        if (extInfo3 != null && rwn0Var != null && "openAuctionApplyPanel".equals(extInfo3.buttonScene)) {
            HashMap map3 = new HashMap();
            map3.put("audio_message_type", "check_auction_queue");
            map3.put("anchorId", rwn0Var.m168526j0());
            map3.put("liveId", rwn0Var.m202191k());
            map3.put("roomId", rwn0Var.m202194o());
            map3.put("user_type", i9o0.m139140l(yno0Var));
            i4g0.m138527y("e_live_audio_auto_msg", "p_anchor_audio_room", map3);
            return;
        }
        if (TextUtils.isEmpty(liveMessage.source) || rwn0Var == null) {
            return;
        }
        HashMap map4 = new HashMap();
        map4.put("audio_message_type", liveMessage.source);
        map4.put("anchorId", rwn0Var.m168526j0());
        map4.put("liveId", rwn0Var.m202191k());
        map4.put("roomId", rwn0Var.m202194o());
        map4.put("user_type", i9o0.m139140l(yno0Var));
        i4g0.m138527y("e_live_audio_auto_msg", zrv.f205799a.m207631D0().equals(rwn0Var.m168526j0()) ? "p_anchor_audio_room" : "p_user_audio_room", map4);
    }
}
