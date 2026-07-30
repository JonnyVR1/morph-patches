package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p1.mobile.putong.live.base.data.BLiveVideoQualityConf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x010 extends zn40 {

    /* JADX INFO: renamed from: m */
    public final String f22058m;

    /* JADX INFO: renamed from: n */
    public final boolean f22059n;

    /* JADX INFO: renamed from: o */
    public int f22060o;

    public x010(String str, String str2, String str3, String str4, String str5, BLiveVideoQualityConf bLiveVideoQualityConf, BLiveRtcToken bLiveRtcToken, String str6, boolean z) {
        super(str, str2, str3, str4, str5, bLiveVideoQualityConf, bLiveRtcToken.canMaintain);
        this.f3832f = bLiveRtcToken.appId;
        this.f3833g = bLiveRtcToken.channelKey;
        this.f3834h = bLiveRtcToken.channel;
        this.f3830d = bLiveRtcToken.rtcProvider;
        this.f3835i = bLiveRtcToken.userSig;
        this.f22060o = bLiveRtcToken.bitrate;
        this.f22059n = z;
        this.f22058m = str6;
    }

    @Override // p002l.zn40, com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo5266a() {
        return MotionParams.PusherMotionEnum.MOTION_MULTI_CALL_ANCHOR;
    }
}
