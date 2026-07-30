package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class axj {

    /* JADX INFO: renamed from: a */
    public static final C15753a<String> f72188a = new C15753a<>(8);

    /* JADX INFO: renamed from: l.axj$a */
    public static class C15753a<T> {

        /* JADX INFO: renamed from: a */
        public final List<T> f72189a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final int f72190b;

        public C15753a(int i) {
            this.f72190b = i;
        }

        /* JADX INFO: renamed from: a */
        public void m99448a(T t) {
            this.f72189a.add(t);
            if (this.f72189a.size() > this.f72190b) {
                this.f72189a.remove(0);
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m99449b(T t) {
            return this.f72189a.contains(t);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m99427a(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6) {
        zvf0.m220395q("e_gift", str, vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i)), vwb.m200311Y("module", str2), vwb.m200311Y("giftId", str3), vwb.m200311Y("giftName", str4), vwb.m200311Y("giftUnitPrice", Integer.valueOf(i2)), vwb.m200311Y("enoughCoin", "NA"), vwb.m200311Y("giftCombos", "NA"), vwb.m200311Y("gift_type", "NA"), vwb.m200311Y("combo_id", "NA"), vwb.m200311Y("gift_num", 1), vwb.m200311Y("gift_receiver_id", str5), vwb.m200311Y("activity_name", str6), vwb.m200311Y("giftBarPageId", "NA"), vwb.m200311Y("gift_bar_tab", "NA"), vwb.m200311Y("gift_press_type", "click"));
    }

    /* JADX INFO: renamed from: b */
    public static void m99428b(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6) {
        zvf0.m220399u("e_gift", str, vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i)), vwb.m200311Y("module", str2), vwb.m200311Y("giftId", str3), vwb.m200311Y("giftName", str4), vwb.m200311Y("giftUnitPrice", Integer.valueOf(i2)), vwb.m200311Y("enoughCoin", "NA"), vwb.m200311Y("gift_type", "NA"), vwb.m200311Y("combo_id", "NA"), vwb.m200311Y("gift_num", 1), vwb.m200311Y("gift_receiver_id", str5), vwb.m200311Y("activity_name", str6), vwb.m200311Y("giftBarPageId", "NA"), vwb.m200311Y("gift_bar_tab", "NA"), vwb.m200311Y("gift_press_type", "click"));
    }

    /* JADX INFO: renamed from: c */
    public static String m99429c(String str, List<mlj> list, boolean z) {
        if (!z) {
            return str;
        }
        Iterator<mlj> it = list.iterator();
        String str2 = "";
        while (it.hasNext()) {
            str2 = it.next().f134444e.f111520a + Constants.SEPARATOR_COMMA;
        }
        return str2.substring(0, str2.length() - 1);
    }

    /* JADX INFO: renamed from: d */
    public static void m99430d(BLiveGiftItem bLiveGiftItem, String str, String str2, int i) {
        zvf0.m220399u("e_gift", str, vwb.m200311Y("giftId", Integer.valueOf(bLiveGiftItem.f44377id)), vwb.m200311Y("giftUnitPrice", Double.valueOf(bLiveGiftItem.unitPrice)), vwb.m200311Y("gift_receiver_id", str2), vwb.m200311Y("gift_type", bLiveGiftItem.giftType), vwb.m200311Y("module", "ktv_panel"), vwb.m200311Y("giftCombos", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: e */
    public static void m99431e(BLiveGiftItem bLiveGiftItem, String str, String str2, int i) {
        zvf0.m220368A("e_gift", str, vwb.m200311Y("giftId", Integer.valueOf(bLiveGiftItem.f44377id)), vwb.m200311Y("module", "ktv_panel"));
    }

    /* JADX INFO: renamed from: f */
    public static void m99432f(BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom, boolean z, String str, GiftTrayData giftTrayData) {
        zvf0.m220368A("e_live_send_gift_tray", z ? "p_anchor_live_room" : "p_user_live_room", vwb.m200311Y("anchorId", str), vwb.m200311Y("liveId", bLiveAbsData.f44323id), vwb.m200311Y("roomId", bLiveAbsRoom.f44324id), vwb.m200311Y("giftId", Integer.valueOf(giftTrayData.f50099e)), vwb.m200311Y("combo_id", giftTrayData.f50108n), vwb.m200311Y("combo_num", Integer.valueOf(giftTrayData.f50105k)));
    }

    /* JADX INFO: renamed from: g */
    public static void m99433g(String str, String str2, int i, String str3) {
        l3f l3fVar = new l3f();
        l3fVar.f125895n = str2;
        l3fVar.f125885d = EventNameEnum.MODULE_SLIDER;
        l3fVar.f125900s = "e_gift_bar";
        if (TextUtils.isEmpty(str3)) {
            zvf0.m220393o(l3fVar, vwb.m200311Y("giftBarPageId", Integer.valueOf(i + 1)), vwb.m200311Y("gift_bar_tab", str));
        } else {
            zvf0.m220393o(l3fVar, vwb.m200311Y("giftBarPageId", Integer.valueOf(i + 1)), vwb.m200311Y("gift_bar_tab", str), vwb.m200311Y("live_new_type", str3));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m99434h(BLiveGiftItem bLiveGiftItem, String str, String str2, boolean z, String str3, int i, String str4) {
        zvf0.m220399u("e_gift", str3, vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("module", str), vwb.m200311Y("giftId", Integer.valueOf(bLiveGiftItem.f44377id)), vwb.m200311Y("giftName", bLiveGiftItem.name), vwb.m200311Y("giftUnitPrice", Double.valueOf(bLiveGiftItem.unitPrice)), vwb.m200311Y("giftBarPageId", "NA"), vwb.m200311Y("enoughCoin", Boolean.valueOf(z)), vwb.m200311Y("gift_type", bLiveGiftItem.giftType), vwb.m200311Y("combo_id", "NA"), vwb.m200311Y("gift_num", Integer.valueOf(i)), vwb.m200311Y("gift_bar_tab", "NA"), vwb.m200311Y("activity_name", str2), vwb.m200311Y("gift_receiver_id", str4), vwb.m200311Y("gift_press_type", "click"));
    }

    /* JADX INFO: renamed from: i */
    public static void m99435i(BLiveGiftItem bLiveGiftItem, String str, String str2, int i, String str3) {
        zvf0.m220399u("e_gift", str2, vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("module", BLiveTraceServerLocation.quickgift), vwb.m200311Y("giftId", Integer.valueOf(bLiveGiftItem.f44377id)), vwb.m200311Y("giftName", bLiveGiftItem.name), vwb.m200311Y("giftUnitPrice", Double.valueOf(bLiveGiftItem.unitPrice)), vwb.m200311Y("giftBarPageId", "NA"), vwb.m200311Y("enoughCoin", str), vwb.m200311Y("gift_type", bLiveGiftItem.giftType), vwb.m200311Y("combo_id", "NA"), vwb.m200311Y("gift_num", Integer.valueOf(i)), vwb.m200311Y("gift_bar_tab", "NA"), vwb.m200311Y("gift_receiver_id", str3), vwb.m200311Y("gift_press_type", "click"));
    }

    /* JADX INFO: renamed from: j */
    public static void m99436j(ahs<?> ahsVar, ihs ihsVar, int i, String str, String str2, int i2, String str3, String str4, boolean z) {
        BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        List list = (List) ahsVar.m129297F3(new qee0(700));
        boolean z2 = !vwb.m200296J(list) && list.size() >= 2;
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
        map.put("gift_receiver_id", m99429c(str4, list, z2));
        map.put("gift_press_type", z ? "long_press" : "click");
        map.put("is_send_all", z2 ? "1" : "0");
        map.put("receive_user_num", Integer.valueOf(list.size()));
        zvf0.m220397s("e_gift", str2, map);
    }

    /* JADX INFO: renamed from: k */
    public static void m99437k(ihs ihsVar, int i, String str) {
        BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        zvf0.m220368A("e_gift", str, vwb.m200311Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i + 1 + (ihsVar.m136286k() * 8))), vwb.m200311Y("module", "e_gift_bar"), vwb.m200311Y("giftId", Integer.valueOf(bLiveGiftItemM136283h.f44377id)), vwb.m200311Y("giftName", bLiveGiftItemM136283h.name), vwb.m200311Y("giftUnitPrice", Double.valueOf(bLiveGiftItemM136283h.unitPrice)), vwb.m200311Y("giftBarPageId", Integer.valueOf(ihsVar.m136286k() + 1)), vwb.m200311Y("gift_type", bLiveGiftItemM136283h.giftType), vwb.m200311Y("gift_bar_tab", ihsVar.m136284i()));
    }

    /* JADX INFO: renamed from: l */
    public static void m99438l(String str) {
        zvf0.m220396r("e_live_gift_skin", str);
    }

    /* JADX INFO: renamed from: m */
    public static void m99439m(String str) {
        zvf0.m220402x("e_live_gift_skin", str);
    }

    /* JADX INFO: renamed from: n */
    public static void m99440n(String str) {
        zvf0.m220399u("e_recharge", str, vwb.m200311Y("module", "e_gift_bar"));
    }

    /* JADX INFO: renamed from: o */
    public static void m99441o(String str, String str2, int i, String str3) {
        if (TextUtils.isEmpty(str3)) {
            zvf0.m220368A("e_gift_bar", str2, vwb.m200311Y("giftBarPageId", Integer.valueOf(i + 1)), vwb.m200311Y("live_new_type", ""), vwb.m200311Y("gift_bar_tab", str));
        } else {
            zvf0.m220368A("e_gift_bar", str2, vwb.m200311Y("giftBarPageId", Integer.valueOf(i + 1)), vwb.m200311Y("gift_bar_tab", str), vwb.m200311Y("live_new_type", str3));
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m99442p(String str) {
        zvf0.m220368A("e_recharge", str, vwb.m200311Y("module", "e_gift_bar"));
    }

    /* JADX INFO: renamed from: q */
    public static void m99443q(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief, String str, int i, String str2) {
        l3f l3fVar = new l3f();
        l3fVar.f125900s = "e_gift";
        l3fVar.f125895n = str;
        l3fVar.f125885d = EventNameEnum.BIZ_PAY;
        zvf0.m220393o(l3fVar, vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("module", BLiveTraceServerLocation.quickgift), vwb.m200311Y("giftId", Integer.valueOf(bLiveGiftItem.f44377id)), vwb.m200311Y("giftName", bLiveGiftItem.name), vwb.m200311Y("giftUnitPrice", Double.valueOf(bLiveGiftItem.unitPrice)), vwb.m200311Y("giftBarPageId", "NA"), vwb.m200311Y("enoughCoin", Boolean.TRUE), vwb.m200311Y("giftCombos", Integer.valueOf(bLiveGivenGiftBrief.combos)), vwb.m200311Y("gift_type", bLiveGiftItem.giftType), vwb.m200311Y("combo_id", bLiveGivenGiftBrief.comboId), vwb.m200311Y("gift_num", Integer.valueOf(i)), vwb.m200311Y("gift_bar_tab", "NA"), vwb.m200311Y("gift_receiver_id", str2), vwb.m200311Y("gift_press_type", "click"));
    }

    /* JADX INFO: renamed from: r */
    public static void m99444r(ahs<?> ahsVar, ihs ihsVar, int i, BLiveGivenGiftBrief bLiveGivenGiftBrief, String str, int i2, String str2, String str3, boolean z) {
        if (bLiveGivenGiftBrief.isSendGiftFromBatch()) {
            C15753a<String> c15753a = f72188a;
            if (c15753a.m99449b(bLiveGivenGiftBrief.sendGiftBatchOriginalId)) {
                return;
            } else {
                c15753a.m99448a(bLiveGivenGiftBrief.sendGiftBatchOriginalId);
            }
        }
        BLiveGiftItem bLiveGiftItemM136283h = ihsVar.m136283h();
        l3f l3fVar = new l3f();
        l3fVar.f125900s = "e_gift";
        l3fVar.f125895n = str;
        l3fVar.f125885d = EventNameEnum.BIZ_PAY;
        List list = (List) ahsVar.m129297F3(new qee0(700));
        boolean z2 = !vwb.m200296J(list) && list.size() >= 2;
        HashMap map = new HashMap();
        map.put(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i + 1));
        map.put("module", "e_gift_bar");
        map.put("giftId", Integer.valueOf(bLiveGiftItemM136283h.f44377id));
        map.put("giftName", bLiveGiftItemM136283h.name);
        map.put("giftUnitPrice", Double.valueOf(bLiveGiftItemM136283h.unitPrice));
        map.put("giftBarPageId", Integer.valueOf(ihsVar.m136286k() + 1));
        map.put("enoughCoin", Boolean.TRUE);
        map.put("giftCombos", Integer.valueOf(bLiveGivenGiftBrief.combos));
        map.put("gift_type", bLiveGiftItemM136283h.giftType);
        map.put("combo_id", bLiveGivenGiftBrief.comboId);
        map.put("gift_num", Integer.valueOf(i2));
        map.put("gift_bar_tab", ihsVar.m136284i());
        map.put("gift_send_type", str2);
        map.put("gift_receiver_id", m99429c(str3, list, z2));
        map.put("gift_press_type", z ? "long_press" : "click");
        map.put("is_send_all", z2 ? "1" : "0");
        map.put("receive_user_num", Integer.valueOf(list.size()));
        zvf0.m220392n(l3fVar, map);
    }

    /* JADX INFO: renamed from: s */
    public static void m99445s(BLiveGiftItem bLiveGiftItem, String str, int i, String str2) {
        l3f l3fVar = new l3f();
        l3fVar.f125900s = "e_gift";
        l3fVar.f125895n = str;
        l3fVar.f125885d = EventNameEnum.BIZ_PAY;
        zvf0.m220393o(l3fVar, vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("module", "new_user_treasure_box"), vwb.m200311Y("giftId", Integer.valueOf(bLiveGiftItem.f44377id)), vwb.m200311Y("giftName", bLiveGiftItem.name), vwb.m200311Y("giftUnitPrice", Double.valueOf(bLiveGiftItem.unitPrice)), vwb.m200311Y("giftBarPageId", "NA"), vwb.m200311Y("enoughCoin", Boolean.TRUE), vwb.m200311Y("giftCombos", "NA"), vwb.m200311Y("gift_type", bLiveGiftItem.giftType), vwb.m200311Y("combo_id", "NA"), vwb.m200311Y("gift_num", Integer.valueOf(i)), vwb.m200311Y("gift_bar_tab", "NA"), vwb.m200311Y("gift_send_type", "NA"), vwb.m200311Y("gift_receiver_id", str2), vwb.m200311Y("gift_press_type", "click"));
    }

    /* JADX INFO: renamed from: t */
    public static void m99446t(String str, boolean z, String str2, String str3, String str4, String str5) {
        j760 j760VarM200311Y = vwb.m200311Y("anchor_id", str2);
        j760 j760VarM200311Y2 = vwb.m200311Y("live_id", str3);
        j760 j760VarM200311Y3 = vwb.m200311Y("is_not_show_required", Integer.valueOf(z ? 1 : 0));
        j760 j760VarM200311Y4 = vwb.m200311Y("live_category", str4);
        if (TextUtils.isEmpty(str5)) {
            str5 = "default";
        }
        zvf0.m220399u("e_live_bottom_popup", str, j760VarM200311Y, j760VarM200311Y2, j760VarM200311Y3, j760VarM200311Y4, vwb.m200311Y("mc_type", str5));
    }

    /* JADX INFO: renamed from: u */
    public static void m99447u(String str, boolean z, String str2, String str3, String str4) {
        zvf0.m220368A("e_live_bottom_popup", str, vwb.m200311Y("anchor_id", str2), vwb.m200311Y("live_id", str3), vwb.m200311Y("is_not_show_required", Integer.valueOf(z ? 1 : 0)), vwb.m200311Y("live_category", str4));
    }
}
