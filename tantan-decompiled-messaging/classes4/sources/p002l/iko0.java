package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceSongGameMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class iko0 extends bk2<LongLinkLiveMessage.VoiceSongGameStatusNotice, VoiceSongGameMessage> {
    public iko0(p3g0<VoiceSongGameMessage, VoiceSongGameMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.VoiceSongGameStatusNotice voiceSongGameStatusNotice, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkLiveMessage.VoiceSongGameStatusNotice voiceSongGameStatusNotice, String str2) {
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.gameId = voiceSongGameStatusNotice.getGameId();
        return m24093o(str, voiceSongGameStatusNotice.getTempdata().getId(), null, null, voiceSongGameStatusNotice.getTempdata(), extInfo);
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public VoiceSongGameMessage mo9251z(String str, LongLinkLiveMessage.VoiceSongGameStatusNotice voiceSongGameStatusNotice) {
        return new VoiceSongGameMessage(voiceSongGameStatusNotice);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceSongGameStatusNotice> mo9244b() {
        return LongLinkLiveMessage.VoiceSongGameStatusNotice.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.game.voiceSongGameStatusNotice";
    }
}
