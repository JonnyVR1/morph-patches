package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class nw40 extends MotionParams {

    /* JADX INFO: renamed from: j */
    public final BLiveVideoQualityConf f143913j;

    /* JADX INFO: renamed from: k */
    public final String f143914k;

    /* JADX INFO: renamed from: l */
    public String f143915l;

    public nw40(String str, String str2, String str3, String str4, String str5, BLiveVideoQualityConf bLiveVideoQualityConf, boolean z) {
        super(str3, str4, str5);
        this.f143915l = str;
        this.f143914k = str2;
        this.f143913j = bLiveVideoQualityConf;
        this.f48637e = z;
    }

    /* JADX INFO: renamed from: b */
    public static nw40 m164939b(String str, String str2, String str3, String str4, String str5, BLiveVideoQualityConf bLiveVideoQualityConf) {
        return new nw40(str, str2, str3, str4, str5, bLiveVideoQualityConf, true);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo73071a() {
        return MotionParams.PusherMotionEnum.MOTION_NORMAL;
    }

    public String toString() {
        return "NormalPusherMotionParams{, roomId='" + this.f48633a + "', provider='" + this.f48634b + "', businessType='" + this.f48635c + "', rtcProvider='" + this.f48636d + "'}";
    }
}
