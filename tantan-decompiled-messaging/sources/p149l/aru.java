package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class aru {

    /* JADX INFO: renamed from: a */
    public static String f71347a = "e_live_video_quickchat_close";

    /* JADX INFO: renamed from: b */
    public static String f71348b = "e_live_video_quickchat_missed_call";

    /* JADX INFO: renamed from: c */
    public static String f71349c = "e_live_video_quickchat_missed_call_list";

    /* JADX INFO: renamed from: d */
    public static String f71350d = "e_live_video_quickchat_call_back_close";

    /* JADX INFO: renamed from: e */
    public static String f71351e = "e_live_video_quickchat_missed_call_back";

    /* JADX INFO: renamed from: f */
    public static String f71352f = "e_live_video_quickchat_random_hang_up";

    /* JADX INFO: renamed from: g */
    public static String f71353g = "p_live_anchor_receive_video_quickchat";

    /* JADX INFO: renamed from: h */
    public static String f71354h = "p_live_anchor_video_quickchat_calling_back";

    /* JADX INFO: renamed from: i */
    public static String f71355i = "e_live_receive_video_quickchat_button";

    /* JADX INFO: renamed from: j */
    public static String f71356j = "p_live_user_receive_video_quickchat";

    /* JADX INFO: renamed from: k */
    public static String f71357k = "p_live_user_video_quickchat_calling";

    /* JADX INFO: renamed from: l */
    public static String f71358l = "p_live_user_video_quickchat_random_calling";

    /* JADX INFO: renamed from: b */
    public static void m98553b() {
        zvf0.m220399u(f71355i, f71353g, j760.m140076a("button_type", Answer.TYPE));
    }

    /* JADX INFO: renamed from: c */
    public static void m98554c() {
        zvf0.m220399u(f71355i, f71353g, j760.m140076a("button_type", "hang_up"));
    }

    /* JADX INFO: renamed from: d */
    public static void m98555d() {
        zvf0.m220402x("e_live_video_quickchat_end", "p_live_video_quickchat");
    }

    /* JADX INFO: renamed from: e */
    public static void m98556e() {
        zvf0.m220399u(f71355i, f71356j, j760.m140076a("button_type", Answer.TYPE));
    }

    /* JADX INFO: renamed from: f */
    public static void m98557f() {
        zvf0.m220399u(f71355i, f71356j, j760.m140076a("button_type", "hang_up"));
    }

    /* JADX INFO: renamed from: g */
    public static void m98558g() {
        zvf0.m220396r(f71347a, f71357k);
    }

    /* JADX INFO: renamed from: h */
    public static void m98559h(String str, String str2, String str3) {
        zvf0.m220399u("e_live_video_quickchat_feedback", "p_live_video_quickchat", j760.m140076a("anchorId", str), j760.m140076a("feedback_result", str3), j760.m140076a("quickchat_id", str2));
    }

    /* JADX INFO: renamed from: i */
    public static void m98560i(String str, String str2) {
        zvf0.m220368A("e_live_video_quickchat_feedback", "p_live_video_quickchat", j760.m140076a("anchorId", str), j760.m140076a("quickchat_id", str2));
    }

    /* JADX INFO: renamed from: j */
    public static void m98561j() {
        zvf0.m220396r(f71347a, "p_live_anchor_video_quickchat_calling");
    }

    /* JADX INFO: renamed from: k */
    public static void m98562k(ihs ihsVar, int i, String str, String str2, int i2, String str3, String str4, boolean z) {
        BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        HashMap map = new HashMap();
        map.put(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i + 1));
        map.put("module", "e_gift_bar");
        map.put("giftId", Integer.valueOf(bLiveGiftItemM136283h.f44377id));
        map.put("giftName", bLiveGiftItemM136283h.name);
        map.put("giftUnitPrice", Double.valueOf(bLiveGiftItemM136283h.unitPrice));
        map.put("giftBarPageId", Integer.valueOf(ihsVar.m136286k() + 1));
        map.put("enoughCoin", str);
        map.put("gift_type", bLiveGiftItemM136283h.giftType);
        map.put("combo_id", "NA");
        map.put("gift_num", Integer.valueOf(i2));
        map.put("gift_bar_tab", ihsVar.m136284i());
        map.put("gift_send_type", str3);
        map.put("gift_receiver_id", str4);
        map.put("gift_press_type", z ? "long_press" : "click");
        map.put("is_send_all", "0");
        zvf0.m220397s("e_gift", str2, map);
    }

    /* JADX INFO: renamed from: l */
    public static void m98563l(List<BLiveMerchandise> list, boolean z, String str) {
        l3f l3fVar = new l3f();
        l3fVar.f125895n = "p_purchase_page";
        l3fVar.f125885d = EventNameEnum.PAGE_VIEW;
        zvf0.m220393o(l3fVar, vwb.m200311Y("purchaseShowFrom", "p_live_user_video_quickchat_room"), vwb.m200311Y("productType", "coin"), vwb.m200311Y("fold", Integer.valueOf(z ? 1 : 0)), vwb.m200311Y("livefrist", str), vwb.m200311Y("skuGroup", vwb.m200307U(vwb.m200303Q(list, new w9j() { // from class: l.zqu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveMerchandise) obj).defaultStockKeepUnit.f44443id;
            }
        }), Constants.SEPARATOR_COMMA)), vwb.m200311Y("ui_type", "NA"), vwb.m200311Y("function_type", "live"));
    }

    /* JADX INFO: renamed from: m */
    public static void m98564m(String str, String str2, String str3) {
        zvf0.m220399u("e_live_video_button", "p_live_user_video_quickchat_room", vwb.m200311Y("quickchat_id", str), vwb.m200311Y("anchor_id", str2), vwb.m200311Y("liveId", str3), vwb.m200311Y("button_type", "gift"));
    }

    /* JADX INFO: renamed from: n */
    public static void m98565n(boolean z) {
        zvf0.m220396r("e_live_video_quickchat_hang_up", z ? "p_live_anchor_video_quickchat_room" : "p_live_user_video_quickchat_room");
    }

    /* JADX INFO: renamed from: o */
    public static void m98566o() {
        zvf0.m220399u("e_recharge", "p_live_user_video_quickchat_room", vwb.m200311Y("module", "p_live_user_video_quickchat_room"));
    }

    /* JADX INFO: renamed from: p */
    public static void m98567p(boolean z, String str, String str2) {
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.PAGE_VIEW;
        l3fVar.f125895n = z ? "p_live_anchor_video_quickchat_room" : "p_live_user_video_quickchat_room";
        zvf0.m220393o(l3fVar, vwb.m200311Y("anchorId", str), vwb.m200311Y("quickchat_id", str2));
    }

    /* JADX INFO: renamed from: q */
    public static void m98568q(boolean z) {
        zvf0.m220399u("e_live_camera_setting", "p_live_user_video_quickchat_room", vwb.m200311Y("setting_result", z ? "open" : "close"));
    }

    /* JADX INFO: renamed from: r */
    public static void m98569r(boolean z) {
        zvf0.m220399u("e_live_voice_setting", "p_live_user_video_quickchat_room", vwb.m200311Y("setting_result", z ? "open" : "close"));
    }
}
