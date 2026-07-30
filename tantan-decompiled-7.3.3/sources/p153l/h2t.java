package p153l;

import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;

/* JADX INFO: loaded from: classes4.dex */
public class h2t extends jk2<LongLinkGiftMessage.LiveLeaderboardMessage, LongLinkGiftMessage.LiveLeaderboardMessage> {
    public h2t(wbg0<LongLinkGiftMessage.LiveLeaderboardMessage, LongLinkGiftMessage.LiveLeaderboardMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkGiftMessage.LiveLeaderboardMessage liveLeaderboardMessage, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveLeaderboardMessage> mo95510b() {
        return LongLinkGiftMessage.LiveLeaderboardMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.gift.leaderboard";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkGiftMessage.LiveLeaderboardMessage mo95993z(String str, LongLinkGiftMessage.LiveLeaderboardMessage liveLeaderboardMessage) {
        return liveLeaderboardMessage;
    }
}
