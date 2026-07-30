package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class jz3 extends zn40 {

    /* JADX INFO: renamed from: m */
    public final f30<Integer, Object> f120348m;

    public jz3(String str, String str2, String str3, String str4, String str5, BLiveVideoQualityConf bLiveVideoQualityConf, BLiveRtcToken bLiveRtcToken, f30<Integer, Object> f30Var) {
        super(str, str2, str3, str4, str5, bLiveVideoQualityConf, false);
        this.f47790f = bLiveRtcToken.appId;
        this.f47791g = bLiveRtcToken.channelKey;
        this.f47792h = bLiveRtcToken.channel;
        this.f120348m = f30Var;
        this.f47788d = bLiveRtcToken.rtcProvider;
        this.f47793i = bLiveRtcToken.userSig;
    }

    @Override // p149l.zn40, com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo71888a() {
        return MotionParams.PusherMotionEnum.MOTION_CALL_ANCHOR;
    }

    @Override // p149l.zn40
    public String toString() {
        return "CallAnchorMotionParams{, rtcProvider='" + this.f47788d + "', userSig='" + this.f47793i + "', action2=" + this.f120348m + ", videoQualityConf=" + this.f203958j + ", roomId='" + this.f47785a + "', provider='" + this.f47786b + "', businessType='" + this.f47787c + "'}";
    }
}
