package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceSongGameMessage;

/* JADX INFO: loaded from: classes4.dex */
public class mto0 extends jk2<LongLinkLiveMessage.VoiceSongGameStatusNotice, VoiceSongGameMessage> {
    public mto0(wbg0<VoiceSongGameMessage, VoiceSongGameMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.VoiceSongGameStatusNotice voiceSongGameStatusNotice, String str) {
        return true;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.VoiceSongGameStatusNotice voiceSongGameStatusNotice, String str2) {
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.gameId = voiceSongGameStatusNotice.getGameId();
        return m159458o(str, voiceSongGameStatusNotice.getTempdata().getId(), null, null, voiceSongGameStatusNotice.getTempdata(), extInfo);
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public VoiceSongGameMessage mo95993z(String str, LongLinkLiveMessage.VoiceSongGameStatusNotice voiceSongGameStatusNotice) {
        return new VoiceSongGameMessage(voiceSongGameStatusNotice);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceSongGameStatusNotice> mo95510b() {
        return LongLinkLiveMessage.VoiceSongGameStatusNotice.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.game.voiceSongGameStatusNotice";
    }
}
