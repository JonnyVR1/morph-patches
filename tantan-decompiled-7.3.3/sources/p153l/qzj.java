package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class qzj {

    /* JADX INFO: renamed from: a */
    public static final C19696a<String> f160269a = new C19696a<>(8);

    /* JADX INFO: renamed from: l.qzj$a */
    public static class C19696a<T> {

        /* JADX INFO: renamed from: a */
        public final List<T> f160270a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final int f160271b;

        public C19696a(int i) {
            this.f160271b = i;
        }

        /* JADX INFO: renamed from: a */
        public void m178805a(T t) {
            this.f160270a.add(t);
            if (this.f160270a.size() > this.f160271b) {
                this.f160270a.remove(0);
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m178806b(T t) {
            return this.f160270a.contains(t);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m178784a(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6) {
        i4g0.m138519q("e_gift", str, jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i)), jyb.m147494Y("module", str2), jyb.m147494Y("giftId", str3), jyb.m147494Y("giftName", str4), jyb.m147494Y("giftUnitPrice", Integer.valueOf(i2)), jyb.m147494Y("enoughCoin", "NA"), jyb.m147494Y("giftCombos", "NA"), jyb.m147494Y("gift_type", "NA"), jyb.m147494Y("combo_id", "NA"), jyb.m147494Y("gift_num", 1), jyb.m147494Y("gift_receiver_id", str5), jyb.m147494Y("activity_name", str6), jyb.m147494Y("giftBarPageId", "NA"), jyb.m147494Y("gift_bar_tab", "NA"), jyb.m147494Y("gift_press_type", "click"));
    }

    /* JADX INFO: renamed from: b */
    public static void m178785b(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6) {
        i4g0.m138523u("e_gift", str, jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i)), jyb.m147494Y("module", str2), jyb.m147494Y("giftId", str3), jyb.m147494Y("giftName", str4), jyb.m147494Y("giftUnitPrice", Integer.valueOf(i2)), jyb.m147494Y("enoughCoin", "NA"), jyb.m147494Y("gift_type", "NA"), jyb.m147494Y("combo_id", "NA"), jyb.m147494Y("gift_num", 1), jyb.m147494Y("gift_receiver_id", str5), jyb.m147494Y("activity_name", str6), jyb.m147494Y("giftBarPageId", "NA"), jyb.m147494Y("gift_bar_tab", "NA"), jyb.m147494Y("gift_press_type", "click"));
    }

    /* JADX INFO: renamed from: c */
    public static String m178786c(String str, List<coj> list, boolean z) {
        if (!z) {
            return str;
        }
        Iterator<coj> it = list.iterator();
        String str2 = "";
        while (it.hasNext()) {
            str2 = it.next().f82889e.f107997a + Constants.SEPARATOR_COMMA;
        }
        return str2.substring(0, str2.length() - 1);
    }

    /* JADX INFO: renamed from: d */
    public static void m178787d(BLiveGiftItem bLiveGiftItem, String str, String str2, int i) {
        i4g0.m138523u("e_gift", str, jyb.m147494Y("giftId", Integer.valueOf(bLiveGiftItem.f45225id)), jyb.m147494Y("giftUnitPrice", Double.valueOf(bLiveGiftItem.unitPrice)), jyb.m147494Y("gift_receiver_id", str2), jyb.m147494Y("gift_type", bLiveGiftItem.giftType), jyb.m147494Y("module", "ktv_panel"), jyb.m147494Y("giftCombos", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: e */
    public static void m178788e(BLiveGiftItem bLiveGiftItem, String str, String str2, int i) {
        i4g0.m138492A("e_gift", str, jyb.m147494Y("giftId", Integer.valueOf(bLiveGiftItem.f45225id)), jyb.m147494Y("module", "ktv_panel"));
    }

    /* JADX INFO: renamed from: f */
    public static void m178789f(BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom, boolean z, String str, GiftTrayData giftTrayData) {
        i4g0.m138492A("e_live_send_gift_tray", z ? "p_anchor_live_room" : "p_user_live_room", jyb.m147494Y("anchorId", str), jyb.m147494Y("liveId", bLiveAbsData.f45171id), jyb.m147494Y("roomId", bLiveAbsRoom.f45172id), jyb.m147494Y("giftId", Integer.valueOf(giftTrayData.f50947e)), jyb.m147494Y("combo_id", giftTrayData.f50956n), jyb.m147494Y("combo_num", Integer.valueOf(giftTrayData.f50953k)));
    }

    /* JADX INFO: renamed from: g */
    public static void m178790g(String str, String str2, int i, String str3) {
        q4f q4fVar = new q4f();
        q4fVar.f155576n = str2;
        q4fVar.f155566d = EventNameEnum.MODULE_SLIDER;
        q4fVar.f155581s = "e_gift_bar";
        if (TextUtils.isEmpty(str3)) {
            i4g0.m138517o(q4fVar, jyb.m147494Y("giftBarPageId", Integer.valueOf(i + 1)), jyb.m147494Y("gift_bar_tab", str));
        } else {
            i4g0.m138517o(q4fVar, jyb.m147494Y("giftBarPageId", Integer.valueOf(i + 1)), jyb.m147494Y("gift_bar_tab", str), jyb.m147494Y("live_new_type", str3));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m178791h(BLiveGiftItem bLiveGiftItem, String str, String str2, boolean z, String str3, int i, String str4) {
        i4g0.m138523u("e_gift", str3, jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"), jyb.m147494Y("module", str), jyb.m147494Y("giftId", Integer.valueOf(bLiveGiftItem.f45225id)), jyb.m147494Y("giftName", bLiveGiftItem.name), jyb.m147494Y("giftUnitPrice", Double.valueOf(bLiveGiftItem.unitPrice)), jyb.m147494Y("giftBarPageId", "NA"), jyb.m147494Y("enoughCoin", Boolean.valueOf(z)), jyb.m147494Y("gift_type", bLiveGiftItem.giftType), jyb.m147494Y("combo_id", "NA"), jyb.m147494Y("gift_num", Integer.valueOf(i)), jyb.m147494Y("gift_bar_tab", "NA"), jyb.m147494Y("activity_name", str2), jyb.m147494Y("gift_receiver_id", str4), jyb.m147494Y("gift_press_type", "click"));
    }

    /* JADX INFO: renamed from: i */
    public static void m178792i(BLiveGiftItem bLiveGiftItem, String str, String str2, int i, String str3) {
        i4g0.m138523u("e_gift", str2, jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"), jyb.m147494Y("module", BLiveTraceServerLocation.quickgift), jyb.m147494Y("giftId", Integer.valueOf(bLiveGiftItem.f45225id)), jyb.m147494Y("giftName", bLiveGiftItem.name), jyb.m147494Y("giftUnitPrice", Double.valueOf(bLiveGiftItem.unitPrice)), jyb.m147494Y("giftBarPageId", "NA"), jyb.m147494Y("enoughCoin", str), jyb.m147494Y("gift_type", bLiveGiftItem.giftType), jyb.m147494Y("combo_id", "NA"), jyb.m147494Y("gift_num", Integer.valueOf(i)), jyb.m147494Y("gift_bar_tab", "NA"), jyb.m147494Y("gift_receiver_id", str3), jyb.m147494Y("gift_press_type", "click"));
    }

    /* JADX INFO: renamed from: j */
    public static void m178793j(bjs<?> bjsVar, jjs jjsVar, int i, String str, String str2, int i2, String str3, String str4, boolean z) {
        BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        List list = (List) bjsVar.m138856F3(new vme0(700));
        boolean z2 = !jyb.m147479J(list) && list.size() >= 2;
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
        map.put("gift_receiver_id", m178786c(str4, list, z2));
        map.put("gift_press_type", z ? "long_press" : "click");
        map.put("is_send_all", z2 ? "1" : "0");
        map.put("receive_user_num", Integer.valueOf(list.size()));
        i4g0.m138521s("e_gift", str2, map);
    }

    /* JADX INFO: renamed from: k */
    public static void m178794k(jjs jjsVar, int i, String str) {
        BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        i4g0.m138492A("e_gift", str, jyb.m147494Y(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i + 1 + (jjsVar.m145125k() * 8))), jyb.m147494Y("module", "e_gift_bar"), jyb.m147494Y("giftId", Integer.valueOf(bLiveGiftItemM145122h.f45225id)), jyb.m147494Y("giftName", bLiveGiftItemM145122h.name), jyb.m147494Y("giftUnitPrice", Double.valueOf(bLiveGiftItemM145122h.unitPrice)), jyb.m147494Y("giftBarPageId", Integer.valueOf(jjsVar.m145125k() + 1)), jyb.m147494Y("gift_type", bLiveGiftItemM145122h.giftType), jyb.m147494Y("gift_bar_tab", jjsVar.m145123i()));
    }

    /* JADX INFO: renamed from: l */
    public static void m178795l(String str) {
        i4g0.m138520r("e_live_gift_skin", str);
    }

    /* JADX INFO: renamed from: m */
    public static void m178796m(String str) {
        i4g0.m138526x("e_live_gift_skin", str);
    }

    /* JADX INFO: renamed from: n */
    public static void m178797n(String str) {
        i4g0.m138523u("e_recharge", str, jyb.m147494Y("module", "e_gift_bar"));
    }

    /* JADX INFO: renamed from: o */
    public static void m178798o(String str, String str2, int i, String str3) {
        if (TextUtils.isEmpty(str3)) {
            i4g0.m138492A("e_gift_bar", str2, jyb.m147494Y("giftBarPageId", Integer.valueOf(i + 1)), jyb.m147494Y("live_new_type", ""), jyb.m147494Y("gift_bar_tab", str));
        } else {
            i4g0.m138492A("e_gift_bar", str2, jyb.m147494Y("giftBarPageId", Integer.valueOf(i + 1)), jyb.m147494Y("gift_bar_tab", str), jyb.m147494Y("live_new_type", str3));
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m178799p(String str) {
        i4g0.m138492A("e_recharge", str, jyb.m147494Y("module", "e_gift_bar"));
    }

    /* JADX INFO: renamed from: q */
    public static void m178800q(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief, String str, int i, String str2) {
        q4f q4fVar = new q4f();
        q4fVar.f155581s = "e_gift";
        q4fVar.f155576n = str;
        q4fVar.f155566d = EventNameEnum.BIZ_PAY;
        i4g0.m138517o(q4fVar, jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"), jyb.m147494Y("module", BLiveTraceServerLocation.quickgift), jyb.m147494Y("giftId", Integer.valueOf(bLiveGiftItem.f45225id)), jyb.m147494Y("giftName", bLiveGiftItem.name), jyb.m147494Y("giftUnitPrice", Double.valueOf(bLiveGiftItem.unitPrice)), jyb.m147494Y("giftBarPageId", "NA"), jyb.m147494Y("enoughCoin", Boolean.TRUE), jyb.m147494Y("giftCombos", Integer.valueOf(bLiveGivenGiftBrief.combos)), jyb.m147494Y("gift_type", bLiveGiftItem.giftType), jyb.m147494Y("combo_id", bLiveGivenGiftBrief.comboId), jyb.m147494Y("gift_num", Integer.valueOf(i)), jyb.m147494Y("gift_bar_tab", "NA"), jyb.m147494Y("gift_receiver_id", str2), jyb.m147494Y("gift_press_type", "click"));
    }

    /* JADX INFO: renamed from: r */
    public static void m178801r(bjs<?> bjsVar, jjs jjsVar, int i, BLiveGivenGiftBrief bLiveGivenGiftBrief, String str, int i2, String str2, String str3, boolean z) {
        if (bLiveGivenGiftBrief.isSendGiftFromBatch()) {
            C19696a<String> c19696a = f160269a;
            if (c19696a.m178806b(bLiveGivenGiftBrief.sendGiftBatchOriginalId)) {
                return;
            } else {
                c19696a.m178805a(bLiveGivenGiftBrief.sendGiftBatchOriginalId);
            }
        }
        BLiveGiftItem bLiveGiftItemM145122h = jjsVar.m145122h();
        q4f q4fVar = new q4f();
        q4fVar.f155581s = "e_gift";
        q4fVar.f155576n = str;
        q4fVar.f155566d = EventNameEnum.BIZ_PAY;
        List list = (List) bjsVar.m138856F3(new vme0(700));
        boolean z2 = !jyb.m147479J(list) && list.size() >= 2;
        HashMap map = new HashMap();
        map.put(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i + 1));
        map.put("module", "e_gift_bar");
        map.put("giftId", Integer.valueOf(bLiveGiftItemM145122h.f45225id));
        map.put("giftName", bLiveGiftItemM145122h.name);
        map.put("giftUnitPrice", Double.valueOf(bLiveGiftItemM145122h.unitPrice));
        map.put("giftBarPageId", Integer.valueOf(jjsVar.m145125k() + 1));
        map.put("enoughCoin", Boolean.TRUE);
        map.put("giftCombos", Integer.valueOf(bLiveGivenGiftBrief.combos));
        map.put("gift_type", bLiveGiftItemM145122h.giftType);
        map.put("combo_id", bLiveGivenGiftBrief.comboId);
        map.put("gift_num", Integer.valueOf(i2));
        map.put("gift_bar_tab", jjsVar.m145123i());
        map.put("gift_send_type", str2);
        map.put("gift_receiver_id", m178786c(str3, list, z2));
        map.put("gift_press_type", z ? "long_press" : "click");
        map.put("is_send_all", z2 ? "1" : "0");
        map.put("receive_user_num", Integer.valueOf(list.size()));
        i4g0.m138516n(q4fVar, map);
    }

    /* JADX INFO: renamed from: s */
    public static void m178802s(BLiveGiftItem bLiveGiftItem, String str, int i, String str2) {
        q4f q4fVar = new q4f();
        q4fVar.f155581s = "e_gift";
        q4fVar.f155576n = str;
        q4fVar.f155566d = EventNameEnum.BIZ_PAY;
        i4g0.m138517o(q4fVar, jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"), jyb.m147494Y("module", "new_user_treasure_box"), jyb.m147494Y("giftId", Integer.valueOf(bLiveGiftItem.f45225id)), jyb.m147494Y("giftName", bLiveGiftItem.name), jyb.m147494Y("giftUnitPrice", Double.valueOf(bLiveGiftItem.unitPrice)), jyb.m147494Y("giftBarPageId", "NA"), jyb.m147494Y("enoughCoin", Boolean.TRUE), jyb.m147494Y("giftCombos", "NA"), jyb.m147494Y("gift_type", bLiveGiftItem.giftType), jyb.m147494Y("combo_id", "NA"), jyb.m147494Y("gift_num", Integer.valueOf(i)), jyb.m147494Y("gift_bar_tab", "NA"), jyb.m147494Y("gift_send_type", "NA"), jyb.m147494Y("gift_receiver_id", str2), jyb.m147494Y("gift_press_type", "click"));
    }

    /* JADX INFO: renamed from: t */
    public static void m178803t(String str, boolean z, String str2, String str3, String str4, String str5) {
        pf60 pf60VarM147494Y = jyb.m147494Y("anchor_id", str2);
        pf60 pf60VarM147494Y2 = jyb.m147494Y("live_id", str3);
        pf60 pf60VarM147494Y3 = jyb.m147494Y("is_not_show_required", Integer.valueOf(z ? 1 : 0));
        pf60 pf60VarM147494Y4 = jyb.m147494Y("live_category", str4);
        if (TextUtils.isEmpty(str5)) {
            str5 = "default";
        }
        i4g0.m138523u("e_live_bottom_popup", str, pf60VarM147494Y, pf60VarM147494Y2, pf60VarM147494Y3, pf60VarM147494Y4, jyb.m147494Y("mc_type", str5));
    }

    /* JADX INFO: renamed from: u */
    public static void m178804u(String str, boolean z, String str2, String str3, String str4) {
        i4g0.m138492A("e_live_bottom_popup", str, jyb.m147494Y("anchor_id", str2), jyb.m147494Y("live_id", str3), jyb.m147494Y("is_not_show_required", Integer.valueOf(z ? 1 : 0)), jyb.m147494Y("live_category", str4));
    }
}
