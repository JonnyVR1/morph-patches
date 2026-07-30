package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.voiceGrabHat;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallHatInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class jln0 extends jk2<voiceGrabHat.VoiceGrabHat, BLiveVoiceGrabHatGame> {
    public jln0(wbg0<BLiveVoiceGrabHatGame, BLiveVoiceGrabHatGame> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m146097B(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame, voiceGrabHat.VoiceGrabHat.CallHatInfo callHatInfo) {
        BLiveVoiceCallHatInfo bLiveVoiceCallHatInfoNew_ = BLiveVoiceCallHatInfo.new_();
        bLiveVoiceCallHatInfoNew_.point = callHatInfo.getPoint();
        bLiveVoiceCallHatInfoNew_.hatUrl = callHatInfo.getHatUrl();
        bLiveVoiceCallHatInfoNew_.userId = callHatInfo.getUserId();
        bLiveVoiceGrabHatGame.callHatInfo.add(bLiveVoiceCallHatInfoNew_);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(voiceGrabHat.VoiceGrabHat voiceGrabHat, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceGrabHatGame mo95993z(String str, voiceGrabHat.VoiceGrabHat voiceGrabHat) {
        final BLiveVoiceGrabHatGame bLiveVoiceGrabHatGameNew_ = BLiveVoiceGrabHatGame.new_();
        bLiveVoiceGrabHatGameNew_.f45348id = voiceGrabHat.getId();
        bLiveVoiceGrabHatGameNew_.liveId = voiceGrabHat.getLiveId();
        bLiveVoiceGrabHatGameNew_.status = voiceGrabHat.getStatus();
        bLiveVoiceGrabHatGameNew_.toast = voiceGrabHat.getToast();
        bLiveVoiceGrabHatGameNew_.callHatInfo = new ArrayList();
        jyb.m147537z(voiceGrabHat.getCallHatInfosList(), new y20() { // from class: l.iln0
            @Override // p153l.y20
            public final void call(Object obj) {
                jln0.m146097B(bLiveVoiceGrabHatGameNew_, (voiceGrabHat.VoiceGrabHat.CallHatInfo) obj);
            }
        });
        bLiveVoiceGrabHatGameNew_.updateTime = voiceGrabHat.getUpdatedTime();
        bLiveVoiceGrabHatGameNew_.toJson();
        return bLiveVoiceGrabHatGameNew_;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<voiceGrabHat.VoiceGrabHat> mo95510b() {
        return voiceGrabHat.VoiceGrabHat.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voice.grabHat";
    }
}
