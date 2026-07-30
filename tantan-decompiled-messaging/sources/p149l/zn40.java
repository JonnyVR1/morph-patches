package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class zn40 extends MotionParams {

    /* JADX INFO: renamed from: j */
    public final BLiveVideoQualityConf f203958j;

    /* JADX INFO: renamed from: k */
    public final String f203959k;

    /* JADX INFO: renamed from: l */
    public String f203960l;

    public zn40(String str, String str2, String str3, String str4, String str5, BLiveVideoQualityConf bLiveVideoQualityConf, boolean z) {
        super(str3, str4, str5);
        this.f203960l = str;
        this.f203959k = str2;
        this.f203958j = bLiveVideoQualityConf;
        this.f47789e = z;
    }

    /* JADX INFO: renamed from: b */
    public static zn40 m219447b(String str, String str2, String str3, String str4, String str5, BLiveVideoQualityConf bLiveVideoQualityConf) {
        return new zn40(str, str2, str3, str4, str5, bLiveVideoQualityConf, true);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo71888a() {
        return MotionParams.PusherMotionEnum.MOTION_NORMAL;
    }

    public String toString() {
        return "NormalPusherMotionParams{, roomId='" + this.f47785a + "', provider='" + this.f47786b + "', businessType='" + this.f47787c + "', rtcProvider='" + this.f47788d + "'}";
    }
}
