package p002l;

import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class g0t extends bk2<LongLinkGiftMessage.LiveLeaderboardMessage, LongLinkGiftMessage.LiveLeaderboardMessage> {
    public g0t(p3g0<LongLinkGiftMessage.LiveLeaderboardMessage, LongLinkGiftMessage.LiveLeaderboardMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkGiftMessage.LiveLeaderboardMessage liveLeaderboardMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveLeaderboardMessage> mo9244b() {
        return LongLinkGiftMessage.LiveLeaderboardMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.gift.leaderboard";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkGiftMessage.LiveLeaderboardMessage mo9251z(String str, LongLinkGiftMessage.LiveLeaderboardMessage liveLeaderboardMessage) {
        return liveLeaderboardMessage;
    }
}
