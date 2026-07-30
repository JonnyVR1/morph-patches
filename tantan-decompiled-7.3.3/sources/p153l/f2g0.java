package p153l;

import com.p051p1.mobile.longlink.msg.live.leaderboard.LongLinkLeaderboard;

/* JADX INFO: loaded from: classes4.dex */
public class f2g0 extends jk2<LongLinkLeaderboard.GiftStarLeaderboardChangeMessage, LongLinkLeaderboard.GiftStarLeaderboardChangeMessage> {
    public f2g0(wbg0<LongLinkLeaderboard.GiftStarLeaderboardChangeMessage, LongLinkLeaderboard.GiftStarLeaderboardChangeMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLeaderboard.GiftStarLeaderboardChangeMessage giftStarLeaderboardChangeMessage, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLeaderboard.GiftStarLeaderboardChangeMessage> mo95510b() {
        return LongLinkLeaderboard.GiftStarLeaderboardChangeMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.leaderboard.giftstar";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLeaderboard.GiftStarLeaderboardChangeMessage mo95993z(String str, LongLinkLeaderboard.GiftStarLeaderboardChangeMessage giftStarLeaderboardChangeMessage) {
        return giftStarLeaderboardChangeMessage;
    }
}
