package p009l;

import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarHallMainDetail;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3MainDetail;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3Tab;
import com.p1.mobile.putong.live.base.api.LiveApiBuilder;
import l.cll;
import l.g7t;
import l.mt0;
import l.ytr;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class v2o0 {
    /* JADX INFO: renamed from: a */
    public static c<GiftWallV3Tab> m23250a(String str) {
        return upv.m23154v(LiveApiBuilder.u(str, new mt0[0]), "loadNextPageGifts" + str, g7t.c(GiftWallV3Tab.class, "giftWallV3Tab"));
    }

    /* JADX INFO: renamed from: b */
    public static c<GiftWallV3MainDetail> m23251b(String str) {
        return upv.m23154v(LiveApiBuilder.u(ytr.b("/live-gift/gift-wall-v3/users/" + str + "/mainDetail"), new mt0[0]), "requestGiftWallV3MainDetail" + str, g7t.c(GiftWallV3MainDetail.class, "giftWallV3MainDetail"));
    }

    /* JADX INFO: renamed from: c */
    public static c<GiftWallV3Tab> m23252c(String str, String str2, String str3) {
        return upv.m23154v(LiveApiBuilder.u(ytr.b("/live-gift/gift-wall-v3/users/" + str + "/tabs/" + str2), new mt0[0]).p().c("sortRule", str3).d(), "requestGifts" + str + str2 + str3, g7t.c(GiftWallV3Tab.class, "giftWallV3Tab"));
    }

    /* JADX INFO: renamed from: d */
    public static c<GiftWallV3GiftWeekStarGiftMainDetail> m23253d(String str, String str2) {
        return upv.m23154v(LiveApiBuilder.u(ytr.b("/live-gift/gift-wall-v3/users/" + str + "/gifts/" + str2 + "/mainDetail"), new mt0[0]), "requestWallGiftDetail" + str + str2, g7t.c(GiftWallV3GiftWeekStarGiftMainDetail.class, "giftWallV3GiftMainDetail"));
    }

    /* JADX INFO: renamed from: e */
    public static c<GiftWallV3GiftWeekStarHallMainDetail> m23254e(String str) {
        return upv.m23154v(LiveApiBuilder.u(ytr.b("/live-gift/gift-wall-v3/users/" + str + "/weekStarHaleMainDetail"), new mt0[0]), "requestWeekStarData" + str, g7t.c(GiftWallV3GiftWeekStarHallMainDetail.class, "giftWallV3WeekStarHaleMainDetail"));
    }

    /* JADX INFO: renamed from: f */
    public static c<GiftWallV3GiftWeekStarGiftMainDetail> m23255f(String str, String str2, long j) {
        cll.a aVarP = LiveApiBuilder.u(ytr.b("/live-gift/gift-wall-v3/users/" + str + "/weekStarGifts/" + str2 + "/mainDetail"), new mt0[0]).p();
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("");
        return upv.m23154v(aVarP.c("currentTime", sb.toString()).d(), "requestWeekStarGiftData" + str + str2, g7t.c(GiftWallV3GiftWeekStarGiftMainDetail.class, "giftWallV3WeekStarGiftMainDetail"));
    }
}
