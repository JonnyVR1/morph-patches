package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class rre {
    /* JADX INFO: renamed from: A */
    public static void m182721A(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, oo2 oo2Var, boolean z, boolean z2, boolean z3) {
        if (!m182729a(bLiveGiftItem, z3) || bLiveGiftItem.isFaceGift()) {
            return;
        }
        q4f q4fVar = new q4f();
        q4fVar.f155581s = "e_gift_receive";
        q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
        i4g0.m138516n(q4fVar, m182736h(bLiveGivenGiftBrief, bLiveGiftItem, oo2Var, z, z2));
    }

    /* JADX INFO: renamed from: B */
    public static void m182722B(BLiveGivenGiftBrief bLiveGivenGiftBrief, oo2 oo2Var, boolean z, boolean z2, boolean z3) {
        if (z3 || m182741m(bLiveGivenGiftBrief)) {
            q4f q4fVar = new q4f();
            q4fVar.f155581s = "e_gift_receive";
            q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            i4g0.m138516n(q4fVar, m182736h(bLiveGivenGiftBrief, null, oo2Var, z, z2));
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m182723C(e4d0 e4d0Var) {
        return (e4d0Var.m119411a().m173458d() || m182743o(e4d0Var)) && m182739k(e4d0Var.m119411a().m173455a());
    }

    /* JADX INFO: renamed from: D */
    public static void m182724D(String str, e4d0 e4d0Var) {
        if (e4d0Var != null && m182723C(e4d0Var)) {
            q4f q4fVar = new q4f();
            q4fVar.f155581s = str;
            q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            pre preVarM119411a = e4d0Var.m119411a();
            preVarM119411a.m173459e(false);
            i4g0.m138516n(q4fVar, preVarM119411a.m173457c());
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m182725E(boolean z, String str, boolean z2) {
        if (TextUtils.isEmpty(str) || str.equals("0")) {
            return;
        }
        i4g0.m138495D("e_live_gift_check_res", z ? "p_anchor_live_room" : "p_user_live_room", jyb.m147494Y("effect_id", str), jyb.m147494Y("type", "play"), jyb.m147494Y("error", Boolean.valueOf(z2)));
    }

    /* JADX INFO: renamed from: F */
    public static void m182726F(boolean z, String str, boolean z2, boolean z3, boolean z4) {
        if (TextUtils.isEmpty(str) || str.equals("0")) {
            return;
        }
        i4g0.m138495D("e_live_gift_check_res", z ? "p_anchor_live_room" : "p_user_live_room", jyb.m147494Y("effect_id", str), jyb.m147494Y("ready", z2 ? "yes" : "no"), jyb.m147494Y("type", z3 ? "tray" : "send"), jyb.m147494Y("in_preload", Boolean.valueOf(z4)));
    }

    /* JADX INFO: renamed from: G */
    public static void m182727G(String str, boolean z, boolean z2, long j) {
        if (TextUtils.isEmpty(str) || str.equals("0")) {
            return;
        }
        pf60 pf60VarM147494Y = jyb.m147494Y("effect_id", str);
        pf60 pf60VarM147494Y2 = jyb.m147494Y("ready", "no");
        pf60 pf60VarM147494Y3 = jyb.m147494Y("type", z ? "tray_download" : "send_download");
        pf60 pf60VarM147494Y4 = jyb.m147494Y("error", Boolean.valueOf(z2));
        if (z2) {
            j = -1;
        }
        i4g0.m138495D("e_live_gift_check_res", "p_live_gift_download", pf60VarM147494Y, pf60VarM147494Y2, pf60VarM147494Y3, pf60VarM147494Y4, jyb.m147494Y(BLiveOperationTitleShowType.duration, Long.valueOf(j)));
    }

    /* JADX INFO: renamed from: H */
    public static void m182728H(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str) || str.equals("0")) {
            return;
        }
        i4g0.m138495D("e_live_gift_check_res_download_error", "p_live_gift_download", jyb.m147494Y("effect_id", str), jyb.m147494Y("url", str2), jyb.m147494Y("md", str3), jyb.m147494Y("error_type", str4));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m182729a(BLiveGiftItem bLiveGiftItem, boolean z) {
        return z && !TextUtils.isEmpty(bLiveGiftItem.liveResourceId) && m182740l(bLiveGiftItem);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m182730b(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, boolean z) {
        if ((z || m182741m(bLiveGivenGiftBrief)) && !TextUtils.isEmpty(bLiveGiftItem.liveResourceId)) {
            return m182740l(bLiveGiftItem) || bLiveGiftItem.isFaceGift();
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m182731c(GiftTrayData giftTrayData, boolean z) {
        return (z || m182742n(giftTrayData)) && !TextUtils.isEmpty(giftTrayData.f50967y) && m182739k(giftTrayData.f50946d);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m182732d(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, boolean z) {
        return ((!z && !m182741m(bLiveGivenGiftBrief)) || bLiveGiftItem == null || TextUtils.isEmpty(bLiveGiftItem.liveResourceId)) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m182733e(GiftTrayData giftTrayData, boolean z) {
        return (z || m182742n(giftTrayData)) && !TextUtils.isEmpty(giftTrayData.f50967y);
    }

    /* JADX INFO: renamed from: f */
    public static void m182734f(e4d0 e4d0Var) {
        m182724D("e_download_check", e4d0Var);
    }

    /* JADX INFO: renamed from: g */
    public static pre m182735g(GiftTrayData giftTrayData, boolean z, boolean z2) {
        return new pre.C19425a().m173472m(giftTrayData.f50956n, giftTrayData.f50953k).m173476q(giftTrayData.f50947e).m173479t(giftTrayData.f50967y).m173482w(giftTrayData.f50920B).m173474o(giftTrayData.f50921C).m173478s(giftTrayData.f50948f).m173481v(giftTrayData.f50950h).m173475p(z ? "face_gift" : "normal_gift").m173480u(giftTrayData.f50949g).m173477r(giftTrayData.f50946d).m173473n(z2).m173471l();
    }

    /* JADX INFO: renamed from: h */
    public static Map<String, Object> m182736h(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, oo2 oo2Var, boolean z, boolean z2) {
        String str;
        HashMap map = new HashMap();
        map.put("unique_id", bLiveGivenGiftBrief.comboId + "_" + bLiveGivenGiftBrief.combos);
        map.put("giftId", bLiveGiftItem == null ? "" : Integer.valueOf(bLiveGiftItem.f45225id));
        map.put("gift_resource_id", bLiveGiftItem == null ? "" : bLiveGiftItem.liveResourceId);
        map.put("actor_user_id", bLiveGivenGiftBrief.sendGiftExtraInfo.m141111d());
        map.put("anchorId", bLiveGivenGiftBrief.sendGiftExtraInfo.m141108a());
        map.put("giftName", bLiveGiftItem == null ? "" : bLiveGiftItem.getLocalName());
        map.put("liveId", oo2Var == null ? "" : oo2Var.mo183435j().f45171id);
        if (bLiveGiftItem == null) {
            str = "";
        } else {
            str = z2 ? "face_gift" : "normal_gift";
        }
        map.put("gift_effect_type", str);
        map.put("gift_source", bLiveGiftItem != null ? Integer.valueOf(bLiveGiftItem.giftSource) : "");
        map.put("live_status", m182738j(oo2Var));
        map.put("process_status", z ? "success" : "fail");
        return map;
    }

    /* JADX INFO: renamed from: i */
    public static Map<String, Object> m182737i(GiftTrayData giftTrayData, boolean z, boolean z2) {
        HashMap map = new HashMap();
        map.put("unique_id", giftTrayData.f50956n + "_" + giftTrayData.f50953k);
        map.put("giftId", Integer.valueOf(giftTrayData.f50947e));
        map.put("gift_resource_id", giftTrayData.f50967y);
        map.put("actor_user_id", giftTrayData.f50920B);
        map.put("anchorId", giftTrayData.f50921C);
        map.put("giftName", giftTrayData.f50948f);
        map.put("liveId", giftTrayData.f50950h);
        map.put("gift_effect_type", z2 ? "face_gift" : "normal_gift");
        map.put("gift_source", Integer.valueOf(giftTrayData.f50949g));
        map.put("process_status", z ? "success" : "fail");
        return map;
    }

    /* JADX INFO: renamed from: j */
    public static String m182738j(oo2 oo2Var) {
        if (oo2Var == null) {
            return "";
        }
        BLiveState bLiveState = oo2Var.mo183435j().state;
        return (TEnum.equals(bLiveState, "onlive") || TEnum.equals(bLiveState, "suspended")) ? "on" : BLiveOperationTitleShowType.off;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m182739k(int i) {
        return i == 200 || i == 300;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m182740l(BLiveGiftItem bLiveGiftItem) {
        return m182739k(bLiveGiftItem.giftLevel);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m182741m(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        return TextUtils.equals(bLiveGivenGiftBrief.sendGiftExtraInfo.m141111d(), zrv.f205799a.m207631D0());
    }

    /* JADX INFO: renamed from: n */
    public static boolean m182742n(GiftTrayData giftTrayData) {
        return TextUtils.equals(giftTrayData.f50920B, zrv.f205799a.m207631D0());
    }

    /* JADX INFO: renamed from: o */
    public static boolean m182743o(e4d0 e4d0Var) {
        return TextUtils.equals(e4d0Var.m119411a().m173456b(), zrv.f205799a.m207631D0());
    }

    /* JADX INFO: renamed from: p */
    public static void m182744p(GiftTrayData giftTrayData, boolean z, boolean z2) {
        if (m182733e(giftTrayData, z2)) {
            q4f q4fVar = new q4f();
            q4fVar.f155581s = "e_gift_add_to_live";
            q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            i4g0.m138516n(q4fVar, m182737i(giftTrayData, z, true));
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m182745q(e4d0 e4d0Var) {
        m182724D("e_md_check", e4d0Var);
    }

    /* JADX INFO: renamed from: r */
    public static void m182746r(GiftTrayData giftTrayData, boolean z) {
        if (m182731c(giftTrayData, z)) {
            q4f q4fVar = new q4f();
            q4fVar.f155581s = "e_gift_grade";
            q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            i4g0.m138516n(q4fVar, m182737i(giftTrayData, false, false));
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m182747s(BLiveGivenGiftBrief bLiveGivenGiftBrief, oo2 oo2Var, boolean z, boolean z2) {
        if (z2 || m182741m(bLiveGivenGiftBrief)) {
            q4f q4fVar = new q4f();
            q4fVar.f155581s = "e_giftid_configure_check";
            q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            i4g0.m138516n(q4fVar, m182736h(bLiveGivenGiftBrief, null, oo2Var, false, z));
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m182748t(GiftTrayData giftTrayData, boolean z, boolean z2) {
        if (m182731c(giftTrayData, z2)) {
            q4f q4fVar = new q4f();
            q4fVar.f155581s = "e_gift_default_show";
            q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            i4g0.m138516n(q4fVar, m182737i(giftTrayData, z, false));
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m182749u(GiftTrayData giftTrayData, boolean z, boolean z2) {
        if (m182731c(giftTrayData, z2)) {
            q4f q4fVar = new q4f();
            q4fVar.f155581s = "e_gift_show";
            q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            i4g0.m138516n(q4fVar, m182737i(giftTrayData, z, false));
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m182750v(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, oo2 oo2Var, boolean z) {
        if (m182730b(bLiveGivenGiftBrief, bLiveGiftItem, z)) {
            q4f q4fVar = new q4f();
            q4fVar.f155581s = "e_gift_sent";
            q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            i4g0.m138516n(q4fVar, m182736h(bLiveGivenGiftBrief, bLiveGiftItem, oo2Var, true, bLiveGiftItem != null && bLiveGiftItem.isFaceGift()));
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m182751w(e4d0 e4d0Var) {
        m182724D("e_unzip_check", e4d0Var);
    }

    /* JADX INFO: renamed from: x */
    public static void m182752x(e4d0 e4d0Var) {
        if (e4d0Var != null && m182723C(e4d0Var)) {
            m182724D("e_gift_resource_gain", e4d0Var);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m182753y(BLiveGivenGiftBrief bLiveGivenGiftBrief, BLiveGiftItem bLiveGiftItem, oo2 oo2Var, boolean z) {
        if (m182732d(bLiveGivenGiftBrief, bLiveGiftItem, z)) {
            q4f q4fVar = new q4f();
            q4fVar.f155581s = "e_gift_receive";
            q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            i4g0.m138516n(q4fVar, m182736h(bLiveGivenGiftBrief, bLiveGiftItem, oo2Var, true, true));
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m182754z(BLiveGivenGiftBrief bLiveGivenGiftBrief, oo2 oo2Var, boolean z) {
        if (z || m182741m(bLiveGivenGiftBrief)) {
            q4f q4fVar = new q4f();
            q4fVar.f155581s = "e_gift_receive";
            q4fVar.f155566d = EventNameEnum.USER_BEHAVIOR_COMPLEMENT;
            i4g0.m138516n(q4fVar, m182736h(bLiveGivenGiftBrief, null, oo2Var, true, true));
        }
    }
}
