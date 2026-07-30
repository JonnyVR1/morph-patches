package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class h910 extends nw40 {

    /* JADX INFO: renamed from: m */
    public final String f108294m;

    /* JADX INFO: renamed from: n */
    public final boolean f108295n;

    /* JADX INFO: renamed from: o */
    public int f108296o;

    public h910(String str, String str2, String str3, String str4, String str5, BLiveVideoQualityConf bLiveVideoQualityConf, BLiveRtcToken bLiveRtcToken, String str6, boolean z) {
        super(str, str2, str3, str4, str5, bLiveVideoQualityConf, bLiveRtcToken.canMaintain);
        this.f48638f = bLiveRtcToken.appId;
        this.f48639g = bLiveRtcToken.channelKey;
        this.f48640h = bLiveRtcToken.channel;
        this.f48636d = bLiveRtcToken.rtcProvider;
        this.f48641i = bLiveRtcToken.userSig;
        this.f108296o = bLiveRtcToken.bitrate;
        this.f108295n = z;
        this.f108294m = str6;
    }

    @Override // p153l.nw40, com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo73071a() {
        return MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR;
    }
}
