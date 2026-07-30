package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class chd0 extends zn40 {

    /* JADX INFO: renamed from: m */
    public final f30<Integer, Object> f8672m;

    public chd0(String str, String str2, String str3, String str4, String str5, BLiveVideoQualityConf bLiveVideoQualityConf, BLiveRtcToken bLiveRtcToken, f30<Integer, Object> f30Var) {
        super(str, str2, str3, str4, str5, bLiveVideoQualityConf, bLiveRtcToken.canMaintain);
        this.f3832f = bLiveRtcToken.appId;
        this.f3833g = bLiveRtcToken.channelKey;
        this.f3834h = bLiveRtcToken.channel;
        this.f3830d = bLiveRtcToken.rtcProvider;
        this.f3835i = bLiveRtcToken.userSig;
        this.f8672m = f30Var;
    }

    @Override // p002l.zn40, com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo5266a() {
        return MotionParams.PusherMotionEnum.MOTION_NORMAL;
    }

    @Override // p002l.zn40
    public String toString() {
        return "RtcNormalMotionParams{appId='" + this.f3832f + "', channelKey='" + this.f3833g + "', channelId='" + this.f3834h + "', rtcProvider='" + this.f3830d + "', userSig='" + this.f3835i + "', action2=" + this.f8672m + ", videoQualityConf=" + this.f23515j + ", pushUrl='" + this.f23517l + "', roomId='" + this.f3827a + "', provider='" + this.f3828b + "', businessType='" + this.f3829c + "'}";
    }
}
