package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class k080 extends zn40 {

    /* JADX INFO: renamed from: m */
    public final String f120458m;

    /* JADX INFO: renamed from: n */
    public final String f120459n;

    /* JADX INFO: renamed from: o */
    public final int f120460o;

    /* JADX INFO: renamed from: p */
    public f30<Integer, Object> f120461p;

    public k080(String str, String str2, String str3, String str4, String str5, BLiveVideoQualityConf bLiveVideoQualityConf, BLiveRtcToken bLiveRtcToken, String str6, String str7, int i, f30<Integer, Object> f30Var) {
        super(str, str2, str3, str4, str5, bLiveVideoQualityConf, bLiveRtcToken.canMaintain);
        this.f47790f = bLiveRtcToken.appId;
        this.f47791g = bLiveRtcToken.channelKey;
        this.f47792h = bLiveRtcToken.channel;
        this.f47788d = bLiveRtcToken.rtcProvider;
        this.f47793i = bLiveRtcToken.userSig;
        this.f120461p = f30Var;
        this.f120458m = str6;
        this.f120459n = str7;
        this.f120460o = i;
    }

    @Override // p149l.zn40, com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo71888a() {
        return MotionParams.PusherMotionEnum.MOTION_PK;
    }

    @Override // p149l.zn40
    public String toString() {
        return super.toString() + ": roomId: " + this.f47785a + " rtcProvider: " + this.f47788d + " provider: " + this.f47786b + " bussinessType: " + this.f47787c;
    }
}
