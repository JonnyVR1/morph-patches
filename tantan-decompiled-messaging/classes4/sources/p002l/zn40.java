package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p1.mobile.putong.live.base.data.BLiveVideoQualityConf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zn40 extends MotionParams {

    /* JADX INFO: renamed from: j */
    public final BLiveVideoQualityConf f23515j;

    /* JADX INFO: renamed from: k */
    public final String f23516k;

    /* JADX INFO: renamed from: l */
    public String f23517l;

    public zn40(String str, String str2, String str3, String str4, String str5, BLiveVideoQualityConf bLiveVideoQualityConf, boolean z) {
        super(str3, str4, str5);
        this.f23517l = str;
        this.f23516k = str2;
        this.f23515j = bLiveVideoQualityConf;
        this.f3831e = z;
    }

    /* JADX INFO: renamed from: b */
    public static zn40 m27437b(String str, String str2, String str3, String str4, String str5, BLiveVideoQualityConf bLiveVideoQualityConf) {
        return new zn40(str, str2, str3, str4, str5, bLiveVideoQualityConf, true);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo5266a() {
        return MotionParams.PusherMotionEnum.MOTION_NORMAL;
    }

    public String toString() {
        return "NormalPusherMotionParams{, roomId='" + this.f3827a + "', provider='" + this.f3828b + "', businessType='" + this.f3829c + "', rtcProvider='" + this.f3830d + "'}";
    }
}
