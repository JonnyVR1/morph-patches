package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.foxstatistics.entity.EventNameEnum;

/* JADX INFO: loaded from: classes4.dex */
public class fzj {
    /* JADX INFO: renamed from: a */
    public static void m128191a(String str, String str2, BLiveGiftItem bLiveGiftItem, int i, String str3) {
        q4f q4fVar = new q4f();
        q4fVar.f155581s = "e_gift";
        q4fVar.f155576n = str2;
        q4fVar.f155566d = EventNameEnum.BIZ_PAY;
        i4g0.m138517o(q4fVar, jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"), jyb.m147494Y("module", "gift_set"), jyb.m147494Y("giftId", str), jyb.m147494Y("giftName", bLiveGiftItem.name), jyb.m147494Y("giftUnitPrice", Double.valueOf(bLiveGiftItem.unitPrice)), jyb.m147494Y("giftBarPageId", "NA"), jyb.m147494Y("enoughCoin", Boolean.TRUE), jyb.m147494Y("giftCombos", "NA"), jyb.m147494Y("gift_type", "NA"), jyb.m147494Y("combo_id", "NA"), jyb.m147494Y("gift_num", Integer.valueOf(i)), jyb.m147494Y("gift_bar_tab", "NA"), jyb.m147494Y("gift_receiver_id", str3));
    }

    /* JADX INFO: renamed from: b */
    public static void m128192b(boolean z) {
        i4g0.m138526x("e_live_gift_set", z ? "p_anchor_live_room" : "p_user_live_room");
    }
}
