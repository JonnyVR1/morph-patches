package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l.j760;
import l.l3f;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class axj {

    /* JADX INFO: renamed from: a */
    public static final C0496a<String> f7918a = new C0496a<>(8);

    /* JADX INFO: renamed from: l.axj$a */
    public static class C0496a<T> {

        /* JADX INFO: renamed from: a */
        public final List<T> f7919a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final int f7920b;

        public C0496a(int i) {
            this.f7920b = i;
        }

        /* JADX INFO: renamed from: a */
        public void m10108a(T t) {
            this.f7919a.add(t);
            if (this.f7919a.size() > this.f7920b) {
                this.f7919a.remove(0);
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m10109b(T t) {
            return this.f7919a.contains(t);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m10087a(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6) {
        zvf0.q("e_gift", str, new j760[]{vwb.Y("index", Integer.valueOf(i)), vwb.Y("module", str2), vwb.Y("giftId", str3), vwb.Y("giftName", str4), vwb.Y("giftUnitPrice", Integer.valueOf(i2)), vwb.Y("enoughCoin", "NA"), vwb.Y("giftCombos", "NA"), vwb.Y("gift_type", "NA"), vwb.Y("combo_id", "NA"), vwb.Y("gift_num", 1), vwb.Y("gift_receiver_id", str5), vwb.Y("activity_name", str6), vwb.Y("giftBarPageId", "NA"), vwb.Y("gift_bar_tab", "NA"), vwb.Y("gift_press_type", "click")});
    }

    /* JADX INFO: renamed from: b */
    public static void m10088b(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6) {
        zvf0.u("e_gift", str, new j760[]{vwb.Y("index", Integer.valueOf(i)), vwb.Y("module", str2), vwb.Y("giftId", str3), vwb.Y("giftName", str4), vwb.Y("giftUnitPrice", Integer.valueOf(i2)), vwb.Y("enoughCoin", "NA"), vwb.Y("gift_type", "NA"), vwb.Y("combo_id", "NA"), vwb.Y("gift_num", 1), vwb.Y("gift_receiver_id", str5), vwb.Y("activity_name", str6), vwb.Y("giftBarPageId", "NA"), vwb.Y("gift_bar_tab", "NA"), vwb.Y("gift_press_type", "click")});
    }

    /* JADX INFO: renamed from: c */
    public static String m10089c(String str, List<mlj> list, boolean z) {
        if (!z) {
            return str;
        }
        Iterator<mlj> it = list.iterator();
        String str2 = "";
        while (it.hasNext()) {
            str2 = it.next().f15446e.a + ",";
        }
        return str2.substring(0, str2.length() - 1);
    }

    /* JADX INFO: renamed from: d */
    public static void m10090d(BLiveGiftItem bLiveGiftItem, String str, String str2, int i) {
        zvf0.u("e_gift", str, new j760[]{vwb.Y("giftId", Integer.valueOf(bLiveGiftItem.id)), vwb.Y("giftUnitPrice", Double.valueOf(bLiveGiftItem.unitPrice)), vwb.Y("gift_receiver_id", str2), vwb.Y("gift_type", bLiveGiftItem.giftType), vwb.Y("module", "ktv_panel"), vwb.Y("giftCombos", Integer.valueOf(i))});
    }

    /* JADX INFO: renamed from: e */
    public static void m10091e(BLiveGiftItem bLiveGiftItem, String str, String str2, int i) {
        zvf0.A("e_gift", str, new j760[]{vwb.Y("giftId", Integer.valueOf(bLiveGiftItem.id)), vwb.Y("module", "ktv_panel")});
    }

    /* JADX INFO: renamed from: f */
    public static void m10092f(BLiveAbsData bLiveAbsData, BLiveAbsRoom bLiveAbsRoom, boolean z, String str, GiftTrayData giftTrayData) {
        zvf0.A("e_live_send_gift_tray", z ? "p_anchor_live_room" : "p_user_live_room", new j760[]{vwb.Y("anchorId", str), vwb.Y("liveId", bLiveAbsData.id), vwb.Y("roomId", bLiveAbsRoom.id), vwb.Y("giftId", Integer.valueOf(giftTrayData.f6141e)), vwb.Y("combo_id", giftTrayData.f6150n), vwb.Y("combo_num", Integer.valueOf(giftTrayData.f6147k))});
    }

    /* JADX INFO: renamed from: g */
    public static void m10093g(String str, String str2, int i, String str3) {
        l3f l3fVar = new l3f();
        l3fVar.n = str2;
        l3fVar.d = EventNameEnum.MODULE_SLIDER;
        l3fVar.s = "e_gift_bar";
        if (TextUtils.isEmpty(str3)) {
            zvf0.o(l3fVar, new j760[]{vwb.Y("giftBarPageId", Integer.valueOf(i + 1)), vwb.Y("gift_bar_tab", str)});
        } else {
            zvf0.o(l3fVar, new j760[]{vwb.Y("giftBarPageId", Integer.valueOf(i + 1)), vwb.Y("gift_bar_tab", str), vwb.Y("live_new_type", str3)});
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m10094h(BLiveGiftItem bLiveGiftItem, String str, String str2, boolean z, String str3, int i, String str4) {
        zvf0.u("e_gift", str3, new j760[]{vwb.Y("index", "NA"), vwb.Y("module", str), vwb.Y("giftId", Integer.valueOf(bLiveGiftItem.id)), vwb.Y("giftName", bLiveGiftItem.name), vwb.Y("giftUnitPrice", Double.valueOf(bLiveGiftItem.unitPrice)), vwb.Y("giftBarPageId", "NA"), vwb.Y("enoughCoin", Boolean.valueOf(z)), vwb.Y("gift_type", bLiveGiftItem.giftType), vwb.Y("combo_id", "NA"), vwb.Y("gift_num", Integer.valueOf(i)), vwb.Y("gift_bar_tab", "NA"), vwb.Y("activity_name", str2), vwb.Y("gift_receiver_id", str4), vwb.Y("gift_press_type", "click")});
    }

    /* JADX INFO: renamed from: i */
    public static void m10095i(BLiveGiftItem bLiveGiftItem, String str, String str2, int i, String str3) {
        zvf0.u("e_gift", str2, new j760[]{vwb.Y("index", "NA"), vwb.Y("module", "quickgift"), vwb.Y("giftId", Integer.valueOf(bLiveGiftItem.id)), vwb.Y("giftName", bLiveGiftItem.name), vwb.Y("giftUnitPrice", Double.valueOf(bLiveGiftItem.unitPrice)), vwb.Y("giftBarPageId", "NA"), vwb.Y("enoughCoin", str), vwb.Y("gift_type", bLiveGiftItem.giftType), vwb.Y("combo_id", "NA"), vwb.Y("gift_num", Integer.valueOf(i)), vwb.Y("gift_bar_tab", "NA"), vwb.Y("gift_receiver_id", str3), vwb.Y("gift_press_type", "click")});
    }

    /* JADX INFO: renamed from: j */
    public static void m10096j(ahs<?> ahsVar, ihs ihsVar, int i, String str, String str2, int i2, String str3, String str4, boolean z) {
        BLiveGiftItem bLiveGiftItemM15160h = ihsVar.m15160h();
        List list = (List) ahsVar.m14184F3(new qee0(700));
        boolean z2 = !vwb.J(list) && list.size() >= 2;
        HashMap map = new HashMap();
        map.put("index", Integer.valueOf(i + 1));
        map.put("module", "e_gift_bar");
        map.put("giftId", Integer.valueOf(bLiveGiftItemM15160h.id));
        map.put("giftName", bLiveGiftItemM15160h.name);
        map.put("giftUnitPrice", Double.valueOf(bLiveGiftItemM15160h.unitPrice));
        map.put("giftBarPageId", Integer.valueOf(ihsVar.m15163k() + 1));
        map.put("enoughCoin", str);
        map.put("gift_type", bLiveGiftItemM15160h.giftType);
        map.put("combo_id", "NA");
        map.put("gift_num", Integer.valueOf(i2));
        map.put("gift_bar_tab", ihsVar.m15161i());
        map.put("gift_send_type", str3);
        map.put("gift_receiver_id", m10089c(str4, list, z2));
        map.put("gift_press_type", z ? "long_press" : "click");
        map.put("is_send_all", z2 ? "1" : "0");
        map.put("receive_user_num", Integer.valueOf(list.size()));
        zvf0.s("e_gift", str2, map);
    }

    /* JADX INFO: renamed from: k */
    public static void m10097k(ihs ihsVar, int i, String str) {
        BLiveGiftItem bLiveGiftItemM15160h = ihsVar.m15160h();
        zvf0.A("e_gift", str, new j760[]{vwb.Y("index", Integer.valueOf(i + 1 + (ihsVar.m15163k() * 8))), vwb.Y("module", "e_gift_bar"), vwb.Y("giftId", Integer.valueOf(bLiveGiftItemM15160h.id)), vwb.Y("giftName", bLiveGiftItemM15160h.name), vwb.Y("giftUnitPrice", Double.valueOf(bLiveGiftItemM15160h.unitPrice)), vwb.Y("giftBarPageId", Integer.valueOf(ihsVar.m15163k() + 1)), vwb.Y("gift_type", bLiveGiftItemM15160h.giftType), vwb.Y("gift_bar_tab", ihsVar.m15161i())});
    }

    /* JADX INFO: renamed from: l */
    public static void m10098l(String str) {
        zvf0.r("e_live_gift_skin", str);
    }

    /* JADX INFO: renamed from: m */
    public static void m10099m(String str) {
        zvf0.x("e_live_gift_skin", str);
    }

    /* JADX INFO: renamed from: n */
    public static void m10100n(String str) {
        zvf0.u("e_recharge", str, new j760[]{vwb.Y("module", "e_gift_bar")});
    }

    /* JADX INFO: renamed from: o */
    public static void m10101o(String str, String str2, int i, String str3) {
        if (TextUtils.isEmpty(str3)) {
            zvf0.A("e_gift_bar", str2, new j760[]{vwb.Y("giftBarPageId", Integer.valueOf(i + 1)), vwb.Y("live_new_type", ""), vwb.Y("gift_bar_tab", str)});
        } else {
            zvf0.A("e_gift_bar", str2, new j760[]{vwb.Y("giftBarPageId", Integer.valueOf(i + 1)), vwb.Y("gift_bar_tab", str), vwb.Y("live_new_type", str3)});
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m10102p(String str) {
        zvf0.A("e_recharge", str, new j760[]{vwb.Y("module", "e_gift_bar")});
    }

    /* JADX INFO: renamed from: q */
    public static void m10103q(BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief, String str, int i, String str2) {
        l3f l3fVar = new l3f();
        l3fVar.s = "e_gift";
        l3fVar.n = str;
        l3fVar.d = EventNameEnum.BIZ_PAY;
        zvf0.o(l3fVar, new j760[]{vwb.Y("index", "NA"), vwb.Y("module", "quickgift"), vwb.Y("giftId", Integer.valueOf(bLiveGiftItem.id)), vwb.Y("giftName", bLiveGiftItem.name), vwb.Y("giftUnitPrice", Double.valueOf(bLiveGiftItem.unitPrice)), vwb.Y("giftBarPageId", "NA"), vwb.Y("enoughCoin", Boolean.TRUE), vwb.Y("giftCombos", Integer.valueOf(bLiveGivenGiftBrief.combos)), vwb.Y("gift_type", bLiveGiftItem.giftType), vwb.Y("combo_id", bLiveGivenGiftBrief.comboId), vwb.Y("gift_num", Integer.valueOf(i)), vwb.Y("gift_bar_tab", "NA"), vwb.Y("gift_receiver_id", str2), vwb.Y("gift_press_type", "click")});
    }

    /* JADX INFO: renamed from: r */
    public static void m10104r(ahs<?> ahsVar, ihs ihsVar, int i, BLiveGivenGiftBrief bLiveGivenGiftBrief, String str, int i2, String str2, String str3, boolean z) {
        if (bLiveGivenGiftBrief.isSendGiftFromBatch()) {
            C0496a<String> c0496a = f7918a;
            if (c0496a.m10109b(bLiveGivenGiftBrief.sendGiftBatchOriginalId)) {
                return;
            } else {
                c0496a.m10108a(bLiveGivenGiftBrief.sendGiftBatchOriginalId);
            }
        }
        BLiveGiftItem bLiveGiftItemM15160h = ihsVar.m15160h();
        l3f l3fVar = new l3f();
        l3fVar.s = "e_gift";
        l3fVar.n = str;
        l3fVar.d = EventNameEnum.BIZ_PAY;
        List list = (List) ahsVar.m14184F3(new qee0(700));
        boolean z2 = !vwb.J(list) && list.size() >= 2;
        HashMap map = new HashMap();
        map.put("index", Integer.valueOf(i + 1));
        map.put("module", "e_gift_bar");
        map.put("giftId", Integer.valueOf(bLiveGiftItemM15160h.id));
        map.put("giftName", bLiveGiftItemM15160h.name);
        map.put("giftUnitPrice", Double.valueOf(bLiveGiftItemM15160h.unitPrice));
        map.put("giftBarPageId", Integer.valueOf(ihsVar.m15163k() + 1));
        map.put("enoughCoin", Boolean.TRUE);
        map.put("giftCombos", Integer.valueOf(bLiveGivenGiftBrief.combos));
        map.put("gift_type", bLiveGiftItemM15160h.giftType);
        map.put("combo_id", bLiveGivenGiftBrief.comboId);
        map.put("gift_num", Integer.valueOf(i2));
        map.put("gift_bar_tab", ihsVar.m15161i());
        map.put("gift_send_type", str2);
        map.put("gift_receiver_id", m10089c(str3, list, z2));
        map.put("gift_press_type", z ? "long_press" : "click");
        map.put("is_send_all", z2 ? "1" : "0");
        map.put("receive_user_num", Integer.valueOf(list.size()));
        zvf0.n(l3fVar, map);
    }

    /* JADX INFO: renamed from: s */
    public static void m10105s(BLiveGiftItem bLiveGiftItem, String str, int i, String str2) {
        l3f l3fVar = new l3f();
        l3fVar.s = "e_gift";
        l3fVar.n = str;
        l3fVar.d = EventNameEnum.BIZ_PAY;
        zvf0.o(l3fVar, new j760[]{vwb.Y("index", "NA"), vwb.Y("module", "new_user_treasure_box"), vwb.Y("giftId", Integer.valueOf(bLiveGiftItem.id)), vwb.Y("giftName", bLiveGiftItem.name), vwb.Y("giftUnitPrice", Double.valueOf(bLiveGiftItem.unitPrice)), vwb.Y("giftBarPageId", "NA"), vwb.Y("enoughCoin", Boolean.TRUE), vwb.Y("giftCombos", "NA"), vwb.Y("gift_type", bLiveGiftItem.giftType), vwb.Y("combo_id", "NA"), vwb.Y("gift_num", Integer.valueOf(i)), vwb.Y("gift_bar_tab", "NA"), vwb.Y("gift_send_type", "NA"), vwb.Y("gift_receiver_id", str2), vwb.Y("gift_press_type", "click")});
    }

    /* JADX INFO: renamed from: t */
    public static void m10106t(String str, boolean z, String str2, String str3, String str4, String str5) {
        j760 j760VarY = vwb.Y("anchor_id", str2);
        j760 j760VarY2 = vwb.Y("live_id", str3);
        j760 j760VarY3 = vwb.Y("is_not_show_required", Integer.valueOf(z ? 1 : 0));
        j760 j760VarY4 = vwb.Y("live_category", str4);
        if (TextUtils.isEmpty(str5)) {
            str5 = "default";
        }
        zvf0.u("e_live_bottom_popup", str, new j760[]{j760VarY, j760VarY2, j760VarY3, j760VarY4, vwb.Y("mc_type", str5)});
    }

    /* JADX INFO: renamed from: u */
    public static void m10107u(String str, boolean z, String str2, String str3, String str4) {
        zvf0.A("e_live_bottom_popup", str, new j760[]{vwb.Y("anchor_id", str2), vwb.Y("live_id", str3), vwb.Y("is_not_show_required", Integer.valueOf(z ? 1 : 0)), vwb.Y("live_category", str4)});
    }
}
