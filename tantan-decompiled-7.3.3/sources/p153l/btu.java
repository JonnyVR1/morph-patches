package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.Answer;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class btu {

    /* JADX INFO: renamed from: a */
    public static String f78400a = "e_live_video_quickchat_close";

    /* JADX INFO: renamed from: b */
    public static String f78401b = "e_live_video_quickchat_missed_call";

    /* JADX INFO: renamed from: c */
    public static String f78402c = "e_live_video_quickchat_missed_call_list";

    /* JADX INFO: renamed from: d */
    public static String f78403d = "e_live_video_quickchat_call_back_close";

    /* JADX INFO: renamed from: e */
    public static String f78404e = "e_live_video_quickchat_missed_call_back";

    /* JADX INFO: renamed from: f */
    public static String f78405f = "e_live_video_quickchat_random_hang_up";

    /* JADX INFO: renamed from: g */
    public static String f78406g = "p_live_anchor_receive_video_quickchat";

    /* JADX INFO: renamed from: h */
    public static String f78407h = "p_live_anchor_video_quickchat_calling_back";

    /* JADX INFO: renamed from: i */
    public static String f78408i = "e_live_receive_video_quickchat_button";

    /* JADX INFO: renamed from: j */
    public static String f78409j = "p_live_user_receive_video_quickchat";

    /* JADX INFO: renamed from: k */
    public static String f78410k = "p_live_user_video_quickchat_calling";

    /* JADX INFO: renamed from: l */
    public static String f78411l = "p_live_user_video_quickchat_random_calling";

    /* JADX INFO: renamed from: b */
    public static void m106386b() {
        i4g0.m138523u(f78408i, f78406g, pf60.m172085a("button_type", Answer.TYPE));
    }

    /* JADX INFO: renamed from: c */
    public static void m106387c() {
        i4g0.m138523u(f78408i, f78406g, pf60.m172085a("button_type", "hang_up"));
    }

    /* JADX INFO: renamed from: d */
    public static void m106388d() {
        i4g0.m138526x("e_live_video_quickchat_end", "p_live_video_quickchat");
    }

    /* JADX INFO: renamed from: e */
    public static void m106389e() {
        i4g0.m138523u(f78408i, f78409j, pf60.m172085a("button_type", Answer.TYPE));
    }

    /* JADX INFO: renamed from: f */
    public static void m106390f() {
        i4g0.m138523u(f78408i, f78409j, pf60.m172085a("button_type", "hang_up"));
    }

    /* JADX INFO: renamed from: g */
    public static void m106391g() {
        i4g0.m138520r(f78400a, f78410k);
    }

    /* JADX INFO: renamed from: h */
    public static void m106392h(String str, String str2, String str3) {
        i4g0.m138523u("e_live_video_quickchat_feedback", "p_live_video_quickchat", pf60.m172085a("anchorId", str), pf60.m172085a("feedback_result", str3), pf60.m172085a("quickchat_id", str2));
    }

    /* JADX INFO: renamed from: i */
    public static void m106393i(String str, String str2) {
        i4g0.m138492A("e_live_video_quickchat_feedback", "p_live_video_quickchat", pf60.m172085a("anchorId", str), pf60.m172085a("quickchat_id", str2));
    }

    /* JADX INFO: renamed from: j */
    public static void m106394j() {
        i4g0.m138520r(f78400a, "p_live_anchor_video_quickchat_calling");
    }

    /* JADX INFO: renamed from: k */
    public static void m106395k(jjs jjsVar, int i, String str, String str2, int i2, String str3, String str4, boolean z) {
        BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        HashMap map = new HashMap();
        map.put(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i + 1));
        map.put("module", "e_gift_bar");
        map.put("giftId", Integer.valueOf(bLiveGiftItemM145122h.f45225id));
        map.put("giftName", bLiveGiftItemM145122h.name);
        map.put("giftUnitPrice", Double.valueOf(bLiveGiftItemM145122h.unitPrice));
        map.put("giftBarPageId", Integer.valueOf(jjsVar.m145125k() + 1));
        map.put("enoughCoin", str);
        map.put("gift_type", bLiveGiftItemM145122h.giftType);
        map.put("combo_id", "NA");
        map.put("gift_num", Integer.valueOf(i2));
        map.put("gift_bar_tab", jjsVar.m145123i());
        map.put("gift_send_type", str3);
        map.put("gift_receiver_id", str4);
        map.put("gift_press_type", z ? "long_press" : "click");
        map.put("is_send_all", "0");
        i4g0.m138521s("e_gift", str2, map);
    }

    /* JADX INFO: renamed from: l */
    public static void m106396l(List<BLiveMerchandise> list, boolean z, String str) {
        q4f q4fVar = new q4f();
        q4fVar.f155576n = "p_purchase_page";
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        i4g0.m138517o(q4fVar, jyb.m147494Y("purchaseShowFrom", "p_live_user_video_quickchat_room"), jyb.m147494Y("productType", "coin"), jyb.m147494Y("fold", Integer.valueOf(z ? 1 : 0)), jyb.m147494Y("livefrist", str), jyb.m147494Y("skuGroup", jyb.m147490U(jyb.m147486Q(list, new qcj() { // from class: l.atu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveMerchandise) obj).defaultStockKeepUnit.f45291id;
            }
        }), Constants.SEPARATOR_COMMA)), jyb.m147494Y("ui_type", "NA"), jyb.m147494Y("function_type", "live"));
    }

    /* JADX INFO: renamed from: m */
    public static void m106397m(String str, String str2, String str3) {
        i4g0.m138523u("e_live_video_button", "p_live_user_video_quickchat_room", jyb.m147494Y("quickchat_id", str), jyb.m147494Y("anchor_id", str2), jyb.m147494Y("liveId", str3), jyb.m147494Y("button_type", "gift"));
    }

    /* JADX INFO: renamed from: n */
    public static void m106398n(boolean z) {
        i4g0.m138520r("e_live_video_quickchat_hang_up", z ? "p_live_anchor_video_quickchat_room" : "p_live_user_video_quickchat_room");
    }

    /* JADX INFO: renamed from: o */
    public static void m106399o() {
        i4g0.m138523u("e_recharge", "p_live_user_video_quickchat_room", jyb.m147494Y("module", "p_live_user_video_quickchat_room"));
    }

    /* JADX INFO: renamed from: p */
    public static void m106400p(boolean z, String str, String str2) {
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.PAGE_VIEW;
        q4fVar.f155576n = z ? "p_live_anchor_video_quickchat_room" : "p_live_user_video_quickchat_room";
        i4g0.m138517o(q4fVar, jyb.m147494Y("anchorId", str), jyb.m147494Y("quickchat_id", str2));
    }

    /* JADX INFO: renamed from: q */
    public static void m106401q(boolean z) {
        i4g0.m138523u("e_live_camera_setting", "p_live_user_video_quickchat_room", jyb.m147494Y("setting_result", z ? "open" : "close"));
    }

    /* JADX INFO: renamed from: r */
    public static void m106402r(boolean z) {
        i4g0.m138523u("e_live_voice_setting", "p_live_user_video_quickchat_room", jyb.m147494Y("setting_result", z ? "open" : "close"));
    }
}
