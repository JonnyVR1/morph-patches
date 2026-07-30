package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceSongGameMessage;

/* JADX INFO: loaded from: classes4.dex */
public class nto0 extends jk2<LongLinkLiveMessage.VoiceSongGameUserNotice, VoiceSongGameMessage> {
    public nto0(wbg0<VoiceSongGameMessage, VoiceSongGameMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.VoiceSongGameUserNotice voiceSongGameUserNotice, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceSongGameMessage mo95993z(String str, LongLinkLiveMessage.VoiceSongGameUserNotice voiceSongGameUserNotice) {
        return new VoiceSongGameMessage(voiceSongGameUserNotice);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceSongGameUserNotice> mo95510b() {
        return LongLinkLiveMessage.VoiceSongGameUserNotice.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.game.voiceSongGameUserNotice";
    }
}
