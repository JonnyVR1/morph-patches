package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class j25 {
    /* JADX INFO: renamed from: a */
    public static void m139405a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zvf0.m220396r("e_live_fanbase_message", str);
    }

    /* JADX INFO: renamed from: b */
    public static void m139406b(String str) {
        zvf0.m220402x("e_live_fanbase_message", str);
    }

    /* JADX INFO: renamed from: c */
    public static void m139407c(String str, ho2 ho2Var, String str2) {
        zcu.m218088c(str, sds.m183540k().m183543b(ho2Var, true).m183546e(str2).m183542a());
    }

    /* JADX INFO: renamed from: d */
    public static void m139408d(String str, ho2 ho2Var, String str2) {
        zcu.m218089d(str, sds.m183540k().m183543b(ho2Var, true).m183546e(str2).m183542a());
    }

    /* JADX INFO: renamed from: e */
    public static void m139409e(String str) {
        zvf0.m220396r("e_live_redpacket_message", str);
    }

    /* JADX INFO: renamed from: f */
    public static void m139410f(String str) {
        zvf0.m220399u("e_live_chat_activity", str, vwb.m200311Y("chat_activity_type", "basketball_pop_card"));
    }

    /* JADX INFO: renamed from: g */
    public static void m139411g(String str, ho2 ho2Var, o7t o7tVar) {
        zvf0.m220399u("e_live_user_notification", str, vwb.m200311Y("anchor_id", ho2Var.m132146l0().f56011id), vwb.m200311Y("live_id", ho2Var.m149814k()), vwb.m200311Y("notification_content", o7tVar.m163055g()));
    }

    /* JADX INFO: renamed from: h */
    public static void m139412h(String str, ho2 ho2Var, o7t o7tVar) {
        zvf0.m220368A("e_live_user_notification", str, vwb.m200311Y("anchor_id", ho2Var.m132146l0().f56011id), vwb.m200311Y("live_id", ho2Var.m149814k()), vwb.m200311Y("notification_content", o7tVar.m163055g()));
    }

    /* JADX INFO: renamed from: i */
    public static void m139413i(LiveMessage liveMessage, String str) {
        if (liveMessage.isJoinRedPacketMessage()) {
            zvf0.m220402x("e_live_redpacket_message", str);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m139414j(ho2 ho2Var, LiveMessage liveMessage, h4t h4tVar) {
        LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
        if (extInfo == null || extInfo.buttonUserInfo == null || ho2Var == null) {
            return;
        }
        if ("voiceFollowUser".equals(extInfo.buttonScene)) {
            zcu.m218097l(liveMessage, ho2Var.m132146l0().f56011id, ho2Var.m149814k(), ho2Var.m132152n0().state);
            return;
        }
        LiveMessage.ExtInfo extInfo2 = liveMessage.extInfo;
        String str = extInfo2.buttonUserInfo.userId;
        BLiveAtUserInfo bLiveAtUserInfo = extInfo2.atUserInfo;
        zcu.m218100o(h4tVar, ho2Var, str, bLiveAtUserInfo != null ? bLiveAtUserInfo.userId : "", extInfo2.buttonScene);
    }

    /* JADX INFO: renamed from: k */
    public static void m139415k(nnn0 nnn0Var, LiveMessage liveMessage, ueo0 ueo0Var) {
        BLiveAtUserInfo bLiveAtUserInfo;
        LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
        if (extInfo != null && nnn0Var != null && ("sendStarToUser".equals(extInfo.buttonScene) || "guideNewUserSendStar".equals(liveMessage.extInfo.buttonScene))) {
            String str = ypv.f199493a.m199309D0().equals(nnn0Var.m132140j0()) ? "p_anchor_audio_room" : "p_user_audio_room";
            String str2 = "guideNewUserSendStar".equals(liveMessage.extInfo.buttonScene) ? "send_star_new_user" : "send_star";
            HashMap map = new HashMap();
            map.put("audio_message_type", str2);
            map.put("anchorId", nnn0Var.m132140j0());
            map.put("liveId", nnn0Var.m149814k());
            map.put("roomId", nnn0Var.m149818o());
            map.put("user_type", e0o0.m114325l(ueo0Var));
            if ("sendStarToUser".equals(liveMessage.extInfo.buttonScene) && (bLiveAtUserInfo = liveMessage.extInfo.buttonUserInfo) != null) {
                map.put("interact_user_id", bLiveAtUserInfo.userId);
            }
            zvf0.m220403y("e_live_audio_auto_msg", str, map);
            return;
        }
        LiveMessage.ExtInfo extInfo2 = liveMessage.extInfo;
        if (extInfo2 != null && nnn0Var != null && "voiceRoomApplaud".equals(extInfo2.buttonScene)) {
            HashMap map2 = new HashMap();
            map2.put("audio_message_type", "upgrade_clapping");
            map2.put("anchorId", nnn0Var.m132140j0());
            map2.put("liveId", nnn0Var.m149814k());
            map2.put("roomId", nnn0Var.m149818o());
            map2.put("user_type", e0o0.m114325l(ueo0Var));
            zvf0.m220403y("e_live_audio_auto_msg", "p_user_audio_room", map2);
            return;
        }
        LiveMessage.ExtInfo extInfo3 = liveMessage.extInfo;
        if (extInfo3 != null && nnn0Var != null && "openAuctionApplyPanel".equals(extInfo3.buttonScene)) {
            HashMap map3 = new HashMap();
            map3.put("audio_message_type", "check_auction_queue");
            map3.put("anchorId", nnn0Var.m132140j0());
            map3.put("liveId", nnn0Var.m149814k());
            map3.put("roomId", nnn0Var.m149818o());
            map3.put("user_type", e0o0.m114325l(ueo0Var));
            zvf0.m220403y("e_live_audio_auto_msg", "p_anchor_audio_room", map3);
            return;
        }
        if (TextUtils.isEmpty(liveMessage.source) || nnn0Var == null) {
            return;
        }
        HashMap map4 = new HashMap();
        map4.put("audio_message_type", liveMessage.source);
        map4.put("anchorId", nnn0Var.m132140j0());
        map4.put("liveId", nnn0Var.m149814k());
        map4.put("roomId", nnn0Var.m149818o());
        map4.put("user_type", e0o0.m114325l(ueo0Var));
        zvf0.m220403y("e_live_audio_auto_msg", ypv.f199493a.m199309D0().equals(nnn0Var.m132140j0()) ? "p_anchor_audio_room" : "p_user_audio_room", map4);
    }
}
