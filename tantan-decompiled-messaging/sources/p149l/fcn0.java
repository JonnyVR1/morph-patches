package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.voiceGrabHat;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCallHatInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class fcn0 extends bk2<voiceGrabHat.VoiceGrabHat, BLiveVoiceGrabHatGame> {
    public fcn0(p3g0<BLiveVoiceGrabHatGame, BLiveVoiceGrabHatGame> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m120453B(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame, voiceGrabHat.VoiceGrabHat.CallHatInfo callHatInfo) {
        BLiveVoiceCallHatInfo bLiveVoiceCallHatInfoNew_ = BLiveVoiceCallHatInfo.new_();
        bLiveVoiceCallHatInfoNew_.point = callHatInfo.getPoint();
        bLiveVoiceCallHatInfoNew_.hatUrl = callHatInfo.getHatUrl();
        bLiveVoiceCallHatInfoNew_.userId = callHatInfo.getUserId();
        bLiveVoiceGrabHatGame.callHatInfo.add(bLiveVoiceCallHatInfoNew_);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(voiceGrabHat.VoiceGrabHat voiceGrabHat, String str) {
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceGrabHatGame mo94461z(String str, voiceGrabHat.VoiceGrabHat voiceGrabHat) {
        final BLiveVoiceGrabHatGame bLiveVoiceGrabHatGameNew_ = BLiveVoiceGrabHatGame.new_();
        bLiveVoiceGrabHatGameNew_.f44500id = voiceGrabHat.getId();
        bLiveVoiceGrabHatGameNew_.liveId = voiceGrabHat.getLiveId();
        bLiveVoiceGrabHatGameNew_.status = voiceGrabHat.getStatus();
        bLiveVoiceGrabHatGameNew_.toast = voiceGrabHat.getToast();
        bLiveVoiceGrabHatGameNew_.callHatInfo = new ArrayList();
        vwb.m200354z(voiceGrabHat.getCallHatInfosList(), new e30() { // from class: l.ecn0
            @Override // p149l.e30
            public final void call(Object obj) {
                fcn0.m120453B(bLiveVoiceGrabHatGameNew_, (voiceGrabHat.VoiceGrabHat.CallHatInfo) obj);
            }
        });
        bLiveVoiceGrabHatGameNew_.updateTime = voiceGrabHat.getUpdatedTime();
        bLiveVoiceGrabHatGameNew_.toJson();
        return bLiveVoiceGrabHatGameNew_;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<voiceGrabHat.VoiceGrabHat> mo94398b() {
        return voiceGrabHat.VoiceGrabHat.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voice.grabHat";
    }
}
