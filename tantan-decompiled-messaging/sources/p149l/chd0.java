package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class chd0 extends zn40 {

    /* JADX INFO: renamed from: m */
    public final f30<Integer, Object> f80863m;

    public chd0(String str, String str2, String str3, String str4, String str5, BLiveVideoQualityConf bLiveVideoQualityConf, BLiveRtcToken bLiveRtcToken, f30<Integer, Object> f30Var) {
        super(str, str2, str3, str4, str5, bLiveVideoQualityConf, bLiveRtcToken.canMaintain);
        this.f47790f = bLiveRtcToken.appId;
        this.f47791g = bLiveRtcToken.channelKey;
        this.f47792h = bLiveRtcToken.channel;
        this.f47788d = bLiveRtcToken.rtcProvider;
        this.f47793i = bLiveRtcToken.userSig;
        this.f80863m = f30Var;
    }

    @Override // p149l.zn40, com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo71888a() {
        return MotionParams.PusherMotionEnum.MOTION_NORMAL;
    }

    @Override // p149l.zn40
    public String toString() {
        return "RtcNormalMotionParams{appId='" + this.f47790f + "', channelKey='" + this.f47791g + "', channelId='" + this.f47792h + "', rtcProvider='" + this.f47788d + "', userSig='" + this.f47793i + "', action2=" + this.f80863m + ", videoQualityConf=" + this.f203958j + ", pushUrl='" + this.f203960l + "', roomId='" + this.f47785a + "', provider='" + this.f47786b + "', businessType='" + this.f47787c + "'}";
    }
}
