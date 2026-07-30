package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class gxu extends bk2<LongLinkLiveMessage.RefreshVoiceRoomLeaderboard, LongLinkLiveMessage.RefreshVoiceRoomLeaderboard> {
    public gxu(p3g0<LongLinkLiveMessage.RefreshVoiceRoomLeaderboard, LongLinkLiveMessage.RefreshVoiceRoomLeaderboard> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.RefreshVoiceRoomLeaderboard refreshVoiceRoomLeaderboard, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.RefreshVoiceRoomLeaderboard> mo94398b() {
        return LongLinkLiveMessage.RefreshVoiceRoomLeaderboard.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voice.leaderboard.refresh";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.RefreshVoiceRoomLeaderboard mo94461z(String str, LongLinkLiveMessage.RefreshVoiceRoomLeaderboard refreshVoiceRoomLeaderboard) {
        return refreshVoiceRoomLeaderboard;
    }
}
