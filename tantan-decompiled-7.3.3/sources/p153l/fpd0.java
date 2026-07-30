package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class fpd0 extends nw40 {

    /* JADX INFO: renamed from: m */
    public final z20<Integer, Object> f100125m;

    public fpd0(String str, String str2, String str3, String str4, String str5, BLiveVideoQualityConf bLiveVideoQualityConf, BLiveRtcToken bLiveRtcToken, z20<Integer, Object> z20Var) {
        super(str, str2, str3, str4, str5, bLiveVideoQualityConf, bLiveRtcToken.canMaintain);
        this.f48638f = bLiveRtcToken.appId;
        this.f48639g = bLiveRtcToken.channelKey;
        this.f48640h = bLiveRtcToken.channel;
        this.f48636d = bLiveRtcToken.rtcProvider;
        this.f48641i = bLiveRtcToken.userSig;
        this.f100125m = z20Var;
    }

    @Override // p153l.nw40, com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo73071a() {
        return MotionParams.PusherMotionEnum.MOTION_NORMAL;
    }

    @Override // p153l.nw40
    public String toString() {
        return "RtcNormalMotionParams{appId='" + this.f48638f + "', channelKey='" + this.f48639g + "', channelId='" + this.f48640h + "', rtcProvider='" + this.f48636d + "', userSig='" + this.f48641i + "', action2=" + this.f100125m + ", videoQualityConf=" + this.f143913j + ", pushUrl='" + this.f143915l + "', roomId='" + this.f48633a + "', provider='" + this.f48634b + "', businessType='" + this.f48635c + "'}";
    }
}
