package p153l;

import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarGiftMainDetail;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3GiftWeekStarHallMainDetail;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3MainDetail;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.GiftWallV3Tab;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class zbo0 {
    /* JADX INFO: renamed from: a */
    public static C22421c<GiftWallV3Tab> m219201a(String str) {
        return vrv.m202561v(LiveApiBuilder.m68498u(str, new st0[0]), "loadNextPageGifts" + str, h9t.m134086c(GiftWallV3Tab.class, "giftWallV3Tab"));
    }

    /* JADX INFO: renamed from: b */
    public static C22421c<GiftWallV3MainDetail> m219202b(String str) {
        return vrv.m202561v(LiveApiBuilder.m68498u(zvr.m221802b("/live-gift/gift-wall-v3/users/" + str + "/mainDetail"), new st0[0]), "requestGiftWallV3MainDetail" + str, h9t.m134086c(GiftWallV3MainDetail.class, "giftWallV3MainDetail"));
    }

    /* JADX INFO: renamed from: c */
    public static C22421c<GiftWallV3Tab> m219203c(String str, String str2, String str3) {
        return vrv.m202561v(LiveApiBuilder.m68498u(zvr.m221802b("/live-gift/gift-wall-v3/users/" + str + "/tabs/" + str2), new st0[0]).m182288p().m182300c("sortRule", str3).m182301d(), "requestGifts" + str + str2 + str3, h9t.m134086c(GiftWallV3Tab.class, "giftWallV3Tab"));
    }

    /* JADX INFO: renamed from: d */
    public static C22421c<GiftWallV3GiftWeekStarGiftMainDetail> m219204d(String str, String str2) {
        return vrv.m202561v(LiveApiBuilder.m68498u(zvr.m221802b("/live-gift/gift-wall-v3/users/" + str + "/gifts/" + str2 + "/mainDetail"), new st0[0]), "requestWallGiftDetail" + str + str2, h9t.m134086c(GiftWallV3GiftWeekStarGiftMainDetail.class, "giftWallV3GiftMainDetail"));
    }

    /* JADX INFO: renamed from: e */
    public static C22421c<GiftWallV3GiftWeekStarHallMainDetail> m219205e(String str) {
        return vrv.m202561v(LiveApiBuilder.m68498u(zvr.m221802b("/live-gift/gift-wall-v3/users/" + str + "/weekStarHaleMainDetail"), new st0[0]), "requestWeekStarData" + str, h9t.m134086c(GiftWallV3GiftWeekStarHallMainDetail.class, "giftWallV3WeekStarHaleMainDetail"));
    }

    /* JADX INFO: renamed from: f */
    public static C22421c<GiftWallV3GiftWeekStarGiftMainDetail> m219206f(String str, String str2, long j) {
        rnl.C19886a c19886aM182288p = LiveApiBuilder.m68498u(zvr.m221802b("/live-gift/gift-wall-v3/users/" + str + "/weekStarGifts/" + str2 + "/mainDetail"), new st0[0]).m182288p();
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("");
        return vrv.m202561v(c19886aM182288p.m182300c("currentTime", sb.toString()).m182301d(), "requestWeekStarGiftData" + str + str2, h9t.m134086c(GiftWallV3GiftWeekStarGiftMainDetail.class, "giftWallV3WeekStarGiftMainDetail"));
    }
}
