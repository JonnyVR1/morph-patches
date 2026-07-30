package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class hzu extends jk2<LongLinkLiveMessage.RefreshVoiceRoomLeaderboard, LongLinkLiveMessage.RefreshVoiceRoomLeaderboard> {
    public hzu(wbg0<LongLinkLiveMessage.RefreshVoiceRoomLeaderboard, LongLinkLiveMessage.RefreshVoiceRoomLeaderboard> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.RefreshVoiceRoomLeaderboard refreshVoiceRoomLeaderboard, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.RefreshVoiceRoomLeaderboard> mo95510b() {
        return LongLinkLiveMessage.RefreshVoiceRoomLeaderboard.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voice.leaderboard.refresh";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.RefreshVoiceRoomLeaderboard mo95993z(String str, LongLinkLiveMessage.RefreshVoiceRoomLeaderboard refreshVoiceRoomLeaderboard) {
        return refreshVoiceRoomLeaderboard;
    }
}
