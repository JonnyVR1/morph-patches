package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveState;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import java.util.Map;
import l.j760;
import l.l3f;
import l.vwb;
import l.ypv;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nqe {
    /* JADX INFO: renamed from: A */
    public static void m18938A(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, ho2 ho2Var, boolean z, boolean z2, boolean z3) {
        if (!m18946a(bLiveGiftItem, z3) || bLiveGiftItem.isFaceGift()) {
            return;
        }
        l3f l3fVar = new l3f();
        l3fVar.s = "e_gift_receive";
        l3fVar.d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        zvf0.n(l3fVar, m18953h(bLiveGivenGiftBrief, bLiveGiftItem, ho2Var, z, z2));
    }

    /* JADX INFO: renamed from: B */
    public static void m18939B(BLiveGivenGiftBrief bLiveGivenGiftBrief, ho2 ho2Var, boolean z, boolean z2, boolean z3) {
        if (z3 || m18958m(bLiveGivenGiftBrief)) {
            l3f l3fVar = new l3f();
            l3fVar.s = "e_gift_receive";
            l3fVar.d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            zvf0.n(l3fVar, m18953h(bLiveGivenGiftBrief, null, ho2Var, z, z2));
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m18940C(bwc0 bwc0Var) {
        return (bwc0Var.m10632a().m17351d() || m18960o(bwc0Var)) && m18956k(bwc0Var.m10632a().m17348a());
    }

    /* JADX INFO: renamed from: D */
    public static void m18941D(String str, bwc0 bwc0Var) {
        if (bwc0Var != null && m18940C(bwc0Var)) {
            l3f l3fVar = new l3f();
            l3fVar.s = str;
            l3fVar.d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            lqe lqeVarM10632a = bwc0Var.m10632a();
            lqeVarM10632a.m17352e(false);
            zvf0.n(l3fVar, lqeVarM10632a.m17350c());
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m18942E(boolean z, String str, boolean z2) {
        if (TextUtils.isEmpty(str) || str.equals("0")) {
            return;
        }
        zvf0.D("e_live_gift_check_res", z ? "p_anchor_live_room" : "p_user_live_room", new j760[]{vwb.Y("effect_id", str), vwb.Y("type", "play"), vwb.Y("error", Boolean.valueOf(z2))});
    }

    /* JADX INFO: renamed from: F */
    public static void m18943F(boolean z, String str, boolean z2, boolean z3, boolean z4) {
        if (TextUtils.isEmpty(str) || str.equals("0")) {
            return;
        }
        zvf0.D("e_live_gift_check_res", z ? "p_anchor_live_room" : "p_user_live_room", new j760[]{vwb.Y("effect_id", str), vwb.Y("ready", z2 ? "yes" : "no"), vwb.Y("type", z3 ? "tray" : "send"), vwb.Y("in_preload", Boolean.valueOf(z4))});
    }

    /* JADX INFO: renamed from: G */
    public static void m18944G(String str, boolean z, boolean z2, long j) {
        if (TextUtils.isEmpty(str) || str.equals("0")) {
            return;
        }
        j760 j760VarY = vwb.Y("effect_id", str);
        j760 j760VarY2 = vwb.Y("ready", "no");
        j760 j760VarY3 = vwb.Y("type", z ? "tray_download" : "send_download");
        j760 j760VarY4 = vwb.Y("error", Boolean.valueOf(z2));
        if (z2) {
            j = -1;
        }
        zvf0.D("e_live_gift_check_res", "p_live_gift_download", new j760[]{j760VarY, j760VarY2, j760VarY3, j760VarY4, vwb.Y("duration", Long.valueOf(j))});
    }

    /* JADX INFO: renamed from: H */
    public static void m18945H(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str) || str.equals("0")) {
            return;
        }
        zvf0.D("e_live_gift_check_res_download_error", "p_live_gift_download", new j760[]{vwb.Y("effect_id", str), vwb.Y("url", str2), vwb.Y("md", str3), vwb.Y("error_type", str4)});
    }

    /* JADX INFO: renamed from: a */
    public static boolean m18946a(BLiveGiftItem bLiveGiftItem, boolean z) {
        return z && !TextUtils.isEmpty(bLiveGiftItem.liveResourceId) && m18957l(bLiveGiftItem);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18947b(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, boolean z) {
        if ((z || m18958m(bLiveGivenGiftBrief)) && !TextUtils.isEmpty(bLiveGiftItem.liveResourceId)) {
            return m18957l(bLiveGiftItem) || bLiveGiftItem.isFaceGift();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m18948c(GiftTrayData giftTrayData, boolean z) {
        return (z || m18959n(giftTrayData)) && !TextUtils.isEmpty(giftTrayData.f6161y) && m18956k(giftTrayData.f6140d);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m18949d(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, boolean z) {
        return ((!z && !m18958m(bLiveGivenGiftBrief)) || bLiveGiftItem == null || TextUtils.isEmpty(bLiveGiftItem.liveResourceId)) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m18950e(GiftTrayData giftTrayData, boolean z) {
        return (z || m18959n(giftTrayData)) && !TextUtils.isEmpty(giftTrayData.f6161y);
    }

    /* JADX INFO: renamed from: f */
    public static void m18951f(bwc0 bwc0Var) {
        m18941D("e_download_check", bwc0Var);
    }

    /* JADX INFO: renamed from: g */
    public static lqe m18952g(GiftTrayData giftTrayData, boolean z, boolean z2) {
        return new lqe.C0668a().m17365m(giftTrayData.f6150n, giftTrayData.f6147k).m17369q(giftTrayData.f6141e).m17372t(giftTrayData.f6161y).m17375w(giftTrayData.f6114B).m17367o(giftTrayData.f6115C).m17371s(giftTrayData.f6142f).m17374v(giftTrayData.f6144h).m17368p(z ? "face_gift" : "normal_gift").m17373u(giftTrayData.f6143g).m17370r(giftTrayData.f6140d).m17366n(z2).m17364l();
    }

    /* JADX INFO: renamed from: h */
    public static Map<String, Object> m18953h(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, ho2 ho2Var, boolean z, boolean z2) {
        String str;
        HashMap map = new HashMap();
        map.put("unique_id", bLiveGivenGiftBrief.comboId + "_" + bLiveGivenGiftBrief.combos);
        map.put("giftId", bLiveGiftItem == null ? "" : Integer.valueOf(bLiveGiftItem.id));
        map.put("gift_resource_id", bLiveGiftItem == null ? "" : bLiveGiftItem.liveResourceId);
        map.put("actor_user_id", bLiveGivenGiftBrief.sendGiftExtraInfo.d());
        map.put("anchorId", bLiveGivenGiftBrief.sendGiftExtraInfo.a());
        map.put("giftName", bLiveGiftItem == null ? "" : bLiveGiftItem.getLocalName());
        map.put("liveId", ho2Var == null ? "" : ho2Var.m17234j().id);
        if (bLiveGiftItem == null) {
            str = "";
        } else {
            str = z2 ? "face_gift" : "normal_gift";
        }
        map.put("gift_effect_type", str);
        map.put("gift_source", bLiveGiftItem != null ? Integer.valueOf(bLiveGiftItem.giftSource) : "");
        map.put("live_status", m18955j(ho2Var));
        map.put("process_status", z ? "success" : "fail");
        return map;
    }

    /* JADX INFO: renamed from: i */
    public static Map<String, Object> m18954i(GiftTrayData giftTrayData, boolean z, boolean z2) {
        HashMap map = new HashMap();
        map.put("unique_id", giftTrayData.f6150n + "_" + giftTrayData.f6147k);
        map.put("giftId", Integer.valueOf(giftTrayData.f6141e));
        map.put("gift_resource_id", giftTrayData.f6161y);
        map.put("actor_user_id", giftTrayData.f6114B);
        map.put("anchorId", giftTrayData.f6115C);
        map.put("giftName", giftTrayData.f6142f);
        map.put("liveId", giftTrayData.f6144h);
        map.put("gift_effect_type", z2 ? "face_gift" : "normal_gift");
        map.put("gift_source", Integer.valueOf(giftTrayData.f6143g));
        map.put("process_status", z ? "success" : "fail");
        return map;
    }

    /* JADX INFO: renamed from: j */
    public static String m18955j(ho2 ho2Var) {
        if (ho2Var == null) {
            return "";
        }
        BLiveState bLiveState = ho2Var.m17234j().state;
        return (TEnum.equals(bLiveState, "onlive") || TEnum.equals(bLiveState, "suspended")) ? "on" : "off";
    }

    /* JADX INFO: renamed from: k */
    public static boolean m18956k(int i) {
        return i == 200 || i == 300;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m18957l(BLiveGiftItem bLiveGiftItem) {
        return m18956k(bLiveGiftItem.giftLevel);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m18958m(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        return TextUtils.equals(bLiveGivenGiftBrief.sendGiftExtraInfo.d(), ypv.a.D0());
    }

    /* JADX INFO: renamed from: n */
    public static boolean m18959n(GiftTrayData giftTrayData) {
        return TextUtils.equals(giftTrayData.f6114B, ypv.a.D0());
    }

    /* JADX INFO: renamed from: o */
    public static boolean m18960o(bwc0 bwc0Var) {
        return TextUtils.equals(bwc0Var.m10632a().m17349b(), ypv.a.D0());
    }

    /* JADX INFO: renamed from: p */
    public static void m18961p(GiftTrayData giftTrayData, boolean z, boolean z2) {
        if (m18950e(giftTrayData, z2)) {
            l3f l3fVar = new l3f();
            l3fVar.s = "e_gift_add_to_live";
            l3fVar.d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            zvf0.n(l3fVar, m18954i(giftTrayData, z, true));
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m18962q(bwc0 bwc0Var) {
        m18941D("e_md_check", bwc0Var);
    }

    /* JADX INFO: renamed from: r */
    public static void m18963r(GiftTrayData giftTrayData, boolean z) {
        if (m18948c(giftTrayData, z)) {
            l3f l3fVar = new l3f();
            l3fVar.s = "e_gift_grade";
            l3fVar.d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            zvf0.n(l3fVar, m18954i(giftTrayData, false, false));
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m18964s(BLiveGivenGiftBrief bLiveGivenGiftBrief, ho2 ho2Var, boolean z, boolean z2) {
        if (z2 || m18958m(bLiveGivenGiftBrief)) {
            l3f l3fVar = new l3f();
            l3fVar.s = "e_giftid_configure_check";
            l3fVar.d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            zvf0.n(l3fVar, m18953h(bLiveGivenGiftBrief, null, ho2Var, false, z));
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m18965t(GiftTrayData giftTrayData, boolean z, boolean z2) {
        if (m18948c(giftTrayData, z2)) {
            l3f l3fVar = new l3f();
            l3fVar.s = "e_gift_default_show";
            l3fVar.d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            zvf0.n(l3fVar, m18954i(giftTrayData, z, false));
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m18966u(GiftTrayData giftTrayData, boolean z, boolean z2) {
        if (m18948c(giftTrayData, z2)) {
            l3f l3fVar = new l3f();
            l3fVar.s = "e_gift_show";
            l3fVar.d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            zvf0.n(l3fVar, m18954i(giftTrayData, z, false));
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m18967v(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, ho2 ho2Var, boolean z) {
        if (m18947b(bLiveGivenGiftBrief, bLiveGiftItem, z)) {
            l3f l3fVar = new l3f();
            l3fVar.s = "e_gift_sent";
            l3fVar.d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            zvf0.n(l3fVar, m18953h(bLiveGivenGiftBrief, bLiveGiftItem, ho2Var, true, bLiveGiftItem != null && bLiveGiftItem.isFaceGift()));
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m18968w(bwc0 bwc0Var) {
        m18941D("e_unzip_check", bwc0Var);
    }

    /* JADX INFO: renamed from: x */
    public static void m18969x(bwc0 bwc0Var) {
        if (bwc0Var != null && m18940C(bwc0Var)) {
            m18941D("e_gift_resource_gain", bwc0Var);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m18970y(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, ho2 ho2Var, boolean z) {
        if (m18949d(bLiveGivenGiftBrief, bLiveGiftItem, z)) {
            l3f l3fVar = new l3f();
            l3fVar.s = "e_gift_receive";
            l3fVar.d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            zvf0.n(l3fVar, m18953h(bLiveGivenGiftBrief, bLiveGiftItem, ho2Var, true, true));
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m18971z(BLiveGivenGiftBrief bLiveGivenGiftBrief, ho2 ho2Var, boolean z) {
        if (z || m18958m(bLiveGivenGiftBrief)) {
            l3f l3fVar = new l3f();
            l3fVar.s = "e_gift_receive";
            l3fVar.d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            zvf0.n(l3fVar, m18953h(bLiveGivenGiftBrief, null, ho2Var, true, true));
        }
    }
}
