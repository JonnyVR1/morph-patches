package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.voiceGrabHat;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP;

/* JADX INFO: loaded from: classes4.dex */
public class w7k extends jk2<voiceGrabHat.VoiceGrabHatCp, BLiveVoiceGrabHatCP> {
    public w7k(wbg0<BLiveVoiceGrabHatCP, BLiveVoiceGrabHatCP> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(voiceGrabHat.VoiceGrabHatCp voiceGrabHatCp, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceGrabHatCP mo95993z(String str, voiceGrabHat.VoiceGrabHatCp voiceGrabHatCp) {
        BLiveVoiceGrabHatCP bLiveVoiceGrabHatCPNew_ = BLiveVoiceGrabHatCP.new_();
        bLiveVoiceGrabHatCPNew_.f45347id = voiceGrabHatCp.getId();
        bLiveVoiceGrabHatCPNew_.otherUserId = voiceGrabHatCp.getOtherUserId();
        bLiveVoiceGrabHatCPNew_.userId = voiceGrabHatCp.getId();
        bLiveVoiceGrabHatCPNew_.userMask = v6o0.m200134a(voiceGrabHatCp.getUserMask());
        bLiveVoiceGrabHatCPNew_.lovePoint = voiceGrabHatCp.getLovePoint();
        bLiveVoiceGrabHatCPNew_.otherUserMask = v6o0.m200134a(voiceGrabHatCp.getOtherUserMask());
        bLiveVoiceGrabHatCPNew_.hatUrl = voiceGrabHatCp.getHatUrl();
        return bLiveVoiceGrabHatCPNew_;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<voiceGrabHat.VoiceGrabHatCp> mo95510b() {
        return voiceGrabHat.VoiceGrabHatCp.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voice.grabHat.cp";
    }
}
