package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.voiceGrabHat;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGrabHatCP;

/* JADX INFO: loaded from: classes4.dex */
public class e5k extends bk2<voiceGrabHat.VoiceGrabHatCp, BLiveVoiceGrabHatCP> {
    public e5k(p3g0<BLiveVoiceGrabHatCP, BLiveVoiceGrabHatCP> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(voiceGrabHat.VoiceGrabHatCp voiceGrabHatCp, String str) {
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceGrabHatCP mo94461z(String str, voiceGrabHat.VoiceGrabHatCp voiceGrabHatCp) {
        BLiveVoiceGrabHatCP bLiveVoiceGrabHatCPNew_ = BLiveVoiceGrabHatCP.new_();
        bLiveVoiceGrabHatCPNew_.f44499id = voiceGrabHatCp.getId();
        bLiveVoiceGrabHatCPNew_.otherUserId = voiceGrabHatCp.getOtherUserId();
        bLiveVoiceGrabHatCPNew_.userId = voiceGrabHatCp.getId();
        bLiveVoiceGrabHatCPNew_.userMask = rxn0.m181617a(voiceGrabHatCp.getUserMask());
        bLiveVoiceGrabHatCPNew_.lovePoint = voiceGrabHatCp.getLovePoint();
        bLiveVoiceGrabHatCPNew_.otherUserMask = rxn0.m181617a(voiceGrabHatCp.getOtherUserMask());
        bLiveVoiceGrabHatCPNew_.hatUrl = voiceGrabHatCp.getHatUrl();
        return bLiveVoiceGrabHatCPNew_;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<voiceGrabHat.VoiceGrabHatCp> mo94398b() {
        return voiceGrabHat.VoiceGrabHatCp.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voice.grabHat.cp";
    }
}
