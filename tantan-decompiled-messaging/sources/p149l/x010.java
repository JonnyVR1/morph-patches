package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class x010 extends zn40 {

    /* JADX INFO: renamed from: m */
    public final String f188904m;

    /* JADX INFO: renamed from: n */
    public final boolean f188905n;

    /* JADX INFO: renamed from: o */
    public int f188906o;

    public x010(String str, String str2, String str3, String str4, String str5, BLiveVideoQualityConf bLiveVideoQualityConf, BLiveRtcToken bLiveRtcToken, String str6, boolean z) {
        super(str, str2, str3, str4, str5, bLiveVideoQualityConf, bLiveRtcToken.canMaintain);
        this.f47790f = bLiveRtcToken.appId;
        this.f47791g = bLiveRtcToken.channelKey;
        this.f47792h = bLiveRtcToken.channel;
        this.f47788d = bLiveRtcToken.rtcProvider;
        this.f47793i = bLiveRtcToken.userSig;
        this.f188906o = bLiveRtcToken.bitrate;
        this.f188905n = z;
        this.f188904m = str6;
    }

    @Override // p149l.zn40, com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo71888a() {
        return MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR;
    }
}
