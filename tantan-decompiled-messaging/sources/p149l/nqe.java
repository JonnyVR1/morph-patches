package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class nqe {
    /* JADX INFO: renamed from: A */
    public static void m160587A(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, ho2 ho2Var, boolean z, boolean z2, boolean z3) {
        if (!m160595a(bLiveGiftItem, z3) || bLiveGiftItem.isFaceGift()) {
            return;
        }
        l3f l3fVar = new l3f();
        l3fVar.f125900s = "e_gift_receive";
        l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        zvf0.m220392n(l3fVar, m160602h(bLiveGivenGiftBrief, bLiveGiftItem, ho2Var, z, z2));
    }

    /* JADX INFO: renamed from: B */
    public static void m160588B(BLiveGivenGiftBrief bLiveGivenGiftBrief, ho2 ho2Var, boolean z, boolean z2, boolean z3) {
        if (z3 || m160607m(bLiveGivenGiftBrief)) {
            l3f l3fVar = new l3f();
            l3fVar.f125900s = "e_gift_receive";
            l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            zvf0.m220392n(l3fVar, m160602h(bLiveGivenGiftBrief, null, ho2Var, z, z2));
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m160589C(bwc0 bwc0Var) {
        return (bwc0Var.m104150a().m150990d() || m160609o(bwc0Var)) && m160605k(bwc0Var.m104150a().m150987a());
    }

    /* JADX INFO: renamed from: D */
    public static void m160590D(String str, bwc0 bwc0Var) {
        if (bwc0Var != null && m160589C(bwc0Var)) {
            l3f l3fVar = new l3f();
            l3fVar.f125900s = str;
            l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            lqe lqeVarM104150a = bwc0Var.m104150a();
            lqeVarM104150a.m150991e(false);
            zvf0.m220392n(l3fVar, lqeVarM104150a.m150989c());
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m160591E(boolean z, String str, boolean z2) {
        if (TextUtils.isEmpty(str) || str.equals("0")) {
            return;
        }
        zvf0.m220371D("e_live_gift_check_res", z ? "p_anchor_live_room" : "p_user_live_room", vwb.m200311Y("effect_id", str), vwb.m200311Y("type", "play"), vwb.m200311Y("error", Boolean.valueOf(z2)));
    }

    /* JADX INFO: renamed from: F */
    public static void m160592F(boolean z, String str, boolean z2, boolean z3, boolean z4) {
        if (TextUtils.isEmpty(str) || str.equals("0")) {
            return;
        }
        zvf0.m220371D("e_live_gift_check_res", z ? "p_anchor_live_room" : "p_user_live_room", vwb.m200311Y("effect_id", str), vwb.m200311Y("ready", z2 ? "yes" : "no"), vwb.m200311Y("type", z3 ? "tray" : "send"), vwb.m200311Y("in_preload", Boolean.valueOf(z4)));
    }

    /* JADX INFO: renamed from: G */
    public static void m160593G(String str, boolean z, boolean z2, long j) {
        if (TextUtils.isEmpty(str) || str.equals("0")) {
            return;
        }
        j760 j760VarM200311Y = vwb.m200311Y("effect_id", str);
        j760 j760VarM200311Y2 = vwb.m200311Y("ready", "no");
        j760 j760VarM200311Y3 = vwb.m200311Y("type", z ? "tray_download" : "send_download");
        j760 j760VarM200311Y4 = vwb.m200311Y("error", Boolean.valueOf(z2));
        if (z2) {
            j = -1;
        }
        zvf0.m220371D("e_live_gift_check_res", "p_live_gift_download", j760VarM200311Y, j760VarM200311Y2, j760VarM200311Y3, j760VarM200311Y4, vwb.m200311Y(BLiveOperationTitleShowType.duration, Long.valueOf(j)));
    }

    /* JADX INFO: renamed from: H */
    public static void m160594H(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str) || str.equals("0")) {
            return;
        }
        zvf0.m220371D("e_live_gift_check_res_download_error", "p_live_gift_download", vwb.m200311Y("effect_id", str), vwb.m200311Y("url", str2), vwb.m200311Y("md", str3), vwb.m200311Y("error_type", str4));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m160595a(BLiveGiftItem bLiveGiftItem, boolean z) {
        return z && !TextUtils.isEmpty(bLiveGiftItem.liveResourceId) && m160606l(bLiveGiftItem);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m160596b(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, boolean z) {
        if ((z || m160607m(bLiveGivenGiftBrief)) && !TextUtils.isEmpty(bLiveGiftItem.liveResourceId)) {
            return m160606l(bLiveGiftItem) || bLiveGiftItem.isFaceGift();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m160597c(GiftTrayData giftTrayData, boolean z) {
        return (z || m160608n(giftTrayData)) && !TextUtils.isEmpty(giftTrayData.f50119y) && m160605k(giftTrayData.f50098d);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m160598d(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, boolean z) {
        return ((!z && !m160607m(bLiveGivenGiftBrief)) || bLiveGiftItem == null || TextUtils.isEmpty(bLiveGiftItem.liveResourceId)) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m160599e(GiftTrayData giftTrayData, boolean z) {
        return (z || m160608n(giftTrayData)) && !TextUtils.isEmpty(giftTrayData.f50119y);
    }

    /* JADX INFO: renamed from: f */
    public static void m160600f(bwc0 bwc0Var) {
        m160590D("e_download_check", bwc0Var);
    }

    /* JADX INFO: renamed from: g */
    public static lqe m160601g(GiftTrayData giftTrayData, boolean z, boolean z2) {
        return new lqe.C18285a().m151004m(giftTrayData.f50108n, giftTrayData.f50105k).m151008q(giftTrayData.f50099e).m151011t(giftTrayData.f50119y).m151014w(giftTrayData.f50072B).m151006o(giftTrayData.f50073C).m151010s(giftTrayData.f50100f).m151013v(giftTrayData.f50102h).m151007p(z ? "face_gift" : "normal_gift").m151012u(giftTrayData.f50101g).m151009r(giftTrayData.f50098d).m151005n(z2).m151003l();
    }

    /* JADX INFO: renamed from: h */
    public static Map<String, Object> m160602h(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, ho2 ho2Var, boolean z, boolean z2) {
        String str;
        HashMap map = new HashMap();
        map.put("unique_id", bLiveGivenGiftBrief.comboId + "_" + bLiveGivenGiftBrief.combos);
        map.put("giftId", bLiveGiftItem == null ? "" : Integer.valueOf(bLiveGiftItem.f44377id));
        map.put("gift_resource_id", bLiveGiftItem == null ? "" : bLiveGiftItem.liveResourceId);
        map.put("actor_user_id", bLiveGivenGiftBrief.sendGiftExtraInfo.m111448d());
        map.put("anchorId", bLiveGivenGiftBrief.sendGiftExtraInfo.m111445a());
        map.put("giftName", bLiveGiftItem == null ? "" : bLiveGiftItem.getLocalName());
        map.put("liveId", ho2Var == null ? "" : ho2Var.mo149813j().f44323id);
        if (bLiveGiftItem == null) {
            str = "";
        } else {
            str = z2 ? "face_gift" : "normal_gift";
        }
        map.put("gift_effect_type", str);
        map.put("gift_source", bLiveGiftItem != null ? Integer.valueOf(bLiveGiftItem.giftSource) : "");
        map.put("live_status", m160604j(ho2Var));
        map.put("process_status", z ? "success" : "fail");
        return map;
    }

    /* JADX INFO: renamed from: i */
    public static Map<String, Object> m160603i(GiftTrayData giftTrayData, boolean z, boolean z2) {
        HashMap map = new HashMap();
        map.put("unique_id", giftTrayData.f50108n + "_" + giftTrayData.f50105k);
        map.put("giftId", Integer.valueOf(giftTrayData.f50099e));
        map.put("gift_resource_id", giftTrayData.f50119y);
        map.put("actor_user_id", giftTrayData.f50072B);
        map.put("anchorId", giftTrayData.f50073C);
        map.put("giftName", giftTrayData.f50100f);
        map.put("liveId", giftTrayData.f50102h);
        map.put("gift_effect_type", z2 ? "face_gift" : "normal_gift");
        map.put("gift_source", Integer.valueOf(giftTrayData.f50101g));
        map.put("process_status", z ? "success" : "fail");
        return map;
    }

    /* JADX INFO: renamed from: j */
    public static String m160604j(ho2 ho2Var) {
        if (ho2Var == null) {
            return "";
        }
        BLiveState bLiveState = ho2Var.mo149813j().state;
        return (TEnum.equals(bLiveState, "onlive") || TEnum.equals(bLiveState, "suspended")) ? "on" : BLiveOperationTitleShowType.off;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m160605k(int i) {
        return i == 200 || i == 300;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m160606l(BLiveGiftItem bLiveGiftItem) {
        return m160605k(bLiveGiftItem.giftLevel);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m160607m(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        return TextUtils.equals(bLiveGivenGiftBrief.sendGiftExtraInfo.m111448d(), ypv.f199493a.m199309D0());
    }

    /* JADX INFO: renamed from: n */
    public static boolean m160608n(GiftTrayData giftTrayData) {
        return TextUtils.equals(giftTrayData.f50072B, ypv.f199493a.m199309D0());
    }

    /* JADX INFO: renamed from: o */
    public static boolean m160609o(bwc0 bwc0Var) {
        return TextUtils.equals(bwc0Var.m104150a().m150988b(), ypv.f199493a.m199309D0());
    }

    /* JADX INFO: renamed from: p */
    public static void m160610p(GiftTrayData giftTrayData, boolean z, boolean z2) {
        if (m160599e(giftTrayData, z2)) {
            l3f l3fVar = new l3f();
            l3fVar.f125900s = "e_gift_add_to_live";
            l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            zvf0.m220392n(l3fVar, m160603i(giftTrayData, z, true));
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m160611q(bwc0 bwc0Var) {
        m160590D("e_md_check", bwc0Var);
    }

    /* JADX INFO: renamed from: r */
    public static void m160612r(GiftTrayData giftTrayData, boolean z) {
        if (m160597c(giftTrayData, z)) {
            l3f l3fVar = new l3f();
            l3fVar.f125900s = "e_gift_grade";
            l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            zvf0.m220392n(l3fVar, m160603i(giftTrayData, false, false));
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m160613s(BLiveGivenGiftBrief bLiveGivenGiftBrief, ho2 ho2Var, boolean z, boolean z2) {
        if (z2 || m160607m(bLiveGivenGiftBrief)) {
            l3f l3fVar = new l3f();
            l3fVar.f125900s = "e_giftid_configure_check";
            l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            zvf0.m220392n(l3fVar, m160602h(bLiveGivenGiftBrief, null, ho2Var, false, z));
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m160614t(GiftTrayData giftTrayData, boolean z, boolean z2) {
        if (m160597c(giftTrayData, z2)) {
            l3f l3fVar = new l3f();
            l3fVar.f125900s = "e_gift_default_show";
            l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            zvf0.m220392n(l3fVar, m160603i(giftTrayData, z, false));
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m160615u(GiftTrayData giftTrayData, boolean z, boolean z2) {
        if (m160597c(giftTrayData, z2)) {
            l3f l3fVar = new l3f();
            l3fVar.f125900s = "e_gift_show";
            l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            zvf0.m220392n(l3fVar, m160603i(giftTrayData, z, false));
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m160616v(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, ho2 ho2Var, boolean z) {
        if (m160596b(bLiveGivenGiftBrief, bLiveGiftItem, z)) {
            l3f l3fVar = new l3f();
            l3fVar.f125900s = "e_gift_sent";
            l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            zvf0.m220392n(l3fVar, m160602h(bLiveGivenGiftBrief, bLiveGiftItem, ho2Var, true, bLiveGiftItem != null && bLiveGiftItem.isFaceGift()));
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m160617w(bwc0 bwc0Var) {
        m160590D("e_unzip_check", bwc0Var);
    }

    /* JADX INFO: renamed from: x */
    public static void m160618x(bwc0 bwc0Var) {
        if (bwc0Var != null && m160589C(bwc0Var)) {
            m160590D("e_gift_resource_gain", bwc0Var);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m160619y(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, ho2 ho2Var, boolean z) {
        if (m160598d(bLiveGivenGiftBrief, bLiveGiftItem, z)) {
            l3f l3fVar = new l3f();
            l3fVar.f125900s = "e_gift_receive";
            l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            zvf0.m220392n(l3fVar, m160602h(bLiveGivenGiftBrief, bLiveGiftItem, ho2Var, true, true));
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m160620z(BLiveGivenGiftBrief bLiveGivenGiftBrief, ho2 ho2Var, boolean z) {
        if (z || m160607m(bLiveGivenGiftBrief)) {
            l3f l3fVar = new l3f();
            l3fVar.f125900s = "e_gift_receive";
            l3fVar.f125885d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            zvf0.m220392n(l3fVar, m160602h(bLiveGivenGiftBrief, null, ho2Var, true, true));
        }
    }
}
