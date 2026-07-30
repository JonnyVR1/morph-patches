package p149l;

import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;

/* JADX INFO: loaded from: classes4.dex */
public class y04 extends MotionParams {

    /* JADX INFO: renamed from: j */
    public final FrameLayout f195272j;

    /* JADX INFO: renamed from: k */
    public x9j<Integer, Object, Integer> f195273k;

    public y04(String str, String str2, String str3, String str4, String str5, String str6, FrameLayout frameLayout, x9j<Integer, Object, Integer> x9jVar) {
        super(str, "0", String.valueOf(2));
        this.f47790f = str2;
        this.f47791g = str3;
        this.f47792h = str4;
        this.f195273k = x9jVar;
        this.f195272j = frameLayout;
        this.f47788d = str5;
        this.f47793i = str6;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams
    /* JADX INFO: renamed from: a */
    public MotionParams.PusherMotionEnum mo71888a() {
        return MotionParams.PusherMotionEnum.MOTION_CALL_AUDIENCE;
    }

    public String toString() {
        return "CallAudienceMotionParams{remoteContainer=" + this.f195272j + ", callFunc=" + this.f195273k + ", userSig='" + this.f47793i + "', roomId='" + this.f47785a + "', provider='" + this.f47786b + "', businessType='" + this.f47787c + "', rtcProvider='" + this.f47788d + "'}";
    }
}
