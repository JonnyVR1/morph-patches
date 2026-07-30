package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class k080 extends zn40 {

    /* JADX INFO: renamed from: m */
    public final String f14157m;

    /* JADX INFO: renamed from: n */
    public final String f14158n;

    /* JADX INFO: renamed from: o */
    public final int f14159o;

    /* JADX INFO: renamed from: p */
    public f30<Integer, Object> f14160p;

    public k080(String str, String str2, String str3, String str4, String str5, BLiveVideoQualityConf bLiveVideoQualityConf, BLiveRtcToken bLiveRtcToken, String str6, String str7, int i, f30<Integer, Object> f30Var) {
        super(str, str2, str3, str4, str5, bLiveVideoQualityConf, bLiveRtcToken.canMaintain);
        this.f3832f = bLiveRtcToken.appId;
        this.f3833g = bLiveRtcToken.channelKey;
        this.f3834h = bLiveRtcToken.channel;
        this.f3830d = bLiveRtcToken.rtcProvider;
        this.f3835i = bLiveRtcToken.userSig;
        this.f14160p = f30Var;
        this.f14157m = str6;
        this.f14158n = str7;
        this.f14159o = i;
    }

    @Override // p002l.zn40, com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo5266a() {
        return MotionParams.PusherMotionEnum.MOTION_PK;
    }

    @Override // p002l.zn40
    public String toString() {
        return super.toString() + ": roomId: " + this.f3827a + " rtcProvider: " + this.f3830d + " provider: " + this.f3828b + " bussinessType: " + this.f3829c;
    }
}
