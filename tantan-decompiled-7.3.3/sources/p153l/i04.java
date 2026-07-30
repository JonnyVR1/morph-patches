package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class i04 extends nw40 {

    /* JADX INFO: renamed from: m */
    public final z20<Integer, Object> f112328m;

    public i04(String str, String str2, String str3, String str4, String str5, BLiveVideoQualityConf bLiveVideoQualityConf, BLiveRtcToken bLiveRtcToken, z20<Integer, Object> z20Var) {
        super(str, str2, str3, str4, str5, bLiveVideoQualityConf, false);
        this.f48638f = bLiveRtcToken.appId;
        this.f48639g = bLiveRtcToken.channelKey;
        this.f48640h = bLiveRtcToken.channel;
        this.f112328m = z20Var;
        this.f48636d = bLiveRtcToken.rtcProvider;
        this.f48641i = bLiveRtcToken.userSig;
    }

    @Override // p153l.nw40, com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo73071a() {
        return MotionParams.PusherMotionEnum.MOTION_CALL_ANCHOR;
    }

    @Override // p153l.nw40
    public String toString() {
        return "CallAnchorMotionParams{, rtcProvider='" + this.f48636d + "', userSig='" + this.f48641i + "', action2=" + this.f112328m + ", videoQualityConf=" + this.f143913j + ", roomId='" + this.f48633a + "', provider='" + this.f48634b + "', businessType='" + this.f48635c + "'}";
    }
}
