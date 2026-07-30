package p002l;

import com.p1.mobile.longlink.msg.liveroom.voiceGrabHat;
import com.p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP;
import l.p3g0;
import l.rxn0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class e5k extends bk2<voiceGrabHat.VoiceGrabHatCp, BLiveVoiceGrabHatCP> {
    public e5k(p3g0<BLiveVoiceGrabHatCP, BLiveVoiceGrabHatCP> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(voiceGrabHat.VoiceGrabHatCp voiceGrabHatCp, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceGrabHatCP mo9251z(String str, voiceGrabHat.VoiceGrabHatCp voiceGrabHatCp) {
        BLiveVoiceGrabHatCP bLiveVoiceGrabHatCPNew_ = BLiveVoiceGrabHatCP.new_();
        bLiveVoiceGrabHatCPNew_.id = voiceGrabHatCp.getId();
        bLiveVoiceGrabHatCPNew_.otherUserId = voiceGrabHatCp.getOtherUserId();
        bLiveVoiceGrabHatCPNew_.userId = voiceGrabHatCp.getId();
        bLiveVoiceGrabHatCPNew_.userMask = rxn0.a(voiceGrabHatCp.getUserMask());
        bLiveVoiceGrabHatCPNew_.lovePoint = voiceGrabHatCp.getLovePoint();
        bLiveVoiceGrabHatCPNew_.otherUserMask = rxn0.a(voiceGrabHatCp.getOtherUserMask());
        bLiveVoiceGrabHatCPNew_.hatUrl = voiceGrabHatCp.getHatUrl();
        return bLiveVoiceGrabHatCPNew_;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<voiceGrabHat.VoiceGrabHatCp> mo9244b() {
        return voiceGrabHat.VoiceGrabHatCp.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voice.grabHat.cp";
    }
}
