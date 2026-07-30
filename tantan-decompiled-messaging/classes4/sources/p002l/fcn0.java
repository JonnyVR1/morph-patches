package p002l;

import com.p1.mobile.longlink.msg.liveroom.voiceGrabHat;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCallHatInfo;
import com.p1.mobile.putong.live.base.data.BLiveVoiceGrabHatGame;
import java.util.ArrayList;
import l.e30;
import l.p3g0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fcn0 extends bk2<voiceGrabHat.VoiceGrabHat, BLiveVoiceGrabHatGame> {
    public fcn0(p3g0<BLiveVoiceGrabHatGame, BLiveVoiceGrabHatGame> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m13050B(BLiveVoiceGrabHatGame bLiveVoiceGrabHatGame, voiceGrabHat.VoiceGrabHat.CallHatInfo callHatInfo) {
        BLiveVoiceCallHatInfo bLiveVoiceCallHatInfoNew_ = BLiveVoiceCallHatInfo.new_();
        bLiveVoiceCallHatInfoNew_.point = callHatInfo.getPoint();
        bLiveVoiceCallHatInfoNew_.hatUrl = callHatInfo.getHatUrl();
        bLiveVoiceCallHatInfoNew_.userId = callHatInfo.getUserId();
        bLiveVoiceGrabHatGame.callHatInfo.add(bLiveVoiceCallHatInfoNew_);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(voiceGrabHat.VoiceGrabHat voiceGrabHat, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceGrabHatGame mo9251z(String str, voiceGrabHat.VoiceGrabHat voiceGrabHat) {
        final BLiveVoiceGrabHatGame bLiveVoiceGrabHatGameNew_ = BLiveVoiceGrabHatGame.new_();
        bLiveVoiceGrabHatGameNew_.id = voiceGrabHat.getId();
        bLiveVoiceGrabHatGameNew_.liveId = voiceGrabHat.getLiveId();
        bLiveVoiceGrabHatGameNew_.status = voiceGrabHat.getStatus();
        bLiveVoiceGrabHatGameNew_.toast = voiceGrabHat.getToast();
        bLiveVoiceGrabHatGameNew_.callHatInfo = new ArrayList();
        vwb.z(voiceGrabHat.getCallHatInfosList(), new e30() { // from class: l.ecn0
            public final void call(Object obj) {
                fcn0.m13050B(bLiveVoiceGrabHatGameNew_, (voiceGrabHat.VoiceGrabHat.CallHatInfo) obj);
            }
        });
        bLiveVoiceGrabHatGameNew_.updateTime = voiceGrabHat.getUpdatedTime();
        bLiveVoiceGrabHatGameNew_.toJson();
        return bLiveVoiceGrabHatGameNew_;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<voiceGrabHat.VoiceGrabHat> mo9244b() {
        return voiceGrabHat.VoiceGrabHat.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voice.grabHat";
    }
}
