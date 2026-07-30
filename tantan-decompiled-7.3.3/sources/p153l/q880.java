package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class q880 extends nw40 {

    /* JADX INFO: renamed from: m */
    public final String f156081m;

    /* JADX INFO: renamed from: n */
    public final String f156082n;

    /* JADX INFO: renamed from: o */
    public final int f156083o;

    /* JADX INFO: renamed from: p */
    public z20<Integer, Object> f156084p;

    public q880(String str, String str2, String str3, String str4, String str5, BLiveVideoQualityConf bLiveVideoQualityConf, BLiveRtcToken bLiveRtcToken, String str6, String str7, int i, z20<Integer, Object> z20Var) {
        super(str, str2, str3, str4, str5, bLiveVideoQualityConf, bLiveRtcToken.canMaintain);
        this.f48638f = bLiveRtcToken.appId;
        this.f48639g = bLiveRtcToken.channelKey;
        this.f48640h = bLiveRtcToken.channel;
        this.f48636d = bLiveRtcToken.rtcProvider;
        this.f48641i = bLiveRtcToken.userSig;
        this.f156084p = z20Var;
        this.f156081m = str6;
        this.f156082n = str7;
        this.f156083o = i;
    }

    @Override // p153l.nw40, com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo73071a() {
        return MotionParams.PusherMotionEnum.MOTION_PK;
    }

    @Override // p153l.nw40
    public String toString() {
        return super.toString() + ": roomId: " + this.f48633a + " rtcProvider: " + this.f48636d + " provider: " + this.f48634b + " bussinessType: " + this.f48635c;
    }
}
