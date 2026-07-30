package p002l;

import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import l.j760;
import l.l3f;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pwj {
    /* JADX INFO: renamed from: a */
    public static void m20732a(String str, String str2, BLiveGiftItem bLiveGiftItem, int i, String str3) {
        l3f l3fVar = new l3f();
        l3fVar.s = "e_gift";
        l3fVar.n = str2;
        l3fVar.d = EventNameEnum.BIZ_PAY;
        zvf0.o(l3fVar, new j760[]{vwb.Y("index", "NA"), vwb.Y("module", "gift_set"), vwb.Y("giftId", str), vwb.Y("giftName", bLiveGiftItem.name), vwb.Y("giftUnitPrice", Double.valueOf(bLiveGiftItem.unitPrice)), vwb.Y("giftBarPageId", "NA"), vwb.Y("enoughCoin", Boolean.TRUE), vwb.Y("giftCombos", "NA"), vwb.Y("gift_type", "NA"), vwb.Y("combo_id", "NA"), vwb.Y("gift_num", Integer.valueOf(i)), vwb.Y("gift_bar_tab", "NA"), vwb.Y("gift_receiver_id", str3)});
    }

    /* JADX INFO: renamed from: b */
    public static void m20733b(boolean z) {
        zvf0.x("e_live_gift_set", z ? "p_anchor_live_room" : "p_user_live_room");
    }
}
