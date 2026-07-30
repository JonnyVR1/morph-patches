package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.foxstatistics.entity.EventNameEnum;

/* JADX INFO: loaded from: classes4.dex */
public class pwj {
    /* JADX INFO: renamed from: a */
    public static void m171752a(String str, String str2, BLiveGiftItem bLiveGiftItem, int i, String str3) {
        l3f l3fVar = new l3f();
        l3fVar.f125900s = "e_gift";
        l3fVar.f125895n = str2;
        l3fVar.f125885d = EventNameEnum.BIZ_PAY;
        zvf0.m220393o(l3fVar, vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("module", "gift_set"), vwb.m200311Y("giftId", str), vwb.m200311Y("giftName", bLiveGiftItem.name), vwb.m200311Y("giftUnitPrice", Double.valueOf(bLiveGiftItem.unitPrice)), vwb.m200311Y("giftBarPageId", "NA"), vwb.m200311Y("enoughCoin", Boolean.TRUE), vwb.m200311Y("giftCombos", "NA"), vwb.m200311Y("gift_type", "NA"), vwb.m200311Y("combo_id", "NA"), vwb.m200311Y("gift_num", Integer.valueOf(i)), vwb.m200311Y("gift_bar_tab", "NA"), vwb.m200311Y("gift_receiver_id", str3));
    }

    /* JADX INFO: renamed from: b */
    public static void m171753b(boolean z) {
        zvf0.m220402x("e_live_gift_set", z ? "p_anchor_live_room" : "p_user_live_room");
    }
}
