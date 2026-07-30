package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.tantanapp.common.data.DbObject;
import java.util.HashMap;
import l.e0o0;
import l.j760;
import l.nnn0;
import l.sds;
import l.ueo0;
import l.vwb;
import l.ypv;
import l.zcu;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j25 {
    /* JADX INFO: renamed from: a */
    public static void m15556a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zvf0.r("e_live_fanbase_message", str);
    }

    /* JADX INFO: renamed from: b */
    public static void m15557b(String str) {
        zvf0.x("e_live_fanbase_message", str);
    }

    /* JADX INFO: renamed from: c */
    public static void m15558c(String str, ho2 ho2Var, String str2) {
        zcu.c(str, sds.k().b(ho2Var, true).e(str2).a());
    }

    /* JADX INFO: renamed from: d */
    public static void m15559d(String str, ho2 ho2Var, String str2) {
        zcu.d(str, sds.k().b(ho2Var, true).e(str2).a());
    }

    /* JADX INFO: renamed from: e */
    public static void m15560e(String str) {
        zvf0.r("e_live_redpacket_message", str);
    }

    /* JADX INFO: renamed from: f */
    public static void m15561f(String str) {
        zvf0.u("e_live_chat_activity", str, new j760[]{vwb.Y("chat_activity_type", "basketball_pop_card")});
    }

    /* JADX INFO: renamed from: g */
    public static void m15562g(String str, ho2 ho2Var, o7t o7tVar) {
        zvf0.u("e_live_user_notification", str, new j760[]{vwb.Y("anchor_id", ((DbObject) ho2Var.m14582l0()).id), vwb.Y("live_id", ho2Var.m17235k()), vwb.Y("notification_content", o7tVar.m19283g())});
    }

    /* JADX INFO: renamed from: h */
    public static void m15563h(String str, ho2 ho2Var, o7t o7tVar) {
        zvf0.A("e_live_user_notification", str, new j760[]{vwb.Y("anchor_id", ((DbObject) ho2Var.m14582l0()).id), vwb.Y("live_id", ho2Var.m17235k()), vwb.Y("notification_content", o7tVar.m19283g())});
    }

    /* JADX INFO: renamed from: i */
    public static void m15564i(LiveMessage liveMessage, String str) {
        if (liveMessage.isJoinRedPacketMessage()) {
            zvf0.x("e_live_redpacket_message", str);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m15565j(ho2 ho2Var, LiveMessage liveMessage, h4t h4tVar) {
        LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
        if (extInfo == null || extInfo.buttonUserInfo == null || ho2Var == null) {
            return;
        }
        if ("voiceFollowUser".equals(extInfo.buttonScene)) {
            zcu.l(liveMessage, ((DbObject) ho2Var.m14582l0()).id, ho2Var.m17235k(), ho2Var.m14588n0().state);
            return;
        }
        LiveMessage.ExtInfo extInfo2 = liveMessage.extInfo;
        String str = extInfo2.buttonUserInfo.userId;
        BLiveAtUserInfo bLiveAtUserInfo = extInfo2.atUserInfo;
        zcu.o(h4tVar, ho2Var, str, bLiveAtUserInfo != null ? bLiveAtUserInfo.userId : "", extInfo2.buttonScene);
    }

    /* JADX INFO: renamed from: k */
    public static void m15566k(nnn0 nnn0Var, LiveMessage liveMessage, ueo0 ueo0Var) {
        BLiveAtUserInfo bLiveAtUserInfo;
        LiveMessage.ExtInfo extInfo = liveMessage.extInfo;
        if (extInfo != null && nnn0Var != null && ("sendStarToUser".equals(extInfo.buttonScene) || "guideNewUserSendStar".equals(liveMessage.extInfo.buttonScene))) {
            String str = ypv.a.D0().equals(nnn0Var.m14576j0()) ? "p_anchor_audio_room" : "p_user_audio_room";
            String str2 = "guideNewUserSendStar".equals(liveMessage.extInfo.buttonScene) ? "send_star_new_user" : "send_star";
            HashMap map = new HashMap();
            map.put("audio_message_type", str2);
            map.put("anchorId", nnn0Var.m14576j0());
            map.put("liveId", nnn0Var.m17235k());
            map.put("roomId", nnn0Var.m17239o());
            map.put("user_type", e0o0.l(ueo0Var));
            if ("sendStarToUser".equals(liveMessage.extInfo.buttonScene) && (bLiveAtUserInfo = liveMessage.extInfo.buttonUserInfo) != null) {
                map.put("interact_user_id", bLiveAtUserInfo.userId);
            }
            zvf0.y("e_live_audio_auto_msg", str, map);
            return;
        }
        LiveMessage.ExtInfo extInfo2 = liveMessage.extInfo;
        if (extInfo2 != null && nnn0Var != null && "voiceRoomApplaud".equals(extInfo2.buttonScene)) {
            HashMap map2 = new HashMap();
            map2.put("audio_message_type", "upgrade_clapping");
            map2.put("anchorId", nnn0Var.m14576j0());
            map2.put("liveId", nnn0Var.m17235k());
            map2.put("roomId", nnn0Var.m17239o());
            map2.put("user_type", e0o0.l(ueo0Var));
            zvf0.y("e_live_audio_auto_msg", "p_user_audio_room", map2);
            return;
        }
        LiveMessage.ExtInfo extInfo3 = liveMessage.extInfo;
        if (extInfo3 != null && nnn0Var != null && "openAuctionApplyPanel".equals(extInfo3.buttonScene)) {
            HashMap map3 = new HashMap();
            map3.put("audio_message_type", "check_auction_queue");
            map3.put("anchorId", nnn0Var.m14576j0());
            map3.put("liveId", nnn0Var.m17235k());
            map3.put("roomId", nnn0Var.m17239o());
            map3.put("user_type", e0o0.l(ueo0Var));
            zvf0.y("e_live_audio_auto_msg", "p_anchor_audio_room", map3);
            return;
        }
        if (TextUtils.isEmpty(liveMessage.source) || nnn0Var == null) {
            return;
        }
        HashMap map4 = new HashMap();
        map4.put("audio_message_type", liveMessage.source);
        map4.put("anchorId", nnn0Var.m14576j0());
        map4.put("liveId", nnn0Var.m17235k());
        map4.put("roomId", nnn0Var.m17239o());
        map4.put("user_type", e0o0.l(ueo0Var));
        zvf0.y("e_live_audio_auto_msg", ypv.a.D0().equals(nnn0Var.m14576j0()) ? "p_anchor_audio_room" : "p_user_audio_room", map4);
    }
}
