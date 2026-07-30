package p149l;

import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarHallMainDetail;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3MainDetail;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3Tab;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class v2o0 {
    /* JADX INFO: renamed from: a */
    public static C22306c<GiftWallV3Tab> m196810a(String str) {
        return upv.m194934v(LiveApiBuilder.m67315u(str, new mt0[0]), "loadNextPageGifts" + str, g7t.m124730c(GiftWallV3Tab.class, "giftWallV3Tab"));
    }

    /* JADX INFO: renamed from: b */
    public static C22306c<GiftWallV3MainDetail> m196811b(String str) {
        return upv.m194934v(LiveApiBuilder.m67315u(ytr.m216073b("/live-gift/gift-wall-v3/users/" + str + "/mainDetail"), new mt0[0]), "requestGiftWallV3MainDetail" + str, g7t.m124730c(GiftWallV3MainDetail.class, "giftWallV3MainDetail"));
    }

    /* JADX INFO: renamed from: c */
    public static C22306c<GiftWallV3Tab> m196812c(String str, String str2, String str3) {
        return upv.m194934v(LiveApiBuilder.m67315u(ytr.m216073b("/live-gift/gift-wall-v3/users/" + str + "/tabs/" + str2), new mt0[0]).m107524p().m107536c("sortRule", str3).m107537d(), "requestGifts" + str + str2 + str3, g7t.m124730c(GiftWallV3Tab.class, "giftWallV3Tab"));
    }

    /* JADX INFO: renamed from: d */
    public static C22306c<GiftWallV3GiftWeekStarGiftMainDetail> m196813d(String str, String str2) {
        return upv.m194934v(LiveApiBuilder.m67315u(ytr.m216073b("/live-gift/gift-wall-v3/users/" + str + "/gifts/" + str2 + "/mainDetail"), new mt0[0]), "requestWallGiftDetail" + str + str2, g7t.m124730c(GiftWallV3GiftWeekStarGiftMainDetail.class, "giftWallV3GiftMainDetail"));
    }

    /* JADX INFO: renamed from: e */
    public static C22306c<GiftWallV3GiftWeekStarHallMainDetail> m196814e(String str) {
        return upv.m194934v(LiveApiBuilder.m67315u(ytr.m216073b("/live-gift/gift-wall-v3/users/" + str + "/weekStarHaleMainDetail"), new mt0[0]), "requestWeekStarData" + str, g7t.m124730c(GiftWallV3GiftWeekStarHallMainDetail.class, "giftWallV3WeekStarHaleMainDetail"));
    }

    /* JADX INFO: renamed from: f */
    public static C22306c<GiftWallV3GiftWeekStarGiftMainDetail> m196815f(String str, String str2, long j) {
        cll.C16188a c16188aM107524p = LiveApiBuilder.m67315u(ytr.m216073b("/live-gift/gift-wall-v3/users/" + str + "/weekStarGifts/" + str2 + "/mainDetail"), new mt0[0]).m107524p();
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("");
        return upv.m194934v(c16188aM107524p.m107536c("currentTime", sb.toString()).m107537d(), "requestWeekStarGiftData" + str + str2, g7t.m124730c(GiftWallV3GiftWeekStarGiftMainDetail.class, "giftWallV3WeekStarGiftMainDetail"));
    }
}
